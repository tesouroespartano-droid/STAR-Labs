package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0449s {
    public static final c d = new c(null);
    public static final String e = "capping";
    public static final String f = "pacing";
    public static final String g = "delivery";
    public static final String h = "progressiveLoadingConfig";
    public static final String i = "expiredDurationInMinutes";
    public static final String j = "reward";
    public static final String k = "name";
    public static final String l = "amount";
    public static final String m = "virtualItemName";
    public static final String n = "virtualItemCount";
    public static final long o = 60;
    private final Map<String, d> a;
    private final d b;
    private final Map<String, d> c;

    /* JADX INFO: renamed from: com.ironsource.s$a */
    static final class a extends Lambda implements Function1<JSONObject, d> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b */
    static final class b extends Lambda implements Function1<JSONObject, d> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$d */
    public static final class d {
        private final J3 a;
        private final Qc b;
        private final Q4 c;
        private final Long d;
        private final C0497ud e;
        private final C0497ud f;
        private final C0328kd g;

        public d(JSONObject features) throws JSONException {
            J3 j3;
            Qc qc;
            Intrinsics.checkNotNullParameter(features, "features");
            C0328kd c0328kd = null;
            if (features.has(C0449s.e)) {
                JSONObject jSONObject = features.getJSONObject(C0449s.e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                j3 = new J3(jSONObject);
            } else {
                j3 = null;
            }
            this.a = j3;
            if (features.has(C0449s.f)) {
                JSONObject jSONObject2 = features.getJSONObject(C0449s.f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                qc = new Qc(jSONObject2);
            } else {
                qc = null;
            }
            this.b = qc;
            this.c = features.has(C0449s.g) ? new Q4(features.getBoolean(C0449s.g)) : null;
            this.d = features.has(C0449s.i) ? Long.valueOf(features.getLong(C0449s.i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C0449s.j);
            this.e = jSONObjectOptJSONObject != null ? new C0497ud(jSONObjectOptJSONObject, "name", C0449s.l) : null;
            C0497ud c0497ud = new C0497ud(features, C0449s.m, C0449s.n);
            String strB = c0497ud.b();
            this.f = (strB == null || strB.length() == 0 || c0497ud.a() == null) ? null : c0497ud;
            if (features.has(C0449s.h)) {
                JSONObject jSONObject3 = features.getJSONObject(C0449s.h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c0328kd = new C0328kd(jSONObject3);
            }
            this.g = c0328kd;
        }

        public final C0497ud a() {
            return this.e;
        }

        public final J3 b() {
            return this.a;
        }

        public final Q4 c() {
            return this.c;
        }

        public final Long d() {
            return this.d;
        }

        public final Qc e() {
            return this.b;
        }

        public final C0497ud f() {
            return this.f;
        }

        public final C0328kd g() {
            return this.g;
        }
    }

    public C0449s(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = new C0258gd(configurations).a(b.a);
        this.b = new d(configurations);
        this.c = new X0(configurations).a(a.a);
    }

    public final Map<String, d> a() {
        return this.c;
    }

    public final d b() {
        return this.b;
    }

    public final Map<String, d> c() {
        return this.a;
    }
}
