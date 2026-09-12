package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class jt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2904 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2905 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2906 = -1537873289560176109L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static dm f2907;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final boolean f2908;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f2909;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m2699(jt jtVar) {
        int i = 2 % 2;
        int i2 = f2904 + 93;
        f2905 = i2 % 128;
        if (i2 % 2 != 0) {
            jtVar.m2700();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM2700 = jtVar.m2700();
        int i3 = f2904 + InterfaceC0280i1.d.b.d;
        f2905 = i3 % 128;
        int i4 = i3 % 2;
        return strM2700;
    }

    public jt(String str, boolean z) {
        this.f2909 = str;
        this.f2908 = z;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2704(final WebView webView) {
        int i = 2 % 2;
        try {
            p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jt.3
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    final String strM2699 = jt.m2699(jt.this);
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jt.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            ki.m2854(webView, strM2699);
                        }
                    });
                }
            });
            int i2 = f2905 + 9;
            f2904 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Exception e) {
            n.m2887(m2702("䩄繹≯홨驆丽爾☰\uea18黝䋫盜㫂\ueeb3銵䚝ઑ", 13327 - View.MeasureSpec.getMode(0)).intern(), new StringBuilder().append(m2702("䩖澬ǻ㬛\udd55\uf732ꢴ䋦搑ṃひ햨迦ꄔ孂細ᚩ죽\ue259葐빸叢痺⼝셉נּ鲨뛩栈Ȑ\u2435", 9677 - Color.argb(0, 0, 0, 0)).intern()).append(e.getLocalizedMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2703(dm dmVar) {
        int i = 2 % 2;
        int i2 = f2905;
        int i3 = i2 + 81;
        f2904 = i3 % 128;
        int i4 = i3 % 2;
        f2907 = dmVar;
        int i5 = i2 + 57;
        f2904 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m2698() {
        String strReplace;
        int i = 2 % 2;
        int i2 = f2905 + 61;
        f2904 = i2 % 128;
        int i3 = i2 % 2;
        String strM1987 = f2907.m1987();
        try {
            String strReplace2 = strM1987.replace(m2702("䩈\ue2e1ᬈ뎦\ue8fdě릦훘༄Ꞵ\udcc8甂궠\udac8獬ꮹ샆祷醬", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43177).intern(), m2701()).replace(m2702("䩈汽غ㣃튊\uf557꽢䄮篤ᶄ㑒\uee09耲", KeyEvent.getDeadChar(0, 0) + 9781).intern(), f2907.m1986());
            if (!this.f2908) {
                strReplace = strReplace2.replace(m2702("䩈홙牴鹸㨃䘔\ue234\u0e3b\uaad1㛙勤ﻵ", 39952 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), "");
            } else {
                int i4 = f2904 + 71;
                f2905 = i4 % 128;
                int i5 = i4 % 2;
                strReplace = strReplace2.replace(m2702("䩈홙牴鹸㨃䘔\ue234\u0e3b\uaad1㛙勤ﻵ", TextUtils.getOffsetAfter("", 0) + 39953).intern(), f2907.m1989());
            }
            String strReplace3 = strReplace.replace(m2702("䩈꽩耒\ue53f\uded9㏸ᒐষ捏䑵뤋鈧\uf7d5\ue8ed춀⚡", 58658 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), this.f2909);
            int i6 = f2904 + 45;
            f2905 = i6 % 128;
            int i7 = i6 % 2;
            return strReplace3;
        } catch (Throwable th) {
            n.m2887(m2702("䩄繹≯홨驆丽爾☰\uea18黝䋫盜㫂\ueeb3銵䚝ઑ", View.MeasureSpec.getSize(0) + 13327).intern(), new StringBuilder().append(m2702("䩖ﱈ☳标鋅쓾ຌ녢ﭻⴅ埬馤쎵ੵ뱹\ue61b⣊勄蒛콽煄묺\uedafវ", 46633 - Gravity.getAbsoluteGravity(0, 0)).intern()).append(th.getLocalizedMessage()).toString());
            return strM1987;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2700() {
        String strM2446;
        int i = 2 % 2;
        int i2 = f2905 + 59;
        f2904 = i2 % 128;
        if (i2 % 2 == 0) {
            strM2446 = Cif.m2446(m2698().getBytes());
            int i3 = 8 / 0;
        } else {
            strM2446 = Cif.m2446(m2698().getBytes());
        }
        int i4 = f2905 + 59;
        f2904 = i4 % 128;
        int i5 = i4 % 2;
        return strM2446;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2701() {
        int i = 2 % 2;
        int i2 = f2904 + 51;
        f2905 = i2 % 128;
        int i3 = i2 % 2;
        String strM477 = ar.m480().mo492().m477();
        int i4 = f2905 + 61;
        f2904 = i4 % 128;
        int i5 = i4 % 2;
        return strM477;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2702(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2906);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
