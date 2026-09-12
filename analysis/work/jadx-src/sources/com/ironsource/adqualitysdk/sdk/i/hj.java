package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hj extends WebViewClient implements ay.d, ci {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2335 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2336;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2337;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2338;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebViewClient f2339;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebViewClient f2340;

    static {
        char[] cArr = new char[IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID];
        ByteBuffer.wrap("\u0000W\u0010ô!@1åB-R°c\u0011s´\u0084ä\u0095p¥Ï¶UÆ¸×\u0019ç\u008bø\u001c\t\u007f\u0019Ó*S:·K;[\u0097á[ñýÀNÐÂ£(³ë\u0082\u0011\u0092\u0087e¶tjDàWG'\u009e6*\u0006\u0083\u0019\u0015èkøÑËIÛ¯ªjº\u0088\u008d\u0000\u009cvló\u007f[OÀ^\u001a.´\u0001\u0016\u0011\u0092àãóWÃËÒ9¢\u0098µ\b\u0085\u0087\u0094Ôgfw×FCV½)+9\u0095\bK\u001beëóúBÊöz\u001cjº[\tK\u00858o(¬\u0019V\tÀþñï-ß¼Ì\u0010¼ü\u00adc\u009dÞ\u0082Hs\nc\u0094P\u0002@ÿ1c!È\u0016\u000f\u0007-÷©ä\u001fÔ\u0096Å~µá\u009a{\u008aÑ{³h\u000bX\u009aIr9î.X\u001eù\u000f\u00adü\"ì½Ý\u000fÍò²f¢Ü\u0093J\u00800pîa\u001cQêFg6\u0093Ì9Ü\u009fí,ý \u008eJ\u009e\u0089¯s¿åHÔY\bi\u0082z%\nü\u001bH+á4wÅ\tÕ³æ+öÍ\u0087\b\u0097ê b±\u0014A\u0091R9b¢sx\u0003Ö,t<ðÍ\u0081Þ5î©ÿ[\u008fú\u0098j¨å¹¶J\u0004Zµk!{ß\u0004I\u0014÷%)6\u0000Æ\u0086×=çÈðK\u0080ì\u0091|¢P°è N\u0091ý\u0081qò\u009bâXÓ¢Ã44\u0005%Ù\u0015H\u0006äv\bg\u0097W*H¼¹þ©`\u009aö\u008a\u000bû\u0097ë<ÜûÍÙ=].ë\u001eb\u000f\u008a\u007f\u0015P\u008f@%±G¢ÿ\u0092n\u0083\u0086ó\u001aä¬Ô\rÅY6Ö&I\u0017û\u0007\u0006x\u0092h(Y¾JÄº\u001a«ï\u009b\t\u008c\u008eü;í¼ÞÛÎO?£\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}W\u008dù\u009eN®ß¿\u0018Ï¨à\fð\u008c\u0001û\u0012E\"Õ\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}W\u008dù\u009eN®ß¿\rÏµà\u0003ð\u0097\u0001ü\u0012H\"Ô3&\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}K\u008d÷\u009eH®Þ¿\u0019Ï¹à\u001eð\u0091\u0001ú\u0012R\"Ò3'\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u0096l\u001e}h\u008dí\u009eE®Þ¿\u0002Ï²à\u0019ð\u009b\u0001ý\u0012C\"Ô32C§T6d\u0090u÷\u0086b\u0096Í§J·¾Å/Õ\u0089ä:ô¶\u0087\\\u0097\u009f¦e¶óAÂP\u001e`\u0094s3\u0003ê\u0012^\"÷=aÌ\u001fÜ¥ï=ÿÛ\u008e\u001e\u009eà©r¸9H\u009d[,k\u009dz@\nØ%~5ÆÄ\u0080×.ç²öZ\u0086Ü\u0091m¡ë°\u009f\u0092\u0099\u0082?³\u008c£\u0000ÐêÀ)ñÓáE\u0016t\u0007¨7\"$\u0085T\\EèuAj×\u009b©\u008b\u0013¸\u008b¨mÙ¨ÉVþÄï\u0089\u001f!\f\u0096<\u0003-þ]vrÔbF\u0093\u0016\u0080\u008e°\u001f¡ñÑ}\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}A\u008d÷\u009e[®×¿\u0019Ï¹à\u001eð\u008b\u0001í\u0012M\"Ø31C T\rd\u009auè\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095v¥Ä¶}Æ£×/ç\u0083ø-\tu\u0019Ò*G:¡K9[\u008cl\u0005}t\u008dñ\u009eF®ÔÂzÒÜãoóã\u0080\t\u0090Ê¡0±¦F\u0097WKgÁtf\u0004¿\u0015\u000b%¢:4ËJÛðèhø\u008e\u0089K\u0099¾®&¿mO×\\rlä}\u0000\r\u0086\"\u00042¨ÃÃÐvàúñ\u0018\u0081\u0088\u0096\u0013¦£·ÊD\\Tøetu\u008cäÿôYÅêÕf¦\u008c¶O\u0087µ\u0097#`\u0012qÎADRã\":3\u008e\u0003'\u001c±íÏýuÎíÞ\u000b¯Î¿0\u0088¢\u0099ïiGzðJe[\u0098+\u0010\u0004²\u0014 åföéÆg×½§\u001b°¬\u0080 \u0091N\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}U\u008dý\u009eJ®ß¿\"Ïªà\bð\u009a\u0001Ì\u0012L\"Ø3'C½T\u0010d¶uã\u0086e\u0096Ü§k·¯È*Ø\u0099é\u0018ú}\në\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095z¥Ë¶WÆ ×4ç\u0080ø\u0018\t0\u0019Î*@:ªK3[\u008cl\u0018}'\u008d÷\u009eG®è¿.Ï¿à\bð\u0097\u0001ù\u0012E\"Õ3\u0001C¿T\rd\u0090uè\u0086c\u0096ë§\\·¸È/Ø¾é\u0018ú\u007f\nê\u001bU+²<&\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}U\u008dý\u009eJ®ß¿\"Ïªà\bð\u009a\u0001Ç\u0012T\"Å32C\u0092T\u0011d\u0081uî\u0086E\u0096Í§H·¿È>Ø\u009fé\tÈÛØ}éÎùB\u008a¨\u009ak«\u0091»\u0007L6]êm`~Ç\u000e\u001e\u001fª/\u00030\u0095ÁëÑQâÉò/\u0083ê\u0093\b¤\u0080µöEsVÛf@w\u009a\u00074(\u00968\u0012ÉcÚ×êKû¹\u008b\u0006\u009c\u009f¬\u0012½]Nÿ^SoÉ\u007f \t\u001b\u0019½(\u000e8\u0082Kh[«jQzÇ\u008dö\u009c*¬ ¿\u0007ÏÞÞjîÃñU\u0000+\u0010\u0091#\t3ïB*RÔeFt\f\u0084¨\u0097\u001f§\u0085¶{Ææé_ùÅ\bµ\u001b5+\u008a:eJÈ]LmÎ|¶\u008f=\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}T\u008dû\u009eH®Ö¿.Ï\u009fà\u0005ð\u009f\u0001á\u0012G\"Ô3&©Í¹k\u0088Ø\u0098Të¾û}Ê\u0087Ú\u0011- <ü\fv\u001fÑo\b~¼N\u0015Q\u0083 ý°G\u0083ß\u00939âüò\u0002Å\u0090ÔÝ$u7Â\u0007W\u0016ªf\"I\u0080Y\u0012¨K»Ç\u008b^\u009a£ê5ý¾Í\u0018Ü\u007f/ê?E\u000eÂ\u001e6\u0017p\u0007Ö6e&éU\u0003EÀt:d¬\u0093\u009d\u0082A²Ë¡lÑµÀ\u0001ð¨ï>\u001e@\u000eú=b-\u0084\\AL¿{-j`\u009aÈ\u0089\u007f¹ê¨\u0017Ø\u009f÷=ç¯\u0016ò\u0005a5ð$\u0007T£C#s²bÜ\u0091P\u0000E\u0010ã!P1ÜB6Rõc\u000fs\u0099\u0084¨\u0095t¥þ¶YÆ\u0080×4ç\u009dø\u000b\tu\u0019Ï*W:±Kt[\u008al\u0018}U\u008dý\u009eG®Þ¿.Ï®à=ð\u008c\u0001à\u0012C\"Ô31C T#d\u009auè\u0086r\u0000g\u0010ô!V1äB6R´c\u0016s\u0087\u0084í\u0095}¥ý¶^Æ®×\u000bç\u0087ø\u001a\tg\u0019â*^:ªK1[\u008bl\u0002\u009f?\u008f¬¾\u000e®¿Ý~ÍÚü[ìÍ\u001b\u0086\n(:\u0097)\u0014Y×HixßgB\u0096&\u0086\u008d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID);
        f2336 = cArr;
        f2337 = 914226521711906961L;
    }

    public hj(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2339 = webViewClient;
        this.f2340 = webViewClient2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient m2224() {
        int i = 2 % 2;
        int i2 = f2338 + 43;
        f2335 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2339;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m2227() {
        int i = 2 % 2;
        int i2 = f2338;
        int i3 = i2 + 91;
        f2335 = i3 % 128;
        int i4 = i3 % 2;
        WebViewClient webViewClient = this.f2340;
        int i5 = i2 + 17;
        f2335 = i5 % 128;
        int i6 = i5 % 2;
        return webViewClient;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m2223() {
        int i = 2 % 2;
        int i2 = f2338 + 113;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null || webViewClient.getClass().equals(WebViewClient.class)) {
            int i4 = f2338 + 9;
            f2335 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = f2338 + 53;
        f2335 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2338 + 25;
        f2335 = i2 % 128;
        boolean zM2226 = m2226(webView, str, i2 % 2 == 0);
        int i3 = f2338 + 87;
        f2335 = i3 % 128;
        int i4 = i3 % 2;
        return zM2226;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2226(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        try {
            if (!this.f2340.shouldOverrideUrlLoading(webView, str)) {
                int i2 = f2338 + 33;
                int i3 = i2 % 128;
                f2335 = i3;
                int i4 = i2 % 2;
                if (!z) {
                    int i5 = i3 + InterfaceC0280i1.d.b.i;
                    f2338 = i5 % 128;
                    int i6 = i5 % 2;
                    if (m2223()) {
                        try {
                            boolean zShouldOverrideUrlLoading = this.f2339.shouldOverrideUrlLoading(webView, str);
                            int i7 = f2338 + 9;
                            f2335 = i7 % 128;
                            int i8 = i7 % 2;
                            return zShouldOverrideUrlLoading;
                        } catch (Throwable th) {
                            jz.m2766(m2225((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.combineMeasuredStates(0, 0)).intern(), m2225((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72, 52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (31321 - KeyEvent.getDeadChar(0, 0))).intern(), th, false);
                        }
                    }
                    boolean zShouldOverrideUrlLoading2 = super.shouldOverrideUrlLoading(webView, str);
                    int i9 = f2335 + 45;
                    f2338 = i9 % 128;
                    if (i9 % 2 == 0) {
                        return zShouldOverrideUrlLoading2;
                    }
                    throw null;
                }
            }
            WebViewClient webViewClient = this.f2339;
            if (webViewClient instanceof hj) {
                ((hj) webViewClient).m2226(webView, str, true);
            }
            return true;
        } catch (Throwable th2) {
            jz.m2766(m2225((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2225(22 - TextUtils.getOffsetBefore("", 0), 50 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (57630 - View.combineMeasuredStates(0, 0))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = f2335 + 23;
        f2338 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM2228 = m2228(webView, webResourceRequest, false);
        int i4 = f2335 + 27;
        f2338 = i4 % 128;
        if (i4 % 2 == 0) {
            return zM2228;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2228(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        int i = 2 % 2;
        try {
            if (this.f2340.shouldOverrideUrlLoading(webView, webResourceRequest) || !(!z)) {
                WebViewClient webViewClient = this.f2339;
                if (webViewClient instanceof hj) {
                    ((hj) webViewClient).m2228(webView, webResourceRequest, true);
                    int i2 = f2335 + 39;
                    f2338 = i2 % 128;
                    int i3 = i2 % 2;
                }
                return true;
            }
        } catch (Throwable th) {
            jz.m2766(m2225(KeyEvent.normalizeMetaState(0), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString(""))).intern(), m2225((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 124, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 54, (char) ((Process.myPid() >> 22) + 52348)).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f2339;
        if (webViewClient2 != null) {
            int i4 = f2335 + 81;
            f2338 = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                int i5 = 68 / 0;
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th2) {
                jz.m2766(m2225(TextUtils.indexOf("", "", 0), 21 - Process.getGidForName(""), (char) Color.blue(0)).intern(), m2225(178 - TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0) + 56, (char) (Color.green(0) + 45229)).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = f2338 + 27;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onPageStarted(webView, str, bitmap);
        } catch (Throwable th) {
            jz.m2766(m2225(View.MeasureSpec.getMode(0), 21 - ExpandableListView.getPackedPositionChild(0L), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2225(TextUtils.getOffsetBefore("", 0) + 234, 34 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2338 + 81;
            f2335 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onPageStarted(webView, str, bitmap);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        int i6 = f2338 + 55;
        f2335 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2338 + 3;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onPageFinished(webView, str);
            int i4 = f2338 + 93;
            f2335 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getKeyRepeatDelay() >> 16, 22 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2225(269 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 35 - (ViewConfiguration.getTouchSlop() >> 8), (char) View.resolveSizeAndState(0, 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2335 + 105;
        f2338 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2340.onLoadResource(webView, str);
                int i3 = f2335 + 77;
                f2338 = i3 % 128;
                int i4 = i3 % 2;
                WebViewClient webViewClient = this.f2339;
                if (webViewClient != null) {
                    webViewClient.onLoadResource(webView, str);
                    return;
                }
                super.onLoadResource(webView, str);
                int i5 = f2338 + 69;
                f2335 = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            this.f2340.onLoadResource(webView, str);
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2225((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0') + 23, (char) TextUtils.indexOf("", "", 0, 0)).intern(), m2225(303 - KeyEvent.keyCodeFromString(""), 'S' - AndroidCharacter.getMirror('0'), (char) Color.alpha(0)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2335 + 75;
        f2338 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.shouldInterceptRequest(webView, str);
            int i4 = f2338 + 83;
            f2335 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2225(AndroidCharacter.getMirror('0') - '0', ExpandableListView.getPackedPositionType(0L) + 22, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), m2225(Color.argb(0, 0, 0, 0) + 338, 43 - Color.alpha(0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        int i6 = f2338 + InterfaceC0280i1.d.b.i;
        f2335 = i6 % 128;
        int i7 = i6 % 2;
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        try {
            this.f2340.shouldInterceptRequest(webView, webResourceRequest);
            int i2 = f2335 + 121;
            f2338 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 5;
            }
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getEdgeSlop() >> 16, View.resolveSize(0, 0) + 22, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern(), m2225(338 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0') + 44, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        int i4 = f2335 + 53;
        f2338 = i4 % 128;
        if (i4 % 2 == 0) {
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        int i2 = f2338 + 91;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            jz.m2766(m2225(TextUtils.getOffsetAfter("", 0), 22 - (Process.myPid() >> 22), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), m2225((KeyEvent.getMaxKeyCode() >> 16) + 381, Drawable.resolveOpacity(0, 0) + 39, (char) (50537 - TextUtils.lastIndexOf("", '0'))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        webViewClient.onTooManyRedirects(webView, message, message2);
        int i4 = f2338 + 49;
        f2335 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f2335 + 25;
        f2338 = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.f2340.onReceivedError(webView, i, str, str2);
        } catch (Throwable th) {
            jz.m2766(m2225((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 22 - View.MeasureSpec.getSize(0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), m2225(420 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 36, (char) (37595 - TextUtils.lastIndexOf("", '0'))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
        int i5 = f2338 + 11;
        f2335 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        try {
            this.f2340.onFormResubmission(webView, message, message2);
            int i2 = f2338 + InterfaceC0280i1.d.b.d;
            f2335 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getScrollBarFadeDuration() >> 16, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2225(View.combineMeasuredStates(0, 0) + 456, 39 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f2339;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
                return;
            }
            int i4 = f2335 + 87;
            f2338 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onFormResubmission(webView, message, message2);
            int i6 = f2338 + 77;
            f2335 = i6 % 128;
            int i7 = i6 % 2;
        } catch (Error e) {
            jz.m2766(m2225(TextUtils.lastIndexOf("", '0', 0) + 1, View.combineMeasuredStates(0, 0) + 22, (char) View.MeasureSpec.getSize(0)).intern(), m2225((ViewConfiguration.getJumpTapTimeout() >> 16) + 495, 27 - TextUtils.indexOf("", "", 0), (char) Color.alpha(0)).intern(), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        int i2 = f2338 + 43;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.doUpdateVisitedHistory(webView, str, z);
        } catch (Throwable th) {
            jz.m2766(m2225((Process.getThreadPriority(0) + 20) >> 6, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), m2225(Color.alpha(0) + 522, (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, (char) (49727 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2335 + 99;
            f2338 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
                return;
            }
            webViewClient.doUpdateVisitedHistory(webView, str, z);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i = 2 % 2;
        try {
            this.f2340.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th) {
            jz.m2766(m2225(Drawable.resolveOpacity(0, 0), Color.green(0) + 22, (char) (Process.myTid() >> 22)).intern(), m2225((ViewConfiguration.getLongPressTimeout() >> 16) + 565, (ViewConfiguration.getTapTimeout() >> 16) + 39, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 58554)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i2 = f2335 + 123;
            f2338 = i2 % 128;
            if (i2 % 2 == 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        int i3 = f2335 + InterfaceC0280i1.d.b.d;
        f2338 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i = 2 % 2;
        int i2 = f2338 + 39;
        f2335 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.f2340.onReceivedClientCertRequest(webView, clientCertRequest);
                super.hashCode();
                throw null;
            }
            this.f2340.onReceivedClientCertRequest(webView, clientCertRequest);
            try {
                WebViewClient webViewClient = this.f2339;
                if (webViewClient != null) {
                    int i3 = f2335 + 5;
                    f2338 = i3 % 128;
                    int i4 = i3 % 2;
                    webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                    return;
                }
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                int i5 = f2335 + 55;
                f2338 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                jz.m2766(m2225((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) Color.blue(0)).intern(), m2225(652 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777165) - Color.rgb(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), th, false);
            }
        } catch (Throwable th2) {
            jz.m2766(m2225(TextUtils.getTrimmedLength(""), 22 - TextUtils.getCapsMode("", 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), m2225(604 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 48 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AndroidCharacter.getMirror('0') - '0')).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        int i = 2 % 2;
        try {
            this.f2340.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getEdgeSlop() >> 16, Gravity.getAbsoluteGravity(0, 0) + 22, (char) View.MeasureSpec.getMode(0)).intern(), m2225(702 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 46, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i2 = f2338 + 63;
            f2335 = i2 % 128;
            if (i2 % 2 != 0) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                return;
            }
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        int i3 = f2335 + 45;
        f2338 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2338 + 97;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            jz.m2766(m2225(Color.green(0), 21 - Process.getGidForName(""), (char) TextUtils.getOffsetBefore("", 0)).intern(), m2225(748 - ImageFormat.getBitsPerPixel(0), 43 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (51358 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2338 + 91;
            f2335 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
            }
            webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
            throw null;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2335 + 123;
        f2338 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.f2340.onUnhandledKeyEvent(webView, keyEvent);
                int i3 = f2338 + 43;
                f2335 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 % 2;
                }
                WebViewClient webViewClient = this.f2339;
                if (webViewClient != null) {
                    webViewClient.onUnhandledKeyEvent(webView, keyEvent);
                    return;
                }
                super.onUnhandledKeyEvent(webView, keyEvent);
                int i5 = f2338 + 115;
                f2335 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.f2340.onUnhandledKeyEvent(webView, keyEvent);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2225(ExpandableListView.getPackedPositionType(0L), 22 - TextUtils.indexOf("", "", 0), (char) Color.green(0)).intern(), m2225(ExpandableListView.getPackedPositionType(0L) + 792, 40 - View.combineMeasuredStates(0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 2398)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        int i = 2 % 2;
        int i2 = f2338 + 61;
        f2335 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2340.onScaleChanged(webView, f, f2);
                int i3 = 83 / 0;
            } else {
                this.f2340.onScaleChanged(webView, f, f2);
            }
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getJumpTapTimeout() >> 16, 22 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern(), m2225(832 - ((Process.getThreadPriority(0) + 20) >> 6), 35 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2338 + 89;
            f2335 = i4 % 128;
            if (i4 % 2 != 0) {
                webViewClient.onScaleChanged(webView, f, f2);
                return;
            } else {
                webViewClient.onScaleChanged(webView, f, f2);
                int i5 = 35 / 0;
                return;
            }
        }
        super.onScaleChanged(webView, f, f2);
        int i6 = f2335 + 11;
        f2338 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = f2338 + 113;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            jz.m2766(m2225(Gravity.getAbsoluteGravity(0, 0), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern(), m2225(MotionEvent.axisFromString("") + 868, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, (char) (43400 - Gravity.getAbsoluteGravity(0, 0))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
        int i4 = f2338 + 49;
        f2335 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2338 + 81;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onPageCommitVisible(webView, str);
        } catch (Throwable th) {
            jz.m2766(m2225(ViewConfiguration.getEdgeSlop() >> 16, 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.blue(0)).intern(), m2225(234 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 33 - MotionEvent.axisFromString(""), (char) Color.argb(0, 0, 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2335 + 23;
            f2338 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onPageCommitVisible(webView, str);
            return;
        }
        super.onPageCommitVisible(webView, str);
        int i6 = f2338 + 3;
        f2335 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i = 2 % 2;
        int i2 = f2338 + 65;
        f2335 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2340.onReceivedError(webView, webResourceRequest, webResourceError);
                int i3 = 4 / 0;
            } else {
                this.f2340.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Throwable th) {
            jz.m2766(m2225((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, TextUtils.indexOf("", "", 0) + 22, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), m2225((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 420, TextUtils.indexOf((CharSequence) "", '0', 0) + 37, (char) (37596 - KeyEvent.getDeadChar(0, 0))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient != null) {
            int i4 = f2338 + 113;
            f2335 = i4 % 128;
            if (i4 % 2 != 0) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            } else {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
                int i5 = 92 / 0;
                return;
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        int i2 = f2335 + 61;
        f2338 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2340.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                throw null;
            }
            this.f2340.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            WebViewClient webViewClient = this.f2339;
            if (webViewClient != null) {
                int i3 = f2335 + 25;
                f2338 = i3 % 128;
                if (i3 % 2 == 0) {
                    webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    return;
                } else {
                    webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    int i4 = 32 / 0;
                    return;
                }
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            jz.m2766(m2225(ImageFormat.getBitsPerPixel(0) + 1, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern(), m2225(910 - View.MeasureSpec.makeMeasureSpec(0, 0), 40 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.resolveSize(0, 0) + 5941)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = f2338 + 75;
        f2335 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2340.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th) {
            jz.m2766(m2225(View.MeasureSpec.getSize(0), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Color.green(0)).intern(), m2225(TextUtils.indexOf("", "", 0, 0) + 950, 40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.blue(0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2339;
        if (webViewClient == null) {
            return true;
        }
        int i4 = f2338 + 9;
        f2335 = i4 % 128;
        int i5 = i4 % 2;
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 368095040) {
            if (iHashCode == 381550901 && str.equals(m2225(990 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                int i2 = f2335 + 55;
                f2338 = i2 % 128;
                if (i2 % 2 != 0) {
                    b = 1;
                }
            } else {
                b = -1;
            }
        } else if (str.equals(m2225(1013 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getTrimmedLength("") + 18, (char) (40791 - ExpandableListView.getPackedPositionChild(0L))).intern())) {
            int i3 = f2338 + 45;
            f2335 = i3 % 128;
            int i4 = i3 % 2;
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return m2224();
        }
        if (b != 1) {
            return null;
        }
        return m2227();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2225(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2336[b.f638 + i]) ^ (((long) b.f638) * f2337)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
