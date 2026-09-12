package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0463sd {
    private final D7 a;
    private final Function0<Long> b;
    private final J7 c;
    private final Executor d;

    /* JADX INFO: renamed from: com.ironsource.sd$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {
        public static final a a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sd$b */
    public static final class b implements OutcomeReceiver<Object, Exception> {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C0463sd.this.a(error.getMessage());
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            C0463sd.this.c();
        }
    }

    public C0463sd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.getFirstSession(context);
    }

    private final void d() {
        this.a.a(new B5(C5.REGISTER_TRIGGER, (JSONObject) null));
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager measurementManagerA = C0298j0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.d, a());
            }
        } catch (Exception e) {
            a(e.getMessage());
            C0421q4.d().a(e);
        }
    }

    public C0463sd(D7 eventManager, Function0<Long> getTimeFunction, J7 serviceProvider, Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = eventManager;
        this.b = getTimeFunction;
        this.c = serviceProvider;
        this.d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C0238fa.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = this.c.i();
        String connectionType = IronSourceUtils.getConnectionType(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(P6.U0, interfaceC0576z7I.I(context)).appendQueryParameter(P6.K0, interfaceC0576z7I.y(context)).appendQueryParameter("auid", interfaceC0576z7I.d(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(P6.i0, String.valueOf(C0298j0.a())).appendQueryParameter("origin", "1").appendQueryParameter(F4.a.d, String.valueOf(this.b.invoke().longValue())).appendQueryParameter(C0198d4.j.x, interfaceC0576z7I.c(context)).appendQueryParameter("deviceCarrier", interfaceC0576z7I.u(context)).appendQueryParameter("connectionType", connectionType).appendQueryParameter(Z3.b, String.valueOf(StringsKt.equals(connectionType, Z3.b, true))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0463sd(D7 d7, Function0 function0, J7 j7, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        d7 = (i & 1) != 0 ? Ab.s.d().q() : d7;
        function0 = (i & 2) != 0 ? a.a : function0;
        j7 = (i & 4) != 0 ? Ab.s.d() : j7;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
        this(d7, function0, j7, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.a.a(new B5(C5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    private final OutcomeReceiver<Object, Exception> a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(new B5(C5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
