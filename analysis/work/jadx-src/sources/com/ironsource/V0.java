package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class V0 extends C0366n0 {
    private final C0366n0 g;
    private final R0 h;
    private InterfaceC0264h2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C0366n0 adTools, AbstractC0501v0 adUnitData, D0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adTools;
        R0 r0A = C0313jf.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(r0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.h = r0A;
    }

    public final void a(InterfaceC0264h2 interfaceC0264h2) {
        this.i = interfaceC0264h2;
    }

    public final void c(Vd task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C0330kf.a(C0330kf.a, task, 0L, 2, null);
    }

    public final String e(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String strC = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    public final R0 h() {
        return this.h;
    }

    public final InterfaceC0264h2 i() {
        return this.i;
    }

    public final String j() {
        return com.ironsource.mediationsdk.p.m().l();
    }

    public final IronSourceSegment k() {
        return C0313jf.a();
    }

    public final M8.a l() {
        return Ab.s.a().h();
    }

    public final BaseAdAdapter<?, ?> a(A instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(V0 adUnitTools, D0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adUnitTools.g;
        this.h = adUnitTools.h;
        this.i = adUnitTools.i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.AD_UNIT adFormat, UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long j, String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String transId = IronSourceUtils.getTransId(j, instanceName);
        Intrinsics.checkNotNullExpressionValue(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }
}
