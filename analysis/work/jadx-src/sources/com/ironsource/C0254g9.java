package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0254g9 {
    private final String a;
    private final String b;
    private final EnumC0288i9 c;
    private final JSONObject d;

    public C0254g9(String url, String storePackage, EnumC0288i9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final EnumC0288i9 c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0254g9)) {
            return false;
        }
        C0254g9 c0254g9 = (C0254g9) obj;
        return Intrinsics.areEqual(this.a, c0254g9.a) && Intrinsics.areEqual(this.b, c0254g9.b) && this.c == c0254g9.c && Intrinsics.areEqual(this.d, c0254g9.d);
    }

    public final String f() {
        return this.b;
    }

    public final EnumC0288i9 g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        JSONObject jSONObject = this.d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    public final C0254g9 a(String url, String storePackage, EnumC0288i9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C0254g9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C0254g9 a(C0254g9 c0254g9, String str, String str2, EnumC0288i9 enumC0288i9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0254g9.a;
        }
        if ((i & 2) != 0) {
            str2 = c0254g9.b;
        }
        if ((i & 4) != 0) {
            enumC0288i9 = c0254g9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c0254g9.d;
        }
        return c0254g9.a(str, str2, enumC0288i9, jSONObject);
    }

    public /* synthetic */ C0254g9(String str, String str2, EnumC0288i9 enumC0288i9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC0288i9.APP_ACTIVITY : enumC0288i9, (i & 8) != 0 ? null : jSONObject);
    }
}
