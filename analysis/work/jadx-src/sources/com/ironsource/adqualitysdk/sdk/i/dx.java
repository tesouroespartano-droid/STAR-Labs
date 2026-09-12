package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dx {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, String> f1894 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2086(String str) {
        String str2 = f1894.get(str);
        if (str2 != null) {
            return str2;
        }
        f1894.put(str, str);
        return str;
    }
}
