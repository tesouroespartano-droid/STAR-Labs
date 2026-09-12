package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class da extends cx {
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m1827(List<Object> list) {
        hv hvVar = (hv) m1770(list, 1, hv.class);
        if (list.get(0) instanceof Class) {
            return hs.m2277((Class) m1770(list, 0, Class.class), hvVar);
        }
        return hs.m2277(m1770(list, 0, Object.class).getClass(), hvVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Method> m1826(List<Object> list) {
        hv hvVar = (hv) m1770(list, 1, hv.class);
        if (list.get(0) instanceof Class) {
            return hs.m2280((Class) m1770(list, 0, Class.class), hvVar);
        }
        return hs.m2280(m1770(list, 0, Object.class).getClass(), hvVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static hv.a m1825() {
        return new hv.a();
    }
}
