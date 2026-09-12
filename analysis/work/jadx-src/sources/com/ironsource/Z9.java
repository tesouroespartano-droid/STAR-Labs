package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Z9 extends WebView implements InterfaceC0342la {
    private InterfaceC0325ka a;
    private Gc b;

    public /* synthetic */ Z9(Context context, InterfaceC0325ka interfaceC0325ka, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC0325ka.a(0, 1, null) : interfaceC0325ka);
    }

    @Override // com.ironsource.InterfaceC0342la
    public void a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC0325ka interfaceC0325ka = this.a;
        InterfaceC0325ka interfaceC0325ka2 = null;
        if (interfaceC0325ka == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC0325ka = null;
        }
        if (!interfaceC0325ka.a()) {
            InterfaceC0325ka interfaceC0325ka3 = this.a;
            if (interfaceC0325ka3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC0325ka3 = null;
            }
            interfaceC0325ka3.a(this);
        }
        InterfaceC0325ka interfaceC0325ka4 = this.a;
        if (interfaceC0325ka4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC0325ka2 = interfaceC0325ka4;
        }
        interfaceC0325ka2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        Gc gc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (gc = this.b) != null && gc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z9(Context context, InterfaceC0325ka javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Gc gc) {
        this.b = gc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
