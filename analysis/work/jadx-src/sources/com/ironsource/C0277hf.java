package com.ironsource;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0277hf implements Tc {
    private final Handler a;
    private final long b;
    private long c;
    private long d;
    private long e;
    private final b f;

    /* JADX INFO: renamed from: com.ironsource.hf$a */
    public static final class a {
        private final long a;
        private final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        public final long d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            return "Status(remainingTime=" + this.a + ", timePassed=" + this.b + ")";
        }

        public final a a(long j, long j2) {
            return new a(j, j2);
        }

        public static /* synthetic */ a a(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.a;
            }
            if ((i & 2) != 0) {
                j2 = aVar.b;
            }
            return aVar.a(j, j2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.hf$b */
    public static final class b extends Vd {
        final /* synthetic */ Runnable b;

        b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.Vd
        public void a() {
            this.b.run();
        }
    }

    public C0277hf(Handler handler, Runnable task, long j) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = handler;
        this.b = j;
        this.f = new b(task);
        this.e = c();
        b();
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    private final long d() {
        return this.b - this.c;
    }

    @Override // com.ironsource.Tc
    public a a() {
        if (!e()) {
            long jC = c();
            this.e = jC;
            this.c += jC - this.d;
            this.a.removeCallbacks(this.f);
        }
        return new a(d(), this.c);
    }

    @Override // com.ironsource.Tc
    public a b() {
        if (e()) {
            this.d = c();
            this.e = 0L;
            this.a.postDelayed(this.f, d());
        }
        return new a(d(), this.c);
    }

    public final boolean e() {
        return this.e > 0;
    }
}
