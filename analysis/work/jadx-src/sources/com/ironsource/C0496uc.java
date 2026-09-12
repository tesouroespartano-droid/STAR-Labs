package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0496uc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496uc(Exception e) {
        super("Missing Headers", e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
