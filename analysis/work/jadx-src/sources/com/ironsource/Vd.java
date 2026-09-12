package com.ironsource;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Vd implements Runnable {
    public static final a a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.Vd$a$a, reason: collision with other inner class name */
        public static final class C0038a extends Vd {
            final /* synthetic */ Function0<Unit> b;

            C0038a(Function0<Unit> function0) {
                this.b = function0;
            }

            @Override // com.ironsource.Vd
            public void a() {
                this.b.invoke();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vd a(Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C0038a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        C0313jf.a(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th) {
            C0421q4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C0421q4.d().a(th2);
            }
        }
    }
}
