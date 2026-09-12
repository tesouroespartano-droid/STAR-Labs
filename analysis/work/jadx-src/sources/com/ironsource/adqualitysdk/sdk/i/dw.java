package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class dw extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1887 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1888 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1889 = {'Q', 134, 143, 132, 150};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1890 = 35;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1891 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1892 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1893;

    public dw(String str, dn dnVar) {
        super(dnVar);
        this.f1893 = dx.m2086(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVar = new dr(coVar.m1635().m818(kb.m2780(this.f1893, m2085(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0085\u0085\u0084\u0083\u0082\u0081").intern())));
        int i2 = f1887 + 117;
        f1888 = i2 % 128;
        int i3 = i2 % 2;
        return drVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1888;
        int i3 = i2 + 81;
        f1887 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1893;
        int i5 = i2 + 29;
        f1887 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    public final boolean equals(Object obj) {
        dw dwVar;
        String str;
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f1887 + 17;
            f1888 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null) {
            int i5 = f1888 + 79;
            f1887 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
                if (getClass() == obj.getClass()) {
                    dwVar = (dw) obj;
                    str = this.f1893;
                    if (str != null) {
                        int i7 = f1887 + 107;
                        f1888 = i7 % 128;
                        int i8 = i7 % 2;
                        return str.equals(dwVar.f1893);
                    }
                    if (dwVar.f1893 == null) {
                        int i9 = f1888 + 89;
                        int i10 = i9 % 128;
                        f1887 = i10;
                        int i11 = i9 % 2;
                        i = i10 + 69;
                        f1888 = i % 128;
                        if (i % 2 != 0) {
                            return true;
                        }
                        Object obj2 = null;
                        super.hashCode();
                        throw null;
                    }
                }
            } else if (getClass() == obj.getClass()) {
                dwVar = (dw) obj;
                str = this.f1893;
                if (str != null) {
                    int i12 = f1887 + 107;
                    f1888 = i12 % 128;
                    int i13 = i12 % 2;
                    return str.equals(dwVar.f1893);
                }
                if (dwVar.f1893 == null) {
                    int i14 = f1888 + 89;
                    int i15 = i14 % 128;
                    f1887 = i15;
                    int i16 = i14 % 2;
                    i = i15 + 69;
                    f1888 = i % 128;
                    if (i % 2 != 0) {
                        return true;
                    }
                    Object obj3 = null;
                    super.hashCode();
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.f1893;
        if (str == null) {
            return 0;
        }
        int i2 = f1888 + 57;
        f1887 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.hashCode();
            super.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        int i3 = f1887 + 123;
        f1888 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2085(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1889;
            int i2 = f1890;
            if (f1892) {
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
            if (f1891) {
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
