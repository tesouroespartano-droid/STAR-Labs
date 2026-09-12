package com.ironsource;

import android.os.Handler;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0364mf {
    private final c a;
    private final d b;
    private final b c;

    /* JADX INFO: renamed from: com.ironsource.mf$b */
    public interface b {
        void a(double d);

        void a(C0465sf c0465sf, String str, int i, int i2);

        void d();
    }

    /* JADX INFO: renamed from: com.ironsource.mf$c */
    public interface c {
        void b();

        void b(C0465sf c0465sf);

        boolean e();
    }

    /* JADX INFO: renamed from: com.ironsource.mf$d */
    public interface d {
        void a(C0465sf c0465sf);

        boolean a();

        void c();
    }

    public /* synthetic */ C0364mf(c cVar, d dVar, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, dVar, bVar);
    }

    public final b a() {
        return this.c;
    }

    public final c b() {
        return this.a;
    }

    public final d c() {
        return this.b;
    }

    private C0364mf(c cVar, d dVar, b bVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = bVar;
    }

    /* JADX INFO: renamed from: com.ironsource.mf$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.mf$a$a, reason: collision with other inner class name */
        static final class C0064a extends Lambda implements Function0<C0516vf> {
            final /* synthetic */ TestSuiteActivity a;
            final /* synthetic */ Handler b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0064a(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.a = testSuiteActivity;
                this.b = handler;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0516vf invoke() {
                return new C0516vf(this.a, this.b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.mf$a$b */
        static final class b extends Lambda implements Function0<Cf> {
            final /* synthetic */ TestSuiteActivity a;
            final /* synthetic */ Handler b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.a = testSuiteActivity;
                this.b = handler;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cf invoke() {
                return new Cf(this.a, this.b);
            }
        }

        private static final Cf b(Lazy<Cf> lazy) {
            return lazy.getValue();
        }

        public final C0364mf a(List<? extends IronSource.AD_UNIT> maduEnabledAdUnits, TestSuiteActivity activity, Handler handler) {
            Intrinsics.checkNotNullParameter(maduEnabledAdUnits, "maduEnabledAdUnits");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Lazy lazy = LazyKt.lazy(new C0064a(activity, handler));
            Lazy lazy2 = LazyKt.lazy(new b(activity, handler));
            return new C0364mf(maduEnabledAdUnits.contains(IronSource.AD_UNIT.INTERSTITIAL) ? a(lazy) : b(lazy2), maduEnabledAdUnits.contains(IronSource.AD_UNIT.REWARDED_VIDEO) ? a(lazy) : b(lazy2), maduEnabledAdUnits.contains(IronSource.AD_UNIT.BANNER) ? a(lazy) : b(lazy2), null);
        }

        private static final C0516vf a(Lazy<C0516vf> lazy) {
            return lazy.getValue();
        }
    }
}
