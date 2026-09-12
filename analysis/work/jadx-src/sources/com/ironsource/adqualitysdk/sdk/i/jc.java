package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public class jc {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2724 = {448867210, -213724875, -499215249, 211331765, -1083708317, -1540828936, -1811884413, 2117517662, 1835720890, 245412585, -649460347, -497877606, 1653010363, -1853883999, -142321962, 451086941, -1127702630, 1276574997};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2725 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2726 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2727;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2728;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2729;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2730;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f2731;

    /* synthetic */ jc(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
    }

    private jc(String str, String str2, String str3, String str4) {
        this.f2731 = str;
        this.f2728 = str2;
        this.f2727 = str3;
        this.f2730 = str4;
        this.f2729 = true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m2567() {
        int i = 2 % 2;
        int i2 = f2726 + 51;
        f2725 = i2 % 128;
        int i3 = i2 % 2;
        String strMo491 = ar.m480().mo491();
        int i4 = f2725 + 33;
        f2726 = i4 % 128;
        int i5 = i4 % 2;
        return strMo491;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    protected final String m2572() {
        int i = 2 % 2;
        int i2 = f2725 + 41;
        int i3 = i2 % 128;
        f2726 = i3;
        int i4 = i2 % 2;
        String str = this.f2731;
        int i5 = i3 + 7;
        f2725 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m2569() {
        int i = 2 % 2;
        int i2 = f2726 + 123;
        f2725 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2728;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    protected final String m2576() {
        int i = 2 % 2;
        int i2 = f2725 + 85;
        int i3 = i2 % 128;
        f2726 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f2727;
        int i4 = i3 + 73;
        f2725 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m2568() {
        int i = 2 % 2;
        int i2 = f2725 + 13;
        int i3 = i2 % 128;
        f2726 = i3;
        int i4 = i2 % 2;
        String str = this.f2730;
        int i5 = i3 + 107;
        f2725 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2574() {
        int i = 2 % 2;
        int i2 = f2725 + 23;
        int i3 = i2 % 128;
        f2726 = i3;
        int i4 = i2 % 2;
        this.f2729 = false;
        int i5 = i3 + 11;
        f2725 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public String mo2571() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2566()).append(this.f2731).append(m2570(new int[]{-1089640839, -528447266}, 1 - (KeyEvent.getMaxKeyCode() >> 16)).intern()).append(this.f2728).append(m2570(new int[]{809452808, -867731857}, 1 - TextUtils.getOffsetBefore("", 0)).intern()).append(m2570(new int[]{-441626328, -191505468}, KeyEvent.normalizeMetaState(0) + 3).intern()).append(m2570(new int[]{809452808, -867731857}, View.MeasureSpec.getMode(0) + 1).intern()).append(this.f2727).append(m2570(new int[]{809452808, -867731857}, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).append(this.f2730).toString();
        int i2 = f2725 + 83;
        f2726 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    protected final String m2573(String str) {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2566()).append(m2572()).append(m2570(new int[]{-1089640839, -528447266}, (ViewConfiguration.getTapTimeout() >> 16) + 1).intern()).append(m2570(new int[]{-441626328, -191505468}, ((byte) KeyEvent.getModifierMetaStateMask()) + 4).intern()).append(m2570(new int[]{-1089640839, -528447266}, -MotionEvent.axisFromString("")).intern()).append(str).append(m2570(new int[]{-1089640839, -528447266}, 1 - ExpandableListView.getPackedPositionType(0L)).intern()).append(m2569()).append(m2570(new int[]{809452808, -867731857}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()).append(m2570(new int[]{-441626328, -191505468}, TextUtils.lastIndexOf("", '0', 0) + 4).intern()).append(m2570(new int[]{809452808, -867731857}, 1 - View.MeasureSpec.getMode(0)).intern()).append(m2576()).append(m2570(new int[]{809452808, -867731857}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern()).append(m2568()).toString();
        int i2 = f2725 + 75;
        f2726 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2575() {
        int i = 2 % 2;
        int i2 = f2725 + 45;
        f2726 = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = mo2571().replace(m2570(new int[]{-1089640839, -528447266}, 1 - Color.blue(0)).intern(), m2570(new int[]{809452808, -867731857}, 1 - View.resolveSizeAndState(0, 0, 0)).intern());
        int i4 = f2726 + 37;
        f2725 = i4 % 128;
        if (i4 % 2 == 0) {
            return strReplace;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m2566() {
        int i = 2 % 2;
        int i2 = f2725 + 97;
        f2726 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2570(new int[]{666490969, -1984877862, -801838567, 1479514256, -1089640839, -528447266}, View.MeasureSpec.getSize(0) + 9).intern();
        String strM2567 = m2567();
        if (this.f2729) {
            int i4 = f2725 + 13;
            f2726 = i4 % 128;
            int i5 = i4 % 2;
            if (!TextUtils.isEmpty(strM2567)) {
                return new StringBuilder().append(strIntern).append(m2570(new int[]{-677313015, 1179221312}, TextUtils.lastIndexOf("", '0') + 5).intern()).append(strM2567).append(m2570(new int[]{-1089640839, -528447266}, 1 - KeyEvent.normalizeMetaState(0)).intern()).toString();
            }
        }
        return strIntern;
    }

    public static class e extends jc {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2735 = 42898;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2736;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2737;

        public e(String str, String str2) {
            super(str, m2578("ᒐ䲯\ueaf2鑂", ViewConfiguration.getFadingEdgeLength() >> 16, "揊욂\uf6e8魵", "\u0000\u0000\u0000\u0000", (char) (View.resolveSizeAndState(0, 0, 0) + 30198)).intern(), str2, m2578("㳤ă\ue8c8명鏂\udb56螚ꛕ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "頄㜘\uf300鱟", "\u0000\u0000\u0000\u0000", (char) TextUtils.getTrimmedLength("")).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2578(String str, int i, String str2, String str3, char c) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (g.f2155) {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                g.f2156 = 0;
                while (g.f2156 < length) {
                    int i2 = (g.f2156 + 2) % 4;
                    int i3 = (g.f2156 + 3) % 4;
                    g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                    cArr4[i3] = g.f2154;
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2737) ^ ((long) f2736)) ^ ((long) f2735));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final String f2732;

        public b(String str, String str2, String str3) {
            super(str, str2);
            this.f2732 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2571() {
            return m2573(this.f2732);
        }
    }

    public static class c extends jc {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2733 = 75;

        public c(String str, String str2) {
            super(str, m2577("\u0003\u0003\u0004\ufff8", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 182 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true, TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern(), str2, m2577("\u0010\f\u000bￋ\u0002\u000b\u0000\u0007", AndroidCharacter.getMirror('0') - ')', ImageFormat.getBitsPerPixel(0) + 175, false, KeyEvent.getDeadChar(0, 0) + 8).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2577(String str, int i, int i2, boolean z, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1919) {
                char[] cArr2 = new char[i3];
                com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i3) {
                    com.ironsource.adqualitysdk.sdk.i.e.f1920 = cArr[com.ironsource.adqualitysdk.sdk.i.e.f1921];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.e.f1921] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f1920 + i2);
                    int i4 = com.ironsource.adqualitysdk.sdk.i.e.f1921;
                    cArr2[i4] = (char) (cArr2[i4] - f2733);
                    com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                }
                if (i > 0) {
                    com.ironsource.adqualitysdk.sdk.i.e.f1918 = i;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - com.ironsource.adqualitysdk.sdk.i.e.f1918, com.ironsource.adqualitysdk.sdk.i.e.f1918);
                    System.arraycopy(cArr3, com.ironsource.adqualitysdk.sdk.i.e.f1918, cArr2, 0, i3 - com.ironsource.adqualitysdk.sdk.i.e.f1918);
                }
                if (z) {
                    char[] cArr4 = new char[i3];
                    com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i3) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.e.f1921] = cArr2[(i3 - com.ironsource.adqualitysdk.sdk.i.e.f1921) - 1];
                        com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final String f2734;

        public d(String str, String str2, String str3) {
            super(str, str2);
            this.f2734 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2571() {
            return m2573(this.f2734);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2570(int[] iArr, int i) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2724.clone();
            com.ironsource.adqualitysdk.sdk.i.c.f1231 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1];
                com.ironsource.adqualitysdk.sdk.i.c.f1232 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.c.f1232 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = i3;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = com.ironsource.adqualitysdk.sdk.i.c.m1414(i3) ^ com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5;
                com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.c.f1232 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                int i7 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1232 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1232;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1233 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1233;
                com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
