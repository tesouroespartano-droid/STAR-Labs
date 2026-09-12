package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Ra extends Yd {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(Yd sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, C0379nd.b> mapA;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C0379nd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }

    public final InterfaceC0541x6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC0541x6.a(a(adFormat, adUnitId));
    }

    public final List<C0378nc> c(LevelPlay.AdFormat adFormat) {
        Map<String, C0379nd.b> mapA;
        Set<String> setKeySet;
        List<C0378nc> listDistinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C0379nd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            if (listFlatten != null && (listDistinct = CollectionsKt.distinct(listFlatten)) != null) {
                return listDistinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final List<C0378nc> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, C0379nd.b> mapA;
        C0379nd.b bVar;
        List<String> listA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C0379nd.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(adUnitId)) == null || (listA = bVar.a()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            C0378nc c0378nc = g().e().a().get((String) it.next());
            if (c0378nc != null) {
                arrayList.add(c0378nc);
            }
        }
        return arrayList;
    }

    public final List<LevelPlayAdSize> h() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().b();
    }

    public final boolean j() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean k() {
        return g().a().b().d();
    }

    public final C0172bd b(C0309jb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C0172bd(tools, g().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C0449s.d dVarB;
        Long lD;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C0449s c0449s = g().a().a().get(adFormat);
        long jLongValue = (c0449s == null || (dVarB = c0449s.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final Qa.a a(String adUnitId) {
        long jD;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        U2 u2C = g().a().c();
        U2.b bVar = u2C.a().get(adUnitId);
        int iC = bVar != null ? bVar.c() : u2C.b().c();
        boolean zE = bVar != null ? bVar.e() : u2C.b().e();
        if (bVar != null) {
            jD = bVar.d();
        } else {
            jD = u2C.b().d();
        }
        return new Qa.a(zE, iC, jD);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, C0379nd.b> mapA;
        Set<String> setKeySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C0379nd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (list = CollectionsKt.toList(setKeySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final C0467t0 a(C0309jb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C0467t0(tools, g().a().a());
    }

    private final InterfaceC0541x6.c a(LevelPlay.AdFormat adFormat, String str) {
        C0449s.d dVarB;
        C0328kd c0328kdG;
        Map<String, C0449s.d> mapA;
        C0449s.d dVar;
        C0328kd c0328kdG2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C0449s c0449s = g().a().a().get(adFormat);
        InterfaceC0541x6.c cVarA = null;
        InterfaceC0541x6.c cVarA2 = (c0449s == null || (mapA = c0449s.a()) == null || (dVar = mapA.get(str)) == null || (c0328kdG2 = dVar.g()) == null) ? null : c0328kdG2.a();
        if (c0449s != null && (dVarB = c0449s.b()) != null && (c0328kdG = dVarB.g()) != null) {
            cVarA = c0328kdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        if (z) {
            return InterfaceC0541x6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC0541x6.c.SINGLE;
    }

    public final Placement c(LevelPlay.AdFormat adFormat, String str) {
        Placement placementA;
        InterstitialPlacement interstitialPlacementA;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            Md mdF = d().c().f();
            if (mdF == null || (placementA = mdF.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(placementA, "getRewardedVideoPlacement(placementName)");
            return new Placement(placementA.getPlacementId(), placementA.getPlacementName(), placementA.isDefault(), placementA.getRewardName(), placementA.getRewardAmount(), placementA.getPlacementAvailabilitySettings());
        }
        if (i == 2) {
            B9 b9D = d().c().d();
            if (b9D == null || (interstitialPlacementA = b9D.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(interstitialPlacementA, "getInterstitialPlacement(placementName)");
            return new Placement(interstitialPlacementA);
        }
        if (i == 3) {
            V2 v2C = d().c().c();
            if (v2C != null) {
                C0282i3 c0282i3A = v2C.a(str);
                if (c0282i3A == null) {
                    c0282i3A = v2C.i();
                    str2 = "config.defaultBannerPlacement";
                } else {
                    str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
                }
                Intrinsics.checkNotNullExpressionValue(c0282i3A, str2);
                return new Placement(c0282i3A);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Fb fbE = d().c().e();
        if (fbE != null && str != null) {
            Qb qbA = fbE.a(str);
            if (qbA == null) {
                qbA = fbE.e();
            }
            if (qbA != null) {
                return new Placement(qbA);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final C0531wd c(C0309jb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C0449s c0449s = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new C0531wd(tools, c0449s != null ? c0449s.a() : null, c0449s != null ? c0449s.c() : null);
    }
}
