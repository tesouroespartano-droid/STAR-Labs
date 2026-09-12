package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class en extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1986 = {109325339, 1431755313, -1080518299, 1571386218, 1542621588, 1932172749, -1035372092, 1798520067, 324238873, -1750381406, 1527389513, -390858007, 2132966297, -589648608, -1419021307, -255991804, -891985370, 2449700};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1987 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1988;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1989;

    public en(String str, dn dnVar) {
        super(dnVar);
        this.f1989 = dx.m2086(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2137() {
        int i = 2 % 2;
        int i2 = f1988 + 61;
        f1987 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1989;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        try {
            return new dr(dqVar.m2013(m2137()));
        } catch (Exception e) {
            du duVarM1629 = coVar.m1629(m2137());
            if (duVarM1629 != null) {
                dr drVar = new dr(duVarM1629);
                int i2 = f1988 + 93;
                f1987 = i2 % 128;
                int i3 = i2 % 2;
                return drVar;
            }
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2136(new int[]{-1449452009, -1962093567, -252903593, -1528318259, -1850103948, -606324745, -243283228, 1708372085, -1211027774, 650418243, -28012590, 628108626, -1619298243, 1741236033}, Color.argb(0, 0, 0, 0) + 28).intern()).append(this).append(m2117()).toString(), e);
            Object obj = null;
            dr drVar2 = new dr(null);
            int i4 = f1987 + 81;
            f1988 = i4 % 128;
            if (i4 % 2 == 0) {
                return drVar2;
            }
            super.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1987 + 29;
        f1988 = i2 % 128;
        int i3 = i2 % 2;
        String strM2137 = m2137();
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return strM2137;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = f1987 + 121;
            f1988 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            super.hashCode();
            throw null;
        }
        if (obj != null) {
            int i3 = f1987 + 93;
            f1988 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                return this.f1989.equals(((en) obj).f1989);
            }
        }
        int i4 = f1988 + 15;
        f1987 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1987;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        f1988 = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f1989;
        if (str == null) {
            int i5 = i4 + 77;
            f1987 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int i7 = i2 + 81;
        f1988 = i7 % 128;
        if (i7 % 2 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2136(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1986.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
                cArr[0] = (char) (c.f1232 >>> 16);
                cArr[1] = (char) c.f1232;
                cArr[2] = (char) (c.f1233 >>> 16);
                cArr[3] = (char) c.f1233;
                c.m1415(iArr2);
                cArr2[c.f1231 << 1] = cArr[0];
                cArr2[(c.f1231 << 1) + 1] = cArr[1];
                cArr2[(c.f1231 << 1) + 2] = cArr[2];
                cArr2[(c.f1231 << 1) + 3] = cArr[3];
                c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
