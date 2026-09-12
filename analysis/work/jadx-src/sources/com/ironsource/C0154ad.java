package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0154ad implements L7, L7.a {
    private final L3 a;
    private final R4 b;

    /* JADX INFO: renamed from: com.ironsource.ad$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[P3.values().length];
            try {
                iArr[P3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0154ad() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.L7
    public synchronized N3 a(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C0241fd(placementName, adFormat).a();
        N3 n3A = this.b.a(strA);
        if (n3A.d()) {
            return n3A;
        }
        return this.a.a(strA);
    }

    @Override // com.ironsource.L7.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C0241fd(placementName, adFormat).a();
        if (!this.b.a(strA).d()) {
            this.a.b(strA);
        }
    }

    public C0154ad(L3 cappingService, R4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.a = cappingService;
        this.b = deliveryHandler;
    }

    public /* synthetic */ C0154ad(L3 l3, R4 r4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new L3(null, null, null, 7, null) : l3, (i & 2) != 0 ? new R4() : r4);
    }

    @Override // com.ironsource.L7.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, P3 cappingType, InterfaceC0407p7 cappingConfig) {
        Object objA;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        String strA = new C0241fd(placementName, adFormat).a();
        int i = a.a[cappingType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objA = this.a.a(strA, cappingType, cappingConfig);
        } else {
            objA = this.b.a(strA, cappingType, cappingConfig);
        }
        return objA;
    }
}
