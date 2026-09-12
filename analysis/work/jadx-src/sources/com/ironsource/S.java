package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements InterfaceC0175bg {
    private final String a;
    private final InterfaceC0307j9 b;
    private final boolean c;

    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.r();
        }
    }

    static final class b extends Lambda implements Function0<IronSourceError> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.o();
        }
    }

    static final class c extends Lambda implements Function0<IronSourceError> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.n();
        }
    }

    static final class d extends Lambda implements Function0<IronSourceError> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.q();
        }
    }

    static final class e extends Lambda implements Function0<IronSourceError> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.o();
        }
    }

    static final class f extends Lambda implements Function0<IronSourceError> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.g();
        }
    }

    public S(String adm, InterfaceC0307j9 interfaceC0307j9, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.a = adm;
        this.b = interfaceC0307j9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC0175bg
    public void a() throws C0191ce {
        a(this.c, a.a);
        a(this.b != null, b.a);
        InterfaceC0307j9 interfaceC0307j9 = this.b;
        if (interfaceC0307j9 != null) {
            if (interfaceC0307j9.f() == EnumC0341l9.NonBidder) {
                a(this.a.length() == 0, c.a);
            }
            if (interfaceC0307j9.f() == EnumC0341l9.Bidder) {
                a(this.a.length() > 0, d.a);
            }
            a(interfaceC0307j9.f() != EnumC0341l9.NotSupported, e.a);
            a(interfaceC0307j9.e().length() > 0, f.a);
        }
    }
}
