package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Zd implements I8, I8.a {
    private Yd a;
    private boolean b;

    @Override // com.ironsource.I8
    public Ra a() {
        Yd yd = this.a;
        if (yd != null) {
            return new Ra(yd);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public I9 b() {
        Yd yd = this.a;
        if (yd != null) {
            return new I9(yd);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.I8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.I8.a
    public void a(Yd sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = sdkConfig;
    }
}
