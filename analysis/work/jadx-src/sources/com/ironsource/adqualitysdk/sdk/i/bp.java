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
import com.google.common.base.Ascii;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bp extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f966 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f967 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f968;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f969;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("\n®µ°t°7\u008cö\u0085±öpø3üòÞ½Ì|7?2\u0000^¿Q~~=|üh»%z`9\u0006øC·)væ5«\u0000H¿t~j=Uüy»\u0019\u0000H¿t~j=Uüy»\u0019z\r94ø\u0006·\u0001vð5àôð³ÅrÓ1±\u0000P¿a~{=DüQ»,z+95ø\u001c·!vû5ÿôù<°\u0083\u0098\u0000D¿h~j=BüZ»%z+95ø\u000b·\fvÊ5àôð³ÍrÓ1±\u0000P¿\u007f~\u007f=Kü[» z*9>ø\f·#vã5üôè³ír×1·ð±\u0000H¿t~j=Uüy»\u0019z\u001e9)ø\u0007·\u0005vç5ýôè³ÀrÓ1°\u0000H¿t~j=Uüy»\u0019z\u00199>ø\n·#vë5êôë³þrß1·ð¸¯\u009en\u0086-\u0098íw¬pk|*Gé]¨\u000bg3&)å.¤\u0018cô\u0000c¿b~w=\tü\\»8z>9)ø\u0005·\rv¬5îôò³ÍrÄ1¬ð¹¯¹nÄ-\u0084í`¬zk0*LéJ¨$g\"&7å\u0005¤\u001acõ\"½áè Ô_Ê\u001eµÝ\u0099\u009c¹[¹\u001a\u009eÚj\u0099CXK\u0017JÖK\u0095\u001eT?\u0013\u0017Ò\u0018\u0091>Pæ\u000føÎ×\u008dÐLÜ\u000b§Ê½\u0089«H\u0093\u0007\u0089ÇN\u0086xETÏ\u008fp³±\u00adò\u00923¾tÞµÇöó7àxÔ¹#ú-;)|\u001d½0þg?c`s¡[âY\"·c¯ë\u0005T\u0004\u0095\u0011Öo\u0017:P^\u0091XÒO\u0013c\\k\u009dÊÞ\u0088\u001f\u0094X«\u0099¢ÚÊ\u001bßDß\u0085¢Æâ\u0006\u0006G\u001c\u0080VÁ,\u0002=CW\u008c]ÍO\u000ecOk\u0088\u0099ÉÛ\n\u008eK²´¬õÓ6ÿwß°Æñò1!r\u0015³\"ü,=(~\\¿qøf9bzr»\u009aä\u0098%¶f®8÷\u0087ËFÕ\u0005êÄÆ\u0083¦B¾\u0001\u0082À±\u008f¯NO\rfÌJ\u008bsJ~\t\u0019È\u001d\u0097#V6\u0015<ÕÒ\u0094ØSÈ\u0012àÑþ\u0000c¿b~w=\tü\\»8z>9)ø\u0005·\rv¬5îôò³ÍrÄ1¬ð¹¯¹nÄ-\u0084í`¬zk0*Jé[¨1g;&)å\u0005¤\rcÿ\"½áè Ô_Ê\u001eµÝ\u0099\u009c¹[¡\u001a\u009dÚn\u0099pXP\u0017yÖU\u0095,T!\u0013\u0006Ò\u0002\u0091<Pé\u000fãÎÍ\u008dÇL×\u000b¿Ê¡´\u008a\u000b¶Ê¨\u0089\u0097H»\u000fÛÎÞ\u008düLÛ\u0003ÂÂ)\u0081?@;\u0007\u000fÆ=\u0085oDt\u001bpÚZ\u0099XY§\u0018§ßµ\u009e\u0086]\u0094\u001cÆÓó\u0092éQÇ\u0010Í×-\u0096%U\u001bõ\u000fJ\u000e\u008b\u001bÈe\t0NT\u008fRÌE\riBa\u0083ÀÀ\u0082\u0001\u009eF¡\u0087¨ÄÀ\u0005ÕZÕ\u009b¨Øè\u0018\fY\u0016\u009e\\ß&\u001c7]]\u0092WÓE\u0010iQa\u0096\u0093×Ñ\u0014\u0084U¸ª¦ëÙ(õiÕ®Ðïò/\u0015l\f\u00ad'â1#5`A¡sæa'zd~¥\u0094ú\u0096;©x©¹»þÈ?Ú|È½ýòç2\ts\u0003°#ñ+6U\u0000H¿t~j=Uüy»\u0019z\f9:ø\u001b·\u0010vÔ5æôù³Þrõ1¬ð¾¯©n\u0098-\u0098íh¬}k{*Y\u0012±\u00ad\u008dl\u0093/¬î\u0080©àhá+Ãêâ¥ød-'\u001fæ\u0000¡'`\f#UâG½P|a?aÿ\u0091¾\u0084y\u00828 Í%r\u0019³\u0007ð81\u0014vt·tôS5gzL»\u009dø\u00839\u0097~¢¿²üÍ=ëbÙ£âàí *a\u0013¦\u001dç2$'eGªSë^(dif\u0000O¿k~|=BüF»\u0002z/98ø\u0000·\u0010vÇ5áôè³ÀrÂ1ºfvÙI\u0018Y[R\u009agÝ\u0001\u001c\t_\u001c\u009e Ñ7\u0010ìSÌ\u0092×Õí\u0014ôW\u0096øÆGù\u0086éÅâ\u0004×C±\u0082¹Á¬\u0000\u0090O\u0087\u008eFÍL\fA\u0000H¿t~j=Uüy»\u0019z\u00029>ø\t·\u0007vì5Âôó³ÛrÓ1\u0080ð¿¯³n\u009e-\u0085ík¬}kr*NéJ\u000bÚ´æuø6Ç÷ë°\u008bq\u00912»ó\u009b¼\u008e}t>Kÿg¸^yS:\u0012û-¤!e\f&\u0017æù§ï`à!ÜâØ\u0000H¿t~j=Uüy»\u0019z\u00019=ø\u000e·\u0010vð5Øôù³Ërà1ªðµ¯ªn©-\u0098íj¬ekl*DéT¨)g7&-\u0000H¿t~j=Uüy»\u0019z\u00199>ø\n·#vë5êôë\u0000H¿t~j=Uüy»\u0019z\u00199>ø\n·#vë5êôë³êrÚ1ªðµ¯³n\u009eÝçbÛ£Åàú!Öf¶§®ä\u0092%¡j¿«_èv)Znc¯nì\t-\rr:³$ð60ÏqÒ¶Ô÷ö\u0000O¿k~|=BüF»\u0017z'9>ø\u001f·\u0010vð5Çôý³ÇrÒ1¯ðµ¯¯n¦-\u009eíw¬ek{*Eé]¨7í\u000fR3\u0093-Ð\u0012\u0011>V^\u0097ZÔw\u0015FZB\u009b\u0086Ø§\u0019µ^\u009a\u009f\u0083Üë\u001dûBö\u0083ÈÀÂApþL?R|m½Aú!;%x\b¹9ö=7ùtØµÊòå3üp\u0094±\u0084î\u0089/·l½¬pí@*Ukg¨eé\u0013&\u000fg\u00156i\u0089UHK\u000btÊX\u008d8L-\u000f\bÎ&\u0081#@Ð\u0003ËÂÏ\u0085ÉDô\u0007\u0096Æ\u0098\u0099\u008aX¢\u001b¢Û\\\u0000c¿b~w=\tü\\»8z>9)ø\u0005·\rv¬5îôò³ÍrÄ1¬ð¹¯¹nÄ-\u0084í`¬zk0*DéN¨ g &3å\r¤\u0000c¨\"ÛáÙ Ý_È\u001e\u008aÝ\u008c\u009c£[\u009c\u001a\u0094Ú\u007f\u0099fXG\u0017]Ö}\u0095*T\"\u0013\nÒ\u0006\u0091\u0014Pþ\u000fî\u0000g¿h~n=püQ»#z\u001a9)ø\t·\u0013vä5æôÿ³ærÔ1©ðµ¯¾n\u009e-¢ív¬}km\u0000g¿h~n=hüR»'z+9)ø+·\u0014vá5çôù³êrÚ1ªð³¯¶n¾-\u009fív¬~kk*LéP¨\u0010g &3\u0000g¿h~n=füP»\u0015z79+ø\r\u0000g¿h~n=wüX» z-9>ø\u0005·\u0010vì5ûôÈ³ÐrÆ1¦ð\u0095¯³n\u009f-\u009aîXQW\u0090QÓ\\\u0012nU\u000e\u0094\u0014×\n\u00163Y/\u0098ÓÛÓ\u001aÚ]Þ\u009cæß\u0090\u001e\u008bA\u0087\u0080§Ã\u0081\u0003UB]\u0085UÄu\u0007iF\u0019\u0089\b\n|µstu7xöF±)p!32ò\u001a½\f|ì?àþè¹Àxä;¼\u0000g¿h~n=wüX» z-9>ø\u0005·\u0010vì5ûôß³ÆrØ1·ð¢¯²n\u0086-\u009bía¬c\u0000g¿h~n=wüF»$z\"94ø\t·\u0011vç5ëôØ³ÈrÂ1¢\u0000g¿h~n=wüU»3z/96ø\r·\u0001vç5ýôïz}Åg\u0004bGI\u0086IÁ*\u0000$C0\u0000I¿C~N=büf»\u0012z\u001a9\u0012ø<·<vÃ5Ã\u0000I¿C~L=füx»\bz\n¨a\u0017mÖa\u0095WTR\u0013 Ò(\u0091 P\u000e\u001f\u001bÞá\u009dé\\é\u001bÃÚÝ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1080);
        f966 = cArr;
        f969 = -8861176015129100531L;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ DependencyHolder m1027() {
        int i = 2 % 2;
        int i2 = f967 + 11;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        DependencyHolder dependencyHolderM1028 = m1028();
        int i4 = f967 + 85;
        f968 = i4 % 128;
        int i5 = i4 % 2;
        return dependencyHolderM1028;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ PreloadedVastData m1030(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f968 + 43;
        f967 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1036(dependencyHolder);
        }
        m1036(dependencyHolder);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m1031(String str) {
        int i = 2 % 2;
        int i2 = f967 + 81;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1029 = m1029(str);
        int i4 = f967 + 117;
        f968 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM1029;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m1033(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f968 + 73;
        f967 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1045(preloadedVastData);
        }
        m1045(preloadedVastData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ PlacementController m1034(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f968 + 11;
        f967 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1041(hyprMXController);
        }
        m1041(hyprMXController);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m1035(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f967 + 29;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        String strM1043 = m1043(dependencyHolder);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = f967 + 53;
        f968 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return strM1043;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m1037(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f968 + 25;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        String strM1042 = m1042(offerCacheEntity);
        int i4 = f967 + 7;
        f968 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1042;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m1038(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f968 + 95;
        f967 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> listM1044 = m1044(webTrafficObject);
        int i4 = f967 + 29;
        f968 = i4 % 128;
        int i5 = i4 % 2;
        return listM1044;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m1040(Ad ad) {
        int i = 2 % 2;
        int i2 = f967 + 51;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        String strM1032 = m1032(ad);
        int i4 = f967 + 93;
        f968 = i4 % 128;
        int i5 = i4 % 2;
        return strM1032;
    }

    public bp(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f967 + 83;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m1039(TextUtils.lastIndexOf("", '0', 0) + 1, 11 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (2808 - Color.blue(0))).intern()).get(null);
                int i4 = f968 + 11;
                f967 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return str;
            } catch (Exception unused) {
                return hu.m2296().m2297().m2344(BuildConfig.class, m1039(12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x041d  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118473762:
                b = !str.equals(m1039(24 - Color.red(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -2115661176:
                b = !str.equals(m1039(508 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, (char) (52589 - KeyEvent.keyCodeFromString(""))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2082076211:
                b = !str.equals(m1039((ViewConfiguration.getEdgeSlop() >> 16) + 763, 28 - TextUtils.indexOf("", "", 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16696)).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case -2060981001:
                b = !str.equals(m1039(61 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.blue(0) + 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1783324338:
                b = !str.equals(m1039(227 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 54 - TextUtils.getOffsetBefore("", 0), (char) (60261 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1711062568:
                b = !str.equals(m1039(110 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 31 - Color.red(0), (char) Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1632261541:
                b = !str.equals(m1039((Process.myTid() >> 22) + 661, 12 - TextUtils.lastIndexOf("", '0', 0, 0), (char) View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1625751435:
                b = !str.equals(m1039((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 394, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 65, (char) (62876 - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case -1429076201:
                b = !str.equals(m1039(634 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 28 - View.MeasureSpec.getMode(0), (char) Color.red(0)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case -1345825871:
                if (!str.equals(m1039((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 94, 15 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1289932600:
                b = !str.equals(m1039(554 - Color.argb(0, 0, 0, 0), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (26145 - TextUtils.indexOf("", "", 0))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1102538544:
                if (!str.equals(m1039(718 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 27, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i2 = f968 + 125;
                    f967 = i2 % 128;
                    b = i2 % 2 != 0 ? Ascii.ESC : (byte) 49;
                }
                break;
            case -1056910325:
                b = !str.equals(m1039(141 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -793729563:
                b = !str.equals(m1039(204 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (Color.red(0) + 53191)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -684201479:
                if (!str.equals(m1039(743 - (ViewConfiguration.getScrollBarSize() >> 8), 20 - View.getDefaultSize(0, 0), (char) (60743 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    b = -1;
                } else {
                    int i3 = f967 + 31;
                    f968 = i3 % 128;
                    b = i3 % 2 == 0 ? (byte) 28 : (byte) 86;
                }
                break;
            case -411143178:
                if (!str.equals(m1039((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 304, 57 - Color.alpha(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i4 = f967 + 107;
                    f968 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 12;
                }
                break;
            case -352824194:
                if (!str.equals(m1039(View.MeasureSpec.makeMeasureSpec(0, 0) + 77, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, (char) TextUtils.getTrimmedLength("")).intern())) {
                    b = -1;
                } else {
                    int i6 = f967 + 55;
                    f968 = i6 % 128;
                    int i7 = i6 % 2;
                }
                break;
            case -58290677:
                b = !str.equals(m1039(Process.getGidForName("") + 485, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, (char) (4857 - Color.alpha(0))).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -52302939:
                b = !str.equals(m1039(Color.red(0) + 812, MotionEvent.axisFromString("") + 53, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -48720897:
                b = !str.equals(m1039(Color.rgb(0, 0, 0) + 16777496, TextUtils.getOffsetAfter("", 0) + 25, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14526)).intern()) ? (byte) -1 : Ascii.VT;
                break;
            case 2115:
                b = !str.equals(m1039(ExpandableListView.getPackedPositionType(0L) + 59, (ViewConfiguration.getTapTimeout() >> 16) + 2, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15600)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 5206681:
                b = !str.equals(m1039((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 791, 21 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (View.resolveSize(0, 0) + 13857)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 99044255:
                if (!str.equals(m1039(Color.rgb(0, 0, 0) + 16777262, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i8 = f967 + 113;
                    f968 = i8 % 128;
                    b = i8 % 2 == 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 217655834:
                b = !str.equals(m1039(30 - (ViewConfiguration.getTouchSlop() >> 8), 16 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 748493318:
                b = !str.equals(m1039(675 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 902272186:
                if (!str.equals(m1039(TextUtils.indexOf("", "", 0) + 608, TextUtils.getOffsetAfter("", 0) + 25, (char) (2962 - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
                    b = -1;
                } else {
                    int i9 = f968 + 115;
                    f967 = i9 % 128;
                    b = i9 % 2 != 0 ? (byte) 22 : (byte) 102;
                }
                break;
            case 1056638846:
                if (!str.equals(m1039(View.resolveSizeAndState(0, 0, 0) + 362, 33 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (Color.rgb(0, 0, 0) + 16823490)).intern())) {
                    b = -1;
                } else {
                    int i10 = f967 + 49;
                    f968 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b = 13;
                    } else {
                        b = 6;
                    }
                }
                break;
            case 1527993897:
                b = !str.equals(m1039(538 - View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 17, (char) Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case 1564846544:
                b = !str.equals(m1039(View.resolveSizeAndState(0, 0, 0) + 460, (ViewConfiguration.getTouchSlop() >> 8) + 24, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case 1575934042:
                b = !str.equals(m1039(693 - TextUtils.getOffsetAfter("", 0), 24 - Color.green(0), (char) (56751 - (ViewConfiguration.getTapTimeout() >> 16))).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 1775126662:
                b = !str.equals(m1039((ViewConfiguration.getPressedStateDuration() >> 16) + 570, 13 - View.getDefaultSize(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 63634)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1872662391:
                if (!str.equals(m1039(583 - ExpandableListView.getPackedPositionGroup(0L), 25 - Drawable.resolveOpacity(0, 0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i11 = f967 + 33;
                    f968 = i11 % 128;
                    b = i11 % 2 == 0 ? Ascii.NAK : (byte) 73;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case 8:
                return HyprMXWebViewWithClosableNavBar.class;
            case 9:
            case 10:
                return HyprMXNoOffersActivity.class;
            case 11:
            case 12:
                return HyprMXOfferViewerActivity.class;
            case 13:
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                int i12 = f968 + 91;
                f967 = i12 % 128;
                int i13 = i12 % 2;
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m1039(865 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 22 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) KeyEvent.keyCodeFromString("")).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1038((WebTrafficObject) list.get(0));
            }
        });
        map.put(m1039((ViewConfiguration.getFadingEdgeLength() >> 16) + 887, 28 - (KeyEvent.getMaxKeyCode() >> 16), (char) Color.alpha(0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1037((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m1039(View.MeasureSpec.getSize(0) + 915, 9 - KeyEvent.keyCodeFromString(""), (char) TextUtils.indexOf("", "", 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1040((Ad) list.get(0));
            }
        });
        map.put(m1039(925 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.resolveSizeAndState(0, 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1031((String) list.get(0));
            }
        });
        map.put(m1039(944 - Gravity.getAbsoluteGravity(0, 0), Color.blue(0) + 27, (char) (ImageFormat.getBitsPerPixel(0) + 60992)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1027();
            }
        });
        map.put(m1039((ViewConfiguration.getDoubleTapTimeout() >> 16) + 971, 15 - ExpandableListView.getPackedPositionChild(0L), (char) (2587 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1035((DependencyHolder) list.get(0));
            }
        });
        map.put(m1039(987 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 22, (char) Color.argb(0, 0, 0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1034((HyprMXController) list.get(0));
            }
        });
        map.put(m1039(((byte) KeyEvent.getModifierMetaStateMask()) + 1010, 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1030((DependencyHolder) list.get(0));
            }
        });
        map.put(m1039(TextUtils.indexOf((CharSequence) "", '0', 0) + IronSourceError.ERROR_RV_LOAD_DURING_LOAD, 13 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bp.m1033((PreloadedVastData) list.get(0));
            }
        });
        int i2 = f967 + InterfaceC0280i1.d.b.g;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m1044(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f967 + 67;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        if (i3 == 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1042(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f967 + 81;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        int i4 = f968 + 75;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PreloadedVastData m1036(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f967 + 123;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        int i4 = f967 + 91;
        f968 = i4 % 128;
        if (i4 % 2 == 0) {
            return preloadedData;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m1045(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f967 + 27;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = f967 + 77;
        f968 = i5 % 128;
        int i6 = i5 % 2;
        return parameters;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1032(Ad ad) {
        int i = 2 % 2;
        int i2 = f967 + 83;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        String str = ad.type;
        int i4 = f968 + 27;
        f967 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Object m1029(String str) {
        int i = 2 % 2;
        byte b = 0;
        switch (str.hashCode()) {
            case -1617199657:
                if (!str.equals(m1039((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_EXPIRED_ADS, 7 - TextUtils.getTrimmedLength(""), (char) (Process.myTid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i2 = f968 + 81;
                    f967 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 3 / 2;
                    }
                    b = 2;
                }
                break;
            case -1372958932:
                if (!str.equals(m1039(1046 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -65580248:
                if (!str.equals(m1039(1065 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, (char) (43055 - Color.red(0))).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 543046670:
                if (!str.equals(m1039(1037 - ImageFormat.getBitsPerPixel(0), (Process.myTid() >> 22) + 8, (char) (31279 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                    b = -1;
                } else {
                    int i4 = f968 + 79;
                    f967 = i4 % 128;
                    int i5 = i4 % 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return PlacementType.REWARDED;
        }
        if (b == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (b == 2) {
            return PlacementType.INVALID;
        }
        if (b != 3) {
            return null;
        }
        return PlacementType.NOT_INITIALIZED;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static DependencyHolder m1028() {
        DependencyHolder dependencyHolder;
        int i = 2 % 2;
        int i2 = f967 + InterfaceC0280i1.d.b.g;
        f968 = i2 % 128;
        if (i2 % 2 != 0) {
            dependencyHolder = DependencyHolder.INSTANCE;
            int i3 = 21 / 0;
        } else {
            dependencyHolder = DependencyHolder.INSTANCE;
        }
        int i4 = f967 + 3;
        f968 = i4 % 128;
        int i5 = i4 % 2;
        return dependencyHolder;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1043(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f967 + 73;
        f968 = i2 % 128;
        int i3 = i2 % 2;
        String distributorId = dependencyHolder.getDistributorId();
        int i4 = f967 + 125;
        f968 = i4 % 128;
        int i5 = i4 % 2;
        return distributorId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementController m1041(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f967 + 95;
        f968 = i2 % 128;
        if (i2 % 2 != 0) {
            hyprMXController.getPlacementController();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        PlacementController placementController = hyprMXController.getPlacementController();
        int i3 = f967 + 15;
        f968 = i3 % 128;
        int i4 = i3 % 2;
        return placementController;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1039(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f966[b.f638 + i]) ^ (((long) b.f638) * f969)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
