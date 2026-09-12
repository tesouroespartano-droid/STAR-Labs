package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0367n1 implements InterfaceC0384o1 {
    private final IronSource.AD_UNIT a;

    /* JADX INFO: renamed from: com.ironsource.n1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C0367n1(IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormat;
    }

    @Override // com.ironsource.InterfaceC0384o1
    public InterfaceC0401p1 a(InterfaceC0316k1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return new A9(eventBaseData);
        }
        if (i == 2) {
            return new Ld(eventBaseData);
        }
        if (i == 3) {
            return new S2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.a);
    }
}
