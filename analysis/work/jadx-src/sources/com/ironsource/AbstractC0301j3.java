package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0301j3 {
    public static final a c = new a(null);
    private final b a;
    private final K2 b;

    /* JADX INFO: renamed from: com.ironsource.j3$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0301j3 a(C0366n0 adTools, X2 bannerContainer, b config, K2 bannerAdProperties, InterfaceC0335l3 bannerStrategyListener, O2 createBannerAdUnitFactory) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
            Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
            Intrinsics.checkNotNullParameter(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            return new Jf(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$b */
    public static final class b {
        private final long a;
        private final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public final long a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.a) * 31;
            boolean z = this.b;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public String toString() {
            return "Config(refreshInterval=" + this.a + ", isAutoRefreshEnabled=" + this.b + ")";
        }

        public final b a(long j, boolean z) {
            return new b(j, z);
        }

        public static /* synthetic */ b a(b bVar, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bVar.a;
            }
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            return bVar.a(j, z);
        }
    }

    public AbstractC0301j3(b config, K2 bannerAdProperties) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        this.a = config;
        this.b = bannerAdProperties;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    protected final long g() {
        Long lJ = this.b.j();
        return lJ != null ? lJ.longValue() : this.a.c();
    }

    protected final boolean h() {
        Boolean boolI = this.b.i();
        return boolI != null ? boolI.booleanValue() : this.a.d();
    }
}
