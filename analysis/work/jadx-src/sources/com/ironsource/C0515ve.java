package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0515ve implements K8 {
    @Override // com.ironsource.K8
    public void a(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveIntToSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.K8
    public int b(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getIntFromSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.K8
    public void a(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveLongToSharedPrefs(context, key, j);
    }

    @Override // com.ironsource.K8
    public long b(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getLongFromSharedPrefs(context, key, j);
    }
}
