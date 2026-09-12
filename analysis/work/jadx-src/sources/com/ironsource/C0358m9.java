package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0358m9 {
    private final Handler a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a extends Vd {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.Vd
        public void a() {
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0358m9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c(Runnable runnable) {
        Vd aVar = runnable instanceof Vd ? (Vd) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final Handler a() {
        return this.a;
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C0358m9(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public static /* synthetic */ void a(C0358m9 c0358m9, Vd vd, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c0358m9.a(vd, j);
    }

    public /* synthetic */ C0358m9(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(Vd task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.postDelayed(task, j);
    }

    public final void a(Vd task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.removeCallbacks(task);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
