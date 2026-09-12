package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Qa {
    public static final Qa a = new Qa();

    public static final class a {
        private final boolean a;
        private final long b;
        private final long c;

        public a(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public final boolean a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.b;
        }

        public final long e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final boolean f() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.a + ", refreshInterval=" + this.b + ", visibilityCheckerInterval=" + this.c + ")";
        }

        public final a a(boolean z, long j, long j2) {
            return new a(z, j, j2);
        }

        public static /* synthetic */ a a(a aVar, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                j = aVar.b;
            }
            if ((i & 4) != 0) {
                j2 = aVar.c;
            }
            return aVar.a(z, j, j2);
        }
    }

    private Qa() {
    }

    public final InterfaceC0477ta a(C0366n0 adTools, X2 bannerContainer, a config, K2 bannerAdProperties, InterfaceC0494ua strategyListener, O2 bannerAdUnitFactory, InterfaceC0454s4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        boolean zC = Ab.s.d().g().c();
        IronLog.INTERNAL.verbose("Creating banner strategy - useLegacyStrategy: " + zC + ", isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (zC) {
            return a(adTools, bannerContainer, config, bannerAdProperties, strategyListener, bannerAdUnitFactory, config.f() && config.d() > 0);
        }
        if (config.f()) {
            return new C0545xa(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, 128, null);
        }
        Ja ja = new Ja(adTools, bannerContainer, bannerAdUnitFactory);
        ja.a(strategyListener);
        return ja;
    }

    private final InterfaceC0477ta a(C0366n0 c0366n0, X2 x2, a aVar, K2 k2, InterfaceC0494ua interfaceC0494ua, O2 o2, boolean z) {
        return new C0528wa(new Jf(c0366n0, x2, new AbstractC0301j3.b(aVar.d(), z), k2, new Pa(interfaceC0494ua), o2), interfaceC0494ua);
    }
}
