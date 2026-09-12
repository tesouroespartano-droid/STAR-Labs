package com.ironsource;

import android.util.Log;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0370n4 implements InterfaceC0508v7 {
    private final C0319k4 a;
    private final Function1<C0577z8, Object> b;
    private final A7 c;
    private final InterfaceC0454s4 d;
    private final String e;
    private C0577z8 f;
    private long g;
    private final Sc h;
    private String i;

    /* JADX INFO: renamed from: com.ironsource.n4$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends C0577z8>, Unit> {
        a(Object obj) {
            super(1, obj, C0370n4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C0370n4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends C0577z8> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n4$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, C0370n4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((C0370n4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) throws JSONException {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0370n4(C0319k4 config, Function1<? super C0577z8, ? extends Object> onFinish, A7 downloadManager, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = "n4";
        this.f = new C0577z8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new Sc(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC0508v7
    public C0577z8 c() {
        return this.f;
    }

    public final Function1<C0577z8, Object> d() {
        return this.b;
    }

    public final InterfaceC0454s4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0508v7
    public void b() {
        this.g = this.d.a();
        new C0176c(new C0193d(this.h), this.a.d() + "/temp", this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC0508v7
    public boolean a(C0577z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (Result.m3610isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            C0353m4 c0353m4A = a(string);
            if (c0353m4A.j()) {
                C0577z8 c0577z8K = c0353m4A.k();
                this.f = c0577z8K;
                this.b.invoke(c0577z8K);
                return;
            }
            c0353m4A.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.m3611isSuccessimpl(obj)) {
            C0577z8 c0577z8 = (C0577z8) (Result.m3610isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(c0577z8 != null ? c0577z8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    Intrinsics.checkNotNull(c0577z8);
                    FilesKt.copyTo$default(c0577z8, this.f, true, 0, 4, null);
                } catch (Exception e) {
                    C0421q4.d().a(e);
                    Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(c0577z8);
                this.f = c0577z8;
            }
            new InterfaceC0336l4.b(this.a.b(), this.g, this.d).a();
        } else {
            new InterfaceC0336l4.a(this.a.b()).a();
        }
        Function1<C0577z8, Object> function1 = this.b;
        if (Result.m3610isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke((C0577z8) obj);
    }

    private final C0353m4 a(String str) {
        return new C0353m4(new cg(this.h, str), this.a.d() + "/mobileController_" + str + ".html", this.c, new a(this));
    }
}
