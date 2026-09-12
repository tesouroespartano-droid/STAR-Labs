package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class N5 {
    private static final String e = "EventsTracker";
    private InterfaceC0390o7 a;
    private H5 b;
    private H7 c;
    private ExecutorService d;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0480td c0480td = new C0480td();
                ArrayList<Pair<String, String>> arrayListD = N5.this.b.d();
                if (Wb.b.equals(N5.this.b.e())) {
                    c0480td = C0202d8.b(N5.this.b.b(), this.a, arrayListD);
                } else if (Wb.a.equals(N5.this.b.e())) {
                    c0480td = C0202d8.a(N5.this.b.b(), this.a, arrayListD);
                }
                N5.this.a("response status code: " + c0480td.a);
            } catch (Exception e) {
                C0421q4.d().a(e);
            }
        }
    }

    public N5(H5 h5, InterfaceC0390o7 interfaceC0390o7) {
        if (h5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (h5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = h5;
        this.a = interfaceC0390o7;
        this.c = h5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            a(map2, this.a.a());
            a(map2, map);
            b(this.c.a(map2));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }
}
