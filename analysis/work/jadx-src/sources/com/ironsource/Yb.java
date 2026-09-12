package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Yb {
    public static final a e = new a(null);
    private static volatile Yb f;
    private C0430qd a;
    private final AtomicBoolean b;
    private String c;
    private U3 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Yb a() {
            Yb yb;
            Yb yb2 = Yb.f;
            if (yb2 != null) {
                return yb2;
            }
            synchronized (this) {
                yb = Yb.f;
                if (yb == null) {
                    yb = new Yb(null);
                    a aVar = Yb.e;
                    Yb.f = yb;
                }
            }
            return yb;
        }

        private a() {
        }

        public final InterfaceC0195d1 a(IronSource.AD_UNIT adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Yb yb = Yb.f;
            U3 u3B = yb != null ? yb.b() : null;
            Yb yb2 = Yb.f;
            C0430qd c0430qdE = yb2 != null ? yb2.e() : null;
            if (u3B != null && c0430qdE != null) {
                return new C0470t3(u3B, c0430qdE, adFormat);
            }
            return new C0354m5();
        }
    }

    public /* synthetic */ Yb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final Yb d() {
        return e.a();
    }

    public final U3 b() {
        return this.d;
    }

    public final AtomicBoolean c() {
        return this.b;
    }

    public final C0430qd e() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private Yb() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(C0430qd c0430qd) {
        this.a = c0430qd;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(U3 u3) {
        this.d = u3;
    }
}
