package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class Dd implements InterfaceC0175bg {
    private final C0428qb a;

    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0557y5.a.d("Load task config is null");
        }
    }

    public Dd(C0428qb c0428qb) {
        this.a = c0428qb;
    }

    @Override // com.ironsource.InterfaceC0175bg
    public void a() {
        a(this.a != null, a.a);
    }
}
