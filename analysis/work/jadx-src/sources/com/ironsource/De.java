package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class De {
    private C0183c6 a;

    private final class a extends Ce {
        public a() {
        }

        @Override // com.ironsource.Ce, java.lang.Runnable
        public void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            Wc.P.a(new B5(C5.APP_ENTER_BACKGROUND, mediationAdditionalData));
        }
    }

    public final void a(InterfaceC0339l7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.a = new C0183c6(applicationLifecycleService, new a());
    }
}
