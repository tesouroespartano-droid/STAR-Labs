package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0331l implements ig {
    private WeakReference<Activity> a;

    public C0331l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.ig
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
