package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0303j5<T> extends Dc {
    void b(C0577z8 c0577z8);

    String c();

    InterfaceC0147a6 d();

    Function1<Result<? extends T>, Unit> i();

    default boolean j() {
        return k().exists();
    }

    C0577z8 k();

    A7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C0421q4.d().a(e);
            Function1<Result<? extends T>, Unit> function1I = i();
            Result.Companion companion = Result.INSTANCE;
            function1I.invoke(Result.m3603boximpl(Result.m3604constructorimpl(ResultKt.createFailure(e))));
        }
    }
}
