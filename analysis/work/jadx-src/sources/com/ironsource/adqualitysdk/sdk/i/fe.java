package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes2.dex */
public class fe<T> extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private T f2064;

    public fe(T t, dn dnVar) {
        super(dnVar);
        this.f2064 = t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        return new dr(this.f2064);
    }

    public String toString() {
        return new StringBuilder().append(this.f2064).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f2064;
            T t2 = ((fe) obj).f2064;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f2064;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
