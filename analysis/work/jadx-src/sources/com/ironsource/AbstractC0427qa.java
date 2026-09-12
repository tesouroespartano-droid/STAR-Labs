package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0427qa {
    private final C0366n0 a;
    private String b;
    private boolean c;

    public AbstractC0427qa(C0366n0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adTools;
        this.b = "";
    }

    public final C0366n0 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    protected final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.e(callback);
    }

    protected final void a(boolean z) {
        this.c = z;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.d(runnable);
    }

    public final void a(C0228f0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a.e().a(new B0(this.a, adProperties, null, 4, null));
    }
}
