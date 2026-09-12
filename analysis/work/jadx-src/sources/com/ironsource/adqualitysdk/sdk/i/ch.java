package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ch extends bg {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1334 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1335 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1336 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1337 = 11435;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1338;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1339 = {713109615, -522982169, -1840859894, -419119183, 900808120, -797674818, -1913008873, -1194093128, 1290511199, -1642006864, -124253999, -1353623328, 24721926, 1534675904, 2085941055, -1213765782, 1172509983, 2014547278};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1520(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f1334 + 63;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        String strM1533 = m1533(cacheableReplacement);
        int i4 = f1334 + 19;
        f1336 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1533;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1521(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f1336 + 11;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        String strM1526 = m1526(appNode);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = f1334 + 113;
        f1336 = i5 % 128;
        if (i5 % 2 == 0) {
            return strM1526;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1522(Placement placement) {
        int i = 2 % 2;
        int i2 = f1334 + 31;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        String strM1534 = m1534(placement);
        int i4 = f1336 + InterfaceC0280i1.d.b.g;
        f1334 = i4 % 128;
        int i5 = i4 % 2;
        return strM1534;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m1524(Placement placement) {
        int i = 2 % 2;
        int i2 = f1334 + 69;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM1530 = m1530(placement);
        int i4 = f1334 + 81;
        f1336 = i4 % 128;
        int i5 = i4 % 2;
        return zM1530;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.TemplateSettings m1525(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1336 + 7;
        f1334 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1519(adUnit);
        }
        m1519(adUnit);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.AdUnit m1527(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f1334 + 49;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.AdUnit adUnitM1531 = m1531(adPayload);
        int i4 = f1336 + 47;
        f1334 = i4 % 128;
        int i5 = i4 % 2;
        return adUnitM1531;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1528(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1336 + 85;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        String strM1532 = m1532(adUnit);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return strM1532;
    }

    public ch(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    final String mo789() {
        int i = 2 % 2;
        int i2 = f1334 + 121;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = mo820().split(m1529("⸅", View.combineMeasuredStates(0, 0) + 453388258, "\ue2ddا氛㘠", "\u0000\u0000\u0000\u0000", (char) (8300 - Color.green(0))).intern())[0];
            int i4 = f1336 + 125;
            f1334 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo820() {
        hw hwVarM2297;
        Class<BuildConfig> cls;
        String strM1529;
        int i = 2 % 2;
        int i2 = f1336 + 83;
        f1334 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                hwVarM2297 = hu.m2296().m2297();
                cls = BuildConfig.class;
                strM1529 = m1529("零ǆ\ue7e8⬪⩕롤뵢\u31ee\ue83d懿蛁銠ת곭", (-1) % Process.getGidForName(""), "\uf1baﾇ蝽Ⰽ", "\u0000\u0000\u0000\u0000", (char) (9531 >>> (ViewConfiguration.getMaximumFlingVelocity() >>> 30)));
            } else {
                hwVarM2297 = hu.m2296().m2297();
                cls = BuildConfig.class;
                strM1529 = m1529("零ǆ\ue7e8⬪⩕롤뵢\u31ee\ue83d懿蛁銠ת곭", (-1) - Process.getGidForName(""), "\uf1baﾇ蝽Ⰽ", "\u0000\u0000\u0000\u0000", (char) (3463 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)));
            }
            return hwVarM2297.m2344(cls, strM1529.intern());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0333  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = Ascii.DC4;
        switch (iHashCode) {
            case -1836618638:
                b = !str.equals(m1523(new int[]{-1144968818, -1383878130, -354324246, -1712991006, 164894005, -1819701990}, KeyEvent.keyCodeFromString("") + 10).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1791176561:
                b = !str.equals(m1529("汃欬狿\uef8dƗ쬧䶹욄", View.resolveSizeAndState(0, 0, 0), "蔨袝⣐擠", "\u0000\u0000\u0000\u0000", (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1560947009:
                b = !str.equals(m1529("\uf377쎋\ueaa3頮涃뿘⒃鎞삫ꯙ晣懛\uecb8환\uf01d䋕驂鑂¥\u0e7c␒\uea7a詬츪ˍ", (-1410275527) - (ViewConfiguration.getScrollDefaultDelay() >> 16), "㤊\uf0e7ຫࡔ", "\u0000\u0000\u0000\u0000", (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1494265129:
                if (!str.equals(m1529("䦌캍臾덎⢡飆⟜咳倸瀫ꇆ盩\ue901䄏氏⯉䌝쓛盺匇\u0a54\uea7c隈᭽ﾠꀔ배嬀첪슿븁쵣㏬ꆤ便森ㄴኳ믆덉⍨", (ViewConfiguration.getPressedStateDuration() >> 16) - 1050069917, "揹椴证琅", "\u0000\u0000\u0000\u0000", (char) (1419 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                    b = -1;
                } else {
                    int i2 = f1336 + 97;
                    f1334 = i2 % 128;
                    int i3 = i2 % 2;
                    b = Ascii.CAN;
                }
                break;
            case -1435839138:
                if (!str.equals(m1523(new int[]{247834265, -323733314, 265241498, -1314664911, 78898287, 1978094230}, 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f1334 + 23;
                    f1336 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.SI;
                }
                break;
            case -1179107681:
                if (!str.equals(m1523(new int[]{-2116724976, 1148515583, -1142976774, -2031949048, 2005137964, 2003158286}, (ViewConfiguration.getScrollBarSize() >> 8) + 9).intern())) {
                    b = -1;
                } else {
                    int i6 = f1334 + 65;
                    f1336 = i6 % 128;
                    b = i6 % 2 == 0 ? Ascii.EM : (byte) 54;
                }
                break;
            case -609786639:
                if (!str.equals(m1523(new int[]{-1088231838, -75344001, 1454402752, 1444044133, -1777993676, 1186457052}, Color.blue(0) + 10).intern())) {
                    b = -1;
                } else {
                    b = Ascii.NAK;
                }
                break;
            case -498709917:
                if (!str.equals(m1523(new int[]{-2023107472, 1482663936, 1610669435, -1707727866, 1708909977, -871208718, -501967118, 159829608, -371638358, -1255604298, -1456030730, 648861464}, 22 - TextUtils.indexOf("", "", 0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1334 + 23;
                    f1336 = i7 % 128;
                    b = i7 % 2 == 0 ? Ascii.DC2 : (byte) 80;
                }
                break;
            case -498060603:
                if (!str.equals(m1529("蔙䔘ユ䣉⭽캎牘㰷尊", Color.red(0) - 864363897, "蝲竚Ì噜", "\u0000\u0000\u0000\u0000", (char) Color.green(0)).intern())) {
                    b = -1;
                }
                break;
            case -486531311:
                b = !str.equals(m1529("㌭㲄䟯鏹ꔀ\uf2a9뢄╒人㠋뾗棓걾顼", TextUtils.getOffsetAfter("", 0), "聓쨒瑩䙛", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23411)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -393802555:
                if (!str.equals(m1523(new int[]{-1088231838, -75344001, 1454402752, 1444044133, -501967118, 159829608, -371638358, -1255604298, -1456030730, 648861464}, TextUtils.indexOf((CharSequence) "", '0', 0) + 19).intern())) {
                    b = -1;
                } else {
                    int i8 = f1334 + InterfaceC0280i1.d.b.b;
                    f1336 = i8 % 128;
                    if (i8 % 2 == 0) {
                        b = 22;
                    } else {
                        b = Ascii.NAK;
                    }
                }
                break;
            case -43797322:
                b = !str.equals(m1523(new int[]{-997976910, -2099781378, -1846029935, 981812816, -1517984121, -992834175, 760133472, 959074832, 1346997652, -500841495}, 20 - Color.alpha(0)).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 307971376:
                b = !str.equals(m1529("續앩\ue622\udfcc䜀䆉\udaddꀭ窰㛂퐕\ue721", ViewConfiguration.getMaximumFlingVelocity() >> 16, "\uf3fd쎍㈔獈", "\u0000\u0000\u0000\u0000", (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 320151695:
                b = !str.equals(m1529("ඎ簨瘺뮝碍톎䥣\uf3d0揥勩炞췄ꔟ懱", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "쭢ᮃ\uf4cd䖪", "\u0000\u0000\u0000\u0000", (char) (43764 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 324239304:
                b = !str.equals(m1523(new int[]{566380786, 1006567007, -501967118, 159829608, -371638358, -1255604298, -1456030730, 648861464}, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case 389759008:
                if (!str.equals(m1523(new int[]{926152217, 2085990147, 908356560, 888423948, -277886056, -270905389}, 10 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 484680813:
                b = !str.equals(m1523(new int[]{-464852309, 1987120915, 1208794776, 1949152260}, 6 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 870529955:
                if (!str.equals(m1529("ꧡ\uf2cc媶≷뭙\uf08f녬", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2123419922, "Ꭳ郑ቾ붃", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern())) {
                    b = -1;
                } else {
                    int i9 = f1336 + 13;
                    f1334 = i9 % 128;
                    if (i9 % 2 != 0) {
                        b = 5;
                    } else {
                        b = 3;
                    }
                }
                break;
            case 961844241:
                if (!str.equals(m1529("耧ꅥ쳂츐ýꡦ욝伱櫹\ue88f", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "殳駔⍙飒", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern())) {
                    b = -1;
                } else {
                    int i10 = f1334 + 67;
                    f1336 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 9;
                }
                break;
            case 989853769:
                if (!str.equals(m1523(new int[]{-216800129, -32595374, -973106090, -1602772979, 15078892, 1482767589, 1292581667, 409124065, -203574337, -1155239068, -601431695, -1054213100, -2076934650, -196397209, -62472882, 2002051015, -1004154060, -1512588125, -233544021, -2041809609}, 37 - TextUtils.getTrimmedLength("")).intern())) {
                    b = -1;
                } else {
                    int i12 = f1336 + 117;
                    f1334 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 1;
                }
                break;
            case 1205766784:
                b = !str.equals(m1523(new int[]{-2116724976, 1148515583, 921202074, 120918858, -354324246, -1712991006, 164894005, -1819701990}, View.getDefaultSize(0, 0) + 14).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 1208038126:
                b = !str.equals(m1523(new int[]{-2116724976, 1148515583, 842412450, 1989417135, -669479498, -732253206, -1585690320, -214069653}, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : Ascii.ESC;
                break;
            case 1442693170:
                b = !str.equals(m1529("\ue98c埑\uf430넓삣쉕鐊ẕ螏ᗥᚔ鏜\u218e⫕蛫⦼鴾녱咪쀴", ExpandableListView.getPackedPositionType(0L), "ฝ邰瀟\ueac2", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1505622627:
                b = !str.equals(m1523(new int[]{808473012, -185958526, 586280842, 984108145, 1099946383, 119790857, 250026325, 1175236260}, 16 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1839869899:
                if (!str.equals(m1529("앒뢊䢭ࡶ\uf2dbℽ͡\uefe4犲", 78396707 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "⍍갽ጄ쒰", "\u0000\u0000\u0000\u0000", (char) View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i14 = f1334 + 57;
                    f1336 = i14 % 128;
                    int i15 = i14 % 2;
                    b = 4;
                }
                break;
            case 1853648591:
                b = !str.equals(m1523(new int[]{566380786, 1006567007, 247834265, -323733314, 265241498, -1314664911, 78898287, 1978094230}, MotionEvent.axisFromString("") + 17).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case 1930966324:
                b = !str.equals(m1523(new int[]{-2116724976, 1148515583, -189574207, 1373990621, -196337098, -868518924, -1585690320, -214069653}, 15 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 1982630644:
                b = !str.equals(m1523(new int[]{566380786, 1006567007, -1777993676, 1186457052}, (ViewConfiguration.getLongPressTimeout() >> 16) + 6).intern()) ? (byte) -1 : Ascii.VT;
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
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case 8:
                return BannerAdSize.class;
            case 9:
            case 10:
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case 12:
                return BaseAdListener.class;
            case 13:
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                int i16 = f1334 + 117;
                f1336 = i16 % 128;
                if (i16 % 2 == 0) {
                    return RewardedAd.class;
                }
                throw null;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1523(new int[]{-1230209385, 442196963, -924745088, -2118738805, -113822810, -1316185058}, Color.argb(0, 0, 0, 0) + 9).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1527((AdPayload) list.get(0));
            }
        });
        map.put(m1529("ⷘ㸂\ue972쀕獂殴餇䩇", ViewConfiguration.getMaximumFlingVelocity() >> 16, "\u242e䓘С얈", "\u0000\u0000\u0000\u0000", (char) TextUtils.getOffsetAfter("", 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1521((AppNode) list.get(0));
            }
        });
        map.put(m1529("\ud8fe䑵菀\uf77d靣ㆂሌꋕ\uef01鑔㢌\uefba㢊\ud9f4뷌뤧\uda67僮华㤊斬＋⯚⏘㪽旮", ViewConfiguration.getMinimumFlingVelocity() >> 16, "ᇐ⛯\uf82d\ue049", "\u0000\u0000\u0000\u0000", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18936)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1520((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m1529("\ue532鸿ꨡ☎\udcff晦ᄀ簽뮰⻄톪", (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 332174910, "슔㍩Ꮼ䞮", "\u0000\u0000\u0000\u0000", (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1528((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1523(new int[]{1568222283, 1183866979, 760133472, 959074832, 1346997652, -500841495, 989216329, -150479194}, 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1522((Placement) list.get(0));
            }
        });
        map.put(m1523(new int[]{637149069, 185482387, -772629771, -66728823, 1450392654, 2121863582, 1700007726, 1884755969, -1371137105, -759467042}, MotionEvent.axisFromString("") + 20).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ch.m1525((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1523(new int[]{-8795118, 946484176, -1878703623, 686009025, 1503197193, -994337127, 794129334, 1049877901}, 15 - KeyEvent.normalizeMetaState(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ch.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(ch.m1524((Placement) list.get(0)));
            }
        });
        int i2 = f1334 + 117;
        f1336 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdPayload.AdUnit m1531(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f1336 + 75;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        int i4 = f1334 + 15;
        f1336 = i4 % 128;
        int i5 = i4 % 2;
        return adUnit;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1526(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f1334 + 105;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        String appId = appNode.getAppId();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = f1334 + 21;
        f1336 = i5 % 128;
        if (i5 % 2 == 0) {
            return appId;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1533(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f1334 + 73;
        f1336 = i2 % 128;
        int i3 = i2 % 2;
        String url = cacheableReplacement.getUrl();
        int i4 = f1336 + 93;
        f1334 = i4 % 128;
        if (i4 % 2 != 0) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1532(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1336 + 113;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        String campaign = adUnit.getCampaign();
        int i4 = f1334 + 119;
        f1336 = i4 % 128;
        if (i4 % 2 == 0) {
            return campaign;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1534(Placement placement) {
        int i = 2 % 2;
        int i2 = f1336 + 61;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        String referenceId = placement.getReferenceId();
        int i4 = f1334 + 41;
        f1336 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return referenceId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m1519(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1336 + 81;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        int i4 = f1334 + 63;
        f1336 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return templateSettings;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m1530(Placement placement) {
        int i = 2 % 2;
        int i2 = f1336 + 117;
        f1334 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i4 = f1336 + 39;
        f1334 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return zIsRewardedVideo;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1529(String str, int i, String str2, String str3, char c) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (g.f2155) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1338) ^ ((long) f1335)) ^ ((long) f1337));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1523(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1339.clone();
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
}
