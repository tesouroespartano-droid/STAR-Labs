package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class jh {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2791 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2792 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2793 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2794 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2795 = 49;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static jh f2796;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2797 = {'x', 157, Typography.nbsp, 147, 146, 133, 166, 148, 153, '}', 154, 164, 165, 150, 159, Typography.pound, 132, Typography.section, 'v', 'Q', 152, 168, 137, 138, 156, 151, 135, 161, 170, Typography.copyright};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jl f2798;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2800 = new WeakHashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ih f2799 = new ih(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2614(View view, hh.e eVar) {
        int i = 2 % 2;
        int i2 = f2792 + 69;
        f2793 = i2 % 128;
        int i3 = i2 % 2;
        m2623(view, eVar);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = f2792 + 13;
        f2793 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m2615(jh jhVar, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = f2793 + 85;
        f2792 = i2 % 128;
        int i3 = i2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListenerM2626 = jhVar.m2626(viewGroup);
        int i4 = f2792 + 67;
        f2793 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return onLayoutChangeListenerM2626;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ViewGroup m2616(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = 2 % 2;
        int i2 = f2793 + 21;
        f2792 = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroupM2627 = m2627(viewGroup, viewGroup2);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = f2793 + 3;
        f2792 = i5 % 128;
        if (i5 % 2 != 0) {
            return viewGroupM2627;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m2618(jh jhVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f2792 + 27;
        f2793 = i2 % 128;
        int i3 = i2 % 2;
        jhVar.m2630(viewGroup, onLayoutChangeListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f2792 + 9;
        f2793 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m2621(jh jhVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f2793 + 5;
        f2792 = i2 % 128;
        int i3 = i2 % 2;
        jhVar.m2619(viewGroup, onLayoutChangeListener);
        int i4 = f2792 + 79;
        f2793 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m2622(jh jhVar, ih ihVar) {
        int i = 2 % 2;
        int i2 = f2792 + 85;
        f2793 = i2 % 128;
        int i3 = i2 % 2;
        jhVar.m2620(ihVar);
        int i4 = f2792 + 21;
        f2793 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m2624(jh jhVar, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f2793 + 33;
        f2792 = i2 % 128;
        int i3 = i2 % 2;
        jhVar.m2629(motionEvent);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f2792 + 95;
        f2793 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized jh m2628() {
        int i = 2 % 2;
        int i2 = f2793 + 29;
        f2792 = i2 % 128;
        int i3 = i2 % 2;
        if (f2796 == null) {
            f2796 = new jh();
            int i4 = f2793 + 99;
            f2792 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        return f2796;
    }

    private jh() {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2632() {
        int i = 2 % 2;
        int i2 = f2792 + 85;
        f2793 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f2798 == null) {
                this.f2798 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.jl
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo238(View view) {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jl
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo237(View view) {
                        if (!t.m2942().m2958()) {
                            if (view instanceof ViewGroup) {
                                ViewGroup viewGroupM2616 = (ViewGroup) view;
                                if (viewGroupM2616.getContext() instanceof Activity) {
                                    viewGroupM2616 = jh.m2616(viewGroupM2616, (ViewGroup) ((Activity) viewGroupM2616.getContext()).findViewById(R.id.content));
                                }
                                jh jhVar = jh.this;
                                jh.m2618(jhVar, viewGroupM2616, jh.m2615(jhVar, viewGroupM2616));
                                return;
                            }
                            return;
                        }
                        jh.this.m2631();
                    }
                };
                ji.m2641().m2644(this.f2798);
            }
            int i3 = f2792 + 53;
            f2793 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        r2 = 2 % 2;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m2631() {
        int i = 2 % 2;
        if (this.f2798 != null) {
            int i2 = f2793 + 73;
            f2792 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = f2792 + InterfaceC0280i1.d.b.g;
            f2793 = i4 % 128;
            if (i4 % 2 != 0) {
                for (RelativeLayout relativeLayout : this.f2800.keySet()) {
                    int i5 = f2792 + 75;
                    f2793 = i5 % 128;
                    int i6 = i5 % 2;
                    ViewParent parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(relativeLayout);
                        int i7 = f2793 + 77;
                        f2792 = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = 2 % 2;
                    }
                }
                this.f2800.clear();
                ji.m2641().m2643(this.f2798);
                this.f2798 = null;
            } else {
                int i10 = 2 % 2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ih m2633() {
        int i = 2 % 2;
        int i2 = f2792 + 31;
        f2793 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f2799;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m2620(ih ihVar) {
        int i = 2 % 2;
        int i2 = f2793;
        int i3 = i2 + 59;
        f2792 = i3 % 128;
        int i4 = i3 % 2;
        this.f2799 = ihVar;
        int i5 = i2 + InterfaceC0280i1.d.b.d;
        f2792 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ViewGroup m2627(ViewGroup viewGroup, ViewGroup viewGroup2) {
        ViewGroup viewGroup3;
        int i = 2 % 2;
        if (viewGroup2 == null) {
            return viewGroup;
        }
        ViewGroup viewGroup4 = viewGroup2;
        while (viewGroup2 != null) {
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                int i2 = f2793 + 45;
                f2792 = i2 % 128;
                if (i2 % 2 == 0) {
                    viewGroup3 = (ViewGroup) parent;
                    int i3 = 55 / 0;
                } else {
                    viewGroup3 = (ViewGroup) parent;
                }
                viewGroup4 = viewGroup2;
                viewGroup2 = viewGroup3;
            } else {
                if (viewGroup4 == viewGroup2) {
                    int i4 = f2793 + 49;
                    f2792 = i4 % 128;
                    int i5 = i4 % 2;
                    return viewGroup2;
                }
                int i6 = f2793 + 69;
                f2792 = i6 % 128;
                if (i6 % 2 != 0) {
                    return viewGroup4;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        return viewGroup2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m2626(final ViewGroup viewGroup) {
        int i = 2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.2

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f2802 = 183;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2803 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2804;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = f2804 + 43;
                f2803 = i11 % 128;
                if (i11 % 2 != 0) {
                    if (t.m2942().m2958()) {
                        return;
                    }
                    try {
                        jh.m2618(jh.this, viewGroup, this);
                        int i12 = f2803 + 97;
                        f2804 = i12 % 128;
                        int i13 = i12 % 2;
                        return;
                    } catch (Throwable th) {
                        jz.m2766(m2634("￼\t\u0006￡\uffff�\u0003\u0010\f\uffff￭\f\uffff\b\uffff\u000e\r\u0003￦\u0002�\u000f\t￮\u0006\ufffb", 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 286 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 26 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m2634("\u0000\u0007￢\u0013\u0014\u000e\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0006\r", 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 280, true, 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
                        return;
                    }
                }
                t.m2942().m2958();
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2634(String str, int i2, int i3, boolean z, int i4) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (e.f1919) {
                    char[] cArr2 = new char[i4];
                    e.f1921 = 0;
                    while (e.f1921 < i4) {
                        e.f1920 = cArr[e.f1921];
                        cArr2[e.f1921] = (char) (e.f1920 + i3);
                        int i5 = e.f1921;
                        cArr2[i5] = (char) (cArr2[i5] - f2802);
                        e.f1921++;
                    }
                    if (i2 > 0) {
                        e.f1918 = i2;
                        char[] cArr3 = new char[i4];
                        System.arraycopy(cArr2, 0, cArr3, 0, i4);
                        System.arraycopy(cArr3, 0, cArr2, i4 - e.f1918, e.f1918);
                        System.arraycopy(cArr3, e.f1918, cArr2, 0, i4 - e.f1918);
                    }
                    if (z) {
                        char[] cArr4 = new char[i4];
                        e.f1921 = 0;
                        while (e.f1921 < i4) {
                            cArr4[e.f1921] = cArr2[(i4 - e.f1921) - 1];
                            e.f1921++;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        };
        int i2 = f2792 + 117;
        f2793 = i2 % 128;
        int i3 = i2 % 2;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2630(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f2792;
        int i3 = i2 + 3;
        f2793 = i3 % 128;
        int i4 = i3 % 2;
        if (viewGroup != null) {
            int i5 = i2 + 105;
            f2793 = i5 % 128;
            int i6 = i5 % 2;
            if (m2625(viewGroup)) {
                return;
            }
            Activity activityM2841 = kh.m2841(viewGroup);
            if (jm.m2667().m2669(activityM2841)) {
                if (viewGroup.findViewById(160766228) == null) {
                    int i7 = f2792 + 19;
                    f2793 = i7 % 128;
                    int i8 = i7 % 2;
                    m2617(viewGroup, onLayoutChangeListener);
                    return;
                }
                return;
            }
            if (jm.m2667().m2670(activityM2841)) {
                m2619(viewGroup, onLayoutChangeListener);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2617(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jh.m2624(jh.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2800.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2619(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        final hh.e eVar = new hh.e() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.3
            @Override // com.ironsource.adqualitysdk.sdk.i.hh.e
            /* JADX INFO: renamed from: ﾒ */
            public final boolean mo1812(hh hhVar, View view, MotionEvent motionEvent) {
                jh.m2624(jh.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.6
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                jh.m2614(viewGroup, eVar);
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ViewGroup) {
                        jh.m2621(jh.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jh.m2614(childAt, eVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i2 = f2793 + 3;
        f2792 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2623(View view, hh.e eVar) {
        int i = 2 % 2;
        int i2 = f2792 + 57;
        f2793 = i2 % 128;
        int i3 = i2 % 2;
        jy.m2751(view, eVar);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = f2792 + 115;
        f2793 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2629(MotionEvent motionEvent) {
        int i = 2 % 2;
        Object obj = null;
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.9

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static byte[] f2816 = {Ascii.ETB, -97, 71, 78, -103, -112, -81, 60, -112, 74, -108, 76, -100, -105, -96, 57, -104, 51, -101, -90, 53, -106, 66, 78, -98, 120, 46, -108, 65, 32, -23, 46, -52, 44, -30, -30, 45, -36, -33, -21, -100, -118, -24, 49, 54, -31, -22, -99, 117, 48, -88, -117, 56, -31, -88, 123, 56, 72, -22, -29, -35, 57, 44, -115, -117, -31, -26, 72, -50, -94, 119, -30, 73, -31, -44, -1, 102, -2, Ascii.CR, -125, -38, -126, -123, -30, -23, 57, 46, -125, 55, Ascii.SUB, 125, -21, -128, -101};

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f2817 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f2818 = 1;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static short[] f2819 = null;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f2820 = -918987659;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f2821 = 3;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f2822 = -1694066162;

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    int i2 = 2 % 2;
                    int i3 = f2817 + 15;
                    f2818 = i3 % 128;
                    Object obj2 = null;
                    try {
                        if (i3 % 2 != 0) {
                            try {
                                int iRound = Math.round(motionEventObtain.getRawX());
                                int iRound2 = Math.round(motionEventObtain.getRawY());
                                if (jx.m2743(iRound, iRound2)) {
                                    jh.m2622(jh.this, new ih(iRound, iRound2, jv.m2711(), jv.m2715()));
                                    int i4 = f2818 + 21;
                                    f2817 = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                n.m2887(m2635((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1694066162, (byte) (45 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 4, 918987730 - KeyEvent.normalizeMetaState(0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 112)).intern(), new StringBuilder().append(m2635(1694066188 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (84 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) - 4, 918987742 - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (116 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()).append(iRound).append(m2635(1694066237 - View.MeasureSpec.getMode(0), (byte) (Drawable.resolveOpacity(0, 0) - 58), Color.argb(0, 0, 0, 0) - 4, 918987703 - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((-52) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern()).append(iRound2).append(m2635((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1694066238, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 4, 918987785 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7)).intern()).toString());
                                return;
                            } catch (Throwable th) {
                                th = th;
                                jz.m2766(m2635((ViewConfiguration.getFadingEdgeLength() >> 16) + 1694066162, (byte) (46 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-4) - TextUtils.getCapsMode("", 0, 0), ImageFormat.getBitsPerPixel(0) + 918987731, (short) (Color.rgb(0, 0, 0) + 16777104)).intern(), m2635(KeyEvent.getDeadChar(0, 0) + 1694066240, (byte) ((-54) - TextUtils.lastIndexOf("", '0', 0, 0)), (-4) - KeyEvent.normalizeMetaState(0), 918987728 - KeyEvent.getDeadChar(0, 0), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 74)).intern(), th, false);
                                return;
                            }
                        }
                        jx.m2743(Math.round(motionEventObtain.getRawX()), Math.round(motionEventObtain.getRawY()));
                        super.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m2635(int i2, byte b, int i3, int i4, short s) {
                    String string;
                    synchronized (l.f2999) {
                        StringBuilder sb = new StringBuilder();
                        int i5 = f2821;
                        int i6 = i3 + i5;
                        int i7 = i6 == -1 ? 1 : 0;
                        if (i7 != 0) {
                            byte[] bArr = f2816;
                            if (bArr != null) {
                                i6 = (byte) (bArr[f2822 + i2] + i5);
                            } else {
                                i6 = (short) (f2819[f2822 + i2] + i5);
                            }
                        }
                        if (i6 > 0) {
                            l.f3000 = ((i2 + i6) - 2) + f2822 + i7;
                            l.f3002 = b;
                            l.f3004 = (char) (i4 + f2820);
                            sb.append(l.f3004);
                            l.f3003 = l.f3004;
                            l.f3001 = 1;
                            while (l.f3001 < i6) {
                                byte[] bArr2 = f2816;
                                if (bArr2 != null) {
                                    int i8 = l.f3000;
                                    l.f3000 = i8 - 1;
                                    l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i8] + s)) ^ l.f3002));
                                } else {
                                    short[] sArr = f2819;
                                    int i9 = l.f3000;
                                    l.f3000 = i9 - 1;
                                    l.f3004 = (char) (l.f3003 + (((short) (sArr[i9] + s)) ^ l.f3002));
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
            });
            int i2 = f2793 + 59;
            f2792 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2613(null, 127 - (Process.myPid() >> 22), null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2613(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u0098\u0096\u0085\u0090\u0094\u0090\u0083\u0094\u0097\u0096\u0085\u0090\u0094\u0089\u0088\u0087\u0083\u008d\u0094\u0095\u008f\u008b\u008d\u008d\u008e\u0095\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2625(ViewGroup viewGroup) {
        int i = 2 % 2;
        try {
            if (viewGroup.getChildCount() != 0) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    if (!(viewGroup.getChildAt(i2) instanceof TextView)) {
                        int i3 = f2792 + 99;
                        f2793 = i3 % 128;
                        return i3 % 2 != 0;
                    }
                }
                return true;
            }
            int i4 = f2793 + 15;
            f2792 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        } catch (Throwable th) {
            n.m2873(m2613(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2613(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u008c\u0096\u008e\u008b\u009b\u008d\u009e\u008e\u0086\u0094\u009d\u0082\u008f\u0083\u0094\u008c\u008f\u008b\u0085\u008d\u008f\u0083\u0088\u0094\u009c\u0087\u0083\u0090\u0081\u0096\u008e\u008b\u009b\u0094\u009a\u008b\u0094\u0095\u008f\u008b\u0099\u0088\u008e\u0089\u0088\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2613(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2797;
            int i2 = f2795;
            if (f2791) {
                int length = bArr.length;
                m.f3005 = length;
                char[] cArr3 = new char[length];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i] - i2);
                    m.f3006++;
                }
                return new String(cArr3);
            }
            if (f2794) {
                int length2 = cArr.length;
                m.f3005 = length2;
                char[] cArr4 = new char[length2];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                    m.f3006++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3005 = length3;
            char[] cArr5 = new char[length3];
            m.f3006 = 0;
            while (m.f3006 < m.f3005) {
                cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                m.f3006++;
            }
            return new String(cArr5);
        }
    }
}
