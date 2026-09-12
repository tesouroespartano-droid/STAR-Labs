package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface V {

    public static final class a implements V {
        private final JSONObject a;

        public a(JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.a = applicationConfig;
        }

        @Override // com.ironsource.V
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.V
        public int b() {
            int iOptInt = this.a.optInt("debugMode", 0);
            if (this.a.optBoolean(b.e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.V
        public String c() {
            String strOptString = this.a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    public static final class b {
        public static final b a = new b();
        public static final String b = "controllerUrl";
        public static final String c = "controllerConfig";
        public static final String d = "debugMode";
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    JSONObject a();

    int b();

    String c();
}
