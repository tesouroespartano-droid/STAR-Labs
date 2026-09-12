package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ft extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private en f2123;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fj f2124;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fj f2125;

    public ft(fj fjVar, fj fjVar2, en enVar) {
        this.f2124 = fjVar;
        this.f2125 = fjVar2;
        this.f2123 = enVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        try {
            fj fjVar = this.f2124;
            if (fjVar != null) {
                return fjVar.mo2153(new dq(dqVar), coVar);
            }
        } catch (Throwable th) {
            if (this.f2125 != null) {
                HashMap map = new HashMap();
                en enVar = this.f2123;
                if (enVar != null) {
                    map.put(dx.m2086(enVar.m2137()), th);
                }
                return this.f2125.mo2153(new dq(map, dqVar), coVar);
            }
        }
        return new dr(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ft ftVar = (ft) obj;
            fj fjVar = this.f2124;
            if (fjVar == null ? ftVar.f2124 != null : !fjVar.equals(ftVar.f2124)) {
                return false;
            }
            fj fjVar2 = this.f2125;
            if (fjVar2 == null ? ftVar.f2125 != null : !fjVar2.equals(ftVar.f2125)) {
                return false;
            }
            en enVar = this.f2123;
            en enVar2 = ftVar.f2123;
            if (enVar != null) {
                return enVar.equals(enVar2);
            }
            if (enVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fj fjVar = this.f2124;
        int iHashCode = (fjVar != null ? fjVar.hashCode() : 0) * 31;
        fj fjVar2 = this.f2125;
        int iHashCode2 = (iHashCode + (fjVar2 != null ? fjVar2.hashCode() : 0)) * 31;
        en enVar = this.f2123;
        return iHashCode2 + (enVar != null ? enVar.hashCode() : 0);
    }
}
