package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class br extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f997 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f998 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f999 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1000 = 5238142633976621850L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1001 = {Typography.amp, 'Y', 'd', 'f', 'e', 'j', 'n', 'l', 'n', ']', 'W', 'g', 'g', 'd', 'f', 'k', '~', Typography.cent, 173, Typography.paragraph, 145, 161, '6', 'r', 'w', 'p', 'o', 'u', 'r', '_', 'Y', 'n', 'n', 'V', ']', 'r', 'S', 149, 150, 172, Typography.section, 166, 173, Typography.registered, Typography.copyright, Typography.copyright, Typography.copyright, Typography.nbsp, 'A', 147, Typography.pound, Typography.copyright, 179, 173, 172, 155, 154, 175, 171, 168, Typography.copyright, 175, 180, 170, 171, 175, 173, 175, 143, 287, 292, 292, 264, 235, 261, 288, 287, 292, 292, 264, 263, 264, 265, 288, 287, 292, 292, 264, 263, 264, 265, '3', 'f', 'l', 'Z', 'R', '\\', 'f', 't', 'j', 'Z', '^', 'f', 'b', 'd', 'i', 'i', 'i', 'q', 'd', 'f', 't', 'j', '2', 'j', 't', 'f', 'd', 'q', 'i', 'i', 'i', 'd', 'b', 'f', '^', 'X', 'j', 'j', 'R', 'Y', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', '^', 'l', 'f', 'X', 173, 161, Typography.pound, Typography.degree, Typography.plusMinus, 179, Typography.plusMinus, 170, 175, 175, 161, 159, Typography.degree, Typography.degree, 152, 159, 180, 178, 180, 185, 178, Typography.plusMinus, Typography.middleDot, 180, 161, 164, 178, 172, '3', 'f', 'l', '^', '[', 'n', 'q', 'k', 'l', 's', 'n', 'l', 'n', 'Y', 'R', 'j', 'j', 'Y', '[', 'i', 'i', 'd', 'k', 'm', 'k', 'j', ']', '[', 'g', '`', ']', 'k', 'r', 'n', 'l', 'n', '2', 'd', 'j', 's', 'r', 'a', '[', 'i', 'g', 'g', 'i', 'T', 'R', 'j', 'j', 'R', 'Y', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', '^', 'l', 'f', '7', 'k', 'e', 'g', 'n', 'Y', '[', 'k', 'l', 'n', 'n', 's', 'k', 'm', 'm', 'R', 'Q', 'j', 'j', 'R', 'Y', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', '^', 'l', 'f', '~', 252, 258, 244, 241, 260, 263, 257, 258, 265, 260, 258, 260, 239, 232, 256, 256, 232, 232, 253, 260, 254, 251, 254, 256, 241, 236, '}', 242, 236, 236, 241, 246, 247, 233, 'z', 248, 225, 217, 227, 237, 251, 241, 237, 237, 243, 233, 229, 237, 233, 235, 240, 240, 145, 295, 293, 277, 287, 303, 295, 295, 295, 290, 288, 292, 284, 288, 298, 292, '3', 'f', 'l', 'b', '^', 'f', 'b', 'd', 'i', 'i', 'i', 'q', 's', ']', 'T', 'g', 'i', 'h', 'h', 'k', 'z', 243, 249, 231, 223, 233, 243, 257, 247, 226, 230, 254, 254, 137, 290, 297, 296, 306, 299, 291, 289, 297, 306, 299, 298, 306, '\'', 'G', 'A', 'J', 'K', 'I', Typography.amp, 'F', 'E', 'N', 'N', 'N', 'S', 'R', 'K', 'L', 'Q', 'K', ':', 'n', 'q', 'o', 'l', 'n', 'g', 'g'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1002;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ MediationManager m1079() {
        int i = 2 % 2;
        int i2 = f997 + 45;
        f998 = i2 % 128;
        if (i2 % 2 != 0) {
            m1077();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        MediationManager mediationManagerM1077 = m1077();
        int i3 = f997 + 117;
        f998 = i3 % 128;
        int i4 = i3 % 2;
        return mediationManagerM1077;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m1080(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 29;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String strM1069 = m1069(impressionData);
        int i4 = f997 + 123;
        f998 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1069;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m1082(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 69;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String strM1070 = m1070(impressionData);
        int i4 = f997 + 85;
        f998 = i4 % 128;
        int i5 = i4 % 2;
        return strM1070;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m1083() {
        int i = 2 % 2;
        int i2 = f997 + 123;
        f998 = i2 % 128;
        if (i2 % 2 != 0) {
            m1075();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM1075 = m1075();
        int i3 = f998 + 3;
        f997 = i3 % 128;
        int i4 = i3 % 2;
        return zM1075;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ double m1085(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 87;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        double dM1076 = m1076(impressionData);
        int i4 = f997 + 19;
        f998 = i4 % 128;
        if (i4 % 2 == 0) {
            return dM1076;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ String m1086(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 29;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String strM1071 = m1071(impressionData);
        int i4 = f998 + 51;
        f997 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return strM1071;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m1087(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f997 + 53;
        f998 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1095(adType);
        }
        m1095(adType);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m1089(String str) {
        int i = 2 % 2;
        int i2 = f997 + 99;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType adTypeM1081 = m1081(str);
        int i4 = f998 + 51;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return adTypeM1081;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1090(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f997 + 115;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String strM1111 = m1111(adsConfig);
        int i4 = f997 + 81;
        f998 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1111;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1091(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 71;
        f998 = i2 % 128;
        if (i2 % 2 != 0) {
            m1072(impressionData);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM1072 = m1072(impressionData);
        int i3 = f998 + 39;
        f997 = i3 % 128;
        int i4 = i3 % 2;
        return strM1072;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m1092(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f998 + 37;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        List<AdapterConfiguration> listM1099 = m1099(mediationConfig);
        int i4 = f998 + InterfaceC0280i1.d.b.d;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return listM1099;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1097(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 27;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String strM1074 = m1074(impressionData);
        int i4 = f997 + 43;
        f998 = i4 % 128;
        int i5 = i4 % 2;
        return strM1074;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m1100(Placement placement) {
        int i = 2 % 2;
        int i2 = f997 + 1;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType adTypeM1088 = m1088(placement);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = f998 + 63;
        f997 = i5 % 128;
        if (i5 % 2 != 0) {
            return adTypeM1088;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1101(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f998 + 7;
        f997 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1104(adsConfig);
        }
        m1104(adsConfig);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1102(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 75;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String strM1073 = m1073(impressionData);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return strM1073;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ PlacementsHandler m1103(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f998 + 93;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler placementsHandlerM1096 = m1096(mediationManager);
        int i4 = f997 + 39;
        f998 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementsHandlerM1096;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1105(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 15;
        f997 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1078(impressionData);
        }
        m1078(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1106(Placement placement) {
        int i = 2 % 2;
        int i2 = f997 + 87;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String strM1112 = m1112(placement);
        int i4 = f998 + 117;
        f997 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1112;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1108(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f998 + 69;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        m1093(interstitialListener);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = f998 + 11;
        f997 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1109(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f997 + 79;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        m1094(rewardedListener);
        int i4 = f998 + 21;
        f997 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m1110(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 55;
        f997 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1084(impressionData);
        }
        m1084(impressionData);
        throw null;
    }

    public br(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02c7  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Class mo788(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = Ascii.DLE;
        switch (iHashCode) {
            case -2041833493:
                if (!str.equals(m1107("㟴꽹봴\uf48b튢嚪鳔ᚢ끣ọ괟", (-1256743304) - (ViewConfiguration.getKeyRepeatDelay() >> 16), "磧ឞ䊵ꩴ", "欚ԁ黹䢱", (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b = -1;
                } else {
                    int i2 = f997 + 31;
                    f998 = i2 % 128;
                    int i3 = i2 % 2;
                }
                break;
            case -1598046662:
                if (!str.equals(m1107("ꋋᐺᔿ։蹾ᆓꅮᴑ萗뛊㎏\uf060衿⡨ᥞ", (-304748156) - (ViewConfiguration.getTouchSlop() >> 8), "葲헩ǭ렿", "欚ԁ黹䢱", (char) (16129 - Drawable.resolveOpacity(0, 0))).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1115843213:
                if (!str.equals(m1098(new int[]{22, 14, 4, 8}, true, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    int i4 = f997 + 81;
                    f998 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 9;
                }
                break;
            case -847426041:
                if (!str.equals(m1098(new int[]{48, 20, 65, 0}, false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b = -1;
                } else {
                    int i6 = f997 + 95;
                    f998 = i6 % 128;
                    b = i6 % 2 == 0 ? (byte) 17 : (byte) 104;
                }
                break;
            case -498060603:
                b = !str.equals(m1107("鑍\udfc6ꄛ\ue50e\ue4fd㛬╨츾웻", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1094889350, "篎뵐ﾾ鿗", "欚ԁ黹䢱", (char) Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -368841467:
                b = !str.equals(m1107("谅\ue856띜\uf812厨॑ꤋ鬴", ViewConfiguration.getScrollBarFadeDuration() >> 16, "\udf81鿬ⱚ\udf33", "欚ԁ黹䢱", (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -174936018:
                b = str.equals(m1107("㪳슃췵鴩៹餗\ud8ad홴", Color.argb(0, 0, 0, 0), "뮼ꄕ똟龔", "欚ԁ黹䢱", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) 12 : (byte) -1;
                break;
            case 99044255:
                if (!str.equals(m1107("닔㨄᭾沪ﻩ⣯两›骘變兩∌毸", (ViewConfiguration.getPressedStateDuration() >> 16) - 1539822971, "薤㠪ꪤ孛", "欚ԁ黹䢱", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23465)).intern())) {
                    b = -1;
                } else {
                    int i7 = f997 + 123;
                    f998 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 3 / 4;
                    }
                    b = Ascii.VT;
                }
                break;
            case 438795617:
                b = !str.equals(m1107("䢫忞疳\uf270隷\uf15e鑽鼿ᆟ鳶怒埕睯滋", View.MeasureSpec.getSize(0), "佛ᷱ紾\ufde2", "欚ԁ黹䢱", (char) (57981 - TextUtils.getOffsetAfter("", 0))).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case 578208537:
                b = !str.equals(m1107("ᶹ䐭ۢ\uedfb⭬\ue0cf便", View.MeasureSpec.getMode(0) + 235399150, "\uee38ߧ켎洮", "欚ԁ黹䢱", (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 769047372:
                if (!str.equals(m1098(new int[]{36, 12, 59, 1}, false, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i9 = f997 + 43;
                    f998 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 10;
                }
                break;
            case 806552769:
                b = !str.equals(m1107("蝷ꋙ᠓\ud8f3푆仈숐갸禧\uf212拊", (-960242236) - Color.argb(0, 0, 0, 0), "쓛쏝篆刺", "欚ԁ黹䢱", (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case 1062384924:
                if (!str.equals(m1107("責寙藦㻉夙뭋\uedca팩豪\ue666⪄ﲶ\ufefd팙ݝ\uddbc䣓", Color.red(0) - 1554395298, "废姏㢣Ლ", "欚ԁ黹䢱", (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 39480)).intern())) {
                    b = -1;
                } else {
                    int i11 = f998 + 123;
                    f997 = i11 % 128;
                    if (i11 % 2 != 0) {
                        b = 5;
                    } else {
                        b = 4;
                    }
                }
                break;
            case 1212533506:
                if (!str.equals(m1107("ଛ䒣㾝炄嚉꣠䕯\ud827冑嶰墸列⦵\uf310ᔙ䒪", ViewConfiguration.getMinimumFlingVelocity() >> 16, "ں硬﹋\uf207", "欚ԁ黹䢱", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 2047)).intern())) {
                    b = -1;
                } else {
                    int i12 = f998 + 79;
                    f997 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 8;
                }
                break;
            case 1297340448:
                b = !str.equals(m1107("\uee92쾺䖦桑ᯩ屸\udf8f봠낯헶䄳㜧署⮱渊孌쏹ᐜ뫈ߎ", KeyEvent.getDeadChar(0, 0), "Ⓐ쁽鴩명", "欚ԁ黹䢱", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1775008410:
                b = !str.equals(m1107("⹗剜䰆\ud968䒩毀읮㷘픒뻃噜", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1712747981, "췤ᙵ給↶", "欚ԁ黹䢱", (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case 1884304309:
                b = !str.equals(m1098(new int[]{0, 16, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1955869213:
                b = !str.equals(m1098(new int[]{16, 6, 61, 1}, true, (String) null).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1969669106:
                b = !str.equals(m1107("噡닠ᨀ\uf4b9͖\udbd9\ue9caﺶ쵆", 367895350 - ExpandableListView.getPackedPositionGroup(0L), "㙧\ueda3洛駝", "欚ԁ黹䢱", (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case 8:
                return RewardedListener.class;
            case 9:
                return ImpressionData.class;
            case 10:
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case 12:
                return Rewarded.class;
            case 13:
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f998 + 125;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) FairBid.class.getDeclaredField(m1107("ﭺ澳쿻衻쪨ᮡ窄濉\uf313뒈㋼", View.MeasureSpec.getSize(0) - 2071288547, "ᵾ誥⮄ꠟ", "欚ԁ黹䢱", (char) TextUtils.getTrimmedLength("")).intern()).get(null);
                int i4 = f997 + 107;
                f998 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2296().m2297().m2344(FairBid.class, m1098(new int[]{68, 23, 196, 6}, false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001").intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1107("벨⩐㵁烍鹢⫧ꅍ⻀뗊㑈乿㍣厂⻊챳︸奎㬛굑甮푪⾍ꦞ\u05ff홠욥ꢶ", (-1901123049) - ExpandableListView.getPackedPositionChild(0L), "ᢴ꼪ᾎ㿸", "欚ԁ黹䢱", (char) (63519 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1079();
            }
        });
        map.put(m1098(new int[]{91, 22, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1087((Constants.AdType) list.get(0));
            }
        });
        map.put(m1098(new int[]{113, 30, 0, 0}, true, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1110((ImpressionData) list.get(0));
            }
        });
        map.put(m1098(new int[]{143, 29, 70, 0}, true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1097((ImpressionData) list.get(0));
            }
        });
        map.put(m1098(new int[]{172, 36, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1105((ImpressionData) list.get(0));
            }
        });
        map.put(m1098(new int[]{208, 29, 0, 0}, true, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1102((ImpressionData) list.get(0));
            }
        });
        map.put(m1107("䏅鍻馊㧌\ue944癥楬Ꜳ憺뙐昄ɇ琺膿籉鉳⊮\uf83dꊌ⾾ኛﰉ酙뤎닦㞆", Color.alpha(0), "깫撞\ueeae\ud99d", "欚ԁ黹䢱", (char) (40430 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1091((ImpressionData) list.get(0));
            }
        });
        map.put(m1107("僕縐\udf2c\ued77㒇⦈燋꙼㽑\ue232陔꼒㱒\udd8eꇹ켖揈桬\ue68f崒\ud98d勞Ᏽ幊꒷捇", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "歆ṥ\u09db\uec53", "欚ԁ黹䢱", (char) (KeyEvent.normalizeMetaState(0) + 21257)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Double.valueOf(br.m1085((ImpressionData) list.get(0)));
            }
        });
        map.put(m1107("¢棎ꒀ뎉酈橇磮\uef10\u699eb蹶烃鲢ײַ鐜\ued2b쉓\uf246뫻ꅚ䰖┰\udd50≪囐ゔ挖", 459884148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "痏楆戛뷥", "欚ԁ黹䢱", (char) (ImageFormat.getBitsPerPixel(0) + 58723)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1082((ImpressionData) list.get(0));
            }
        });
        map.put(m1098(new int[]{237, 33, 0, 0}, true, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1080((ImpressionData) list.get(0));
            }
        });
        map.put(m1098(new int[]{270, 27, 150, 0}, false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1086((ImpressionData) list.get(0));
            }
        });
        map.put(m1107("痁布\uf509\u0d45ꂔ蔤め똱", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "뽛꽀䜢ㄏ", "欚ԁ黹䢱", (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1090((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1098(new int[]{297, 8, 134, 3}, true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1101((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1107("ꐤ䚘㏃\ue2b7\ud875ꪄÄ曬⪘\uec41꽭鳿ག寎൨樍穎飓멝ࡺ㒬ﳾ㩉㗓", ExpandableListView.getPackedPositionChild(0L) + 1, "騬䎮⚍衧", "欚ԁ黹䢱", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1092((MediationConfig) list.get(0));
            }
        });
        map.put(m1098(new int[]{305, 18, 135, 8}, false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1100((Placement) list.get(0));
            }
        });
        map.put(m1098(new int[]{323, 16, 190, 16}, true, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1106((Placement) list.get(0));
            }
        });
        map.put(m1098(new int[]{339, 20, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1103((MediationManager) list.get(0));
            }
        });
        map.put(m1098(new int[]{359, 13, 141, 0}, false, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return br.m1089((String) list.get(0));
            }
        });
        map.put(m1107("哿脹ᅿ꣥磰渰\uf661ᶏ㍮쌼\uef9fꉪ쐓ፍử㉼亠犖锽ĝ컛\u0edbᆚ", 38318 - AndroidCharacter.getMirror('0'), "繻ẕ삿\ua879", "欚ԁ黹䢱", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                br.m1108((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1107("䅷벘殜蹡颩赖\uf754넀ڭ그峕贈\ue2ba顑휠鰭⩘냯춊", TextUtils.lastIndexOf("", '0', 0) + 2132018963, "ሏᐇ晿溷", "欚ԁ黹䢱", (char) (46950 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                br.m1109((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1098(new int[]{372, 13, 191, 7}, false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(br.m1083());
            }
        });
        int i2 = f998 + 87;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static MediationManager m1077() {
        int i = 2 % 2;
        int i2 = f997 + 49;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        MediationManager.Companion companion = MediationManager.Companion;
        if (i3 == 0) {
            return companion.getInstance();
        }
        companion.getInstance();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static PlacementType m1084(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 37;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementType = impressionData.getPlacementType();
        int i4 = f998 + 61;
        f997 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1074(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 79;
        f997 = i2 % 128;
        if (i2 % 2 != 0) {
            return impressionData.getRenderingSdk();
        }
        impressionData.getRenderingSdk();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1078(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 23;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String renderingSdkVersion = impressionData.getRenderingSdkVersion();
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return renderingSdkVersion;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1073(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 69;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String demandSource = impressionData.getDemandSource();
        int i4 = f998 + InterfaceC0280i1.d.b.g;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m1072(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f998 + 37;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String variantId = impressionData.getVariantId();
        int i4 = f997 + 11;
        f998 = i4 % 128;
        if (i4 % 2 == 0) {
            return variantId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static double m1076(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + InterfaceC0280i1.d.b.g;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        double netPayout = impressionData.getNetPayout();
        int i4 = f997 + 89;
        f998 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return netPayout;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m1070(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 77;
        f998 = i2 % 128;
        if (i2 % 2 != 0) {
            impressionData.getCreativeId();
            throw null;
        }
        String creativeId = impressionData.getCreativeId();
        int i3 = f997 + 65;
        f998 = i3 % 128;
        int i4 = i3 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static String m1069(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 63;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return advertiserDomain;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m1071(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f997 + 9;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String campaignId = impressionData.getCampaignId();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return campaignId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static PlacementType m1095(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f997 + 37;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementType = adType.getPlacementType();
        int i4 = f998 + 91;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1111(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f998 + 13;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.appId;
        int i4 = f998 + 123;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1104(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f998 + InterfaceC0280i1.d.b.i;
        f997 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.store;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = f997 + 51;
        f998 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1099(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f997 + 63;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = f998 + 117;
        f997 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m1088(Placement placement) {
        int i = 2 % 2;
        int i2 = f997 + 23;
        f998 = i2 % 128;
        if (i2 % 2 == 0) {
            return placement.getAdType();
        }
        placement.getAdType();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1112(Placement placement) {
        int i = 2 % 2;
        int i2 = f997 + 23;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        String name = placement.getName();
        int i4 = f997 + 51;
        f998 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static PlacementsHandler m1096(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f997 + 79;
        f998 = i2 % 128;
        if (i2 % 2 == 0) {
            return mediationManager.getPlacementsHandler();
        }
        mediationManager.getPlacementsHandler();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Constants.AdType m1081(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = f997 + 121;
        f998 = i3 % 128;
        byte b = -1;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
            switch (str.hashCode()) {
                case -1372958932:
                    if (str.equals(m1098(new int[]{391, 12, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                        b = 2;
                    }
                    break;
                case 433141802:
                    if (str.equals(m1107("샴ᩙ伔ስ깊뤐⭃", (ViewConfiguration.getPressedStateDuration() >> 16) - 1940096508, "Ӌ屺䊌ꖭ", "欚ԁ黹䢱", (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                        int i5 = f997 + 119;
                        f998 = i5 % 128;
                        int i6 = i5 % 2;
                        b = 0;
                    }
                    break;
                case 543046670:
                    if (str.equals(m1098(new int[]{InterfaceC0280i1.a.b.c, 8, 35, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001").intern())) {
                        b = 3;
                    }
                    break;
                case 1951953708:
                    if (str.equals(m1098(new int[]{385, 6, 0, 3}, true, "\u0000\u0001\u0001\u0000\u0001\u0001").intern())) {
                        i = f998 + 121;
                        f997 = i % 128;
                        if (i % 2 == 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -1372958932:
                    if (str.equals(m1098(new int[]{391, 12, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                        b = 2;
                    }
                    break;
                case 433141802:
                    if (str.equals(m1107("샴ᩙ伔ስ깊뤐⭃", (ViewConfiguration.getPressedStateDuration() >> 16) - 1940096508, "Ӌ屺䊌ꖭ", "欚ԁ黹䢱", (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                        int i7 = f997 + 119;
                        f998 = i7 % 128;
                        int i8 = i7 % 2;
                        b = 0;
                    }
                    break;
                case 543046670:
                    if (str.equals(m1098(new int[]{InterfaceC0280i1.a.b.c, 8, 35, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001").intern())) {
                        b = 3;
                    }
                    break;
                case 1951953708:
                    if (str.equals(m1098(new int[]{385, 6, 0, 3}, true, "\u0000\u0001\u0001\u0000\u0001\u0001").intern())) {
                        i = f998 + 121;
                        f997 = i % 128;
                        if (i % 2 == 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
            }
        }
        if (b == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b != 1) {
            if (b == 2) {
                return Constants.AdType.INTERSTITIAL;
            }
            if (b != 3) {
                return null;
            }
            return Constants.AdType.REWARDED;
        }
        Constants.AdType adType = Constants.AdType.BANNER;
        int i9 = f997 + 99;
        f998 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 22 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1093(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f997 + 77;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f997 + 65;
        f998 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1094(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f997 + 63;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m1075() {
        int i = 2 % 2;
        int i2 = f997 + 121;
        f998 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAssertStarted = FairBid.assertStarted();
        int i4 = f998 + 105;
        f997 = i4 % 128;
        int i5 = i4 % 2;
        return zAssertStarted;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1107(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1000) ^ ((long) f1002)) ^ ((long) f999));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1098(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1001, i, cArr, 0, i2);
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
