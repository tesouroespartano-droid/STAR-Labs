package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hp extends ho {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private int f2362;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2363;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2364 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Class f2365;

    public hp() {
        super.mo2246();
        this.f2365 = null;
        this.f2362 = 0;
        this.f2363 = true;
        this.f2364.clear();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ho
    /* JADX INFO: renamed from: ﻐ */
    protected final void mo2246() {
        super.mo2246();
        this.f2365 = null;
        this.f2362 = 0;
        this.f2363 = true;
        this.f2364.clear();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2259(Class cls) {
        this.f2365 = cls;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Class m2257() {
        return this.f2365;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final int m2255() {
        return this.f2362;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2256() {
        return this.f2363;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final List<Class> m2258() {
        return this.f2364;
    }

    public static class b extends ho.c implements ci {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2366 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2367 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2368 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2369 = 24376;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2370;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hp f2371 = new hp();

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final b m2268(Class cls) {
            int i = 2 % 2;
            int i2 = f2366 + 87;
            f2368 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2371.f2365 = cls;
                int i3 = f2366 + 117;
                f2368 = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }
            this.f2371.f2365 = cls;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m2261(int i) {
            int i2 = 2 % 2;
            int i3 = f2368 + 25;
            f2366 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f2371.f2362 = i;
                int i4 = f2366 + 79;
                f2368 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f2371.f2362 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m2262(boolean z) {
            int i = 2 % 2;
            int i2 = f2366 + InterfaceC0280i1.d.b.b;
            f2368 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2371.f2363 = z;
                int i3 = f2368 + 107;
                f2366 = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }
            this.f2371.f2363 = z;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final b m2269(int i) {
            int i2 = 2 % 2;
            int i3 = f2366 + 83;
            f2368 = i3 % 128;
            int i4 = i3 % 2;
            hp hpVar = this.f2371;
            hpVar.f2361 = i | hpVar.f2361;
            int i5 = f2368 + 47;
            f2366 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final b m2266(int i) {
            hp hpVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = f2366 + 47;
            f2368 = i4 % 128;
            if (i4 % 2 != 0) {
                hpVar = this.f2371;
                i2 = i & hpVar.f2359;
            } else {
                hpVar = this.f2371;
                i2 = i | hpVar.f2359;
            }
            hpVar.f2359 = i2;
            int i5 = f2366 + 51;
            f2368 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m2263(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f2368 + 59;
            f2366 = i3 % 128;
            int i4 = i3 % 2;
            this.f2371.f2360 = z;
            this.f2371.f2358 = i;
            int i5 = f2368 + 67;
            f2366 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m2265(Class cls) {
            int i = 2 % 2;
            int i2 = f2368 + 59;
            f2366 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2371.f2364.add(cls);
                int i3 = 71 / 0;
            } else {
                this.f2371.f2364.add(cls);
            }
            int i4 = f2366 + InterfaceC0280i1.d.b.d;
            f2368 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m2260() {
            int i = 2 % 2;
            int i2 = f2368 + InterfaceC0280i1.d.b.g;
            f2366 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2371.mo2246();
                int i3 = f2368 + 15;
                f2366 = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }
            this.f2371.mo2246();
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hp m2267() {
            int i = 2 % 2;
            int i2 = f2366 + 45;
            f2368 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.f2371;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00c5  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo813(String str, List<Object> list, cl clVar) {
            int i = 2 % 2;
            byte b = 3;
            switch (str.hashCode()) {
                case -1347544616:
                    if (!str.equals(m2264("鵛戩耟\ue098ᮒ毾堐\ufddb潟\ueded\uf35a棅镰辔윜\ue135\ue69e둵", Gravity.getAbsoluteGravity(0, 0), "溋豖䶥삫", "\u0000\u0000\u0000\u0000", (char) (KeyEvent.normalizeMetaState(0) + 43853)).intern())) {
                        b = -1;
                    } else {
                        int i2 = f2368 + 123;
                        f2366 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b = 2;
                        }
                    }
                    break;
                case -923635536:
                    if (!str.equals(m2264("턷㋸哗袳\udf30ퟯꞩ\uf0b4‷䎼ᲂ葷霝", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 80361980, "ﭢ쨹栄ྪ", "\u0000\u0000\u0000\u0000", (char) (43625 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                        b = -1;
                    } else {
                        int i3 = f2368 + 17;
                        f2366 = i3 % 128;
                        int i4 = i3 % 2;
                        b = 0;
                    }
                    break;
                case -216533736:
                    b = !str.equals(m2264("덿\u074c\udc81▲齬ꙋ㯒䅺䷲ㅡ", KeyEvent.normalizeMetaState(0), "瓃事鑾ဦ", "\u0000\u0000\u0000\u0000", (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case 94094958:
                    if (str.equals(m2264("\ued0e\ue80b桮뢩놉", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1321667303, "\ue748윊빎柡", "\u0000\u0000\u0000\u0000", (char) (57790 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern())) {
                        int i5 = f2366 + 19;
                        f2368 = i5 % 128;
                        b = i5 % 2 == 0 ? (byte) 8 : (byte) 25;
                    } else {
                        b = -1;
                    }
                    break;
                case 108404047:
                    b = !str.equals(m2264("ఴ謪앧끲쳡", (-769111669) - View.MeasureSpec.makeMeasureSpec(0, 0), "譓⡉凒㵒", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21072)).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case 387034026:
                    if (!str.equals(m2264("\ue610짻逢뤐뀃\ue148鿓䂵\uee5c杋\ueb34쒺旽ⴇ⧻\u20f4澾\uf529", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "崕筞ℬ\ue32e", "\u0000\u0000\u0000\u0000", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 11809)).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 391966482:
                    if (!str.equals(m2264("⡲ႏ볂\ue30f磄朙\ue94fᗱꏤ莌瑸ꋱ귘粡ǧ磂헏灌㖃㰣Ꟊ", (-242287733) - Color.alpha(0), "讹軻ⷱ\ueb49", "\u0000\u0000\u0000\u0000", (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                        b = -1;
                    } else {
                        int i6 = f2366 + 125;
                        f2368 = i6 % 128;
                        if (i6 % 2 != 0) {
                            b = 5;
                        }
                    }
                    break;
                case 1067445448:
                    b = !str.equals(m2264("\uf82b爙睒䁲ꞷ쮓䴚꽑顄⳽ई喛缟滊ﱗ", ImageFormat.getBitsPerPixel(0) - 603982381, "퉴\ufff5珛囌", "\u0000\u0000\u0000\u0000", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52339)).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case 1423210564:
                    if (!str.equals(m2264("蚸駻\ud7ac잉㡭괟鄄ᇌ\uab6d銬ᣢ牱讔솳\uf76cꫨȄ㖼遪骫釮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1787527538, "軶瑾ꆕ驱", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b = -1;
                    } else {
                        int i7 = f2366 + 67;
                        f2368 = i7 % 128;
                        if (i7 % 2 == 0) {
                            b = 4;
                        } else {
                            b = 5;
                        }
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return m2268((Class) m1770(list, 0, Class.class));
                case 1:
                    return m2261(((Integer) m1770(list, 0, Integer.class)).intValue());
                case 2:
                    return m2262(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                case 3:
                    return m2269(((Integer) m1770(list, 0, Integer.class)).intValue());
                case 4:
                    return m2266(((Integer) m1770(list, 0, Integer.class)).intValue());
                case 5:
                    return m2263(((Boolean) m1770(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) m1770(list, 1, Integer.class)).intValue() : -1);
                case 6:
                    return m2265((Class) m1770(list, 0, Class.class));
                case 7:
                    return m2260();
                case 8:
                    hp hpVarM2267 = m2267();
                    int i8 = f2366 + 49;
                    f2368 = i8 % 128;
                    if (i8 % 2 == 0) {
                        return hpVarM2267;
                    }
                    throw null;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2264(String str, int i, String str2, String str3, char c) {
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
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2370) ^ ((long) f2367)) ^ ((long) f2369));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }
}
