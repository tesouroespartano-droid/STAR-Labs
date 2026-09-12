package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final Object f1230 = new Object();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static int f1231;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int f1232;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int f1233;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m1415(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int m1414(int i) {
        a aVar = a.f57;
        return ((aVar.f58[0][i >>> 24] + aVar.f58[1][(i >>> 16) & 255]) ^ aVar.f58[2][(i >>> 8) & 255]) + aVar.f58[3][i & 255];
    }
}
