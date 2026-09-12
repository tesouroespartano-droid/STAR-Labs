package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface Kf {

    public interface a {
        void a();
    }

    public static final class b {
        private long a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.a = j;
        }
    }

    public interface c {
        Kf a(b bVar);
    }

    public static final class d implements c {
        @Override // com.ironsource.Kf.c
        public Kf a(b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new Mf(timerConfig.b()));
        }
    }

    private static final class e implements Kf {
        private final Mf a;

        public static final class a implements Mf.a {
            final /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.Mf.a
            public void a() {
                this.a.a();
            }
        }

        public e(Mf timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.a = timer;
        }

        @Override // com.ironsource.Kf
        public void a(a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a.a((Mf.a) new a(callback));
        }

        @Override // com.ironsource.Kf
        public void cancel() {
            this.a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
