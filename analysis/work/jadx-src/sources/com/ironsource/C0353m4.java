package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0353m4 implements InterfaceC0303j5<C0577z8> {
    private final InterfaceC0147a6 a;
    private final String b;
    private final A7 c;
    private final Function1<Result<? extends C0577z8>, Unit> d;
    private C0577z8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0353m4(InterfaceC0147a6 fileUrl, String destinationPath, A7 downloadManager, Function1<? super Result<? extends C0577z8>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C0577z8(c());
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Function1<Result<? extends C0577z8>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m3603boximpl(Result.m3604constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC0303j5
    public void b(C0577z8 c0577z8) {
        Intrinsics.checkNotNullParameter(c0577z8, "<set-?>");
        this.e = c0577z8;
    }

    @Override // com.ironsource.InterfaceC0303j5
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC0303j5
    public InterfaceC0147a6 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC0303j5
    public Function1<Result<? extends C0577z8>, Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0303j5
    public C0577z8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC0303j5
    public A7 l() {
        return this.c;
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 c0577z8, C0441r8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C0577z8>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m3603boximpl(Result.m3604constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
