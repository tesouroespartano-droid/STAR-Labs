package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0140a extends Thread {
    private static final int l = 1;
    private static final InterfaceC0158b m = new C0041a();
    private static final InterfaceC0375n9 n = new b();
    private final int d;
    private InterfaceC0158b a = m;
    private InterfaceC0375n9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0041a implements InterfaceC0158b {
        C0041a() {
        }

        @Override // com.ironsource.InterfaceC0158b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC0158b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    class b implements InterfaceC0375n9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC0375n9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0140a c0140a = C0140a.this;
            c0140a.h = (c0140a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C0140a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public C0140a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C0421q4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new O5(C0421q4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }

    public int a() {
        return this.j;
    }

    public C0140a b(boolean z) {
        this.f = z;
        return this;
    }

    public C0140a a(InterfaceC0158b interfaceC0158b) {
        if (interfaceC0158b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC0158b;
        return this;
    }

    public C0140a a(InterfaceC0375n9 interfaceC0375n9) {
        if (interfaceC0375n9 == null) {
            this.b = n;
            return this;
        }
        this.b = interfaceC0375n9;
        return this;
    }

    public C0140a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C0140a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
