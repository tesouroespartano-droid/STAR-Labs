package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Qb extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(int i, String placementName, boolean z, Zc zc) {
        super(i, placementName, z, zc);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
