package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0468t1 {
    public static final b a = b.a;

    /* JADX INFO: renamed from: com.ironsource.t1$a */
    public interface a extends InterfaceC0468t1 {

        /* JADX INFO: renamed from: com.ironsource.t1$a$a, reason: collision with other inner class name */
        public static final class C0073a implements a {
            private final String b;
            private final String c;
            private final C0425q8.e d;
            private final String e;
            private final String f;
            private final C0074a g;
            private final int h;
            private final int i;

            /* JADX INFO: renamed from: com.ironsource.t1$a$a$a, reason: collision with other inner class name */
            public static final class C0074a {
                private final int a;
                private final int b;

                public C0074a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0074a)) {
                        return false;
                    }
                    C0074a c0074a = (C0074a) obj;
                    return this.a == c0074a.a && this.b == c0074a.b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
                }

                public String toString() {
                    return "Coordinates(x=" + this.a + ", y=" + this.b + ")";
                }

                public final C0074a a(int i, int i2) {
                    return new C0074a(i, i2);
                }

                public static /* synthetic */ C0074a a(C0074a c0074a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c0074a.a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c0074a.b;
                    }
                    return c0074a.a(i, i2);
                }
            }

            public C0073a(String successCallback, String failCallback, C0425q8.e productType, String demandSourceName, String url, C0074a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
                this.g = coordinates;
                this.h = i;
                this.i = i2;
            }

            public final C0073a a(String successCallback, String failCallback, C0425q8.e productType, String demandSourceName, String url, C0074a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C0073a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC0468t1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public C0425q8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0073a)) {
                    return false;
                }
                C0073a c0073a = (C0073a) obj;
                return Intrinsics.areEqual(this.b, c0073a.b) && Intrinsics.areEqual(this.c, c0073a.c) && this.d == c0073a.d && Intrinsics.areEqual(this.e, c0073a.e) && Intrinsics.areEqual(this.f, c0073a.f) && Intrinsics.areEqual(this.g, c0073a.g) && this.h == c0073a.h && this.i == c0073a.i;
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C0425q8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.i);
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public final C0074a k() {
                return this.g;
            }

            public final int l() {
                return this.h;
            }

            public final int m() {
                return this.i;
            }

            public final int n() {
                return this.h;
            }

            public final C0074a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            public String toString() {
                return "Click(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ", coordinates=" + this.g + ", action=" + this.h + ", metaState=" + this.i + ")";
            }

            public static /* synthetic */ C0073a a(C0073a c0073a, String str, String str2, C0425q8.e eVar, String str3, String str4, C0074a c0074a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c0073a.b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c0073a.c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c0073a.d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c0073a.e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c0073a.f;
                }
                if ((i3 & 32) != 0) {
                    c0074a = c0073a.g;
                }
                if ((i3 & 64) != 0) {
                    i = c0073a.h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c0073a.i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C0074a c0074a2 = c0074a;
                return c0073a.a(str, str2, eVar, str3, str5, c0074a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String a() {
                return this.b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.t1$a$b */
        public static final class b implements a {
            private final String b;
            private final String c;
            private final C0425q8.e d;
            private final String e;
            private final String f;

            public b(String successCallback, String failCallback, C0425q8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
            }

            public final b a(String successCallback, String failCallback, C0425q8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC0468t1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public C0425q8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f);
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C0425q8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ")";
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C0425q8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                String str5 = str4;
                C0425q8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC0468t1
            public String a() {
                return this.b;
            }
        }

        String b();
    }

    @JvmStatic
    static InterfaceC0468t1 a(String str) {
        return a.a(str);
    }

    String a();

    String c();

    C0425q8.e d();

    String e();

    /* JADX INFO: renamed from: com.ironsource.t1$b */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        @JvmStatic
        public final InterfaceC0468t1 a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (Intrinsics.areEqual(strOptString, C0215e4.c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C0198d4.g.e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C0198d4.i.m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C0425q8.e eVarValueOf = C0425q8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(strOptString, C0215e4.d)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C0215e4.f);
                int i = jSONObject3.getInt(C0215e4.g);
                int i2 = jSONObject3.getInt(C0215e4.h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C0215e4.j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C0073a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0073a.C0074a(i, i2), iOptInt, iOptInt2);
            }
            if (Intrinsics.areEqual(strOptString, C0215e4.e)) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
