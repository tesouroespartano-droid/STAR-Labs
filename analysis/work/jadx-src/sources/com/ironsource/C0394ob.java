package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0394ob {
    public static final a c = new a(null);
    public static final String d = "revenue";
    public static final String e = "precision";
    private final double a;
    private final String b;

    /* JADX INFO: renamed from: com.ironsource.ob$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C0394ob a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C0394ob(d, precision);
            } catch (Exception e) {
                C0421q4.d().a(e);
                C0313jf.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C0394ob(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.a = d2;
        this.b = precision;
    }

    public final double a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0394ob)) {
            return false;
        }
        C0394ob c0394ob = (C0394ob) obj;
        return Double.compare(this.a, c0394ob.a) == 0 && Intrinsics.areEqual(this.b, c0394ob.b);
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    public final C0394ob a(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C0394ob(d2, precision);
    }

    public static /* synthetic */ C0394ob a(C0394ob c0394ob, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = c0394ob.a;
        }
        if ((i & 2) != 0) {
            str = c0394ob.b;
        }
        return c0394ob.a(d2, str);
    }

    @JvmStatic
    public static final C0394ob a(JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
