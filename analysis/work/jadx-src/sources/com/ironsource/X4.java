package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class X4 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = -1;
    private String a;
    private String b;
    private int c;
    private Map<String, String> d;
    private int e;
    private boolean f;
    private G9 g;

    public X4(String str, String str2, Map<String, String> map, InterfaceC0530wc interfaceC0530wc) {
        this.c = -1;
        this.b = str;
        this.a = str2;
        this.d = map;
        this.e = 0;
        this.f = false;
        this.g = null;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public synchronized void b(int i2) {
        this.e = i2;
    }

    public G9 c() {
        return this.g;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public Map<String, String> g() {
        return this.d;
    }

    public String h() {
        return this.b;
    }

    public InterfaceC0530wc i() {
        if (this.g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        Map<String, String> map = this.d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.d.get("rewarded"));
    }

    public boolean a(int i2) {
        return this.c == i2;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.b);
        map.put("demandSourceName", this.a);
        Map<String, String> map2 = this.d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i2) {
        this.c = i2;
    }

    public void a() {
        Map<String, String> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.d = null;
    }

    public X4(G9 g9) {
        this(g9.e(), g9.g(), g9.a(), g9.b());
        this.g = g9;
    }
}
