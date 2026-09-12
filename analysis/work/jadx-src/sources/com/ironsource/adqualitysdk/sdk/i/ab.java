package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ab extends v<View, Activity> {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f61 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f62 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f63 = 86;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Class f66;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f68;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jl f69;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private it f72;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final Map<WebView, ac> f71 = new WeakHashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final Map<View, ab> f70 = new WeakHashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f64 = new WeakHashMap();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private b f65 = new b();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final List<View> f67 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ b m206(ab abVar) {
        int i = 2 % 2;
        int i2 = f62 + 87;
        int i3 = i2 % 128;
        f61 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        b bVar = abVar.f65;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 37;
        f62 = i5 % 128;
        if (i5 % 2 == 0) {
            return bVar;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m211(ab abVar) {
        int i = 2 % 2;
        int i2 = f61;
        int i3 = i2 + InterfaceC0280i1.d.b.d;
        f62 = i3 % 128;
        int i4 = i3 % 2;
        List<View> list = abVar.f67;
        int i5 = i2 + 83;
        f62 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m213(Activity activity, View view, Class cls, boolean z, List list, List list2, List list3) {
        int i = 2 % 2;
        int i2 = f61 + 31;
        f62 = i2 % 128;
        int i3 = i2 % 2;
        m218(activity, view, cls, z, list, list2, list3);
        int i4 = f62 + 71;
        f61 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m215(ab abVar) {
        int i = 2 % 2;
        int i2 = f62;
        int i3 = i2 + 63;
        f61 = i3 % 128;
        int i4 = i3 % 2;
        Map<View, View.OnLayoutChangeListener> map = abVar.f64;
        int i5 = i2 + 25;
        f61 = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m216(ab abVar) {
        int i = 2 % 2;
        int i2 = f61 + 95;
        f62 = i2 % 128;
        int i3 = i2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = abVar.f68;
        if (i3 == 0) {
            return onLayoutChangeListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Class m219(ab abVar) {
        int i = 2 % 2;
        int i2 = f61;
        int i3 = i2 + InterfaceC0280i1.d.b.d;
        f62 = i3 % 128;
        int i4 = i3 % 2;
        Class cls = abVar.f66;
        int i5 = i2 + 119;
        f62 = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m220(ab abVar, List list) {
        int i = 2 % 2;
        int i2 = f62 + 49;
        f61 = i2 % 128;
        int i3 = i2 % 2;
        abVar.m209((List<View>) list);
        int i4 = f61 + 63;
        f62 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    protected final /* synthetic */ String mo224(Activity activity) {
        int i = 2 % 2;
        int i2 = f61 + 83;
        f62 = i2 % 128;
        if (i2 % 2 != 0) {
            m214();
            throw null;
        }
        String strM214 = m214();
        int i3 = f62 + 43;
        f61 = i3 % 128;
        int i4 = i3 % 2;
        return strM214;
    }

    ab(JSONObject jSONObject, it itVar) {
        m225(jSONObject, itVar);
        m212();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m225(JSONObject jSONObject, it itVar) {
        int i = 2 % 2;
        this.f65 = new b(jSONObject);
        this.f72 = itVar;
        int i2 = f62 + 39;
        f61 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m212() {
        int i = 2 % 2;
        this.f68 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.4

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f79 = {2048096584, -677900136, -852682802, -24024217, 2098522926, 1472799782, 617671980, 1471921220, -1990376065, 1403428314, 1494668175, -1596240487, 50052469, -131077617, 1989243009, -1504877983, 202309799, -491820043};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f80 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f81 = 1;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = f81 + 33;
                f80 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    ab.this.m223(view);
                    int i13 = f80 + 35;
                    f81 = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Throwable th) {
                    jz.m2766(m236(new int[]{-2079667215, 515379220, -956269898, 1386414795, 1546153689, 725323579, -1970137554, -1843382010}, 14 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m236(new int[]{-1241753684, 567009090, -1780599870, 79304228, 1502248415, -569582728, -1709419407, -1822002403, -650558010, -1730927905, -933714456, -814261941}, KeyEvent.getDeadChar(0, 0) + 23).intern(), th, false);
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m236(int[] iArr, int i2) {
                String str;
                synchronized (c.f1230) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f79.clone();
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
        };
        this.f69 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.5
            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo237(View view) {
                view.addOnLayoutChangeListener(ab.m216(ab.this));
                ab.m215(ab.this).put(view, ab.m216(ab.this));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo238(View view) {
                view.removeOnLayoutChangeListener(ab.m216(ab.this));
                ab.m215(ab.this).remove(view);
            }
        };
        ji.m2641().m2644(this.f69);
        int i2 = f62 + 59;
        f61 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m226() {
        int i = 2 % 2;
        m2975((r) null);
        ji.m2641().m2643(this.f69);
        HashSet hashSet = new HashSet(this.f64.keySet());
        this.f64.clear();
        Iterator it = hashSet.iterator();
        int i2 = f62 + 55;
        f61 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = f61 + 15;
            f62 = i4 % 128;
            int i5 = i4 % 2;
            ((View) it.next()).removeOnLayoutChangeListener(this.f68);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m214() {
        int i = 2 % 2;
        int i2 = f62 + 19;
        int i3 = i2 % 128;
        f61 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i3 + 73;
        f62 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m223(final View view) {
        Activity activityM2841;
        int i = 2 % 2;
        try {
            if (this.f66 == null) {
                this.f66 = Class.forName(b.m265(this.f65));
            }
            final Activity activityMo2651 = jj.m2645().mo2651();
            if (activityMo2651 == null) {
                int i2 = f61 + 35;
                f62 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (!b.m255(this.f65).isEmpty()) {
                int i3 = f62 + 113;
                f61 = i3 % 128;
                if (i3 % 2 == 0) {
                    activityM2841 = kh.m2841(view);
                    int i4 = 31 / 0;
                    if (activityM2841 != null) {
                        if (b.m255(this.f65).contains(activityM2841.getClass().getName())) {
                            int i5 = f62 + 121;
                            f61 = i5 % 128;
                            int i6 = i5 % 2;
                            return;
                        }
                    }
                } else {
                    activityM2841 = kh.m2841(view);
                    if (activityM2841 != null) {
                        if (b.m255(this.f65).contains(activityM2841.getClass().getName())) {
                            int i7 = f62 + 121;
                            f61 = i7 % 128;
                            int i8 = i7 % 2;
                            return;
                        }
                    }
                }
            }
            p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo227() {
                    ab.m211(ab.this).clear();
                    ab.m213(activityMo2651, view, ab.m219(ab.this), b.m261(ab.m206(ab.this)), b.m258(ab.m206(ab.this)), b.m270(ab.m206(ab.this)), ab.m211(ab.this));
                    if (kh.m2830(view, ab.m219(ab.this), null, b.m258(ab.m206(ab.this)), b.m270(ab.m206(ab.this)))) {
                        ab.m211(ab.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(ab.m211(ab.this));
                    if (b.m250(ab.m206(ab.this))) {
                        p.m2897(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                ab.m220(ab.this, arrayList);
                            }
                        });
                    } else {
                        ab.m220(ab.this, arrayList);
                    }
                }
            });
        } catch (Throwable th) {
            n.m2887(m210("\u0014\uffde\u0001\u0010￥\ufffe\u000b\u0001\t\u0002\u000f\ufff3\u0006\u0002", 11 - Gravity.getAbsoluteGravity(0, 0), 185 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, (Process.myPid() >> 22) + 14).intern(), new StringBuilder().append(m210("\u0013\u0013￦\uffc1\u0014\u0014\u0002\r\u0004\uffc1\b\u000f\n\u0015\u0015\u0006\b\uffc1\u0013\u0010", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, 182 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 20 - View.MeasureSpec.getMode(0)).intern()).append(b.m265(this.f65)).append(m210("\t￼￼", 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 122 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern()).append(th.getLocalizedMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m209(List<View> list) {
        int i = 2 % 2;
        int i2 = f62 + 125;
        f61 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < list.size()) {
            m208(list.get(i4), this.f65);
            i4++;
            int i5 = f61 + 21;
            f62 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <E extends View> void m218(Activity activity, View view, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        int i = 2 % 2;
        int i2 = f62 + 85;
        int i3 = i2 % 128;
        f61 = i3;
        int i4 = i2 % 2;
        if (view != null) {
            int i5 = i3 + 61;
            f62 = i5 % 128;
            if (i5 % 2 != 0) {
                kh.m2840(view, cls, true, z, list, list2, list3);
                return;
            } else {
                kh.m2840(view, cls, false, z, list, list2, list3);
                return;
            }
        }
        kh.m2838(activity, cls, z, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m208(View view, b bVar) {
        int i = 2 % 2;
        if (m221(view)) {
            int i2 = f61 + 105;
            f62 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (b.m246(bVar)) {
                int i4 = f62 + 125;
                f61 = i4 % 128;
                int i5 = i4 % 2;
                if (this.f70.get(view) == null) {
                    this.f70.put(view, this);
                    mo234(new JSONObject(), view, null);
                    return;
                }
                if (b.m249(bVar)) {
                    mo234(new JSONObject(), view, null);
                }
                int i6 = f61 + 93;
                f62 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            ArrayList arrayList = new ArrayList();
            kh.m2840(view, WebView.class, false, b.m261(bVar), b.m258(bVar), b.m270(bVar), arrayList);
            if (view instanceof WebView) {
                int i8 = f61 + 57;
                f62 = i8 % 128;
                int i9 = i8 % 2;
                arrayList.add((WebView) view);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i10 = f61 + InterfaceC0280i1.d.b.d;
                f62 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f70.get((WebView) it.next());
                    super.hashCode();
                    throw null;
                }
                WebView webView = (WebView) it.next();
                if (this.f70.get(webView) == null && webView.getClass().getName().startsWith(b.m244(bVar))) {
                    aa aaVar = new aa();
                    this.f71.put(webView, aaVar);
                    aaVar.m290(b.m248(bVar), TextUtils.isEmpty(b.m243(bVar)) ? null : Arrays.asList(b.m243(bVar).split(m210("\u0000", Drawable.resolveOpacity(0, 0) + 1, Color.alpha(0) + 130, false, 1 - ExpandableListView.getPackedPositionType(0L)).intern())), b.m239(bVar), b.m240(bVar), b.m242(bVar));
                    aaVar.m2975(m207());
                    aaVar.m284(webView);
                    aaVar.m287(Integer.toHexString(webView.hashCode()));
                    this.f70.put(webView, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private r<WebView, Activity> m207() {
        int i = 2 % 2;
        ay.d dVar = new ay.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3
            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo228(JSONObject jSONObject, Object obj, Object obj2) {
                ab.this.mo228(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo229(JSONObject jSONObject, Object obj, Object obj2) {
                ab.this.mo229(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo230(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ab.this.mo230(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo231(JSONObject jSONObject, Object obj, Object obj2) {
                ab.this.mo231(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo232(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ab.this.mo232(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo233(JSONObject jSONObject, Object obj, Object obj2) {
                ab.this.mo233(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo234(JSONObject jSONObject, Object obj, Object obj2) {
                ab.this.mo234(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo235(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ab.this.mo235(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i2 = f62 + 105;
        f61 = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r6.f72.mo1680(r7) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r6.f72.mo1680(r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ab.f61 + 21;
        com.ironsource.adqualitysdk.sdk.i.ab.f62 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if ((r7 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m221(View view) {
        int i = 2 % 2;
        if (this.f72 == null) {
            int i2 = f62 + 69;
            f61 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        Object obj = null;
        if (m222(view, (List<String>) b.m241(this.f65))) {
            int i4 = f62 + 73;
            f61 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
        }
        int i6 = f61 + 9;
        f62 = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m222(View view, List<String> list) {
        int i = 2 % 2;
        if (list != null) {
            int i2 = f62 + 17;
            f61 = i2 % 128;
            if (i2 % 2 == 0) {
                list.isEmpty();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!list.isEmpty()) {
                int i3 = f62 + 31;
                f61 = i3 % 128;
                int i4 = i3 % 2;
                String name = view.getClass().getPackage().getName();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String strM217 = m217(it.next());
                    if (!TextUtils.isEmpty(strM217)) {
                        int i5 = f61 + 119;
                        f62 = i5 % 128;
                        int i6 = i5 % 2;
                        if (name.startsWith(strM217)) {
                            return true;
                        }
                    }
                    int i7 = f62 + 71;
                    f61 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 / 5;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m217(String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            int i2 = f62 + 9;
            f61 = i2 % 128;
            int i3 = i2 % 2;
            List listAsList = Arrays.asList(str.split(m210("\u000f\u0011￢", Color.alpha(0) + 1, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 162, true, 2 - MotionEvent.axisFromString("")).intern()));
            return listAsList.size() <= 3 ? str : TextUtils.join(m210("\u0000", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 132, false, -TextUtils.lastIndexOf("", '0', 0)).intern(), listAsList.subList(0, 3));
        }
        int i4 = f61 + 81;
        f62 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public class b {

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static int f84 = 0;

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f85 = 1;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private boolean f94;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f96;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f97;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f98;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f99;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f100;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f101;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f102;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f103;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f104;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f105;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static char[] f87 = {'2', ']', '_', 'g', 'n', ']', 'W', 'f', 'j', 's', '`', 'W', 'g', 'i', 'c', 128, 256, 248, 234, 234, 239, 232, 235, 243, 250, 233, 227, 246, 243, 245, 253, '9', 's', 'q', 'i', 'm', ']', 'X', 'l', 'V', 'R', 'i', 'i', '\\', '\\', 'd', 'j', 'p', 'j', 'i', 211, 220, 223, 224, 224, 223, 223, 216, 221, 212, 210, 205, 201, 219, 223, 225, 220, '3', 'j', 'n', 'p', 'k', 'm', 'o', 'g', 'n', 'u', 'c', 'a', '\\'};

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static char f86 = 22959;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static char f89 = 59480;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static char f88 = 9432;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static char f90 = 60522;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<Integer> f93 = new ArrayList();

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<String> f91 = new ArrayList();

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<String> f92 = new ArrayList();

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private List<String> f95 = new ArrayList();

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        static /* synthetic */ boolean m239(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + 107;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            boolean z = bVar.f99;
            if (i4 == 0) {
                super.hashCode();
                throw null;
            }
            int i5 = i3 + 115;
            f84 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        static /* synthetic */ boolean m240(b bVar) {
            int i = 2 % 2;
            int i2 = f85;
            int i3 = i2 + InterfaceC0280i1.d.b.i;
            f84 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = bVar.f102;
            int i5 = i2 + 23;
            f84 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        static /* synthetic */ List m241(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + 17;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            List<String> list = bVar.f95;
            int i5 = i3 + 105;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        static /* synthetic */ boolean m242(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + 19;
            f85 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = bVar.f96;
            if (i3 != 0) {
                return z;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        static /* synthetic */ String m243(b bVar) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 9;
            f85 = i3 % 128;
            int i4 = i3 % 2;
            String str = bVar.f105;
            if (i4 == 0) {
                int i5 = 87 / 0;
            }
            int i6 = i2 + 35;
            f85 = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        static /* synthetic */ String m244(b bVar) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 83;
            f85 = i3 % 128;
            int i4 = i3 % 2;
            String str = bVar.f104;
            int i5 = i2 + 9;
            f85 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        static /* synthetic */ boolean m246(b bVar) {
            int i = 2 % 2;
            int i2 = f85;
            int i3 = i2 + 27;
            f84 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = bVar.f100;
            int i5 = i2 + 61;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ String m248(b bVar) {
            int i = 2 % 2;
            int i2 = f85 + 5;
            int i3 = i2 % 128;
            f84 = i3;
            int i4 = i2 % 2;
            String str = bVar.f101;
            int i5 = i3 + 115;
            f85 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ boolean m249(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + InterfaceC0280i1.d.b.b;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            boolean z = bVar.f97;
            int i5 = i3 + 29;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ boolean m250(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + 55;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            boolean z = bVar.f94;
            int i5 = i3 + 125;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ List m255(b bVar) {
            int i = 2 % 2;
            int i2 = f84 + 65;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            List<String> list = bVar.f91;
            int i5 = i3 + 9;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ List m258(b bVar) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 45;
            f85 = i3 % 128;
            int i4 = i3 % 2;
            List<Integer> list = bVar.f93;
            if (i4 == 0) {
                int i5 = 62 / 0;
            }
            int i6 = i2 + 63;
            f85 = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ boolean m261(b bVar) {
            int i = 2 % 2;
            int i2 = f85 + InterfaceC0280i1.d.b.i;
            f84 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = bVar.f98;
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return z;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ String m265(b bVar) {
            int i = 2 % 2;
            int i2 = f85 + 123;
            f84 = i2 % 128;
            int i3 = i2 % 2;
            String str = bVar.f103;
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ List m270(b bVar) {
            int i = 2 % 2;
            int i2 = f85 + 123;
            int i3 = i2 % 128;
            f84 = i3;
            int i4 = i2 % 2;
            List<String> list = bVar.f92;
            if (i4 != 0) {
                int i5 = 43 / 0;
            }
            int i6 = i3 + 93;
            f85 = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }

        public b() {
        }

        public b(JSONObject jSONObject) {
            m262(jSONObject.optString(m254(new int[]{0, 15, 0, 14}, false, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000").intern()));
            m251(jSONObject.optString(m266("낳ퟜョ\uef76韮섑㉍\uf123ʗ\udc93鄴쏵횜㔽", 12 - TextUtils.indexOf((CharSequence) "", '0')).intern()));
            m267(jSONObject.optString(m266("柸颙୶褞魕燘租ྴ弾ẝ", View.MeasureSpec.getMode(0) + 10).intern()));
            m257(jSONObject.optBoolean(m254(new int[]{15, 16, 140, 0}, false, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000").intern()));
            jSONObject.optBoolean(m266("\ue104䅨\udf50펁钰ᤥ뇰⊕祋䶯\ue71e㷶\ue420굟䰵鐣咂᮫", 18 - Color.red(0)).intern());
            m259(jSONObject.optString(m266("ᦱ詒촒#풛\ud93f岪⤜틖镝", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8).intern()));
            m269(jSONObject.optBoolean(m266("ձ嵻\udf43䛥䷣謁ᓣ蚪\u0095媟", 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()));
            m264(jSONObject.optBoolean(m254(new int[]{31, 18, 0, 18}, true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001").intern()));
            m260(jSONObject.optBoolean(m266("풛\ud93fᾜ\ufbc6邸툢⸍ꊗ횜㔽", Color.blue(0) + 9).intern()));
            m253(jSONObject.optBoolean(m266("\ue104䅨㳾筠쾌╋웏꾛伢䯗쪺헵윑皱", 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), true));
            m245(jSONObject.optBoolean(m266("\ue104䅨⥔\ue878\uebef敏熷ﶇ⋰\uf2ed", 10 - Color.green(0)).intern()));
            m247(jSONObject.optBoolean(m266("뜡쳑㘈\udd32\ue86cԻ䗘\uf516䰵鐣⚑炳촋靥씊ở暕\uf02b뚵\ue604풛\ud93f낳ퟜ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25).intern(), true));
            m256(kd.m2825(jSONObject.optJSONArray(m266("\uea53\uf59c韮섑眣긨ﬦ䀐", TextUtils.indexOf("", "") + 7).intern())));
            m268(kd.m2825(jSONObject.optJSONArray(m254(new int[]{49, 18, 113, 0}, false, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001").intern())));
            m263(kd.m2825(jSONObject.optJSONArray(m254(new int[]{67, 13, 0, 5}, false, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000").intern())));
            m252(kd.m2825(jSONObject.optJSONArray(m266("脂챯웏꾛㍌雯爵䉈Ჯ茌ꛢ棢蜙\uf313", 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())));
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m262(String str) {
            int i = 2 % 2;
            int i2 = f84 + 71;
            int i3 = i2 % 128;
            f85 = i3;
            int i4 = i2 % 2;
            this.f103 = str;
            int i5 = i3 + InterfaceC0280i1.d.b.i;
            f84 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m251(String str) {
            int i = 2 % 2;
            int i2 = f84 + 93;
            f85 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f104 = str;
                return this;
            }
            this.f104 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m267(String str) {
            int i = 2 % 2;
            int i2 = f84 + 125;
            int i3 = i2 % 128;
            f85 = i3;
            if (i2 % 2 != 0) {
                this.f101 = str;
                int i4 = i3 + 35;
                f84 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f101 = str;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m257(boolean z) {
            int i = 2 % 2;
            int i2 = f85;
            int i3 = i2 + 23;
            f84 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f102 = z;
                int i4 = i2 + 113;
                f84 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f102 = z;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private b m259(String str) {
            int i = 2 % 2;
            int i2 = f84 + 1;
            f85 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f105 = str;
                int i3 = 2 / 0;
                return this;
            }
            this.f105 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m269(boolean z) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 91;
            f85 = i3 % 128;
            int i4 = i3 % 2;
            this.f100 = z;
            int i5 = i2 + 121;
            f85 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m264(boolean z) {
            int i = 2 % 2;
            int i2 = f84 + 5;
            f85 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f97 = z;
                return this;
            }
            this.f97 = z;
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private b m260(boolean z) {
            int i = 2 % 2;
            int i2 = f84 + 31;
            int i3 = i2 % 128;
            f85 = i3;
            if (i2 % 2 == 0) {
                this.f98 = z;
                int i4 = 57 / 0;
            } else {
                this.f98 = z;
            }
            int i5 = i3 + 31;
            f84 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m253(boolean z) {
            int i = 2 % 2;
            int i2 = f85 + 93;
            f84 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f99 = z;
                int i3 = 63 / 0;
                return this;
            }
            this.f99 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private b m245(boolean z) {
            int i = 2 % 2;
            int i2 = f85;
            int i3 = i2 + 47;
            f84 = i3 % 128;
            int i4 = i3 % 2;
            this.f96 = z;
            int i5 = i2 + 71;
            f84 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 44 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private b m247(boolean z) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 25;
            f85 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f94 = z;
                int i4 = i2 + 79;
                f85 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f94 = z;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m256(List<Integer> list) {
            int i = 2 % 2;
            if (list != null) {
                int i2 = f84 + 5;
                f85 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f93 = list;
                    throw null;
                }
                this.f93 = list;
            }
            int i3 = f85 + 3;
            f84 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 92 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m268(List<String> list) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 5;
            f85 = i3 % 128;
            int i4 = i3 % 2;
            if (list != null) {
                int i5 = i2 + 93;
                f85 = i5 % 128;
                if (i5 % 2 == 0) {
                    this.f91 = list;
                    int i6 = 24 / 0;
                    return this;
                }
                this.f91 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m263(List<String> list) {
            int i = 2 % 2;
            int i2 = f84;
            int i3 = i2 + 59;
            f85 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            if (list == null) {
                return this;
            }
            int i4 = i2 + 85;
            f85 = i4 % 128;
            if (i4 % 2 != 0) {
                this.f92 = list;
                int i5 = i2 + 47;
                f85 = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.f92 = list;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m252(List<String> list) {
            int i = 2 % 2;
            int i2 = f85 + 115;
            int i3 = i2 % 128;
            f84 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (list != null) {
                int i4 = i3 + 11;
                f85 = i4 % 128;
                int i5 = i4 % 2;
                this.f95 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m254(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (j.f2691) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f87, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    j.f2692 = 0;
                    char c = 0;
                    while (j.f2692 < i2) {
                        if (bArr[j.f2692] == 1) {
                            cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                        } else {
                            cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                        }
                        c = cArr2[j.f2692];
                        j.f2692++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    j.f2692 = 0;
                    while (j.f2692 < i2) {
                        cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                        j.f2692++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    j.f2692 = 0;
                    while (j.f2692 < i2) {
                        cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                        j.f2692++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m266(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (k.f2952) {
                char[] cArr2 = new char[cArr.length];
                k.f2951 = 0;
                char[] cArr3 = new char[2];
                while (k.f2951 < cArr.length) {
                    cArr3[0] = cArr[k.f2951];
                    cArr3[1] = cArr[k.f2951 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f86)) ^ ((c2 >>> 5) + f88)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f89) ^ ((c3 + i2) ^ ((c3 << 4) + f90))));
                        i2 -= 40503;
                    }
                    cArr2[k.f2951] = cArr3[0];
                    cArr2[k.f2951 + 1] = cArr3[1];
                    k.f2951 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m210(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f63);
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
