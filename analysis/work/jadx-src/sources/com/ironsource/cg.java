package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cg implements InterfaceC0147a6 {
    private final Sc a;
    private final String b;

    public cg(Sc folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = folderRootUrl;
        this.b = version;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC0147a6
    public String value() {
        return this.a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
