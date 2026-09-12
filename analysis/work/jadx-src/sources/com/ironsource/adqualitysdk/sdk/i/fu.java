package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class fu extends fr {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2126 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2127 = {60123, 8021, 487, 2675, 15501, 8537, 11234, 30446, 33654};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2128 = -6260625898517826159L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2129;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr f2130;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2131;

    public fu(ed edVar, fr frVar) {
        this.f2131 = edVar;
        this.f2130 = frVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        while (this.f2131.m2116(dqVar, coVar).m2018()) {
            dr drVarMo2153 = this.f2130.mo2153(dqVar, coVar);
            if (drVarMo2153.m2022()) {
                break;
            }
            int i2 = f2129 + 115;
            f2126 = i2 % 128;
            int i3 = i2 % 2;
            if (drVarMo2153.m2021()) {
                int i4 = f2126 + 11;
                f2129 = i4 % 128;
                int i5 = i4 % 2;
                return drVarMo2153;
            }
        }
        return new dr(null);
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2166(TextUtils.getCapsMode("", 0, 0), 7 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (View.getDefaultSize(0, 0) + 60076)).intern()).append(this.f2131).append(m2166(TextUtils.getOffsetAfter("", 0) + 7, 2 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 30408)).intern()).append(this.f2130).toString();
        int i2 = f2126 + 119;
        f2129 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = r1 + 21;
        com.ironsource.adqualitysdk.sdk.i.fu.f2129 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r2 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (getClass() == r6.getClass()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (getClass() == r6.getClass()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.fu) r6;
        r0 = r5.f2131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r0.equals(r6.f2131) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r6.f2131 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r0 = r5.f2130;
        r6 = r6.f2130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        return r0.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f2126;
        int i3 = i2 + 3;
        f2129 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f2129;
        int i3 = i2 + 89;
        f2126 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
            if (this.f2131 != null) {
                iHashCode = this.f2131.hashCode();
            } else {
                int i5 = i2 + 73;
                f2126 = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            }
        } else if (this.f2131 != null) {
            iHashCode = this.f2131.hashCode();
        } else {
            int i7 = i2 + 73;
            f2126 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        }
        int i9 = iHashCode * 31;
        fr frVar = this.f2130;
        int iHashCode2 = i9 + (frVar != null ? frVar.hashCode() : 0);
        int i10 = f2126 + InterfaceC0280i1.d.b.i;
        f2129 = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2166(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2127[b.f638 + i]) ^ (((long) b.f638) * f2128)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
