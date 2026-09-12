package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0419q2 extends og {
    private final V0 e;
    private final AbstractC0501v0 f;
    private final C0435r2 g;
    private final Lc h;
    private InterfaceC0452s2 i;

    /* JADX INFO: renamed from: com.ironsource.q2$a */
    public static final class a implements InterfaceC0452s2 {
        final /* synthetic */ C b;
        final /* synthetic */ pg c;

        a(C c, pg pgVar) {
            this.b = c;
            this.c = pgVar;
        }

        @Override // com.ironsource.InterfaceC0452s2
        public void a(final List<C0368n2> newWaterfall, final Map<String, G> adInstancePayloads, final String auctionId, final C0368n2 c0368n2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            V0 v0 = C0419q2.this.e;
            final C0419q2 c0419q2 = C0419q2.this;
            final C c = this.b;
            final pg pgVar = this.c;
            v0.a(new Runnable() { // from class: com.ironsource.q2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0419q2.a.a(c0419q2, c, pgVar, newWaterfall, adInstancePayloads, auctionId, c0368n2, jSONObject, jSONObject2, i, j, i2, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0419q2 this$0, C adInstanceFactory, pg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c0368n2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.InterfaceC0452s2
        public void a(final int i, final String str, final int i2, final String auctionFallback, final long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            V0 v0 = C0419q2.this.e;
            final C0419q2 c0419q2 = C0419q2.this;
            final C c = this.b;
            final pg pgVar = this.c;
            v0.a(new Runnable() { // from class: com.ironsource.q2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C0419q2.a.a(c0419q2, c, pgVar, i, str, i2, auctionFallback, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0419q2 this$0, C adInstanceFactory, pg waterfallFetcherListener, int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j);
        }

        @Override // com.ironsource.InterfaceC0452s2
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.c.a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419q2(V0 adTools, AbstractC0501v0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = adTools;
        this.f = adUnitData;
        C0435r2 c0435r2 = new C0435r2(adTools, adUnitData);
        this.g = c0435r2;
        this.h = c0435r2.b();
    }

    @Override // com.ironsource.og
    public Lc a() {
        return this.h;
    }

    @Override // com.ironsource.og
    public void a(C adInstanceFactory, pg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c, pg pgVar, List<C0368n2> list, Map<String, G> map, String str, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(C0366n0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C0317k2 c0317k2 = new C0317k2(str, jSONObject, c0368n2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.e().h().a(i2, str2);
        }
        a(jSONObject2);
        qg qgVarA = a(list, map, c0317k2, c);
        this.e.e().a(new U1(c0317k2));
        this.e.e().b().a(j, this.f.v() + ";wtf=" + qgVarA.c());
        this.e.e().b().c(qgVarA.d());
        a(qgVarA, pgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c, pg pgVar, int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose(C0366n0.a(this.e, "Auction failed (error " + i + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f.e().n();
        String strA = Y1.a.a(zN);
        C0317k2 c0317k2 = new C0317k2(strA, null, null, i2, str2);
        D5 d5E = this.e.e();
        d5E.a(new U1(c0317k2));
        d5E.b().a(j, i, str);
        if (zN) {
            a(c, pgVar, i2, str2, strA);
        } else {
            a(pgVar);
        }
    }

    private final void a(qg qgVar, pg pgVar) {
        this.e.h().a(qgVar);
        pgVar.a(qgVar);
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C0366n0.a(this.e, "loading configuration from auction response is null, using the following: " + this.f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(C0366n0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C0421q4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C0366n0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C0366n0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    private final void a(C c, pg pgVar, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C0366n0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new C0479tc(this.e, this.f).a(pgVar, i, str, str2, c);
    }

    private final void a(pg pgVar) {
        pgVar.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
