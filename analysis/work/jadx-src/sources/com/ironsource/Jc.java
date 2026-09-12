package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Jc {
    private final D0 a;

    public Jc(D0 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.a = eventsWrapper;
    }

    public final void a() {
        this.a.a(A0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.a.a(A0.PAUSE_AD, null);
    }

    public final void c() {
        this.a.a(A0.RESUME_AD, null);
    }

    public final void a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(A0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j, int i, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", reason);
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(A0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d) {
        this.a.a(A0.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }
}
