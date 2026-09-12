package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.C0198d4;

/* JADX INFO: loaded from: classes2.dex */
public final class fs extends fr {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2116 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2117 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2118 = 3;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2119 = {'i', 'f', ' ', '(', ')', '\n', 'e', 'l', 's'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr f2120;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr f2121;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2122;

    public fs(ed edVar, fr frVar, fr frVar2) {
        this.f2122 = edVar;
        this.f2120 = frVar;
        this.f2121 = frVar2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        if (!this.f2122.m2116(dqVar, coVar).m2018()) {
            fr frVar = this.f2121;
            if (frVar == null) {
                return new dr(Boolean.FALSE);
            }
            int i2 = f2116 + 57;
            f2117 = i2 % 128;
            int i3 = i2 % 2;
            return frVar.mo2153(dqVar, coVar);
        }
        int i4 = f2116 + 113;
        f2117 = i4 % 128;
        if (i4 % 2 != 0) {
            return this.f2120.mo2153(dqVar, coVar);
        }
        this.f2120.mo2153(dqVar, coVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m2165("\u0001\u0002\u0000\u0005", (byte) (KeyEvent.keyCodeFromString("") + 83), 3 - ExpandableListView.getPackedPositionChild(0L)).intern());
        sb.append(this.f2122);
        sb.append(m2165("Z", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 48), 1 - ExpandableListView.getPackedPositionType(0L)).intern());
        if (this.f2120 instanceof fj) {
            int i2 = f2116 + 77;
            f2117 = i2 % 128;
            int i3 = i2 % 2;
            sb.append(m2165("\u0088", (byte) (104 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        } else {
            sb.append(m2165(C0198d4.j.d, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 81), View.combineMeasuredStates(0, 0) + 1).intern());
        }
        sb.append(this.f2120);
        fr frVar = this.f2121;
        if (frVar != null) {
            int i4 = f2116 + 5;
            f2117 = i4 % 128;
            int i5 = i4 % 2;
            if (frVar instanceof fj) {
                sb.append(m2165("\u0088", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 104), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            } else {
                sb.append(m2165(C0198d4.j.d, (byte) (Color.alpha(0) + 81), 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            }
            sb.append(m2165("\u0007\b\u0006\u0007", (byte) (24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3).intern());
            if (this.f2121 instanceof fj) {
                int i6 = f2116 + 49;
                f2117 = i6 % 128;
                sb.append(m2165("\u0088", (byte) (i6 % 2 == 0 ? 120 << TextUtils.lastIndexOf("", 'K') : 103 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
            } else {
                sb.append(m2165(C0198d4.j.d, (byte) (81 - View.MeasureSpec.makeMeasureSpec(0, 0)), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            }
            sb.append(this.f2121);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r7.f2122 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r2.equals(r7.f2120) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r2.equals(r7.f2120) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r7.f2120 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r2 = r6.f2121;
        r7 = r7.f2121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        return r2.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r7 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fs.f2117 + 95;
        com.ironsource.adqualitysdk.sdk.i.fs.f2116 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f2117 + 37;
        int i3 = i2 % 128;
        f2116 = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i5 = i3 + 65;
            f2117 = i5 % 128;
            int i6 = i5 % 2;
            if (getClass() == obj.getClass()) {
                fs fsVar = (fs) obj;
                ed edVar = this.f2122;
                if (edVar != null) {
                    if (!edVar.equals(fsVar.f2122)) {
                        int i7 = f2117 + 105;
                        f2116 = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    fr frVar = this.f2120;
                    if (frVar != null) {
                        int i9 = f2117 + 91;
                        f2116 = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 60 / 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        ed edVar = this.f2122;
        int iHashCode3 = 0;
        if (edVar != null) {
            int i2 = f2117 + 45;
            f2116 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = edVar.hashCode();
        } else {
            int i4 = f2116 + 77;
            f2117 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        int i6 = iHashCode * 31;
        fr frVar = this.f2120;
        if (frVar != null) {
            int i7 = f2117 + 83;
            f2116 = i7 % 128;
            if (i7 % 2 != 0) {
                frVar.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iHashCode2 = frVar.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i8 = (i6 + iHashCode2) * 31;
        fr frVar2 = this.f2121;
        if (frVar2 != null) {
            int i9 = f2117 + 79;
            f2116 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = frVar2.hashCode();
        }
        return i8 + iHashCode3;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2165(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2119;
            char c = f2118;
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
