package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0470t3 implements InterfaceC0195d1 {
    private final U3 a;
    private final C0430qd b;
    private final IronSource.AD_UNIT c;

    /* JADX INFO: renamed from: com.ironsource.t3$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C0470t3(U3 adFormatConfigurations, C0430qd c0430qd, IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormatConfigurations;
        this.b = c0430qd;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC0195d1
    public InterfaceC0307j9 a(InterfaceC0362md providerName) {
        NetworkSettings networkSettingsB;
        Md mdF;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        C0430qd c0430qd = this.b;
        if (c0430qd == null || (networkSettingsB = c0430qd.b(providerName.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            V2 v2C = this.a.c();
            if (v2C != null) {
                return new C0144a3(new C0160b1(networkSettingsB, networkSettingsB.getBannerSettings(), this.c), v2C);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (mdF = this.a.f()) != null) {
                return new C0582zd(new C0160b1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.c), mdF);
            }
            return null;
        }
        B9 b9D = this.a.d();
        if (b9D != null) {
            return new E9(new C0160b1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.c), b9D);
        }
        return null;
    }
}
