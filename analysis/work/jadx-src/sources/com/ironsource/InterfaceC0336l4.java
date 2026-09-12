package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0336l4 {

    /* JADX INFO: renamed from: com.ironsource.l4$a */
    public static final class a implements InterfaceC0336l4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC0336l4
        public void a() {
            C0543x8.a(Sd.x, new C0458s8().a(F5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l4$b */
    public static final class b implements InterfaceC0336l4 {
        private final boolean a;
        private final long b;
        private final InterfaceC0454s4 c;

        public b(boolean z, long j, InterfaceC0454s4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC0336l4
        public void a() {
            C0458s8 c0458s8A = new C0458s8().a(F5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                c0458s8A.a(F5.B, Long.valueOf(this.c.a() - this.b));
            }
            C0543x8.a(Sd.w, c0458s8A.a());
        }

        public final InterfaceC0454s4 b() {
            return this.c;
        }
    }

    void a();
}
