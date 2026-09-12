package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jg {
    private final Fc a;
    private View b;
    private boolean c;
    private final ViewTreeObserver.OnGlobalLayoutListener d;
    private final ViewTreeObserver.OnWindowFocusChangeListener e;
    private final Rect f;

    public jg(Fc onVisibilityChangeListener) {
        Intrinsics.checkNotNullParameter(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.a = onVisibilityChangeListener;
        this.d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.jg$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                jg.a(this.f$0);
            }
        };
        this.e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.jg$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                jg.a(this.f$0, z);
            }
        };
        this.f = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jg this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.d);
        }
        View view2 = this.b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.e);
        }
        this.b = null;
    }

    public final boolean c() {
        View view = this.b;
        if (view != null) {
            return kg.a(view, this.f);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jg this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.e);
    }

    private final void a() {
        boolean zC = c();
        if (this.c != zC) {
            this.c = zC;
            this.a.a(zC);
        }
    }
}
