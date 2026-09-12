package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class M1 implements InterfaceC0339l7 {
    private final G7 a;
    private N1 b;

    public static final class a {
        public final N1 a(K1 k1, G7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k1 != null ? Boolean.valueOf(k1.k()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                Od.i().a(new B5(C5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((k1 != null ? k1.k() : false) && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C0485u1() : new V7();
        }
    }

    public M1(G7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC0339l7
    public void a(K1 k1) {
        if (this.b == null) {
            this.b = new a().a(k1, this.a);
        }
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC0187ca observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        N1 n1 = this.b;
        if (n1 != null) {
            n1.b(observer);
        }
    }

    @Override // com.ironsource.N1
    public void a(InterfaceC0187ca observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        N1 n1 = this.b;
        if (n1 != null) {
            n1.a(observer);
        }
    }
}
