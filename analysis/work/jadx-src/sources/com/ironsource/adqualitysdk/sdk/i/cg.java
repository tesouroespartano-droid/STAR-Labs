package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cg extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1319 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1320 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1321 = 205;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1322 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1325 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1324 = {289, 279, 270, 305, 290, 315, 310, 321, 304, 323, 326, 316, 314, 251, 302, 317, 311, 277, 313, 306, 319, 271, 324, 320, 282, 291, 292, 303, 285, 281, 272, 322, 287, 318, 288, 308, 283};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1323 = 72;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementListener m1503(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1320 + 121;
        f1319 = i2 % 128;
        int i3 = i2 % 2;
        TJPlacementListener tJPlacementListenerM1513 = m1513(tJPlacement);
        int i4 = f1319 + 77;
        f1320 = i4 % 128;
        if (i4 % 2 != 0) {
            return tJPlacementListenerM1513;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1504(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1319 + 81;
        f1320 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1517(tJPlacementData);
        }
        m1517(tJPlacementData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1508(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f1320 + 19;
        f1319 = i2 % 128;
        int i3 = i2 % 2;
        String strM1512 = m1512(tJSplitWebView);
        int i4 = f1319 + 113;
        f1320 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1512;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1510(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1319 + InterfaceC0280i1.d.b.i;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        String strM1506 = m1506(tJPlacement);
        int i4 = f1319 + 91;
        f1320 = i4 % 128;
        int i5 = i4 % 2;
        return strM1506;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1511(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1319 + 43;
        f1320 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1502(tJPlacementData);
        }
        m1502(tJPlacementData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1514(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1319 + 9;
        f1320 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1507(tJPlacementData);
        }
        m1507(tJPlacementData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementVideoListener m1516(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1319 + 57;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        TJPlacementVideoListener tJPlacementVideoListenerM1501 = m1501(tJPlacement);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = f1319 + InterfaceC0280i1.d.b.b;
        f1320 = i5 % 128;
        int i6 = i5 % 2;
        return tJPlacementVideoListenerM1501;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1518(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f1319 + 33;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        m1515(tJPlacement, tJPlacementVideoListener);
        int i4 = f1320 + 37;
        f1319 = i4 % 128;
        int i5 = i4 % 2;
    }

    public cg(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x038a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        Object obj = null;
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m1509(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0088\u0098\u0094 ¢\u0094¡\u0086\u008c\u0087\u0088\u0089\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = Ascii.SYN;
                }
                break;
            case -1687314074:
                if (!str.equals(m1509(null, TextUtils.getCapsMode("", 0, 0) + WorkQueueKt.MASK, null, "\u0095\u0094\u0098\u0097\u008c\u0095\u0096\u008e\u0097\u0094\u0087\u008a\u008e\u0084\u0087\u008f\u0095\u008d\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1640254126:
                if (!str.equals(m1505("�\u000e\u0003\u0010\u0003\u000e\u0013￮￤\uffdd\t\b\u000e\uffff\b\u000eￛ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, Color.red(0) + 174, false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1628534628:
                if (!str.equals(m1505("￩\u0013\u0001\u0005\ufff2\u0000\u0005�\u000e", 1 - Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 173, true, 9 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1429063965:
                if (!str.equals(m1509(null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0095\u0094\u0086\u0094\u0088\u0098\u0087\u009e\u0088\u0086\u0094\u008d\u0094\u0089\u008f\u0093\u009d\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = Ascii.SO;
                }
                break;
            case -1414965228:
                if (!str.equals(m1509(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, "\u0095\u0094\u0093\u0084\u0086\u008f\u0092\u0086\u008c\u0087\u0088\u0089\u0083").intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1147119309:
                if (!str.equals(m1509(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0097\u0094\u0087\u009a\u009c\u0094\u009b\u0082\u0081\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    b = -1;
                } else {
                    b = Ascii.FF;
                }
                break;
            case -872754855:
                if (!str.equals(m1505("\u0004\f\u0004\u0002\u0000\u000b\uffef￩\ufff3\u0000\u0013\u0000￣\u0013\r", TextUtils.getTrimmedLength("") + 9, TextUtils.indexOf("", "") + 169, true, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -721136035:
                if (!str.equals(m1509(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i2 = f1320 + 77;
                    f1319 = i2 % 128;
                    int i3 = i2 % 2;
                    b = Ascii.CR;
                }
                break;
            case -668579974:
                if (!str.equals(m1509(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0097\u0094\u0087\u009a\u0084\u0087\u008f\u0095\u0099\u008e\u0097\u0094\u0087\u008a\u008e\u0084\u0087\u008f\u0095\u008d\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -593336436:
                if (!str.equals(m1509(null, KeyEvent.keyCodeFromString("") + WorkQueueKt.MASK, null, "\u0095\u0094\u0086\u0094\u0088\u0098\u0087\u009e\u008b\u0089\u0086\u0094\u0095\u0095 \u009f\u0084\u0095\u008f\u0097\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case -217417742:
                if (!str.equals(m1505("\u0001\uffdfￌ\u0015\u0003\u0007\u0014ￌ\u0002\u0007\uffff\u0010\u000bￌ\u0017\r\b\u000e\uffff\u0012ￌ\u000b\r\u0001\u0010\u0003\n\u0002\f\uffff￦\f\r\u0007\u0012", 23 - Process.getGidForName(""), 170 - (ViewConfiguration.getLongPressTimeout() >> 16), true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 178410181:
                if (!str.equals(m1505("ￌ\ufff2￨\ufff1\u000e\n\u0007\u0012\ufff5\u0003\u0000\ufff4\u0007\u0003\u0015\u0001\r\u000bￌ\u0012\uffff\u000e\b\r\u0017", 15 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.normalizeMetaState(0) + 170, false, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26).intern())) {
                    b = -1;
                } else {
                    b = Ascii.EM;
                }
                break;
            case 206635148:
                if (!str.equals(m1509(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u008b\u0088\u0087\u008a\u0087\u0088\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 268330895:
                if (str.equals(m1505("￮\ufff8\t\u000b\b\r\u0016￦\ufff7￮\u0018\r\u0012\ufff9\b￥", 1 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 164, true, 15 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 327820672:
                if (!str.equals(m1505("￨\u0005\u000f\u0010\u0001\n\u0001\u000e\ufff0￦￬\b�\uffff\u0001\t\u0001\n\u0010\ufff2\u0005\u0000\u0001\u000b", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, View.getDefaultSize(0, 0) + 172, false, 'H' - AndroidCharacter.getMirror('0')).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 705136807:
                if (!str.equals(m1509(null, TextUtils.indexOf("", "", 0) + WorkQueueKt.MASK, null, "\u008b\u0089\u0086\u0094\u0095\u0095 \u009f\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 741045788:
                if (!str.equals(m1509(null, TextUtils.getTrimmedLength("") + WorkQueueKt.MASK, null, "\u008b\u0088\u0087\u008a\u0087\u0088\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 832039888:
                if (!str.equals(m1505("￨\uffdf\u0002\ufff3\f\u0007\u0012\ufff5\u0003\u0000\ufff4\u0007\u0003\u0015￪\u0007\u0011\u0012\u0003\f\u0003\u0010\ufff2", MotionEvent.axisFromString("") + 23, 169 - ImageFormat.getBitsPerPixel(0), false, ((Process.getThreadPriority(0) + 20) >> 6) + 23).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 906946425:
                if (!str.equals(m1505("\u0010\u0006￩\f\u0002\u0001\u0006\ufff3\uffe7\ufff1\u000f\u0002\u000b\u0002\u0011", 10 - Color.blue(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 171, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15).intern())) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case 1317517621:
                if (!str.equals(m1509(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0097\u0094\u0087\u009a\u009c\u0094\u009b\u0088\u0087\u0093\u0090£\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i4 = f1320 + 113;
                    f1319 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.CAN;
                }
                break;
            case 1504750787:
                if (!str.equals(m1505("\u0018\ufff5￫\ufff8\u0006\u0003\ufff7\n\u0006", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, Drawable.resolveOpacity(0, 0) + 167, false, 9 - TextUtils.indexOf("", "", 0)).intern())) {
                    b = -1;
                } else {
                    int i6 = f1320 + 33;
                    f1319 = i6 % 128;
                    if (i6 % 2 == 0) {
                        b = Ascii.VT;
                    } else {
                        b = Ascii.EM;
                    }
                }
                break;
            case 1519750415:
                if (!str.equals(m1509(null, 127 - View.MeasureSpec.getMode(0), null, "\u0088\u0086\u0094\u008d\u0094\u0089\u008f\u0093\u009d\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = Ascii.NAK;
                }
                break;
            case 1815593736:
                if (!str.equals(m1509(null, (ViewConfiguration.getTapTimeout() >> 16) + WorkQueueKt.MASK, null, "\u0095\u0094\u0098\u0097\u008c\u0095\u0096").intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1891461874:
                if (!str.equals(m1509(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + WorkQueueKt.MASK, null, "\u0095\u0094\u0086\u0094\u0088\u0098\u0087\u009e\u008c\u0094\u0084\u0087\u009a\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 2041573826:
                if (!str.equals(m1505("\u0015\u000b\u0006\f�\u0010ￊ\t\u000b\uffff\u0015\u0010\u0005\u0012\u0005\u0010\uffff\uffdd\u0010\n\u0001\u0010\n\u000b\uffdf￦\ufff0ￊ", Color.blue(0) + 10, 172 - (ViewConfiguration.getLongPressTimeout() >> 16), true, View.getDefaultSize(0, 0) + 28).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case 8:
                return Browser.class;
            case 9:
            case 10:
                return MraidView.class;
            case 11:
            case 12:
                int i7 = f1319 + 89;
                f1320 = i7 % 128;
                if (i7 % 2 != 0) {
                    return TJWebView.class;
                }
                super.hashCode();
                throw null;
            case 13:
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1319 + 71;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        String version = Tapjoy.getVersion();
        int i4 = f1319 + 49;
        f1320 = i4 % 128;
        if (i4 % 2 != 0) {
            return version;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1505("\u0000\u0002\u0000\u000f￫\u0007￼\ufffe\u0000\b\u0000\t\u000f￩￼\b", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, 173 - (ViewConfiguration.getPressedStateDuration() >> 16), false, Drawable.resolveOpacity(0, 0) + 16).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1514((TJPlacementData) list.get(0));
            }
        });
        map.put(m1509(null, 127 - Color.argb(0, 0, 0, 0), null, "\u0093\u0095\u0085\u0088\u0094¤").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1504((TJPlacementData) list.get(0));
            }
        });
        map.put(m1509(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0094\u0098\u0086\u008c\u0090\u0098\u0094¡\u0090\u0088\u0088\u0092\u0088\u0094¤").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1511((TJPlacementData) list.get(0));
            }
        });
        map.put(m1509(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0094\u008d\u008f¥\u0088\u0094¤").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1510((TJPlacement) list.get(0));
            }
        });
        map.put(m1505("\t￼\u0005￼\u000b\n\u0000￣\u000b￼\ufffe", 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 177 - Color.red(0), true, 10 - ImageFormat.getBitsPerPixel(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1503((TJPlacement) list.get(0));
            }
        });
        map.put(m1509(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + WorkQueueKt.MASK, null, "\u0095\u0094\u0086\u0094\u0088\u0098\u0087\u009e\u008c\u0094\u0084\u0087\u009a\u0088\u0094¤").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1516((TJPlacement) list.get(0));
            }
        });
        map.put(m1509(null, 127 - KeyEvent.keyCodeFromString(""), null, "\u0095\u0094\u0086\u0094\u0088\u0098\u0087\u009e\u008c\u0094\u0084\u0087\u009a\u0088\u0094\u0098").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cg.m1518((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1509(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0093\u0095\u0085\u0088\u0098\u008f\u009e\u0088\u0094¤").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cg.m1508((TJSplitWebView) list.get(0));
            }
        });
        int i2 = f1320 + 79;
        f1319 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1507(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1319 + 125;
        f1320 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tJPlacementData.getPlacementName();
            super.hashCode();
            throw null;
        }
        String placementName = tJPlacementData.getPlacementName();
        int i3 = f1320 + 29;
        f1319 = i3 % 128;
        if (i3 % 2 == 0) {
            return placementName;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1517(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1319 + 85;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        String url = tJPlacementData.getUrl();
        int i4 = f1319 + 33;
        f1320 = i4 % 128;
        int i5 = i4 % 2;
        return url;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m1502(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1320 + 75;
        f1319 = i2 % 128;
        int i3 = i2 % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = f1319 + 93;
        f1320 = i5 % 128;
        if (i5 % 2 != 0) {
            return httpResponse;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1506(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1320 + InterfaceC0280i1.d.b.i;
        f1319 = i2 % 128;
        int i3 = i2 % 2;
        String name = tJPlacement.getName();
        int i4 = f1319 + 1;
        f1320 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return name;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static TJPlacementListener m1513(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1319 + 67;
        f1320 = i2 % 128;
        if (i2 % 2 != 0) {
            return tJPlacement.getListener();
        }
        tJPlacement.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1501(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1320 + InterfaceC0280i1.d.b.g;
        f1319 = i2 % 128;
        if (i2 % 2 == 0) {
            return tJPlacement.getVideoListener();
        }
        tJPlacement.getVideoListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1515(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f1319 + 7;
        f1320 = i2 % 128;
        int i3 = i2 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        int i4 = f1320 + 57;
        f1319 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1512(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f1320 + 73;
        f1319 = i2 % 128;
        int i3 = i2 % 2;
        String lastUrl = tJSplitWebView.getLastUrl();
        int i4 = f1320 + 85;
        f1319 = i4 % 128;
        if (i4 % 2 == 0) {
            return lastUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1509(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1324;
            int i2 = f1321;
            if (f1325) {
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
            if (f1322) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1505(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1323);
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
