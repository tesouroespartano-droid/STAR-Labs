package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0414pe {
    private static Boolean b;
    public static final C0414pe a = new C0414pe();
    private static EnumC0397oe c = EnumC0397oe.NOT_INIT;

    private C0414pe() {
    }

    public final synchronized EnumC0397oe a() {
        return c;
    }

    public final EnumC0397oe b() {
        Boolean bool = b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return EnumC0397oe.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(EnumC0397oe enumC0397oe) {
        Intrinsics.checkNotNullParameter(enumC0397oe, "<set-?>");
        c = enumC0397oe;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
