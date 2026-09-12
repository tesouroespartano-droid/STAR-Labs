package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class W1 implements X1 {
    private final C0324k9 a;
    private final com.ironsource.mediationsdk.d b;
    private final C0196d2 c;

    public W1(C0324k9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, C0196d2 c0196d2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.a = instanceInfo;
        this.b = auctionDataUtils;
        this.c = c0196d2;
    }

    @Override // com.ironsource.X1
    public void a(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C0196d2 c0196d2 = this.c;
        if (c0196d2 == null || (listEmptyList = c0196d2.b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void b(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C0196d2 c0196d2 = this.c;
        if (c0196d2 == null || (listEmptyList = c0196d2.a()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void c(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C0196d2 c0196d2 = this.c;
        if (c0196d2 == null || (listEmptyList = c0196d2.c()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }
}
