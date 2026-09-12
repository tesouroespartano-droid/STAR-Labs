package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes2.dex */
public final class fp extends fo {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2100 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2101 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2102 = 19856;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2103 = 59275;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2104 = 1836;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2105 = 57687;

    public fp(ed edVar) {
        super(edVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fo, com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f2101 + 49;
        f2100 = i2 % 128;
        int i3 = i2 % 2;
        dr drVarMo2153 = super.mo2153(dqVar, coVar);
        drVarMo2153.m2020(true);
        int i4 = f2100 + 119;
        f2101 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return drVarMo2153;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fo
    public final String toString() {
        int i = 2 % 2;
        if (m2161() != null) {
            String string = new StringBuilder().append(m2162("눩ῂ躙츦憎⫚䝫Ṁ", 7 - ExpandableListView.getPackedPositionGroup(0L)).intern()).append(super.toString()).toString();
            int i2 = f2100 + 89;
            f2101 = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }
        String strIntern = m2162("눩ῂ躙츦憎⫚ޭ鰨", MotionEvent.axisFromString("") + 8).intern();
        int i4 = f2100 + 125;
        f2101 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2162(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2105)) ^ ((c2 >>> 5) + f2104)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2103) ^ ((c3 + i2) ^ ((c3 << 4) + f2102))));
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
