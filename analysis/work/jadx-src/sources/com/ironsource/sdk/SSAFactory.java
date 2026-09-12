package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.K9;
import com.ironsource.Ud;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SSAFactory {
    public static Ud getPublisherInstance(Activity activity) throws Exception {
        return K9.b((Context) activity);
    }

    public static Ud getPublisherTestInstance(Activity activity, int i) throws Exception {
        return K9.a(activity, i);
    }
}
