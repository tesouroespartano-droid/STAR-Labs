package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0302j4 {
    public static final c a = c.a;

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    public static final class a implements InterfaceC0302j4 {
        private final Z6 b;
        private final Kf c;
        private final AtomicBoolean d;

        /* JADX INFO: renamed from: com.ironsource.j4$a$a, reason: collision with other inner class name */
        public static final class C0056a implements Kf.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            C0056a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.Kf.a
            public void a() {
                this.a.a(new InterfaceC0201d7.a(new InterfaceC0148a7.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(Z6 config, Kf timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC0302j4
        public synchronized void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C0056a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC0302j4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    public static final class b implements InterfaceC0302j4 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC0302j4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC0302j4
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$d */
    public interface d {
        void a(InterfaceC0201d7 interfaceC0201d7);
    }

    @JvmStatic
    static InterfaceC0302j4 a(C0166b7 c0166b7) {
        return a.a(c0166b7);
    }

    void a();

    void a(d dVar);

    /* JADX INFO: renamed from: com.ironsource.j4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        @JvmStatic
        public final InterfaceC0302j4 a(C0166b7 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.b;
            }
            Y6 y6 = new Y6(featureFlag);
            Kf.b bVar = new Kf.b();
            bVar.b(y6.a());
            bVar.a(y6.a());
            return new a(y6, new Kf.d().a(bVar));
        }

        public final InterfaceC0302j4 a() {
            return b.b;
        }
    }
}
