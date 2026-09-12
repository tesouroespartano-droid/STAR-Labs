package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1375 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1376;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private cp f1379;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private jk f1380;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private x f1381;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private jf f1382 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f1383;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private bg f1384;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private db f1385;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hs f1386;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private dq f1387;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cl f1388;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1374 = {')', '[', 'i', 'n', 'q', 'l', 'S', 'R', 'X', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'P', 'K', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'o', Typography.quote, '[', 'r', 'p', 'p', 'I', 'A', 'j', 'k', 'c', 'j', 'n', 'k', 'j', 'C', 'B', 'm', 'm', 'i', 'q', 'J', 'E', 'n', 'q', 'n', 'T', '-', 'x', 232, 234, 244, 236, 233, 218, 219, 16, 'G', 'n', 'q', 'J', 'C', 'j', 'r', 'q', 'i', ':', 'q', 'r', 'l', 'e', 'V', 'T', 'l', 'l', 'd', 'k', 'n', 'l', 'n', 'a', 'f', 't', 'j', Typography.less, 'c', 'W', 'g', 'i', 'c', 'b', 'R', 'R', 'k', 'n', 'o', 'o', 'n', '2', 'i', 'g', 'W', '`', 's', 'j', 'f', 'W', ']', 'n', 'g', 'o', 136, 265, 256, 254, 260, 250, 250, 263, '7', 'l', 'g', 'd', 'k', '_', '^', 'n', 'h', 199, 192, 195, 200, Typography.middleDot, 184, Typography.half, 191, 202, '%', '^', 't', 't', 'l', 'U', '^', 'v', 's', 'i', '9', 's', 'j', 'f', 'g', 'H', 143, 287, 296, 286, 276, 292, 294, '2', 'd', 'o', 'm', 'f', 'n', 'q', 'n', 'f', 'a', 'a', 'b', '2', 'd', 'b', 'b', 'a', 'a', 'g', 'm', 'q'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1378 = 6;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f1377 = {'/', 'R', 'e', 'm', 'o', 't', 'A', 'd', 'L', 'i', 's', 'n', 'r', 'a', 'c', 'v', 'y', 'w', 'f', 'l', 'M', 'h', ' ', 'V', 'C', 'N', 'u', '-', 'b', 'g', 'p', 'S', 'E', 'j', 'B', '.'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m1586(co coVar, Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = f1376 + 45;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM1619 = coVar.m1619(activity, bundle);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = f1375 + 49;
        f1376 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return jSONObjectM1619;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ dq m1589(co coVar) {
        int i = 2 % 2;
        int i2 = f1375 + 35;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        dq dqVar = coVar.f1387;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return dqVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m1606(Activity activity, List list) {
        int i = 2 % 2;
        int i2 = f1375 + 81;
        f1376 = i2 % 128;
        if (i2 % 2 != 0) {
            m1616(activity, (List<String>) list);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM1616 = m1616(activity, (List<String>) list);
        int i3 = f1375 + 93;
        f1376 = i3 % 128;
        int i4 = i3 % 2;
        return zM1616;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1612(co coVar, il ilVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1376 + 123;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        coVar.m1596(ilVar, z);
        int i4 = f1375 + 41;
        f1376 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1620(co coVar, String str, boolean z, boolean z2, List list) {
        int i = 2 % 2;
        int i2 = f1376 + 61;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        coVar.m1587(str, z, z2, list);
        int i4 = f1375 + 37;
        f1376 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    protected co(cp cpVar, db dbVar, bg bgVar, hs hsVar, dq dqVar) {
        this.f1386 = hsVar;
        dq dqVar2 = new dq(new HashMap(), dqVar, true);
        this.f1387 = dqVar2;
        dqVar2.m2010(m1638().m2282());
        dqVar.m2012(hsVar.m2286(), this);
        this.f1385 = dbVar;
        this.f1384 = bgVar;
        this.f1388 = m1580();
        this.f1379 = cpVar;
        this.f1381 = new x();
        m1605(m1592(new int[]{0, 27, 0, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), new ArrayList());
        m1583();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final cp m1637() {
        int i = 2 % 2;
        int i2 = f1375 + 25;
        f1376 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1379;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Context m1633() {
        int i = 2 % 2;
        int i2 = f1375 + 61;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        Context contextM1689 = m1637().m1689();
        int i4 = f1376 + 49;
        f1375 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return contextM1689;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1634(ip ipVar) {
        int i = 2 % 2;
        int i2 = f1375 + InterfaceC0280i1.d.b.b;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        this.f1379.m1692().m694(ipVar);
        int i4 = f1376 + 119;
        f1375 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1632(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1375 + 39;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        this.f1383 = kd.m2819(jSONObject, true);
        int i4 = f1375 + 37;
        f1376 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private dm m1582() {
        int i = 2 % 2;
        int i2 = f1376 + 3;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        dm dmVarM1690 = m1637().m1690();
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return dmVarM1690;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m1630() {
        int i = 2 % 2;
        int i2 = f1375 + 93;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1383;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hs m1638() {
        hs hsVar;
        int i = 2 % 2;
        int i2 = f1375 + 53;
        int i3 = i2 % 128;
        f1376 = i3;
        if (i2 % 2 != 0) {
            hsVar = this.f1386;
            int i4 = 94 / 0;
        } else {
            hsVar = this.f1386;
        }
        int i5 = i3 + 57;
        f1375 = i5 % 128;
        int i6 = i5 % 2;
        return hsVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final bg m1635() {
        int i = 2 % 2;
        int i2 = f1376 + 99;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        bg bgVar = this.f1384;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return bgVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final db m1626() {
        int i = 2 % 2;
        int i2 = f1376 + 45;
        f1375 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1385;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final cl m1628() {
        int i = 2 % 2;
        int i2 = f1375;
        int i3 = i2 + 57;
        f1376 = i3 % 128;
        int i4 = i3 % 2;
        cl clVar = this.f1388;
        int i5 = i2 + 57;
        f1376 = i5 % 128;
        int i6 = i5 % 2;
        return clVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dq m1627() {
        int i = 2 % 2;
        int i2 = f1376 + 117;
        int i3 = i2 % 128;
        f1375 = i3;
        int i4 = i2 % 2;
        dq dqVar = this.f1387;
        int i5 = i3 + 105;
        f1376 = i5 % 128;
        int i6 = i5 % 2;
        return dqVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1624() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m1637().m1702()).append(m1601("U", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38), (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern()).append(m1638().m2286()).toString();
        int i2 = f1375 + 73;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final du m1629(String str) {
        int i = 2 % 2;
        int i2 = f1375 + 123;
        int i3 = i2 % 128;
        f1376 = i3;
        int i4 = i2 % 2;
        if (str == null) {
            return null;
        }
        int i5 = i3 + 17;
        f1375 = i5 % 128;
        if (i5 % 2 != 0) {
            return m1638().m2283(str);
        }
        int i6 = 22 / 0;
        return m1638().m2283(str);
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1583() {
        int i = 2 % 2;
        for (dl dlVar : m1638().m2285()) {
            if (m1588(dlVar)) {
                int i2 = f1375 + 47;
                f1376 = i2 % 128;
                int i3 = i2 % 2;
                m1595(dlVar);
            }
            int i4 = f1376 + 63;
            f1375 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m1594(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1375 + 59;
        f1376 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectM1625 = m1625();
            kd.m2828(jSONObjectM1625, jSONObject);
            int i3 = f1376 + InterfaceC0280i1.d.b.d;
            f1375 = i3 % 128;
            if (i3 % 2 != 0) {
                return jSONObjectM1625;
            }
            throw null;
        }
        kd.m2828(m1625(), jSONObject);
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final JSONObject m1625() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ij.f2572, m1637().m1703());
            jSONObject.put(ij.f2526, m1637().m1693());
            jSONObject.put(ij.f2525, m1637().m1698());
        } catch (JSONException e2) {
            n.m2887(m1601("\u0002\u0003\u0004\u0005\u0000\u0003\u0007\b\t\n\u000b\u0004\u0005\b\u0000\u000e", (byte) (KeyEvent.keyCodeFromString("") + InterfaceC0280i1.d.b.b), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new StringBuilder().append(m1592(new int[]{27, 27, 0, 0}, false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000").intern()).append(e2.getLocalizedMessage()).toString());
        }
        int i2 = f1376 + 65;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1595(dl dlVar) {
        byte b2;
        int i = 2 % 2;
        int i2 = f1376 + 69;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        String strM1979 = dlVar.m1979();
        switch (strM1979.hashCode()) {
            case -1825565413:
                b2 = !strM1979.equals(m1601("\u000e\u000f\u0003\u000b\u0015\u000f\u0004\u0011\t\n\u0014\u0000\u000f\u0011\r\u0014f", (byte) (1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1655966961:
                if (strM1979.equals(m1601("\u000e\u000f\u0003\u000b\u0015\u000f\u0004\u0011", (byte) (7 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 8).intern())) {
                    b2 = 0;
                }
                break;
            case -787751952:
                if (strM1979.equals(m1601("\u000f\u000b\u0006\b\u0005\u0010", (byte) (TextUtils.getOffsetBefore("", 0) + 37), ExpandableListView.getPackedPositionType(0L) + 6).intern())) {
                    int i4 = f1375 + 7;
                    f1376 = i4 % 128;
                    if (i4 % 2 == 0) {
                        b2 = 2;
                    } else {
                        b2 = 5;
                    }
                }
                break;
            case 3619493:
                if (strM1979.equals(m1601("\u0015\u000f\u0005\u000e", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 94), 4 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    int i5 = f1376 + 95;
                    f1375 = i5 % 128;
                    int i6 = i5 % 2;
                    b2 = 1;
                }
                break;
            case 1144592183:
                if (strM1979.equals(m1592(new int[]{54, 8, 128, 2}, true, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000").intern())) {
                    b2 = 4;
                }
                break;
            default:
                break;
        }
        if (b2 == 0) {
            m1621(dlVar);
            m1604(m1601("\u000e\u000f\u0003\u000b\u0015\u000f\u0004\u0011", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7), 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), dlVar);
            return;
        }
        if (b2 == 1) {
            m1603(dlVar);
            m1604(m1601("\u0015\u000f\u0005\u000e", (byte) ((Process.myPid() >> 22) + 94), KeyEvent.keyCodeFromString("") + 4).intern(), dlVar);
            return;
        }
        if (b2 == 2) {
            m1613(dlVar);
            m1604(m1601("\u000f\u000b\u0006\b\u0005\u0010", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36), 5 - TextUtils.lastIndexOf("", '0', 0)).intern(), dlVar);
        } else if (b2 != 3) {
            if (b2 != 4) {
                return;
            }
            this.f1380 = new jk(m1598(m1593(dlVar.m1983())));
        } else if (this.f1382 == null) {
            this.f1382 = m1609(m1593(dlVar.m1983()));
            jj.m2645().m2648(this.f1382);
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    protected final void m1623() {
        int i = 2 % 2;
        m1581();
        m1584();
        m1585();
        Object obj = null;
        if (this.f1382 != null) {
            int i2 = f1376 + 45;
            f1375 = i2 % 128;
            int i3 = i2 % 2;
            jj.m2645().m2646(this.f1382);
            this.f1382 = null;
            int i4 = f1375 + 33;
            f1376 = i4 % 128;
            int i5 = i4 % 2;
        }
        jk jkVar = this.f1380;
        if (jkVar != null) {
            int i6 = f1376 + 1;
            f1375 = i6 % 128;
            if (i6 % 2 == 0) {
                jkVar.m2662();
                this.f1380 = null;
                super.hashCode();
                throw null;
            }
            jkVar.m2662();
            this.f1380 = null;
        }
        this.f1388 = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d A[PHI: r10
      0x003d: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v13 java.lang.String) binds: [B:12:0x003b, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1621(dl dlVar) {
        final String strM1978;
        final du duVarM1629;
        int i = 2 % 2;
        int i2 = f1376 + InterfaceC0280i1.d.b.d;
        f1375 = i2 % 128;
        iq iqVar = null;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectM1602 = m1602(dlVar.m1980());
            if (jSONObjectM1602 != null) {
                int i3 = f1375 + 93;
                f1376 = i3 % 128;
                if (i3 % 2 != 0) {
                    strM1978 = dlVar.m1978();
                    int i4 = 28 / 0;
                    if (!TextUtils.isEmpty(strM1978)) {
                        duVarM1629 = m1629(strM1978);
                        if (duVarM1629 != null) {
                            iqVar = new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.co.4

                                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                                private static short[] f1435 = null;

                                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                                private static int f1436 = 378779701;

                                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                                private static int f1437 = 1;

                                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                                private static byte[] f1438 = {-17, -111, 107, -107, 109, -99, -106, -127, 116, -65, SignedBytes.MAX_POWER_OF_TWO, 109, -103, -98, -108, -113, -5, 59, 118, 117, -124, -50, 37, 116, -102, 116, -101, 124, 117, 102, -33, 49, 113, -115, 125, -120, -121, 118, -49, 38, -117, 117, -120, -91};

                                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                                private static int f1439 = 0;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f1440 = 771385343;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f1441 = 33;

                                @Override // com.ironsource.adqualitysdk.sdk.i.iq
                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                public final List<WebView> mo1672(Object obj) {
                                    int i5 = 2 % 2;
                                    int i6 = f1439 + 45;
                                    f1437 = i6 % 128;
                                    int i7 = i6 % 2;
                                    try {
                                        List<WebView> list = (List) duVarM1629.m2081(co.m1589(co.this), co.this, Collections.singletonList(obj)).m2019();
                                        int i8 = f1439 + 27;
                                        f1437 = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            return list;
                                        }
                                        throw null;
                                    } catch (Exception unused) {
                                        n.m2887(m1671((-771385343) - TextUtils.getOffsetBefore("", 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 101), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 35, (-378779619) - Color.blue(0), (short) ExpandableListView.getPackedPositionGroup(0L)).intern(), new StringBuilder().append(m1671(TextUtils.indexOf("", "", 0) - 771385327, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 119), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 34, (-378779632) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(strM1978).toString());
                                        return null;
                                    }
                                }

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static String m1671(int i5, byte b2, int i6, int i7, short s) {
                                    String string;
                                    synchronized (l.f2999) {
                                        StringBuilder sb = new StringBuilder();
                                        int i8 = f1441;
                                        int i9 = i6 + i8;
                                        int i10 = i9 == -1 ? 1 : 0;
                                        if (i10 != 0) {
                                            byte[] bArr = f1438;
                                            if (bArr != null) {
                                                i9 = (byte) (bArr[f1440 + i5] + i8);
                                            } else {
                                                i9 = (short) (f1435[f1440 + i5] + i8);
                                            }
                                        }
                                        if (i9 > 0) {
                                            l.f3000 = ((i5 + i9) - 2) + f1440 + i10;
                                            l.f3002 = b2;
                                            l.f3004 = (char) (i7 + f1436);
                                            sb.append(l.f3004);
                                            l.f3003 = l.f3004;
                                            l.f3001 = 1;
                                            while (l.f3001 < i9) {
                                                byte[] bArr2 = f1438;
                                                if (bArr2 != null) {
                                                    int i11 = l.f3000;
                                                    l.f3000 = i11 - 1;
                                                    l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i11] + s)) ^ l.f3002));
                                                } else {
                                                    short[] sArr = f1435;
                                                    int i12 = l.f3000;
                                                    l.f3000 = i12 - 1;
                                                    l.f3004 = (char) (l.f3003 + (((short) (sArr[i12] + s)) ^ l.f3002));
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
                            };
                        } else {
                            cn.m1575(m1624(), new StringBuilder().append(m1601("\u001a\b\u0003\u0017\u0001\n\u0013\n\u0000\u0014\n\u0006\u000b\u0003\n\u0003\n\u0017\u0016\u0000\u0010\u0012", (byte) (117 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 22).intern()).append(strM1978).append(m1592(new int[]{62, 10, 0, 0}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern()).toString(), null);
                        }
                    }
                } else {
                    strM1978 = dlVar.m1978();
                    if (!TextUtils.isEmpty(strM1978)) {
                        duVarM1629 = m1629(strM1978);
                        if (duVarM1629 != null) {
                            iqVar = new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.co.4

                                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                                private static short[] f1435 = null;

                                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                                private static int f1436 = 378779701;

                                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                                private static int f1437 = 1;

                                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                                private static byte[] f1438 = {-17, -111, 107, -107, 109, -99, -106, -127, 116, -65, SignedBytes.MAX_POWER_OF_TWO, 109, -103, -98, -108, -113, -5, 59, 118, 117, -124, -50, 37, 116, -102, 116, -101, 124, 117, 102, -33, 49, 113, -115, 125, -120, -121, 118, -49, 38, -117, 117, -120, -91};

                                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                                private static int f1439 = 0;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f1440 = 771385343;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f1441 = 33;

                                @Override // com.ironsource.adqualitysdk.sdk.i.iq
                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                public final List<WebView> mo1672(Object obj) {
                                    int i5 = 2 % 2;
                                    int i6 = f1439 + 45;
                                    f1437 = i6 % 128;
                                    int i7 = i6 % 2;
                                    try {
                                        List<WebView> list = (List) duVarM1629.m2081(co.m1589(co.this), co.this, Collections.singletonList(obj)).m2019();
                                        int i8 = f1439 + 27;
                                        f1437 = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            return list;
                                        }
                                        throw null;
                                    } catch (Exception unused) {
                                        n.m2887(m1671((-771385343) - TextUtils.getOffsetBefore("", 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 101), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 35, (-378779619) - Color.blue(0), (short) ExpandableListView.getPackedPositionGroup(0L)).intern(), new StringBuilder().append(m1671(TextUtils.indexOf("", "", 0) - 771385327, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 119), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 34, (-378779632) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(strM1978).toString());
                                        return null;
                                    }
                                }

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static String m1671(int i5, byte b2, int i6, int i7, short s) {
                                    String string;
                                    synchronized (l.f2999) {
                                        StringBuilder sb = new StringBuilder();
                                        int i8 = f1441;
                                        int i9 = i6 + i8;
                                        int i10 = i9 == -1 ? 1 : 0;
                                        if (i10 != 0) {
                                            byte[] bArr = f1438;
                                            if (bArr != null) {
                                                i9 = (byte) (bArr[f1440 + i5] + i8);
                                            } else {
                                                i9 = (short) (f1435[f1440 + i5] + i8);
                                            }
                                        }
                                        if (i9 > 0) {
                                            l.f3000 = ((i5 + i9) - 2) + f1440 + i10;
                                            l.f3002 = b2;
                                            l.f3004 = (char) (i7 + f1436);
                                            sb.append(l.f3004);
                                            l.f3003 = l.f3004;
                                            l.f3001 = 1;
                                            while (l.f3001 < i9) {
                                                byte[] bArr2 = f1438;
                                                if (bArr2 != null) {
                                                    int i11 = l.f3000;
                                                    l.f3000 = i11 - 1;
                                                    l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i11] + s)) ^ l.f3002));
                                                } else {
                                                    short[] sArr = f1435;
                                                    int i12 = l.f3000;
                                                    l.f3000 = i12 - 1;
                                                    l.f3004 = (char) (l.f3003 + (((short) (sArr[i12] + s)) ^ l.f3002));
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
                            };
                        } else {
                            cn.m1575(m1624(), new StringBuilder().append(m1601("\u001a\b\u0003\u0017\u0001\n\u0013\n\u0000\u0014\n\u0006\u000b\u0003\n\u0003\n\u0017\u0016\u0000\u0010\u0012", (byte) (117 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 22).intern()).append(strM1978).append(m1592(new int[]{62, 10, 0, 0}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern()).toString(), null);
                        }
                    }
                }
                m1597(jSONObjectM1602, m1617(false), m1617(true), iqVar);
                int i5 = f1376 + 55;
                f1375 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 4;
                    return;
                }
                return;
            }
            return;
        }
        m1602(dlVar.m1980());
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1597(JSONObject jSONObject, o oVar, o oVar2, iq iqVar) {
        int i = 2 % 2;
        int i2 = f1376 + 71;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3023(jSONObject, m1590(oVar, oVar2), m1579(), iqVar);
        int i4 = f1376 + 47;
        f1375 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L15;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1603(dl dlVar) {
        String strM1981;
        q qVarM1610;
        q qVarM1611;
        int i = 2 % 2;
        int i2 = f1376 + 123;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM1602 = m1602(dlVar.m1980());
        if (jSONObjectM1602 == null) {
            return;
        }
        int i4 = f1376 + 71;
        f1375 = i4 % 128;
        if (i4 % 2 != 0) {
            strM1981 = dlVar.m1981();
            qVarM1610 = m1610(true);
            q qVarM1612 = m1610(false);
            if (!(!TextUtils.isEmpty(strM1981))) {
                qVarM1611 = qVarM1612;
                m1614(jSONObjectM1602, qVarM1611, qVarM1610);
                return;
            }
            qVarM1611 = qVarM1612;
            final du duVarM1629 = m1629(strM1981);
            if (duVarM1629 == null) {
                cn.m1575(m1624(), new StringBuilder().append(m1601("\u001a\b\u0003\u0017\u0001\n\u0013\n\u0000\u0014\n\u0006\u000b\u0003\n\u0003\n\u0017\u0016\u0000\u0010\u0012", (byte) (118 - KeyEvent.getDeadChar(0, 0)), 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(strM1981).append(m1592(new int[]{62, 10, 0, 0}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern()).toString(), null);
                return;
            }
            m1622(jSONObjectM1602, qVarM1611, qVarM1610, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.co.9
                @Override // com.ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final boolean mo1680(View view) {
                    return duVarM1629.m2081(co.m1589(co.this), co.this, Collections.singletonList(view)).m2018();
                }
            });
            int i5 = f1375 + 125;
            f1376 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        strM1981 = dlVar.m1981();
        qVarM1610 = m1610(false);
        qVarM1611 = m1610(true);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1613(dl dlVar) {
        int i = 2 % 2;
        int i2 = f1376 + 61;
        f1375 = i2 % 128;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectM1602 = m1602(dlVar.m1980());
            if (jSONObjectM1602 != null) {
                m1615(jSONObjectM1602, m1600(false), m1600(true));
            }
            int i3 = f1376 + 75;
            f1375 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        m1602(dlVar.m1980());
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1604(String str, dl dlVar) {
        int i = 2 % 2;
        JSONObject jSONObjectM1602 = m1602(dlVar.m1980());
        if (jSONObjectM1602 == null || !jSONObjectM1602.has(m1592(new int[]{72, 18, 0, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern())) {
            return;
        }
        int i2 = f1376 + 51;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        jm.a aVarM2672 = jm.a.m2672(jSONObjectM1602.optString(m1592(new int[]{72, 18, 0, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), null));
        String strM1611 = m1611(str, jSONObjectM1602);
        if (aVarM2672 != null) {
            int i4 = f1375 + 83;
            f1376 = i4 % 128;
            if (i4 % 2 != 0) {
                jm.m2667().m2668(strM1611, aVarM2672);
                super.hashCode();
                throw null;
            }
            jm.m2667().m2668(strM1611, aVarM2672);
            int i5 = f1376 + 59;
            f1375 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1615(JSONObject jSONObject, u uVar, u uVar2) {
        int i = 2 % 2;
        int i2 = f1375 + 117;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3022(jSONObject, m1599(uVar, uVar2));
        int i4 = f1376 + 75;
        f1375 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1585() {
        int i = 2 % 2;
        int i2 = f1376 + 27;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3021();
        int i4 = f1376 + 91;
        f1375 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1614(JSONObject jSONObject, q qVar, q qVar2) {
        int i = 2 % 2;
        int i2 = f1375 + 7;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3020(jSONObject, m1591(qVar, qVar2));
        int i4 = f1375 + 3;
        f1376 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1622(JSONObject jSONObject, q qVar, q qVar2, it itVar) {
        int i = 2 % 2;
        int i2 = f1375 + 121;
        f1376 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1381.m3019(jSONObject, m1591(qVar, qVar2), itVar);
            throw null;
        }
        this.f1381.m3019(jSONObject, m1591(qVar, qVar2), itVar);
        int i3 = f1376 + 11;
        f1375 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b A[RETURN] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m1588(dl dlVar) {
        int i = 2 % 2;
        int i2 = f1375 + 37;
        f1376 = i2 % 128;
        if (i2 % 2 == 0) {
            List listMo485 = ar.m480().mo485();
            ISAdQualityAdType iSAdQualityAdTypeM1982 = dlVar.m1982();
            if (listMo485 != null) {
                int i3 = f1375 + 7;
                f1376 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 87 / 0;
                    if (iSAdQualityAdTypeM1982 != ISAdQualityAdType.UNKNOWN) {
                        if (listMo485.contains(iSAdQualityAdTypeM1982)) {
                            return false;
                        }
                    }
                } else if (iSAdQualityAdTypeM1982 != ISAdQualityAdType.UNKNOWN) {
                    if (listMo485.contains(iSAdQualityAdTypeM1982)) {
                        return false;
                    }
                }
            }
            return true;
        }
        ar.m480().mo485();
        dlVar.m1982();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private void m1584() {
        int i = 2 % 2;
        int i2 = f1376 + 97;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3017();
        int i4 = f1376 + 35;
        f1375 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0093  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1611(String str, JSONObject jSONObject) {
        byte b2;
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m1601("\u0015\u000f\u0005\u000e", (byte) (94 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0') + 5).intern())) {
                    int i2 = f1376 + 91;
                    f1375 = i2 % 128;
                    int i3 = i2 % 2;
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m1601("\u000f\u000b\u0006\b\u0005\u0010", (byte) (Drawable.resolveOpacity(0, 0) + 37), 6 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                int i4 = f1375 + 39;
                f1376 = i4 % 128;
                int i5 = i4 % 2;
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m1601("\u000e\u000f\u0003\u000b\u0015\u000f\u0004\u0011", (byte) (7 - TextUtils.getTrimmedLength("")), ExpandableListView.getPackedPositionType(0L) + 8).intern())) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return jSONObject.optString(m1592(new int[]{90, 14, 0, 5}, false, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern(), null);
        }
        if (b2 == 1) {
            return jSONObject.optString(m1601("\u0013\r\u0015\u000b\u0005\u000e\u0019\u0012\u0010\u0007\u0007\u001c\u000f\u0001}", (byte) (Color.blue(0) + 24), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15).intern(), null);
        }
        if (b2 != 2) {
            return null;
        }
        return jSONObject.optString(m1592(new int[]{104, 13, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001").intern(), null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jf m1609(final List<String> list) {
        int i = 2 % 2;
        jf jfVar = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.co.8

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1452 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f1453 = 6152;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1454 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static char f1455 = 61454;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f1456 = 51136;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1457 = 35237;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1458 = 9211222669726821290L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            static /* synthetic */ void m1676(AnonymousClass8 anonymousClass8, String str, List list2) {
                int i2 = 2 % 2;
                int i3 = f1452 + 95;
                f1454 = i3 % 128;
                anonymousClass8.m1678(str, i3 % 2 != 0, list2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻛ */
            public final void mo393(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1452 + 25;
                f1454 = i3 % 128;
                int i4 = i3 % 2;
                m1679(m1677("ꯅカ鴵禗왦ꋒཕ\uebcd炦\udd19릓ح\ue2ff佪⯓끌ᴨ連䘑⋹轢", 39791 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), activity);
                int i5 = f1452 + 33;
                f1454 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 69 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﾒ */
            public final void mo394(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1452 + InterfaceC0280i1.d.b.g;
                f1454 = i3 % 128;
                int i4 = i3 % 2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m1679(m1677("ꯅ䐟瑝摋ᒶҿ㓭┣픇앫\uf54a\ue5a6閊藡똿\ua639噵䙓皩暌ᛄܲ㜍❩흆", i4 != 0 ? (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)) * 61402 : (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)) + 61402).intern(), activity);
                int i5 = f1452 + 3;
                f1454 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1454 + 95;
                f1452 = i3 % 128;
                int i4 = i3 % 2;
                if (co.m1606(activity, list)) {
                    int i5 = f1454 + 1;
                    f1452 = i5 % 128;
                    int i6 = i5 % 2;
                    m1673(m1675("ꥐ\uee92큩裠喯\u0b7c條顳嶱釨䘷鱣姷\u1add\uf88d簇픣疵", 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), activity, bundle);
                }
                int i7 = f1454 + 23;
                f1452 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i2 = 2 % 2;
                if (co.m1606(activity, list)) {
                    int i3 = f1452 + 49;
                    f1454 = i3 % 128;
                    m1679(m1677("ꯅ\ud9bb伕ﲴ戢鞸Ԧ誺㠦궤팏䂫\uf63f箫\ue92cẾ谾", i3 % 2 != 0 ? 19313 >> (ViewConfiguration.getKeyRepeatTimeout() << 61) : 29311 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), activity);
                }
                int i4 = f1452 + 73;
                f1454 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1454 + 19;
                f1452 = i3 % 128;
                if (i3 % 2 != 0) {
                    if (co.m1606(activity, list)) {
                        int i4 = f1454 + 9;
                        f1452 = i4 % 128;
                        m1679(m1677("ꯅ騟졝㹘沲劄胾\uf73e┆歠奶辦ﶝ⏀ሽ䀚뙾", i4 % 2 == 0 ? 3192 >>> (ViewConfiguration.getScrollBarSize() << 124) : (ViewConfiguration.getScrollBarSize() >> 8) + 12763).intern(), activity);
                        int i5 = f1452 + 71;
                        f1454 = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    return;
                }
                co.m1606(activity, list);
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int i2 = 2 % 2;
                if (!(!co.m1606(activity, list))) {
                    int i3 = f1454 + 89;
                    f1452 = i3 % 128;
                    m1679(m1675("ꥐ\uee92큩裠喯\u0b7c條顳嶱釨롡Ṇࡕ뙑瓛ᾆ", i3 % 2 == 0 ? 83 % TextUtils.getTrimmedLength("") : TextUtils.getTrimmedLength("") + 16).intern(), activity);
                    int i4 = f1452 + 83;
                    f1454 = i4 % 128;
                    int i5 = i4 % 2;
                }
                int i6 = f1452 + 33;
                f1454 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1454 + 53;
                f1452 = i3 % 128;
                int i4 = i3 % 2;
                if (co.m1606(activity, list)) {
                    int i5 = f1452 + InterfaceC0280i1.d.b.i;
                    f1454 = i5 % 128;
                    int i6 = i5 % 2;
                    m1679(m1677("ꯅ\uf5fdយ녢팺糞麊㡌娖\ufbd2׃Ɬ셩挿賄⺘䡞", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24120).intern(), activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1454 + 3;
                f1452 = i3 % 128;
                int i4 = i3 % 2;
                if (co.m1606(activity, list)) {
                    m1673(m1675("ꥐ\uee92큩裠喯\u0b7c條顳嶱釨\uf68d\ue568ꨝ瞘ﵴ㌝\uf1f2ﭿ춿篸㔄⏘山푲諆\u3097圫⊤", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26).intern(), activity, bundle);
                }
                int i5 = f1454 + 125;
                f1452 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i2 = 2 % 2;
                if (co.m1606(activity, list)) {
                    int i3 = f1454 + InterfaceC0280i1.d.b.b;
                    f1452 = i3 % 128;
                    int i4 = i3 % 2;
                    m1679(m1675("ꥐ\uee92큩裠喯\u0b7c條顳嶱釨䑅㪍\uf1f2ﭿ\ue181䔒\udf94ઊ픣疵", 19 - View.getDefaultSize(0, 0)).intern(), activity);
                    int i5 = f1454 + 31;
                    f1452 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1679(String str, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1452 + 73;
                f1454 = i3 % 128;
                int i4 = i3 % 2;
                m1674(str, Collections.singletonList(activity));
                if (i4 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1673(String str, Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1452 + 113;
                f1454 = i3 % 128;
                int i4 = i3 % 2;
                m1674(str, Arrays.asList(activity, bundle));
                int i5 = f1452 + 99;
                f1454 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1674(final String str, final List<Object> list2) {
                int i2 = 2 % 2;
                m1678(str, true, list2);
                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.co.8.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        AnonymousClass8.m1676(AnonymousClass8.this, str, list2);
                    }
                });
                int i3 = f1454 + 35;
                f1452 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 7 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m1678(String str, boolean z, List<Object> list2) {
                int i2 = 2 % 2;
                co.m1620(co.this, new StringBuilder().append(m1677("꯫뷎蟐\ue9d6\uf3c0엠⿴㇢ᯞ淼瞊如ꎝ떈龫\ue1af쮿\uddf3", (ViewConfiguration.getEdgeSlop() >> 16) + 5639).intern()).append(str).toString(), z, false, list2);
                int i3 = f1452 + 81;
                f1454 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 77 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1677(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2434) {
                    i.f2432 = i2;
                    char[] cArr2 = new char[cArr.length];
                    i.f2433 = 0;
                    while (i.f2433 < cArr.length) {
                        cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1458);
                        i.f2433++;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m1675(String str, int i2) {
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
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + f1453)) ^ ((c3 >>> 5) + f1455)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1456) ^ ((c4 + i3) ^ ((c4 << 4) + f1457))));
                            i3 -= 40503;
                        }
                        cArr2[k.f2951] = cArr3[0];
                        cArr2[k.f2951 + 1] = cArr3[1];
                        k.f2951 += 2;
                    }
                    str2 = new String(cArr2, 0, i2);
                }
                return str2;
            }
        };
        int i2 = f1376 + 99;
        f1375 = i2 % 128;
        if (i2 % 2 != 0) {
            return jfVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m1616(Activity activity, List<String> list) {
        int i = 2 % 2;
        int i2 = f1376 + 11;
        f1375 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
            if (list.isEmpty()) {
                return true;
            }
        } else if (list.isEmpty()) {
            return true;
        }
        int i4 = f1375 + 45;
        f1376 = i4 % 128;
        int i5 = i4 % 2;
        String name = activity.getClass().getName();
        if (i5 == 0) {
            return list.contains(name);
        }
        list.contains(name);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m1602(JSONObject jSONObject) {
        int i;
        Object obj;
        dm dmVarM1582;
        int i2 = 2 % 2;
        String strOptString = jSONObject.optString(m1592(new int[]{117, 8, 153, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern());
        jSONObject.remove(m1592(new int[]{117, 8, 153, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern());
        if (jSONObject.optBoolean(m1592(new int[]{125, 8, 0, 7}, false, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000").intern()) && (dmVarM1582 = m1582()) != null) {
            if (!TextUtils.isEmpty(dmVarM1582.m1985())) {
                jSONObject.remove(m1592(new int[]{125, 8, 0, 7}, false, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000").intern());
                try {
                    jSONObject.put(m1592(new int[]{133, 10, 92, 0}, true, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), new StringBuilder().append(strOptString).append(dmVarM1582.m1985()).toString());
                    int i3 = f1376 + 27;
                    f1375 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (JSONException unused) {
                }
            }
            if (dmVarM1582.m1988()) {
                int i5 = f1375 + 51;
                f1376 = i5 % 128;
                try {
                    jSONObject.put((i5 % 2 != 0 ? m1592(new int[]{143, 10, 0, 2}, false, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001") : m1592(new int[]{143, 10, 0, 2}, false, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001")).intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i6 = f1375 + 95;
            f1376 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 80 / 0;
                if (!m1608(jSONObject, itKeys.next())) {
                    i = f1376 + 89;
                    f1375 = i % 128;
                    obj = null;
                    if (i % 2 != 0) {
                        return null;
                    }
                    super.hashCode();
                    throw null;
                }
            } else if (!m1608(jSONObject, itKeys.next())) {
                i = f1376 + 89;
                f1375 = i % 128;
                obj = null;
                if (i % 2 != 0) {
                    return null;
                }
                super.hashCode();
                throw null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m1608(JSONObject jSONObject, String str) {
        int i = 2 % 2;
        Object objOpt = jSONObject.opt(str);
        try {
            if (!(objOpt instanceof String)) {
                if (objOpt instanceof JSONArray) {
                    jSONObject.put(str, new JSONArray((Collection) m1593(kd.m2821((JSONArray) objOpt))));
                }
            } else {
                int i2 = f1376 + 105;
                f1375 = i2 % 128;
                if (i2 % 2 != 0) {
                    String str2 = (String) objOpt;
                    if (m1607(str2)) {
                        String strM1618 = m1618(str2);
                        if (strM1618 != null) {
                            jSONObject.put(str, strM1618);
                            int i3 = f1375 + 107;
                            f1376 = i3 % 128;
                            int i4 = i3 % 2;
                        } else {
                            cn.m1578(m1624(), new StringBuilder().append(m1601("\u0019\u0012\u0010\u0007\u0010\u001c", (byte) (125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 6 - Color.blue(0)).intern()).append(str2).append(m1601("\u0017\n\u0005\u0000\u0017\u0013\u0002\u001c\u0006\b\u0015\u001c\u0013\u0010\"\n\u0011\u0000\n\u0006\u001c\u0017\u0015\u0007\u000b\u0004\u0005\b\u0000\u000e\u001c\u0010\u0003\u0000\u0018 ", (byte) (View.MeasureSpec.getSize(0) + 40), TextUtils.indexOf("", "", 0) + 36).intern()).toString());
                            return false;
                        }
                    }
                } else {
                    m1607((String) objOpt);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            }
        } catch (JSONException unused) {
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1593(List<String> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int i2 = f1376 + 1;
            f1375 = i2 % 128;
            int i3 = i2 % 2;
            if (m1607(str)) {
                int i4 = f1375 + 45;
                f1376 = i4 % 128;
                if (i4 % 2 != 0) {
                    m1618(str);
                    throw null;
                }
                String strM1618 = m1618(str);
                if (strM1618 != null) {
                    arrayList.add(strM1618);
                }
                int i5 = f1376 + InterfaceC0280i1.d.b.g;
                f1375 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1618(String str) {
        Class clsM819;
        int i = 2 % 2;
        int i2 = f1376 + 89;
        f1375 = i2 % 128;
        if (i2 % 2 != 0 ? (clsM819 = m1635().m819(kb.m2780(str, m1592(new int[]{153, 6, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001").intern()))) == null : (clsM819 = m1635().m819(kb.m2780(str, m1592(new int[]{153, 6, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001").intern()))) == null) {
            int i3 = f1375 + 73;
            f1376 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        return clsM819.getName();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1607(String str) {
        int i = 2 % 2;
        int i2 = f1376 + 83;
        f1375 = i2 % 128;
        return str.endsWith((i2 % 2 == 0 ? m1592(new int[]{153, 6, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001") : m1592(new int[]{153, 6, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001")).intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private o m1617(final boolean z) {
        int i = 2 % 2;
        o oVar = new o() { // from class: com.ironsource.adqualitysdk.sdk.i.co.11

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1393 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f1394 = {23847, 49891, 25216, 33388, 8753, 17395, 58284, 864, 41783, 49386, 24744, 'a', 40869, 16326, 57130, 32631, 7861, 48874, 24102, 65137, 40364, 15854, 56590, 32116, 7353, 48380, 23598, 13013, 44305, 3445, 60827, 19929, 11282, 35929, 27798, 52440, 'a', 40869, 16321, 57135, 32621, 7846, 48877, 24098, 65132, 40335, 15864, 56612, 32097, 7303, 48381, 'a', 40869, 16321, 57135, 32619, 7862, 48867, 24099, 32295, 57849, 16822, 41317, 276, 24800, 49315, 8311, 32826, 58352, 17342, 41854, 'w', 40868, 16352, 57088, 32620, 7863, 48873, 24106, 65133, 40330, 15846, 56610, 32105, 7331, 48378, 23562, 64614, 39860, 15356, 56103, 'c', 40884, 16369, 57143, 32619, 7848, 48835, 24113, 65133, 40359, 15870, 'A', 40866, 16374, 57130, 32626, 7852, 48882, 24126, 65097, 40365, 15814, 56610, 32127, 7353, 48363, 23585, 64629, 39843, 15292};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1395 = -798601382426140735L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1396;

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo228(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 105;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo228(jSONObject, webView, activity);
                if (i4 != 0) {
                    int i5 = 67 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo229(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 81;
                f1393 = i3 % 128;
                int i4 = i3 % 2;
                mo229(jSONObject, webView, activity);
                int i5 = f1396 + InterfaceC0280i1.d.b.b;
                f1393 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 51;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo230(jSONObject, webView, obj, activity);
                int i5 = f1396 + 85;
                f1393 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo231(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 61;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo231(jSONObject, webView, activity);
                int i5 = f1396 + 43;
                f1393 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 80 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 123;
                f1393 = i3 % 128;
                int i4 = i3 % 2;
                mo232(jSONObject, webView, obj, activity);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo233(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 107;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo233(jSONObject, webView, activity);
                if (i4 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo234(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 85;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo234(jSONObject, webView, activity);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + InterfaceC0280i1.d.b.d;
                f1396 = i3 % 128;
                int i4 = i3 % 2;
                mo235(jSONObject, webView, obj, activity);
                int i5 = f1393 + 9;
                f1396 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo234(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 83;
                f1396 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1640(m1639(TextUtils.getCapsMode("", 0, 0), 59 / (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), (char) (6427 << TextUtils.lastIndexOf("", 'h'))).intern(), jSONObject, webView, null, activity);
                } else {
                    m1640(m1639(TextUtils.getCapsMode("", 0, 0), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (23877 - TextUtils.lastIndexOf("", '0'))).intern(), jSONObject, webView, null, activity);
                }
                int i4 = f1393 + 93;
                f1396 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo229(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 19;
                f1396 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1640(m1639(Drawable.resolveOpacity(0, 0) + 46, (TypedValue.complexToFloat(0) > 1.0f ? 1 : (TypedValue.complexToFloat(0) == 1.0f ? 0 : -1)) + 48, (char) KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, null, activity);
                } else {
                    m1640(m1639(11 - Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, (char) KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, null, activity);
                }
                int i4 = f1393 + 99;
                f1396 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo230(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 55;
                f1393 = i3 % 128;
                int i4 = i3 % 2;
                m1640(m1639((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, ((Process.getThreadPriority(0) + 20) >> 6) + 9, (char) (MotionEvent.axisFromString("") + 12981)).intern(), jSONObject, webView, obj, activity);
                int i5 = f1393 + 125;
                f1396 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 17;
                f1396 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1640(m1639(ViewConfiguration.getScrollDefaultDelay() + 22, 78 % TextUtils.getCapsMode("", 1, 1), (char) (ViewCompat.MEASURED_STATE_MASK << Color.rgb(1, 1, 1))).intern(), jSONObject, webView, obj, activity);
                } else {
                    m1640(m1639((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, TextUtils.getCapsMode("", 0, 0) + 15, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern(), jSONObject, webView, obj, activity);
                }
                int i4 = f1393 + InterfaceC0280i1.d.b.i;
                f1396 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo233(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 17;
                f1393 = i3 % 128;
                int i4 = i3 % 2;
                m1640(m1639(Process.getGidForName("") + 52, 8 - TextUtils.getCapsMode("", 0, 0), (char) KeyEvent.normalizeMetaState(0)).intern(), jSONObject, webView, null, activity);
                int i5 = f1396 + 99;
                f1393 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo231(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1393 + 115;
                f1396 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1640(m1639(11 - ((Process.getThreadPriority(1) % 121) >> 80), 46 << KeyEvent.keyCodeFromString(""), (char) (30969 - Process.getGidForName(""))).intern(), jSONObject, webView, null, activity);
                } else {
                    m1640(m1639(((Process.getThreadPriority(0) + 20) >> 6) + 59, 12 - KeyEvent.keyCodeFromString(""), (char) (32336 - Process.getGidForName(""))).intern(), jSONObject, webView, null, activity);
                }
                int i4 = f1396 + 99;
                f1393 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo235(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 23;
                f1393 = i3 % 128;
                int i4 = i3 % 2;
                m1640(m1639(TextUtils.indexOf((CharSequence) "", '0') + 72, 20 - TextUtils.indexOf("", "", 0), (char) ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, obj, activity);
                int i5 = f1396 + 33;
                f1393 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo228(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1396 + 97;
                f1393 = i3 % 128;
                if (i3 % 2 == 0) {
                    m1640(m1639(View.MeasureSpec.getMode(1) * 38, 73 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 1, 1)).intern(), jSONObject, webView, null, activity);
                } else {
                    m1640(m1639(View.MeasureSpec.getMode(0) + 91, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, (char) TextUtils.indexOf("", "", 0, 0)).intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m1640(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                co.m1620(co.this, new StringBuilder().append(m1639((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + InterfaceC0280i1.d.b.b, View.resolveSize(0, 0) + 19, (char) View.MeasureSpec.getSize(0)).intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i3 = f1393 + 67;
                f1396 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 10 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m1639(int i2, int i3, char c2) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
                    char[] cArr = new char[i3];
                    com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i3) {
                        cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f1394[com.ironsource.adqualitysdk.sdk.i.b.f638 + i2]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f1395)) ^ ((long) c2));
                        com.ironsource.adqualitysdk.sdk.i.b.f638++;
                    }
                    str = new String(cArr);
                }
                return str;
            }
        };
        int i2 = f1375 + 91;
        f1376 = i2 % 128;
        if (i2 % 2 == 0) {
            return oVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private q m1610(final boolean z) {
        int i = 2 % 2;
        q qVar = new q() { // from class: com.ironsource.adqualitysdk.sdk.i.co.12

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1399 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f1400 = 6;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1401;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1402 = {'a', 'd', 'D', 'i', 's', 'p', 'l', 'y', 'e', 'E', 'x', 't', 'r', 'C', 'c', 'k', 'F', 'o', 'm', 'J', 'v', 'w', 'A', 'h', 'b', 'n', 'u', 'V', 'L', '.', 'f', 'g', 'j', 'q', 'z', '{'};

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo228(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 89;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo228(jSONObject, view, activity);
                int i5 = f1401 + 49;
                f1399 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo229(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + 23;
                f1399 = i3 % 128;
                int i4 = i3 % 2;
                mo229(jSONObject, view, activity);
                int i5 = f1401 + 115;
                f1399 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + 35;
                f1399 = i3 % 128;
                int i4 = i3 % 2;
                mo230(jSONObject, view, obj, activity);
                int i5 = f1401 + 113;
                f1399 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo231(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 45;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo231(jSONObject, view, activity);
                if (i4 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 95;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo232(jSONObject, view, obj, activity);
                if (i4 != 0) {
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1401 + 5;
                f1399 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo233(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 87;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo233(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 47 / 0;
                }
                int i6 = f1399 + 5;
                f1401 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo234(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 93;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo234(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 87 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + InterfaceC0280i1.d.b.d;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                mo235(jSONObject, view, obj, activity);
                int i5 = f1401 + 99;
                f1399 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo234(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 45;
                f1401 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1650(m1649("\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t«", (byte) (35 - View.MeasureSpec.getSize(1)), KeyEvent.normalizeMetaState(0) + 87).intern(), jSONObject, view, null, activity);
                } else {
                    m1650(m1649("\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t«", (byte) (View.MeasureSpec.getSize(0) + 71), KeyEvent.normalizeMetaState(0) + 11).intern(), jSONObject, view, null, activity);
                }
                int i4 = f1399 + 71;
                f1401 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo229(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + InterfaceC0280i1.d.b.b;
                f1399 = i3 % 128;
                int i4 = i3 % 2;
                m1650(m1649("\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t\u0003\u0007\u000b\u0006\u0012\u0006", (byte) (113 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getTapTimeout() >> 16) + 16).intern(), jSONObject, view, null, activity);
                int i5 = f1399 + 33;
                f1401 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo230(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 1;
                f1401 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1650(m1649("\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u009c", (byte) (124 >> TextUtils.getOffsetAfter("", 0)), 54 >> TextUtils.getOffsetBefore("", 1)).intern(), jSONObject, view, obj, activity);
                } else {
                    m1650(m1649("\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u009c", (byte) (TextUtils.getOffsetAfter("", 0) + 56), TextUtils.getOffsetBefore("", 0) + 9).intern(), jSONObject, view, obj, activity);
                }
                int i4 = f1399 + 39;
                f1401 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + 75;
                f1399 = i3 % 128;
                int i4 = i3 % 2;
                m1650(m1649("\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u0004\r\r\f\u0013\u0014x", (byte) (6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 15).intern(), jSONObject, view, obj, activity);
                int i5 = f1401 + 85;
                f1399 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo233(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + 125;
                f1399 = i3 % 128;
                if (i3 % 2 == 0) {
                    m1650(m1649("\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (66 << (ViewConfiguration.getJumpTapTimeout() / 80)), InterfaceC0280i1.d.b.b % TextUtils.indexOf("", "")).intern(), jSONObject, view, null, activity);
                } else {
                    m1650(m1649("\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (28 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.indexOf("", "") + 8).intern(), jSONObject, view, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo231(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1401 + 23;
                f1399 = i3 % 128;
                if (i3 % 2 == 0) {
                    m1650(m1649("\u0015\u0002\t\u0014\u0017\n\u0006\u0005\u0011\u0014\u0007\u0002", (byte) TextUtils.indexOf("", "", 1), View.resolveSize(0, 0) * 7).intern(), jSONObject, view, null, activity);
                } else {
                    m1650(m1649("\u0015\u0002\t\u0014\u0017\n\u0006\u0005\u0011\u0014\u0007\u0002", (byte) TextUtils.indexOf("", "", 0), View.resolveSize(0, 0) + 12).intern(), jSONObject, view, null, activity);
                }
                int i4 = f1401 + 91;
                f1399 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo235(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 107;
                f1401 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1650(m1649("\u0014\t\u0019\f\u0012\u0011\f\u0017\u0007\u000e\t\u0000\u0007\u001a\u0006\n\u001a\u000e\u001d\u0007", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) * 17), 16777236 >> Color.rgb(1, 0, 0)).intern(), jSONObject, view, obj, activity);
                } else {
                    m1650(m1649("\u0014\t\u0019\f\u0012\u0011\f\u0017\u0007\u000e\t\u0000\u0007\u001a\u0006\n\u001a\u000e\u001d\u0007", (byte) (111 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.rgb(0, 0, 0) + 16777236).intern(), jSONObject, view, obj, activity);
                }
                int i4 = f1399 + 95;
                f1401 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo228(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1399 + 73;
                f1401 = i3 % 128;
                int i4 = i3 % 2;
                m1650(m1649("\u0014 \u0005\n\f\u0017\b\u0015\u0007\u001aå", (byte) (161 - AndroidCharacter.getMirror('0')), 10 - MotionEvent.axisFromString("")).intern(), jSONObject, view, null, activity);
                int i5 = f1401 + 123;
                f1399 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1650(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                co.m1620(co.this, new StringBuilder().append(m1649("!\t\t\u0014\u0013\u0004\u001b\u0004\u0005\n\u0007\u001a\u0006\u000e]", (byte) (47 - View.MeasureSpec.getMode(0)), Color.red(0) + 15).intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, view, obj, activity));
                int i3 = f1401 + 115;
                f1399 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 27 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1649(String str, byte b2, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2043) {
                    char[] cArr2 = f1402;
                    char c2 = f1400;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    }
                    if (i2 > 1) {
                        com.ironsource.adqualitysdk.sdk.i.f.f2047 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.f.f2047 < i2) {
                            com.ironsource.adqualitysdk.sdk.i.f.f2045 = cArr[com.ironsource.adqualitysdk.sdk.i.f.f2047];
                            com.ironsource.adqualitysdk.sdk.i.f.f2048 = cArr[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1];
                            if (com.ironsource.adqualitysdk.sdk.i.f.f2045 == com.ironsource.adqualitysdk.sdk.i.f.f2048) {
                                cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = (char) (com.ironsource.adqualitysdk.sdk.i.f.f2045 - b2);
                                cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.f.f2048 - b2);
                            } else {
                                com.ironsource.adqualitysdk.sdk.i.f.f2046 = com.ironsource.adqualitysdk.sdk.i.f.f2045 / c2;
                                com.ironsource.adqualitysdk.sdk.i.f.f2042 = com.ironsource.adqualitysdk.sdk.i.f.f2045 % c2;
                                com.ironsource.adqualitysdk.sdk.i.f.f2044 = com.ironsource.adqualitysdk.sdk.i.f.f2048 / c2;
                                com.ironsource.adqualitysdk.sdk.i.f.f2041 = com.ironsource.adqualitysdk.sdk.i.f.f2048 % c2;
                                if (com.ironsource.adqualitysdk.sdk.i.f.f2042 == com.ironsource.adqualitysdk.sdk.i.f.f2041) {
                                    com.ironsource.adqualitysdk.sdk.i.f.f2046 = ((com.ironsource.adqualitysdk.sdk.i.f.f2046 + c2) - 1) % c2;
                                    com.ironsource.adqualitysdk.sdk.i.f.f2044 = ((com.ironsource.adqualitysdk.sdk.i.f.f2044 + c2) - 1) % c2;
                                    int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                                    int i4 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i3];
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i4];
                                } else if (com.ironsource.adqualitysdk.sdk.i.f.f2046 == com.ironsource.adqualitysdk.sdk.i.f.f2044) {
                                    com.ironsource.adqualitysdk.sdk.i.f.f2042 = ((com.ironsource.adqualitysdk.sdk.i.f.f2042 + c2) - 1) % c2;
                                    com.ironsource.adqualitysdk.sdk.i.f.f2041 = ((com.ironsource.adqualitysdk.sdk.i.f.f2041 + c2) - 1) % c2;
                                    int i5 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                                    int i6 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i5];
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                                    int i8 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i7];
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i8];
                                }
                            }
                            com.ironsource.adqualitysdk.sdk.i.f.f2047 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f1376 + 35;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        return qVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private u m1600(final boolean z) {
        int i = 2 % 2;
        u uVar = new u() { // from class: com.ironsource.adqualitysdk.sdk.i.co.13

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1405 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static boolean f1406 = true;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1407 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1408 = 51;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f1409 = {148, 151, 'w', 156, 166, Typography.pound, 159, 172, 152, 'x', 171, Typography.section, 165, 'v', 150, 158, 'y', Typography.cent, Typography.nbsp, '}', Typography.copyright, 170, 't', 155, 149, 161, 168, 138, Ascii.MAX, 'a'};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static boolean f1410 = true;

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo228(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 99;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo228(jSONObject, webView, view);
                int i5 = f1407 + 121;
                f1405 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 71 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo229(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 7;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo229(jSONObject, webView, view);
                int i5 = f1407 + 67;
                f1405 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 69;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo230(jSONObject, webView, obj, view);
                int i5 = f1407 + 93;
                f1405 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo231(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 21;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo231(jSONObject, webView, view);
                if (i4 == 0) {
                    int i5 = 2 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 83;
                f1407 = i3 % 128;
                int i4 = i3 % 2;
                mo232(jSONObject, webView, obj, view);
                int i5 = f1407 + 61;
                f1405 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 68 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo233(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 75;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo233(jSONObject, webView, view);
                if (i4 == 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1407 + 5;
                f1405 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo234(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + InterfaceC0280i1.d.b.b;
                f1407 = i3 % 128;
                int i4 = i3 % 2;
                mo234(jSONObject, webView, view);
                int i5 = f1405 + 17;
                f1407 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 99;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                mo235(jSONObject, webView, obj, view);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo234(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 107;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                m1660(m1659((int[]) null, 126 - Process.getGidForName(""), (String) null, "\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, webView, null, view);
                int i5 = f1407 + 49;
                f1405 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo229(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 77;
                f1407 = i3 % 128;
                int i4 = i3 % 2;
                m1660(m1659((int[]) null, 127 - ExpandableListView.getPackedPositionGroup(0L), (String) null, "\u0081\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, webView, null, view);
                int i5 = f1405 + 123;
                f1407 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 49 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo230(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 81;
                f1407 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    m1660(m1659((int[]) null, View.MeasureSpec.getSize(1) + 48, (String) null, "\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, webView, obj, view);
                } else {
                    m1660(m1659((int[]) null, 127 - View.MeasureSpec.getSize(0), (String) null, "\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, webView, obj, view);
                }
                int i4 = f1405 + 5;
                f1407 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo232(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 107;
                f1407 = i3 % 128;
                int i4 = i3 % 2;
                m1660(m1659((int[]) null, 127 - (Process.myTid() >> 22), (String) null, "\u0085\u0094\u0093\u0092\u008d\u0091\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, webView, obj, view);
                int i5 = f1405 + 89;
                f1407 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo233(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 117;
                f1405 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                m1660(m1659((int[]) null, Drawable.resolveOpacity(0, 0) + WorkQueueKt.MASK, (String) null, "\u0082\u0089\u0085\u0092\u0087\u008e\u0082\u0081").intern(), jSONObject, webView, null, view);
                int i5 = f1407 + 123;
                f1405 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo231(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 87;
                f1407 = i3 % 128;
                int i4 = i3 % 2;
                m1660(m1659((int[]) null, 127 - TextUtils.getOffsetAfter("", 0), (String) null, "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, webView, null, view);
                int i5 = f1407 + InterfaceC0280i1.d.b.i;
                f1405 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo235(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1405 + 71;
                f1407 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1660(m1659((int[]) null, (Process.myPid() << 75) * 74, (String) null, "\u008c\u009a\u0089\u0095\u008a\u008c\u009a\u0089\u0084\u0087\u008e\u0089\u0093\u0092\u008d\u0098\u008e\u0099\u0089\u0096").intern(), jSONObject, webView, obj, view);
                } else {
                    m1660(m1659((int[]) null, (Process.myPid() >> 22) + WorkQueueKt.MASK, (String) null, "\u008c\u009a\u0089\u0095\u008a\u008c\u009a\u0089\u0084\u0087\u008e\u0089\u0093\u0092\u008d\u0098\u008e\u0099\u0089\u0096").intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo228(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1407 + 61;
                f1405 = i3 % 128;
                if (i3 % 2 == 0) {
                    m1660(m1659((int[]) null, 43 % TextUtils.getCapsMode("", 1, 0), (String) null, "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, webView, null, view);
                } else {
                    m1660(m1659((int[]) null, 127 - TextUtils.getCapsMode("", 0, 0), (String) null, "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, webView, null, view);
                }
                int i4 = f1407 + 17;
                f1405 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m1660(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                co.m1620(co.this, new StringBuilder().append(m1659((int[]) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + WorkQueueKt.MASK, (String) null, "\u009e\u008d\u0089\u009a\u0089\u008c\u0085\u0084\u009d\u0082\u0097\u0096\u0092\u0082\u009a\u0084\u009c").intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, webView, obj, view));
                int i3 = f1405 + 55;
                f1407 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1659(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f1409;
                    int i3 = f1408;
                    if (f1406) {
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
                    if (f1410) {
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
        int i2 = f1376 + 13;
        f1375 = i2 % 128;
        int i3 = i2 % 2;
        return uVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private o m1590(final o oVar, final o oVar2) {
        int i = 2 % 2;
        int i2 = f1375 + 7;
        f1376 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
            if (oVar == null) {
                oVar = new o();
            }
        } else if (oVar == null) {
            oVar = new o();
        }
        if (oVar2 == null) {
            oVar2 = new o();
            int i4 = f1376 + 85;
            f1375 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new o() { // from class: com.ironsource.adqualitysdk.sdk.i.co.15
            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo228(JSONObject jSONObject, WebView webView, Activity activity) {
                mo228(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo229(JSONObject jSONObject, WebView webView, Activity activity) {
                mo229(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo230(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo231(JSONObject jSONObject, WebView webView, Activity activity) {
                mo231(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo232(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo233(JSONObject jSONObject, WebView webView, Activity activity) {
                mo233(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo234(JSONObject jSONObject, WebView webView, Activity activity) {
                mo234(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo235(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ｋ */
            public final void mo234(JSONObject jSONObject, WebView webView, Activity activity) {
                oVar2.mo234(jSONObject, webView, activity);
                p.m2894(new e.AnonymousClass3(oVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻛ */
            public final void mo229(JSONObject jSONObject, WebView webView, Activity activity) {
                oVar2.mo229(jSONObject, webView, activity);
                p.m2894(new d.AnonymousClass2(oVar, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾇ */
            public final void mo230(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                oVar2.mo230(jSONObject, webView, obj, activity);
                p.m2894(new b.AnonymousClass5(oVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾒ */
            public final void mo232(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                oVar2.mo232(jSONObject, webView, obj, activity);
                p.m2894(new a.AnonymousClass3(oVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾒ */
            public final void mo233(JSONObject jSONObject, WebView webView, Activity activity) {
                oVar2.mo233(jSONObject, webView, activity);
                p.m2894(new c.AnonymousClass3(oVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﾇ */
            public final void mo231(JSONObject jSONObject, WebView webView, Activity activity) {
                oVar2.mo231(jSONObject, webView, activity);
                p.m2894(new h.AnonymousClass1(oVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻛ */
            public final void mo235(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                oVar2.mo235(jSONObject, webView, obj, activity);
                p.m2894(new g.AnonymousClass2(oVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.o
            /* JADX INFO: renamed from: ﻐ */
            public final void mo228(JSONObject jSONObject, WebView webView, Activity activity) {
                oVar2.mo228(jSONObject, webView, activity);
                p.m2894(new f.AnonymousClass5(oVar, jSONObject, webView, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private u m1599(final u uVar, final u uVar2) {
        int i = 2 % 2;
        int i2 = f1376 + 31;
        f1375 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (uVar == null) {
            uVar = new u();
            int i3 = f1376 + 69;
            f1375 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (uVar2 == null) {
            uVar2 = new u();
        }
        return new u() { // from class: com.ironsource.adqualitysdk.sdk.i.co.14
            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo228(JSONObject jSONObject, WebView webView, View view) {
                mo228(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo229(JSONObject jSONObject, WebView webView, View view) {
                mo229(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo230(jSONObject, webView, obj2, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo231(JSONObject jSONObject, WebView webView, View view) {
                mo231(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo232(jSONObject, webView, obj2, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo233(JSONObject jSONObject, WebView webView, View view) {
                mo233(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo234(JSONObject jSONObject, WebView webView, View view) {
                mo234(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                mo235(jSONObject, webView, obj2, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾒ */
            public final void mo234(JSONObject jSONObject, WebView webView, View view) {
                uVar2.mo234(jSONObject, webView, view);
                p.m2894(new e.AnonymousClass3(uVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻐ */
            public final void mo229(JSONObject jSONObject, WebView webView, View view) {
                uVar2.mo229(jSONObject, webView, view);
                p.m2894(new d.AnonymousClass2(uVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ｋ */
            public final void mo230(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                uVar2.mo230(jSONObject, webView, obj2, view);
                p.m2894(new b.AnonymousClass5(uVar, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ */
            public final void mo232(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                uVar2.mo232(jSONObject, webView, obj2, view);
                p.m2894(new a.AnonymousClass3(uVar, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ */
            public final void mo233(JSONObject jSONObject, WebView webView, View view) {
                uVar2.mo233(jSONObject, webView, view);
                p.m2894(new c.AnonymousClass3(uVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ｋ */
            public final void mo231(JSONObject jSONObject, WebView webView, View view) {
                uVar2.mo231(jSONObject, webView, view);
                p.m2894(new h.AnonymousClass1(uVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻐ */
            public final void mo235(JSONObject jSONObject, WebView webView, Object obj2, View view) {
                uVar2.mo235(jSONObject, webView, obj2, view);
                p.m2894(new g.AnonymousClass2(uVar, jSONObject, webView, obj2, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾇ */
            public final void mo228(JSONObject jSONObject, WebView webView, View view) {
                uVar2.mo228(jSONObject, webView, view);
                p.m2894(new f.AnonymousClass5(uVar, jSONObject, webView, view));
            }
        };
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private q m1591(final q qVar, final q qVar2) {
        int i = 2 % 2;
        int i2 = f1375 + 41;
        f1376 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (qVar == null) {
            qVar = new q();
        }
        if (qVar2 == null) {
            qVar2 = new q();
            int i3 = f1375 + 61;
            f1376 = i3 % 128;
            int i4 = i3 % 2;
        }
        return new q() { // from class: com.ironsource.adqualitysdk.sdk.i.co.17
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo228(JSONObject jSONObject, View view, Activity activity) {
                mo228(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo229(JSONObject jSONObject, View view, Activity activity) {
                mo229(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo230(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo230(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo231(JSONObject jSONObject, View view, Activity activity) {
                mo231(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo232(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo233(JSONObject jSONObject, View view, Activity activity) {
                mo233(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo234(JSONObject jSONObject, View view, Activity activity) {
                mo234(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo235(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo235(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾒ */
            public final void mo234(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo234(jSONObject, view, activity);
                p.m2894(new e.AnonymousClass3(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ */
            public final void mo229(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo229(jSONObject, view, activity);
                p.m2894(new d.AnonymousClass2(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ */
            public final void mo230(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo230(jSONObject, view, obj, activity);
                p.m2894(new b.AnonymousClass5(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ */
            public final void mo232(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo232(jSONObject, view, obj, activity);
                p.m2894(new a.AnonymousClass3(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ */
            public final void mo233(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo233(jSONObject, view, activity);
                p.m2894(new c.AnonymousClass3(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ */
            public final void mo231(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo231(jSONObject, view, activity);
                p.m2894(new h.AnonymousClass1(qVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ */
            public final void mo235(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo235(jSONObject, view, obj, activity);
                p.m2894(new g.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻐ */
            public final void mo228(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo228(jSONObject, view, activity);
                p.m2894(new f.AnonymousClass5(qVar, jSONObject, view, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private jf m1579() {
        int i = 2 % 2;
        jf jfVar = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.co.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                co.this.m1636(ij.f2537, co.m1586(co.this, activity, null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                co.this.m1636(ij.f2538, co.m1586(co.this, activity, null));
            }
        };
        int i2 = f1376 + 99;
        f1375 = i2 % 128;
        if (i2 % 2 != 0) {
            return jfVar;
        }
        throw null;
    }

    class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$e$3, reason: invalid class name */
        final class AnonymousClass3 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1484;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1485;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1486;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1487;

            AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1487 = rVar;
                this.f1485 = jSONObject;
                this.f1486 = obj;
                this.f1484 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1487.mo234(this.f1485, this.f1486, this.f1484);
            }
        }
    }

    class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$d$2, reason: invalid class name */
        final class AnonymousClass2 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1480;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1481;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1482;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1483;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1481 = rVar;
                this.f1483 = jSONObject;
                this.f1482 = obj;
                this.f1480 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1481.mo229(this.f1483, this.f1482, this.f1480);
            }
        }
    }

    class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$b$5, reason: invalid class name */
        final class AnonymousClass5 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1471;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1472;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1473;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1474;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1475;

            AnonymousClass5(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1474 = rVar;
                this.f1472 = jSONObject;
                this.f1475 = obj;
                this.f1473 = obj2;
                this.f1471 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1474.mo230(this.f1472, this.f1475, this.f1473, this.f1471);
            }
        }
    }

    class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$a$3, reason: invalid class name */
        final class AnonymousClass3 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1466;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1467;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1468;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1469;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1470;

            AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1468 = rVar;
                this.f1467 = jSONObject;
                this.f1466 = obj;
                this.f1469 = obj2;
                this.f1470 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1468.mo232(this.f1467, this.f1466, this.f1469, this.f1470);
            }
        }
    }

    class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$c$3, reason: invalid class name */
        final class AnonymousClass3 extends iu {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1476;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1477;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1478;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1479;

            AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1476 = rVar;
                this.f1479 = jSONObject;
                this.f1477 = obj;
                this.f1478 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1476.mo233(this.f1479, this.f1477, this.f1478);
            }
        }
    }

    class h<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$h$1, reason: invalid class name */
        final class AnonymousClass1 extends iu {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1497;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1498;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1499;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1500;

            AnonymousClass1(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1499 = rVar;
                this.f1498 = jSONObject;
                this.f1500 = obj;
                this.f1497 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1499.mo231(this.f1498, this.f1500, this.f1497);
            }
        }
    }

    class g<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$g$2, reason: invalid class name */
        final class AnonymousClass2 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1492;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1493;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1494;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1495;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1496;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1494 = rVar;
                this.f1495 = jSONObject;
                this.f1492 = obj;
                this.f1493 = obj2;
                this.f1496 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1494.mo235(this.f1495, this.f1492, this.f1493, this.f1496);
            }
        }
    }

    class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.co$f$5, reason: invalid class name */
        final class AnonymousClass5 extends iu {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1488;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1489;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1490;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1491;

            AnonymousClass5(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1489 = rVar;
                this.f1488 = jSONObject;
                this.f1490 = obj;
                this.f1491 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                this.f1489.mo228(this.f1488, this.f1490, this.f1491);
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m1619(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ij.f2572, m1637().m1703());
            jSONObject.put(ij.f2525, m1637().m1698());
            jSONObject.put(ij.f2526, m1637().m1693());
            jSONObject.put(m1592(new int[]{159, 7, 189, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000").intern(), activity.getClass().getName());
            if (bundle != null) {
                int i2 = f1376 + 85;
                f1375 = i2 % 128;
                jSONObject.put((i2 % 2 == 0 ? m1601("\u000e\u000f\u0001#\u0001\u0011\u0000\u0003", (byte) (91 << (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 106 / MotionEvent.axisFromString("")) : m1601("\u000e\u000f\u0001#\u0001\u0011\u0000\u0003", (byte) (103 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 9)).intern(), true);
            }
        } catch (JSONException unused) {
            n.m2887(m1601("\u0002\u0003\u0004\u0005\u0000\u0003\u0007\b\t\n\u000b\u0004\u0005\b\u0000\u000e", (byte) (KeyEvent.keyCodeFromString("") + InterfaceC0280i1.d.b.b), 15 - MotionEvent.axisFromString("")).intern(), m1601("\u001e\u000e\u0010\u0000\u0010\u0012\u000f\r\u0001\u000e\u0003\u000b\u0011#\u0013\u0010\u0011\u0002\u0015\"\u0010\n\n\u0017\n\" \u0003\u0011\u0002", (byte) (120 - Process.getGidForName("")), (Process.myPid() >> 22) + 30).intern());
        }
        int i3 = f1375 + 81;
        f1376 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jo m1598(final List<String> list) {
        int i = 2 % 2;
        jo joVar = new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.co.2

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1422 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1423 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f1424 = {153, 285, 285, 305, 308, 310, 308, 288, 290, 311, 303, 229, 242, 239, 244, 243, 229, 210, 243, 245, 227, 239, 198, 238, 239, 228, '9', 'n', 'Z', '_', 't', 'l', 'i', 'Z', '[', 'p', 'X', '7', 'P', 'k', 'i', 'i', 'l'};

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾇ */
            public final void mo399(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1423 + 13;
                f1422 = i3 % 128;
                m1670((i3 % 2 != 0 ? m1669(new int[]{0, 11, 195, 4}, false, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000") : m1669(new int[]{0, 11, 195, 4}, true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000")).intern(), activity, list);
                int i4 = f1422 + InterfaceC0280i1.d.b.g;
                f1423 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾒ */
            public final void mo400(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1422 + 113;
                f1423 = i3 % 128;
                m1670((i3 % 2 == 0 ? m1669(new int[]{11, 15, 128, 14}, true, null) : m1669(new int[]{11, 15, 128, 14}, true, null)).intern(), activity, list);
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1670(String str, final Activity activity, List<String> list2) {
                int i2 = 2 % 2;
                int i3 = f1423 + 123;
                f1422 = i3 % 128;
                int i4 = i3 % 2;
                if (co.m1606(activity, list2)) {
                    final String string = new StringBuilder().append(m1669(new int[]{26, 17, 0, 11}, true, "\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern()).append(str).toString();
                    co.m1620(co.this, string, true, false, Collections.singletonList(activity));
                    p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.co.2.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            co.m1620(co.this, string, false, false, Collections.singletonList(activity));
                        }
                    });
                    int i5 = f1423 + 125;
                    f1422 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1669(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (j.f2691) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f1424, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        j.f2692 = 0;
                        char c2 = 0;
                        while (j.f2692 < i3) {
                            if (bArr[j.f2692] == 1) {
                                cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c2);
                            } else {
                                cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c2);
                            }
                            c2 = cArr2[j.f2692];
                            j.f2692++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i6, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr4[j.f2692] = cArr[(i3 - j.f2692) - 1];
                            j.f2692++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                            j.f2692++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        };
        int i2 = f1375 + 1;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        return joVar;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private cl m1580() {
        int i = 2 % 2;
        cl clVar = new cl() { // from class: com.ironsource.adqualitysdk.sdk.i.co.3
            @Override // com.ironsource.adqualitysdk.sdk.i.cl
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1564(final String str, final List<Object> list) {
                final boolean z = true;
                final boolean z2 = false;
                co.m1620(co.this, str, true, false, list);
                co.m1612(co.this, new il() { // from class: com.ironsource.adqualitysdk.sdk.i.co.3.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        co.m1620(co.this, str, false, z2, list);
                    }
                }, false);
                co.m1612(co.this, new il() { // from class: com.ironsource.adqualitysdk.sdk.i.co.3.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        co.m1620(co.this, str, false, z, list);
                    }
                }, true);
            }
        };
        int i2 = f1375 + 63;
        f1376 = i2 % 128;
        if (i2 % 2 == 0) {
            return clVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    protected final void m1631(String str, List<Object> list) {
        int i = 2 % 2;
        m1605(new StringBuilder().append(m1601("\"\u0001\u0005\u0004\u0019\u0013\u001e\u0010\u0001\u0010\b\r\u0010\u0007\u000b\u0005", (byte) (40 - TextUtils.lastIndexOf("", '0')), 15 - ImageFormat.getBitsPerPixel(0)).intern()).append(str).toString(), list);
        int i2 = f1375 + 3;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1605(final String str, final List<Object> list) {
        int i = 2 % 2;
        p.m2894(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.co.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                co.m1620(co.this, str, false, false, list);
            }
        });
        p.m2899(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.co.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                co.m1620(co.this, str, true, false, list);
            }
        });
        m1596(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.co.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                co.m1620(co.this, str, false, true, list);
            }
        }, true);
        int i2 = f1375 + 95;
        f1376 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1587(String str, boolean z, boolean z2, List<Object> list) {
        int i = 2 % 2;
        try {
            Cdo cdoM2281 = this.f1386.m2281(str);
            Object obj = null;
            if (cdoM2281 != null) {
                du duVarM2283 = this.f1386.m2283(cdoM2281.m1995());
                if (duVarM2283 != null) {
                    if (z == cdoM2281.m1994() && z2 == cdoM2281.m1996()) {
                        if (t.m2942().m2959()) {
                            int i2 = f1376 + InterfaceC0280i1.d.b.i;
                            f1375 = i2 % 128;
                            if (i2 % 2 == 0) {
                                cn.m1578(m1624(), str);
                                throw null;
                            }
                            cn.m1578(m1624(), str);
                        }
                        duVarM2283.m2081(this.f1387, this, list);
                        return;
                    }
                } else {
                    cn.m1575(m1624(), new StringBuilder().append(m1601("\u001a\b\u0003\u0017\u0001\n\u0013\n\u0000\u0014\n\u0006\u000b\u0003\n\u0003\n\u0017\u0016\u0000\u0010\u0012", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 119), 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(cdoM2281.m1995()).append(m1592(new int[]{62, 10, 0, 0}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern()).toString(), null);
                }
            }
            int i3 = f1376 + 119;
            f1375 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            cn.m1575(m1624(), new StringBuilder().append(m1601("\u001e\u000e\u0010\u0000\u0010\u0012\u0013\u000f\u0006\b\u0015\u0007\u0011#\u0014\u0004\u000e\u0003\u0011\u000b?", (byte) (31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 20 - TextUtils.indexOf((CharSequence) "", '0')).intern()).append(str).toString(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1636(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        if (str.equals(m1592(new int[]{166, 12, 0, 0}, true, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001").intern())) {
            this.f1379.m1692().m698(jSONObject);
        } else if (str.equals(m1592(new int[]{178, 9, 0, 2}, false, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000").intern())) {
            int i2 = f1375 + 93;
            f1376 = i2 % 128;
            int i3 = i2 % 2;
            this.f1379.m1692().m691(jSONObject);
        }
        JSONObject jSONObjectM2826 = kd.m2826(m1594(jSONObject));
        Object obj = null;
        if (!str.equals(ij.f2532)) {
            if (str.equals(ij.f2533)) {
                this.f1379.m1692().m693(jSONObjectM2826);
                return;
            }
            if (str.equals(ij.f2537)) {
                this.f1379.m1692().m695(jSONObjectM2826);
                return;
            }
            if (!str.equals(ij.f2538)) {
                if (str.equals(ij.f2531)) {
                    this.f1379.m1692().m687(jSONObjectM2826);
                    return;
                }
                if (str.equals(ij.f2530)) {
                    this.f1379.m1692().m686(jSONObjectM2826);
                    return;
                } else if (str.equals(ij.f2529)) {
                    this.f1379.m1692().m688(jSONObjectM2826);
                    return;
                } else {
                    this.f1379.m1692().m692(str, jSONObject);
                    return;
                }
            }
            int i4 = f1375 + 105;
            f1376 = i4 % 128;
            if (i4 % 2 == 0) {
                this.f1379.m1692().m685(jSONObjectM2826);
                return;
            } else {
                this.f1379.m1692().m685(jSONObjectM2826);
                throw null;
            }
        }
        int i5 = f1375 + 91;
        f1376 = i5 % 128;
        if (i5 % 2 == 0) {
            this.f1379.m1692().m689(jSONObjectM2826);
        } else {
            this.f1379.m1692().m689(jSONObjectM2826);
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1596(final il ilVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1375 + 115;
        f1376 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            if (z) {
                p.m2897(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.co.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        p.m2900(ilVar);
                    }
                });
                return;
            }
            p.m2900(ilVar);
            int i3 = f1375 + 75;
            f1376 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private void m1581() {
        int i = 2 % 2;
        int i2 = f1375 + 1;
        f1376 = i2 % 128;
        int i3 = i2 % 2;
        this.f1381.m3018();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1592(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1374, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c2 = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c2);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c2);
                    }
                    c2 = cArr2[j.f2692];
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1601(String str, byte b2, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2043) {
            char[] cArr2 = f1377;
            char c2 = f1378;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b2);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.f.f2047 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.f.f2047 < i) {
                    com.ironsource.adqualitysdk.sdk.i.f.f2045 = cArr[com.ironsource.adqualitysdk.sdk.i.f.f2047];
                    com.ironsource.adqualitysdk.sdk.i.f.f2048 = cArr[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.f.f2045 == com.ironsource.adqualitysdk.sdk.i.f.f2048) {
                        cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = (char) (com.ironsource.adqualitysdk.sdk.i.f.f2045 - b2);
                        cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.f.f2048 - b2);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.f.f2046 = com.ironsource.adqualitysdk.sdk.i.f.f2045 / c2;
                        com.ironsource.adqualitysdk.sdk.i.f.f2042 = com.ironsource.adqualitysdk.sdk.i.f.f2045 % c2;
                        com.ironsource.adqualitysdk.sdk.i.f.f2044 = com.ironsource.adqualitysdk.sdk.i.f.f2048 / c2;
                        com.ironsource.adqualitysdk.sdk.i.f.f2041 = com.ironsource.adqualitysdk.sdk.i.f.f2048 % c2;
                        if (com.ironsource.adqualitysdk.sdk.i.f.f2042 == com.ironsource.adqualitysdk.sdk.i.f.f2041) {
                            com.ironsource.adqualitysdk.sdk.i.f.f2046 = ((com.ironsource.adqualitysdk.sdk.i.f.f2046 + c2) - 1) % c2;
                            com.ironsource.adqualitysdk.sdk.i.f.f2044 = ((com.ironsource.adqualitysdk.sdk.i.f.f2044 + c2) - 1) % c2;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i2];
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.f.f2046 == com.ironsource.adqualitysdk.sdk.i.f.f2044) {
                            com.ironsource.adqualitysdk.sdk.i.f.f2042 = ((com.ironsource.adqualitysdk.sdk.i.f.f2042 + c2) - 1) % c2;
                            com.ironsource.adqualitysdk.sdk.i.f.f2041 = ((com.ironsource.adqualitysdk.sdk.i.f.f2041 + c2) - 1) % c2;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i4];
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.f.f2046 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2041;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.f.f2044 * c2) + com.ironsource.adqualitysdk.sdk.i.f.f2042;
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047] = cArr2[i6];
                            cArr3[com.ironsource.adqualitysdk.sdk.i.f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
