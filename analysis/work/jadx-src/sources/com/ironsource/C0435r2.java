package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0435r2 {
    private final V0 a;
    private final AbstractC0501v0 b;
    private final com.ironsource.mediationsdk.e c;
    private final C0213e2 d;

    /* JADX INFO: renamed from: com.ironsource.r2$a */
    public static final class a implements Q1.d {
        final /* synthetic */ InterfaceC0452s2 b;

        a(InterfaceC0452s2 interfaceC0452s2) {
            this.b = interfaceC0452s2;
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C0435r2.this.b(auction, this.b);
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction, String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C0435r2.this.b(auction, this.b);
        }
    }

    public C0435r2(V0 adTools, AbstractC0501v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        C0402p2 c0402p2E = adUnitData.e();
        String sessionId = IronSourceUtils.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c0402p2E, sessionId));
        this.c = eVar;
        this.d = new C0213e2(adTools, eVar);
    }

    public final C0213e2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q1, InterfaceC0452s2 interfaceC0452s2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) q1.d().c())));
        if (!q1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC0452s2.a(C0569z0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.e().b().b(q1.d().c().toString());
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(q1, this.a.f()), new b(interfaceC0452s2, q1));
        }
    }

    public void a(InterfaceC0452s2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.a.e().b().a(this.b.b().d());
        a(new Q1(this.a, this.b), completionListener);
    }

    /* JADX INFO: renamed from: com.ironsource.r2$b */
    public static final class b implements S1 {
        final /* synthetic */ InterfaceC0452s2 a;
        final /* synthetic */ Q1 b;

        b(InterfaceC0452s2 interfaceC0452s2, Q1 q1) {
            this.a = interfaceC0452s2;
            this.b = q1;
        }

        @Override // com.ironsource.S1
        public void a(List<C0368n2> newWaterfall, String auctionId, C0368n2 c0368n2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.a.a(newWaterfall, this.b.c(), auctionId, c0368n2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.S1
        public void a(int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.a.a(i, str, i2, auctionFallback, j);
        }
    }

    private final void a(Q1 q1, InterfaceC0452s2 interfaceC0452s2) {
        if (!q1.f()) {
            b(q1, interfaceC0452s2);
        } else {
            q1.a(new a(interfaceC0452s2));
        }
    }

    private final com.ironsource.mediationsdk.i a(Q1 q1, int i) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.b.b().a());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(q1.d().a());
        iVar.a(q1.d().b());
        iVar.a(this.a.h());
        iVar.a(i);
        iVar.a(this.a.k());
        C0465sf c0465sfG = this.b.b().g();
        iVar.e(c0465sfG != null ? c0465sfG.b() : false);
        iVar.a(this.b.b().d());
        InterfaceC0264h2 interfaceC0264h2I = this.a.i();
        if (interfaceC0264h2I != null) {
            interfaceC0264h2I.a(iVar);
        }
        return iVar;
    }

    private final String a(String str) {
        return C0366n0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C0366n0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
