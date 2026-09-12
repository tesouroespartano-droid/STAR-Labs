package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0266h4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C0283i4 c0283i4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c0283i4.b(), a(c0283i4.c()), b(c0283i4));
    }

    private static String b(C0283i4 c0283i4) {
        return (c0283i4.d() == null || c0283i4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c0283i4.d(), c0283i4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
