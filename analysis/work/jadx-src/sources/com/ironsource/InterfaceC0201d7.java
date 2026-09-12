package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0201d7 {

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    public static final class a implements InterfaceC0201d7 {
        private final InterfaceC0148a7 a;

        public a(InterfaceC0148a7 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.a = failure;
        }

        public final InterfaceC0148a7 a() {
            return this.a;
        }

        public final InterfaceC0148a7 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.a + ")";
        }

        public final a a(InterfaceC0148a7 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, InterfaceC0148a7 interfaceC0148a7, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC0148a7 = aVar.a;
            }
            return aVar.a(interfaceC0148a7);
        }

        @Override // com.ironsource.InterfaceC0201d7
        public void a(InterfaceC0218e7 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.a);
        }
    }

    default void a(InterfaceC0218e7 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
