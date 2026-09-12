package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0193d implements InterfaceC0147a6 {
    private final Sc a;

    public C0193d(Sc folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.a = folderRootUrl;
    }

    @Override // com.ironsource.InterfaceC0147a6
    public String value() {
        return this.a.a() + "/abTestMap.json";
    }
}
