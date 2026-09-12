package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public final class Id {
    /* JADX INFO: Access modifiers changed from: private */
    public static final N0 b(Md md, boolean z) {
        N0.a aVar;
        if (z) {
            aVar = N0.a.MANUAL;
        } else {
            aVar = md.k().e() ? N0.a.AUTOMATIC_LOAD_WHILE_SHOW : N0.a.AUTOMATIC_LOAD_AFTER_CLOSE;
        }
        return new N0(aVar, md.k().j(), md.k().b(), -1L);
    }
}
