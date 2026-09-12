package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0438r5 implements B7, B7.a {
    private JSONObject a = new JSONObject();

    private final JSONObject j() {
        JSONObject jSONObjectOptJSONObject = this.a.optJSONObject(C0455s5.a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.B7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC0472t5
    public long b() {
        String strOptString = j().optString(C0489u5.c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean c() {
        return j().optBoolean(C0489u5.h, true);
    }

    @Override // com.ironsource.B7
    public JSONObject config() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean d() {
        return j().optBoolean(C0489u5.g, true);
    }

    @Override // com.ironsource.InterfaceC0472t5
    public long e() {
        String strOptString = j().optString(C0489u5.d);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean f() {
        return j().optBoolean(C0489u5.i, false);
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean g() {
        String strOptString = j().optString(C0489u5.a);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, com.ironsource.mediationsdk.metadata.a.g);
    }

    @Override // com.ironsource.InterfaceC0472t5
    public int h() {
        String strOptString = j().optString(C0489u5.b);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean i() {
        return j().optBoolean(C0489u5.e, true);
    }

    @Override // com.ironsource.InterfaceC0472t5
    public boolean a() {
        return j().optBoolean(C0489u5.f, true);
    }
}
