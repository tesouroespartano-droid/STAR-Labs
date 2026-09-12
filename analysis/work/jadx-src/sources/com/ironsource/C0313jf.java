package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0313jf {
    private static final Map<IronSource.AD_UNIT, C0400p0> a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static R0 a(AbstractC0501v0 abstractC0501v0, int i) {
        return a(abstractC0501v0).a(abstractC0501v0.b().c(), abstractC0501v0.m(), i);
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        int i = a.a[ad_unit.ordinal()];
        if (i == 1) {
            return AbstractC0487u3.e.REWARDED_VIDEO.b();
        }
        if (i == 2) {
            return AbstractC0487u3.e.INTERSTITIAL.b();
        }
        if (i != 3) {
            return i != 4 ? AbstractC0487u3.e.NOT_SUPPORTED.b() : AbstractC0487u3.e.BANNER.b();
        }
        return AbstractC0487u3.e.NATIVE_AD.b();
    }

    private static C0400p0 a(AbstractC0501v0 abstractC0501v0) {
        Map<IronSource.AD_UNIT, C0400p0> map = a;
        if (map.containsKey(abstractC0501v0.b().a())) {
            return map.get(abstractC0501v0.b().a());
        }
        C0400p0 c0400p0 = new C0400p0();
        map.put(abstractC0501v0.b().a(), c0400p0);
        return c0400p0;
    }

    /* JADX INFO: renamed from: com.ironsource.jf$b */
    public static class b {
        private final IronSource.AD_UNIT a;

        public b(IronSource.AD_UNIT ad_unit) {
            this.a = ad_unit;
        }

        private String b() {
            IronSource.AD_UNIT ad_unit = this.a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        public String a(String str, String str2) {
            String str3 = b() + (TextUtils.isEmpty(str2) ? "" : " - " + str2);
            return TextUtils.isEmpty(str) ? str3 : str3 + " - " + str;
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    public static b a(IronSource.AD_UNIT ad_unit) {
        return new b(ad_unit);
    }

    public static IronSourceSegment a() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(C5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(C5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(C5 c5, JSONObject jSONObject) {
        Ab.U().q().a(new B5(c5, C0169ba.a(IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }
}
