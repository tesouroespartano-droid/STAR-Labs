package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import com.ironsource.InterfaceC0280i1;
import com.tapjoy.Tapjoy;

/* JADX INFO: loaded from: classes2.dex */
public final class gu extends gk {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2249 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2250 = 9937;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2251 = 52880;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2252 = 59764;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2253 = 17419;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2254;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2249 + 37;
        f2254 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2202("埘\u187d\ud908ꇕ\ue7ec赯浰ᗛ篐漡㜛⊭䲼庩\uf0da쎏艙ꏫ", 16 - TextUtils.lastIndexOf("", '0', 0)).intern();
        int i4 = f2249 + 33;
        f2254 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        Class<Tapjoy> cls;
        int i = 2 % 2;
        int i2 = f2254;
        int i3 = i2 + 125;
        f2249 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = Tapjoy.class;
            int i4 = 11 / 0;
        } else {
            cls = Tapjoy.class;
        }
        int i5 = i2 + InterfaceC0280i1.d.b.d;
        f2249 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        cg cgVar = new cg(mo2168());
        int i2 = f2254 + 75;
        f2249 = i2 % 128;
        int i3 = i2 % 2;
        return cgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2249 + 71;
        f2254 = i2 % 128;
        String strIntern = m2202("\ue7ec赯浰ᗛ篐漡", i2 % 2 != 0 ? ((Process.getThreadPriority(1) / 78) - 28) * 62 : ((Process.getThreadPriority(0) + 20) >> 6) + 6).intern();
        int i3 = f2249 + 87;
        f2254 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2202(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2252)) ^ ((c2 >>> 5) + f2251)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2250) ^ ((c3 + i2) ^ ((c3 << 4) + f2253))));
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
