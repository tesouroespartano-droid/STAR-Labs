package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bq extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f979 = 4219129770742500988L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f980 = 4346801542062661971L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f981 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f982;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ DynamicLoader m1047() {
        int i = 2 % 2;
        int i2 = f981 + 65;
        f982 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1048();
        }
        m1048();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m1050() {
        int i = 2 % 2;
        int i2 = f982 + 97;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        String strM1046 = m1046();
        int i4 = f981 + 53;
        f982 = i4 % 128;
        int i5 = i4 % 2;
        return strM1046;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m1051() {
        int i = 2 % 2;
        int i2 = f981 + 121;
        f982 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1049();
        }
        m1049();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1053(AdView adView) {
        int i = 2 % 2;
        int i2 = f982 + 123;
        f981 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1060(adView);
        }
        m1060(adView);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m1055(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f982 + 105;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        m1064(adView, adListener);
        int i4 = f982 + 49;
        f981 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ AdPlacementType m1056(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f981 + 119;
        f982 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m1052(adAdapter);
            super.hashCode();
            throw null;
        }
        AdPlacementType adPlacementTypeM1052 = m1052(adAdapter);
        int i3 = f982 + 39;
        f981 = i3 % 128;
        if (i3 % 2 != 0) {
            return adPlacementTypeM1052;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1058(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f982 + 21;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        m1065(interstitialAd, interstitialAdListener);
        int i4 = f981 + 15;
        f982 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1059(Ad ad) {
        int i = 2 % 2;
        int i2 = f981 + 105;
        f982 = i2 % 128;
        int i3 = i2 % 2;
        String strM1061 = m1061(ad);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = f982 + 115;
        f981 = i5 % 128;
        if (i5 % 2 != 0) {
            return strM1061;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ WeakHashMap m1062(bq bqVar, WeakHashMap weakHashMap, cl clVar) {
        int i = 2 % 2;
        int i2 = f982 + 5;
        f981 = i2 % 128;
        if (i2 % 2 != 0) {
            return bqVar.m1063((WeakHashMap<View, WeakReference<Object>>) weakHashMap, clVar);
        }
        bqVar.m1063((WeakHashMap<View, WeakReference<Object>>) weakHashMap, clVar);
        throw null;
    }

    public bq(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        Class<RewardedVideoAdListener> clsM435;
        int i;
        int i2 = 2 % 2;
        byte b = 9;
        switch (str.hashCode()) {
            case -2107186802:
                if (!str.equals(m1057("\ue11dꚫ渕㟱ａ蓋䲄ᐘ\uddd7敛⫚\uf2b4먚䏸୨탖", 18329 - TextUtils.indexOf("", "")).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1585374524:
                if (!str.equals(m1057("\ue101푋诞䅅㓕\uea46ꇘ靜䫭_\uf7d5굩惠噋\u0de1썌뛪汭⏭ᥱ쳹艷禟", 13693 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1513928064:
                if (!str.equals(m1057("\ue130凝胼\uf3de⊱镗쑶㜑昹훕৶碓꯱\u1a5f䵹및\uef6d忣軴솄ギ捃퉫ԇ琮ꓤ\u17ec䚜릸\ue841孿訇ﴲⰱ鳅쿹㺁熿ꁁ፭", 45281 - View.combineMeasuredStates(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.CR;
                }
                break;
            case -1256969519:
                if (!str.equals(m1057("\ue110揇\ue4db槇\uead2濎\uf0dc痊\uf6eb範ﳞ䇫싽䟯죶䷳컕号퓼姣", View.MeasureSpec.makeMeasureSpec(0, 0) + 33533).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case -501313640:
                if (!str.equals(m1057("\ue117뛻亟\ue641빺嘯\uefd6螨徴\uf76b輝Ⓧﳭ针ⱜ쐏鰷㗝춓斩", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22481).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SO;
                }
                break;
            case -498709917:
                if (!str.equals(m1057("\ue11a믮咁\uf14f詭✿쇕髿㞿큑洌خꃶ綀ᚕ덧䰐\ue924菠岔壘鉮", 23251 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -105717264:
                if (!str.equals(m1054("剚蔢刈䬻\ue14f䷺毘緀⛯贪ꭍ華⇬윗浼吏￥勞㝬", View.getDefaultSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.VT;
                }
                break;
            case 2115:
                if (!str.equals(m1057("\ue112佖", 44641 - Color.green(0)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 289409084:
                if (!str.equals(m1057("\ue112뵰妍\uf5ea逮ⱓ좜擏̎\udf42篡ᘊ뉾亸\uead4", 23623 - Color.red(0)).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 320151695:
                if (!str.equals(m1057("\ue11a䗾ꢡཿ爭훯㶵息윿⯡躬\uf55e堶볐", Gravity.getAbsoluteGravity(0, 0) + 42179).intern())) {
                    b = -1;
                }
                break;
            case 435867927:
                if (!str.equals(m1054("挌嵵捀鍦✫\uf5cd媐뮰默啛洪㯓ႍὍꬋ䇭캯⅍\uf135蟽蒢\ueb28㽯춉䋎", ViewConfiguration.getJumpTapTimeout() >> 16).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SYN;
                }
                break;
            case 488344453:
                if (!str.equals(m1054("䒷\ue705䓶⤝\ue1ec᱗紵絑睑\uef06ꯋ", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern())) {
                    b = -1;
                } else {
                    int i3 = f982 + 85;
                    f981 = i3 % 128;
                    int i4 = i3 % 2;
                    b = 2;
                }
                break;
            case 535330969:
                if (!str.equals(m1057("\ue112\uf4eb쪭ꁝ똂谼揾禭併┃㬥\u0eeb\ue4a0煮퀎ꘑ뷠鎺楐缒唾⣶㺴", View.resolveSizeAndState(0, 0, 0) + 5581).intern())) {
                    b = -1;
                } else {
                    b = Ascii.FF;
                }
                break;
            case 553704929:
                if (!str.equals(m1057("\ue117˿⚪䩬渫鏫랴\udb71？\ue0fdҎ⡊䰛瀠闺릴\udd6f섣\ue2fb", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58308).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1165508119:
                if (!str.equals(m1057("\ue112跂㣵\ua7e5勴쇮沈ᮎ蚞㖼", 27892 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1237162638:
                if (!str.equals(m1057("\ue107걀箿ہ푣掯⻃ﰁ讚囮\ue42e덍绾థ\udb75暍㐰썚躬就\ueb77", 19794 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i5 = f982 + 61;
                    f981 = i5 % 128;
                    int i6 = i5 % 2;
                    b = Ascii.NAK;
                }
                break;
            case 1476063628:
                if (!str.equals(m1054("윲簝읳눅咁ꕅﺣ져칕琁Ấ歔뒠", Color.red(0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f982 + 83;
                    f981 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 1;
                }
                break;
            case 1838933446:
                if (!str.equals(m1054("댙媞덗钃⸶虲誟늺\ued6f劗搐䡪삗\u18acꈇ㉉Ẉ⚶", ViewConfiguration.getTapTimeout() >> 16).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 1908493505:
                if (!str.equals(m1057("\ue130鲱ᨤ駚ᜁ鋳ၾ迭൙裉ھ萷ϡ脛㲁멣㦭띏㋝끲⸾궧⬺", Gravity.getAbsoluteGravity(0, 0) + 32141).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1955913096:
                if (!str.equals(m1054("诩홢讨\u187a偦㵹뉼쳈噤\ude79", ViewConfiguration.getTapTimeout() >> 16).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 2035065003:
                if (!str.equals(m1057("\ue11d偋菕\uf551Ⓛ陫진㭸櫙\udc73ྚ䄅", TextUtils.lastIndexOf("", '0', 0, 0) + 45434).intern())) {
                    b = -1;
                } else {
                    int i9 = f982 + 9;
                    f981 = i9 % 128;
                    b = i9 % 2 != 0 ? Ascii.SI : (byte) 90;
                }
                break;
            case 2035668095:
                if (!str.equals(m1054("\u31e8왃ㆦ࡞ᰩ㾵\u086e肥咨칊嘌\uf1a8䉞葶逘讋", TextUtils.lastIndexOf("", '0', 0) + 1).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 2110329530:
                if (!str.equals(m1057("\ue11d脣℅섉慡ţꅴ䅀", View.getDefaultSize(0, 0) + 24593).intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case 8:
                return InterstitialAdListener.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                clsM435 = RewardedVideoAdListener.class;
                i = f981 + 83;
                f982 = i % 128;
                break;
            case 11:
                return RewardedVideoAd.class;
            case 12:
            case 13:
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return c.class;
            case 22:
                clsM435 = ak.m435();
                i = f982 + 115;
                f981 = i % 128;
                break;
            default:
                return null;
        }
        int i10 = i % 2;
        return clsM435;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1054("먇撧멠ꪾ䃬\udd7f莛\udc60뙛沪૫ፚ즊⚞쳖楻ឞᢏ雮꽭嶨틶墙\ue50b鯡铢抭㬈", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1053((AdView) list.get(0));
            }
        });
        map.put(m1057("\ue134씳꤭贌焫唫㤮ᴕ섖ꔛ褏洐儦㕶ᥓﵪꅬ蕫楈䵨", 9221 - Color.blue(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1059((Ad) list.get(0));
            }
        });
        map.put(m1054("되\ue054둫⹍닑싫趌⹝꧞\ue874\uf8dc\u0cc9잌ꉭ㻫盯ᦺ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bq.m1055((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m1057("\ue134꽩継ਏ\ud85a曬㜀얯鏅\u2067\uee80뼈䵂\u1bf4ꠖ皭ӑ핷掼〽﹋賱崏\uebb3맏䙭ᒣꔿ獒ǧ츥鲫⫃\ufb09覆埋\ue476", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20063).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1050();
            }
        });
        map.put(m1057("\ue134㳑嫩碧隺뒴퉐\uf067ฅⰯ䨰槰蟢ꖜ쎆\ue1b5㽑嵯第餕뜫틉\uf0ff\u0efbⲏ䪥桠虠ꑳ숻\ue020㿘巗篙馜랴필\uf345ᅩ⼩䴮棕", 56807 - TextUtils.getTrimmedLength("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1051();
            }
        });
        map.put(m1057("\ue120瓟쫵₡뚙ಪ所\uf87e乨ꐖ㨠逤\ue7de緪펬⦐뾏ᕃ歂셬圂괠̰雎", 38378 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bq.m1058((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1057("\ue134싣ꚍ詨湾刔㟌ᯭﾒꍍ蝍欛䳎ユᒐ\uf85a", View.getDefaultSize(0, 0) + 9173).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1047();
            }
        });
        map.put(m1054("슝謎싺䔗囖\uf8d3ﬁ쩚鏷范᳑㛶널줷\udaec䳗漙\uf73b胢論", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1056((AdAdapter) list.get(0));
            }
        });
        map.put(m1054("腇듣脤竭\uf5d1彔룃楌㑁볪뿰酧\uf2e9\uf6de秠\ueb7cⳡ죊⏅ⵡ曐ʺ\ued95朞ꂿ䒮힗뤍\udaaa麞醤", KeyEvent.getMaxKeyCode() >> 16).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bq.m1062(bq.this, (WeakHashMap) list.get(0), clVar);
            }
        });
        int i2 = f981 + 115;
        f982 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f982 + InterfaceC0280i1.d.b.i;
        f981 = i2 % 128;
        try {
            try {
                try {
                    if (i2 % 2 != 0) {
                        return (String) hu.m2296().m2298().m2238(AdSdkVersion.class, String.class).get(null);
                    }
                    throw null;
                } catch (Throwable unused) {
                    return hu.m2296().m2297().m2344(BuildConfig.class, m1054("뒱ﺽ듯ゝċ泒贝鶗߽\uf6b5䭑ꋄ읺볏赥", TextUtils.indexOf((CharSequence) "", '0') + 1).intern());
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return (String) hu.m2296().m2298().m2238(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1060(AdView adView) {
        int i = 2 % 2;
        int i2 = f982 + 105;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adView.getPlacementId();
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = f981 + 53;
        f982 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1061(Ad ad) {
        int i = 2 % 2;
        int i2 = f981 + 67;
        f982 = i2 % 128;
        if (i2 % 2 == 0) {
            return ad.getPlacementId();
        }
        ad.getPlacementId();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1064(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f982 + 117;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        adView.setAdListener(adListener);
        int i4 = f982 + 113;
        f981 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1046() {
        int i = 2 % 2;
        int i2 = f981 + 97;
        f982 = i2 % 128;
        int i3 = i2 % 2;
        long elapsedCpuTime = Process.getElapsedCpuTime();
        String strIntern = m1054("⹍ꅡ⸻潴롏़៩ⓒ房ꥴ\uf24a윾", i3 != 0 ? 1 / (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1)) : 1 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1))).intern();
        int i4 = f982 + 85;
        f981 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1049() {
        float fComplexToFloat;
        float f;
        int i = 2 % 2;
        int i2 = f981 + 93;
        f982 = i2 % 128;
        if (i2 % 2 != 0) {
            fComplexToFloat = TypedValue.complexToFloat(1);
            f = 1.0f;
        } else {
            fComplexToFloat = TypedValue.complexToFloat(0);
            f = 0.0f;
        }
        return m1057("\ue135⫱皶艿츽᯳➮獭뼙죭ᒺ⁓氅말얜ᅚ崵曉늁﹏\u0a00埩揿꾲ﭘܹ僯鲦ꡊ\uf425ǻ䶥饆ꔀ", (fComplexToFloat > f ? 1 : (fComplexToFloat == f ? 0 : -1)) + 52163).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1065(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f982 + InterfaceC0280i1.d.b.g;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f982 + 83;
        f981 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DynamicLoader m1048() {
        int i = 2 % 2;
        int i2 = f982 + 45;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i4 = f982 + 83;
        f981 = i4 % 128;
        if (i4 % 2 != 0) {
            return dynamicLoader;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdPlacementType m1052(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f981 + 43;
        f982 = i2 % 128;
        int i3 = i2 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        int i4 = f981 + 81;
        f982 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m1063(WeakHashMap<View, WeakReference<Object>> weakHashMap, cl clVar) {
        int i = 2 % 2;
        c cVar = new c(weakHashMap, clVar);
        int i2 = f982 + 71;
        f981 = i2 % 128;
        int i3 = i2 % 2;
        return cVar;
    }

    class c extends WeakHashMap<View, WeakReference<Object>> implements hg<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f992 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f993 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int[] f994 = {43530419, 1411669628, -723216709, 730289840, -1315558952, -1363843500, 2027633088, 545503948, 1771145732, -1916067684, 1657417588, -695342218, 1434032322, 2087121636, -1892371982, 1182586979, -210159471, 1110332413};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cl f995;

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f993 + 21;
            f992 = i2 % 128;
            View view = (View) obj;
            WeakReference<Object> weakReference = (WeakReference) obj2;
            if (i2 % 2 == 0) {
                return m1067(view, weakReference);
            }
            m1067(view, weakReference);
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo795() {
            WeakHashMap<View, WeakReference<Object>> weakHashMapM1068;
            int i = 2 % 2;
            int i2 = f992 + 41;
            f993 = i2 % 128;
            if (i2 % 2 == 0) {
                weakHashMapM1068 = m1068();
                int i3 = 13 / 0;
            } else {
                weakHashMapM1068 = m1068();
            }
            int i4 = f992 + InterfaceC0280i1.d.b.g;
            f993 = i4 % 128;
            int i5 = i4 % 2;
            return weakHashMapM1068;
        }

        public c(WeakHashMap<View, WeakReference<Object>> weakHashMap, cl clVar) {
            super(weakHashMap);
            this.f995 = clVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Object> m1067(View view, WeakReference<Object> weakReference) {
            int i = 2 % 2;
            int i2 = f992 + 63;
            f993 = i2 % 128;
            if (i2 % 2 == 0) {
                bq bqVar = bq.this;
                cl clVar = this.f995;
                String strIntern = m1066(new int[]{-2078639558, 20988963, 1002113723, -1252866935, 2089937403, -1454562982, -1546402234, 218296245, -849556205, 1051531551, -141493165, -1422227480}, 4 >> ExpandableListView.getPackedPositionChild(1L)).intern();
                Object[] objArr = new Object[5];
                objArr[0] = view;
                objArr[0] = weakReference;
                bqVar.m815(this, clVar, strIntern, objArr);
            } else {
                bq.this.m815(this, this.f995, m1066(new int[]{-2078639558, 20988963, 1002113723, -1252866935, 2089937403, -1454562982, -1546402234, 218296245, -849556205, 1051531551, -141493165, -1422227480}, ExpandableListView.getPackedPositionChild(0L) + 24).intern(), view, weakReference);
            }
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i3 = f992 + 61;
            f993 = i3 % 128;
            int i4 = i3 % 2;
            return weakReference2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m1068() {
            int i = 2 % 2;
            int i2 = f992 + 79;
            f993 = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1066(int[] iArr, int i) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1230) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f994.clone();
                com.ironsource.adqualitysdk.sdk.i.c.f1231 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.c.f1231 < iArr.length) {
                    cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231] >> 16);
                    cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231];
                    cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1] >> 16);
                    cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.c.f1231 + 1];
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = (cArr[0] << 16) + cArr[1];
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = (cArr[2] << 16) + cArr[3];
                    com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = com.ironsource.adqualitysdk.sdk.i.c.f1232 ^ iArr2[i2];
                        com.ironsource.adqualitysdk.sdk.i.c.f1232 = i3;
                        com.ironsource.adqualitysdk.sdk.i.c.f1233 = com.ironsource.adqualitysdk.sdk.i.c.m1414(i3) ^ com.ironsource.adqualitysdk.sdk.i.c.f1233;
                        int i4 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                        com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                        com.ironsource.adqualitysdk.sdk.i.c.f1233 = i4;
                    }
                    int i5 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5;
                    com.ironsource.adqualitysdk.sdk.i.c.f1233 = i5 ^ iArr2[16];
                    com.ironsource.adqualitysdk.sdk.i.c.f1232 ^= iArr2[17];
                    int i6 = com.ironsource.adqualitysdk.sdk.i.c.f1232;
                    int i7 = com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1232 >>> 16);
                    cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1232;
                    cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.c.f1233 >>> 16);
                    cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.c.f1233;
                    com.ironsource.adqualitysdk.sdk.i.c.m1415(iArr2);
                    cArr2[com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1] = cArr[0];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 1] = cArr[1];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 2] = cArr[2];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.c.f1231 << 1) + 3] = cArr[3];
                    com.ironsource.adqualitysdk.sdk.i.c.f1231 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1057(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f980);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1054(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f979, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f979));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
