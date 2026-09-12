package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public interface If {
    static /* synthetic */ void a(If r0, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        r0.a(runnable, j);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j);
}
