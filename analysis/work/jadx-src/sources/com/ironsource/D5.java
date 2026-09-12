package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class D5 implements C0 {
    private final IronSource.AD_UNIT a;
    private final D0 b;
    private final List<C0> c;
    private final W8 d;
    private final C0377nb e;
    private final Nf f;
    private final R1 g;
    private final M h;
    private final Sf i;
    private final Jc j;

    public D5(IronSource.AD_UNIT adFormat, D0.b level, List<? extends C0> eventsInterfaces, AbstractC0487u3 abstractC0487u3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.a = adFormat;
        D0 d0 = new D0(adFormat, level, this, abstractC0487u3);
        this.b = d0;
        this.c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        W8 w8 = d0.e;
        Intrinsics.checkNotNullExpressionValue(w8, "wrapper.init");
        this.d = w8;
        C0377nb c0377nb = d0.f;
        Intrinsics.checkNotNullExpressionValue(c0377nb, "wrapper.load");
        this.e = c0377nb;
        Nf nf = d0.g;
        Intrinsics.checkNotNullExpressionValue(nf, "wrapper.token");
        this.f = nf;
        R1 r1 = d0.h;
        Intrinsics.checkNotNullExpressionValue(r1, "wrapper.auction");
        this.g = r1;
        M m = d0.i;
        Intrinsics.checkNotNullExpressionValue(m, "wrapper.adInteraction");
        this.h = m;
        Sf sf = d0.j;
        Intrinsics.checkNotNullExpressionValue(sf, "wrapper.troubleshoot");
        this.i = sf;
        Jc jc = d0.k;
        Intrinsics.checkNotNullExpressionValue(jc, "wrapper.operational");
        this.j = jc;
    }

    public final M a() {
        return this.h;
    }

    public final R1 b() {
        return this.g;
    }

    public final List<C0> c() {
        return this.c;
    }

    public final W8 d() {
        return this.d;
    }

    public final C0377nb e() {
        return this.e;
    }

    public final Jc f() {
        return this.j;
    }

    public final Nf g() {
        return this.f;
    }

    public final Sf h() {
        return this.i;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        Iterator<C0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public /* synthetic */ D5(IronSource.AD_UNIT ad_unit, D0.b bVar, List list, AbstractC0487u3 abstractC0487u3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, bVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC0487u3);
    }

    public final void a(C0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.a == IronSource.AD_UNIT.BANNER) {
                this.e.a();
            } else {
                this.e.a(false);
            }
        }
    }
}
