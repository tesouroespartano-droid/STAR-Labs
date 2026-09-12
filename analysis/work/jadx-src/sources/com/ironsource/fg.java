package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(C0253g8.k, Boolean.valueOf(fg.this.b == 0));
            put(C0253g8.l, Boolean.valueOf(fg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C0253g8.m, bool);
            put(C0253g8.n, bool);
        }
    }

    fg() {
    }

    void a(String str, int i, boolean z) {
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C0253g8.m, Boolean.valueOf(z));
        this.a.put(C0253g8.n, Boolean.valueOf((this.a.get(C0253g8.l).booleanValue() || this.a.get(C0253g8.k).booleanValue()) && this.a.get(C0253g8.m).booleanValue()));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
