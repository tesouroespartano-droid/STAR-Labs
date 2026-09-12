package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0387o4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    C0387o4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C0404p4 c0404p4 = new C0404p4(th);
        if (c0404p4.d()) {
            new O5(c0404p4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
