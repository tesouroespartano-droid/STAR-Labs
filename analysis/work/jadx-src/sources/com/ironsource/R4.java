package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class R4 implements InterfaceC0440r7, InterfaceC0440r7.a {
    private final ConcurrentHashMap<String, O4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC0440r7
    public N3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        O4 o4 = this.a.get(identifier);
        return (o4 == null || o4.a()) ? new N3(false, null, 2, null) : new N3(true, P3.Delivery);
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public Object a(String identifier, P3 cappingType, InterfaceC0407p7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objA = cappingConfig.a();
        if (Result.m3611isSuccessimpl(objA)) {
            O4 o4 = (O4) objA;
            if (o4 != null) {
                this.a.put(identifier, o4);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(Unit.INSTANCE);
        }
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objA);
        if (thM3607exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m3604constructorimpl(Unit.INSTANCE);
    }
}
