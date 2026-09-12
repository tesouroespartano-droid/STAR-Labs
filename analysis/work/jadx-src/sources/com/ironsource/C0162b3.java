package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0162b3 {
    private final N0 a;
    private final H0 b;
    private final G2 c;
    private final Lazy d;
    private final Lazy e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public C0162b3(N0 loadingData, H0 interactionData, G2 mListener) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.a = loadingData;
        this.b = interactionData;
        this.c = mListener;
        this.d = LazyKt.lazy(new a());
        this.e = LazyKt.lazy(new b());
        this.f = loadingData.b() > 0;
        this.g = interactionData.b() > 0;
        this.h = loadingData.a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final C0326kb c() {
        return (C0326kb) this.d.getValue();
    }

    private final C0326kb d() {
        return (C0326kb) this.e.getValue();
    }

    private final void f() {
        if (this.h) {
            c().b();
        }
    }

    private final void g() {
        if (this.h) {
            d().b();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.b.b());
    }

    public final void h() {
        if (!this.f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.a.b());
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    private final void b(long j) {
        if (this.h && this.g) {
            d().a(j);
        }
    }

    private final void a(long j) {
        if (this.h && this.f) {
            c().a(j);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b3$a */
    static final class a extends Lambda implements Function0<C0326kb> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0326kb invoke() {
            final C0162b3 c0162b3 = C0162b3.this;
            return new C0326kb(new Runnable() { // from class: com.ironsource.b3$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0162b3.a.a(c0162b3);
                }
            }, com.ironsource.lifecycle.b.d(), new Lf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0162b3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.c.c();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b3$b */
    static final class b extends Lambda implements Function0<C0326kb> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0326kb invoke() {
            final C0162b3 c0162b3 = C0162b3.this;
            return new C0326kb(new Runnable() { // from class: com.ironsource.b3$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0162b3.b.a(c0162b3);
                }
            }, com.ironsource.lifecycle.b.d(), new Lf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0162b3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.c.d();
        }
    }
}
