package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0476t9 implements InterfaceC0175bg {
    private final C0428qb a;

    /* JADX INFO: renamed from: com.ironsource.t9$a */
    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.b("Load task config is null");
        }
    }

    public C0476t9(C0428qb c0428qb) {
        this.a = c0428qb;
    }

    @Override // com.ironsource.InterfaceC0175bg
    public void a() {
        a(this.a != null, a.a);
    }
}
