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
import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class db implements ck {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1672 = 1;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1673;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1674;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static long f1675;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final cy f1685 = new cy();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final dd f1686 = new dd();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final cr f1688 = new cr();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final da f1687 = new da();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final df f1684 = new df();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final de f1680 = new de();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final cz f1683 = new cz();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final ct f1682 = new ct();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final cs f1681 = new cs();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final cw f1679 = new cw();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private final dc f1676 = new dc();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private final cu f1677 = new cu();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final cv f1678 = new cv();

    static {
        char[] cArr = new char[IronSourceError.ERROR_LEGACY_INIT_POST_FAILED];
        ByteBuffer.wrap("\u0000ckô×FB¨®&\u001at\u0085ÍñS\\\u009dÈ\u001d4z\u009fÛ\u000b-vºâ\tÈ\u0006£\u0091\u001f#\u008aÍfCÒ\u0011M¨96\u0094ò\u0000tü\u0001W©ÃB¾Î\u0004\u0004o\u009dÓ!Fñªz\u001e\u0016\u0081³õ;XÕÌd0'\u009b¹\u000fHrÒ\u0000skþ×BB\u0092®\u0019\u001au\u0085ÐñX\\¶È\u00074D\u009fÚ\u000b+v±\u0000gkþ×BB\u0090®\b\u001aP\u0085Çñ_\\\u008eÈ\u001a4k\u009fÞ\u000b\u0002v\u00adâ\u0015Nx¹ñ%(\u0090\u0092üèhjÓÞ?&ª\u0094\u0000ikè×`B¸®\t\u001ap\u0085ôñT\\«È\u001a4l\u009fÅ\u000b!\u0000gkþ×BB\u0087®\u0005\u001ab\u0085Õ\u0000gkþ×BB\u0092®\u0003\u001ai\u0085ÖñX\\¶È\u00074X\u009fÀ\u000b!v¨\u0000gkþ×BB\u0097®\u0005\u001ab\u0085ÎñY\u0012þygÅÛP\u000e¼\u009c\bû\u0097WãÀN2ó¢\u0098;$\u0087±R]Àé°v\u0014\u0002\u008c¯[;ßÇ®l\u0000øå\u0085U\u0011Ù½\u0084J\fÖþcF\u0000gkþ×BB\u0097®\u0005\u001au\u0085ÑñI\\\u009eÈ\u001a4k\u009fÅ\u000b v\u0088â\u0013Na¹Ø%\u001b\u0090\u0094üähzÓÞ?*Ã¸¨2\u0014\u0088\u0081kmÃÙ¹F?2\u008f\u009ff\u000bÄ÷±\\6Èúµb!ã\u008d»z\u0002æüSY??«µ\rÂf[ÚçO9£¬\u0017Ö\u0088oü÷Q\u0019\u0000gkþ×BB\u009c®\t\u001as\u0085ÊñR\\¼È\u0000\u0000cké×SB°®\u0018\u001ab\u0085ïñX\\¬È\u001b4a\u009fÍ\u000b\u0000vºâ\u001cNW¹Å%\"\u0090\u008aüåhyÓÅù`\u0092ù.E»\u0090W\u0002ãr|Ö\bN¥\u008c1\u0000Í{fÇò-\u008f¿ £K)÷\u0093bp\u008eØ:¢¥1Ñ\u0098|yèÁ\u0014\u00ad¿\u0001+ÀVzÂÜn\u0097\u0099\u0005\u0005â°JÜ%H¹ó\u0005T\f?\u0095\u0083)\u0016õúeN\u0006Ñ¬¥5\bÇÎM¥Ô\u0019h\u008c´`$ÔGKí?t\u0092\u0086\u0006*\u001c¼w%Ë\u0099^E²Õ\u0006¶\u0099\u001cí\u0085@wÔî(¼\u0083\u0017\u0017ój`\u0000gkþ×BB\u009e®\u000e\u001am\u0085Çñ^\\¬È%4o\u009fÅ\u000b1vº\u0012WyÎÅrP®¼>\b]\u0097÷ãnN\u009cÚ\u0005&W\u008dü\u0019\u0018d\u008bð9\u0000gkþ×BB\u009e®\u000e\u001am\u0085Çñ^\\¬È%4o\u009fÅ\u000b1vºâ\t\u0000vkþ×DB¢®\u0005\u001ah\u0085Ìñ~\\·È\u001e4~\u009fÈ\u000b6vº´éßpcÌö\u001e\u001a\u008e®å1\u007fEÇè$|\u0094\u0080î+@¿¹\u0000gkþ×BB\u0090®\u0000\u001ak\u0085ðñX\\¿È\u00164v\u009fä\u000b%v«â\u0019N}¹Õ%82}YäåXp\u008d\u009c\u001f(o·ËÃSn\u0090ú\f\u0006s\u00adÖ9&D\u0088Ð\u0001|{\u008bÉ\u00179\u008a³á2]«ÈQ$ß\u0090\u00ad\u000f;{\u0088ÖoBÙ¾¦\u0015\u0016\u0081íüvhÅÄ«39¯å\u001aNv2â¨Y\n\u0000dkþ×UB¾®\u0001\u001aw\u0085ÐñX\\«È\u00004I\u009fó\u000b-v¯â)Na¹Â%\"\u0090\u0088üæ\u001c]w×Ëm^\u008e²&\u0006\\\u0099Úíq@\u0087Ô (U\u0083Û\u0017\u0013j\u0092þ0RN¥à9\u0010\u008cª\u0000skþ×BB¤®\u001c\u001aA\u0085Ðñ\\\\µÈ\u00164B\u009fÀ\u000b7v«â\u001fN{¹Õ%9\u0000rkþ×[B¾®\u001a\u001ab\u0085äñO\\¹È\u001e4k\u009få\u000b-v¬â\u000eNp¹Þ%.\u0090\u0094\u0000rkþ×FB½®\r\u001ad\u0085Çñr\\¶È04b\u009fÀ\u000b'v´â6N|¹Ã%?\u0090\u0083üïhyÓÅ\u0000cké×SB°®\u0018\u001ab\u0085ôñT\\½È\u00044A\u009fÇ\u000b\u0007v³â\u0013Nv¹Û%\u0007\u0090\u008füòhhÓÒ?<ª\u0088\u0016úúÝ\u0091Q-é¸\u0012T¢àË\u007fh\u000bÝ¦\u00192\u0088ÎÎesñ\u0088\u008c\u0018\u0018\u0099´ÓClß\u0090j,\u0006@\u0092Ö)jí\r\u0086\u0087:=¯ÞCv÷\fh\u009a\u001c:±Ó%jÙ/r©æ~\u009bÞ\u000fa£\u0018T¶Èi}á\u0011\u009c\u0085\u0006>¼ÒRGæû\u0094æy\u008dà1\\¤\u0080H\u001cüZcÐ\u0017Jº¥.\u0006Ò\\yÞí)\u0090µ\u0004\u0001¨e_ËÃ'»\u00adÐ4l\u0088ùT\u0015È¡\u0099>\u0007J\u0082çqsÑ\u008f\u0088$\n°ýÍaYÕõ±\u0002\u001f\u009eóÅ\u009d®\u0017\u0012\u00ad\u0087Nkæß\u009c@\u00114¦\u0099B\räñ\u0091Z\u0007ÎÖ³@'ý\u008b\u008e|<àúUv9/\u00ad\u0090\u0016,úÜorÓ\u0004G¸($\u009cë\u0001cõ\u0002Y Â^¶ð\u001b`\u008f\u001a\u0000cké×SB°®\u0018\u001ab\u0085ïñX\\¼È\u001a4o\u009fù\u000b(v¾â\u0003Np¹Â%\u0004\u0090\u0088üÈhrÓÑ?=ª¡\u0016á\u0082PíÊY<Ä\u009a0ê\u009cX\u0000cké×SB°®\u0018\u001ab\u0085ïñX\\¼È\u001a4o\u009fù\u000b(v¾â\u0003Np¹Â%\u0004\u0090\u0088üÂhsÓÚ?\"ª\u0081\u0016í\u0082Wí×Y6Ä\u009a0Ã\u009cC\u0007¶s\u0014Þ\u009eJø¶T!¾Ö ½ª\u0001\u0010\u0094óx[Ì!S¬'\u001b\u008aÿ\u001eYâ,IºÝk ý4@\u00983o\u0081óGFË*\u0091¾:\u0005\u0091éz|íÀ¤T\r;\u008d\u008fv\u0012Òæ¸J\fÑÊ¥J\bË\u009c¡`\u0017÷á[A/3\u0000cké×SB°®\u0018\u001ab\u0085íñS\\\u0094È\u00124w\u009fÆ\u000b1v«â9N}¹Ñ%%\u0090\u0081üähPÓÞ?!ª\u0099\u0016í\u0082MíÛY+\u0000cké×SB°®\u0018\u001ab\u0085íñS\\\u0099È\u00074z\u009fÈ\u000b'v·â)Na¹Ñ%?\u0090\u0083üÂhtÓÖ?<ª\u008a\u0016í\u0082oí×Y*Ä\u00800ê\u009cD\u0007 s\u0012ë\u0007\u0080\u008b<3©ÈExñ\u0011n²\u001a\u0007·Ã#Uß\u001et¹àZ\u009dé\t`¥\rRµÎR{ö\u0017\u0080\u0083\f8\u008eÔNAëý\u0089i3\u0006¥²I/ó¾\u0082Õ\u000ei¶üM\u0010ý¤\u0094;7O\u0082âFvÎ\u008a\u009b!=µÝÈN\\Úð\u0097\u0007%\u009bË.wB\u0003Ö\u0089m#\u0081î\u0014t¨\u000b<§S+çÇza\u008e\râð\u0089|5Ä ?L\u008føægE\u0013ð¾4*¼Öé}Oé¯\u0094<\u0000±¬ù[TÇ¦r(\u001ej\u008aí1AÝµH\u0001ôo`Ó\u0000rkþ×FB½®\r\u001ad\u0085Çñr\\¶È>4k\u009fÍ\u000b-v¾â9Nz¹Ý%;\u0090\u008aüähhÓÞ?=ª\u0083\u0016Ä\u0082JíÍY-Ä\u00910á\u009cO\u0007·\u0000gkþ×BB\u0095®\t\u001ad\u0085ÍñO\\¹È\u00074k\u009fÍ\u000b\u0007v¾â\u0016Ny¹Ò%*\u0090\u0085üê\u0000cké×SB°®\u0018\u001ab\u0085àñO\\·È\u00124j\u009fÊ\u000b%v¬â\u000eNG¹Õ%(\u0090\u0083üèhjÓÒ? ¯[ÄÑxkí\u0088\u0001 µZ*Î^Gó¬g\"\u009bE0å¤\u0019Ù\u0089M'á_Xb3ã\u008f|\u001a¾ö6ByÝÈ©Z\u0004º\u0090\fl|ÇòS=.»º\t\u0016gá÷})È\u009e¤þ0r\u008bÒg<ò\u0094Ñ2º¸\u0006\u0002\u0093á\u007fIË3T¤ \t\u008dë\u0019tå6N\u009dÚb§Â3B\u009f7h\u0095ô\u007fAÙ-µ¹?\u0000skþ×BB\u0086®\t\u001ae\u0085ôñT\\½È\u00044M\u009fÅ\u000b-vºâ\u0014NaÁ+ª¦\u0016\u001a\u0083ÞoQÛ=D¹0\r\u009dò\tDõ;^\u0094Ê_·ë#K\u008f(x\u0086äg\u0000gkþ×BB\u0086®\t\u001ae\u0085ôñT\\½È\u00044M\u009fÅ\u000b-vºâ\u0014NaI\u0080\"\u0019\u009e¥\u000baçîS\u0082Ì\u0006¸²\u0015M\u0081û}\u0084Ö+Bà?T«ô\u0007\u0097ð9lØ\u0000skþ×XBµ®)\u001au\u0085ÐñR\\ª\u0000skþ×XBµ®&\u001at\u0085ÍñS\\\u009dÈ\u00054k\u009fÇ\u000b0²¹Ù'e\u008aðL\u001cÂ¨º7\u0014C\u0091îEzÓ\u0086¦-\u0010¹òÄcPÇü¿Þ3µª\t\u0016\u009cÆpWÄ=[\u0098/\f\u0082ï\u0016Sê5A\u008f\u0000gkþ×BB\u0092®\u0003\u001ai\u0085ÖñX\\ È\u0007·ïÜv`Êõ\r\u0019\u008d\u00adâ2OÄi¯ð\u0013L\u0086\u0093j\u0003ÞzAØ5g\u0098¹\f\bðc[Ï\u0000gkþ×BB\u009d®\r\u001at\u0085Öñi\\·È\u00064m\u009fÁ\u000b\u0010v¶â\u0017Npäq\u008fè3T¦\u0084J\u000fþcaÆ\u0015N¸ ,\u0011ÐY{Üï&\u0092 \u0006\u001aªj]ÒÁ$\u0000cké×SB°®\u0018\u001ab\u0085áñO\\½È\u00124z\u009fÀ\u000b2vºâ3N{¹Ö%$\u0000cké×SB°®\u0018\u001ab\u0085ãñY\\®È\u00164|\u009fÝ\u000b-v¬â\u001fNg¹ù%%\u0090\u0080üîb\u0004\t\u008eµ4 ×Ì\u007fx\u0005ç\u0086\u0093(>ÚªuV\u001dý§iU\u0014Ý\u0080T,\u0016Û¤\u0000cké×SB°®\u0018\u001ab\u0085ïñX\\¼È\u001a4o\u009fÝ\u000b-v°â\u0014NQ¹Ñ%?\u0090\u0087Z 1¹\u008d\u0005\u0018ÅôO@+ß³«\u001f\u0006í\u0092Gn Å\u0081Qm\u0000gkþ×BB\u0097®\u0019\u001ak\u0085Îñn\\¼È\u00184X\u009fÌ\u000b6v¬â\u0013Nz¹Þ\u0000gkþ×BB\u0082®\u0003\u001ah\u0085ÏñQ\\¹È 4j\u009fÂ\u000b\u0012vºâ\bNf¹Ù%$\u0090\u0088\u0000gkþ×BB\u0090®\u000b\u001ab\u0085ÌñI\\\u008aÈ\u00164c\u009fÆ\u000b0vºâ9Nz¹Þ%-\u0090\u008füæ\u0000cké×SB°®\u0018\u001ab\u0085æñX\\¾È\u00124{\u009fÅ\u000b0v\u009aâ\fNp¹Þ%?\u0090¬üòhsÓÙ\u0000gkþ×BB\u0092®\u0003\u001ai\u0085ÌñX\\»È\u00074a\u009fÛ\u000b\u0012vºâ\bNf¹Ù%$\u0090\u0088\u0000lkô×QB\u0094®\u001a\u001ab\u0085ÌñI\u0000ikè×eBµ®\u0007\u001aN\u0085Ìñi\\½È\u00004z\u009fä\u000b+v»â\u001f\u0000gkþ×BB\u0090®\b\u001aS\u0085ÛñM\\½È74k\u009fÚ\u000b'v\u00adâ\u0013Ne¹Ä%\"\u0090\u0089üï\u0000gkþ×BB\u0092®\u0019\u001au\u0085ÐñX\\¶È\u00074M\u009fÆ\u000b*v±â\u001fNv¹Ä%$\u0090\u0094üÏh}ÓÚ?7\u009fâô{HÇÝ\u00171\u009c\u0085ð\u001aUnÝÃ3W\u0082«Ç\u0000E\u0094²é.}\u009aÑþ&Pº¼\u000f-ce÷ôLW\u0000ikè×uB¾®\u0002\u001aa\u0085ËñZ\\\u009eÈ\u001c4|\u009fÊ\u000b!v\u008câ\u001fN{¹Ô%\u000e\u0090\u0088üàh~ÓÛ?7ª\u0089D\u0006/\u009f\u0093#\u0006óêb^\bÁ¥µ5\u0018Þ\u008c\\p\u0000Û\u0081OH2Î¦^\n\fý¥aXÔæ¸¥,\u000b\u0097³{]îøR¹Æ'©\u00ad\u001d[\u0080ðt\u0080Ø?,\u0085G\u000eû¾nW\u0082ï6\u0083©$Ý©pKäÑ\u0018\u009f³+'ÍZL\u0000gkþ×BB\u0094®\u0014\u001aw\u0085ÇñO\\±È\u001e4k\u009fÇ\u000b0v\u009câ\u0015N{¹Ö%\"\u0090\u0081\u0000gkþ×BB\u0094®\u0014\u001aw\u0085ÇñO\\±È\u001e4k\u009fÇ\u000b0v\u008aâ\tNp¹Â%\u001f\u0090\u0089üêhyÓÙ\u0005\u0015n\u008cÒ0Gæ«f\u001f\u0005\u0080µô=YÃÍl1\u0019\u009aµ\u000eBsùçzK\u0006¼« M\u0095ç5\u0017^\u008eâ2wä\u009bd/\u0007°·Ä?iÁýn\u0001\u001bª·>@Cû×x{\u0004\u008c©\u0010O\u0000nkþ×A\u0000ckó×WB£\u0000aké×DB°®\u0015\u001aS\u0085ÛñM\\½\u0010Ó{EÇàR\b¾³\nÏ\u0095VáàL\u0017Ø\u0082$×\u008fa\u001b\u0090f\fò¢rÕ\u0019_¥å0\u0006Ü®hÔ÷F\u0083þ.\u0000º«FÙí}y\u009e\u0004\f\u0000rkî×XB\u009e®\u0002\u001aJ\u0085ÃñT\\¶È'4f\u009fÛ\u000b!v¾â\u001e\u0000pkô×EB¥®#\u001ai\u0085ïñ\\\\±È\u001d4Z\u009fÁ\u000b6vºâ\u001bNq\u0000pkô×EB¥®(\u001ab\u0085Îñ\\\\¡È\u00164j\u009fæ\u000b*v\u0092â\u001bN|¹Þ%\u001f\u0090\u008eüóhyÓÖ?6\u0000rkî×XB\u009e®\u0002\u001aD\u0085ÍñS\\¶È\u00164m\u009fÝ\u000b+v\u00adâ.N}¹Â%.\u0090\u0087üåO=$¹\u0098\b\rèánU$Ê¬¾\u001f\u0013û\u0087P{&Ð\u0087D}9ý\u00adE\u0001\fö\u0095jtßÎ³\u00ad'5\u0000pkô×EB¥®(\u001ab\u0085Îñ\\\\¡È\u00164j\u009fæ\u000b*v\u009câ\u0015N{¹Þ%.\u0090\u0085üõhsÓÅ?\u0006ª\u0085\u0016ú\u0082FíßY=\u0000gkþ×BB\u009d®\u0003\u001ad\u0085ÃñQ\\\u009aÈ\u00014a\u009fÈ\u000b v¼â\u001bNf¹Ä%\u0006\u0090\u0087üïh}ÓÐ?7ª\u009f\u0016Á\u0082MíÍY-Ä\u00950á\u009cI\u0007 \u0000rkþ×QB¸®\u001f\u001as\u0085ÇñO\\\u009aÈ\u00014a\u009fÈ\u000b v¼â\u001bNf¹Ä%\u0019\u0090\u0083üâhyÓÞ?$ª\u0088\u0016ú\u0000ukõ×DB´®\u000b\u001an\u0085ÑñI\\½È\u00014L\u009fÛ\u000b+v¾â\u001eNv¹Ñ%8\u0090\u0092üÓhyÓÔ?7ª\u0084\u0016þ\u0082FíÌ|\u0005\u0017\u009c« >ãÒof\fù²\u008d\u0019 Ó´cH\u001fã¿wi\nß\u009er2\u0012Å±Y]\u0000gkþ×BB\u0081®\r\u001an\u0085Ðñn\\½È\u00104a\u009fÇ\u000b v\u0090â\u0018N\u007f¹Õ%(\u0090\u0092\u0000gkþ×BB\u009c®\t\u001ac\u0085Ëñ\\\\\u0088È\u001f4o\u009fÐ\u000b!v\u00adkh\u0000ñ¼M)\u009aÅ\u0006q~îÄ\u009aQ7²£)_qôò`\"\u001d½\u0089\u0010%SÒÑN\tû\u0080\u0097â\u0003z¸Ë\u0000mkú×F\u0000fkô×DB\u0094®\r\u001ad\u0085Ê\u0000fkò×ZB¥®\t\u001auÜ\u009b·7\u000b\u009a\u009e`rÀÆùY\u0019-\u009b\u0080c\u0014Îè¥C\u0003×óªo>Ã\u0092ëe\u0003ùðLL 7´\u00ad\u000f\rã¬\u0000:k»×[B´®\u0018\u001ao\u0085ÍñY\\øÈ\u001d4a\u009fÝ\u000bdv¬â\u000fNe¹À%$\u0090\u0094üõhyÓÓ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_LEGACY_INIT_POST_FAILED);
        f1674 = cArr;
        f1675 = -3234494221500912741L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:205:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:271:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:280:0x0e08  */
    /* JADX WARN: Code duplicated, block: B:355:0x1196  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﻛ */
    public final Object mo1563(co coVar, String str, List<Object> list, dq dqVar) {
        byte b;
        int i = 2 % 2;
        try {
            try {
                switch (str.hashCode()) {
                    case -2004702861:
                        if (!str.equals(m1828(View.MeasureSpec.getMode(0) + 579, ExpandableListView.getPackedPositionType(0L) + 25, (char) (60782 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 36;
                        }
                        break;
                    case -2004586504:
                        if (!str.equals(m1828((ViewConfiguration.getDoubleTapTimeout() >> 16) + 843, 29 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.getTrimmedLength("") + 60277)).intern())) {
                            b = -1;
                        } else {
                            int i2 = f1673 + InterfaceC0280i1.d.b.g;
                            f1672 = i2 % 128;
                            b = i2 % 2 != 0 ? (byte) 45 : (byte) 16;
                        }
                        break;
                    case -1940880443:
                        if (!str.equals(m1828((Process.myTid() >> 22) + 291, KeyEvent.normalizeMetaState(0) + 14, (char) (7386 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case -1935452010:
                        if (!str.equals(m1828(412 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, (char) (TextUtils.indexOf((CharSequence) "", '0') + 35547)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.FS;
                        }
                        break;
                    case -1926335428:
                        if (!str.equals(m1828(305 - Drawable.resolveOpacity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            int i3 = f1673 + 121;
                            f1672 = i3 % 128;
                            if (i3 % 2 != 0) {
                                b = 21;
                            } else {
                                b = 88;
                            }
                        }
                        break;
                    case -1862527602:
                        if (!str.equals(m1828((ViewConfiguration.getScrollBarSize() >> 8) + 1098, 16 - Color.red(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 56;
                        }
                        break;
                    case -1811057601:
                        if (!str.equals(m1828(42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 14, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1784213698:
                        if (!str.equals(m1828(621 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 48075)).intern())) {
                            b = -1;
                        } else {
                            b = 38;
                        }
                        break;
                    case -1759122910:
                        if (!str.equals(m1828(872 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 30, (char) (48880 - View.resolveSize(0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = 46;
                        }
                        break;
                    case -1673354837:
                        if (!str.equals(m1828(236 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 14, (char) (Color.green(0) + 63751)).intern())) {
                            b = -1;
                        }
                        break;
                    case -1654145783:
                        if (!str.equals(m1828(1451 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 79;
                        }
                        break;
                    case -1475737971:
                        if (!str.equals(m1828((Process.myTid() >> 22) + 1709, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 94;
                        }
                        break;
                    case -1424907981:
                        if (!str.equals(m1828(Color.blue(0) + 1671, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                            b = -1;
                        } else {
                            b = 91;
                        }
                        break;
                    case -1412269250:
                        if (!str.equals(m1828((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1003, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44855)).intern())) {
                            b = -1;
                        } else {
                            b = 51;
                        }
                        break;
                    case -1296960936:
                        if (!str.equals(m1828(394 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (12826 - View.getDefaultSize(0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.ESC;
                        }
                        break;
                    case -1296887564:
                        if (!str.equals(m1828((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1889, View.combineMeasuredStates(0, 0) + 27, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 102;
                        }
                        break;
                    case -1274492040:
                        if (!str.equals(m1828(1999 - Color.green(0), KeyEvent.normalizeMetaState(0) + 6, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 109;
                        }
                        break;
                    case -1253789331:
                        if (!str.equals(m1828(View.getDefaultSize(0, 0) + 1864, TextUtils.getOffsetBefore("", 0) + 25, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern())) {
                            b = -1;
                        } else {
                            b = 101;
                        }
                        break;
                    case -1242814655:
                        if (!str.equals(m1828(1409 - ImageFormat.getBitsPerPixel(0), 19 - (ViewConfiguration.getTouchSlop() >> 8), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 76;
                        }
                        break;
                    case -1214823651:
                        if (!str.equals(m1828(TextUtils.getTrimmedLength("") + 491, Drawable.resolveOpacity(0, 0) + 19, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            b = 32;
                        }
                        break;
                    case -1198560170:
                        if (!str.equals(m1828(1804 - View.MeasureSpec.getSize(0), 28 - Drawable.resolveOpacity(0, 0), (char) View.MeasureSpec.getSize(0)).intern())) {
                            b = -1;
                        } else {
                            b = 99;
                        }
                        break;
                    case -1145074375:
                        if (!str.equals(m1828(640 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 35, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50685)).intern())) {
                            b = -1;
                        } else {
                            b = 39;
                        }
                        break;
                    case -1124602405:
                        if (!str.equals(m1828(1646 - TextUtils.getOffsetAfter("", 0), 18 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13680)).intern())) {
                            b = -1;
                        } else {
                            b = 88;
                        }
                        break;
                    case -1071201617:
                        if (!str.equals(m1828(TextUtils.indexOf("", "", 0) + 1953, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = 105;
                        }
                        break;
                    case -1029444991:
                        if (!str.equals(m1828(TextUtils.lastIndexOf("", '0', 0, 0) + 929, 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22)).intern())) {
                            b = -1;
                        } else {
                            b = 48;
                        }
                        break;
                    case -1029356152:
                        if (!str.equals(m1828(101 - TextUtils.indexOf("", "", 0), Color.rgb(0, 0, 0) + 16777230, (char) View.getDefaultSize(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -1013936139:
                        if (!str.equals(m1828(TextUtils.getTrimmedLength("") + 1472, View.MeasureSpec.getMode(0) + 23, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                            b = -1;
                        } else {
                            b = 80;
                        }
                        break;
                    case -997695964:
                        if (!str.equals(m1828(1740 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 23, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 96;
                        }
                        break;
                    case -992018155:
                        if (!str.equals(m1828((ViewConfiguration.getJumpTapTimeout() >> 16) + 1586, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 85;
                        }
                        break;
                    case -952854909:
                        if (!str.equals(m1828(TextUtils.indexOf("", "") + 81, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.argb(0, 0, 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -924373867:
                        if (!str.equals(m1828(1262 - Process.getGidForName(""), 20 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern())) {
                            b = -1;
                        } else {
                            b = 68;
                        }
                        break;
                    case -899502102:
                        if (!str.equals(m1828(Color.green(0) + 1141, 13 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                            b = -1;
                        } else {
                            b = 59;
                        }
                        break;
                    case -834290483:
                        if (!str.equals(m1828(743 - Color.red(0), (ViewConfiguration.getEdgeSlop() >> 16) + 39, (char) (View.MeasureSpec.getSize(0) + 54851)).intern())) {
                            b = -1;
                        } else {
                            int i4 = f1673 + 93;
                            f1672 = i4 % 128;
                            if (i4 % 2 != 0) {
                                b = 42;
                            } else {
                                b = 88;
                            }
                        }
                        break;
                    case -788426345:
                        if (!str.equals(m1828((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 362, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (46222 - KeyEvent.normalizeMetaState(0))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.EM;
                        }
                        break;
                    case -764989270:
                        if (!str.equals(m1828(675 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                            b = -1;
                        } else {
                            b = 40;
                        }
                        break;
                    case -678635926:
                        if (!str.equals(m1828((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1991, 7 - Drawable.resolveOpacity(0, 0), (char) View.MeasureSpec.getMode(0)).intern())) {
                            b = -1;
                        } else {
                            b = 108;
                        }
                        break;
                    case -633198692:
                        if (!str.equals(m1828(1680 - KeyEvent.normalizeMetaState(0), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4284)).intern())) {
                            b = -1;
                        } else {
                            b = 92;
                        }
                        break;
                    case -622788386:
                        if (!str.equals(m1828(282 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.green(0) + 10, (char) (52778 - View.MeasureSpec.getMode(0))).intern())) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case -588814953:
                        if (!str.equals(m1828(1170 - Drawable.resolveOpacity(0, 0), 12 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 56915)).intern())) {
                            b = -1;
                        } else {
                            b = Base64.padSymbol;
                        }
                        break;
                    case -525192167:
                        if (!str.equals(m1828(ExpandableListView.getPackedPositionGroup(0L) + 1245, 17 - ExpandableListView.getPackedPositionChild(0L), (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                            b = -1;
                        } else {
                            b = 67;
                        }
                        break;
                    case -502936072:
                        if (!str.equals(m1828(1627 - View.MeasureSpec.getMode(0), Process.getGidForName("") + 20, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 1394)).intern())) {
                            b = -1;
                        } else {
                            b = 87;
                        }
                        break;
                    case -429121350:
                        if (!str.equals(m1828((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 250, 22 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 8384)).intern())) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case -264400535:
                        if (!str.equals(m1828(510 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            b = -1;
                        } else {
                            int i5 = f1672 + 121;
                            f1673 = i5 % 128;
                            if (i5 % 2 == 0) {
                                b = 33;
                            } else {
                                b = 7;
                            }
                        }
                        break;
                    case -100132040:
                        if (!str.equals(m1828(150 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 23 - (ViewConfiguration.getTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            int i6 = f1673 + 35;
                            f1672 = i6 % 128;
                            int i7 = i6 % 2;
                            b = Ascii.VT;
                        }
                        break;
                    case -75121853:
                        if (!str.equals(m1828(1192 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 7, (char) (46983 - ImageFormat.getBitsPerPixel(0))).intern())) {
                            b = -1;
                        } else {
                            int i8 = f1673 + 115;
                            f1672 = i8 % 128;
                            int i9 = i8 % 2;
                            b = Utf8.REPLACEMENT_BYTE;
                        }
                        break;
                    case -75062501:
                        if (!str.equals(m1828(93 - TextUtils.indexOf((CharSequence) "", '0'), 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 6;
                        }
                        break;
                    case -39321397:
                        if (!str.equals(m1828(28 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0') + 15, (char) (1123 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern())) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -37751474:
                        if (!str.equals(m1828((ViewConfiguration.getTouchSlop() >> 8) + 319, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DLE, (char) (4656 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case -20195056:
                        if (!str.equals(m1828(1018 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf("", "") + 24, (char) (22539 - TextUtils.indexOf("", "", 0))).intern())) {
                            b = -1;
                        } else {
                            b = 52;
                        }
                        break;
                    case 107868:
                        if (!str.equals(m1828(1988 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getTouchSlop() >> 8) + 3, (char) View.resolveSize(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 107;
                        }
                        break;
                    case 108960:
                        if (!str.equals(m1828(1665 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 4, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 89;
                        }
                        break;
                    case 1820707:
                        if (!str.equals(m1828(1332 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.alpha(0) + 17, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 72;
                        }
                        break;
                    case 2656096:
                        if (!str.equals(m1828(KeyEvent.keyCodeFromString("") + 1132, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (char) Color.blue(0)).intern())) {
                            b = -1;
                        } else {
                            b = 58;
                        }
                        break;
                    case 3052374:
                        if (!str.equals(m1828(1667 - Color.green(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 90;
                        }
                        break;
                    case 15484010:
                        if (!str.equals(m1828(1437 - Color.green(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 78;
                        }
                        break;
                    case 134176114:
                        if (!str.equals(m1828((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1227, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.indexOf("", "") + 58390)).intern())) {
                            b = -1;
                        } else {
                            int i10 = f1672 + 43;
                            f1673 = i10 % 128;
                            int i11 = i10 % 2;
                            b = 66;
                        }
                        break;
                    case 151150886:
                        if (!str.equals(m1828(1300 - ((Process.getThreadPriority(0) + 20) >> 6), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern())) {
                            b = -1;
                        } else {
                            b = 70;
                        }
                        break;
                    case 171861489:
                        if (!str.equals(m1828((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 131, (ViewConfiguration.getLongPressTimeout() >> 16) + 19, (char) (62405 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case 186649624:
                        if (!str.equals(m1828((ViewConfiguration.getWindowTouchSlop() >> 8) + 1783, 21 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (KeyEvent.getDeadChar(0, 0) + 20301)).intern())) {
                            b = -1;
                        } else {
                            b = 98;
                        }
                        break;
                    case 190032796:
                        if (!str.equals(m1828(14 - TextUtils.lastIndexOf("", '0'), 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51301)).intern())) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 317728381:
                        if (!str.equals(m1828(Color.green(0) + 1388, Color.argb(0, 0, 0, 0) + 22, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            b = 75;
                        }
                        break;
                    case 370758723:
                        if (!str.equals(m1828((ViewConfiguration.getPressedStateDuration() >> 16) + 1934, (ViewConfiguration.getTouchSlop() >> 8) + 19, (char) View.resolveSize(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 104;
                        }
                        break;
                    case 383897184:
                        if (!str.equals(m1828(ImageFormat.getBitsPerPixel(0) + 1155, Color.red(0) + 16, (char) (45783 - ImageFormat.getBitsPerPixel(0))).intern())) {
                            b = -1;
                        } else {
                            b = 60;
                        }
                        break;
                    case 386145701:
                        if (!str.equals(m1828(454 - Gravity.getAbsoluteGravity(0, 0), 19 - Color.red(0), (char) (7229 - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.RS;
                        }
                        break;
                    case 398700013:
                        if (!str.equals(m1828(View.MeasureSpec.getSize(0) + 1283, TextUtils.indexOf("", "", 0, 0) + 17, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25192)).intern())) {
                            b = -1;
                        } else {
                            b = 69;
                        }
                        break;
                    case 404330675:
                        if (!str.equals(m1828(214 - KeyEvent.normalizeMetaState(0), 22 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.SI;
                        }
                        break;
                    case 413143991:
                        if (!str.equals(m1828((ViewConfiguration.getScrollBarSize() >> 8) + 334, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, (char) ((-1) - Process.getGidForName(""))).intern())) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case 421306799:
                        if (!str.equals(m1828(122 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 9 - KeyEvent.getDeadChar(0, 0), (char) (4761 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern())) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case 449440345:
                        if (!str.equals(m1828(TextUtils.indexOf((CharSequence) "", '0') + 1573, 14 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 11496)).intern())) {
                            b = -1;
                        } else {
                            b = 84;
                        }
                        break;
                    case 451302467:
                        if (!str.equals(m1828((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1349, 19 - TextUtils.getOffsetAfter("", 0), (char) View.getDefaultSize(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 73;
                        }
                        break;
                    case 468780064:
                        if (!str.equals(m1828(556 - ExpandableListView.getPackedPositionChild(0L), 22 - View.MeasureSpec.getMode(0), (char) (64175 - Drawable.resolveOpacity(0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = 35;
                        }
                        break;
                    case 496987426:
                        if (!str.equals(m1828(1725 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 95;
                        }
                        break;
                    case 502192375:
                        if (!str.equals(m1828(ExpandableListView.getPackedPositionChild(0L) + 377, 18 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.SUB;
                        }
                        break;
                    case 518569412:
                        if (!str.equals(m1828(Drawable.resolveOpacity(0, 0) + 473, TextUtils.indexOf((CharSequence) "", '0') + 19, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.US;
                        }
                        break;
                    case 526577620:
                        if (!str.equals(m1828(174 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, (char) (50139 - View.getDefaultSize(0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = Ascii.FF;
                        }
                        break;
                    case 600996866:
                        if (!str.equals(m1828((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1064, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Drawable.resolveOpacity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 54;
                        }
                        break;
                    case 618460119:
                        if (!str.equals(m1828(194 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 9, (char) (3541 - AndroidCharacter.getMirror('0'))).intern())) {
                            b = -1;
                        } else {
                            b = 13;
                        }
                        break;
                    case 622025239:
                        if (!str.equals(m1828(AndroidCharacter.getMirror('0') + 1320, 20 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 74;
                        }
                        break;
                    case 660677592:
                        if (!str.equals(m1828(706 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0) + 38, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            int i12 = f1672 + 43;
                            f1673 = i12 % 128;
                            int i13 = i12 % 2;
                            b = 41;
                        }
                        break;
                    case 672646709:
                        if (!str.equals(m1828(Drawable.resolveOpacity(0, 0) + 272, 8 - ExpandableListView.getPackedPositionChild(0L), (char) (21611 - View.MeasureSpec.getSize(0))).intern())) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 675563679:
                        if (!str.equals(m1828(1915 - MotionEvent.axisFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 18, (char) (31842 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern())) {
                            b = -1;
                        } else {
                            b = 103;
                        }
                        break;
                    case 759503924:
                        if (!str.equals(m1828(MotionEvent.axisFromString("") + 981, 23 - ExpandableListView.getPackedPositionGroup(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            b = 50;
                        }
                        break;
                    case 776628755:
                        if (!str.equals(m1828(902 - TextUtils.indexOf("", "", 0, 0), Color.blue(0) + 26, (char) (57985 - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                            b = -1;
                        } else {
                            b = 47;
                        }
                        break;
                    case 791624502:
                        if (!str.equals(m1828((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1831, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (char) (MotionEvent.axisFromString("") + 1)).intern())) {
                            b = -1;
                        } else {
                            b = 100;
                        }
                        break;
                    case 861400366:
                        if (!str.equals(m1828(View.resolveSizeAndState(0, 0, 0) + 434, TextUtils.lastIndexOf("", '0') + 21, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            int i14 = f1672 + 69;
                            f1673 = i14 % 128;
                            if (i14 % 2 == 0) {
                                b = Ascii.GS;
                            } else {
                                b = 6;
                            }
                        }
                        break;
                    case 956170787:
                        if (!str.equals(m1828(1114 - TextUtils.indexOf("", "", 0), KeyEvent.normalizeMetaState(0) + 18, (char) (Color.rgb(0, 0, 0) + 16796135)).intern())) {
                            b = -1;
                        } else {
                            b = 57;
                        }
                        break;
                    case 1057201549:
                        if (!str.equals(m1828(1762 - TextUtils.indexOf((CharSequence) "", '0'), Gravity.getAbsoluteGravity(0, 0) + 20, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern())) {
                            b = -1;
                        } else {
                            b = 97;
                        }
                        break;
                    case 1076958445:
                        if (!str.equals(m1828(349 - (ViewConfiguration.getPressedStateDuration() >> 16), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 1107904233:
                        if (!str.equals(m1828(782 - Gravity.getAbsoluteGravity(0, 0), 28 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 43;
                        }
                        break;
                    case 1125810632:
                        if (!str.equals(m1828((KeyEvent.getMaxKeyCode() >> 16) + 1541, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (char) (17505 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                            b = -1;
                        } else {
                            b = 83;
                        }
                        break;
                    case 1414080697:
                        if (!str.equals(m1828((ViewConfiguration.getTapTimeout() >> 16) + 57, TextUtils.indexOf((CharSequence) "", '0') + 25, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 1444942133:
                        if (!str.equals(m1828(MotionEvent.axisFromString("") + 811, 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 44;
                        }
                        break;
                    case 1521072706:
                        if (!str.equals(m1828(1494 - ((byte) KeyEvent.getModifierMetaStateMask()), 22 - Color.green(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40837)).intern())) {
                            b = -1;
                        } else {
                            b = 81;
                        }
                        break;
                    case 1525623361:
                        if (!str.equals(m1828((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1966, 22 - TextUtils.getCapsMode("", 0, 0), (char) (27406 - MotionEvent.axisFromString(""))).intern())) {
                            b = -1;
                        } else {
                            b = 106;
                        }
                        break;
                    case 1546196954:
                        if (!str.equals(m1828(TextUtils.indexOf((CharSequence) "", '0', 0) + 1518, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 82;
                        }
                        break;
                    case 1557083836:
                        if (!str.equals(m1828((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 533, 24 - ExpandableListView.getPackedPositionChild(0L), (char) (Process.myTid() >> 22)).intern())) {
                            b = -1;
                        } else {
                            b = 34;
                        }
                        break;
                    case 1590874683:
                        if (!str.equals(m1828(Gravity.getAbsoluteGravity(0, 0) + 1605, Color.alpha(0) + 22, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 86;
                        }
                        break;
                    case 1622498214:
                        if (!str.equals(m1828(960 - Color.blue(0), Color.argb(0, 0, 0, 0) + 20, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            b = -1;
                        } else {
                            b = 49;
                        }
                        break;
                    case 1664124883:
                        if (!str.equals(m1828(TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, (char) View.combineMeasuredStates(0, 0)).intern())) {
                            b = -1;
                        } else {
                            int i15 = f1673 + 73;
                            f1672 = i15 % 128;
                            int i16 = i15 % 2;
                            b = 0;
                        }
                        break;
                    case 1746583808:
                        if (!str.equals(m1828(1212 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 16, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 65;
                        }
                        break;
                    case 1751981113:
                        if (!str.equals(m1828(1696 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14 - View.resolveSizeAndState(0, 0, 0), (char) (29366 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern())) {
                            b = -1;
                        } else {
                            b = 93;
                        }
                        break;
                    case 1777572999:
                        if (!str.equals(m1828((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, (char) (58909 - TextUtils.lastIndexOf("", '0'))).intern())) {
                            b = -1;
                        } else {
                            b = 37;
                        }
                        break;
                    case 1825714001:
                        if (!str.equals(m1828(1042 - ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 21, (char) (53586 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
                            b = -1;
                        } else {
                            b = 53;
                        }
                        break;
                    case 1876204439:
                        if (!str.equals(m1828((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1079, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (49496 - (ViewConfiguration.getTouchSlop() >> 8))).intern())) {
                            b = -1;
                        } else {
                            b = 55;
                        }
                        break;
                    case 1953253188:
                        if (!str.equals(m1828(115 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern())) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case 1988391289:
                        if (!str.equals(m1828(MotionEvent.axisFromString("") + 1183, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern())) {
                            b = -1;
                        } else {
                            b = 62;
                        }
                        break;
                    case 1989757366:
                        if (!str.equals(m1828((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1428, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, (char) TextUtils.getCapsMode("", 0, 0)).intern())) {
                            b = -1;
                        } else {
                            b = 77;
                        }
                        break;
                    case 1992394620:
                        if (!str.equals(m1828(TextUtils.getCapsMode("", 0, 0) + InterfaceC0280i1.c.b.e, 10 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                            b = -1;
                        } else {
                            b = 14;
                        }
                        break;
                    case 1993407379:
                        if (!str.equals(m1828((Process.myPid() >> 22) + 1199, 12 - View.MeasureSpec.getMode(0), (char) (50190 - (ViewConfiguration.getScrollBarSize() >> 8))).intern())) {
                            b = -1;
                        } else {
                            b = SignedBytes.MAX_POWER_OF_TWO;
                        }
                        break;
                    case 2034588468:
                        if (!str.equals(m1828(1319 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23111)).intern())) {
                            b = -1;
                        } else {
                            b = 71;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        return cy.m1775(list);
                    case 1:
                        return cy.m1776(list);
                    case 2:
                        return cy.m1773(coVar);
                    case 3:
                        return cy.m1774(coVar, list);
                    case 4:
                        return dd.m1841(list);
                    case 5:
                        return Boolean.valueOf(dd.m1840(list));
                    case 6:
                        return dd.m1838(list);
                    case 7:
                        return dd.m1839(list);
                    case 8:
                        return cr.m1714(list);
                    case 9:
                        return cr.m1717(list);
                    case 10:
                        return cr.m1715(list);
                    case 11:
                        return cr.m1718(list);
                    case 12:
                        return cr.m1716();
                    case 13:
                        return da.m1827(list);
                    case 14:
                        return da.m1826(list);
                    case 15:
                        return da.m1825();
                    case 16:
                        return df.m1850(list);
                    case 17:
                        return df.m1849(list);
                    case 18:
                        return df.m1851(list);
                    case 19:
                        return df.m1848(list);
                    case 20:
                        return this.f1684.m1855(dqVar, coVar, list);
                    case 21:
                        return this.f1684.m1852(dqVar, coVar, list);
                    case 22:
                        return this.f1684.m1854(dqVar, coVar, list);
                    case 23:
                        return this.f1684.m1853(dqVar, coVar, list);
                    case 24:
                        return Integer.valueOf(de.m1846(list));
                    case 25:
                        return de.m1847(list);
                    case 26:
                        return de.m1843(list);
                    case 27:
                        return de.m1845(list);
                    case 28:
                        return Boolean.valueOf(de.m1844(list));
                    case 29:
                        return de.m1842(list);
                    case 30:
                        return this.f1683.m1808(coVar, list, dqVar);
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        return cz.m1792(list);
                    case 32:
                        return cz.m1786(list);
                    case 33:
                        return this.f1683.m1806(list);
                    case 34:
                        return this.f1683.m1807(coVar, list, dqVar);
                    case 35:
                        return this.f1683.m1804(list);
                    case 36:
                        return this.f1683.m1803(coVar, list, dqVar);
                    case 37:
                        return cz.m1791(list);
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        return cz.m1784(list);
                    case 39:
                        return this.f1683.m1805(coVar, list, dqVar);
                    case 40:
                        return this.f1683.m1809(coVar, list, dqVar);
                    case 41:
                        return this.f1683.m1798(coVar, list, dqVar);
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        return this.f1683.m1800(coVar, list, dqVar);
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        return this.f1683.m1797(coVar, list, dqVar);
                    case 44:
                        return this.f1683.m1793(coVar, list, dqVar);
                    case 45:
                        return this.f1683.m1801(list);
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        return this.f1683.m1799(list);
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        return this.f1683.m1794(list);
                    case 48:
                        return this.f1683.m1796(list);
                    case 49:
                        return cz.m1782(list);
                    case 50:
                        return this.f1683.m1795(coVar, list, dqVar);
                    case 51:
                        return this.f1683.m1802(coVar, list);
                    case 52:
                        return Boolean.valueOf(cz.m1783(list));
                    case 53:
                        return cz.m1780(list);
                    case 54:
                        return cz.m1781(list);
                    case 55:
                        return cz.m1779(list);
                    case 56:
                        return cz.m1777(list);
                    case 57:
                        return cz.m1778(list);
                    case 58:
                        return ct.m1752(coVar, list);
                    case 59:
                        return cs.m1739(coVar, list);
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        return this.f1681.m1749(coVar, list, dqVar);
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return cs.m1742(coVar);
                    case IronSourceConstants.RETRY_LIMIT /* 62 */:
                        return cs.m1738(coVar);
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        return Long.valueOf(cs.m1741());
                    case 64:
                        return cs.m1746();
                    case 65:
                        return Long.valueOf(cs.m1747());
                    case 66:
                        return cs.m1734();
                    case 67:
                        return cs.m1737();
                    case 68:
                        return cs.m1726();
                    case 69:
                        return cs.m1731();
                    case 70:
                        return cs.m1728();
                    case 71:
                        return cs.m1736(coVar);
                    case 72:
                        return cs.m1745(coVar);
                    case 73:
                        return cs.m1732();
                    case 74:
                        return cs.m1730();
                    case 75:
                        return cs.m1748(coVar);
                    case Base64.mimeLineLength /* 76 */:
                        return cs.m1733(coVar);
                    case 77:
                        return cs.m1740(list);
                    case 78:
                        return Boolean.valueOf(cs.m1724());
                    case 79:
                        return cs.m1744(list);
                    case 80:
                        return cs.m1729(coVar);
                    case 81:
                        return cs.m1727(coVar);
                    case 82:
                        return Boolean.valueOf(cs.m1725());
                    case 83:
                        return Double.valueOf(cs.m1722());
                    case 84:
                        return this.f1681.m1750(list);
                    case 85:
                        return cs.m1723();
                    case 86:
                        return cs.m1721();
                    case 87:
                        return cs.m1719();
                    case 88:
                        return cs.m1735(list);
                    case 89:
                        return cw.m1767(coVar, list);
                    case 90:
                        return Character.valueOf(cw.m1764(list));
                    case 91:
                        return cw.m1768(list);
                    case 92:
                        return Boolean.valueOf(cw.m1766(list));
                    case 93:
                        return this.f1676.m1833(coVar, list, dqVar);
                    case 94:
                        return this.f1676.m1837(coVar, list, dqVar);
                    case 95:
                        return this.f1676.m1834(coVar, list, dqVar);
                    case 96:
                        return this.f1676.m1836(coVar, list, dqVar);
                    case 97:
                        return this.f1676.m1835(coVar, list, dqVar);
                    case 98:
                        return this.f1676.m1831(coVar, list, dqVar);
                    case 99:
                        return this.f1676.m1832(coVar, list, dqVar);
                    case 100:
                        return cu.m1754(list);
                    case InterfaceC0280i1.d.b.b /* 101 */:
                        return cu.m1757(list);
                    case 102:
                        return cu.m1756(list);
                    case InterfaceC0280i1.d.b.d /* 103 */:
                        return cu.m1758(list);
                    case 104:
                        return cu.m1759(list);
                    case 105:
                        return cu.m1753(list);
                    case 106:
                        return Long.valueOf(cu.m1755());
                    case 107:
                        return this.f1678.m1763(coVar, list);
                    case 108:
                        return this.f1678.m1762(coVar, list);
                    case InterfaceC0280i1.d.b.g /* 109 */:
                        return this.f1678.m1761(coVar, list);
                    default:
                        cn.m1575(coVar.m1624(), new StringBuilder().append(m1828(2004 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, (char) (ExpandableListView.getPackedPositionGroup(0L) + 56542)).intern()).append(str).append(m1828(2029 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, (char) TextUtils.getOffsetAfter("", 0)).intern()).toString(), null);
                        return null;
                }
            } catch (Exception e) {
                e = e;
                cn.m1575(coVar.m1624(), new StringBuilder().append(m1828(2005 - View.resolveSize(0, 0), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 56542)).intern()).append(str).toString(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1828(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1674[b.f638 + i]) ^ (((long) b.f638) * f1675)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
