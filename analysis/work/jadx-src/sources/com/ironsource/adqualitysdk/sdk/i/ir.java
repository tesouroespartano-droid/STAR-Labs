package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ir {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f2592;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private b f2593;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f2594;

    public ir(String str, int i, String str2, long j) {
        this.f2594 = str;
        this.f2592 = j;
        this.f2593 = new b(i, str2);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2484() {
        return this.f2594;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m2485() throws JSONException {
        if (!TextUtils.isEmpty(this.f2594)) {
            return new JSONObject(this.f2594);
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final b m2482() {
        return this.f2593;
    }

    public static class b {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f2595;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2596;

        public b(int i, String str) {
            this.f2596 = i;
            this.f2595 = str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final int m2486() {
            return this.f2596;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final String m2487() {
            return this.f2595;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final long m2483() {
        return this.f2592;
    }
}
