package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.kb;
import com.ironsource.adqualitysdk.sdk.i.n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final Map<String, String> f40;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final long f41;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private double f42;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f43;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f44;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f45;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final int f46;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final AtomicBoolean f47;

    /* synthetic */ ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    private ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map<String, String> map) {
        this.f45 = str;
        this.f43 = i;
        this.f44 = str2;
        this.f46 = i2;
        this.f47 = atomicBoolean;
        this.f42 = d;
        this.f41 = j;
        this.f40 = map;
    }

    public String getName() {
        return this.f45;
    }

    public int getAge() {
        return this.f43;
    }

    public String getGender() {
        return this.f44;
    }

    public int getLevel() {
        return this.f46;
    }

    public AtomicBoolean getIsPaying() {
        return this.f47;
    }

    public double getInAppPurchasesTotal() {
        return this.f42;
    }

    public long getUserCreationDate() {
        return this.f41;
    }

    public Map<String, String> getCustomData() {
        return this.f40;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f55;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f56;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private double f54 = 999999.99d;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f53 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f52 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private AtomicBoolean f49 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private long f51 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private double f48 = -1.0d;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private Map<String, String> f50 = new HashMap();

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kb.m2788(str) && kb.m2789(str, 32)) {
                this.f55 = str;
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setSegmentName( ").append(str).append(" ) segment name must be alphanumeric and 1-32 in length").toString());
            return this;
        }

        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i <= 199) {
                this.f53 = i;
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setAge( ").append(i).append(" ) age must be between 1-199").toString());
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.a.b) || str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.a.c)) {
                this.f56 = str.toLowerCase(Locale.ENGLISH);
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setGender( ").append(str).append(" ) is invalid").toString());
            return this;
        }

        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f52 = i;
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setLevel( ").append(i).append(" ) level must be between 1-999999").toString());
            return this;
        }

        public Builder setIsPaying(boolean z) {
            if (this.f49 == null) {
                this.f49 = new AtomicBoolean();
            }
            this.f49.set(z);
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < this.f54) {
                this.f48 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setIAPTotal( ").append(d).append(" ) iapt must be between 0-").append(this.f54).toString());
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f51 = j;
                return this;
            }
            n.m2876("ISAdQualitySegment Builder", new StringBuilder("setUserCreationDate( ").append(j).append(" ) is an invalid timestamp").toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f50.size() < 5) {
                        if (kb.m2788(str) && kb.m2788(str2) && kb.m2789(str, 32) && kb.m2789(str2, 32)) {
                            this.f50.put("sgct_".concat(String.valueOf(str)), str2);
                            return this;
                        }
                        n.m2876("ISAdQualitySegment Builder", new StringBuilder("setCustomData( ").append(str).append(" , ").append(str2).append(" ) key and value must be alphanumeric and 1-32 in length").toString());
                        return this;
                    }
                    n.m2876("ISAdQualitySegment Builder", new StringBuilder("setCustomData( ").append(str).append(" , ").append(str2).append(" ) limited to 5 custom values. Ignoring custom value.").toString());
                    return this;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f55, this.f53, this.f56, this.f52, this.f49, this.f48, this.f51, new HashMap(this.f50), (byte) 0);
        }
    }
}
