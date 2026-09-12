package com.ironsource;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0542x7 {
    public static final C0542x7 a = new C0542x7();

    private C0542x7() {
    }

    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
