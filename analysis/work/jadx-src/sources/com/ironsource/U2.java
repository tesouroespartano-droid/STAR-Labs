package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class U2 {
    private final b a;
    private final Map<String, b> b;

    static final class a extends Lambda implements Function1<JSONObject, b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    public static final class b {
        private final JSONObject a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;
        private final List<String> f;

        public b(JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(W2.a) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(W2.a) : null;
            this.a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(W2.b, W2.g) : W2.g;
            this.b = iOptInt;
            this.c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(W2.d) || jSONObjectOptJSONObject.isNull(W2.d)) ? iOptInt : jSONObjectOptJSONObject.optLong(W2.d);
            this.e = features.has(W2.e) ? features.optInt(W2.e) / 100.0f : 0.15f;
            List<String> listB = features.has(W2.f) ? C0169ba.b(features.getJSONArray(W2.f)) : CollectionsKt.listOf((Object[]) new String[]{"BANNER", "LEADERBOARD"});
            Intrinsics.checkNotNullExpressionValue(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f = listB;
        }

        public final List<String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }
    }

    public U2(JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.a = new b(bannerConfigurations);
        this.b = new X0(bannerConfigurations).a(a.a);
    }

    public final Map<String, b> a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }
}
