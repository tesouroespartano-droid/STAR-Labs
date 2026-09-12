package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public class M2 extends AbstractC0383o0 {
    private final WeakReference<P2> k;
    private final a l;
    private final N2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(C0366n0 tools, N2 adUnitData, P2 listener) {
        String str;
        int iB;
        super(tools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.k = new WeakReference<>(listener);
        this.l = new a();
        this.m = adUnitData;
        Placement placementG = g();
        IronLog.INTERNAL.verbose("placement = " + placementG);
        if (placementG == null || TextUtils.isEmpty(placementG.getPlacementName())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{placementG == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C0569z0.b(adUnitData.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    private final ISBannerSize m() {
        return f().a(this.m.b().h());
    }

    @Override // com.ironsource.AbstractC0383o0
    public C0417q0 b() {
        return new T2(this.m.b(), a(m()));
    }

    private final class a extends AbstractC0383o0.a implements A2 {
        public a() {
            super();
        }

        @Override // com.ironsource.A2
        public void a(C0554y2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p2 = (P2) M2.this.k.get();
            if (p2 != null) {
                p2.i();
            }
        }

        @Override // com.ironsource.AbstractC0383o0.a, com.ironsource.D
        public void b(AbstractC0568z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC0535x0 interfaceC0535x0I = M2.this.i();
            if (interfaceC0535x0I != null) {
                interfaceC0535x0I.f();
            }
        }

        @Override // com.ironsource.A2
        public void c(C0554y2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p2 = (P2) M2.this.k.get();
            if (p2 != null) {
                p2.j();
            }
        }

        @Override // com.ironsource.A2
        public void b(C0554y2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p2 = (P2) M2.this.k.get();
            if (p2 != null) {
                p2.m();
            }
        }
    }

    public final void a(eg egVar, InterfaceC0535x0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (egVar != null) {
            a(new C2(egVar), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC0383o0
    protected C a() {
        return new C() { // from class: com.ironsource.M2$$ExternalSyntheticLambda0
            @Override // com.ironsource.C
            public final AbstractC0568z a(A a2, G g) {
                return M2.a(this.f$0, a2, g);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0568z a(M2 this$0, A instanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C0554y2(new V0(this$0.f(), D0.b.PROVIDER), instanceData, adInstancePayload, this$0.l);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.l.a();
        }
        return ISBannerSize.BANNER;
    }
}
