package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jb {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static jb f2701;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jf f2702;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2703;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2706;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private HashMap<im, iu> f2705 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Handler f2704 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ boolean m2553(jb jbVar) {
        jbVar.f2706 = false;
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jb m2556() {
        if (f2701 == null) {
            f2701 = new jb();
        }
        return f2701;
    }

    private jb() {
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$4, reason: invalid class name */
    final class AnonymousClass4 extends iu {
        AnonymousClass4() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            if (jb.this.f2702 == null) {
                jb.this.f2702 = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo393(Activity activity) {
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4.1.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                final jb jbVar = jb.this;
                                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.2
                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo227() {
                                        jb.m2553(jb.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo394(Activity activity) {
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4.1.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                jb.m2554(jb.this);
                            }
                        });
                    }
                };
                jb.this.f2704.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        jj.m2645().m2648(jb.this.f2702);
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4.3.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                jb.m2554(jb.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2562() {
        p.m2894(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$3, reason: invalid class name */
    final class AnonymousClass3 extends iu {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ im f2713;

        AnonymousClass3(im imVar) {
            this.f2713 = imVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            jb.this.f2705.put(this.f2713, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.3.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    AnonymousClass3.this.f2713.mo1815();
                }
            });
            jb.m2554(jb.this);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2563(im imVar) {
        p.m2894(new AnonymousClass3(imVar));
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$5, reason: invalid class name */
    final class AnonymousClass5 extends iu {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ im f2723;

        AnonymousClass5(im imVar) {
            this.f2723 = imVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            jb.this.f2705.remove(this.f2723);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2564(im imVar) {
        p.m2894(new AnonymousClass5(imVar));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2554(jb jbVar) {
        if (jbVar.f2706 || new HashMap(jbVar.f2705).isEmpty()) {
            return;
        }
        jbVar.f2706 = true;
        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (!jb.this.f2706) {
                    jb.this.f2703 = null;
                    return;
                }
                HashMap mapM2552 = jb.m2552(jb.this);
                Iterator it = mapM2552.keySet().iterator();
                while (it.hasNext()) {
                    jb.this.f2704.post((Runnable) mapM2552.get((im) it.next()));
                }
                if (jb.this.f2703 == null) {
                    jb.this.f2703 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1.1

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f2708 = 1;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2709 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2710 = 115;

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i = 2 % 2;
                            int i2 = f2708 + 5;
                            f2709 = i2 % 128;
                            int i3 = i2 % 2;
                            try {
                                p.m2900(this);
                                int i4 = f2709 + 51;
                                f2708 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (Throwable th) {
                                n.m2884(m2565("\ufff3\u0017\u0003\u000e\u000b\u0016\u001b\ufff5￦￭￣\u0006", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, 209 - (ViewConfiguration.getWindowTouchSlop() >> 8), false, 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m2565("\t\u0001\u0006\u0005\u000e\u0001\u0012￦\u000f\u0004\uffc0\u0004\u0005\f", KeyEvent.normalizeMetaState(0) + 3, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 211, true, 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th, false);
                            }
                        }

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m2565(String str, int i, int i2, boolean z, int i3) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (e.f1919) {
                                char[] cArr2 = new char[i3];
                                e.f1921 = 0;
                                while (e.f1921 < i3) {
                                    e.f1920 = cArr[e.f1921];
                                    cArr2[e.f1921] = (char) (e.f1920 + i2);
                                    int i4 = e.f1921;
                                    cArr2[i4] = (char) (cArr2[i4] - f2710);
                                    e.f1921++;
                                }
                                if (i > 0) {
                                    e.f1918 = i;
                                    char[] cArr3 = new char[i3];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                                    System.arraycopy(cArr3, 0, cArr2, i3 - e.f1918, e.f1918);
                                    System.arraycopy(cArr3, e.f1918, cArr2, 0, i3 - e.f1918);
                                }
                                if (z) {
                                    char[] cArr4 = new char[i3];
                                    e.f1921 = 0;
                                    while (e.f1921 < i3) {
                                        cArr4[e.f1921] = cArr2[(i3 - e.f1921) - 1];
                                        e.f1921++;
                                    }
                                    cArr2 = cArr4;
                                }
                                str2 = new String(cArr2);
                            }
                            return str2;
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jb.this.f2703);
            }
        });
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ HashMap m2552(jb jbVar) {
        return new HashMap(jbVar.f2705);
    }
}
