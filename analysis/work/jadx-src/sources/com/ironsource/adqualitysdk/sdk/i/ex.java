package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class ex extends ek {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2024 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2025 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2023 = {11946};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2026 = -7323377016819343616L;

    public ex(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((!(r7 instanceof java.lang.Double)) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r6 instanceof java.lang.Long) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r2 = r2 + 33;
        com.ironsource.adqualitysdk.sdk.i.ex.f2024 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if ((!(r7 instanceof java.lang.Long)) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r6 = java.lang.Integer.valueOf(r6.intValue() % r7.intValue());
        r7 = com.ironsource.adqualitysdk.sdk.i.ex.f2024 + 21;
        com.ironsource.adqualitysdk.sdk.i.ex.f2025 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r7 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return java.lang.Long.valueOf(r6.longValue() % r7.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if ((r7 instanceof java.lang.Double) != false) goto L24;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Number mo2131(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2024;
        int i3 = i2 + 31;
        f2025 = i3 % 128;
        int i4 = i3 % 2;
        if (!(number instanceof Double)) {
            int i5 = i2 + InterfaceC0280i1.d.b.g;
            int i6 = i5 % 128;
            f2025 = i6;
            if (i5 % 2 == 0) {
                int i7 = 15 / 0;
            }
        }
        return Double.valueOf(number.doubleValue() % number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f2024 + 113;
        f2025 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2145(ViewConfiguration.getLongPressTimeout() >>> 90, 1 >>> (ViewConfiguration.getKeyRepeatDelay() / 53), (char) (16789135 / Color.rgb(1, 0, 1))) : m2145(ViewConfiguration.getLongPressTimeout() >> 16, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (Color.rgb(0, 0, 0) + 16789135))).intern();
        int i3 = f2024 + 69;
        f2025 = i3 % 128;
        if (i3 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2145(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2023[b.f638 + i]) ^ (((long) b.f638) * f2026)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
