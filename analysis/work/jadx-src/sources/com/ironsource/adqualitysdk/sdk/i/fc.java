package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class fc extends ei {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2057 = {'+'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2058 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2059 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2060 = 1;

    public fc(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVarM2116 = m2129().m2116(dqVar, coVar);
        dr drVarM2117 = m2128().m2116(dqVar, coVar);
        if (!(drVarM2116.m2019() instanceof String)) {
            int i2 = f2058 + InterfaceC0280i1.d.b.i;
            f2060 = i2 % 128;
            int i3 = i2 % 2;
            if (!(drVarM2117.m2019() instanceof String)) {
                Number numberM2023 = drVarM2116.m2023();
                Number numberM2024 = drVarM2117.m2023();
                if (!(numberM2023 instanceof Double)) {
                    int i4 = f2060 + 93;
                    f2058 = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(numberM2024 instanceof Double)) {
                        return ((numberM2023 instanceof Long) || (numberM2024 instanceof Long)) ? new dr(Long.valueOf(numberM2023.longValue() + numberM2024.longValue())) : new dr(Integer.valueOf(numberM2023.intValue() + numberM2024.intValue()));
                    }
                }
                return new dr(Double.valueOf(numberM2023.doubleValue() + numberM2024.doubleValue()));
            }
        }
        return new dr(new StringBuilder().append(drVarM2116.m2019()).append(drVarM2117.m2019()).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        byte b;
        int iMakeMeasureSpec;
        int i = 2 % 2;
        int i2 = f2060 + 31;
        f2058 = i2 % 128;
        int i3 = i2 % 2;
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (i3 != 0) {
            b = (byte) (84 >> (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1)));
            iMakeMeasureSpec = 0 % View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            b = (byte) ((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 96);
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1;
        }
        String strIntern = m2150("\u008c", b, iMakeMeasureSpec).intern();
        int i4 = f2058 + 3;
        f2060 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2150(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2057;
            char c = f2059;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
                    f.f2045 = cArr[f.f2047];
                    f.f2048 = cArr[f.f2047 + 1];
                    if (f.f2045 == f.f2048) {
                        cArr3[f.f2047] = (char) (f.f2045 - b);
                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                    } else {
                        f.f2046 = f.f2045 / c;
                        f.f2042 = f.f2045 % c;
                        f.f2044 = f.f2048 / c;
                        f.f2041 = f.f2048 % c;
                        if (f.f2042 == f.f2041) {
                            f.f2046 = ((f.f2046 + c) - 1) % c;
                            f.f2044 = ((f.f2044 + c) - 1) % c;
                            int i2 = (f.f2046 * c) + f.f2042;
                            int i3 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c) - 1) % c;
                            f.f2041 = ((f.f2041 + c) - 1) % c;
                            int i4 = (f.f2046 * c) + f.f2042;
                            int i5 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c) + f.f2041;
                            int i7 = (f.f2044 * c) + f.f2042;
                            cArr3[f.f2047] = cArr2[i6];
                            cArr3[f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
