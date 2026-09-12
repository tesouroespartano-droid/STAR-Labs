package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ew extends ek {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2017 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2018 = 126;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2019 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2020 = {171};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2021 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2022 = true;

    public ew(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾒ */
    public final Number mo2131(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2017;
        int i3 = i2 + 121;
        f2021 = i3 % 128;
        int i4 = i3 % 2;
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        if (!(number instanceof Long)) {
            int i5 = i2 + InterfaceC0280i1.d.b.g;
            f2021 = i5 % 128;
            int i6 = i5 % 2;
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() - number2.intValue());
            }
        }
        return Long.valueOf(number.longValue() - number2.longValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2017 + 117;
        f2021 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2144(null, TextUtils.getCapsMode("", 0, 0) + WorkQueueKt.MASK, null, "\u0081").intern();
        int i4 = f2021 + 95;
        f2017 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2144(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2020;
            int i2 = f2018;
            if (f2019) {
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
            if (f2022) {
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
