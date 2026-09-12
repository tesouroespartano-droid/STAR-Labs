package com.ironsource.mediationsdk;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.Ab;
import com.ironsource.B5;
import com.ironsource.C0169ba;
import com.ironsource.C0179c2;
import com.ironsource.C0247g2;
import com.ironsource.C0368n2;
import com.ironsource.C0421q4;
import com.ironsource.C5;
import com.ironsource.InterfaceC0576z7;
import com.ironsource.P6;
import com.ironsource.P9;
import com.ironsource.V1;
import com.ironsource.W0;
import com.ironsource.Wb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();
    public static final String c = "auctionId";
    public static final String d = "armData";
    public static final String e = "larmData";
    public static final String f = "isAdUnitCapped";
    public static final String g = "settings";
    public static final String h = "waterfall";
    public static final String i = "genericParams";
    public static final String j = "configurations";
    public static final String k = "instances";
    public static final String l = "${AUCTION_LOSS}";
    public static final String m = "${AUCTION_MBR}";
    public static final String n = "${AUCTION_PRICE}";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final String p = "${INSTANCE}";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String r = "${PLACEMENT_NAME}";
    private static final String s = "adMarkup";
    private static final String t = "dynamicDemandSource";
    private static final String u = "params";
    public static final String v = "dlpl";
    public static final String w = "adUnit";
    public static final String x = "parallelLoad";
    public static final String y = "bidderExclusive";
    public static final String z = "showPriorityEnabled";
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final InterfaceC0576z7 b = Ab.U().i();

    public static class a {
        private String a;
        private List<C0368n2> b;
        private C0368n2 c;
        private JSONObject d;
        private JSONObject e;
        private int f;
        private String g;
        private V1 h;

        public a(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public C0368n2 e() {
            return this.c;
        }

        public JSONObject f() {
            return this.d;
        }

        public V1 g() {
            return this.h;
        }

        public List<C0368n2> h() {
            return this.b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v1 = this.h;
            return v1 != null ? v1.a(str) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }
    }

    static class b implements Runnable {
        private static final int d = 15000;
        private String a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a + ";" + this.b + ";" + this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                httpURLConnection.setRequestMethod(Wb.a);
                httpURLConnection.setReadTimeout(d);
                httpURLConnection.setConnectTimeout(d);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                Ab.U().q().a(new B5(responseCode == 200 || responseCode == 204 ? C5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : C5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new C0368n2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.h = new V1.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.b = new ArrayList();
        if (jSONObject.has(h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                C0368n2 c0368n2 = new C0368n2(jSONArray.getJSONObject(i2), i2, jSONObjectOptJSONObject);
                if (!c0368n2.m()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.b.add(c0368n2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String string = "";
        try {
            if (TextUtils.isEmpty(str) || !C0169ba.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return string;
        }
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return map;
    }

    private c a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : c.SECURE;
    }

    JSONObject a(i iVar) throws JSONException {
        IronSource.AD_UNIT ad_unit;
        boolean z2;
        List<String> list;
        IronSource.AD_UNIT ad_unitC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        IronSourceSegment ironSourceSegmentN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C0247g2> arrayListK = iVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            ad_unit = ad_unitC;
            z2 = zT;
            String strA = "";
            list = listL;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = iSBannerSizeF;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment = ironSourceSegmentN;
            jSONObject3.put(P6.x0, 2);
            jSONObject3.put(P6.o0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObject3.put(P6.A0, strA);
            jSONObject3.put("ts", zQ ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            ad_unitC = ad_unit;
            zT = z2 ? 1 : 0;
            listL = list;
            iSBannerSizeF = iSBannerSize;
            ironSourceSegmentN = ironSourceSegment;
        }
        ISBannerSize iSBannerSize2 = iSBannerSizeF;
        IronSourceSegment ironSourceSegment2 = ironSourceSegmentN;
        int i2 = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(P6.x0, 1);
            jSONObject4.put(P6.A0, hVarE != null ? hVarE.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (C0247g2 c0247g2 : arrayListK) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(P6.x0, c0247g2.e() ? i2 : 1);
            Map<String, Object> mapF = c0247g2.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(P6.o0, new JSONObject(mapF));
            }
            jSONObject5.put(P6.A0, hVarE != null ? hVarE.a(c0247g2.g()) : "");
            jSONObject5.put("ts", zQ ? 1 : 0);
            if (!c0247g2.h().isEmpty()) {
                jSONObject5.put(v, c0247g2.h());
            }
            jSONObject2.put(c0247g2.g(), jSONObject5);
            i2 = 2;
        }
        jSONObject.put(P6.w0, jSONObject2);
        if (iVar.v()) {
            jSONObject.put(P6.w1, 1);
        }
        if (iVar.s()) {
            jSONObject.put(P6.v1, 1);
        }
        new P9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C0179c2(W0.a(ad_unit)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(P6.y0, iO);
        jSONObjectA.put(P6.z0, a().ordinal());
        if (ironSourceSegment2 != null) {
            jSONObjectA.put(P6.i1, ironSourceSegment2.toJson());
        }
        jSONObject.put(P6.t0, jSONObjectA);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(P6.q0, iSBannerSize2.getDescription());
            jSONObject6.put(P6.s0, iSBannerSize2.getWidth());
            jSONObject6.put(P6.r0, iSBannerSize2.getHeight());
            jSONObject.put(P6.p0, jSONObject6);
        }
        jSONObject.put(P6.k0, ad_unit.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObject.put(P6.n0, iVar.u());
        }
        jSONObject.put(P6.u0, !z2 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObject.put(P6.s1, new JSONObject().put(P6.t1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(P6.s1);
            if (objRemove != null) {
                jSONObject.put(P6.s1, objRemove);
            }
        }
        if (zP) {
            jSONObject.put(P6.q1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    public String a(String str, int i2, C0368n2 c0368n2, String str2, String str3, String str4) {
        String strI = c0368n2.i();
        return a(str, c0368n2.c(), i2, b().c(c0368n2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d2 = Double.parseDouble(str);
        double d3 = Double.parseDouble(str2);
        return d3 == 0.0d ? "" : String.valueOf(Math.round((d2 / d3) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(P6.k1)) || !this.a.compareAndSet(false, true)) {
            return;
        }
        Ab.U().q().a(new B5(C5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z2, true, -1)));
    }
}
