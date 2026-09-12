package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class RunnableC0209df implements Runnable {
    private final Handler a;
    private final C0233f5 b;

    RunnableC0209df(C0233f5 c0233f5, Handler handler) {
        this.b = c0233f5;
        this.a = handler;
    }

    CallableC0165b6 a(C0233f5 c0233f5, String str, long j) {
        return new CallableC0165b6(c0233f5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C0577z8 c0577z8 = new C0577z8(this.b.b().getParent(), this.b.b().getName());
        Message messageA = a();
        messageA.obj = c0577z8;
        String strA = a(c0577z8.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.a.sendMessage(messageA);
        } else {
            C0250g5 c0250g5Call = a(new C0233f5(c0577z8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), strA, 3L).call();
            messageA.what = c0250g5Call.b() == 200 ? 1016 : c0250g5Call.b();
            this.a.sendMessage(messageA);
        }
    }

    Message a() {
        return new Message();
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
