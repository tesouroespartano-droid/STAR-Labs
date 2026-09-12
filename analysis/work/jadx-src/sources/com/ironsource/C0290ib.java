package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0290ib {
    public static final C0290ib a = new C0290ib();
    private static final C0309jb b = new C0309jb();

    /* JADX INFO: renamed from: com.ironsource.ib$a */
    public static final class a implements InterfaceC0225ee {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C0320k5 c;
        final /* synthetic */ LevelPlayInitListener d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C0320k5 c0320k5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c0320k5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final Yd sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C0309jb c0309jb = C0290ib.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.a;
            final Context context = this.b;
            final C0320k5 c0320k5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c0309jb.a(new Runnable() { // from class: com.ironsource.ib$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C0290ib.a.a(levelPlayInitRequest, sdkConfig, context, c0320k5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, Yd sdkConfig, Context context, C0320k5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C0290ib.a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC0225ee
        public void a(final C0155ae error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C0309jb c0309jb = C0290ib.b;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            final C0320k5 c0320k5 = this.c;
            c0309jb.a(new Runnable() { // from class: com.ironsource.ib$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C0290ib.a.a(levelPlayInitListener, c0320k5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C0320k5 initDuration, C0155ae error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C0290ib.a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ib$b */
    static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ra a;
        final /* synthetic */ C0320k5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ra ra, C0320k5 c0320k5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = ra;
            this.b = c0320k5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C0290ib.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private C0290ib() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C0320k5 c0320k5 = new C0320k5();
        C0309jb c0309jb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        C0380ne.a.a(context, new C0259ge(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c0309jb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c0320k5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.m().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.m().a(new Va(listener));
    }

    public static /* synthetic */ void a(C0290ib c0290ib, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c0290ib.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.d(new Runnable() { // from class: com.ironsource.ib$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C0290ib.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.m().b(new Va(listener));
    }

    private final IronSourceSegment a(LevelPlaySegment levelPlaySegment) {
        IronSourceSegment ironSourceSegment = new IronSourceSegment();
        ironSourceSegment.setLevel(levelPlaySegment.getLevel());
        ironSourceSegment.setIAPTotal(levelPlaySegment.getIapTotal());
        ironSourceSegment.setIsPaying(levelPlaySegment.isPaying());
        ironSourceSegment.setUserCreationDate(levelPlaySegment.getUserCreationDate());
        ironSourceSegment.setSegmentName(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ironSourceSegment.setCustom((String) pair.getFirst(), (String) pair.getSecond());
        }
        return ironSourceSegment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, Yd yd, Context context, C0320k5 c0320k5, LevelPlayInitListener levelPlayInitListener) {
        Ab.b bVar = Ab.s;
        I8.a aVarD = bVar.a().D();
        Ra ra = new Ra(yd);
        if (ra.k()) {
            b.a(context);
        }
        L7.a aVarA = bVar.a().a();
        C0309jb c0309jb = b;
        ra.b(c0309jb).a(aVarA);
        ra.a(c0309jb).a(bVar.a().l());
        ra.c(c0309jb).a(bVar.a().v());
        C0290ib c0290ib = a;
        c0290ib.a(levelPlayInitRequest, ra);
        long jE = bVar.d().g().e();
        c0290ib.a(jE, new b(ra, c0320k5, jE, levelPlayInitListener));
        aVarD.a(ra);
        if (yd.a().e()) {
            new C0463sd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, Function0<Unit> function0) {
        if (!Ab.s.d().e().c() && j > 0) {
            b.a(function0, j);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Ra ra, C0320k5 c0320k5, long j, final LevelPlayInitListener levelPlayInitListener) {
        Ab.s.a().D().d();
        long jA = C0320k5.a(c0320k5);
        C0309jb c0309jb = b;
        c0309jb.a(jA, ra.f(), j);
        c0309jb.e(new Runnable() { // from class: com.ironsource.ib$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0290ib.a(levelPlayInitListener, ra);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Ra levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Ra ra) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && ra.d().c().f() != null) {
            Gd.a aVar = Gd.z;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            Gd gdA = aVar.a(new C0228f0(ad_unit, C0542x7.a.a(), "", null, null, null, 56, null), ra, true);
            List<C0378nc> listC = ra.c(adFormat);
            D0.b bVar = D0.b.MEDIATION;
            new C0345ld(new V0(new C0366n0(ad_unit, bVar), gdA, bVar), adFormat, listC, gdA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && ra.d().c().d() != null) {
            C0578z9.a aVar2 = C0578z9.z;
            IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
            C0578z9 c0578z9A = aVar2.a(new C0228f0(ad_unit2, C0542x7.a.a(), "", null, null, null, 56, null), ra, true);
            List<C0378nc> listC2 = ra.c(adFormat2);
            D0.b bVar2 = D0.b.MEDIATION;
            new C0345ld(new V0(new C0366n0(ad_unit2, bVar2), c0578z9A, bVar2), adFormat2, listC2, c0578z9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || ra.d().c().c() == null) {
            return;
        }
        N2 n2A = N2.z.a(new K2(), ra, true);
        List<C0378nc> listC3 = ra.c(adFormat3);
        IronSource.AD_UNIT ad_unit3 = IronSource.AD_UNIT.BANNER;
        D0.b bVar3 = D0.b.MEDIATION;
        new C0345ld(new V0(new C0366n0(ad_unit3, bVar3), n2A, bVar3), adFormat3, listC3, n2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C0320k5 c0320k5, final C0155ae c0155ae) {
        long jA = C0320k5.a(c0320k5);
        C0309jb c0309jb = b;
        c0309jb.a(c0155ae, jA);
        c0309jb.e(new Runnable() { // from class: com.ironsource.ib$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0290ib.a(c0155ae, levelPlayInitListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0155ae error, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.m().a(key, arrayList);
    }
}
