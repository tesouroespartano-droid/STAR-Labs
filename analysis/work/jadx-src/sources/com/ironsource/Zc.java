package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public class Zc {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC0207dd d;
    private int e;
    private int f;

    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC0207dd d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(boolean z, EnumC0207dd enumC0207dd, int i) {
            this.b = z;
            if (enumC0207dd == null) {
                enumC0207dd = EnumC0207dd.PER_DAY;
            }
            this.d = enumC0207dd;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public Zc a() {
            return new Zc(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private Zc(boolean z, boolean z2, boolean z3, EnumC0207dd enumC0207dd, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC0207dd;
        this.e = i;
        this.f = i2;
    }

    public EnumC0207dd a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }
}
