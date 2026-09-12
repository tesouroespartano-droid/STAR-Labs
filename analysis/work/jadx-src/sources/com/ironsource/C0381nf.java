package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0381nf {
    public static final C0381nf a = new C0381nf();

    private C0381nf() {
    }

    public final void a(int i) throws JSONException {
        a(C5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() throws JSONException {
        a(this, C5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() throws JSONException {
        a(this, C5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() throws JSONException {
        a(this, C5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) throws JSONException {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(C5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(C0381nf c0381nf, C5 c5, Integer num, String str, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c0381nf.a(c5, num, str);
    }

    private final void a(C5 c5, Integer num, String str) throws JSONException {
        C0584zf c0584zf = C0584zf.a;
        JSONObject jSONObjectA = c0584zf.a(false);
        if (num != null) {
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        c0584zf.a(c5, jSONObjectA);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = C0584zf.a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
