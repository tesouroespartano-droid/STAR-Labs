package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class K2 extends C0228f0 {
    private final LevelPlayAdSize g;
    private final Boolean h;
    private final Long i;

    public /* synthetic */ K2(UUID uuid, String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, C0465sf c0465sf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : placement, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : c0465sf, (i & 128) != 0 ? null : d);
    }

    public final LevelPlayAdSize h() {
        return this.g;
    }

    public final Boolean i() {
        return this.h;
    }

    public final Long j() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(UUID adId, String adUnitId, Placement placement, LevelPlayAdSize adSize, Boolean bool, Long l, C0465sf c0465sf, Double d) {
        super(IronSource.AD_UNIT.BANNER, adId, adUnitId, placement, c0465sf, d);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.g = adSize;
        this.h = bool;
        this.i = l;
    }

    public K2() {
        this(C0542x7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
