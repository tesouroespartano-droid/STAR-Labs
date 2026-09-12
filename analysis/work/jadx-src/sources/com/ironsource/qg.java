package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qg {
    private final List<AbstractC0568z> a;

    /* JADX WARN: Multi-variable type inference failed */
    public qg(List<? extends AbstractC0568z> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.a = instances;
    }

    public final List<AbstractC0568z> a() {
        return this.a;
    }

    public final List<AbstractC0568z> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0568z abstractC0568z : this.a) {
            arrayList.add(a(abstractC0568z.h(), abstractC0568z.r()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg) && Intrinsics.areEqual(this.a, ((qg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.a + ")";
    }

    public final qg a(List<? extends AbstractC0568z> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new qg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ qg a(qg qgVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qgVar.a;
        }
        return qgVar.a(list);
    }

    private final String a(C0368n2 c0368n2, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c0368n2.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
