package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bt extends bg {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1073 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f1074 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1075 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1076 = -1360996096;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1077 = 41;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f1078 = {-25, -9, -3, -32, 2, 2, -51, -4, -20, Ascii.SYN, -53, -3, -27, -12, -18, 19, -35, -6, -30, -15, -21, Ascii.DLE, -33, -97, 78, -120, 112, 127, 121, -98, -29, -43, -41, 5, -64, -13, -44, -37, -29, 9, -62, 3, -27, -105, -127, -109, 123, -117, -108, -89, 95, -110, -111, -97, 121, -83, -10, -10, -32, -23, -10, 8, -3, -91, -10, -26, -34, -13, -26, -13, -42, -18, 43, -84, -16, -38, 46, -88, -11, -35, -20, -26, -21, 40, -86, -25, -11, -29, -89, 87, -115, -124, 119, -109, 116, -117, -124, 123, -77, -27, 71, -7, 47, Ascii.FS, Ascii.EM, 47, Ascii.EM, 37, 37, 49, Ascii.NAK, 42, 73, -15, 57, 35, 53, Ascii.GS, 45, 54, 73, 1, 52, 51, 65, Ascii.ESC, 79, 1, 55, 36, 33, 55, 33, 45, 45, 57, Ascii.GS, 50, 81, -28, 40, Ascii.ETB, 68, -6, Ascii.RS, 37, Ascii.DC4, 50, Ascii.ETB, 36, Ascii.RS, 55, -19, 70, -8, 46, Ascii.ESC, Ascii.CAN, 46, Ascii.CAN, 36, 36, 48, Ascii.DC4, 41, 72, 8, 34, 36, Ascii.NAK, 52, Ascii.CR, 53, 54, -29, 72, 78, 54, 80, 56, 84, 101, Ascii.DLE, 68, 85, 78, -18, 50, Ascii.FS, 46, Ascii.SYN, 38, 47, 66, -6, 45, 44, 58, Ascii.DC4, 72, -12, 50, Ascii.FS, 37, 50, 68, -13, 52, 35, -18, -73, -95, -77, -101, -85, -76, -57, 127, -78, -79, -65, -103, -51, 121, -73, -95, -86, -73, -55, 120, -71, -100};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1079 = 31708;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1080 = 64666;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1081 = 124984546;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1082 = 43065;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1083 = 2245;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Object m1192() {
        int i = 2 % 2;
        int i2 = f1075 + 125;
        f1073 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1193 = m1193();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return objM1193;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ BannerAdShowListener m1195(Banner banner) {
        int i = 2 % 2;
        int i2 = f1075 + 47;
        f1073 = i2 % 128;
        int i3 = i2 % 2;
        BannerAdShowListener bannerAdShowListenerM1194 = m1194(banner);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return bannerAdShowListenerM1194;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1199(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f1075 + 25;
        f1073 = i2 % 128;
        int i3 = i2 % 2;
        m1198(banner, bannerAdShowListener);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
    }

    public bt(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1075 + 113;
        f1073 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strM2344 = hu.m2296().m2297().m2344(BuildConfig.class, m1196("䍳镶¿睕㵞ꖀМЀ紹뉹ဇ贈", Color.argb(0, 0, 0, 0) + 11).intern());
            int i4 = f1075 + 63;
            f1073 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return strM2344;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0325  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1984684559:
                if (!str.equals(m1197((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 124984531, (byte) (Process.myPid() >> 22), (-42) - (Process.myTid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 1360996173, (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 18)).intern())) {
                    b = -1;
                } else {
                    int i2 = f1073 + 113;
                    f1075 = i2 % 128;
                    int i3 = i2 % 2;
                }
                break;
            case -1940439161:
                if (!str.equals(m1197((-124984546) - Gravity.getAbsoluteGravity(0, 0), (byte) View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 42, 1360996173 - TextUtils.getOffsetBefore("", 0), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 15)).intern())) {
                    b = -1;
                } else {
                    int i4 = f1075 + 23;
                    f1073 = i4 % 128;
                    b = i4 % 2 != 0 ? (byte) 0 : (byte) 1;
                }
                break;
            case -1921270373:
                if (!str.equals(m1197((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 124984373, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) - 42, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1360996182, (short) ((-66) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i5 = f1075 + 85;
                    f1073 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 18;
                }
                break;
            case -1483746188:
                if (!str.equals(m1197((-124984516) - Gravity.getAbsoluteGravity(0, 0), (byte) Color.blue(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 42, 1360996161 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 33)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1073 + 107;
                    f1075 = i7 % 128;
                    if (i7 % 2 == 0) {
                        b = 3;
                    } else {
                        b = 4;
                    }
                }
                break;
            case -1473265726:
                b = !str.equals(m1197((-124984490) - Gravity.getAbsoluteGravity(0, 0), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-42) - View.resolveSizeAndState(0, 0, 0), View.combineMeasuredStates(0, 0) + 1360996195, (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1435839138:
                if (!str.equals(m1197(TextUtils.lastIndexOf("", '0', 0, 0) - 124984458, (byte) (Process.myTid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 43, Color.alpha(0) + 1360996166, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 123)).intern())) {
                    b = -1;
                } else {
                    int i8 = f1075 + InterfaceC0280i1.d.b.d;
                    f1073 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 8;
                }
                break;
            case -1413560652:
                if (!str.equals(m1197((-124984504) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-42) - ExpandableListView.getPackedPositionGroup(0L), 1360996160 - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (View.MeasureSpec.getSize(0) + 118)).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1323289850:
                b = !str.equals(m1196("㠋跁膮\ue922仵䌹홟ힷ㠋跁轚\uea6d䘌㩯ྵ顷콼\uec24軙䚼\udd15緌\ueb50落ࣤ엯戅ࠤ묉얹粅ູ䶏们⮕\ue278㕼琢꛰ԸꞒ\udc66㲆值ꏖ醑\uef4e쪘\uef4e쪘⒚㤋\uf02d\ue10f\uef4e쪘鲆שּׂ槚գ젎뷸ែ殞䒴\uee97㲆值ꏖ醑\uef4e쪘\uef4e쪘⿽퐚뜥䁿ऍ\ueec2蹁㺴쫰잝薵鰴풠㔲\uf135ꮏ蒡쏋", 91 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -789262976:
                b = !str.equals(m1196("샞\uece9ែ殞䒴\uee97痶沤鸧췶ऍ\ueec2࠹\uf4d2\uef53뵿", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -671875674:
                b = !str.equals(m1197((-124984407) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-42) - View.MeasureSpec.getSize(0), 1360996172 - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((-31) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case -556413696:
                if (!str.equals(m1197((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 124984434, (byte) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 43, View.MeasureSpec.getMode(0) + 1360996169, (short) (TextUtils.indexOf("", "", 0, 0) - 44)).intern())) {
                    b = -1;
                } else {
                    int i10 = f1075 + InterfaceC0280i1.d.b.i;
                    f1073 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 2 / 4;
                    }
                    b = 10;
                }
                break;
            case -543102915:
                b = !str.equals(m1197((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 124984394, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-42) - View.MeasureSpec.getMode(0), 1360996179 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (Drawable.resolveOpacity(0, 0) - 35)).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case -517600968:
                b = !str.equals(m1196("㠋跁膮\ue922仵䌹홟ힷ㠋跁轚\uea6d䘌㩯ྵ顷콼\uec24軙䚼\udd15緌\ueb50落ࣤ엯戅ࠤ묉얹粅ູ䶏们⮕\ue278㕼琢꛰ԸꞒ\udc66㲆值ꏖ醑\uef4e쪘\uef4e쪘⒚㤋\uf02d\ue10f\uef4e쪘鲆שּׂ槚գ楒觔洌\u1a8f꛰Ը췙㊇洌\u1a8f쫰잝薵鰴풠㔲\uf135ꮏ蒡쏋", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 78).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -316379660:
                b = !str.equals(m1197(View.combineMeasuredStates(0, 0) - 124984524, (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-42) - ((Process.getThreadPriority(0) + 20) >> 6), 1360996172 - TextUtils.indexOf((CharSequence) "", '0'), (short) (TextUtils.indexOf("", "", 0, 0) - 124)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 320151695:
                b = !str.equals(m1197(((byte) KeyEvent.getModifierMetaStateMask()) - 124984446, (byte) Color.blue(0), (-42) - KeyEvent.getDeadChar(0, 0), 1360996169 - View.MeasureSpec.getSize(0), (short) ((-36) - View.MeasureSpec.getMode(0))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 664452134:
                b = !str.equals(m1196("㠋跁膮\ue922仵䌹홟ힷ㠋跁轚\uea6d䘌㩯ྵ顷콼\uec24軙䚼\udd15緌\ueb50落ࣤ엯戅ࠤ묉얹粅ູ䶏们⮕\ue278㕼琢꛰ԸꞒ\udc66㲆值ꏖ醑\uef4e쪘\uef4e쪘⒚㤋\uf02d\ue10f\uef4e쪘鲆שּׂ槚գ醟⊐젎뷸辈٧矈䳺ྦྷᾏ薵鰴풠㔲\uf135ꮏ蒡쏋", (ViewConfiguration.getScrollBarSize() >> 8) + 77).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 704479150:
                if (!str.equals(m1196("\udbd6즒\u1af0픕ឹ眥釱毀怒ⱒ둭挰ﳓ\ueac0ऍ\ueec2ऍ\ueec2耳앁痶沤\uf43a氤魳蘖늂྇젎뷸콼\uec24\uef4e쪘", TextUtils.getTrimmedLength("") + 34).intern())) {
                    b = -1;
                } else {
                    int i12 = f1073 + 85;
                    f1075 = i12 % 128;
                    b = i12 % 2 == 0 ? Ascii.CR : (byte) 51;
                }
                break;
            case 1395486086:
                b = !str.equals(m1196("췙㊇洌\u1a8f쫰잝薵鰴풠㔲\uf135ꮏ蒡쏋", 12 - TextUtils.lastIndexOf("", '0')).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 1928690944:
                b = !str.equals(m1196("⏇列幓揷\uef4e쪘痶沤\uf43a氤魳蘖늂྇젎뷸콼\uec24\uef4e쪘", 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1982491468:
                b = !str.equals(m1196("⏇列幓揷\uef4e쪘", TextUtils.indexOf("", "", 0) + 6).intern()) ? (byte) -1 : (byte) 5;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return MolocoInitParams.class;
            case 1:
                return Moloco.class;
            case 2:
                return MolocoAd.class;
            case 3:
                return AdFormatType.class;
            case 4:
                return AdShowListener.class;
            case 5:
            case 6:
                return Banner.class;
            case 7:
                return BannerAdShowListener.class;
            case 8:
                return FullscreenAd.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return InterstitialAdShowListener.class;
            case 11:
                return MediationInfo.class;
            case 12:
                return RewardedInterstitialAd.class;
            case 13:
                return RewardedInterstitialAdShowListener.class;
            case 14:
            case 15:
                return MraidActivity.class;
            case 16:
            case 17:
                return StaticAdActivity.class;
            case 18:
            case 19:
                return VastActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1196("⦍樤㇥配ᓱꜥ䷟﵄\ude03窣䘌㩯怒ⱒ젎뷸䶏们ꫫ鬧", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bt.m1192();
            }
        });
        map.put(m1197((-124984360) - Color.red(0), (byte) (Process.getGidForName("") + 1), (-42) - KeyEvent.keyCodeFromString(""), 1360996199 - Gravity.getAbsoluteGravity(0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 36)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bt.m1195((Banner) list.get(0));
            }
        });
        map.put(m1197(Color.argb(0, 0, 0, 0) - 124984337, (byte) ExpandableListView.getPackedPositionGroup(0L), (-42) - KeyEvent.getDeadChar(0, 0), 1360996211 - (Process.myPid() >> 22), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 85)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bt.m1199((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        int i2 = f1073 + 97;
        f1075 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m1193() {
        Moloco moloco;
        int i = 2 % 2;
        int i2 = f1075 + 71;
        f1073 = i2 % 128;
        if (i2 % 2 == 0) {
            moloco = Moloco.INSTANCE;
            int i3 = 52 / 0;
        } else {
            moloco = Moloco.INSTANCE;
        }
        int i4 = f1075 + 79;
        f1073 = i4 % 128;
        int i5 = i4 % 2;
        return moloco;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerAdShowListener m1194(Banner banner) {
        int i = 2 % 2;
        int i2 = f1075 + 33;
        f1073 = i2 % 128;
        int i3 = i2 % 2;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        int i4 = f1075 + 75;
        f1073 = i4 % 128;
        int i5 = i4 % 2;
        return adShowListener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1198(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f1073 + 19;
        f1075 = i2 % 128;
        int i3 = i2 % 2;
        banner.setAdShowListener(bannerAdShowListener);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1196(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1083)) ^ ((c2 >>> 5) + f1082)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1079) ^ ((c3 + i2) ^ ((c3 << 4) + f1080))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1197(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1077;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1078;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1081 + i] + i4);
                } else {
                    i5 = (short) (f1074[f1081 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1081 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1076);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1078;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1074;
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
