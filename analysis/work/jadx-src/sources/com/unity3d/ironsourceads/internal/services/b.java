package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.Ab;
import com.ironsource.B5;
import com.ironsource.C0254g9;
import com.ironsource.C0421q4;
import com.ironsource.C5;
import com.ironsource.EnumC0288i9;
import com.ironsource.InterfaceC0244g;
import com.ironsource.InterfaceC0261h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {
    private final InterfaceC0244g a;
    private final InterfaceC0261h b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0288i9.values().length];
            try {
                iArr[EnumC0288i9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0288i9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(InterfaceC0244g actionIntentFactory, InterfaceC0261h activityIntentFactory) {
        Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.a = actionIntentFactory;
        this.b = activityIntentFactory;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0088a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, C5.INLINE_STORE_LAUNCHED, EnumC0288i9.DIRECT_INTENT, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0088a a(Context context, C0254g9 request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            try {
                a(this, C5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
                if (TextUtils.isEmpty(request.h())) {
                    a(C5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "storeUrl is empty")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a("storeUrl is empty");
                }
                if (!(context instanceof Activity)) {
                    a(C5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a("context is not an Activity");
                }
                Intent intentA = a(request);
                if (!a(context, intentA)) {
                    a(C5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "Failed to resolve for packageManager")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a("Failed to resolve for packageManager");
                }
                int i = a.a[request.g().ordinal()];
                if (i == 1) {
                    return b((Activity) context, intentA);
                }
                if (i == 2) {
                    return a((Activity) context, intentA);
                }
                throw new NoWhenBranchMatchedException();
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C0421q4.d().a(exc);
                String str = "Failed to open inline store: " + exc.getMessage();
                IronLog.INTERNAL.error(exc.toString());
                a(C5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a(str);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C0254g9 c0254g9) throws JSONException {
        Intent intentA = this.a.a();
        intentA.setPackage(c0254g9.f());
        intentA.setData(Uri.parse(c0254g9.h()));
        JSONObject jSONObjectE = c0254g9.e();
        if (jSONObjectE != null) {
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object value = jSONObjectE.get(next);
                if (value instanceof String) {
                    intentA.putExtra(next, (String) value);
                } else if (value instanceof Boolean) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).doubleValue());
                } else {
                    intentA.putExtra(next, value.toString());
                }
            }
        }
        return intentA;
    }

    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0088a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, C5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC0288i9.APP_ACTIVITY, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0088a a(Context context, EnumC0288i9 strategy) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            a(this, C5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                a(C5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a("context is not an Activity");
            }
            int i = a.a[strategy.ordinal()];
            if (i == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, C5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.b.a;
        } catch (Exception e) {
            C0421q4.d().a(e);
            String str = "Failed to destroy inline store: " + e.getMessage();
            IronLog.INTERNAL.error(e.toString());
            a(C5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0088a.C0089a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b bVar, C5 c5, EnumC0288i9 enumC0288i9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(c5, enumC0288i9, map);
    }

    private final void a(C5 c5, EnumC0288i9 enumC0288i9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC0288i9.b());
            Ab.s.d().q().a(new B5(c5, new JSONObject(MapsKt.toMap(map))));
        } catch (Exception e) {
            C0421q4.d().a(e);
        }
    }
}
