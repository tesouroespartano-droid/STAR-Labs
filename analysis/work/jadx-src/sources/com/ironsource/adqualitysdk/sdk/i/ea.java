package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ea extends ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f1922 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f1923 = {52, -19, -3, 6, 9, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1924 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1925 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1926 = 2069051950;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1927 = 102;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1928 = 957348104;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1929;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed[] f1930;

    public ea(String str, List<ed> list, dn dnVar) {
        super(dnVar);
        this.f1929 = dx.m2086(str);
        ed[] edVarArr = new ed[list.size()];
        this.f1930 = edVarArr;
        list.toArray(edVarArr);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final String m2106() {
        int i = 2 % 2;
        int i2 = f1925;
        int i3 = i2 + 83;
        f1924 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        String str = this.f1929;
        int i4 = i2 + 49;
        f1924 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final ed[] m2109() {
        int i = 2 % 2;
        int i2 = f1924;
        int i3 = i2 + 15;
        f1925 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        ed[] edVarArr = this.f1930;
        int i4 = i2 + 9;
        f1925 = i4 % 128;
        if (i4 % 2 == 0) {
            return edVarArr;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f1924 + 71;
        f1925 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> listM2107 = m2107(dqVar, coVar);
        if (m2106().equals(m2105((KeyEvent.getMaxKeyCode() >> 16) - 2069051950, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 89), View.MeasureSpec.getMode(0) - 99, (-957347996) - TextUtils.getCapsMode("", 0, 0), (short) (TextUtils.lastIndexOf("", '0', 0) + InterfaceC0280i1.d.b.h)).intern())) {
            n.m2887(new StringBuilder().append(m2105((-2069051949) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (Color.green(0) + 43), Color.red(0) - 98, (-957348021) - Color.argb(0, 0, 0, 0), (short) ((-53) - View.resolveSize(0, 0))).intern()).append(coVar.m1624()).toString(), new StringBuilder().append(listM2107.get(0)).toString());
            return new dr(null);
        }
        try {
            dr drVar = new dr(((du) dqVar.m2013(m2106())).m2081(dqVar, coVar, listM2107));
            int i4 = f1924 + 87;
            f1925 = i4 % 128;
            if (i4 % 2 == 0) {
                return drVar;
            }
            throw null;
        } catch (Exception unused) {
            if (coVar.m1638().m2283(m2106()) != null) {
                return coVar.m1638().m2283(m2106()).m2081(dqVar, coVar, listM2107).m2020(false);
            }
            db dbVarM1626 = coVar.m1626();
            String strM2106 = m2106();
            coVar.m1628();
            return new dr(dbVarM1626.mo1563(coVar, strM2106, listM2107, dqVar));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final List<Object> m2107(dq dqVar, co coVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1930;
        int length = edVarArr.length;
        int i2 = f1924 + 123;
        f1925 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 3;
        }
        int i4 = 0;
        while (i4 < length) {
            int i5 = f1924 + 93;
            f1925 = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add(edVarArr[i4].m2116(dqVar, coVar).m2019());
                i4 += 72;
            } else {
                arrayList.add(edVarArr[i4].m2116(dqVar, coVar).m2019());
                i4++;
            }
        }
        return arrayList;
    }

    public String toString() {
        String strMo2108;
        int i = 2 % 2;
        int i2 = f1925 + 85;
        f1924 = i2 % 128;
        if (i2 % 2 == 0) {
            strMo2108 = mo2108(this.f1930);
            int i3 = 10 / 0;
        } else {
            strMo2108 = mo2108(this.f1930);
        }
        int i4 = f1925 + 39;
        f1924 = i4 % 128;
        if (i4 % 2 != 0) {
            return strMo2108;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    String mo2108(Object[] objArr) {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1929).append(m2105((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 2069051945, (byte) ((-117) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-101) - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 957348065, (short) (((Process.getThreadPriority(0) + 20) >> 6) + 17)).intern()).append(m2114(objArr)).append(m2105((-2069051946) - MotionEvent.axisFromString(""), (byte) (96 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-101) - TextUtils.getCapsMode("", 0, 0), KeyEvent.normalizeMetaState(0) - 957348063, (short) (52 - (ViewConfiguration.getTapTimeout() >> 16))).intern()).toString();
        int i2 = f1925 + 73;
        f1924 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i2 = f1925 + 21;
            f1924 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        ea eaVar = (ea) obj;
        if (this.f1929.equals(eaVar.f1929)) {
            return Arrays.equals(this.f1930, eaVar.f1930);
        }
        int i3 = f1925 + 61;
        f1924 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f1924 + 81;
        f1925 = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.f1929;
            if (str != null) {
                iHashCode = str.hashCode();
                int i3 = f1925 + 97;
                f1924 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iHashCode = 0;
            }
            return (iHashCode * 31) + Arrays.hashCode(this.f1930);
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2105(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1927;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1923;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1926 + i] + i4);
                } else {
                    i5 = (short) (f1922[f1926 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1926 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1928);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1923;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1922;
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
