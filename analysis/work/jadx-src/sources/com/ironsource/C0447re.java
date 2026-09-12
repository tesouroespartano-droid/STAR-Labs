package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0447re implements J8, J8.a {
    private final InterfaceC0464se a;
    private final InterfaceC0312je b;
    private final InterfaceC0454s4 c;
    private int d;
    private long e;

    /* JADX INFO: renamed from: com.ironsource.re$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public C0447re(InterfaceC0464se storage, InterfaceC0312je initResponseStorage, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, InterfaceC0464se interfaceC0464se) {
        int iB = interfaceC0464se.b(context, 0) + 1;
        interfaceC0464se.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.J8.a
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.J8
    public int c() {
        return this.d;
    }

    private final long a(Context context, InterfaceC0464se interfaceC0464se) {
        long jA = interfaceC0464se.a(context, -1L);
        if (this.b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        interfaceC0464se.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.J8
    public String b() {
        String sessionId = IronSourceUtils.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        return sessionId;
    }

    public /* synthetic */ C0447re(InterfaceC0464se interfaceC0464se, InterfaceC0312je interfaceC0312je, InterfaceC0454s4 interfaceC0454s4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0464se, (i & 2) != 0 ? new C0329ke() : interfaceC0312je, (i & 4) != 0 ? new InterfaceC0454s4.a() : interfaceC0454s4);
    }

    @Override // com.ironsource.J8
    public long a() {
        return this.e;
    }
}
