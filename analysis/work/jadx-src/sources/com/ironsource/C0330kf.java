package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0330kf {
    public static final C0330kf a = new C0330kf();
    private static final Lazy b = LazyKt.lazy(a.a);

    /* JADX INFO: renamed from: com.ironsource.kf$a */
    static final class a extends Lambda implements Function0<Wd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wd invoke() {
            return new Wd(16, null, null, 6, null);
        }
    }

    private C0330kf() {
    }

    public final void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    private final Wd a() {
        return (Wd) b.getValue();
    }

    public static /* synthetic */ void a(C0330kf c0330kf, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c0330kf.a(runnable, j);
    }

    public final void a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        a().schedule(action, j, TimeUnit.MILLISECONDS);
    }
}
