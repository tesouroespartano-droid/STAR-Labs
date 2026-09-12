package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class ez extends ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2034 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2035 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2036 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2037 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2038 = 298;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2039 = {331};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f2040;

    public ez(ed edVar, dn dnVar) {
        super(dnVar);
        this.f2040 = edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        return new dr(Boolean.valueOf(!this.f2040.m2116(dqVar, coVar).m2018()));
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2147(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0081").intern()).append(this.f2040).toString();
        int i2 = f2035 + 97;
        f2034 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2147(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2039;
            int i2 = f2038;
            if (f2036) {
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
            if (f2037) {
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
