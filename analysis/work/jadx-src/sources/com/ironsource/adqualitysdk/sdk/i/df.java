package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class df extends cx {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static cq.b m1849(List<Object> list) {
        return new cq.b((List) m1770(list, 0, List.class), ((Integer) m1770(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1851(List<Object> list) {
        Object obj;
        Class<?> cls;
        hp hpVar;
        Object obj2;
        Object obj3;
        Class<?> cls2;
        hp hpVar2;
        Object obj4;
        int size = list.size();
        Object obj5 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) m1770(list, 0, Class.class);
                obj = null;
            } else {
                Object obj6 = m1770(list, 0, Object.class);
                if (obj6 != null) {
                    obj = obj6;
                    cls = obj6.getClass();
                } else {
                    obj = obj6;
                    cls = null;
                }
            }
            hpVar = (hp) m1770(list, 1, hp.class);
            cls3 = cls;
            obj2 = obj;
            obj3 = null;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m1770(list, 0, Class.class);
                if (list.get(1) instanceof hp) {
                    hpVar2 = (hp) m1770(list, 1, hp.class);
                    obj4 = m1770(list, 2, Object.class);
                } else {
                    Object obj7 = m1770(list, 1, Object.class);
                    hpVar = (hp) m1770(list, 2, hp.class);
                    obj3 = null;
                    cls3 = cls2;
                    obj2 = obj7;
                }
            } else {
                obj5 = m1770(list, 0, Object.class);
                cls2 = obj5.getClass();
                hpVar2 = (hp) m1770(list, 1, hp.class);
                obj4 = m1770(list, 2, Object.class);
            }
            Object obj8 = obj5;
            cls3 = cls2;
            obj2 = obj8;
            obj3 = obj4;
            hpVar = hpVar2;
        } else if (size != 4) {
            hpVar = null;
            obj2 = null;
            obj3 = null;
        } else {
            cls3 = (Class) m1770(list, 0, Class.class);
            obj2 = m1770(list, 1, Object.class);
            hp hpVar3 = (hp) m1770(list, 2, hp.class);
            obj3 = m1770(list, 3, Object.class);
            hpVar = hpVar3;
        }
        hu.m2296().m2297();
        return hw.m2339(cls3, obj2, hpVar, obj3);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<Object> m1848(List<Object> list) {
        Object obj;
        hp hpVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object obj2 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m1770(list, 0, Class.class);
                obj = null;
            } else {
                obj = m1770(list, 0, Object.class);
                if (obj != null) {
                    cls2 = obj.getClass();
                }
            }
            hpVar = (hp) m1770(list, 1, hp.class);
        } else if (size != 3) {
            hpVar = null;
            obj = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) m1770(list, 0, Class.class);
                if (list.get(1) instanceof hp) {
                    hpVar = (hp) m1770(list, 1, hp.class);
                } else {
                    obj2 = m1770(list, 1, Object.class);
                    hpVar = (hp) m1770(list, 2, hp.class);
                }
            } else {
                obj2 = m1770(list, 0, Object.class);
                cls = obj2.getClass();
                hpVar = (hp) m1770(list, 1, hp.class);
            }
            Object obj3 = obj2;
            cls2 = cls;
            obj = obj3;
        }
        hu.m2296().m2297();
        return hw.m2328(cls2, obj, hpVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final <T> hr<T> m1855(final dq dqVar, final co coVar, List<Object> list) {
        Object obj = m1770(list, 0, Object.class);
        final cq cqVar = (cq) m1770(list, 1, cq.class);
        final List<Object> list2 = m1772(list, 2);
        if (cqVar == null) {
            return null;
        }
        return hu.m2296().m2297().m2347(obj, cqVar.m1710(new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.df.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final boolean mo1856(hr hrVar) {
                return cqVar.m1709().m1567(hrVar, dqVar, coVar, list2);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1852(dq dqVar, co coVar, List<Object> list) {
        hr hrVarM1855 = m1855(dqVar, coVar, list);
        if (hrVarM1855 != null) {
            return hrVarM1855.mo2274();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<hr> m1854(final dq dqVar, final co coVar, List<Object> list) {
        Object obj = m1770(list, 0, Object.class);
        final cq cqVar = (cq) m1770(list, 1, cq.class);
        final List<Object> list2 = m1772(list, 2);
        if (cqVar == null) {
            return null;
        }
        return hu.m2296().m2297().m2350(obj, cqVar.m1710(new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.df.5
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1856(hr hrVar) {
                return cqVar.m1709().m1567(hrVar, dqVar, coVar, list2);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<Object> m1853(dq dqVar, co coVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (hr hrVar : m1854(dqVar, coVar, list)) {
            if (hrVar != null) {
                arrayList.add(hrVar.mo2274());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m1850(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hu.m2296().m2297().m2344((Class) m1770(list, 0, Class.class), (String) m1770(list, 1, String.class));
        }
        Object obj = m1770(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return hu.m2296().m2297().m2346(obj, new JSONArray((Collection) m1770(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hu.m2296().m2297().m2346(obj, (JSONArray) m1770(list, 1, JSONArray.class));
        }
        return hu.m2296().m2297().m2345(obj, (String) m1770(list, 1, String.class));
    }
}
