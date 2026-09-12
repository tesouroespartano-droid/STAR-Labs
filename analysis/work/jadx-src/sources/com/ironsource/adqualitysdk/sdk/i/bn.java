package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class bn extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f939 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f940 = {':', 'j', 'g', 'o', 'p', 'Z', 'U', 'R', 'S', 'm', 'o', 'W', '2', 'd', 'b', 'c', 'l', 'k', 'l', 'q', '[', 'V', 'R', 'S', 'm', 'o', 'W', '|', 229, 224, 220, 221, 247, 249, 225, 227, 240, 239, 248, 248, 248, 253, 252, 245, 246, 'W', 166, 140, 139, 145, 147, Typography.section, 172, 165, Typography.cent, Typography.cent, 164, 149, 144, '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'X', 'b', 'h', ']', 'X', 'R', 'S', 'm', 'o', 'W', '4', 'o', 'o', 'n', 'k', 'R', 'R', 'R', ']', 'v', 'q', 246, 263, 255, 259, 243, 238, 252, 251, 260, 260, 260, 265, 264, 257, 258, 263, 241, 236, 232, 233, 259, 261, 237, 242, 257, 255, 255, 258, 265, 260, '#', 'W', 'o', 'm', 'S', 'R', ']', '_', 'f', 'd', 'j', '`', '[', 'n', 'l', 'i', 'k', 'T', ']', 'm', 'i', 'q', '`', 'Z', 'n', 's', 'l', 'i', 'i', 'k', '3', 'f', 'l', 'Z', 'X', 'p', '\\', 'V', 'U', '\\', 'p', 'n', 'W', 'R', 'S', 'Y', 'n', 'j', 'g', 'h', 278, 241, 268, 233, 269, 286, 273, 238, 284, 269, 271, 268, 241, 284, 279, 276, 251, 269, 267, 265, 270, 282, 269, 284, 'z', 227, 228, 254, 256, 232, 238, 253, 247, 247, 251, 261, 247, 237, 254, 256, 255, 251, 244, 252, 235, 229, 245, 243, 244, 253, 252, 253, 258, 236, 'E', 132, 130, 130, 133, 140, 135, 's', 'q', '}', '{', '|', 133, 132, 133, 138, 't', 'o', 'k', 'l', 134, 136, 'p', 'v', 133, 133, 138, 280, 278, 262, 271, 282, 283, 285, 285, 290, 282, 284, 284, 257, 265, 291, 289, 291, 284, 261, 267, 285, 288, 290, 291, 267, 258, 257, 258, 284, 286, 262, 268, 283, 277, '9', 'l', 'l', '`', ']', 'h', 'b', 'X', 'Z', 'n', 's', 'l', 'i', 'i', 'k', ':', '`', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'r', 'l', 'l', 'e', '_', 'g', 'n', '^', ']', 'm', 'i'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f941 = 46;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f942 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ FiveAd m993() {
        int i = 2 % 2;
        int i2 = f939 + 99;
        f942 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m996();
            super.hashCode();
            throw null;
        }
        FiveAd fiveAdM996 = m996();
        int i3 = f939 + 125;
        f942 = i3 % 128;
        if (i3 % 2 != 0) {
            return fiveAdM996;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ CreativeType m1000(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 67;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        CreativeType creativeTypeM995 = m995(fiveAdInterface);
        int i4 = f939 + 1;
        f942 = i4 % 128;
        int i5 = i4 % 2;
        return creativeTypeM995;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1001(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f939 + 67;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        String strM1014 = m1014(fiveAdConfig);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return strM1014;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ FiveAdListener m1003(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 25;
        f939 = i2 % 128;
        if (i2 % 2 == 0) {
            return m997(fiveAdInterface);
        }
        m997(fiveAdInterface);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1007(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f939 + 65;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        String strM1004 = m1004(fiveAdCustomLayout);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return strM1004;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1008(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f939 + 71;
        f942 = i2 % 128;
        if (i2 % 2 == 0) {
            m998(fiveAdInterface);
            throw null;
        }
        String strM998 = m998(fiveAdInterface);
        int i3 = f939 + 53;
        f942 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM998;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m1010(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f939 + 67;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        m1013(fiveAdInterface, fiveAdLoadListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m1011(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f942 + 27;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        m1002(fiveAdInterface, fiveAdViewEventListener);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1012(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 45;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        String strM999 = m999(fiveAdInterface);
        int i4 = f939 + 31;
        f942 = i4 % 128;
        int i5 = i4 % 2;
        return strM999;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m1015(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 79;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        String strM994 = m994(fiveAdInterface);
        int i4 = f942 + 121;
        f939 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return strM994;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1016(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f942 + 115;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        m1006(fiveAdInterface, fiveAdListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bn(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f939 + 91;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return sdkSemanticVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0262  */
    /* JADX WARN: Code duplicated, block: B:69:0x02be  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        char c = 14;
        byte b = Ascii.FF;
        switch (iHashCode) {
            case -1836618638:
                if (!str.equals(m1009(new int[]{77, 10, 0, 8}, true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.CR;
                }
                break;
            case -1782131271:
                if (!str.equals(m1009(new int[]{118, 30, 0, 0}, false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -962125644:
                if (!str.equals(m1005("\u0005￢\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0010\n\u0001\u0012￡\u0013\u0001\u0005\ufff2\u0000\uffdd\u0001\u0012", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 145, true, 23 - View.MeasureSpec.getMode(0)).intern())) {
                    b = -1;
                }
                break;
            case -939888073:
                if (str.equals(m1005("\t\u0007￦\t\u0016\u0005￡\u0004￣\u000f\u000e\u0006", 1 - ExpandableListView.getPackedPositionChild(0L), 142 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern())) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -853874964:
                if (!str.equals(m1009(new int[]{0, 12, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    int i2 = f942 + 73;
                    f939 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b = 5;
                    } else {
                        b = 2;
                    }
                }
                break;
            case -735613671:
                if (!str.equals(m1005("￠\u0003￠\u0002\u0013\b\u0015\b\u0013\u0018\u0002\u000e\fￍ\u0005\b\u0015\u0004\ufffe\u0002\u000e\u0011\u000fￍ\u0000\u0003ￍ", Color.green(0) + 10, 143 - KeyEvent.normalizeMetaState(0), false, 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i3 = f942 + 35;
                    f939 = i3 % 128;
                    int i4 = i3 % 2;
                }
                break;
            case -624329424:
                if (!str.equals(m1005("\u0011\u0004￡\u000f\u0010\n\u0014￼\uffe7\b\n\u000f\u000e\u0010\uffde\uffffￜ\u0000", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, 146 - TextUtils.lastIndexOf("", '0'), true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -295916403:
                c = 'W';
                if (!str.equals(m1009(new int[]{87, 31, 150, 24}, true, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i5 = f942 + 35;
                    f939 = i5 % 128;
                    b = i5 % 2 == 0 ? (byte) 15 : c;
                }
                break;
            case -189625759:
                if (str.equals(m1009(new int[]{27, 18, 138, 8}, true, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -6611420:
                if (!str.equals(m1009(new int[]{12, 15, 0, 15}, true, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 636996201:
                if (!str.equals(m1009(new int[]{45, 14, 57, 12}, false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    int i6 = f939 + 11;
                    int i7 = i6 % 128;
                    f942 = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 11;
                    f939 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 8;
                }
                break;
            case 890103511:
                if (!str.equals(m1005("\u0001\r\u0010\u000eￌ\uffff\u0002ￌ￤\u0007\u0014\u0003\uffdf\u0002￡\u0013\u0011\u0012\r\u000b￪\uffff\u0017\r\u0013\u0012\u0001\r\u000bￌ\u0004\u0007\u0014\u0003�", 26 - TextUtils.indexOf("", "", 0, 0), 143 - ImageFormat.getBitsPerPixel(0), false, View.combineMeasuredStates(0, 0) + 35).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1252059573:
                if (!str.equals(m1005("\u0002\u0007\ufff4\u0002\uffdf\u0003\u0014\u0007￤\u0002\u0010\uffff\u0015\u0003\ufff0\r\u0003", 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 144 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, 17 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i11 = f939 + 81;
                    f942 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 9;
                }
                break;
            case 1508614908:
                if (!str.equals(m1005("\u0003￠\u0004\u0015\b￥\u0004\u0013\u0000\u0013\ufff2", 5 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0) + 144, true, 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i13 = f942 + 15;
                    f939 = i13 % 128;
                    b = i13 % 2 == 0 ? (byte) 10 : (byte) 18;
                }
                break;
            case 1835584239:
                if (!str.equals(m1009(new int[]{59, 18, 0, 18}, true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    int i14 = f939 + 121;
                    f942 = i14 % 128;
                    int i15 = i14 % 2;
                    b = 11;
                }
                break;
            case 1942443945:
                if (!str.equals(m1005("￭\u0012\t\ufffeￜ\u000b\ufffe\ufffa\r\u0002\u000f\ufffe", 4 - TextUtils.getOffsetBefore("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 149, false, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 2104624789:
                if (!str.equals(m1005("￩\f\u0019\b￤\u0007", View.MeasureSpec.getSize(0) + 6, 139 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, 5 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return FiveAd.class;
            case 1:
                return CreativeType.class;
            case 2:
                return FiveAdConfig.class;
            case 3:
            case 4:
                return FiveAdCustomLayout.class;
            case 5:
                return FiveAdFormat.class;
            case 6:
                return FiveAdInterface.class;
            case 7:
                return FiveAdInterstitial.class;
            case 8:
                return FiveAdListener.class;
            case 9:
                return FiveAdVideoReward.class;
            case 10:
                return FiveAdState.class;
            case 11:
                return FiveAdLoadListener.class;
            case 12:
                return FiveAdViewEventListener.class;
            case 13:
            case 14:
                return AdActivity.class;
            case 15:
                return FiveAdInterstitialEventListener.class;
            case 16:
                return FiveAdVideoRewardEventListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1009(new int[]{148, 20, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1001((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1009(new int[]{168, 24, 168, 11}, true, (String) null).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1012((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1005("\u0012\u0003\u0010\u0004\uffff\u0001\u0003\ufff2\uffff\u0005\u0005\u0003\u0012￤\u0007\u0014\u0003\uffdf\u0002\uffe7\f", ExpandableListView.getPackedPositionChild(0L) + 11, 144 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 21 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1015((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1009(new int[]{192, 30, 145, 9}, true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1000((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1005("\u0013\u0002\uffde\u0001￦\u000b\u0011\u0002\u000f\u0003\ufffe\u0000\u0002\uffde\u0001￭\ufffe\u000f\ufffe\n\u0002\u0011\u0002\u000f\u0004\u0002\u0011￣\u0006", 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 146, false, 29 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1008((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1005("\u0004￡\u000f\u0000\u0002\r\u0000\t\u0000\u000f\u000e\u0004\uffe7\u0000\ufffe￼\u0001\r\u0000\u000f\t￤\uffffￜ\u0000\u0011", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 147, true, 26 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1003((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1009(new int[]{222, 26, 25, 0}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bn.m1016((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1005("\u0002\u0007\u0000\u000f\n\t\u0002\u0000\u000f￡\u0004\u0011\u0000ￜ\uffff￮\u0004\t", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, TextUtils.lastIndexOf("", '0') + 148, false, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m993();
            }
        });
        map.put(m1009(new int[]{248, 35, 175, 0}, true, "\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bn.m1007((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1009(new int[]{283, 15, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bn.m1010((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1009(new int[]{298, 20, 0, 9}, false, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bn.m1011((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f939 + 83;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1014(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f939 + 113;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        String str = fiveAdConfig.appId;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = f942 + 11;
        f939 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m999(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 53;
        f939 = i2 % 128;
        int i3 = i2 % 2;
        String slotId = fiveAdInterface.getSlotId();
        int i4 = f942 + 3;
        f939 = i4 % 128;
        int i5 = i4 % 2;
        return slotId;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m994(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + InterfaceC0280i1.d.b.d;
        f939 = i2 % 128;
        if (i2 % 2 == 0) {
            return fiveAdInterface.getFiveAdTag();
        }
        fiveAdInterface.getFiveAdTag();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static CreativeType m995(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f939 + 99;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i4 = f939 + 125;
        f942 = i4 % 128;
        int i5 = i4 % 2;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m998(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f939 + 43;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = f939 + 69;
        f942 = i5 % 128;
        int i6 = i5 % 2;
        return adParameter;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static FiveAdListener m997(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f942 + 91;
        f939 = i2 % 128;
        if (i2 % 2 == 0) {
            return fiveAdInterface.getListener();
        }
        fiveAdInterface.getListener();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1006(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f939 + 35;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        int i4 = f939 + 119;
        f942 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static FiveAd m996() {
        int i = 2 % 2;
        int i2 = f939 + 67;
        f942 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            FiveAd.getSingleton();
            super.hashCode();
            throw null;
        }
        FiveAd singleton = FiveAd.getSingleton();
        int i3 = f939 + 49;
        f942 = i3 % 128;
        if (i3 % 2 != 0) {
            return singleton;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1004(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f939 + 73;
        f942 = i2 % 128;
        if (i2 % 2 != 0) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1002(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f939 + 75;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        int i4 = f939 + InterfaceC0280i1.d.b.g;
        f942 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1013(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f939 + 25;
        f942 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f939 + 17;
        f942 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1005(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f941);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1009(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f940, i, cArr, 0, i2);
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
}
