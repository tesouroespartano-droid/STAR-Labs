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
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bj extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f832 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f833 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f834;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f835;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("\u0000^\u0090# \u009a±&A Ò\u001fbÔó$\u0083Ó\u0014+¤\u00925Q\u0000A\u0090\u001b ½±\u0012A\u0092Ò\u000fb\u009fó\u0017\u0083\u008c\u0014#¤\u008f5\u0005Å\u0091G\u0000×ZgûöU\u0006Î\u0095J%×´YÄÀ\u0000A\u0090\u001b ¨±\u0014A\u0098Ò\u001eb\u0095ÌË\\\u0091ì2}\u0082\u008d\u001a\u001e\u009d®#?\u0090O\u0000Ø\u0098h\u0019ù\u0091\t2\u009a\u0090*\u000b»\u008fË\u001fT\u008bä\u0001u\u0095©*9p\u0089Ù\u0018\u007fèä{dËôZ|*ö½nHVØ\fh»ù\u000f\t\u009a\u009a\u0019*\u0088»\u001dË\u009b§Ì7\u0096\u0087!\u0016\u0095æ\u0000u\u0083Å\u0012T\u0087$\u0001³ª\u0003\u001a\u0092\u008ab\u0018ñ\u0093A\u001aÐ\u0088 \u0018?\u0090\u008f\u0010\u0094I\u0004\u0013´\u0085%!Õ\u008dF\u0003ö\u0097\u0000A\u0090\u001b ¨±\u0014A\u0099Ò\fî¨~ôÎz_ù¯s<ã\u008c\\\u001dúmaúéJyÛñ+{¸ë\u0000B\u0090\u001e \u0090±\u0013A\u0099Ò\tb¬ó\u0010\u0083\u009d\u0014\u0000¤Ü4¥\u0084e\u0015ªå vªÆ\"W\u00ad'.°ª\u0000*\u0091®a$òèB%Ó¥£+<´\u008c>\u001dªíw~\u009cÎ>_²/3¸·\b!\u0099\u0086i8ú³J [\u001dËI{Åêo\u001aÂ\u0089G9Í¨OØÉOM\u0000B\u0090\u0016 \u009a±0A\u009dÒ\u0018b\u0092ó\u0010\u0083\u0096\u0014\u0012¤·5\u0011\u0000C\u0090\r \u009b±\u001cA\u0088Ò\u0012b\u008có\u001c\u0083¾\u0014\u0018¤\u00845\u0018Å\u0095V\u0007\u0084\u009a\u0014Á¤L5ÉÅJVìæHwÞ\u0007Jg;÷cGøÖj&üµz\u0005ü\u0094bäþslÃåRk¢Ç1eé9yaÉúXh¨þ;x\u008bþ\u001a`jüýnMçÜi,È¿j\u000fñ\u009euîåqqÁûPo\u0000F\u0090\n \u0092±\u0011A¯Ò\u0018b\u0088ó\u001c\u0083\u009d\u0014\u0019¤·5\u0011®ç>°\u008e0\u001f¾ï7|\u0090Ì#] -7º©\n\b\u009b¦k.ø¼\u0000M\u0090\u001a \u009a±\u0014A\u009dÒ-b\u0093ó\u001c\u0083\u008f\u0088È\u0018±¨q9¾É4Z¾ê6{¹\u000b:\u009c¾,>½ºM0Þün=ÿ±\u008f%\u0010§ 91©Á,R®âes¾\u0003 \u0094£$0µêE\bÖ§f'÷©\u0087 (¨¸\u0016I\u0099Ù\n\u0084Þ\u0014\u008e¤\u001a5\u0084Å\u001aV\u008eæ+w\u008d\u0013=\u0083m3ù¢gRùÁmqÅàc\u0090ø\u0007p·à&hÖâEr(µ¸å\bq\u0099ïiqúåJLÛç«g<å\u008cl\u001dØíf~íÎ~\u0000R\u0090\u001a \u0089±\u001cA\u008eÒ\u001fb\u009fó\u001d\u0083¹\u0014\u0013\u0000R\u0090\u001a \u0089±\u001cA\u008eÒ\u001fb\u009fó\u001d\u0083´\u0014\u001e¤\u00855\u0001Å\u0091V\u001dæ\u0097w\u0003íT}\u0010Í\u009b\\\u0013¬·?\u0018\u008f\u0098\u001e\u0016n\u009fù=I\u0099Ø\u0000(\u0086»\u0010\u000b\u009a\u009a\u0012ê\u0084qMá\tQ\u0082À\n0®£\u0001\u0013\u0081\u0082\u000fò\u0086e>Õ\u0080D\u000f´\u009c\u0000i\u0090\u0010 Ð±\u001fA\u0095Ò\u001fb\u0097ó\u0018\u0083\u009b\u0014\u001f¤\u009f5\u001bÅ\u0091V]æ\u0080w\u0018\u0007\u0093\u0098\u0007(\u0083¹\bI\u0088Ú\u0002j\u008bûG\u008bº\u001c\u000e¬\u0085=\rÍ©^\u0006î\u0086\u007f\b\u000f\u0081 \t0·Á8Q«<.¬n\u001câ\u008d`}ëîS^îÏ`¿ù(j\u0098ü\tLùïj\u007fÚãK\u007f;á¤c\u0014ï\u0000i\u0090\u0010 Ð±\u001fA\u0095Ò\u001fb\u0097ó\u0018\u0083\u009b\u0014\u001f¤\u009f5\u001bÅ\u0091V]æ\u009cw\u0010\u0007\u0084\u0098\u0006(\u0098¹\bI\u008dÚ\u000fjÄû\u001f\u008b\u0081\u001c\u0002¬\u0091=KÍ²^\nî\u0086\u007f\u0004\u000f\u008f \u000f0²Á<Q¥â>r¨\u0003\u0018\u0093»$#´¿E#Õ½f'ö«'Ð·\u008a\u0000M\u0090\r \u009f±\u0014A\u0098Ò:b\u0099ó\r\u0083\u0091\u0014\u0001¤\u009f5\u0001Å\u008dF\u0088Öûfx÷¸\u0007r\u0094è$aµþÅ|Rîâxsí\u0083k\u0010ù z1ñA5Þíndÿä\u000f)\u009cí,s½ãÍjZèê#{Ã\u008b}\u0018é¨`9îIJæ×vA\u0087ß\u0017A¤Ù4EEË\u0000M\u0090\r \u009f±\u0014A\u0098Ò?b\u0093ó\u0018\u0083\u0094\u0014\u0018¤\u009154Å\u0097V\u0007æ\u009bw\u0007\u0007\u0099\u0098\u001b(\u0097\u0000c\u0090\u0010 \u0093±SA\u0099Ò\u0003b\u008aó\u0015\u0083\u0097\u0014\u0005¤\u00935\u0006Å\u0080V\u0012æ\u0091w\u001a\u0007Þ\u0098\u0006(\u008f¹\u000fIÂÚ\u0006j\u0098û\b\u008b\u0081\u001c\u0003¬È=(Í\u0096^\u0002î\u008b\u007f\u0005\u000f¤ 60¿Á1Q³â<r\u009b\u0003:\u0093¬$>´ E<Õ f*\u009cÓ\f\u0093¼\u0001-\u008aÝ\u0006N¬þ\no\u0093\u001f\u0003\u0088\u009b8\u001b©\u009fY\u0003Ê\u0099z\u0005ë\u008e\u009b\u0002×[G\u001b÷\u0089f\u0002\u0096\u008e\u0005$µ\u0082$\u001bT\u008bÃ\u0013s\u0093â\u0017\u0012\u008b\u0081\u00111\u008d \u0006Ð\u008aO5ÿ\u0091n\b\u009e\u008e\r\u0018½\u0092,\u001a\\\u008c\u0000M\u0090\r \u009f±\u0014A\u0098Ò-b\u0093ó\u001c\u0083\u008f\u0000c\u0090\u0010 \u0093±SA\u0099Ò\u0003b\u008aó\u0015\u0083\u0097\u0014\u0005¤\u00935\u0006Å\u0080V\u0012æ\u0091w\u001a\u0007Þ\u0098\u0006(\u008f¹\u000fIÂÚ\u0006j\u0098û\b\u008b\u0081\u001c\u0003¬È=(Í\u0096^\u0002î\u008b\u007f\u0005\u000f¶ 60»Á*\u0000M\u0090\r \u009f±\u0014A\u0098Ò-b\u0093ó\u001c\u0083\u008f\u0014;¤\u009f5\u0006Å\u0080V\u0016æ\u009cw\u0014\u0007\u0082\u0000V\u0090\u001e \u008d±\tA½Ò\u0018b\u008eó\u0010\u0083\u008e\u0014\u001e¤\u00825\f\u0000c\u0090\u0010 \u0093±SA\u0099Ò\u0003b\u008aó\u0015\u0083\u0097\u0014\u0005¤\u00935\u0006Å\u0080V\u0012æ\u0091w\u001a\u0007Þ\u0098\u0006(\u008f¹\u000fIÂÚ\u001dj\u008bû\u001a\u008b\u009c\u001cI¬\u0087=\u0006Í\u0090^\nî\u0094\u007f\b\u000f\u0094 &0ðÁ\u000bQ½â(r®\u0003\u0018\u0093»$#´¿E#Õ½f'ö«\u0000V\u0090\u001e \u008d±\tAªÒ\u0012b\u009fó\u000e\u0000c\u0090\u0010 \u0093±SA\u0099Ò\u0003b\u008aó\u0015\u0083\u0097\u0014\u0005¤\u00935\u0006Å\u0080V\u0012æ\u0091w\u001a\u0007Þ\u0098\u0006(\u008f¹\u000fIÂÚ\u001dj\u008bû\u001a\u008b\u009c\u001cI¬\u0087=\u0006Í\u0090^\nî\u0094\u007f\b\u000f\u0094 &0ðÁ\u000bQ½â(r®\u0003\u000f\u0093±$2´¡B^Ò\u001eb\u008có\u0007\u0003\u008b\u0090) \u008d±<Á\u0082V\u0001æ\u0092\u0000c\u0090\u0010 \u0093±SA\u0099Ò\u0003b\u008aó\u0015\u0083\u0097\u0014\u0005¤\u00935\u0006Å\u0080V\u0012æ\u0091w\u001a\u0007Þ\u0098\u0006(\u008f¹\u000fIÂÚ\u0006j\u0098û\b\u008b\u0081\u001c\u0003¬È=(Í\u0096^\u0002î\u008b\u007f\u0005\u000f¡ ;0\u0088Á4Q¹â,\u0000V\u0090\u001e \u008d±\tAªÒ\u0012b\u009fó\u000e\u0083´\u0014\u001e¤\u00855\u0001Å\u0091V\u001dæ\u0097w\u0003\u0000R\u0090\u001a \u008f±\bA\u0099Ò\bb\u008eó<\u0083\u0080\u0014\u0003¤\u00935\u001bÅ\u0087V\u001aæ\u009dw\u001fÁ\u0090Qíá}pÎ\u0080b\u0013ÿ£}2âBnÕùe@ôæ\u0004n\u0000g\u0090\u001a \u008a±+A\u0095Ò\u001fb\u009fó\u0016\u0083¹\u0014\u0013¤\u009b\u0000g\u0090\u001a \u008a±?A\u0089Ò\u0015b\u009eó\u0015\u0083\u009dúêj\u0097Ú\u0007K´»\u0018(\u0085\u0098\u0007\t\u0098y\u0014î\u0083\u0000g\u0090\u001a \u008a±9A\u0095Ò\bb\u008aó\u0015\u0083\u0099\u0014\u000e¤´5\u0014Å\u009aV\u001dæ\u0097w\u0003T\u0015ÄhtøåM\u0015ï\u0086g6æ§n×ø@@ðüas\u0091Ö\u0002s²ï#wSíÌQ|õíl\u001dê\u008dz\u001d\u0007\u00ad\u0097<6Ì\u0088_\u0002ï\u0082~\u000bt\u001aägT÷ÅA5å¦i\u0016ê\u0087e÷ì`d\u0000g\u0090\u001a \u008a±>A\u008eÒ\u001eb\u009bó\r\u0083\u0091\u0014\u0001¤\u00935<Å\u0090\u0007ï\u0097\u0092'\u0002¶¥F\u0018Õ\u0092e\u0011ô\u0094\u0084\u001d\u0013\u009a£\u00102\u0089Â5Q\u009fLÓÜ®l>ý\u0088\r,\u009e\u009b.7¿½Ï)\u0097%\u0007X·È&lÖÛEUõÔd^\u0014È\u0083|3ÐÍË]¢í2|\u008c\u008c*\u001f·¯'>³N3Ù»i'ø¹\b%\u009bª+&º\u0085Ê!U¤å\"t°\u0084:\u0017¶§ \u0000s\u0090\u001a \u008a±/A\u0099Ò\fb\u009bó\u000b\u0083\u009c\u0014\u0012¤\u009259Å\u009dV\u0000æ\u0086w\u0014\u0007\u009e\u0098\n(\u009c\u008b\"\u001bK«Û:nÊÌYDéÅxM\bÛ\u009fj/Î¾WNÑÝGmÍüE\u008cÓ\u0000g\u0090\u001a \u008a±8A\u0084Ò\u000fbªó\u000b\u0083\u0097\u0014\u0003¤\u009959Å\u009dV\u0000æ\u0086\u0000g\u0090\u001a \u008a±?A\u0085Ò\u000fb\u009fó*\u0083\u008c\u0014\u0005¤\u009f5\u001bÅ\u0093\u008cW\u001c3¬¿=-Í\u009a^:î½\u007f%\u000f£\u0098%(\u0097¹/I\u0092Ú2jµû-\u008b«\u0014=".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1179);
        f835 = cArr;
        f832 = 6037730182928830591L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Ad.Video m844(Ad ad) {
        int i = 2 % 2;
        int i2 = f833 + 17;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video videoM843 = m843(ad);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = f834 + 51;
        f833 = i5 % 128;
        int i6 = i5 % 2;
        return videoM843;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m845(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f833 + 95;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String strM864 = m864(display);
        int i4 = f834 + 73;
        f833 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM864;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m846(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f833 + 9;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String strM875 = m875(adRequestParameters);
        int i4 = f834 + 47;
        f833 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return strM875;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m852(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f833 + 45;
        f834 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            m874(ad, i);
            super.hashCode();
            throw null;
        }
        String strM874 = m874(ad, i);
        int i4 = f834 + 119;
        f833 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM874;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m853(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f833 + 71;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> listM847 = m847(banner);
        int i4 = f833 + 83;
        f834 = i4 % 128;
        if (i4 % 2 == 0) {
            return listM847;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ByteString m854(Any any) {
        int i = 2 % 2;
        int i2 = f833 + 91;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        ByteString byteStringM863 = m863(any);
        int i4 = f833 + 37;
        f834 = i4 % 128;
        int i5 = i4 % 2;
        return byteStringM863;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Ad.Display.Banner m855(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f833 + 49;
        f834 = i2 % 128;
        if (i2 % 2 == 0) {
            return m849(display);
        }
        m849(display);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Ad.Display m856(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 13;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display displayM850 = m850(ad);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return displayM850;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m857(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f834 + 33;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String strM851 = m851(byteString);
        int i4 = f833 + 105;
        f834 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return strM851;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m859(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f833 + 49;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String strM867 = m867(adRequestParameters);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return strM867;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m861(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f833 + 117;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        m876(bannerView, bannerListener);
        int i4 = f833 + 85;
        f834 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m865(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f834 + 79;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String strM872 = m872(video);
        int i4 = f833 + 7;
        f834 = i4 % 128;
        int i5 = i4 % 2;
        return strM872;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m866(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f833 + 59;
        f834 = i3 % 128;
        if (i3 % 2 == 0) {
            return m858(ad, i);
        }
        m858(ad, i);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m868(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f833 + 49;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String strM860 = m860(requestExtension);
        int i4 = f833 + 53;
        f834 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM860;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ List m869(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 77;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> listM841 = m841(ad);
        int i4 = f833 + 39;
        f834 = i4 % 128;
        int i5 = i4 % 2;
        return listM841;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m870(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f833 + 25;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        m848(interstitialAd, interstitialListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m873(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 63;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String strM842 = m842(ad);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return strM842;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m877(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f834 + 81;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        m862(rewardedAd, rewardedListener);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }

    public bj(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        hw hwVarM2297;
        Class<BidMachine> cls;
        String strM871;
        int i = 2 % 2;
        int i2 = f833 + 43;
        f834 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                hwVarM2297 = hu.m2296().m2297();
                cls = BidMachine.class;
                strM871 = m871(ViewConfiguration.getEdgeSlop() << 115, 118 >>> Gravity.getAbsoluteGravity(0, 1), (char) ((-1) >> ((byte) KeyEvent.getModifierMetaStateMask())));
            } else {
                hwVarM2297 = hu.m2296().m2297();
                cls = BidMachine.class;
                strM871 = m871(ViewConfiguration.getEdgeSlop() >> 16, Gravity.getAbsoluteGravity(0, 0) + 12, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())));
            }
            return hwVarM2297.m2344(cls, strM871.intern());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        byte b;
        int i = 2 % 2;
        int i2 = f834 + 107;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -2127904484:
                if (!str.equals(m871((ViewConfiguration.getJumpTapTimeout() >> 16) + 381, 17 - Color.argb(0, 0, 0, 0), (char) (60678 - View.combineMeasuredStates(0, 0))).intern())) {
                    b = -1;
                } else {
                    int i4 = f834 + 49;
                    f833 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.ESC;
                }
                break;
            case -2032115546:
                b = !str.equals(m871(188 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : Ascii.SO;
                break;
            case -1921270373:
                b = !str.equals(m871(Process.getGidForName("") + 739, TextUtils.getTrimmedLength("") + 12, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case -1798479256:
                b = !str.equals(m871(750 - (ViewConfiguration.getJumpTapTimeout() >> 16), 48 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case -1683121555:
                b = !str.equals(m871(177 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 12, (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1628534628:
                b = !str.equals(m871(676 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 9, (char) ('0' - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -1627944928:
                b = !str.equals(m871((KeyEvent.getMaxKeyCode() >> 16) + InterfaceC0280i1.d.b.j, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, (char) (61162 - KeyEvent.normalizeMetaState(0))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1518365947:
                b = !str.equals(m871(AndroidCharacter.getMirror('0') + 849, AndroidCharacter.getMirror('0') - ' ', (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -1507727624:
                b = !str.equals(m871(281 - KeyEvent.normalizeMetaState(0), 37 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 34977)).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case -1371195010:
                b = !str.equals(m871(245 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getEdgeSlop() >> 16) + 12, (char) Color.alpha(0)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case -1246480821:
                if (!str.equals(m871(449 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 19, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 15481)).intern())) {
                    b = -1;
                } else {
                    int i6 = f834 + 121;
                    f833 = i6 % 128;
                    b = i6 % 2 == 0 ? (byte) 53 : Ascii.RS;
                }
                break;
            case -1146475727:
                b = !str.equals(m871(TextUtils.getOffsetBefore("", 0) + 797, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case -1087582685:
                b = !str.equals(m871(635 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 17, (char) (40094 - View.MeasureSpec.getSize(0))).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -1011229113:
                b = !str.equals(m871(588 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45, (char) Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -838844802:
                if (!str.equals(m871((ViewConfiguration.getKeyRepeatDelay() >> 16) + 805, 43 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern())) {
                    b = -1;
                } else {
                    int i7 = f833 + 17;
                    f834 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 45;
                }
                break;
            case -642689680:
                b = !str.equals(m871(722 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - TextUtils.getTrimmedLength(""), (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -609786639:
                if (!str.equals(m871(355 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 10, (char) KeyEvent.keyCodeFromString("")).intern())) {
                    b = -1;
                } else {
                    int i9 = f833 + 97;
                    f834 = i9 % 128;
                    b = i9 % 2 == 0 ? Ascii.EM : (byte) 89;
                }
                break;
            case -589219056:
                b = str.equals(m871(12 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (ViewConfiguration.getTapTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) 0 : (byte) -1;
                break;
            case -572702516:
                b = !str.equals(m871((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 71, 9 - Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 18456)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -475472046:
                b = !str.equals(m871((ViewConfiguration.getScrollDefaultDelay() >> 16) + 41, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 52362)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -211807062:
                b = !str.equals(m871(167 - (Process.myTid() >> 22), 9 - ImageFormat.getBitsPerPixel(0), (char) (23390 - TextUtils.lastIndexOf("", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -150492023:
                b = !str.equals(m871(272 - Gravity.getAbsoluteGravity(0, 0), 8 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 2115:
                b = !str.equals(m871((-16776702) - Color.rgb(0, 0, 0), (-16777214) - Color.rgb(0, 0, 0), (char) (Color.rgb(0, 0, 0) + 16787345)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1282165:
                b = !str.equals(m871(View.combineMeasuredStates(0, 0) + 685, TextUtils.indexOf((CharSequence) "", '0') + 37, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 3368703:
                b = !str.equals(m871(TextUtils.getCapsMode("", 0, 0) + 25, 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18241)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 141091039:
                b = !str.equals(m871((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 528, 40 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.combineMeasuredStates(0, 0) + 18155)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 320151695:
                if (!str.equals(m871(212 - (Process.myTid() >> 22), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (26483 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern())) {
                    b = -1;
                } else {
                    int i10 = f833 + 79;
                    f834 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 16;
                }
                break;
            case 503762424:
                b = !str.equals(m871(TextUtils.getTrimmedLength("") + 34, 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 529939434:
                b = !str.equals(m871(98 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 7 - ExpandableListView.getPackedPositionGroup(0L), (char) (37896 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 625873720:
                b = !str.equals(m871(ExpandableListView.getPackedPositionType(0L) + 859, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 38, (char) ((-1) - MotionEvent.axisFromString(""))).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 713768498:
                b = !str.equals(m871(339 - ExpandableListView.getPackedPositionChild(0L), 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (10491 - Color.alpha(0))).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 737636858:
                b = !str.equals(m871(467 - View.MeasureSpec.getSize(0), Color.blue(0) + 47, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.US;
                break;
            case 742497451:
                b = !str.equals(m871(411 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - View.MeasureSpec.getMode(0), (char) Color.green(0)).intern()) ? (byte) -1 : Ascii.GS;
                break;
            case 745946635:
                b = !str.equals(m871(374 - AndroidCharacter.getMirror('0'), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SI, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4980)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 961844241:
                b = !str.equals(m871(KeyEvent.normalizeMetaState(0) + 126, 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1125320581:
                b = !str.equals(m871((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + InterfaceC0280i1.c.b.d, 8 - MotionEvent.axisFromString(""), (char) (34003 - (Process.myTid() >> 22))).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case 1165508119:
                if (!str.equals(m871(60 - Process.getGidForName(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43371)).intern())) {
                    b = -1;
                } else {
                    int i12 = f833 + 69;
                    f834 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 4;
                }
                break;
            case 1212533506:
                b = !str.equals(m871(365 - Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 16, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : Ascii.SUB;
                break;
            case 1297340448:
                if (!str.equals(m871((ViewConfiguration.getScrollBarSize() >> 8) + 226, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, (char) (KeyEvent.normalizeMetaState(0) + 59760)).intern())) {
                    b = -1;
                } else {
                    int i14 = f834 + 63;
                    f833 = i14 % 128;
                    b = i14 % 2 != 0 ? (byte) 17 : (byte) 100;
                }
                break;
            case 1387614166:
                b = !str.equals(m871(80 - (ViewConfiguration.getTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 19, (char) (42941 - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1395486086:
                b = !str.equals(m871(515 - TextUtils.lastIndexOf("", '0'), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1444286894:
                b = !str.equals(m871(569 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 35;
                break;
            case 1461955341:
                b = !str.equals(m871(398 - View.MeasureSpec.getMode(0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (28958 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : Ascii.FS;
                break;
            case 1494941328:
                b = !str.equals(m871(913 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 16, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 49;
                break;
            case 1917129446:
                b = !str.equals(m871((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + InputDeviceCompat.SOURCE_KEYBOARD, TextUtils.getOffsetAfter("", 0) + 14, (char) (ExpandableListView.getPackedPositionChild(0L) + 44715)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1955913096:
                if (!str.equals(m871(107 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern())) {
                    b = -1;
                } else {
                    int i15 = f833 + 107;
                    f834 = i15 % 128;
                    int i16 = i15 % 2;
                    b = 8;
                }
                break;
            case 2034998687:
                b = !str.equals(m871(848 - (ViewConfiguration.getLongPressTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 11, (char) (MotionEvent.axisFromString("") + 16916)).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 2110329530:
                if (!str.equals(m871(318 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 8, (char) (33936 - TextUtils.getOffsetAfter("", 0))).intern())) {
                    b = -1;
                } else {
                    int i17 = f834 + 115;
                    f833 = i17 % 128;
                    int i18 = i17 % 2;
                    b = 22;
                }
                break;
            case 2112955383:
                b = !str.equals(m871((ViewConfiguration.getDoubleTapTimeout() >> 16) + 651, 25 - (KeyEvent.getMaxKeyCode() >> 16), (char) (55062 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2136410007:
                b = !str.equals(m871(Color.rgb(0, 0, 0) + 16777352, 30 - ImageFormat.getBitsPerPixel(0), (char) (42165 - KeyEvent.getDeadChar(0, 0))).intern()) ? (byte) -1 : Ascii.VT;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case 8:
                return AdView.class;
            case 9:
                return BannerListener.class;
            case 10:
            case 11:
                return BannerView.class;
            case 12:
                return BidMachine.class;
            case 13:
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return VideoPlayerActivity.class;
            case 32:
                return Ad.class;
            case 33:
            case 34:
                return MraidActivity.class;
            case 35:
            case 36:
                return MraidDialogActivity.class;
            case 37:
                return MraidInterstitial.class;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return MraidInterstitialListener.class;
            case 39:
            case 40:
                return MraidView.class;
            case 41:
                return MraidViewListener.class;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return VastActivity.class;
            case 44:
            case 45:
                return VastView.class;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return MraidAdView.class;
            case 48:
                return VastViewListener.class;
            case 49:
                return RequestExtension.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m871(TextUtils.indexOf("", "", 0, 0) + 929, TextUtils.indexOf("", "", 0) + 13, (char) (49655 - TextUtils.getOffsetBefore("", 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m845((Ad.Display) list.get(0));
            }
        });
        map.put(m871(KeyEvent.normalizeMetaState(0) + 942, 11 - TextUtils.getOffsetAfter("", 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m865((Ad.Video) list.get(0));
            }
        });
        map.put(m871(ExpandableListView.getPackedPositionChild(0L) + 954, (-16777207) - Color.rgb(0, 0, 0), (char) View.getDefaultSize(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m866((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m871((ViewConfiguration.getKeyRepeatDelay() >> 16) + 962, 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Color.argb(0, 0, 0, 0) + 64141)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m856((Ad) list.get(0));
            }
        });
        map.put(m871(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 973, 16 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m855((Ad.Display) list.get(0));
            }
        });
        map.put(m871((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 988, 21 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 21618)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m853((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m871((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1009, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (KeyEvent.normalizeMetaState(0) + 36125)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m844((Ad) list.get(0));
            }
        });
        map.put(m871((ViewConfiguration.getKeyRepeatDelay() >> 16) + PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.indexOf("", "", 0, 0) + 29821)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m852((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m871(TextUtils.indexOf("", "") + IronSourceError.ERROR_RV_LOAD_DURING_SHOW, (Process.myTid() >> 22) + 13, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m873((Ad) list.get(0));
            }
        });
        map.put(m871(1040 - KeyEvent.keyCodeFromString(""), 14 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1928 - Color.green(0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m859((AdRequestParameters) list.get(0));
            }
        });
        map.put(m871(View.resolveSizeAndState(0, 0, 0) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, TextUtils.lastIndexOf("", '0', 0) + 10, (char) (TextUtils.lastIndexOf("", '0') + 19637)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m846((AdRequestParameters) list.get(0));
            }
        });
        map.put(m871((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1062, Color.argb(0, 0, 0, 0) + 11, (char) (38723 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m868((RequestExtension) list.get(0));
            }
        });
        map.put(m871(1075 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 23, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52663)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bj.m870((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m871(1096 - Process.getGidForName(""), 18 - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bj.m877((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m871((Process.myPid() >> 22) + 1116, 17 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0') + 35666)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bj.m861((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m871((KeyEvent.getMaxKeyCode() >> 16) + 1133, Color.green(0) + 15, (char) ('0' - AndroidCharacter.getMirror('0'))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m869((Ad) list.get(0));
            }
        });
        map.put(m871(TextUtils.indexOf("", "", 0) + 1148, 13 - ExpandableListView.getPackedPositionType(0L), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m854((Any) list.get(0));
            }
        });
        map.put(m871(1161 - View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) + 18, (char) (ExpandableListView.getPackedPositionType(0L) + 35893)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bj.m857((ByteString) list.get(0));
            }
        });
        int i2 = f833 + 99;
        f834 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m864(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f834 + 117;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String adm = display.getAdm();
        int i4 = f834 + 37;
        f833 = i4 % 128;
        int i5 = i4 % 2;
        return adm;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m872(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f833 + 121;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String adm = video.getAdm();
        int i4 = f833 + 125;
        f834 = i4 % 128;
        int i5 = i4 % 2;
        return adm;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m858(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f833 + 43;
        f834 = i3 % 128;
        int i4 = i3 % 2;
        String bundle = ad.getBundle(i);
        int i5 = f834 + 17;
        f833 = i5 % 128;
        if (i5 % 2 != 0) {
            return bundle;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Ad.Display m850(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 35;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display display = ad.getDisplay();
        int i4 = f834 + 73;
        f833 = i4 % 128;
        int i5 = i4 % 2;
        return display;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Ad.Display.Banner m849(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f834 + 49;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner banner = display.getBanner();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = f833 + 69;
        f834 = i5 % 128;
        if (i5 % 2 == 0) {
            return banner;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Any> m847(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f834 + 83;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        int i4 = f834 + 93;
        f833 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Ad.Video m843(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 39;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video video = ad.getVideo();
        int i4 = f834 + 69;
        f833 = i4 % 128;
        if (i4 % 2 != 0) {
            return video;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static List<Any> m841(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 39;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = ad.getExtProtoList();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = f833 + 97;
        f834 = i5 % 128;
        if (i5 % 2 == 0) {
            return extProtoList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ByteString m863(Any any) {
        int i = 2 % 2;
        int i2 = f834 + InterfaceC0280i1.d.b.i;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        ByteString value = any.getValue();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return value;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m851(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f834 + 79;
        f833 = i2 % 128;
        if (i2 % 2 != 0) {
            return byteString.toStringUtf8();
        }
        byteString.toStringUtf8();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m874(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f834 + 35;
        f833 = i3 % 128;
        int i4 = i3 % 2;
        String adomain = ad.getAdomain(i);
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        int i6 = f834 + 11;
        f833 = i6 % 128;
        int i7 = i6 % 2;
        return adomain;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m842(Ad ad) {
        int i = 2 % 2;
        int i2 = f834 + 53;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String id = ad.getId();
        int i4 = f833 + 3;
        f834 = i4 % 128;
        if (i4 % 2 == 0) {
            return id;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m867(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f834 + 45;
        f833 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adRequestParameters.getPlacementId();
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m875(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f833 + 113;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String name = adRequestParameters.getAdsType().getName();
        int i4 = f833 + 63;
        f834 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m860(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f833 + 125;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        String sellerId = requestExtension.getSellerId();
        int i4 = f833 + 67;
        f834 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return sellerId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m848(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f833 + 63;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setListener(interstitialListener);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f834 + 55;
        f833 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m862(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f833 + InterfaceC0280i1.d.b.d;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        rewardedAd.setListener(rewardedListener);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f833 + 25;
        f834 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m876(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f833 + 5;
        f834 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(bannerListener);
        int i4 = f833 + 107;
        f834 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m871(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f835[b.f638 + i]) ^ (((long) b.f638) * f832)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
