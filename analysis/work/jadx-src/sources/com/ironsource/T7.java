package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class T7 implements If {
    private static boolean c;
    private static final N9 e;
    private static final N9 f;
    private static final N9 g;
    public static final T7 a = new T7();
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Lazy d = LazyKt.lazy(a.a);

    static final class a extends Lambda implements Function0<Wd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wd invoke() {
            return new Wd(0, null, null, 7, null);
        }
    }

    static {
        N9 n9 = new N9("isadplayer-background");
        n9.start();
        n9.a();
        e = n9;
        N9 n10 = new N9("isadplayer-publisher-callbacks");
        n10.start();
        n10.a();
        f = n10;
        N9 n11 = new N9("isadplayer-release");
        n11.start();
        n11.a();
        g = n11;
    }

    private T7() {
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            g.b(action);
        }
    }

    private final Wd b() {
        return (Wd) d.getValue();
    }

    public static /* synthetic */ void c(T7 t7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        t7.d(runnable, j);
    }

    @Override // com.ironsource.If
    public void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return c;
    }

    public static /* synthetic */ void a(T7 t7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        t7.b(runnable, j);
    }

    public final void b(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        e.a(action, j);
    }

    public final void c(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f.a(action, j);
    }

    public final void d(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j);
    }

    public static /* synthetic */ void b(T7 t7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        t7.c(runnable, j);
    }

    @Override // com.ironsource.If
    public void a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (c) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            g.a(action, j);
        }
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final Looper a() {
        return e.getLooper();
    }
}
