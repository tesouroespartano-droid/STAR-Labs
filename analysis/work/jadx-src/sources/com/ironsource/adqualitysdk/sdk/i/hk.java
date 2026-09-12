package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hk extends WebChromeClient implements ay.d, ci {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2341 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2342;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2343;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2344;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebChromeClient f2345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebChromeClient f2346;

    static {
        char[] cArr = new char[1100];
        ByteBuffer.wrap("\u0000W?©\u007fú¿'ÿX>\u008e~§¾ùþ\u0005>o}\u0094½\u00adýõ=2}\\¼°ü¥<ï|7¼Vû\u0091;È{ç»&\u0082\u0083½xý,=Í}\u0084¼\u001aüg<<|\u0086¼\u0087ÿj?`\u007f\u001a¿óÿ\u009d>F~c¾$þû>\u0090y\u0016¹\u0015ù 9Ây\u0094¸Eø\u001980xó¸©û];1{.»ëû°:Ez\u0013ºÞ'j\u0018\u0091XÅ\u0098$Øm\u0019óY\u008e\u0099ÕÙo\u0019nZ\u0083\u009a\u0089Úó\u001a\u001aZt\u009b¯Û\u008a\u001bÍ[\u0012\u009byÜÿ\u001cü\\É\u009c)Üj\u001d ]ò\u009dÂÝ\t\u001dV^£\u009eÏÞÆ\u001e\u0017^[\u009f®|PC«\u0003ÿÃ\u001e\u0083WBÉ\u0002´Âï\u0082UBT\u0001¹Á³\u0081ÉA \u0001NÀ\u0095\u0080°@÷\u0000(ÀC\u0087ÅGÆ\u0007óÇ\u0013\u0087PF\u009a\u0006ÈÆø\u00863Fl\u0005\u0099Åè\u0085öE6\u0005c\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0006ûE:\u008fzÝºíú&:yy\u008c¹àùï99y{¸\u008cøù8\u001fx'¸z÷µ7Þw\u0014\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0007ûH:\u0083zÏºÇú%:oy\u009c¹Ûùí9\u001ayq¸\u0081øÇ\u0083\u009f¼dü0<Ñ|\u0098½\u0006ý{= }\u009a½\u009bþv>|~\u0006¾ïþ\u0081?Z\u007f\u007f¿8ÿç?\u008cx\n¸\tø<8Æx\u0093¹Rù\u00079\u001dyÿ¹µúF:\u0001z7ºÀú«;[{\u001do\\P§\u0010óÐ\u0012\u0090[QÅ\u0011¸Ñã\u0091YQX\u0012µÒ¿\u0092ÅR,\u0012BÓ\u0099\u0093¼Sû\u0013$ÓO\u0094ÉTÊ\u0014ÿÔ\u000e\u0094KU\u0090\u0015ÀÕé\u0095,UR\u0016\u0098ÖÃ\u0096ýV:\u0016v\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0006ûE:\u009dzÍºáú#:hy®¹Ûùã99yk;%\u0004ÞD\u008a\u0084kÄ\"\u0005¼EÁ\u0085\u009aÅ \u0005!FÌ\u0086ÆÆ¼\u0006UF;\u0087àÇÅ\u0007\u0082G]\u00876À°\u0000³@\u0086\u0080wÀ,\u0001ãA«\u0081\u0081Ág\u0001\u0015Bæ\u0082°Â\u008f\u0002[µ7\u008aÌÊ\u0098\nyJ0\u008b®ËÓ\u000b\u0088K2\u008b3ÈÞ\bÔH®\u0088GÈ)\tòI×\u0089\u0090ÉO\t$N¢\u008e¡Î\u0094\u000elN!\u008fßÏ¦\u000f\u0093OP\u008f\u001aÙ\u0012æé¦½f\\&\u0015ç\u008b§ög\u00ad'\u0017ç\u0016¤ûdñ$\u008bäb¤\fe×%òåµ¥je\u0001\"\u0087â\u0084¢±bI\"\u0004ãø£\u0080c½#aã\" Í`\u008e[(dÓ$\u0087äf¤/e±%Ìå\u0097¥-e,&ÁæË¦±fX&6çí§Èg\u008f'Pç; ½`¾ \u008bàs >aÑ!§á\u0086¡Pa\u0001\"ñ\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u001eûS:®zÝºâú?:ny\u008d¹áùî9 yw¸\u0085øÔ\t\n6ñv¥¶Dö\r7\u0093wî·µ÷\u000f7\u000etã´éô\u00934zt\u0014µÏõê5\u00adurµ\u0019ò\u009f2\u009cr©²^ò\u00173Às\u0092³®ó{36pÃ°¿ð®0wp6±Éñ\u009e1@qb±\nþÚ>\u008c~C¾j®\b\u0091óÑ§\u0011FQ\u000f\u0090\u0091Ðì\u0010·P\r\u0090\fÓá\u0013ëS\u0091\u0093xÓ\u0016\u0012ÍRè\u0092¯Òp\u0012\u001bU\u009d\u0095\u009eÕ«\u0015^U\b\u0094ÎÔ\u0099\u0014¦T~\u00940×Ñ\u0017\u0090W¢\u0097o×\u0005\u0016ÌV\u008f\u0096\\Öl\u0016*YÞ\u0099\u0088ÙZ\u0019gY.\u0098ÂØ\u008d\u0018VXz\u0098\u0011Ûç\u001b\u0086[P\u009b\u0001Û1\u009d ¢[â\u000f\"îb§£9ãD#\u001fc¥£¤àI C`9 Ðà¾!ea@¡\u0007áØ!³f5¦6æ\u0003&öf §fç1'\u000egÖ§\u0098äy$8d\n¤Çä\u00ad%de'¥ôåÄ%\u0082jvª êò*Ïj\u0086«që$+õkÀ«¹èO(.hø¨©è\u0099\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0004ûE:\u009ezÕºíú#:oy\u0081¹Ûùî9\u001ey}¸\u0095øÅ8\u0019x;¸`n(QÓ\u0011\u0087Ñf\u0091/P±\u0010ÌÐ\u0097\u0090-P\"\u0013ôÓÅ\u0093\u0091SX\u0013+Òþ\u0092\u008dR\u008e\u0012GÒ \u0095úU¸\u0015\u008bÕ\u0019\u0095\"Tï\u0014\u0085Ô\u008c\u0094OT\u001c\u0017ì×ª\u0097\u009eWH\u0017\u001aÖç\u0096\u008fVt\u0016TÖ\f\u0099èY²\u0019a\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0004ûE:\u009ezÕºíú#:oy\u0081¹Ûùî9\u001ey}¸\u0095øÅ8\u0019x;¸`÷£7Íw\u0016·'÷u6°vÍ¶\u0010ÄÔû/»{{\u009a;ÓúMº0zk:ÑúÞ¹\by99mù¤¹×x\u00028qør¸»xÜ?\u0006ÿD¿w\u007få?Þþ\u0013¾y~p>³þà½\u0010}V=bý´½æ|\u001b<sü\u0088¼¨|ð3\u0014óN³\u009ds\u00963àò#²Zr\u00802½òø±-\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u001eûS:¸zÑºéú5:sy\u009d¹ÀÀcÿ\u0098¿Ì\u007f-?dþú¾\u0087~Ü>fþg½\u008a}\u0080=úý\u0013½}|¦<\u0083üÄ¼\u001b|p;öûõ»À{1;iú¤ºízÍ:\u001aú_¹\u0083y÷9Õù\u0019¹_x¥8ó\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Û{í» ûd:\u0089zÞºåú%:py\u009c¹âùé9(y}¸\u008bøà8\u0013x;¸`÷\u00857ÞyöF\r\u0006YÆ¸\u0086ñGo\u0007\u0012ÇI\u0087óGò\u0004\u001fÄ\u0015\u0084oD\u0086\u0004èÅ3\u0085\u0016EQ\u0005\u008eÅå\u0082cBh\u0002^Â\u0093\u0082ÅC6\u0003oÃR\u0083\u008cCã\u00004Àf\u0080W@\u0096\u0000ÅÁ0\u0081SA½\u0001\u0094ÁÀ\u008e!Nz\u000e¸Î\u0084\u008eõO\u0006\u000f~Ï°\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Û{í» ûv:\u0085zËºíú$:yy\u008c¹üùé9?yl¸\u008bøÂ8\u0005\u0000E?¾\u007fê¿\u000bÿB>Ü~¡¾úþ@>A}¬½¦ýÜ=5}[¼\u0080ü¥<â|=¼VûÐ;Ó{æ»\u0007ûH:\u0083zÏºÂú9:py\u008d¹÷ùè9#yw¸\u0097øÕ8\u000e±u\u008e»Îþ\u000e!NP\u008f\u008fÏª\u000föO\u0017\u008fZÌ½\f³Là\u008c\rÌR\r\u0094M½\u008dóÍ/\ruJ\u008e\u008aÇÊÿ\n(JF\u0000g?©\u007fì¿0ÿR>«~\u00ad¾öþ#>D}\u008a½«ýý=9}k¼\u0098ü©<é|6¼P".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1100);
        f2344 = cArr;
        f2343 = -3042086988029280308L;
    }

    public hk(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2345 = webChromeClient;
        this.f2346 = webChromeClient2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebChromeClient m2229() {
        int i = 2 % 2;
        int i2 = f2342;
        int i3 = i2 + InterfaceC0280i1.d.b.i;
        f2341 = i3 % 128;
        int i4 = i3 % 2;
        WebChromeClient webChromeClient = this.f2345;
        int i5 = i2 + 51;
        f2341 = i5 % 128;
        if (i5 % 2 != 0) {
            return webChromeClient;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object m2230() {
        int i = 2 % 2;
        int i2 = f2342 + 77;
        f2341 = i2 % 128;
        int i3 = i2 % 2;
        WebChromeClient webChromeClient = this.f2346;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        int i2 = 2 % 2;
        int i3 = f2342 + 77;
        f2341 = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.f2346.onProgressChanged(webView, i);
                int i4 = 94 / 0;
            } else {
                this.f2346.onProgressChanged(webView, i);
            }
        } catch (Throwable th) {
            jz.m2766(m2231(Color.blue(0), View.getDefaultSize(0, 0) + 24, (char) (Process.myTid() >> 22)).intern(), m2231((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, ((byte) KeyEvent.getModifierMetaStateMask()) + 39, (char) (33479 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i);
            int i5 = f2341 + 55;
            f2342 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
                return;
            }
            return;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i = 2 % 2;
        try {
            this.f2346.onReceivedTitle(webView, str);
            int i2 = f2342 + 3;
            f2341 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231((-1) - TextUtils.lastIndexOf("", '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, (char) TextUtils.indexOf("", "", 0, 0)).intern(), m2231(62 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 10031)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2341 + 125;
            f2342 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onReceivedTitle(webView, str);
                return;
            } else {
                webChromeClient.onReceivedTitle(webView, str);
                int i5 = 40 / 0;
                return;
            }
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = f2342 + 43;
        f2341 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onReceivedIcon(webView, bitmap);
            int i4 = f2342 + 11;
            f2341 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(KeyEvent.keyCodeFromString(""), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m2231(TextUtils.indexOf((CharSequence) "", '0', 0) + 99, TextUtils.getCapsMode("", 0, 0) + 35, (char) (31765 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient == null) {
            super.onReceivedIcon(webView, bitmap);
            return;
        }
        webChromeClient.onReceivedIcon(webView, bitmap);
        int i6 = f2341 + 33;
        f2342 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        int i2 = f2341 + 9;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onReceivedTouchIconUrl(webView, str, z);
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getKeyRepeatDelay() >> 16, Process.getGidForName("") + 25, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2231(View.MeasureSpec.makeMeasureSpec(0, 0) + 133, Drawable.resolveOpacity(0, 0) + 43, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2342 + 85;
            f2341 = i4 % 128;
            int i5 = i4 % 2;
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i = 2 % 2;
        int i2 = f2342 + 89;
        f2341 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onShowCustomView(view, customViewCallback);
                super.hashCode();
                throw null;
            }
            this.f2346.onShowCustomView(view, customViewCallback);
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient != null) {
                int i3 = f2341 + 97;
                f2342 = i3 % 128;
                if (i3 % 2 == 0) {
                    webChromeClient.onShowCustomView(view, customViewCallback);
                    return;
                } else {
                    webChromeClient.onShowCustomView(view, customViewCallback);
                    throw null;
                }
            }
            super.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern(), m2231(176 - TextUtils.getCapsMode("", 0, 0), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = 2 % 2;
        int i3 = f2341 + 21;
        f2342 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2346.onShowCustomView(view, i, customViewCallback);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f2346.onShowCustomView(view, i, customViewCallback);
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient != null) {
                int i4 = f2341 + 121;
                f2342 = i4 % 128;
                if (i4 % 2 == 0) {
                    webChromeClient.onShowCustomView(view, i, customViewCallback);
                    return;
                } else {
                    webChromeClient.onShowCustomView(view, i, customViewCallback);
                    int i5 = 47 / 0;
                    return;
                }
            }
            super.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            jz.m2766(m2231(TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern(), m2231((ViewConfiguration.getPressedStateDuration() >> 16) + 176, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i = 2 % 2;
        int i2 = f2342 + 33;
        f2341 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onHideCustomView();
                throw null;
            }
            this.f2346.onHideCustomView();
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient != null) {
                int i3 = f2341 + 97;
                f2342 = i3 % 128;
                int i4 = i3 % 2;
                webChromeClient.onHideCustomView();
                return;
            }
            super.onHideCustomView();
        } catch (Throwable th) {
            jz.m2766(m2231(TextUtils.lastIndexOf("", '0', 0, 0) + 1, 24 - View.combineMeasuredStates(0, 0), (char) Drawable.resolveOpacity(0, 0)).intern(), m2231((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 213, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (char) (Color.alpha(0) + 33754)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        int i = 2 % 2;
        int i2 = f2341 + 119;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onCreateWindow(webView, z, z2, message);
        } catch (Throwable th) {
            jz.m2766(m2231((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern(), m2231(TextUtils.indexOf("", "", 0, 0) + 250, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34, (char) (28441 - View.resolveSizeAndState(0, 0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2341 + 27;
            f2342 = i4 % 128;
            if (i4 % 2 == 0) {
                return webChromeClient.onCreateWindow(webView, z, z2, message);
            }
            webChromeClient.onCreateWindow(webView, z, z2, message);
            throw null;
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        int i = 2 % 2;
        int i2 = f2342 + 31;
        f2341 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onRequestFocus(webView);
        } catch (Throwable th) {
            jz.m2766(m2231((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 24, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m2231(285 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 'S' - AndroidCharacter.getMirror('0'), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i4 = f2341 + InterfaceC0280i1.d.b.g;
        f2342 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            webChromeClient.onRequestFocus(webView);
            throw null;
        }
        webChromeClient.onRequestFocus(webView);
        int i5 = f2341 + 41;
        f2342 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        int i = 2 % 2;
        int i2 = f2341 + 11;
        f2342 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2346.onCloseWindow(webView);
                throw null;
            }
            this.f2346.onCloseWindow(webView);
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient != null) {
                int i3 = f2342 + 9;
                f2341 = i3 % 128;
                int i4 = i3 % 2;
                webChromeClient.onCloseWindow(webView);
                return;
            }
            super.onCloseWindow(webView);
        } catch (Throwable th) {
            jz.m2766(m2231(KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "") + 24, (char) ExpandableListView.getPackedPositionType(0L)).intern(), m2231(320 - TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0) + 34, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 15200)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2342 + 63;
        f2341 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onJsAlert(webView, str, str2, jsResult);
                int i3 = 13 / 0;
            } else {
                this.f2346.onJsAlert(webView, str, str2, jsResult);
            }
        } catch (Throwable th) {
            jz.m2766(m2231((-1) - TextUtils.lastIndexOf("", '0', 0), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), m2231(354 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, (char) (View.combineMeasuredStates(0, 0) + 46450)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            boolean zOnJsAlert = webChromeClient.onJsAlert(webView, str, str2, jsResult);
            int i4 = f2342 + 123;
            f2341 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return zOnJsAlert;
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2342 + 25;
        f2341 = i2 % 128;
        ?? r2 = 0;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onJsConfirm(webView, str, str2, jsResult);
                int i3 = 20 / 0;
            } else {
                this.f2346.onJsConfirm(webView, str, str2, jsResult);
            }
            int i4 = f2342 + 49;
            r2 = i4 % 128;
            f2341 = r2;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231((-1) - ImageFormat.getBitsPerPixel(r2), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.EM, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern(), m2231(384 - (ViewConfiguration.getFadingEdgeLength() >> 16), 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (55639 - View.MeasureSpec.makeMeasureSpec(r2, r2))).intern(), th, (boolean) r2);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        int i6 = f2342 + 77;
        f2341 = i6 % 128;
        int i7 = i6 % 2;
        return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        int i = 2 % 2;
        try {
            this.f2346.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            int i2 = f2342 + 95;
            f2341 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(View.MeasureSpec.makeMeasureSpec(0, 0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), m2231((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 416, 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (23405 - View.resolveSizeAndState(0, 0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2341 + 59;
            f2342 = i4 % 128;
            if (i4 % 2 == 0) {
                return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            throw null;
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2341 + 91;
        f2342 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2346.onJsBeforeUnload(webView, str, str2, jsResult);
                int i3 = 93 / 0;
            } else {
                this.f2346.onJsBeforeUnload(webView, str, str2, jsResult);
            }
        } catch (Throwable th) {
            jz.m2766(m2231(KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m2231(TextUtils.getCapsMode("", 0, 0) + 447, 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.alpha(0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2342 + InterfaceC0280i1.d.b.d;
            f2341 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        int i = 2 % 2;
        int i2 = f2341 + 23;
        f2342 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2346.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                int i3 = 99 / 0;
            } else {
                this.f2346.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            }
        } catch (Throwable th) {
            jz.m2766(m2231(View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern(), m2231(KeyEvent.keyCodeFromString("") + 484, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (char) (TextUtils.indexOf("", "", 0) + 2383)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2341 + 57;
            f2342 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                return;
            } else {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                int i5 = 6 / 0;
                return;
            }
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        int i6 = f2342 + 45;
        f2341 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = f2342 + 117;
        f2341 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onGeolocationPermissionsShowPrompt(str, callback);
                throw null;
            }
            this.f2346.onGeolocationPermissionsShowPrompt(str, callback);
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient == null) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
                return;
            }
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            int i3 = f2341 + 35;
            f2342 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) View.MeasureSpec.getMode(0)).intern(), m2231(528 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, (char) (Drawable.resolveOpacity(0, 0) + 44621)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        int i = 2 % 2;
        int i2 = f2341 + 3;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onGeolocationPermissionsHidePrompt();
            int i4 = f2341 + 41;
            f2342 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getKeyRepeatTimeout() >> 16, 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern(), m2231((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 583, 55 - Drawable.resolveOpacity(0, 0), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40421)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        } else {
            super.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2341 + 77;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = f2341 + InterfaceC0280i1.d.b.i;
        f2342 = i4 % 128;
        int i5 = i4 % 2;
        try {
            this.f2346.onPermissionRequest(permissionRequest);
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getTapTimeout() >> 16, 24 - Gravity.getAbsoluteGravity(0, 0), (char) View.MeasureSpec.getMode(0)).intern(), m2231(637 - MotionEvent.axisFromString(""), 40 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
        }
        try {
            if (this.f2345 == null) {
                super.onPermissionRequest(permissionRequest);
                return;
            }
            int i6 = f2341 + 39;
            f2342 = i6 % 128;
            int i7 = i6 % 2;
            this.f2345.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            jz.m2766(m2231(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2231(Color.green(0) + 678, 43 - View.combineMeasuredStates(0, 0), (char) (View.combineMeasuredStates(0, 0) + 28269)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2342 + 21;
        f2341 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2346.onPermissionRequestCanceled(permissionRequest);
                throw null;
            }
            this.f2346.onPermissionRequestCanceled(permissionRequest);
            try {
                if (this.f2345 != null) {
                    int i3 = f2342 + 53;
                    f2341 = i3 % 128;
                    int i4 = i3 % 2;
                    this.f2345.onPermissionRequestCanceled(permissionRequest);
                    return;
                }
                super.onPermissionRequestCanceled(permissionRequest);
                int i5 = f2341 + 75;
                f2342 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                jz.m2766(m2231(Color.green(0), 24 - Color.argb(0, 0, 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), m2231((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 769, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50322)).intern(), th, false);
            }
        } catch (Throwable th2) {
            jz.m2766(m2231(ViewConfiguration.getJumpTapTimeout() >> 16, (ViewConfiguration.getTouchSlop() >> 8) + 24, (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), m2231(721 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 48, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        int i = 2 % 2;
        int i2 = f2341 + 29;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onJsTimeout();
        } catch (Throwable th) {
            jz.m2766(m2231(TextUtils.indexOf("", "", 0, 0), TextUtils.getCapsMode("", 0, 0) + 24, (char) (AndroidCharacter.getMirror('0') - '0')).intern(), m2231(Gravity.getAbsoluteGravity(0, 0) + 820, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i4 = f2341 + 95;
            f2342 = i4 % 128;
            if (i4 % 2 == 0) {
                return webChromeClient.onJsTimeout();
            }
            boolean zOnJsTimeout = webChromeClient.onJsTimeout();
            int i5 = 15 / 0;
            return zOnJsTimeout;
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = f2341 + 41;
        f2342 = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.f2346.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getJumpTapTimeout() >> 16, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m2231(851 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, (char) (49190 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i5 = f2342 + 61;
            f2341 = i5 % 128;
            if (i5 % 2 != 0) {
                webChromeClient.onConsoleMessage(str, i, str2);
                return;
            }
            webChromeClient.onConsoleMessage(str, i, str2);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        int i = 2 % 2;
        int i2 = f2342 + 51;
        f2341 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            jz.m2766(m2231(TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") + 24, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), m2231(TextUtils.indexOf("", "") + 852, 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49190)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i4 = f2342 + 113;
        f2341 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return zOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        int i = 2 % 2;
        int i2 = f2342 + 107;
        f2341 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2346.getDefaultVideoPoster();
            int i4 = f2341 + 83;
            f2342 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(ViewConfiguration.getDoubleTapTimeout() >> 16, (ViewConfiguration.getTapTimeout() >> 16) + 24, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), m2231(889 - Color.blue(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            int i6 = f2342 + 55;
            f2341 = i6 % 128;
            int i7 = i6 % 2;
            return webChromeClient.getDefaultVideoPoster();
        }
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        int i8 = f2341 + 3;
        f2342 = i8 % 128;
        if (i8 % 2 == 0) {
            return defaultVideoPoster;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        int i = 2 % 2;
        int i2 = f2342 + 85;
        f2341 = i2 % 128;
        ?? r2 = 0;
        try {
            if (i2 % 2 == 0) {
                this.f2346.getVideoLoadingProgressView();
                int i3 = 90 / 0;
            } else {
                this.f2346.getVideoLoadingProgressView();
            }
            int i4 = f2342 + 25;
            r2 = i4 % 128;
            f2341 = r2;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            jz.m2766(m2231(Color.alpha((int) r2), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2231(931 - (TypedValue.complexToFraction(r2, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(r2, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, (char) (Drawable.resolveOpacity(r2, r2) + 31155)).intern(), th, (boolean) r2);
        }
        WebChromeClient webChromeClient = this.f2345;
        if (webChromeClient != null) {
            return webChromeClient.getVideoLoadingProgressView();
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        int i = 2 % 2;
        int i2 = f2341 + 19;
        f2342 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.f2346.getVisitedHistory(valueCallback);
                super.hashCode();
                throw null;
            }
            this.f2346.getVisitedHistory(valueCallback);
            WebChromeClient webChromeClient = this.f2345;
            if (webChromeClient == null) {
                super.getVisitedHistory(valueCallback);
                int i3 = f2342 + 65;
                f2341 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            webChromeClient.getVisitedHistory(valueCallback);
            int i5 = f2341 + 59;
            f2342 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2231((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.argb(0, 0, 0, 0)).intern(), m2231(979 - Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x000e, B:12:0x0022, B:14:0x0031, B:15:0x0037), top: B:23:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x000e, B:12:0x0022, B:14:0x0031, B:15:0x0037), top: B:23:0x000e }] */
    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i;
        int i2 = 2 % 2;
        int i3 = f2342 + 61;
        f2341 = i3 % 128;
        if (i3 % 2 == 0) {
            try {
                if (Build.VERSION.SDK_INT >= 69) {
                    i = f2341 + 19;
                    f2342 = i % 128;
                    if (i % 2 == 0) {
                        this.f2346.onShowFileChooser(webView, valueCallback, fileChooserParams);
                        int i4 = f2341 + 7;
                        f2342 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        this.f2346.onShowFileChooser(webView, valueCallback, fileChooserParams);
                        throw null;
                    }
                }
            } catch (Throwable th) {
                jz.m2766(m2231((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - Color.alpha(0), (char) View.resolveSize(0, 0)).intern(), m2231(AndroidCharacter.getMirror('0') + 969, View.getDefaultSize(0, 0) + 38, (char) (Process.myPid() >> 22)).intern(), th, false);
            }
        } else {
            i = f2341 + 19;
            f2342 = i % 128;
            if (i % 2 == 0) {
                this.f2346.onShowFileChooser(webView, valueCallback, fileChooserParams);
                int i6 = f2341 + 7;
                f2342 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                this.f2346.onShowFileChooser(webView, valueCallback, fileChooserParams);
                throw null;
            }
        }
        if (this.f2345 != null) {
            int i8 = f2341 + 21;
            f2342 = i8 % 128;
            int i9 = i8 % 2;
            return this.f2345.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        byte b;
        Object objM2229;
        int i;
        int i2 = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != 1395849045) {
            if (iHashCode != 1442029578) {
                b = -1;
            } else {
                b = 0;
                if (!str.equals(m2231(MotionEvent.axisFromString("") + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 25 - TextUtils.getCapsMode("", 0, 0), (char) (45330 - TextUtils.getCapsMode("", 0, 0))).intern())) {
                    b = -1;
                }
            }
        } else if (!str.equals(m2231(Process.getGidForName("") + 1081, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
            b = -1;
        } else {
            b = 1;
        }
        if (b == 0) {
            objM2229 = m2229();
            i = f2342 + 75;
            f2341 = i % 128;
        } else {
            if (b != 1) {
                return null;
            }
            objM2229 = m2230();
            i = f2341 + 63;
            f2342 = i % 128;
        }
        int i3 = i % 2;
        return objM2229;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2231(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2344[b.f638 + i]) ^ (((long) b.f638) * f2343)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
