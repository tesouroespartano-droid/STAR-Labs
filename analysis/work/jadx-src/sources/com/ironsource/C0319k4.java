package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0319k4 implements InterfaceC0525w7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final Sc d;

    public C0319k4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC0525w7
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC0525w7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC0525w7
    public Sc c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC0525w7
    public String d() {
        return this.b;
    }

    public C0319k4(String controllerUrl, String cacheFolder, boolean z, Sc rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0319k4(String str, String str2, boolean z, Sc sc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new Sc(str) : sc);
    }
}
