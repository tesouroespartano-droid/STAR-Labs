package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ae {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";
    protected static final String d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";
    protected static final int w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";
    protected static final boolean z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";
    private C0396od a;
    private C0430qd b;
    private U3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private N7.a i;
    private boolean j;
    private P5 k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public Ae(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = Ab.O().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f = new JSONObject();
            } else {
                this.f = new JSONObject(str3);
            }
            this.j = n();
            s();
            q();
            r();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public static a a(Ae ae) {
        return ae != null ? ae.h() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.k = new P5(jSONObject.optJSONObject(C0296ie.d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C0282i3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        Zc zcA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C0282i3 c0282i3 = new C0282i3(iOptInt, strOptString, zOptBoolean, zcA);
        if (zcA != null) {
            this.i.b(this.g, c0282i3, IronSource.AD_UNIT.BANNER);
        }
        return c0282i3;
    }

    private InterstitialPlacement e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        Zc zcA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        InterstitialPlacement interstitialPlacement = new InterstitialPlacement(iOptInt, strOptString, zOptBoolean, zcA);
        if (zcA != null) {
            this.i.b(this.g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
        }
        return interstitialPlacement;
    }

    private String l() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean m() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f, "configurations"), b());
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int iOptInt;
        try {
            iOptInt = this.f.optInt(j2, 0);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00af  */
    private void q() {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        Md md;
        String str5;
        String str6;
        JSONObject jSONObject2;
        String str7;
        B9 b9;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        V2 v2;
        JSONObject jSONObject3;
        String str14;
        V2 v3;
        Fb fb;
        boolean zOptBoolean;
        String str15;
        JSONObject jSONObjectC;
        C0402p2 c0402p2;
        JSONObject jSONObjectC2;
        C0402p2 c0402p3;
        JSONObject jSONObjectC3;
        String str16;
        C0402p2 c0402p4;
        C0402p2 c0402p5;
        try {
            JSONObject jSONObjectC4 = c(this.f, "configurations");
            JSONObject jSONObjectC5 = c(jSONObjectC4, b());
            JSONObject jSONObjectC6 = c(jSONObjectC4, "application");
            JSONObject jSONObjectC7 = c(jSONObjectC5, l());
            JSONObject jSONObjectC8 = c(jSONObjectC5, "interstitial");
            JSONObject jSONObjectC9 = c(jSONObjectC5, "banner");
            JSONObject jSONObjectC10 = c(jSONObjectC5, "nativeAd");
            JSONObject jSONObjectC11 = c(jSONObjectC6, "events");
            JSONObject jSONObjectC12 = c(jSONObjectC6, "loggers");
            JSONObject jSONObjectC13 = c(jSONObjectC6, "token");
            JSONObject jSONObjectC14 = c(jSONObjectC6, "segment");
            JSONObject jSONObjectC15 = c(jSONObjectC6, "auction");
            JSONObject jSONObjectC16 = c(jSONObjectC6, "crashReporter");
            JSONObject jSONObjectC17 = c(jSONObjectC6, "settings");
            JSONObject jSONObjectC18 = c(jSONObjectC6, "external");
            JSONObject jSONObjectC19 = c(jSONObjectC11, a1);
            if (jSONObjectC6 != null) {
                IronSourceUtils.saveBooleanToSharedPrefs(this.g, "uuidEnabled", jSONObjectC6.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectC11 != null) {
                String strOptString = jSONObjectC11.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    Ab.U().q().a(strOptString);
                    D9.i().a(strOptString);
                    Od.i().a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            H1 h1A = a(jSONObjectC11, Boolean.valueOf(jSONObjectC11.optBoolean("sendUltraEvents", false)));
            String str17 = F1;
            String str18 = "auctionTrials";
            String str19 = P1;
            String str20 = E1;
            String str21 = O1;
            String str22 = "";
            if (jSONObjectC7 != null) {
                str4 = G1;
                JSONArray jSONArrayOptJSONArray = jSONObjectC7.optJSONArray("placements");
                str3 = "placements";
                JSONObject jSONObjectC20 = c(jSONObjectC7, "events");
                str2 = "events";
                JSONObject jSONObjectD = d(jSONObjectC7, y0);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                long jOptLong = jSONObjectC7.optLong(x0, N);
                boolean zOptBoolean2 = jSONObjectD.optBoolean(z0, false);
                boolean zOptBoolean3 = jSONObjectD.optBoolean(A0, false);
                boolean zOptBoolean4 = jSONObjectC7.optBoolean(B0, true);
                int iA = a(jSONObjectC7, jSONObjectC6, "parallelLoad", 2);
                boolean zA = a(jSONObjectC7, jSONObjectC6, "bidderExclusive", true);
                int iA2 = a(jSONObjectC7, jSONObjectC6, E0, 60);
                int iA3 = a(jSONObjectC7, jSONObjectC6, "expiredDurationInMinutes", -1);
                int iA4 = a(jSONObjectC7, jSONObjectC6, s1, 3);
                boolean zA2 = a(jSONObjectC7, jSONObjectC6, "isOneFlow", false);
                JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC20, jSONObjectC11);
                H1 h1A2 = a(jSONObjectMergeJsons, Boolean.valueOf(jSONObjectMergeJsons.optBoolean("sendUltraEvents", false)));
                if (jSONObjectC15 != null) {
                    JSONObject jSONObjectC21 = c(jSONObjectC15, l());
                    jSONObject = jSONObjectC15;
                    C0402p2 c0402p6 = new C0402p2(jSONObjectC15.optString(E1, ""), jSONObjectC15.optString(str17, ""), jSONObjectC15.optString(str4, ""), jSONObjectC15.optInt(str18, 2), jSONObjectC15.optInt(str19, 15), jSONObjectC15.optLong(str21, 10000L), jSONObjectC21.optInt(I1, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL), jSONObjectC21.optInt(L1, 30000), jSONObjectC21.optInt(J1, 5000), jSONObjectC21.optInt(K1, 50), jSONObjectC21.optBoolean("isLoadWhileShow", true), jSONObjectC21.optInt(T1, 30000), jSONObjectC15.optBoolean(U1, false), jSONObjectC15.optBoolean(V1, false), jSONObjectC21.optBoolean(H1, false), jSONObjectC15.optInt(W1, 1), false, jSONObjectC15.optBoolean(R1, true), jSONObjectC21.optBoolean(S1, true));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectC21.optJSONArray(Q1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str4 = str4;
                        str18 = str18;
                        str17 = str17;
                        str21 = str21;
                        str19 = str19;
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            c0402p6.a(jSONArrayOptJSONArray2.optString(i));
                        }
                    }
                    str4 = str4;
                    str18 = str18;
                    str17 = str17;
                    str21 = str21;
                    str19 = str19;
                    c0402p5 = c0402p6;
                } else {
                    jSONObject = jSONObjectC15;
                    c0402p5 = new C0402p2();
                }
                md = new Md(iA, zA, iA2, iA3, h1A2, c0402p5, iA4, zA2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArray != null) {
                    int i3 = 0;
                    while (i3 < jSONArray.length()) {
                        JSONArray jSONArray2 = jSONArray;
                        Placement placementG = g(jSONArray2.optJSONObject(i3));
                        if (placementG != null) {
                            md.a(placementG);
                        }
                        i3++;
                        jSONArray = jSONArray2;
                    }
                }
            } else {
                str2 = "events";
                str22 = "";
                str3 = "placements";
                str20 = E1;
                str4 = G1;
                jSONObject = jSONObjectC15;
                md = null;
            }
            if (jSONObjectC8 != null) {
                String str23 = str3;
                JSONArray jSONArrayOptJSONArray3 = jSONObjectC8.optJSONArray(str23);
                str5 = str2;
                JSONObject jSONObjectC22 = c(jSONObjectC8, str5);
                JSONObject jSONObjectD2 = d(jSONObjectC8, y0);
                str3 = str23;
                JSONArray jSONArray3 = jSONArrayOptJSONArray3;
                long jOptLong2 = jSONObjectC8.optLong(x0, N);
                boolean zOptBoolean5 = jSONObjectD2.optBoolean(z0, false);
                boolean zOptBoolean6 = jSONObjectD2.optBoolean(A0, false);
                boolean zOptBoolean7 = jSONObjectC8.optBoolean(B0, true);
                int iA5 = a(jSONObjectC8, jSONObjectC6, "parallelLoad", 2);
                boolean zA3 = a(jSONObjectC8, jSONObjectC6, "bidderExclusive", false);
                int iA6 = a(jSONObjectC8, jSONObjectC6, E0, 60);
                int iA7 = a(jSONObjectC8, jSONObjectC6, s1, 3);
                boolean zA4 = a(jSONObjectC8, jSONObjectC6, "isOneFlow", false);
                H1 h1A3 = a(IronSourceUtils.mergeJsons(jSONObjectC22, jSONObjectC11), Boolean.FALSE);
                if (jSONObject != null) {
                    jSONObject2 = jSONObject;
                    JSONObject jSONObjectC23 = c(jSONObject2, "interstitial");
                    String str24 = str22;
                    str6 = str20;
                    String strOptString2 = jSONObject2.optString(str6, str24);
                    String str25 = str17;
                    String strOptString3 = jSONObject2.optString(str25, str24);
                    String str26 = str4;
                    String strOptString4 = jSONObject2.optString(str26, str24);
                    str4 = str26;
                    str22 = str24;
                    String str27 = str18;
                    int iOptInt = jSONObject2.optInt(str27, 2);
                    str18 = str27;
                    String str28 = str19;
                    str19 = str28;
                    str7 = str25;
                    str16 = str21;
                    c0402p4 = new C0402p2(strOptString2, strOptString3, strOptString4, iOptInt, jSONObject2.optInt(str28, 15), jSONObject2.optLong(str16, 10000L), jSONObjectC23.optInt(I1, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL), 0L, 0L, 0L, true, 0, jSONObject2.optBoolean(U1, false), jSONObject2.optBoolean(V1, false), true, jSONObject2.optInt(W1, 1), false, jSONObject2.optBoolean(R1, true), jSONObjectC23.optBoolean(S1, true));
                } else {
                    str7 = str17;
                    str16 = str21;
                    str6 = str20;
                    jSONObject2 = jSONObject;
                    c0402p4 = new C0402p2();
                }
                B9 b10 = new B9(iA5, zA3, iA6, h1A3, c0402p4, iA7, zA4, jOptLong2, zOptBoolean5, zOptBoolean6, zOptBoolean7);
                if (jSONArray3 != null) {
                    int i4 = 0;
                    while (i4 < jSONArray3.length()) {
                        String str29 = str16;
                        JSONArray jSONArray4 = jSONArray3;
                        InterstitialPlacement interstitialPlacementE = e(jSONArray4.optJSONObject(i4));
                        if (interstitialPlacementE != null) {
                            b10.a(interstitialPlacementE);
                        }
                        i4++;
                        jSONArray3 = jSONArray4;
                        str16 = str29;
                    }
                }
                str21 = str16;
                b9 = b10;
            } else {
                str5 = str2;
                str6 = str20;
                jSONObject2 = jSONObject;
                str7 = str17;
                jSONObjectC6 = jSONObjectC6;
                b9 = null;
            }
            if (jSONObjectC9 != null) {
                String str30 = str3;
                JSONArray jSONArrayOptJSONArray4 = jSONObjectC9.optJSONArray(str30);
                JSONObject jSONObjectC24 = c(jSONObjectC9, str5);
                JSONObject jSONObjectD3 = d(jSONObjectC9, y0);
                String str31 = str18;
                JSONArray jSONArray5 = jSONArrayOptJSONArray4;
                jSONObjectC6 = jSONObjectC6;
                String str32 = str7;
                String str33 = str6;
                str12 = str30;
                String str34 = str22;
                str10 = z0;
                long jA = a(jSONObjectC9, jSONObjectC6, F0, 10000L);
                int iA8 = a(jSONObjectC9, jSONObjectC6, s1, 3);
                int iOptInt2 = jSONObjectC9.optInt(G0, 60);
                long jOptLong3 = jSONObjectC9.optLong(Y1, 15000L);
                boolean zA5 = a(jSONObjectC9, jSONObjectC6, "isOneFlow", false);
                long jOptLong4 = jSONObjectC9.optLong(x0, N);
                boolean zOptBoolean8 = jSONObjectD3.optBoolean(str10, false);
                boolean zOptBoolean9 = jSONObjectD3.optBoolean(A0, false);
                boolean zOptBoolean10 = jSONObjectC9.optBoolean(B0, true);
                H1 h1A4 = a(IronSourceUtils.mergeJsons(jSONObjectC24, jSONObjectC11), Boolean.FALSE);
                if (jSONObject2 == null || (jSONObjectC3 = c(jSONObject2, "banner")) == null) {
                    str9 = str32;
                    str8 = str33;
                    str13 = str34;
                    str11 = str31;
                    c0402p3 = new C0402p2();
                } else {
                    str8 = str33;
                    str13 = str34;
                    String strOptString5 = jSONObject2.optString(str8, str13);
                    String strOptString6 = jSONObject2.optString(str32, str13);
                    String str35 = str4;
                    String strOptString7 = jSONObject2.optString(str35, str13);
                    int iOptInt3 = jSONObject2.optInt(str31, 2);
                    str4 = str35;
                    String str36 = str19;
                    int iOptInt4 = jSONObject2.optInt(str36, 15);
                    str9 = str32;
                    str19 = str36;
                    String str37 = str21;
                    str21 = str37;
                    str11 = str31;
                    c0402p3 = new C0402p2(strOptString5, strOptString6, strOptString7, iOptInt3, iOptInt4, jSONObject2.optLong(str37, 10000L), jSONObjectC3.optInt(I1, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL), jSONObjectC3.optInt(L1, 15000), jSONObjectC3.optInt(J1, 50), 0L, jSONObjectC3.optBoolean("isLoadWhileShow", false), 0, jSONObject2.optBoolean(U1, false), jSONObject2.optBoolean(V1, false), jSONObjectC3.optBoolean(H1, true), jSONObject2.optInt(W1, 1), jSONObjectC3.optBoolean(X1, true), jSONObject2.optBoolean(R1, true), jSONObjectC3.optBoolean(S1, true));
                }
                V2 v4 = new V2(1, jA, false, h1A4, iOptInt2, c0402p3, iA8, zA5, jOptLong4, zOptBoolean8, zOptBoolean9, zOptBoolean10, jOptLong3);
                if (jSONArray5 != null) {
                    int i5 = 0;
                    while (i5 < jSONArray5.length()) {
                        JSONArray jSONArray6 = jSONArray5;
                        C0282i3 c0282i3D = d(jSONArray6.optJSONObject(i5));
                        if (c0282i3D != null) {
                            v4.a(c0282i3D);
                        }
                        i5++;
                        jSONArray5 = jSONArray6;
                    }
                }
                v2 = v4;
            } else {
                str8 = str6;
                str9 = str7;
                str10 = z0;
                str11 = str18;
                str12 = str3;
                str13 = str22;
                v2 = null;
            }
            if (jSONObjectC10 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectC10.optJSONArray(str12);
                String str38 = str5;
                JSONObject jSONObjectC25 = c(jSONObjectC10, str38);
                JSONObject jSONObjectD4 = d(jSONObjectC10, y0);
                String str39 = str8;
                String str40 = str9;
                String str41 = str11;
                String str42 = str19;
                String str43 = str21;
                String str44 = str4;
                str14 = str38;
                v3 = v2;
                JSONArray jSONArray7 = jSONArrayOptJSONArray5;
                jSONObject3 = jSONObjectC6;
                long jA2 = a(jSONObjectC10, jSONObject3, F0, 10000L);
                int iA9 = a(jSONObjectC10, jSONObject3, s1, 0);
                long jOptLong5 = jSONObjectC10.optLong(x0, N);
                boolean zOptBoolean11 = jSONObjectD4.optBoolean(str10, false);
                boolean zOptBoolean12 = jSONObjectD4.optBoolean(A0, false);
                boolean zOptBoolean13 = jSONObjectC10.optBoolean(B0, true);
                H1 h1A5 = a(IronSourceUtils.mergeJsons(jSONObjectC25, jSONObjectC11), Boolean.FALSE);
                if (jSONObject2 == null || (jSONObjectC2 = c(jSONObject2, "nativeAd")) == null) {
                    str8 = str39;
                    c0402p2 = new C0402p2();
                } else {
                    str8 = str39;
                    c0402p2 = new C0402p2(jSONObject2.optString(str8, str13), jSONObject2.optString(str40, str13), jSONObject2.optString(str44, str13), jSONObject2.optInt(str41, 2), jSONObject2.optInt(str42, 15), jSONObject2.optLong(str43, 10000L), jSONObjectC2.optInt(I1, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL), 0L, 0L, 0L, true, 0, jSONObject2.optBoolean(U1, false), jSONObject2.optBoolean(V1, false), true, jSONObject2.optInt(W1, 1), false, jSONObject2.optBoolean(R1, true), jSONObjectC2.optBoolean(S1, true));
                }
                fb = new Fb(1, jA2, false, h1A5, c0402p2, iA9, jOptLong5, zOptBoolean11, zOptBoolean12, zOptBoolean13);
                if (jSONArray7 != null) {
                    int i6 = 0;
                    while (i6 < jSONArray7.length()) {
                        JSONArray jSONArray8 = jSONArray7;
                        Qb qbF = f(jSONArray8.optJSONObject(i6));
                        if (qbF != null) {
                            fb.a(qbF);
                        }
                        i6++;
                        jSONArray7 = jSONArray8;
                    }
                }
            } else {
                jSONObject3 = jSONObjectC6;
                str14 = str5;
                v3 = v2;
                fb = null;
            }
            Qf qf = new Qf();
            if (jSONObjectC13 != null) {
                JSONArray jSONArrayOptJSONArray6 = jSONObjectC13.optJSONArray(Z1);
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray6.length(); i7++) {
                        qf.a(jSONArrayOptJSONArray6.optString(i7));
                    }
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectC13.optJSONObject(a2);
                if (jSONObjectOptJSONObject != null) {
                    qf.a(jSONObjectOptJSONObject);
                }
                qf.a(jSONObjectC13.optBoolean(b2, true));
            }
            Xc xc = new Xc();
            if (jSONObjectC19 != 0) {
                String strOptString8 = jSONObjectC19.optString(b1, Yc.a);
                zOptBoolean = jSONObjectC19.optBoolean(c1, true);
                xc.a(strOptString8);
            } else {
                zOptBoolean = true;
            }
            xc.b(zOptBoolean);
            if (zOptBoolean) {
                xc.b(a(jSONObjectC11, "optOut"));
                xc.a(a(jSONObjectC11, "optIn"));
                xc.a(jSONObjectC11.optBoolean("eventsCompression", false));
                xc.a(jSONObjectC11.optInt("eventsCompressionLevel", -1));
            }
            O1 o2 = new O1(jSONObjectC12.optInt("server", 3), jSONObjectC12.optInt("publisher", 3), jSONObjectC12.optInt("console", 3), jSONObjectC12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            E1 e3 = new E1();
            if (jSONObjectC16 != null) {
                e3.a(jSONObjectC16.optBoolean("enabled", false));
                e3.c(jSONObjectC16.optString("reporterURL", str13));
                e3.b(jSONObjectC16.optString("reporterKeyword", str13));
                e3.c(jSONObjectC16.optBoolean("includeANR", false));
                e3.a(jSONObjectC16.optInt("timeout", 5000));
                e3.b(jSONObjectC16.optBoolean("setIgnoreDebugger", false));
                JSONArray jSONArrayOptJSONArray7 = jSONObjectC16.optJSONArray("keysToInclude");
                if (jSONArrayOptJSONArray7 != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray7.length(); i8++) {
                        e3.a(jSONArrayOptJSONArray7.optString(i8));
                    }
                }
            }
            Be be = jSONObjectC14 != null ? new Be(jSONObjectC14.optString("name", str13), jSONObjectC14.optString(C0253g8.x, Y1.f), jSONObjectC14.optJSONObject("custom")) : null;
            K1 k3 = new K1(jSONObjectC17 != null ? jSONObjectC17 : new JSONObject());
            J1 j3 = new J1();
            if (jSONObjectC18 != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectC18.optJSONObject(p0);
                Map map = new HashMap();
                if (jSONObjectOptJSONObject2 != null) {
                    map = IronSourceUtils.parseJsonToStringMap(jSONObjectOptJSONObject2);
                }
                j3 = new J1(map);
            }
            J1 j4 = j3;
            C0553y1 c0553y1 = new C0553y1();
            if (jSONObject2 != null) {
                c0553y1 = new C0553y1(jSONObject2.optString(str8));
            }
            A1 a3 = new A1(o2, be, qf, jSONObject3.optBoolean("integration", false), e3, k3, j4, xc, c0553y1, str, h1A);
            Df dfH = h(jSONObjectC4);
            com.ironsource.mediationsdk.adquality.a aVarC = c(jSONObjectC4);
            U3.a aVar = new U3.a();
            aVar.a(md);
            aVar.a(b9);
            aVar.a(v3);
            aVar.a(fb);
            aVar.a(a3);
            aVar.b(dfH);
            aVar.a(aVarC);
            U3 u3A = aVar.a();
            this.c = u3A;
            IronLog.INTERNAL.verbose(u3A.toString());
            JSONObject jSONObjectC26 = c(jSONObjectC11, "genericParams");
            if (jSONObjectC26 != null && (jSONObjectC = c(jSONObjectC26, (str15 = str14))) != null) {
                jSONObjectC26.remove(str15);
                Map<String, String> jsonToStringMap = IronSourceUtils.parseJsonToStringMap(jSONObjectC);
                Ab.U().q().b(jsonToStringMap);
                Od.i().b(jsonToStringMap);
                D9.i().b(jsonToStringMap);
            }
            if (jSONObjectC26 != null) {
                Map<String, String> jsonToStringMap2 = IronSourceUtils.parseJsonToStringMap(jSONObjectC26);
                Ab.U().q().a(jsonToStringMap2);
                Od.i().a(jsonToStringMap2);
                D9.i().a(jsonToStringMap2);
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void r() {
        try {
            JSONObject jSONObjectC = c(this.f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, l());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.a = new C0396od();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i = 0; i < jSONArrayB.length(); i++) {
                    String strOptString = jSONArrayB.optString(i);
                    this.a.d(strOptString);
                    NetworkSettings networkSettingsB = C0430qd.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < jSONArrayB2.length(); i3++) {
                    String strOptString2 = jSONArrayB2.optString(i3);
                    this.a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = C0430qd.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i3);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i4 = 0; i4 < jSONArrayB3.length(); i4++) {
                    String strOptString3 = jSONArrayB3.optString(i4);
                    this.a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = C0430qd.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i4);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i5 = 0; i5 < jSONArrayB4.length(); i5++) {
                    String strOptString4 = jSONArrayB4.optString(i5);
                    this.a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = C0430qd.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void s() {
        try {
            this.b = C0430qd.c();
            JSONObject jSONObjectC = c(this.f, "providerSettings");
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectC2 = c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = c(jSONObjectC2, l());
                    JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectC7, jSONObjectC3);
                    if (this.b.a(next)) {
                        Ab.U().q().a(new B5(C5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = this.b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, jSONObjectMergeJsons));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, jSONObjectMergeJsons2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, jSONObjectMergeJsons3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, jSONObjectMergeJsons4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (b(strOptString4)) {
                            NetworkSettings networkSettingsB2 = this.b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectMergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), jSONObjectMergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), jSONObjectMergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), jSONObjectMergeJsons4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                            this.b.a(networkSettings);
                        } else {
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            this.b.a(networkSettings2);
                        }
                        jSONObjectC = jSONObjectC;
                        itKeys = itKeys;
                    }
                }
            }
            this.b.b();
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public X8 f() {
        return new X8(this.d, this.e);
    }

    public List<IronSource.AD_UNIT> g() {
        C0396od c0396od;
        C0396od c0396od2;
        C0396od c0396od3;
        C0396od c0396od4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (c0396od4 = this.a) != null && !c0396od4.d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (c0396od3 = this.a) != null && !c0396od3.b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.c.c() != null && (c0396od2 = this.a) != null && !c0396od2.a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.c.e() != null && (c0396od = this.a) != null && !c0396od.c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    public a h() {
        return this.h;
    }

    public JSONObject i() {
        return this.f;
    }

    public C0396od j() {
        return this.a;
    }

    public C0430qd k() {
        return this.b;
    }

    public boolean o() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean p() {
        JSONObject jSONObject = this.f;
        return (jSONObject == null || jSONObject.has("error") || this.a == null || this.b == null || this.c == null || !m()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.d);
            jSONObject.put("userId", this.e);
            jSONObject.put(n, this.f);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.j ? "adFormats" : X0.c;
    }

    private Qb f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        Zc zcA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        Qb qb = new Qb(iOptInt, strOptString, zOptBoolean, zcA);
        if (zcA != null) {
            this.i.b(this.g, qb, IronSource.AD_UNIT.NATIVE_AD);
        }
        return qb;
    }

    private Df h(JSONObject jSONObject) {
        Df df = new Df();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            df.b(jSONObjectC.optString("controllerUrl"));
        }
        return df;
    }

    public U3 c() {
        return this.c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new P9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = new JSONObject();
        this.d = "";
        this.e = "";
        this.a = new C0396od();
        this.b = C0430qd.c();
        this.c = new U3.a().a();
        this.i = Ab.O().x();
        b(this.f);
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : new JSONObject();
    }

    public P5 e() {
        return this.k;
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private Context d() {
        return this.g;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f, "configurations"), "adFormats"), str), X0.c);
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static Qf b(Ae ae) {
        if (ae != null && ae.p()) {
            return ae.c().b().k();
        }
        return Qf.a();
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        Zc zcA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        Placement placement = new Placement(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, zcA);
        if (zcA != null) {
            this.i.b(this.g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        return placement;
    }

    public Ae(Ae ae) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = ae.d();
            this.f = new JSONObject(ae.f.toString());
            this.d = ae.d;
            this.e = ae.e;
            this.j = ae.j;
            this.a = ae.j();
            this.b = ae.k();
            this.c = ae.c();
            this.h = ae.h();
            this.i = Ab.O().x();
            b(this.f);
        } catch (Exception e) {
            C0421q4.d().a(e);
            a();
        }
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                iArr5[i] = jSONArrayOptJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                iArr6[i3] = jSONArrayOptJSONArray2.optInt(i3);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                iArr7[i4] = jSONArrayOptJSONArray3.optInt(i4);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                iArr4[i5] = jSONArrayOptJSONArray4.optInt(i5);
            }
        }
        return new H1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            iArr[i] = jSONArrayOptJSONArray.optInt(i);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str, z2);
        }
        return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j : jOptLong;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v3 com.ironsource.dd) = (r7v1 com.ironsource.dd), (r7v2 com.ironsource.dd) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    private Zc a(JSONObject jSONObject) {
        EnumC0207dd enumC0207dd = null;
        if (jSONObject == null) {
            return null;
        }
        Zc.a aVar = new Zc.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(n1);
            if (!TextUtils.isEmpty(strOptString)) {
                EnumC0207dd enumC0207dd2 = EnumC0207dd.PER_DAY;
                if (enumC0207dd2.toString().equals(strOptString)) {
                    enumC0207dd = enumC0207dd2;
                } else {
                    enumC0207dd2 = EnumC0207dd.PER_HOUR;
                    if (enumC0207dd2.toString().equals(strOptString)) {
                        enumC0207dd = enumC0207dd2;
                    }
                }
            }
            int iOptInt = jSONObjectOptJSONObject.optInt(l1, 0);
            aVar.a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, enumC0207dd, iOptInt);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
        if (jSONObjectOptJSONObject2 != null) {
            int iOptInt2 = jSONObjectOptJSONObject2.optInt(m1, 0);
            aVar.a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
        }
        return aVar.a();
    }
}
