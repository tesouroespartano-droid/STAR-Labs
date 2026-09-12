package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I5 implements C0 {
    public final Map<String, Object> a(C0228f0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adFormat.toString()");
        map.put(Sa.f, string);
        map.put("adf", Integer.valueOf(C0313jf.b(adProperties.a())));
        String string2 = adProperties.b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "adProperties.adId.toString()");
        map.put(Sa.i, string2);
        map.put("mediationAdUnitId", adProperties.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
