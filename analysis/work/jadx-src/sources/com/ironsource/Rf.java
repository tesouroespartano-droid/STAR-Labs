package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Rf implements Vc {
    private final C0366n0 a;
    private final Runnable b;
    private final long c;
    private final List<Uc> d;
    private final C0277hf e;

    /* JADX WARN: Multi-variable type inference failed */
    public Rf(C0366n0 adTools, Runnable task, long j, List<? extends Uc> pauseTriggers) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(pauseTriggers, "pauseTriggers");
        this.a = adTools;
        this.b = task;
        this.c = j;
        this.d = pauseTriggers;
        this.e = new C0277hf(adTools.a(), new Runnable() { // from class: com.ironsource.Rf$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Rf.b(this.f$0);
            }
        }, j);
        for (Uc uc : pauseTriggers) {
            uc.a(this);
            if (uc.d()) {
                a(uc.b());
            }
        }
        if (a()) {
            C0277hf.a aVarA = this.e.a();
            List<Uc> list = this.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Uc) obj).d()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long jC = ((Uc) next).c();
                do {
                    Object next2 = it.next();
                    long jC2 = ((Uc) next2).c();
                    if (jC > jC2) {
                        next = next2;
                        jC = jC2;
                    }
                } while (it.hasNext());
            }
            a(((Uc) next).b(), aVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Rf this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    @Override // com.ironsource.Vc
    public void a(final Uc pauseableTrigger) {
        Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.a.d(new Runnable() { // from class: com.ironsource.Rf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Rf.a(this.f$0, pauseableTrigger);
            }
        });
    }

    public final void c() {
        this.a.d(new Runnable() { // from class: com.ironsource.Rf$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Rf.a(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rf this$0, Uc pauseableTrigger) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.a(pauseableTrigger.b());
        if (!this$0.a() || this$0.e.e()) {
            return;
        }
        this$0.a(pauseableTrigger.b(), this$0.e.a());
    }

    @Override // com.ironsource.Vc
    public void b(final Uc pauseableTrigger) {
        Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.a.d(new Runnable() { // from class: com.ironsource.Rf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Rf.b(this.f$0, pauseableTrigger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Rf this$0, Uc pauseableTrigger) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.b(pauseableTrigger.b());
        if (this$0.a() || !this$0.e.e()) {
            return;
        }
        this$0.b(pauseableTrigger.b(), this$0.e.b());
    }

    private final void a(String str) {
        this.a.e().h().d(str);
    }

    private final void a(String str, C0277hf.a aVar) {
        this.a.e().h().a(str, this.c, aVar.c(), aVar.d());
    }

    private final void b(String str) {
        this.a.e().h().e(str);
    }

    private final void b(String str, C0277hf.a aVar) {
        this.a.e().h().b(str, this.c, aVar.c(), aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rf this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Uc> it = this$0.d.iterator();
        while (it.hasNext()) {
            it.next().a((Vc) null);
        }
        this$0.e.a();
    }

    private final void b() {
        c();
        this.b.run();
    }

    private final boolean a() {
        List<Uc> list = this.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Uc) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ Rf(C0366n0 c0366n0, Runnable runnable, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0366n0, runnable, j, (i & 8) != 0 ? new ArrayList() : list);
    }
}
