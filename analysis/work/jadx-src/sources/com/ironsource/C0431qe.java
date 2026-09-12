package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0431qe {
    private final P9 a = new P9();
    private final C0358m9 b = new C0358m9(IronSourceThreadManager.INSTANCE.getInitHandler());
    private final InterfaceC0576z7 c = Ab.s.d().i();

    /* JADX INFO: renamed from: com.ironsource.qe$a */
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

    public final void a(Vd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final InterfaceC0576z7 b() {
        return this.c;
    }

    public final P9 c() {
        return this.a;
    }

    public final void d(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void e(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final void f() {
        com.ironsource.mediationsdk.p.m().V();
    }

    public final void g() {
        Ab.s.d().q().a(new B5(C5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public static /* synthetic */ void a(C0431qe c0431qe, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c0431qe.a(runnable, j);
    }

    public final void b(Vd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable);
    }

    public final void c(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.b(runnable);
    }

    public final IronSourceSegment d() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.isNetworkConnected(context);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.b.a(callback);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM = this.c.M(context);
        Intrinsics.checkNotNullExpressionValue(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final boolean e() {
        return IronSourceUtils.isEncryptedResponse();
    }

    public final void a(Vd safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable, j);
    }

    public static /* synthetic */ void a(C0431qe c0431qe, Vd vd, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c0431qe.a(vd, j);
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        M6.a().a(key, value);
    }

    public final void a(long j, Ae.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.m().a(j, responseOrigin);
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = com.ironsource.mediationsdk.p.m().b(context);
        Intrinsics.checkNotNullExpressionValue(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    public final Ae a(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.m().a(context, appKey);
    }

    public final void a(D1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C0421q4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.getSessionId(), reporterSettings.a(), reporterSettings.g());
    }

    public final void a(EnumC0397oe initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        C0414pe.a.a(initStatus);
    }

    public final void a() {
        C0430qd.c().a();
    }
}
