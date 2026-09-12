package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f2386;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private dp f2387;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Method> m2280(Class cls, hv hvVar) {
        ArrayList arrayList = new ArrayList();
        m2279(cls, hvVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2279(Class cls, hv hvVar, List<Method> list) {
        e eVar = new e((byte) 0);
        eVar.m2288(hvVar);
        m2278(cls, eVar, list);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2278(Class cls, e eVar, List<Method> list) {
        List<Method> listAsList;
        hv hvVarM2287 = eVar.m2287();
        if (hvVarM2287 != null && hvVarM2287.m2247()) {
            listAsList = m2276(cls, hvVarM2287.m2247(), hvVarM2287.m2249());
        } else {
            listAsList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : listAsList) {
            if (eVar.m2289(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Method> m2276(Class cls, boolean z, int i) {
        Method[] methodArrM2795 = new Method[0];
        if (cls != null) {
            methodArrM2795 = kc.m2795(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return Arrays.asList(methodArrM2795);
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                methodArrM2795 = kc.m2795(kc.m2795(methodArrM2795, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM2795);
    }

    static class e {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f2388;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hv f2389;

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m2288(hv hvVar) {
            this.f2389 = hvVar;
            this.f2388 = hvVar.m2306();
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final hv m2287() {
            return this.f2389;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final boolean m2289(Method method) {
            boolean zIsAssignableFrom;
            if (this.f2389 == null || (method.getModifiers() & this.f2389.m2250()) != this.f2389.m2250() || (method.getModifiers() & this.f2389.m2248()) != 0 || this.f2389.m2307().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2389.m2305() != -1 && this.f2389.m2305() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2310 = this.f2389.m2310();
            if (listM2310 != null) {
                if (listM2310.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < listM2310.size(); i++) {
                    if (!listM2310.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (this.f2389.m2309() == null) {
                zIsAssignableFrom = true;
            } else if (this.f2389.m2308()) {
                zIsAssignableFrom = method.getReturnType().equals(this.f2389.m2309());
            } else {
                zIsAssignableFrom = this.f2389.m2309().isAssignableFrom(method.getReturnType());
            }
            if (zIsAssignableFrom) {
                int i2 = this.f2388;
                if (i2 == 0) {
                    return true;
                }
                this.f2388 = i2 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m2277(Class cls, hv hvVar) {
        ArrayList arrayList = new ArrayList();
        m2279(cls, hvVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    public hs() {
    }

    public hs(dp dpVar, hs hsVar) {
        this.f2387 = dpVar;
        this.f2386 = hsVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2286() {
        return this.f2387.m2004();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m2284() {
        return this.f2386;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m2282() {
        ArrayList arrayList = new ArrayList(this.f2387.m2005());
        hs hsVar = this.f2386;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2282());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<dl> m2285() {
        ArrayList arrayList = new ArrayList(this.f2387.m2001());
        hs hsVar = this.f2386;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2285());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Cdo m2281(String str) {
        Cdo cdo;
        hs hsVar = this;
        do {
            cdo = hsVar.f2387.m2000().get(str);
            if (cdo != null) {
                break;
            }
            hsVar = hsVar.f2386;
        } while (hsVar != null);
        return cdo;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final du m2283(String str) {
        du duVar;
        hs hsVar = this;
        do {
            duVar = hsVar.f2387.m2006().get(str);
            if (duVar != null) {
                break;
            }
            hsVar = hsVar.f2386;
        } while (hsVar != null);
        return duVar;
    }
}
