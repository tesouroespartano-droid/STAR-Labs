package com.ironsource.mediationsdk.model;

import com.ironsource.Zc;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "This class is deprecated and will be removed in version 9.0.0.")
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i, String placementName, boolean z, Zc zc) {
        super(i, placementName, z, zc);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
