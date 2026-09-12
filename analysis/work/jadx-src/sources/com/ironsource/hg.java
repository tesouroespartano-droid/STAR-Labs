package com.ironsource;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hg extends Uc {
    public static final a f = new a(null);
    private static final String g = "ViewVisibilityTrigger";
    private final b d;
    private final jg e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Fc {
        b() {
        }

        @Override // com.ironsource.Fc
        public void a(boolean z) {
            hg.this.a(!z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(View view) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = new b();
        this.d = bVar;
        jg jgVar = new jg(bVar);
        this.e = jgVar;
        jgVar.a(view);
        a(!jgVar.c());
    }

    @Override // com.ironsource.Uc
    public String b() {
        return g;
    }

    public final void e() {
        this.e.b();
    }
}
