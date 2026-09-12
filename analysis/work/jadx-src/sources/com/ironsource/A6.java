package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A6 implements D6 {
    private final C0558y6 a;
    private final C0456s6 b;
    private C0456s6 c;
    private boolean d;

    public A6(C0558y6 strategy, C0456s6 currentAdUnit, C0456s6 c0456s6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c0456s6;
        this.d = z;
    }

    @Override // com.ironsource.D6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a(new C6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.D6
    public void b(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.b, adUnit)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.D6
    public void c(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.D6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.b.e();
        if (levelPlayAdInfoE != null) {
            this.a.d().b(levelPlayAdInfoE);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C0456s6 c0456s6A = this.a.b().a(false, this.a.c());
            this.c = c0456s6A;
            c0456s6A.a(this.a);
        }
    }

    @Override // com.ironsource.D6
    public void b(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show success when loaded");
        } else {
            this.a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ A6(C0558y6 c0558y6, C0456s6 c0456s6, C0456s6 c0456s7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0558y6, c0456s6, c0456s7, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show failed when loaded");
        } else {
            this.a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.D6
    public void a(C0456s6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else if (Intrinsics.areEqual(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        D6 b6;
        C0456s6 c0456s6 = this.c;
        if (c0456s6 == null) {
            C0558y6 c0558y6 = this.a;
            c0558y6.a(new C0575z6(c0558y6));
        } else {
            if ((c0456s6 != null ? c0456s6.e() : null) != null) {
                C0558y6 c0558y7 = this.a;
                C0456s6 c0456s7 = this.c;
                Intrinsics.checkNotNull(c0456s7);
                b6 = new A6(c0558y7, c0456s7, null, false, 8, null);
            } else {
                C0558y6 c0558y8 = this.a;
                C0456s6 c0456s8 = this.c;
                Intrinsics.checkNotNull(c0456s8);
                b6 = new B6(c0558y8, c0456s8, false);
            }
            this.a.a(b6);
        }
        this.a.d().a();
    }
}
