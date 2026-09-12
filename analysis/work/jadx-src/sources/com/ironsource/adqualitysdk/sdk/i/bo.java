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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.InterfaceC0280i1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class bo extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f954 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f955 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f956 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f957 = -29080148503270922L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f958 = 479366968;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f959 = 1608234704;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f960 = 11;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f961 = {-85, -95, 121, -93, 123, -105, -54, 83, -55, 80, -83, 121, -54, 85, -53, -111, 109, 111, -85, 125, -93, -89, 126, -97, 121, -20, 107, -83, 121, -86, 117, -85, -79, 103, 118, -92, 89, 50, 122, -128, 72, -126, 74, 102, -103, 50, -104, 47, 124, 72, -103, 52, -102, 48, 46, 0, 65, 58, -21, 60, -44, -47, 76, 2, 1, 3, 49, -20, Ascii.DC2, 5, -12, 4, Ascii.SO, Ascii.SO, 1, Ascii.CAN, 125, -52, -65, 125, -65, 115, 115, 119, -61, 114, -113, -44, 113, -59, -106, -87, -113, -22, -7, 91, -17, -9, -4, 89, Ascii.FF, 67, -16, 92, Ascii.CR, 72, Ascii.SO, -64, -67, -102, -25, -30, -121, -17, -99, -16, 5, 53, 19, 59, -19, -18, -40, -22, -46, -30, -19, -2, -69, -23, -22, -48, Ascii.DC2, -62, 4, -74, -20, -37, -42, -20, -42, -30, -30, -18, -46, -23, 6, 54, 92, 58, 98, 50, 57, 70, -117, 45, 58, 84, 34, 82, Ascii.DLE, -121, 84, 54, 94, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -53, -75, -57, -81, -65, -56, -37, -106, -60, -57, -83, -17, -108, -56, -65, -71, -47, -111, 82, SignedBytes.MAX_POWER_OF_TWO, 121, -124, -126, 52, 121, 83, 96, -111, 97, 87, 87, -124, 109, -83, 90, -117, -109, -50, -28, -85, -96, -98, -16, -81, -110, -63, -108, -68, -65, -92, -22, -120, -58, -107, -38, -36, -24, -65, 1, 0, -50, -48, Ascii.CR, -30, -13, -101, -94, Ascii.NAK, -95, Ascii.DC2, -87, -94, Ascii.EM, -95, 9, -84, Ascii.ETB, Ascii.EM, -89, Ascii.ETB, -99, -88, -101, 10, -102, -92, -92, Ascii.ETB, Ascii.SO, -30, -28, -17, -44, -3, -30, -24, -43, 5, -40, -38, -24, -40, -14, -26, -11, -28, -4, -41, -47, 6, -18, 58, 55, 36, 70, Ascii.GS, 58, 48, 69, Ascii.NAK, SignedBytes.MAX_POWER_OF_TWO, 66, 48, SignedBytes.MAX_POWER_OF_TWO, 42, 54, 37, 52, Ascii.FS, Utf8.REPLACEMENT_BYTE, 73, Ascii.SYN, 46, 81, Ascii.DLE, 7, 5, 91, 95, 82, -2, 83, 81, 3, 83, 9, 93, Ascii.SO, 95, -9, 84, 106, -3, 5, -7, -18, 72, SignedBytes.MAX_POWER_OF_TWO, 60, -23, 58, 60, -22, 58, -23, 84, -14, 58, -32, 67, SignedBytes.MAX_POWER_OF_TWO, -12, 75, -24, -16, -106, -69, -78, -77, -120, -117, -85, -104, -69, -67, -117, -69, -104, -91, -125, -69, -95, -78, -63, -123, -86, -103, -111, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ Enum m1020(String str) {
        int i = 2 % 2;
        int i2 = f954 + 93;
        f956 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1019(str);
        }
        m1019(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Enum m1021(String str) {
        int i = 2 % 2;
        int i2 = f956 + 93;
        f954 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM1018 = m1018(str);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return enumM1018;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Enum m1022(String str) {
        int i = 2 % 2;
        int i2 = f954 + 83;
        f956 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM1017 = m1017(str);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return enumM1017;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m1023(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f956 + 57;
        f954 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1024 = m1024(adContainer);
        int i4 = f954 + InterfaceC0280i1.d.b.b;
        f956 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return objM1024;
    }

    public bo(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2044438337:
                b = !str.equals(m1025("ᗛᖉ푣뷰미퍷뉦걌Ꮧ桺\ueef1ଥ娌І䮔挌\ue223\udcebꍼ\udbef諒듃ᭅ", TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1769689844:
                b = !str.equals(m1025("섪셣\ueb29花㐆쯣暐錖鰰\ue7a7\uf66eᎰ軱", ViewConfiguration.getTapTimeout() >> 16).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case -1716191362:
                b = !str.equals(m1025("ﬞﭟ（隚풴礞岨蜠精ܛ䒓ꅀ듀⽙⓵", AndroidCharacter.getMirror('0') - '0').intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1405271692:
                b = !str.equals(m1025("\ud805\ud84b텩룾\ue743豏羫\ua955位㓛뇄君韖ġᜤ㰺\u2fe8\ud9f2\ufff9蓇䜀뇟䟖波齜ঠ⾋㒻㝧", Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1401317165:
                if (!str.equals(m1026(Color.red(0) - 479366801, (byte) ((-128) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1608234618) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((-61) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i2 = f956 + 3;
                    f954 = i2 % 128;
                    int i3 = i2 % 2;
                    b = Ascii.DC4;
                }
                break;
            case -1304544044:
                b = !str.equals(m1026((-479366822) - TextUtils.lastIndexOf("", '0', 0), (byte) (TextUtils.getOffsetBefore("", 0) + InterfaceC0280i1.d.b.d), Color.rgb(0, 0, 0) + 16777226, View.MeasureSpec.makeMeasureSpec(0, 0) - 1608234626, (short) (ImageFormat.getBitsPerPixel(0) + 53)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1062227179:
                if (!str.equals(m1026((-479366968) - Color.alpha(0), (byte) (25 - (ViewConfiguration.getEdgeSlop() >> 16)), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1608234605) - Drawable.resolveOpacity(0, 0), (short) (112 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                    b = -1;
                } else {
                    int i4 = f954 + 53;
                    f956 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 1;
                }
                break;
            case -808014786:
                b = !str.equals(m1026(View.MeasureSpec.getSize(0) - 479366875, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 66), TextUtils.indexOf("", "", 0, 0) + 4, (-1608234631) - ExpandableListView.getPackedPositionType(0L), (short) ((ViewConfiguration.getEdgeSlop() >> 16) + 86)).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case -595852006:
                b = !str.equals(m1025("㹢㸫\ueddf葇䃕\uebca駘闠\ue8f2鍴홇㎜熼㶏낍宧", TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -560158238:
                if (!str.equals(m1026((-479366932) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Process.getGidForName("") + 18), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, (-1608234631) - TextUtils.indexOf("", ""), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 102)).intern())) {
                    b = -1;
                } else {
                    int i6 = f954 + 123;
                    f956 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 2;
                }
                break;
            case -541364416:
                b = !str.equals(m1025("\uf4ad\uf4e4牂ᯚ礋镓北\u0a7d턯ꪪ\ua8de䴀뭜ꈟ襂┥͓竍憪鷍", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -235933147:
                if (!str.equals(m1026(ExpandableListView.getPackedPositionChild(0L) - 479366914, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 87), (ViewConfiguration.getTapTimeout() >> 16) + 1, (-1608234640) - TextUtils.indexOf((CharSequence) "", '0'), (short) ((Process.myTid() >> 22) + 114)).intern())) {
                    b = -1;
                } else {
                    int i8 = f954 + 117;
                    f956 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 5;
                }
                break;
            case -204096109:
                b = !str.equals(m1025("ﰭﱎ襼\ue0e5큞붞宜\uf145硶ϟ聒文돿太\u206dඡு臨종땊挨\ue9dd烷嵵뭧冢ᢕԯጓ릪셍곭檪\ue059楢哙슉䠒ᄐﲄ\u1adc뀝뤲ꑜ爤", TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -93733047:
                b = !str.equals(m1025("\ue424\ue46aഠ撷板郒䎊甜콵듧굙䢊꯰\udd74霔\u209dᏅ֬翤", (-1) - TextUtils.lastIndexOf("", '0')).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -32161126:
                b = !str.equals(m1026((-479366891) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ((-43) - KeyEvent.normalizeMetaState(0)), 6 - Process.getGidForName(""), (-1608234631) - Color.alpha(0), (short) (96 - Process.getGidForName(""))).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case 99044255:
                b = !str.equals(m1026((-479366905) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 121), Gravity.getAbsoluteGravity(0, 0) + 2, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1608234625, (short) (124 - Color.alpha(0))).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 515339810:
                b = !str.equals(m1026((-479366861) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (34 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) - 1, (-1608234618) - View.combineMeasuredStates(0, 0), (short) (65 - Drawable.resolveOpacity(0, 0))).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 957243679:
                if (!str.equals(m1025("愥慧\uee2c螻\ud80b䱷욘阇瀌உ燻鐥⻐㹫⡰ﰇ雙\ue689삔䓢︱躈碫곜♯", Color.blue(0)).intern())) {
                    b = -1;
                } else {
                    int i10 = f954 + 95;
                    f956 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 18;
                }
                break;
            case 1228411167:
                if (!str.equals(m1026((Process.myPid() >> 22) - 479366847, (byte) ((-128) - ((byte) KeyEvent.getModifierMetaStateMask())), '@' - AndroidCharacter.getMirror('0'), (-1608234631) - Color.blue(0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) - 97)).intern())) {
                    b = -1;
                } else {
                    int i12 = f954 + 73;
                    f956 = i12 % 128;
                    b = i12 % 2 == 0 ? (byte) 17 : (byte) 115;
                }
                break;
            case 1955888231:
                b = !str.equals(m1026((ViewConfiguration.getScrollBarSize() >> 8) - 479366852, (byte) (109 - TextUtils.getOffsetAfter("", 0)), Drawable.resolveOpacity(0, 0) - 5, View.MeasureSpec.makeMeasureSpec(0, 0) - 1608234639, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 98)).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case 2035398868:
                if (!str.equals(m1025("\ue077\ue032麈\uf708\ud833꧍䟛\ue692瀇\u0bba鑁熋꾢", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1).intern())) {
                    b = -1;
                } else {
                    int i13 = f954 + 59;
                    f956 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 9;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                int i15 = f954 + 119;
                f956 = i15 % 128;
                int i16 = i15 % 2;
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f954 + 27;
        f956 = i2 % 128;
        int i3 = i2 % 2;
        String version = InMobiSdk.getVersion();
        int i4 = f956 + InterfaceC0280i1.d.b.b;
        f954 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return version;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1026((-479366784) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 25), Color.green(0) + 9, ExpandableListView.getPackedPositionType(0L) - 1608234601, (short) (KeyEvent.normalizeMetaState(0) - 114)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bo.m1022((String) list.get(0));
            }
        });
        map.put(m1026(Gravity.getAbsoluteGravity(0, 0) - 479366765, (byte) ((-102) - TextUtils.indexOf("", "")), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-1608234601) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (TextUtils.getTrimmedLength("") - 49)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bo.m1020((String) list.get(0));
            }
        });
        map.put(m1026((ViewConfiguration.getLongPressTimeout() >> 16) - 479366747, (byte) (TextUtils.indexOf("", "", 0) - 11), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, (-1608234600) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 24)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bo.m1023((AdContainer) list.get(0));
            }
        });
        map.put(m1025("鈧鉀\ue805膖\u1f7f⢛㖛逛띑쳧ᔸ\uf0e7\uddf6㡄\uef12飜旊\ue0bcߪ•ഢ", TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bo.m1021((String) list.get(0));
            }
        });
        int i2 = f954 + 39;
        f956 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m1017(String str) {
        byte b;
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1097819034) {
            if (iHashCode == 1554700484 && str.equals(m1025("ꪍꫝ悢घ隴쩛ഐᢛ㺘䔙\uf7faሎ\ue569냡曑稱嵕栣踲싙㖣\u0002㘜⫶\uedf0", TextUtils.indexOf("", "", 0, 0)).intern())) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals(m1026(29152 - AndroidCharacter.getMirror('0'), (byte) ((-56) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myPid() >> 22) - 1608234624, (short) (38 - View.MeasureSpec.getMode(0))).intern())) {
            int i2 = f956 + 119;
            f954 = i2 % 128;
            int i3 = i2 % 2;
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b != 1) {
            int i4 = f954 + 17;
            f956 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        AdContainer.RenderingProperties.PlacementType placementType = AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
        int i6 = f954 + 75;
        f956 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Enum m1019(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 556003820) {
            if (iHashCode != 556062505) {
                if (iHashCode == 1382961856 && str.equals(m1026(KeyEvent.keyCodeFromString("") - 479366668, (byte) (86 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf((CharSequence) "", '0') + 12, (-1608234638) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 80)).intern())) {
                    b = 2;
                }
            } else if (str.equals(m1026((-479366691) - TextUtils.lastIndexOf("", '0', 0), (byte) (120 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - View.combineMeasuredStates(0, 0), ImageFormat.getBitsPerPixel(0) - 1608234638, (short) (ImageFormat.getBitsPerPixel(0) + 78)).intern())) {
                int i2 = f956 + 33;
                f954 = i2 % 128;
                int i3 = i2 % 2;
                b = 1;
            }
            b = -1;
        } else if (str.equals(m1026((-479366712) - View.MeasureSpec.getMode(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4), TextUtils.lastIndexOf("", '0', 0, 0) + 13, ImageFormat.getBitsPerPixel(0) - 1608234638, (short) (TextUtils.lastIndexOf("", '0') + 26)).intern())) {
            int i4 = f954 + 55;
            f956 = i4 % 128;
            if (i4 % 2 != 0) {
                b = 1;
            }
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m1018(String str) {
        byte b;
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != -2102692847) {
            if (iHashCode != -1357644918) {
                if (iHashCode == 235669401 && str.equals(m1025("\ueb50\ueb11녫\ud8d9ꝡ堂䳚쥒བྷ瓒斣聍꒩愩國\ue86e\u1c8c맾뿶傌瑯퇚ߐ뢪갦榸澡\ue0f7", ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    int i2 = f956 + 3;
                    f954 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    b = -1;
                }
            } else if (str.equals(m1026((-479366647) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-43) - TextUtils.getOffsetAfter("", 0)), 10 - TextUtils.lastIndexOf("", '0', 0), (-1608234639) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (KeyEvent.getDeadChar(0, 0) - 26)).intern())) {
                int i4 = f954 + 73;
                f956 = i4 % 128;
                b = i4 % 2 != 0 ? (byte) 0 : (byte) 1;
            } else {
                b = -1;
            }
        } else if (str.equals(m1026((-479366626) - (KeyEvent.getMaxKeyCode() >> 16), (byte) (AndroidCharacter.getMirror('0') - 'D'), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.red(0) - 1608234639, (short) (ExpandableListView.getPackedPositionGroup(0L) + 94)).intern())) {
            b = 2;
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (b == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (b != 2) {
            return null;
        }
        AdUnit.AdCreativeType adCreativeType = AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
        int i5 = f954 + 107;
        f956 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return adCreativeType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1024(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f956 + 97;
        f954 = i2 % 128;
        int i3 = i2 % 2;
        Object dataModel = adContainer.getDataModel();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return dataModel;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1025(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f957, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f957));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1026(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f960;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f961;
                if (bArr != null) {
                    i5 = (byte) (bArr[f958 + i] + i4);
                } else {
                    i5 = (short) (f955[f958 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f958 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f959);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f961;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f955;
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
