package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenThemedActivity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinMediaView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.AppLovinMediationAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.adapters.MediationAdapterRouter;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class bm extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f914 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f915 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f916 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f917;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("\u0000A\ty\u0012b\u001bW$K-[6_?QH\u001bQ5Z1 Ø©à²û»Î\u0084Ò\u008dÂ\u0096Æ\u009fÈè\u0090ñ¬ýLôtïoæZÙFÐVËRÂ\\µ\u0004¬8§\u0001\u009e\u0007\u0091\u0004\u0088\u000f]/T*O3Fyy\tp\u0011k\nb\u001f\u0015k\fk\u0007\u007f>A1\u000e(X#VÚ½ÍµÄ°ÿ\u0099öÉé¹à\u0081\u009bú\u0092Ï\u0085û¼Û·Ï®Ñ¡ñ[-R\u0014E2|\tw\u0012\u0000A\tm\u0012D\u001br$A-Z6u?PH&Q%Z(c\fl\u0000u\u0019~\u001b\u0087õ\u0019f\u0010^\u000bE\u0002p=l4|/x&vQ&H\u0018C\tz!u9l!g-\u009eÉ\u0089Ã\u0080×»ä²à\u00adÒ¤ùß\u0095Ö\u0081Á\u0089ø¯ó¹ê\u00ad\u0000A\ty\u0012b\u001bW$K-[6_?QH\u0001Q?Z.c\u0006l\u001eu\u0006~\n\u0087î\u0090ä\u0099ð¢Ã«Ç´õ½ÙÆ\u0082Ï¦Ø¹á\u008dê\u0085ó\u0094-r$J?Q6d\tx\u0000h\u001bl\u0012be:|\u0006w*N<A6X%S&ªø½Ê´Ù\u008få\u0086ý\u0099é\u0090ëë\u0087Ö\u008eß¶Ä\u00adÍ\u0098ò\u0084û\u0094à\u0090é\u009e\u009eÆ\u0087ú\u008cÑµÅºÐ£Ê¨ÝQ)F&O\u001at\u0004}\u0017b\u000fk\u0017\u0010g\u0019e\u000ee\u0000A\ty\u0012b\u001bW$K-[6_?QH\tQ5Z\bc\u0006l\u001bu\u0014~\f\u0087ã\u0090Ü\u0099ð¢Ñ«ß´Ñ½ÓÆ£Ï½¾\u0094·¬¬·¥\u0082\u009a\u009e\u0093\u008e\u0088\u008a\u0081\u0084öÜïàäÙÝßÒÝËÅÀÄ9\u0002.)'-\u001c\u000e\u0015\u001c\n\u0000\u0003\u000bxxqVfd_GTKMCBG¸µ±©\u0000A\ty\u0012b\u001bW$K-[6_?QH\tQ5Z\tc\nl\u0016u\u0010u@|xgcnVQJXZC^JP=\b$4/\u000f\u0016\u001b\u0019\u001d\u0000\u0011t\u0083}»f o\u0095P\u0089Y\u0099B\u009dK\u0093<Ã%ý.û\u0017Ä\u0018À\u0001Ã\nÕó3ä;í!Ö\u0005ß\rÀ?É\u0011²p»h¬h\u0095P\u009e\\\u0087X\u0088Jr®{\u00adl¹\u0000A\ty\u0012b\u001bW$K-[6_?QH\u0001Q?Z.c\u0006l\u001eu\u0006~\n\u0087î\u0090ä\u0099ð¢Ã«Ç´õ½Ù¶\u000f¿7¤,\u00ad\u0019\u0092\u0005\u009b\u0015\u0080\u0011\u0089\u001fþQçzìvÕ{ÚKÃ^ÈG1\u0088&½/£\u0014\u0085\u001d\u0093\u0002\u0093\u000b\u0087pñ\u0000A\ty\u0012b\u001bW$K-[6_?QH\tQ5Z\tc\u0006l\u001eu\u0003~\u0017\u0087ä\u0090õ\u0099Ð¢Ï«Û´Ø\nÍ\u0003õ\u0018î\u0011Û.Ç'×<Ó5ÝB\u0085[¹P\u0080i\u0086f\u0085\u007f\u008et·\u008d}\u009ay\u0093{¨Z¡k¾Q·BÌ>Å&Ò:ë\bà\u0014\u0000A\ty\u0012b\u001bW$K-[6_?QH\u001eQ8Z>c\u0006l\u0003u#~\u0017\u0087â\u0090çÝÿÔÓÏúÆÌùÿðäëËâî\u0095\u0098\u008c\u009b\u0087\u0096¾²±¾¨§£¥ZKMgDJ\u007flvy\u0000A\ty\u0012b\u001bW$K-[6_?QH\tQ5Z\u0018c\u0002l\u001fu\u0010\u001b\u009a\u0012¿\t½\u0000\u008d?\u00976¬-\u0088$\u008dSèÕ\u0091Ü´Ç¶Î\u008eñ\u0096ø\u0085ã\u008fê\u0091\u009dç\u0084ù\u008fï¶Ë¹Ù È«ÎR\u001aE(\u0000M\th\u0012j\u001bI$A-Z6W?MH,Q4Z>c\"l\b\u0000M\th\u0012j\u001bZ$@-{6_?ZH?Q\u0018Z7c\u0013l\u0000\u0000M\th\u0012j\u001b]$Q-A6Z?LH+Q#Z?c\u0006l\u0002u4~\u001a\u0087Î\u0090ý\u0099é¢Îí ä\u0005ÿ\u0007ö7É-À!Û+Ò&¥@¼N·g\u008eo\u0081s\u0098y\u0093~j\u008f}\u0089t\u0091O½FµY\u0090P½+Û\"ÎMêDË_ÑVÕiâ`þ{ør÷\u0005\u0081\u001c¥\u0017\u0098.¶!½8»3ºÊEÝ~ÔSïuæ`¡~¨[³Yºi\u0085s\u008c\u007f\u0097u\u009exé\u001eð\u0010\u0000M\th\u0012j\u001bZ$@\u0000M\th\u0012j\u001bZ$@-k6Y?MH%Q0Z.\u0000M\th\u0012j\u001bZ$@-a6_?LH<Q4Z4c\u0006l\u001e\u0000M\th\u0012j\u001bZ$@-{6_?ZH?Q\u0010Z>c/l\u0005u\u0006~\n\u0087â\u0090þ\u0099ü¢Ð\u0000M\th\u0012j\u001bI$A-Z6W?MH,¶ÿ¿Ú¤Ø\u00adû\u0092ó\u009bè\u0080å\u0089ÿþ\u009eç\u0086ì\u008cÕ\u0090ÚºÃ\u008bÈ¥1F&V/N\u0014~\u001d|\u0002t\u0000M\tl\u0012v\u001br$E-Y6_?PH&Q\u0010Z>c\u0002l\u001cu\u0001~\u001b\u0087õ\u0090Ò\u0099ø¢Ñ«Î¨\u009b¡£º¸³\u008d\u008c\u0091\u0085\u0081\u009e\u0085\u0097\u008bàßùîòäËÐÄ×ÝÛÖÍ/28$1\u0002\n\u001c\u0003\u0010\u001c\u001e\u0015\u0013nygg~ÊwëlñeõZÂSÞHØA×6¡/\u0097$¹\u001d\u0085\u0012\u009b\u000b\u0086\u0000\u009cùrîEçqÜPÕXÊVÃH\u0000M\th\u0012j\u001bZ$@-{6_?ZH?Q\u0010Z>c\u0002l\u001cu\u0001~\u001b\u0087õDÃMæVä_Ü`Äi×rÝ{Ã\fµ\u0015«\u001e½'\u0099(\u008b1\u009a:\u009cÃHÔzÝvæ\\ïQð_ùAÌTÅqÞs×PèXáCúNóT\u00845\u009d-\u0096'¯; \u0011¹\r²\u0017Kê\\ìUòM\u008eD«_©V\u008bi\u008e`\u0089{\u009br\u009d\u0005ç\u001cÂ\u0017ë.Ï!Ù8ß3ÙÊ!Ý!\u0000M\th\u0012j\u001bZ$@-L6F?KH-Q#Z\nc\u0002l\u001eu\u0014~\u0013\u0087â\u0090ä\u0099ü¢Ð«Ød&m\u0003v\u0001\u007f1@+I'R-[ ,F5H>c\u0007m\bt\u0011n\u001azã\u0082ô\u0088ý\u0097Æ\u0099Ï¡Ð\u00adÙ·¢À«Á¼Ç\u0085ï\u008eó\u0097ë\u0000M\th\u0012j\u001bZ$@-L6F?KH-Q#Z\tc\nl\u000bu\u001b~\u001f\u0087ë\u0090Ó\u0099ö¢Î«Ç´Ñ½ÞÆ²Ï¦Ø·á\u008fêºó\u0092ü\u008e\u0006d\u000fc\u0018r!T*L3@<H¼\u0087µ¢® §\u0090\u0098\u008a\u0091\u0086\u008a\u008c\u0083\u0081ôçíéæÙßÇÐÏÉËÂÝ;,,6%:\u001e\u0012\u0017\u0000\b\n\u0001\u001ezcskdB]JVROX@[ºª³°¤¸\u009d\u0098\u0096\u0090éÎàëûéòÙÍÃÄÏßÅÖÈ¡®¸ ³\u0095\u008a\u0089\u0085\u009c\u009c\u0082\u0097\u0098njyvph¨W¡rºp³@\u008cZ\u0085a\u009eE\u0097@à%ù\nò$Ë\u0018Ä\u0006Ý\u001bÖ\u0001/ï8Æ1ê\nË\u0003Å\u001cË\u0015Én¹g§\u0000M\th\u0012j\u001bR$J-Y6S?MH;Q%Z3c\u0017l\u0005u\u0014~\u0012\u0087Æ\u0090ô\u0099ø¢Ò«ß´Ñ½ÏÆ\u008aÏ¦Ø«á\u0095ê\u008fó\u009dü\u0099\u0006w\u0000M\th\u0012j\u001bI$A-Z6W?MH,Q4Z>c\"l\bu\u0014~\u000e\u0087ó\u0090õ\u0099ë¢î«Â´Ç½ÉÆ£Ï¡Ø½á\u0093\u0091K\u0098n\u0083l\u008aNµK¼L§^®XÙ\"À\u0014Ë3ò\tý\u0006ä\u0016ï\u001b\u0016õ\u0001ÿ\bð3Ê:á%Û,ÈW´^¬I°p\u0082{\u009e\u0000M\th\u0012j\u001b^$V-_6Y?M\u0000A\ty\u0012b\u001bW$K-[6_?QH\nQ#Z5c\u0002l\bu\u0016~\u001f\u0087ô\u0090ä\u0099Ô¢Ã«Å´Õ½ÚÆ£Ï½\u0000A\ty\u0012b\u001bW$K-[6_?QH\nQ#Z5c\u0002l\bu\u0016~\u001f\u0087ô\u0090ä\u0099Ô¢Ã«Å´Õ½ÚÆ£Ï½Ø\u008aá\u0084ê\u0089ó\u0096ü\u0095\u0006s\u000fk\u0018e\u0000A\ty\u0012b\u001bW$K-[6_?QH\u000bQ>Z7c\u000el\u0019u\u001b~\u0017\u0087ä\u0090ñ\u0099í¢Í«Ù´ù½ØÆµÏ¼Ø¹á\u0086ê\u008f\u0000C\tf\u0012\u007f\u001bv$Q-C6_?\\H)Q%Z5c\u0011l!u\u0010~\r\u0087ô\u0090ñ\u0099þ¢Ç«â´Ù½ÍÆª\u0000A\ty\u0012b\u001bW$K-[6_?QH\u000bQ>Z7c\u000el\u0019u\u001b~\u0017\u0087ä\u0090ñ\u0099í¢Í«Ù\tÏ\u0000÷\u001bì\u0012Ù-Å$Õ?Ñ6ßA\u0085X°S¹j\u0080e\u0097|\u0095w\u0099\u008ej\u0099\u007f\u0090c«C¢W½i´FÏ*Æ2Ñ5è\u001dã\rú\u001fõ\u0017\u000fù\u009dÎ\u0094ö\u008fí\u0086Ø¹Ä°Ô«Ð¢ÞÕ\u0084Ì±Ç¸þ\u0081ñ\u0096è\u0094ã\u0098\u001ak\r~\u0004b?B6V)k G[+R,E>|\u001dw\rn\u0019a\u0001\u0000A\ty\u0012b\u001bW$K-[6_?QH\u000bQ>Z7c\u000el\u0019u\u001b~\u0017\u0087ä\u0090ñ\u0099í¢Í«Ù´ù½ØÆµÏ¼Ø¹á\u0086ê\u0083ó\u009dü\u009b\u0006V\u000fk\u0018e!V*@3Q<^Wå^ÝEÆLósïzÿaûhõ\u001f¯\u0006\u009a\r\u00934ª;½\"¿)³Ð@ÇUÎIõiü}ãUêw\u0091\u0016\u0098\u0002\u008f\b¶<\u0000A\ty\u0012b\u001bW$K-[6_?QH\u000eQ$Z6c\u000fl\u001fu\u0016~\f\u0087â\u0090õ\u0099÷¢ö«Ã´Ñ½ÐÆ£Ï«Ø\u0099á\u0082ê\u009eó\u009aü\u008a\u0006l\u000fz\u0018naÛhÞsÇz\u008dEýLåWþ^ë)\u009f0\u009f;\u008b\u0002µ\rú\u0014¬\u001f¢æIñAøDÃmÊ=ÕMÜu§\u000e®;¹\u000f\u0080/\u008b;\u0092%\u009d\u0002gÈnÚyÃ@ëKòRø]æ$\u0099/\u009b6º\u0001\u008f\bµ\u0013¤\u001a§å_ìu÷NþRÉvÐ~Ûh¢\u000e\u00ad\n\u0003«\n\u008e\u0011\u008c\u0018³'£.¿5¹<¯KËRöYØ\u0087º\u008e\u009f\u0095\u009d\u009c¢£²ª®±¨¸¾ÏÚÖçÝÉäØëòòñùý\u0000\u0015\u0017\t\u001e\u000b%'$à-Å6Ç?ø\u0000è\tô\u0012ò\u001bäl\u0080u½~\u0093G\u0082H®Q¹Z·£O´O\u008d£\u0084\u0086\u009f\u0084\u0096»©« ·»±²§ÅÃÜþ×ÐîÄáïøëóü\u0000M\th\u0012j\u001bU$E-Y6_?IH-Q\u0010Z>c5l\u0005u\u0010~\tO\u001bF\u001e]\u0007TMk=b%y>p+\u0007_\u001e_\u0015K,u#::`1cÈ\u009bß\u0081Ö\u0080í®äºû£ò«\u0089\u0090\u0080Ù\u0097Á®í¥û¼ý³áI<@\u0012W\u001cnve\u001c|+s;\nr\u0001T\u0018Z/N&f=l4CË\u009fÂ¢Ù\u0084Ð\u0083ç¨\u0086\"\u008f\u0007\u0094\u0005\u009d:¢*«6°0¹&ÎB×\u007fÜQåZêjó\u007føf\u0001ª\u0016\u0096\u001f\u0098$©-¡2©\u0000A\ty\u0012b\u001bW$K-[6_?QH\u0006Q0Z.c\nl\u001au\u0010~?\u0087ãÊlÃTØOÑzîfçvürõ|\u0082+\u009b\u001d\u0090\u0003©'¦7¿=´\u0012MÎZøSÂhêaè~íwÜ\f\u0082\u0005\u0091\u0012\u0081+© ©9»6£\u0000A\ty\u0012b\u001bW$K-[6_?QH\u0006Q0Z.c\nl\u001au\u0010~?\u0087ã\u0090Ã\u0099ü¢Ð«Ý´Ý½ÞÆ£\u0000A\ty\u0012b\u001bW$K-[6_?QH\u0005Q4Z>c\nl\ru#~\u0017\u0087â\u0090ç©~ F»]²h\u008dt\u0084d\u009f`\u0096ná!ø\u000fó\u0016Ê(Å\u001eÜ/×%.Ñ9Î0ð\u000bô\u0002ñ\u001düM\u0005D=_&V\u0013i\u000f`\u001f{\u001br\u0015\u0005B\u001ct\u0017j.N!^8T3{Ê§Ý\u009dÔ°ï\u0096æ\u0083xÑqËjÇcÏ\\êUåNÿuú|ñgÒnäQÜXíC¼JÆ=Ç$©/\u009a\u0016ã\u0000s\tl\u0012f\u001bZ$@-n6Z?VH+Q:Z\u0016c\nl\u001fu\u0001~\u001b\u0087é\u0090õ\u0099ë\u0000s\tl\u0012f\u001bZ$@-{6_?[H-Q>Z\nc\u000fl\ru\f~\u001c\u0087æ\u0090ó\u0099ò¢î«Â´Ç½ÉÆ£Ï¡Ø½á\u0093\u0000s\tl\u0012f\u001bZ$@-i6_?LH8Q=Z;c\u001al u\u001c~\r\u0087ó\u0090õ\u0099÷¢Ç«Ù\u0000g\tl\u0012f\u001bZ$@-{6_?ZH?Q\u0012Z5c\rl\u0018u\u0007~\u0011\u0087ë\u0090ü\u0099ü¢Ð\u0000g\tl\u0012f\u001bZ$@-d6R?qH=Q<Z8c\u0006l\u001e6=?6$<-\u0012\u0012\u0017\u001b\r\u0000\t\u0000g\tl\u0012f\u001bO$]-]6SçÏîÄõÎüéÃãÊëÑûØÞ¯\u0084.g'l<f5X\nV\u0003H\u0018W\u0011Kf!\u007f't?M*B\b\u0000i\tz\u0012D\u001br$@-H6Y?~H,\u0000i\tz\u0012P\u001bz$J-C6S?MýßôÌïíæÃÙñÐþËîÂýµ\u0097¬\u0091§\u0085\u009e¯\u0091¿\u0088§\u0083\u0089zU\u0000g\tl\u0012f\u001bZ$T-]6z?PH>Q8Z4c!l\u001eu\u001a~\u001f\u0087ã\u0090ó\u0099ø¢Ñ«ß´ù½ÜÆ¨Ï®Ø¿á\u0084ê\u0098÷<þ\"å;ì<Ó\u0019Ú\u0017Á\u001dÈ\u0003¿G¦o\u00add\u0094a\u009bM\u0082M\u0089Yp§g\u009cn¥U\u0083\\\u0084C\u009eJ\u00901é8ò/â\u0016ý\u001dÁ\u0004Þ\u000b×ñ\"ø6ï<Ö\u001c?è6ú-ý$ã\u001bÞ\u0012Ù\tØ\u0000Öw°n¾e\u0086\\\u008eS\u0081J¤A\u008c¸l¯d¦j\u009d}\u0094D\u008bF\u0082Aù?ð1ç$Þ\u000fÕ\u0003Ì<Ã\u00049û0ö'ã\u001eË\u0015Ñ\fÝXoQdJnCR|\\uUnrgX\u00106\t0\u0002<;(4\u000b-\u0010&\u001bßúÈöÁøúÉóÂìÈåÚ\u009e¼\u0097\u008a\u0080µ¹\u009a²\u0091«\u009a¤\u0093^hWB@~y\\r@\u0000s\t|\u0012p\u001bh$G-_6_?]H-Q\u0005Z5c\"l\u001cu\u0005~2\u0087è\u0090æ\u0099ð¢Ì«è´Û½ÐÆ«ÏºØ¶á\u0088ê\u0089ó\u0092ü\u0088\u0006j\u000f|\u0000g\tl\u0012f\u001bU$E-Y6_?IH-Q\u0010Z>c.l\ru\u001c~\u0010\u0087Î\u0090ý\u0099ø¢Å«Î´á½ÏÆ¯\u0000s\tl\u0012f\u001bU$E-Y6_?IH-Q\u0010Z>c&l\u001au\u0010~\u0010\u0087ó\u0090Ü\u0099ð¢Ñ«ß´Ñ½ÓÆ£Ï½©\u0012 \u0019»\u0013² \u008d0\u0084,\u009f*\u0096<áXøeóKÊ_ÅzÜo×e.§9\u00970\u0085".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2053);
        f917 = cArr;
        f915 = 4137501266821581065L;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ boolean m958(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f914 + 3;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM952 = m952(appLovinAd);
        int i4 = f914 + 83;
        f916 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return zM952;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ long m960(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f914 + 55;
        f916 = i2 % 128;
        if (i2 % 2 == 0) {
            m959(appLovinAd);
            throw null;
        }
        long jM959 = m959(appLovinAd);
        int i3 = f916 + 85;
        f914 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return jM959;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AdViewController m961(AppLovinAdView appLovinAdView) {
        int i = 2 % 2;
        int i2 = f916 + 87;
        f914 = i2 % 128;
        if (i2 % 2 != 0) {
            m974(appLovinAdView);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        AdViewController adViewControllerM974 = m974(appLovinAdView);
        int i3 = f916 + 65;
        f914 = i3 % 128;
        int i4 = i3 % 2;
        return adViewControllerM974;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m963(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f914 + 71;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        m970(appLovinBroadcastManager, receiver, intentFilter);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m964(bm bmVar, Context context, String str, String str2) {
        int i = 2 % 2;
        int i2 = f916 + 79;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        bmVar.m962(context, str, str2);
        int i4 = f916 + 93;
        f914 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Bundle m966(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = 2 % 2;
        int i2 = f914 + 107;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleM980 = m980(communicatorMessageImpl);
        int i4 = f916 + 73;
        f914 = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleM980;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m967(MaxAd maxAd) {
        int i = 2 % 2;
        int i2 = f916 + 9;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        String strM982 = m982(maxAd);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = f914 + 69;
        f916 = i5 % 128;
        int i6 = i5 % 2;
        return strM982;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m968(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i = 2 % 2;
        int i2 = f914 + 105;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        m976(adViewController, appLovinAdDisplayListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m969(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i = 2 % 2;
        int i2 = f916 + 55;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        m992(appLovinBroadcastManager, receiver);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f914 + InterfaceC0280i1.d.b.i;
        f916 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m972(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 77;
        f914 = i2 % 128;
        if (i2 % 2 != 0) {
            m953(appLovinAd);
            throw null;
        }
        boolean zM953 = m953(appLovinAd);
        int i3 = f916 + 45;
        f914 = i3 % 128;
        int i4 = i3 % 2;
        return zM953;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Uri m973(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f914 + 63;
        f916 = i2 % 128;
        if (i2 % 2 != 0) {
            return m965(appLovinNativeAdImpl);
        }
        m965(appLovinNativeAdImpl);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdType m975(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f914 + 25;
        f916 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m955(appLovinAd);
            super.hashCode();
            throw null;
        }
        AppLovinAdType appLovinAdTypeM955 = m955(appLovinAd);
        int i3 = f916 + 41;
        f914 = i3 % 128;
        if (i3 % 2 == 0) {
            return appLovinAdTypeM955;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m977(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i = 2 % 2;
        int i2 = f914 + 61;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        m990(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f916 + 59;
        f914 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Uri m979(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f916 + 125;
        f914 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m986(appLovinNativeAdImpl);
            super.hashCode();
            throw null;
        }
        Uri uriM986 = m986(appLovinNativeAdImpl);
        int i3 = f914 + 19;
        f916 = i3 % 128;
        if (i3 % 2 != 0) {
            return uriM986;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AppLovinBroadcastManager m981(Context context) {
        int i = 2 % 2;
        int i2 = f916 + 115;
        f914 = i2 % 128;
        if (i2 % 2 == 0) {
            return m987(context);
        }
        m987(context);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m983(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f914 + 31;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        String strM957 = m957(appLovinAd);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = f916 + InterfaceC0280i1.d.b.i;
        f914 = i5 % 128;
        if (i5 % 2 == 0) {
            return strM957;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m984(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = 2 % 2;
        int i2 = f916 + 1;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        m971(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        int i4 = f914 + 41;
        f916 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m985(bm bmVar, AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 49;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM954 = m954(appLovinAd);
        int i4 = f914 + 115;
        f916 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return zM954;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdSize m988(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 125;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdSize appLovinAdSizeM956 = m956(appLovinAd);
        int i4 = f914 + 47;
        f916 = i4 % 128;
        int i5 = i4 % 2;
        return appLovinAdSizeM956;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m991(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = 2 % 2;
        int i2 = f914 + 3;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        m978(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        int i4 = f914 + 55;
        f916 = i4 % 128;
        int i5 = i4 % 2;
    }

    public bm(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0791  */
    /* JADX WARN: Code duplicated, block: B:202:0x0a34  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2080431557:
                b = !str.equals(m989(MotionEvent.axisFromString("") + 1098, 27 - TextUtils.getOffsetAfter("", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 54;
                break;
            case -2043340463:
                b = !str.equals(m989((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 980, 25 - Process.getGidForName(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 49;
                break;
            case -2004957298:
                b = !str.equals(m989(KeyEvent.getDeadChar(0, 0) + 671, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (43225 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -1881559119:
                b = !str.equals(m989((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1624, 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19779)).intern()) ? (byte) -1 : (byte) 75;
                break;
            case -1833485839:
                b = !str.equals(m989(TextUtils.getOffsetBefore("", 0) + 1518, Drawable.resolveOpacity(0, 0) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 70;
                break;
            case -1467734148:
                if (!str.equals(m989(TextUtils.lastIndexOf("", '0', 0, 0) + 165, (ViewConfiguration.getLongPressTimeout() >> 16) + 25, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 54991)).intern())) {
                    b = -1;
                } else {
                    int i2 = f914 + 71;
                    f916 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 8;
                }
                break;
            case -1450375470:
                if (!str.equals(m989((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1382, Color.argb(0, 0, 0, 0) + 19, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 34807)).intern())) {
                    b = -1;
                } else {
                    int i4 = f914 + 15;
                    f916 = i4 % 128;
                    if (i4 % 2 != 0) {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    } else {
                        b = 67;
                    }
                }
                break;
            case -1375681914:
                b = !str.equals(m989((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 304, ExpandableListView.getPackedPositionType(0L) + 22, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1352001524:
                b = !str.equals(m989(KeyEvent.getDeadChar(0, 0) + 487, Color.red(0) + 13, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1287385676:
                if (!str.equals(m989(1167 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 31, (char) (TextUtils.indexOf((CharSequence) "", '0') + 2447)).intern())) {
                    b = -1;
                } else {
                    int i5 = f916 + 89;
                    f914 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 57;
                }
                break;
            case -1229948432:
                b = !str.equals(m989(213 - TextUtils.indexOf("", "", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, (char) (View.MeasureSpec.getMode(0) + 48853)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1201363365:
                if (!str.equals(m989(589 - KeyEvent.keyCodeFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, (char) TextUtils.getOffsetBefore("", 0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f916 + 13;
                    f914 = i7 % 128;
                    if (i7 % 2 == 0) {
                        b = Ascii.US;
                    } else {
                        b = 23;
                    }
                }
                break;
            case -1179967667:
                b = !str.equals(m989(1497 - View.MeasureSpec.makeMeasureSpec(0, 0), 21 - (Process.myTid() >> 22), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 34415)).intern()) ? (byte) -1 : (byte) 69;
                break;
            case -1153520596:
                b = !str.equals(m989(TextUtils.lastIndexOf("", '0', 0) + 1148, View.MeasureSpec.makeMeasureSpec(0, 0) + 20, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 56;
                break;
            case -1109694355:
                b = !str.equals(m989(271 - TextUtils.indexOf((CharSequence) "", '0', 0), View.resolveSize(0, 0) + 32, (char) (Color.blue(0) + 29890)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1073613085:
                b = !str.equals(m989(602 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, (char) Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1046364472:
                b = !str.equals(m989(TextUtils.indexOf("", "") + 651, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -998829219:
                b = !str.equals(m989(TextUtils.getOffsetAfter("", 0) + 1226, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 59;
                break;
            case -922738309:
                b = !str.equals(m989((ViewConfiguration.getTouchSlop() >> 8) + 35, (ViewConfiguration.getTapTimeout() >> 16) + 34, (char) (23884 - Color.green(0))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -859912744:
                b = !str.equals(m989(1320 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 52, (char) (25016 - View.getDefaultSize(0, 0))).intern()) ? (byte) -1 : (byte) 62;
                break;
            case -812800838:
                b = !str.equals(m989(11 - KeyEvent.normalizeMetaState(0), 10 - TextUtils.indexOf("", "", 0), (char) (41112 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -781635730:
                b = !str.equals(m989(113 - View.resolveSizeAndState(0, 0, 0), 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -702340466:
                if (!str.equals(m989(1448 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 48, (char) (20344 - (ViewConfiguration.getEdgeSlop() >> 16))).intern())) {
                    b = -1;
                } else {
                    int i8 = f914 + 35;
                    f916 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 68;
                }
                break;
            case -558305015:
                b = !str.equals(m989(629 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, (char) (46770 - View.MeasureSpec.getMode(0))).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -529676547:
                b = !str.equals(m989((ViewConfiguration.getScrollBarSize() >> 8) + 1534, TextUtils.indexOf("", "", 0) + 29, (char) (View.MeasureSpec.getMode(0) + 51757)).intern()) ? (byte) -1 : (byte) 71;
                break;
            case -515103971:
                b = !str.equals(m989(TextUtils.getCapsMode("", 0, 0) + 773, Color.blue(0) + 17, (char) (19907 - TextUtils.indexOf("", "", 0))).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -499617006:
                b = !str.equals(m989(1065 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 53;
                break;
            case -490511554:
                b = !str.equals(m989(1419 - TextUtils.getOffsetAfter("", 0), (Process.myTid() >> 22) + 15, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36334)).intern()) ? (byte) -1 : (byte) 66;
                break;
            case -490128445:
                if (!str.equals(m989(1434 - Color.green(0), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.MeasureSpec.getSize(0)).intern())) {
                    b = -1;
                } else {
                    b = 67;
                }
                break;
            case -388222861:
                b = !str.equals(m989((ViewConfiguration.getScrollDefaultDelay() >> 16) + 950, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -313801005:
                b = !str.equals(m989((Process.myPid() >> 22) + 457, 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (54748 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case -294317262:
                b = !str.equals(m989(TextUtils.indexOf((CharSequence) "", '0') + 86, 28 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6438)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -292897006:
                b = !str.equals(m989(1124 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 55;
                break;
            case -265039036:
                b = !str.equals(m989(69 - (Process.myTid() >> 22), 16 - View.getDefaultSize(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -155576673:
                b = !str.equals(m989((ViewConfiguration.getPressedStateDuration() >> 16) + 733, 22 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (17550 - (ViewConfiguration.getTouchSlop() >> 8))).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -62837376:
                b = !str.equals(m989((ViewConfiguration.getPressedStateDuration() >> 16) + 695, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, (char) (32391 - (ViewConfiguration.getTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 9498927:
                b = !str.equals(m989(Color.rgb(0, 0, 0) + 16777586, 27 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (2700 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 74118279:
                b = !str.equals(m989(573 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 5, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case 113294717:
                b = !str.equals(m989(((Process.getThreadPriority(0) + 20) >> 6) + 755, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, (char) (TextUtils.indexOf((CharSequence) "", '0') + 52250)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 113748919:
                if (!str.equals(m989(926 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, (char) (Drawable.resolveOpacity(0, 0) + 43034)).intern())) {
                    b = -1;
                } else {
                    int i10 = f916 + 121;
                    f914 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 47;
                }
                break;
            case 148784004:
                b = !str.equals(m989(1562 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 72;
                break;
            case 404925231:
                b = !str.equals(m989(Color.red(0) + 1262, 26 - Color.alpha(0), (char) (22436 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 60;
                break;
            case 448683812:
                b = !str.equals(m989((ViewConfiguration.getEdgeSlop() >> 16) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (Process.myPid() >> 22) + 8, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 51;
                break;
            case 572995203:
                b = !str.equals(m989((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 12, (char) Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 605983675:
                b = !str.equals(m989(TextUtils.getOffsetAfter("", 0) + 838, View.MeasureSpec.getMode(0) + 36, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case 729244021:
                b = !str.equals(m989(TextUtils.getOffsetAfter("", 0) + 519, 23 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60781)).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 735058557:
                b = !str.equals(m989(543 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21, (char) ((Process.myPid() >> 22) + 19879)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case 752486192:
                b = !str.equals(m989((ViewConfiguration.getTapTimeout() >> 16) + 1197, Gravity.getAbsoluteGravity(0, 0) + 29, (char) (ExpandableListView.getPackedPositionGroup(0L) + 40335)).intern()) ? (byte) -1 : (byte) 58;
                break;
            case 794586549:
                b = !str.equals(m989((ViewConfiguration.getTapTimeout() >> 16) + 790, 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case 896010188:
                b = !str.equals(m989(448 - (ViewConfiguration.getLongPressTimeout() >> 16), 8 - ImageFormat.getBitsPerPixel(0), (char) (ExpandableListView.getPackedPositionChild(0L) + 7128)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 983006005:
                if (!str.equals(m989(TextUtils.lastIndexOf("", '0') + 875, ImageFormat.getBitsPerPixel(0) + 35, (char) (Color.red(0) + 48330)).intern())) {
                    b = -1;
                } else {
                    int i12 = f916 + 97;
                    f914 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 45;
                }
                break;
            case 1003087195:
                b = !str.equals(m989(TextUtils.indexOf("", "", 0) + 349, Color.alpha(0) + 21, (char) TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1072916356:
                b = !str.equals(m989((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 414, 20 - KeyEvent.keyCodeFromString(""), (char) (56766 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1152082353:
                b = !str.equals(m989((ViewConfiguration.getJumpTapTimeout() >> 16) + 1402, 16 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 9389)).intern()) ? (byte) -1 : (byte) 65;
                break;
            case 1234617814:
                b = !str.equals(m989(810 - (Process.myTid() >> 22), 28 - TextUtils.indexOf("", "", 0, 0), (char) (25706 - ExpandableListView.getPackedPositionChild(0L))).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 1265496546:
                b = !str.equals(m989(Color.alpha(0) + 500, 18 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 1278030609:
                b = str.equals(m989(326 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23 - View.combineMeasuredStates(0, 0), (char) (46670 - View.combineMeasuredStates(0, 0))).intern()) ? Ascii.SI : (byte) -1;
                break;
            case 1318309173:
                if (!str.equals(m989(AndroidCharacter.getMirror('0') + 426, 13 - (KeyEvent.getMaxKeyCode() >> 16), (char) KeyEvent.normalizeMetaState(0)).intern())) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 1337781577:
                b = !str.equals(m989(397 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 17, (char) Color.alpha(0)).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1342402498:
                b = !str.equals(m989(140 - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - ExpandableListView.getPackedPositionType(0L), (char) (11571 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1342953158:
                b = !str.equals(m989(ImageFormat.getBitsPerPixel(0) + 1604, KeyEvent.keyCodeFromString("") + 21, (char) (43327 - (ViewConfiguration.getEdgeSlop() >> 16))).intern()) ? (byte) -1 : (byte) 74;
                break;
            case 1383609003:
                b = !str.equals(m989((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 433, View.MeasureSpec.getSize(0) + 14, (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1384123355:
                b = !str.equals(m989(244 - View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case 1384168212:
                b = !str.equals(m989((ViewConfiguration.getPressedStateDuration() >> 16) + 258, TextUtils.getCapsMode("", 0, 0) + 14, (char) (29953 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case 1384212095:
                b = !str.equals(m989(View.combineMeasuredStates(0, 0) + 21, View.resolveSize(0, 0) + 14, (char) (64781 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1384605075:
                b = !str.equals(m989(621 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 10, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1450884094:
                b = !str.equals(m989(1372 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - Color.blue(0), (char) (ExpandableListView.getPackedPositionType(0L) + DescriptorProtos.Edition.EDITION_PROTO2_VALUE)).intern()) ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                break;
            case 1620186974:
                b = !str.equals(m989(579 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 11 - (Process.myTid() >> 22), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : Ascii.RS;
                break;
            case 1724415069:
                b = !str.equals(m989(190 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1753212735:
                b = !str.equals(m989((KeyEvent.getMaxKeyCode() >> 16) + 908, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, (char) (59778 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 1880938499:
                b = !str.equals(m989((ViewConfiguration.getFadingEdgeLength() >> 16) + IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, Color.alpha(0) + 24, (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 52;
                break;
            case 1944524259:
                b = !str.equals(m989(View.resolveSizeAndState(0, 0, 0) + 717, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1991372702:
                b = !str.equals(m989(((byte) KeyEvent.getModifierMetaStateMask()) + 1007, View.MeasureSpec.getMode(0) + 27, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37126)).intern()) ? (byte) -1 : (byte) 50;
                break;
            case 2016893291:
                b = !str.equals(m989(563 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 9 - MotionEvent.axisFromString(""), (char) (41267 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.FS;
                break;
            case 2063749596:
                b = !str.equals(m989((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1288, 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()) ? (byte) -1 : Base64.padSymbol;
                break;
            case 2145283122:
                b = !str.equals(m989(1586 - View.resolveSize(0, 0), 17 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 73;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return AppLovinSdk.class;
            case 1:
                return AppLovinAd.class;
            case 2:
            case 3:
                return AppLovinAdView.class;
            case 4:
                return AdViewController.class;
            case 5:
                return AppLovinInterstitialActivity.class;
            case 6:
                return AppLovinInterstitialAdDialog.class;
            case 7:
                return AppLovinAdClickListener.class;
            case 8:
                return AppLovinAdDisplayListener.class;
            case 9:
                return AppLovinAdRewardListener.class;
            case 10:
                return AppLovinAdVideoPlaybackListener.class;
            case 11:
                return AppLovinAdSize.class;
            case 12:
                return AppLovinAdType.class;
            case 13:
                return AppLovinIncentivizedInterstitial.class;
            case 14:
                return AppLovinInterstitialAd.class;
            case 15:
                return AppLovinWebViewActivity.class;
            case 16:
                return AppLovinAdServiceImpl.class;
            case 17:
                return AppLovinAdViewEventListener.class;
            case 18:
                return AppLovinVideoView.class;
            case 19:
                return AdViewControllerImpl.class;
            case 20:
                return AppLovinAdBase.class;
            case 21:
                return MaxAdView.class;
            case 22:
                return MaxInterstitialAd.class;
            case 23:
                return MaxRewardedAd.class;
            case 24:
                return MaxAdViewImpl.class;
            case 25:
                return MaxFullscreenAdImpl.class;
            case 26:
                return MaxAdapterParametersImpl.class;
            case 27:
                return MediationServiceImpl.class;
            case 28:
                return MaxAdapter.class;
            case 29:
                return MaxAd.class;
            case 30:
                return MaxAdFormat.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return MaxAdListener.class;
            case 32:
                return MaxAdViewAdListener.class;
            case 33:
                return MaxReward.class;
            case 34:
                return MaxRewardedAdListener.class;
            case 35:
                return MediationAdapterBase.class;
            case 36:
                int i14 = f914 + 121;
                f916 = i14 % 128;
                int i15 = i14 % 2;
                return AppLovinMediationAdapter.class;
            case 37:
                return MediationAdapterRouter.class;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return MaxAdViewAdapter.class;
            case 39:
                return MaxInterstitialAdapter.class;
            case 40:
                return MaxRewardedAdapter.class;
            case 41:
                return MaxSignalProvider.class;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return MaxAdapterParameters.class;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return MaxAdapterResponseParameters.class;
            case 44:
                return MaxAdapterSignalCollectionParameters.class;
            case 45:
                return MaxAdapterInitializationParameters.class;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                return MaxAdapterListener.class;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return MaxAdViewAdapterListener.class;
            case 48:
                return MaxInterstitialAdapterListener.class;
            case 49:
                return MaxRewardedAdapterListener.class;
            case 50:
                return MaxSignalCollectionListener.class;
            case 51:
                return MaxError.class;
            case 52:
                return AppLovinBroadcastManager.class;
            case 53:
                return AppLovinBroadcastManager.Receiver.class;
            case 54:
                return AppLovinCommunicatorMessage.class;
            case 55:
                return CommunicatorMessageImpl.class;
            case 56:
                return AppLovinCommunicator.class;
            case 57:
                return AppLovinCommunicatorSubscriber.class;
            case 58:
                return AppLovinCommunicatorPublisher.class;
            case 59:
                return AppLovinCommunicatorMessagingService.class;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                int i16 = f916 + 107;
                f914 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 94 / 0;
                }
                return AppLovinCommunicatorEntity.class;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                return AppLovinFullscreenThemedActivity.class;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                int i18 = f916 + 59;
                f914 = i18 % 128;
                int i19 = i18 % 2;
                return MaxNativeAd.class;
            case 64:
                return MaxNativeAdListener.class;
            case 65:
                return MaxNativeAdLoader.class;
            case 66:
                return MaxNativeAdImpl.class;
            case 67:
            case 68:
                return MaxNativeAdView.class;
            case 69:
                return MaxNativeAdViewBinder.class;
            case 70:
                return AppLovinNativeAd.class;
            case 71:
                return AppLovinNativeAdEventListener.class;
            case 72:
                return AppLovinNativeAdService.class;
            case 73:
                return AppLovinMediaView.class;
            case 74:
                return AppLovinVastMediaView.class;
            case 75:
                return AppLovinNativeAdImpl.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f914 + 25;
        f916 = i2 % 128;
        try {
            try {
                return (String) (i2 % 2 == 0 ? AppLovinSdk.class.getDeclaredField(m989(22242 / (KeyEvent.getMaxKeyCode() >> 29), 106 / View.resolveSize(1, 0), (char) (9421 << View.resolveSize(1, 0))).intern()) : AppLovinSdk.class.getDeclaredField(m989((KeyEvent.getMaxKeyCode() >> 16) + 1644, View.resolveSize(0, 0) + 7, (char) (View.resolveSize(0, 0) + 30855)).intern())).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2296().m2297().m2344(AppLovinSdk.class, m989(1651 - View.getDefaultSize(0, 0), 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (30116 - View.MeasureSpec.getSize(0))).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m989(1663 - View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m977((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m989(1681 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + 26, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m991((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m989(KeyEvent.normalizeMetaState(0) + 1707, ImageFormat.getBitsPerPixel(0) + 21, (char) KeyEvent.getDeadChar(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m968((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m989(1727 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m961((AppLovinAdView) list.get(0));
            }
        });
        map.put(m989(1746 - TextUtils.indexOf("", "", 0), MotionEvent.axisFromString("") + 14, (char) TextUtils.indexOf("", "", 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Long.valueOf(bm.m960((AppLovinAd) list.get(0)));
            }
        });
        map.put(m989(1759 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 6 - MotionEvent.axisFromString(""), (char) (13914 - Color.red(0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m988((AppLovinAd) list.get(0));
            }
        });
        map.put(m989((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1766, (ViewConfiguration.getTapTimeout() >> 16) + 7, (char) Drawable.resolveOpacity(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m975((AppLovinAd) list.get(0));
            }
        });
        map.put(m989(View.getDefaultSize(0, 0) + 1773, 9 - ExpandableListView.getPackedPositionGroup(0L), (char) (59305 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m983((AppLovinAd) list.get(0));
            }
        });
        map.put(m989(1783 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (11775 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.25
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m967((MaxAd) list.get(0));
            }
        });
        map.put(m989((ViewConfiguration.getEdgeSlop() >> 16) + 1795, 9 - View.MeasureSpec.getMode(0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bm.m972((AppLovinAd) list.get(0)));
            }
        });
        map.put(m989(TextUtils.indexOf((CharSequence) "", '0', 0) + 1805, TextUtils.lastIndexOf("", '0', 0, 0) + 9, (char) Color.red(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bm.m985(bm.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m989(1811 - ExpandableListView.getPackedPositionChild(0L), View.getDefaultSize(0, 0) + 16, (char) (Color.argb(0, 0, 0, 0) + 64950)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bm.m958((AppLovinAd) list.get(0)));
            }
        });
        map.put(m989(Color.red(0) + 1828, 26 - MotionEvent.axisFromString(""), (char) TextUtils.getTrimmedLength("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m981((Context) list.get(0));
            }
        });
        map.put(m989(1855 - Color.alpha(0), 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 63311)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m963((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m989(View.resolveSize(0, 0) + 1888, 35 - Color.green(0), (char) (16285 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m969((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m989(1923 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) (View.resolveSizeAndState(0, 0, 0) + 22536)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m966((CommunicatorMessageImpl) list.get(0));
            }
        });
        map.put(m989((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1956, 31 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.MeasureSpec.getMode(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m964(bm.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m989((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1988, 23 - TextUtils.getOffsetAfter("", 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m979((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m989(2011 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.combineMeasuredStates(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bm.m984((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m989(2035 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, (char) (43381 - (ViewConfiguration.getTouchSlop() >> 8))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bm.m973((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i2 = f914 + 93;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m990(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i = 2 % 2;
        int i2 = f914 + InterfaceC0280i1.d.b.g;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i4 = f914 + 45;
        f916 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m978(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = 2 % 2;
        int i2 = f914 + 47;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        int i4 = f916 + 123;
        f914 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m976(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i = 2 % 2;
        int i2 = f916 + 5;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdViewController m974(AppLovinAdView appLovinAdView) {
        int i = 2 % 2;
        int i2 = f916 + 107;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        int i4 = f916 + 99;
        f914 = i4 % 128;
        if (i4 % 2 == 0) {
            return adViewController;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long m959(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 1;
        f914 = i2 % 128;
        if (i2 % 2 != 0) {
            appLovinAd.getAdIdNumber();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        long adIdNumber = appLovinAd.getAdIdNumber();
        int i3 = f916 + 31;
        f914 = i3 % 128;
        int i4 = i3 % 2;
        return adIdNumber;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdSize m956(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 59;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdSize size = appLovinAd.getSize();
        int i4 = f916 + 99;
        f914 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static AppLovinAdType m955(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 47;
        f914 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            appLovinAd.getType();
            super.hashCode();
            throw null;
        }
        AppLovinAdType type = appLovinAd.getType();
        int i3 = f914 + 51;
        f916 = i3 % 128;
        if (i3 % 2 != 0) {
            return type;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m957(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f914 + 113;
        f916 = i2 % 128;
        if (i2 % 2 == 0) {
            appLovinAd.getZoneId();
            throw null;
        }
        String zoneId = appLovinAd.getZoneId();
        int i3 = f914 + 61;
        f916 = i3 % 128;
        int i4 = i3 % 2;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m982(MaxAd maxAd) {
        int i = 2 % 2;
        int i2 = f914 + 79;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        String creativeId = maxAd.getCreativeId();
        int i4 = f914 + 25;
        f916 = i4 % 128;
        if (i4 % 2 != 0) {
            return creativeId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m953(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916 + 77;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = f914 + 83;
        f916 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m954(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        if (appLovinAd == null) {
            return false;
        }
        int i2 = f916 + 63;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        if (m956(appLovinAd) == AppLovinAdSize.BANNER) {
            return true;
        }
        int i4 = f914 + 35;
        f916 = i4 % 128;
        int i5 = i4 % 2;
        return m956(appLovinAd) == AppLovinAdSize.LEADER || m956(appLovinAd) == AppLovinAdSize.MREC;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m952(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f916;
        int i3 = i2 + 95;
        f914 = i3 % 128;
        int i4 = i3 % 2;
        if (appLovinAd == null) {
            return false;
        }
        int i5 = i2 + 65;
        f914 = i5 % 128;
        int i6 = i5 % 2;
        AppLovinAdType type = appLovinAd.getType();
        if (i6 != 0) {
            type.equals(AppLovinAdType.INCENTIVIZED);
            throw null;
        }
        if (!type.equals(AppLovinAdType.INCENTIVIZED)) {
            return false;
        }
        int i7 = f916 + 15;
        f914 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m987(Context context) {
        int i = 2 % 2;
        int i2 = f914 + 125;
        f916 = i2 % 128;
        if (i2 % 2 != 0) {
            return AppLovinBroadcastManager.getInstance(context);
        }
        AppLovinBroadcastManager.getInstance(context);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m970(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f914 + 23;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        appLovinBroadcastManager.registerReceiver(receiver, intentFilter);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f914 + 81;
        f916 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m992(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i = 2 % 2;
        int i2 = f916 + 99;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        appLovinBroadcastManager.unregisterReceiver(receiver);
        int i4 = f914 + 89;
        f916 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Bundle m980(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = 2 % 2;
        int i2 = f914 + 23;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        Bundle messageData = communicatorMessageImpl.getMessageData();
        int i4 = f914 + 105;
        f916 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return messageData;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m962(Context context, final String str, String str2) {
        int i = 2 % 2;
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.11
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }

            public final String getCommunicatorId() {
                return str;
            }
        }, str2);
        int i2 = f914 + 63;
        f916 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Uri m986(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f914 + 71;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        int i4 = f914 + 23;
        f916 = i4 % 128;
        if (i4 % 2 != 0) {
            return mainImageUri;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m971(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = 2 % 2;
        int i2 = f916 + 91;
        f914 = i2 % 128;
        int i3 = i2 % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        int i4 = f914 + 69;
        f916 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Uri m965(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f914 + 89;
        f916 = i2 % 128;
        int i3 = i2 % 2;
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        int i4 = f914 + 77;
        f916 = i4 % 128;
        if (i4 % 2 != 0) {
            return iconUri;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m989(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f917[b.f638 + i]) ^ (((long) b.f638) * f915)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
