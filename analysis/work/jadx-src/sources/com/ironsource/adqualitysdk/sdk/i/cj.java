package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cj extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1347 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1349 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1350 = {2099782473, 995293748, -1487419426, -1178099025, -895363296, -526314174, 1010803691, -1181996457, -1397790903, 1863794276, 931665356, 1654892250, -1116438786, 233036229, -907445096, -337121068, 272044331, -2026733036};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1348 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1351 = {'c', 'o', 'm', '.', 'y', 'a', 'n', 'd', 'e', 'x', 'b', 'i', 'l', 's', 'A', 't', 'v', 'R', 'q', 'u', 'M', 'B', 'r', 'V', 'w', 'C', 'E', 'L', 'I', 'F', 'g', 'U', 'f', 'h', 'j', 'k'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ MediaFile m1537(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1349 + 51;
        f1347 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1548(videoAd);
        }
        m1548(videoAd);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1539(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1349 + 63;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        String strM1558 = m1558(impressionData);
        int i4 = f1347 + 65;
        f1349 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1558;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1541(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f1349 + 53;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        String strM1538 = m1538(adInfo);
        int i4 = f1347 + 59;
        f1349 = i4 % 128;
        int i5 = i4 % 2;
        return strM1538;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1543(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1349 + 45;
        f1347 = i2 % 128;
        if (i2 % 2 != 0) {
            m1560(videoAd);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM1560 = m1560(videoAd);
        int i3 = f1349 + 37;
        f1347 = i3 % 128;
        int i4 = i3 % 2;
        return strM1560;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1546(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f1349 + 27;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m1553(rewardedAd, rewardedAdEventListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f1349 + InterfaceC0280i1.d.b.d;
        f1347 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m1547(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f1349 + 113;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo adInfoM1536 = m1536(rewardedAd);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = f1347 + 27;
        f1349 = i5 % 128;
        if (i5 % 2 != 0) {
            return adInfoM1536;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1549(Reward reward) {
        int i = 2 % 2;
        int i2 = f1349 + 45;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        String strM1542 = m1542(reward);
        int i4 = f1349 + 51;
        f1347 = i4 % 128;
        int i5 = i4 % 2;
        return strM1542;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1555(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f1347 + 49;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        m1545(bannerAdView, bannerAdEventListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ int m1556(Reward reward) {
        int i = 2 % 2;
        int i2 = f1349 + 87;
        f1347 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1535(reward);
        }
        m1535(reward);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m1557(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f1349 + 107;
        f1347 = i2 % 128;
        if (i2 % 2 != 0) {
            m1554(interstitialAd);
            throw null;
        }
        AdInfo adInfoM1554 = m1554(interstitialAd);
        int i3 = f1347 + 47;
        f1349 = i3 % 128;
        if (i3 % 2 != 0) {
            return adInfoM1554;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m1559(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f1347 + 95;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        String strM1550 = m1550(mediaFile);
        int i4 = f1349 + 123;
        f1347 = i4 % 128;
        int i5 = i4 % 2;
        return strM1550;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1561(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f1349 + 63;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        m1540(videoController, videoEventListener);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1562(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f1349 + 35;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        m1552(interstitialAd, interstitialAdEventListener);
        if (i3 != 0) {
            throw null;
        }
    }

    public cj(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1349 + 99;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        String libraryVersion = MobileAds.getLibraryVersion();
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return libraryVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x032d  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        byte b = 0;
        switch (str.hashCode()) {
            case -1850459313:
                if (!str.equals(m1544(new int[]{779460464, -846804264, 1828915118, 142552066}, 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 14;
                }
                break;
            case -1836618638:
                if (!str.equals(m1544(new int[]{1836427139, -976013036, 2085123111, 1362860234, -71862913, -2048929560}, (ViewConfiguration.getTouchSlop() >> 8) + 10).intern())) {
                    b = -1;
                }
                break;
            case -1666698098:
                if (!str.equals(m1551("\u0013\u0002\u000b\u0006\u000e\u0006\r\b\u0082", (byte) (View.MeasureSpec.getSize(0) + 15), MotionEvent.axisFromString("") + 10).intern())) {
                    b = -1;
                } else {
                    int i2 = f1347 + 73;
                    f1349 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 6;
                }
                break;
            case -1401317165:
                if (!str.equals(m1551("\u001d\u0011\b\t\u0002\u0019\u000e\n\t\f\u001d\t\u000e\u0010\t\u0007\n\u0014", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 126), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1338246468:
                if (!str.equals(m1551("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\u0004\u0003\u0004\u0007\u0006\u0011\t\u0002\u0001\u000b\u000f\u0001\u000b\u0004\u0083\u0083\n\u0014\t\u001b\u0000\u000b\u0007\t\u0014\u0010\u000b\u0013\u0006\t\u008c", (byte) (ImageFormat.getBitsPerPixel(0) + 22), 42 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1139615429:
                if (!str.equals(m1551("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\u0004\u0003\u0004\u0007\u0006\u0011\t\u0002\u0001\u000b\u000f\u0001\u0001\u0002¼¼\u0000\u0007\u0002\u000f\b\r\u0003\f\n\u0011\t\u0011È", (byte) (View.resolveSize(0, 0) + 79), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39).intern())) {
                    b = -1;
                } else {
                    int i4 = f1347 + 71;
                    f1349 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 1;
                }
                break;
            case -1115843213:
                if (!str.equals(m1544(new int[]{1893078427, -434803146, -1010842388, 2035134132, 1137631348, -1727021231, 755215354, 259937607}, 14 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -650052115:
                if (!str.equals(m1544(new int[]{1979627403, 83930355, 1546684585, 1197525357, -2049573287, -89525866, -705709097, -1153708262, -1700474006, 791440258, -244912938, 964128973}, 'G' - AndroidCharacter.getMirror('0')).intern())) {
                    b = -1;
                } else {
                    int i6 = f1347 + 71;
                    f1349 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 17;
                }
                break;
            case -610771047:
                if (!str.equals(m1544(new int[]{779460464, -846804264, -296606356, -885560404, 755215354, 259937607}, (Process.myPid() >> 22) + 10).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case -609786639:
                if (!str.equals(m1551("\u000e\u000b\u001d\u0000\u0013\n\t\b\r\b", (byte) (21 - (ViewConfiguration.getScrollBarSize() >> 8)), 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case -572702516:
                if (!str.equals(m1551("\r\b\u000e\u000b\u0013\u0014\u0007\u000eÎ", (byte) (Color.green(0) + 90), (KeyEvent.getMaxKeyCode() >> 16) + 9).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -564429827:
                if (!str.equals(m1551("\u000e\u000b\u001d\u0000\u0013\n\t\b\r\b\u001c\u000e\t\u0007\u0015!\u0007\u0011\u000e\t\u0007\të", (byte) (ImageFormat.getBitsPerPixel(0) + 122), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -150968480:
                if (!str.equals(m1551("\u001a\u000e\b\u0006\u000b#\u0006\u0011\u0096", (byte) (49 - TextUtils.getCapsMode("", 0, 0)), 9 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 308060116:
                if (!str.equals(m1551("\u0017\u0003¨¨\n\u0014\r\b\u001d\u0011\u0006\u001a", (byte) (58 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 320151695:
                if (!str.equals(m1551("\u0018\n\u000e\t\u0013\u0010\u0011\t\u0011\t\u0000\u0011\r\b", (byte) (2 - MotionEvent.axisFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 14).intern())) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 871099991:
                if (!str.equals(m1551("\u001d\u0011\b\t\u0007\u001f\u0000\u0007\u0010\u0015\u0000\r\u000e\u0006\u008c", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25), KeyEvent.normalizeMetaState(0) + 15).intern())) {
                    b = -1;
                } else {
                    int i8 = f1349 + 93;
                    f1347 = i8 % 128;
                    b = i8 % 2 == 0 ? (byte) 9 : (byte) 60;
                }
                break;
            case 957243679:
                if (!str.equals(m1551("\u0017\u0003\u009e\u009e\n\u0014\r\b\u001c\u000e\t\u0007\u0015!\u0007\u0011\u000e\t\u0007\t¢", (byte) (48 - TextUtils.getCapsMode("", 0, 0)), 21 - (Process.myTid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i9 = f1349 + 35;
                    f1347 = i9 % 128;
                    int i10 = i9 % 2;
                    b = Ascii.VT;
                }
                break;
            case 1228411167:
                if (!str.equals(m1544(new int[]{1872942632, 1595652790, -995402372, 1139846150, -1310460255, 1287062986, 2098824638, -2128208085, 290095097, 453881465, -1700474006, 791440258, -244912938, 964128973}, ImageFormat.getBitsPerPixel(0) + 28).intern())) {
                    b = -1;
                } else {
                    int i11 = f1349 + 97;
                    f1347 = i11 % 128;
                    if (i11 % 2 == 0) {
                        b = Ascii.CR;
                    } else {
                        b = 8;
                    }
                }
                break;
            case 1955530641:
                if (!str.equals(m1544(new int[]{-2089795001, 205188822, 1435962556, 1814489113}, 6 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1955869213:
                if (!str.equals(m1544(new int[]{1154125625, 509887120, -178432254, 1406370283}, 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i12 = f1349 + 125;
                    f1347 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 4;
                }
                break;
            case 2117435870:
                if (!str.equals(m1551("\u001d\u0011\b\t\u0002\rÎ", (byte) (106 - KeyEvent.keyCodeFromString("")), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case 8:
                return BannerAdView.class;
            case 9:
                return VideoController.class;
            case 10:
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case 12:
                return InterstitialAd.class;
            case 13:
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1551(" \u0006\u0010\u000f\r\u0001\u0007\u0006\u0010\u001bv", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1541((AdInfo) list.get(0));
            }
        });
        map.put(m1544(new int[]{-1835656766, -309090592, -336045780, 5855977, 755215354, 259937607}, (Process.myTid() >> 22) + 10).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1539((ImpressionData) list.get(0));
            }
        });
        map.put(m1544(new int[]{1750544204, 87475758, -138073294, 202077892, 1366204982, 690521605, 10841520, 1829812217, 696932865, 755283826, 437125373, -1585192511}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cj.m1561((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1551(" \u0006\u0010\u001b\u0007\f\u000e\t\u0013\u0010\u0011\t\u0011\t\u0000\u0011\u0018\n\u001f\u0002", (byte) (114 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 21).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1557((InterstitialAd) list.get(0));
            }
        });
        map.put(m1551(" \u0006\u0010\f\u0006\u001a\u0004\u0017\b\r\u0003\u0002\u0012\u0007É", (byte) (85 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Integer.valueOf(cj.m1556((Reward) list.get(0)));
            }
        });
        map.put(m1544(new int[]{-1835656766, -309090592, 522418370, -20086702, -1345019167, 1285989352, -2086421846, -1666885545}, Color.alpha(0) + 13).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1549((Reward) list.get(0));
            }
        });
        map.put(m1544(new int[]{-1835656766, -309090592, 522418370, -20086702, 235506468, -2001001125, 1300392931, -1368305752, 756028492, 1228590625}, 16 - MotionEvent.axisFromString("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1547((RewardedAd) list.get(0));
            }
        });
        map.put(m1551("\u000e\u0007\u0010\f\u0006\u001a\u0004\u0017\b\t\b\r\b\u0019\u000e\n\t\f\u001d\t\u000e\u0010\t\u0007\n\u0014", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 125), (KeyEvent.getMaxKeyCode() >> 16) + 26).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cj.m1546((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1544(new int[]{785499634, 945863585, 1921995021, 1544396378, 1670819528, -1803095080, 2005523574, 791372321, 1717984672, -454140860, -1447461491, -1796137129, -813623452, 1758939665, -954578281, 440563651}, 30 - View.resolveSize(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cj.m1562((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1544(new int[]{1199522559, -1007968148, 1574681980, -237776137, -1873019725, -1082520711, 1412584737, 1638233889}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1559((MediaFile) list.get(0));
            }
        });
        map.put(m1544(new int[]{111394317, -15358772, -138073294, 202077892, 563179637, 164987632, -1819637581, -1433976854, 955188681, -1950251777}, 19 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1537((VideoAd) list.get(0));
            }
        });
        map.put(m1551(" \u0006\u0011\u0015\u0006\b\u0007\u0002\r\b\u0018\n\u001f\u0002", (byte) (TextUtils.getTrimmedLength("") + 42), View.resolveSizeAndState(0, 0, 0) + 14).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cj.m1543((VideoAd) list.get(0));
            }
        });
        map.put(m1551("\u000e\u0007\u0015\u001b\u0000\u000b\u0007\t\u0014\u0010\b\u0019\u000e\n\t\f\u001d\t\u000e\u0010\t\u0007\n\u0014", (byte) (ExpandableListView.getPackedPositionType(0L) + 95), 24 - (Process.myPid() >> 22)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cj.m1555((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f1347 + InterfaceC0280i1.d.b.i;
        f1349 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1538(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f1349 + 81;
        f1347 = i2 % 128;
        if (i2 % 2 == 0) {
            return adInfo.getAdUnitId();
        }
        adInfo.getAdUnitId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1558(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1347 + 77;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        String rawData = impressionData.getRawData();
        int i4 = f1347 + 99;
        f1349 = i4 % 128;
        if (i4 % 2 != 0) {
            return rawData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1540(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f1347 + 71;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        videoController.setVideoEventListener(videoEventListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1349 + 107;
        f1347 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static AdInfo m1554(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f1349 + 83;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo info = interstitialAd.getInfo();
        int i4 = f1347 + 49;
        f1349 = i4 % 128;
        int i5 = i4 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int m1535(Reward reward) {
        int i = 2 % 2;
        int i2 = f1347 + 85;
        f1349 = i2 % 128;
        if (i2 % 2 != 0) {
            return reward.getAmount();
        }
        reward.getAmount();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1542(Reward reward) {
        int i = 2 % 2;
        int i2 = f1347 + 15;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        String type = reward.getType();
        int i4 = f1347 + 9;
        f1349 = i4 % 128;
        if (i4 % 2 != 0) {
            return type;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdInfo m1536(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f1349 + 33;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo info = rewardedAd.getInfo();
        int i4 = f1349 + 123;
        f1347 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return info;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1553(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f1347 + 63;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        int i4 = f1347 + InterfaceC0280i1.d.b.g;
        f1349 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1552(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f1347 + 115;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        int i5 = f1349 + 107;
        f1347 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1550(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f1347 + 3;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        String url = mediaFile.getUrl();
        int i4 = f1347 + 81;
        f1349 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return url;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static MediaFile m1548(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1349 + 45;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        int i4 = f1349 + 95;
        f1347 = i4 % 128;
        int i5 = i4 % 2;
        return mediaFile;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1560(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1349 + 45;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        String info = videoAd.getInfo();
        int i4 = f1349 + 31;
        f1347 = i4 % 128;
        int i5 = i4 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1545(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f1349 + 91;
        f1347 = i2 % 128;
        int i3 = i2 % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        int i4 = f1349 + 51;
        f1347 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1544(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1350.clone();
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1551(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f1351;
            char c = f1348;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
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
                            int i2 = (f.f2046 * c) + f.f2042;
                            int i3 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c) - 1) % c;
                            f.f2041 = ((f.f2041 + c) - 1) % c;
                            int i4 = (f.f2046 * c) + f.f2042;
                            int i5 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c) + f.f2041;
                            int i7 = (f.f2044 * c) + f.f2042;
                            cArr3[f.f2047] = cArr2[i6];
                            cArr3[f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
