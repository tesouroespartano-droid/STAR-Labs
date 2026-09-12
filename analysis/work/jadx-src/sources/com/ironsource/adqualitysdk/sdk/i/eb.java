package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eb extends ea {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1931 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1932 = {-1398295352, -1926425756, 1219229665, 939496257, 123832679, 112472138, -858991911, -1617055901, 2018637113, -94878841, -1410591595, -730479806, 59239883, -889172593, 786092653, 1042686201, -384313713, 832638494};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1933 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1934;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed[] f1935;

    public eb(ed edVar, String str, List<ed> list, List<ed> list2, dn dnVar) {
        super(str, list2, dnVar);
        this.f1934 = edVar;
        if (list != null) {
            ed[] edVarArr = new ed[list.size()];
            this.f1935 = edVarArr;
            list.toArray(edVarArr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea, com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        Method methodM2804;
        List<Object> list = m2107(dqVar, coVar);
        ed edVar = this.f1934;
        if ((edVar instanceof en) && ((en) edVar).m2137().equals(m2112(new int[]{134332713, 1504442284, -538744417, 83835921}, 4 - ImageFormat.getBitsPerPixel(0)).intern())) {
            return coVar.m1638().m2284().m2283(m2106()).m2081(dqVar, coVar, list).m2020(false);
        }
        Object objM2019 = this.f1934.m2116(dqVar, coVar).m2019();
        if (objM2019 instanceof ci) {
            return new dr(((ci) objM2019).mo813(m2106(), list, coVar.m1628()));
        }
        if (objM2019 instanceof ck) {
            String str = m2106();
            coVar.m1628();
            return new dr(((ck) objM2019).mo1563(coVar, str, list, dqVar));
        }
        if (objM2019 instanceof co) {
            synchronized (objM2019) {
                co coVar2 = (co) objM2019;
                du duVarM1629 = coVar2.m1629(m2106());
                if (duVarM1629 != null) {
                    return duVarM1629.m2081(coVar2.m1627(), coVar2, list).m2020(false);
                }
                cn.m1575(coVar.m1624(), new StringBuilder().append(m2112(new int[]{-755219540, -217028394, 1913724618, 1894630646, -485263312, 1742295043, 1123666237, 741258203, -1785631422, 1673849189, 1368917706, -24354987}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern()).append(m2106()).toString(), new NoSuchMethodException());
            }
        }
        try {
            ed[] edVarArr = this.f1935;
            if (edVarArr != null) {
                methodM2804 = kc.m2808(objM2019, m2106(), m2110(edVarArr, dqVar, coVar));
            } else {
                methodM2804 = kc.m2804(objM2019, m2106(), list);
            }
            if (methodM2804 == null) {
                list.add(0, objM2019);
                db dbVarM1626 = coVar.m1626();
                String str2 = m2106();
                coVar.m1628();
                return new dr(dbVarM1626.mo1563(coVar, str2, list, dqVar));
            }
            return new dr(methodM2804.invoke(objM2019, list.toArray()));
        } catch (IllegalAccessException e) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2112(new int[]{-755219540, -217028394, 1913724618, 1894630646, -485263312, 1742295043, 1123666237, 741258203, -1785631422, 1673849189, 1368917706, -24354987}, TextUtils.getOffsetAfter("", 0) + 23).intern()).append(this).toString(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2112(new int[]{-755219540, -217028394, 1913724618, 1894630646, -485263312, 1742295043, 1123666237, 741258203, -1785631422, 1673849189, 1368917706, -24354987}, 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).append(this).toString(), e2);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<Class> m2110(ed[] edVarArr, dq dqVar, co coVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (ed edVar : edVarArr) {
            int i2 = f1931 + 27;
            f1933 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add((Class) edVar.m2116(dqVar, coVar).m2019());
        }
        int i4 = f1931 + 25;
        f1933 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final String toString() {
        int i = 2 % 2;
        int i2 = f1933 + 33;
        f1931 = i2 % 128;
        int i3 = i2 % 2;
        ed[] edVarArr = m2109();
        if (i3 == 0) {
            return mo2108(edVarArr);
        }
        mo2108(edVarArr);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /* JADX INFO: renamed from: ｋ */
    final String mo2108(Object[] objArr) {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f1934).append(m2112(new int[]{-2115251325, -1803422068}, AndroidCharacter.getMirror('0') - '/').intern()).append(m2106()).append(m2111()).append(m2112(new int[]{823337777, 1795611375}, TextUtils.indexOf("", "", 0, 0) + 1).intern()).append(m2114(objArr)).append(m2112(new int[]{1220405538, -1008454010}, 1 - TextUtils.indexOf("", "", 0, 0)).intern()).toString();
        int i2 = f1933 + 75;
        f1931 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2111() {
        int i = 2 % 2;
        int i2 = f1931 + 61;
        int i3 = i2 % 128;
        f1933 = i3;
        int i4 = i2 % 2;
        if (this.f1935 != null) {
            return new StringBuilder().append(m2112(new int[]{48644271, 1054970078}, 1 - TextUtils.indexOf("", "")).intern()).append(m2114(this.f1935)).append(m2112(new int[]{-1401618590, -252995627}, 1 - View.MeasureSpec.getSize(0)).intern()).toString();
        }
        int i5 = i3 + 39;
        f1931 = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1.equals(r7.f1934) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r1.equals(r7.f1934) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.eb.f1931 + 35;
        com.ironsource.adqualitysdk.sdk.i.eb.f1933 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if ((r7 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r7 = 3 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r7.f1934 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r1 = r6.f1935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.eb.f1933 + 119;
        com.ironsource.adqualitysdk.sdk.i.eb.f1931 = r2 % 128;
        r2 = r2 % 2;
        r7 = r7.f1935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r2 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        return r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1.equals(r7);
        r7 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r7.f1935 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        return true;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1933;
        int i3 = i2 + 43;
        f1931 = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 125;
            f1931 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        eb ebVar = (eb) obj;
        ed edVar = this.f1934;
        if (edVar != null) {
            int i6 = f1933 + 27;
            f1931 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 10 / 0;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r1
      0x003d: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = f1933 + 53;
        f1931 = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = super.hashCode() << 96;
            if (this.f1934 != null) {
                int i3 = f1933 + 9;
                f1931 = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = this.f1934.hashCode();
                int i5 = f1931 + 105;
                f1933 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode2 = 0;
            }
        } else {
            iHashCode = super.hashCode() * 31;
            if (this.f1934 != null) {
                int i7 = f1933 + 9;
                f1931 = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = this.f1934.hashCode();
                int i9 = f1931 + 105;
                f1933 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                iHashCode2 = 0;
            }
        }
        int i11 = (iHashCode + iHashCode2) * 31;
        ed[] edVarArr = this.f1935;
        if (edVarArr != null) {
            iHashCode3 = edVarArr.hashCode();
        } else {
            int i12 = f1931 + 55;
            f1933 = i12 % 128;
            int i13 = i12 % 2;
        }
        return i11 + iHashCode3;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2112(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1932.clone();
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
