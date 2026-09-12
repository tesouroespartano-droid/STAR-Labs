package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class je {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2772 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2773;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2774 = {63619, 52405, 36993, 25814, 10441, 64732, 49197, 37893, 22619, 11364, 61527, 50610, 35209, 23959, 8701, '.', 13428, 26705, 39995, 53268, 1037, 14560, 27852, 41121, 54444, 2197};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2775 = -8240060014503381992L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Handler f2776;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ie f2777;

    public interface b {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo2611();
    }

    public interface d {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo2612(String str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2600(je jeVar, b bVar) {
        int i = 2 % 2;
        int i2 = f2773 + 53;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        jeVar.m2598(bVar);
        int i4 = f2772 + 31;
        f2773 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m2596() {
        Handler handler;
        synchronized (je.class) {
            if (f2776 == null) {
                HandlerThread handlerThread = new HandlerThread(m2599(ExpandableListView.getPackedPositionGroup(0L), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 63688)).intern());
                handlerThread.start();
                f2776 = new Handler(handlerThread.getLooper());
            }
            handler = f2776;
        }
        return handler;
    }

    public je(Context context, String str, String str2) {
        this.f2777 = new ie(context, str, str2);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2609(String str) {
        int i = 2 % 2;
        int i2 = f2773 + 95;
        f2772 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.f2777.m2435(str);
            super.hashCode();
            throw null;
        }
        int iM2435 = this.f2777.m2435(str);
        int i3 = f2772 + 69;
        f2773 = i3 % 128;
        if (i3 % 2 == 0) {
            return iM2435;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap<String, String> m2607(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f2773 + 107;
        f2772 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f2777.m2432(str, i);
            super.hashCode();
            throw null;
        }
        HashMap<String, String> mapM2432 = this.f2777.m2432(str, i);
        int i4 = f2772 + 81;
        f2773 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapM2432;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2606(String str) {
        int i = 2 % 2;
        int i2 = f2773 + 19;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        String strM2433 = this.f2777.m2433(str);
        int i4 = f2772 + 27;
        f2773 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return strM2433;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2602(final String str, final d dVar) {
        int i = 2 % 2;
        m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.je.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                final String strM2606 = je.this.m2606(str);
                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.je.3.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        dVar.mo2612(strM2606);
                    }
                });
            }
        });
        int i2 = f2773 + 21;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2604(String str) {
        int i = 2 % 2;
        int i2 = f2773 + 13;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        this.f2777.m2434(str);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2608(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2772 + 29;
        f2773 = i2 % 128;
        int i3 = i2 % 2;
        this.f2777.m2436(str, str2);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2603(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2773 + 89;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        m2605(str, str2, null);
        int i4 = f2773 + 39;
        f2772 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2605(final String str, final String str2, final b bVar) {
        int i = 2 % 2;
        m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                je.this.m2608(str, str2);
                je.m2600(je.this, bVar);
            }
        });
        int i2 = f2773 + 11;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2601(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2773 + 105;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        m2608(str, str2);
        m2608(m2597(str), Long.toString(jv.m2711()));
        int i4 = f2773 + 47;
        f2772 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2610(final String str, final String str2, final b bVar) {
        int i = 2 % 2;
        m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                je.this.m2601(str, str2);
                je.m2600(je.this, bVar);
            }
        });
        int i2 = f2773 + 123;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2597(String str) {
        int i = 2 % 2;
        String string = new StringBuilder().append(str).append(m2599((-16777201) - Color.rgb(0, 0, 0), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.myPid() >> 22)).intern()).toString();
        int i2 = f2773 + 39;
        f2772 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2598(b bVar) {
        int i = 2 % 2;
        int i2 = f2772 + 33;
        f2773 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (bVar != null) {
            p.m2899(new iu(bVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                }
            });
        }
        int i3 = f2773 + 79;
        f2772 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2599(int i, int i2, char c) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f2774[com.ironsource.adqualitysdk.sdk.i.b.f638 + i]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f2775)) ^ ((long) c));
                com.ironsource.adqualitysdk.sdk.i.b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
