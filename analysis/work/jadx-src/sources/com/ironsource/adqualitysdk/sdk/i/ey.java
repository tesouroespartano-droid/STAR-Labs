package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ey extends em {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2027 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2028 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2029 = 3;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2030 = {-2};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2031 = 247003300;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2032 = 2098325081;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f2033;

    public ey(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ｋ */
    final boolean mo2132(int i) {
        int i2 = 2 % 2;
        int i3 = f2027;
        int i4 = i3 + 53;
        f2028 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i >= 0) {
            return false;
        }
        int i5 = i3 + 105;
        f2028 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2027 + 123;
        f2028 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2146(TextUtils.indexOf("", "") - 247003300, (byte) Color.red(0), (-5) - TextUtils.lastIndexOf("", '0', 0, 0), (-2098325021) - View.resolveSizeAndState(0, 0, 0), (short) (80 - MotionEvent.axisFromString(""))).intern();
        int i4 = f2028 + 107;
        f2027 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2146(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2029;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2030;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2031 + i] + i4);
                } else {
                    i5 = (short) (f2033[f2031 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2031 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2032);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2030;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2033;
                        int i8 = l.f3000;
                        l.f3000 = i8 - 1;
                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                    }
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
