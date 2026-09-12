package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0519w1 extends Uc {
    public static final a f = new a(null);
    private static final String g = "AppLifecycleTrigger";
    private final com.ironsource.lifecycle.b d;
    private final InterfaceC0187ca e;

    /* JADX INFO: renamed from: com.ironsource.w1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w1$b */
    public static final class b implements InterfaceC0187ca {
        b() {
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void a() {
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void b() {
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void c() {
            C0519w1.this.a(false);
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void d() {
            C0519w1.this.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519w1(com.ironsource.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(lifeCycleObserver, "lifeCycleObserver");
        this.d = lifeCycleObserver;
        b bVar = new b();
        this.e = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.ironsource.Uc
    public String b() {
        return g;
    }

    public final void e() {
        this.d.b(this.e);
    }
}
