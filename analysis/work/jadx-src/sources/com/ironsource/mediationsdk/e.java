package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.Ae;
import com.ironsource.C0368n2;
import com.ironsource.C0388o5;
import com.ironsource.C0402p2;
import com.ironsource.C0421q4;
import com.ironsource.S1;
import com.ironsource.Wb;
import com.ironsource.Y1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private final String a = "1";
    private final String b = "102";
    private final String c = "102";
    private final String d = "GenericNotifications";
    private f e;
    private IronSource.AD_UNIT f;
    private C0402p2 g;
    private S1 h;
    private ISBannerSize i;

    public e(f fVar) {
        this.e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, hVar, i, ironSourceSegment);
    }

    public void a(Context context, i iVar, S1 s1) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, iVar, s1));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (s1 != null) {
                s1.a(1000, e.getMessage(), 0, Y1.a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    public static class a implements Runnable {
        protected S1 a;
        protected d.a b;
        protected int c;
        protected String d;
        protected long e;
        protected int f;
        private int h;
        private final URL k;
        private final JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        protected String i = "";
        protected int j = 0;
        protected String g = a((Integer) null);

        public a(S1 s1, URL url, JSONObject jSONObject, boolean z, C0402p2 c0402p2) {
            this.a = s1;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = c0402p2.g();
            this.o = c0402p2.m();
            this.p = c0402p2.o();
            this.q = c0402p2.p();
            this.h = c0402p2.d();
            this.r = c0402p2.n();
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        protected boolean b() {
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.sendAutomationLog(str);
                        httpURLConnectionA = a(this.k, this.o);
                        a(httpURLConnectionA, this.l, this.p);
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.m, this.q);
                                httpURLConnectionA.disconnect();
                                return true;
                            } catch (JSONException e) {
                                C0421q4.d().a(e);
                                if (e.getMessage() != null && e.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.c = 1003;
                                    this.d = "Auction decryption error";
                                } else if (e.getMessage() == null || !e.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.c = 1002;
                                    this.d = "Auction parsing error";
                                } else {
                                    this.c = 1008;
                                    this.d = "Auction decompression error";
                                }
                                this.g = a(Integer.valueOf(this.c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e.getMessage());
                                httpURLConnectionA.disconnect();
                                return false;
                            }
                        }
                        this.c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.d = str2;
                        IronLog.INTERNAL.error(str2);
                        httpURLConnectionA.disconnect();
                        if (this.f < this.n - 1) {
                            a(this.o, time);
                        }
                        this.f++;
                    } catch (SocketTimeoutException e2) {
                        C0421q4.d().a(e2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e2.getMessage());
                    } catch (Throwable th) {
                        C0421q4.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                }
            } catch (Exception e3) {
                C0421q4.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = a(Integer.valueOf(this.c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            S1 s1 = this.a;
            if (s1 == null) {
                return;
            }
            a(zB, s1, new Date().getTime() - this.e);
        }

        private String a() {
            if (this.h == 2) {
                return C0388o5.b().d();
            }
            return C0388o5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String strA;
            String strEncode;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    strA = C0388o5.b().a();
                } catch (JSONException e) {
                    C0421q4.d().a(e);
                    this.i = e.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strEncode = IronSourceAES.compressAndEncrypt(strA2, string);
            } else {
                strEncode = IronSourceAES.encode(strA2, string);
            }
            if (this.h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strEncode);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strEncode);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(Wb.b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        protected JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String strA = a();
            if (this.h == 2) {
                str = "ct";
            } else {
                str = Ae.n;
            }
            String string = jSONObject.getString(str);
            if (z) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        protected void a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z) {
                    jSONObject = a(jSONObject, z2);
                }
                d.a aVarA = d.b().a(jSONObject);
                this.b = aVarA;
                this.c = aVarA.c();
                this.d = this.b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strDecode = IronSourceAES.decode(str, str2);
            if (!TextUtils.isEmpty(strDecode)) {
                return new JSONObject(strDecode);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        protected void a(boolean z, S1 s1, long j) {
            if (z) {
                s1.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private String a(Integer num) {
            return Y1.a.a(this.r, num);
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strDecryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (strDecryptAndDecompress != null) {
                return new JSONObject(strDecryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }
    }

    @Deprecated
    public e(IronSource.AD_UNIT ad_unit, C0402p2 c0402p2, S1 s1) {
        this.f = ad_unit;
        this.g = c0402p2;
        this.h = s1;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i, IronSourceSegment ironSourceSegment) {
        e eVar;
        try {
            boolean zIsEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.h, new URL(eVar.g.a(false)), eVar.a(map, list, hVar, i, zIsEncryptedResponse, ironSourceSegment), zIsEncryptedResponse, eVar.g));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C0421q4.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.h.a(1000, exc.getMessage(), 0, Y1.a.a(eVar.g.n(), 1000), 0L);
            }
        } catch (Exception e2) {
            e = e2;
            eVar = this;
        }
    }

    public void a(C0368n2 c0368n2, int i, C0368n2 c0368n3, String str) {
        Iterator<String> it = c0368n2.b().iterator();
        while (it.hasNext()) {
            C0368n2 c0368n4 = c0368n2;
            int i2 = i;
            String str2 = str;
            d.b().a("reportImpression", c0368n4.c(), d.b().a(it.next(), i2, c0368n4, "", "", str2));
            i = i2;
            c0368n2 = c0368n4;
            str = str2;
        }
        C0368n2 c0368n5 = c0368n2;
        int i3 = i;
        String str3 = str;
        if (c0368n3 != null) {
            Iterator<String> it2 = c0368n3.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i3, c0368n5, "", "102", str3));
            }
        }
    }

    public void a(C0368n2 c0368n2, int i, C0368n2 c0368n3) {
        Iterator<String> it = c0368n2.h().iterator();
        while (it.hasNext()) {
            C0368n2 c0368n4 = c0368n2;
            int i2 = i;
            d.b().a("reportLoadSuccess", c0368n4.c(), d.b().a(it.next(), i2, c0368n4, "", "", ""));
            i = i2;
            c0368n2 = c0368n4;
        }
        C0368n2 c0368n5 = c0368n2;
        int i3 = i;
        if (c0368n3 != null) {
            Iterator<String> it2 = c0368n3.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i3, c0368n5, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<y> copyOnWriteArrayList, ConcurrentHashMap<String, C0368n2> concurrentHashMap, int i, C0368n2 c0368n2, C0368n2 c0368n3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c0368n2, c0368n3);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C0368n2> concurrentHashMap, int i, C0368n2 c0368n2, C0368n2 c0368n3) {
        int iJ = c0368n3.j();
        for (String str : arrayList) {
            if (!str.equals(c0368n3.c())) {
                C0368n2 c0368n4 = concurrentHashMap.get(str);
                int iJ2 = c0368n4.j();
                String strI = c0368n4.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c0368n4.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c0368n3.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c0368n4.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c0368n4.c(), d.b().a(it.next(), i, c0368n3, strI, str2, ""));
                }
            }
        }
        if (c0368n2 != null) {
            Iterator<String> it2 = c0368n2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i, c0368n3, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i, boolean z, IronSourceSegment ironSourceSegment) throws JSONException {
        i iVar = new i(this.f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i);
        iVar.a(this.i);
        iVar.a(ironSourceSegment);
        iVar.b(z);
        return d.b().a(iVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
