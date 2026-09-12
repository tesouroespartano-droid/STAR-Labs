package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends I5 {
    private final C0366n0 a;
    private final C0228f0 b;
    private final String c;

    public /* synthetic */ B0(C0366n0 c0366n0, C0228f0 c0228f0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0366n0, c0228f0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a0) {
        Map<String, Object> mapA = a(this.b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.a.f()));
        String str = this.c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public B0(C0366n0 adTools, C0228f0 adProperties, String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adTools;
        this.b = adProperties;
        this.c = str;
    }
}
