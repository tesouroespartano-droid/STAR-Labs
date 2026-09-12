package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0363me {
    public static final C0363me a;
    private static De b;
    private static final Lazy c;
    private static final String d;
    private static final C0431qe e;
    private static final C0566ye f;
    private static final List<InterfaceC0225ee> g;
    private static Yd h;
    private static C0155ae i;
    private static boolean j;
    private static long k;

    /* JADX INFO: renamed from: com.ironsource.me$a */
    static final class a extends Lambda implements Function0<InterfaceC0339l7> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0339l7 invoke() {
            return Ab.s.d().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.me$b */
    public static final class b implements InterfaceC0225ee {
        final /* synthetic */ Context a;

        b(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C0155ae error) {
            Intrinsics.checkNotNullParameter(error, "$error");
            C0363me.a.a(error);
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final Yd sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C0431qe c0431qe = C0363me.e;
            final Context context = this.a;
            c0431qe.a(new Runnable() { // from class: com.ironsource.me$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C0363me.b.a(context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, Yd sdkConfig) throws JSONException {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            C0363me c0363me = C0363me.a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            c0363me.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final C0155ae error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C0363me.e.a(new Runnable() { // from class: com.ironsource.me$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0363me.b.b(error);
                }
            });
        }
    }

    static {
        C0363me c0363me = new C0363me();
        a = c0363me;
        c = LazyKt.lazy(a.a);
        d = c0363me.getClass().getSimpleName();
        e = new C0431qe();
        f = new C0566ye();
        g = new ArrayList();
    }

    private C0363me() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0276he serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Yd yd = new Yd(serverResponse);
        C0363me c0363me = a;
        c0363me.b(yd);
        c0363me.a(yd);
    }

    private final InterfaceC0339l7 c() {
        return (InterfaceC0339l7) c.getValue();
    }

    private final void d() {
        if (Ab.s.d().g().g()) {
            Od.i().a(new B5(C5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        a.a(true);
    }

    public final void e() {
        e.c(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0155ae error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        a.a(error);
    }

    private final void a(Context context, P9 p9, Ae ae) {
        p9.i(ae.f().h());
        p9.c(ae.f().d());
        A1 a1B = ae.c().b();
        Intrinsics.checkNotNull(a1B);
        p9.a(a1B.a());
        p9.d(a1B.c().b());
        p9.b(a1B.k().b());
        p9.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        A1 a1B2 = ae.c().b();
        Intrinsics.checkNotNull(a1B2);
        p9.b(a1B2.f().b());
    }

    public final void b(final C0155ae error) {
        Intrinsics.checkNotNullParameter(error, "error");
        e.c(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.c(error);
            }
        });
    }

    private final void b(Yd yd) {
        h = yd;
        a(false);
    }

    private final EnumC0397oe b() {
        if (h != null) {
            return EnumC0397oe.INITIATED;
        }
        if (i != null) {
            return EnumC0397oe.INIT_FAILED;
        }
        if (j) {
            return EnumC0397oe.INIT_IN_PROGRESS;
        }
        return EnumC0397oe.NOT_INIT;
    }

    public final void a(final Context context, final C0259ge initRequest, final InterfaceC0225ee listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        e.c(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.a(listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC0225ee listener, Yd sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC0225ee listener, C0155ae error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        listener.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0225ee listener, Context context, C0259ge initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Yd yd = h;
        if (yd != null) {
            a.a(listener, yd);
            return;
        }
        g.add(listener);
        if (j) {
            return;
        }
        i = null;
        a.a(true);
        k = new Date().getTime();
        f.a(context, initRequest, e, new b(context2));
    }

    private final void b(Context context, Yd yd) {
        Context context2;
        H1 h1B;
        Fb fbE;
        H1 h1G;
        V2 v2C;
        H1 h1G2;
        B9 b9D;
        H1 h1I;
        Md mdF;
        H1 h1M;
        H1 h1B2;
        Ae aeD = yd.d();
        A1 a1B = aeD.c().b();
        boolean zL = (a1B == null || (h1B2 = a1B.b()) == null) ? false : h1B2.l();
        U3 u3C = aeD.c();
        boolean zL2 = (u3C == null || (mdF = u3C.f()) == null || (h1M = mdF.m()) == null) ? false : h1M.l();
        U3 u3C2 = aeD.c();
        boolean zL3 = (u3C2 == null || (b9D = u3C2.d()) == null || (h1I = b9D.i()) == null) ? false : h1I.l();
        U3 u3C3 = aeD.c();
        boolean zL4 = (u3C3 == null || (v2C = u3C3.c()) == null || (h1G2 = v2C.g()) == null) ? false : h1G2.l();
        U3 u3C4 = aeD.c();
        boolean zL5 = (u3C4 == null || (fbE = u3C4.e()) == null || (h1G = fbE.g()) == null) ? false : h1G.l();
        if (zL) {
            A1 a1B2 = aeD.c().b();
            if (a1B2 == null || (h1B = a1B2.b()) == null) {
                context2 = context;
            } else {
                context2 = context;
                a(a, Ab.s.d().q(), h1B, context2, aeD, false, 16, null);
            }
        } else {
            context2 = context;
            Ab.s.d().q().a(false);
        }
        if (zL2) {
            U3 u3C5 = aeD.c();
            Md mdF2 = u3C5 != null ? u3C5.f() : null;
            Intrinsics.checkNotNull(mdF2);
            H1 rewardedVideoConfig = mdF2.m();
            Od odI = Od.i();
            Intrinsics.checkNotNullExpressionValue(odI, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, odI, rewardedVideoConfig, context2, aeD, false, 16, null);
        } else {
            Od.i().a(false);
        }
        if (zL3) {
            U3 u3C6 = aeD.c();
            B9 b9D2 = u3C6 != null ? u3C6.d() : null;
            Intrinsics.checkNotNull(b9D2);
            H1 interstitialConfig = b9D2.i();
            D9 d9I = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, d9I, interstitialConfig, context2, aeD, false, 16, null);
        } else if (zL4) {
            U3 u3C7 = aeD.c();
            V2 v2C2 = u3C7 != null ? u3C7.c() : null;
            Intrinsics.checkNotNull(v2C2);
            H1 bannerConfig = v2C2.g();
            D9 d9I2 = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, d9I2, bannerConfig, context2, aeD, false, 16, null);
        } else if (zL5) {
            U3 u3C8 = aeD.c();
            Fb fbE2 = u3C8 != null ? u3C8.e() : null;
            Intrinsics.checkNotNull(fbE2);
            H1 h1G3 = fbE2.g();
            D9 d9I3 = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I3, "getInstance()");
            a(this, d9I3, h1G3, context2, aeD, false, 16, null);
        } else {
            D9.i().a(false);
        }
        U3 u3C9 = aeD.c();
        A1 a1B3 = u3C9 != null ? u3C9.b() : null;
        Intrinsics.checkNotNull(a1B3);
        Xc xcI = a1B3.i();
        boolean zA = xcI.a();
        String strB = xcI.b();
        boolean zC = xcI.c();
        int iD = xcI.d();
        int[] iArrE = xcI.e();
        int[] iArrF = xcI.f();
        Wc wc = Wc.P;
        wc.a(zA);
        if (zA) {
            wc.b(strB, context2);
            wc.b(iArrE, context2);
            wc.c(iArrF, context2);
            wc.b(zC);
            wc.c(iD);
        }
    }

    public final void a(final C0276he serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        e.c(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C0155ae c0155ae) {
        i = c0155ae;
        a(false);
        Iterator<InterfaceC0225ee> it = g.iterator();
        while (it.hasNext()) {
            a(it.next(), c0155ae);
        }
        g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c0155ae, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Yd yd) throws JSONException {
        b(yd);
        K1 k1A = yd.a();
        Z4 z4 = Z4.a;
        z4.c(k1A.g());
        Ab.b bVar = Ab.s;
        bVar.a().o().a(k1A.c());
        z4.a(k1A.f());
        z4.a(k1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1A.h());
        c().a(k1A);
        C0431qe c0431qe = e;
        a(context, c0431qe.c(), yd.d());
        c0431qe.a(new Date().getTime() - k, yd.f());
        De de = new De();
        b = de;
        de.a(c());
        IronSourceUtils.saveLastResponse(context, yd.d().toString());
        bVar.d().q().c(true);
        D9.i().c(true);
        Od.i().c(true);
        Wc.P.c(true);
        b(context, yd);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(yd.e().b());
        D1 d1B = yd.b();
        if (d1B.f()) {
            c0431qe.a(d1B);
        }
        a(yd);
        new Wc.a().a();
        d();
    }

    private final void a(Yd yd) {
        Iterator<InterfaceC0225ee> it = g.iterator();
        while (it.hasNext()) {
            a(it.next(), yd);
        }
        g.clear();
    }

    private final void a(boolean z) {
        j = z;
        e.a(b());
    }

    private final void a(final InterfaceC0225ee interfaceC0225ee, final Yd yd) {
        e.e(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.b(interfaceC0225ee, yd);
            }
        });
    }

    private final void a(final InterfaceC0225ee interfaceC0225ee, final C0155ae c0155ae) {
        e.e(new Runnable() { // from class: com.ironsource.me$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C0363me.b(interfaceC0225ee, c0155ae);
            }
        });
    }

    static /* synthetic */ void a(C0363me c0363me, AbstractC0487u3 abstractC0487u3, H1 h1, Context context, Ae ae, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        c0363me.a(abstractC0487u3, h1, context, ae, z);
    }

    private final void a(AbstractC0487u3 abstractC0487u3, H1 h1, Context context, Ae ae, boolean z) {
        abstractC0487u3.a(z);
        abstractC0487u3.a(h1.c(), context);
        abstractC0487u3.b(h1.d(), context);
        abstractC0487u3.a(h1.f());
        abstractC0487u3.d(h1.e());
        abstractC0487u3.b(h1.a());
        abstractC0487u3.b(h1.i(), context);
        abstractC0487u3.c(h1.h(), context);
        abstractC0487u3.a(h1.j(), context);
        abstractC0487u3.d(h1.g(), context);
        A1 a1B = ae.c().b();
        Intrinsics.checkNotNull(a1B);
        abstractC0487u3.a(a1B.j());
        abstractC0487u3.b(h1.k());
        abstractC0487u3.c(h1.b());
    }
}
