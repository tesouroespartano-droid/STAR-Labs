package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class R5 implements Ac {
    private boolean a = true;
    private String b = S5.j;

    public static final class a implements InterfaceC0269h7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC0269h7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Sa.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            L9 ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.c());
                jSONObject.put("advIdType", ironSourceAdvId.d());
            }
        }
        String strN = com.ironsource.mediationsdk.p.m().n();
        if (strN != null) {
            jSONObject.put(C0198d4.j.g, strN);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Ac
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.b, jSONObject.toString(), new a());
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Ac
    public void h(String str) {
    }

    @Override // com.ironsource.Ac
    public void a(List<IronSource.AD_UNIT> list, boolean z, U3 u3) {
        if (u3 != null) {
            A1 a1B = u3.b();
            K1 k1F = a1B != null ? a1B.f() : null;
            Intrinsics.checkNotNull(k1F);
            this.a = k1F.l();
            this.b = u3.b().f().d();
        }
    }
}
