package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class bv extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1099 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1100 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1098 = {'M', 4558, 9015, 13666, 18173, 22543, 27241, 29584, 25114, 20681, 18089, 13569, 11222, 6584, 2171, 65243, 60563, 50018, 45370, 42916, 38481, 33847, 31481, 26967, 24359, 19947, 15445, 45688, 41933, 37218, 34674, 62671, 59920, 55399, 51701, 16153, 11601, 687, 28857, 26183, 22431, 17892, 47905, 43149, 40676, 35896, 64961, 54271, 49453, 14174, 9438, 6678, 2153, 31143, 28420, 23876, 45732, 41205, 38477, 34739, 62974, 60248, 55446, 52984, 15408, 11676, 962, 'H', 4571, 9011, 13665, 18174, 22538, 27241, 31660, 36124, 40806, 45234, 49860, 54359, 58775, 63483, 2359, 6809, 11499, 15927, 'j', 4575, 9072, 13664, 18141, 22530, 27253, 31719, 36107, 40771, 45245, 49835, 54357, 58765, 63478, 2355, 6815, 11510, 15914, 20435, 25060, 29487, 34151, 38613, 43050, 47734, 52149, 56592, 61248, 146, 4838, 9328, 13699, 18427, 22871, 27291, 31989, 36415, 40835, 'M', 4558, 9015, 13666, 18173, 22543, 27241, 31616, 36118, 40788, 45218, 49892, 54362, 58752, 63479, 62321, 58098, 53259, 50782, 46529, 43827, 39253, 35001, 32301, 27752, 17310, 12764, 10086, 5818, 1244, 'M', 4558, 9015, 13666, 18173, 22543, 27241, 31621, 36113, 40788, 45218, 49888, 54362, 58758, 63456, 2312, 6814, 11499, 15915, 20367, 25034, 29498, 34153, 38620, 60532, 64973, 53037, 55623, 43738, 46085, 34418, 38799, 24859, 29523, 23709, 12011, 14400, 2448, 7152, 58664, 63122, 49386};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1101 = -1341438862154591825L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m1216(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f1099 + 47;
        f1100 = i2 % 128;
        int i3 = i2 % 2;
        m1217(maioAdsListenerInterface);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
    }

    public bv(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1099 + 89;
        f1100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MaioAds.getSdkVersion();
            super.hashCode();
            throw null;
        }
        String sdkVersion = MaioAds.getSdkVersion();
        int i3 = f1099 + 35;
        f1100 = i3 % 128;
        if (i3 % 2 != 0) {
            return sdkVersion;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f1099 + 39;
        f1100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            switch (str.hashCode()) {
                case -1799290762:
                    if (!str.equals(m1215('0' - AndroidCharacter.getMirror('0'), 7 - View.resolveSize(0, 0), (char) (Process.myPid() >> 22)).intern())) {
                        b = -1;
                    } else {
                        int i3 = f1100 + 87;
                        f1099 = i3 % 128;
                        int i4 = i3 % 2;
                        b = 0;
                    }
                    break;
                case -1455130644:
                    if (!str.equals(m1215(27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 41, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45586)).intern())) {
                        b = -1;
                    }
                    break;
                case -1303622385:
                    if (!str.equals(m1215(TextUtils.getOffsetBefore("", 0) + ModuleDescriptor.MODULE_VERSION, (Process.myTid() >> 22) + 24, (char) View.combineMeasuredStates(0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i5 = f1099 + 105;
                        f1100 = i5 % 128;
                        int i6 = i5 % 2;
                        b = 7;
                    }
                    break;
                case -1069735125:
                    b = !str.equals(m1215(125 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - View.getDefaultSize(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 5;
                    break;
                case -278703286:
                    if (!str.equals(m1215(140 - (ViewConfiguration.getTouchSlop() >> 8), 15 - View.MeasureSpec.getMode(0), (char) (62268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                        b = -1;
                    } else {
                        int i7 = f1100 + 95;
                        f1099 = i7 % 128;
                        int i8 = i7 % 2;
                        b = 6;
                    }
                    break;
                case 357386522:
                    b = str.equals(m1215((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 66, (Process.myPid() >> 22) + 19, (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) 3 : (byte) -1;
                    break;
                case 1819361677:
                    if (!str.equals(m1215(8 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.green(0) + 20, (char) (29649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern())) {
                        b = -1;
                    } else {
                        int i9 = f1099 + 75;
                        f1100 = i9 % 128;
                        int i10 = i9 % 2;
                        b = 1;
                    }
                    break;
                case 1914325723:
                    b = !str.equals(m1215(86 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 39, (char) View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return MaioAds.class;
                case 1:
                case 2:
                    return AdFullscreenActivity.class;
                case 3:
                case 4:
                    return HtmlBasedAdActivity.class;
                case 5:
                    return MaioAdsInstance.class;
                case 6:
                    return MaioAdsListener.class;
                case 7:
                    return MaioAdsListenerInterface.class;
                default:
                    return null;
            }
        }
        str.hashCode();
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1215(((Process.getThreadPriority(0) + 20) >> 6) + 179, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, (char) (60422 - TextUtils.lastIndexOf("", '0', 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bv.m1216((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i2 = f1100 + 71;
        f1099 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1217(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f1099 + 115;
        f1100 = i2 % 128;
        int i3 = i2 % 2;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i4 = f1100 + 39;
        f1099 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1215(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1098[b.f638 + i]) ^ (((long) b.f638) * f1101)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
