package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0543x8 {
    private static C0543x8 b;
    private N5 a;

    private C0543x8() {
    }

    private static C0543x8 a() {
        if (b == null) {
            b = new C0543x8();
        }
        return b;
    }

    public static void a(H5 h5, C0509v8 c0509v8) {
        if (h5 != null) {
            try {
                a().a = new N5(h5, c0509v8);
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(Sd.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(Sd.a aVar, Map<String, Object> map) {
        N5 n5 = a().a;
        if (n5 == null) {
            Log.d(F5.a, F5.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        n5.a(aVar.a, map);
    }
}
