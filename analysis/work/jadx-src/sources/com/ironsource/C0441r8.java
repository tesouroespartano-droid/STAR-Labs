package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0441r8 {
    public static final int c = 1001;
    private String a;
    private int b;

    public C0441r8(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }
}
