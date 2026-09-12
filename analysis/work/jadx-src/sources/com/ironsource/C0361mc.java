package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0361mc implements InterfaceC0362md {
    private final String a;

    /* JADX INFO: renamed from: com.ironsource.mc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C0361mc(String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC0362md
    public String value() {
        if (this.a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.a, "0") || Intrinsics.areEqual(this.a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.a;
    }
}
