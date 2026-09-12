package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class ej extends ef {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1982 = {786161148, 1327544509, 16689232, 811054012, 1337514030, 795776733, -1673573032, 857046700, 1411433282, 787486676, -43655931, 273598789, -1185793420, 2081015323, 1617355672, 976739513, 1947737033, -1550279134};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1983 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1984;

    public ej(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r8 instanceof org.json.JSONObject) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(((org.json.JSONObject) r8).opt((java.lang.String) r1.m2019()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if ((r8 instanceof org.json.JSONArray) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(((org.json.JSONArray) r8).opt(r1.m2023().intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(((java.util.Map) r8).get(r1.m2019()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if ((r8 instanceof java.util.List) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.dr(((java.util.List) r8).get(r1.m2023().intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.ej.f1984 + 21;
        com.ironsource.adqualitysdk.sdk.i.ej.f1983 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if ((r8 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r8.getClass().isArray() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(((java.lang.Object[]) r8)[r1.m2023().intValue()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.cn.m1575(r9.m1624(), new java.lang.StringBuilder().append(m2130(new int[]{1905940209, 1628058976, 730274911, 1052953932, -1145319314, -854262096, 441402726, -1053116077, -1051661061, 1666642772, 608324603, 778264392, -1825391104, -723907097, 1361332676, 1217057468, 1239658426, -117626236, 812867864, 2022017650, 1292690378, 1879799057}, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42).intern()).append(r7).append(m2117()).append(m2130(new int[]{37532309, -614370244, -693229494, -2076729831, 1022308581, 466937830, -1085664329, 893572365, 581529395, -899112511, -1536523823, -1804868411, -765667227, -662850259, 1079511426, 1515488691, 1491290178, -1475174115, -1143382245, 1418746678, 431949250, -556514644}, 41 - android.graphics.Color.green(0)).intern()).append(r8).toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r8 instanceof org.json.JSONObject) != false) goto L15;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dr mo2084(dq dqVar, co coVar) {
        dr drVarM2116;
        Object objM2019;
        int i = 2 % 2;
        int i2 = f1984 + 121;
        f1983 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                drVarM2116 = m2121().m2116(dqVar, coVar);
                objM2019 = m2122().m2116(dqVar, coVar).m2019();
                int i3 = 94 / 0;
            } else {
                drVarM2116 = m2121().m2116(dqVar, coVar);
                objM2019 = m2122().m2116(dqVar, coVar).m2019();
            }
        } catch (Exception e) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2130(new int[]{1905940209, 1628058976, 730274911, 1052953932, -1145319314, -854262096, 441402726, -1053116077, -1051661061, 1666642772, 608324603, 778264392, -1825391104, -723907097, 1361332676, 1217057468, 1239658426, -117626236, 812867864, 2022017650, 1292690378, 1879799057}, 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).append(this).append(m2117()).toString(), e);
        }
        return new dr(null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2130(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1982.clone();
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
