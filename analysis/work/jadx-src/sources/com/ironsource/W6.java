package com.ironsource;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class W6 {

    public static final class a implements V6.a {
        final /* synthetic */ Handler a;

        a(Handler handler) {
            this.a = handler;
        }

        @Override // com.ironsource.V6.a
        public void a(Runnable runnable, long j) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.a.postDelayed(runnable, j);
        }
    }

    public static final V6.a a(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }
}
