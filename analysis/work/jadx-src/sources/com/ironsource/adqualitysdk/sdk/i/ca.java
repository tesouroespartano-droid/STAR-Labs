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
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ca extends bg {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1235 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1236 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1238 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1239 = 175;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1242 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1240 = {261, 244, 257, 258, 248, 254, 253, 269, 267, 275, 266, 221, 268, 218, 211, 252, 296, 259, 272, 289, 278, 276, 291, 242, 286, 285, 277, 280, 290, 240, 274, 293, 284, 243, 292, 241, 283, 294, 255, 297, 251};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1241 = 1330951727572826769L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1237 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1234 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m1417(Reward reward) {
        int i = 2 % 2;
        int i2 = f1236 + 47;
        f1235 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1416(reward);
        }
        m1416(reward);
        throw null;
    }

    public ca(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1236 + 9;
        f1235 = i2 % 128;
        try {
            try {
                return (String) (i2 % 2 != 0 ? MyTargetVersion.class.getDeclaredField(m1419(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) * 1053, null, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()) : MyTargetVersion.class.getDeclaredField(m1419(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())).get(null);
            } catch (Exception unused) {
                return hu.m2296().m2297().m2344(MyTargetVersion.class, m1419(null, 127 - TextUtils.indexOf("", ""), null, "\u008f\u008a\u0089\u008e\u008d\u008c\u008a\u0089\u008b\u008a\u0089\u0088").intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b = 2;
        int i = 2 % 2;
        byte b2 = 4;
        switch (str.hashCode()) {
            case -2103294848:
                b = !str.equals(m1419(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0093\u0097\u0093¢\u0099\u009c\u008a£\u009e").intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1850459313:
                b = !str.equals(m1418("ᅭ룬ⱷ艤댅ɺ", Process.getGidForName("") + 1, "쥌혈\ue36d짩", "몑末綋ቸ", (char) (KeyEvent.keyCodeFromString("") + 59875)).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case -1766129765:
                if (!str.equals(m1419(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u009a\u0099\u009c\u009d\u0094\u0096\u0081\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090").intern())) {
                    b = -1;
                } else {
                    int i2 = f1236 + 3;
                    f1235 = i2 % 128;
                    int i3 = i2 % 2;
                }
                break;
            case -1282477456:
                b = !str.equals(m1418("\u009e祫\uf35e䟶息ᮀ츶塧＾捲㺲\u0df9\ud8be뜒㋕", Color.red(0) + 788651212, "첲ǜ儯㼴", "몑末綋ቸ", (char) (ExpandableListView.getPackedPositionGroup(0L) + 13393)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -958537051:
                b = !str.equals(m1418("崑뚑疢⮁郃暖\udf06ي讏", 684414577 - View.combineMeasuredStates(0, 0), "煠쭖ℨ뮩", "몑末綋ቸ", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -609786639:
                if (str.equals(m1419(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008a\u009e\u008a\u0096\u008a\u0094\u0093¦\u0096\u0083").intern())) {
                    int i4 = f1236 + 43;
                    f1235 = i4 % 128;
                    b = i4 % 2 == 0 ? Ascii.SO : (byte) 72;
                } else {
                    b = -1;
                }
                break;
            case -498709917:
                b = !str.equals(m1418("뵲ゔ㋎⨧꾟閊绔ꚅꝍ⇢꾉Ἅꩄ\udd11趺泮蛏欴璆䈗\ue23b蠻", View.MeasureSpec.makeMeasureSpec(0, 0), "㢯ᡲ닔褬", "몑末綋ቸ", (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case -393802555:
                b = !str.equals(m1418("雇紣彏ㅖ䉛靪\ud9e4\ue011䦠\uee74㥂ꗥ\uecbc㳔ᳺ㒇☀떪", ViewConfiguration.getDoubleTapTimeout() >> 16, "\u10caᳶ㧼쌧", "몑末綋ቸ", (char) (Color.alpha(0) + 10041)).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case 65555862:
                b = !str.equals(m1419(null, 126 - MotionEvent.axisFromString(""), null, "\u0094\u0096\u009a\u0096\u0097\u009d\u009c©¦\u0096\u009c\u0081\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090").intern()) ? (byte) -1 : (byte) 19;
                break;
            case 320151695:
                if (!str.equals(m1418("탚暝饙⮡ⱸ\uf6e9椟젹꺺\uf4c8콿䎌ꀣ琘", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "䬷↨枚봓", "몑末綋ቸ", (char) (View.resolveSizeAndState(0, 0, 0) + 4967)).intern())) {
                    b = -1;
                } else {
                    int i5 = f1235 + 25;
                    f1236 = i5 % 128;
                    b = i5 % 2 != 0 ? Ascii.VT : (byte) 76;
                }
                break;
            case 421929408:
                if (!str.equals(m1419(null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, "\u008a\u009e¥\u0093\u009c\u0097\u009c\u0097\u009d\u0094\u0096\u0097\u009a\u0085\u0096\u009d\u0093¤").intern())) {
                    b = -1;
                } else {
                    int i6 = f1235 + 81;
                    f1236 = i6 % 128;
                    b = i6 % 2 != 0 ? (byte) 10 : (byte) 45;
                }
                break;
            case 448638071:
                if (!str.equals(m1419(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u009d¡\u0093\u0094\u0093§¡\u0099\u0097\u009d£\u0098").intern())) {
                    b = -1;
                } else {
                    int i7 = f1236 + 97;
                    f1235 = i7 % 128;
                    b = i7 % 2 == 0 ? (byte) 16 : Ascii.CAN;
                }
                break;
            case 487251537:
                if (!str.equals(m1418("䣸히ꁊ혎\uf5c2櫱鿧蕳욫䕧↡씫॔โ", Process.myTid() >> 22, "嘗翴\uf502嚣", "몑末綋ቸ", (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41972)).intern())) {
                    b = -1;
                } else {
                    int i8 = f1236;
                    int i9 = i8 + 91;
                    f1235 = i9 % 128;
                    b2 = i9 % 2 == 0 ? (byte) 5 : (byte) 4;
                    int i10 = i8 + 79;
                    f1235 = i10 % 128;
                    int i11 = i10 % 2;
                    b = b2;
                }
                break;
            case 544598087:
                if (!str.equals(m1418("컹줗ഗퟦ쵎錳⾬谵⑆力셔⃨鴙\uddeeᵵ㢉桎闇쎆⳰▏嚸⥸칸⾖緧\u750a1о꧀ꌪ烅㦂\ue518仔ᩓ\uefef", MotionEvent.axisFromString("") - 121935401, "홞뭩싸懛", "몑末綋ቸ", (char) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i12 = f1236 + 25;
                    f1235 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b = b2;
                    } else {
                        b = 3;
                    }
                }
                break;
            case 1125320581:
                b = !str.equals(m1419(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0093\u0097\u0093¢\u0096\u0095\u0093¡\u0085").intern()) ? (byte) -1 : (byte) 8;
                break;
            case 1146816194:
                b = !str.equals(m1418("嗲꒭뗒諫緉뚅אָ㸧锂鵱\ue06e\uded9", ViewConfiguration.getLongPressTimeout() >> 16, "ថ\udfb4䌪뿇", "몑末綋ቸ", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1413638316:
                if (!str.equals(m1419(null, (ViewConfiguration.getTouchSlop() >> 8) + WorkQueueKt.MASK, null, "\u0091\u0097\u009c \u009c\u0097\u009f\u009e\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090").intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1955824356:
                if (str.equals(m1419(null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), null, "\u0096¨\u009c\u0084\u008a\u009e").intern())) {
                    int i13 = f1235 + 53;
                    f1236 = i13 % 128;
                    int i14 = i13 % 2;
                    b = Ascii.DC2;
                } else {
                    b = -1;
                }
                break;
            case 1982630644:
                if (!str.equals(m1418("蝈糵\u0099瀨쬄㔡", Color.argb(0, 0, 0, 0), "妠棪砓ẽ", "몑末綋ቸ", (char) (48503 - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                    b = -1;
                } else {
                    int i15 = f1235 + 27;
                    f1236 = i15 % 128;
                    int i16 = i15 % 2;
                    b = 6;
                }
                break;
            case 2040577055:
                b = !str.equals(m1419(null, (ViewConfiguration.getScrollBarSize() >> 8) + WorkQueueKt.MASK, null, "\u0095\u009c\u009b\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090").intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case 8:
                return ImageData.class;
            case 9:
                return AudioData.class;
            case 10:
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case 12:
                return InterstitialAd.InterstitialAdListener.class;
            case 13:
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1418("錘〻詬\uf7a7ݬ袁\uf497헑嵛ཨ∁\ue033Ⲙ", (-2066598816) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "彳툴⦄怰", "몑末綋ቸ", (char) (12329 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return ca.m1417((Reward) list.get(0));
            }
        });
        int i2 = f1235 + 23;
        f1236 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1416(Reward reward) {
        int i = 2 % 2;
        int i2 = f1235 + 19;
        f1236 = i2 % 128;
        int i3 = i2 % 2;
        String str = reward.type;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1419(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1240;
            int i2 = f1239;
            if (f1238) {
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
            if (f1242) {
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
    private static String m1418(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f1241) ^ ((long) f1237)) ^ ((long) f1234));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
