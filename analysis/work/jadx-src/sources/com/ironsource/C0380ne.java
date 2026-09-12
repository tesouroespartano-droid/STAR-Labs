package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0380ne implements InterfaceC0462sc {
    public static final C0380ne a = new C0380ne();
    private static final C0431qe b = new C0431qe();

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    public static final class a implements InterfaceC0225ee {
        final /* synthetic */ InterfaceC0225ee a;

        a(InterfaceC0225ee interfaceC0225ee) {
            this.a = interfaceC0225ee;
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final Yd sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C0431qe c0431qe = C0380ne.b;
            final InterfaceC0225ee interfaceC0225ee = this.a;
            c0431qe.a(new Runnable() { // from class: com.ironsource.ne$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C0380ne.a.a(sdkConfig, interfaceC0225ee);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Yd sdkConfig, InterfaceC0225ee listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            C0380ne.a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final C0155ae error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C0431qe c0431qe = C0380ne.b;
            final InterfaceC0225ee interfaceC0225ee = this.a;
            c0431qe.d(new Runnable() { // from class: com.ironsource.ne$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0380ne.a.a(interfaceC0225ee, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC0225ee listener, C0155ae error) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error);
        }
    }

    private C0380ne() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C0259ge initRequest, InterfaceC0225ee listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new P9().a(EnumC0242fe.LEVEL_PLAY_INIT);
        a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C0259ge initRequest, InterfaceC0225ee listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p pVarM = com.ironsource.mediationsdk.p.m();
        String strD = initRequest.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.e().toArray(new IronSource.AD_UNIT[0]);
        List<IronSource.AD_UNIT> validAdUnitsList = pVarM.a(context, strD, false, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new P9().a(EnumC0242fe.EXTERNAL_MEDIATION_INIT);
        a.a(context, initRequest, listener, true);
    }

    public final void c(final Context context, final C0259ge initRequest, final InterfaceC0225ee listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C0380ne.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.InterfaceC0462sc
    public void onInitFailed(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b.a(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0380ne.a(error);
            }
        });
    }

    public final void a(final Context context, final C0259ge initRequest, final InterfaceC0225ee listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C0380ne.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C0259ge c0259ge, final InterfaceC0225ee interfaceC0225ee, boolean z) throws Throwable {
        String strF = c0259ge.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.p.m().t(c0259ge.f());
        } else {
            c0259ge = new C0259ge(c0259ge.d(), com.ironsource.mediationsdk.p.m().o(), CollectionsKt.toMutableList((Collection) c0259ge.e()));
        }
        com.ironsource.mediationsdk.p pVarM = com.ironsource.mediationsdk.p.m();
        String strD = c0259ge.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) c0259ge.e().toArray(new IronSource.AD_UNIT[0]);
        final IronSourceError ironSourceErrorA = pVarM.a(context, strD, z, null, this, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Ae aeH = com.ironsource.mediationsdk.p.m().h();
                if (aeH != null) {
                    a(new Yd(new C0276he(aeH)), interfaceC0225ee);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                C0363me.a.e();
                return;
            }
            b.d(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C0380ne.a(interfaceC0225ee, ironSourceErrorA);
                }
            });
            return;
        }
        C0363me.a.a(context, c0259ge, new a(interfaceC0225ee));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ae serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C0363me.a.a(new C0276he(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0225ee listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        listener.a(new C0155ae(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Yd yd, final InterfaceC0225ee interfaceC0225ee) {
        if (!com.ironsource.mediationsdk.p.m().a(false, yd.d())) {
            b.d(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C0380ne.a(interfaceC0225ee);
                }
            });
        } else {
            b.d(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    C0380ne.a(interfaceC0225ee, yd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0225ee listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.a(new C0155ae(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0225ee listener, Yd sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.InterfaceC0462sc
    public void a(final Ae serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.a(new Runnable() { // from class: com.ironsource.ne$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C0380ne.b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        C0363me.a.b(new C0155ae(error));
    }
}
