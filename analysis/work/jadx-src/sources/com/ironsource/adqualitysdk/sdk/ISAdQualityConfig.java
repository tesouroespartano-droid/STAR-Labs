package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.am;
import com.ironsource.adqualitysdk.sdk.i.kb;
import com.ironsource.adqualitysdk.sdk.i.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private final Map<String, String> f2;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final boolean f3;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f4;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f5;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final boolean f6;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final String f7;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f8;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f9;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f10;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f11;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f12;

    /* synthetic */ ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b) {
        this(str, z, z2, z3, iSAdQualityLogLevel, set, str2, z4, z5, iSAdQualityDeviceIdType, map);
    }

    private ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f9 = str;
        this.f11 = z;
        this.f12 = z2;
        this.f8 = z3;
        this.f5 = iSAdQualityLogLevel;
        this.f10 = set;
        this.f7 = str2;
        this.f3 = z4;
        this.f6 = z5;
        this.f4 = iSAdQualityDeviceIdType;
        this.f2 = map;
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f11) {
            builder.setUserId(iSAdQualityConfig.f9);
        } else if (iSAdQualityConfig2.f11) {
            builder.setUserId(iSAdQualityConfig2.f9);
        }
        if (iSAdQualityConfig.f8) {
            builder.setTestMode(iSAdQualityConfig.f12);
        } else if (iSAdQualityConfig2.f8) {
            builder.setTestMode(iSAdQualityConfig2.f12);
        }
        if (iSAdQualityConfig.f6) {
            builder.setCoppa(iSAdQualityConfig.f3);
        } else if (iSAdQualityConfig2.f6) {
            builder.setCoppa(iSAdQualityConfig2.f3);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f5;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f5;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f10.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f10.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f7;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f7;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f4;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f4;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f2);
        map.putAll(iSAdQualityConfig.f2);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public String getUserId() {
        return this.f9;
    }

    public boolean isUserIdSet() {
        return this.f11;
    }

    public boolean isTestMode() {
        return this.f12;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f5;
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f10;
    }

    public String getInitializationSource() {
        return this.f7;
    }

    public boolean getCoppa() {
        return this.f3;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f4;
    }

    public Map<String, String> getMetaData() {
        return this.f2;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f20 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f19 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f22 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f21 = false;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityLogLevel f23 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f17 = new HashSet();

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private String f18 = null;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f16 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f14 = false;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f15 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private final Map<String, String> f13 = new HashMap();

        public Builder setUserId(String str) {
            this.f20 = str;
            this.f19 = true;
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.f22 = z;
            this.f21 = true;
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f23 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f17.add(iSAdQualityInitListener);
            return this;
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f17.remove(iSAdQualityInitListener);
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kb.m2789(str, 20)) {
                this.f18 = str;
                return this;
            }
            n.m2876("ISAdQualityConfig", new StringBuilder("setInitializationSource( ").append(str).append(" ) init source must have length of 1-20").toString());
            return this;
        }

        public Builder setCoppa(boolean z) {
            this.f16 = z;
            this.f14 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f15 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            n.m2876("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(string).append(" , ").append(objOpt).append(" ) value must be a string").toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!am.m444(str)) {
                        if (am.m443(this.f13, str)) {
                            n.m2876("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(str).append(" , ").append(str2).append(" ) limited to 5 meta data values. Ignoring meta data value.").toString());
                            return this;
                        }
                        if (!am.m441(str, str2)) {
                            n.m2876("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(str).append(" , ").append(str2).append(" ) the length of both the key and the value should be between 1 and 64 characters.").toString());
                            return this;
                        }
                    }
                    this.f13.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f20, this.f19, this.f22, this.f21, this.f23, this.f17, this.f18, this.f16, this.f14, this.f15, this.f13, (byte) 0);
        }
    }
}
