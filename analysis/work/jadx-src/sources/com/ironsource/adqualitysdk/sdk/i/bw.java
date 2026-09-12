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
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.Nd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bw extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1103 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1104 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1105 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1106;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ã\u0012\u0006é2ÀA\u0097pm\u008eDß\u001bðò8É* YwcM\u0081$µûÜÒÍ©\t\u0080<WO.r\u0004\u008bÛ´²çæ~0¬KÌb©½\u0003Ô2ïK\u0006jP\u009fký\u0082ØÝùô\u001b\u000f>&Kq~\u008b\u009e¢×ýè\u0014\u0011/ F\u0005\u0091z«\u008bÂ¦\u001d\u009d4ðO\u0014f!±RÈoâ\u0096=©Têo\u0004\u00864Ñ\u000bèB\u0002\u0087]¡tÈ\u008fá¦\u0010ñ4\bA#r}\u008f\u0094º¯ôÆ\r\u00115(BCw\u009d\u0085´¨ÏÃæÏ1\u0001H>c@ºfÔ\u009eï«\u0006þQþh7\u0083HÚqô\u008c\u000f¿&Ð\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ì\u0012\u001dé*ÀH\u0097qm\u0083DÌ\u001bùò\u001fÉ6 wwpM³$³ûÚÒå©\u001c\u0080!WR.}\u0000cÖ±\u00adÑ\u0084´[\u001e2/\tVàw¶\u0082\u008dàdÅ;ä\u0012\u0006é#ÀV\u0097cm\u0083DÊ\u001bõò\fÉ= \u0018wgM\u0096$»û\u0080Òí©\t\u0080<WO.r\u0004\u008bÛ´²÷\u0089\u0019`)7\u0016\u000e_ä\u009a»¼\u0092Õiü@\r\u0017)î\\Åo\u009b\u0092r§Iæ \u000b÷0ÎV¥k{\u0095R¦)×\u0000õ×\u0000®\r\u0085N\\I2\u0085\t°àË·ö\u008e7eH<c\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ø\u0012\u0001é%ÀL\u0097Om\u0085DÚ\u001bõò\u001bÉ\u000e _wpM\u0097$¿ûþÒà©\u000b\u00801WC.v\u0004£Û£²ê\u0089\u0015`,7Q\u000ebä\u008d»\u0091\u0092ßiü@\t\u0098nN¼5Ü\u001c¹Ã\u0013ª\"\u0091[xz.\u008f\u0015íüÈ£é\u008a\u000bq.X[\u000fnõ\u008eÜÇ\u0083øj\u0001Q08\u0015ïjÕ\u009b¼¶c\u008dJà1\u0004\u00181ÏB¶\u007f\u009c\u0086C¹*ú\u0011\u0014ø$¯\u001b\u0096R|\u0097#±\nØññØ\u0000\u008f$vQ]b\u0003\u009fêªÑÿ¸\u001ao2V_=Xã\u009eÊ½±Ö\u0098üO56(\u001dCÄ`ª\u0084\u0091\u0099xÃ/ì\u0016*ýT¤e\u008a´q¸XÍ\u000föö\u000bÝ*\u0084Uk~Q¦8¤ïÛÖê\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ë\u0012\fé\u0015ÀT\u0097mm\u0094\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ë\u0012\fé\u0014ÀA\u0097sm\u0095DÛ\u001bïò\u000e\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ë\u0012\fé\u0014ÀA\u0097lm\u0084DÛ\u001bîò\u001fÉ*Hk\u009e\u0092åðÌÝ\u0013(z\u0015Au¨Dþ»Å\u009a,ësåZ/¡\u0000\u0088oßA%¶\fõSÑº6\u00814èu?[\u0005µ\u0000IÖ\u009f\u00adÿ\u0084õ[\u001620\t]àu¶½\u008d¯dÂ;ë\u0012\u000fé#ÀV½Ðk)\u0010K9fæ\u0093\u008f®´Î]ÿ\u000b\u00000!ÙP\u0086P¯\u009eT±}É*þÐ\u0017ùS¦FO\u008ct¯\u001dÛÊÿð\u0004\u0099%F[op\u0014\u0081\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;ß\u0012\u0006é/ÀP\u0097Am\u008fDÐ\u001bèò\bÉ7 ZwxM\u0097$¢\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ë\u0012\fé\u0010ÀM\u0097gm\u0097Dë\u001bòò\u0013É, uw{M\u009c$¤ûÜÒã©\u0006\u0080$WC.v)\u0096ÿs\u0084\u0016\u00ad-rÿ\u001bü \u0084É¡\u009f_¤lM\u0016\u0012\u001d;ÒÀõé\u00824xâ\u0095\u0099ä°Éo1\u0006\u0018=EÔF\u0082¾¹\u0087Pô\u000fÙ&0Ý\t\u0000RÛG\r¾vÜ_ñ\u0080\u0004é9ÒY;hm\u0097V¶¿ÇàÂÉ\u00132$\u001bFL\u007f¶\u008d\u009fÂÀ÷)\u0011\u00128{n¬s\u0096\u0098ÿ» Ï\tÁr\u000b[(\u008c\\õoß\u0082\u0000ºiÓR\u001d»:ìBÕj?\u0095`°IÒ²å\u009b\u0010Û\\\r¥vÇ_ê\u0080\u001fé\"ÒB;sm\u008cV\u00ad¿ÜàÙÉ\b2?\u001b]Ld¶\u0096\u009fÙÀì)\n\u0012#{b¬e\u0096¢ÿ³ Þ\t÷r\u000b[.\u008c\u007fõxß\u0084\u0000¡iîR\u0007»*ì_a\u00ad·LÌ#å\u0004:ìSîh \u0081\u0087×\u007fìP\u00059Z\u0005sß\u0088Ô¡¬ö\u008d\f~%+z\u0002\u0093ó\u0000IÖ°\u00adÈ\u0084ÿ[\n28\tUà~¶²\u008d¼dÃ;ý\u0012\u001bé#ÀV\u0097Nm\u0089DÍ\u001bèò\u001fÉ6 Swf\u0000TÖ¿\u00adÌÿ7)ÎR¬{\u0081¤tÍIö)\u001f\u0018IçrÆ\u009b·Ä²íc\u0016T?6h\u000f\u0092ý»²ä\u0087\ra6H_\t\u0088\u000e²ÉÛØ\u0004µ-\u009cV`\u007fE¨\u0014Ñ\u0013ûï$ÊM\u0085vl\u009fAÈ4ñ)\u001bîDÍm¾\u0096\u0084¿wèF¡éw\u0010\fr%_úª\u0093\u0097¨÷AÆ\u00179,\u0018Åi\u009al³½H\u008aaè6ÑÌ#ålºYS¿h\u0096\u0001ÃÖÚì;\u0085\u0004ZMsC\b¤!\u009cöô\u008fË¥.z\f\u0013[(®\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ë\u0012\fé\u0010ÀM\u0097gm\u0097Dè\u001bõò\u001eÉ= YwWM\u009d$¾ûÚÒé©\u0004\u0080<We.k\u0004\u008cÛ´²ì\u0089\u0013`67T\u000esä\u0086\u0000EÖ¨\u00adÙ\u0084ô[\f2%\txà{¶\u0083\u008dºdÉ;ä\u0012\ré4Àe\u0097fm\u0081DÎ\u001bèò\u001fÉ*\u0000VÖ·\u00adØ\u0084ÿ[\u00172\u0015\t[à|¶\u0084\u008d«dÂ;þ\u0012$é/ÀW\u0097vm\u0085DÐ\u001bùò\bÉ\u0019 RwuM\u0082$¤ûËÒþjp¼¦ÇÈîÑ1 X\u0006ci\u008a`Ü ç\u0083\u0000IÖ\u009f\u00adÑ\u0084è[\u00192?\tPàE¶\u0095\u008d¬dú;ã\u0012\ré1Àg\u0097mm\u008eDÊ\u001bîò\u0015É4 ZwqM\u0080\u0000IÖ\u009f\u00adê\u0084ó[\u001c23\t[àY¶\u0099\u008dº!P÷ª\u008cÕ¥ñz\u0004\u0013<(^Áb\u0097\u0086¬¹Eñ\u001aò3\u0005È>ø\u0012.ÄU\u0095|¨£@Êeñ\"\u0018,NÏuü\u009c\u0096Ã\u0087êZ\u0011y8\u001ao6\u0095í¼\u008cã¢\nV\u0000BÖ¿\u00adÏ\u0084ÿ[.2?\tPàw¶\u009f\u008d\u0098dÅ;ï\u0012\u001fé\nÀM\u0097qm\u0094DÛ\u001bòò\u001fÉ*\u0000IÖ°\u00adÒ\u0084ÿ[\n27\tWàf¶\u0099\u008d¸dÉ;Ì\u0012\u001dé*ÀH\u0097qm\u0083DÌ\u001bùò\u001fÉ6 wwpM·$¦ûËÒâ©\u001e\u0080;Wj.m\u0004\u0091Û´²û\u0089\u0012`?7J\u000eAä\u009d»¦\u0092ØiÇ@\u0001\u0017:îZÅc\u009b\u0097r±IÉ \u0011÷2Î~¥y{\u0082RµVå\u0080\u001cû~ÒS\r¦d\u009b_û¶Êà5Û\u00142emgD ¿¼\u0096áÁË;;\u0012WMF¤³\u009f\u009aöî!Ë\u001b\u0012r\u0015\u00adq\u0084Tÿ£Ö\u008a\u0001ïxÚR\u0019\u008d\u0005äFß¸6¿aùXÊ²*í\u001bÄo?Q\u0016©A\u0089¸ê\u0093îÍ)$\u001a\u001fm\u0000gÖ»\u00adÈ\u0084Ù[\r2$\tFàw¶\u009e\u008dºdü;ø\u0012\u0007é%ÀA\u0097qm\u0093DÛ\u001bøò(É= GwaM\u0097$£ûÚ;Äí\u0018\u0096k¿j`«\t\u009a2ãÛø\u008d7àU6\u0089Múdé».Ò'éi\u0000NV¶m\u0099\u0084ðÛÌZË\u008c\u000f÷XÞM\u0001¶h\u0098SåºÓì ×\t>kaFH\u008b³\u0080\u0000iÖ\u00ad\u00adê\u0084ó[\u001c23\t[àS¶\u0094\u0000gÖ»\u00adÈ\u0084Ù[\u00142?\tWày¶¤\u008d¦dÞ;å\u0012\u001dé!ÀL\u0097Wm\u0092DÒô'\"ûY\u0088p\u0096¯YÆoý\u001b\u0014'BÄwR¡\u008eÚýóü,(E\u000f~d\u0097DÁ±ú\u009e\u0013ýLêe3\u009e\u001a·eàt\u001aº3ålÝ\u0085=¾\u0002×o\u0000M:¢S\u0097cCµ\u009fÎìçí89Q\u001eju\u0083UÕ î\u008f\u0007ìXíq#\u008a\f£tôC\u000eª'îxû\u00911ª\u0012Ãf\u0014B.¹G\u0098\u0098æ±ÍÊ<\u0088\u0003^ß%¬\f»ÓjºW\u0081>h\u0002>ç\u0005æì¡³\u009d\u009axaGH.\u001f\u0003åö\u0000sÖ»\u00adÈ\u0084ß[\u000e23\tZàf¶\u0083\u008d\u0082dÅ;ù\u0012\u001cé#ÀJ\u0097gm\u0092Ùª\u000fvt\u0005]\u0016\u0082ÑëÈÐ\u00899°oIæ\u00810]K.b)½ðÔÙï¦\u0006°P\u007fk[\u0082:Ý\u0000ôï\u000fÙ&\u0096q\u009d\u008bv¢=ý?\u0014ò/ËF½¤¸rd\t\u0017 \bÿÕ\u0096è\u00ad\u0082D©\u0012m)pÀ\u001d\u009f;¶ÒMëd\u00ad3´ÉZà\u0016¿\nVÁÌy\u001a¥aÖHÍ\u0097\u000bþ8ÅX,iz\u009dA£¨Û÷ûÞ\u0018%\u001c\f[[h¡\u009f\u0088ä×í>\t\u0005'lA»dÂ.\u0014÷o\u008fF¸\u0099MðbË\u0007\"<tÃOà¦\u008aù¡!A÷\u0092\u008cÿ¥Óz&\u0013\u0018(xÁO\u0097¸\u0000MÖ\u008c\u00adù\u0084Ù[,\u009açL:7W\u001eqÁ\u0098¨¡¥\u0095s\\\b,!\u001cþí\u0097Õ¬¶E\u0091\u001e\nÈÖ³°\u009a\u0082Es,J\u0000VÖ\u009b\u00adî\u0084Î[12\u0015\tuà^\u0000DÖ\u009b\u00adú\u0084Û[-2\u001a\t`".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        f1106 = cArr;
        f1103 = -8859821490785036578L;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ int m1220() {
        int i = 2 % 2;
        int i2 = f1105 + InterfaceC0280i1.d.b.b;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        int iM1222 = m1222();
        int i4 = f1105 + 63;
        f1104 = i4 % 128;
        int i5 = i4 % 2;
        return iM1222;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveUnitController m1221(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1105 + 55;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveUnitController inneractiveUnitControllerM1218 = m1218(inneractiveAdSpot);
        int i4 = f1104 + 87;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return inneractiveUnitControllerM1218;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdRequest m1228(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1105 + 89;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdRequest inneractiveAdRequestM1226 = m1226(inneractiveAdSpot);
        int i4 = f1105 + 115;
        f1104 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return inneractiveAdRequestM1226;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Enum m1230(String str) {
        int i = 2 % 2;
        int i2 = f1105 + 55;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM1224 = m1224(str);
        int i4 = f1104 + 63;
        f1105 = i4 % 128;
        if (i4 % 2 != 0) {
            return enumM1224;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m1231(InneractiveUnitController inneractiveUnitController) {
        int i = 2 % 2;
        int i2 = f1104 + 61;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1234 = m1234(inneractiveUnitController);
        int i4 = f1104 + InterfaceC0280i1.d.b.b;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return objM1234;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ InneractiveContentController.EventsListener m1232(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i = 2 % 2;
        int i2 = f1104 + 33;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveContentController.EventsListener eventsListenerM1243 = m1243(inneractiveFullscreenVideoContentController);
        int i4 = f1104 + 95;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return eventsListenerM1243;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m1235(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 85;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM1223 = m1223(inneractiveAdSpot);
        int i4 = f1104 + 117;
        f1105 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM1223;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m1236(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = 2 % 2;
        int i2 = f1105 + 71;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1233 = m1233(inneractiveFullscreenAdActivity);
        int i4 = f1104 + 19;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return objM1233;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1239(InneractiveAdRequest inneractiveAdRequest) {
        int i = 2 % 2;
        int i2 = f1104 + 49;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        String strM1248 = m1248(inneractiveAdRequest);
        int i4 = f1104 + 95;
        f1105 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return strM1248;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1240(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 31;
        f1105 = i2 % 128;
        if (i2 % 2 == 0) {
            m1219(inneractiveAdSpot);
            throw null;
        }
        String strM1219 = m1219(inneractiveAdSpot);
        int i3 = f1105 + 61;
        f1104 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM1219;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdSpot m1242(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = 2 % 2;
        int i2 = f1104 + 17;
        f1105 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m1229(inneractiveAdViewUnitController);
            throw null;
        }
        InneractiveAdSpot inneractiveAdSpotM1229 = m1229(inneractiveAdViewUnitController);
        int i3 = f1104 + 19;
        f1105 = i3 % 128;
        if (i3 % 2 != 0) {
            return inneractiveAdSpotM1229;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m1244(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i = 2 % 2;
        int i2 = f1105 + 9;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        m1241(inneractiveContentController, eventsListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m1245(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 91;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM1225 = m1225(inneractiveAdSpot);
        int i4 = f1104 + 23;
        f1105 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return zM1225;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m1246(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1105 + 59;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1227 = m1227(inneractiveAdSpot);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return objM1227;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m1247(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1105 + 65;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        String strM1238 = m1238(impressionData);
        int i4 = f1105 + 115;
        f1104 = i4 % 128;
        int i5 = i4 % 2;
        return strM1238;
    }

    public bw(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f1105 + 41;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        String version = InneractiveAdManager.getVersion();
        int i4 = f1105 + 19;
        f1104 = i4 % 128;
        int i5 = i4 % 2;
        return version;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0578  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1764994669:
                if (!str.equals(m1237((ViewConfiguration.getTouchSlop() >> 8) + 864, (Process.myPid() >> 22) + 10, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i2 = f1105 + 61;
                    f1104 = i2 % 128;
                    b = i2 % 2 == 0 ? Ascii.GS : (byte) 60;
                }
                break;
            case -1757761411:
                if (!str.equals(m1237(803 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 27 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i3 = f1105 + 69;
                    f1104 = i3 % 128;
                    b = i3 % 2 == 0 ? Ascii.SUB : (byte) 110;
                }
                break;
            case -1751837367:
                b = !str.equals(m1237(104 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 30 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1661930846:
                if (!str.equals(m1237(247 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 80, (char) (TextUtils.getOffsetBefore("", 0) + 38925)).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1611796569:
                if (!str.equals(m1237(TextUtils.indexOf("", "") + 581, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (char) (56085 - TextUtils.getOffsetBefore("", 0))).intern())) {
                    b = -1;
                } else {
                    int i4 = f1104 + 25;
                    f1105 = i4 % 128;
                    b = i4 % 2 != 0 ? Ascii.DC2 : (byte) 53;
                }
                break;
            case -1452673136:
                if (!str.equals(m1237((ViewConfiguration.getTouchSlop() >> 8) + 344, TextUtils.lastIndexOf("", '0', 0) + 21, (char) (Process.myPid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i5 = f1104 + 73;
                    f1105 = i5 % 128;
                    b = i5 % 2 != 0 ? (byte) 7 : (byte) 43;
                }
                break;
            case -1264220508:
                b = !str.equals(m1237((-16776739) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.CR;
                break;
            case -1205203919:
                b = !str.equals(m1237(538 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 43, (char) (ImageFormat.getBitsPerPixel(0) + 56079)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -1190251081:
                b = !str.equals(m1237(KeyEvent.keyCodeFromString("") + IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 35 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41375)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1115843213:
                b = !str.equals(m1237((ViewConfiguration.getScrollDefaultDelay() >> 16) + 874, 13 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8472)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -955341033:
                b = !str.equals(m1237(View.resolveSizeAndState(0, 0, 0) + 830, (KeyEvent.getMaxKeyCode() >> 16) + 10, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27192)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -758374370:
                b = !str.equals(m1237(743 - Drawable.resolveOpacity(0, 0), 39 - Gravity.getAbsoluteGravity(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -587023626:
                if (!str.equals(m1237((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 839, View.combineMeasuredStates(0, 0) + 24, (char) (Process.myPid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i6 = f1105 + 87;
                    f1104 = i6 % 128;
                    b = i6 % 2 == 0 ? Ascii.FS : (byte) 71;
                }
                break;
            case -312786562:
                b = !str.equals(m1237(TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "") + 34, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -233888832:
                b = !str.equals(m1237((ViewConfiguration.getPressedStateDuration() >> 16) + 929, 55 - TextUtils.indexOf("", ""), (char) TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case -50587944:
                b = !str.equals(m1237((ViewConfiguration.getMinimumFlingVelocity() >> 16) + IronSourceError.ERROR_CODE_INIT_FAILED, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, (char) (10691 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case 82:
                if (!str.equals(m1237(((Process.getThreadPriority(0) + 20) >> 6) + 537, -ExpandableListView.getPackedPositionChild(0L), (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1105 + 79;
                    f1104 = i7 % 128;
                    b = i7 % 2 == 0 ? (byte) 16 : (byte) 90;
                }
                break;
            case 83843:
                b = !str.equals(m1237(662 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 114221977:
                b = !str.equals(m1237((ViewConfiguration.getKeyRepeatDelay() >> 16) + 424, 28 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48536)).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case 218220615:
                b = !str.equals(m1237((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 385, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (char) (View.resolveSizeAndState(0, 0, 0) + 18466)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 294386593:
                b = !str.equals(m1237(Color.rgb(0, 0, 0) + 16777543, 16 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 305774826:
                b = !str.equals(m1237(984 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 49, (char) (22188 - View.resolveSizeAndState(0, 0, 0))).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 334157136:
                b = !str.equals(m1237((ViewConfiguration.getScrollBarSize() >> 8) + 888, 20 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (63578 - TextUtils.lastIndexOf("", '0'))).intern()) ? (byte) -1 : Ascii.US;
                break;
            case 598324252:
                b = !str.equals(m1237(((byte) KeyEvent.getModifierMetaStateMask()) + 453, (ViewConfiguration.getTapTimeout() >> 16) + 25, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) -1 : Ascii.FF;
                break;
            case 652259752:
                if (!str.equals(m1237(663 - MotionEvent.axisFromString(""), 44 - (Process.myTid() >> 22), (char) (65406 - TextUtils.getTrimmedLength(""))).intern())) {
                    b = -1;
                } else {
                    int i8 = f1104 + 117;
                    f1105 = i8 % 128;
                    b = i8 % 2 != 0 ? (byte) 22 : (byte) 59;
                }
                break;
            case 778319234:
                b = !str.equals(m1237(782 - Color.green(0), TextUtils.indexOf("", "", 0) + 21, (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 809010015:
                b = !str.equals(m1237(TextUtils.getCapsMode("", 0, 0) + 638, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 986039922:
                b = !str.equals(m1237(Drawable.resolveOpacity(0, 0) + 618, 20 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (25082 - TextUtils.lastIndexOf("", '0'))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 996606931:
                b = !str.equals(m1237(409 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 15, (char) View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1840053850:
                b = !str.equals(m1237(35 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 71 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (58909 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1945237502:
                if (!str.equals(m1237(TextUtils.getOffsetAfter("", 0) + InterfaceC0280i1.c.b.e, ImageFormat.getBitsPerPixel(0) + 44, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i9 = f1104 + 69;
                    f1105 = i9 % 128;
                    if (i9 % 2 != 0) {
                        b = 4;
                    } else {
                        b = 5;
                    }
                }
                break;
            case 1956883725:
                b = !str.equals(m1237(523 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (View.getDefaultSize(0, 0) + 13373)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2019288557:
                if (!str.equals(m1237(Process.getGidForName("") + 137, 67 - Process.getGidForName(""), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                    b = -1;
                } else {
                    int i10 = f1105 + 115;
                    f1104 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 3;
                }
                break;
            case 2082429859:
                b = !str.equals(m1237(908 - Color.green(0), TextUtils.lastIndexOf("", '0', 0) + 22, (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 2110184418:
                b = !str.equals(m1237(364 - View.combineMeasuredStates(0, 0), 21 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 8;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                int i12 = f1105 + 23;
                f1104 = i12 % 128;
                int i13 = i12 % 2;
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case 8:
                return InneractiveAdRenderer.class;
            case 9:
                return InneractiveMediationName.class;
            case 10:
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case 12:
                return InneractiveUnitController.class;
            case 13:
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return IArichMediaVideoView.class;
            case 32:
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case 33:
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case 34:
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1237(1033 - KeyEvent.keyCodeFromString(""), TextUtils.getCapsMode("", 0, 0) + 26, (char) TextUtils.getCapsMode("", 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1228((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1237((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1059, (ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 15267)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1239((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m1237(1067 - TextUtils.indexOf((CharSequence) "", '0'), AndroidCharacter.getMirror('0') - '$', (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 57395)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1246((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1237(TextUtils.getOffsetBefore("", 0) + 1080, 14 - (KeyEvent.getMaxKeyCode() >> 16), (char) (23202 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bw.m1235((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1237(1093 - TextUtils.lastIndexOf("", '0'), 9 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bw.m1245((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1237(Process.getGidForName("") + 1104, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1240((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1237(1121 - View.MeasureSpec.makeMeasureSpec(0, 0), 9 - View.resolveSize(0, 0), (char) (View.getDefaultSize(0, 0) + 62528)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1236((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m1237(1130 - (ViewConfiguration.getEdgeSlop() >> 16), 25 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.myPid() >> 22) + 30517)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1221((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1237(1155 - Color.alpha(0), 27 - ExpandableListView.getPackedPositionChild(0L), (char) (25379 - MotionEvent.axisFromString(""))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1231((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m1237(1183 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC2, (char) (34917 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1232((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m1237(Color.red(0) + Nd.c.d, 17 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bw.m1244((InneractiveContentController) list.get(0), (VideoContentListener) list.get(1));
                return null;
            }
        });
        map.put(m1237(1216 - TextUtils.lastIndexOf("", '0', 0, 0), 9 - TextUtils.indexOf("", "", 0, 0), (char) (55757 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1242((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m1237(1226 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 22, (char) (59109 - TextUtils.lastIndexOf("", '0'))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1230((String) list.get(0));
            }
        });
        map.put(m1237(Color.rgb(0, 0, 0) + 16778464, 20 - (ViewConfiguration.getTouchSlop() >> 8), (char) (42207 - View.combineMeasuredStates(0, 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Integer.valueOf(bw.m1220());
            }
        });
        map.put(m1237(1268 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (52254 - ExpandableListView.getPackedPositionType(0L))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bw.m1247((ImpressionData) list.get(0));
            }
        });
        int i2 = f1105 + 91;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static InneractiveAdRequest m1226(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 59;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return currentProcessedRequest;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1248(InneractiveAdRequest inneractiveAdRequest) {
        int i = 2 % 2;
        int i2 = f1104 + 3;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        String spotId = inneractiveAdRequest.getSpotId();
        int i4 = f1105 + 63;
        f1104 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return spotId;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Object m1227(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1105 + 29;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        int i4 = f1104 + 71;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return adContent;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m1223(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 23;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        if (i3 != 0) {
            return adContent.isFullscreenAd();
        }
        adContent.isFullscreenAd();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m1225(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1105 + 25;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i4 = f1104 + 25;
        f1105 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsVideoAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1219(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 5;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i4 = f1104 + 5;
        f1105 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return clickThroughUrl;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1233(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = 2 % 2;
        int i2 = f1105 + 33;
        f1104 = i2 % 128;
        if (i2 % 2 == 0) {
            return inneractiveFullscreenAdActivity.getLayout();
        }
        inneractiveFullscreenAdActivity.getLayout();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static InneractiveUnitController m1218(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1104 + 71;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = f1104 + 15;
        f1105 = i5 % 128;
        int i6 = i5 % 2;
        return selectedUnitController;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1234(InneractiveUnitController inneractiveUnitController) {
        int i = 2 % 2;
        int i2 = f1105 + 93;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        int i4 = f1104 + 81;
        f1105 = i4 % 128;
        if (i4 % 2 != 0) {
            return selectedContentController;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m1243(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i = 2 % 2;
        int i2 = f1104 + 27;
        f1105 = i2 % 128;
        if (i2 % 2 == 0) {
            inneractiveFullscreenVideoContentController.getEventsListener();
            throw null;
        }
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i3 = f1104 + 63;
        f1105 = i3 % 128;
        if (i3 % 2 != 0) {
            return eventsListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1241(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i = 2 % 2;
        int i2 = f1104 + 55;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        inneractiveContentController.setEventsListener(eventsListener);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f1104 + 45;
        f1105 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static InneractiveAdSpot m1229(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = 2 % 2;
        int i2 = f1104 + 33;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        int i4 = f1104 + 35;
        f1105 = i4 % 128;
        int i5 = i4 % 2;
        return adSpot;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00db  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:27:0x0126  */
    /* JADX WARN: Code duplicated, block: B:28:0x0128  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:31:0x014a  */
    /* JADX WARN: Code duplicated, block: B:33:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Enum m1224(String str) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f1105 + 13;
        f1104 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
            switch (str.hashCode()) {
                case -2032180703:
                    if (str.equals(m1237(1345 - (KeyEvent.getMaxKeyCode() >> 16), 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        int i4 = f1105;
                        int i5 = i4 + 57;
                        f1104 = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 31;
                        f1104 = i7 % 128;
                        int i8 = i7 % 2;
                        b = 7;
                    }
                    break;
                case -1841345251:
                    if (str.equals(m1237(1330 - TextUtils.indexOf((CharSequence) "", '0'), KeyEvent.keyCodeFromString("") + 6, (char) (7768 - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -1372958932:
                    if (str.equals(m1237(Drawable.resolveOpacity(0, 0) + 1291, 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (49766 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1201514634:
                    if (str.equals(m1237((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1337, 8 - Color.blue(0), (char) KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -77725029:
                    if (str.equals(m1237(1302 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) (8461 - TextUtils.indexOf("", ""))).intern())) {
                        b = -1;
                    } else {
                        int i9 = f1104 + 51;
                        f1105 = i9 % 128;
                        int i10 = i9 % 2;
                        b = 1;
                    }
                    break;
                case 73622449:
                    if (str.equals(m1237((ViewConfiguration.getFadingEdgeLength() >> 16) + 1312, 5 - KeyEvent.normalizeMetaState(0), (char) KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        int i11 = f1104 + InterfaceC0280i1.d.b.d;
                        f1105 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    break;
                case 543046670:
                    if (str.equals(m1237(ExpandableListView.getPackedPositionChild(0L) + 1324, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, (char) (42440 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1951953708:
                    if (str.equals(m1237((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1318, 6 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 39589)).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2032180703:
                    if (str.equals(m1237(1345 - (KeyEvent.getMaxKeyCode() >> 16), 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        int i13 = f1105;
                        int i14 = i13 + 57;
                        f1104 = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = i13 + 31;
                        f1104 = i16 % 128;
                        int i17 = i16 % 2;
                        b = 7;
                    }
                    break;
                case -1841345251:
                    if (str.equals(m1237(1330 - TextUtils.indexOf((CharSequence) "", '0'), KeyEvent.keyCodeFromString("") + 6, (char) (7768 - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -1372958932:
                    if (str.equals(m1237(Drawable.resolveOpacity(0, 0) + 1291, 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (49766 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1201514634:
                    if (str.equals(m1237((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1337, 8 - Color.blue(0), (char) KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -77725029:
                    if (str.equals(m1237(1302 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) (8461 - TextUtils.indexOf("", ""))).intern())) {
                        b = -1;
                    } else {
                        int i18 = f1104 + 51;
                        f1105 = i18 % 128;
                        int i19 = i18 % 2;
                        b = 1;
                    }
                    break;
                case 73622449:
                    if (str.equals(m1237((ViewConfiguration.getFadingEdgeLength() >> 16) + 1312, 5 - KeyEvent.normalizeMetaState(0), (char) KeyEvent.keyCodeFromString("")).intern())) {
                        b = -1;
                    } else {
                        int i110 = f1104 + InterfaceC0280i1.d.b.d;
                        f1105 = i110 % 128;
                        int i111 = i110 % 2;
                    }
                    break;
                case 543046670:
                    if (str.equals(m1237(ExpandableListView.getPackedPositionChild(0L) + 1324, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, (char) (42440 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1951953708:
                    if (str.equals(m1237((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1318, 6 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 39589)).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        }
        switch (b) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int m1222() {
        int i = 2 % 2;
        int i2 = f1104 + 7;
        f1105 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.inneractive_webview_mraid;
        int i5 = f1105 + 67;
        f1104 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1238(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1105 + 53;
        f1104 = i2 % 128;
        int i3 = i2 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = f1104 + 61;
        f1105 = i5 % 128;
        int i6 = i5 % 2;
        return advertiserDomain;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1237(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1106[b.f638 + i]) ^ (((long) b.f638) * f1103)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
