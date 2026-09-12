package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.F5;

/* JADX INFO: loaded from: classes2.dex */
public final class gm extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2212 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2213 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2214 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2215 = -7994064336487105383L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2216;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2212 + 83;
        f2213 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2192("\u0092ꈎ娷법鎑莿둘盰舀嗛럴欓\uf0c4촸衬畴탭셉纴າ⫉ໍ︬\ue90b\udd1c픎腂ຒᅾﵬ袈겒霘賃팂魜˨厹텸䮺猲\u0cd0ᮠ딑孞㓄", ViewConfiguration.getEdgeSlop() >> 16, "쾚岹\ud93aᦫ", "㲙‑惗鄏", (char) View.MeasureSpec.getMode(0)).intern();
        int i4 = f2213 + 27;
        f2212 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2213 + 113;
        int i3 = i2 % 128;
        f2212 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        f2213 = i5 % 128;
        if (i5 % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bp bpVar = new bp(mo2168());
        int i2 = f2213 + 81;
        f2212 = i2 % 128;
        int i3 = i2 % 2;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int iResolveSizeAndState;
        int mirror;
        int i = 2 % 2;
        int i2 = f2213 + 43;
        f2212 = i2 % 128;
        if (i2 % 2 == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(1, 0, 0);
            mirror = 13288 << AndroidCharacter.getMirror(F5.T);
        } else {
            iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
            mirror = 7397 - AndroidCharacter.getMirror('0');
        }
        String strIntern = m2192("䃀苛퓍\uf4df⺾昼", iResolveSizeAndState, "ㅋ韈뗴⼜", "㲙‑惗鄏", (char) mirror).intern();
        int i3 = f2212 + 81;
        f2213 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2192(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2215) ^ ((long) f2214)) ^ ((long) f2216));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
