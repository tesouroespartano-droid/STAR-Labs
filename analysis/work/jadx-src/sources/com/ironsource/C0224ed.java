package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0224ed implements C0 {
    private final String a;

    public C0224ed(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = placementName;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a0) {
        HashMap map = new HashMap();
        map.put("placement", this.a);
        return map;
    }
}
