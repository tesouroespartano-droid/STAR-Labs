package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ce extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1275 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1276 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1278 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1279 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1280 = 120;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1281;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1277 = {Typography.section, 206, 237, 230, 223, 228, 221, 185, 229, 217, 242, 231, 179, 207, 218, 225, 239, 219, 236, 238, 241, 220, 234, 235, 200, 187, 202, 232, 227, 196, 197, 193, 188, 190, Typography.times, Typography.half, 166, 186, 198, 205};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1274 = 183;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Placement m1453(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f1276 + 87;
        f1275 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1457(repository, str);
        }
        m1457(repository, str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m1456(Placement placement) {
        int i = 2 % 2;
        int i2 = f1276 + 19;
        f1275 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1452(placement);
        }
        m1452(placement);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1458(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1276 + InterfaceC0280i1.d.b.i;
        f1275 = i2 % 128;
        int i3 = i2 % 2;
        String strM1454 = m1454(advertisement);
        int i4 = f1276 + 23;
        f1275 = i4 % 128;
        int i5 = i4 % 2;
        return strM1454;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1459(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1276 + 15;
        f1275 = i2 % 128;
        if (i2 % 2 != 0) {
            m1451(advertisement);
            throw null;
        }
        String strM1451 = m1451(advertisement);
        int i3 = f1276 + 21;
        f1275 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM1451;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m1461(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1275 + 33;
        f1276 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM1449 = m1449(advertisement);
        int i4 = f1275 + 13;
        f1276 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return mapM1449;
    }

    public ce(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        String strMo820 = mo820();
        if (strMo820 != null) {
            int i2 = f1275 + 9;
            f1276 = i2 % 128;
            int i3 = i2 % 2;
            return strMo820.split(m1460(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0081").intern())[1];
        }
        int i4 = f1276 + 19;
        f1275 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo820() {
        int i = 2 % 2;
        if (this.f1281 == null) {
            int i2 = f1275 + InterfaceC0280i1.d.b.i;
            f1276 = i2 % 128;
            if (i2 % 2 != 0) {
                String strM1450 = m1450();
                this.f1281 = strM1450;
                m817(strM1450);
            } else {
                String strM1451 = m1450();
                this.f1281 = strM1451;
                m817(strM1451);
                throw null;
            }
        }
        String str = this.f1281;
        int i3 = f1276 + 81;
        f1275 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1450() {
        int i = 2 % 2;
        int i2 = f1276 + 21;
        f1275 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM1448 = m1448();
        hu.m2296().m2298();
        try {
            Iterator<Field> it = hu.m2296().m2298().m2240(clsM1448, hm.m2236().m2268(String.class).m2269(8).m2266(16).m2267()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (!str.startsWith(m1460(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                    int i4 = f1276 + 69;
                    f1275 = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (str.startsWith(m1455("\f\uffde\uffff\u0006\u0001\b\u000f\ufff0\ufffe\u0003\t", Gravity.getAbsoluteGravity(1, 0) + 57, 12545 >>> KeyEvent.getDeadChar(0, 0), true, 74 / Color.argb(0, 1, 1, 1)).intern())) {
                        }
                    } else if (str.startsWith(m1455("\f\uffde\uffff\u0006\u0001\b\u000f\ufff0\ufffe\u0003\t", 8 - Gravity.getAbsoluteGravity(0, 0), 285 - KeyEvent.getDeadChar(0, 0), true, 11 - Color.argb(0, 0, 0, 0)).intern())) {
                    }
                }
                return str.split(m1460(null, View.resolveSizeAndState(0, 0, 0) + WorkQueueKt.MASK, null, "\u008d").intern())[0];
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        int i2 = f1275 + 71;
        f1276 = i2 % 128;
        if (i2 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -2075872274:
                b = !str.equals(m1460(null, Color.red(0) + WorkQueueKt.MASK, null, "\u0097\u0087\u0093\u0084\u0087\u0098\u0087\u0097\u0099\u0096\u0088¡ \u0088\u009b\u009f").intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2012803321:
                b = !str.equals(m1460(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0091\u0087\u0090\u0082\u0087\u0094\u0090\u0093\u008a§\u0087\u0086\u0085\u0084\u0083\u0082¥\u0091\u0087\u0090\u0094¥\u0090\u0083¥\u0084\u0087\u0097\u0097\u008a\u0091¥\u0087\u0086\u0085\u0084\u0083\u0094¥\u0089\u008c\u0092").intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1853707364:
                if (!str.equals(m1460(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0091\u0087\u0090\u0082\u0097\u0087\u0084\u0084\u008a¦\u0087\u0086\u0085\u0084\u0083\u0082¥\u0091\u0087\u0090\u0094¥\u0090\u0083¥\u0084\u0087\u0097\u0097\u008a\u0091¥\u0087\u0086\u0085\u0084\u0083\u0094¥\u0089\u008c\u0092").intern())) {
                    b = -1;
                } else {
                    int i3 = f1276 + 17;
                    f1275 = i3 % 128;
                    b = i3 % 2 == 0 ? Ascii.RS : (byte) 111;
                }
                break;
            case -1850654380:
                if (!str.equals(m1460(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), null, "\u0093\u0097\u008c\u009c\u0087\u009b").intern())) {
                    b = -1;
                } else {
                    int i4 = f1275 + 71;
                    f1276 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 8;
                }
                break;
            case -1836618638:
                b = !str.equals(m1460(null, 127 - Color.green(0), null, "\u0095\u0093\u0090\u0094\u0090\u0093\u0092\u0088\u0096\u0088").intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case -1740904301:
                b = !str.equals(m1460(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u0091\u0087\u0090\u0082\u0096\u0088\u0086\u008a\u0092\u008c\u009e").intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1721428911:
                if (!str.equals(m1455("\uffff\u0004�￮\r\u0006", 2 - TextUtils.lastIndexOf("", '0'), 287 - (Process.myPid() >> 22), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 6).intern())) {
                    b = -1;
                } else {
                    int i6 = f1275 + 69;
                    f1276 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 0;
                }
                break;
            case -1057659822:
                b = !str.equals(m1460(null, TextUtils.getOffsetBefore("", 0) + WorkQueueKt.MASK, null, "\u0097\u0087\u0084\u0087\u0093\u0098\u0090\u009e\u0093\u0084\u0087\u0094¤£\u0097\u0087\u0093\u0084\u0087\u0098\u0087\u0097\u0099\u0093\u0084\u0087\u0089\u0087\u0098\u0090\u0093\u0097\u0087\u0094\u0096\u0088").intern()) ? (byte) -1 : Ascii.EM;
                break;
            case -965507231:
                if (!str.equals(m1455("￮\ufff5￦\u001c\n\u000e\ufffb\u0007\n￼", 9 - MotionEvent.axisFromString(""), 274 - KeyEvent.keyCodeFromString(""), true, 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i8 = f1276 + 17;
                    f1275 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 22;
                }
                break;
            case -899612152:
                if (!str.equals(m1455("\u0010\u0015\uffff\u000b\tￊ\u0012\u0011\n\u0003\b\u0001ￊ\u0013�\u000e\u000e\u0001\nￊ\u0011\u0005ￊ\ufff2\u0011\n\u0003\b\u0001\ufff3\u0001\ufffe\ufff2\u0005\u0001\u0013\uffdd\uffff\u0010\u0005\u0012\u0005", 3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 284, false, Color.blue(0) + 42).intern())) {
                    b = -1;
                } else {
                    int i10 = f1275 + 91;
                    f1276 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 4;
                }
                break;
            case -828205665:
                b = !str.equals(m1460(null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), null, "\u0091\u0087\u0090\u0082\u0096\u0088¡ \u0088\u009b\u009f").intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -747599243:
                b = !str.equals(m1460(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + WorkQueueKt.MASK, null, "\u0093\u0092\u008a\u0097\u0093\u0084\u008c\u009a\u0096\u0088").intern()) ? (byte) -1 : Ascii.VT;
                break;
            case -498060603:
                if (!str.equals(m1460(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u0093\u0084\u0087\u0089\u0087\u0092\u008a\u0086\u0099").intern())) {
                    b = -1;
                } else {
                    int i12 = f1276 + 107;
                    f1275 = i12 % 128;
                    b = i12 % 2 == 0 ? (byte) 6 : Base64.padSymbol;
                }
                break;
            case -350701718:
                b = !str.equals(m1455("\r\u0006\u0003\b�\u0007\u0003\u0004\ufff9￦", View.MeasureSpec.getSize(0) + 10, (ViewConfiguration.getWindowTouchSlop() >> 8) + 291, true, Color.green(0) + 10).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -92732536:
                b = !str.equals(m1455("\n\f\u0000\u000f\u0002\u000b\u000b\ufffe\uffdf\u0002\t\u0004\u000b\u0012\ufff3ￋ\u000b\u0002\u000f\u000f\ufffe\u0014ￋ\u0002\t\u0004\u000b\u0012\u0013ￋ", AndroidCharacter.getMirror('0') - '-', (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 282, true, 30 - KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : Ascii.FS;
                break;
            case 156342925:
                b = !str.equals(m1460(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0091\u0087\u0090\u0082\u0087\u0094\u0090\u0093\u008a§\u0087\u0086\u0085\u0084\u0083\u0082").intern()) ? (byte) -1 : Ascii.US;
                break;
            case 315438882:
                b = !str.equals(m1455("\ufffbￜ\uffff\u0006\u0001\b\u000f\ufff0\u0011\uffff\u0003\ufff0\f\uffff\b\b", 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 285 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, (ViewConfiguration.getEdgeSlop() >> 16) + 16).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case 332396988:
                b = !str.equals(m1460(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + WorkQueueKt.MASK, null, "\u0091\u0087\u0090\u0082\u0096\u0088\u008f\u0087\u008e").intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case 505165239:
                b = !str.equals(m1460(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0095\u0093\u0090\u0094\u0090\u0093\u0092\u0088\u0091\u0087\u0090\u0082\u008f\u0087\u008e\u0087\u0086\u0085\u0084\u0083\u0082").intern()) ? (byte) -1 : (byte) 3;
                break;
            case 670892517:
                b = !str.equals(m1460(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u0093\u0084\u0087\u0089\u0087\u0098\u0090\u0093\u0097\u0087\u0094\u0096\u0088").intern()) ? (byte) -1 : (byte) 5;
                break;
            case 746354589:
                if (!str.equals(m1460(null, (ViewConfiguration.getTouchSlop() >> 8) + WorkQueueKt.MASK, null, "\u0097\u0087\u0093\u0084\u0087\u0098\u0087\u0097\u0099\u0086\u008a\u0092\u008c\u009e").intern())) {
                    b = -1;
                } else {
                    int i13 = f1276 + 71;
                    f1275 = i13 % 128;
                    int i14 = i13 % 2;
                    b = Ascii.SI;
                }
                break;
            case 798818448:
                b = !str.equals(m1455("\u0005\u0001\u0013￨\u000b\uffff�\b\ufff2", 3 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionChild(0L) + 284, false, TextUtils.lastIndexOf("", '0', 0) + 10).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 1033471823:
                b = !str.equals(m1455("\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\uffff\u000b\tￊ\u0012\u0011\n\u0003\b\u0001ￊ\u0013�\u000e\u000e\u0001\nￊ\u0011\u0005ￊ\ufff2\u0011\n\u0003\b\u0001", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 284, false, (ViewConfiguration.getPressedStateDuration() >> 16) + 35).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1110462460:
                b = !str.equals(m1455("￨\ufff9\ufff4\f\u001b\b\u000e\f\u0013\f￫￫\ufff0", 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 272, true, 13 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 1205766784:
                b = !str.equals(m1455("\f\u0005\ufffe\u0003￼\uffd8\ufffa\u000b\u0000\r\u0000\u000b\u0010￭", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, 287 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, (ViewConfiguration.getScrollBarSize() >> 8) + 14).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1208038126:
                b = !str.equals(m1460(null, Process.getGidForName("") + 128, null, "\u0093\u0084\u0087\u0090\u0086\u009a\u008f\u0087\u008e\u0087\u0086\u0085\u0084\u0083\u0082").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1230133745:
                b = !str.equals(m1460(null, 127 - View.MeasureSpec.getMode(0), null, "\u0097\u0087\u0093\u0084\u0087\u0098\u0087\u0097\u0099\u0096\u0088\u008f\u0087\u008e").intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case 1461477995:
                b = !str.equals(m1460(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0095\u0097\u008c\u0093\u0092\u008a¢\u0084\u008c\u0090\u0093\u008a\u0093\u0084\u0087\u0098\u0087\u0097\u0099\u0093\u0084\u0087\u0089\u0087\u0098\u0090\u0093\u0097\u0087\u0094\u0096\u0088").intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1611471226:
                if (!str.equals(m1455("\u0001\u000f\u0001\u000e￬\u0000\uffdd\b�\uffff\u000b￨\u000e\u0001\u0010\n", 12 - (Process.myTid() >> 22), 283 - Gravity.getAbsoluteGravity(0, 0), true, Color.green(0) + 16).intern())) {
                    b = -1;
                } else {
                    int i15 = f1275 + 115;
                    f1276 = i15 % 128;
                    b = i15 % 2 != 0 ? (byte) 16 : (byte) 86;
                }
                break;
            case 1731532800:
                b = !str.equals(m1460(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u0093\u0092\u008a\u0097\u0093\u0084\u008c\u009a\u0096\u0088\u0086\u008a\u0092\u008c\u009e").intern()) ? (byte) -1 : (byte) 12;
                break;
            case 1766407901:
                if (!str.equals(m1455("\u0007\u0002\t\u0010\ufff1\r\u0000\t\t￼\uffdd\u0000", 5 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0') + 285, true, Color.red(0) + 12).intern())) {
                    b = -1;
                } else {
                    int i16 = f1275 + 65;
                    f1276 = i16 % 128;
                    b = i16 % 2 == 0 ? (byte) 77 : Ascii.ESC;
                }
                break;
            case 1777696764:
                b = !str.equals(m1460(null, TextUtils.indexOf("", "", 0) + WorkQueueKt.MASK, null, "\u009d\u0092\u008a\u008f\u0086\u0086\u008a\u009a\u0096\u0088\u0095\u008a\u0086\u0099").intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1861686093:
                b = !str.equals(m1455("ￚ�ￜ\b\u0007\r\u000b\ufffa￼\r\ufff8ￚ�\u000f\ufffe\u000b\r\u0002\f\ufffe\u0006\ufffe\u0007\r￩\u000b\ufffe\f\ufffe\u0007\r\ufffe\u000b", 33 - (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 286, false, (ViewConfiguration.getTapTimeout() >> 16) + 33).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case 8:
                return Report.class;
            case 9:
                return PlayAdCallback.class;
            case 10:
                return Repository.class;
            case 11:
                return AdContract.class;
            case 12:
                return LocalAdContract.class;
            case 13:
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1455("￩\r\ufffe\u0000\r\u0007\ufffe\u0006\ufffe￼\ufffa\u0005", 4 - (ViewConfiguration.getLongPressTimeout() >> 16), 285 - ExpandableListView.getPackedPositionChild(0L), true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ce.m1453((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1455("\u0000\u0011￼\ufffb\u0000\n￠\u0005\ufffa￼\u0005\u000b\u0000\r", 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 288, false, View.MeasureSpec.getSize(0) + 14).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(ce.m1456((Placement) list.get(0)));
            }
        });
        map.put(m1455("￠\u0013\u0004\u0006\u0003￨\u0013\u0004\n\u0011\u0000￬\u0003", 3 - Process.getGidForName(""), TextUtils.lastIndexOf("", '0') + 281, true, 13 - View.getDefaultSize(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ce.m1459((Advertisement) list.get(0));
            }
        });
        map.put(m1455("\u0000\u000f\uffde￼\b\u000b￼\u0004\u0002\t\u0002", 9 - Process.getGidForName(""), 284 - (ViewConfiguration.getScrollBarSize() >> 8), false, TextUtils.getCapsMode("", 0, 0) + 11).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ce.m1458((Advertisement) list.get(0));
            }
        });
        map.put(m1460(null, (ViewConfiguration.getEdgeSlop() >> 16) + WorkQueueKt.MASK, null, "\u0098\u0086\u0097¨\u0087\u0086\u008f\u008a\u0096\u008a\u008c\u0086\u0084\u0091\u008c¡\u0093\u0087\u0085").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ce.m1461((Advertisement) list.get(0));
            }
        });
        int i2 = f1275 + 31;
        f1276 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m1452(Placement placement) {
        int i = 2 % 2;
        int i2 = f1275 + 61;
        f1276 = i2 % 128;
        if (i2 % 2 == 0) {
            placement.isIncentivized();
            throw null;
        }
        boolean zIsIncentivized = placement.isIncentivized();
        int i3 = f1275 + 83;
        f1276 = i3 % 128;
        int i4 = i3 % 2;
        return zIsIncentivized;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1451(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1276 + 33;
        f1275 = i2 % 128;
        if (i2 % 2 == 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1454(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1276 + InterfaceC0280i1.d.b.d;
        f1275 = i2 % 128;
        if (i2 % 2 != 0) {
            advertisement.getCampaign();
            throw null;
        }
        String campaign = advertisement.getCampaign();
        int i3 = f1276 + 25;
        f1275 = i3 % 128;
        int i4 = i3 % 2;
        return campaign;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Map<String, String> m1449(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1276 + 95;
        f1275 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        int i4 = f1275 + InterfaceC0280i1.d.b.i;
        f1276 = i4 % 128;
        if (i4 % 2 != 0) {
            return downloadableUrls;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Class m1448() {
        int i = 2 % 2;
        int i2 = f1275;
        int i3 = i2 + 31;
        f1276 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        f1276 = i5 % 128;
        if (i5 % 2 != 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Placement m1457(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f1276 + 23;
        f1275 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i3 = f1276 + 89;
        f1275 = i3 % 128;
        int i4 = i3 % 2;
        return placement;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1460(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1277;
            int i2 = f1280;
            if (f1278) {
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
            if (f1279) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1455(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1274);
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
