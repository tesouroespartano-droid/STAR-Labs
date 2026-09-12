package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cz extends cx {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1556 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1557 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1558 = 236;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1559 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1560 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1561 = {305, 350, 347, 268, 335, 337, 333, 352, 341, 346, 339, 322, 355, 315, 303, 344, 343, 312, 351, 320, 353, 340, 313, 336, 316, 357, 348, 345, 301, 319, 334, 294, 283};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1562 = -696092274333958037L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m1789(List list, Object[] objArr) {
        int i = 2 % 2;
        int i2 = f1556 + 23;
        f1557 = i2 % 128;
        if (i2 % 2 != 0) {
            m1785(list, objArr);
            throw null;
        }
        List<Object> listM1785 = m1785(list, objArr);
        int i3 = f1557 + InterfaceC0280i1.d.b.b;
        f1556 = i3 % 128;
        int i4 = i3 % 2;
        return listM1785;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final im m1808(final co coVar, List<Object> list, final dq dqVar) {
        int i = 2 % 2;
        final du duVar = (du) m1770(list, 0, du.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i2 = f1556 + 31;
            f1557 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll((Collection) m1770(list, 1, List.class));
        }
        if (duVar == null) {
            return null;
        }
        im imVar = new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.im
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1815() {
                arrayList.add(0, this);
                duVar.m2081(dqVar, coVar, arrayList);
                arrayList.remove(0);
            }
        };
        int i4 = f1557 + 81;
        f1556 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return imVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1792(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 125;
        f1556 = i2 % 128;
        jb.m2556().m2563((im) m1770(list, i2 % 2 == 0 ? 1 : 0, im.class));
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1786(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 115;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        jb.m2556().m2564((im) m1770(list, 0, im.class));
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1807(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                hf.e eVar = new hf.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.e
                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    public final void mo1811(hf hfVar, View view) {
                        duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, hfVar, view}));
                    }
                };
                int i2 = f1557 + 97;
                f1556 = i2 % 128;
                int i3 = i2 % 2;
                return eVar;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1788(null, View.MeasureSpec.getSize(0) + WorkQueueKt.MASK, null, "\u0082\u0086\u008a\u0086\u0088\u0093\u0089\u0092\u0091\u0085\u0089\u0090\u008f\u008a\u008e\u008d\u0086\u0089\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1806(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1556 + 35;
        f1557 = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) m1770(list, 0, View.class);
        final hf.e eVar = (hf.e) m1770(list, 1, hf.e.class);
        if (!m1790(list, 2)) {
            jy.m2750(view, new hf.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.13
                @Override // com.ironsource.adqualitysdk.sdk.i.hf.e
                /* JADX INFO: renamed from: ﻐ */
                public final void mo1811(final hf hfVar, final View view2) {
                    p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.13.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            eVar.mo1811(hfVar, view2);
                        }
                    });
                }
            });
        } else {
            int i4 = f1556 + InterfaceC0280i1.d.b.d;
            f1557 = i4 % 128;
            int i5 = i4 % 2;
            jy.m2750(view, eVar);
        }
        int i6 = f1557 + 25;
        f1556 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static View.OnClickListener m1791(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1556 + 5;
        f1557 = i2 % 128;
        int i3 = i2 % 2;
        View.OnClickListener onClickListenerM2749 = jy.m2749((View) m1770(list, 0, View.class));
        int i4 = f1557 + InterfaceC0280i1.d.b.b;
        f1556 = i4 % 128;
        int i5 = i4 % 2;
        return onClickListenerM2749;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1803(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        Object obj = null;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                hh.e eVar = new hh.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.12
                    @Override // com.ironsource.adqualitysdk.sdk.i.hh.e
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final boolean mo1812(hh hhVar, View view, MotionEvent motionEvent) {
                        return duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, hhVar, view, motionEvent})).m2018();
                    }
                };
                int i2 = f1556 + 119;
                f1557 = i2 % 128;
                if (i2 % 2 == 0) {
                    return eVar;
                }
                super.hashCode();
                throw null;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1788(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0082\u0086\u008a\u0086\u0088\u0093\u0089\u0092\u0096\u0085\u0095\u0083\u0094\u008a\u008e\u008d\u0086\u0089\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1804(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 41;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) m1770(list, 0, View.class);
        final hh.e eVar = (hh.e) m1770(list, 1, hh.e.class);
        if (m1790(list, 2)) {
            jy.m2751(view, eVar);
        } else {
            jy.m2751(view, new hh.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.15
                @Override // com.ironsource.adqualitysdk.sdk.i.hh.e
                /* JADX INFO: renamed from: ﾒ */
                public final boolean mo1812(final hh hhVar, final View view2, final MotionEvent motionEvent) {
                    p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.15.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            eVar.mo1812(hhVar, view2, motionEvent);
                        }
                    });
                    return false;
                }
            });
        }
        int i4 = f1557 + 73;
        f1556 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static View.OnTouchListener m1784(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 43;
        f1556 = i2 % 128;
        return jy.m2744((View) m1770(list, i2 % 2 == 0 ? 1 : 0, View.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1805(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                he.c cVar = new he.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.11
                    @Override // com.ironsource.adqualitysdk.sdk.i.he.c
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1810(he heVar, MediaPlayer mediaPlayer) {
                        duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, heVar, mediaPlayer}));
                    }
                };
                int i2 = f1557 + 117;
                f1556 = i2 % 128;
                int i3 = i2 % 2;
                return cVar;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1788(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0082\u0086\u008a\u0086\u0088\u0093\u0089\u0092\u0098\u0086\u0082\u0087\u009b\u0086\u0082\u0099\u008a\u008e\u0082\u0086\u009a\u0087\u0090\u0099\u0087\u0089\u0098\u0086\u0097\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1809(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                hc.c cVar = new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.14
                    @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    public final boolean mo1813(hc hcVar, MediaPlayer mediaPlayer, int i2, int i3) {
                        return duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, hcVar, mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)})).m2018();
                    }
                };
                int i2 = f1556 + 3;
                f1557 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 14 / 0;
                }
                return cVar;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1787("䀮隶\ued47쐉᪥焠䠒黐\uf576찭⋉禇倱ꛯ\ufdd9푧⫾Ɛ塌껷薗\udc5c㌀ফ恦뜎跢\ue470㬆ᇖ梏뼵闇\uec8d쌦᧲炒䝎鷴\uf4b0", 54959 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1798(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                hd.d dVar = new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    public final void mo1814(hd hdVar, MediaPlayer mediaPlayer) {
                        duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, hdVar, mediaPlayer}));
                    }
                };
                int i2 = f1557 + 89;
                f1556 = i2 % 128;
                int i3 = i2 % 2;
                return dVar;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1788(null, TextUtils.indexOf("", "", 0) + WorkQueueKt.MASK, null, "\u0082\u0086\u008a\u0086\u0088\u0093\u0089\u0092\u008a\u0083\u0089\u0088\u0086\u0090\u009b\u009c\u0083\u008f\u008a\u008e\u0082\u0086\u009a\u0087\u0090\u0099\u0087\u0089\u0098\u0086\u0097\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1800(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            coVar2 = coVar;
            try {
                hl.b bVar = new hl.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.20
                    @Override // com.ironsource.adqualitysdk.sdk.i.hl.b
                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    public final void mo1816(hl hlVar, MediaPlayer mediaPlayer) {
                        duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, hlVar, mediaPlayer}));
                    }
                };
                int i2 = f1557 + 25;
                f1556 = i2 % 128;
                if (i2 % 2 != 0) {
                    return bVar;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1787("䀮ᔠ\uea6b뾯ᓽ\uea56뽞ᒖ\ue9c6뼋ᐥ\ue971뺩Ꮹ\ue955빱\u139e\ue8c6븀ጱ\ue84f붪ዬ\ue80d뵖ኈ\ue7ee봆ሄ\ue77b베ᇧ\ue708뱝ᆔ\ue6d0밃ᄳ\ue669뮡\u10cf\ue623뭂ႌ\ue5c2묀ူ\ue56e", View.combineMeasuredStates(0, 0) + 21817).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1797(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            final boolean zM1790 = m1790(list, 2);
            coVar2 = coVar;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.4

                    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                    private static int f1624 = 0;

                    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                    private static int f1625 = 1;

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f1626 = 47;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static boolean f1627 = true;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static char[] f1628 = {'t', 161, 158, 'O', 152, 157, '~', '{', 144, 168, 164, Typography.pound, 'r', 151, 150, 148, Typography.cent, 147};

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f1629 = true;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        int i10 = 2 % 2;
                        int i11 = f1625 + 85;
                        f1624 = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            final List<Object> listM1789 = cz.m1789(list2, new Object[]{this, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                            if (zM1790) {
                                duVar.m2081(dqVar, coVar2, listM1789);
                                return;
                            }
                            p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.4.5
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    duVar.m2081(dqVar, coVar2, listM1789);
                                }
                            });
                            int i13 = f1625 + 11;
                            f1624 = i13 % 128;
                            int i14 = i13 % 2;
                        } catch (Throwable th) {
                            cn.m1575(coVar2.m1624(), new StringBuilder().append(m1819(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u0084\u0090\u0092\u0085\u0091\u0086\u0085\u0084\u0082\u0090\u0086\u0090\u008c\u0091\u0085\u0088\u0090\u008f\u0086\u0089\u008e\u008d\u008c\u008b\u0083\u008a\u0089\u0088\u0086\u0087\u0084\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern()).append(duVar.m2082()).toString(), th);
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m1819(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
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
                            char[] cArr2 = f1628;
                            int i3 = f1626;
                            if (f1627) {
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
                            if (f1629) {
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
                };
                int i2 = f1557 + 17;
                f1556 = i2 % 128;
                int i3 = i2 % 2;
                return onLayoutChangeListener;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1787("䀮箮㝷\uf321껅櫘♂\ue218鶶奥ᔹ탟貑䡇щ㾝ﭵ뜀狔⺇\uea48ꘝ憥ᵙ\ud92b铕傓ు젊莜뽰笱㛿\uf299깋樋▥", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15287).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1793(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        Object obj = null;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final du duVar2 = (du) m1770(list, 1, du.class);
            final List<Object> list2 = m1772(list, 2);
            final boolean zM1790 = m1790(list, 3);
            coVar2 = coVar;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.3

                    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                    private static int f1610 = 1;

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f1611 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char f1612 = 5;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static char[] f1613 = {'E', 'r', 'o', ' ', 'i', 'n', 'O', 'A', 't', 'a', 'c', 'h', 'S', 'e', 'C', 'g', 'L', 's', 'd', 'F', 'G', 'H', 'I', 'J', 'K'};

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        int i2 = 2 % 2;
                        int i3 = f1610 + 57;
                        f1611 = i3 % 128;
                        int i4 = i3 % 2;
                        m1818(duVar, view);
                        int i5 = f1610 + 73;
                        f1611 = i5 % 128;
                        int i6 = i5 % 2;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        int i2 = 2 % 2;
                        int i3 = f1610 + 95;
                        f1611 = i3 % 128;
                        int i4 = i3 % 2;
                        m1818(duVar2, view);
                        int i5 = f1611 + InterfaceC0280i1.d.b.g;
                        f1610 = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                    }

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private void m1818(final du duVar3, View view) {
                        int i2 = 2 % 2;
                        try {
                            final List<Object> listM1789 = cz.m1789(list2, new Object[]{this, view});
                            if (!zM1790) {
                                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.3.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo227() {
                                        duVar3.m2081(dqVar, coVar2, listM1789);
                                    }
                                });
                                int i3 = f1610 + 37;
                                f1611 = i3 % 128;
                                int i4 = i3 % 2;
                                return;
                            }
                            int i5 = f1610 + 123;
                            f1611 = i5 % 128;
                            int i6 = i5 % 2;
                            duVar3.m2081(dqVar, coVar2, listM1789);
                        } catch (Throwable th) {
                            cn.m1575(coVar2.m1624(), new StringBuilder().append(m1817("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\b\u0006\b©©\u0005\u000e\f\r\t\u0005\r\u0012\n\f\u0005\u0006\u0012\n\u0013\u0001\u0012\u0007\n\b\u000b\u0003\u0004\u0000\u0007\u000f\u0003\u0013\u0012\b", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52), 44 - ExpandableListView.getPackedPositionGroup(0L)).intern()).append(duVar3.m2082()).toString(), th);
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m1817(String str, byte b, int i2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (f.f2043) {
                            char[] cArr2 = f1613;
                            char c = f1612;
                            char[] cArr3 = new char[i2];
                            if (i2 % 2 != 0) {
                                i2--;
                                cArr3[i2] = (char) (cArr[i2] - b);
                            }
                            if (i2 > 1) {
                                f.f2047 = 0;
                                while (f.f2047 < i2) {
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
                                            int i3 = (f.f2046 * c) + f.f2042;
                                            int i4 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i3];
                                            cArr3[f.f2047 + 1] = cArr2[i4];
                                        } else if (f.f2046 == f.f2044) {
                                            f.f2042 = ((f.f2042 + c) - 1) % c;
                                            f.f2041 = ((f.f2041 + c) - 1) % c;
                                            int i5 = (f.f2046 * c) + f.f2042;
                                            int i6 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i5];
                                            cArr3[f.f2047 + 1] = cArr2[i6];
                                        } else {
                                            int i7 = (f.f2046 * c) + f.f2041;
                                            int i8 = (f.f2044 * c) + f.f2042;
                                            cArr3[f.f2047] = cArr2[i7];
                                            cArr3[f.f2047 + 1] = cArr2[i8];
                                        }
                                    }
                                    f.f2047 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                };
                int i2 = f1557 + 61;
                f1556 = i2 % 128;
                if (i2 % 2 != 0) {
                    return onAttachStateChangeListener;
                }
                super.hashCode();
                throw null;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1788(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0082\u0086\u008a\u0086\u0088\u0093\u0089\u0092\u0086\u008b\u008a\u0087\u0096\u008f\u0086\u0088\u0087\u0088\u009e\u0096\u0085\u0087\u0088\u0088\u009d\u008a\u008e\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1801(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1556 + 81;
        f1557 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m1770(list, 0, MediaPlayer.class);
        final hl.b bVar = (hl.b) m1770(list, 1, hl.b.class);
        if (m1790(list, 2)) {
            jy.m2758(mediaPlayer, bVar);
            return null;
        }
        jy.m2758(mediaPlayer, new hl.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5
            @Override // com.ironsource.adqualitysdk.sdk.i.hl.b
            /* JADX INFO: renamed from: ｋ */
            public final void mo1816(final hl hlVar, final MediaPlayer mediaPlayer2) {
                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        bVar.mo1816(hlVar, mediaPlayer2);
                    }
                });
            }
        });
        int i4 = f1556 + 125;
        f1557 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1799(List<Object> list) {
        int i = 2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m1770(list, 0, MediaPlayer.class);
        final he.c cVar = (he.c) m1770(list, 1, he.c.class);
        if (!m1790(list, 2)) {
            jy.m2757(mediaPlayer, new he.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.1
                @Override // com.ironsource.adqualitysdk.sdk.i.he.c
                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                public final void mo1810(final he heVar, final MediaPlayer mediaPlayer2) {
                    p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.1.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            cVar.mo1810(heVar, mediaPlayer2);
                        }
                    });
                }
            });
            int i2 = f1557 + 79;
            f1556 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f1557 + 95;
        f1556 = i4 % 128;
        if (i4 % 2 != 0) {
            jy.m2757(mediaPlayer, cVar);
            return null;
        }
        jy.m2757(mediaPlayer, cVar);
        int i5 = 62 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1794(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 15;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m1770(list, 0, MediaPlayer.class);
        final hc.c cVar = (hc.c) m1770(list, 1, hc.c.class);
        if (!(!m1790(list, 2))) {
            jy.m2754(mediaPlayer, cVar);
        } else {
            jy.m2754(mediaPlayer, new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.7
                @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                /* JADX INFO: renamed from: ﻛ */
                public final boolean mo1813(final hc hcVar, final MediaPlayer mediaPlayer2, final int i4, final int i5) {
                    p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.7.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            cVar.mo1813(hcVar, mediaPlayer2, i4, i5);
                        }
                    });
                    return false;
                }
            });
        }
        int i4 = f1557 + 57;
        f1556 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[PHI: r1 r3
      0x0052: PHI (r1v7 android.media.MediaPlayer) = (r1v6 android.media.MediaPlayer), (r1v12 android.media.MediaPlayer) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r3v4 com.ironsource.adqualitysdk.sdk.i.hd$d) = (r3v3 com.ironsource.adqualitysdk.sdk.i.hd$d), (r3v8 com.ironsource.adqualitysdk.sdk.i.hd$d) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003f A[PHI: r1 r3
      0x003f: PHI (r1v9 android.media.MediaPlayer) = (r1v6 android.media.MediaPlayer), (r1v12 android.media.MediaPlayer) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r3v5 com.ironsource.adqualitysdk.sdk.i.hd$d) = (r3v3 com.ironsource.adqualitysdk.sdk.i.hd$d), (r3v8 com.ironsource.adqualitysdk.sdk.i.hd$d) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1796(List<Object> list) {
        MediaPlayer mediaPlayer;
        final hd.d dVar;
        int i;
        int i2 = 2 % 2;
        int i3 = f1557 + 115;
        f1556 = i3 % 128;
        if (i3 % 2 == 0) {
            mediaPlayer = (MediaPlayer) m1770(list, 0, MediaPlayer.class);
            dVar = (hd.d) m1770(list, 1, hd.d.class);
            if (!m1790(list, 4)) {
                jy.m2755(mediaPlayer, new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo1814(final hd hdVar, final MediaPlayer mediaPlayer2) {
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                dVar.mo1814(hdVar, mediaPlayer2);
                            }
                        });
                    }
                });
            } else {
                i = f1556 + 113;
                f1557 = i % 128;
                if (i % 2 == 0) {
                    jy.m2755(mediaPlayer, dVar);
                    throw null;
                }
                jy.m2755(mediaPlayer, dVar);
            }
        } else {
            mediaPlayer = (MediaPlayer) m1770(list, 0, MediaPlayer.class);
            dVar = (hd.d) m1770(list, 1, hd.d.class);
            if (!m1790(list, 2)) {
                jy.m2755(mediaPlayer, new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo1814(final hd hdVar, final MediaPlayer mediaPlayer2) {
                        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                dVar.mo1814(hdVar, mediaPlayer2);
                            }
                        });
                    }
                });
            } else {
                i = f1556 + 113;
                f1557 = i % 128;
                if (i % 2 == 0) {
                    jy.m2755(mediaPlayer, dVar);
                    throw null;
                }
                jy.m2755(mediaPlayer, dVar);
            }
        }
        int i4 = f1557 + 117;
        f1556 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static Object m1782(List<Object> list) {
        hg hgVar;
        int i = 2 % 2;
        int i2 = f1557 + 79;
        f1556 = i2 % 128;
        if (i2 % 2 != 0 ? (hgVar = (hg) m1770(list, 0, hg.class)) == null : (hgVar = (hg) m1770(list, 1, hg.class)) == null) {
            int i3 = f1556 + 7;
            f1557 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        return hgVar.mo795();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1795(co coVar, List<Object> list, final dq dqVar) {
        final co coVar2;
        int i = 2 % 2;
        try {
            final du duVar = (du) m1770(list, 0, du.class);
            final List<Object> list2 = m1772(list, 1);
            final boolean zM1790 = m1790(list, 2);
            coVar2 = coVar;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.8
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (!zM1790) {
                            p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.8.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    AnonymousClass8.m1822(anonymousClass8, duVar, dqVar, coVar2, list2, context, intent);
                                }
                            });
                        } else {
                            duVar.m2081(dqVar, coVar2, cz.m1789(list2, new Object[]{this, context, intent}));
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    static /* synthetic */ void m1822(AnonymousClass8 anonymousClass8, du duVar2, dq dqVar2, co coVar3, List list3, Context context, Intent intent) {
                        duVar2.m2081(dqVar2, coVar3, cz.m1789(list3, new Object[]{anonymousClass8, context, intent}));
                    }
                };
                int i2 = f1557 + 45;
                f1556 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 31 / 0;
                }
                return broadcastReceiver;
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar2.m1624(), m1787("䀮\ue928ቻ뮗\ue4dd\u0dbe뜮\ue04eআ늳\udbf5ԙ깉흱å꧶팉籅ꕸ캬矜ꄏ쨮獸鲡엇滲頥셞檐鎰㳶", 43312 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            coVar2 = coVar;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1802(final co coVar, List<Object> list) {
        final String simpleName;
        int i = 2 % 2;
        int i2 = f1557 + 99;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        final boolean zBooleanValue = false;
        Class cls = (Class) m1770(list, 0, Class.class);
        Object obj = m1770(list, 1, (Class<Object>) Object.class);
        if (list.size() > 2) {
            int i4 = f1557 + 27;
            f1556 = i4 % 128;
            zBooleanValue = i4 % 2 == 0 ? ((Boolean) m1770(list, 5, Boolean.class)).booleanValue() : ((Boolean) m1770(list, 2, Boolean.class)).booleanValue();
        }
        if (list.size() > 3) {
            int i5 = f1557 + 25;
            f1556 = i5 % 128;
            int i6 = i5 % 2;
            simpleName = (String) m1770(list, 3, String.class);
        } else {
            simpleName = cls.getSimpleName();
        }
        Object objM2771 = ka.m2771(cls, obj, new ka.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.6

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f1642 = 1;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1643 = 93;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f1644 = {-71, -7, 5, -2, -4, -7, 8, 5, 73, -82, 3, -3, 0, 45, -78, -1, 79, -68, -11, 7, -12, Ascii.SI, -8, 77, Ascii.CR, -9, 9, -15, 1, 10, -3, 76, 0, 0, 0, 0};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1645 = -1073069937;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static short[] f1646 = null;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1647 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1648 = 1918969788;

            @Override // com.ironsource.adqualitysdk.sdk.i.ka.e
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1821(Object obj2, Method method, Object[] objArr) {
                List arrayList;
                int i7 = 2 % 2;
                int i8 = f1647 + 35;
                f1642 = i8 % 128;
                try {
                    if (i8 % 2 == 0) {
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (method != null) {
                        String string = new StringBuilder().append(simpleName).append(m1820((-1918969788) - View.resolveSize(0, 0), (byte) Gravity.getAbsoluteGravity(0, 0), (-92) - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 1073069983, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).append(method.getName()).toString();
                        hg hgVar = (hg) obj2;
                        if (objArr != null) {
                            int i9 = f1642 + 11;
                            f1647 = i9 % 128;
                            int i10 = i9 % 2;
                            arrayList = Arrays.asList(objArr);
                        } else {
                            arrayList = new ArrayList();
                        }
                        List<Object> listM1789 = cz.m1789(arrayList, new Object[]{hgVar});
                        ArrayList arrayList2 = new ArrayList();
                        if (zBooleanValue) {
                            int i11 = f1642 + 33;
                            f1647 = i11 % 128;
                            int i12 = i11 % 2;
                            arrayList2.add(listM1789);
                            int i13 = f1647 + 55;
                            f1642 = i13 % 128;
                            int i14 = i13 % 2;
                            listM1789 = arrayList2;
                        }
                        coVar.m1628().mo1564(string, listM1789);
                        int i15 = f1647 + 25;
                        f1642 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                } catch (Exception e) {
                    cn.m1575(coVar.m1624(), new StringBuilder().append(m1820((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1918969788, (byte) Color.red(0), (-79) - MotionEvent.axisFromString(""), 1073070006 - Gravity.getAbsoluteGravity(0, 0), (short) ExpandableListView.getPackedPositionType(0L)).intern()).append(method.getName()).append(m1820((-1918969774) - (Process.myTid() >> 22), (byte) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 82, 1073069970 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()).append(simpleName).append(m1820((-1918969765) - TextUtils.lastIndexOf("", '0', 0), (byte) TextUtils.getCapsMode("", 0, 0), (-84) - View.getDefaultSize(0, 0), 1073069969 - Color.red(0), (short) Drawable.resolveOpacity(0, 0)).intern()).toString(), e);
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m1820(int i7, byte b, int i8, int i9, short s) {
                String string;
                synchronized (l.f2999) {
                    StringBuilder sb = new StringBuilder();
                    int i10 = f1643;
                    int i11 = i8 + i10;
                    int i12 = i11 == -1 ? 1 : 0;
                    if (i12 != 0) {
                        byte[] bArr = f1644;
                        if (bArr != null) {
                            i11 = (byte) (bArr[f1648 + i7] + i10);
                        } else {
                            i11 = (short) (f1646[f1648 + i7] + i10);
                        }
                    }
                    if (i11 > 0) {
                        l.f3000 = ((i7 + i11) - 2) + f1648 + i12;
                        l.f3002 = b;
                        l.f3004 = (char) (i9 + f1645);
                        sb.append(l.f3004);
                        l.f3003 = l.f3004;
                        l.f3001 = 1;
                        while (l.f3001 < i11) {
                            byte[] bArr2 = f1644;
                            if (bArr2 != null) {
                                int i13 = l.f3000;
                                l.f3000 = i13 - 1;
                                l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i13] + s)) ^ l.f3002));
                            } else {
                                short[] sArr = f1646;
                                int i14 = l.f3000;
                                l.f3000 = i14 - 1;
                                l.f3004 = (char) (l.f3003 + (((short) (sArr[i14] + s)) ^ l.f3002));
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
        int i7 = f1556 + 43;
        f1557 = i7 % 128;
        if (i7 % 2 == 0) {
            return objM2771;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m1783(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1556 + 33;
        f1557 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM2772 = ka.m2772(m1770(list, 0, Object.class));
        int i4 = f1557 + 69;
        f1556 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM2772;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static jr m1780(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 11;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        jr jrVarM2685 = jr.m2685((WebView) m1770(list, 0, WebView.class), m1788(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "¡¡ \u0091\u009f\u0090\u0085\u0098\u0087").intern());
        int i4 = f1557 + 115;
        f1556 = i4 % 128;
        int i5 = i4 % 2;
        return jrVarM2685;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static Object m1781(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 49;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        ((jr) m1770(list, 0, jr.class)).m2693();
        int i4 = f1556 + 35;
        f1557 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static Object m1779(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1556 + 83;
        f1557 = i2 % 128;
        ((jr) m1770(list, i2 % 2 != 0 ? 1 : 0, jr.class)).m2687();
        return null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static WebViewClient m1777(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 11;
        f1556 = i2 % 128;
        int i3 = i2 % 2;
        WebViewClient webViewClientM2852 = ki.m2852((WebView) m1770(list, 0, WebView.class));
        int i4 = f1556 + 31;
        f1557 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return webViewClientM2852;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static WebChromeClient m1778(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1557 + 41;
        f1556 = i2 % 128;
        return ki.m2843((WebView) m1770(list, i2 % 2 == 0 ? 1 : 0, WebView.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Object> m1785(List<Object> list, Object... objArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            int i2 = f1557 + 83;
            f1556 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll(list);
            int i4 = f1557 + 25;
            f1556 = i4 % 128;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1790(List<Object> list, int i) {
        int i2 = 2 % 2;
        int i3 = f1556 + 53;
        f1557 = i3 % 128;
        int i4 = i3 % 2;
        if (list.size() <= i) {
            return false;
        }
        int i5 = f1556 + 47;
        f1557 = i5 % 128;
        if (i5 % 2 != 0) {
            ((Boolean) m1770(list, i, Boolean.class)).booleanValue();
            throw null;
        }
        if (!((Boolean) m1770(list, i, Boolean.class)).booleanValue()) {
            return false;
        }
        int i6 = f1557 + 83;
        f1556 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1788(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1561;
            int i2 = f1558;
            if (f1559) {
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
            if (f1560) {
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1787(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1562);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
