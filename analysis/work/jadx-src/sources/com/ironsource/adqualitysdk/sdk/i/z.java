package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends w<View> implements View.OnLayoutChangeListener, jl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3221 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3222;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f3223 = {-936124325, -429301749, 1587904343, -1646957672, -1825120333, 1828448452, -1641942505, 415525282, -1821131354, -1678301056, -1174214818, 1692989309, 580293731, 290654761, -1839514707, -2012321982, -1784298504, 1164244008};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private b f3224;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f3225;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Class f3226;

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻛ */
    final /* synthetic */ View mo2981(View view) {
        int i = 2 % 2;
        int i2 = f3222 + 99;
        f3221 = i2 % 128;
        int i3 = i2 % 2;
        View viewM3066 = m3066(view);
        int i4 = f3222 + 39;
        f3221 = i4 % 128;
        int i5 = i4 % 2;
        return viewM3066;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ｋ */
    final /* synthetic */ void mo2987(View view, List list) {
        int i = 2 % 2;
        int i2 = f3221 + 15;
        f3222 = i2 % 128;
        int i3 = i2 % 2;
        m3072(view, (List<WebView>) list);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f3222 + 9;
        f3221 = i4 % 128;
        int i5 = i4 % 2;
    }

    z(JSONObject jSONObject) {
        super(null);
        this.f3225 = new WeakHashMap<>();
        this.f3224 = new b(this);
        m3073(jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3073(JSONObject jSONObject) {
        int i = 2 % 2;
        b bVar = new b(this, jSONObject);
        m2982((w.c) bVar);
        this.f3224 = bVar;
        try {
            this.f3226 = Class.forName(b.m3082(bVar));
            int i2 = f3222;
            int i3 = i2 + 121;
            f3221 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            f3221 = i5 % 128;
            int i6 = i5 % 2;
            m3071();
        } catch (ClassNotFoundException e) {
            n.m2867(m3068(new int[]{1774542837, 1337213491, 2103622899, -541067582, 1982247626, -1882316141, -1364561968, 1154917493, -1534329770, -941141631}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new StringBuilder().append(m3068(new int[]{-394664256, 729384165, -1648201497, -1037176846, -499898293, 1577975623, 1001332453, -1252410017, 707559790, -1379984151, -855023639, -461553979, 472952935, -1235856206, 564566076, 1857319086}, AndroidCharacter.getMirror('0') - 17).intern()).append(b.m3082(bVar)).append(m3068(new int[]{183345959, 740760091}, 2 - View.combineMeasuredStates(0, 0)).intern()).append(e.getLocalizedMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m3071() {
        int i = 2 % 2;
        int i2 = f3222 + 61;
        f3221 = i2 % 128;
        int i3 = i2 % 2;
        ji.m2641().m2644(this);
        int i4 = f3221 + 31;
        f3222 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3074() {
        int i = 2 % 2;
        int i2 = f3222 + 29;
        f3221 = i2 % 128;
        if (i2 % 2 != 0) {
            m2975((r) null);
            ji.m2641().m2643(this);
        } else {
            m2975((r) null);
            ji.m2641().m2643(this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static View m3066(View view) {
        int i = 2 % 2;
        int i2 = f3221 + 113;
        int i3 = i2 % 128;
        f3222 = i3;
        if (i2 % 2 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = i3 + 73;
        f3221 = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻐ */
    final r<WebView, View> mo2980() {
        int i = 2 % 2;
        int i2 = f3222;
        int i3 = i2 + 53;
        f3221 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 95;
        f3221 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ｋ */
    final ac mo2984() {
        int i = 2 % 2;
        ad adVar = new ad();
        int i2 = f3222 + 73;
        f3221 = i2 % 128;
        int i3 = i2 % 2;
        return adVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻐ */
    public final void mo237(View view) {
        View viewM3067;
        int i = 2 % 2;
        int i2 = f3221 + 67;
        f3222 = i2 % 128;
        if (i2 % 2 == 0) {
            View viewM3070 = m3070(view, this.f3226);
            if (viewM3070 != null) {
                m3069(viewM3070);
                return;
            }
            if (TextUtils.isEmpty(b.m3078(this.f3224)) || (viewM3067 = m3067(view, b.m3078(this.f3224))) == null) {
                return;
            }
            int i3 = f3222 + 93;
            f3221 = i3 % 128;
            if (i3 % 2 == 0) {
                viewM3067.addOnLayoutChangeListener(this);
                int i4 = 30 / 0;
            } else {
                viewM3067.addOnLayoutChangeListener(this);
            }
            int i5 = f3222 + InterfaceC0280i1.d.b.b;
            f3221 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m3070(view, this.f3226);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﾒ */
    public final void mo238(View view) {
        int i = 2 % 2;
        int i2 = f3221 + 119;
        f3222 = i2 % 128;
        int i3 = i2 % 2;
        View viewM3070 = m3070(view, this.f3226);
        if (viewM3070 != null && this.f3225.remove(viewM3070) != null) {
            int i4 = f3222 + 23;
            f3221 = i4 % 128;
            int i5 = i4 % 2;
            mo2988(view);
            if (i5 == 0) {
                int i6 = 98 / 0;
            }
        }
        int i7 = f3221 + 21;
        f3222 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        try {
            View viewM3070 = m3070(view, this.f3226);
            if (viewM3070 != null) {
                int i10 = f3221 + 79;
                f3222 = i10 % 128;
                if (i10 % 2 != 0) {
                    m3069(viewM3070);
                    view.removeOnLayoutChangeListener(this);
                    int i11 = 8 / 0;
                } else {
                    m3069(viewM3070);
                    view.removeOnLayoutChangeListener(this);
                }
                int i12 = f3222 + 27;
                f3221 = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Throwable th) {
            jz.m2766(m3068(new int[]{1774542837, 1337213491, 2103622899, -541067582, 1982247626, -1882316141, -1364561968, 1154917493, -1534329770, -941141631}, 19 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m3068(new int[]{-394664256, 729384165, 84445327, 2025464463, -496505358, -1637184574, 1021492162, -1341947291, -1724939930, -162763990, -727476063, -1537505321}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23).intern(), th, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3069(View view) {
        int i = 2 % 2;
        int i2 = f3221 + InterfaceC0280i1.d.b.b;
        f3222 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
            if (!this.f3225.containsKey(view)) {
                int i4 = f3221 + 113;
                f3222 = i4 % 128;
                int i5 = i4 % 2;
                this.f3225.put(view, Boolean.TRUE);
                mo2986(view, Integer.toHexString(view.hashCode()));
            }
        } else if (!this.f3225.containsKey(view)) {
            int i6 = f3221 + 113;
            f3222 = i6 % 128;
            int i7 = i6 % 2;
            this.f3225.put(view, Boolean.TRUE);
            mo2986(view, Integer.toHexString(view.hashCode()));
        }
        int i8 = f3222 + 97;
        f3221 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private View m3070(View view, Class cls) {
        int i = 2 % 2;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            int i3 = f3221 + 87;
            f3222 = i3 % 128;
            int i4 = i3 % 2;
            View childAt = viewGroup.getChildAt(i2);
            if (!cls.isAssignableFrom(childAt.getClass())) {
                View viewM3070 = m3070(childAt, cls);
                if (viewM3070 != null) {
                    return viewM3070;
                }
            } else {
                int i5 = f3221 + 47;
                f3222 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 88 / 0;
                }
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View m3067(View view, String str) {
        int i = 2 % 2;
        int i2 = f3221 + 55;
        f3222 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = view instanceof ViewGroup;
            throw null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i3 = 0;
            while (i3 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getClass().getName().startsWith(str)) {
                    return childAt;
                }
                View viewM3067 = m3067(childAt, str);
                if (viewM3067 != null) {
                    int i4 = f3222 + 19;
                    f3221 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 96 / 0;
                    }
                    return viewM3067;
                }
                i3++;
                int i6 = f3222 + 63;
                f3221 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m3072(View view, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f3221 + 49;
        f3222 = i2 % 128;
        if (i2 % 2 != 0) {
            kh.m2835(view, WebView.class, b.m3076(this.f3224), false, false, null, this.f3224.f3140, list);
        } else {
            kh.m2835(view, WebView.class, b.m3076(this.f3224), true, false, null, this.f3224.f3140, list);
        }
        int i3 = f3221 + 119;
        f3222 = i3 % 128;
        int i4 = i3 % 2;
    }

    public class b extends w.c {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static short[] f3227 = null;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static int f3228 = 0;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static byte[] f3229 = {-84, -76, -69, 78, 79, -101, 126, -96, 78, -95, 70, 79, -68, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 76, -82, -60, -53, 62, Utf8.REPLACEMENT_BYTE, -21, Ascii.FS, 58, 60, Utf8.REPLACEMENT_BYTE, -56, -25, 35, Utf8.REPLACEMENT_BYTE, -52, 48, 48, 60, -90, -127, 65, 71, 86, 84, -101, 72, 90, 86, -87, -96, -93, 83, -85, 84, -74, 79, -79, -77, 65, 86, 90, -83, 37, 41, -34, 38, -58, 42, 46, Ascii.SO, -49, -46, -41, 44, -34, 35, -36, 35, -91, -24, -19, -10, Ascii.VT, -10, 54, -22, -19};

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f3230 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f3231 = 24285;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f3232 = 100;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f3233 = 2081592000;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f3234 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3235 = -786060752;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f3236;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3237;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3238;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3239;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ String m3076(b bVar) {
            int i = 2 % 2;
            int i2 = f3230;
            int i3 = i2 + 87;
            f3228 = i3 % 128;
            int i4 = i3 % 2;
            String str = bVar.f3239;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 41;
            f3228 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ String m3078(b bVar) {
            int i = 2 % 2;
            int i2 = f3230 + 29;
            int i3 = i2 % 128;
            f3228 = i3;
            int i4 = i2 % 2;
            String str = bVar.f3238;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 43;
            f3230 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ String m3082(b bVar) {
            int i = 2 % 2;
            int i2 = f3228;
            int i3 = i2 + 13;
            f3230 = i3 % 128;
            int i4 = i3 % 2;
            String str = bVar.f3237;
            if (i4 == 0) {
                int i5 = 13 / 0;
            }
            int i6 = i2 + 85;
            f3230 = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public b(z zVar) {
        }

        public b(z zVar, JSONObject jSONObject) {
            m3081(jSONObject.optString(m3080("ᘛ粫ᎄ飢㺟\uebea津債ഡ\ue96e䎝꿺╀嫩\uef68쎗粆蓄䏌ᴙ찪Ʈ", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, "깞ꦣ\uee18\udec7", "\u0000\u0000\u0000\u0000", (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()));
            m3075(jSONObject.optString(m3080("\ue59f\ueff1椂ᓧᐉ졂\u2432焿⩐Ⱓ왵썋되", 821714986 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "⤴褐⌰㘢", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8740)).intern()));
            m3077(jSONObject.optString(m3080("\ufb10㲩誅흻躊ዟ匣\uf80a╟鵟뛃켡놀ఢ扷泝", View.MeasureSpec.getSize(0), "ᨶ⯯軰쇵", "\u0000\u0000\u0000\u0000", (char) (62862 - TextUtils.getOffsetAfter("", 0))).intern()));
            m3006(jSONObject.optString(m3080("㑞鑒″崍嚒\ueae3畐\ueca1竺塧", ViewConfiguration.getKeyRepeatDelay() >> 16, "끃忨逆괚", "\u0000\u0000\u0000\u0000", (char) Color.argb(0, 0, 0, 0)).intern()));
            m3009(false);
            m3004(!TextUtils.isEmpty(jSONObject.optString(m3080("㑞鑒″崍嚒\ueae3畐\ueca1竺塧", View.resolveSizeAndState(0, 0, 0), "끃忨逆괚", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern())) || jSONObject.optBoolean(m3079(769283536 - Color.rgb(0, 0, 0), (byte) ((-79) - TextUtils.lastIndexOf("", '0')), View.resolveSize(0, 0) + (-101), (-2081591883) - Color.blue(0), (short) View.resolveSize(0, 0)).intern()) || jSONObject.optBoolean(m3079(786060768 - TextUtils.getOffsetAfter("", 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + (-63)), ExpandableListView.getPackedPositionChild(0L) + (-100), ((Process.getThreadPriority(0) + 20) >> 6) + (-2081591883), (short) ExpandableListView.getPackedPositionType(0L)).intern()));
            m3005(jSONObject.optBoolean(m3079((ViewConfiguration.getJumpTapTimeout() >> 16) + 786060752, (byte) (ExpandableListView.getPackedPositionGroup(0L) - 78), (-102) - Process.getGidForName(""), TextUtils.indexOf("", "", 0, 0) - 2081591883, (short) Color.argb(0, 0, 0, 0)).intern()));
            m3000(jSONObject.optBoolean(m3079((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 786060786, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 87), (-102) - TextUtils.lastIndexOf("", '0'), (-2081591883) - (Process.myPid() >> 22), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern()));
            m3007(TextUtils.isEmpty(jSONObject.optString(m3080("쩠\ued15㙙큧\uf029忯\ue9e4⯡\udba3", TextUtils.indexOf("", "", 0, 0) + (-1767397658), "\ue681Ꞧ\ude96㳿", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) ? null : Arrays.asList(jSONObject.optString(m3080("쩠\ued15㙙큧\uf029忯\ue9e4⯡\udba3", (-1767397657) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\ue681Ꞧ\ude96㳿", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getTouchSlop() >> 8)).intern()).split(m3080("뽆", View.combineMeasuredStates(0, 0) - 1071275691, "嗇□㓀矾", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 65075)).intern())));
            m3008(jSONObject.optBoolean(m3079(((byte) KeyEvent.getModifierMetaStateMask()) + 786060797, (byte) ((-92) - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "") - 101, ExpandableListView.getPackedPositionType(0L) - 2081591883, (short) TextUtils.getOffsetBefore("", 0)).intern(), true));
            m3010(false);
            m3002(jSONObject.optBoolean(m3079(786060808 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43), (-101) - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 2081591892, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern()));
            m3001(jSONObject.optBoolean(m3079((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 786060825, (byte) ((-23) - KeyEvent.normalizeMetaState(0)), (-101) - Drawable.resolveOpacity(0, 0), (-2081591896) - TextUtils.lastIndexOf("", '0'), (short) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()));
            m3003(kd.m2825(jSONObject.optJSONArray(m3080("Ꝯ㪨⧆삟\ue6a5㼷䐯篰㘖\ue832ꭜ酝ᘭ", 584338974 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "ᴟ푎✢\ue30c", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf("", "", 0) + 3111)).intern())));
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m3081(String str) {
            int i = 2 % 2;
            int i2 = f3228 + 67;
            f3230 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f3239 = str;
                return this;
            }
            this.f3239 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m3075(String str) {
            int i = 2 % 2;
            int i2 = f3228 + InterfaceC0280i1.d.b.d;
            int i3 = i2 % 128;
            f3230 = i3;
            int i4 = i2 % 2;
            this.f3237 = str;
            int i5 = i3 + 61;
            f3228 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 71 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m3077(String str) {
            int i = 2 % 2;
            int i2 = f3230 + 79;
            int i3 = i2 % 128;
            f3228 = i3;
            int i4 = i2 % 2;
            this.f3238 = str;
            int i5 = i3 + 77;
            f3230 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m3080(String str, int i, String str2, String str3, char c) {
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
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f3236) ^ ((long) f3234)) ^ ((long) f3231));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m3079(int i, byte b, int i2, int i3, short s) {
            String string;
            synchronized (l.f2999) {
                StringBuilder sb = new StringBuilder();
                int i4 = f3232;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f3229;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f3235 + i] + i4);
                    } else {
                        i5 = (short) (f3227[f3235 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    l.f3000 = ((i + i5) - 2) + f3235 + i6;
                    l.f3002 = b;
                    l.f3004 = (char) (i3 + f3233);
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001 = 1;
                    while (l.f3001 < i5) {
                        byte[] bArr2 = f3229;
                        if (bArr2 != null) {
                            int i7 = l.f3000;
                            l.f3000 = i7 - 1;
                            l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                        } else {
                            short[] sArr = f3227;
                            int i8 = l.f3000;
                            l.f3000 = i8 - 1;
                            l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                        }
                        sb.append(l.f3004);
                        l.f3003 = l.f3004;
                        l.f3001++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m3068(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3223.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
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
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
