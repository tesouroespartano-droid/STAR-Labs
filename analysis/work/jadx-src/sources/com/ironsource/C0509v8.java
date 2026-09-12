package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0509v8 implements InterfaceC0390o7 {
    private static Map<String, Object> a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.v8$a */
    public static class a {
        String a;
        String b;
        String c;
        Context d;
        String e;

        a a(String str) {
            this.b = str;
            return this;
        }

        a b(String str) {
            this.c = str;
            return this;
        }

        a c(String str) {
            this.a = str;
            return this;
        }

        a d(String str) {
            this.e = str;
            return this;
        }

        a a(Context context) {
            this.d = context;
            return this;
        }

        public C0509v8 a() {
            return new C0509v8(this);
        }
    }

    private C0509v8(a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(Context context) {
        a.put(F5.e, C0145a4.b(context));
        a.put(F5.f, C0145a4.d(context));
    }

    public static void b(String str) {
        a.put(F5.f, SDKUtils.encodeString(str));
    }

    private void a(a aVar) {
        Context context = aVar.d;
        C0164b5 c0164b5B = C0164b5.b(context);
        a.put(F5.j, SDKUtils.encodeString(c0164b5B.e()));
        a.put(F5.k, SDKUtils.encodeString(c0164b5B.f()));
        a.put(F5.l, Integer.valueOf(c0164b5B.a()));
        a.put(F5.m, SDKUtils.encodeString(c0164b5B.d()));
        a.put(F5.n, SDKUtils.encodeString(c0164b5B.c()));
        a.put(F5.d, SDKUtils.encodeString(context.getPackageName()));
        a.put(F5.g, SDKUtils.encodeString(aVar.b));
        a.put("sessionid", SDKUtils.encodeString(aVar.a));
        a.put(F5.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        a.put(F5.o, F5.t);
        a.put("origin", F5.q);
        if (TextUtils.isEmpty(aVar.e)) {
            return;
        }
        a.put(F5.i, SDKUtils.encodeString(aVar.e));
    }

    @Override // com.ironsource.InterfaceC0390o7
    public Map<String, Object> a() {
        return a;
    }

    public static void a(String str) {
        a.put(F5.e, SDKUtils.encodeString(str));
    }
}
