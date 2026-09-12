package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static final a c = new a(null);
    private final AbstractC0501v0 a;
    private final qg b;

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.F$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0037a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ug.values().length];
                try {
                    iArr[ug.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ug.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F a(AbstractC0501v0 adUnitData, qg waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = C0037a.a[(adUnitData.d() ? ug.BIDDER_SENSITIVE : ug.DEFAULT).ordinal()];
            if (i == 1) {
                return new C0521w3(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.q() ? new C0174bf(adUnitData, waterfallInstances) : new J4(adUnitData, waterfallInstances);
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    public static final class b {
        private final List<AbstractC0568z> a = new ArrayList();
        private final List<AbstractC0568z> b = new ArrayList();
        private final List<AbstractC0568z> c = new ArrayList();
        private boolean d;

        public final List<AbstractC0568z> a() {
            return this.a;
        }

        public final List<AbstractC0568z> b() {
            return this.b;
        }

        public final List<AbstractC0568z> c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.a.isEmpty() && this.c.isEmpty();
        }

        public final int g() {
            return this.a.size() + this.b.size() + this.c.size();
        }

        public final void a(boolean z) {
            this.d = z;
        }
    }

    public static final class c {
        private final AbstractC0568z a;
        private final List<AbstractC0568z> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC0568z abstractC0568z, List<? extends AbstractC0568z> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.a = abstractC0568z;
            this.b = orderedInstances;
        }

        public final AbstractC0568z a() {
            return this.a;
        }

        public final List<AbstractC0568z> b() {
            return this.b;
        }

        public final AbstractC0568z c() {
            return this.a;
        }

        public final List<AbstractC0568z> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            AbstractC0568z abstractC0568z = this.a;
            return ((abstractC0568z == null ? 0 : abstractC0568z.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.a + ", orderedInstances=" + this.b + ")";
        }

        public final c a(AbstractC0568z abstractC0568z, List<? extends AbstractC0568z> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(abstractC0568z, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, AbstractC0568z abstractC0568z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC0568z = cVar.a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(abstractC0568z, list);
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC0568z) t).h().l()), Integer.valueOf(((AbstractC0568z) t2).h().l()));
        }
    }

    public F(AbstractC0501v0 adUnitData, qg waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.a = adUnitData;
        this.b = waterfallInstances;
    }

    private final List<AbstractC0568z> b() {
        return CollectionsKt.sortedWith(this.b.b(), new d());
    }

    public abstract void a(AbstractC0568z abstractC0568z, b bVar);

    protected boolean a(AbstractC0568z instance, qg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final c c() {
        Object next;
        List<AbstractC0568z> listB = b();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC0568z) next).w()) {
                return new c((AbstractC0568z) next, listB);
            }
        }
        next = null;
        return new c((AbstractC0568z) next, listB);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.a.b().a().name() + " waterfall size: " + this.b.b().size());
        b bVar = new b();
        Iterator<AbstractC0568z> it = this.b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    public final boolean a(AbstractC0568z instance) {
        Object next;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC0568z) next).v()) {
                return Intrinsics.areEqual(next, instance);
            }
        }
        next = null;
        return Intrinsics.areEqual(next, instance);
    }

    private final boolean b(AbstractC0568z abstractC0568z, b bVar) {
        if (abstractC0568z.v()) {
            IronLog.INTERNAL.verbose(abstractC0568z.d().name() + " - Instance " + abstractC0568z.q() + " is failed to load");
        } else if (abstractC0568z.w()) {
            IronLog.INTERNAL.verbose(abstractC0568z.d().name() + " - Instance " + abstractC0568z.q() + " is already loaded");
            bVar.b().add(abstractC0568z);
        } else if (abstractC0568z.x()) {
            IronLog.INTERNAL.verbose(abstractC0568z.d().name() + " - Instance " + abstractC0568z.q() + " still loading");
            bVar.c().add(abstractC0568z);
        } else if (a(abstractC0568z, this.b)) {
            IronLog.INTERNAL.verbose(abstractC0568z.d().name() + " - Instance " + abstractC0568z.q() + " is not better than already loaded instances");
        } else {
            a(abstractC0568z, bVar);
        }
        return a(bVar);
    }

    public final boolean a() {
        int i;
        List<AbstractC0568z> listB = this.b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC0568z) it.next()).w() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.a.k();
    }

    public boolean a(b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.a.k();
    }
}
