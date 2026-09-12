package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0502v1 extends AbstractC0487u3 {
    public C0502v1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC0487u3
    protected int c(B5 b5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC0487u3
    protected void f(B5 b5) {
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean h(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean j(B5 b5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0487u3
    protected boolean d(B5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iC = event.c();
        return iC == C5.FIRST_INSTANCE.b() || iC == C5.INIT_COMPLETE.b() || iC == C5.SDK_INIT_FAILED.b() || iC == C5.SDK_INIT_SUCCESS.b();
    }
}
