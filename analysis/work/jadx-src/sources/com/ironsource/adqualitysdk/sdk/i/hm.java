package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hm {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2352;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<Field> f2353;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hp f2354;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m2239(Class cls, final String str) {
        d dVar = new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hm.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hm.d
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final boolean mo2242(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hm.class) {
            if (this.f2353 == null) {
                this.f2353 = new ArrayList();
            }
            this.f2353.clear();
            m2237(cls, dVar, this.f2353);
            if (this.f2353.isEmpty()) {
                return null;
            }
            return this.f2353.get(0);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final <T> Field m2238(Class cls, Class<T> cls2) {
        Field fieldM2241;
        synchronized (jv.class) {
            if (this.f2354 == null) {
                this.f2354 = new hp();
            }
            this.f2354.m2259(cls2);
            fieldM2241 = m2241(cls, this.f2354);
        }
        return fieldM2241;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Field m2241(Class cls, hp hpVar) {
        synchronized (jv.class) {
            if (this.f2353 == null) {
                this.f2353 = new ArrayList();
            }
            this.f2353.clear();
            m2235(cls, hpVar, this.f2353);
            if (this.f2353.isEmpty()) {
                return null;
            }
            return this.f2353.get(0);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<Field> m2240(Class cls, hp hpVar) {
        ArrayList arrayList = new ArrayList();
        m2235(cls, hpVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2235(Class cls, hp hpVar, List<Field> list) {
        synchronized (hm.class) {
            if (this.f2352 == null) {
                this.f2352 = new d(this);
            }
            this.f2352.m2243(hpVar);
            m2237(cls, this.f2352, list);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static hp.b m2236() {
        return new hp.b();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field[] m2234(Class cls, boolean z, int i, List<String> list) {
        while (cls != null && !kc.m2800(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM2801 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM2801 = kc.m2801(declaredFields, fields);
            if (!z) {
                return fieldArrM2801;
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    fieldArrM2801 = kc.m2801(fieldArrM2801, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM2801 = kc.m2801(fieldArrM2801, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM2801;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2237(Class cls, d dVar, List<Field> list) {
        for (Field field : m2233(cls, dVar.m2244())) {
            if (dVar.mo2242(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Field[] m2233(Class cls, hp hpVar) {
        if (hpVar != null && hpVar.m2247()) {
            return m2234(cls, hpVar.m2247(), hpVar.m2249(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    class d {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private hp f2356;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2357;

        private d() {
        }

        /* synthetic */ d(hm hmVar) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void m2243(hp hpVar) {
            this.f2356 = hpVar;
            this.f2357 = hpVar.m2255();
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final hp m2244() {
            return this.f2356;
        }

        /* JADX INFO: renamed from: ﾒ */
        public boolean mo2242(Field field) {
            boolean zIsAssignableFrom;
            if (this.f2356 == null || (field.getModifiers() & this.f2356.m2250()) != this.f2356.m2250() || (field.getModifiers() & this.f2356.m2248()) != 0 || this.f2356.m2258().contains(field.getType())) {
                return false;
            }
            if (this.f2356.m2256()) {
                zIsAssignableFrom = field.getType().equals(this.f2356.m2257());
            } else {
                zIsAssignableFrom = this.f2356.m2257().isAssignableFrom(field.getType());
            }
            if (zIsAssignableFrom) {
                int i = this.f2357;
                if (i == 0) {
                    return true;
                }
                this.f2357 = i - 1;
            }
            return false;
        }
    }
}
