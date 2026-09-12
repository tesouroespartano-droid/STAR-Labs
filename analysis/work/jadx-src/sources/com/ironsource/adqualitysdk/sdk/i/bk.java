package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
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
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bk extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f854 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f855 = 54;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f856 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f857 = 7254043762449770966L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ boolean m882() {
        int i = 2 % 2;
        int i2 = f856 + 27;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM880 = m880();
        int i4 = f854 + InterfaceC0280i1.d.b.b;
        f856 = i4 % 128;
        int i5 = i4 % 2;
        return zM880;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Object m883() {
        int i = 2 % 2;
        int i2 = f854 + 69;
        f856 = i2 % 128;
        if (i2 % 2 != 0) {
            return m881();
        }
        m881();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Object m884() {
        int i = 2 % 2;
        int i2 = f854 + 19;
        f856 = i2 % 128;
        int i3 = i2 % 2;
        Object objM879 = m879();
        int i4 = f856 + 65;
        f854 = i4 % 128;
        int i5 = i4 % 2;
        return objM879;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m888(bk bkVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f856 + 19;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        bkVar.m895(clVar);
        int i4 = f854 + 97;
        f856 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m889(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f856 + 99;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        String strM891 = m891(cBInPlay);
        int i4 = f854 + 121;
        f856 = i4 % 128;
        int i5 = i4 % 2;
        return strM891;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m893(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f856 + 81;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        String strM885 = m885(cBInPlay);
        int i4 = f856 + 121;
        f854 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM885;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m894(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f854 + InterfaceC0280i1.d.b.d;
        f856 = i2 % 128;
        int i3 = i2 % 2;
        m887(chartboostDelegate);
        int i4 = f854 + 19;
        f856 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m896(bk bkVar) {
        int i = 2 % 2;
        int i2 = f854 + 11;
        f856 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m878();
            super.hashCode();
            throw null;
        }
        boolean zM878 = m878();
        int i3 = f854 + 35;
        f856 = i3 % 128;
        if (i3 % 2 != 0) {
            return zM878;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ a m897(bk bkVar, ChartboostDelegate chartboostDelegate, cl clVar) {
        int i = 2 % 2;
        int i2 = f856 + InterfaceC0280i1.d.b.i;
        f854 = i2 % 128;
        if (i2 % 2 == 0) {
            return bkVar.m890(chartboostDelegate, clVar);
        }
        bkVar.m890(chartboostDelegate, clVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bk(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x02fd  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        byte b = 1;
        switch (str.hashCode()) {
            case -1602236458:
                if (!str.equals(m892("\ue982䀷몑ᔌ俿ꙫჅ䪰ꔥι瘀ꃦᭀ痕꾾ؤ炉ꭦ״类훏µ笑햄౿曹텝", TextUtils.getTrimmedLength("") + 43411).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1251618628:
                if (!str.equals(m886("�ￛ\u0011\uffff\u0003\ufff0\b\t\u0003\r\r\uffff\f\n\u0007￣ￜ\uffdd\u0013\u000e\u0003\u0010\u0003\u000e", 18 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 156, true, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case -921117961:
                if (!str.equals(m886("\r\r\u0003\t\bￛ�\u000e\u0003\u0010\u0003\u000e\u0013\uffddￜ￣\u0007\n\f\uffff", 13 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 156, false, Color.alpha(0) + 20).intern())) {
                    b = -1;
                } else {
                    int i2 = f854 + 125;
                    f856 = i2 % 128;
                    int i3 = i2 % 2;
                }
                break;
            case -869710636:
                if (!str.equals(m892("\ue995핏違彷ᩦ\ud901萟䌮อ췛製矮㋮\uf182벎箠⚲\ue5ae", Color.rgb(0, 0, 0) + 16792817).intern())) {
                    b = -1;
                } else {
                    int i4 = f854 + 31;
                    f856 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 0;
                }
                break;
            case -513187163:
                if (!str.equals(m886("\f\u000b\u0007\u0007\ufffa\f\n\ufff9\u0000ￛ", 10 - Color.red(0), 206 - AndroidCharacter.getMirror('0'), true, 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -416101408:
                if (!str.equals(m886("\u0004\u000e\u000e\u0000\r\u000b\b￤\uffdd\uffde\u0014\u000f\u0004\u0011\u0004\u000f\ufffeￜ\u0014\ufffe￼\u0002\u0000\uffe7\t\n", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 154, true, 26 - Color.blue(0)).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -371244199:
                if (!str.equals(m886("\u0010\u000f￤￣￮\u0006\u0005\n\u0002\u0015\n", ((byte) KeyEvent.getModifierMetaStateMask()) + 3, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 148, false, KeyEvent.keyCodeFromString("") + 11).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -352872024:
                if (!str.equals(m886("\u0003\u000e\u000e\u0004\u0003\u0005\r￣\u0006￥", 7 - TextUtils.getCapsMode("", 0, 0), 148 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, (KeyEvent.getMaxKeyCode() >> 16) + 10).intern())) {
                    b = -1;
                } else {
                    b = Ascii.FF;
                }
                break;
            case -305846637:
                if (!str.equals(m886("\u0014\ufffe\u000f\u0001\u0002\u0001￠\ufffe\t\t\uffff\ufffe\u0000\b\uffef\u0002", TextUtils.indexOf((CharSequence) "", '0', 0) + 15, 154 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i6 = f854 + 93;
                    f856 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 15;
                }
                break;
            case -221039695:
                if (!str.equals(m892("\ue99f䇕른ჴ䠐ꎄᬬ獄\uaacaɪ緵픕ಉ搾\udc4c㟙潤욊㸟榪", 43117 - View.combineMeasuredStates(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SO;
                }
                break;
            case -174936018:
                if (!str.equals(m886("\u0000\u0012￼\r\uffff\u0000\uffff￭", 7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 155 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 7 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 2115:
                if (!str.equals(m892("\ue997쾇", 9781 - KeyEvent.keyCodeFromString("")).intern())) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 296803428:
                if (!str.equals(m886("\t\t\uffff\ufffe\u0000\b￡\u0006\u0010\n\u0006\u0010\u0010\u0006\uffff\t\u0002\uffde\u0001￠\ufffe", 6 - View.getDefaultSize(0, 0), KeyEvent.keyCodeFromString("") + 153, false, 21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 544981520:
                if (!str.equals(m886("\u000f\ufffe\u0005\u0000ￋ\n\f\u0000\u0016\u0011\u0006\u0013\u0006\u0011\u0000\uffde\u000b\f\u0006\u0010\u0010\u0002\u000f\r\n￦\uffdf￠ￋ\u0014\u0002\u0006\u0013ￋ\b\u0001\u0010ￋ\u0011\u0010\f\f\uffff\u0011", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 153, true, 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i8 = f854 + 5;
                    f856 = i8 % 128;
                    b = i8 % 2 != 0 ? (byte) 18 : (byte) 102;
                }
                break;
            case 604162924:
                if (!str.equals(m892("\ue9b5瞚헽㎑鄹１嵥뭑ᢺ暏쓧∸老\uee65䰒궨ஂ槮\uf78e唣댏ᅮ纵\udc90㫧颓\ue61b䐥ꉋL憼쾙ⷓ謦\ue903睶핕㊷邥ﻠ峚먤\u181e晞잦█", Drawable.resolveOpacity(0, 0) + 40483).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 650412337:
                if (!str.equals(m886("\u000f\u0004\n\t￨\n\uffff\u0000\u0007￨\u0000\uffff\u0004￼", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, Color.alpha(0) + ModuleDescriptor.MODULE_VERSION, false, 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 753858215:
                if (!str.equals(m892("\ue985ఱ⊑夝翮鉊装꺿씢ﮟḉ㓤⭙", 58771 - Color.alpha(0)).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 769047372:
                if (!str.equals(m886("\n\ufffb\b\t\n\uffff\n\uffff\ufff7\u0002\uffdf\u0004", 9 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 160, false, 11 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    b = -1;
                } else {
                    int i9 = f854 + 49;
                    f856 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 10;
                }
                break;
            case 1443881784:
                if (!str.equals(m892("\ue995ŏ㠩匩䫪旽鲕둒", AndroidCharacter.getMirror('0') + 59563).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return Chartboost.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return a.class;
            case 7:
            case 8:
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 9:
                return Ad.class;
            case 10:
                return Interstitial.class;
            case 11:
                return Rewarded.class;
            case 12:
                return AdCallback.class;
            case 13:
                return DismissibleAdCallback.class;
            case 14:
                return InterstitialCallback.class;
            case 15:
                return RewardedCallback.class;
            case 16:
                return StartCallback.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f854 + 27;
        f856 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return Chartboost.getSDKVersion();
            }
            Chartboost.getSDKVersion();
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Error unused) {
            return m892("\ue9e0岟茩짍㱺", ExpandableListView.getPackedPositionGroup(0L) + 46439).intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m892("\ue9a5ઊ⿐䀩敐馏뫥\udf35\uf07bᒰ\u098d⫑伟", 58169 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bk.m888(bk.this, clVar);
                return null;
            }
        });
        map.put(m886("\ufffa\r\ufffe\u0000\ufffe\rￜ\u0001\ufffa\u000b\r\ufffb\b\b\f\r\uffdd\ufffe\u0005\ufffe\u0000", Color.green(0) + 3, Process.getGidForName("") + 158, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bk.m883();
            }
        });
        map.put(m892("\ue9b1乐ꙤḼ瘲께۶纗횬ག杧\udf64㜆漇임㿄韒쾚␐鱋\uf40fⰥ萱ﳔ哿貉\ue4bd", 42979 - Drawable.resolveOpacity(0, 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bk.m884();
            }
        });
        map.put(m892("\ue9b5텅顱䌔ਦ\uf5d6별枳⺝ᙗ텽頏䌮\u0ad9\uf5f7벖枵⽓ᙀ턀頮䏆૧\uf580벺摊", 14562 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bk.m897(bk.this, (ChartboostDelegate) list.get(0), clVar);
            }
        });
        map.put(m892("\ue9a5ꐲ犠Ė\udfba樲㢢\uf725薼倰\ueeb3봮䮮؟풽挵ㆣ찠骥⤱\ue7a7", 19841 - TextUtils.getOffsetBefore("", 0)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bk.m894((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m892("\ue9bf鲞Ϸ똂㵘ꎧ囝\udd2e䁹\uf680緶\ue03e靰ᩅ肉㟇", 30010 - TextUtils.lastIndexOf("", '0')).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bk.m882());
            }
        });
        map.put(m886("￤\u0007\ufffb\ufff9\f\u0001\u0007\u0006\uffff�\f", TextUtils.getCapsMode("", 0, 0) + 8, 157 - MotionEvent.axisFromString(""), false, 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bk.m889((CBInPlay) list.get(0));
            }
        });
        map.put(m892("\ue9b1㉄幌穲虺ꉵ칒\uea76㘃刜", 56311 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bk.m893((CBInPlay) list.get(0));
            }
        });
        map.put(m886("\u0002\u0011\ufffe\u0004\u0002\t\u0002￡\uffff\ufff1\u0010\u0006", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 153, true, TextUtils.indexOf("", "") + 12).intern(), new bg.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bk.m896(bk.this));
            }
        });
        int i2 = f854 + 27;
        f856 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m895(cl clVar) {
        int i = 2 % 2;
        int i2 = f854 + 3;
        f856 = i2 % 128;
        int i3 = i2 % 2;
        m887(m890((ChartboostDelegate) m881(), clVar));
        int i4 = f856 + 125;
        f854 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private a m890(ChartboostDelegate chartboostDelegate, cl clVar) {
        int i = 2 % 2;
        a aVar = new a(chartboostDelegate, clVar);
        int i2 = f856 + 27;
        f854 = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m887(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f856 + 121;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Chartboost.setDelegate(chartboostDelegate);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f854 + 87;
        f856 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m878() {
        int i = 2 % 2;
        int i2 = f856 + 31;
        f854 = i2 % 128;
        if (i2 % 2 == 0) {
            return m881() instanceof a;
        }
        boolean z = m881() instanceof a;
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m880() {
        int i = 2 % 2;
        int i2 = f856 + 123;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i4 = f856 + 3;
        f854 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsWebViewEnabled;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m891(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f856 + 121;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        String location = cBInPlay.getLocation();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return location;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m885(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f856 + 61;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        String appName = cBInPlay.getAppName();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = f856 + 39;
        f854 = i5 % 128;
        int i6 = i5 % 2;
        return appName;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Object m881() {
        int i = 2 % 2;
        int i2 = f856 + 77;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i4 = f854 + 119;
        f856 = i4 % 128;
        int i5 = i4 % 2;
        return delegate;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Object m879() {
        int i = 2 % 2;
        int i2 = f856 + 7;
        f854 = i2 % 128;
        int i3 = i2 % 2;
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
        if (i3 == 0) {
            return aVar;
        }
        throw null;
    }

    class a extends ChartboostDelegate implements hg<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f867 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f868;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f869;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f870;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ChartboostDelegate f871;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cl f872;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\u0002j\u00ad\u0085]À\r\u0017½Ml\u009f\u001cÞÌ\u001a|z/¹ßÅ\u008f ?uî¸\u009eöN4þ\u001d®HYÏ\tÖ¹\u0011iR\u0018\u0084ÈÙx-(_Û¤\u008bô;,ëx\u009a¢Jáúàª\u0003ZU\u0005\u0080µËe\u000e\u0015EÄ\u009ctý$$Ô`\u0087©\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bÿ»8k{\u001a\u00adÊðz\u0004*`Ù\u0081\u0089ß9\u0000éX\u0098\u0099HÅøÉ¨*X|\u0007©·âg'\u0017lÆµvÔ&\rÖI\u0085\u0080\u0011\u001c¾óN¶\u001ea®;\u007fé\u000f¨ßlo\f<ÏÌ³\u009cV,\u0003ýÎ\u008d\u0080]Bík½>J¹\u001a·ªfz/\u000bÄÛ¢k\\;\u0013ÈÒ\u0098º(Aø\u001f\u0089ÂY\u0091é¬¹oI>\u0016ç¦¦vj\u0006+\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009eÊýz\t*HÙ¼\u0089Ã9<é[\u0098\u0099HØøÉ¨*X|\u0007©·âg'\u0017lÆµvÔ&\rÖI\u0085\u0080\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009cÊõz\u0013*IÙ\u0081\u0089ß9\u0003é}\u0098\u0096HÈøå¨6X{\u0007¸·ùg \u0017qÆ½vÌ\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊðz\u000f*WÙ\u008d\u0089å9\u001eé@\u0098\u009dHÎøó¨0Xa\u0007¸·ùg5\u0017t¾\u0001\u0011îá«±|\u0001&Ðô µpqÀ\u0011\u0093Òc®3K\u0083\u001eRÓ\"\u009dò_Bv\u0012#å¤µª\u0005{Õ2¤Ùt²ÄK\u0094\u0005gÁ7§\u0087\\W\u0002&ßö\u008cF±\u0016ræ#¹ú\t»Ùw©6\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009cÊõz\u0013*TÙ\u0084\u0089Í9\té}\u0098\u0096HÈøå¨6X{\u0007¸·ùg \u0017qÆ½vÌ\r\u0005¢êR¯\u0002x²\"cð\u0013±Ãus\u0015 ÖÐª\u0080O0\u001aá×\u0091\u0099A[ñr¡'V \u0006®¶\u007ff6\u0017ÝÇµwK'\u0012ÔÂ\u0084\u008f4Bä\u0017\u0095÷E\u0094õ²¥gU<\nùº¢j{\u001a*Ëó{\u0087+ND\u001fëð\u001bµKbû8*êZ«\u008ao:\u000fiÌ\u0099°ÉUy\u0000¨ÍØ\u0083\bA¸hè=\u001fºO£ÿd/'^ñ\u008e¬>Xn*\u009dÑÍ\u0081}Y\u00ad\rÜ×\f\u0094¼\u0091ìw\u001c&Cõó\u008d#xS4\u0082ó\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊýz\u0003*LÙ\u008d\u0089á9\u001féF\u0098\u009dHýøð¨4X{CAì®\u001cëL<üf-´]õ\u008d1=Qn\u0092\u009eîÎ\u000b~^¯\u0093ßÝ\u000f\u001f¿6ïc\u0018äHýø:(yY¯\u0089ò9\u0006ib\u009a\u0083ÊÝz\u0002ªZÛ\u009b\u000bÇ»Ïë)\u001bxD«ôÓ$&Tj\u0085\u00ad\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009eÊýz\t*HÙ¼\u0089Ã9<é[\u0098\u0099HØøÍ¨+Xz\u0007©·Ñg$\u0017hÆ¯»\u001f\u0014ðäµ´b\u00048Õê¥«uoÅ\u000f\u0096Ìf°6U\u0086\u0000WÍ'\u0083÷AGh\u0017=àº°´\u0000eÐ,¡Àq©ÁO\u0091\u0015bÝ2\u0083\u0082_R%#Ëó\u0092C¹\u0013Yã$¼à\f¿\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊðz\u000f*WÙ\u008d\u0089á9\u001féF\u0098\u009dHýøð¨4X{)É\u0086&vc&´\u0096îG<7}ç¹WÙ\u0004\u001aôf¤\u0083\u0014ÖÅ\u001bµUe\u0097Õ¾\u0085ërl\"b\u0092³Bú3\u0011ãzS\u0083\u0003Íð\t k\u0010\u0095ÀÌ±\u0017awÑz\u0081¾qñ2Ø\u009d7mr=¥\u008dÿ\\-,lü¨LÈ\u001f\u000bïw¿\u0092\u000fÇÞ\n®D~\u0086Î¯\u009eúi}9s\u0089¢Yë(\u0007ønH\u0088\u0018Ïë\u001f»V\u000b\u0092Ûâª\fzUÊ~\u009a\u009ejã5'\u0085x\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009eÊýz\t*HÙ¼\u0089Ã9\"éQ\u0098\u009bHÓøò¨ XK\u0007 ·ùg7\u0017sBÁí.\u001dkM¼ýæ,4\\u\u008c±<Ño\u0012\u009fnÏ\u008b\u007fÞ®\u0013Þ]\u000e\u009f¾¶îã\u0019dIjù»)òX\n\u0088\u007f8\u0097hÕ\u009b\u000fËm{\u009e«ßÚ\u0019\nUºDê©\u001aøE\rõ}%¸Uü\u008474Pd\u008b\u0094ËÇ\u001aw[§\u0099×Ô\u0000d¯\u00ad_ì\u000f\u001c¿qn¡\u001eëÎ9~c-\u0088ÝÁ\u008d\u000f=[ì²\u009c×L\u000eü\u0003¬k[¦\u000bê»9kf\u001aµÊýz\u0014*MÙ\u0087\u0089Â¡b\u000e\u008dþÈ®\u001f\u001eEÏ\u0097¿Öo\u0012ßr\u008c±|Í,(\u009c}M°=þí<]\u0015\r@úÇªÞ\u001a\u0019ÊZ»\u008ckÑÛ%\u008bAx (þ\u0098!Hy9¸éäYó\t\u0000ù^¦\u008c\u0016ÃÆ\u0011¶\\g\u0099××\u0087,wm$¨\u0094þ\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊýz\u0003*LÙ\u008d\u0089þ9\u0015éC\u0098\u0099HÎøä¨!Xl\u0007\u009a·ùg0\u0017}Æ³-Ê\u0082%r`\"·\u0092íC?3~ãºSÚ\u0000\u0019ðe \u0080\u0010ÕÁ\u0018±Va\u0094Ñ½\u0081èvo&a\u0096°Fù7\u0017çtW\u0080\u0007Áô5¤J\u0014µÄÒµ\u0010eQÕ[\u0085¨uö*$\u009akJ¹:ôë1[\u007f\u000b\u0084ûÅ¨\u0000\u0018V\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009cÊõz\u0013*IÙ\u0081\u0089ß9\u0003éf\u0098\u009dHËøá¨6Xl\u0007©·ôg\u0002\u0017qÆ¸vÅ&\u000b\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊðz\u000f*WÙ\u008d\u0089þ9\u0015éC\u0098\u0099HÎøä¨!Xl\u0007\u009a·ùg0\u0017}Æ³\u0088t'\u009b×Þ\u0087\t7Sæ\u0081\u0096ÀF\u0004öd¥§UÛ\u0005>µkd¦\u0014èÄ*t\u0003$VÓÑ\u0083ß3\u000eãG\u0092¬BÇò>¢pQ´\u0001É±\"at\u0010®ÀùpÓ \u0016Ð[\u008f\u00ad?Îï\u0007\u009fJN\u0084\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009bÊóz\r*TÙ\u0084\u0089É9\u0004éQ\u0098ªHÙø÷¨%Xz\u0007¨·õg0\u0017NÆµvÄ&\u0001ÖG\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bè»9kp\u001a\u009cÊõz\u0013*TÙ\u0084\u0089Í9\téf\u0098\u009dHËøá¨6Xl\u0007©·ôg\u0002\u0017qÆ¸vÅ&\u000b\u0000C¯¬_é\u000f>¿dn¶\u001e÷Î3~S-\u0090Ýì\u008d\t=\\ì\u0091\u009cßL\u001dü4¬a[æ\u000bû»9kx\u001a´ÊØz\t*WÙ\u0098\u0089À9\u0011éM\u0098®HÕøä¨!XgM\u000fâà\u0012¥Brò(#úS»\u0083\u007f3\u001f`Ü\u0090 ÀEp\u0010¡ÝÑ\u0093\u0001Q±xá-\u0016ªF¤öu&<W×\u0087±7Og\u0000\u0094ÁÄ©tR¤(ÕØ\u0005\u0091µµVáù\u000e\tKY\u009céÆ8\u0014HU\u0098\u0091(ñ{2\u008bNÛ«kþº3Ê}\u001a¿ª\u0096úÃ\rD]Jí\u009b=ÒL<\u009c_,«|ê\u008f\u001eßao\u009e¿ùÎ;\u001ez®kþ\u0088\u000eúQ\u0002áS1\u008f36\u009cÙl\u009c<K\u008c\u0011]Ã-\u0082ýFM&\u001eåî\u0099¾|\u000e)ßä¯ª\u007fhÏA\u009f\u0014h\u00938\u009d\u0088LX\u0005)äù\u0087I|\u0019%êôº¸\niÚ(«÷{¬".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1261);
            f870 = cArr;
            f869 = 552882100382576580L;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ ChartboostDelegate mo795() {
            int i = 2 % 2;
            int i2 = f868 + 87;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            ChartboostDelegate chartboostDelegateM898 = m898();
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
            return chartboostDelegateM898;
        }

        a(ChartboostDelegate chartboostDelegate, cl clVar) {
            this.f871 = chartboostDelegate;
            this.f872 = clVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ChartboostDelegate m898() {
            int i = 2 % 2;
            int i2 = f867;
            int i3 = i2 + 47;
            f868 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            ChartboostDelegate chartboostDelegate = this.f871;
            int i4 = i2 + 89;
            f868 = i4 % 128;
            int i5 = i4 % 2;
            return chartboostDelegate;
        }

        public boolean shouldRequestInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f867 + 123;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 44, (char) (View.combineMeasuredStates(0, 0) + 553)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate == null) {
                return false;
            }
            int i4 = f867 + 69;
            f868 = i4 % 128;
            int i5 = i4 % 2;
            return chartboostDelegate.shouldRequestInterstitial(str);
        }

        public boolean shouldDisplayInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f867 + 123;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 44 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate == null) {
                return false;
            }
            int i4 = f868 + 55;
            f867 = i4 % 128;
            int i5 = i4 % 2;
            boolean zShouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i6 = f867 + 99;
            f868 = i6 % 128;
            int i7 = i6 % 2;
            return zShouldDisplayInterstitial;
        }

        public void didCacheInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899((ViewConfiguration.getScrollDefaultDelay() >> 16) + 88, TextUtils.getCapsMode("", 0, 0) + 39, (char) (Color.blue(0) + 4447)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            Object obj = null;
            if (chartboostDelegate != null) {
                int i2 = f867 + 59;
                f868 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCacheInterstitial(str);
                if (i3 != 0) {
                    throw null;
                }
                int i4 = f868 + 7;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = f867 + 15;
            f868 = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            int i2 = f867 + 121;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(126 - ImageFormat.getBitsPerPixel(0), Color.argb(0, 0, 0, 0) + 44, (char) View.combineMeasuredStates(0, 0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                int i4 = f867 + 23;
                f868 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didDismissInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f867 + 93;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(171 - KeyEvent.normalizeMetaState(0), View.getDefaultSize(0, 0) + 41, (char) View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            Object obj = null;
            if (chartboostDelegate != null) {
                int i4 = f867 + 63;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDismissInterstitial(str);
                if (i5 != 0) {
                    super.hashCode();
                    throw null;
                }
            }
            int i6 = f868 + 107;
            f867 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        }

        public void didCloseInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899(View.resolveSize(0, 0) + 212, 39 - Color.red(0), (char) KeyEvent.getDeadChar(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f867 + 91;
                f868 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCloseInterstitial(str);
                if (i3 != 0) {
                    throw null;
                }
                int i4 = f868 + 105;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didClickInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 250, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 39, (char) (TextUtils.getCapsMode("", 0, 0) + 48706)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f868 + 29;
                f867 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i3 == 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            }
            int i4 = f868 + InterfaceC0280i1.d.b.b;
            f867 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didDisplayInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899(Color.rgb(0, 0, 0) + 16777506, 41 - Color.red(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f867 + 71;
                f868 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDisplayInterstitial(str);
            }
            int i4 = f868 + 49;
            f867 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didCompleteInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899(331 - (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 42, (char) (3398 - TextUtils.indexOf("", "", 0, 0))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f867 + 69;
                f868 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCompleteInterstitial(str);
                int i4 = f868 + 113;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public boolean shouldRequestMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f867 + 61;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899((ViewConfiguration.getLongPressTimeout() >> 16) + 373, 40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (17500 - TextUtils.getTrimmedLength(""))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate == null) {
                return false;
            }
            int i4 = f867 + 97;
            f868 = i4 % 128;
            if (i4 % 2 == 0) {
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            chartboostDelegate.shouldRequestMoreApps(str);
            throw null;
        }

        public void didCacheMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f867 + 73;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(413 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35, (char) (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheMoreApps(str);
            }
            int i4 = f867 + InterfaceC0280i1.d.b.d;
            f868 = i4 % 128;
            int i5 = i4 % 2;
        }

        public boolean shouldDisplayMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f868 + InterfaceC0280i1.d.b.b;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(Color.rgb(0, 0, 0) + 16777664, 39 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17154)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayMoreApps = chartboostDelegate.shouldDisplayMoreApps(str);
            int i4 = f868 + 57;
            f867 = i4 % 128;
            int i5 = i4 % 2;
            return zShouldDisplayMoreApps;
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899(488 - KeyEvent.keyCodeFromString(""), 40 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) KeyEvent.keyCodeFromString("")).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f868 + 69;
                f867 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i3 == 0) {
                    int i4 = 80 / 0;
                }
            }
            int i5 = f868 + 113;
            f867 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public void didDismissMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f868 + 63;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(528 - (KeyEvent.getMaxKeyCode() >> 16), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (View.combineMeasuredStates(0, 0) + 47964)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f867 + 81;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDismissMoreApps(str);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didCloseMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f867 + 79;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(565 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f867 + 115;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCloseMoreApps(str);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didClickMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f868 + 97;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(601 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34, (char) (10633 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f868 + 61;
                f867 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didClickMoreApps(str);
                if (i5 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didDisplayMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f867 + 21;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(View.resolveSize(0, 0) + 635, (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, (char) (12955 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f867 + 47;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayMoreApps(str);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            int i = 2 % 2;
            int i2 = f867 + 81;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(671 - Process.getGidForName(""), AndroidCharacter.getMirror('0') - '\t', (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                int i4 = f868 + 105;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            int i = 2 % 2;
            int i2 = f867 + 23;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(TextUtils.getTrimmedLength("") + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 46 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (17026 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f868 + 31;
                f867 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m899(758 - TextUtils.getCapsMode("", 0, 0), KeyEvent.keyCodeFromString("") + 28, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern(), Activity.class).invoke(this.f871, activity);
                } catch (Throwable unused) {
                }
            }
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f867 + 33;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899((Process.myTid() >> 22) + 786, AndroidCharacter.getMirror('0') - 3, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41250)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate == null) {
                return false;
            }
            int i4 = f867 + 35;
            f868 = i4 % 128;
            int i5 = i4 % 2;
            boolean zShouldDisplayRewardedVideo = chartboostDelegate.shouldDisplayRewardedVideo(str);
            int i6 = f868 + 113;
            f867 = i6 % 128;
            if (i6 % 2 != 0) {
                return zShouldDisplayRewardedVideo;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public void didCacheRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f867 + 33;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(TextUtils.getOffsetBefore("", 0) + 831, 39 - ImageFormat.getBitsPerPixel(0), (char) View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f868 + 33;
                f867 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCacheRewardedVideo(str);
                if (i5 == 0) {
                    int i6 = 26 / 0;
                }
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899(871 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45, (char) (11657 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f868 + 91;
                f867 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
                int i4 = f867 + 61;
                f868 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
            }
        }

        public void didDismissRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f868 + 23;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 915, (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (char) KeyEvent.keyCodeFromString("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDismissRewardedVideo(str);
                int i4 = f868 + 69;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCloseRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f867 + 119;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(((byte) KeyEvent.getModifierMetaStateMask()) + 959, 40 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseRewardedVideo(str);
                int i4 = f868 + 61;
                f867 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didClickRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f868 + 15;
            f867 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(998 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39, (char) ((Process.myTid() >> 22) + 34871)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickRewardedVideo(str);
                int i4 = f867 + 15;
                f868 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 2;
                }
            }
        }

        public void didCompleteRewardedVideo(String str, int i) {
            int i2 = 2 % 2;
            int i3 = f867 + 79;
            f868 = i3 % 128;
            int i4 = i3 % 2;
            bk.this.m815(this, this.f872, m899((ViewConfiguration.getMinimumFlingVelocity() >> 16) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (ViewConfiguration.getPressedStateDuration() >> 16) + 43, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), str, Integer.valueOf(i));
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteRewardedVideo(str, i);
            }
            int i5 = f867 + 31;
            f868 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
        }

        public void didDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f867 + 59;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(View.resolveSizeAndState(0, 0, 0) + 1081, 42 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f867 + 107;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            int i6 = f868 + 17;
            f867 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 91 / 0;
            }
        }

        public void willDisplayVideo(String str) {
            int i = 2 % 2;
            int i2 = f867 + 71;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(1123 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 35, (char) KeyEvent.keyCodeFromString("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                chartboostDelegate.willDisplayVideo(str);
            }
            int i4 = f867 + 31;
            f868 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didCacheInPlay(String str) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1158, 33 - Color.argb(0, 0, 0, 0), (char) ((-16757428) - Color.rgb(0, 0, 0))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f867 + 105;
                f868 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCacheInPlay(str);
            }
            int i4 = f868 + 83;
            f867 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m815(this, this.f872, m899((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1191, 37 - ExpandableListView.getPackedPositionChild(0L), (char) (22177 - Process.getGidForName(""))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i2 = f868 + 15;
                f867 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
            }
            int i4 = f867 + 125;
            f868 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
        }

        public void didInitialize() {
            int i = 2 % 2;
            int i2 = f867 + 89;
            f868 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m815(this, this.f872, m899(1229 - ExpandableListView.getPackedPositionType(0L), 32 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13173)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f871;
            if (chartboostDelegate != null) {
                int i4 = f867 + 21;
                f868 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didInitialize();
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m899(int i, int i2, char c) {
            String str;
            synchronized (b.f637) {
                char[] cArr = new char[i2];
                b.f638 = 0;
                while (b.f638 < i2) {
                    cArr[b.f638] = (char) ((((long) f870[b.f638 + i]) ^ (((long) b.f638) * f869)) ^ ((long) c));
                    b.f638++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m892(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f857);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m886(String str, int i, int i2, boolean z, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (e.f1919) {
            char[] cArr2 = new char[i3];
            e.f1921 = 0;
            while (e.f1921 < i3) {
                e.f1920 = cArr[e.f1921];
                cArr2[e.f1921] = (char) (e.f1920 + i2);
                int i4 = e.f1921;
                cArr2[i4] = (char) (cArr2[i4] - f855);
                e.f1921++;
            }
            if (i > 0) {
                e.f1918 = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - e.f1918, e.f1918);
                System.arraycopy(cArr3, e.f1918, cArr2, 0, i3 - e.f1918);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                e.f1921 = 0;
                while (e.f1921 < i3) {
                    cArr4[e.f1921] = cArr2[(i3 - e.f1921) - 1];
                    e.f1921++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
