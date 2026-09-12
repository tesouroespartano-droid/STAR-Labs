package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0220e9 {
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.e9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        public final boolean b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            F3 f3D = d(context);
            return f3D.d().length() > 0 && f3D.e().length() > 0;
        }

        @JvmStatic
        public final Ae c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            F3 f3D = d(context);
            if (f3D.d().length() <= 0 || f3D.e().length() <= 0) {
                f3D = null;
            }
            if (f3D == null) {
                return null;
            }
            Ae ae = new Ae(context, f3D.d(), f3D.f(), f3D.e());
            ae.a(Ae.a.CACHE);
            return ae;
        }

        @JvmStatic
        public final F3 d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(Ae.n);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new F3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @JvmStatic
    public static final boolean a(Context context) {
        return a.b(context);
    }

    @JvmStatic
    public static final Ae b(Context context) {
        return a.c(context);
    }

    @JvmStatic
    public static final F3 c(Context context) {
        return a.d(context);
    }
}
