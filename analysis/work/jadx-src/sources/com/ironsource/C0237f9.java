package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0237f9 {

    /* JADX INFO: renamed from: com.ironsource.f9$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        T7.a(T7.a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        T7.a.a(callback);
    }

    public final IronSource.AD_UNIT[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = a.a[it.next().ordinal()];
            if (i == 1) {
                arrayList.add(IronSource.AD_UNIT.BANNER);
            } else if (i == 2) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            } else if (i == 3) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            }
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }

    public final IronSourceError a(C0155ae error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C0557y5.a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C0557y5.a.c();
        }
        return C0557y5.a.b();
    }

    public final void a(long j, Ae.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ab.s.d().q().a(new B5(C5.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    public final void a(C0155ae error, long j) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            mediationAdditionalData.put("reason", error.d());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ab.s.d().q().a(new B5(C5.SDK_INIT_FAILED, mediationAdditionalData));
    }
}
