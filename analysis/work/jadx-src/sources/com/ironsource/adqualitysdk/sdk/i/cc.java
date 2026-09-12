package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.qq.e.ads.ADActivity;
import com.qq.e.ads.DialogActivity;
import com.qq.e.ads.LandscapeADActivity;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.PortraitADActivity;
import com.qq.e.ads.RewardvideoLandscapeADActivity;
import com.qq.e.ads.RewardvideoPortraitADActivity;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.ACTD;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cc extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1250 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1252 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1253 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1255 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1257 = 187;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1254 = {258, 255, 271, 252, 287, 270, 294, 286, 303, 292, 305, 308, 298, 296, 233, 300, 288, 284, 302, 295, 290, 263, 297, 299, 267, 301, 269, 306, 272, 289, 260, 273, 253, 256, 307};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1256 = {4036, 46822, 32150, 9219, 60270, 37424, 22685, 8064, 50937, 36184, 13327, 64302, 41377, 26800, 12135, 54868, 40228, 17373, 2802, 45499, 30806, 16149, 58922, 'D', 47431, 29245, 11238, 58583, 40321, 22357, 4129, 51460, 33527, 15290, 62611, 44636, 26415, 'c', 47425, 29233, 11172, 58569, 40343, 22330, 4135, 51550, 33535, 15272, 62601, 44550, 26394, 8421, 55772, 37508, 19581, 1375, 48651, 30696, 12451, 59829, 41830, 23569, 5405, 52952, 34739, 16766, 64095, 45840, 27883, 20349, 63071, 15663, 25786, 43991, 53897, 6180, 24377, 34368, 52705, 29878, 48023, 57624, 10264, 28661, 38622, 56714, 866, 19011, 61725, 14578, 32665, 42670, 60541, 4909, 23060, 33243, 51378, 3711, 46428, 64515, 32841, 14699, 61979, 43918, 25827, 7613, 55056, 36877, 18804, 725, 48002, 29859, 11820, 59182, 41163, 23023, 4779, 52310, 34162, 15926, 63451, 45192, 27067, 9063, 56374, 38197, 20200, 1940, 49489, 31359, 13103, 60616, 42383, 24197, 6258, 53537, 35377, 17400, 64663, 46686, 28531, 10240, 57823, 'R', 47435, 29227, 11243, 58570, 40322, 22370, 4139, 51476, 33531, 15267, 62634, 44615, 26404, 8432, 55744, 37505, 19559, 1352, 48683, 30684, 12423, 59799, 41814, 23609, 5384, 52933, 34734, 16753, 8780, 39769, 20524, 2549, 50888, 49050, 30057, 12818, 60167, 41203, 6576, 54929, 35906, 17723, 756, 64479, 45200, 28278, 10057, 39986, 21957, 59376, 24297, 38281, 52297, 872, 31264, 45280, 63369, 11958, 25945, 56321, 4889, 18894, 'L', 47425, 29245, 11246, 58617, 40322, 22340, 4131, 51458, 33535, 15265, 62601, 'U', 47424, 29237, 11244, 58577, 40323, 22384, 4096, 51473, 33520, 15266, 62623, 44634, 26391, 8384, 55806, 37513, 19581, 1352, 48655, 30710, 12451, 59782, 58560, 24043, 38552, 53117, '\\', 30985, 46049, 'A', 47486, 29196, 11225, 58572, 40327, 22368, 4151, 51459, 41499, 6967, 53330, 35220, 11157, 37534, 23025, '6', 53024, 46685, 31934, 15343, 58075, 43302, 4214, 57175, 34224, 19659, 17559, 64955, 14040, 28477, 40972, 55618, 5029, 21718, 36301, 50703, 32594, 45165, 60093, 9172, 'g', 47435, 29224, 11224, 58589, 40337, 22389, 4144, 51476, 33503, 15272, 62638, 44625, 26406, 8417, 'g', 47435, 29224, 11224, 58589, 40337, 22389, 4144, 51476, 33531, 15272, 62655, 44624, 26402, 8439, 55767, 24827, 43928, 62067, 15718, 17442, 36545, 51584, 4275, 23386, 57877, 11582, 30705, 48775, 63832, 'G', 19240, 38346};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1251 = 4367063010112878894L;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ IGDTAdManager m1426() {
        int i = 2 % 2;
        int i2 = f1252 + 9;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        IGDTAdManager iGDTAdManagerM1427 = m1427();
        int i4 = f1252 + 121;
        f1250 = i4 % 128;
        int i5 = i4 % 2;
        return iGDTAdManagerM1427;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1428(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f1252 + 77;
        f1250 = i2 % 128;
        if (i2 % 2 != 0) {
            m1431(aPPStatus);
            throw null;
        }
        String strM1431 = m1431(aPPStatus);
        int i3 = f1252 + 63;
        f1250 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return strM1431;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m1429(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1252 + 71;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        int iM1434 = m1434(rewardVideoAD);
        int i4 = f1252 + 57;
        f1250 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return iM1434;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m1433(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1250 + 91;
        f1252 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM1439 = m1439(rewardVideoAD);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return mapM1439;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m1435(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f1250 + 25;
        f1252 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1430(unifiedInterstitialAD);
        }
        m1430(unifiedInterstitialAD);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m1438(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f1252 + 93;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapM1432 = m1432(liteAbstractAD);
        int i4 = f1250 + InterfaceC0280i1.d.b.b;
        f1252 = i4 % 128;
        if (i4 % 2 != 0) {
            return mapM1432;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public cc(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1252 + 107;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i4 = f1250 + 35;
        f1252 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return integrationSDKVersion;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        byte b2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1950656211:
                b = !str.equals(m1437(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0082\u0084\u0091\u0098\u0092\u0088\u0093\u0085\u0097\u0092\u0096").intern()) ? (byte) -1 : (byte) 5;
                break;
            case -1537668511:
                if (str.equals(m1436(TextUtils.indexOf((CharSequence) "", '0') + 173, 21 - (ViewConfiguration.getTouchSlop() >> 8), (char) (Gravity.getAbsoluteGravity(0, 0) + 8729)).intern())) {
                    int i2 = f1250 + 9;
                    f1252 = i2 % 128;
                    int i3 = i2 % 2;
                    b = Ascii.CR;
                } else {
                    b = -1;
                }
                break;
            case -1192770783:
                if (!str.equals(m1437(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0082\u0084\u0091\u0098\u0092\u0088\u0093\u0085\u0097\u0092\u0096\u008d\u0091\u0085\u008a\u008b\u0085\u009a\u0092\u009c\u0091\u009b").intern())) {
                    b = -1;
                } else {
                    int i4 = f1252 + 89;
                    f1250 = i4 % 128;
                    b = i4 % 2 == 0 ? (byte) 9 : (byte) 62;
                }
                break;
            case -1125491209:
                b = !str.equals(m1437(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u009a\u0091\u0097\u0091\u0089\u0093\u008a\u0096\u0082\u0084").intern()) ? (byte) -1 : Ascii.EM;
                break;
            case -1040623465:
                b = !str.equals(m1436(Color.green(0) + 23, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, (char) View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -839956733:
                b = !str.equals(m1437(null, AndroidCharacter.getMirror('0') + 'O', null, "\u009c\u0091\u008a \u009a\u0091\u0097\u0097\u0092¡\u0085\u0091\u008a\u009e\u008a\u0097\u009d").intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case -570955421:
                b = !str.equals(m1437(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u009a\u0091\u0097\u0091\u0089\u0093\u008a\u0096\u0082\u0084\u008d\u0091\u0085\u008a \u0085\u009a\u0092\u009c\u0091\u009b").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -427681737:
                b = !str.equals(m1436((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 240, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, (char) (58496 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case -358530385:
                b = !str.equals(m1436(206 - (Process.myTid() >> 22), KeyEvent.normalizeMetaState(0) + 12, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -311779863:
                b = !str.equals(m1436((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 99, TextUtils.indexOf("", "", 0, 0) + 43, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32809)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -301299368:
                b = !str.equals(m1437(null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u009a\u0091\u0089\u0098\u0092\u0085\u0084\u009a\u0091\u0097\u0091\u0089\u0093\u008a\u0096\u0082\u0084").intern()) ? (byte) -1 : (byte) 22;
                break;
            case -287046183:
                b = !str.equals(m1436(143 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case -207731435:
                b = !str.equals(m1436(69 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 20254)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 2003474:
                b = !str.equals(m1436(257 - (ViewConfiguration.getWindowTouchSlop() >> 8), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41561 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 167349330:
                b = !str.equals(m1437(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0082\u0084").intern()) ? (byte) -1 : (byte) 1;
                break;
            case 555831221:
                if (!str.equals(m1436(219 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 22 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern())) {
                    b = -1;
                } else {
                    int i5 = f1250 + 125;
                    f1252 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 19;
                }
                break;
            case 796884557:
                b = !str.equals(m1437(null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0082\u0084\u0089\u008a\u0092\u009a\u0089\u009a\u008d\u0099").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 814717722:
                b = !str.equals(m1436((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Gravity.getAbsoluteGravity(0, 0) + 23, (char) (4007 - Color.red(0))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 937653587:
                if (!str.equals(m1436(248 - View.resolveSize(0, 0), TextUtils.getOffsetAfter("", 0) + 9, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1252 + 107;
                    f1250 = i7 % 128;
                    if (i7 % 2 == 0) {
                        b = 21;
                    } else {
                        b2 = 91;
                        b = b2;
                    }
                }
                break;
            case 1265986405:
                if (!str.equals(m1436((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, 32 - (Process.myPid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern())) {
                    b = -1;
                } else {
                    int i8 = f1252 + 53;
                    f1250 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 6;
                }
                break;
            case 1305853839:
                b = !str.equals(m1436((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 193, (ViewConfiguration.getFadingEdgeLength() >> 16) + 13, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 59297)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1336889139:
                b = !str.equals(m1436((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 261, 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11225)).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 1773421109:
                if (!str.equals(m1437(null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u009a\u0091\u0097\u0091\u0089\u0093\u008a\u0096\u0082\u0084\u0094\u0092\u008a\u0089\u008a\u0089\u0093\u009a\u0091\u0089\u0097\u009f\u0085\u0091\u008a\u009e\u008a\u0097\u009d").intern())) {
                    b = -1;
                } else {
                    int i10 = f1250 + 31;
                    f1252 = i10 % 128;
                    b2 = i10 % 2 == 0 ? (byte) 10 : Ascii.SO;
                    b = b2;
                }
                break;
            case 1874129984:
                if (!str.equals(m1437(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i11 = f1252 + 93;
                    f1250 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 0;
                }
                break;
            case 1958130193:
                b = !str.equals(m1437(null, 127 - TextUtils.indexOf("", "", 0), null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0082\u0084\u0089\u008a\u0092\u009a\u0089\u009a\u008d\u0099\u008d\u0091\u0085\u008a\u008b\u0085\u009a\u0092\u009c\u0091\u009b\u008f\u0093\u0085\u0092\u008f\u0091\u008f\u0090\u0090\u008f\u008e\u008d\u0088").intern()) ? (byte) -1 : (byte) 12;
                break;
            case 2111488863:
                b = !str.equals(m1437(null, TextUtils.getTrimmedLength("") + WorkQueueKt.MASK, null, "\u008c\u0089\u008a\u008b\u008a\u0089\u0088\u0084\u0095\u008d\u0094\u0092\u008a\u0082\u008f\u0093\u0085\u0092\u008f\u0091\u008f\u0090\u0090\u008f\u008e\u008d\u0088").intern()) ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return GDTAdSdk.class;
            case 1:
            case 2:
                return ADActivity.class;
            case 3:
            case 4:
                return DialogActivity.class;
            case 5:
            case 6:
                return LandscapeADActivity.class;
            case 7:
            case 8:
                return PortraitADActivity.class;
            case 9:
            case 10:
                return RewardvideoLandscapeADActivity.class;
            case 11:
            case 12:
                return RewardvideoPortraitADActivity.class;
            case 13:
                return UnifiedInterstitialAD.class;
            case 14:
                return UnifiedInterstitialADListener.class;
            case 15:
                return RewardVideoAD.class;
            case 16:
                return RewardVideoADListener.class;
            case 17:
                return LoadAdParams.class;
            case 18:
                return UnifiedBannerView.class;
            case 19:
                return UnifiedBannerADListener.class;
            case 20:
                return ADEvent.class;
            case 21:
                return APPStatus.class;
            case 22:
                return RewardVideoAD.ADListenerAdapter.class;
            case 23:
                return ACTD.class;
            case 24:
                return LiteAbstractAD.class;
            case 25:
                return ADListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1436((ViewConfiguration.getTapTimeout() >> 16) + 275, TextUtils.lastIndexOf("", '0') + 15, (char) (17648 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cc.m1426();
            }
        });
        Object obj = null;
        map.put(m1437(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u0085\u009f\u0098\u0098\u0084\u0089\u0091\u0095").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cc.m1428((APPStatus) list.get(0));
            }
        });
        map.put(m1437(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u008d\u009e\u0097\u009f\u0092\u009a\u0089£¢\u0089\u0091\u0095").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cc.m1438((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m1436(View.MeasureSpec.makeMeasureSpec(0, 0) + 289, TextUtils.lastIndexOf("", '0') + 16, (char) TextUtils.getTrimmedLength("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Integer.valueOf(cc.m1429((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m1436((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 304, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cc.m1433((RewardVideoAD) list.get(0));
            }
        });
        map.put(m1436(319 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 55729)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cc.m1435((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i2 = f1250 + 65;
        f1252 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static IGDTAdManager m1427() {
        IGDTAdManager gDTAdManger;
        int i = 2 % 2;
        int i2 = f1252 + 119;
        f1250 = i2 % 128;
        if (i2 % 2 != 0) {
            gDTAdManger = GDTAdSdk.getGDTAdManger();
            int i3 = 17 / 0;
        } else {
            gDTAdManger = GDTAdSdk.getGDTAdManger();
        }
        int i4 = f1252 + 99;
        f1250 = i4 % 128;
        if (i4 % 2 == 0) {
            return gDTAdManger;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1431(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f1250 + 99;
        f1252 = i2 % 128;
        if (i2 % 2 != 0) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Object> m1432(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f1250 + 89;
        f1252 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        int i4 = f1250 + 37;
        f1252 = i4 % 128;
        if (i4 % 2 != 0) {
            return extraInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m1434(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1250 + 97;
        f1252 = i2 % 128;
        int i3 = i2 % 2;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = f1252 + 25;
        f1250 = i5 % 128;
        int i6 = i5 % 2;
        return rewardAdType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, String> m1439(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1250 + 41;
        f1252 = i2 % 128;
        if (i2 % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map m1430(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f1250 + 11;
        f1252 = i2 % 128;
        int i3 = i2 % 2;
        Map ext = unifiedInterstitialAD.getExt();
        int i4 = f1250 + 19;
        f1252 = i4 % 128;
        if (i4 % 2 != 0) {
            return ext;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1437(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1254;
            int i2 = f1257;
            if (f1255) {
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
            if (f1253) {
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1436(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1256[b.f638 + i]) ^ (((long) b.f638) * f1251)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
