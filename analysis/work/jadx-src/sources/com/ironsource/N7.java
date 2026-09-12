package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;

/* JADX INFO: loaded from: classes2.dex */
public interface N7 {

    public interface a {
        void a(Context context, String str, IronSource.AD_UNIT ad_unit);

        void b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
    }

    C0190cd.b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);

    boolean c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
}
