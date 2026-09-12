package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends cx implements ci {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f1740 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1741 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1742 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1744 = -775161171;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1746 = 4;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1747 = -1934585573;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1749;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1751;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1753;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1745 = {37, Ascii.RS, -85, 39, -82, Ascii.US, Ascii.RS, -81, 39, Ascii.US, -71, 42, Ascii.US, -79, -100, 48, 51, -125, -99, 35, -100, 35, 47, 55, -118, -97, -107, 51, -100, 41, -97, 60, 125, 47, -110, -24, -73, -79, -49, -55, -53, -50, -101, -19, -81, -22, 110, 67, 53, 91, 77, 79, 92, Ascii.US, 121, 59, 108, Ascii.SYN, -28, 49, 40, -73, 39, 45, 45, -60, Ascii.ESC, -37, 42, -71, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1743 = 152;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1750 = "";

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private double f1752 = -1.0d;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f1748 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1924(String str) {
        int i = 2 % 2;
        int i2 = f1741 + 9;
        int i3 = i2 % 128;
        f1742 = i3;
        int i4 = i2 % 2;
        this.f1751 = str;
        int i5 = i3 + 45;
        f1741 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1920() {
        int i = 2 % 2;
        int i2 = f1741 + InterfaceC0280i1.d.b.i;
        f1742 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1751;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1919(String str) {
        int i = 2 % 2;
        int i2 = f1742 + 85;
        int i3 = i2 % 128;
        f1741 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.f1750 = str;
        if (i4 != 0) {
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 93;
        f1742 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1918() {
        int i = 2 % 2;
        int i2 = f1742 + 117;
        int i3 = i2 % 128;
        f1741 = i3;
        int i4 = i2 % 2;
        String str = this.f1750;
        int i5 = i3 + 31;
        f1742 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1922(Double d) {
        int i = 2 % 2;
        int i2 = f1742 + 5;
        f1741 = i2 % 128;
        int i3 = i2 % 2;
        this.f1752 = d.doubleValue();
        int i4 = f1741 + 31;
        f1742 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Double m1915() {
        int i = 2 % 2;
        int i2 = f1742 + 63;
        f1741 = i2 % 128;
        if (i2 % 2 != 0) {
            Double.valueOf(this.f1752);
            throw null;
        }
        Double dValueOf = Double.valueOf(this.f1752);
        int i3 = f1742 + 5;
        f1741 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return dValueOf;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1913(boolean z) {
        int i = 2 % 2;
        int i2 = f1742 + 65;
        f1741 = i2 % 128;
        int i3 = i2 % 2;
        this.f1753 = z;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m1925(boolean z) {
        int i = 2 % 2;
        int i2 = f1742;
        int i3 = i2 + 75;
        f1741 = i3 % 128;
        int i4 = i3 % 2;
        this.f1748 = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 49;
        f1741 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m1914() {
        int i = 2 % 2;
        int i2 = f1742;
        int i3 = i2 + 71;
        f1741 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1748;
        int i5 = i2 + 37;
        f1741 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean m1912() {
        int i = 2 % 2;
        int i2 = f1741 + 99;
        int i3 = i2 % 128;
        f1742 = i3;
        int i4 = i2 % 2;
        boolean z = this.f1753;
        int i5 = i3 + 79;
        f1741 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1921(String str) {
        int i = 2 % 2;
        int i2 = f1742 + 55;
        int i3 = i2 % 128;
        f1741 = i3;
        int i4 = i2 % 2;
        this.f1749 = str;
        int i5 = i3 + 31;
        f1742 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1910() {
        String str;
        int i = 2 % 2;
        int i2 = f1742 + InterfaceC0280i1.d.b.b;
        int i3 = i2 % 128;
        f1741 = i3;
        if (i2 % 2 != 0) {
            str = this.f1749;
            int i4 = 83 / 0;
        } else {
            str = this.f1749;
        }
        int i5 = i3 + InterfaceC0280i1.d.b.i;
        f1742 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1911() {
        String strIntern;
        int i = 2 % 2;
        int i2 = f1741 + 53;
        f1742 = i2 % 128;
        if (i2 % 2 == 0) {
            m1912();
            throw null;
        }
        if (!(!m1912())) {
            int i3 = f1741 + 3;
            f1742 = i3 % 128;
            int i4 = i3 % 2;
            strIntern = m1916(1934585572 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (50 - ImageFormat.getBitsPerPixel(0)), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 775161273, (short) ((KeyEvent.getMaxKeyCode() >> 16) + 21)).intern();
            int i5 = f1742 + 125;
            f1741 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strIntern = m1916((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1934585581, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 69), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 775161268, (short) ((-111) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern();
        }
        return new StringBuilder().append(m1917("\u0010\u0005\u000b\nￊ\t\u0001\u0000\u0005�", TextUtils.getTrimmedLength("") + 5, ImageFormat.getBitsPerPixel(0) + 253, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10).intern()).append(this.f1750).append(m1916(View.combineMeasuredStates(0, 0) + 1934585587, (byte) (View.MeasureSpec.getSize(0) - 42), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 3, 775161217 - (KeyEvent.getMaxKeyCode() >> 16), (short) ((-15) - View.MeasureSpec.getMode(0))).intern()).append(strIntern).toString();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m1923() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ij.f2569, this.f1751);
            if (this.f1752 > -1.0d) {
                jSONObject2.put(ij.f2522, this.f1752);
            }
            jSONObject2.put(ij.f2520, this.f1749);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (this.f1748) {
                    int i2 = f1741 + 37;
                    f1742 = i2 % 128;
                    int i3 = i2 % 2;
                    jSONObject2.put(ij.f2523, true);
                    int i4 = f1742 + 71;
                    f1741 = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONObject.put(ij.f2521, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0157  */
    /* JADX WARN: Code duplicated, block: B:54:0x02e4  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2010356102:
                if (!str.equals(m1917("\u000e\u000f￠\u0011\u0000\t\u000f￩￼\b\u0000\u0002\u0000\u000f\uffdd\r\n￼\uffff\ufffe￼", TextUtils.indexOf("", "", 0) + 11, 253 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), false, TextUtils.indexOf("", "", 0) + 21).intern())) {
                    b = -1;
                } else {
                    b = Ascii.FF;
                }
                break;
            case -1679773410:
                if (!str.equals(m1917("\u000f￫\u0007￼\ufffe\u0000\b\u0000\t\u000f￤\uffff\u000e\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 254, false, 14 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1457409854:
                if (!str.equals(m1917("\uffdd\t\b\b\uffff�\u000e\t\f￨\ufffb\u0007\uffff\u0001\uffff\u000e", 13 - TextUtils.getOffsetAfter("", 0), 254 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, View.MeasureSpec.makeMeasureSpec(0, 0) + 16).intern())) {
                    b = -1;
                } else {
                    int i2 = f1742 + 7;
                    f1741 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b = 1;
                    } else {
                        b = 0;
                    }
                }
                break;
            case -1033133001:
                if (!str.equals(m1916(ImageFormat.getBitsPerPixel(0) + 1934585609, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 107), (ViewConfiguration.getJumpTapTimeout() >> 16) + 8, 775161286 - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 76)).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -869156349:
                if (!str.equals(m1917("\u0004\u0005\t￠\u0005\n", (KeyEvent.getMaxKeyCode() >> 16) + 6, 258 - TextUtils.indexOf("", "", 0), true, 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i3 = f1741 + 47;
                    f1742 = i3 % 128;
                    int i4 = i3 % 2;
                    b = 13;
                }
                break;
            case -303276684:
                if (!str.equals(m1917("\ufffe\u0003\ufffb\u000e\uffff\ufffe￨\uffff\u000e\u0011\t\f\u0005￨\ufffb\u0007\uffff\u0001\uffff\u000e\uffe7\uffff", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, (ViewConfiguration.getJumpTapTimeout() >> 16) + 254, false, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i5 = f1742 + 5;
                    f1741 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 3;
                }
                break;
            case 91962794:
                if (!str.equals(m1916(1934585630 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (TextUtils.indexOf("", "", 0, 0) + 58), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, TextUtils.indexOf("", "", 0) + 775161274, (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10)).intern())) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 701278346:
                if (!str.equals(m1917("ￜ\uffff\u000e\u0000\u000f￤\u000e￡\u0010\u0007\u0007\u000e\ufffe\r\u0000\u0000\t", 2 - (ViewConfiguration.getTapTimeout() >> 16), 252 - ImageFormat.getBitsPerPixel(0), false, View.MeasureSpec.getSize(0) + 17).intern())) {
                    b = -1;
                } else {
                    int i7 = f1742 + 21;
                    f1741 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 6;
                }
                break;
            case 1006114614:
                if (!str.equals(m1917("\ufffe￼\r\b\u000b\uffe7\ufffa\u0006\ufffe\f\ufffe\rￜ\b\u0007\u0007", View.resolveSize(0, 0) + 9, 256 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 15 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1009851624:
                if (!str.equals(m1916(1934585587 - TextUtils.indexOf("", "", 0, 0), (byte) (66 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 19, TextUtils.getOffsetAfter("", 0) + 775161286, (short) (KeyEvent.normalizeMetaState(0) + 30)).intern())) {
                    b = -1;
                } else {
                    int i9 = f1742 + 13;
                    f1741 = i9 % 128;
                    b = i9 % 2 == 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 1314266045:
                if (!str.equals(m1917("\n\fￚ\n￠\u000b￼\n\u0004\u0006\u000b", 7 - Process.getGidForName(""), 257 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 1402845873:
                if (!str.equals(m1917("\r\ufffe\u0000\u0006\b\r\f\u000eￜ\f￢", Gravity.getAbsoluteGravity(0, 0) + 3, TextUtils.getCapsMode("", 0, 0) + 255, true, 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 1641431166:
                if (!str.equals(m1917("\u0001\u0003\u0000\uffdd\n\u0001\u0001\u000e\uffff\u000f\b\b\u0011￢\u000f￥\u0010", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, 252 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1712841667:
                if (!str.equals(m1916(1934585619 - TextUtils.getOffsetAfter("", 0), (byte) (View.combineMeasuredStates(0, 0) - 23), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 775161274 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((-85) - ExpandableListView.getPackedPositionType(0L))).intern())) {
                    b = -1;
                } else {
                    int i10 = f1742 + 113;
                    int i11 = i10 % 128;
                    f1741 = i11;
                    int i12 = i10 % 2;
                    int i13 = i11 + 123;
                    f1742 = i13 % 128;
                    int i14 = i13 % 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                m1924((String) m1770(list, 0, String.class));
                int i15 = f1742 + 61;
                f1741 = i15 % 128;
                int i16 = i15 % 2;
                return null;
            case 1:
                String strM1920 = m1920();
                int i17 = f1742 + 31;
                f1741 = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 74 / 0;
                }
                return strM1920;
            case 2:
                m1919((String) m1770(list, 0, String.class));
                int i19 = f1742 + 61;
                f1741 = i19 % 128;
                int i110 = i19 % 2;
                return null;
            case 3:
                return m1918();
            case 4:
                m1922((Double) m1770(list, 0, Double.class));
                int i111 = f1742 + 61;
                f1741 = i111 % 128;
                int i112 = i111 % 2;
                return null;
            case 5:
                return m1915();
            case 6:
                m1913(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                int i113 = f1742 + 61;
                f1741 = i113 % 128;
                int i114 = i113 % 2;
                return null;
            case 7:
                return Boolean.valueOf(m1912());
            case 8:
                m1921((String) m1770(list, 0, String.class));
                int i115 = f1742 + 61;
                f1741 = i115 % 128;
                int i116 = i115 % 2;
                return null;
            case 9:
                return m1910();
            case 10:
                m1925(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                return Boolean.valueOf(m1914());
            case 11:
                return Boolean.valueOf(m1914());
            case 12:
                return m1911();
            case 13:
                return m1923();
            default:
                int i117 = f1742 + 61;
                f1741 = i117 % 128;
                int i118 = i117 % 2;
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1916(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1746;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1745;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1747 + i] + i4);
                } else {
                    i5 = (short) (f1740[f1747 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1747 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1744);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1745;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1740;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1917(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1743);
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
