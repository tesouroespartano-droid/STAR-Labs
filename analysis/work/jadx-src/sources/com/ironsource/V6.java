package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class V6 implements Cif {
    private final a a;

    public interface a {
        void a(Runnable runnable, long j);
    }

    public static final class b extends Vd {
        final /* synthetic */ Cif.a b;
        final /* synthetic */ Runnable c;

        b(Cif.a aVar, Runnable runnable) {
            this.b = aVar;
            this.c = runnable;
        }

        @Override // com.ironsource.Vd
        public void a() {
            if (this.b.b()) {
                return;
            }
            this.c.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Cif
    public Cif.a a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        Cif.a aVar = new Cif.a();
        this.a.a(a(aVar, task), Duration.m4948getInWholeMillisecondsimpl(j));
        return aVar;
    }

    public V6(a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public /* synthetic */ V6(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? W6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    private final Vd a(Cif.a aVar, Runnable runnable) {
        return new b(aVar, runnable);
    }
}
