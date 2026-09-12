package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0176c implements InterfaceC0303j5<JSONObject> {
    private final InterfaceC0147a6 a;
    private final String b;
    private final A7 c;
    private final Function1<Result<? extends JSONObject>, Unit> d;
    private C0577z8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0176c(InterfaceC0147a6 fileUrl, String destinationPath, A7 downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C0577z8(c(), C0198d4.h);
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), C0198d4.h)) {
            try {
                JSONObject jSONObjectC = c(file);
                Function1<Result<? extends JSONObject>, Unit> function1I = i();
                Result.Companion companion = Result.INSTANCE;
                function1I.invoke(Result.m3603boximpl(Result.m3604constructorimpl(jSONObjectC)));
            } catch (Exception e) {
                C0421q4.d().a(e);
                Function1<Result<? extends JSONObject>, Unit> function1I2 = i();
                Result.Companion companion2 = Result.INSTANCE;
                function1I2.invoke(Result.m3603boximpl(Result.m3604constructorimpl(ResultKt.createFailure(e))));
            }
        }
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
    public Function1<Result<? extends JSONObject>, Unit> i() {
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

    private final JSONObject c(C0577z8 c0577z8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c0577z8));
    }

    @Override // com.ironsource.Dc
    public void a(C0577z8 c0577z8, C0441r8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m3603boximpl(Result.m3604constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }
}
