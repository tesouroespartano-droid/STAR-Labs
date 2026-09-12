package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class by extends bg {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1164 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1169 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1170 = 487722920;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f1171 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1173 = 72;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1174 = 1870021252;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f1172 = {-28, 40, 50, 58, 48, 56, Ascii.FS, Ascii.VT, 88, 50, 69, 56, 50, 56, 44, 44, 48, 60, 39, 8, 34, 107, 50, 69, 56, 50, 56, 44, 44, 48, 60, 39, 40, 2, 116, Utf8.REPLACEMENT_BYTE, 39, 79, 47, 58, 43, -21, 126, 39, -25, 62, 60, -108, 54, -114, 50, 101, 110, 60, -117, -114, 60, -114, 66, 66, 54, -110, 65, 94, 44, 126, -113, 0, -123, 60, -117, -114, 60, -114, 66, 66, 54, -110, 65, 62, 76, 122, -119, 65, -103, 57, -108, 69, 5, -56, 65, -67, 121, -1, 114, 100, -45, 68, 74, 85, 94, 76, 65, 54, 125, 65, 84, 95, 65, 95, 75, 75, 71, 91, 78, 47, 112, 86, 78, 102, 70, 89, 42, -47, -3, -13, -82, -89, -11, -6, Ascii.SI, -55, -5, -12, -86, 2, -99, -8, -88, -7, -44, -101, -81, -9, -97, -1, -94, -45, -62, 52, -5, 81, 7, -6, Ascii.ESC, Ascii.DC2, Ascii.SUB, Ascii.EM, -71};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f1165 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1166 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1168 = 261;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1167 = {334, 371, 377, 362, 375, 376, 366, 358, 369, 326, 360, 379, 382, 346, 341, 364, 344, 361, 368, 340, 373, 347, 372, 328, 363, 359, 306, 307, 370, 365, 378, 329, 338};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Presage m1327() {
        int i = 2 % 2;
        int i2 = f1169 + 13;
        f1164 = i2 % 128;
        if (i2 % 2 == 0) {
            m1326();
            throw null;
        }
        Presage presageM1326 = m1326();
        int i3 = f1169 + InterfaceC0280i1.d.b.d;
        f1164 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return presageM1326;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m1331(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f1169 + 3;
        f1164 = i2 % 128;
        int i3 = i2 % 2;
        m1333(presageInterstitial, presageInterstitialCallback);
        int i4 = f1169 + 1;
        f1164 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1332(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f1169 + 81;
        f1164 = i2 % 128;
        int i3 = i2 % 2;
        m1330(presageOptinVideo, presageOptinVideoCallback);
        int i4 = f1169 + 43;
        f1164 = i4 % 128;
        int i5 = i4 % 2;
    }

    public by(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0286  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f1169 + 35;
        f1164 = i2 % 128;
        int i3 = i2 % 2;
        byte b = 4;
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(m1328((int[]) null, TextUtils.getCapsMode("", 0, 0) + WorkQueueKt.MASK, (String) null, "\u0090\u0087\u0099\u0082\u0097\u0098\u0092\u008a").intern())) {
                    b = Ascii.FF;
                } else {
                    b = -1;
                }
                break;
            case -1907784110:
                if (!str.equals(m1328((int[]) null, 127 - View.MeasureSpec.getMode(0), (String) null, "\u0097\u0084\u0092\u0087\u0096\u0082\u0087\u0083\u0095\u0094\u0084\u0090\u0088\u0086\u0084\u0085\u008f").intern())) {
                    b = -1;
                } else {
                    int i4 = f1169 + 77;
                    f1164 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 9;
                }
                break;
            case -1704786309:
                if (!str.equals(m1328((int[]) null, (-16777089) - Color.rgb(0, 0, 0), (String) null, "\u008d\u0083\u0087\u008c\u0087\u0083\u008b\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -938422005:
                if (!str.equals(m1328((int[]) null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), (String) null, "\u0093\u0092\u0091\u0084\u0090\u0088\u0086\u0084\u0085\u008f").intern())) {
                    b = -1;
                } else {
                    int i6 = f1164 + 71;
                    f1169 = i6 % 128;
                    b = i6 % 2 == 0 ? (byte) 6 : (byte) 113;
                }
                break;
            case -610604286:
                if (!str.equals(m1329((-487722772) - KeyEvent.normalizeMetaState(0), (byte) ((-105) - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getPressedStateDuration() >> 16) - 73, TextUtils.getTrimmedLength("") - 1870021170, (short) (155 - AndroidCharacter.getMirror('0'))).intern())) {
                    b = -1;
                } else {
                    b = Ascii.VT;
                }
                break;
            case -126768170:
                if (!str.equals(m1329(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 487722919, (byte) (TextUtils.indexOf("", "") + 119), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 72, (-1870021147) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 76142724:
                if (!str.equals(m1329((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 487722830, (byte) (62 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-73) - Drawable.resolveOpacity(0, 0), MotionEvent.axisFromString("") - 1870021172, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 62)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1164 + 5;
                    f1169 = i7 % 128;
                    int i8 = i7 % 2;
                }
                break;
            case 698887547:
                if (!str.equals(m1328((int[]) null, (ViewConfiguration.getFadingEdgeLength() >> 16) + WorkQueueKt.MASK, (String) null, "\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u0084\u0090\u0088\u0086\u0084\u0085\u008f").intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1067648736:
                if (!str.equals(m1329((-487722824) - Color.alpha(0), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 5), (-74) - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1870021172, (short) ((-82) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1346371759:
                if (!str.equals(m1328((int[]) null, 127 - (ViewConfiguration.getTouchSlop() >> 8), (String) null, "\u0084\u0090\u0088\u0086\u0084\u0085\u008f").intern())) {
                    b = -1;
                } else {
                    int i9 = f1169;
                    int i10 = i9 + InterfaceC0280i1.d.b.d;
                    f1164 = i10 % 128;
                    b = i10 % 2 == 0 ? (byte) 2 : (byte) 5;
                    int i11 = i9 + 59;
                    f1164 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 3 / 3;
                    }
                }
                break;
            case 1871097647:
                if (!str.equals(m1328((int[]) null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), (String) null, "\u008d\u0083\u0087\u008c\u0087\u0083\u008b\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u0087\u008e").intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 2109755994:
                if (!str.equals(m1329((-487722877) - ExpandableListView.getPackedPositionChild(0L), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 35), TextUtils.lastIndexOf("", '0') - 72, KeyEvent.normalizeMetaState(0) - 1870021147, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 101)).intern())) {
                    b = -1;
                } else {
                    int i13 = f1164 + InterfaceC0280i1.d.b.i;
                    f1169 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b = 2;
                    }
                }
                break;
            case 2128976055:
                if (!str.equals(m1329((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 487722797, (byte) ((-93) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), TextUtils.lastIndexOf("", '0') - 72, TextUtils.lastIndexOf("", '0', 0) - 1870021171, (short) ((-82) - TextUtils.indexOf("", "", 0, 0))).intern())) {
                    b = -1;
                } else {
                    int i14 = f1169 + 119;
                    f1164 = i14 % 128;
                    int i15 = i14 % 2;
                    b = 10;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                return PresageSdk.class;
            case 7:
                int i16 = f1169 + 105;
                f1164 = i16 % 128;
                int i17 = i16 % 2;
                return PresageInterstitial.class;
            case 8:
                return PresageInterstitialCallback.class;
            case 9:
                return PresageOptinVideo.class;
            case 10:
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case 12:
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1328((int[]) null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (String) null, "\u0084\u008b\u0082\u0088\u0083\u0086\u0082\u0081\u0084\u0090\u0088\u0086\u0084\u0085\u008f\u0083\u0084\u0090").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.by.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return by.m1327();
            }
        });
        map.put(m1328((int[]) null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), (String) null, "\u0093\u008b\u0088\u009a\u0089\u0089\u0088\u0098\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u0083\u0084\u0086").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.by.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                by.m1331((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m1328((int[]) null, TextUtils.getCapsMode("", 0, 0) + WorkQueueKt.MASK, (String) null, "\u0093\u008b\u0088\u009a\u0089\u0089\u0088\u0098\u0097\u0084\u0092\u0087\u0096\u0082\u0087\u0083\u0095\u0094\u0083\u0084\u0086").intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                by.m1332((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i2 = f1164 + 77;
        f1169 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1164 + 117;
        f1169 = i2 % 128;
        int i3 = i2 % 2;
        String strMo820 = mo820();
        if (strMo820 == null) {
            return null;
        }
        String str = strMo820.split(m1328((int[]) null, KeyEvent.normalizeMetaState(0) + WorkQueueKt.MASK, (String) null, "\u009b").intern())[0];
        int i4 = f1169 + 65;
        f1164 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo820() {
        int i = 2 % 2;
        int i2 = f1169 + 85;
        f1164 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) Class.forName(m1328((int[]) null, 127 - TextUtils.getTrimmedLength(""), (String) null, "\u0085\u0094\u0092\u0083\u0082\u0097¡\u0086\u009a\u009f\u0097 \u0083\u009f\u0088\u009e\u009f\u0092\u0082\u0087\u0085\u0084\u009e\u008b\u0088\u0096\u009c\u0099\u0087\u009c\u0082\u0097\u009d\u009d\u0097\u008b\u009c\u0084\u0090\u0088\u0086\u0084\u0085\u0095\u009c\u0097\u0087").intern()).getMethod(m1329((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 487722763, (byte) ((-63) - Drawable.resolveOpacity(0, 0)), (-74) - TextUtils.indexOf((CharSequence) "", '0', 0), (-1870021155) - KeyEvent.keyCodeFromString(""), (short) ((ViewConfiguration.getTapTimeout() >> 16) + 79)).intern(), new Class[0]).invoke(null, new Object[0]);
                int i4 = f1164 + 5;
                f1169 = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Presage m1326() {
        int i = 2 % 2;
        int i2 = f1164 + 125;
        f1169 = i2 % 128;
        int i3 = i2 % 2;
        Presage presage = Presage.getInstance();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return presage;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1333(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f1169 + 115;
        f1164 = i2 % 128;
        int i3 = i2 % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1330(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f1164 + 91;
        f1169 = i2 % 128;
        int i3 = i2 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        int i4 = f1169 + 3;
        f1164 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1329(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1173;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1172;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1170 + i] + i4);
                } else {
                    i5 = (short) (f1171[f1170 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1170 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1174);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1172;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1171;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1328(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1167;
            int i2 = f1168;
            if (f1166) {
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
            if (f1165) {
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
}
