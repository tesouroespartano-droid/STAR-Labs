package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class fy extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2146 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2147 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2148 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2149 = 29911;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2150;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2146 + 23;
        f2148 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2175("휸ٽ췁ඳ/肞뇂\u2456\uf7e0ﮩ₴街\uf4c6男⮁ꤑ쒠ꍟ휍\ue289䆿옳ᔘ羋ぎ솫\udad2⹅", ViewConfiguration.getScrollBarFadeDuration() >> 16, "\ueaab㈌䮬䁜", "\u0000\u0000\u0000\u0000", (char) (ExpandableListView.getPackedPositionType(0L) + 23627)).intern();
        int i4 = f2148 + 29;
        f2146 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2148 + 99;
        int i3 = i2 % 128;
        f2146 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        f2148 = i5 % 128;
        if (i5 % 2 != 0) {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bm bmVar = new bm(mo2168());
        int i2 = f2148 + 125;
        f2146 = i2 % 128;
        int i3 = i2 % 2;
        return bmVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int packedPositionType;
        int packedPositionChild;
        int i = 2 % 2;
        int i2 = f2146 + 35;
        f2148 = i2 % 128;
        if (i2 % 2 == 0) {
            packedPositionType = ExpandableListView.getPackedPositionType(0L);
            packedPositionChild = (-1) >> ExpandableListView.getPackedPositionChild(1L);
        } else {
            packedPositionType = ExpandableListView.getPackedPositionType(0L);
            packedPositionChild = (-1) - ExpandableListView.getPackedPositionChild(0L);
        }
        return m2175("鐸슁嗻튺Ꝓ衫딠戆", packedPositionType, "\udf04⍑ᣙᒷ", "\u0000\u0000\u0000\u0000", (char) packedPositionChild).intern();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2175(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2147) ^ ((long) f2150)) ^ ((long) f2149));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
