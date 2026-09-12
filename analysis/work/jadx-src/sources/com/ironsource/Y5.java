package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Y5 extends Handler {
    private final ConcurrentHashMap<String, Dc> a;

    public Y5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(String str, Dc dc) {
        if (str == null || dc == null) {
            return;
        }
        this.a.put(str, dc);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C0577z8 c0577z8 = (C0577z8) message.obj;
            String path = c0577z8.getPath();
            Dc dc = this.a.get(path);
            if (dc == null) {
                return;
            }
            if (a(message.what)) {
                dc.a(c0577z8);
            } else {
                int i = message.what;
                dc.a(c0577z8, new C0441r8(i, Zf.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C0421q4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
