package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0366n0 extends C0309jb {
    private final IronSource.AD_UNIT b;
    private final C0313jf.b c;
    private final D5 d;
    private final I8 e;
    private final long f;

    /* JADX INFO: renamed from: com.ironsource.n0$a */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        @JvmStatic
        public static final C0366n0 a(IronSource.AD_UNIT adFormat, D0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C0366n0(adFormat, level);
        }
    }

    public C0366n0(IronSource.AD_UNIT adFormat, D0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Ab.s.d().e();
        this.f = TimeUnit.HOURS.toMillis(1L);
        this.b = adFormat;
        this.d = new D5(adFormat, level, null, null, 12, null);
        C0313jf.b bVarA = C0313jf.a(adFormat);
        Intrinsics.checkNotNullExpressionValue(bVarA, "createLogFactory(adFormat)");
        this.c = bVarA;
    }

    public static /* synthetic */ String a(C0366n0 c0366n0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c0366n0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    protected final IronSource.AD_UNIT d() {
        return this.b;
    }

    public final D5 e() {
        return this.d;
    }

    public final int f() {
        return Ab.s.d().s().a(this.b);
    }

    public final boolean g() {
        return Ab.s.d().e().c();
    }

    public final String a(String str, String str2) {
        String strA = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(bVarD, "getInstance()");
        return bVarD;
    }

    public final Placement c(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Ra raA = this.e.a();
        if (raA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement placementC = raA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (placementC != null) {
            return placementC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Qa.a d(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Ra raA = this.e.a();
        if (raA != null) {
            return raA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Placement a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Ra raA = this.e.a();
        if (raA != null) {
            Placement placementC = raA.c(LevelPlay.AdFormat.BANNER, placementName);
            if (placementC != null) {
                return placementC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final InterfaceC0541x6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Ra raA = this.e.a();
        if (raA != null) {
            return raA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Ra raA = this.e.a();
        return raA != null ? raA.b(adFormat) : this.f;
    }

    public final Placement a(LevelPlay.AdFormat adFormat, String str) {
        Ra raA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (raA = this.e.a()) == null) {
            return null;
        }
        return raA.c(adFormat, str);
    }

    public C0366n0(C0366n0 adTools, D0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Ab.s.d().e();
        this.f = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.b;
        this.b = ad_unit;
        this.c = adTools.c;
        this.d = new D5(ad_unit, level, adTools.d.c(), null, 8, null);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.l.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C0315k0().b(adSize);
    }
}
