package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C0281i2;
import com.ironsource.C0402p2;
import com.ironsource.S1;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements g {
    private final C0402p2 a;
    private final String b;

    public f(C0402p2 settings, String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = settings;
        this.b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, i auctionRequestParams, S1 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.a.a(auctionRequestParams.s());
        return auctionRequestParams.s() ? new C0281i2(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.a) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.a.n();
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(iVar);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }
}
