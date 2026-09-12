package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class de extends cx {
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int m1846(List<Object> list) {
        return kb.m2790((String) m1770(list, 0, String.class), (String) m1770(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m1847(List<Object> list) {
        return hu.m2296().m2297().m2349(m1770(list, 0, Object.class), (List<String>) m1770(list, 1, List.class), ((Integer) m1770(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m1843(List<Object> list) {
        String str = (String) m1770(list, 0, String.class);
        if (list.get(1) instanceof String) {
            return kb.m2787(str, (String) m1770(list, 1, String.class));
        }
        return kb.m2782(str, new JSONArray((Collection) m1770(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m1845(List<Object> list) {
        String str = (String) m1770(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) m1770(list, 2, Boolean.class)).booleanValue() : true;
        if (list.get(1) instanceof String) {
            return kb.m2781(str, (String) m1770(list, 1, String.class), zBooleanValue);
        }
        return kb.m2786(str, new JSONArray((Collection) m1770(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1844(List<Object> list) {
        return kb.m2784((String) m1770(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m1842(List<Object> list) {
        return kb.m2785((String) m1770(list, 0, String.class));
    }
}
