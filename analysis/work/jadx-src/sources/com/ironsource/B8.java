package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class B8 implements F8 {
    public static final a j = new a(null);
    private final String a;
    private final Jb b;
    private final InterfaceC0475t8 c;
    private D8 d;
    private String e;
    private String f;
    private Long g;
    private F8.a h;
    private G8 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final B8 a() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new B8(string, new Ib(string, controllerManager, null, null, 12, null), new C0492u8());
        }

        private a() {
        }
    }

    public B8(String id, Jb controller, InterfaceC0475t8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0458s8 d() {
        C0458s8 c0458s8A = new C0458s8().a(F5.x, this.f).a(F5.v, this.e).a(F5.w, C0425q8.e.NativeAd.toString()).a(F5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(c0458s8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c0458s8A;
    }

    @JvmStatic
    public static final B8 e() {
        return j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final String h() {
        return this.e;
    }

    public final String i() {
        return this.f;
    }

    @Override // com.ironsource.F8
    public F8.a b() {
        return this.h;
    }

    @Override // com.ironsource.F8
    public D8 c() {
        return this.d;
    }

    public static final class b implements Jb.a {
        b() {
        }

        @Override // com.ironsource.Jb.a
        public void a(D8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            B8.this.d = adData;
            InterfaceC0475t8 interfaceC0475t8 = B8.this.c;
            Sd.a loadAdSuccess = Sd.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = B8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
            interfaceC0475t8.a(loadAdSuccess, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Jb.a
        public void g() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Jb.a
        public void a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C0458s8 c0458s8A = B8.this.d().a(F5.A, reason);
            InterfaceC0475t8 interfaceC0475t8 = B8.this.c;
            Sd.a loadAdFailed = Sd.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = c0458s8A.a();
            Intrinsics.checkNotNullExpressionValue(mapA, "eventParams.data");
            interfaceC0475t8.a(loadAdFailed, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Jb.a
        public void a() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.F8
    public void a(F8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.F8
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        InterfaceC0475t8 interfaceC0475t8 = this.c;
        Sd.a loadAd = Sd.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        interfaceC0475t8.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(C0198d4.i.y0, String.valueOf(this.g));
        this.b.a(activity, jSONObject);
    }

    public static final class c implements G8.a {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[G8.b.values().length];
                try {
                    iArr[G8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.G8.a
        public void a(G8.b viewName) throws JSONException {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.a[viewName.ordinal()] == 1) {
                B8.this.b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Jb jb = B8.this.b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            jb.a(clickParams);
        }

        @Override // com.ironsource.G8.a
        public void a(gg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            B8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.F8
    public void a(G8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(F5.y, string);
        InterfaceC0475t8 interfaceC0475t8 = this.c;
        Sd.a registerAd = Sd.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC0475t8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.F8
    public void a() {
        G8 g8 = this.i;
        if (g8 != null) {
            g8.a((G8.a) null);
        }
        this.b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B8(String str, Jb jb, InterfaceC0475t8 interfaceC0475t8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(str, jb, interfaceC0475t8);
    }
}
