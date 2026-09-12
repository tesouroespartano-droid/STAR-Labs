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
import com.google.common.base.Ascii;
import com.google.protobuf.ByteString;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.Nd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cf extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1287 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1288;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1289;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1290;

    static {
        char[] cArr = new char[1265];
        ByteBuffer.wrap("Î'Ì<v\u0004¸\u0006â\u0014$\u001cn'\u0090\u001fÚ\u000f\u001c$F\u001c\u0088\u001e2<t4¾\u000fà'*7\u0000Uºmto.}èu¢N\\v\u0016fÐQ\u008aNDpþH¸Pr^,kæI CZ\u007f\u0014_ÎJ\u0088HBZü,¶ p:õZOb\u0081`Ûr\u001dzWA©yãi%^\u007fA±\u007f\u000bGM_\u0087QÙd\u0013FUL¯yáA;B}V·^\t)C/\u0085#ß\b\u0011(k-\u00ad/ç=9;s7µ\u001dS\né2'0}\"»*ñ\u0011\u000f)E9\u0083\u0010Ù!\u0017#\u00ad(ë\u0012!\u001d\u007f\u0002µ3ó\u001f\t\u001c\u0000TºAtQ.lèn¢Y\\{\u0016pÐo\u008aZDnþQ\u0000Wºftd.[èi¢~\\g\u0016pÐk\u008aoD[þW¸ArI,^»A\u0001pÏr\u0095ISs\u0019|çs\u00adFkx1hÿfEC\u0003qÉP\u0097H]^\u001bAáJ¯RuVé\u001eS&\u009d$Ç6\u0001>K\tµ6ÿ096c$\u00ad<\u0017\u0010Q\u000e\u009b\u0018Å\b\u000f\tI\u0015\u0000Sºkti.~èM¢k\\^\u0016|Ðk\u008aoD{þO¸ArU,kæI QZC\u0014BÎ\\\u0088NTéîÜ ßz×¼ÉöÈ\býBÉ\u0084×Þß\u0010À\u0000Uºmto.}èu¢N\\v\u0016fÐO\u008a~D|þw¸MrB,]Æ1|\u0000²\u0002è=.\u000fd\u0018\u009a\u0001Ð\u0016\u0016\rL\t\u0000AºgtS.gèe¢{\\S\u0016vÐl\u008arDhþH¸Pr^wÇÍç\u0003íYâ\u009fìÕø\u0000Uºmto.}èu¢M\\s\u0016{Ðv\u008a~DlþR\u0000Uºmto.}èu¢M\\s\u0016{Ðv\u008a~Dlþr¸Mr],OH\tò)<#f, \"ê6\u0014\n^6\u0098<Â'\u0000Bºbth.gèi¢}\\Z\u0016|Ð|\u008a~\u0000Bºbth.gèi¢}\\W\u0016cÐ}\u008auDj-z\u0097ZYP\u0003_ÅQ\u008fEqf;DýS§WiCÓw\u0095y_m ,\u009a\fT\u0006\u000e\tÈ\u0007\u0082\u0013|\u000f66ð\u0019ª\u0011d\u0005Þ#\u0098/R\n\f+Æ-\u00808z44?î\"¨ b0ÜX\u0096BPI\nK\u0000Bºbth.gèi¢}\\B\u0016gÐw\u008akD{þS¸PrN,Oæ^\u0000Bºbth.gèi¢}\\B\u0016zÐk\u008arDjþH¸KrIê\u000bP+\u009e!Ä.\u0002 H4¶\fü9:3`\u0002®;\u0014\tR\u0014\u0098\u000bÆ\u0011\f'J\u0016°\u0014þ\u000b$\u0011b\u001c¨\u0018\u0016n\\~\u0007ò½ÒsØ)×ïÙ¥Í[ç\u0011××Ú\u008dÄCÜùÒ¿ûuó+ÿ\u0000Bºbth.gèi¢}\\W\u0016gÐj\u008atDlþh¸JrA,EÚ\u001e`>®4ô;25x!\u0086\u0018Ì \n!P0\u0000cºltk.'èy¢a\\{\u0016aÐa\u008a(Dzþ\u000f¸WrB,Xæ[ YZP\u0014SÎJ\u0088\u0012B]ü#¶+p&*.ä<\u009e\"Xz\u0012\u0015Ì;\u00863@\u000eú\u0006´\u0014n?(\u0005â\n\u009c\u0005\u0000Bºbth.gèi¢}\\D\u0016|Ð}\u008alD]þ@¸GrO,O¨ù\u0012æÜØ\u0086Ð@È\nÆôà¾ÄxÆ\"ÅìËVã\u0010ØÚþ\u0084éNé\båòí¼ãfû\u0000Bºbth.gèi¢}\\D\u0016|Ð}\u008alDWþm¸MrT,^æH ^ZV\u0014D\u0000Bºbth.gèi¢}\\D\u0016|Ð}\u008alDRþH¸WrS,OæC UZA\u0000Bºbth.gèi¢}\\D\u0016|Ð}\u008alDQþM¸@\u0000cºltk.'èy¢a\\{\u0016aÐa\u008a(Dzþ\u000f¸WrB,Xæ[ YZP\u0014SÎJ\u0088\u0012B]ü#¶+p&*.ä<\u009e\"Xz\u0012!Ì3\u00868@\u0017úM´$n\b(\u0002â\u0001\u009c\u0017V\u0007\u0010.Ê\u0012\u0084\u001b>ö\u0010ýªÍdÑ>ÞøÄ²×LÛ\u0006ËÀÆ\u009aÎTòîÿ¨ýbÊ<øöó°üJÌ\u0004äÞñ\u0098÷Rèì\u0098¦\u0087\u000b\u001d±\u0012\u007f\u0015%Yã\u0007©\u001fW\u0005\u001d\u001fÛ\u001f\u0081VO\u0004õq³;y=''í}«/Q)\u001f8Å+\u0083#I8÷Y½I{\u0018!sïE\u0095CSF\u0019zÇG\u008dQK{ñx¿ve@#wés\u0097Z]b\u001bcÁr\u008fD5\u0096ó\u0089¹\u0089g\u0098-\u0092ë\u0097\u0000AºgtI.kèf¢j\\q\u0016a\u0000Aºmtb.{èc¢f\\v\u0016SÐm\u008awDrþR¸GrU,OæH ^Zd\u0014SÎ[\u0088jBVü'¶2p\t*/ä\u001e\u009e=X5\u0012.Ì?\u0086/Ë\u0005q=¿?å-#%i\u001e\u0097&Ý6\u001b\u0004A$\u008f/5\u0015s;¹\u0007ç\u000e-\u0014k\u000f\u0091\rß\u0015\u0000Uºmto.}èu¢N\\v\u0016fÐZ\u008azDmþD¸krW,^æD _Z]\u0014E\r¡·\u0087y #\u0086å\u009e¯\u0082Q\u0093\u001b\u0081\u0000Cºoto.lèb¢{\\B\u0016gÐw\u008akD{þS¸PrN,Oæ^\u0000Dºjtg.nèb¢`\\a\u0016aÐq\u008axD[þW¸ArI,^\u0000IºVth.`èx¢v\\S\u0016qÐk\u008aHDvþN¸Srk,Cæ^ DZV\u0014XÎ\\\u0088N\u0000gºftr.Jèy¢}\\`\u0016pÐv\u008aoDIþD¸Frq,CæH GZr\u0014FÎIA\u001aû\b5\u001ao\u0011©\u0001ã\u0013\u001d?W.\u00916Ë\u0007\u0005\u0005¿\u000eù43;m$§\u0015á9\u001b:\u0000sºftr.Jèy¢}\\`\u0016pÐv\u008aoDIþD¸Frq,CæH GZr\u0014FÎI\u008f¢5£û·¡\u008bg¨-§Ó²\u0099\u0099_¹\u0000gºftr.\\èb¢f\\f\u0016lÐY\u008a\u007fDmþm¸MrT,^æH ^ZV\u0014DÍ\u0095w\u0080¹\u0094ãº%\u0084o\u0080\u0091\u0080Û\u008a\u001d¿G\u0099\u0089\u008b3\u008bu«¿²á¸+®m¸\u0097°Ù¢\u0000aºgtb.\\èb¢f\\f\u0016lÐY\u008a\u007fDmþm¸MrT,^æH ^ZV\u0014D°ý\néÄä\u009eéXõ\u0012åìÈ¦ô`þ:àôèNï\bÏÂÛ\u009céVË\u0010ÌêÈ¤Ü~Ø8ÖòÂ\u0000gºftr.^èi¢m\\D\u0016|Ð}\u008alD[þW¸ArI,^æn QZG\u0014SÎ^\u0088SBMü;óSIR\u0087FÝj\u001b]QY¯tåD#]yZ·O\rfKd\u0081Vßh\u0015|Sj©s\"K\u0098JV^\fuÊL\u0080B~]4\\òY¨Rf\\Üy\u009aAPo\u008f\u00135\u0012û\u0006¡?g\u0019-\u0015Ó\b\u0099\u0004_\u001e\u0005#Ë\u0003q&7$ý6£0i</6\u001fÙ¥ÌkØ1á÷Ç½ËCÖ\tÚÏÀ\u0095ý[Ýáø§úmè3îùâ¿è\u001aµ ´n 4\u0094ò®¸\u00adF¯\fµÊ¾\u0090¼^¢ä\u009a¢\u0082h\u008c6±ü\u009b-u\u0097tY`\u0003KÅr\u008f|qc;býg§libÓG\u0095\u007f_Q\u0001~ËM\u008dMwL9eãO¥aoOÑ:\u009b2]9\u0007-èÈRÉ\u009cÝÆê\u0000ÌJÁ´Ùþõ8ÇbÀ¬Ø\u0016áPå\u009aûÕÏoÎ¡Úûå=ÅwÓ\u0089Û\u0000gºftr.Nèm¢b\\w\u0016\\Ð|\u008a]DlþN¸Ird,FæD UZ]\u0014BÎi\u0088NBPü2¶ p:*?ä'\u009e4X'\u0000gºftr.Yè`¢n\\q\u0016pÐu\u008a~DpþU¸mrC,læ_ _Z^\u0014rÎP\u0088]BXü,¶*p;*?ä'\u009e2X\u0011\u0012!Ì?\u00863@\u0014\u0000gºftr.Zèx¢}\\{\u0016{Ð\u007f\u008aOD\u007fþF¸W(\u0096\u0092\u0090\\\u0084\u0006\u0090À\u0092\u008a\u008cµ\u001e\u000f\u0002Á\n\u009b\u0004]\u000b\u0017\u0017é\u0016£\u001ce\t?\u0016ñ\u00048Ö\u0082ÂLÓ\u0016ØÐÍ\u009aØdÂ\u0000RºFtU.Fè@¢Y\\W\u0000CºBtE.AèI\u0000CºLtH.GèI¢L\\F\u0016\\ÐN\u008aRDJþx\u0000SºWtI.[èM¢H\\W\u0014\u0013®\u0000`\u0018:\u0019ü\u0019¶\u001dH\u0002\u0002\u0017Ä\u001d(Ô\u0092Ò\\Ø\u0006ÔÀ×\u008aÎtÉ>ÁøÅ±\u0098\u000b\u0097Å\u0090\u009f\u0082Y\u009b\u0013\u0091í\u009d§\u008b\u0000FºBtO.EèI¢K".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1265);
        f1289 = cArr;
        f1290 = 8989679445608937987L;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ String m1464() {
        int i = 2 % 2;
        int i2 = f1288 + 89;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1463();
        }
        m1463();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ Object m1465() {
        int i = 2 % 2;
        int i2 = f1288 + 61;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1462 = m1462();
        int i4 = f1287 + 81;
        f1288 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM1462;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m1474(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1288 + 77;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        Map mapM1489 = m1489(diagnosticEvent);
        int i4 = f1287 + 125;
        f1288 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapM1489;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m1480(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f1287 + 107;
        f1288 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1475(unityAdsLoadOptions);
        }
        m1475(unityAdsLoadOptions);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1481(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1287 + 95;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        m1476(iUnityAdsListener);
        int i4 = f1287 + 107;
        f1288 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m1482(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f1288 + 55;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        m1495(bannerView, iListener);
        int i4 = f1288 + InterfaceC0280i1.d.b.d;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ UnityAdsLoadOptions m1483(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1288 + 59;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        UnityAdsLoadOptions unityAdsLoadOptionsM1467 = m1467(adObject);
        int i4 = f1288 + 81;
        f1287 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unityAdsLoadOptionsM1467;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ BannerView.IListener m1484(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1288 + 9;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1471(bannerView);
        }
        m1471(bannerView);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1485(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1287 + 51;
        f1288 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1493(diagnosticEvent);
        }
        m1493(diagnosticEvent);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1488(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1288 + 105;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        String strM1473 = m1473(adObject);
        int i4 = f1288 + 89;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return strM1473;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1490(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1288 + 29;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        m1469(iUnityAdsListener);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = f1287 + 35;
        f1288 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ ByteString m1491(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1288 + InterfaceC0280i1.d.b.i;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        ByteString byteStringM1477 = m1477(adObject);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return byteStringM1477;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m1492(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1288 + InterfaceC0280i1.d.b.g;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        String strM1479 = m1479(bannerView);
        int i4 = f1288 + 71;
        f1287 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1479;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m1494(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1288 + 75;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        m1486(iUnityAdsListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public cf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        String str;
        int i = 2 % 2;
        int i2 = f1288 + 5;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        String version = UnityAds.getVersion();
        if (version == null) {
            return null;
        }
        int i4 = f1288 + 91;
        f1287 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1;
            TypedValue.complexToFloat(1);
            str = version.split(m1478(i5, 0, (char) (TextUtils.getCapsMode("", 1, 1) * 52746)).intern())[1];
        } else {
            str = version.split(m1478((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 52746)).intern())[0];
        }
        int i6 = f1288 + 3;
        f1287 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x02e7  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f1287 + 17;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        byte b2 = 1;
        switch (str.hashCode()) {
            case -2043984616:
                b2 = !str.equals(m1478((ViewConfiguration.getFadingEdgeLength() >> 16) + 362, TextUtils.lastIndexOf("", '0', 0) + 25, (char) (Color.argb(0, 0, 0, 0) + 59977)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -2015334886:
                if (!str.equals(m1478(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 746, 8 - View.resolveSize(0, 0), (char) (3552 - (Process.myTid() >> 22))).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1288 + 43;
                    f1287 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 40 : (byte) 66;
                }
                break;
            case -1797664962:
                b2 = !str.equals(m1478(View.MeasureSpec.getSize(0) + 140, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (59723 - Color.red(0))).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1769924254:
                if (!str.equals(m1478(TextUtils.indexOf((CharSequence) "", '0', 0) + 668, Color.red(0) + 8, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1287 + 117;
                    f1288 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b2 = 36;
                    } else {
                        b2 = 39;
                    }
                }
                break;
            case -1719935914:
                b2 = !str.equals(m1478(537 - Color.alpha(0), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1673897431:
                if (str.equals(m1478(TextUtils.indexOf("", "", 0) + 386, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1969)).intern())) {
                    int i6 = f1288 + 85;
                    f1287 = i6 % 128;
                    b2 = i6 % 2 != 0 ? Ascii.CAN : (byte) 98;
                } else {
                    b2 = -1;
                }
                break;
            case -1673719574:
                b2 = !str.equals(m1478(((byte) KeyEvent.getModifierMetaStateMask()) + 402, 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 25;
                break;
            case -1627944928:
                if (!str.equals(m1478((ViewConfiguration.getScrollBarSize() >> 8) + 292, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, (char) (11576 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i7 = f1287 + 55;
                    f1288 = i7 % 128;
                    b2 = i7 % 2 == 0 ? (byte) 19 : (byte) 87;
                }
                break;
            case -1543737546:
                b2 = !str.equals(m1478(1 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (char) (TextUtils.lastIndexOf("", '0') + 52330)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1347165098:
                b2 = !str.equals(m1478(93 - TextUtils.indexOf("", "", 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1258512514:
                b2 = !str.equals(m1478(752 - TextUtils.lastIndexOf("", '0', 0), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -1251710408:
                b2 = !str.equals(m1478(TextUtils.getOffsetAfter("", 0) + 550, (Process.myPid() >> 22) + 44, (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case -858834302:
                b2 = !str.equals(m1478((ViewConfiguration.getFadingEdgeLength() >> 16) + 246, ExpandableListView.getPackedPositionGroup(0L) + 15, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -800280637:
                b2 = !str.equals(m1478(Color.red(0) + 306, TextUtils.lastIndexOf("", '0') + 27, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 8302)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -618035586:
                b2 = !str.equals(m1478(189 - (ViewConfiguration.getPressedStateDuration() >> 16), 15 - TextUtils.getOffsetAfter("", 0), (char) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -598903877:
                b2 = !str.equals(m1478(157 - TextUtils.indexOf("", "", 0), 21 - (Process.myPid() >> 22), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -553681069:
                b2 = !str.equals(m1478(675 - KeyEvent.keyCodeFromString(""), 31 - TextUtils.lastIndexOf("", '0', 0, 0), (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -327500225:
                b2 = !str.equals(m1478(120 - Color.argb(0, 0, 0, 0), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47894)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -324825325:
                b2 = !str.equals(m1478(770 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case -324012869:
                b2 = !str.equals(m1478((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + InterfaceC0280i1.c.b.d, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT, (char) (50790 - ExpandableListView.getPackedPositionType(0L))).intern()) ? (byte) -1 : (byte) 11;
                break;
            case -262912338:
                b2 = !str.equals(m1478((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 281, 11 - KeyEvent.normalizeMetaState(0), (char) Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case -249507173:
                b2 = !str.equals(m1478(TextUtils.lastIndexOf("", '0') + 619, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48, (char) (2942 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -133620343:
                b2 = !str.equals(m1478((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 177, 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (21674 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -30759555:
                if (!str.equals(m1478(16 - TextUtils.indexOf((CharSequence) "", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 25, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b2 = -1;
                } else {
                    int i8 = f1287 + 81;
                    f1288 = i8 % 128;
                    int i9 = i8 % 2;
                }
                break;
            case 29694293:
                if (!str.equals(m1478((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 784, (ViewConfiguration.getJumpTapTimeout() >> 16) + 21, (char) View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i10 = f1288 + InterfaceC0280i1.d.b.d;
                    f1287 = i10 % 128;
                    b2 = i10 % 2 != 0 ? (byte) 43 : (byte) 109;
                }
                break;
            case 67119908:
                b2 = !str.equals(m1478(594 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 24, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4284)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 252148886:
                b2 = !str.equals(m1478(214 - View.MeasureSpec.getMode(0), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 539301490:
                if (!str.equals(m1478(726 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSizeAndState(0, 0, 0) + 19, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 39;
                }
                break;
            case 626721475:
                b2 = !str.equals(m1478(75 - ExpandableListView.getPackedPositionType(0L), 17 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21343)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 692588017:
                b2 = !str.equals(m1478(View.MeasureSpec.getMode(0) + 465, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern()) ? (byte) -1 : Ascii.FS;
                break;
            case 819533772:
                b2 = !str.equals(m1478((ViewConfiguration.getTouchSlop() >> 8) + 480, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (43183 - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case 961427118:
                b2 = !str.equals(m1478(271 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "") + 10, (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 961754217:
                b2 = str.equals(m1478(309 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, (char) (18507 - (Process.myTid() >> 22))).intern()) ? (byte) 16 : (byte) -1;
                break;
            case 961844241:
                if (!str.equals(m1478(416 - (ViewConfiguration.getLongPressTimeout() >> 16), 9 - Process.getGidForName(""), (char) (MotionEvent.axisFromString("") + 55901)).intern())) {
                    b2 = -1;
                } else {
                    int i11 = f1287 + 29;
                    f1288 = i11 % 128;
                    int i12 = i11 % 2;
                    b2 = Ascii.SUB;
                }
                break;
            case 1067215379:
                if (!str.equals(m1478(426 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 39, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i13 = f1287 + 119;
                    f1288 = i13 % 128;
                    int i14 = i13 % 2;
                    b2 = Ascii.ESC;
                }
                break;
            case 1246120607:
                b2 = !str.equals(m1478(TextUtils.indexOf((CharSequence) "", '0', 0) + 106, 15 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 1326268204:
                if (!str.equals(m1478(Color.green(0) + 500, Color.red(0) + 19, (char) Color.argb(0, 0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i15 = f1288 + 119;
                    f1287 = i15 % 128;
                    int i16 = i15 % 2;
                    b2 = Ascii.RS;
                }
                break;
            case 1374920114:
                b2 = !str.equals(m1478(234 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - Color.blue(0), (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1407526303:
                b2 = !str.equals(m1478(TextUtils.indexOf("", "", 0, 0) + 332, 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 1646468069:
                b2 = !str.equals(m1478((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 519, 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.US;
                break;
            case 1658279126:
                b2 = !str.equals(m1478((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, (char) (Gravity.getAbsoluteGravity(0, 0) + 62735)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1982491468:
                b2 = !str.equals(m1478(((Process.getThreadPriority(0) + 20) >> 6) + 228, 6 - TextUtils.getOffsetAfter("", 0), (char) (30597 - View.combineMeasuredStates(0, 0))).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case 2020034237:
                b2 = !str.equals(m1478((-16776509) - Color.rgb(0, 0, 0), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (52096 - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2068667541:
                b2 = !str.equals(m1478(View.MeasureSpec.makeMeasureSpec(0, 0) + 348, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 22;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return d.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case 8:
                return ShowAdListenerAdapter.class;
            case 9:
                return CustomEvent.class;
            case 10:
                return WebView.class;
            case 11:
                return WebRequest.class;
            case 12:
                return AdUnitActivity.class;
            case 13:
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return BannerView.Listener.class;
            case 32:
            case 33:
                return com.unity3d.services.banners.view.BannerView.class;
            case 34:
            case 35:
                return FullScreenWebViewDisplay.class;
            case 36:
                return AdObject.class;
            case 37:
                return AndroidFullscreenWebViewAdPlayer.class;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return UnityAdsLoadOptions.class;
            case 39:
                return UnityAdsBaseOptions.class;
            case 40:
                return AdFormat.class;
            case 41:
                return ClientProperties.class;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1478(806 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bg.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1466();
            }
        });
        map.put(m1478(Process.getGidForName("") + 826, 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (16761 - KeyEvent.normalizeMetaState(0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.this.m1496(list.get(0), clVar);
            }
        });
        map.put(m1478(843 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bg.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cf.m1487(list.get(0));
                return null;
            }
        });
        map.put(m1478(864 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36804)).intern(), new bg.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1468();
            }
        });
        map.put(m1478(871 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 19, (char) (MotionEvent.axisFromString("") + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1465();
            }
        });
        map.put(m1478(891 - Color.red(0), 19 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.rgb(0, 0, 0) + 16829926)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cf.m1494((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1478(910 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 19, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cf.m1481((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1478(929 - (Process.myTid() >> 22), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45199)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cf.m1490((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1478(951 - View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 23, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern(), new bg.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1472((String) list.get(0));
            }
        });
        map.put(m1478((ViewConfiguration.getKeyRepeatDelay() >> 16) + 974, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, (char) (62260 - Color.argb(0, 0, 0, 0))).intern(), new bg.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1470((String) list.get(0));
            }
        });
        map.put(m1478((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 991, 14 - TextUtils.indexOf("", "", 0), (char) (8748 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1492((BannerView) list.get(0));
            }
        });
        map.put(m1478(1007 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36724)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1484((BannerView) list.get(0));
            }
        });
        map.put(m1478((ViewConfiguration.getPressedStateDuration() >> 16) + IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Color.alpha(0) + 8106)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                cf.m1482((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        map.put(m1478(1040 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (6866 - TextUtils.indexOf("", "", 0, 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1491((AdObject) list.get(0));
            }
        });
        map.put(m1478(1056 - (ViewConfiguration.getPressedStateDuration() >> 16), 26 - KeyEvent.keyCodeFromString(""), (char) (11538 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1488((AdObject) list.get(0));
            }
        });
        map.put(m1478(1082 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59567)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1483((AdObject) list.get(0));
            }
        });
        map.put(m1478(View.getDefaultSize(0, 0) + 1096, Process.getGidForName("") + 8, (char) (54695 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1480((UnityAdsLoadOptions) list.get(0));
            }
        });
        map.put(m1478(1103 - KeyEvent.normalizeMetaState(0), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1464();
            }
        });
        map.put(m1478(TextUtils.indexOf("", "") + 1132, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1485((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m1478(TextUtils.getTrimmedLength("") + 1165, (KeyEvent.getMaxKeyCode() >> 16) + 13, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return cf.m1474((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        int i2 = f1287 + 15;
        f1288 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static Object m1462() {
        int i = 2 % 2;
        int i2 = f1288 + 65;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        IUnityAdsListener listener = UnityAds.getListener();
        int i4 = f1288 + 29;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1486(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1287 + 29;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.setListener(iUnityAdsListener);
        int i4 = f1287 + 29;
        f1288 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1476(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1288 + 47;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.addListener(iUnityAdsListener);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1288 + InterfaceC0280i1.d.b.i;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static void m1469(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1287 + 79;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.removeListener(iUnityAdsListener);
        int i4 = f1287 + 11;
        f1288 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Object m1466() {
        int i = 2 % 2;
        int i2 = f1287 + 89;
        f1288 = i2 % 128;
        if (i2 % 2 != 0) {
            WebViewApp.getCurrentApp();
            throw null;
        }
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i3 = f1287 + 31;
        f1288 = i3 % 128;
        int i4 = i3 % 2;
        return currentApp;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1496(Object obj, cl clVar) {
        int i = 2 % 2;
        d dVar = new d((WebViewApp) obj, clVar);
        int i2 = f1288 + 27;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m1487(Object obj) {
        int i = 2 % 2;
        int i2 = f1287 + 35;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        WebViewApp.setCurrentApp((d) obj);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f1288 + InterfaceC0280i1.d.b.b;
        f1287 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String m1468() {
        int i = 2 % 2;
        int i2 = f1287 + 21;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        String gameId = ClientProperties.getGameId();
        int i4 = f1288 + 75;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return gameId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x016d  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Enum m1472(String str) {
        int i = 2 % 2;
        byte b2 = 8;
        switch (str.hashCode()) {
            case -1810696374:
                if (!str.equals(m1478(1242 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) (10392 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1288 + 55;
                    f1287 = i2 % 128;
                    int i3 = i2 % 2;
                }
                break;
            case -1166291365:
                if (!str.equals(m1478(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1227, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, (char) (Process.myTid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -276710660:
                if (!str.equals(m1478(1184 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, (char) (Gravity.getAbsoluteGravity(0, 0) + 46408)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -54373961:
                if (!str.equals(m1478(1215 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 12, (char) TextUtils.getTrimmedLength("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 63879010:
                if (!str.equals(m1478(1209 - Color.alpha(0), Color.blue(0) + 5, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1167718561:
                if (!str.equals(m1478(Drawable.resolveOpacity(0, 0) + 1233, (ViewConfiguration.getTouchSlop() >> 8) + 9, (char) (5201 - KeyEvent.keyCodeFromString(""))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1813675631:
                if (!str.equals(m1478(1195 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 7, (char) (KeyEvent.normalizeMetaState(0) + 14468)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1815350732:
                if (!str.equals(m1478(ImageFormat.getBitsPerPixel(0) + Nd.a.g, 7 - View.MeasureSpec.getMode(0), (char) KeyEvent.normalizeMetaState(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1926303783:
                if (!str.equals(m1478(1178 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + 6, (char) (Color.green(0) + 10455)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                WebViewEventCategory webViewEventCategory = WebViewEventCategory.BROADCAST;
                int i4 = f1287 + 63;
                f1288 = i4 % 128;
                int i5 = i4 % 2;
                return webViewEventCategory;
            case 8:
                return WebViewEventCategory.LIFECYCLE;
            default:
                int i6 = f1288 + 75;
                f1287 = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                int i7 = 85 / 0;
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static Enum m1470(String str) {
        int i = 2 % 2;
        int i2 = f1287 + 31;
        f1288 = i2 % 128;
        if (i2 % 2 == 0) {
            int iHashCode = str.hashCode();
            byte b2 = -1;
            if (iHashCode != 183181625) {
                if (iHashCode == 2066319421 && str.equals(m1478((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1260, KeyEvent.normalizeMetaState(0) + 6, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern())) {
                    int i3 = f1288 + 39;
                    f1287 = i3 % 128;
                    int i4 = i3 % 2;
                    b2 = 1;
                }
            } else if (str.equals(m1478(1251 - TextUtils.indexOf("", "", 0), 7 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (45531 - View.MeasureSpec.getSize(0))).intern())) {
                int i5 = f1287 + 55;
                f1288 = i5 % 128;
                int i6 = i5 % 2;
                b2 = 0;
            }
            if (b2 == 0) {
                return WebRequestEvent.COMPLETE;
            }
            if (b2 == 1) {
                return WebRequestEvent.FAILED;
            }
            int i7 = f1287 + InterfaceC0280i1.d.b.b;
            f1288 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 97 / 0;
            }
            return null;
        }
        str.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1479(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1287 + 3;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = bannerView.getPlacementId();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerView.IListener m1471(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1288 + 45;
        f1287 = i2 % 128;
        if (i2 % 2 == 0) {
            bannerView.getListener();
            throw null;
        }
        BannerView.IListener listener = bannerView.getListener();
        int i3 = f1287 + 97;
        f1288 = i3 % 128;
        int i4 = i3 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1495(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f1288 + 73;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(iListener);
        int i4 = f1288 + 31;
        f1287 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m1477(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1287 + 21;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        ByteString opportunityId = adObject.getOpportunityId();
        int i4 = f1288 + 121;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return opportunityId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1473(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1287 + 79;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adObject.getPlacementId();
        int i4 = f1287 + 43;
        f1288 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static UnityAdsLoadOptions m1467(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1287 + 17;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        int i4 = f1287 + 69;
        f1288 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return loadOptions;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1475(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f1287 + 73;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject data = unityAdsLoadOptions.getData();
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return data;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1463() {
        int i = 2 % 2;
        int i2 = f1288 + 43;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        String gameId = ClientProperties.getGameId();
        int i4 = f1288 + 45;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return gameId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1493(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1288 + 41;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = diagnosticEvent.getPlacementId();
        int i4 = f1288 + 5;
        f1287 = i4 % 128;
        int i5 = i4 % 2;
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map m1489(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1287 + 107;
        f1288 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        int i4 = f1287 + 45;
        f1288 = i4 % 128;
        if (i4 % 2 == 0) {
            return stringTagsMap;
        }
        throw null;
    }

    class d extends WebViewApp implements hg<WebViewApp> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f1309 = 19600;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f1310 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f1311 = 44307;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f1312 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f1313 = 51315;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f1314 = 57665;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f1315 = -459592034693199275L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WebViewApp f1316;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cl f1318;

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ WebViewApp mo795() {
            int i = 2 % 2;
            int i2 = f1312 + 63;
            f1310 = i2 % 128;
            int i3 = i2 % 2;
            WebViewApp webViewAppM1498 = m1498();
            int i4 = f1312 + 69;
            f1310 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return webViewAppM1498;
        }

        d(WebViewApp webViewApp, cl clVar) {
            this.f1316 = webViewApp;
            this.f1318 = clVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WebViewApp m1498() {
            int i = 2 % 2;
            int i2 = f1310 + 45;
            f1312 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f1316;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z) {
            int i = 2 % 2;
            int i2 = f1312 + 51;
            f1310 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1499("ଅ\u0b52㸄琴뼺⯲쿼ᅕ∸䷈ʳ쟮姝ꊉ塆︨炜\uf821꿋镢긷퇠蚰䯃역⚒\udc15戻ﲘ簭", 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f1316;
            if (webViewApp != null) {
                int i4 = f1312 + 61;
                f1310 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebAppLoaded(z);
                if (i5 != 0) {
                    int i6 = 36 / 0;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            int i = 2 % 2;
            int i2 = f1310 + 73;
            f1312 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1499("죺좭\uf741뵱\ue763玫ಕ툼\ue1c7蒍嫪҇騢毌\u001f㵛덵ㅇ\uf7a0嘌淫ᢔ\udee9袖ر\uefd9葉ꅓ㽦", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f1310 + 99;
            f1312 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewApp.isWebAppLoaded();
            }
            webViewApp.isWebAppLoaded();
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            int i = 2 % 2;
            int i2 = f1312 + 69;
            f1310 = i2 % 128;
            if (i2 % 2 != 0) {
                cf cfVar = cf.this;
                cl clVar = this.f1318;
                String strIntern = m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩㷡\u2000ᢺ䗊\uf010촺\u07ba믳䃝钩誝ᔒ믜꽩輶翜騏∼땖蘇뭣ￛ璅씯", KeyEvent.getDeadChar(0, 0) * InterfaceC0280i1.d.b.d).intern();
                Object[] objArr = new Object[1];
                objArr[1] = str;
                cfVar.m815(this, clVar, strIntern, objArr);
                if (this.f1316 == null) {
                    return;
                }
            } else {
                cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩㷡\u2000ᢺ䗊\uf010촺\u07ba믳䃝钩誝ᔒ믜꽩輶翜騏∼땖蘇뭣ￛ璅씯", 34 - KeyEvent.getDeadChar(0, 0)).intern(), str);
                if (this.f1316 == null) {
                    return;
                }
            }
            this.f1316.setWebAppFailureMessage(str);
            int i3 = f1312 + 3;
            f1310 = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0057  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i) {
            int i2 = 2 % 2;
            int i3 = f1310 + 23;
            f1312 = i3 % 128;
            if (i3 % 2 == 0) {
                cf.this.m815(this, this.f1318, m1499("\ud87b\ud82c\ue29fꢯ\u3000\ua4c8䳇鉮\uf146酓趉䓕誣縒흼紓ꏢⒺ\u20f1ᙙ絉ൻঊ죸ᚙ輻匧\ue108⿶ꂠ볇驳菱襚薓", 1 - (ViewConfiguration.getEdgeSlop() >>> 35)).intern(), Integer.valueOf(i));
                if (this.f1316 != null) {
                    int i4 = f1310 + 41;
                    f1312 = i4 % 128;
                    int i5 = i4 % 2;
                    this.f1316.setWebAppFailureCode(i);
                }
            } else {
                cf.this.m815(this, this.f1318, m1499("\ud87b\ud82c\ue29fꢯ\u3000\ua4c8䳇鉮\uf146酓趉䓕誣縒흼紓ꏢⒺ\u20f1ᙙ絉ൻঊ죸ᚙ輻匧\ue108⿶ꂠ볇驳菱襚薓", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), Integer.valueOf(i));
                if (this.f1316 != null) {
                    int i6 = f1310 + 41;
                    f1312 = i6 % 128;
                    int i7 = i6 % 2;
                    this.f1316.setWebAppFailureCode(i);
                }
            }
            int i8 = f1310 + 25;
            f1312 = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i = 2 % 2;
            int i2 = f1312 + 31;
            f1310 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩唥癵ᢺ䗊\uf010촺\u07ba믳䃝钩誝ᔒ믜꽩輶翜騏∼땖蘇뭣ￛ璅씯", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                return null;
            }
            int i4 = f1310 + 95;
            f1312 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewApp.getWebAppFailureMessage();
            }
            webViewApp.getWebAppFailureMessage();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
        
            r1 = r6.f1316.getWebAppFailureCode();
            r2 = com.ironsource.adqualitysdk.sdk.i.cf.d.f1310 + 79;
            com.ironsource.adqualitysdk.sdk.i.cf.d.f1312 = r2 % 128;
            r2 = r2 % 2;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getWebAppFailureCode() {
            int i = 2 % 2;
            int i2 = f1310 + 21;
            f1312 = i2 % 128;
            if (i2 % 2 == 0) {
                cf.this.m815(this, this.f1318, m1499("\uef7b\uef2c娢ဒ囘숐⨱\uf498왆⧮\ueb51∣붣욯놤ᯱ铢鰇䘩炯䩉뗆潒긎↙䊺㗿蟾\u18f6\u181d\uda1fﲅ치\u31e7\ue34b", -MotionEvent.axisFromString("")).intern(), new Object[0]);
            } else {
                cf.this.m815(this, this.f1318, m1499("\uef7b\uef2c娢ဒ囘숐⨱\uf498왆⧮\ueb51∣붣욯놤ᯱ铢鰇䘩炯䩉뗆潒긎↙䊺㗿蟾\u18f6\u181d\uda1fﲅ치\u31e7\ue34b", -MotionEvent.axisFromString("")).intern(), new Object[0]);
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z) {
            int i = 2 % 2;
            cf.this.m815(this, this.f1318, m1499("썃쌔ᄟ嬯퐢䃪\uf035⺜\uea7e拓榫\uf827醛趒㍞쇡룚휺쓓ꪫ晱ﻻ\ueda8琊ථঈ뜅巢㓒匳壬⚫\ue275竛憰", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f1316;
            if (webViewApp != null) {
                int i2 = f1310 + 31;
                f1312 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setWebAppInitialized(z);
            }
            int i4 = f1310 + 117;
            f1312 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            int i = 2 % 2;
            int i2 = f1310 + 79;
            f1312 = i2 % 128;
            if (i2 % 2 == 0) {
                cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩\ue01e\ue80a땖蘇ᢺ䗊\uf010촺窋砭\u17eb㐄馂땂䃝钩덨\ud954\u1aff㶱㥧ꓕ⍯\"㓅통\u0efc珶蹇켵", View.MeasureSpec.getMode(0) + 50).intern(), new Object[0]);
                if (this.f1316 == null) {
                    return;
                }
            } else {
                cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩\ue01e\ue80a땖蘇ᢺ䗊\uf010촺窋砭\u17eb㐄馂땂䃝钩덨\ud954\u1aff㶱㥧ꓕ⍯\"㓅통\u0efc珶蹇켵", View.MeasureSpec.getMode(0) + 40).intern(), new Object[0]);
                if (this.f1316 == null) {
                    return;
                }
            }
            int i3 = f1312 + 75;
            f1310 = i3 % 128;
            int i4 = i3 % 2;
            this.f1316.resetWebViewAppInitialization();
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppInitialized() {
            int i = 2 % 2;
            int i2 = f1312 + 15;
            f1310 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1499("\uf071\uf026雑\udce1᱗袟\uf060⻉\ud94c\ue51dꇞ\uf872ꊩੜשׂ솮课僗ಔ\uaaf9啠礄◝瑦㺻蹁罭嶪ߨ퓰邜⛭텘ﴔ", 1 - Color.blue(0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f1310 + 77;
            f1312 = i4 % 128;
            int i5 = i4 % 2;
            return webViewApp.isWebAppInitialized();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
        
            r1 = com.ironsource.adqualitysdk.sdk.i.cf.d.f1312 + 79;
            com.ironsource.adqualitysdk.sdk.i.cf.d.f1310 = r1 % 128;
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            super.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
        
            r1 = r6.f1316.getWebView();
            r2 = com.ironsource.adqualitysdk.sdk.i.cf.d.f1310 + 1;
            com.ironsource.adqualitysdk.sdk.i.cf.d.f1312 = r2 % 128;
            r2 = r2 % 2;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WebView getWebView() {
            int i = 2 % 2;
            int i2 = f1310 + 99;
            f1312 = i2 % 128;
            if (i2 % 2 == 0) {
                cf.this.m815(this, this.f1318, m1499("\ue2dc\ue28b୯䅟뺈⩀ᝫ짂쯡碣́ό뀄韢姴⚫饅쵊깹䷵䟮\ue49c蜛鍁Ⰿ", ViewConfiguration.getMaximumFlingVelocity() % 83).intern(), new Object[0]);
            } else {
                cf.this.m815(this, this.f1318, m1499("\ue2dc\ue28b୯䅟뺈⩀ᝫ짂쯡碣́ό뀄韢姴⚫饅쵊깹䷵䟮\ue49c蜛鍁Ⰿ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern(), new Object[0]);
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            int i = 2 % 2;
            cf.this.m815(this, this.f1318, m1499("㼺㽭䚽\u0c8d똃⋋䋙鱰ᘇ㕱ஊ䫋淢\uda30兿猍䒣肘꛲ᡇ騈ꥎ辐웳\uf1e9", Drawable.resolveOpacity(0, 0) + 1).intern(), webView);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp != null) {
                int i2 = f1310 + 33;
                f1312 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setWebView(webView);
            }
            int i4 = f1312 + 13;
            f1310 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            int i = 2 % 2;
            int i2 = f1310 + 125;
            f1312 = i2 % 128;
            if (i2 % 2 == 0) {
                cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩唥癵ᢺ䗊礯띓㷳溎\ufde3㙃輶翜噢愺㯙鑧✲㶒", 44 >> View.MeasureSpec.getMode(0)).intern(), new Object[0]);
                if (this.f1316 == null) {
                    return null;
                }
            } else {
                cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩唥癵ᢺ䗊礯띓㷳溎\ufde3㙃輶翜噢愺㯙鑧✲㶒", View.MeasureSpec.getMode(0) + 27).intern(), new Object[0]);
                if (this.f1316 == null) {
                    return null;
                }
            }
            int i3 = f1310 + 27;
            f1312 = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f1316.getConfiguration();
            }
            int i4 = 3 / 0;
            return this.f1316.getConfiguration();
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            int i = 2 % 2;
            cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩㷡\u2000ᢺ䗊礯띓㷳溎\ufde3㙃輶翜噢愺㯙鑧✲㶒", TextUtils.lastIndexOf("", '0', 0, 0) + 28).intern(), configuration);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp != null) {
                int i2 = f1310 + InterfaceC0280i1.d.b.b;
                f1312 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setConfiguration(configuration);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = f1312 + 55;
                f1310 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
            int i = 2 % 2;
            int i2 = f1310 + 93;
            f1312 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩㷡\u2000\ue4b9棹ᘐ鮭⋦\ufde3떤模", 20 - (Process.myPid() >> 22)).intern(), r6, r7, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f1312 + 107;
            f1310 = i4 % 128;
            int i5 = i4 % 2;
            return webViewApp.sendEvent(r6, r7, objArr);
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            int i = 2 % 2;
            int i2 = f1310 + 35;
            f1312 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1499("擻撬욚貪꽏㮇鋬䱅䷆땖\u12c6髾㘣娗䠳ꌢὩ½뾆졼쇎⥲雐ᛗ\uaa37\ude0c챥", View.MeasureSpec.getSize(0) + 1).intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                return false;
            }
            boolean zInvokeMethod = webViewApp.invokeMethod(str, str2, method, objArr);
            int i4 = f1310 + 91;
            f1312 = i4 % 128;
            int i5 = i4 % 2;
            return zInvokeMethod;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            return r6.f1316.invokeCallback(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
        
            r7 = com.ironsource.adqualitysdk.sdk.i.cf.d.f1310 + 117;
            com.ironsource.adqualitysdk.sdk.i.cf.d.f1312 = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
        
            if ((r7 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        
            r7 = 23 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
        
            if (r6.f1316 != null) goto L9;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean invokeCallback(Invocation invocation) {
            int i = 2 % 2;
            int i2 = f1312 + 67;
            f1310 = i2 % 128;
            if (i2 % 2 != 0) {
                cf cfVar = cf.this;
                cl clVar = this.f1318;
                String strIntern = m1499("힏ퟘ\uedf0Ꟁ\uebec缤棆뙯ﺲ鸼噥惔蕗煽ಐ夈객⯗ﬥ㉖犺Ȗ퉷\uece5᥇\uf56b裃씆“", -ExpandableListView.getPackedPositionChild(1L)).intern();
                Object[] objArr = new Object[1];
                objArr[1] = invocation;
                cfVar.m815(this, clVar, strIntern, objArr);
            } else {
                cf.this.m815(this, this.f1318, m1499("힏ퟘ\uedf0Ꟁ\uebec缤棆뙯ﺲ鸼噥惔蕗煽ಐ夈객⯗ﬥ㉖犺Ȗ퉷\uece5᥇\uf56b裃씆“", -ExpandableListView.getPackedPositionChild(0L)).intern(), invocation);
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            cf.this.m815(this, this.f1318, m1500("\uf010촺窋砭\u17eb㐄馂땂䃝钩ദ畷\uf528짼粕൳뵈䙧譊짽嶺⑷", 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp != null) {
                int i2 = f1310 + 115;
                f1312 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.addCallback(nativeCallback);
            }
            int i4 = f1312 + 105;
            f1310 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            int i2 = f1312 + 47;
            f1310 = i2 % 128;
            if (i2 % 2 != 0) {
                cf.this.m815(this, this.f1318, m1499("귉궞籸㙈⌄럌\uf1fd⽔蓴ྴ麍璘１\ue0f5쑸쀨홐멄㏍ꭰࣼ鎞\u1a9f痞持擣䀫尽婚", -TextUtils.indexOf((CharSequence) "", '\n')).intern(), nativeCallback);
                if (this.f1316 == null) {
                    return;
                }
            } else {
                cf.this.m815(this, this.f1318, m1499("귉궞籸㙈⌄럌\uf1fd⽔蓴ྴ麍璘１\ue0f5쑸쀨홐멄㏍ꭰࣼ鎞\u1a9f痞持擣䀫尽婚", -TextUtils.indexOf((CharSequence) "", '0')).intern(), nativeCallback);
                if (this.f1316 == null) {
                    return;
                }
            }
            this.f1316.removeCallback(nativeCallback);
            int i3 = f1310 + 49;
            f1312 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i = 2 % 2;
            int i2 = f1312 + 93;
            f1310 = i2 % 128;
            int i3 = i2 % 2;
            cf.this.m815(this, this.f1318, m1499("그궯騫퀛萺ჲ₿︖蓅\ue9e7㦳⢭＠ڦ捆ᅿ홡導铟稥ࣄ痢붢꒑挿芹", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), str);
            WebViewApp webViewApp = this.f1316;
            Object obj = null;
            if (webViewApp != null) {
                int i4 = f1312 + 45;
                f1310 = i4 % 128;
                if (i4 % 2 == 0) {
                    return webViewApp.getCallback(str);
                }
                webViewApp.getCallback(str);
                super.hashCode();
                throw null;
            }
            int i5 = f1312 + 95;
            f1310 = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            int i = 2 % 2;
            cf.this.m815(this, this.f1318, m1499("噖嘁鰈호\udef8䨰닥汌罫\uefc4捱뫷Ҏ\u0085㦄茥\u2dcf娭츛\ue86c\uf374珂\ue770㛹领蒐뷂ἣꇨ\ude37刵摿睍\uf7cc歬닯ᲆࢍǱ鬕◆∤", -MotionEvent.axisFromString("")).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1316;
            if (webViewApp == null) {
                int i2 = f1312 + 125;
                f1310 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 8 / 0;
                }
                return null;
            }
            int i4 = f1312 + 91;
            f1310 = i4 % 128;
            if (i4 % 2 == 0) {
                return webViewApp.getErrorStateFromWebAppCode();
            }
            webViewApp.getErrorStateFromWebAppCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m1499(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2288) {
                char[] cArrM2212 = h.m2212(f1315, cArr, i);
                h.f2289 = 4;
                while (h.f2289 < cArrM2212.length) {
                    h.f2290 = h.f2289 - 4;
                    cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f1315));
                    h.f2289++;
                }
                str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1500(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1311)) ^ ((c2 >>> 5) + f1309)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1313) ^ ((c3 + i2) ^ ((c3 << 4) + f1314))));
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

    public static class b extends bg {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f1306 = 652229030572876733L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f1307 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1308 = 1;

        public b(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ｋ */
        public final String mo789() {
            int i = 2 % 2;
            int i2 = f1307 + 75;
            f1308 = i2 % 128;
            int i3 = i2 % 2;
            String version = UnityAds.getVersion();
            Object obj = null;
            if (version == null) {
                return null;
            }
            String str = version.split(m1497("掐", KeyEvent.keyCodeFromString("") + 63299).intern())[0];
            int i4 = f1308 + 95;
            f1307 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:19:0x0094  */
        @Override // com.ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﻛ */
        public final Class mo788(String str) {
            int i = 2 % 2;
            byte b = 0;
            switch (str.hashCode()) {
                case 252148886:
                    if (!str.equals(m1497("揼\udc60Ლ峸鴰\udd54ᶪ巑鸁\ude55ự弧齥\udfa1", 49080 - MotionEvent.axisFromString("")).intern())) {
                        b = -1;
                    }
                    break;
                case 961844241:
                    if (!str.equals(m1497("揿畏仵\u206a㦔ጐ\ue499\ufdd1흀꣡", 5779 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        int i2 = f1307 + 125;
                        int i3 = i2 % 128;
                        f1308 = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 31;
                        f1307 = i5 % 128;
                        int i6 = i5 % 2;
                        b = 2;
                    }
                    break;
                case 1067215379:
                    if (!str.equals(m1497("揞ѯ겪咤ﴼ敢ය뗢帬옫溻ᚌ뼒❁쾙矘᠄聓⢒탉祗\ue15e觢㈨\uda6b䊭\ueafd錡㬿ꎖ䯺\uec30鑳㲅ꓕ䴼\uf540鶉ׄ", TextUtils.indexOf((CharSequence) "", '0') + 26558).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1531208100:
                    if (!str.equals(m1497("揞ᐡ谶ъ밄㑬걦⑬\udc5c吅첧䓢ﲪ璏\uec85擶᳤铽\u0cce蓇㵯딳ⴻꔛ嵛핧䵷앩絇\uf553涳\ue5fe鶜ᖊ趮ת뷸㗖귮◛\ude31嘿츕䘅︍癳", (ViewConfiguration.getWindowTouchSlop() >> 8) + 30707).intern())) {
                        b = -1;
                    } else {
                        int i7 = f1307 + 89;
                        f1308 = i7 % 128;
                        if (i7 % 2 != 0) {
                            b = 1;
                        }
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0 || b == 1) {
                return AdUnitActivity.class;
            }
            if (b == 2 || b == 3) {
                return BannerView.class;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﾇ */
        final Map<String, bg.c> mo790() {
            int i = 2 % 2;
            HashMap map = new HashMap();
            int i2 = f1308 + 97;
            f1307 = i2 % 128;
            int i3 = i2 % 2;
            return map;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1497(String str, int i) {
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
                    cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1306);
                    i.f2433++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1478(int i, int i2, char c) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f1289[com.ironsource.adqualitysdk.sdk.i.b.f638 + i]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f1290)) ^ ((long) c));
                com.ironsource.adqualitysdk.sdk.i.b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
