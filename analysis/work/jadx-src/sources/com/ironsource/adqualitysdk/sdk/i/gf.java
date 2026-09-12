package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gf extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2177 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2178;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2179 = {1683733250, 296321628, -395896884, 1859820951, -508225768, -1647027704, -1819003662, -1383336860, -1125288631, 448379490, -1497801830, -393494721, -1451713673, 182767665, 1383632457, -1611929679, 2076859266, 798539488};

    public static class e extends gf {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2183 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2184 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2185 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2186 = 58475;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2187;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int iKeyCodeFromString;
            char cLastIndexOf;
            int i = 2 % 2;
            int i2 = f2184 + 37;
            f2185 = i2 % 128;
            if (i2 % 2 == 0) {
                iKeyCodeFromString = (-407317661) / KeyEvent.keyCodeFromString("");
                cLastIndexOf = (char) ((-1) >>> TextUtils.lastIndexOf("", 'M', 1, 0));
            } else {
                iKeyCodeFromString = (-407317661) - KeyEvent.keyCodeFromString("");
                cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            }
            String strIntern = m2184("ａ\uf6ca穷燧脞ິ\ufe6cꜝར焼ᣮ\ue37bꍠ\ue9ad뷘䩾띙Ⲳ⿱欓ἢ\udd90堦ク䄕ﺰᮥឈ娌蟱购\udcaf쥷琉\udad9", iKeyCodeFromString, "捥룓\u0fe7龹", "\u0000\u0000\u0000\u0000", cLastIndexOf).intern();
            int i3 = f2184 + 97;
            f2185 = i3 % 128;
            int i4 = i3 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2184;
            int i3 = i2 + InterfaceC0280i1.d.b.i;
            f2185 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = i2 + 121;
            f2185 = i4 % 128;
            int i5 = i4 % 2;
            return TTAdSdk.class;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2184(String str, int i, String str2, String str3, char c) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (g.f2155) {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                g.f2156 = 0;
                while (g.f2156 < length) {
                    int i2 = (g.f2156 + 2) % 4;
                    int i3 = (g.f2156 + 3) % 4;
                    g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                    cArr4[i3] = g.f2154;
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2187) ^ ((long) f2183)) ^ ((long) f2186));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    public static class c extends gf {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2180 = 2054450234894251933L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2181 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2182;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2182 + 47;
            f2181 = i2 % 128;
            return m2183("\uf7fe\ue4df톪츴뭋ꠅ蓧燃溑孩䠱┑ᇤ\u0efaﮘ\ue85a씦뉎께鮺衼敂刢仲㯖⢜դ\uf20c\uef10\udbf4좲ꗀ鉔輾簎棎䗧㉌⽲ᰁࣆ\ue5cc튔", i2 % 2 == 0 ? ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.EM : 4908 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2182;
            int i3 = i2 + 99;
            f2181 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 35;
            f2181 = i4 % 128;
            int i5 = i4 % 2;
            return PAGSdk.class;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2183(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2434) {
                i.f2432 = i;
                char[] cArr2 = new char[cArr.length];
                i.f2433 = 0;
                while (i.f2433 < cArr.length) {
                    cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2180);
                    i.f2433++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bi biVar = new bi(mo2168());
        int i2 = f2178 + 43;
        f2177 = i2 % 128;
        if (i2 % 2 != 0) {
            return biVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2177 + 89;
        f2178 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2182(new int[]{-977378493, 614088055, -1826541500, -262540296, 2143365918, -105943890}, 84 - Color.alpha(0)) : m2182(new int[]{-977378493, 614088055, -1826541500, -262540296, 2143365918, -105943890}, 9 - Color.alpha(0))).intern();
        int i3 = f2178 + InterfaceC0280i1.d.b.b;
        f2177 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2182(int[] iArr, int i) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2179.clone();
            com.ironsource.adqualitysdk.sdk.i.c.f1231 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1];
                com.ironsource.adqualitysdk.sdk.i.c.f1232 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.c.f1232 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = i3;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = com.ironsource.adqualitysdk.sdk.i.c.m1414(i3) ^ com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5;
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.c.f1232 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                int i7 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1232 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1232;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1233 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1233;
                com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
