package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0458s8 {
    private HashMap<String, Object> a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.a;
    }

    public C0458s8 a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
