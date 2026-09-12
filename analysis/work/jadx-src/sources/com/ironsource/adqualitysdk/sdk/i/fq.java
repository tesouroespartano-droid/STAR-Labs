package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class fq extends fr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2106 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2107 = 87;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2108 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2109 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2110;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2111 = {Typography.half, 198, 201, 'w', Ascii.MAX, 146, 128};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr f2112;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f2113;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2114;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f2115;

    public fq(ed edVar, ed edVar2, ed edVar3, fr frVar) {
        this.f2115 = edVar;
        this.f2114 = edVar2;
        this.f2113 = edVar3;
        this.f2112 = frVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f2110 + 51;
        f2109 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m2164(this.f2115, dqVar, coVar);
            throw null;
        }
        m2164(this.f2115, dqVar, coVar);
        int i3 = f2110 + 27;
        f2109 = i3 % 128;
        int i4 = i3 % 2;
        while (this.f2114.m2116(dqVar, coVar).m2018()) {
            int i5 = f2110 + 123;
            f2109 = i5 % 128;
            int i6 = i5 % 2;
            dr drVarMo2153 = this.f2112.mo2153(dqVar, coVar);
            if (!(!drVarMo2153.m2022())) {
                break;
            }
            if (drVarMo2153.m2021()) {
                int i7 = f2110 + 1;
                f2109 = i7 % 128;
                if (i7 % 2 != 0) {
                    return drVarMo2153;
                }
                super.hashCode();
                throw null;
            }
            m2164(this.f2113, dqVar, coVar);
        }
        return new dr(null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static dr m2164(ed edVar, dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f2110;
        int i3 = i2 + 49;
        f2109 = i3 % 128;
        int i4 = i3 % 2;
        if (edVar != null) {
            int i5 = i2 + 51;
            f2109 = i5 % 128;
            int i6 = i5 % 2;
            return edVar.m2116(dqVar, coVar);
        }
        return new dr(null);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m2163(null, (ViewConfiguration.getLongPressTimeout() >> 16) + WorkQueueKt.MASK, null, "\u0085\u0084\u0083\u0082\u0081").intern());
        ed edVar = this.f2115;
        if (edVar != null) {
            int i2 = f2110 + 61;
            f2109 = i2 % 128;
            int i3 = i2 % 2;
            sb.append(edVar);
        }
        sb.append(m2163(null, (Process.myTid() >> 22) + WorkQueueKt.MASK, null, "\u0084\u0086").intern());
        sb.append(this.f2114);
        sb.append(m2163(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + WorkQueueKt.MASK, null, "\u0084\u0086").intern());
        ed edVar2 = this.f2113;
        if (edVar2 != null) {
            int i4 = f2109 + 23;
            f2110 = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append(edVar2);
                throw null;
            }
            sb.append(edVar2);
        }
        sb.append(m2163(null, 127 - Color.red(0), null, "\u0084\u0087").intern());
        sb.append(this.f2112);
        String string = sb.toString();
        int i5 = f2109 + 67;
        f2110 = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7.f2115 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r3.equals(r7.f2114) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r7.f2114 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r3 = r6.f2113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r3.equals(r7.f2113) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r7.f2113 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r3 = r6.f2112;
        r7 = r7.f2112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r7 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fq.f2109 + 37;
        com.ironsource.adqualitysdk.sdk.i.fq.f2110 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fq fqVar = (fq) obj;
            ed edVar = this.f2115;
            if (edVar != null) {
                int i2 = f2109 + InterfaceC0280i1.d.b.b;
                f2110 = i2 % 128;
                int i3 = i2 % 2;
                if (!edVar.equals(fqVar.f2115)) {
                    int i4 = f2109 + 85;
                    f2110 = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                ed edVar2 = this.f2114;
                if (edVar2 != null) {
                    int i6 = f2110 + 63;
                    f2109 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        ed edVar = this.f2115;
        int iHashCode2 = 0;
        int iHashCode3 = (edVar != null ? edVar.hashCode() : 0) * 31;
        ed edVar2 = this.f2114;
        int iHashCode4 = (iHashCode3 + (edVar2 != null ? edVar2.hashCode() : 0)) * 31;
        ed edVar3 = this.f2113;
        if (edVar3 != null) {
            int i2 = f2109 + 97;
            f2110 = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = edVar3.hashCode();
            } else {
                edVar3.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
        } else {
            int i3 = f2110 + 23;
            f2109 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            }
            iHashCode = 0;
        }
        int i5 = (iHashCode4 + iHashCode) * 31;
        fr frVar = this.f2112;
        if (frVar != null) {
            int i6 = f2110 + 53;
            f2109 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = frVar.hashCode();
        }
        return i5 + iHashCode2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2163(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2111;
            int i2 = f2107;
            if (f2108) {
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
            if (f2106) {
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
