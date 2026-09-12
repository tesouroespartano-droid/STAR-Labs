package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Uc {
    private Vc a;
    private long b;
    private boolean c;

    public Uc() {
        this(false, 1, null);
    }

    public final Vc a() {
        return this.a;
    }

    public abstract String b();

    public final long c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public Uc(boolean z) {
        this.c = z;
    }

    public final void a(Vc vc) {
        this.a = vc;
    }

    public final void a(boolean z) {
        this.c = z;
        if (z) {
            this.b = System.currentTimeMillis();
            Vc vc = this.a;
            if (vc != null) {
                vc.a(this);
                return;
            }
            return;
        }
        Vc vc2 = this.a;
        if (vc2 != null) {
            vc2.b(this);
        }
    }

    public /* synthetic */ Uc(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
