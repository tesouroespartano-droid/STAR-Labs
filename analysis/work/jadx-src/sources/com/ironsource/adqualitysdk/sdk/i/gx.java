package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import com.vungle.warren.VungleApiClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gx extends gk {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2266 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2267 = -261158597239880673L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2268 = 1;

    public static class c extends gx {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2273 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2274 = 30636;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2275 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2276 = 25717;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2277 = 46407;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2278 = 16763;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2273 + 67;
            f2275 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m2207("뭓冔荌碃ꡛ\udd67ȟ肂ꞿჴᤅ闀ꊭ맚鬠첫⅌ﾺ儨漪ȟ肂ꞿჴ\uef79兖险ᮍ\ued1aὊ控䳸礲粀", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33).intern();
            int i4 = f2275 + 113;
            f2273 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            Class<VungleApiClient> cls;
            int i = 2 % 2;
            int i2 = f2273;
            int i3 = i2 + 83;
            f2275 = i3 % 128;
            if (i3 % 2 != 0) {
                cls = VungleApiClient.class;
                int i4 = 87 / 0;
            } else {
                cls = VungleApiClient.class;
            }
            int i5 = i2 + 107;
            f2275 = i5 % 128;
            if (i5 % 2 == 0) {
                return cls;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            ce ceVar = new ce(m2207("ꡛ\udd67ȟ肂ꞿჴ", Color.rgb(0, 0, 0) + 16777222).intern());
            int i2 = f2273 + InterfaceC0280i1.d.b.i;
            f2275 = i2 % 128;
            int i3 = i2 % 2;
            return ceVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2207(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2278)) ^ ((c2 >>> 5) + f2277)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2276) ^ ((c3 + i2) ^ ((c3 << 4) + f2274))));
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

    public static class b extends gx {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2269 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2272;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2271 = {64604, 18948, 37114, 57069, 9497, 29678, 47529, 20, 20211, 38062, 58201, 10690, 30635, 48648, 1161, 21178, 39185, 59359, 11698, 29809, 49857, 2234, 22379, 40349, 60337, 12910, 30915, 50836, 3424, 23497, 41356, 59453, 14057, 31902, 52089, 4388, 24451, 42622, 60422, 14979, 33142, 53000, 5531, 23626, 43562, 61589, 16211};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2270 = 6072815418141226580L;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2269 + 63;
            f2272 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m2206(ViewConfiguration.getScrollBarSize() >> 8, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46, (char) (TextUtils.getTrimmedLength("") + 64575)).intern();
            int i4 = f2269 + 15;
            f2272 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2272 + 95;
            f2269 = i2 % 128;
            if (i2 % 2 != 0) {
                return com.vungle.ads.internal.network.VungleApiClient.class;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            ch chVar = new ch(mo2168());
            int i2 = f2272 + 41;
            f2269 = i2 % 128;
            int i3 = i2 % 2;
            return chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2206(int i, int i2, char c) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
                char[] cArr = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f2271[com.ironsource.adqualitysdk.sdk.i.b.f638 + i]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f2270)) ^ ((long) c));
                    com.ironsource.adqualitysdk.sdk.i.b.f638++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2268 + InterfaceC0280i1.d.b.d;
        f2266 = i2 % 128;
        return m2205("ᶽ퐋㿑껛᷋遡랁拡ත胵", i2 % 2 != 0 ? 1 >>> (ViewConfiguration.getKeyRepeatTimeout() / 62) : 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2205(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2267, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2267));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
