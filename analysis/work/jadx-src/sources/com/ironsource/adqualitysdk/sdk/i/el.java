package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class el extends ei {
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    abstract boolean mo2132(int i);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    abstract boolean mo2133(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    abstract boolean mo2134(Object obj, Object obj2);

    public el(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        Object objM2019 = m2129().m2116(dqVar, coVar).m2019();
        Object objM20110 = m2128().m2116(dqVar, coVar).m2019();
        try {
            return new dr(Boolean.valueOf(mo2132(new BigDecimal(objM2019.toString()).compareTo(new BigDecimal(objM20110.toString())))));
        } catch (Exception unused) {
            if ((objM2019 instanceof String) && (objM20110 instanceof String)) {
                return new dr(Boolean.valueOf(mo2133((String) objM2019, (String) objM20110)));
            }
            return new dr(Boolean.valueOf(mo2134(objM2019, objM20110)));
        }
    }
}
