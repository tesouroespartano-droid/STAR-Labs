package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC0422q5;
import com.ironsource.InterfaceC0580zb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface o extends InterfaceC0422q5<String> {

    public static final class a implements o {
        private final String a;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC0422q5
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(InterfaceC0580zb<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.a);
        }
    }

    <T> T a(InterfaceC0580zb<String, T> interfaceC0580zb);
}
