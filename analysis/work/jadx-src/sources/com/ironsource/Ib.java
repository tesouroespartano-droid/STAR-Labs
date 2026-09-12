package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ib implements Jb {
    private final String a;
    private final com.ironsource.sdk.controller.e b;
    private final U8 c;
    private final InterfaceC0142a1 d;
    private final String e;
    private Jb.a f;

    public static final class a {
        public static final a a = new a();
        public static final String b = "nativeAd.load";
        public static final String c = "nativeAd.loadReport";
        public static final String d = "nativeAd.register";
        public static final String e = "nativeAd.click";
        public static final String f = "nativeAd.privacyClick";
        public static final String g = "nativeAd.visibilityChanged";
        public static final String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Ib(String id, com.ironsource.sdk.controller.e controllerManager, U8 imageLoader, InterfaceC0142a1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.a = id;
        this.b = controllerManager;
        this.c = imageLoader;
        this.d = adViewManagement;
        this.e = "Ib";
        controllerManager.a(id, d());
    }

    private final com.ironsource.sdk.controller.l.b d() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.Ib$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Cb cb) {
                Ib.a(this.f$0, cb);
            }
        };
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(com.ironsource.sdk.controller.f.b.g, a.e).put("sdkCallback", C0198d4.h.U);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Jb
    public void a(Jb.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Jb
    public Jb.a b() {
        return this.f;
    }

    @Override // com.ironsource.Jb
    public void c() {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, a.f, new JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ib this$0, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.Jb
    public void a(final Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.b.a(activity);
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, a.b, loadParams), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Ib$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Ib.a(this.f$0, activity, aVar);
            }
        });
    }

    private final void b(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle show on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Jb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ib this$0, Activity activity, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Jb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Jb.a aVarB2 = b();
            if (aVarB2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        D8.b bVarA = new D8.a(this.c, this.d).a(activity, aVar.d());
        a(bVarA, bVarA.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Ib(String str, com.ironsource.sdk.controller.e eVar, U8 u8, InterfaceC0142a1 interfaceC0142a1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        u8 = (i & 4) != 0 ? new T8(null, 1, null) : u8;
        if ((i & 8) != 0) {
            interfaceC0142a1 = C0374n8.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC0142a1, "getInstance()");
        }
        this(str, eVar, u8, interfaceC0142a1);
    }

    private final void a(D8.b bVar, final D8 d8) {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, "nativeAd.loadReport." + this.a, bVar.b()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Ib$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Ib.a(this.f$0, d8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ib this$0, D8 adData, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(D8 d8, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Jb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Jb.a aVarB2 = b();
            if (aVarB2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        Jb.a aVarB3 = b();
        if (aVarB3 != null) {
            aVarB3.a(d8);
        }
    }

    @Override // com.ironsource.Jb
    public void a() {
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, a.h, new JSONObject()), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Jb
    public void a(G8 viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.b.a(new com.ironsource.sdk.controller.f.c(str, a.d, params), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Jb
    public void a(gg viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, a.g, viewVisibilityParams.g()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Ib$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Ib.b(this.f$0, aVar);
            }
        });
    }

    @Override // com.ironsource.Jb
    public void a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.b.a(new com.ironsource.sdk.controller.f.c(this.a, a.e, clickParams), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.Ib$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Ib.a(this.f$0, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ib this$0, com.ironsource.sdk.controller.f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Jb.a aVarB = b();
            if (aVarB != null) {
                aVarB.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ib this$0, Cb msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.e)) {
            this$0.a(msg);
        }
    }

    private final void a(Cb cb) {
        if (cb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!cb.f().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + cb.f().optString("reason", "unexpected error"));
        } else {
            Jb.a aVarB = b();
            if (aVarB != null) {
                aVarB.g();
            }
        }
    }
}
