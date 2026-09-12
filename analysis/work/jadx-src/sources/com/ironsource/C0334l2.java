package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0334l2 implements InterfaceC0351m2 {
    private final String a;
    private final InterfaceC0362md b;

    public C0334l2(String encryptedAuctionResponse, InterfaceC0362md providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC0351m2
    public Object a() {
        Object objM3604constructorimpl;
        String strC = C0388o5.b().c();
        Intrinsics.checkNotNullExpressionValue(strC, "getInstance().mediationKey");
        C0308ja c0308ja = new C0308ja(new I4(this.a, strC));
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3604constructorimpl = Result.m3604constructorimpl(c0308ja.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objM3604constructorimpl);
        if (thM3607exceptionOrNullimpl == null) {
            return C0300j2.h.a((JSONObject) objM3604constructorimpl, this.b.value());
        }
        C0421q4.d().a(thM3607exceptionOrNullimpl);
        if (thM3607exceptionOrNullimpl instanceof IllegalArgumentException) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.d())));
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.h())));
    }
}
