package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bl extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f874 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f875;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f876;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f877;

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap(",\"Èðå\u008d\u0082¦¿\u000fT~qlmø\ná'¡Üyù\u0010\u0096.\r\u001féìÄ £¹\u009eau\u0019P)Lð+\u009c\u0006¹ývØ\u0005·9\u0093î\u0000Dä\u0082Éî®Ã\u0093;xZ]mA¬&Ù\u000bòð%\u0000cä¹ÉÁ®¬\u00939xC]eA &ß\u000bèðrÕVºm\u009e¨\u0083ÝhéM\u00052\u0018\u0017mû\u0086àËÅ ª \u008fntRX§=ß\"æ\u0007\u0001ìHÑ}µ\u009e\u009a¹\u0088¢ldA\b&-\u001bÐð¼Õ\u0087ÉN®%\u0083\u0014xÓ] 2\u0087\u0016Y\u000b>à-Ååº¤\u009f\u0083srh7M\u001c\"û[ ¿z\u0092\u0002õoÈú#\u0080\u0006¦\u001ac}\u001cP+«±\u008e\u0095á®ÅkØ\u001e3*\u0016ÆiÛL® E»\b\u009ecñãÔ\u00ad/\u0091\u0003lf\u0011y%\\Î·\u008f\u008a¤î]Áj$!?Æ\u0012àu·Il¬d\u0087-\u009aÚýóÐ¶4E\u000fr\u0000Dä\u0082Éî®Ã\u0093<xo]gA®&Ù\u000bðð5ÕFºq\u000e\u008bêQÇ) D\u009dÑv«S\u008dOH(7\u0005\u0000þ\u009aÛ¾´\u0085\u0090@\u008d5f\u0001Cí<ð\u0019\u0085õnî#ËH¤È\u0081\u0086zºVO30,;\tãâ¢ß\u0095»t\u0094Aq\njý|â\u0098$µHÒeï\u009a\u0004Á!Ì=\bZswR\u008c\u0089©àÆÇâ\fÿ{\u0014M1ª\u0000Dä\u0082Éî®Ã\u0093<xb]kA»&Ô\u000bãð.Gi£¯\u008eÃéîÔ\u0011?Q\u001aL\u0006\u0086aèLÎ·\u0002\u0092k\u0000Dä\u0082Éî®Ã\u0093<x|]aA©&À\u000béð2ÕAºmÄ\u0081 G\r+j\u0006Wù¼½\u0099¨\u0085zâ\u0002\u0000cä¹ÉÁ®¬\u00939xC]eA &ß\u000bèðrÕVºm\u009e¨\u0083ÝhéM\u00052\u0018\u0017mû\u0086àËÅ ª \u008fntRX§=Ø\"Ä\u0007\u0001ì[Ñc\u0000Dä\u0082Éî®Ã\u0093<x}]mA &Õ\u0000Dä\u0082Éî®Ã\u0093<xx]mA¿&Ç\u000bÕð)ÕBºx\u009e±\u0083ÆhþM#2Z\u0017eû\u0087àÖÅú\u0000Dä\u0082Éî®Ä\u0093=xZ]gA²&ö\u000bçð?ÕFºg\u009e¬\u0083Í_D»\u0082\u0096îñÄÌ='Z\u0002g\u001e²yýTç¯2\u008aSåoÁ»ÜÆ\u0000Dä\u0082Éî®Ð\u0093=x@]`A¿&Â\u000bãð.\u0000Dä\u0082Éî®Ã\u0093<xl]eA´&Þ\u000bãð.Õ~ºa\u009e\u00ad\u0083ÀhïM\u000e2S\u0017~\u0000Dä\u0082Éî®Ã\u0093<xl]eA©&Õ\u000bÄð=Õ\\ºf\u009e»\u0083ÆhÆM\t2E\u0017xû\u0087àÖÅëª\u0016²\u009eVX{4\u001c\u0019!æÊ¶ï¿ós\u0094\u000f¹\u0015Bèg\u009c\b·,v1\u001dÚ$ÿÓ\u0080\u0098¥¿IYR\u000ew\u0018\u0018×=\u0093Æ¾êY\u008f\b\u0090-µÀ\u0000Dä\u0082Éî®Ã\u0093<xm]eA¶&Ü\u000bäð=ÕQºc\u0000Dä\u0082Éî®Ã\u0093<xk]|Aª&Ñ\u000bèð8ÕWºl\u009e\u0092\u0083ÝhùM\u00142S\u0017bû\u0087àÊ\u0000Dä\u0082Éî®Ã\u0093<xg]jA®&Õ\u000bôð/ÕFºa\u009eª\u0083ÝhëM\f2z\u0017eû\u0091àÌÅëª\n\u008f_tb\u0000Dä\u0082Éî®Ã\u0093<xb]mA©&Ä\u000bãð2ÕWºz\u0000Tä\u0094Éá®ã\u00936xO]cA¿&Â\u000bÎð=ÕAº`\u009e\u0093\u0083Õhú\u0000Tä\u0094Éé®ú\u0093=xM]qA®&ß\u000bôð\u000fÕWºz\u009e¨\u0083ÝhéM\u0005B\u009d¦z\u008b\u0003ì\u0017Ñê:\u0086\u001f½\u0003td\u001fI.²é\u0097\u009aø½ÜcÁ\u0004*\u0017\u000fßp\u009eU¹¹H¢\r\u0087&èÁ\u0000cä¹ÉÁ®¬\u00939xC]eA &ß\u000bèðrÕSºx\u009e\u00ad\u0083\u009ahëM\u00042E\u0017\"û\u0083àÛÅúª\r\u008fLtyX\u0092=Å\"¼\u0007)ìNÑgµ£\u009a®\u007fâd\tI0.k\u0012\u009a÷\u00adÜîÁ\u0019¦'\u008bpo³T«9ê\u001e\u001d\u0003<èIÌ\u0082±µn¬\u008aK§2À.ýÑ\u0016\u00823\u008a/CH4e\u001d\u009eØ»«Ô\u009c\u008fÜk\u0006F~!\u0013\u001c\u0086÷üÒÚÎ\u001f©`\u0084W\u007fÍZì5Ç\u0011\u0012\f%çTÂ»½ú\u0098\u009dt<odJE%²\u0000óûÆ×-²z\u00ad\u0003\u0088\u0096cñ^Ø:\u0014\u0015\u001bðhë°Æ\u0089¡Î\u009d'x\u0012SQN¶\f^è¹ÅÀ¢Ü\u009f#tgQrM *ØWI³®\u009e×\u0000Aä¦Éß®Ã\u0093<s6\u0097Ñº¨Ý´àK\u000b\u001a.\u001c2ÃU³x\u0083\u0083D¦)É\u0013íÌð±\u0000Aä¦Éß®Ã\u0093<xb]mA©&Ä\u000bãð2ÕWºz\u0000Aä¦Éß®Ã\u0093<x|]aA«&Å\u000bãð/ÕFºD\u009e·\u0083ÇhþM\u00052X\u0017iû\u0090Ï\u001b+ü\u0006\u0085a\u0099\\f·2\u00921\u008eòé\u0087Ä½?rç\t\u0003î.\u0097I\u008btt\u009f2º5¦âÁ\u009d\u0000Aä¦Éß®Ã\u0093<x|]aA«&Å\u000bãð/ÕFª Ntc\u001f\u0004\u00049ïÒ\u0099÷\u0088ëx\u008c\u000eTD°\u0090\u009dûúçÇ\u001e,y\tD\u0015\u0091rÕ_Ä¤\u001c\u0081eîDÊ\u008f×î<à\u0019-ffC[¯ ´õ\u0091Îþ\"\u0000gä³ÉØ®Ã\u0093<x|]aA©&À\u000béð2ÕAºm\u009e\u009c\u0083ÝhîM)2R}\u008d\u0099Y´2Ó)îÖ\u0005\u0096 \u008b<C[*v\u0003\u008dØ¨«Ç\u0087ãwþ,\u0015\u00050ëO¨j\u008f\u0086~\u009d7¸-×ê\u0085éa=LV+M\u0016²ýòØïÄ'£N\u008egu¼PÏ?ã\u001b\u0019\u0006WítÈ\u009c·Ý\u0092ñ~\u001fe_@o/\u0084\náñìÝ\u0004\u0017]ó\u0089Þâ¹ù\u0084\u0006oFJ[V\u00931ú\u001cÓç\bÂ{\u00adW\u0089¶\u0094ë\u007fÞZ>%i\u0000Dì±÷ìÒÓ½\u0013\u0098acZ\u0000gä³ÉØ®Ã\u0093<x|]aA©&À\u000béð2ÕAºm\u009e\u008c\u0083ÑhäM\u00042S\u0017~û\u008bàÖÅéª&\u008fOt~X\u0082=Ð\"÷\u0000gä³ÉØ®Æ\u0093=xH]eA¯&Ü\u000bòð\nÕ[ºl\u009e»\u0083ÛhËM\u00042E\u0017^û\u0087àÉÅûª\u0001\u008fItdX¥=É\"á\u0007\u001cìQÑyµº\u009a¡\u007fäd\rI/.k\u0005Áá\u0015Ì~«e\u0096\u009a}ÚXÇD\u000f#f\u000eOõ\u0094Ðç¿Ë\u009b9\u0086vm_Bõ¦!\u008bJìQÑ®:î\u001fó\u0003;dRI{² \u0097ÓøÿÜ\u001cÁT*q\u000f\u0091pÁUÎ¹\u001f¢C\u0087rè\u0082Øf<²\u0011ÙvÂK= |\u0085l\u0099¡þÔÓÔ(1\r\\b}F\u008a[à°Â\u0095%\u0000gä³ÉØ®Ã\u0093<x}]mA &Õ\u000bÇð8Õfºq\u009e®\u0083Ñ\u0000gä³ÉØ®Ã\u0093<x}]mA &Õ\u000bÖð)ÕPº[\u009e»\u0083ÀhþM\t2X\u0017kû\u0091\u0000iä¥Éí®æ\u0093\u000bxG]~A¿&ù\u000bèð(ÕWºz\u009e\u00ad\u0083ÀhãM\u00142_\u0017mû\u008eàùÅê\u0000cä¤ÉÉ®ã\u0093,xK]PA\u0098&ö\u000bãð(ÕQº`\u009e\u0098\u0083ÕhéM\u00142Y\u0017~û\u009bàõÅïª\n\u008f[twX\u0083=Î\"ß\u0007\tìN\u0000cä¤ÉÉ®ã\u0093,xK]PA\u0098&õ\u000bþð9ÕQº}\u009eª\u0083ÛhøM32S\u0017~û\u0094àÑÅíª\u0001¶ÂR\u0016\u007f}\u0018f%\u008dÎøëà÷\u001b\u0090G½FF\u0088câ\fÈ(\b5e\u0000gä³ÉØ®À\u00931xJ]MA´&Ö\u000béù#\u001d÷0\u009cW\u0096jn\u0081\u0003¤#¸ûß¤ò\u00ad\tq,\u0018C8u¿\u0091k¼\u0000Û\tæì\r\u0099(¨4WS\u001d~7\u0085àGÁ£\u0015\u008e~éeÔ\u008e?û\u001aã\u0006\u0018aPLO·\u0088\u0092ùýÏÙ\f\u0000gä³ÉØ®Ã\u0093<xb]kA»&Ô\u000bãð.\u0011\"õöØ\u009d¿\u0086\u0082yi=L(Pú7\u0082".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f875 = cArr;
        f877 = -6822912198969465642L;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ DTBAdView m910(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 19;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        DTBAdView dTBAdViewM908 = m908(apsAd);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return dTBAdViewM908;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ DTBFetchFactory m911() {
        int i = 2 % 2;
        int i2 = f874 + 37;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        DTBFetchFactory dTBFetchFactoryM909 = m909();
        int i4 = f876 + InterfaceC0280i1.d.b.g;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return dTBFetchFactoryM909;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m914() {
        int i = 2 % 2;
        int i2 = f874 + 19;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String strM903 = m903();
        int i4 = f876 + 107;
        f874 = i4 % 128;
        int i5 = i4 % 2;
        return strM903;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Map m916(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f876 + 35;
        f874 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m904(dTBAdResponse);
            throw null;
        }
        Map<String, String> mapM904 = m904(dTBAdResponse);
        int i3 = f874 + 67;
        f876 = i3 % 128;
        if (i3 % 2 == 0) {
            return mapM904;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ List m918(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f876 + 91;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        List<DTBAdSize> listM901 = m901(dTBAdResponse);
        int i4 = f874 + 25;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return listM901;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m920(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 39;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            m900(apsAd);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ApsAdRequest apsAdRequestM900 = m900(apsAd);
        int i3 = f876 + 7;
        f874 = i3 % 128;
        int i4 = i3 % 2;
        return apsAdRequestM900;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m926(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 57;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String strM905 = m905(apsAd);
        int i4 = f874 + 115;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return strM905;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ HashMap m927(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f876 + 77;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            m906(dTBAdResponse);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        HashMap<String, Object> mapM906 = m906(dTBAdResponse);
        int i3 = f874 + 73;
        f876 = i3 % 128;
        int i4 = i3 % 2;
        return mapM906;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m928(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + 21;
        f876 = i2 % 128;
        if (i2 % 2 == 0) {
            return m919(dTBAdSize);
        }
        m919(dTBAdSize);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m929(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 125;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return m915(apsAd);
        }
        m915(apsAd);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m930(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 113;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String strM921 = m921(dTBAdResponse);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = f876 + 85;
        f874 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return strM921;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m931(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + 29;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            m945(dTBAdResponse, dTBAdSize);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM945 = m945(dTBAdResponse, dTBAdSize);
        int i3 = f876 + 81;
        f874 = i3 % 128;
        int i4 = i3 % 2;
        return strM945;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m932(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + 25;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            m935(dTBAdSize);
            throw null;
        }
        String strM935 = m935(dTBAdSize);
        int i3 = f874 + 27;
        f876 = i3 % 128;
        int i4 = i3 % 2;
        return strM935;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m933(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f874 + 33;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            m923(apsAd);
            throw null;
        }
        String strM923 = m923(apsAd);
        int i3 = f876 + 47;
        f874 = i3 % 128;
        int i4 = i3 % 2;
        return strM923;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m934(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 123;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            m912(dTBAdResponse);
            throw null;
        }
        String strM912 = m912(dTBAdResponse);
        int i3 = f874 + InterfaceC0280i1.d.b.b;
        f876 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM912;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Bundle m936(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 107;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleM907 = m907(dTBAdResponse);
        int i4 = f874 + InterfaceC0280i1.d.b.i;
        f876 = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleM907;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m937(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 11;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest apsAdRequestM917 = m917(apsAd);
        int i4 = f874 + InterfaceC0280i1.d.b.b;
        f876 = i4 % 128;
        if (i4 % 2 == 0) {
            return apsAdRequestM917;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AdType m938(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + 51;
        f876 = i2 % 128;
        if (i2 % 2 == 0) {
            return m922(dTBAdSize);
        }
        m922(dTBAdSize);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ b m939(bl blVar, HashMap map, cl clVar) {
        int i = 2 % 2;
        int i2 = f874 + 5;
        f876 = i2 % 128;
        if (i2 % 2 == 0) {
            return blVar.m940(map, clVar);
        }
        blVar.m940(map, clVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ ApsAdFormat m941(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 87;
        f874 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m902(apsAd);
            super.hashCode();
            throw null;
        }
        ApsAdFormat apsAdFormatM902 = m902(apsAd);
        int i3 = f876 + 17;
        f874 = i3 % 128;
        if (i3 % 2 != 0) {
            return apsAdFormatM902;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ c m942(bl blVar, ThreadPoolExecutor threadPoolExecutor, cl clVar) {
        int i = 2 % 2;
        int i2 = f876 + 81;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return blVar.m925(threadPoolExecutor, clVar);
        }
        blVar.m925(threadPoolExecutor, clVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m944(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 107;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String strM924 = m924(dTBAdResponse);
        int i4 = f876 + InterfaceC0280i1.d.b.b;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM924;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m946(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + InterfaceC0280i1.d.b.b;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM913 = m913(dTBAdSize);
        int i4 = f876 + 71;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObjectM913;
        }
        throw null;
    }

    public bl(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f876 + 119;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        Matcher matcher = Pattern.compile(m943((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 13, (char) (11276 - Drawable.resolveOpacity(0, 0))).intern()).matcher(mo820());
        if (matcher.matches()) {
            int i4 = f874 + 5;
            f876 = i4 % 128;
            return i4 % 2 != 0 ? matcher.group(0) : matcher.group(1);
        }
        int i5 = f874 + 37;
        f876 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo820() {
        int i = 2 % 2;
        int i2 = f876 + 105;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String version = AdRegistration.getVersion();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return version;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:102:0x04db  */
    /* JADX WARN: Code duplicated, block: B:104:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x0502  */
    /* JADX WARN: Code duplicated, block: B:107:0x0524  */
    /* JADX WARN: Code duplicated, block: B:108:0x0528  */
    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:110:0x054e  */
    /* JADX WARN: Code duplicated, block: B:111:0x055b  */
    /* JADX WARN: Code duplicated, block: B:113:0x057c  */
    /* JADX WARN: Code duplicated, block: B:114:0x058a  */
    /* JADX WARN: Code duplicated, block: B:116:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:120:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:123:0x060b  */
    /* JADX WARN: Code duplicated, block: B:125:0x062e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0631  */
    /* JADX WARN: Code duplicated, block: B:129:0x0657  */
    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    /* JADX WARN: Code duplicated, block: B:131:0x0677  */
    /* JADX WARN: Code duplicated, block: B:132:0x067a  */
    /* JADX WARN: Code duplicated, block: B:134:0x069c  */
    /* JADX WARN: Code duplicated, block: B:135:0x069f  */
    /* JADX WARN: Code duplicated, block: B:137:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:13:0x0074  */
    /* JADX WARN: Code duplicated, block: B:15:0x0097  */
    /* JADX WARN: Code duplicated, block: B:16:0x009a  */
    /* JADX WARN: Code duplicated, block: B:18:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:209:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:220:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:230:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x010a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0118  */
    /* JADX WARN: Code duplicated, block: B:27:0x013a  */
    /* JADX WARN: Code duplicated, block: B:28:0x013e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0167  */
    /* JADX WARN: Code duplicated, block: B:31:0x016b  */
    /* JADX WARN: Code duplicated, block: B:33:0x018e  */
    /* JADX WARN: Code duplicated, block: B:34:0x019c  */
    /* JADX WARN: Code duplicated, block: B:36:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x020c  */
    /* JADX WARN: Code duplicated, block: B:43:0x020f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0233  */
    /* JADX WARN: Code duplicated, block: B:46:0x0237  */
    /* JADX WARN: Code duplicated, block: B:48:0x0257  */
    /* JADX WARN: Code duplicated, block: B:49:0x025b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0281  */
    /* JADX WARN: Code duplicated, block: B:52:0x028f  */
    /* JADX WARN: Code duplicated, block: B:54:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x02be  */
    /* JADX WARN: Code duplicated, block: B:58:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0319  */
    /* JADX WARN: Code duplicated, block: B:64:0x031d  */
    /* JADX WARN: Code duplicated, block: B:66:0x033e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0341  */
    /* JADX WARN: Code duplicated, block: B:69:0x0367  */
    /* JADX WARN: Code duplicated, block: B:70:0x036b  */
    /* JADX WARN: Code duplicated, block: B:72:0x038a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0396  */
    /* JADX WARN: Code duplicated, block: B:75:0x0399  */
    /* JADX WARN: Code duplicated, block: B:77:0x039e  */
    /* JADX WARN: Code duplicated, block: B:79:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0410  */
    /* JADX WARN: Code duplicated, block: B:86:0x0413  */
    /* JADX WARN: Code duplicated, block: B:88:0x0437  */
    /* JADX WARN: Code duplicated, block: B:89:0x043b  */
    /* JADX WARN: Code duplicated, block: B:91:0x045f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0463  */
    /* JADX WARN: Code duplicated, block: B:94:0x0486  */
    /* JADX WARN: Code duplicated, block: B:95:0x048a  */
    /* JADX WARN: Code duplicated, block: B:97:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:98:0x04b0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i;
        byte b2;
        int i2;
        int i3 = 2 % 2;
        int i4 = f876 + 123;
        f874 = i4 % 128;
        byte b3 = 1;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
            switch (str.hashCode()) {
                case -2137858584:
                    if (str.equals(m943((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + InterfaceC0280i1.c.b.d, 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 8;
                    }
                    break;
                case -2133119933:
                    if (str.equals(m943(672 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0') + 16, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29559)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 34;
                    }
                    break;
                case -1987686071:
                    if (str.equals(m943(View.resolveSizeAndState(0, 0, 0) + 482, 13 - TextUtils.indexOf("", "", 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.CAN;
                    }
                    break;
                case -1885106463:
                    if (!str.equals(m943(27 - (ViewConfiguration.getEdgeSlop() >> 16), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                        b3 = -1;
                    }
                    break;
                case -1879113962:
                    if (!(!str.equals(m943(279 - Process.getGidForName(""), 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 13;
                    }
                    break;
                case -1879025222:
                    if (str.equals(m943((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 239, (ViewConfiguration.getTapTimeout() >> 16) + 9, (char) (50373 - TextUtils.indexOf("", "", 0))).intern())) {
                        b3 = -1;
                    } else {
                        int i6 = f876 + 75;
                        f874 = i6 % 128;
                        int i7 = i6 % 2;
                        b3 = 11;
                    }
                    break;
                case -1554728876:
                    if (str.equals(m943(93 - ImageFormat.getBitsPerPixel(0), Color.alpha(0) + 45, (char) (23491 - Color.blue(0))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 4;
                    }
                    break;
                case -1464660218:
                    if (str.equals(m943((ViewConfiguration.getLongPressTimeout() >> 16) + 394, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (char) (45786 - KeyEvent.normalizeMetaState(0))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 20;
                    }
                    break;
                case -1358954558:
                    if (str.equals(m943(TextUtils.lastIndexOf("", '0', 0, 0) + 312, TextUtils.indexOf("", "", 0, 0) + 15, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i8 = f874 + 83;
                        f876 = i8 % 128;
                        int i9 = i8 % 2;
                        b3 = 15;
                    }
                    break;
                case -1293925587:
                    if (str.equals(m943(70 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, (char) (TextUtils.indexOf("", "", 0, 0) + 35046)).intern())) {
                        b3 = -1;
                    } else {
                        int i10 = f876 + 75;
                        f874 = i10 % 128;
                        int i11 = i10 % 2;
                        b3 = 3;
                    }
                    break;
                case -1291566264:
                    if (str.equals(m943(742 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 12, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 39;
                    }
                    break;
                case -1092884085:
                    if (!(!str.equals(m943((ViewConfiguration.getLongPressTimeout() >> 16) + 152, 'S' - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 3817)).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 6;
                    }
                    break;
                case -1090060454:
                    if (str.equals(m943(215 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 18221)).intern())) {
                        b3 = 9;
                    } else {
                        b3 = -1;
                    }
                    break;
                case -832298225:
                    if (str.equals(m943(495 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.EM;
                    }
                    break;
                case -791598050:
                    if (str.equals(m943(721 - View.MeasureSpec.getSize(0), 11 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (AndroidCharacter.getMirror('0') + 53034)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 37;
                    }
                    break;
                case -723985259:
                    if (str.equals(m943(TextUtils.indexOf("", "") + 341, View.resolveSizeAndState(0, 0, 0) + 11, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 17;
                    }
                    break;
                case -696695160:
                    if (str.equals(m943(39 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 33 - (Process.myPid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                case -694845532:
                    if (str.equals(m943((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 138, (Process.myPid() >> 22) + 13, (char) Color.argb(0, 0, 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 5;
                    }
                    break;
                case -466918522:
                    if (!(!str.equals(m943(371 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (char) Color.red(0)).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 19;
                    }
                    break;
                case -341719851:
                    if (str.equals(m943(TextUtils.getOffsetBefore("", 0) + 352, 19 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.DC2;
                    }
                    break;
                case -300800492:
                    if (str.equals(m943(Color.alpha(0) + FrameMetricsAggregator.EVERY_DURATION, 16 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        i = f874 + 7;
                        f876 = i % 128;
                        if (i % 2 != 0) {
                            b2 = 67;
                        } else {
                            b2 = Ascii.SUB;
                        }
                        b3 = b2;
                    }
                    break;
                case -197992833:
                    if (str.equals(m943(((Process.getThreadPriority(0) + 20) >> 6) + 528, (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17116)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 27;
                    }
                    break;
                case -27446238:
                    if (str.equals(m943((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 436, 21 - KeyEvent.keyCodeFromString(""), (char) KeyEvent.normalizeMetaState(0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 22;
                    }
                    break;
                case 66052:
                    if (str.equals(m943((Process.myTid() >> 22) + 665, 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (22328 - AndroidCharacter.getMirror('0'))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 32;
                    }
                    break;
                case 63478087:
                    if (str.equals(m943(669 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i12 = f874 + 91;
                        f876 = i12 % 128;
                        int i13 = i12 % 2;
                        b3 = 33;
                    }
                    break;
                case 355568411:
                    if (str.equals(m943(Drawable.resolveOpacity(0, 0) + 688, MotionEvent.axisFromString("") + 14, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        i2 = f874 + 27;
                        f876 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b3 = 35;
                        } else {
                            b3 = 117;
                        }
                    }
                    break;
                case 568188517:
                    if (!(!str.equals(m943(327 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (char) (24320 - TextUtils.indexOf("", "", 0))).intern()))) {
                        b3 = -1;
                    } else {
                        int i14 = f874 + 45;
                        f876 = i14 % 128;
                        int i15 = i14 % 2;
                        b3 = 16;
                    }
                    break;
                case 620798166:
                    if (str.equals(m943(227 - View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 10;
                    }
                    break;
                case 788901082:
                    if (str.equals(m943(423 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777229, (char) (Process.myPid() >> 22)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 21;
                    }
                    break;
                case 1036908700:
                    if (str.equals(m943(Color.alpha(0) + 13, View.combineMeasuredStates(0, 0) + 14, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3422)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case 1251356764:
                    if (str.equals(m943(TextUtils.getTrimmedLength("") + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 36799)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.RS;
                    }
                    break;
                case 1306698049:
                    if (str.equals(m943(TextUtils.indexOf((CharSequence) "", '0', 0) + 188, 17 - TextUtils.indexOf("", ""), (char) (Color.argb(0, 0, 0, 0) + 31910)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 7;
                    }
                    break;
                case 1328085269:
                    if (str.equals(m943(457 - TextUtils.indexOf("", ""), 25 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i16 = f874 + 25;
                        f876 = i16 % 128;
                        int i17 = i16 % 2;
                        b3 = 23;
                    }
                    break;
                case 1340383521:
                    if (str.equals(m943((ViewConfiguration.getJumpTapTimeout() >> 16) + 732, (-16777207) - Color.rgb(0, 0, 0), (char) (59208 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 38;
                    }
                    break;
                case 1340427404:
                    if (str.equals(m943(657 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, (char) (3151 - AndroidCharacter.getMirror('0'))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.US;
                    }
                    break;
                case 1600627740:
                    if (str.equals(m943(701 - TextUtils.getCapsMode("", 0, 0), Color.green(0) + 20, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                        b3 = -1;
                    } else {
                        int i18 = f876 + 91;
                        f874 = i18 % 128;
                        int i19 = i18 % 2;
                        b3 = 36;
                    }
                    break;
                case 1648408950:
                    if (str.equals(m943(601 - TextUtils.lastIndexOf("", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) + 13, (char) (28397 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.GS;
                    }
                    break;
                case 1713728997:
                    if (str.equals(m943((ViewConfiguration.getPressedStateDuration() >> 16) + 551, 50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.FS;
                    }
                    break;
                case 2019413793:
                    if (str.equals(m943(249 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 30 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 12;
                    }
                    break;
                case 2144664800:
                    if (str.equals(m943(289 - View.combineMeasuredStates(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.SO;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2137858584:
                    if (str.equals(m943((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + InterfaceC0280i1.c.b.d, 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 8;
                    }
                    break;
                case -2133119933:
                    if (str.equals(m943(672 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0') + 16, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29559)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 34;
                    }
                    break;
                case -1987686071:
                    if (str.equals(m943(View.resolveSizeAndState(0, 0, 0) + 482, 13 - TextUtils.indexOf("", "", 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.CAN;
                    }
                    break;
                case -1885106463:
                    if (!str.equals(m943(27 - (ViewConfiguration.getEdgeSlop() >> 16), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                        b3 = -1;
                    }
                    break;
                case -1879113962:
                    if (!(!str.equals(m943(279 - Process.getGidForName(""), 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 13;
                    }
                    break;
                case -1879025222:
                    if (str.equals(m943((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 239, (ViewConfiguration.getTapTimeout() >> 16) + 9, (char) (50373 - TextUtils.indexOf("", "", 0))).intern())) {
                        b3 = -1;
                    } else {
                        int i20 = f876 + 75;
                        f874 = i20 % 128;
                        int i21 = i20 % 2;
                        b3 = 11;
                    }
                    break;
                case -1554728876:
                    if (str.equals(m943(93 - ImageFormat.getBitsPerPixel(0), Color.alpha(0) + 45, (char) (23491 - Color.blue(0))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 4;
                    }
                    break;
                case -1464660218:
                    if (str.equals(m943((ViewConfiguration.getLongPressTimeout() >> 16) + 394, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (char) (45786 - KeyEvent.normalizeMetaState(0))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 20;
                    }
                    break;
                case -1358954558:
                    if (str.equals(m943(TextUtils.lastIndexOf("", '0', 0, 0) + 312, TextUtils.indexOf("", "", 0, 0) + 15, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i22 = f874 + 83;
                        f876 = i22 % 128;
                        int i23 = i22 % 2;
                        b3 = 15;
                    }
                    break;
                case -1293925587:
                    if (str.equals(m943(70 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, (char) (TextUtils.indexOf("", "", 0, 0) + 35046)).intern())) {
                        b3 = -1;
                    } else {
                        int i110 = f876 + 75;
                        f874 = i110 % 128;
                        int i111 = i110 % 2;
                        b3 = 3;
                    }
                    break;
                case -1291566264:
                    if (str.equals(m943(742 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 12, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 39;
                    }
                    break;
                case -1092884085:
                    if (!(!str.equals(m943((ViewConfiguration.getLongPressTimeout() >> 16) + 152, 'S' - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 3817)).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 6;
                    }
                    break;
                case -1090060454:
                    if (str.equals(m943(215 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 18221)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 9;
                    }
                    break;
                case -832298225:
                    if (str.equals(m943(495 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.EM;
                    }
                    break;
                case -791598050:
                    if (str.equals(m943(721 - View.MeasureSpec.getSize(0), 11 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (AndroidCharacter.getMirror('0') + 53034)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 37;
                    }
                    break;
                case -723985259:
                    if (str.equals(m943(TextUtils.indexOf("", "") + 341, View.resolveSizeAndState(0, 0, 0) + 11, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 17;
                    }
                    break;
                case -696695160:
                    if (str.equals(m943(39 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 33 - (Process.myPid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                case -694845532:
                    if (str.equals(m943((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 138, (Process.myPid() >> 22) + 13, (char) Color.argb(0, 0, 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 5;
                    }
                    break;
                case -466918522:
                    if (!(!str.equals(m943(371 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (char) Color.red(0)).intern()))) {
                        b3 = -1;
                    } else {
                        b3 = 19;
                    }
                    break;
                case -341719851:
                    if (str.equals(m943(TextUtils.getOffsetBefore("", 0) + 352, 19 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.DC2;
                    }
                    break;
                case -300800492:
                    if (str.equals(m943(Color.alpha(0) + FrameMetricsAggregator.EVERY_DURATION, 16 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        i = f874 + 7;
                        f876 = i % 128;
                        if (i % 2 != 0) {
                            b2 = 67;
                        } else {
                            b2 = Ascii.SUB;
                        }
                        b3 = b2;
                    }
                    break;
                case -197992833:
                    if (str.equals(m943(((Process.getThreadPriority(0) + 20) >> 6) + 528, (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17116)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 27;
                    }
                    break;
                case -27446238:
                    if (str.equals(m943((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 436, 21 - KeyEvent.keyCodeFromString(""), (char) KeyEvent.normalizeMetaState(0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 22;
                    }
                    break;
                case 66052:
                    if (str.equals(m943((Process.myTid() >> 22) + 665, 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (22328 - AndroidCharacter.getMirror('0'))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 32;
                    }
                    break;
                case 63478087:
                    if (str.equals(m943(669 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i112 = f874 + 91;
                        f876 = i112 % 128;
                        int i113 = i112 % 2;
                        b3 = 33;
                    }
                    break;
                case 355568411:
                    if (str.equals(m943(Drawable.resolveOpacity(0, 0) + 688, MotionEvent.axisFromString("") + 14, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        i2 = f874 + 27;
                        f876 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b3 = 35;
                        } else {
                            b3 = 117;
                        }
                    }
                    break;
                case 568188517:
                    if (!(!str.equals(m943(327 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (char) (24320 - TextUtils.indexOf("", "", 0))).intern()))) {
                        b3 = -1;
                    } else {
                        int i114 = f874 + 45;
                        f876 = i114 % 128;
                        int i115 = i114 % 2;
                        b3 = 16;
                    }
                    break;
                case 620798166:
                    if (str.equals(m943(227 - View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 10;
                    }
                    break;
                case 788901082:
                    if (str.equals(m943(423 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777229, (char) (Process.myPid() >> 22)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 21;
                    }
                    break;
                case 1036908700:
                    if (str.equals(m943(Color.alpha(0) + 13, View.combineMeasuredStates(0, 0) + 14, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3422)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case 1251356764:
                    if (str.equals(m943(TextUtils.getTrimmedLength("") + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 36799)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.RS;
                    }
                    break;
                case 1306698049:
                    if (str.equals(m943(TextUtils.indexOf((CharSequence) "", '0', 0) + 188, 17 - TextUtils.indexOf("", ""), (char) (Color.argb(0, 0, 0, 0) + 31910)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 7;
                    }
                    break;
                case 1328085269:
                    if (str.equals(m943(457 - TextUtils.indexOf("", ""), 25 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i116 = f874 + 25;
                        f876 = i116 % 128;
                        int i117 = i116 % 2;
                        b3 = 23;
                    }
                    break;
                case 1340383521:
                    if (str.equals(m943((ViewConfiguration.getJumpTapTimeout() >> 16) + 732, (-16777207) - Color.rgb(0, 0, 0), (char) (59208 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 38;
                    }
                    break;
                case 1340427404:
                    if (str.equals(m943(657 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, (char) (3151 - AndroidCharacter.getMirror('0'))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.US;
                    }
                    break;
                case 1600627740:
                    if (str.equals(m943(701 - TextUtils.getCapsMode("", 0, 0), Color.green(0) + 20, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                        b3 = -1;
                    } else {
                        int i118 = f876 + 91;
                        f874 = i118 % 128;
                        int i119 = i118 % 2;
                        b3 = 36;
                    }
                    break;
                case 1648408950:
                    if (str.equals(m943(601 - TextUtils.lastIndexOf("", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) + 13, (char) (28397 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.GS;
                    }
                    break;
                case 1713728997:
                    if (str.equals(m943((ViewConfiguration.getPressedStateDuration() >> 16) + 551, 50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.FS;
                    }
                    break;
                case 2019413793:
                    if (str.equals(m943(249 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 30 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 12;
                    }
                    break;
                case 2144664800:
                    if (str.equals(m943(289 - View.combineMeasuredStates(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = Ascii.SO;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
        }
        switch (b3) {
            case 0:
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return b.class;
            case 26:
                return c.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m943(753 - View.resolveSizeAndState(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, (char) (43719 - KeyEvent.getDeadChar(0, 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m914();
            }
        });
        map.put(m943(762 - Color.alpha(0), 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (21539 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m911();
            }
        });
        map.put(m943(785 - (Process.myPid() >> 22), View.resolveSizeAndState(0, 0, 0) + 18, (char) KeyEvent.keyCodeFromString("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m944((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943(803 - Color.green(0), ExpandableListView.getPackedPositionType(0L) + 23, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 32234)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m934((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943(825 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, (char) (KeyEvent.normalizeMetaState(0) + 34190)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m930((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943(Color.blue(0) + 852, 25 - TextUtils.indexOf("", "", 0, 0), (char) (5946 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m927((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 877, 28 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.MeasureSpec.getSize(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m936((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 905, TextUtils.lastIndexOf("", '0', 0) + 38, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m916((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 942, (ViewConfiguration.getTouchSlop() >> 8) + 16, (char) (1446 - (Process.myTid() >> 22))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m918((DTBAdResponse) list.get(0));
            }
        });
        map.put(m943((ViewConfiguration.getKeyRepeatDelay() >> 16) + 958, TextUtils.indexOf("", "", 0, 0) + 23, (char) (17042 - TextUtils.getOffsetAfter("", 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m931((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m943((ViewConfiguration.getTapTimeout() >> 16) + 981, 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (55297 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m932((DTBAdSize) list.get(0));
            }
        });
        map.put(m943((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + DescriptorProtos.Edition.EDITION_PROTO2_VALUE, 14 - MotionEvent.axisFromString(""), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m938((DTBAdSize) list.get(0));
            }
        });
        map.put(m943(Color.argb(0, 0, 0, 0) + 1013, 19 - TextUtils.lastIndexOf("", '0', 0), (char) (Process.myTid() >> 22)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m946((DTBAdSize) list.get(0));
            }
        });
        map.put(m943(TextUtils.getOffsetAfter("", 0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, TextUtils.indexOf("", "", 0) + 22, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bl.m928((DTBAdSize) list.get(0)));
            }
        });
        map.put(m943(1055 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - View.combineMeasuredStates(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m939(bl.this, (HashMap) list.get(0), clVar);
            }
        });
        map.put(m943((-16776131) - Color.rgb(0, 0, 0), 23 - ((Process.getThreadPriority(0) + 20) >> 6), (char) View.MeasureSpec.getSize(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m942(bl.this, (ThreadPoolExecutor) list.get(0), clVar);
            }
        });
        map.put(m943(TextUtils.lastIndexOf("", '0') + 1109, 14 - TextUtils.lastIndexOf("", '0', 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 46758)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m937((ApsAd) list.get(0));
            }
        });
        map.put(m943(1123 - TextUtils.getOffsetAfter("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, (char) Color.argb(0, 0, 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m933((ApsAd) list.get(0));
            }
        });
        map.put(m943(1133 - View.MeasureSpec.makeMeasureSpec(0, 0), View.getDefaultSize(0, 0) + 13, (char) (Color.green(0) + 63812)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m929((ApsAd) list.get(0));
            }
        });
        map.put(m943(1146 - Color.argb(0, 0, 0, 0), 11 - ExpandableListView.getPackedPositionType(0L), (char) (30167 - ImageFormat.getBitsPerPixel(0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m926((ApsAd) list.get(0));
            }
        });
        map.put(m943(1157 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (char) (View.getDefaultSize(0, 0) + 18342)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m941((ApsAd) list.get(0));
            }
        });
        map.put(m943(1172 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m920((ApsAd) list.get(0));
            }
        });
        map.put(m943((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1181, 9 - View.MeasureSpec.getSize(0), (char) (4420 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bl.m910((ApsAd) list.get(0));
            }
        });
        int i2 = f876 + InterfaceC0280i1.d.b.d;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m903() {
        int i = 2 % 2;
        int i2 = f876 + 29;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String appKey = AdRegistration.getAppKey();
        int i4 = f874 + 31;
        f876 = i4 % 128;
        if (i4 % 2 == 0) {
            return appKey;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBFetchFactory m909() {
        int i = 2 % 2;
        int i2 = f876 + 43;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            DTBFetchFactory.getInstance();
            throw null;
        }
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i3 = f876 + 69;
        f874 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return dTBFetchFactory;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m924(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 79;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            dTBAdResponse.getBidId();
            throw null;
        }
        String bidId = dTBAdResponse.getBidId();
        int i3 = f874 + 123;
        f876 = i3 % 128;
        int i4 = i3 % 2;
        return bidId;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m912(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 21;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String crid = dTBAdResponse.getCrid();
        int i4 = f876 + 117;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return crid;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m921(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 85;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i4 = f876 + InterfaceC0280i1.d.b.g;
        f874 = i4 % 128;
        int i5 = i4 % 2;
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static HashMap<String, Object> m906(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + InterfaceC0280i1.d.b.g;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m907(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 59;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            dTBAdResponse.getRenderingBundle();
            throw null;
        }
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        int i3 = f876 + 59;
        f874 = i3 % 128;
        int i4 = i3 % 2;
        return renderingBundle;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Map<String, String> m904(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + InterfaceC0280i1.d.b.g;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i4 = f874 + 37;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return defaultVideoAdsRequestCustomParams;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static List<DTBAdSize> m901(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f874 + 17;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return dTBAds;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m945(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f876 + 59;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return dTBAdResponse.getPricePoints(dTBAdSize);
        }
        dTBAdResponse.getPricePoints(dTBAdSize);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m935(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f876 + 53;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i4 = f876 + 91;
        f874 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return slotUUID;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdType m922(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f876 + 79;
        f874 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            dTBAdSize.getDTBAdType();
            super.hashCode();
            throw null;
        }
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i3 = f876 + 49;
        f874 = i3 % 128;
        if (i3 % 2 != 0) {
            return dTBAdType;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static JSONObject m913(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + InterfaceC0280i1.d.b.d;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        int i4 = f876 + 25;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return pubSettings;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m919(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f874 + 23;
        f876 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdSize.isInterstitialAd();
        }
        dTBAdSize.isInterstitialAd();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static ApsAdRequest m917(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 29;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return apsAd.getApsAdRequest();
        }
        apsAd.getApsAdRequest();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m923(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f874 + 117;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String bidInfo = apsAd.getBidInfo();
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = f876 + 43;
        f874 = i5 % 128;
        if (i5 % 2 != 0) {
            return bidInfo;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m915(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f874 + 81;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String pricePoint = apsAd.getPricePoint();
        int i4 = f874 + 35;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m905(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 77;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String slotUuid = apsAd.getSlotUuid();
        int i4 = f876 + 41;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            return slotUuid;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static ApsAdFormat m902(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 13;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return apsAd.getApsAdFormat();
        }
        apsAd.getApsAdFormat();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static ApsAdRequest m900(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 93;
        f874 = i2 % 128;
        if (i2 % 2 != 0) {
            return apsAd.getAdLoader();
        }
        apsAd.getAdLoader();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBAdView m908(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f876 + 107;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            apsAd.getAdView();
            throw null;
        }
        DTBAdView adView = apsAd.getAdView();
        int i3 = f876 + 81;
        f874 = i3 % 128;
        int i4 = i3 % 2;
        return adView;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b m940(HashMap<String, DTBFetchManager> map, cl clVar) {
        int i = 2 % 2;
        b bVar = new b(map, clVar);
        int i2 = f874 + InterfaceC0280i1.d.b.b;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return bVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c m925(ThreadPoolExecutor threadPoolExecutor, cl clVar) {
        int i = 2 % 2;
        c cVar = new c(threadPoolExecutor, clVar);
        int i2 = f874 + 61;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        return cVar;
    }

    class b extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f901 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f902 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f903 = -2847653767925709263L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cl f905;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f902 + 113;
            f901 = i2 % 128;
            int i3 = i2 % 2;
            DTBFetchManager dTBFetchManagerM948 = m948((String) obj, (DTBFetchManager) obj2);
            if (i3 == 0) {
                int i4 = 17 / 0;
            }
            int i5 = f902 + 81;
            f901 = i5 % 128;
            if (i5 % 2 != 0) {
                return dTBFetchManagerM948;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo795() {
            int i = 2 % 2;
            int i2 = f902 + 11;
            f901 = i2 % 128;
            int i3 = i2 % 2;
            HashMap<String, DTBFetchManager> mapM949 = m949();
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return mapM949;
        }

        public b(HashMap<String, DTBFetchManager> map, cl clVar) {
            super(map);
            this.f905 = clVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private DTBFetchManager m948(String str, DTBFetchManager dTBFetchManager) {
            int i = 2 % 2;
            int i2 = f901 + 119;
            f902 = i2 % 128;
            int i3 = i2 % 2;
            bl.this.m815(this, this.f905, m947("䙵㦈릩㦰맠㧤맜㤢뤔㤅뤝㥿륊㥝뢵㢹뢩㣭루㣎룸㠡렟㡔롹㡡롗", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32748).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i4 = f902 + 125;
            f901 = i4 % 128;
            int i5 = i4 % 2;
            return dTBFetchManager2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m949() {
            int i = 2 % 2;
            int i2 = f902 + 51;
            int i3 = i2 % 128;
            f901 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            f902 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m947(String str, int i) {
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
                    cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f903);
                    i.f2433++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    class c extends ThreadPoolExecutor implements hg<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f906 = 20755;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f907 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f908 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f909 = 49553;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f910 = 19429;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f911 = 54388;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private cl f913;

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ ThreadPoolExecutor mo795() {
            int i = 2 % 2;
            int i2 = f907 + 41;
            f908 = i2 % 128;
            int i3 = i2 % 2;
            ThreadPoolExecutor threadPoolExecutorM950 = m950();
            int i4 = f907 + 79;
            f908 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return threadPoolExecutorM950;
        }

        public c(ThreadPoolExecutor threadPoolExecutor, cl clVar) {
            super(threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS, threadPoolExecutor.getQueue());
            this.f913 = clVar;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = f908 + 13;
            f907 = i2 % 128;
            if (i2 % 2 != 0) {
                bl.this.m815(this, this.f913, m951("撞䄬\ue77b囵\ue3ea\uf694ᢐ厐\udf45ڌ촮鏿铦吘삵㍗뒟譀ۥ籆\ue3ea\uf694ᢐ厐嶁鬾", KeyEvent.keyCodeFromString("") * 46).intern(), runnable);
            } else {
                bl.this.m815(this, this.f913, m951("撞䄬\ue77b囵\ue3ea\uf694ᢐ厐\udf45ڌ촮鏿铦吘삵㍗뒟譀ۥ籆\ue3ea\uf694ᢐ厐嶁鬾", 25 - KeyEvent.keyCodeFromString("")).intern(), runnable);
            }
            super.execute(runnable);
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ThreadPoolExecutor m950() {
            int i = 2 % 2;
            int i2 = f907 + 57;
            int i3 = i2 % 128;
            f908 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 49;
            f907 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m951(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (k.f2952) {
                char[] cArr2 = new char[cArr.length];
                k.f2951 = 0;
                char[] cArr3 = new char[2];
                while (k.f2951 < cArr.length) {
                    cArr3[0] = cArr[k.f2951];
                    cArr3[1] = cArr[k.f2951 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f911)) ^ ((c2 >>> 5) + f906)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f909) ^ ((c3 + i2) ^ ((c3 << 4) + f910))));
                        i2 -= 40503;
                    }
                    cArr2[k.f2951] = cArr3[0];
                    cArr2[k.f2951 + 1] = cArr3[1];
                    k.f2951 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m943(int i, int i2, char c2) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f875[com.ironsource.adqualitysdk.sdk.i.b.f638 + i]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f877)) ^ ((long) c2));
                com.ironsource.adqualitysdk.sdk.i.b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
