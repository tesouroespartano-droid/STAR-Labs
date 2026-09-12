package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0563yb extends Uc {
    public static final a d = new a(null);
    private static final String e = "ManualTrigger";

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C0563yb() {
        this(false, 1, null);
    }

    @Override // com.ironsource.Uc
    public String b() {
        return e;
    }

    public final void e() {
        a(true);
    }

    public final void f() {
        a(false);
    }

    public C0563yb(boolean z) {
        super(z);
    }

    public /* synthetic */ C0563yb(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
