package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cb {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final JSONObject c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Cb a(String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(com.ironsource.sdk.controller.f.b.c);
            String command = jSONObject.getString(com.ironsource.sdk.controller.f.b.g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new Cb(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public Cb(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.a = adId;
        this.b = command;
        this.c = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cb)) {
            return false;
        }
        Cb cb = (Cb) obj;
        return Intrinsics.areEqual(this.a, cb.a) && Intrinsics.areEqual(this.b, cb.b) && Intrinsics.areEqual(this.c, cb.c);
    }

    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        JSONObject jSONObject = this.c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ")";
    }

    public final Cb a(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new Cb(adId, command, jSONObject);
    }

    public static /* synthetic */ Cb a(Cb cb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cb.a;
        }
        if ((i & 2) != 0) {
            str2 = cb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = cb.c;
        }
        return cb.a(str, str2, jSONObject);
    }

    @JvmStatic
    public static final Cb a(String str) throws JSONException {
        return d.a(str);
    }
}
