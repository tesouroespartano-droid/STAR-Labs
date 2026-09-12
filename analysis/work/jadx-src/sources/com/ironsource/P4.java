package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes2.dex */
public final class P4 implements InterfaceC0424q7 {
    private final Boolean a;

    public P4(Boolean bool) {
        this.a = bool;
    }

    @Override // com.ironsource.InterfaceC0424q7
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m3604constructorimpl(bool);
    }
}
