package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes2.dex */
public final class V5 implements G7 {
    @Override // com.ironsource.G7
    public boolean a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
