package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC0267h5 extends Handler {
    private static final String b = "DownloadHandler";
    Dc a;

    public HandlerC0267h5(Looper looper) {
        super(looper);
    }

    public void a(Dc dc) {
        if (dc == null) {
            throw new IllegalArgumentException();
        }
        this.a = dc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Dc dc = this.a;
        if (dc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                dc.a((C0577z8) message.obj);
            } else {
                this.a.a((C0577z8) message.obj, new C0441r8(i, Zf.a(i)));
            }
        } catch (Throwable th) {
            C0421q4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
