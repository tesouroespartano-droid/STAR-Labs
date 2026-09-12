package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vg {
    public static final a c = new a(null);
    private final C0366n0 a;
    private final Lc b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vg a(V0 adTools, AbstractC0501v0 adUnitData, Lc outcomeReporter, qg waterfallInstances, F adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C0192cf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new N4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public vg(C0366n0 adTools, Lc outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.a = adTools;
        this.b = outcomeReporter;
    }

    private final void b(AbstractC0568z abstractC0568z, List<? extends AbstractC0568z> list) {
        for (AbstractC0568z abstractC0568z2 : list) {
            if (abstractC0568z2 == abstractC0568z) {
                abstractC0568z.a(true);
                return;
            }
            abstractC0568z2.a(false);
            IronLog.INTERNAL.verbose(C0366n0.a(this.a, abstractC0568z2.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(AbstractC0568z abstractC0568z);

    public final void a(AbstractC0568z instanceToShow, List<? extends AbstractC0568z> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(AbstractC0568z abstractC0568z);

    public abstract void c(AbstractC0568z abstractC0568z);

    public final void a(AbstractC0568z instance, String str, C0238fa publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance, str, publisherDataHolder);
    }
}
