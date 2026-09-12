package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class iw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2635 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2636;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2637;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f2638;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String f2639;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private iv f2640;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private je f2641;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2642;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2643 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m2505() {
        f2636 = new char[]{'t', 17149, 34175, 51150, 2649, 19625, 36667, 53642, 5139, 22313, 39421, 56403, 7834, 24871, 41904, 58959, 10370, 27418, 44643, 61682, 13144, 30174, 47150, 64187, 39142, 55925, 7652, 24405, 37573, 54335, 6114, 18703, 35976, 53233, 369, 17621, 34389, 63995, 15219, 32400, 45063, '/', Typography.dollar, 17087, 34129, 51136, 2640, 19711, 36733, 53658, 5140, 22344, 39416, 56348, 7935, 24949, 41899, 58965, 10418, 27418, 44601, 61610, 13129, 30153, 47225, 64183, 15627, 32645, 49919, 1381, 18384, 35330, 52466, 3903, 20941, 37951, 54924, 6589, 23658, 40602, 57694, 9132, 26221, 43161, 60162, 11885, 28913, 45889, 62935, 14386, 31396, 48417, 65499, 16920, 34159, 51182, 2648, 19664, 36636, 53678, 5135, 22203, 39408, 56411, 7879, 24934, 41903, 58941, 10418, 27401, 44503, 61606};
        f2638 = -9181695204227923313L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m2501(iw iwVar) {
        int i = 2 % 2;
        int i2 = f2637 + 119;
        f2635 = i2 % 128;
        int i3 = i2 % 2;
        List<Runnable> list = iwVar.f2643;
        if (i3 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ je m2502(iw iwVar) {
        int i = 2 % 2;
        int i2 = f2635;
        int i3 = i2 + 113;
        f2637 = i3 % 128;
        int i4 = i3 % 2;
        je jeVar = iwVar.f2641;
        int i5 = i2 + 45;
        f2637 = i5 % 128;
        int i6 = i5 % 2;
        return jeVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m2503() {
        int i = 2 % 2;
        int i2 = f2635 + 105;
        int i3 = i2 % 128;
        f2637 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = f2639;
        int i4 = i3 + 105;
        f2635 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m2507(iw iwVar, jc jcVar, io ioVar) {
        int i = 2 % 2;
        int i2 = f2637 + 123;
        f2635 = i2 % 128;
        int i3 = i2 % 2;
        iwVar.m2504(jcVar, ioVar);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ iv m2508(iw iwVar) {
        int i = 2 % 2;
        int i2 = f2637;
        int i3 = i2 + 79;
        f2635 = i3 % 128;
        int i4 = i3 % 2;
        iv ivVar = iwVar.f2640;
        int i5 = i2 + 99;
        f2635 = i5 % 128;
        int i6 = i5 % 2;
        return ivVar;
    }

    static {
        m2505();
        f2639 = m2509(View.MeasureSpec.getMode(0) + 42, 70 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        int i = f2635 + 9;
        f2637 = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    public iw(Context context, iv ivVar, String str) {
        this.f2641 = new je(context, m2509(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 24 - TextUtils.indexOf("", ""), (char) View.resolveSize(0, 0)).intern(), m2509(TextUtils.getOffsetAfter("", 0) + 24, 17 - Color.alpha(0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39061)).intern());
        this.f2640 = ivVar;
        this.f2642 = str;
        ar.m480().mo509(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.1
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ｋ */
            public final void mo385() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(iw.m2501(iw.this));
                    iw.m2501(iw.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized String m2506() {
        int i = 2 % 2;
        int i2 = f2635;
        int i3 = i2 + InterfaceC0280i1.d.b.i;
        f2637 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2642;
        int i5 = i2 + 29;
        f2637 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        int i6 = 18 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2511(String str, String str2, io ioVar) {
        int i = 2 % 2;
        jc.e eVar = new jc.e(str, str2);
        if (ar.m480().mo492().m479()) {
            int i2 = f2637 + InterfaceC0280i1.d.b.b;
            f2635 = i2 % 128;
            int i3 = i2 % 2;
            String strM478 = ar.m480().mo492().m478(str);
            if (TextUtils.isEmpty(strM478)) {
                int i4 = f2637 + 45;
                f2635 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 69 / 0;
                }
                return null;
            }
            jc.b bVar = new jc.b(str, str2, strM478);
            int i6 = f2635 + 95;
            f2637 = i6 % 128;
            int i7 = i6 % 2;
            eVar = bVar;
        }
        return m2512(eVar, ioVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2512(final jc jcVar, final io ioVar) {
        boolean z;
        if (TextUtils.isEmpty(jcVar.m2572()) || TextUtils.isEmpty(jcVar.m2576())) {
            return null;
        }
        String strM2575 = jcVar.m2575();
        synchronized (this) {
            if (ar.m480().mo500()) {
                z = true;
            } else {
                this.f2643.add(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        iw.m2507(iw.this, jcVar, ioVar);
                    }
                });
                z = false;
            }
        }
        if (z) {
            m2504(jcVar, ioVar);
        }
        return this.f2641.m2606(strM2575);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2504(final jc jcVar, final io ioVar) {
        int i = 2 % 2;
        final String string = new StringBuilder().append(m2506()).append(m2509((ViewConfiguration.getScrollDefaultDelay() >> 16) + 41, -TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern()).append(jcVar.mo2571()).toString();
        final String strM2575 = jcVar.m2575();
        if (ar.m480().mo507()) {
            int i2 = f2635 + 73;
            f2637 = i2 % 128;
            int i3 = i2 % 2;
            if (ar.m480().mo513() || this.f2641.m2606(strM2575) == null) {
                jv.m2717(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static char f2648 = 6;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f2649 = 1;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char[] f2650 = {'U', 'S', '-', 'A', 'C', 'I', 'R', 'e', 'm', 'o', 't', 'D', 'B', 'c', 'r', 'y', 'p', 'd', ' ', 's', 'i', 'n', 'g', 'f', 'a', 'v', 'l', 'h', '/', 'E', 'V', 'W', 'X', 'Y', 'Z', '['};

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f2651;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() throws Throwable {
                        int i4 = 2 % 2;
                        int i5 = f2649 + 27;
                        f2651 = i5 % 128;
                        int i6 = i5 % 2;
                        m2513(string, jcVar, strM2575, ioVar);
                        int i7 = f2651 + 53;
                        f2649 = i7 % 128;
                        if (i7 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private void m2513(String str, jc jcVar2, String str2, io ioVar2) throws Throwable {
                        int i4 = 2 % 2;
                        if (!iw.m2508(iw.this).m2493().m2526()) {
                            int i5 = f2651 + 71;
                            f2649 = i5 % 128;
                            if (i5 % 2 != 0) {
                                m2514(jcVar2, ioVar2);
                                return;
                            } else {
                                m2514(jcVar2, ioVar2);
                                int i6 = 37 / 0;
                                return;
                            }
                        }
                        try {
                            ir irVarM2537 = iy.m2537(str);
                            try {
                                if (irVarM2537 != null && irVarM2537.m2482().m2486() == 200) {
                                    String strM2516 = m2516(iy.m2535(irVarM2537));
                                    if (!Charset.forName(m2515("\u0001\u0002\u0003\u0004\u0002\u0005²²", (byte) (105 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7).intern()).newEncoder().canEncode(strM2516)) {
                                        jz.m2766(m2515("\u0007\b\t\n\u000b\b\u0006\u0011", (byte) (80 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 7 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new StringBuilder().append(m2515("\u0006\b\u000e\u000f\u0010\u0011\u000b\b\f\u0017\u0016\u0007\u0014\u001a\u0016\u0017\u0013\u0012\u000f\b\u0006\u0014", (byte) (View.MeasureSpec.getMode(0) + 17), 22 - TextUtils.indexOf("", "")).intern()).append(str).append(m2515("\u0013\f\u000f\u001b\u0006\u001c\u0015\u0016\u0014\u0013\u0015\u0016\u001a\u0019 \u001a\f\u0017\u000f\u0019\u001a\fs", (byte) Color.green(0), 'G' - AndroidCharacter.getMirror('0')).intern()).toString(), (Throwable) null, false);
                                        return;
                                    } else {
                                        if (TextUtils.isEmpty(strM2516)) {
                                            return;
                                        }
                                        iw.m2502(iw.this).m2601(str2, strM2516);
                                        p.m2897(new iu(str2, strM2516) { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4

                                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                            private /* synthetic */ String f2660;

                                            {
                                                this.f2660 = strM2516;
                                            }

                                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                            /* JADX INFO: renamed from: ﻐ */
                                            public final void mo227() {
                                                this.f2661.mo639(this.f2660);
                                            }
                                        });
                                        return;
                                    }
                                }
                                if (!iw.m2508(iw.this).m2493().m2526()) {
                                    int i7 = f2651 + 61;
                                    f2649 = i7 % 128;
                                    int i8 = i7 % 2;
                                    m2514(jcVar2, ioVar2);
                                    return;
                                }
                                if (irVarM2537.m2482().m2486() != 403) {
                                    int i9 = f2651 + 57;
                                    f2649 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        if (irVarM2537.m2482().m2486() != 25140) {
                                            return;
                                        }
                                    } else if (irVarM2537.m2482().m2486() != 404) {
                                        return;
                                    }
                                }
                                if (!(!str.contains(m2515("\t\u0013\u001a\u001d", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73), 4 - View.resolveSizeAndState(0, 0, 0)).intern()))) {
                                    int i10 = f2649 + 59;
                                    f2651 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        jcVar2.m2574();
                                        iw.this.m2512(jcVar2, ioVar2);
                                    } else {
                                        jcVar2.m2574();
                                        iw.this.m2512(jcVar2, ioVar2);
                                        try {
                                            throw null;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                if (iw.m2508(iw.this).m2493().m2526()) {
                                    jz.m2766(m2515("\u0007\b\t\n\u000b\b\u0006\u0011", (byte) ((Process.myPid() >> 22) + 79), (KeyEvent.getMaxKeyCode() >> 16) + 8).intern(), new StringBuilder().append(m2515("\u001a\u0011\u000f\b\f\u0014\u0013\nîî\u0015\u0016\u0017\u0013\r\b\t\n\u000b\b\u0013\u0000\b\u0010\u0015\u0016\u0017\u0013\u0014\u0011\n\t\u009a", (byte) (123 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.alpha(0) + 33).intern()).append(str).toString(), (Throwable) e, false);
                                } else {
                                    m2514(jcVar2, ioVar2);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m2516(String str) throws Throwable {
                        int i4 = 2 % 2;
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString(m2515("\t\u0013\u0087", (byte) (36 - TextUtils.indexOf("", "")), 2 - TextUtils.lastIndexOf("", '0', 0)).intern());
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strM2712 = jv.m2712(strOptString, iw.m2503(), jSONObject.optString(m2515("\u0013\u001a", (byte) (21 - Gravity.getAbsoluteGravity(0, 0)), View.getDefaultSize(0, 0) + 2).intern()), jSONObject.optString(m2515("\u0012\u0019\u001c\b", (byte) (123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.MeasureSpec.getMode(0) + 4).intern()));
                            int i5 = f2651 + 95;
                            f2649 = i5 % 128;
                            if (i5 % 2 != 0) {
                                return strM2712;
                            }
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }
                        int i6 = f2651 + 61;
                        f2649 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 19 / 0;
                        }
                        return str;
                    }

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private void m2514(final jc jcVar2, final io ioVar2) {
                        int i4 = 2 % 2;
                        iw.m2508(iw.this).m2493().m2531(new is() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.is
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo395() {
                                iw.m2508(iw.this).m2493().m2529(this);
                                iw.m2507(iw.this, jcVar2, ioVar2);
                            }
                        });
                        int i5 = f2651 + 29;
                        f2649 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 30 / 0;
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m2515(String str, byte b, int i4) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (f.f2043) {
                            char[] cArr2 = f2650;
                            char c = f2648;
                            char[] cArr3 = new char[i4];
                            if (i4 % 2 != 0) {
                                i4--;
                                cArr3[i4] = (char) (cArr[i4] - b);
                            }
                            if (i4 > 1) {
                                f.f2047 = 0;
                                while (f.f2047 < i4) {
                                    f.f2045 = cArr[f.f2047];
                                    f.f2048 = cArr[f.f2047 + 1];
                                    if (f.f2045 == f.f2048) {
                                        cArr3[f.f2047] = (char) (f.f2045 - b);
                                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                                    } else {
                                        f.f2046 = f.f2045 / c;
                                        f.f2042 = f.f2045 % c;
                                        f.f2044 = f.f2048 / c;
                                        f.f2041 = f.f2048 % c;
                                        if (f.f2042 == f.f2041) {
                                            f.f2046 = ((f.f2046 + c) - 1) % c;
                                            f.f2044 = ((f.f2044 + c) - 1) % c;
                                            int i5 = (f.f2046 * c) + f.f2042;
                                            int i6 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i5];
                                            cArr3[f.f2047 + 1] = cArr2[i6];
                                        } else if (f.f2046 == f.f2044) {
                                            f.f2042 = ((f.f2042 + c) - 1) % c;
                                            f.f2041 = ((f.f2041 + c) - 1) % c;
                                            int i7 = (f.f2046 * c) + f.f2042;
                                            int i8 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i7];
                                            cArr3[f.f2047 + 1] = cArr2[i8];
                                        } else {
                                            int i9 = (f.f2046 * c) + f.f2041;
                                            int i10 = (f.f2044 * c) + f.f2042;
                                            cArr3[f.f2047] = cArr2[i9];
                                            cArr3[f.f2047 + 1] = cArr2[i10];
                                        }
                                    }
                                    f.f2047 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                });
            }
        }
        int i4 = f2637 + 119;
        f2635 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2510(jc jcVar) {
        int i = 2 % 2;
        int i2 = f2635 + 25;
        f2637 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
            if (this.f2641.m2606(jcVar.m2575()) != null) {
                return true;
            }
        } else {
            if (this.f2641.m2606(jcVar.m2575()) != null) {
                return true;
            }
        }
        int i4 = f2635 + 57;
        f2637 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2509(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2636[b.f638 + i]) ^ (((long) b.f638) * f2638)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
