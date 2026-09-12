package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 {
    private final Md a;
    private final B9 b;
    private final V2 c;
    private final Fb d;
    private final A1 e;
    private final Df f;
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {
        private Md a;
        private B9 b;
        private V2 c;
        private Fb d;
        private A1 e;
        private Df f;
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, WorkQueueKt.MASK, null);
        }

        public final a a(Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(md, b9, v2, fb, a1, df, aVar);
        }

        public final Md b() {
            return this.a;
        }

        public final B9 c() {
            return this.b;
        }

        public final V2 d() {
            return this.c;
        }

        public final Fb e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
        }

        public final A1 f() {
            return this.e;
        }

        public final Df g() {
            return this.f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            Md md = this.a;
            int iHashCode = (md == null ? 0 : md.hashCode()) * 31;
            B9 b9 = this.b;
            int iHashCode2 = (iHashCode + (b9 == null ? 0 : b9.hashCode())) * 31;
            V2 v2 = this.c;
            int iHashCode3 = (iHashCode2 + (v2 == null ? 0 : v2.hashCode())) * 31;
            Fb fb = this.d;
            int iHashCode4 = (iHashCode3 + (fb == null ? 0 : fb.hashCode())) * 31;
            A1 a1 = this.e;
            int iHashCode5 = (iHashCode4 + (a1 == null ? 0 : a1.hashCode())) * 31;
            Df df = this.f;
            int iHashCode6 = (iHashCode5 + (df == null ? 0 : df.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        public final A1 j() {
            return this.e;
        }

        public final V2 k() {
            return this.c;
        }

        public final B9 l() {
            return this.b;
        }

        public final Fb m() {
            return this.d;
        }

        public final Md n() {
            return this.a;
        }

        public final Df o() {
            return this.f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = md;
            this.b = b9;
            this.c = v2;
            this.d = fb;
            this.e = a1;
            this.f = df;
            this.g = aVar;
        }

        public static /* synthetic */ a a(a aVar, Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                md = aVar.a;
            }
            if ((i & 2) != 0) {
                b9 = aVar.b;
            }
            if ((i & 4) != 0) {
                v2 = aVar.c;
            }
            if ((i & 8) != 0) {
                fb = aVar.d;
            }
            if ((i & 16) != 0) {
                a1 = aVar.e;
            }
            if ((i & 32) != 0) {
                df = aVar.f;
            }
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            Df df2 = df;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            A1 a2 = a1;
            V2 v3 = v2;
            return aVar.a(md, b9, v3, fb, a2, df2, aVar3);
        }

        public final void b(Md md) {
            this.a = md;
        }

        public final void a(Df df) {
            this.f = df;
        }

        public final void b(B9 b9) {
            this.b = b9;
        }

        public final a a(Md md) {
            this.a = md;
            return this;
        }

        public final void b(V2 v2) {
            this.c = v2;
        }

        public final a a(B9 b9) {
            this.b = b9;
            return this;
        }

        public final void b(Fb fb) {
            this.d = fb;
        }

        public final a a(V2 v2) {
            this.c = v2;
            return this;
        }

        public final void b(A1 a1) {
            this.e = a1;
        }

        public final a a(Fb fb) {
            this.d = fb;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        public final a a(A1 a1) {
            this.e = a1;
            return this;
        }

        public final a b(Df df) {
            this.f = df;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : md, (i & 2) != 0 ? null : b9, (i & 4) != 0 ? null : v2, (i & 8) != 0 ? null : fb, (i & 16) != 0 ? null : a1, (i & 32) != 0 ? null : df, (i & 64) != 0 ? null : aVar);
        }

        public final U3 a() {
            return new U3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ U3(Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(md, b9, v2, fb, a1, df, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    public final A1 b() {
        return this.e;
    }

    public final V2 c() {
        return this.c;
    }

    public final B9 d() {
        return this.b;
    }

    public final Fb e() {
        return this.d;
    }

    public final Md f() {
        return this.a;
    }

    public final Df g() {
        return this.f;
    }

    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private U3(Md md, B9 b9, V2 v2, Fb fb, A1 a1, Df df, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = md;
        this.b = b9;
        this.c = v2;
        this.d = fb;
        this.e = a1;
        this.f = df;
        this.g = aVar;
    }
}
