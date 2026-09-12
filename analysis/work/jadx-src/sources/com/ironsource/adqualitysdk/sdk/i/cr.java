package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cr extends cx {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m1714(List<Object> list) {
        return hu.m2296().m2298().m2241((Class) m1770(list, 0, Class.class), (hp) m1770(list, 1, hp.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Field> m1717(List<Object> list) {
        if (list.get(0) instanceof Class) {
            if (list.size() > 1) {
                return hu.m2296().m2298().m2240((Class) m1770(list, 0, Class.class), (hp) m1770(list, 1, hp.class));
            }
        } else {
            Object obj = m1770(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) m1770(list, 1, Boolean.class)).booleanValue() : false;
            hu.m2296().m2298();
            Field[] fieldArrM2234 = hm.m2234(obj.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2234 != null) {
                return Arrays.asList(fieldArrM2234);
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m1715(List<Object> list) {
        if (list.get(0) instanceof Class) {
            Class cls = (Class) m1770(list, 0, Class.class);
            if (list.get(1) instanceof Class) {
                return hu.m2296().m2298().m2238(cls, (Class) m1770(list, 1, Class.class));
            }
            return hu.m2296().m2298().m2241(cls, (hp) m1770(list, 1, hp.class));
        }
        Object obj = m1770(list, 0, Object.class);
        return hu.m2296().m2298().m2238(obj.getClass(), (Class) m1770(list, 1, Class.class));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field m1718(List<Object> list) {
        return hu.m2296().m2298().m2239((Class) m1770(list, 0, Class.class), (String) m1770(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static hp.b m1716() {
        hu.m2296().m2298();
        return hm.m2236();
    }
}
