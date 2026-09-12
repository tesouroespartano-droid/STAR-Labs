package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 implements InterfaceC0407p7 {
    private final Boolean a;
    private final Integer b;
    private final O3 c;

    public G3(Boolean bool, Integer num, O3 o3) {
        this.a = bool;
        this.b = num;
        this.c = o3;
    }

    private final Object a(O3 o3) {
        return new H3(this.a, this.b, o3).a();
    }

    @Override // com.ironsource.InterfaceC0407p7
    public Object b() {
        O3 o3 = O3.Second;
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(a(o3));
        if (thM3607exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
        }
        Mc mc = (!Intrinsics.areEqual(this.a, Boolean.TRUE) || this.b == null) ? null : new Mc(o3.a(this.b), null, 2, null);
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m3604constructorimpl(mc);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // com.ironsource.InterfaceC0407p7
    public Object c() {
        Xe xe;
        Integer num;
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(a(this.c));
        if (thM3607exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
        }
        if (!Intrinsics.areEqual(this.a, Boolean.TRUE) || (num = this.b) == null) {
            xe = null;
        } else {
            int iIntValue = num.intValue();
            O3 o3 = this.c;
            if (o3 != null) {
                xe = new Xe(iIntValue, o3);
            } else {
                xe = null;
            }
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m3604constructorimpl(xe);
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.b;
    }

    public final O3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC0407p7
    public Object a() {
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(new P4(this.a).a());
        if (thM3607exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
        }
        Result.Companion companion2 = Result.INSTANCE;
        Boolean bool = this.a;
        return Result.m3604constructorimpl(bool != null ? new O4(bool.booleanValue()) : null);
    }

    public /* synthetic */ G3(Boolean bool, Integer num, O3 o3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : o3);
    }
}
