package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hv extends ho {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private int f2395;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<Class> f2396 = new ArrayList();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2397;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Class f2398;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2399;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f2400;

    public hv() {
        mo2246();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ho
    /* JADX INFO: renamed from: ﻐ */
    protected final void mo2246() {
        super.mo2246();
        this.f2398 = null;
        this.f2400 = 0;
        this.f2397 = true;
        this.f2396.clear();
        this.f2399 = null;
        this.f2395 = -1;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m2309() {
        return this.f2398;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final int m2306() {
        return this.f2400;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2308() {
        return this.f2397;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final List<Class> m2307() {
        return this.f2396;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m2310() {
        return this.f2399;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final int m2305() {
        return this.f2395;
    }

    public static class a extends ho.c implements ci {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2401 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2402 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2403 = 63143;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2404 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2405 = 46;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2406;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private hv f2407 = new hv();

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m2316(Class cls) {
            int i = 2 % 2;
            int i2 = f2402 + 91;
            f2401 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.f2407.f2398 = cls;
                int i3 = f2402 + 13;
                f2401 = i3 % 128;
                if (i3 % 2 == 0) {
                    return this;
                }
                super.hashCode();
                throw null;
            }
            this.f2407.f2398 = cls;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m2315(int i) {
            int i2 = 2 % 2;
            int i3 = f2402 + 81;
            f2401 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2407.f2400 = i;
                return this;
            }
            this.f2407.f2400 = i;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2321(boolean z) {
            int i = 2 % 2;
            int i2 = f2401 + 55;
            f2402 = i2 % 128;
            int i3 = i2 % 2;
            this.f2407.f2397 = z;
            int i4 = f2402 + 3;
            f2401 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2319(int i) {
            int i2 = 2 % 2;
            int i3 = f2402 + 75;
            f2401 = i3 % 128;
            int i4 = i3 % 2;
            hv hvVar = this.f2407;
            hvVar.f2361 = i | hvVar.f2361;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m2313(int i) {
            hv hvVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = f2402 + 19;
            f2401 = i4 % 128;
            if (i4 % 2 != 0) {
                hvVar = this.f2407;
                i2 = i & hvVar.f2359;
            } else {
                hvVar = this.f2407;
                i2 = i | hvVar.f2359;
            }
            hvVar.f2359 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2323(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f2402 + 87;
            f2401 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f2407.f2360 = z;
                this.f2407.f2358 = i;
                int i4 = 17 / 0;
            } else {
                this.f2407.f2360 = z;
                this.f2407.f2358 = i;
            }
            int i5 = f2401 + 87;
            f2402 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2320(Class cls) {
            int i = 2 % 2;
            int i2 = f2402 + InterfaceC0280i1.d.b.g;
            f2401 = i2 % 128;
            int i3 = i2 % 2;
            this.f2407.f2396.add(cls);
            int i4 = f2402 + 63;
            f2401 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2322(List<Class> list) {
            int i = 2 % 2;
            int i2 = f2402 + 83;
            f2401 = i2 % 128;
            int i3 = i2 % 2;
            this.f2407.f2399 = list;
            int i4 = f2402 + 59;
            f2401 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m2311(int i) {
            int i2 = 2 % 2;
            int i3 = f2402 + 55;
            f2401 = i3 % 128;
            int i4 = i3 % 2;
            this.f2407.f2395 = i;
            int i5 = f2402 + 89;
            f2401 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2318() {
            int i = 2 % 2;
            int i2 = f2402 + 59;
            f2401 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2407.mo2246();
                return this;
            }
            this.f2407.mo2246();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private hv m2312() {
            int i = 2 % 2;
            int i2 = f2402 + 11;
            int i3 = i2 % 128;
            f2401 = i3;
            int i4 = i2 % 2;
            hv hvVar = this.f2407;
            int i5 = i3 + 39;
            f2402 = i5 % 128;
            if (i5 % 2 != 0) {
                return hvVar;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009f  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo813(String str, List<Object> list, cl clVar) {
            int i = 2 % 2;
            while (true) {
                int i2 = 5;
                i2 = -1;
                switch (str.hashCode()) {
                    case -2020212392:
                        i2 = 8;
                        if (!str.equals(m2317("\ufffe￬\uffff\u000e\u000f\f\b￮\u0013\n\uffff￮\t￣\u0001\b\t\f\uffff\ufffb\ufffe", 19 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") + 148, false, 21 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        }
                        break;
                    case -600792781:
                        i2 = 3;
                        if (!str.equals(m2317("\u0000\u0002\n\n\ufffb\u0006\uffff\u000b￼￤\u0007", ExpandableListView.getPackedPositionGroup(0L) + 3, 152 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, Process.getGidForName("") + 12).intern())) {
                        }
                        break;
                    case 94094958:
                        if (str.equals(m2314("芧ඨ\u20ca淕↣", (-1372035214) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "爻㡧\uefae윮", "\u0000\u0000\u0000\u0000", (char) (12014 - ImageFormat.getBitsPerPixel(0))).intern())) {
                            i2 = 10;
                        }
                        break;
                    case 108404047:
                        if (str.equals(m2317("\ufff8\u0007\u0005\ufff8\u0006", (KeyEvent.getMaxKeyCode() >> 16) + 2, 154 - ((byte) KeyEvent.getModifierMetaStateMask()), false, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            int i3 = f2402 + 59;
                            int i4 = i3 % 128;
                            f2401 = i4;
                            int i5 = i3 % 2 != 0 ? 78 : 9;
                            int i6 = i4 + 1;
                            f2402 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = i5;
                        }
                        break;
                    case 132643084:
                        if (str.equals(m2317("\uffe7\u000e\u0006\ufffb\ufffe\u000b￨\uffff￩\ufffa\u000b\ufffa\u0006\ufffe\r\ufffe\u000b\f\f\ufffe\r", 17 - TextUtils.indexOf((CharSequence) "", '0', 0), AndroidCharacter.getMirror('0') + 'e', false, Drawable.resolveOpacity(0, 0) + 21).intern())) {
                            i2 = 2;
                        }
                        break;
                    case 200590504:
                        if (str.equals(m2314("䱞죆䆣왯ꚳ逹䐔몵\ud97bרּῳퟬ眊\uf74d毙갸㙒⩾龰掩眍蠡紩\ue72a", View.combineMeasuredStates(0, 0), "ᎁ蕎鳐५", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                            int i8 = f2402 + 13;
                            f2401 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 4;
                        }
                        break;
                    case 387034026:
                        if (str.equals(m2317("\u000b\u000b\ufff9\u0004\ufffb\n�\b\r￫\u0006￡\u0000\ufffb\n\ufff9�\u000b", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 151 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 18 - TextUtils.getOffsetBefore("", 0)).intern())) {
                            i2 = 7;
                        }
                        break;
                    case 391966482:
                        if (str.equals(m2317("\u0000￼\uffff\uffff￨\n\uffff\u0004\u0001\u0004\u0000\r\u000e\uffef\n￤\t\ufffe\u0007\u0010\uffff", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 147 - KeyEvent.keyCodeFromString(""), false, View.MeasureSpec.getMode(0) + 21).intern())) {
                        }
                        break;
                    case 393987200:
                        if (str.equals(m2314("컠顾騈蜭Ƙ祲씼钔ב蘝㻎\uee4d갰㳭聝㣥Ɲ䥉砹", (-543153994) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "땑ꀠ쇟쩦", "\u0000\u0000\u0000\u0000", (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26305)).intern())) {
                            i2 = 0;
                        }
                        break;
                    case 1423210564:
                        if (str.equals(m2314("諀\uf0fb\ud83e鬗ᩥ儵졔┒䩹궗⢱흮뙌ꭾ廹鳓Ӗ\ue831宰玀셖", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 533908877, "赈틍䄟鉀", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern())) {
                            int i10 = f2402 + 13;
                            f2401 = i10 % 128;
                            int i11 = i10 % 2;
                            i2 = 6;
                        }
                        break;
                    case 1773646829:
                        if (str.equals(m2314("\uefec쌛펻茳샰☦ꎣ懺ꕤ\ue12b\udaaeଭ忕搫ڏẍ\uef28꩜", KeyEvent.normalizeMetaState(0), "腶걽㾄⁚", "\u0000\u0000\u0000\u0000", (char) (Color.red(0) + 23103)).intern())) {
                            int i12 = f2402 + 55;
                            f2401 = i12 % 128;
                            if (i12 % 2 == 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                        }
                        break;
                    default:
                        break;
                }
                switch (i2) {
                    case 0:
                        return m2316((Class) m1770(list, 0, Class.class));
                    case 1:
                        return m2322((List) m1770(list, 0, List.class));
                    case 2:
                        return m2311(((Integer) m1770(list, 0, Integer.class)).intValue());
                    case 3:
                        return m2315(((Integer) m1770(list, 0, Integer.class)).intValue());
                    case 4:
                        return m2321(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    case 5:
                        return m2319(((Integer) m1770(list, 0, Integer.class)).intValue());
                    case 6:
                        return m2313(((Integer) m1770(list, 0, Integer.class)).intValue());
                    case 7:
                        return m2323(((Boolean) m1770(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) m1770(list, 1, Integer.class)).intValue() : -1);
                    case 8:
                        return m2320((Class) m1770(list, 0, Class.class));
                    case 9:
                        return m2318();
                    case 10:
                        return m2312();
                    default:
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2314(String str, int i, String str2, String str3, char c) {
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
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2404) ^ ((long) f2406)) ^ ((long) f2403));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2317(String str, int i, int i2, boolean z, int i3) {
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
                    cArr2[i4] = (char) (cArr2[i4] - f2405);
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
    }
}
