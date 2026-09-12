package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0326kb {
    private static final String g = "kb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final Lf c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC0187ca f = new a();

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    class a implements InterfaceC0187ca {
        a() {
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void a() {
            C0326kb.this.c.c(System.currentTimeMillis());
            C0326kb.this.c();
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void b() {
            C0326kb.this.c.b(System.currentTimeMillis());
            C0326kb c0326kb = C0326kb.this;
            c0326kb.b(c0326kb.c.a());
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void c() {
        }

        @Override // com.ironsource.InterfaceC0187ca
        public void d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kb$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C0326kb c0326kb = C0326kb.this;
            c0326kb.a.b(c0326kb.f);
            C0326kb.this.c.b();
            C0326kb.this.b.run();
        }
    }

    public C0326kb(Runnable runnable, com.ironsource.lifecycle.b bVar, Lf lf) {
        this.b = runnable;
        this.a = bVar;
        this.c = lf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }
}
