package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0174bf extends J4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174bf(AbstractC0501v0 adUnitData, qg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int b(AbstractC0568z abstractC0568z) {
        return abstractC0568z.h().l();
    }

    @Override // com.ironsource.F
    protected boolean a(AbstractC0568z instance, qg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(qg qgVar) {
        Integer num;
        List<AbstractC0568z> listB = qgVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AbstractC0568z) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((AbstractC0568z) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((AbstractC0568z) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
