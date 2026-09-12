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
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1853 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f1854 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1855 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1856;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<ed, ed> f1857;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<fr, fr> f1858;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1859;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f1860 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1861;

    interface a<T> {
        /* JADX INFO: renamed from: ﾇ */
        T mo2074(List<dy> list);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m2066() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("\u0000{\u0000mD\u0011\u0088\u009cÍ4\u0011¿V \u009a\u0098ßN#Ïhp¬ñðÜ5\u0003y\u008c¾7\u0002¹G,\u008bÐÐ\b\u0014þYu\u009d¤á\u0099&Lj\u0083¯;ó¥8L|ßÁQ\u0005öJh\u008e Ò\u0087\u0017\u001c[½ $ä¡)UmÉ²Nöà<\u008d\u0000iD\u0012d\u0011 lìí\u0000wD\u001c\u0088\u0081Í0\u0011µq45WùÚ¼o`ä'l\u0000bD\u0006\u0088\u008dÍ=\u0011»\u0000cD\u001b\u0088\u0086Í(\u0011¹V*\u009aÍßIRå\u0016\u0097Ú\u0000\u0000vD\u0015\u0088\u009aUÁ\u0011±Ý7\u0098\u0083D\u0015\u0003\u0086Ïs\u008a v+=\u0083ù\u0003¥p`½,<ëÔW\u0005\u0012\u0082Þ|\u0085¤A_\fÚÈ\b´'s´?-ú\u008c¦\u0001mý)y\u0094æP@\u0010s\u0000iD\u0012\u0088ÈÍ/\u0011¤V%\u009aÌßI#Íhq¬æð\u00885Py\u0097¾0\u0002£G5\u008bØÐL\u0014¼Yr\u009dááØ&\nj\u008f¯8ó¤8S|ÇÁA\u0005üJ,\u008eâÒ\u008d\u0017H[½ päã)\u0010m\u008b\u000eb\u0000iD\u0012\u0088ÈÍ/\u0011¤V%\u009aÌßI#Íhq¬æð\u00885Py\u0087¾7\u0002¢G$\u008bÝÐ\\\u0014õY\u007f\u009dêáØ&\u001fj\u0088¯;ó½8P|ÔÁ\u0004\u0005úJi\u008e Ò\u009d\u0017\u0006[¯ 9ä )]m\u008c²\u0007ö¼;!\u007f[\u0014\u0093Pî\u009cmÙÏ\\H\u00185Ô´\u0091RM\u008d\n\u001eÆ÷\u0083v\u007fë4WðÃ¬¼i*%êâ\u0005^\u008a\u001b\u0001×ï\u008cjHÖ\u0005\u001eÁÈ½³zb6¨ó\u0015¯\u008ad~ ñ\u009d}YÓ\u0016FÒ\u008e\u008e¸K?\u0007Òü\u001f¸Êu11ªî)Ê\r\u008epBñ\u0007\u0017ÛØ\u009c@P½\u0015#é¢¢\u000bf\u008a:øÿu³¯t@ÈÏ\u008dDAª\u001a/Þ\u0093\u0093[W\u008a+ýìc «eH9Êò#¶³\u000boÏÔ\u0080\\DÌAp\u0005\u001bÉ\u0083\u008c*P \u00175ÛÆ\u009e_b\u009f)níï±\u0093t\u001d8\u009eÿ4C \u00066ÊÄ\u0091YU£\u0018|Üó \u0088g\u0006+\u0093î/²÷yF=Á\u0080_D§\u000bdÏö\u0093\u009fV\u001f\u001aã\u0099üÝ\u0097\u0011\nT»\u0088>Ïï\u0003@FÓºJñë5fi\u001a¬\u009eà\u0001'§\u009bgÞ¸\u0012WIÌ\u008dbÀ÷\u0004kxS¿\u0085ó\u000e6ÿj%¡ØåWXÃ\u009c|Óð\u0017nK\u001b\u008eÃÂ59¢}o°Òô\u0007+\u008co7¢¤ñ\u001cµwyê<[àÞ§\u000fk .3Òª\u0099\u000b]\u0086\u0001úÄ~\u0088áOGó\u0087¶Hz°!-å\u0093¨\u0012l\u009b\u0010ú×h\u009bå^\u001f\u0002ÐÉ?\u008d´0:ô\u009f»\u0003\u007fË#ýæfª\u0097QR\u0015ÁØ \u009c®C/\u0007\u009aÊC\u008e02³ù&½\u0094¼³øÁ4Vq»\u00addê÷&\u001ec\u009f\u009f\u0002Ô¾\u0010*LU\u0089ÃÅ\u0003\u0002ò¾~ûô7\u0007lÏ¨9å²!c]\\\u009aÄÖJ\u0013ãO`\u0084\u008eÀ\u0019}\u0087¹\u007föã2.n]«Üçr\u001cóXf\u0095ßÑL\u000e\u009cJ.\u0087èÃ\u0092Oõ\u000b\u0083Ç\n\u0082©^.\u0000tD\u0006\u0088\u0091Í|\u0011£V0\u009aÙßX#Åhy¬íð\u00925\u0004yÄ¾+\u0002¤G/\u008bÁÐD\u0014øY0\u009dæá\u009d&Lj\u0086¯;ó¤8P|ßÁS\u0005ýJh\u008e Ò\u0096\u0017\u0011[ü 1ää)[mÍ²Tö÷;`\u007f\\Ã\u0083\b\u0010L¹\u00918Õ¥\u001aY^Í£rçä\u0000cD\u0015\u0088\u009cÍ?\u0011¸Vd\u009aÓßI#Ùhc¬çð\u008e5\u0014yÄ¾+\u0002¤G/\u008bÁÐD\u0014øY0\u009dæá\u009d&Lj\u0086¯;ó¤8P|ßÁS\u0005ýJh\u008e Ò\u0096\u0017\u0011[ü 1ää)\u001fm\u0084²\u0007\u0000mD\u001d\u0088\u009bÍ/\u0011¹V*\u009aßß\f#Ãhu¬üð\u009f5\u0018yÄ¾.\u0002\u00adG2\u008bÝÐI\u0014þY|\u009dááØ&\u0002j\u0081¯9ó\u00ad\u00198]N\u0091ÇÔd\bãO?\u0083\u0093Æ\u0016:\u0089q.µ¾é\u0087,X`×§l\u001bâ^w\u0092\u008bÉS\r¥@.\u0084ÿøÅ?Xs×¶cêü!\u0010e\u008eØ\u001b\u001cãS5\u0097¢Ë\u008f\u000eRB§¹,ý¶0D\u0000cD\u0015\u0088\u009cÍ?\u0011¸Vd\u009aËßX#Áh`¬íð\u00915\u0015y\u008a¾,\u0002ìG-\u008bÁÐ[\u0014èY0\u009dæá\u009d&Lj\u0083¯;ó¥8L|ßÁQ\u0005öJh\u008e ÒÜ\u0017\u0001[² #ä\u00ad)\\mÉ²\u0000ö³;s\u007f\u0001Ã×\bM@¦\u0004ÅÈH\u008dýQv\u0016þÚL\u009f\u008bc\u0000(¡ì(°MuÉ9UþâBl\u0007´Ë\u0013\u0090\u0094T'\u0019±Ý<¡Hf\u0098*Qïî³xxÈ<\u0013\u0081\u0099E8\n°Ît\u0092\u0007W\u0087\u001b/ø\u007f¼\u001bp\u00905 é¦®ybÖ'EÛÜ\u0090}Tð\b\u008cÍ\b\u0081\u0097F1úñ¿.sÁ(Zìô¡aeý\u0019ÅÞ\u0014\u0092\u0093W-\u000bõÀV\u0084Ä9Mýí²1vº*ÒïR>¿zÇ¶Zóô/ehö¤\u0011á\u0095\u001d\\V»\u0092 ÎA\u000bØG]\u0080é<uyòµ\u001cîÔ*3g¤£7ßQ\u0018ÜTX\u0091¨Íq\u0006\u008eB\bÿØ;3t¹°(ì@)\u0094e'\u009e·Ú?\u0000}Ø¤\u009cÐ\u0000|D\b\u0000=DIF_\u00027\u0000©\u0000>\u0000<DI\u0000>DI\u0000+î\u000b\u0096xÒ\f8\u001c|h\u0012)wM\u0000%\u0000.\u0000[\u0000=\u0091¢\u0000mD\u001d\u0088\u009bÍ/\u0011¹V*\u009aßß\f#Ãhx¬çð\u008f5\u0019y\u008a¾?\u0002ìGg\u008b\u009dÐ\u000f\u0000]6ár®¾9û\u0090'\u0014`\u0095¬oéì\u0015q^Ä\u009a\u001cÆ'\u0003´O5\u0088\u009e4\u0019q\u0080½oæî\"\b\u0000UD\u001a\u0088\u008dÍ$\u0011 V!\u009aÛßX#Åhp¬¨ð\u00885\u001fy\u008f¾=\u0002¢G`\u0000CD\u0015\u0088\u009dÍ;\u0011¸V0\u009a\u0098ßI#Øhw¬íð\u008c5\u0004y\u008d¾7\u0002¢\u0000ED\f\u0088\u0098Í9\u0011³V0\u009aÝßH#\u0080h}¬ìð\u00995\u001ey\u0090¾1\u0002ªG)\u008bÑÐZ\u0014¼Yr\u009dñá\u008c&Lj\u0087¯;ó¼8\u001c\u0000rD\u0011\u0088\u008eÍ0\u0011µV'\u009aÌßE#Ïhz¬¨ð\u009f5\u001cy\u0085¾+\u0002¿G`\u008bÚÐI\u0014ñYu\u009d÷áØ&\u001fj\u0088¯;ó½8P|ÔÁ\u0004\u0005úJi\u008e Ò\u0092\u0017\u0007[° <ä«)OmÉ²Dö´;j\u007f\u0005ÃÐ\b\rL¶\u0091:Õ¯\u001aW^É£hçù,kp\u0016´ÌùG=ü\u0082fÆ\u0092\u000b\u001eO\u008d\u0094?\u0000sD\u0001\u0088\u008aÍ/\u0011³V6\u009aÑß\\#Ôh4¬ûð\u00945\u001fy\u0091¾4\u0002¨G`\u008bÖÐM\u0014¼Ys\u009dèá\u0097&\u001fj\u0085¯0óè8K|ÙÁP\u0005ðJ,\u008e§Ò©\u0017O\u0000nD\u0001\u0088\u0084Í0\u0000sD\u0001\u0088\u0098Í9\u0011¢);mI¡Ðäq8ê\u007f,³\u0083ö\f\n\u0087A)\u0085¬ÙÐ\u001c\u0018PÎ\u0097u+¤nn¢\u0093ù\f=¸p7´»ÈÕ\u000f@C\u0088\u0086~Úù\u0011TU\u0099èL,½c!§¼ûÔ>Orð\u00898Íå\u0000\u001eD\u0092\u009b\u0007ß¿\u0012!V@êÑ!Ceþ¦gâ..ºk\u001b·\u0091ð\u0012<ÿyj\u0085¢Îe\nÞV¬\u0093;ß¨\u0018\u001d¤Îá\u0000-ãv~²\u009eÿU;ÉG®\u0080n\u0000:\\È\u0018¥Ô%\u0091\u0090MR\n\u008dÆ\u007f\u0083÷\u007f\"4ÅðB¬1i§%*â\u009e^N\u001b\u0080×s\u008cªHX\u0005ÝÁJ½6z¡65ó\u0093¯\u000ed¾ p\u009dÿY\u001a\u0016ÏÒ\u0002\u008e K«\u0007\u0012ü\u0087¸\u0003uº1oîäªBgÏ#¬\u009frTá\u0010@ÍÉ\u0000,\u0000lD\u001d\u0088\u009bÍ(\u0011ðV7\u009aÐßC#Õhx¬ìðÜ5\u0015y\u008a¾<\u0002ìG7\u008bÝÐ\\\u0014ôY0\u009d£\u0000'\u0000UD\u001a\u0088\u008dÍ$\u0011 V!\u009aÛßX#Åhp¬¨ð\u00995\u001ey\u0080¾x\u0002£G&\u008b\u0094Ð\\\u0014óY{\u009dáá\u0096&\u001f\u0000ED\f\u0088\u008bÍ9\u0011 V0\u009aÑßC#Îh4¬ÿð\u00945\u0019y\u0088¾=\u0002ìG'\u008bÑÐ\\\u0014èYy\u009dêá\u009f&Lj\u008e¯1ó°8H|\u0090ÁP\u0005÷Jg\u008eåÒ\u009a\u0000ED\f\u0088\u008bÍ9\u0011 V0\u009aÑßC#Îh4¬ÿð\u00945\u0019y\u0088¾=\u0002ìG0\u008bÑÐM\u0014÷Yy\u009dêá\u009f&Lj\u0081¯ óè8R|ÕÁ\\\u0005ìJ,\u008eôÒ\u009b\u0017\u0003[¹ >P%\u0014\u0010Ø\u008b\u009d-A°\u00063Ê\u009d\u0000ED\f\u0088\u0098Í9\u0011³V0\u009aÝßH#\u0080\t\u0019M/\u0081¤Ä\u0011\u0018É_\u000f\u0093äÖv*üaD¥Çù <-pý\u0000 DY\u0088È`¬$éèf\u00adÓqI6Êúk\u0017;S~\u009fñÚD\u0006ÒAA\u008d´Èg4\u00ad\u007f\u001e»\u008açû\"~në©\u0013\u0015ÃP^\u009cºÇc\u0003\u0083N\u0014\u008aÏöö1u}ù¸PäÑ/$".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1307);
        f1854 = cArr;
        f1853 = -6338572085495315340L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Pair m2048(dt dtVar, List list) {
        int i = 2 % 2;
        int i2 = f1855 + 75;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, ed> pairM2035 = dtVar.m2035(list);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return pairM2035;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ed m2060(dt dtVar, List list) {
        int i = 2 % 2;
        int i2 = f1855 + 89;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        ed edVarM2033 = dtVar.m2033(list);
        int i4 = f1855 + 77;
        f1856 = i4 % 128;
        if (i4 % 2 == 0) {
            return edVarM2033;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m2070(dt dtVar, String str) {
        int i = 2 % 2;
        int i2 = f1856 + 121;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        dtVar.m2051(str);
        int i4 = f1856 + 121;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        m2066();
        f1857 = new HashMap();
        f1858 = new HashMap();
        int i = f1855 + 65;
        f1856 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public dt(String str, String str2) {
        this.f1861 = str;
        this.f1859 = str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ed m2063(ed edVar) {
        int i = 2 % 2;
        ed edVar2 = f1857.get(edVar);
        if (edVar2 != null) {
            return edVar2;
        }
        int i2 = f1855 + 85;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        f1857.put(edVar, edVar);
        int i4 = f1855 + 43;
        f1856 = i4 % 128;
        int i5 = i4 % 2;
        return edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static fr m2064(fr frVar) {
        int i = 2 % 2;
        int i2 = f1856 + 85;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        fr frVar2 = f1858.get(frVar);
        if (frVar2 == null) {
            int i4 = f1856 + 43;
            f1855 = i4 % 128;
            int i5 = i4 % 2;
            f1858.put(frVar, frVar);
        } else {
            frVar = frVar2;
        }
        int i6 = f1855 + 79;
        f1856 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return frVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final fj m2073(List<dy> list) {
        int i = 2 % 2;
        int i2 = f1855 + 39;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        this.f1860 = 0;
        m2059(list, m2065(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0)).intern(), m2065(1 - TextUtils.indexOf("", "", 0, 0), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Color.red(0)).intern());
        fj fjVarM2042 = m2042(list);
        int i4 = f1856 + 71;
        f1855 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return fjVarM2042;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr m2054(List<dy> list) {
        int i = 2 % 2;
        int i2 = f1855 + 27;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        String strM2099 = m2030(list).m2099();
        byte b = 9;
        switch (strM2099.hashCode()) {
            case -934396624:
                b = !strM2099.equals(m2065((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 54, (ViewConfiguration.getTouchSlop() >> 8) + 6, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 28998)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -567202649:
                b = !strM2099.equals(m2065(65 - View.getDefaultSize(0, 0), ImageFormat.getBitsPerPixel(0) + 9, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 59:
                b = !strM2099.equals(m2065((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, View.resolveSizeAndState(0, 0, 0) + 1, (char) (15542 - Color.green(0))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 123:
                if (!strM2099.equals(m2065(ExpandableListView.getPackedPositionType(0L), KeyEvent.getDeadChar(0, 0) + 1, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i4 = f1856 + 125;
                    f1855 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 7;
                }
                break;
            case 3357:
                b = !strM2099.equals(m2065(44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 101577:
                b = !strM2099.equals(m2065(46 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2 - TextUtils.lastIndexOf("", '0', 0), (char) (25719 - KeyEvent.getDeadChar(0, 0))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 115131:
                b = !strM2099.equals(m2065(73 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 3 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 21137)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 116519:
                if (strM2099.equals(m2065(76 - ExpandableListView.getPackedPositionGroup(0L), 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                    int i6 = f1855 + 27;
                    f1856 = i6 % 128;
                    if (i6 % 2 != 0) {
                        b = 42;
                    }
                } else {
                    b = -1;
                }
                break;
            case 94001407:
                if (!strM2099.equals(m2065(59 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), '5' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i7 = f1856 + 59;
                    f1855 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 5;
                }
                break;
            case 113101617:
                if (strM2099.equals(m2065(49 - Color.green(0), 5 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    int i9 = f1856 + 21;
                    f1855 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return m2064(new fo(null));
            case 1:
                return m2069(list);
            case 2:
                return m2061(list);
            case 3:
                return m2046(list);
            case 4:
                return m2045(list);
            case 5:
                return m2043(list);
            case 6:
                fr frVarM2039 = m2039(list);
                int i11 = f1856 + 75;
                f1855 = i11 % 128;
                int i12 = i11 % 2;
                return frVarM2039;
            case 7:
                return m2042(list);
            case 8:
                fr frVarM2044 = m2044(list);
                int i13 = f1855 + 49;
                f1856 = i13 % 128;
                int i14 = i13 % 2;
                return frVarM2044;
            case 9:
                return m2047(list);
            default:
                this.f1860--;
                ed edVarM2072 = m2072(list);
                m2062(list, m2065((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (char) (15590 - AndroidCharacter.getMirror('0'))).intern(), edVarM2072, m2065(TextUtils.indexOf("", "", 0) + 79, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, (char) (TextUtils.getTrimmedLength("") + 21932)).intern());
                return m2064(new fo(edVarM2072));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x00d7  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr m2069(List<dy> list) {
        fr frVarM2054;
        int i = 2 % 2;
        m2059(list, m2065(110 - Color.argb(0, 0, 0, 0), '1' - AndroidCharacter.getMirror('0'), (char) (4186 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), m2065(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + InterfaceC0280i1.d.b.j, (-16777176) - Color.rgb(0, 0, 0), (char) Color.red(0)).intern());
        ed edVarM2072 = m2072(list);
        m2062(list, m2065(151 - View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') - '/', (char) (3659 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), edVarM2072, m2065(153 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        fr frVarM2055 = m2054(list);
        if (m2031(list)) {
            int i2 = f1855 + 95;
            f1856 = i2 % 128;
            int i3 = i2 % 2;
            if (m2032(list).m2100(m2065(Color.rgb(0, 0, 0) + 16777412, 4 - ExpandableListView.getPackedPositionType(0L), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 5366)).intern())) {
                this.f1860++;
                frVarM2054 = m2054(list);
                int i4 = f1855 + 87;
                f1856 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                frVarM2054 = null;
            }
        } else {
            frVarM2054 = null;
        }
        return m2064(new fs(edVarM2072, frVarM2055, frVarM2054));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr m2061(List<dy> list) {
        int i = 2 % 2;
        m2059(list, m2065((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + InterfaceC0280i1.d.b.g, -Process.getGidForName(""), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4186)).intern(), m2065(200 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 41 - ExpandableListView.getPackedPositionType(0L), (char) (23597 - Process.getGidForName(""))).intern());
        ed edVarM2068 = m2068(list, m2065(TextUtils.indexOf((CharSequence) "", '0', 0) + 44, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Color.green(0) + 15542)).intern());
        ed edVarM2072 = m2072(list);
        m2062(list, m2065(TextUtils.indexOf("", "") + 43, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (15542 - View.combineMeasuredStates(0, 0))).intern(), edVarM2072, m2065(240 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, (char) (TextUtils.getTrimmedLength("") + 51819)).intern());
        fr frVarM2064 = m2064(new fq(edVarM2068, edVarM2072, m2068(list, m2065(150 - ExpandableListView.getPackedPositionChild(0L), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3658)).intern()), m2054(list)));
        int i2 = f1855 + InterfaceC0280i1.d.b.i;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed m2068(List<dy> list, String str) {
        int i = 2 % 2;
        int i2 = f1856 + 1;
        f1855 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m2032(list).m2100(str)) {
                return null;
            }
            ed edVarM2072 = m2072(list);
            m2062(list, str, edVarM2072, new StringBuilder().append(m2065(274 - Gravity.getAbsoluteGravity(0, 0), 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 16671)).intern()).append(str).toString());
            int i3 = f1856 + 77;
            f1855 = i3 % 128;
            int i4 = i3 % 2;
            return edVarM2072;
        }
        m2032(list).m2100(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private fr m2046(List<dy> list) {
        int i = 2 % 2;
        m2059(list, m2065(110 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - KeyEvent.keyCodeFromString(""), (char) (Color.red(0) + 4187)).intern(), m2065(311 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39307)).intern());
        ed edVarM2072 = m2072(list);
        m2059(list, m2065(151 - TextUtils.indexOf("", "", 0, 0), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 3659)).intern(), m2065(TextUtils.indexOf("", "") + 353, 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.indexOf("", "", 0, 0) + 61803)).intern());
        fr frVarM2064 = m2064(new fu(edVarM2072, m2054(list)));
        int i2 = f1855 + 31;
        f1856 = i2 % 128;
        if (i2 % 2 == 0) {
            return frVarM2064;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private fr m2044(List<dy> list) {
        int i = 2 % 2;
        m2059(list, m2065((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 1, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), m2065(400 - TextUtils.getOffsetBefore("", 0), 44 - (KeyEvent.getMaxKeyCode() >> 16), (char) (48327 - Drawable.resolveOpacity(0, 0))).intern());
        fj fjVarM2042 = m2042(list);
        m2059(list, m2065(KeyEvent.getDeadChar(0, 0) + 444, View.resolveSize(0, 0) + 5, (char) (MotionEvent.axisFromString("") + 20375)).intern(), m2065(450 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 52, (char) TextUtils.getTrimmedLength("")).intern());
        m2059(list, m2065(TextUtils.lastIndexOf("", '0', 0, 0) + InterfaceC0280i1.d.b.i, 1 - View.resolveSizeAndState(0, 0, 0), (char) (4186 - ExpandableListView.getPackedPositionChild(0L))).intern(), m2065((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, 41 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern());
        dy dyVarM2030 = m2030(list);
        m2071(dyVarM2030, dy.c.f1909, fjVarM2042, m2065(View.MeasureSpec.makeMeasureSpec(0, 0) + 543, (ViewConfiguration.getEdgeSlop() >> 16) + 27, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        en enVar = (en) m2063(new en(dyVarM2030.m2099(), dn.m1990(this.f1859, dyVarM2030.m2097())));
        m2059(list, m2065(TextUtils.indexOf("", "", 0, 0) + 151, -TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 3659)).intern(), m2065(569 - TextUtils.lastIndexOf("", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, (char) (6491 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern());
        m2059(list, m2065(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 1, (char) ('0' - AndroidCharacter.getMirror('0'))).intern(), m2065(609 - TextUtils.indexOf("", "", 0), 45 - TextUtils.lastIndexOf("", '0'), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern());
        fr frVarM2064 = m2064(new ft(fjVarM2042, m2042(list), enVar));
        int i2 = f1856 + 125;
        f1855 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private fr m2047(List<dy> list) {
        int i = 2 % 2;
        fr frVarM2064 = m2064(new fx(m2050(list, m2065((ViewConfiguration.getLongPressTimeout() >> 16) + 43, Color.rgb(0, 0, 0) + 16777217, (char) (KeyEvent.normalizeMetaState(0) + 15542)).intern(), new a<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.4

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1869 = 1;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1870 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f1871 = 51793;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f1872 = 35449;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1873 = 61958;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f1874 = 61089;

            @Override // com.ironsource.adqualitysdk.sdk.i.dt.a
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ ed mo2074(List list2) {
                int i2 = 2 % 2;
                int i3 = f1870 + 87;
                f1869 = i3 % 128;
                int i4 = i3 % 2;
                ed edVarM2078 = m2078(list2);
                int i5 = f1869 + 119;
                f1870 = i5 % 128;
                if (i5 % 2 == 0) {
                    return edVarM2078;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private ed m2078(List<dy> list2) {
                int i2 = 2 % 2;
                ed edVarM2072 = dt.this.m2072(list2);
                Object obj = null;
                if (!(edVarM2072 instanceof en)) {
                    int i3 = f1870 + 25;
                    f1869 = i3 % 128;
                    int i4 = i3 % 2;
                    if (!(edVarM2072 instanceof dz)) {
                        dt.m2070(dt.this, new StringBuilder().append(m2077("놉믔\ue17a哬ᙸ⊫탸⌙덁恖㓖냫밉輎픇㌡揰綸矑뢉⽧\uf4ae䔴䂲䙃ƚ緤콑탸⌙\ud9e9㪸", KeyEvent.keyCodeFromString("") + 31).intern()).append(edVarM2072).toString());
                        return null;
                    }
                }
                int i5 = f1870 + 69;
                f1869 = i5 % 128;
                if (i5 % 2 != 0) {
                    return edVarM2072;
                }
                super.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2077(String str, int i2) {
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
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f1874)) ^ ((c2 >>> 5) + f1871)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1872) ^ ((c3 + i3) ^ ((c3 << 4) + f1873))));
                            i3 -= 40503;
                        }
                        cArr2[k.f2951] = cArr3[0];
                        cArr2[k.f2951 + 1] = cArr3[1];
                        k.f2951 += 2;
                    }
                    str2 = new String(cArr2, 0, i2);
                }
                return str2;
            }
        })));
        int i2 = f1855 + 83;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private fr m2045(List<dy> list) {
        fr frVarM2064;
        int i = 2 % 2;
        int i2 = f1855 + 99;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        if (m2032(list).m2100(m2065(43 - (ViewConfiguration.getTouchSlop() >> 8), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 15542)).intern())) {
            frVarM2064 = m2064(new fp(null));
        } else {
            fr frVarM2065 = m2064(new fp(m2072(list)));
            int i4 = f1855 + 55;
            f1856 = i4 % 128;
            int i5 = i4 % 2;
            frVarM2064 = frVarM2065;
        }
        m2062(list, m2065(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, -Process.getGidForName(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15541)).intern(), frVarM2064, m2065(ExpandableListView.getPackedPositionChild(0L) + 656, (ViewConfiguration.getScrollBarSize() >> 8) + 36, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16596)).intern());
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private fr m2043(List<dy> list) {
        int i = 2 % 2;
        m2059(list, m2065((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (15542 - Color.blue(0))).intern(), m2065(TextUtils.lastIndexOf("", '0', 0, 0) + 692, (KeyEvent.getMaxKeyCode() >> 16) + 35, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 63517)).intern());
        fr frVarM2064 = m2064(new fm());
        int i2 = f1855 + 33;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private fr m2039(List<dy> list) {
        int i = 2 % 2;
        m2059(list, m2065((ViewConfiguration.getLongPressTimeout() >> 16) + 43, TextUtils.getTrimmedLength("") + 1, (char) (15542 - Drawable.resolveOpacity(0, 0))).intern(), m2065(Drawable.resolveOpacity(0, 0) + 726, 38 - TextUtils.getOffsetBefore("", 0), (char) (KeyEvent.getDeadChar(0, 0) + 16092)).intern());
        fr frVarM2064 = m2064(new fk());
        int i2 = f1856 + 25;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        return frVarM2064;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private fj m2042(List<dy> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        dy dyVarM2032 = m2032(list);
        while (!dyVarM2032.m2100(m2065(764 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getEdgeSlop() >> 16) + 1, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
            int i2 = f1856 + 45;
            f1855 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(m2054(list));
            dyVarM2032 = m2032(list);
        }
        this.f1860++;
        fj fjVar = (fj) m2064(new fj(arrayList));
        int i4 = f1855 + 21;
        f1856 = i4 % 128;
        if (i4 % 2 == 0) {
            return fjVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ed m2072(List<dy> list) {
        ed edVarM2063;
        int i;
        int i2 = 2 % 2;
        ed edVarM2041 = m2041(list);
        if (!m2031(list)) {
            return edVarM2041;
        }
        dn dnVarM1990 = dn.m1990(this.f1859, edVarM2041.m2118());
        String strM2099 = m2030(list).m2099();
        int iHashCode = strM2099.hashCode();
        byte b = -1;
        if (iHashCode != 1216) {
            if (iHashCode == 3968 && strM2099.equals(m2065(766 - Process.getGidForName(""), TextUtils.lastIndexOf("", '0', 0, 0) + 3, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                int i3 = f1855 + 105;
                f1856 = i3 % 128;
                int i4 = i3 % 2;
                b = 1;
            }
        } else if (strM2099.equals(m2065((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 765, Color.argb(0, 0, 0, 0) + 2, (char) (Color.argb(0, 0, 0, 0) + 55426)).intern())) {
            int i5 = f1856 + 63;
            f1855 = i5 % 128;
            int i6 = i5 % 2;
            b = 0;
        }
        if (b == 0) {
            edVarM2063 = m2063(new eo(edVarM2041, m2072(list), dnVarM1990));
            i = f1856 + 91;
        } else {
            if (b != 1) {
                this.f1860--;
                return edVarM2041;
            }
            edVarM2063 = m2063(new fb(edVarM2041, m2072(list), dnVarM1990));
            i = f1856 + 47;
        }
        f1855 = i % 128;
        int i7 = i % 2;
        return edVarM2063;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ed m2041(List<dy> list) {
        ed edVarM2038;
        int i = 2 % 2;
        int i2 = f1855 + 25;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            edVarM2038 = m2038(list);
            int i3 = 37 / 0;
            if (!m2031(list)) {
                return edVarM2038;
            }
        } else {
            edVarM2038 = m2038(list);
            if (!m2031(list)) {
                return edVarM2038;
            }
        }
        dn dnVarM1990 = dn.m1990(this.f1859, edVarM2038.m2118());
        String strM2099 = m2030(list).m2099();
        int iHashCode = strM2099.hashCode();
        byte b = -1;
        if (iHashCode != 60) {
            if (iHashCode != 62) {
                if (iHashCode != 1084) {
                    if (iHashCode != 1921) {
                        if (iHashCode != 1952) {
                            if (iHashCode == 1983 && strM2099.equals(m2065((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 777, 2 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern())) {
                                b = 5;
                            }
                        } else if (strM2099.equals(m2065(View.resolveSizeAndState(0, 0, 0) + 769, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                            b = 0;
                        }
                    } else if (strM2099.equals(m2065(TextUtils.getTrimmedLength("") + 775, 2 - View.combineMeasuredStates(0, 0), (char) TextUtils.getOffsetAfter("", 0)).intern())) {
                        b = 4;
                    }
                } else if (!(!strM2099.equals(m2065(TextUtils.lastIndexOf("", '0') + 772, TextUtils.indexOf((CharSequence) "", '0', 0) + 3, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 18046)).intern()))) {
                    int i4 = f1855 + 71;
                    f1856 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 1;
                }
            } else if (!(!strM2099.equals(m2065(774 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - Color.alpha(0), (char) View.resolveSize(0, 0)).intern()))) {
                b = 3;
            }
        } else if (strM2099.equals(m2065((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 773, 1 - (ViewConfiguration.getTapTimeout() >> 16), (char) (148 - TextUtils.lastIndexOf("", '0', 0))).intern())) {
            int i6 = f1855 + 113;
            f1856 = i6 % 128;
            int i7 = i6 % 2;
            b = 2;
        }
        if (b == 0) {
            ed edVarM2063 = m2063(new eq(edVarM2038, m2041(list), dnVarM1990));
            int i8 = f1856 + 117;
            f1855 = i8 % 128;
            if (i8 % 2 != 0) {
                return edVarM2063;
            }
            throw null;
        }
        if (b == 1) {
            return m2063(new fa(edVarM2038, m2041(list), dnVarM1990));
        }
        if (b == 2) {
            return m2063(new ey(edVarM2038, m2041(list), dnVarM1990));
        }
        if (b != 3) {
            if (b == 4) {
                return m2063(new eu(edVarM2038, m2041(list), dnVarM1990));
            }
            if (b == 5) {
                return m2063(new es(edVarM2038, m2041(list), dnVarM1990));
            }
            this.f1860--;
            return edVarM2038;
        }
        ed edVarM2064 = m2063(new ep(edVarM2038, m2041(list), dnVarM1990));
        int i9 = f1856 + 71;
        f1855 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 44 / 0;
        }
        return edVarM2064;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b A[PHI: r3 r13
      0x006b: PHI (r3v10 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v5 com.ironsource.adqualitysdk.sdk.i.dn), (r3v12 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:16:0x0067, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r13v6 java.lang.String) = (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:16:0x0067, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090 A[PHI: r3 r13
      0x0090: PHI (r3v8 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v5 com.ironsource.adqualitysdk.sdk.i.dn), (r3v12 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:15:0x0065, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:15:0x0065, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7 A[PHI: r3 r13
      0x00b7: PHI (r3v7 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v5 com.ironsource.adqualitysdk.sdk.i.dn), (r3v12 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:14:0x0063, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:14:0x0063, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f1 A[PHI: r3 r13
      0x00f1: PHI (r3v6 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v5 com.ironsource.adqualitysdk.sdk.i.dn), (r3v12 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:13:0x0061, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:13:0x0061, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0113  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private ed m2038(List<dy> list) {
        dn dnVarM1990;
        String strM2099;
        int i = 2 % 2;
        ed edVarM2040 = m2040(list);
        if (!m2031(list)) {
            return edVarM2040;
        }
        int i2 = f1856 + 119;
        f1855 = i2 % 128;
        byte b = -1;
        if (i2 % 2 == 0) {
            dnVarM1990 = dn.m1990(this.f1859, edVarM2040.m2118());
            strM2099 = m2030(list).m2099();
            int iHashCode = strM2099.hashCode();
            int i3 = 27 / 0;
            if (iHashCode != 43) {
                if (iHashCode != 45) {
                    if (iHashCode != 1376) {
                        if (iHashCode == 1440) {
                            if (strM2099.equals(m2065(783 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 2, (char) (14385 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                                b = 3;
                            }
                        }
                    } else if (strM2099.equals(m2065(KeyEvent.getDeadChar(0, 0) + 781, 2 - TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38483)).intern())) {
                        b = 2;
                    }
                } else if (strM2099.equals(m2065(781 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 1, (char) (60965 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                    int i4 = f1855;
                    int i5 = i4 + 87;
                    f1856 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 53;
                    f1856 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 1;
                }
            } else if (strM2099.equals(m2065(779 - Drawable.resolveOpacity(0, 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.blue(0)).intern())) {
                b = 0;
            }
        } else {
            dnVarM1990 = dn.m1990(this.f1859, edVarM2040.m2118());
            strM2099 = m2030(list).m2099();
            int iHashCode2 = strM2099.hashCode();
            if (iHashCode2 != 43) {
                if (iHashCode2 != 45) {
                    if (iHashCode2 != 1376) {
                        if (iHashCode2 == 1440) {
                            if (strM2099.equals(m2065(783 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 2, (char) (14385 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                                b = 3;
                            }
                        }
                    } else if (strM2099.equals(m2065(KeyEvent.getDeadChar(0, 0) + 781, 2 - TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38483)).intern())) {
                        b = 2;
                    }
                } else if (strM2099.equals(m2065(781 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 1, (char) (60965 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                    int i9 = f1855;
                    int i10 = i9 + 87;
                    f1856 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 53;
                    f1856 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 1;
                }
            } else if (strM2099.equals(m2065(779 - Drawable.resolveOpacity(0, 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.blue(0)).intern())) {
                b = 0;
            }
        }
        if (b == 0) {
            return m2063(new fc(edVarM2040, m2038(list), dnVarM1990));
        }
        if (b == 1) {
            return m2063(new ew(edVarM2040, m2038(list), dnVarM1990));
        }
        if (b == 2) {
            return m2063(new ev((en) edVarM2040, dnVarM1990));
        }
        if (b == 3) {
            return m2063(new et((en) edVarM2040, dnVarM1990));
        }
        this.f1860--;
        return edVarM2040;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private ed m2040(List<dy> list) {
        byte b;
        int i = 2 % 2;
        ed edVarM2034 = m2034(list);
        if (!m2031(list)) {
            return edVarM2034;
        }
        int i2 = f1856 + 47;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        dn dnVarM1990 = dn.m1990(this.f1859, edVarM2034.m2118());
        String strM2099 = m2030(list).m2099();
        int iHashCode = strM2099.hashCode();
        if (iHashCode != 37) {
            b = 0;
            if (iHashCode != 42) {
                if (iHashCode == 47 && strM2099.equals(m2065(ExpandableListView.getPackedPositionGroup(0L) + 786, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 30562)).intern())) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (!strM2099.equals(m2065(785 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1 - ExpandableListView.getPackedPositionGroup(0L), (char) (4612 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                b = -1;
            } else {
                int i4 = f1856 + 77;
                f1855 = i4 % 128;
                if (i4 % 2 == 0) {
                    b = 1;
                }
            }
        } else if (strM2099.equals(m2065((ViewConfiguration.getWindowTouchSlop() >> 8) + 787, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern())) {
            b = 2;
        } else {
            b = -1;
        }
        if (b == 0) {
            return m2063(new fd(edVarM2034, m2040(list), dnVarM1990));
        }
        if (b != 1) {
            if (b == 2) {
                return m2063(new ex(edVarM2034, m2040(list), dnVarM1990));
            }
            this.f1860--;
            return edVarM2034;
        }
        ed edVarM2063 = m2063(new er(edVarM2034, m2040(list), dnVarM1990));
        int i5 = f1855 + 99;
        f1856 = i5 % 128;
        int i6 = i5 % 2;
        return edVarM2063;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private ed m2034(List<dy> list) {
        ed edVarM2033;
        byte b;
        int i = 2 % 2;
        int i2 = f1856 + 81;
        f1855 = i2 % 128;
        if (i2 % 2 == 0) {
            edVarM2033 = m2033(list);
            int i3 = 78 / 0;
        } else {
            edVarM2033 = m2033(list);
        }
        while (m2031(list)) {
            String strM2099 = m2030(list).m2099();
            int iHashCode = strM2099.hashCode();
            if (iHashCode != 46) {
                if (iHashCode == 91 && strM2099.equals(m2065(TextUtils.indexOf("", "") + 789, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.argb(0, 0, 0, 0)).intern())) {
                    int i4 = f1855;
                    int i5 = i4 + 21;
                    f1856 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 49;
                    f1856 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strM2099.equals(m2065(788 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.blue(0)).intern())) {
                int i9 = f1855 + 25;
                f1856 = i9 % 128;
                int i10 = i9 % 2;
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                edVarM2033 = m2067(edVarM2033, list);
                int i11 = f1856 + InterfaceC0280i1.d.b.b;
                f1855 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                if (b != 1) {
                    this.f1860--;
                    return edVarM2033;
                }
                edVarM2033 = m2049(edVarM2033, list);
            }
        }
        return edVarM2033;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:91:0x024e  */
    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private ed m2033(List<dy> list) {
        ed edVar;
        byte b;
        byte b2;
        int i = 2 % 2;
        try {
            dy dyVarM2030 = m2030(list);
            dn dnVarM1990 = dn.m1990(this.f1859, dyVarM2030.m2097());
            try {
                if (!dyVarM2030.m2088()) {
                    edVar = null;
                    if (dyVarM2030.m2098()) {
                        int i2 = f1855 + 21;
                        f1856 = i2 % 128;
                        if (i2 % 2 == 0) {
                            return m2052(dyVarM2030);
                        }
                        m2052(dyVarM2030);
                        super.hashCode();
                        throw null;
                    }
                    if (dyVarM2030.m2094()) {
                        return m2063(new dw(dyVarM2030.m2099(), dnVarM1990));
                    }
                    if (dyVarM2030.m2089()) {
                        int i3 = f1856 + 19;
                        f1855 = i3 % 128;
                        if (i3 % 2 != 0) {
                            return m2053(dyVarM2030, list);
                        }
                        int i4 = 70 / 0;
                        return m2053(dyVarM2030, list);
                    }
                    if (!dyVarM2030.m2091()) {
                        m2051(new StringBuilder().append(m2065(832 - TextUtils.getTrimmedLength(""), Process.getGidForName("") + 18, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()).append(dyVarM2030).toString());
                        return edVar;
                    }
                    String strM2099 = dyVarM2030.m2099();
                    int iHashCode = strM2099.hashCode();
                    if (iHashCode != 33) {
                        if (iHashCode != 40) {
                            if (iHashCode != 45) {
                                if (iHashCode != 91) {
                                    if (iHashCode == 123 && strM2099.equals(m2065(View.resolveSize(0, 0), 1 - (Process.myPid() >> 22), (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                                        b = 2;
                                    }
                                } else if (strM2099.equals(m2065(788 - MotionEvent.axisFromString(""), -Process.getGidForName(""), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                                    b = 1;
                                }
                                b = -1;
                            } else if (!strM2099.equals(m2065((-16776436) - Color.rgb(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 60966)).intern())) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                        } else if (strM2099.equals(m2065(TextUtils.lastIndexOf("", '0', 0, 0) + InterfaceC0280i1.d.b.i, Color.rgb(0, 0, 0) + 16777217, (char) (View.resolveSizeAndState(0, 0, 0) + 4187)).intern())) {
                            int i5 = f1855 + 115;
                            f1856 = i5 % 128;
                            int i6 = i5 % 2;
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strM2099.equals(m2065((ViewConfiguration.getScrollBarSize() >> 8) + 791, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37251)).intern())) {
                        int i7 = f1855 + 77;
                        f1856 = i7 % 128;
                        if (i7 % 2 != 0) {
                            b = 2;
                        } else {
                            b = 3;
                        }
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        ed edVarM2063 = m2063(new eg(m2072(list), dnVarM1990));
                        m2062(list, m2065(TextUtils.indexOf((CharSequence) "", '0', 0) + 152, 1 - Color.green(0), (char) (Color.green(0) + 3659)).intern(), edVarM2063, m2065(792 - (Process.myPid() >> 22), 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                        return edVarM2063;
                    }
                    if (b == 1) {
                        return m2063(new dv(m2056(list, m2065(TextUtils.indexOf("", "") + 811, 1 - TextUtils.getOffsetAfter("", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()), dnVarM1990));
                    }
                    if (b == 2) {
                        return m2063(new ec(m2036(list), dnVarM1990));
                    }
                    if (b != 3) {
                        if (b == 4) {
                            return m2063(new ew(m2063(new ff(0, dnVarM1990)), m2033(list), dnVarM1990));
                        }
                        m2051(new StringBuilder().append(m2065((ViewConfiguration.getFadingEdgeLength() >> 16) + 812, 20 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-16763212) - Color.rgb(0, 0, 0))).intern()).append(dyVarM2030.m2099()).toString());
                        return null;
                    }
                    ed edVarM2064 = m2063(new ez(m2034(list), dnVarM1990));
                    int i8 = f1855 + 121;
                    f1856 = i8 % 128;
                    int i9 = i8 % 2;
                    return edVarM2064;
                }
                String strM20910 = dyVarM2030.m2099();
                String strM20911 = m2030(list).m2099();
                edVar = null;
                try {
                    int iHashCode2 = strM20911.hashCode();
                    if (iHashCode2 != 40) {
                        if (iHashCode2 == 61 && strM20911.equals(m2065(790 - View.MeasureSpec.getSize(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22)).intern())) {
                            int i10 = f1856 + 67;
                            f1855 = i10 % 128;
                            int i11 = i10 % 2;
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strM20911.equals(m2065(110 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (4187 - Color.argb(0, 0, 0, 0))).intern())) {
                        int i12 = f1855 + 1;
                        f1856 = i12 % 128;
                        int i13 = i12 % 2;
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        return m2063(new dz((en) m2063(new en(strM20910, dnVarM1990)), m2072(list), dnVarM1990));
                    }
                    if (b2 == 1) {
                        return m2063(new ea(strM20910, m2056(list, m2065(151 - (Process.myPid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 3659)).intern()), dnVarM1990));
                    }
                    this.f1860--;
                    return m2063(new en(strM20910, dnVarM1990));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            edVar = null;
        }
        m2058(m2065(AndroidCharacter.getMirror('0') + 801, 16 - ExpandableListView.getPackedPositionType(r5), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))).intern(), e);
        return edVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed m2052(dy dyVar) {
        int i = 2 % 2;
        int i2 = f1855 + 89;
        f1856 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            dn dnVarM1990 = dn.m1990(this.f1859, dyVar.m2097());
            if (dyVar.m2090()) {
                try {
                    try {
                        return m2063(new ff(Integer.valueOf(Integer.parseInt(dyVar.m2099())), dnVarM1990));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    return m2063(new fi(Long.valueOf(Long.parseLong(dyVar.m2099())), dnVarM1990));
                }
            } else {
                if (dyVar.m2093()) {
                    return m2063(new fg(Double.valueOf(Double.parseDouble(dyVar.m2099())), dnVarM1990));
                }
                if (dyVar.m2092()) {
                    ed edVarM2063 = m2063(new fh(Boolean.valueOf(Boolean.parseBoolean(dyVar.m2099())), dnVarM1990));
                    int i3 = f1855 + 27;
                    f1856 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return edVarM2063;
                    }
                    throw null;
                }
            }
            return m2063(new fl(dyVar.m2099(), dnVarM1990));
        }
        dn.m1990(this.f1859, dyVar.m2097());
        dyVar.m2090();
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed m2067(ed edVar, List<dy> list) {
        int i = 2 % 2;
        int i2 = f1856 + 7;
        f1855 = i2 % 128;
        List<ed> listM2037 = null;
        if (i2 % 2 == 0) {
            m2030(list).m2088();
            throw null;
        }
        dy dyVarM2030 = m2030(list);
        if (!dyVarM2030.m2088()) {
            m2058(new StringBuilder().append(m2065((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 865, 28 - TextUtils.getCapsMode("", 0, 0), (char) View.combineMeasuredStates(0, 0)).intern()).append(dyVarM2030).toString(), (Throwable) null);
        }
        String strM2099 = dyVarM2030.m2099();
        dy dyVarM2031 = m2030(list);
        if (dyVarM2031.m2100(m2065(772 - TextUtils.indexOf((CharSequence) "", '0', 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 149)).intern())) {
            int i3 = f1855 + 55;
            f1856 = i3 % 128;
            int i4 = i3 % 2;
            listM2037 = m2037(list);
            m2062(list, m2065(110 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4188)).intern(), listM2037, m2065((ViewConfiguration.getEdgeSlop() >> 16) + 893, TextUtils.getOffsetAfter("", 0) + 63, (char) (Color.rgb(0, 0, 0) + 16777216)).intern());
        } else if (!dyVarM2031.m2100(m2065(110 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) (4187 - View.getDefaultSize(0, 0))).intern())) {
            this.f1860--;
            ed edVarM2063 = m2063(new ee(edVar, strM2099, dn.m1990(strM2099, dyVarM2031.m2097())));
            int i5 = f1855 + 65;
            f1856 = i5 % 128;
            if (i5 % 2 == 0) {
                return edVarM2063;
            }
            throw null;
        }
        return m2063(new eb(edVar, strM2099, listM2037, m2056(list, m2065(AndroidCharacter.getMirror('0') + 'g', (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 3659)).intern()), dn.m1990(strM2099, dyVarM2031.m2097())));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed m2049(ed edVar, List<dy> list) {
        int i = 2 % 2;
        int i2 = f1856 + 77;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        ed edVarM2072 = m2072(list);
        m2062(list, m2065(Gravity.getAbsoluteGravity(0, 0) + 811, TextUtils.indexOf("", "", 0, 0) + 1, (char) View.resolveSize(0, 0)).intern(), edVarM2072, m2065(TextUtils.indexOf("", "", 0, 0) + 956, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, (char) Color.alpha(0)).intern());
        dy dyVarM2030 = m2030(list);
        dn dnVarM1990 = dn.m1990(this.f1859, dyVarM2030.m2097());
        if (dyVarM2030.m2100(m2065(790 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
            return m2063(new eh(edVar, edVarM2072, m2072(list), dnVarM1990));
        }
        this.f1860--;
        ed edVarM2063 = m2063(new ej(edVar, edVarM2072, dnVarM1990));
        int i4 = f1856 + 51;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
        return edVarM2063;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[PHI: r1
      0x0035: PHI (r1v18 java.lang.String) = (r1v4 java.lang.String), (r1v19 java.lang.String) binds: [B:10:0x0031, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[PHI: r1
      0x005a: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v19 java.lang.String) binds: [B:9:0x002f, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed m2053(dy dyVar, List<dy> list) {
        String strM2099;
        byte b;
        int i = 2 % 2;
        int i2 = f1855 + 55;
        f1856 = i2 % 128;
        if (i2 % 2 == 0) {
            strM2099 = dyVar.m2099();
            int iHashCode = strM2099.hashCode();
            if (iHashCode != 3392903) {
                if (iHashCode == 109801339) {
                    if (!(!strM2099.equals(m2065(View.resolveSizeAndState(0, 0, 0) + 995, 5 - View.resolveSizeAndState(0, 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()))) {
                        b = 1;
                    }
                }
                if (b == 0) {
                    return fn.m2157();
                }
                if (b != 1) {
                    return null;
                }
                m2062(list, m2065(787 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), dyVar, m2065(999 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 10569)).intern());
                return m2067(m2063(new en(m2065(995 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), dn.m1990(this.f1859, dyVar.m2097()))), list);
            }
            if (strM2099.equals(m2065(990 - ImageFormat.getBitsPerPixel(0), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                int i3 = f1856 + InterfaceC0280i1.d.b.g;
                int i4 = i3 % 128;
                f1855 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 31;
                f1856 = i6 % 128;
                int i7 = i6 % 2;
                b = 0;
            }
            if (b == 0) {
                return fn.m2157();
            }
            if (b != 1) {
                return null;
            }
            m2062(list, m2065(787 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), dyVar, m2065(999 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 10569)).intern());
            return m2067(m2063(new en(m2065(995 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), dn.m1990(this.f1859, dyVar.m2097()))), list);
        }
        strM2099 = dyVar.m2099();
        int iHashCode2 = strM2099.hashCode();
        int i8 = 35 / 0;
        if (iHashCode2 != 3392903) {
            if (iHashCode2 == 109801339) {
                if (!(!strM2099.equals(m2065(View.resolveSizeAndState(0, 0, 0) + 995, 5 - View.resolveSizeAndState(0, 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()))) {
                    b = 1;
                }
            }
            if (b == 0) {
                return fn.m2157();
            }
            if (b != 1) {
                return null;
            }
            m2062(list, m2065(787 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), dyVar, m2065(999 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 10569)).intern());
            return m2067(m2063(new en(m2065(995 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), dn.m1990(this.f1859, dyVar.m2097()))), list);
        }
        if (strM2099.equals(m2065(990 - ImageFormat.getBitsPerPixel(0), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
            int i9 = f1856 + InterfaceC0280i1.d.b.g;
            int i10 = i9 % 128;
            f1855 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 31;
            f1856 = i12 % 128;
            int i13 = i12 % 2;
            b = 0;
        }
        if (b == 0) {
            return fn.m2157();
        }
        if (b != 1) {
            return null;
        }
        m2062(list, m2065(787 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), dyVar, m2065(999 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 10569)).intern());
        return m2067(m2063(new en(m2065(995 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), dn.m1990(this.f1859, dyVar.m2097()))), list);
        b = -1;
        if (b == 0) {
            return fn.m2157();
        }
        if (b != 1) {
            return null;
        }
        m2062(list, m2065(787 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), dyVar, m2065(999 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 10569)).intern());
        return m2067(m2063(new en(m2065(995 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), dn.m1990(this.f1859, dyVar.m2097()))), list);
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private Map<String, ed> m2036(List<dy> list) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f1856 + 23;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        for (Pair pair : m2050(list, m2065(764 - (ViewConfiguration.getTouchSlop() >> 8), 1 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new a<Pair<String, ed>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.dt.a
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ Pair<String, ed> mo2074(List list2) {
                return dt.m2048(dt.this, list2);
            }
        })) {
            int i4 = f1856 + 69;
            f1855 = i4 % 128;
            int i5 = i4 % 2;
            map.put(pair.first, pair.second);
        }
        int i6 = f1856 + 45;
        f1855 = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private Pair<String, ed> m2035(List<dy> list) {
        int i = 2 % 2;
        int i2 = f1856 + 69;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        dy dyVarM2030 = m2030(list);
        if (!dyVarM2030.m2095()) {
            m2058(new StringBuilder().append(m2065(1047 - (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42529)).intern()).append(dyVarM2030).toString(), (Throwable) null);
        }
        String strM2099 = dyVarM2030.m2099();
        m2062(list, m2065(1071 - TextUtils.indexOf("", "", 0, 0), View.resolveSize(0, 0) + 1, (char) KeyEvent.normalizeMetaState(0)).intern(), strM2099, m2065(1072 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 48 - (ViewConfiguration.getTapTimeout() >> 16), (char) (23714 - ExpandableListView.getPackedPositionGroup(0L))).intern());
        Pair<String, ed> pair = new Pair<>(strM2099, m2072(list));
        int i4 = f1856 + 113;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private List<ed> m2037(List<dy> list) {
        int i = 2 % 2;
        List<ed> listM2050 = m2050(list, m2065(774 - Color.green(0), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) View.MeasureSpec.getSize(0)).intern(), new a<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.2

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f1863 = 5;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f1864 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'l', 'a', 's', '/', 'v', 'r', 'b', 'u', 'i', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1865 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1866;

            @Override // com.ironsource.adqualitysdk.sdk.i.dt.a
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ ed mo2074(List list2) {
                int i2 = 2 % 2;
                int i3 = f1866 + 97;
                f1865 = i3 % 128;
                int i4 = i3 % 2;
                ed edVarM2075 = m2075(list2);
                int i5 = f1866 + 83;
                f1865 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 35 / 0;
                }
                return edVarM2075;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private ed m2075(List<dy> list2) {
                int i2 = 2 % 2;
                int i3 = f1865 + 37;
                f1866 = i3 % 128;
                if (i3 % 2 == 0) {
                    ed edVarM2060 = dt.m2060(dt.this, list2);
                    if ((edVarM2060 instanceof dw) || (edVarM2060 instanceof en)) {
                        int i4 = f1865 + 27;
                        f1866 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 24 / 0;
                        }
                        return edVarM2060;
                    }
                    dt.m2070(dt.this, new StringBuilder().append(m2076("\u0001\u0002\u0003\u0004\u0000\t\u0001\b\t\u0002\t\u0005\u0094\u0094\f\r\b\u000e\t\f\u0014\n\b\f\u0004\u0000\u0001\u0012\r\u0002\u0007\b", (byte) (32 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 33).intern()).append(edVarM2060).toString());
                    return null;
                }
                boolean z = dt.m2060(dt.this, list2) instanceof dw;
                throw null;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m2076(String str, byte b, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2043) {
                    char[] cArr2 = f1864;
                    char c = f1863;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b);
                    }
                    if (i2 > 1) {
                        f.f2047 = 0;
                        while (f.f2047 < i2) {
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
                                    int i3 = (f.f2046 * c) + f.f2042;
                                    int i4 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i3];
                                    cArr3[f.f2047 + 1] = cArr2[i4];
                                } else if (f.f2046 == f.f2044) {
                                    f.f2042 = ((f.f2042 + c) - 1) % c;
                                    f.f2041 = ((f.f2041 + c) - 1) % c;
                                    int i5 = (f.f2046 * c) + f.f2042;
                                    int i6 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i5];
                                    cArr3[f.f2047 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (f.f2046 * c) + f.f2041;
                                    int i8 = (f.f2044 * c) + f.f2042;
                                    cArr3[f.f2047] = cArr2[i7];
                                    cArr3[f.f2047 + 1] = cArr2[i8];
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
        int i2 = f1855 + 13;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return listM2050;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ed> m2056(List<dy> list, String str) {
        int i = 2 % 2;
        List<ed> listM2050 = m2050(list, str, new a<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dt.a
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ ed mo2074(List list2) {
                return dt.this.m2072((List<dy>) list2);
            }
        });
        int i2 = f1855 + 97;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return listM2050;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private <T> List<T> m2050(List<dy> list, String str, a<T> aVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (!m2030(list).m2100(str)) {
            int i2 = f1855 + 91;
            f1856 = i2 % 128;
            int i3 = i2 % 2;
            this.f1860--;
            arrayList.add(aVar.mo2074(list));
            dy dyVarM2030 = m2030(list);
            while (dyVarM2030.m2100(m2065(ExpandableListView.getPackedPositionGroup(0L) + 1120, 1 - Color.blue(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                arrayList.add(aVar.mo2074(list));
                dyVarM2030 = m2030(list);
            }
            m2057(dyVarM2030, str, arrayList, new StringBuilder().append(m2065((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1121, 21 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()).append(str).append(m2065(((Process.getThreadPriority(0) + 20) >> 6) + 1143, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).toString());
            int i4 = f1855 + 91;
            f1856 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f1856 + 35;
        f1855 = i6 % 128;
        if (i6 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private boolean m2031(List<dy> list) {
        int i = 2 % 2;
        if (this.f1860 < list.size()) {
            int i2 = f1855 + 85;
            f1856 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1855 + 27;
        f1856 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (m2031(r7) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r0 = r6.f1860;
        r6.f1860 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        m2058(m2065(1144 - android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6)).intern(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.dt.f1855 + 123;
        com.ironsource.adqualitysdk.sdk.i.dt.f1856 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (m2031(r7) != false) goto L15;
     */
    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private dy m2030(List<dy> list) {
        int i = 2 % 2;
        int i2 = f1856 + 27;
        f1855 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
        } catch (Exception e) {
            m2058(m2065(1168 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), e);
        }
        int i4 = f1855 + 23;
        f1856 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private dy m2032(List<dy> list) {
        int i = 2 % 2;
        int i2 = f1855 + 49;
        f1856 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                m2031(list);
                super.hashCode();
                throw null;
            }
            if (m2031(list)) {
                dy dyVar = list.get(this.f1860);
                int i3 = f1855 + 61;
                f1856 = i3 % 128;
                if (i3 % 2 == 0) {
                    return dyVar;
                }
                super.hashCode();
                throw null;
            }
            return null;
        } catch (Exception e) {
            m2058(m2065(1202 - (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), e);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2059(List<dy> list, String str, String str2) {
        int i = 2 % 2;
        int i2 = f1856 + 107;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        m2062(list, str, null, str2);
        int i4 = f1855 + 9;
        f1856 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2062(List<dy> list, String str, Object obj, String str2) {
        int i = 2 % 2;
        int i2 = f1856 + 9;
        f1855 = i2 % 128;
        int i3 = i2 % 2;
        m2057(m2030(list), str, obj, str2);
        int i4 = f1856 + 105;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2057(dy dyVar, String str, Object obj, String str2) {
        int i = 2 % 2;
        int i2 = f1855 + 37;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            dyVar.m2100(str);
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (!dyVar.m2100(str)) {
            m2051(m2055(new StringBuilder().append(m2065(1142 - TextUtils.indexOf((CharSequence) "", '0', 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()).append(str).append(m2065(1143 - Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) TextUtils.getOffsetBefore("", 0)).intern()).toString(), new StringBuilder().append(m2065(1143 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1 - Color.red(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()).append(dyVar.m2099()).append(m2065(1143 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, (char) TextUtils.getOffsetBefore("", 0)).intern()).toString(), obj, str2));
        }
        int i3 = f1856 + 83;
        f1855 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2071(dy dyVar, dy.c cVar, Object obj, String str) {
        int i = 2 % 2;
        int i2 = f1855 + 91;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        if (dyVar.m2096().equals(cVar)) {
            return;
        }
        int i4 = f1856 + 27;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
        m2051(m2055(cVar.toString(), dyVar.m2096().toString(), obj, str));
        if (i5 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2055(String str, String str2, Object obj, String str3) {
        String string;
        int i = 2 % 2;
        int i2 = f1855 + 85;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
            if (obj != null) {
                string = new StringBuilder().append(m2065(TextUtils.getOffsetAfter("", 0) + 1239, (Process.myTid() >> 22) + 7, (char) ((Process.myTid() >> 22) + 20485)).intern()).append(obj).toString();
            } else {
                string = "";
            }
        } else if (obj != null) {
            string = new StringBuilder().append(m2065(TextUtils.getOffsetAfter("", 0) + 1239, (Process.myTid() >> 22) + 7, (char) ((Process.myTid() >> 22) + 20485)).intern()).append(obj).toString();
        } else {
            string = "";
        }
        String string2 = new StringBuilder().append(m2065((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1246, ExpandableListView.getPackedPositionType(0L) + 9, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern()).append(str).append(string).append(m2065(1254 - ExpandableListView.getPackedPositionChild(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) (2360 - TextUtils.indexOf((CharSequence) "", '0'))).intern()).append(str2).append(str3 != null ? new StringBuilder().append(m2065((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1269, 3 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()).append(str3).toString() : "").toString();
        int i4 = f1856 + 5;
        f1855 = i4 % 128;
        int i5 = i4 % 2;
        return string2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2051(String str) {
        int i = 2 % 2;
        int i2 = f1855 + 19;
        f1856 = i2 % 128;
        int i3 = i2 % 2;
        m2058(str, (Throwable) null);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2058(String str, Throwable th) {
        int i = 2 % 2;
        cn.m1575(new StringBuilder().append(m2065(1272 - View.MeasureSpec.getMode(0), (KeyEvent.getMaxKeyCode() >> 16) + 7, (char) (24828 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern()).append(this.f1861).append(m2065((ViewConfiguration.getScrollDefaultDelay() >> 16) + 786, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 30562)).intern()).append(this.f1859).toString(), str, th);
        throw new RuntimeException(m2065((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1279, 28 - TextUtils.getOffsetBefore("", 0), (char) (KeyEvent.keyCodeFromString("") + 5995)).intern(), th);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2065(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1854[b.f638 + i]) ^ (((long) b.f638) * f1853)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
