package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0214e3 implements InterfaceC0175bg {
    private final C0428qb a;
    private final AdSize b;

    /* JADX INFO: renamed from: com.ironsource.e3$a */
    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e3$b */
    static final class b extends Lambda implements Function0<IronSourceError> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.l();
        }
    }

    public C0214e3(C0428qb c0428qb, AdSize adSize) {
        this.a = c0428qb;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC0175bg
    public void a() {
        a(this.a != null, a.a);
        a(this.b != null, b.a);
    }
}
