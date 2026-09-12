package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0400p0 {
    private final HashMap<String, R0> a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final R0 a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        R0 r0 = this.a.get(adUnitId);
        if (r0 != null) {
            return r0;
        }
        R0 r1 = new R0(providers, i);
        this.a.put(adUnitId, r1);
        return r1;
    }
}
