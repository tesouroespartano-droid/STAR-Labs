package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Q1 {
    private final V0 a;
    private final AbstractC0501v0 b;
    private final Map<String, G> c;
    private final C0230f2 d;
    private final List<CallableC0555y3> e;
    private final boolean f;

    public static final class a extends Vd {
        final /* synthetic */ B3 b;
        final /* synthetic */ Q1 c;
        final /* synthetic */ B3.b d;

        a(B3 b3, Q1 q1, B3.b bVar) {
            this.b = b3;
            this.c = q1;
            this.d = bVar;
        }

        @Override // com.ironsource.Vd
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements B3.b {
        final /* synthetic */ d b;

        c(d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.B3.b
        public void a(final List<? extends C3> biddingDataList, final long j, final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            V0 v0 = Q1.this.a;
            final Q1 q1 = Q1.this;
            final d dVar = this.b;
            v0.a(new Runnable() { // from class: com.ironsource.Q1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q1, j, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.B3.b
        public void onFailure(final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            V0 v0 = Q1.this.a;
            final Q1 q1 = Q1.this;
            final d dVar = this.b;
            v0.a(new Runnable() { // from class: com.ironsource.Q1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q1, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    public interface d {
        void a(Q1 q1);

        void a(Q1 q1, String str);
    }

    public Q1(V0 adTools, AbstractC0501v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        this.c = a();
        this.d = new C0230f2(adUnitData);
        this.e = new ArrayList();
        this.f = adUnitData.e().q();
        b bVarB = b();
        C0465sf c0465sfG = adUnitData.b().g();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (c0465sfG == null || c0465sfG.a(networkSettings, this.b.b().a())) {
                AdData adDataA = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    Object objB = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof A3) {
                        this.e.add(new CallableC0555y3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (A3) objB, bVarB, networkSettings));
                    } else {
                        this.a.e().h().g(objB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else {
                    this.d.a(networkSettings);
                }
            }
        }
    }

    public final Map<String, G> c() {
        return this.c;
    }

    public final C0230f2 d() {
        return this.d;
    }

    public final List<CallableC0555y3> e() {
        return this.e;
    }

    public final boolean f() {
        return !this.e.isEmpty();
    }

    public final boolean g() {
        return this.d.d();
    }

    public final boolean h() {
        return this.f;
    }

    private final b b() {
        return new b();
    }

    private final B3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        G g = this.c.get(str);
        if (g != null) {
            return g.b();
        }
        return null;
    }

    private final Map<String, G> a() {
        List<NetworkSettings> listM = this.b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM, 10)), 16));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            G g = new G(this.a, this.b, (NetworkSettings) it.next());
            Pair pair = TuplesKt.to(g.c(), g);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final class b implements InterfaceC0572z3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC0572z3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA;
            if (Q1.this.h()) {
                adapterBaseInterfaceA = null;
                BaseAdAdapter baseAdAdapterB = Q1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = Q1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                Q1.this.a.e().g().a(Q1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.ironsource.InterfaceC0572z3
        public void a(String str) {
            Q1.this.a.e().h().g(str);
        }
    }

    public final void a(d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        B3 b3 = new B3();
        B3.b bVarB = b(biddingDataListener);
        this.a.e().g().a();
        this.a.c((Vd) new a(b3, this, bVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, List<? extends C3> list, List<String> list2, d dVar) {
        this.a.e().g().a(j);
        for (C3 c3 : list) {
            String strC = c3.c();
            Intrinsics.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (c3.a() != null) {
                this.d.a(c3);
                this.a.e().g().a(mapA, c3.e());
            } else {
                this.a.e().g().a(mapA, c3.e(), c3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.a.e().g().b(a(it.next()), j);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.b.a(str);
        if (this.f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.b.b().a())) : null);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.b.b().a(), this.b.b().b());
    }
}
