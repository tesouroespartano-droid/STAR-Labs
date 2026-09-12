package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jm {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jm f2861;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, a> f2863;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, a> f2862 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2864 = new Handler(Looper.getMainLooper());

    public enum a {
        f2874,
        f2873,
        f2877;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2868 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2869;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2870;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f2871;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f2872;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2876;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static void m2673() {
            f2872 = (char) 43612;
            f2871 = (char) 22285;
            f2870 = (char) 2440;
            f2876 = (char) 13615;
        }

        public static a valueOf(String str) {
            int i = 2 % 2;
            int i2 = f2869 + 99;
            f2868 = i2 % 128;
            int i3 = i2 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f2869 + 43;
            f2868 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return aVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f2868 + 77;
            f2869 = i2 % 128;
            int i3 = i2 % 2;
            a[] aVarArr = (a[]) values().clone();
            int i4 = f2869 + 47;
            f2868 = i4 % 128;
            int i5 = i4 % 2;
            return aVarArr;
        }

        static {
            m2673();
            int i = f2868 + 65;
            f2869 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0086  */
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static a m2672(String str) {
            byte b;
            int i = 2 % 2;
            int i2 = f2868 + 83;
            f2869 = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 3642) {
                b = 0;
                if (iHashCode != 96921) {
                    if (iHashCode == 109261 && str.equals(m2671("\uf09d뻻嚃㖌", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern())) {
                        int i4 = f2868 + 87;
                        f2869 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(m2671("祑捁툐钝", 3 - View.MeasureSpec.getMode(0)).intern())) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (!(!str.equals(m2671("氶婂", 2 - (Process.myTid() >> 22)).intern()))) {
                int i6 = f2868 + 13;
                f2869 = i6 % 128;
                int i7 = i6 % 2;
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                return f2874;
            }
            if (b == 1) {
                return f2873;
            }
            if (b != 2) {
                return null;
            }
            return f2877;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2671(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (k.f2952) {
                char[] cArr2 = new char[cArr.length];
                k.f2951 = 0;
                char[] cArr3 = new char[2];
                while (k.f2951 < cArr.length) {
                    cArr3[0] = cArr[k.f2951];
                    cArr3[1] = cArr[k.f2951 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2872)) ^ ((c2 >>> 5) + f2870)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2871) ^ ((c3 + i2) ^ ((c3 << 4) + f2876))));
                        i2 -= 40503;
                    }
                    cArr2[k.f2951] = cArr3[0];
                    cArr2[k.f2951 + 1] = cArr3[1];
                    k.f2951 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized jm m2667() {
        if (f2861 == null) {
            f2861 = new jm();
        }
        return f2861;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2668(final String str, final a aVar) {
        this.f2864.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                synchronized (jm.this) {
                    jm.this.f2862.put(str, aVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2669(Activity activity) {
        return a.f2873 == m2663(activity);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2670(Activity activity) {
        return a.f2877 == m2663(activity);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized a m2663(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m2664().containsKey(name)) {
                return m2664().get(name);
            }
            if (m2665().containsKey(name)) {
                return m2665().get(name);
            }
        }
        return a.m2672(ar.m480().mo486());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized Map<String, a> m2664() {
        return new HashMap(this.f2862);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, a> m2665() {
        if (this.f2863 == null) {
            this.f2863 = new HashMap();
            JSONObject jSONObjectMo487 = ar.m480().mo487();
            if (jSONObjectMo487 != null) {
                this.f2863 = kd.m2823(jSONObjectMo487, new kd.a<a>() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
                    /* JADX INFO: renamed from: ﻛ */
                    public final /* synthetic */ a mo547(JSONObject jSONObject, String str) {
                        return a.m2672(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f2863;
    }
}
