package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0228f0 {
    private final IronSource.AD_UNIT a;
    private final UUID b;
    private final String c;
    private Placement d;
    private final C0465sf e;
    private final Double f;

    /* JADX INFO: renamed from: com.ironsource.f0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C0228f0(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId, Placement placement, C0465sf c0465sf, Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = placement;
        this.e = c0465sf;
        this.f = d;
    }

    public final IronSource.AD_UNIT a() {
        return this.a;
    }

    public final UUID b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Double d() {
        return this.f;
    }

    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Placement f() {
        return this.d;
    }

    public final C0465sf g() {
        return this.e;
    }

    public final void a(Placement placement) {
        this.d = placement;
    }

    public /* synthetic */ C0228f0(IronSource.AD_UNIT ad_unit, UUID uuid, String str, Placement placement, C0465sf c0465sf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, uuid, str, (i & 8) != 0 ? null : placement, (i & 16) != 0 ? null : c0465sf, (i & 32) != 0 ? null : d);
    }
}
