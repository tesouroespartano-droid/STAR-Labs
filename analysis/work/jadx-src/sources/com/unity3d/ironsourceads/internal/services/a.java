package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C0254g9;
import com.ironsource.EnumC0288i9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0088a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0089a extends AbstractC0088a {
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0089a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0089a) && Intrinsics.areEqual(this.a, ((C0089a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0089a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.a = errorMessage;
            }

            public final C0089a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C0089a(errorMessage);
            }

            public /* synthetic */ C0089a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0089a a(C0089a c0089a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0089a.a;
                }
                return c0089a.a(str);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0088a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0088a() {
        }
    }

    static /* synthetic */ AbstractC0088a a(a aVar, Context context, EnumC0288i9 enumC0288i9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i & 2) != 0) {
            enumC0288i9 = EnumC0288i9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC0288i9);
    }

    AbstractC0088a a(Context context, C0254g9 c0254g9);

    AbstractC0088a a(Context context, EnumC0288i9 enumC0288i9);
}
