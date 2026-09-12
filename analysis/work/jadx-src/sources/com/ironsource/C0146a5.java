package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0146a5 {
    private static final String a = "a5";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(a, "add LAT");
                jSONObject.put(C0198d4.j.M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.y), SDKUtils.encodeString(String.valueOf(Ab.U().i().h())));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String strB = C0145a4.b(context);
            String strD = C0145a4.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.v), C0145a4.e(context));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.P), C0164b5.b(context).a(context));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            if (a(C0198d4.j.k0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.k0), interfaceC0576z7I.C(context));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(P6.Y0), Ab.U().i().J(context));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            if (a(C0198d4.j.n0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.n0), interfaceC0576z7I.h(context));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.Y), Ab.U().i().k(context));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            if (a(C0198d4.j.l0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.l0), interfaceC0576z7I.D(context));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            if (a(C0198d4.j.i0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.i0), interfaceC0576z7I.j());
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public static JSONObject c(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        C0164b5 c0164b5B = C0164b5.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = c0164b5B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c0164b5B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = c0164b5B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.m), SDKUtils.encodeString(strE));
            }
            String strF = c0164b5B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.n), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = c0164b5B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.o), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.p), String.valueOf(c0164b5B.a()));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (c0164b5B.b() != null && c0164b5B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.r), SDKUtils.encodeString(c0164b5B.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(C0198d4.j.j0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.j0), SDKUtils.encodeString(String.valueOf(interfaceC0576z7I.q(context))));
            }
            String strG = C1.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(interfaceC0576z7I.r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(interfaceC0576z7I.p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), Rc.e(context));
            jSONObject.put("mcc", Z3.b(context));
            jSONObject.put("mnc", Z3.c(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.S), Z3.f(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.R), SDKUtils.encodeString(Z3.g(context)));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString(C0198d4.j.W), SDKUtils.encodeString(C1.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), Rc.d(context));
            String strE2 = C1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(C0198d4.j.d0, SDKUtils.encodeString(String.valueOf(interfaceC0576z7I.a())));
            jSONObject.put(C0198d4.j.e0, SDKUtils.encodeString(String.valueOf(interfaceC0576z7I.m())));
            String strG2 = interfaceC0576z7I.G(context);
            if (!TextUtils.isEmpty(strG2)) {
                jSONObject.put("icc", strG2);
            }
            String strD2 = interfaceC0576z7I.d();
            if (!TextUtils.isEmpty(strD2)) {
                jSONObject.put("tz", SDKUtils.encodeString(strD2));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            a(jSONObject, C0198d4.j.H, String.valueOf(interfaceC0576z7I.k()));
            a(jSONObject, C0198d4.j.I, String.valueOf(interfaceC0576z7I.c()));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        try {
            if (a(C0198d4.j.m0)) {
                jSONObject.put(SDKUtils.encodeString(C0198d4.j.m0), interfaceC0576z7I.e(context));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
