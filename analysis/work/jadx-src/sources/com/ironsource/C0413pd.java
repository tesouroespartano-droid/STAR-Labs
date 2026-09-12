package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0413pd {
    private final Map<String, C0378nc> a;

    /* JADX INFO: renamed from: com.ironsource.pd$a */
    static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C0378nc>> {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C0378nc> invoke(String networkName) throws JSONException {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new C0378nc(networkName, jSONObject));
        }
    }

    public C0413pd(JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        Map<String, C0378nc> map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(itKeys), new a(providerSettings)));
        this.a = map;
        for (Map.Entry<String, C0378nc> entry : map.entrySet()) {
            entry.getKey();
            C0378nc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C0378nc c0378nc) {
        return c0378nc.o() && c0378nc.l().length() > 0;
    }

    public final Map<String, C0378nc> a() {
        return this.a;
    }

    private final C0378nc a(C0378nc c0378nc) {
        return this.a.get(c0378nc.h());
    }
}
