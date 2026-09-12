package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0148a7 {

    /* JADX INFO: renamed from: com.ironsource.a7$a */
    public static final class a implements InterfaceC0148a7 {
        private final EnumC0184c7 a;

        public a(EnumC0184c7 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.a = strategy;
        }

        @Override // com.ironsource.InterfaceC0148a7
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC0148a7
        public EnumC0184c7 b() {
            return this.a;
        }

        public final EnumC0184c7 c() {
            return this.a;
        }
    }

    String a();

    EnumC0184c7 b();
}
