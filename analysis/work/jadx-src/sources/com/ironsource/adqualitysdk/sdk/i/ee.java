package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ee extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1951 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1952;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1953 = {-1577936257, -1180658800, -707261792, -297330614, 126090527, -304124974, 1667966686, -1663100537, 244515977, 1258288526, 680669626, 247626920, 1326046934, -321742087, -686999913, 2080816510, -1487693672, 1258477618};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1954;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1955;

    public ee(ed edVar, String str, dn dnVar) {
        super(dnVar);
        this.f1954 = edVar;
        this.f1955 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(r4.getClass().getDeclaredField(r3.f1955).get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.co) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.co) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r5 = new com.ironsource.adqualitysdk.sdk.i.dr(((com.ironsource.adqualitysdk.sdk.i.co) r4).m1629(r3.f1955));
        r4 = com.ironsource.adqualitysdk.sdk.i.ee.f1952 + 41;
        com.ironsource.adqualitysdk.sdk.i.ee.f1951 = r4 % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dr mo2084(dq dqVar, co coVar) {
        Object objM2019;
        int i = 2 % 2;
        int i2 = f1952 + 69;
        f1951 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            objM2019 = this.f1954.m2116(dqVar, coVar).m2019();
            int i3 = 94 / 0;
        } else {
            objM2019 = this.f1954.m2116(dqVar, coVar).m2019();
        }
    }

    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1954.toString()).append(m2119(new int[]{522331031, -225682406}, 1 - View.MeasureSpec.getSize(0)).intern()).append(this.f1955).toString();
        int i2 = f1951 + 113;
        f1952 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ee eeVar = (ee) obj;
            ed edVar = this.f1954;
            if (edVar == null ? eeVar.f1954 != null : !edVar.equals(eeVar.f1954)) {
                return false;
            }
            String str = this.f1955;
            String str2 = eeVar.f1955;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                int i2 = f1951 + 61;
                int i3 = i2 % 128;
                f1952 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 63;
                f1951 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        ed edVar = this.f1954;
        int iHashCode = 0;
        int iHashCode2 = (edVar != null ? edVar.hashCode() : 0) * 31;
        String str = this.f1955;
        if (str != null) {
            int i2 = f1951 + 75;
            f1952 = i2 % 128;
            if (i2 % 2 != 0) {
                str.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iHashCode = str.hashCode();
        }
        int i3 = iHashCode2 + iHashCode;
        int i4 = f1952 + 3;
        f1951 = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2119(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1953.clone();
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
