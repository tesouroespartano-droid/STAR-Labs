package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0360mb implements SegmentListener {
    private SegmentListener a;
    private final a b;
    protected long c;

    /* JADX INFO: renamed from: com.ironsource.mb$a */
    private class a extends Thread {
        private Handler a;

        private a() {
        }

        public Handler a() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }
    }

    public C0360mb() {
        a aVar = new a();
        this.b = aVar;
        aVar.start();
        this.c = new Date().getTime();
    }

    protected boolean a(Object obj) {
        return (obj == null || this.b == null) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a((Object) this.a)) {
            a(new Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(str);
                }
            });
        }
    }

    protected void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.b;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public void a(SegmentListener segmentListener) {
        this.a = segmentListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.onSegmentReceived(str);
    }
}
