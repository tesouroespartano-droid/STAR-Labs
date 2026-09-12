package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jd {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2738 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2739 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2740 = 102006550825349663L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f2741;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f2742;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f2743;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final je f2744;

    public interface d {
        /* JADX INFO: renamed from: ﾇ */
        void mo383(int i);
    }

    public interface e {
        /* JADX INFO: renamed from: ｋ */
        void mo390(List<ja> list);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ int m2579(jd jdVar) {
        int i = 2 % 2;
        int i2 = f2738;
        int i3 = i2 + 79;
        f2739 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        f2739 = i5 % 128;
        int i6 = i5 % 2;
        return UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ je m2580(jd jdVar) {
        int i = 2 % 2;
        int i2 = f2738 + 69;
        int i3 = i2 % 128;
        f2739 = i3;
        int i4 = i2 % 2;
        je jeVar = jdVar.f2744;
        int i5 = i3 + 99;
        f2738 = i5 % 128;
        if (i5 % 2 != 0) {
            return jeVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m2584(jd jdVar) {
        int i = 2 % 2;
        int i2 = f2738 + 51;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        String strM2581 = jdVar.m2581();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = f2738 + 15;
        f2739 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return strM2581;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m2585(jd jdVar, ja jaVar) {
        int i = 2 % 2;
        int i2 = f2738 + 95;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        String strM2583 = jdVar.m2583(jaVar);
        int i4 = f2739 + 19;
        f2738 = i4 % 128;
        int i5 = i4 % 2;
        return strM2583;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m2588(jd jdVar, String str) {
        int i = 2 % 2;
        int i2 = f2738 + 15;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        String strM2586 = jdVar.m2586(str);
        int i4 = f2738 + 7;
        f2739 = i4 % 128;
        int i5 = i4 % 2;
        return strM2586;
    }

    public jd(String str, String str2, je jeVar) {
        this(str, str2, jeVar, (byte) 0);
    }

    private jd(String str, String str2, je jeVar, byte b) {
        this.f2742 = str2;
        this.f2741 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.f2743 = str;
        this.f2744 = jeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static ja m2582(JSONObject jSONObject) {
        int i = 2 % 2;
        ja jaVar = new ja(jSONObject);
        int i2 = f2739 + 65;
        f2738 = i2 % 128;
        int i3 = i2 % 2;
        return jaVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2589(final int i, final e eVar) {
        int i2 = 2 % 2;
        je.m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2755 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2756 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2757 = 199;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i3 = 2 % 2;
                final ArrayList arrayList = new ArrayList();
                for (String str : jd.m2580(jd.this).m2607(jd.m2588(jd.this, m2594("\u0000", 1 - (ViewConfiguration.getTouchSlop() >> 8), 240 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()), i).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        arrayList.add(new ja(jSONObject.getJSONObject(m2594("ￜ\f\u000b\u0007\b\ufff9\f\ufff9", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, 303 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8).intern()), jSONObject.optString(m2594("￼\b\b\ufff7", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, 308 - (ViewConfiguration.getScrollBarSize() >> 8), true, (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern())));
                        int i4 = f2755 + 65;
                        f2756 = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Exception unused) {
                        n.m2879(jd.m2584(jd.this), m2594("\u0005\u0000\ufffe￠\u0002\u0004\ufffe\u000f\f\u0011\ufff0\u0002", 4 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 298, true, 12 - TextUtils.getCapsMode("", 0, 0)).intern(), new StringBuilder().append(m2594("\u000e\u0013\fￅ\u001b\u0006\u0011\u001a\n\uffdfￅ￨\u0014\u001a\u0011\t\u0013ￌ\u0019ￅ\b\u0017\n\u0006\u0019\nￅ\b\u0006\b\r\n\tￅ\n\u001b\n\u0013\u0019ￓￅ\u0018\u0019\u0017", 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 290 - (KeyEvent.getMaxKeyCode() >> 16), false, (Process.myTid() >> 22) + 44).intern()).append(str).toString(), true);
                    }
                }
                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        eVar.mo390(arrayList);
                    }
                });
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo635(Throwable th) {
                int i3 = 2 % 2;
                super.mo635(th);
                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        eVar.mo390(new ArrayList());
                    }
                });
                int i4 = f2755 + 87;
                f2756 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 40 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2594(String str, int i3, int i4, boolean z, int i5) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1919) {
                    char[] cArr2 = new char[i5];
                    com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i5) {
                        com.ironsource.adqualitysdk.sdk.i.e.f1920 = cArr[com.ironsource.adqualitysdk.sdk.i.e.f1921];
                        cArr2[com.ironsource.adqualitysdk.sdk.i.e.f1921] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f1920 + i4);
                        int i6 = com.ironsource.adqualitysdk.sdk.i.e.f1921;
                        cArr2[i6] = (char) (cArr2[i6] - f2757);
                        com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                    }
                    if (i3 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.e.f1918 = i3;
                        char[] cArr3 = new char[i5];
                        System.arraycopy(cArr2, 0, cArr3, 0, i5);
                        System.arraycopy(cArr3, 0, cArr2, i5 - com.ironsource.adqualitysdk.sdk.i.e.f1918, com.ironsource.adqualitysdk.sdk.i.e.f1918);
                        System.arraycopy(cArr3, com.ironsource.adqualitysdk.sdk.i.e.f1918, cArr2, 0, i5 - com.ironsource.adqualitysdk.sdk.i.e.f1918);
                    }
                    if (z) {
                        char[] cArr4 = new char[i5];
                        com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i5) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.e.f1921] = cArr2[(i5 - com.ironsource.adqualitysdk.sdk.i.e.f1921) - 1];
                            com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        });
        int i3 = f2738 + 67;
        f2739 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2590(final d dVar) {
        int i = 2 % 2;
        je.m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2745 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static boolean f2746 = true;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2747 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2748 = {241};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2749 = 199;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f2750 = true;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                final int iM2609 = jd.m2580(jd.this).m2609(jd.m2588(jd.this, m2593(null, 175 - AndroidCharacter.getMirror('0'), null, "\u0081").intern()));
                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        dVar.mo383(iM2609);
                    }
                });
                int i3 = f2747 + InterfaceC0280i1.d.b.i;
                f2745 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2593(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (m.f3007) {
                    char[] cArr2 = f2748;
                    int i3 = f2749;
                    if (f2746) {
                        int length = bArr.length;
                        m.f3005 = length;
                        char[] cArr3 = new char[length];
                        m.f3006 = 0;
                        while (m.f3006 < m.f3005) {
                            cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i2] - i3);
                            m.f3006++;
                        }
                        return new String(cArr3);
                    }
                    if (f2750) {
                        int length2 = cArr.length;
                        m.f3005 = length2;
                        char[] cArr4 = new char[length2];
                        m.f3006 = 0;
                        while (m.f3006 < m.f3005) {
                            cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i2] - i3);
                            m.f3006++;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f3005 = length3;
                    char[] cArr5 = new char[length3];
                    m.f3006 = 0;
                    while (m.f3006 < m.f3005) {
                        cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i2] - i3);
                        m.f3006++;
                    }
                    return new String(cArr5);
                }
            }
        });
        int i2 = f2738 + 33;
        f2739 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2592(final ja jaVar, final iu iuVar) {
        int i = 2 % 2;
        je.m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f2766 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2767;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int[] f2768 = {1651669151, -625361004, -506930382, -1700162696, 840820871, -1691092095, 1267595636, 291682656, -1864510666, 879926628, 942237317, 740359560, 1891215597, -2034986793, 406826103, -66891509, -787087927, -211690662};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                if (jd.m2580(jd.this).m2609(jd.m2588(jd.this, m2595(new int[]{-1251651600, -1245689204}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) <= jd.m2579(jd.this)) {
                    int i3 = f2766 + 75;
                    f2767 = i3 % 128;
                    int i4 = i3 % 2;
                    String strM2585 = jd.m2585(jd.this, jaVar);
                    if (TextUtils.isEmpty(strM2585)) {
                        int i5 = f2767 + 27;
                        f2766 = i5 % 128;
                        if (i5 % 2 == 0) {
                            n.m2879(jd.m2584(jd.this), m2595(new int[]{-1666841757, 565236857, 1336421048, -232917493, -2102503734, -1691668460}, InterfaceC0280i1.d.b.g << (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))).intern(), m2595(new int[]{1279057983, 1410909588, 1509197340, -698763683, 970441652, 1782609565, 1199014547, 101252297, 1560046921, -1314203932, -2130388078, 1692895574, 376792045, -873643144, 1704149209, 1289482142, 927115191, -521922365, -490521447, -185019181, 813229461, -974269929, 1884118833, -1630109941}, InterfaceC0280i1.d.b.g % (ViewConfiguration.getJumpTapTimeout() >> 56)).intern(), false);
                            return;
                        } else {
                            n.m2879(jd.m2584(jd.this), m2595(new int[]{-1666841757, 565236857, 1336421048, -232917493, -2102503734, -1691668460}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11).intern(), m2595(new int[]{1279057983, 1410909588, 1509197340, -698763683, 970441652, 1782609565, 1199014547, 101252297, 1560046921, -1314203932, -2130388078, 1692895574, 376792045, -873643144, 1704149209, 1289482142, 927115191, -521922365, -490521447, -185019181, 813229461, -974269929, 1884118833, -1630109941}, 45 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), true);
                            return;
                        }
                    }
                    try {
                        String string = jaVar.m2548().toString();
                        int i6 = f2766 + 81;
                        f2767 = i6 % 128;
                        int i7 = i6 % 2;
                        n.m2883(jd.m2584(jd.this), m2595(new int[]{-1666841757, 565236857, 1336421048, -232917493, -2102503734, -1691668460}, TextUtils.lastIndexOf("", '0') + 13).intern(), m2595(new int[]{-1666841757, 565236857, 38700665, -1607947200, -972432993, 1421343148, 224739700, 805981181}, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), string, true);
                        jd.m2580(jd.this).m2608(strM2585, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                iu iuVar2 = iuVar;
                if (iuVar2 != null) {
                    p.m2899(iuVar2);
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2595(int[] iArr, int i2) {
                String str;
                synchronized (c.f1230) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2768.clone();
                    c.f1231 = 0;
                    while (c.f1231 < iArr.length) {
                        cArr[0] = (char) (iArr[c.f1231] >> 16);
                        cArr[1] = (char) iArr[c.f1231];
                        cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                        cArr[3] = (char) iArr[c.f1231 + 1];
                        c.f1232 = (cArr[0] << 16) + cArr[1];
                        c.f1233 = (cArr[2] << 16) + cArr[3];
                        c.m1415(iArr2);
                        for (int i3 = 0; i3 < 16; i3++) {
                            int i4 = c.f1232 ^ iArr2[i3];
                            c.f1232 = i4;
                            c.f1233 = c.m1414(i4) ^ c.f1233;
                            int i5 = c.f1232;
                            c.f1232 = c.f1233;
                            c.f1233 = i5;
                        }
                        int i6 = c.f1232;
                        c.f1232 = c.f1233;
                        c.f1233 = i6;
                        c.f1233 = i6 ^ iArr2[16];
                        c.f1232 ^= iArr2[17];
                        int i7 = c.f1232;
                        int i8 = c.f1233;
                        cArr[0] = (char) (c.f1232 >>> 16);
                        cArr[1] = (char) c.f1232;
                        cArr[2] = (char) (c.f1233 >>> 16);
                        cArr[3] = (char) c.f1233;
                        c.m1415(iArr2);
                        cArr2[c.f1231 << 1] = cArr[0];
                        cArr2[(c.f1231 << 1) + 1] = cArr[1];
                        cArr2[(c.f1231 << 1) + 2] = cArr[2];
                        cArr2[(c.f1231 << 1) + 3] = cArr[3];
                        c.f1231 += 2;
                    }
                    str = new String(cArr2, 0, i2);
                }
                return str;
            }
        });
        int i2 = f2738 + 51;
        f2739 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2591(final ja jaVar) {
        int i = 2 % 2;
        je.m2596().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                jd.m2580(jd.this).m2604(jd.m2585(jd.this, jaVar));
            }
        });
        int i2 = f2738 + 67;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2583(ja jaVar) {
        int i = 2 % 2;
        int i2 = f2738 + 93;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        String strM2550 = jaVar.m2550();
        if (i3 == 0) {
            return m2586(strM2550);
        }
        m2586(strM2550);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2586(String str) {
        int i = 2 % 2;
        String string = new StringBuilder().append(this.f2742).append(str).toString();
        int i2 = f2738 + 27;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2581() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2587("Ğ⸍ꦢꚍŝᱳ췿ジ줇퓅蕬\uf83b醔\ued7b峳膽塊ꖶ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern()).append(this.f2743).append(m2587("瀪䁓貸赂瀃", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern()).toString();
        int i2 = f2738 + 85;
        f2739 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2587(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2740, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2740));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
