package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.Af;
import com.ironsource.C0398of;
import com.ironsource.Ff;
import com.ironsource.S8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TestSuiteActivity extends Activity implements S8 {
    private RelativeLayout a;
    private Ff b;
    private Af c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        String strB = new C0398of().b(this);
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    return new JSONObject(strB);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.S8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(this.f$0);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, c());
        Ff ff = new Ff(this, this, b(), a());
        this.b = ff;
        Af af = new Af(ff);
        this.c = af;
        af.d();
        RelativeLayout relativeLayout2 = this.a;
        Ff ff2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        Ff ff3 = this.b;
        if (ff3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            ff2 = ff3;
        }
        relativeLayout2.addView(ff2.d(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        Af af = this.c;
        Ff ff = null;
        if (af == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            af = null;
        }
        af.a();
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Ff ff2 = this.b;
        if (ff2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            ff = ff2;
        }
        ff.a();
        super.onDestroy();
    }

    @Override // com.ironsource.S8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Ff ff = this$0.b;
        Ff ff2 = null;
        if (ff == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            ff = null;
        }
        if (ff.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            Ff ff3 = this$0.b;
            if (ff3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                ff3 = null;
            }
            relativeLayout.removeView(ff3.d());
            RelativeLayout relativeLayout2 = this$0.a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            Ff ff4 = this$0.b;
            if (ff4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                ff4 = null;
            }
            relativeLayout2.addView(ff4.c(), this$0.c());
            Ff ff5 = this$0.b;
            if (ff5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                ff2 = ff5;
            }
            ff2.b();
        }
    }
}
