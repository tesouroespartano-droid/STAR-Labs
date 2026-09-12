package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: loaded from: classes2.dex */
public final class cd extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1264 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1265;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1267 = {-1697309336, 220918709, -1304877352, -100361615, -1888849426, 1835199815, -984695101, -1223040206, -1890203965, 897971569, 1326769327, -1164077658, -1656772177, 320778980, 1021359858, 1510443285, 716954270, -152963451};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1266 = 35650;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1270 = 34907;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1269 = 61663;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1268 = 45795;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ SAInterface m1441() {
        int i = 2 % 2;
        int i2 = f1264 + 51;
        f1265 = i2 % 128;
        int i3 = i2 % 2;
        SAInterface sAInterfaceM1440 = m1440();
        int i4 = f1264 + 115;
        f1265 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return sAInterfaceM1440;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1442(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f1265 + 97;
        f1264 = i2 % 128;
        int i3 = i2 % 2;
        m1445(sABannerAd, sAInterface);
        int i4 = f1265 + 73;
        f1264 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m1443(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f1264 + 99;
        f1265 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM1447 = m1447(sAAd);
        int i4 = f1265 + 5;
        f1264 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObjectM1447;
        }
        throw null;
    }

    public cd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1264 + 91;
        f1265 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            int i4 = f1264 + 61;
            f1265 = i4 % 128;
            if (i4 % 2 == 0) {
                return sDKVersionNumber;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            return hu.m2296().m2297().m2344(SAVersion.class, m1444(new int[]{819183696, 1234172528, 820578273, -1839302098, -1425230877, -1957547402}, TextUtils.indexOf("", "", 0) + 12).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x049f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x025a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0348  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1959951430:
                if (!str.equals(m1444(new int[]{-536392485, 1993514719, -761250451, -1773112063, 1941113491, -554258685, -1861233694, 237713550, 1788619673, 1267129326, 1420773436, 424477837, 2075696724, 1057404259}, 26 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -1855458488:
                if (!str.equals(m1444(new int[]{-1657093613, 1506791699, -2021277335, 1167669161, 1033405004, 153902349, -1201808085, -1641996766, -510129838, -246960170, 1107548303, 1818328523, -626552271, -1894658266, 1456998871, 925667745, 662008953, -16187998}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33).intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -1788589794:
                if (!str.equals(m1446("ᔜῈ頼膌폱ࣽ欸ꅡ郕ꯪ\ue5c8䷸㧣㪖췳얄ẽ曰噈瘠ꔿ簊", TextUtils.lastIndexOf("", '0', 0, 0) + 23).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case -1718372116:
                if (!str.equals(m1444(new int[]{-1248636080, 1330503523, -2075523263, 303394817}, ((byte) KeyEvent.getModifierMetaStateMask()) + 8).intern())) {
                    b2 = -1;
                } else {
                    b2 = 35;
                }
                break;
            case -1711491530:
                if (!str.equals(m1446("ᶩ縳᠒䠘\udcb7▄ﬥК", 6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.US;
                }
                break;
            case -1305374924:
                if (!str.equals(m1446("糴⇿륤\u0b31ꀸ隰Փꊄ䔚鼶\ue7aa畱㩒罔傸ᓍ퍆笰䧌氾め\udfaf劃\uf515曭勦\uf4fc\ue332芌挨䨥樦蝬챼ꔿ簊煘큈ᶩ縳渄ҵ蝬챼ꔿ簊㋦꣄㋦꣄犪뙠ﱒ\udbc8瓘\uf609峒ᕰ", 56 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case -1292741795:
                if (str.equals(m1446("ᶩ縳\ue3a0䄎ᔏ鑂ᔜῈ", 8 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    int i2 = f1264 + 35;
                    f1265 = i2 % 128;
                    b2 = i2 % 2 == 0 ? Ascii.EM : (byte) 52;
                } else {
                    b2 = -1;
                }
                break;
            case -1246480821:
                if (!str.equals(m1446("頼膌᷐蟩퓫啳샪Ⓔ씍切틹銈犪뙠ﱒ\udbc8瓘\uf609峒ᕰ", 19 - Color.green(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.CR;
                }
                break;
            case -983382056:
                if (!str.equals(m1446("頼膌᷐蟩퓫啳샪Ⓔ씍切炶\u2d7a䣆댴Ⱞ冷컅㐙乻\uf7f1ㅱ\udefe", 22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SI;
                }
                break;
            case -926853969:
                if (!str.equals(m1446("ᶩ縳⋫쨬奢\ue387䣆댴讈＜", Color.rgb(0, 0, 0) + 16777226).intern())) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -877887884:
                if (!str.equals(m1446("\ue259䥉噈瘠蓆嚾峡\u0b8d픡絗Փꊄ쯈\ue310舣躚淐\ue621≯ۜՓꊄ頼膌폱ࣽ", Gravity.getAbsoluteGravity(0, 0) + 26).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1265 + 27;
                    f1264 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b2 = 9;
                    } else {
                        b = 17;
                        b2 = b;
                    }
                }
                break;
            case -844831949:
                if (!str.equals(m1444(new int[]{-1657093613, 1506791699, -2021277335, 1167669161, 1033405004, 153902349}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -499959157:
                if (!str.equals(m1446("ᶩ縳趆蛊\ueac5\uddc3〝矣䊅蠥튰\ue4c0", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern())) {
                    b2 = -1;
                } else {
                    b2 = 33;
                }
                break;
            case -279114759:
                if (!str.equals(m1444(new int[]{-49445330, -2061462218, 1647200144, 1778848007, -504667905, -1688619452, 1866151737, 1600035505, -372075844, -1695459532, -799402559, 620501384, -1825655791, 757604190, -551457812, 1622311153, -761250451, -1773112063, 1941113491, -554258685, -1645723227, -1620336694, -761250451, -1773112063, 1941113491, -554258685, 1295410424, -1718911838, 125403658, 974101520, -350292205, -2055497092}, Process.getGidForName("") + 62).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1264 + 95;
                    f1265 = i4 % 128;
                    if (i4 % 2 == 0) {
                        b2 = Ascii.SO;
                    } else {
                        b2 = 8;
                    }
                }
                break;
            case -258874416:
                if (!str.equals(m1444(new int[]{60545117, 1395837207, -841598248, -477948380, -1737656464, 1140032050}, 9 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 2537233:
                if (!str.equals(m1444(new int[]{-1519732486, -2035237800}, ((Process.getThreadPriority(0) + 20) >> 6) + 4).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1265 + 79;
                    f1264 = i5 % 128;
                    b2 = i5 % 2 != 0 ? Ascii.ESC : (byte) 53;
                }
                break;
            case 102107741:
                if (!str.equals(m1444(new int[]{-1518988726, 1407541049, -181483228, 2001826383, -771141446, -1794527365, 1910213917, -482761072}, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 347965699:
                if (!str.equals(m1444(new int[]{-1657093613, 1506791699, -2021277335, 1167669161, 1033405004, 153902349, -1201808085, -1641996766, -510129838, -246960170, 1682448856, -1287308586, 1456998871, 925667745, 662008953, -16187998}, (ViewConfiguration.getScrollBarSize() >> 8) + 30).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.FF;
                }
                break;
            case 511814123:
                if (!str.equals(m1444(new int[]{157489322, -221678862, 1474659784, 1819711850, 537849465, 985063819}, View.resolveSizeAndState(0, 0, 0) + 9).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ETB;
                }
                break;
            case 562364207:
                if (!str.equals(m1446("\ue259䥉噈瘠蓆嚾峡\u0b8d픡絗Փꊄ쯈\ue310舣躚淐\ue621≯ۜՓꊄ", 22 - (Process.myPid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1264 + 73;
                    f1265 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 11 : (byte) 112;
                }
                break;
            case 690451442:
                if (!str.equals(m1444(new int[]{-536392485, 1993514719, -1358999763, -1873441972, 657546022, -342103313, -619296518, 2106455008, -139751183, -529462841, 979392387, -353932062, 1456998871, 925667745, 662008953, -16187998}, TextUtils.getTrimmedLength("") + 30).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case 816054202:
                if (!str.equals(m1446("ᶩ縳∳⽚輶澐㩒罔渞㏋㛾Ͷ\ue5beؑ状累", 15 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case 846064660:
                if (!str.equals(m1446("ᶩ縳釳墝\ue220縥\u0fecา獮\uee43", (Process.myTid() >> 22) + 9).intern())) {
                    b2 = -1;
                } else {
                    int i7 = f1265 + 105;
                    f1264 = i7 % 128;
                    b = i7 % 2 == 0 ? SignedBytes.MAX_POWER_OF_TWO : Ascii.RS;
                    b2 = b;
                }
                break;
            case 912139882:
                if (!str.equals(m1444(new int[]{1000653349, 76677049, -920763052, -587291514, 1222551989, 991734262}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11).intern())) {
                    b2 = -1;
                } else {
                    int i8 = f1264 + 91;
                    f1265 = i8 % 128;
                    if (i8 % 2 == 0) {
                        b2 = Ascii.SUB;
                    } else {
                        b2 = Ascii.ETB;
                    }
                }
                break;
            case 947295484:
                if (!str.equals(m1444(new int[]{60545117, 1395837207, -841598248, -477948380, -1281546580, -1480272432, 1394610376, -791269101}, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 1067523235:
                if (!str.equals(m1444(new int[]{-500786827, 1447314513, -1585460279, 1676946479, 1952791752, -1165075739, -1281546580, -1480272432, 1394610376, -791269101}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC2;
                }
                break;
            case 1179812605:
                if (!str.equals(m1446("糴⇿륤\u0b31ꀸ隰Փꊄ䔚鼶\ue7aa畱㩒罔傸ᓍ퍆笰䧌氾め\udfaf劃\uf515曭勦\uf4fc\ue332芌挨ᶩ縳趆蛊\ueac5\uddc3檗汋됵蠓됵蠓嶦虈ᔜῈ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 1233891357:
                if (!str.equals(m1444(new int[]{1400426555, 1465730736, 1617310848, 558749657, -914643729, 498941333}, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.FS;
                }
                break;
            case 1635726011:
                if (!str.equals(m1446("ᶩ縳頼膌᷐蟩౺ꭱ\u0b52縎슮\udfcd", 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1852615901:
                if (!str.equals(m1446("ᶩ縳\uf34b耘\uf296ᨿՓꊄᔜῈ", (Process.myTid() >> 22) + 10).intern())) {
                    b2 = -1;
                } else {
                    b2 = 34;
                }
                break;
            case 1864912441:
                if (!str.equals(m1446("ᶩ縳渄ҵ蝬챼ꔿ簊㋦꣄먜\ufdea\ue5beؑ状累", View.MeasureSpec.getMode(0) + 15).intern())) {
                    b2 = -1;
                } else {
                    int i9 = f1265 + 39;
                    f1264 = i9 % 128;
                    if (i9 % 2 != 0) {
                        b2 = 17;
                    } else {
                        b2 = 9;
                    }
                }
                break;
            case 1888267954:
                if (!str.equals(m1446("糴⇿륤\u0b31ꀸ隰Փꊄ䔚鼶\ue7aa畱㩒罔傸ᓍ퍆笰䧌氾め\udfaf劃\uf515曭勦\uf4fc\ue332籄ଽ蠚稂噈瘠蓆嚾ㅸ扳됵蠓ฑꙍ憼䫒", 43 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1968274797:
                if (!str.equals(m1444(new int[]{-836481995, 1421738652, -975435597, 2065411726, 1049004388, 185171929}, TextUtils.getTrimmedLength("") + 10).intern())) {
                    b2 = -1;
                } else {
                    int i10 = f1264 + 123;
                    f1265 = i10 % 128;
                    int i11 = i10 % 2;
                }
                break;
            case 1976248583:
                if (str.equals(m1444(new int[]{-1657093613, 1506791699, -2021277335, 1167669161, 1033405004, 153902349, -445369222, -1945826874, -1820080679, 612042283}, 20 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case 2044807796:
                if (!str.equals(m1444(new int[]{1400426555, 1465730736, 1617310848, 558749657, -485400382, 1444233736, -418763173, 291996776}, 16 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.GS;
                }
                break;
            case 2057982119:
                if (!str.equals(m1446("ᶩ縳渞㏋溲ࡏ샪Ⓔ씍切ㅱ\udefe", 11 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = Ascii.CAN;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return AwesomeAds.class;
            case 1:
                return IVideoPlayer.Listener.class;
            case 2:
                return SAVideoClick.class;
            case 3:
                return SAVideoAd.class;
            case 4:
            case 5:
                return SAInterstitialAd.class;
            case 6:
            case 7:
                return SAVideoActivity.class;
            case 8:
                return IVideoPlayer.class;
            case 9:
                return IVideoPlayerControllerView.class;
            case 10:
                return IVideoPlayerControllerView.Listener.class;
            case 11:
                return IVideoPlayerController.class;
            case 12:
                return IVideoPlayerController.Listener.class;
            case 13:
            case 14:
                return VideoPlayerActivity.class;
            case 15:
                return VideoPlayerController.class;
            case 16:
                return AdVideoPlayerControllerView.class;
            case 17:
                return SAManagedAdView.class;
            case 18:
            case 19:
                return SAManagedAdActivity.class;
            case 20:
                return SACustomWebView.class;
            case 21:
                return AdViewJavaScriptBridge.class;
            case 22:
                return AdViewJavaScriptBridge.Listener.class;
            case 23:
                return SAWebView.class;
            case 24:
                return SAWebPlayer.class;
            case 25:
                return SAVASTAd.class;
            case 26:
                return SAVASTMedia.class;
            case 27:
                return SAAd.class;
            case 28:
                return SACreative.class;
            case 29:
                return SACreativeFormat.class;
            case 30:
                return SADetails.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return SAMedia.class;
            case 32:
                return SAResponse.class;
            case 33:
                return SAInterface.class;
            case 34:
                return SABannerAd.class;
            case 35:
                return SAEvent.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1444(new int[]{-158098517, -1203366590, 1196744234, -1589037588, 1700840424, -1096657907, -2065139751, 891175112}, View.MeasureSpec.makeMeasureSpec(0, 0) + 13).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cd.m1443((SAAd) list.get(0));
            }
        });
        map.put(m1446("ꔿ簊೫쏡噈瘠蓆嚾ᔜῈ䔹워輶澐\u0a00⦝Փꊄ", ((Process.getThreadPriority(0) + 20) >> 6) + 18).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cd.m1441();
            }
        });
        map.put(m1444(new int[]{-1722112274, 1974409128, 1034563057, 1984872851, -1128344598, -1421013466, -1841396065, 864367533, -1368100823, -1059660349}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cd.m1442((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i2 = f1265 + 77;
        f1264 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m1447(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f1264 + 5;
        f1265 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return jSONObjectWriteToJson;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static SAInterface m1440() {
        SAInterface listener;
        int i = 2 % 2;
        int i2 = f1264 + 123;
        f1265 = i2 % 128;
        if (i2 % 2 != 0) {
            listener = SAVideoAd.getListener();
            int i3 = 38 / 0;
        } else {
            listener = SAVideoAd.getListener();
        }
        int i4 = f1265 + 113;
        f1264 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1445(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f1264 + 53;
        f1265 = i2 % 128;
        int i3 = i2 % 2;
        sABannerAd.setListener(sAInterface);
        int i4 = f1264 + 13;
        f1265 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1444(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1267.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1446(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1266)) ^ ((c2 >>> 5) + f1269)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1270) ^ ((c3 + i2) ^ ((c3 << 4) + f1268))));
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
