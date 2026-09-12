package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cm {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private du f1365;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private a f1366;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m1567(hr hrVar, dq dqVar, co coVar, List<Object> list) {
        a aVar = this.f1366;
        if (aVar != null && !aVar.mo1568(hrVar)) {
            return false;
        }
        if (this.f1365 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hrVar);
        return this.f1365.m2081(dqVar, coVar, arrayList).m2018();
    }

    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cm f1368 = new cm();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final d m1574(Class cls) {
            this.f1368.f1366 = new e(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final d m1572(Class cls) {
            this.f1368.f1366 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final d m1570(Class cls) {
            this.f1368.f1366 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final d m1571(du duVar) {
            this.f1368.f1365 = duVar;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final cm m1573() {
            return this.f1368;
        }
    }

    static abstract class a {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Class f1367;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        abstract boolean mo1568(hr hrVar);

        a(Class cls) {
            this.f1367 = cls;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final Class m1569() {
            return this.f1367;
        }
    }

    static class e extends a {
        e(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.a
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo1568(hr hrVar) {
            return m1569().isAssignableFrom(hrVar.mo2275().getType());
        }
    }

    static class c extends a {
        c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.a
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo1568(hr hrVar) {
            return m1569().equals(hrVar.mo2275().getType());
        }
    }

    static class b extends a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.a
        /* JADX INFO: renamed from: ﻐ */
        final boolean mo1568(hr hrVar) {
            return m1569().isInstance(hrVar.mo2274());
        }
    }
}
