package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ie {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ik f2465;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2466;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2467;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private id f2468;

    public ie(Context context, String str, String str2) {
        this.f2466 = context.getApplicationContext();
        this.f2467 = str2;
        this.f2465 = new ik(this.f2466, str);
        this.f2468 = new id(ib.f2453, this.f2466.getPackageName(), ig.m2447(this.f2466), this.f2467);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2435(String str) {
        try {
            return this.f2465.m2475(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap<String, String> m2432(String str, int i) {
        try {
            HashMap<String, String> mapM2476 = this.f2465.m2476(str, i);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2476.keySet()) {
                String str3 = mapM2476.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2468.m2431(str3));
                    } catch (id.a unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2433(String str) {
        try {
            String strM2474 = this.f2465.m2474(str);
            if (strM2474 == null || TextUtils.isEmpty(strM2474)) {
                return strM2474;
            }
            try {
                return this.f2468.m2431(strM2474);
            } catch (id.a unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2434(String str) {
        try {
            this.f2465.m2473(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2436(String str, String str2) {
        try {
            this.f2465.m2477(str, this.f2468.m2430(str2));
        } catch (Throwable unused) {
        }
    }
}
