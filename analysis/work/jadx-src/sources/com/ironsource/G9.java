package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class G9 {
    private final boolean a;
    private String b;
    private String c;
    private boolean d;
    private C0236f8 e;
    private Map<String, String> f;
    private InterfaceC0530wc g;
    private String h;
    private boolean i;
    private boolean j;

    G9(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, InterfaceC0530wc interfaceC0530wc, C0236f8 c0236f8) {
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = z2;
        this.f = map;
        this.g = interfaceC0530wc;
        this.e = c0236f8;
        this.i = z3;
        this.j = z4;
        this.h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.b);
        map.put("instanceName", this.c);
        map.put("rewarded", Boolean.toString(this.a));
        map.put("inAppBidding", Boolean.toString(this.d));
        map.put("isOneFlow", Boolean.toString(this.i));
        map.put(C0198d4.r, String.valueOf(2));
        C0236f8 c0236f8 = this.e;
        map.put("width", c0236f8 != null ? Integer.toString(c0236f8.c()) : "0");
        C0236f8 c0236f9 = this.e;
        map.put("height", c0236f9 != null ? Integer.toString(c0236f9.a()) : "0");
        C0236f8 c0236f10 = this.e;
        map.put("label", c0236f10 != null ? c0236f10.b() : "");
        map.put(C0198d4.v, Boolean.toString(i()));
        if (this.j) {
            map.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.g);
        }
        String str = this.h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final InterfaceC0530wc b() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    public Map<String, String> d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.c;
    }

    public C0236f8 h() {
        return this.e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.a;
    }

    public void a(InterfaceC0530wc interfaceC0530wc) {
        this.g = interfaceC0530wc;
    }

    public void a(String str) {
        this.h = str;
    }
}
