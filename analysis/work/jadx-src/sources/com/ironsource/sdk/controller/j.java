package com.ironsource.sdk.controller;

import com.ironsource.C0272ha;
import com.ironsource.C0289ia;
import com.ironsource.C0421q4;
import com.ironsource.C0441r8;
import com.ironsource.C0577z8;
import com.ironsource.Dc;
import com.ironsource.InterfaceC0255ga;
import com.ironsource.X5;
import com.ironsource.Z5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class j {
    private final String a;
    private final Z5 b;

    j(String str, Z5 z5) {
        this.a = str;
        this.b = z5;
    }

    private C0577z8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(X5.c.c) || !jSONObject.has(X5.c.b)) {
            throw new Exception(X5.a.a);
        }
        String string = jSONObject.getString(X5.c.c);
        return new C0577z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(X5.c.b));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(JSONObject jSONObject, InterfaceC0255ga interfaceC0255ga) {
        byte b;
        C0272ha c0272ha = new C0272ha(jSONObject);
        C0289ia c0289ia = new C0289ia(interfaceC0255ga);
        try {
            String strB = c0272ha.b();
            JSONObject jSONObjectC = c0272ha.c();
            C0577z8 c0577z8B = b(jSONObjectC, this.a);
            IronSourceStorageUtils.ensurePathSafety(c0577z8B, this.a);
            switch (strB.hashCode()) {
                case -2073025383:
                    if (!strB.equals(X5.b.a)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1137024519:
                    if (!strB.equals(X5.b.c)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -318115535:
                    if (!strB.equals(X5.b.e)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 537556755:
                    if (!strB.equals(X5.b.f)) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1764172231:
                    if (!strB.equals(X5.b.b)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1953259713:
                    if (!strB.equals(X5.b.d)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                this.b.a(c0577z8B, jSONObjectC.optString(X5.c.a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(c0272ha, c0289ia));
                return;
            }
            if (b == 1) {
                this.b.a(c0577z8B);
                c0289ia.b(c0272ha, a(c0272ha, c0577z8B.a()));
                return;
            }
            if (b == 2) {
                this.b.b(c0577z8B);
                c0289ia.b(c0272ha, a(c0272ha, c0577z8B.a()));
                return;
            }
            if (b == 3) {
                c0289ia.b(c0272ha, a(c0272ha, this.b.c(c0577z8B)));
                return;
            }
            if (b == 4) {
                c0289ia.b(c0272ha, a(c0272ha, this.b.d(c0577z8B)));
            } else {
                if (b != 5) {
                    return;
                }
                this.b.a(c0577z8B, jSONObjectC.optJSONObject(X5.c.g));
                c0289ia.b(c0272ha, a(c0272ha, c0577z8B.a()));
            }
        } catch (Exception e) {
            C0421q4.d().a(e);
            c0289ia.a(c0272ha, a(c0272ha, e.getMessage()));
        }
    }

    class a implements Dc {
        final /* synthetic */ C0289ia a;
        final /* synthetic */ C0272ha b;

        a(C0289ia c0289ia, C0272ha c0272ha) {
            this.a = c0289ia;
            this.b = c0272ha;
        }

        @Override // com.ironsource.Dc
        public void a(C0577z8 c0577z8) {
            try {
                C0289ia c0289ia = this.a;
                C0272ha c0272ha = this.b;
                c0289ia.b(c0272ha, j.this.a(c0272ha, c0577z8.a()));
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Dc
        public void a(C0577z8 c0577z8, C0441r8 c0441r8) {
            try {
                C0289ia c0289ia = this.a;
                C0272ha c0272ha = this.b;
                c0289ia.a(c0272ha, j.this.a(c0272ha, c0441r8.b()));
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Dc a(C0272ha c0272ha, C0289ia c0289ia) {
        return new a(c0289ia, c0272ha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C0272ha c0272ha, JSONObject jSONObject) {
        try {
            return c0272ha.e().put("result", jSONObject);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C0272ha c0272ha, long j) {
        try {
            return c0272ha.e().put("result", j);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C0272ha c0272ha, String str) {
        try {
            return c0272ha.e().put("errMsg", str);
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private C0577z8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(X5.c.d)) {
            return new C0577z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(X5.c.d)));
        }
        throw new Exception(X5.a.b);
    }
}
