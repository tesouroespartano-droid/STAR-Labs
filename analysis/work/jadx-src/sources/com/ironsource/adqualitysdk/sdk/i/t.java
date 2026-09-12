package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f3018 = 0;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static long f3019 = 0;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static char[] f3020 = null;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f3021 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static t f3022;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private aj f3023;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private je f3025;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private iw f3026;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private al f3027;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private iv f3028;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ag f3029;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private ISAdQualityAdListener f3030;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private at f3031;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Context f3036;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ISAdQualityConfig f3040;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ao f3039 = new ao();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3038 = false;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3041 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3034 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3037 = false;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f3033 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3035 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3024 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final an f3032 = new an();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static void m2920() {
        char[] cArr = new char[1582];
        ByteBuffer.wrap("Rìw]\u0019²#ÀÄXî\u0087°ÆUd\u007f\u0094\u0001Ò*rÌ¯\u0096å»A]ÑgÉ\b{Ò\u0097ô×\u0099}£\u0098EÎn~0\u0082ÚÈÿ6\u0081\u0098«ÃL\u007f\u0016\u008e8ÊÝhç±\u0089\u008eRrt¶\u001eÎ#2ÅªïÝ°nZ²|\u008b\u0001~+¤Í\u008a\u0096p¸¦B\u0095gj\tºÓÄô|\u009eâ öE{o¹1ßÚmü¥\u0086Å«cMà\u0017ñ8\u0015Â¾äß\u0089\rSªuÓ\u001e\u0013 ¡ÊÒï\b\u0000A%ÏK\u0007qt\u0096Í¼;âk\u0007Ù-!SPxê\u009e\u0012\u0000I%øK\u0017qe\u0096ý¼\"âc\u0007Á-1Swx×\u009e\nÄ@éä\u000ft5lZÞ\u00802¦rËØñ=\u0017k<Ûb'\u0088m\u00ad\u0093Ó?ùe\u001eÆD:jk\u008fÑµ\u0019Û+\u0000Õ&\u0000L`qÛ\u0097\u0007½i\u0000I%øK\u0017qe\u0096ý¼\"âc\u0007Á-1Swx×\u009eyÄWéë\u000f\u00115%ZÙ\u00805¦oËÅñ5\u0017f<Þb4\u0088r\u00adÖÓ~ùd\u001eÑD+jb\u008fÚµ\u0004Û+\u0000Õ&\u0000Lbq\u0097\u0097\u0000½hâ\u0098\b\u0006.vSÜy\u0007\u009fzÄÎê\u0000\u0010t5\u009b[\t\u0081\u007f¦ÐÌ\u001eò2\u0017Ò=\u0006cp\u0088Û\u0000C%ÊK8q&\u0096Ø¼wâk\u0007Ã-1SwxÇ\u009e8ÄhéÆ\u000f 5`Z\u0090\u0080v¦&Ëøñ\u000f\u0017F<Öb\f\u0088}\u00adÒÓ2ù`\u001eÀD&j*\u008fæµ$Û@\u0000\u0096&\u0016LmqÄ\u0097B½~âÐ\b\u0016.zSÝy\u000b\u009fxÄÔêKÆ_ãÖ\u008d$·:PÄzk$wÁßë-\u0095k¾ÛX$\u0002t/ÚÉ<ó|\u009c\u008cF\u000e`I\rì7$ÑJúÛ¤ NxkÆ\u00156?lØ\u0088\u0082\u0010¬RIâs\\\u001d`ÆÃà\t\u008ax·\u008bQ\u0010{d$ÈÎ\u0013è2\u0095Ê¿\nY3\u0002Ã,\u0014Ö|óÓ\u009d\u0003G-`Õ\n\b4kÑÓûT¥fNÆh[\u0000C%ÊK8q&\u0096Ø¼wâk\u0007Ã-1SwxÇ\u009e8ÄhéÆ\u000f 5`Z\u0090\u0080v¦&ËÐñ,\u0017w<ùb8\u0088q\u00ad\u0093Ó=ùh\u001eÚDxj~\u008f\u0095µ\u0002Ûn\u0000\u0096&\u000fLyqÛ\u0097\u000e½-â×\b\u0011..SÜy\t\u009f\u007fÄÎê\u001c\u0010>\"\u0001\u0007°i_S-´µ\u009ejÀ+%\u0089\u000fyq?Z\u009f¼Bæ\bË¬-2\u0017:x\u0099¢`\u0084né\u0098Óx5=\u001e\u009f@tª$\u008f\u0082ñ6Û2<\u0094fbH6\u00ad\u0099\u0097Gù4\"\u0090\u0004\u0007\u0000I%øK\u0017qe\u0096ý¼\"âc\u0007Á-1Swx×\u009e\nÄ@éä\u000fz5rZÑ\u0080(¦&Ëßñ9\u0017q<×b/\u0088(\u00adÚÓ0ù`\u001eÀD6jk\u008fÙµ\tÛq\u0000Ó&\u0005L,q\u009a\u0097B½câ×\bC.`SÜy\u0001\u009fkÄ\u009aê\u0011\u0010\u007f5\u009b[\u0015\u0081y¦ÉÌ\u0013òv\u0017Ò=\u001fc}\u0088\u0090\u0000I%øK\u0017qe\u0096ý¼\"âc\u0007Á-1Swx×\u009eyÄWéë\u000f\u00115%ZÇ\u0080:¦uË\u0091ñ/\u0017o<Çb)\u0088l\u00adÜÓ)ùg\u0000 %ÍK$qn\u0096Á¼wâC\u0007É-\tSvxÏ\u009e5ÄméÛ\u000f#5%ZÀ\u00807¦gËÅñ:\u0017h<Àb0\u0000s%ÄK9ql\u0096À¼6mÍH1&Ò\u001c\u0098û)Ñ\u009a\u008f\u009dj%@Ô>\u009d\u0015,óÚ©Ó\u0084b\u0000E%ÙK$qn\u0096Þ¼wâq\u0007Å--SwxÚ\u009e0ÄjéÈ\u000fz5aZß\u0080,¦h\u0000E%ÙK$qn\u0096Þ¼wâq\u0007È-,SwxÇ\u009e7Äcé\u008f\u000f/5vZÕ\u0080)¦OËÕñ|\u0000C%ÊK8q&\u0096Ø¼wâa\u0007Å-9SmxÉ\u009e<Ä$éÚ\u000f)5`ZÂ\u0080{¦oËÕñ|\u0017*<\u0092b\u0014\u0088[\u00adòÓ:ùX\u001eÁD>jf\u008fÜµ\u0014Ûr\u0000\u0096&2LHqü\u0097B½zâÙ\b\u0010..SÊy\f\u009fzÄÎê\u0001\u0010\u007f5Ì[\b\u0081?\u0000Y%ÄK#q!\u0096Á¼\"âq\u0007Ù-xSjxÀ\u009e0ÄpéÆ\u000f;5iZÙ\u0080!¦cË\u0091ñ\u0015\u0017T<ób9\u0088Y\u00adÆÓ?ùe\u001eÝD+js\u008f\u0095µ3ÛO\u0000ý&ALnqÒ\u0097\u0004½bâÊ\b\u0006..SÚy\u0005\u009fcÄÖê\f\u0010~5Ü[F\u00816¦ßÌ\u000fòs\u0017Ó=\u000fcv\u0088ë®\u001aÔqùÍ\u001f#EqjçÝÎøN\u0096¡¬¡KYa¤?çÚ_ðø\u008eê¥JCù\u0019ç4NÒ´è¢\u0087D]û{ä\u0016T,üÊéáG¿±Uäp\u0013\u000e±$ûÃ\u0014\u0099º·çREh\u0094\u0006ò\u0000E%ùK\u0004qN\u0096þ¼vâ\"\u0007Ø-+SfxÜ\u009eyÄMéë\u000fz5lZÃ\u0080{¦hËÄñ0\u0017k<\u009cb}\u0088X\u00adßÓ;ùh\u001eÇD:j*\u008fØµ\u0001Û`\u0000Ó&AL\u007fqÂ\u0097\u0010½hâ\u0098\b\u0017.aS\u0099y\u0014\u009fnÄÉê\u0016\u001005Ú[F\u0081g¦ÝÌ\u000bò{\u0017Ù=Hc}\u0088Ñ®\u0007Ô9ùÑ\u001f\u001fEyj¬\u0090K¶cÛ²\u0001\t'eLâr$\u0098\\½ãã\u001a\tv.äT&zI\u009f\u0084Å\u0014ëJ\u0010³6\u0010\\p\u0081®§\u0006Ídòè\u0018 >Zc\u0082\u0089Z\u008c\u000f©«ÇAý\u001b\u001aª0Pn\u0002\u008b¤¡\u001bß\u0014ô¯\u0012BHGe¶\u0083U¹\u0005Öª\u0000E%ùK\u0004qN\u0096þ¼vâ\"\u0007ô-7Svx\u0089\u009e+Äaé\u008f\u000f/5vZÙ\u00805¦aË\u0091ñ(\u0017o<×b}\u0088l\u00adÖÓ8ùh\u001eÁD3j~\u008f\u0095µ\u0015Ûx\u0000Ó&\u0013L,qþ\u0097&½-ÎCëæ\u0085k¿\u0000X¤r[,\u001cÉ¥ã\u0015\u009d\u0003¶¢P_\n\f'âÁDû\u001d\u0094¯NShK\u0005¨?^ÙJò¯¬QF\u0016c\u00ad\u001d\u00137\u0005Ðù\u008aG¤\tA±{|\u0015\u0013Î¾è,\u0082\u0014¿©Yjs\u0012,õÆGà'\u009dô·oQ\r\n¥$(Þ\u0018û·\u0095hO\u0014hñ\u0002\u007f<\fÙµów\u00ad^F§`k\u001aY7\u009bÑT\u008b9¤É^Wx\u000e\u0015ÍÏmé\u0013\u0082Û¼yVUsý-GÇ?à\u0087DÊaW\u000f°5àÒ\u001fø\u008d¦ÂC\u007fi¯\u0017Á<HÚ«\u0080û\u00adUK½qï\u001e\u0003Ä\u009bâÑ\u008fiµïSáxR&«Ìéé\u0000\u0097\u0084½ÞZ\u0007\u0000¥.êË\u001cñÓ\u0000a%ÏK'q^\u0096Å¼9âk\u0007Ù-\u0007SaxÂ\u009e6Äf\u0000i%ÅK\"q/\u0096ß¼2âq\u0007Þ-\u0011Sg\u009f±º\u001cÔòî§\t\f#ð}¦\u0098\u000b²öÌèç\u0000\u0001ê[ïv\u000e\u0090ýªîÅ\u0014\u001fð9¢T\u0018nà\u0088¶£\u001eýû\u0017¾\u009e2»\u0085Õxï-\b\u0081\"w|n\u0099\u009f³|Í!æ\u009d\u0000}Z1wÃ\u0091/«%Ä\u009f\u001e{8+U\u0089oi\u0089/¢\u0090üo!]\u0004Ôj&P8·Æ\u009diÃo&Ö\f2r=YÙ¿)ånÈÔ.6\u0014u{Ï¡)\u00878êÛÐ'6j\u001dØCc©{\u008cÂò$Ør?\u008aelK4®â\u0094-úT!Ì\u0007.mgPÈ¶\u0010\u009czÃÒ)\u0004\u000f0rôX>¾Zå\u0084Ë\f1o\u0014ÖzX |\u0087Êí\fÓx6Ç\u001c\u0019Bz©Î\u008fY\u009dk¸øÖ\u0003ìS\u000bª!\u0002\u007fA\u009aÿ°^ÎLåæ\u0003\u000bYGtû\u0092\u0012¨BÇú\u001d];TVòl\t\u008aU¡´ÿ\u0016\u0015A0ñN\u001dd\u000f\u0083ðÙ\u001c÷J\u0012ü(4FH\u009d°».ÑDìø\n0 B\u007fÿ\u0095)³AÎåä+\u0002GYûwb\u0001à$DJ³pò\u0097B½¿ãç\u0006\u0002,°Rìy[\u009f½ÅëèZ\u000eõ4å[R\u0081®§îÊ_ð³\u0016¨=qc\u009d\u0089Ý¬fÒ\u009aøÚ\u001flE\u0081kÈ\u008e|´ ÚÄ\u0001p'¥MÉ°\u0090\u0095\u001cûéÁ»&\u001f\fåRô·\u000f\u009dáãõÈ\n.êtµY\u0010¿ÿ\u0085§ê\u00030ÿ\u0016ð{\u0005Aë§¥\u008c\u0010Òî8¬\u001d\u001cc¨I\u00ad®\u0007ôêÚ¹?\n\u0005Àk¸°\u0012Ñ8ô±\u009aC ]G£m\f3\nÖ³üW\u0082X©´OF\u0015_8¸ÞHä\r\u008b¿QEw\u0013\u001a¯ UÆ\\íä³\u0006Y:|\u009b\u0002d(\u0016Ï\u009e\u0095Q»\u0010^¢dr\n\u0004Ñ´÷:\u009d$ \u0088FRlV3´Ùyÿ\u0006\u0082â¨lN\u001c\u0015´;jÁ\u000fä¯\u008ajP\u0004wé\u0000C%ÊK8q&\u0096Ø¼wâq\u0007È-6Sgx\u008e\u009e:ÄqéÜ\u000f.5jZÝ\u0080{¦kËÔñ8\u0017n<Ób)\u0088a\u00adÜÓ0ù)\u001eÆD:j|\u008fÐµ\u000eÛ~\u0000Ó&AL!q\u0097\u0097+½^âù\b\u0007._SÌy\u0005\u009fcÄÓê\u0011\u0010i5\u009b[5\u0081U¦÷ÌGòe\u0017Ü=\u001bc3\u0088Í®\u0001ÔaùË\u001f\u000eEzj·\u0090\u0005¶8\n\u008b/\u0002Að{î\u009c\u0010¶¿è¹\r\u0000'þY¯rF\u0094òÎ¹ã\u0014\u0005æ?¢P\u0015\u008a³¬£Á\u001cûð\u001d¦6\u001bhá\u0082©§\u0014Ùøóá\u0014\u000eNò`´\u0085\u0018¿ÆÑ¶\n\u001b,\u0089Fé{_\u009dã·\u0096è1\u0002Ï$\u0097Y\u0004sÍ\u0095«Î\u001bàÙ\u001a¡?SQý\u008b\u009d¬?Æ\u008fø³\u001d\u00067\u0080iµ\u0082\u0019¤ÕÞüó\u001e\u0015ÌO´`|\u009aÊ¼¿Ñe\u000bÍ-¥FoxÁ\u0092þ\u0000C%ÊK8q&\u0096Ø¼wâq\u0007È-,S#xÝ\u009e<ÄcéÂ\u000f?5kZÄ\u0080{¦+Ë\u0091ñ\u0015\u0017T<ób9\u0088Y\u00adÆÓ?ùe\u001eÝD+js\u008f\u0095µ3ÛO\u0000ý&AL{qÖ\u0097\u0011½-âË\b\u000b.{SÍy\u0000\u009f`ÄÍê\u000b\u0010>\u0000C%ÊK8q&\u0096Ø¼wâq\u0007È-,S#xÍ\u009e6ÄjéÉ\u000f35bZ\u0090\u0080v¦&Ëøñ\u000f\u0017F<Öb\f\u0088}\u00adÒÓ2ù`\u001eÀD&j*\u008fæµ$Û@\u0000\u0096&\u0016LmqÄ\u0097B½~âÐ\b\u0016.zSÝy\u000b\u009fxÄÔêKgwBþ,\f\u0016\u0012ñìÛC\u0085E`üJ\u00184\u0017\u001fùù\u0002£^\u008eýh\u0007RV=¤çBÁ\u0012¬Ì\u0096;pr[â\u00058ïIÊæ´\u0006\u009eTyô#\u0012\r\u001eèÒÒ\u0010¼tg¢A<+K\u0016£ð7ÚU\u0085þo2I[4é\u001e)ø\u001b£ç\u008d?wMRû<;æDÁä«:\u0095\\pìZ8\u0004\t\u0000i%ÌK8qn\u0096Þ¼2â]\u0007Ý-*Sfxñ\u009e0ÄjéÆ\u000f.5ZZÓ\u00804¦hË×ñ5\u0017`".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1582);
        f3020 = cArr;
        f3019 = -7218913731477101141L;
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    static /* synthetic */ Set m2902(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 27;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        Set<ISAdQualityInitListener> set = tVar.f3024;
        int i5 = i3 + 99;
        f3021 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return set;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    static /* synthetic */ al m2903(t tVar) {
        int i = 2 % 2;
        int i2 = f3018;
        int i3 = i2 + 33;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
        al alVar = tVar.f3027;
        int i5 = i2 + 77;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return alVar;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ je m2904(t tVar) {
        int i = 2 % 2;
        int i2 = f3021;
        int i3 = i2 + 35;
        f3018 = i3 % 128;
        int i4 = i3 % 2;
        je jeVar = tVar.f3025;
        int i5 = i2 + 43;
        f3018 = i5 % 128;
        int i6 = i5 % 2;
        return jeVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ void m2905(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 119;
        f3018 = i2 % 128;
        tVar.m2927(i2 % 2 == 0);
        int i3 = f3018 + 27;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ ISAdQualityAdListener m2906(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 23;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = tVar.f3030;
        int i5 = i3 + 71;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return iSAdQualityAdListener;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ boolean m2909(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 115;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM2911 = tVar.m2911();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = f3021 + 119;
        f3018 = i5 % 128;
        int i6 = i5 % 2;
        return zM2911;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ void m2910(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 99;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2944(false);
        int i4 = f3018 + InterfaceC0280i1.d.b.d;
        f3021 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ iw m2912(t tVar) {
        int i = 2 % 2;
        int i2 = f3018;
        int i3 = i2 + InterfaceC0280i1.d.b.i;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
        iw iwVar = tVar.f3026;
        int i5 = i2 + 31;
        f3021 = i5 % 128;
        if (i5 % 2 != 0) {
            return iwVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ ag m2913(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 27;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        ag agVar = tVar.f3029;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return agVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ at m2915(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 39;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        at atVar = tVar.f3031;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return atVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ void m2918(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 19;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2907();
        if (i3 == 0) {
            throw null;
        }
        int i4 = f3018 + 23;
        f3021 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Context m2919(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 59;
        int i3 = i2 % 128;
        f3021 = i3;
        int i4 = i2 % 2;
        Context context = tVar.f3036;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + InterfaceC0280i1.d.b.d;
        f3018 = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ag m2921(t tVar, ag agVar) {
        int i = 2 % 2;
        int i2 = f3018 + 89;
        int i3 = i2 % 128;
        f3021 = i3;
        int i4 = i2 % 2;
        tVar.f3029 = agVar;
        int i5 = i3 + 13;
        f3018 = i5 % 128;
        int i6 = i5 % 2;
        return agVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ al m2922(t tVar, al alVar) {
        int i = 2 % 2;
        int i2 = f3018 + 61;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        tVar.f3027 = alVar;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return alVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ je m2923(t tVar, je jeVar) {
        int i = 2 % 2;
        int i2 = f3021 + 81;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.f3025 = jeVar;
        if (i3 == 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2926(t tVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f3021 + 73;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2925(iSAdQualityLogLevel);
        int i4 = f3018 + InterfaceC0280i1.d.b.b;
        f3021 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m2928(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 121;
        f3021 = i2 % 128;
        if (i2 % 2 != 0) {
            return tVar.m2916();
        }
        tVar.m2916();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ aj m2929(t tVar, aj ajVar) {
        int i = 2 % 2;
        int i2 = f3021 + 53;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        tVar.f3023 = ajVar;
        int i5 = i3 + InterfaceC0280i1.d.b.g;
        f3021 = i5 % 128;
        if (i5 % 2 != 0) {
            return ajVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ao m2930(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 73;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        ao aoVarM2914 = tVar.m2914();
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return aoVarM2914;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ at m2931(t tVar, at atVar) {
        int i = 2 % 2;
        int i2 = f3021 + 11;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        tVar.f3031 = atVar;
        int i5 = i3 + 51;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ iv m2932(t tVar, iv ivVar) {
        int i = 2 % 2;
        int i2 = f3021 + 65;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.f3028 = ivVar;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return ivVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m2936(t tVar, Context context) {
        int i = 2 % 2;
        int i2 = f3018 + 91;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2934(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m2937(t tVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f3021 + 17;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2949(iSAdQualityInitError, str);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Context m2939(t tVar, Context context) {
        int i = 2 % 2;
        int i2 = f3021 + 105;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.f3036 = context;
        if (i3 == 0) {
            return context;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ an m2940(t tVar) {
        int i = 2 % 2;
        int i2 = f3018;
        int i3 = i2 + 67;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        an anVar = tVar.f3032;
        if (i4 == 0) {
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 47;
        f3021 = i5 % 128;
        if (i5 % 2 != 0) {
            return anVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ iv m2941(t tVar) {
        int i = 2 % 2;
        int i2 = f3018 + 125;
        int i3 = i2 % 128;
        f3021 = i3;
        int i4 = i2 % 2;
        iv ivVar = tVar.f3028;
        int i5 = i3 + 87;
        f3018 = i5 % 128;
        if (i5 % 2 == 0) {
            return ivVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ iw m2946(t tVar, iw iwVar) {
        int i = 2 % 2;
        int i2 = f3021 + 59;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        tVar.f3026 = iwVar;
        int i5 = i3 + 57;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2950(t tVar) {
        int i = 2 % 2;
        int i2 = f3021 + 53;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2955(true);
        int i4 = f3018 + 49;
        f3021 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2951(t tVar, Context context) {
        int i = 2 % 2;
        int i2 = f3021 + 15;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2948(context);
        int i4 = f3021 + 27;
        f3018 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2952(t tVar, Context context, String str) {
        int i = 2 % 2;
        int i2 = f3021 + InterfaceC0280i1.d.b.d;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            tVar.m2935(context, str, false, true, true);
        } else {
            tVar.m2935(context, str, true, false, true);
        }
        int i3 = f3021 + 5;
        f3018 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2953(t tVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3021 + 79;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        tVar.m2938(z);
        int i4 = f3018 + 91;
        f3021 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        m2920();
        f3022 = null;
        int i = f3021 + 9;
        f3018 = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static t m2942() {
        synchronized (t.class) {
            if (f3022 == null) {
                f3022 = new t();
            }
        }
        return f3022;
    }

    private t() {
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        int i = 2 % 2;
        int i2 = f3021 + 113;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        initialize(context, str, null);
        int i4 = f3021 + 113;
        f3018 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3021 + 83;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = context instanceof Application;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (context instanceof Application) {
            m2943((Application) context, str, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            int i3 = f3018 + 13;
            f3021 = i3 % 128;
            int i4 = i3 % 2;
            m2943((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            m2933((Activity) context, str, iSAdQualityConfig);
            return;
        }
        String strIntern = m2947(TextUtils.lastIndexOf("", '0', 0) + 1, (char) (21158 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 74 - Color.red(0)).intern();
        n.m2876(m2947(View.MeasureSpec.getSize(0) + 74, (char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetBefore("", 0) + 12).intern(), strIntern);
        m2954(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
        int i5 = f3021 + 31;
        f3018 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2943(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3021 + 47;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        m2924(application, null, str, iSAdQualityConfig);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f3021 + 23;
        f3018 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2933(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3018 + 95;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        m2924(activity.getApplication(), activity, str, iSAdQualityConfig);
        int i4 = f3021 + 125;
        f3018 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.t$3, reason: invalid class name */
    final class AnonymousClass3 extends iu {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3048 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f3049 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f3050 = 56034;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3051;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f3052;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ Activity f3053;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Application f3054;

        AnonymousClass3(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3051 = iSAdQualityConfig;
            this.f3052 = str;
            this.f3054 = application;
            this.f3053 = activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            float f;
            try {
                String userId = this.f3051.getUserId();
                t.m2926(t.this, this.f3051.getLogLevel());
                f = 0.0f;
                try {
                    n.m2874(m2963("ﱘ\uec9f싒\ueb5d", (char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", "\uee68\uee12ࢉᩀ\uec18ꥵ訌荧ꦼ펨輚뺺").intern(), new StringBuilder().append(m2963("ᦃ\u0b58✴翖", (char) (54823 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", "̊퓀টꩈ镖䚜\ueeaeꊝ劤줮켕ᣔ㕅䱼Ⱶ\ue369桝澊仾밈헷遼夯ઐ㐛䠾").intern()).append(this.f3052).toString());
                    ii.m2456(this.f3054.getApplicationContext()).m2464();
                    t.m2953(t.this, this.f3051.isTestMode());
                    if (this.f3051.isTestMode()) {
                        n.m2876(m2963("ﱘ\uec9f싒\ueb5d", (char) TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "\uee68\uee12ࢉᩀ\uec18ꥵ訌荧ꦼ펨輚뺺").intern(), m2963("⋨䃆䞸࡚", (char) (23111 - (Process.myPid() >> 22)), Color.alpha(0), "\u0000\u0000\u0000\u0000", "\uf0a7ꝶ蒮❾閭㢍\uf023㶇鿨㑁揓\ueffb辩͘缁㽓\udda5絟₌듅匄\uf024\uda26ɤⶠ禖\uf82e沐෦麿䇬뎓瀚낚褗ᕓ\ue9b4甭✉\u18ff⪴죽ᓊ핒訐쩼ꍃ鳨遒炕궨\ue4b6ᤢ䌯陞뺙븽䯭⻑瘸䨛꣸ಹ\udc09栘\u05c9\uabef蛢ඣ㇂쭎坬瞳ⷡ寍冷⟣襕嗯敎吝间짥渜푓\udd08暶\uf5b7뾯\uf87d뼩钶軯폔").intern());
                    }
                    try {
                        Class.forName(m2963("옿\u0ecf\uec87⭱", (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, "\u0000\u0000\u0000\u0000", "\uf028截ﰷ鷜᭕삇䡩䴫샌귢\uf775潧榓潗첕ꍌ\ue91f䤇霙坙").intern());
                    } catch (Throwable unused) {
                    }
                    Activity activity = this.f3053;
                    if (activity != null) {
                        jx.m2739(activity);
                    } else {
                        jx.m2740(this.f3054);
                    }
                    t.m2930(t.this).m459(this.f3052);
                    t.m2930(t.this).m470(this.f3051.getInitializationSource());
                    t.m2930(t.this).m460(this.f3051.getCoppa());
                    t.m2930(t.this).m463(this.f3051.getDeviceIdType());
                    t.m2930(t.this).m464(this.f3051.getMetaData());
                    Context applicationContext = this.f3054.getApplicationContext();
                    t.m2939(t.this, applicationContext);
                    t.m2932(t.this, new iv(applicationContext));
                    t tVar = t.this;
                    t.m2940(t.this);
                    t.m2923(tVar, new je(applicationContext, an.m447(), "B0r1sW@sH3re"));
                    ar.m480().mo512(applicationContext, t.m2941(t.this), t.m2940(t.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.2

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3058 = 0;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int[] f3059 = {-1692604596, -1901333312, -894867167, 957709726, 2039746606, 974424591, 1458347280, 1572025667, 535305721, 199201437, 248527352, 548026717, -1640835990, -1688900713, -1023352005, -443895597, 1450867233, 1312067964};

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3060 = 1;

                        @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo549() {
                            int i = 2 % 2;
                            int i2 = f3060 + 57;
                            f3058 = i2 % 128;
                            int i3 = i2 % 2;
                            t.m2937(t.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m2964(new int[]{-152401743, -539781941, 1727899015, -1096411877, -982455702, -1808793973, -1974031910, -1135194274, -816192499, -665735324, 1328567824, 488834734, -1988837029, -1995236783, -188683714, -2026772880, 1632709797, 660990475}, ((byte) KeyEvent.getModifierMetaStateMask()) + 36).intern());
                            int i4 = f3060 + InterfaceC0280i1.d.b.b;
                            f3058 = i4 % 128;
                            int i5 = i4 % 2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo548() {
                            t tVar2;
                            ISAdQualityInitError iSAdQualityInitError;
                            String strM2964;
                            int i = 2 % 2;
                            int i2 = f3060 + 117;
                            f3058 = i2 % 128;
                            if (i2 % 2 != 0) {
                                tVar2 = t.this;
                                iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                                strM2964 = m2964(new int[]{2023315586, 964906981, -289176378, 373260375, -640492579, -859202686, -1723413773, 1245654498, -2134410520, -1349226920, -1250825629, -1405384276}, 105 - View.MeasureSpec.makeMeasureSpec(0, 1));
                            } else {
                                tVar2 = t.this;
                                iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                                strM2964 = m2964(new int[]{2023315586, 964906981, -289176378, 373260375, -640492579, -859202686, -1723413773, 1245654498, -2134410520, -1349226920, -1250825629, -1405384276}, 21 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            }
                            t.m2937(tVar2, iSAdQualityInitError, strM2964.intern());
                            int i3 = f3060 + 123;
                            f3058 = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                        }

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m2964(int[] iArr, int i) {
                            String str;
                            synchronized (c.f1230) {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f3059.clone();
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
                    }, t.m2928(t.this));
                    t.m2946(t.this, new iw(applicationContext, t.m2941(t.this), t.m2940(t.this).m450()));
                    final String strM2709 = ju.m2709(applicationContext);
                    ar.m480().mo502(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.4

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3068 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static long f3069 = -2005215972666296035L;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f3070;

                        @Override // com.ironsource.adqualitysdk.sdk.i.av
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo385() {
                            int i = 2 % 2;
                            if (!ar.m480().mo511(m2966("䴙䵪퐌㸛䏒\ued7e䱎\ue8e8꤁짼", 1 - ExpandableListView.getPackedPositionGroup(0L)).intern(), strM2709)) {
                                int i2 = f3068 + 119;
                                f3070 = i2 % 128;
                                int i3 = i2 % 2;
                                t.m2950(t.this);
                            }
                            int i4 = f3070 + 47;
                            f3068 = i4 % 128;
                            int i5 = i4 % 2;
                        }

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m2966(String str, int i) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (h.f2288) {
                                char[] cArrM2212 = h.m2212(f3069, cArr, i);
                                h.f2289 = 4;
                                while (h.f2289 < cArrM2212.length) {
                                    h.f2290 = h.f2289 - 4;
                                    cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f3069));
                                    h.f2289++;
                                }
                                str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
                            }
                            return str2;
                        }
                    });
                    ar.m480().mo504(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.av
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo385() {
                            ar.m480().mo505(t.m2912(t.this));
                        }
                    });
                    t.m2951(t.this, applicationContext);
                    t.m2921(t.this, new ag(applicationContext, t.m2930(t.this), t.m2940(t.this), this.f3053 != null, strM2709, new s() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.s
                        public void onEvent(final String str) {
                            p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.3.2

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static int[] f3063 = {524464414, 881362854, 1235271779, 176590548, -613438086, 72734046, -61781074, -935271004, 340216014, -1593462975, -814262267, 436107227, -351623562, -1042380161, 94954377, -1194546934, 1308294787, 1376128626};

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f3064 = 1;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static int f3065;

                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    int i = 2 % 2;
                                    int i2 = f3065 + 47;
                                    f3064 = i2 % 128;
                                    int i3 = i2 % 2;
                                    t.m2915(t.this).m628(m2965(new int[]{-1869683003, -1028927485, -2127232789, -43727409, -753616308, -2119200928, -1049730728, -1725309289, -1317433642, -1655308706, 1422518599, -1218780139}, ExpandableListView.getPackedPositionChild(0L) + 24).intern(), Collections.singletonList(str));
                                    int i4 = f3065 + 33;
                                    f3064 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        int i5 = 60 / 0;
                                    }
                                }

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static String m2965(int[] iArr, int i) {
                                    String str2;
                                    synchronized (c.f1230) {
                                        char[] cArr = new char[4];
                                        char[] cArr2 = new char[iArr.length << 1];
                                        int[] iArr2 = (int[]) f3063.clone();
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
                                        str2 = new String(cArr2, 0, i);
                                    }
                                    return str2;
                                }
                            });
                        }
                    }));
                    if (!this.f3051.isUserIdSet()) {
                        t.m2930(t.this).m457();
                        userId = t.m2913(t.this).m371();
                    }
                    if (t.this.m2959()) {
                        t.m2913(t.this).m380(new ai() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.ai
                            public void onEventReceived(JSONObject jSONObject) {
                                in.m2481(t.m2919(t.this), ij.f2535, jSONObject, new Object[0]);
                            }
                        });
                    }
                    t.m2913(t.this).m375(new je.b() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.je.b
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo2611() {
                            t.m2950(t.this);
                        }
                    });
                    t.m2931(t.this, new at(t.m2912(t.this), t.m2913(t.this), strM2709, new ay(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.10
                        @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                        public final void adQualitySdkInitSuccess() {
                            t.m2918(t.this);
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                        public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                            t.m2937(t.this, iSAdQualityInitError, str);
                        }
                    }));
                    t.m2915(t.this).m624(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.t.3.9
                        @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                        public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                            if (t.m2906(t.this) != null) {
                                t.m2906(t.this).adDisplayed(str, iSAdQualityAdType);
                            }
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                        public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                            if (t.m2906(t.this) != null) {
                                t.m2906(t.this).adClosed(str, iSAdQualityAdType);
                            }
                        }
                    });
                    t.m2929(t.this, new aj(t.m2915(t.this)));
                    t.m2922(t.this, new al(t.m2913(t.this)));
                    n.m2870(m2963("ﱘ\uec9f싒\ueb5d", (char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", "\uee68\uee12ࢉᩀ\uec18ꥵ訌荧ꦼ펨輚뺺").intern(), new StringBuilder().append(m2963("텑휯ƪ㗎", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1428738096, "\u0000\u0000\u0000\u0000", "\uecd4▪첂뭓\uf658襙츙Ĝ⛺쀴湫悏鷠寔탩䢯ঠ盁⌛\uf76fₖ牭⣔䔋㗕\uf88b㑃档愁Ꮿ\udc36\ueb4e㠺").intern()).append(t.m2940(t.this).m452()).toString());
                    t tVar2 = t.this;
                    Context context = this.f3053;
                    if (context == null) {
                        context = applicationContext;
                    }
                    t.m2952(tVar2, context, userId);
                    t.m2936(t.this, applicationContext);
                    t.m2905(t.this);
                    t.m2910(t.this);
                } catch (Throwable th) {
                    th = th;
                    String strIntern = m2963("쭿뜂㌁텄", (char) KeyEvent.keyCodeFromString(""), 1 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ﱭ\udfe3퉍Ǌ儨ٝ웘\udab1鸛鄹㣒ᚽܶݓ紻䭊娄帉攑ꏧ紩爚ᝤⴌ옿廓㘓ی㲋\u175f\uf0eb귨绍ᅅ").intern();
                    jz.m2760(m2963("ﱘ\uec9f싒\ueb5d", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, "\u0000\u0000\u0000\u0000", "\uee68\uee12ࢉᩀ\uec18ꥵ訌荧ꦼ펨輚뺺").intern(), strIntern, th, true, false, true);
                    t.m2937(t.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
                }
            } catch (Throwable th2) {
                th = th2;
                f = 0.0f;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2963(String str, char c, int i, String str2, String str3) {
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
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                g.f2156 = 0;
                while (g.f2156 < length) {
                    int i2 = (g.f2156 + 2) % 4;
                    int i3 = (g.f2156 + 3) % 4;
                    g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                    cArr4[i3] = g.f2154;
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr[g.f2156])) ^ f3049) ^ ((long) f3048)) ^ ((long) f3050));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2924(Application application, Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        String strIntern = m2947(KeyEvent.keyCodeFromString("") + 74, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12).intern();
        ISAdQualityConfig iSAdQualityConfigBuild = iSAdQualityConfig == null ? new ISAdQualityConfig.Builder().build() : iSAdQualityConfig;
        if (!m2945(iSAdQualityConfigBuild)) {
            int i2 = f3018 + 57;
            f3021 = i2 % 128;
            if (i2 % 2 == 0) {
                ISAdQualityConfig.merge(this.f3040, iSAdQualityConfigBuild);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            iSAdQualityConfigBuild = ISAdQualityConfig.merge(this.f3040, iSAdQualityConfigBuild);
        }
        if (m2908()) {
            String strIntern2 = m2947((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 86, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 40).intern();
            n.m2870(strIntern, strIntern2);
            m2954(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern2);
            return;
        }
        if (m2911()) {
            String strIntern3 = m2947(Color.red(0) + 126, (char) Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 60).intern();
            n.m2870(strIntern, strIntern3);
            m2954(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m2958()) {
            String strIntern4 = m2947((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 185, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 48 - TextUtils.getCapsMode("", 0, 0)).intern();
            n.m2876(strIntern, strIntern4);
            m2954(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern4);
            int i3 = f3018 + 121;
            f3021 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfigBuild.getUserId())) {
            int i5 = f3021 + 23;
            f3018 = i5 % 128;
            int i6 = i5 % 2;
            if (iSAdQualityConfigBuild.isUserIdSet()) {
                int i7 = f3018 + 33;
                f3021 = i7 % 128;
                int i8 = i7 % 2;
                String strIntern5 = m2947(((Process.getThreadPriority(0) + 20) >> 6) + 233, (char) (50716 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 60).intern();
                n.m2876(strIntern, strIntern5);
                m2954(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern5);
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            int i9 = f3018 + 9;
            f3021 = i9 % 128;
            int i10 = i9 % 2;
            String strIntern6 = m2947(292 - Process.getGidForName(""), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 49 - Color.alpha(0)).intern();
            n.m2876(strIntern, strIntern6);
            m2954(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern6);
            return;
        }
        this.f3024.addAll(iSAdQualityConfigBuild.getAdQualityInitListeners());
        m2944(true);
        jj.m2645().mo2649(application, activity);
        jb.m2556().m2562();
        jh.m2628().m2632();
        p.m2900(new AnonymousClass3(iSAdQualityConfigBuild, str, application, activity));
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized ao m2914() {
        ao aoVar;
        int i = 2 % 2;
        int i2 = f3018 + 27;
        int i3 = i2 % 128;
        f3021 = i3;
        int i4 = i2 % 2;
        aoVar = this.f3039;
        int i5 = i3 + 9;
        f3018 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return aoVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        int i = 2 % 2;
        int i2 = f3018 + 57;
        f3021 = i2 % 128;
        if (i2 % 2 == 0) {
            m2955(true);
        } else {
            m2955(false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z) {
        int i = 2 % 2;
        int i2 = f3018 + 51;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        m2914().m465(z);
        int i4 = f3021 + InterfaceC0280i1.d.b.i;
        f3018 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m2955(boolean z) {
        int i = 2 % 2;
        try {
            if (!(!m2958())) {
                n.m2876(m2947((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74, (char) View.combineMeasuredStates(0, 0), 12 - TextUtils.getOffsetBefore("", 0)).intern(), m2947(Gravity.getAbsoluteGravity(0, 0) + 342, (char) (8776 - (ViewConfiguration.getScrollBarSize() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 36).intern());
                return;
            }
            Object obj = null;
            if (!m2911()) {
                n.m2876(m2947(((Process.getThreadPriority(0) + 20) >> 6) + 74, (char) TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 12).intern(), m2947(TextUtils.indexOf("", "", 0, 0) + 378, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 59).intern());
                int i2 = f3021 + 63;
                f3018 = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            String strIntern = m2947(ExpandableListView.getPackedPositionType(0L) + 437, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28).intern();
            if (z) {
                strIntern = new StringBuilder().append(strIntern).append(m2947(TextUtils.indexOf("", "", 0, 0) + 465, (char) View.combineMeasuredStates(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 24).intern()).toString();
            }
            String strMo501 = ar.m480().mo501(m2947(489 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            if (!TextUtils.isEmpty(strMo501)) {
                strIntern = new StringBuilder().append(strIntern).append(m2947(TextUtils.lastIndexOf("", '0') + 496, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28140), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15).intern()).append(strMo501).toString();
            }
            n.m2870(m2947(74 - (Process.myTid() >> 22), (char) TextUtils.getOffsetBefore("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 12).intern(), strIntern);
            m2949(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern);
            this.f3034 = true;
            ar.m480().mo488();
            ii.m2456(this.f3036).m2466();
            this.f3031.m627();
            this.f3028.m2495();
            this.f3029.m377();
            hu.m2295();
            int i3 = f3021 + 53;
            f3018 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            } else {
                throw null;
            }
            throw th;
        } catch (Exception e) {
            jz.m2760(m2947(74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11).intern(), m2947(509 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 18 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), e, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m2958() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3018 + 113;
        int i3 = i2 % 128;
        f3021 = i3;
        int i4 = i2 % 2;
        z = this.f3034;
        int i5 = i3 + 71;
        f3018 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        boolean z;
        int i = 2 % 2;
        try {
            if (!m2956(str)) {
                return;
            }
            if (str.equals(m2914().m467())) {
                int i2 = f3021 + 23;
                f3018 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 2;
                }
                z = false;
            } else {
                z = true;
            }
            boolean zMo2650 = jj.m2645().mo2650();
            if (z && zMo2650) {
                int i4 = f3021 + 55;
                f3018 = i4 % 128;
                int i5 = i4 % 2;
                this.f3029.m376();
            }
            str2 = str;
            try {
                m2935(this.f3036, str2, z, true, zMo2650);
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
        jz.m2760(m2947(75 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), 12 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new StringBuilder().append(m2947(TextUtils.getOffsetAfter("", 0) + 528, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 21).intern()).append(str2).toString(), e, true, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (m2911() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        r11 = com.ironsource.adqualitysdk.sdk.i.t.f3018 + 43;
        com.ironsource.adqualitysdk.sdk.i.t.f3021 = r11 % 128;
        r11 = r11 % 2;
        com.ironsource.adqualitysdk.sdk.i.n.m2876(m2947((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 74, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.widget.ExpandableListView.getPackedPositionType(0) + 12).intern(), m2947(601 - android.widget.ExpandableListView.getPackedPositionType(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 65 - android.text.TextUtils.getCapsMode("", 0, 0)).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.n.m2876(m2947(73 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), 12 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2947((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 666, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 56705), (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 33).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (m2958() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((!m2958()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.n.m2876(m2947(75 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.getCapsMode("", 0, 0) + 12).intern(), m2947(550 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), 52 - android.view.View.combineMeasuredStates(0, 0)).intern());
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m2956(String str) {
        int i = 2 % 2;
        int i2 = f3021 + 117;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.t$5, reason: invalid class name */
    final class AnonymousClass5 implements av {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f3078;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ boolean f3079;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ boolean f3080;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ String f3081;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Context f3082;

        AnonymousClass5(boolean z, Context context, boolean z2, String str, boolean z3) {
            this.f3079 = z;
            this.f3082 = context;
            this.f3080 = z2;
            this.f3081 = str;
            this.f3078 = z3;
        }

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.t$5$3, reason: invalid class name */
        final class AnonymousClass3 extends iu {
            AnonymousClass3() {
            }

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.t$5$3$4, reason: invalid class name */
            final class AnonymousClass4 extends iu {

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f3084 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static long f3085 = -5575413867052838946L;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f3086;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f3087;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static char f3088;

                AnonymousClass4() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    int i = 2 % 2;
                    t.m2904(t.this).m2602(m2967((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 57148), "蕼캔㰪쯟", "俞늇⚠늠", "ﲖ㮰앜踣\ue07f뇌藊鲡报\ufff8恐ﾹỚ᪆", ImageFormat.getBitsPerPixel(0) + 1).intern(), new je.d() { // from class: com.ironsource.adqualitysdk.sdk.i.t.5.3.4.4

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f3090 = 1;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f3091 = 0;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static short[] f3092 = null;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static byte[] f3093 = {7, 85, 92, 78, -125, 93, 93, 85, 95, 100, -101, 90, -87, 90, -2, -121, 114, 126, -114};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3094 = 2127372622;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f3095 = 7;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3096 = 1332691045;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je.d
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo2612(String str) {
                            int i2 = 2 % 2;
                            int i3 = f3091 + 125;
                            f3090 = i3 % 128;
                            Object obj = null;
                            if (i3 % 2 != 0) {
                                final boolean zIsEmpty = TextUtils.isEmpty(str);
                                if (zIsEmpty) {
                                    t.m2904(t.this).m2605(m2968((-2127372622) - View.MeasureSpec.makeMeasureSpec(0, 0), (-16777224) - Color.rgb(0, 0, 0), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-1332690943) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (KeyEvent.keyCodeFromString("") + 92)).intern(), m2968((-2127372608) - KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 8, (short) ExpandableListView.getPackedPositionGroup(0L), (KeyEvent.getMaxKeyCode() >> 16) - 1332690943, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 117)).intern(), null);
                                    int i4 = f3090 + 23;
                                    f3091 = i4 % 128;
                                    int i5 = i4 % 2;
                                }
                                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.t.5.3.4.4.3

                                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                                    private static int f3098 = 1;

                                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                                    private static int f3099 = 0;

                                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                                    private static char f3100 = 6844;

                                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                    private static char f3101 = 64721;

                                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                    private static char f3102 = 29393;

                                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                    private static char f3103 = 26954;

                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo227() {
                                        String strIntern;
                                        int i6 = 2 % 2;
                                        ag agVarM2913 = t.m2913(t.this);
                                        String strIntern2 = m2969("㢡悁嘰눗贉뻐던斪", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6).intern();
                                        if (AnonymousClass5.this.f3080) {
                                            int i7 = f3099 + 61;
                                            f3098 = i7 % 128;
                                            int i8 = i7 % 2;
                                            if (AnonymousClass5.this.f3081 != null) {
                                                int i9 = f3099 + 65;
                                                f3098 = i9 % 128;
                                                int i10 = i9 % 2;
                                                strIntern = AnonymousClass5.this.f3081;
                                            } else {
                                                strIntern = m2969("⥚㼚\udd7c胵", 4 - View.MeasureSpec.getMode(0)).intern();
                                                int i11 = f3099 + 83;
                                                f3098 = i11 % 128;
                                                int i12 = i11 % 2;
                                            }
                                        } else {
                                            strIntern = null;
                                        }
                                        at atVarM2915 = t.m2915(t.this);
                                        new gn(t.m2919(t.this));
                                        t.m2919(t.this);
                                        agVarM2913.m373(strIntern2, js.m2697(strIntern, atVarM2915, zIsEmpty, t.m2930(t.this)));
                                        if (AnonymousClass5.this.f3078) {
                                            int i13 = f3099 + 23;
                                            f3098 = i13 % 128;
                                            int i14 = i13 % 2;
                                            t.m2913(t.this).m372();
                                        }
                                    }

                                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                    private static String m2969(String str2, int i6) {
                                        String str3;
                                        Object charArray = str2;
                                        if (str2 != null) {
                                            charArray = str2.toCharArray();
                                        }
                                        char[] cArr = (char[]) charArray;
                                        synchronized (k.f2952) {
                                            char[] cArr2 = new char[cArr.length];
                                            k.f2951 = 0;
                                            char[] cArr3 = new char[2];
                                            while (k.f2951 < cArr.length) {
                                                cArr3[0] = cArr[k.f2951];
                                                cArr3[1] = cArr[k.f2951 + 1];
                                                int i7 = 58224;
                                                for (int i8 = 0; i8 < 16; i8++) {
                                                    char c = cArr3[1];
                                                    char c2 = cArr3[0];
                                                    char c3 = (char) (c - (((c2 + i7) ^ ((c2 << 4) + f3102)) ^ ((c2 >>> 5) + f3100)));
                                                    cArr3[1] = c3;
                                                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f3101) ^ ((c3 + i7) ^ ((c3 << 4) + f3103))));
                                                    i7 -= 40503;
                                                }
                                                cArr2[k.f2951] = cArr3[0];
                                                cArr2[k.f2951 + 1] = cArr3[1];
                                                k.f2951 += 2;
                                            }
                                            str3 = new String(cArr2, 0, i6);
                                        }
                                        return str3;
                                    }
                                });
                                return;
                            }
                            TextUtils.isEmpty(str);
                            super.hashCode();
                            throw null;
                        }

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static String m2968(int i2, int i3, short s, int i4, byte b) {
                            String string;
                            synchronized (l.f2999) {
                                StringBuilder sb = new StringBuilder();
                                int i5 = f3095;
                                int i6 = i3 + i5;
                                int i7 = i6 == -1 ? 1 : 0;
                                if (i7 != 0) {
                                    byte[] bArr = f3093;
                                    if (bArr != null) {
                                        i6 = (byte) (bArr[f3094 + i2] + i5);
                                    } else {
                                        i6 = (short) (f3092[f3094 + i2] + i5);
                                    }
                                }
                                if (i6 > 0) {
                                    l.f3000 = ((i2 + i6) - 2) + f3094 + i7;
                                    l.f3002 = b;
                                    l.f3004 = (char) (i4 + f3096);
                                    sb.append(l.f3004);
                                    l.f3003 = l.f3004;
                                    l.f3001 = 1;
                                    while (l.f3001 < i6) {
                                        byte[] bArr2 = f3093;
                                        if (bArr2 != null) {
                                            int i8 = l.f3000;
                                            l.f3000 = i8 - 1;
                                            l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i8] + s)) ^ l.f3002));
                                        } else {
                                            short[] sArr = f3092;
                                            int i9 = l.f3000;
                                            l.f3000 = i9 - 1;
                                            l.f3004 = (char) (l.f3003 + (((short) (sArr[i9] + s)) ^ l.f3002));
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
                    });
                    int i2 = f3084 + InterfaceC0280i1.d.b.i;
                    f3087 = i2 % 128;
                    int i3 = i2 % 2;
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2967(char c, String str, String str2, String str3, int i) {
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
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr2.clone();
                        cArr4[0] = (char) (c ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i));
                        int length = cArr.length;
                        char[] cArr6 = new char[length];
                        g.f2156 = 0;
                        while (g.f2156 < length) {
                            int i2 = (g.f2156 + 2) % 4;
                            int i3 = (g.f2156 + 3) % 4;
                            g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                            cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                            cArr4[i3] = g.f2154;
                            cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr[g.f2156])) ^ f3085) ^ ((long) f3086)) ^ ((long) f3088));
                            g.f2156++;
                        }
                        str4 = new String(cArr6);
                    }
                    return str4;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                if (AnonymousClass5.this.f3079) {
                    t.m2915(t.this).m626(AnonymousClass5.this.f3082, new AnonymousClass4());
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.av
        /* JADX INFO: renamed from: ｋ */
        public final void mo385() {
            p.m2900(new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2935(Context context, String str, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        String strM467 = m2914().m467();
        m2914().m468(str);
        if (str == null) {
            int i2 = f3021 + 73;
            f3018 = i2 % 128;
            int i3 = i2 % 2;
            n.m2876(m2947(74 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11).intern(), m2947(699 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.green(0) + 93).intern());
        } else if (str.equals(m2947((Process.myTid() >> 22) + 793, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35950), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
            n.m2876(m2947(74 - View.combineMeasuredStates(0, 0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 12 - TextUtils.getOffsetBefore("", 0)).intern(), new StringBuilder().append(m2947(View.getDefaultSize(0, 0) + 810, (char) Color.argb(0, 0, 0, 0), 40 - (KeyEvent.getMaxKeyCode() >> 16)).intern()).append(str).append(m2947(850 - (KeyEvent.getMaxKeyCode() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 52845), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 77).intern()).toString());
        } else {
            n.m2874(m2947(73 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR).intern(), new StringBuilder().append(m2947(926 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17555), (ViewConfiguration.getLongPressTimeout() >> 16) + 33).intern()).append(str).toString());
        }
        ar.m480().mo509(new AnonymousClass5(z, context, z2, strM467, z3));
        JSONObject jSONObjectM2917 = m2917();
        if (jSONObjectM2917 == null) {
            ar.m480().mo503(context, m2914(), true);
            return;
        }
        int i4 = f3021 + InterfaceC0280i1.d.b.g;
        f3018 = i4 % 128;
        int i5 = i4 % 2;
        ar.m480().mo510(jSONObjectM2917);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m2917() {
        int i = 2 % 2;
        int i2 = f3018 + 45;
        f3021 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Map<String, String> mapM458 = m2914().m458();
            if (mapM458 != null) {
                int i3 = f3018 + InterfaceC0280i1.d.b.d;
                f3021 = i3 % 128;
                int i4 = i3 % 2;
                if (mapM458.containsKey(m2947(960 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 13).intern())) {
                    try {
                        return new JSONObject(mapM458.get(m2947(960 - Gravity.getAbsoluteGravity(0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 13).intern()));
                    } catch (JSONException unused) {
                    }
                }
            }
            int i5 = f3021 + 39;
            f3018 = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        m2914().m458();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006d A[PHI: r1
      0x006d: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v14 java.lang.String) binds: [B:8:0x006b, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2948(Context context) {
        String strM2606;
        int i = 2 % 2;
        int i2 = f3021 + InterfaceC0280i1.d.b.g;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            strM2606 = this.f3025.m2606(m2947(19359 >>> TextUtils.getOffsetAfter("", 1), (char) ((-1) / (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))), 5 % (ViewConfiguration.getPressedStateDuration() % 30)).intern());
            if (!TextUtils.isEmpty(strM2606)) {
                new je(context, m2947(982 - TextUtils.indexOf((CharSequence) "", '0'), (char) (40901 - (Process.myPid() >> 22)), KeyEvent.normalizeMetaState(0) + 25).intern(), m2947(Process.getGidForName("") + 1009, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 40513), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24).intern()).m2608(m2947(973 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), strM2606);
                this.f3025.m2604(m2947(((byte) KeyEvent.getModifierMetaStateMask()) + 974, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10).intern());
            }
        } else {
            strM2606 = this.f3025.m2606(m2947(973 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 10 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            if (!TextUtils.isEmpty(strM2606)) {
                new je(context, m2947(982 - TextUtils.indexOf((CharSequence) "", '0'), (char) (40901 - (Process.myPid() >> 22)), KeyEvent.normalizeMetaState(0) + 25).intern(), m2947(Process.getGidForName("") + 1009, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 40513), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24).intern()).m2608(m2947(973 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), strM2606);
                this.f3025.m2604(m2947(((byte) KeyEvent.getModifierMetaStateMask()) + 974, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10).intern());
            }
        }
        int i3 = f3018 + InterfaceC0280i1.d.b.g;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2960() {
        int i = 2 % 2;
        int i2 = f3021 + 33;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        if (m2958()) {
            int i4 = f3021 + 57;
            f3018 = i4 % 128;
            int i5 = i4 % 2;
            n.m2876(m2947((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 12).intern(), m2947((ViewConfiguration.getLongPressTimeout() >> 16) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, (char) (8478 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 60 - KeyEvent.keyCodeFromString("")).intern());
            int i6 = f3021 + 53;
            f3018 = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        }
        if (m2911()) {
            n.m2876(m2947(TextUtils.lastIndexOf("", '0', 0) + 75, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m2947((ViewConfiguration.getJumpTapTimeout() >> 16) + 1092, (char) (40230 - KeyEvent.keyCodeFromString("")), 48 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            return;
        }
        this.f3033 = true;
        int i7 = f3018 + 61;
        f3021 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        } else {
            throw null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m2959() {
        int i = 2 % 2;
        int i2 = f3021 + 53;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f3033;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m2938(boolean z) {
        int i = 2 % 2;
        int i2 = f3021 + 51;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f3037 = z;
            throw null;
        }
        this.f3037 = z;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m2961() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i = 2 % 2;
        int i2 = f3018 + 39;
        int i3 = i2 % 128;
        f3021 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        iSAdQualityLogLevel = this.f3035;
        int i4 = i3 + 45;
        f3018 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        throw th;
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2925(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f3021 + 25;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f3035 = iSAdQualityLogLevel;
            throw null;
        }
        this.f3035 = iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized boolean m2916() {
        int i = 2 % 2;
        int i2 = f3018;
        int i3 = i2 + 57;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f3037;
        int i5 = i2 + 53;
        f3021 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        int i6 = 62 / 0;
        return z;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final synchronized at m2957() {
        at atVar;
        int i = 2 % 2;
        int i2 = f3018 + 21;
        f3021 = i2 % 128;
        if (i2 % 2 == 0) {
            atVar = this.f3031;
            int i3 = 44 / 0;
        } else {
            atVar = this.f3031;
        }
        return atVar;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m2911() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3021 + 71;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        z = this.f3038;
        int i5 = i3 + 29;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2927(boolean z) {
        int i = 2 % 2;
        int i2 = f3021 + 39;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        this.f3038 = true;
        int i5 = i3 + 27;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m2908() {
        int i = 2 % 2;
        int i2 = f3018 + 61;
        f3021 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f3041;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2944(boolean z) {
        int i = 2 % 2;
        int i2 = f3021 + 85;
        int i3 = i2 % 128;
        f3018 = i3;
        int i4 = i2 % 2;
        this.f3041 = z;
        int i5 = i3 + 43;
        f3021 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2934(Context context) {
        int i = 2 % 2;
        try {
            Object obj = null;
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.t.2
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    jx.m2735(intent);
                }
            }, new IntentFilter(m2947(1141 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (385 - Color.blue(0)), TextUtils.indexOf((CharSequence) "", '0') + 38).intern()), null, p.m2890());
            int i2 = f3021 + 51;
            f3018 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            n.m2875(m2947(74 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777228).intern(), m2947(1178 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (45271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f3021 + 1;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        if (!m2958()) {
            this.f3030 = iSAdQualityAdListener;
            return;
        }
        int i4 = f3018 + 93;
        f3021 = i4 % 128;
        int i5 = i4 % 2;
        n.m2876(m2947((KeyEvent.getMaxKeyCode() >> 16) + 74, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2947(1212 - TextUtils.getOffsetBefore("", 0), (char) (53626 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 53 - KeyEvent.keyCodeFromString("")).intern());
        int i6 = f3021 + 79;
        f3018 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        if (m2958()) {
            n.m2876(m2947(74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12).intern(), m2947(1265 - TextUtils.getCapsMode("", 0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), 66 - Process.getGidForName("")).intern());
            int i2 = f3018 + 79;
            f3021 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (m2911()) {
            this.f3023.m430(iSAdQualityCustomMediationRevenue);
            return;
        }
        n.m2876(m2947((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 73, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 12).intern(), m2947(1332 - View.combineMeasuredStates(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 2761), 73 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        int i3 = f3018 + 25;
        f3021 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        int i2 = f3018 + 119;
        f3021 = i2 % 128;
        int i3 = i2 % 2;
        if (m2958()) {
            int i4 = f3021 + 27;
            f3018 = i4 % 128;
            int i5 = i4 % 2;
            n.m2876(m2947(74 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11).intern(), m2947((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1405, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 49 - (Process.myTid() >> 22)).intern());
            int i6 = f3018 + 125;
            f3021 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.t.1

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f3042 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f3043 = 5;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f3044;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3045 = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'C', 'n', '\'', ' ', 's', 'e', 'g', 'm', '-', 'I', 'o', 'z', '.'};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i7 = 2 % 2;
                if (!t.m2909(t.this)) {
                    n.m2876(m2962(12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f", (byte) (106 - TextUtils.lastIndexOf("", '0'))).intern(), m2962(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 56, "\u000e\u0002\u000e\n\u0005\u0011\u0011\u0012\u0005\u0011\u0011\u0012\u0013\u000f\u0012\f\u0005\u0011\u0000\u0014\u0018\u0006\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0005\u0012\u0005\u000e\n\u0010\u000b\u0015\u0012\n\u0002\f\u0010\u0005\u000b\b\b\u0007\u0000\t\b\u0015\u0010\u0002\u009a", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 107)).intern());
                    int i8 = f3044 + 9;
                    f3042 = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
                if (t.m2903(t.this) != null) {
                    int i10 = f3044 + 97;
                    f3042 = i10 % 128;
                    int i11 = i10 % 2;
                    al alVarM2903 = t.m2903(t.this);
                    if (i11 != 0) {
                        alVarM2903.m440(iSAdQualitySegment);
                    } else {
                        alVarM2903.m440(iSAdQualitySegment);
                        int i12 = 43 / 0;
                    }
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2962(int i7, String str, byte b) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2043) {
                    char[] cArr2 = f3045;
                    char c = f3043;
                    char[] cArr3 = new char[i7];
                    if (i7 % 2 != 0) {
                        i7--;
                        cArr3[i7] = (char) (cArr[i7] - b);
                    }
                    if (i7 > 1) {
                        f.f2047 = 0;
                        while (f.f2047 < i7) {
                            f.f2045 = cArr[f.f2047];
                            f.f2048 = cArr[f.f2047 + 1];
                            if (f.f2045 == f.f2048) {
                                cArr3[f.f2047] = (char) (f.f2045 - b);
                                cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                            } else {
                                f.f2046 = f.f2045 / c;
                                f.f2042 = f.f2045 % c;
                                f.f2044 = f.f2048 / c;
                                f.f2041 = f.f2048 % c;
                                if (f.f2042 == f.f2041) {
                                    f.f2046 = ((f.f2046 + c) - 1) % c;
                                    f.f2044 = ((f.f2044 + c) - 1) % c;
                                    int i8 = (f.f2046 * c) + f.f2042;
                                    int i9 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i8];
                                    cArr3[f.f2047 + 1] = cArr2[i9];
                                } else if (f.f2046 == f.f2044) {
                                    f.f2042 = ((f.f2042 + c) - 1) % c;
                                    f.f2041 = ((f.f2041 + c) - 1) % c;
                                    int i10 = (f.f2046 * c) + f.f2042;
                                    int i11 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i10];
                                    cArr3[f.f2047 + 1] = cArr2[i11];
                                } else {
                                    int i12 = (f.f2046 * c) + f.f2041;
                                    int i13 = (f.f2044 * c) + f.f2042;
                                    cArr3[f.f2047] = cArr2[i12];
                                    cArr3[f.f2047 + 1] = cArr2[i13];
                                }
                            }
                            f.f2047 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        });
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3021 + 69;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        if (m2958()) {
            n.m2876(m2947(73 - TextUtils.indexOf((CharSequence) "", '0'), (char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern(), m2947(ImageFormat.getBitsPerPixel(0) + 1455, (char) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror('0')).intern());
            return;
        }
        if (m2908()) {
            n.m2876(m2947((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12).intern(), m2947((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1501, (char) (26420 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "") + 58).intern());
            return;
        }
        this.f3040 = iSAdQualityConfig;
        int i4 = f3018 + 67;
        f3021 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m2907() {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.t.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                for (ISAdQualityInitListener iSAdQualityInitListener : t.m2902(t.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                t.m2902(t.this).clear();
            }
        });
        int i2 = f3018 + 19;
        f3021 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2949(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f3021 + 87;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            m2954(this.f3024, iSAdQualityInitError, str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        m2954(this.f3024, iSAdQualityInitError, str);
        int i3 = f3021 + 71;
        f3018 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2954(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.t.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i2 = f3021 + 1;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2945(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        if (this.f3040 != null) {
            try {
                String str = iSAdQualityConfig.getMetaData().get(m2947((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 960, (char) ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 13).intern());
                if (TextUtils.isEmpty(str)) {
                    int i2 = f3018 + 49;
                    f3021 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    return new JSONObject(str).optBoolean(m2947(1560 - (Process.myTid() >> 22), (char) ExpandableListView.getPackedPositionType(0L), 22 - View.resolveSize(0, 0)).intern());
                }
            } catch (Throwable unused) {
            }
            return false;
        }
        int i4 = f3021 + 121;
        f3018 = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2947(int i, char c, int i2) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f3020[b.f638 + i]) ^ (((long) b.f638) * f3019)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
