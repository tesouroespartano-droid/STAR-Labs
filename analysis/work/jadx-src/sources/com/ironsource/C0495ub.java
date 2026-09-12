package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0495ub {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public C0495ub(JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.a = applicationLogger.optInt(C0512vb.a, 3);
        this.b = applicationLogger.optInt(C0512vb.b, 3);
        this.c = applicationLogger.optInt("console", 3);
        this.d = applicationLogger.optBoolean(C0512vb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}
