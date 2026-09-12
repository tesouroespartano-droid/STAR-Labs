package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0280i1 {

    /* JADX INFO: renamed from: com.ironsource.i1$a */
    public static final class a {
        public static final C0055a a = new C0055a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$a$a, reason: collision with other inner class name */
        public static final class C0055a {
            public /* synthetic */ C0055a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.j errorCode, C0333l1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(b.c, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC0280i1 b(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.d, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 c(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.i, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 d(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.b, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 e(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.h, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 f(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.e, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C0055a() {
            }

            @JvmStatic
            public final InterfaceC0280i1 a() {
                return new b(b.f, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC0280i1 a(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.g, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(boolean z) {
                if (z) {
                    return new b(b.j, new ArrayList());
                }
                return new b(b.k, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$a$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 401;
            public static final int c = 403;
            public static final int d = 404;
            public static final int e = 405;
            public static final int f = 406;
            public static final int g = 407;
            public static final int h = 408;
            public static final int i = 409;
            public static final int j = 410;
            public static final int k = 411;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC0280i1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC0280i1 b(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.b(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 c(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.c(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 d(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.d(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 e(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.e(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 f(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.f(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.a(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(boolean z) {
            return a.a(z);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.j jVar, C0333l1.k kVar) {
            return a.a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$b */
    public static final class b implements InterfaceC0280i1 {
        private final int a;
        private final List<InterfaceC0350m1> b;

        public b(int i, List<InterfaceC0350m1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.a = i;
            this.b = arrayList;
        }

        @Override // com.ironsource.InterfaceC0280i1
        public void a(InterfaceC0401p1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$c */
    public static final class c {
        public static final a a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC0280i1 a() {
                return new b(b.b, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC0280i1 b() {
                return new b(b.g, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(b.h, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(InterfaceC0350m1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.c, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.j errorCode, C0333l1.k errorReason, C0333l1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.d, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.e, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$c$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 201;
            public static final int c = 202;
            public static final int d = 203;
            public static final int e = 204;
            public static final int f = 205;
            public static final int g = 206;
            public static final int h = 207;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.a(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 b() {
            return a.b();
        }

        @JvmStatic
        public static final InterfaceC0280i1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.j jVar, C0333l1.k kVar, C0333l1.f fVar) {
            return a.a(jVar, kVar, fVar);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(InterfaceC0350m1 interfaceC0350m1) {
            return a.a(interfaceC0350m1);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.l lVar) {
            return a.a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$d */
    public static final class d {
        public static final a a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC0280i1 a() {
                return new b(b.b, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC0280i1 b(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.h, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC0280i1 a(InterfaceC0350m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC0280i1 b() {
                return new b(b.j, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.d, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.j errorCode, C0333l1.k errorReason, C0333l1.f duration, C0333l1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(C0333l1.j errorCode, C0333l1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(b.g, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC0280i1 a(InterfaceC0350m1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(b.i, CollectionsKt.mutableListOf(ext1));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$d$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 101;
            public static final int c = 102;
            public static final int d = 103;
            public static final int e = 104;
            public static final int f = 105;
            public static final int g = 109;
            public static final int h = 110;
            public static final int i = 111;
            public static final int j = 112;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC0280i1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC0280i1 b() {
            return a.b();
        }

        @JvmStatic
        public static final b c() {
            return a.c();
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.a(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 b(InterfaceC0350m1... interfaceC0350m1Arr) {
            return a.b(interfaceC0350m1Arr);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.j jVar, C0333l1.k kVar) {
            return a.a(jVar, kVar);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.j jVar, C0333l1.k kVar, C0333l1.f fVar, C0333l1.l lVar) {
            return a.a(jVar, kVar, fVar, lVar);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(InterfaceC0350m1 interfaceC0350m1) {
            return a.a(interfaceC0350m1);
        }

        @JvmStatic
        public static final InterfaceC0280i1 a(C0333l1.f fVar) {
            return a.a(fVar);
        }
    }

    void a(InterfaceC0401p1 interfaceC0401p1);
}
