package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class gn {
    public gn() {
    }

    public static class e extends gk {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2223 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int[] f2224 = {691596401, 836281317, -1412751383, 1182403212, -258145554, 1999284747, 993434325, 2133695989, 504997090, -1610789489, -966725370, 1878458166, -189367352, -1841684962, 808794932, 1513796355, -1911144188, 1283155693};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2225 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2223 + 125;
            f2225 = i2 % 128;
            return (i2 % 2 == 0 ? m2194(new int[]{1705034035, 672634420, -1653973991, -1254847027, -1414662306, 778594728, -504664689, -1064861697, -1998507734, -1076586894, 655509225, 1340631944, 1212465048, 237163951, -378618552, -1737242420}, 6 << View.MeasureSpec.getMode(0)) : m2194(new int[]{1705034035, 672634420, -1653973991, -1254847027, -1414662306, 778594728, -504664689, -1064861697, -1998507734, -1076586894, 655509225, 1340631944, 1212465048, 237163951, -378618552, -1737242420}, 31 - View.MeasureSpec.getMode(0))).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2225 + 23;
            int i3 = i2 % 128;
            f2223 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            f2225 = i5 % 128;
            int i6 = i5 % 2;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            bs.b bVar = new bs.b(mo2168());
            int i2 = f2223 + InterfaceC0280i1.d.b.g;
            f2225 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 74 / 0;
            }
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2168() {
            int i = 2 % 2;
            int i2 = f2223 + 33;
            f2225 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m2194(new int[]{-1653973991, -1254847027, -1414662306, 778594728, -951397678, -549246634}, TextUtils.getCapsMode("", 0, 0) + 9).intern();
            int i4 = f2225 + 9;
            f2223 = i4 % 128;
            if (i4 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2194(int[] iArr, int i) {
            String str;
            synchronized (c.f1230) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2224.clone();
                c.f1231 = 0;
                while (c.f1231 < iArr.length) {
                    cArr[0] = (char) (iArr[c.f1231] >> 16);
                    cArr[1] = (char) iArr[c.f1231];
                    cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                    cArr[3] = (char) iArr[c.f1231 + 1];
                    c.f1232 = (cArr[0] << 16) + cArr[1];
                    c.f1233 = (cArr[2] << 16) + cArr[3];
                    c.m1415(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = c.f1232 ^ iArr2[i2];
                        c.f1232 = i3;
                        c.f1233 = c.m1414(i3) ^ c.f1233;
                        int i4 = c.f1232;
                        c.f1232 = c.f1233;
                        c.f1233 = i4;
                    }
                    int i5 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i5;
                    c.f1233 = i5 ^ iArr2[16];
                    c.f1232 ^= iArr2[17];
                    int i6 = c.f1232;
                    int i7 = c.f1233;
                    cArr[0] = (char) (c.f1232 >>> 16);
                    cArr[1] = (char) c.f1232;
                    cArr[2] = (char) (c.f1233 >>> 16);
                    cArr[3] = (char) c.f1233;
                    c.m1415(iArr2);
                    cArr2[c.f1231 << 1] = cArr[0];
                    cArr2[(c.f1231 << 1) + 1] = cArr[1];
                    cArr2[(c.f1231 << 1) + 2] = cArr[2];
                    cArr2[(c.f1231 << 1) + 3] = cArr[3];
                    c.f1231 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    public static class d extends gk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2217 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2218 = 30;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2219 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f2220 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f2221 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2222 = {129, 141, 139, 'L', 128, 144, 135, 130, 133, 131, 145, 137, 'k', '`', 'q', 'b', 'i', 140, 146, Ascii.MAX, 138};

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2217 + 121;
            f2219 = i2 % 128;
            String strIntern = m2193(null, i2 % 2 != 0 ? 21 >> (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)) : 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u0091\u0090\u008f\u008a\u0089\u0088\u0087\u0086\u008e\u008d\u0084\u008c\u0088\u008b\u0083\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            int i3 = f2219 + 1;
            f2217 = i3 % 128;
            int i4 = i3 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2219 + 79;
            int i3 = i2 % 128;
            f2217 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            f2219 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            bs.a aVar = new bs.a(mo2168());
            int i2 = f2219 + 15;
            f2217 = i2 % 128;
            int i3 = i2 % 2;
            return aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2168() {
            int i = 2 % 2;
            int i2 = f2219 + 93;
            f2217 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            String strIntern = m2193(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0095\u0094\u0086\u0089\u008a\u0093\u0092\u0087\u0083").intern();
            int i4 = f2217 + InterfaceC0280i1.d.b.g;
            f2219 = i4 % 128;
            if (i4 % 2 == 0) {
                return strIntern;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2193(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f3007) {
                char[] cArr2 = f2222;
                int i2 = f2218;
                if (f2221) {
                    int length = bArr.length;
                    m.f3005 = length;
                    char[] cArr3 = new char[length];
                    m.f3006 = 0;
                    while (m.f3006 < m.f3005) {
                        cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i] - i2);
                        m.f3006++;
                    }
                    return new String(cArr3);
                }
                if (f2220) {
                    int length2 = cArr.length;
                    m.f3005 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3006 = 0;
                    while (m.f3006 < m.f3005) {
                        cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                        m.f3006++;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3005 = length3;
                char[] cArr5 = new char[length3];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                    m.f3006++;
                }
                return new String(cArr5);
            }
        }
    }

    public gn(Context context) {
        context.getApplicationContext();
    }
}
