package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jo f2854;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2857 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2856 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jg f2855 = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.3
        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jk.m2659(jk.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jk.m2659(jk.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jk.m2657(jk.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jk.m2660(jk.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jk.m2659(jk.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jk.m2659(jk.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jk.m2659(jk.this);
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m2661(jk jkVar) {
        jkVar.f2857 = true;
        return true;
    }

    public jk(jo joVar) {
        this.f2854 = joVar;
        jj.m2645().m2648(this.f2855);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2662() {
        this.f2856.removeCallbacksAndMessages(null);
        if (this.f2855 != null) {
            jj.m2645().m2646(this.f2855);
            this.f2855 = null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m2659(jk jkVar) {
        jkVar.f2856.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2657(jk jkVar, Activity activity) {
        if (jkVar.f2857) {
            jkVar.f2857 = false;
            jo joVar = jkVar.f2854;
            if (joVar != null) {
                joVar.mo400(activity);
            }
        }
        jkVar.f2856.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m2660(jk jkVar, final Activity activity) {
        jkVar.f2856.postDelayed(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                jk.m2661(jk.this);
                if (jk.this.f2854 != null) {
                    jk.this.f2854.mo399(activity);
                }
            }
        }, 500L);
    }
}
