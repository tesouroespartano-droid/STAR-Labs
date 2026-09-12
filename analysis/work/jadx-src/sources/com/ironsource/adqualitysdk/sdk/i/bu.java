package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amazon.device.ads.DTBAdView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.Nd;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bu extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1087 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1088 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1089 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1090 = 1;

    static {
        char[] cArr = new char[Nd.a.h];
        ByteBuffer.wrap("\u0000A+×W\u0019\u0083k®¦Úè\u0006]1\u0087]é\u00899µsà·\f\b8Tc\u0094©º\u00823þá*\u0096\u0007[s\u000e¯±\u0098wô6\u0000C+ÚW\u0004\u0083k®¦Úæ\u0006R1\u009f]Í\u0089/µSà¤\f\b8Xc\u0090\u008fò»$ç|\u0000c+ÚW\u0007\u00831®½Úû\u0006Q1\u009d]Û\u00892µgàµ\f\u001f8TcÈ\u008fè»4çn\u0012\u0094>\fjK\u0095·Áúí1\u0018\u0097DÁp\u000e\u009crÇ¾ó¯\u001fuJ\u0084vÎ¢!ÎxùÐ%\u0018QE|»¨áÔ\tÿ\u009e+ÆW\u000e\u0083j®¸Úò\u0006B\u0000I+ÛW\u001e\u0083z®¦Úú\u0006J1\u009a]Ü\u00894µsà«\f=8Rc\u0092\u008fò»&çl\u0012Î>\u0016\u000e`%ÙY\u0004\u008d2 ¾Ôø\bR?\u009eSØ\u00871»dî¶\u0002\u001c6WmË\u0081ëµ7ém\u001c\u00970\u000fdH\u009b´Ïùã2\u0016\u0094JÂ~\r\u0092qÉ½ý¬\u0011|D\u0086x×¬3À{÷Ï+\u0003_Cr©¦ùÚ*ñ\u0092%ðY\u0007\u008dk »Ôó\bQ?\u0087Sß£Á\u0088Kô\u0081 ÿ\r\u000fyu¥Ü\u0092<þE*§\u0016õC?¯\u009b\u009bËÀ\u0011\u0090õ»LÇ\u0091\u0013§>+Jm\u0096Ç¡\u000bÍM\u0019¤%ñp#\u009c\u0089¨Âó^\u001f~+¢wø\u0082\u0002®\u009aúÝ\u0005!Ql}§\u0088\u0001ÔWà\u0098\fäW(c9\u008fïÚ\ræS2\u00ad^Éi[µ\u008eÁþì+8qD·o\u001d»MÇ\u0085\u0013ó\u0000I+ÇW\u0005\u0083q®\u0087Úæ\u0006K1\u0081]Ë\u00898µPà¦\f\u00128_c\u0083\u008fé»\u001cçd\u0012Ã>\u0000jQ\u0095\u00ad\u0000c+ÚW\u0007\u00831®½Úû\u0006Q1\u009d]Û\u00892µgàµ\f\u001f8TcÈ\u008fö»5ça\u0012Ó>\u000ejP\u0095°Ááí-\u0018\u008bDÉp\t\u009c9Ç\u0085óó\u001fYJ\u0085vó¢:Î\u007fùÍ%\u0017QL|\u009c¨òÔ&ÿ\u0093+×W\u0015\u0083P®°Úÿ\u0006T1\u0085]Ñ\u0005Ç.hR¦\u0086ð«4ßi\u0003Õ4\u000fXu\u008cº°æå,\u0000B+ÔW\u0004\u0083q®±Úû\u0006m1\u009e]É\u0089.µzà\u008b\f\u00158Bc\u0092\u008fþ»>ç`\u0012È\u0000I+ÇW\u0005\u0083q®\u0087Úæ\u0006K1\u0081]Ë\u00898\u0000I+ØW\u001a\u0083m®±Úú\u0006M1\u009a]Ç\u00893µVà¦\f\b8P\u0000I+ØW\u001a\u0083m®±Úú\u0006M1\u009a]Ç\u00893µVà¦\f\b8Pcª\u008fò»#çq\u0012ß>\u0001jA\u0095«\u0000D+áW(\u0083^®°Úß\u0006W1\u0096]ß\u0000c+ÚW\u0007\u00831®µÚä\u0006_1\u0089]Ç\u00893µ<à£\f\u00198Gc\u008f\u008fø»5ç+\u0012Û>\u000bjW\u0095÷ÁÊí\u0017\u0018ºDìp\u0006\u009cAÇ¥óä\u001fAbÔIH5\u0084áâÌ ¸AdÊS\n?Ië\u0087×ë\u00821n\u008aZÌ\u0001\fíOÙ¡\u0085îpV\\\u0092\bÒ÷$£d\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u0014µ|à³\f\u00198Cc\u0095\u008fï»9çq\u0012Ó>\u000ejH\u0095\u0095Áçí0\u0018\u008cDÈp\f\u009crÇ¾\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u000fµwà°\f\u001d8Cc\u0082\u008fþ»4çS\u0012Ó>\u000bjA\u0095¶ÁÏí6\u0018\u008cDÂp\u000f\u009cvÇ¸óè\u001fUJ§vÉ¢&Î~ùÚ%\u001aQL|¬>M\u0015Ñi\u001d½{\u0090¹äØ8S\u000f\u0093cÐ·\u000e\u008bvÞ±2\u001c\u0006B]\u0083±ÿ\u00855ÙR,Ò\u0000\nT@«·ÿÃÓ+&\u008azØN\u0006¢xù¨ÍòhñCm?¡ëÇÆ\u0005²dnïY/5lá²ÝÊ\u0088\rd Pþ\u000b?çCÓ\u0089\u008fîznV¶\u0002üý\u000b©~\u0085\u009fp+,e\u0018¾ôÆ¯=\u009bUwø\"\"\u001exÊ\u0086¦Ò\u0091p\u0000A+ÑW#\u0083q®²Úæ\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u0013µsà³\f\u00158Gc\u0083\u008fÚ»4F\u000bm\u0091\u0011[Å3èç\u009c©@:wÒ\u001b¡Ïyó.¦íJL~\u0000\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u0013µsà³\f\u00158Gc\u0083\u008fÚ»4çI\u0012Ó>\u001cjP\u0095¼Áàí&\u0018\u008açHÌÔ°\u0018d~I¼=ÝáVÖ\u0096ºÕn\u0014Rs\u0007§ë\u0011ßT\u0084´hö\\1\u0000vã0È ´z`\u001eMÑ9\u009då=ÒÌ¾¸jXV\n\u0003ÀïhÛ\u0001\u0080ól®X@\u0004\u0000ñªÔ\tÿ\u0093\u0083YW1zå\u000e«Ò8åÐ\u0089¹]sa04÷Øsì\u0019·Í[¸or30¬ \u00872û÷/\u0093\u0002Ov\u000eª¶\u009dvñ\u000f%Õ\u0019\u008fLG ã\u0094½ÏN#\u0016\u0017õK\u0085¾ \u0092òÆ¨9^m\u0002AØ\u0000N+ÔW\u001e\u0083v®¢Úì\u0006\u007f1\u0097]é\u00899µsà·\f\b8Tc\u0094\u008fÒ»>çq\u0012ß>\u001djB\u0095¸Áíí&\u0000N+ÔW\u001e\u0083v®¢Úì\u0006\u007f1\u0097]ì\u0089<µfà¦\f58_c\u0092\u008fþ»\"çc\u0012Û>\fjA\u0000N+ÔW\u001e\u0083v®¢Úì\u0006\u007f1\u0097]á\u00893µfà¢\f\u000e8Pc\u0085\u008fï»9çj\u0012Ô>#jM\u0095ªÁúí&\u0018\u0096DÈp\u0010Ó\nø\u0090\u0084ZP2}æ\t¨Õ;âÓ\u008e¥Zwf\"3æßJë\u0013°Ã\\¼hq\u0000N+ÔW\u001e\u0083v®¢Úì\u0006\u007f1\u0097]ä\u00892µsà£\f08Xc\u0095\u008fï»5çk\u0012ß>\u001d\u0000N+ÔW\u001e\u0083v®¢Úì\u0006\u007f1\u0097]û\u00890µsà´\f\u00148}c\u008f\u008fè»$ç`\u0012Ô>\njV\nd!þ]4\u0089\\¤\u0088ÐÆ\fU;½WÔ\u0083\u001e¿]ê\u009a\u0006\u00142ri¢\u0085Õ±\u001fí]\u0018Ù4+`z\u009f\u0096ËÖç\u000f\u0012³Näz-\u009f\u008a´\u001aÈå\u001cµ1kE#ìâÇ~»²oÔB\u00166wêüÝ<±\u007fe²YØ\f à¼Ôù\u008f'\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u001fµsà©\f\u00128Tc\u0094\u008fÚ»4çS\u0012Ó>\njSô\u009bß\"£ÿwÉZY.\u001fò¯Å\u007f©)}\u0096A\u008e\u0014\u0011øéÌ¬\u0097z{\nOÉ\u0013\u0089æ+Êø\u009e²a\u000f5\u0014\u0019Úìn°;\u0084ÿh\u009d3\u001a\u00075ë«¾e\u0082=VÁ:¢\r+Ñí¥¨\u0088d\\\n Þ\u000bkß/£íw¥ZM.(òªÅm©*(\u001b\u0003\u0087\u007fK«-\u0086ïò\u008e.\u0005\u0019Åu\u0086¡H\u009d$Èþ$E\u0010\u0003KÃ§\u008d\u0093cÏ\u0004:\u0084\u0016]B\u0004½Âé°Åg0Ûl\u009fX[´%ïé\u0000I+ÇW\u0005\u0083q®\u0087Úæ\u0006K1\u0081]Ë\u00898µSà£\f\u000f8wc\u0089\u008fé»=çd\u0012ÎL\u0019g\u008f\u001b_Ï*âê\u0096 J$}Ì\u0011ºÅhù/¬óã\u0091È\u0007´×`¢Mb9(å¬ÒD¾)jëV°\u0003aïÊÛ\u0091\u0080A©\u0092\u0082\u0004þÔ*¡\u0007as+¯¯\u0098Gô. ä\u001c§I`\u0000c+ÚW\u0007\u00831®¡Úç\u0006W1\u0087]Ñ\u0089nµvàé\f\u00158Cc\u0089\u008fõ»#çj\u0012Ï>\u001djG\u0095¼Áïí'\u0018\u008bD\u0083p\u0000\u009cvÇ¢óï\u001fSJ\u0099v\u008e¢\u0017ÎkùÑ%\u001aQL|¬¨ÒÔ,ÿ«+ÛW\u0002\u0083kýÌÖZª\u008a~ÿS?'uûñÌ\u0019 ptºHù\u001d>ñ¾ÅÖ\u009e\u001braF»\u001aåïQÃ\u0093\u000b_ Í\\\b\u0088l¥°Ñì\r\\:\u008cVÊ\u0082\"¾eë½\u0007+3Cõ¦Þ4¢ñv\u0095[I/\u0015ó¥Äu¨3|Û@\u009c\u0015DùÒÍº\u0096@z\u001aNÙ\u0012\u0085\u0000I+ÛW\u001e\u0083z®¦Úú\u0006J1\u009a]Ü\u00894µsà«\f=8Ucª\u008fò»#çq\u0012ß>\u0001jA\u0095«\u0098G³ÕÏ\u0010\u001bt6¨Bô\u009eD©\u0094ÅÒ\u0011:-}x¥\u00943 [ûº\u0017ð#/\u007f~\u008aÑ¦\u0012ò^\u0000R+ÐW\u001d\u0083~®¦Úí\u0006[1\u0097]é\u00899\u0096p½òÁ?\u0015\\8\u0084LÏ\u0090y§µËË\u001f\u001b#yv\u008b\u009a8®|Õ\u008eþ\f\u0082ÁV¢{z\u000f1Ó\u0087äK\u00885\\å`\u00825rÙÓí\u0099¶_Z)né2«\u0000R+ÐW\u001d\u0083~®¦Úí\u0006[1\u0097]é\u00899µ@à¢\f\r8Dc\u0083\u008fè»$\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u0014µ|à³\f\u00198Cc\u0095\u008fï»9çq\u0012Ó>\u000ejH\u0095\u0098Áê\u0002])ÁU\r\u0081k¬©ØÈ\u0004C3\u0083_À\u008b\u0005·mâ¢\u000e\b:Ra\u0084\u008dþ¹(å`\u0010Â<\u001fhY\u0097\u0089Ãûï\u001e\u001a\u0080FÏr\u0007\u009ecÅ³ñõ\u001dU\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u000fµwà°\f\u001d8Cc\u0082\u008fþ»4çD\u0012ÞVP}Ì\u0001\u0000Õfø¤\u008cÅPNg\u008e\u000bÍß\u0013ãk¶¬Z\u0001n_5\u009eÙâí(±XDÂh?<QÃ¶\u0097æ»:N\u008a\u0012Ô&\f\u0000L+ÐW\u001c\u0083z®¸ÚÙ\u0006R1\u0092]Ñ\u0089\u000fµwà°\f\u001d8Cc\u0082\u0000g+ÐW\u001e\u0083O®¸Úè\u0006]1\u0096]Å\u00898µ|à³\f28Pc\u008b\u008fþ-\u0080\u00067zù®º\u0083R÷\u0000+·\u001cqp=¤ö\u0098\u0094ÍY!ô\u0015£Nu¢,\u0096ÛÊ\u0083?>\u0013íG®¸[ì\u0007ÀÐ5Qi+]è±\u0095\u0000g+ÐW\u001e\u0083V®¹Úù\u0006L1\u0096]Û\u0089.µ{à¨\f\u00128uc\u0087\u008fï»1çO\u0012É>\u0000jJ\u0000a+ÑW\u000e\u0083V®¹Úù\u0006L1\u0096]Û\u0089.µ{à¨\f\u00128uc\u0087\u008fï»1çI\u0012Ó>\u001cjP\u0095¼Áàí&\u0018\u008a\u0000r+ÐW\u0007\u0083p®¢Úì\u0006w1\u009e]Ø\u0089/µwà´\f\u000f8Xc\u0089\u008fõ»\u0014çd\u0012Î>\u000ejh\u0095°Áýí7\u0018\u009dDÃp\u0007\u009ce\u0000s+ÐW\u001e\u0083Q®µÚý\u0006W1\u0085]Í\u0089\u001cµvà\u008b\f\u00158Bc\u0092\u008fþ»>ç`\u0012È\u0000g+ÐW\u001e\u0083L®±Úû\u0006H1\u0096]Ú\u0089\u0019µsà³\f\u001d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, Nd.a.h);
        f1089 = cArr;
        f1088 = 6876834347072170933L;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1202(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f1090 + 23;
        f1087 = i2 % 128;
        if (i2 % 2 != 0) {
            m1212(ironSourceBannerLayout);
            throw null;
        }
        String strM1212 = m1212(ironSourceBannerLayout);
        int i3 = f1087 + 5;
        f1090 = i3 % 128;
        int i4 = i3 % 2;
        return strM1212;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1203(AdData adData) {
        int i = 2 % 2;
        int i2 = f1087 + 63;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        String strM1200 = m1200(adData);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = f1087 + 3;
        f1090 = i5 % 128;
        int i6 = i5 % 2;
        return strM1200;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m1204(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1090 + 59;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM1201 = m1201(impressionData);
        int i4 = f1087 + 35;
        f1090 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM1201;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1205(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1090 + 71;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        m1214(impressionDataListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1208(Placement placement) {
        int i = 2 % 2;
        int i2 = f1090 + 85;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        String strM1213 = m1213(placement);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = f1087 + InterfaceC0280i1.d.b.i;
        f1090 = i5 % 128;
        if (i5 % 2 != 0) {
            return strM1213;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1209(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f1087 + 93;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        m1206(levelPlayNativeAd, levelPlayNativeAdListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1210(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1090 + 59;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        m1207(impressionDataListener);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = f1087 + 15;
        f1090 = i5 % 128;
        int i6 = i5 % 2;
    }

    public bu(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0927  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f1090 + 91;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        byte b = 1;
        switch (str.hashCode()) {
            case -2063883567:
                b = !str.equals(m1211((KeyEvent.getMaxKeyCode() >> 16) + LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, (char) (TextUtils.lastIndexOf("", '0', 0) + 59141)).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case -2054763962:
                if (!str.equals(m1211(603 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 25 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i4 = f1090 + 119;
                    f1087 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.EM;
                }
                break;
            case -2044561387:
                b = !str.equals(m1211(TextUtils.getTrimmedLength("") + 731, 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern()) ? (byte) -1 : Ascii.US;
                break;
            case -2012752057:
                b = !str.equals(m1211(1242 - TextUtils.getTrimmedLength(""), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 56;
                break;
            case -1879025222:
                b = !str.equals(m1211(KeyEvent.normalizeMetaState(0) + 369, 8 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.rgb(0, 0, 0) + 16777216)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -1810844504:
                if (!str.equals(m1211(TextUtils.indexOf("", "") + 1088, 20 - TextUtils.getTrimmedLength(""), (char) (Color.blue(0) + 64910)).intern())) {
                    b = -1;
                } else {
                    b = 47;
                }
                break;
            case -1704786309:
                b = !str.equals(m1211(90 - View.MeasureSpec.getSize(0), View.resolveSizeAndState(0, 0, 0) + 20, (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1678289205:
                b = !str.equals(m1211(42 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1555060867:
                b = !str.equals(m1211(1315 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 22044)).intern()) ? (byte) -1 : (byte) 59;
                break;
            case -1406023077:
                b = !str.equals(m1211(109 - ImageFormat.getBitsPerPixel(0), 51 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (3635 - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -1323215337:
                b = !str.equals(m1211(291 - Process.getGidForName(""), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1422)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1282106699:
                b = !str.equals(m1211(TextUtils.indexOf("", "", 0) + 906, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, (char) (62712 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 40;
                break;
            case -1276273849:
                b = !str.equals(m1211(347 - View.MeasureSpec.getSize(0), (Process.myPid() >> 22) + 22, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1115843213:
                b = !str.equals(m1211((ViewConfiguration.getEdgeSlop() >> 16) + 333, 13 - ImageFormat.getBitsPerPixel(0), (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case -1088585376:
                b = !str.equals(m1211(955 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), MotionEvent.axisFromString("") + 30, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10326)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -989825485:
                b = !str.equals(m1211(TextUtils.getTrimmedLength("") + 646, 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Color.green(0) + 58225)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -838208757:
                b = !str.equals(m1211(664 - Process.getGidForName(""), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54342)).intern()) ? (byte) -1 : Ascii.FS;
                break;
            case -643050252:
                if (!str.equals(m1211(TextUtils.lastIndexOf("", '0', 0, 0) + 176, TextUtils.getOffsetAfter("", 0) + 45, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37013)).intern())) {
                    b = -1;
                } else {
                    int i6 = f1090 + 13;
                    f1087 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 7;
                }
                break;
            case -609786639:
                b = !str.equals(m1211(MotionEvent.axisFromString("") + 1184, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, (char) (AndroidCharacter.getMirror('0') - '0')).intern()) ? (byte) -1 : (byte) 52;
                break;
            case -559540471:
                if (!str.equals(m1211(500 - (ViewConfiguration.getScrollBarSize() >> 8), 29 - TextUtils.lastIndexOf("", '0'), (char) (15873 - View.combineMeasuredStates(0, 0))).intern())) {
                    b = -1;
                } else {
                    int i8 = f1087 + 93;
                    f1090 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 20;
                }
                break;
            case -498709917:
                b = !str.equals(m1211(TextUtils.indexOf((CharSequence) "", '0', 0) + 1141, View.resolveSizeAndState(0, 0, 0) + 22, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 50;
                break;
            case -498060603:
                if (!str.equals(m1211(15 - (KeyEvent.getMaxKeyCode() >> 16), 9 - Color.green(0), (char) (43498 - (Process.myPid() >> 22))).intern())) {
                    b = -1;
                }
                break;
            case -393802555:
                b = !str.equals(m1211(View.MeasureSpec.getSize(0) + 1207, 18 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 54748)).intern()) ? (byte) -1 : (byte) 54;
                break;
            case -284636416:
                b = !str.equals(m1211((ViewConfiguration.getEdgeSlop() >> 16) + 1016, 15 - ExpandableListView.getPackedPositionType(0L), (char) (Color.green(0) + 58323)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case -154075626:
                b = !str.equals(m1211(815 - ((byte) KeyEvent.getModifierMetaStateMask()), 21 - TextUtils.indexOf("", "", 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -153002112:
                b = !str.equals(m1211(1043 - (Process.myTid() >> 22), 45 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 30304559:
                b = !str.equals(m1211(MotionEvent.axisFromString("") + 531, (ViewConfiguration.getEdgeSlop() >> 16) + 36, (char) (Color.green(0) + 26813)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 85893348:
                b = !str.equals(m1211(986 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 19 - TextUtils.indexOf("", "", 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 42;
                break;
            case 149942051:
                if (!str.equals(m1211(KeyEvent.keyCodeFromString("") + 323, 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern())) {
                    b = -1;
                } else {
                    int i10 = f1087 + 69;
                    f1090 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 12;
                }
                break;
            case 204617641:
                b = !str.equals(m1211(1295 - TextUtils.lastIndexOf("", '0'), (KeyEvent.getMaxKeyCode() >> 16) + 19, (char) View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 58;
                break;
            case 204897024:
                b = !str.equals(m1211(1162 - (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20, (char) (38927 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 51;
                break;
            case 307677661:
                b = !str.equals(m1211(1004 - ((Process.getThreadPriority(0) + 20) >> 6), 12 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 19547)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 308060116:
                b = !str.equals(m1211((ViewConfiguration.getKeyRepeatDelay() >> 16) + IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (char) (KeyEvent.normalizeMetaState(0) + 43472)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case 320151695:
                b = !str.equals(m1211(1108 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.getSize(0) + 14, (char) (2839 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 48;
                break;
            case 334118616:
                if (!str.equals(m1211((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + InterfaceC0280i1.a.b.i, 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (25239 - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                    b = -1;
                } else {
                    int i12 = f1087 + 61;
                    f1090 = i12 % 128;
                    b = i12 % 2 != 0 ? (byte) 17 : (byte) 101;
                }
                break;
            case 663296747:
                b = !str.equals(m1211(24 - Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 766880816:
                if (!str.equals(m1211(TextUtils.lastIndexOf("", '0') + 838, 27 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2601)).intern())) {
                    b = -1;
                } else {
                    int i13 = f1087 + 3;
                    f1090 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 36;
                }
                break;
            case 779287609:
                b = !str.equals(m1211(220 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (char) TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 823061407:
                if (!str.equals(m1211(779 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, (char) (Process.getGidForName("") + 54085)).intern())) {
                    b = -1;
                } else {
                    int i15 = f1087 + 33;
                    f1090 = i15 % 128;
                    int i16 = i15 % 2;
                    b = 33;
                }
                break;
            case 894546539:
                b = !str.equals(m1211((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 683, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44266)).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case 1052532031:
                b = !str.equals(m1211(Process.getGidForName("") + 1194, TextUtils.getCapsMode("", 0, 0) + 14, (char) (38434 - (KeyEvent.getMaxKeyCode() >> 16))).intern()) ? (byte) -1 : (byte) 53;
                break;
            case 1069602180:
                b = !str.equals(m1211(707 - TextUtils.indexOf("", "", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.RS;
                break;
            case 1081984916:
                b = !str.equals(m1211((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 795, 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 1180349927:
                b = !str.equals(m1211(242 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 51, (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1226831433:
                b = !str.equals(m1211(Color.blue(0) + 870, '?' - AndroidCharacter.getMirror('0'), (char) (KeyEvent.getDeadChar(0, 0) + 60590)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1266525324:
                if (!str.equals(m1211(TextUtils.indexOf("", "", 0, 0) + 885, 21 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i17 = f1090 + 55;
                    f1087 = i17 % 128;
                    if (i17 % 2 == 0) {
                        b = 39;
                    } else {
                        b = 47;
                    }
                }
                break;
            case 1267145181:
                b = !str.equals(m1211((ViewConfiguration.getFadingEdgeLength() >> 16) + 1122, 18 - TextUtils.indexOf("", ""), (char) (62959 - TextUtils.indexOf("", "", 0))).intern()) ? (byte) -1 : (byte) 49;
                break;
            case 1304950957:
                b = !str.equals(m1211((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), '?' - AndroidCharacter.getMirror('0'), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1432059210:
                b = !str.equals(m1211(461 - (ViewConfiguration.getJumpTapTimeout() >> 16), 39 - View.MeasureSpec.getSize(0), (char) View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1517126868:
                b = !str.equals(m1211(160 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - TextUtils.indexOf((CharSequence) "", '0'), (char) (41870 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1628896204:
                b = !str.equals(m1211((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 752, 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1715808775:
                b = !str.equals(m1211(View.combineMeasuredStates(0, 0) + 1342, 15 - Color.alpha(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 60;
                break;
            case 1773831812:
                b = !str.equals(m1211((ViewConfiguration.getLongPressTimeout() >> 16) + 589, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (17990 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 1870849118:
                b = !str.equals(m1211(1225 - (KeyEvent.getMaxKeyCode() >> 16), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 55;
                break;
            case 1910059890:
                b = !str.equals(m1211(572 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, (char) TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 1910219460:
                b = !str.equals(m1211(304 - (ViewConfiguration.getScrollBarSize() >> 8), 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case 1955369613:
                b = !str.equals(m1211(Process.getGidForName("") + 865, AndroidCharacter.getMirror('0') - '*', (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40907)).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 1955530641:
                if (!str.equals(m1211(567 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 6 - TextUtils.indexOf("", "", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                    b = -1;
                } else {
                    int i18 = f1090 + 73;
                    f1087 = i18 % 128;
                    b = i18 % 2 == 0 ? (byte) 22 : (byte) 73;
                }
                break;
            case 2019413793:
                b = !str.equals(m1211((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 378, 31 - TextUtils.indexOf("", "", 0), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 2019599576:
                b = !str.equals(m1211(432 - (ViewConfiguration.getJumpTapTimeout() >> 16), 29 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case 2102577435:
                b = !str.equals(m1211((ViewConfiguration.getFadingEdgeLength() >> 16) + 1265, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 529)).intern()) ? (byte) -1 : (byte) 57;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case 8:
            case 9:
                return IronSourceBannerLayout.class;
            case 10:
                return ISBannerSize.class;
            case 11:
                return BannerSmashListener.class;
            case 12:
                return IronSource.class;
            case 13:
                return ImpressionData.class;
            case 14:
                return ImpressionDataListener.class;
            case 15:
            case 16:
                return DTBAdView.class;
            case 17:
                return LevelPlayBannerListener.class;
            case 18:
                return LevelPlayInterstitialListener.class;
            case 19:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 20:
                return LevelPlayRewardedVideoListener.class;
            case 21:
                return LevelPlayRewardedVideoManualListener.class;
            case 22:
                return AdInfo.class;
            case 23:
                return LevelPlayNativeAd.class;
            case 24:
                return NativeAdLayout.class;
            case 25:
                return LevelPlayNativeAdListener.class;
            case 26:
                return LevelPlayMediaView.class;
            case 27:
                return AdapterNativeAdData.class;
            case 28:
                return NativeAdViewHolder.class;
            case 29:
                return InternalNativeAdListener.class;
            case 30:
                return NativeAdAdapterInterface.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return NativeAdDataInterface.class;
            case 32:
                return NativeAdInteractionListener.class;
            case 33:
                return NativeAdInterface.class;
            case 34:
                return NativeAdLoadListener.class;
            case 35:
                return NativeAdSmashListener.class;
            case 36:
                return NativeAdViewBinderInterface.class;
            case 37:
                return AdData.class;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return LevelPlayAdInfo.class;
            case 39:
            case 40:
                return LevelPlayBannerAdView.class;
            case 41:
                return LevelPlayBannerAdViewListener.class;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return IronSourceAds.AdFormat.class;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return BannerAdInfo.class;
            case 44:
                return BannerAdRequest.class;
            case 45:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                return BannerAdView.class;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return BannerAdViewListener.class;
            case 48:
                return InterstitialAd.class;
            case 49:
                return InterstitialAdInfo.class;
            case 50:
                return InterstitialAdListener.class;
            case 51:
                return InterstitialAdRequest.class;
            case 52:
                return RewardedAd.class;
            case 53:
                return RewardedAdInfo.class;
            case 54:
                return RewardedAdListener.class;
            case 55:
                return RewardedAdRequest.class;
            case 56:
                return LevelPlayInterstitialAd.class;
            case 57:
                return LevelPlayInterstitialAdListener.class;
            case 58:
                return LevelPlayRewardedAd.class;
            case 59:
                return LevelPlayRewardedAdListener.class;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                return LevelPlayReward.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1090 + 57;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        String sDKVersion = IronSourceUtils.getSDKVersion();
        int i4 = f1090 + 5;
        f1087 = i4 % 128;
        if (i4 % 2 == 0) {
            return sDKVersion;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1211(1357 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bu.m1208((Placement) list.get(0));
            }
        });
        map.put(m1211(1373 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (11752 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bu.m1202((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m1211(TextUtils.lastIndexOf("", '0', 0, 0) + 1402, 21 - Color.alpha(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bu.m1204((ImpressionData) list.get(0));
            }
        });
        map.put(m1211(1422 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25, (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bu.m1205((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1211(1447 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bu.m1210((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1211(Gravity.getAbsoluteGravity(0, 0) + 1475, (ViewConfiguration.getPressedStateDuration() >> 16) + 19, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bu.m1209((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1211(1494 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 14, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bu.m1203((AdData) list.get(0));
            }
        });
        int i2 = f1090 + 33;
        f1087 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 17;
        com.ironsource.adqualitysdk.sdk.i.bu.f1090 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r4.getPlacementName();
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m1213(Placement placement) {
        int i = 2 % 2;
        int i2 = f1087;
        int i3 = i2 + 17;
        f1090 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1212(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f1087 + 97;
        f1090 = i2 % 128;
        if (i2 % 2 == 0) {
            ironSourceBannerLayout.getPlacementName();
            throw null;
        }
        String placementName = ironSourceBannerLayout.getPlacementName();
        int i3 = f1090 + 113;
        f1087 = i3 % 128;
        if (i3 % 2 == 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1201(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1087 + 23;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject allData = impressionData.getAllData();
        int i4 = f1087 + 1;
        f1090 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return allData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1214(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1087 + 89;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i4 = f1087 + 53;
        f1090 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1207(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1087 + InterfaceC0280i1.d.b.b;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i4 = f1087 + 71;
        f1090 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1206(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f1087 + 51;
        f1090 = i2 % 128;
        int i3 = i2 % 2;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        int i4 = f1087 + 51;
        f1090 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1200(AdData adData) {
        int i = 2 % 2;
        int i2 = f1090 + 15;
        f1087 = i2 % 128;
        if (i2 % 2 != 0) {
            adData.getServerData();
            throw null;
        }
        String serverData = adData.getServerData();
        int i3 = f1090 + 31;
        f1087 = i3 % 128;
        int i4 = i3 % 2;
        return serverData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1211(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1089[b.f638 + i]) ^ (((long) b.f638) * f1088)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
