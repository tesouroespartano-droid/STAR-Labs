package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Qe implements InterfaceC0580zb<Ke, C0483u> {
    @Override // com.ironsource.InterfaceC0580zb
    public C0483u a(Ke input) {
        String strH;
        String strI;
        String strG;
        U7 u7E;
        String strC;
        Intrinsics.checkNotNullParameter(input, "input");
        Re reB = input.b();
        N nA = input.a();
        if (nA == null || (strH = nA.h()) == null) {
            strH = "0";
        }
        N nA2 = input.a();
        if (nA2 == null || (strI = nA2.i()) == null) {
            strI = "0";
        }
        N nA3 = input.a();
        if (nA3 == null || (strG = nA3.g()) == null) {
            strG = "0";
        }
        N nA4 = input.a();
        if (nA4 == null || (u7E = nA4.e()) == null) {
            u7E = U7.UnknownProvider;
        }
        N nA5 = input.a();
        return new C0483u(reB, strH, strI, strG, u7E, (nA5 == null || (strC = nA5.c()) == null) ? "0" : strC);
    }
}
