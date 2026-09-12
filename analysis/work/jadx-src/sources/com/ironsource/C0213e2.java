package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0213e2 implements Lc {
    private final V0 a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C0213e2(V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Lc
    public void a(AbstractC0568z instance, String str, C0238fa publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance.h(), str);
    }

    @Override // com.ironsource.Lc
    public void a(List<? extends AbstractC0568z> waterfallInstances, AbstractC0568z winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        C0368n2 c0368n2H = winnerInstance.h();
        this.b.a(c0368n2H, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C0368n2> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC0568z abstractC0568z : waterfallInstances) {
            arrayList.add(abstractC0568z.p());
            concurrentHashMap.put(abstractC0568z.p(), abstractC0568z.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), c0368n2H);
    }

    private final void a(C0238fa c0238fa, C0368n2 c0368n2, String str) {
        if (c0368n2 != null) {
            final ImpressionData impressionDataA = c0368n2.a(str);
            if (impressionDataA != null) {
                for (final ImpressionDataListener impressionDataListener : new HashSet(c0238fa.a())) {
                    this.a.e(new Runnable() { // from class: com.ironsource.e2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0213e2.a(this.f$0, impressionDataListener, impressionDataA);
                        }
                    });
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(C0366n0.a(this.a, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
        this.a.e().h().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0213e2 this$0, ImpressionDataListener listener, ImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        IronLog.CALLBACK.verbose(C0366n0.a(this$0.a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
