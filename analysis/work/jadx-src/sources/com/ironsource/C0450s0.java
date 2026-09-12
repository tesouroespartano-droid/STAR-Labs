package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0450s0 {
    private final AbstractC0383o0 a;
    private final LevelPlayAdInfo b;

    public C0450s0(AbstractC0383o0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = levelPlayAdInfo;
    }

    public final AbstractC0383o0 a() {
        return this.a;
    }

    public final LevelPlayAdInfo b() {
        return this.b;
    }

    public final LevelPlayAdInfo c() {
        return this.b;
    }

    public final AbstractC0383o0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0450s0)) {
            return false;
        }
        C0450s0 c0450s0 = (C0450s0) obj;
        return Intrinsics.areEqual(this.a, c0450s0.a) && Intrinsics.areEqual(this.b, c0450s0.b);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C0450s0(AbstractC0383o0 abstractC0383o0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0383o0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C0450s0 a(AbstractC0383o0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C0450s0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C0450s0 a(C0450s0 c0450s0, AbstractC0383o0 abstractC0383o0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC0383o0 = c0450s0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c0450s0.b;
        }
        return c0450s0.a(abstractC0383o0, levelPlayAdInfo);
    }
}
