package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cb extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1244 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1245 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f1246 = {74810281, -651259585, -1823191993, 268022850, -2057465280, -69657498, 1642030264, 427827025, -1719564770, -1246940834, -9606184, -166848673, 892335622, 83797586, 375522442, 928604392, -1956726861, -272844854};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1247 = -6320501677255905385L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1420(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f1245 + 85;
        f1244 = i2 % 128;
        int i3 = i2 % 2;
        m1422(oguryInterstitialAd, oguryInterstitialAdListener);
        int i4 = f1244 + 91;
        f1245 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m1423(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f1245 + 13;
        f1244 = i2 % 128;
        int i3 = i2 % 2;
        m1421(oguryRewardedAd, oguryRewardedAdListener);
        if (i3 != 0) {
            throw null;
        }
    }

    public cb(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1704786309:
                if (!str.equals(m1425(new int[]{-157066844, 1776423873, 1507637168, 1301077350, 2076536370, 1867970391, -1189553712, -1001381401, -182422485, 761776606}, ExpandableListView.getPackedPositionGroup(0L) + 20).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -734879533:
                if (!str.equals(m1424("퐛҅\ue4e4푔쯷ꭵ뮿앀樾椤喇ڡꣂ⢸㽦", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i2 = f1245 + 11;
                    f1244 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 7;
                }
                break;
            case 76142724:
                if (!str.equals(m1424("뷔姲䃰붛\ufff6\uf602ᾫ\uf141ϱ", Color.argb(0, 0, 0, 0) + 1).intern())) {
                    b = -1;
                }
                break;
            case 82913255:
                if (!str.equals(m1424("뤼锰睢륳\uf2c7㫀⠹ﱰܙ\uf88a檆㾒엡뤍곷秎艁翯\ued49뭿䀠㱶⾘諭ນ\uf220懬㐳콺냪ꉆ", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f1244 + 59;
                    f1245 = i4 % 128;
                    int i5 = i4 % 2;
                }
                break;
            case 186993737:
                if (!str.equals(m1425(new int[]{1997234256, 569304367, 2104986498, -1870798427, -2028053031, -22970215, 1868468290, 1594346031, 602429767, -745033000, 842759480, -1150871531}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23).intern())) {
                    b = -1;
                } else {
                    int i6 = f1244 + 47;
                    f1245 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 6;
                }
                break;
            case 1169123445:
                if (!str.equals(m1424("♬⡡\ue519☣ꏉ螑멂굾顉䗀\uf8f6溟媵ќ㺛⣑ᴜ슋缿", -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b = -1;
                } else {
                    int i8 = f1245 + 5;
                    f1244 = i8 % 128;
                    b = i8 % 2 == 0 ? (byte) 5 : (byte) 4;
                }
                break;
            case 1789379091:
                if (!str.equals(m1425(new int[]{1997234256, 569304367, 746404656, 1966567623, 847674749, -597943417, -352005581, -710547490, 1058415501, -1794963239}, 18 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1866202823:
                if (!str.equals(m1424("郪鮢쎱邉ৰ㑚鳲ܛ⻙\uf636\ude4e쒣\uec2b럃ᠶ苩ꯐ煠妝䁝槿㋗魜Ʊ❏ﲵ픢케\ue6ae븳ᚒ赴ꑀ翰偭䫍扯㦧里ࠡ↿ﬅ펲즐＞蓌ഔ矙뵷䙟仺㔽糃", ExpandableListView.getPackedPositionGroup(0L) + 1).intern())) {
                    b = -1;
                } else {
                    b = 0;
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
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1424("\ud968듶∜\ud91bᅫᬄ絆ῧ杚\ud971㿳\udc38ꖣ飍煉驢\ue215帼렲壳⁼ᶽ竫\u192d滐폰㒈힟꼲", Color.argb(0, 0, 0, 0) + 1).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cb.m1420((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1424("㌣鳚ǟ㍐疻㌨庅第贚\uf15eᰴ루俿냰\uda5dﺇࡓ瘽鯴㰑쨧㖸夯緫蒝", TextUtils.indexOf("", "", 0, 0) + 1).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cb.m1423((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i2 = f1245 + InterfaceC0280i1.d.b.d;
        f1244 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1245 + 121;
        f1244 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sdkVersion = Ogury.getSdkVersion();
            int i4 = f1244 + 113;
            f1245 = i4 % 128;
            if (i4 % 2 != 0) {
                return sdkVersion;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1422(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f1244 + 57;
        f1245 = i2 % 128;
        int i3 = i2 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1421(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f1244 + 39;
        f1245 = i2 % 128;
        int i3 = i2 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1424(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f1247, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f1247));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1425(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1246.clone();
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
