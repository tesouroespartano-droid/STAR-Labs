package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Nc implements InterfaceC0440r7, InterfaceC0440r7.a {
    private final InterfaceC0454s4 a;
    private final K7 b;
    private final Map<String, Mc> c;

    public Nc(InterfaceC0454s4 currentTimeProvider, K7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.a = currentTimeProvider;
        this.b = repository;
        this.c = new LinkedHashMap();
    }

    public final Map<String, Mc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.c.get(identifier) == null) {
            return;
        }
        this.b.a(this.a.a(), identifier);
    }

    private final boolean a(Mc mc, String str) {
        Long lA = this.b.a(str);
        return lA != null && this.a.a() - lA.longValue() < mc.a();
    }

    @Override // com.ironsource.InterfaceC0440r7
    public N3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Mc mc = this.c.get(identifier);
        if (mc == null) {
            return new N3(false, null, 2, null);
        }
        if (a(mc, identifier)) {
            return new N3(true, P3.Pacing);
        }
        return new N3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public Object a(String identifier, P3 cappingType, InterfaceC0407p7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objB = cappingConfig.b();
        if (Result.m3611isSuccessimpl(objB)) {
            Mc mc = (Mc) objB;
            if (mc != null) {
                this.c.put(identifier, mc);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(Unit.INSTANCE);
        }
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objB);
        if (thM3607exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m3604constructorimpl(Unit.INSTANCE);
    }
}
