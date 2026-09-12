package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
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
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ag {

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    private static int f182 = 0;

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    private static int f183 = 1;

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f184 = 266495665;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private static int f185 = 1286622014;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static short[] f186 = null;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static int f187 = 23;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static byte[] f188 = {1, -104, -78, -67, -77, -123, -125, -69, -123, 101, -113, -15, -121, -69, -121, -74, -70, 78, -60, -67, -73, -74, -120, -76, -9, -3, 40, -4, -6, -2, 48, 39, -34, Ascii.NAK, 39, -1, -2, 10, -14, 77, -93, -80, -94, 56, 50, -86, 88, 3, 65, 52, -79, 56, -90, 55, -93, -83, -102, 94, -106, 79, -85, -118, 94, 58, -22, -3, -80, -28, 9, -82, 56, -85, -120, -18, -79, -93, -64, -86, -18, -37, 17, 17, Ascii.NAK, 3, -41, -65, -25, -59, -57, -35, -120, 39, -62, -40, -59, -56, -128, Ascii.FS, -36, -64, -64, -59, -62, -124, 39, -62, -40, -59, -88, -1, -99, -67, 125, -122, -92, -114, 58, -13, -83, -122, -79, 80, -18, -72, 75, -10, -74, 122, -81, 124, -107, -6, 38, -28, -11, -32, -92, 58, 10, -5, -7, -50, -96, 53, -15, -26, -17, -110, 6, 119, -88, -107, -31, -118, Ascii.US, 85, -119, -30, -117, 38, 65, -41, -28, 126, -20, Ascii.CAN, 84, -108, -40, -40, -121, -28, -117, 42, 65, -40, -68, -2, 109, 3, -91, -4, 3, -86, 73, 93, Ascii.CR, 58, 116, -75, -9, -91, -1, -1, -95, 9, -13, 0, 9, -22, Ascii.GS, 0, 84, -9, -110, -64, -4, 79, -10, -101, -76, 74, 81, -13, 89, -115, -60, -6, 81, -10, -105, -71, -1, -100, -63, 1, 77, -8, 75, 98, -5, Ascii.ESC, 34, -124, 74, 122, -117, 34, -121, -24, -57, Ascii.RS, -30, -61, Ascii.CAN, -106, Ascii.EM, 70, 2, 32, -8, -15, Ascii.GS, -78, 98, Ascii.GS, 32, -17, -75, 80, Ascii.RS, -11, -20, Ascii.SO, 4, -72, 92, Ascii.FS, -8, -8, 37, -20, 1};

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static long f189 = 0;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f190 = 0;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static char f191 = 15653;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private s f192;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private String f193;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Context f194;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private jk f195;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ah f197;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private is f198;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f199;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Handler f200;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f203;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f204;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private iv f205;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private an f206;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private af f207;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jd f208;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<ai> f201 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<je.b> f202 = new ArrayList();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f196 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    static /* synthetic */ iv m325(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 45;
        int i3 = i2 % 128;
        f182 = i3;
        int i4 = i2 % 2;
        iv ivVar = agVar.f205;
        int i5 = i3 + 83;
        f183 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return ivVar;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    static /* synthetic */ List m326(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 39;
        int i3 = i2 % 128;
        f182 = i3;
        int i4 = i2 % 2;
        List<je.b> list = agVar.f202;
        int i5 = i3 + 39;
        f183 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ jd m328(ag agVar) {
        int i = 2 % 2;
        int i2 = f182;
        int i3 = i2 + 93;
        f183 = i3 % 128;
        int i4 = i3 % 2;
        jd jdVar = agVar.f208;
        int i5 = i2 + 21;
        f183 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return jdVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ String m331(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 7;
        f182 = i2 % 128;
        if (i2 % 2 == 0) {
            return agVar.m327();
        }
        agVar.m327();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ int m332(ag agVar) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = f183 + 93;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        int iM330 = agVar.m330();
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = f183 + InterfaceC0280i1.d.b.g;
        f182 = i5 % 128;
        int i6 = i5 % 2;
        return iM330;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ an m334(ag agVar) {
        int i = 2 % 2;
        int i2 = f182 + 57;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        an anVar = agVar.f206;
        if (i3 != 0) {
            return anVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ af m336(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 61;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        af afVar = agVar.f207;
        if (i3 == 0) {
            return afVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ void m338(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 5;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m339();
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f183 + 9;
        f182 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m340(ag agVar) {
        int i = 2 % 2;
        int i2 = f182 + 77;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m365(true);
        int i4 = f183 + 59;
        f182 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ void m342(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 11;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m337();
        int i4 = f183 + 11;
        f182 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ Handler m343(ag agVar) {
        int i = 2 % 2;
        int i2 = f183;
        int i3 = i2 + 85;
        f182 = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = agVar.f200;
        int i5 = i2 + InterfaceC0280i1.d.b.d;
        f182 = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ void m346(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 81;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m358(false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ah m347(ag agVar) {
        int i = 2 % 2;
        int i2 = f182 + 99;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        ah ahVar = agVar.f197;
        if (i3 != 0) {
            return ahVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m352(ag agVar, ae aeVar) {
        int i = 2 % 2;
        int i2 = f182 + 73;
        f183 = i2 % 128;
        if (i2 % 2 == 0) {
            agVar.m360(aeVar);
            throw null;
        }
        boolean zM360 = agVar.m360(aeVar);
        int i3 = f183 + InterfaceC0280i1.d.b.g;
        f182 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return zM360;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ s m353(ag agVar) {
        int i = 2 % 2;
        int i2 = f183 + 33;
        int i3 = i2 % 128;
        f182 = i3;
        int i4 = i2 % 2;
        s sVar = agVar.f192;
        int i5 = i3 + 99;
        f183 = i5 % 128;
        if (i5 % 2 != 0) {
            return sVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m356(ag agVar) {
        int i = 2 % 2;
        int i2 = f182 + 79;
        f183 = i2 % 128;
        agVar.m354(i2 % 2 == 0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m362(ag agVar) {
        int i = 2 % 2;
        int i2 = f182 + 59;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m345();
        int i4 = f183 + 17;
        f182 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Thread.UncaughtExceptionHandler m366(ag agVar) {
        int i = 2 % 2;
        int i2 = f183;
        int i3 = i2 + 5;
        f182 = i3 % 128;
        int i4 = i3 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = agVar.f196;
        if (i4 != 0) {
            int i5 = 41 / 0;
        }
        int i6 = i2 + 113;
        f182 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
        return uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m368(ag agVar, List list, iz izVar) {
        int i = 2 % 2;
        int i2 = f183 + 59;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m363(list, izVar);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f183 + 75;
        f182 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m369(ag agVar, JSONObject jSONObject, iu iuVar) {
        int i = 2 % 2;
        int i2 = f183 + 39;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        agVar.m351(jSONObject, iuVar);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m370(ag agVar, int i) {
        int i2 = 2 % 2;
        int i3 = f182 + 23;
        f183 = i3 % 128;
        if (i3 % 2 != 0) {
            return agVar.m359(i);
        }
        agVar.m359(i);
        throw null;
    }

    public ag(Context context, ao aoVar, an anVar, boolean z, String str, s sVar) {
        this.f192 = sVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.4

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f256 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f257 = 7170499205722431711L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f258;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f259;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f260;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                int i = 2 % 2;
                int i2 = f256 + 93;
                f260 = i2 % 128;
                int i3 = i2 % 2;
                jz.m2759(m391("巑ﴆਞ쬾嶮\ue03d쉮࢟ᠧ", Color.blue(0) + 1091356246, "嚵ೆ硁Ⱇ", "惟捎묉掂", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m391("㿙었믲姄둝ꝯ嗍\udf3b颇王㧯濳䤜堠\uf360繇\uf742恜", View.resolveSizeAndState(0, 0, 0), "Ⳉ偒\ua83c嫪", "惟捎묉掂", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 60073)).intern(), m391("鮨\u2fdc\uf7bb紗㗮ꥱ讬ꬪ椃", (-1587911755) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "떺婣採鎈", "惟捎묉掂", (char) Drawable.resolveOpacity(0, 0)).intern(), th);
                ag.this.m379();
                ag.m366(ag.this).uncaughtException(thread, th);
                int i4 = f260 + 59;
                f256 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m391(String str2, int i, String str3, String str4, char c) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str3;
                if (str3 != null) {
                    charArray2 = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str2;
                if (str2 != null) {
                    charArray3 = str2.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (g.f2155) {
                    char[] cArr4 = (char[]) cArr2.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    g.f2156 = 0;
                    while (g.f2156 < length) {
                        int i2 = (g.f2156 + 2) % 4;
                        int i3 = (g.f2156 + 3) % 4;
                        g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                        cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                        cArr4[i3] = g.f2154;
                        cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f257) ^ ((long) f259)) ^ ((long) f258));
                        g.f2156++;
                    }
                    str5 = new String(cArr6);
                }
                return str5;
            }
        });
        this.f206 = anVar;
        this.f194 = context;
        je jeVar = new je(context, m349("富晠䇳\ud993窑ꢇ卪\ue60d䃏\ue8eb廖伤⾉쇱\uf5eaꂙ憨蛩㬊儵㯯쬜廑\u0ace⭀", TextUtils.indexOf("", "") + 1568192992, "\ue010碹홝晏", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), m355((-1286622014) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 24), (-24) - (ViewConfiguration.getTouchSlop() >> 8), (-266495550) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (96 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern());
        this.f208 = new jd(m349("㌮慰뤂\uf1cb泒博ꌲ䄚", ViewConfiguration.getKeyRepeatDelay() >> 16, "뼐ᴬ㠤\u0016", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m349("ᠽ\uf78f௫昤・㶗", TextUtils.indexOf("", ""), "淎㙚軯髙", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 55694)).intern(), jeVar);
        int iM361 = m361(jeVar);
        this.f207 = new af(context, aoVar, iM361, m348(jeVar), ar.m480().mo483());
        this.f205 = new iv(context);
        this.f204 = false;
        HandlerThread handlerThread = new HandlerThread(m355(TextUtils.getTrimmedLength("") - 1286621990, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 104), ImageFormat.getBitsPerPixel(0) - 23, (ViewConfiguration.getWindowTouchSlop() >> 8) - 266495598, (short) (109 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
        handlerThread.start();
        this.f200 = new Handler(handlerThread.getLooper());
        this.f197 = new ah(iM361);
        this.f203 = !z;
        this.f193 = str;
        m354(true);
        m341();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m377() {
        int i = 2 % 2;
        int i2 = f182 + 17;
        int i3 = i2 % 128;
        f183 = i3;
        if (i2 % 2 == 0) {
            this.f204 = false;
            if (this.f200 != null) {
                int i4 = i3 + 77;
                f182 = i4 % 128;
                int i5 = i4 % 2;
                this.f200.removeCallbacksAndMessages(null);
            }
        } else {
            this.f204 = false;
            if (this.f200 != null) {
                int i6 = i3 + 77;
                f182 = i6 % 128;
                int i7 = i6 % 2;
                this.f200.removeCallbacksAndMessages(null);
            }
        }
        this.f205.m2495();
        m344();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m365(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = f182 + 83;
        f183 = i2 % 128;
        if (i2 % 2 == 0) {
            z2 = false;
            this.f204 = false;
        } else {
            z2 = true;
            this.f204 = true;
        }
        m354(z2);
        int i3 = f183 + 25;
        f182 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m380(ai aiVar) {
        int i = 2 % 2;
        int i2 = f182 + 31;
        f183 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f201.add(aiVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f201.add(aiVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m375(je.b bVar) {
        int i = 2 % 2;
        int i2 = f183 + 119;
        f182 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f202.add(bVar);
            int i3 = 3 / 0;
        } else {
            this.f202.add(bVar);
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m339() {
        int i = 2 % 2;
        int i2 = f182;
        int i3 = i2 + 123;
        f183 = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f203) {
                int i4 = i2 + 105;
                f183 = i4 % 128;
                if (i4 % 2 == 0) {
                    m372();
                    throw null;
                }
                m372();
            }
            this.f203 = false;
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m376() {
        int i = 2 % 2;
        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.1

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f209 = {'n', 225, 225, 218, 225, 235, 228, 228, 225, 223, 234};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f210 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f211 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                ag.m353(ag.this).onEvent(m381(new int[]{0, 11, 120, 0}, true, "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000").intern());
                ag.this.m373(m381(new int[]{0, 11, 120, 0}, true, "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000").intern(), new JSONObject());
                int i3 = f211 + 105;
                f210 = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m381(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (j.f2691) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f209, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        j.f2692 = 0;
                        char c = 0;
                        while (j.f2692 < i3) {
                            if (bArr[j.f2692] == 1) {
                                cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                            } else {
                                cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                            }
                            c = cArr2[j.f2692];
                            j.f2692++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i6, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr4[j.f2692] = cArr[(i3 - j.f2692) - 1];
                            j.f2692++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        j.f2692 = 0;
                        while (j.f2692 < i3) {
                            cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                            j.f2692++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        });
        int i2 = f183 + 35;
        f182 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m372() {
        int i = 2 % 2;
        p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.10

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f213 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f214 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f215 = true;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f216 = 225;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f217 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f218 = {341, 337, 320, 340, 326, 322, 339};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                ag.m353(ag.this).onEvent(m382(null, TextUtils.indexOf("", "", 0, 0) + WorkQueueKt.MASK, null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                ag.this.m373(m382(null, ExpandableListView.getPackedPositionType(0L) + WorkQueueKt.MASK, null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), new JSONObject());
                int i3 = f213 + 27;
                f214 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m382(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (m.f3007) {
                    char[] cArr2 = f218;
                    int i3 = f216;
                    if (f215) {
                        int length = bArr.length;
                        m.f3005 = length;
                        char[] cArr3 = new char[length];
                        m.f3006 = 0;
                        while (m.f3006 < m.f3005) {
                            cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i2] - i3);
                            m.f3006++;
                        }
                        return new String(cArr3);
                    }
                    if (f217) {
                        int length2 = cArr.length;
                        m.f3005 = length2;
                        char[] cArr4 = new char[length2];
                        m.f3006 = 0;
                        while (m.f3006 < m.f3005) {
                            cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i2] - i3);
                            m.f3006++;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f3005 = length3;
                    char[] cArr5 = new char[length3];
                    m.f3006 = 0;
                    while (m.f3006 < m.f3005) {
                        cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i2] - i3);
                        m.f3006++;
                    }
                    return new String(cArr5);
                }
            }
        });
        int i2 = f182 + 63;
        f183 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m379() {
        int i = 2 % 2;
        int i2 = f183 + 31;
        f182 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f203 = false;
                m376();
            } else {
                this.f203 = true;
                m376();
            }
            m374();
            int i3 = f183 + 9;
            f182 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            jz.m2766(m355(AndroidCharacter.getMirror('0') - 19272, (byte) (Color.alpha(0) - 53), (-24) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-266495600) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-114) - View.resolveSizeAndState(0, 0, 0))).intern(), m355(Color.argb(0, 0, 0, 0) - 1286621967, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55), TextUtils.lastIndexOf("", '0', 0) - 23, 39364 - AndroidCharacter.getMirror('0'), (short) (Drawable.resolveOpacity(0, 0) - 115)).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m374() {
        synchronized (this) {
            Handler handler = this.f200;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m354(true);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m367(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m349("軵斏䓠췐찔", 1902154767 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "ฆ悔㹱ଗ", "\u0000\u0000\u0000\u0000", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5949)).intern(), str);
            jSONObject2.put(m355((-1286621941) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (116 - ((Process.getThreadPriority(0) + 20) >> 6)), (-24) - Drawable.resolveOpacity(0, 0), Color.green(0) - 266495564, (short) (TextUtils.indexOf("", "") - 49)).intern(), str2);
            jSONObject2.put(m349("뺄ዾ裭끒娳鱔", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "统༶㵫䅕", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21820)).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                int i2 = f183 + 125;
                f182 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject2.put(m355((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1286621936, (byte) (23 - (Process.myPid() >> 22)), (KeyEvent.getMaxKeyCode() >> 16) - 24, (-266495564) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (TextUtils.getCapsMode("", 0, 0) + 5)).intern(), str4);
            }
            if (jSONObject != null) {
                kd.m2828(jSONObject2, jSONObject);
                int i4 = f183 + 121;
                f182 = i4 % 128;
                int i5 = i4 % 2;
            }
            return jSONObject2;
        } catch (JSONException e) {
            n.m2873(m355((-1286621977) - ImageFormat.getBitsPerPixel(0), (byte) (Color.red(0) - 53), (-24) - TextUtils.getCapsMode("", 0, 0), (-266495600) - Color.argb(0, 0, 0, 0), (short) ((-114) - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), m355(ExpandableListView.getPackedPositionChild(0L) - 1286621930, (byte) ((-16777097) - Color.rgb(0, 0, 0)), (-24) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-266495596) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (TextUtils.lastIndexOf("", '0') - 77)).intern(), (Throwable) e);
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m373(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f182 + 3;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m357(str, jSONObject, null);
        if (i3 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m357(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f183 + 47;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        m378(str, jSONObject, jSONObject2, null);
        int i4 = f182 + 29;
        f183 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m378(String str, JSONObject jSONObject, JSONObject jSONObject2, final iu iuVar) {
        Exception exc;
        int i = 2 % 2;
        int i2 = -1286621976;
        long j = 0;
        n.m2877(m355(View.MeasureSpec.getMode(0) - 1286621976, (byte) (View.MeasureSpec.getMode(0) - 53), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 24, (-266495600) - Color.alpha(0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 114)).intern(), new StringBuilder().append(m355((ViewConfiguration.getJumpTapTimeout() >> 16) - 1286621905, (byte) ((-27) - KeyEvent.getDeadChar(0, 0)), (-24) - ((Process.getThreadPriority(0) + 20) >> 6), (-266495581) - Color.argb(0, 0, 0, 0), (short) (TextUtils.indexOf("", "", 0, 0) + 102)).intern()).append(str).append(m355((-1286621882) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (114 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) - 23, KeyEvent.keyCodeFromString("") - 266495633, (short) (ExpandableListView.getPackedPositionType(0L) - 108)).intern()).toString(), jSONObject);
        try {
            if (m335().m557().contains(str)) {
                try {
                    try {
                        n.m2870(m355((ViewConfiguration.getScrollBarSize() >> 8) - 1286621976, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 52), Drawable.resolveOpacity(0, 0) - 24, (-266495600) - Color.argb(0, 0, 0, 0), (short) ((-114) - View.MeasureSpec.getSize(0))).intern(), new StringBuilder().append(m355((-1286621866) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38), (Process.myPid() >> 22) - 24, (ViewConfiguration.getEdgeSlop() >> 16) - 266495587, (short) (74 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern()).append(str).append(m355((-1286621836) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((-94) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 24, (-266495634) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((-87) - Color.red(0))).intern()).toString());
                        int i3 = f182 + InterfaceC0280i1.d.b.g;
                        f183 = i3 % 128;
                        if (i3 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        j = 0;
                        jz.m2760(m355((ViewConfiguration.getMaximumFlingVelocity() >> 16) + i2, (byte) ((-54) - MotionEvent.axisFromString("")), (-25) - TextUtils.lastIndexOf("", '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 266495601, (short) ((-114) - TextUtils.indexOf("", "", 0))).intern(), m355((-1286621784) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 63), View.MeasureSpec.getSize(0) - 24, (-283272812) - Color.rgb(0, 0, 0), (short) ((-88) - ImageFormat.getBitsPerPixel(0))).intern(), exc, false, false, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                i2 = -1286621976;
                try {
                    try {
                        n.m2870(m355(TextUtils.indexOf("", "") - 1286621976, (byte) (View.combineMeasuredStates(0, 0) - 53), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 25, (-266495601) - TextUtils.lastIndexOf("", '0', 0), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 115)).intern(), new StringBuilder().append(m355(TextUtils.lastIndexOf("", '0') - 1286621815, (byte) ((-16777310) - Color.rgb(0, 0, 0)), Color.argb(0, 0, 0, 0) - 24, (-266495582) - TextUtils.lastIndexOf("", '0'), (short) (90 - ((Process.getThreadPriority(0) + 20) >> 6))).intern()).append(str).toString());
                        this.f207.m322(str, jSONObject, jSONObject2, this.f205.m2493().m2526(), new af.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.6
                            @Override // com.ironsource.adqualitysdk.sdk.i.af.c
                            public void onEventGenerated(JSONObject jSONObject3) {
                                ag.m347(ag.this).m417(jSONObject3);
                                ag.m369(ag.this, jSONObject3, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.6.5

                                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                    private static int[] f266 = {-954890256, 1062123796, 1344120342, -863209763, 180242292, -1706880924, -1586624896, 1405817645, -666194753, -1433390779, 1825510300, 472820251, 1041306565, 2118924665, -301043147, -151947245, -884361267, -2078563504};

                                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                    private static int f267 = 0;

                                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                    private static int f268 = 1;

                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo227() {
                                        int i4 = 2 % 2;
                                        int i5 = f268 + 117;
                                        f267 = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            ag.m356(ag.this);
                                            if (iuVar != null) {
                                                int i6 = f267 + 43;
                                                f268 = i6 % 128;
                                                int i7 = i6 % 2;
                                                try {
                                                    iuVar.mo227();
                                                    return;
                                                } catch (Exception e3) {
                                                    jz.m2760(m392(new int[]{-1624557402, 567805844, -739255683, 1940705872, -1915832951, 1791016217}, 8 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m392(new int[]{160172838, -2101126295, -1559196444, 1790496700, 1004221257, 718681991, -111150685, -1187493135, 1808892517, 345262080, -1879636595, 1345746131, 1107428235, 802003389, -594968352, -1009608940}, 32 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e3, false, false, true);
                                                }
                                            }
                                            int i8 = f268 + 115;
                                            f267 = i8 % 128;
                                            int i9 = i8 % 2;
                                            return;
                                        }
                                        ag.m356(ag.this);
                                        iu iuVar2 = iuVar;
                                        throw null;
                                    }

                                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                    private static String m392(int[] iArr, int i4) {
                                        String str2;
                                        synchronized (c.f1230) {
                                            char[] cArr = new char[4];
                                            char[] cArr2 = new char[iArr.length << 1];
                                            int[] iArr2 = (int[]) f266.clone();
                                            c.f1231 = 0;
                                            while (c.f1231 < iArr.length) {
                                                cArr[0] = (char) (iArr[c.f1231] >> 16);
                                                cArr[1] = (char) iArr[c.f1231];
                                                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                                                cArr[3] = (char) iArr[c.f1231 + 1];
                                                c.f1232 = (cArr[0] << 16) + cArr[1];
                                                c.f1233 = (cArr[2] << 16) + cArr[3];
                                                c.m1415(iArr2);
                                                for (int i5 = 0; i5 < 16; i5++) {
                                                    int i6 = c.f1232 ^ iArr2[i5];
                                                    c.f1232 = i6;
                                                    c.f1233 = c.m1414(i6) ^ c.f1233;
                                                    int i7 = c.f1232;
                                                    c.f1232 = c.f1233;
                                                    c.f1233 = i7;
                                                }
                                                int i8 = c.f1232;
                                                c.f1232 = c.f1233;
                                                c.f1233 = i8;
                                                c.f1233 = i8 ^ iArr2[16];
                                                c.f1232 ^= iArr2[17];
                                                int i9 = c.f1232;
                                                int i10 = c.f1233;
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
                                            str2 = new String(cArr2, 0, i4);
                                        }
                                        return str2;
                                    }
                                });
                            }
                        });
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        jz.m2760(m355((ViewConfiguration.getMaximumFlingVelocity() >> 16) + i2, (byte) ((-54) - MotionEvent.axisFromString("")), (-25) - TextUtils.lastIndexOf("", '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 266495601, (short) ((-114) - TextUtils.indexOf("", "", 0))).intern(), m355((-1286621784) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 63), View.MeasureSpec.getSize(0) - 24, (-283272812) - Color.rgb(0, 0, 0), (short) ((-88) - ImageFormat.getBitsPerPixel(0))).intern(), exc, false, false, true);
                    }
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    jz.m2760(m355((ViewConfiguration.getMaximumFlingVelocity() >> 16) + i2, (byte) ((-54) - MotionEvent.axisFromString("")), (-25) - TextUtils.lastIndexOf("", '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 266495601, (short) ((-114) - TextUtils.indexOf("", "", 0))).intern(), m355((-1286621784) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 63), View.MeasureSpec.getSize(0) - 24, (-283272812) - Color.rgb(0, 0, 0), (short) ((-88) - ImageFormat.getBitsPerPixel(0))).intern(), exc, false, false, true);
                }
            }
        } catch (Exception e5) {
            e = e5;
            i2 = -1286621976;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m345() {
        int i = 2 % 2;
        int i2 = f182 + 49;
        f183 = i2 % 128;
        int i3 = i2 % 2;
        m354(false);
        int i4 = f182 + 47;
        f183 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m341() {
        int i = 2 % 2;
        this.f198 = new is() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.8
            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo395() {
                ag.m362(ag.this);
            }
        };
        this.f205.m2493().m2531(this.f198);
        this.f195 = new jk(new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.9

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f272 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static short[] f273 = null;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f274 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f275 = -117981438;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static byte[] f276 = {5, -8, Ascii.FF, 19, -38, 17, 2, 7, Ascii.DLE, -6, -11, -5, Ascii.CR, Ascii.VT, -13, 45, Ascii.CAN, -8, Ascii.FF, -13, 78, -89, 5, Ascii.VT, -13, Ascii.CR, -11, 17, 2, 65, -71, -7, 5, 5, 0, 3, 65, -82, 3, -3, 0, 45};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f277 = -744948228;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f278 = 2;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            static /* synthetic */ JSONObject m397(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f272 + 79;
                f274 = i3 % 128;
                if (i3 % 2 != 0) {
                    return m396(activity);
                }
                m396(activity);
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo399(final Activity activity) {
                int i2 = 2 % 2;
                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.9.1

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f280 = 0;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static long f281 = 7944212977112584270L;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f282 = 1;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        int i3 = 2 % 2;
                        int i4 = f280 + 35;
                        f282 = i4 % 128;
                        int i5 = i4 % 2;
                        ag.m353(ag.this).onEvent(m401("꒜ꓺ\ue030솵\uf011\ue14a\uf355쏊\ue5d7ꇈ胲놇⚟招", Color.argb(0, 0, 0, 0)).intern());
                        ag.this.m373(m401("꒜ꓺ\ue030솵\uf011\ue14a\uf355쏊\ue5d7ꇈ胲놇⚟招", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern(), AnonymousClass9.m397(activity));
                        int i6 = f282 + 21;
                        f280 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m401(String str, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (h.f2288) {
                            char[] cArrM2212 = h.m2212(f281, cArr, i3);
                            h.f2289 = 4;
                            while (h.f2289 < cArrM2212.length) {
                                h.f2290 = h.f2289 - 4;
                                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f281));
                                h.f2289++;
                            }
                            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
                        }
                        return str2;
                    }
                });
                int i3 = f274 + 49;
                f272 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo400(final Activity activity) {
                int i2 = 2 % 2;
                p.m2894(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.9.4

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static char f285 = 23547;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f286 = 0;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f287 = 1;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char f288 = 45723;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static char f289 = 10105;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static char f290 = 43816;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        int i3 = 2 % 2;
                        int i4 = f287 + 27;
                        f286 = i4 % 128;
                        int i5 = i4 % 2;
                        ag.m353(ag.this).onEvent(m402("༨\uf130碊\uf53f辨鬤䀶⼀㤵훊▃뉔缝Ǌ", 13 - ExpandableListView.getPackedPositionChild(0L)).intern());
                        ag.this.m373(m402("༨\uf130碊\uf53f辨鬤䀶⼀㤵훊▃뉔缝Ǌ", 13 - MotionEvent.axisFromString("")).intern(), AnonymousClass9.m397(activity));
                        int i6 = f286 + InterfaceC0280i1.d.b.d;
                        f287 = i6 % 128;
                        int i7 = i6 % 2;
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m402(String str, int i3) {
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
                                int i4 = 58224;
                                for (int i5 = 0; i5 < 16; i5++) {
                                    char c = cArr3[1];
                                    char c2 = cArr3[0];
                                    char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + f290)) ^ ((c2 >>> 5) + f285)));
                                    cArr3[1] = c3;
                                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f289) ^ ((c3 + i4) ^ ((c3 << 4) + f288))));
                                    i4 -= 40503;
                                }
                                cArr2[k.f2951] = cArr3[0];
                                cArr2[k.f2951 + 1] = cArr3[1];
                                k.f2951 += 2;
                            }
                            str2 = new String(cArr2, 0, i3);
                        }
                        return str2;
                    }
                });
                int i3 = f272 + 65;
                f274 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static JSONObject m396(Activity activity) {
                int i2 = 2 % 2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m398(117981438 - View.resolveSize(0, 0), (byte) Drawable.resolveOpacity(0, 0), TextUtils.getCapsMode("", 0, 0) - 3, ExpandableListView.getPackedPositionChild(0L) + 744948326, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern(), activity.getClass().getName());
                } catch (JSONException unused) {
                    n.m2887(m398(117981445 - View.MeasureSpec.getSize(0), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-3) - Gravity.getAbsoluteGravity(0, 0), 744948292 - TextUtils.lastIndexOf("", '0'), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), m398(117981453 - ImageFormat.getBitsPerPixel(0), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-3) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 744948297, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                }
                int i3 = f274 + InterfaceC0280i1.d.b.i;
                f272 = i3 % 128;
                if (i3 % 2 == 0) {
                    return jSONObject;
                }
                throw null;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m398(int i2, byte b, int i3, int i4, short s) {
                String string;
                synchronized (l.f2999) {
                    StringBuilder sb = new StringBuilder();
                    int i5 = f278;
                    int i6 = i3 + i5;
                    int i7 = i6 == -1 ? 1 : 0;
                    if (i7 != 0) {
                        byte[] bArr = f276;
                        if (bArr != null) {
                            i6 = (byte) (bArr[f275 + i2] + i5);
                        } else {
                            i6 = (short) (f273[f275 + i2] + i5);
                        }
                    }
                    if (i6 > 0) {
                        l.f3000 = ((i2 + i6) - 2) + f275 + i7;
                        l.f3002 = b;
                        l.f3004 = (char) (i4 + f277);
                        sb.append(l.f3004);
                        l.f3003 = l.f3004;
                        l.f3001 = 1;
                        while (l.f3001 < i6) {
                            byte[] bArr2 = f276;
                            if (bArr2 != null) {
                                int i8 = l.f3000;
                                l.f3000 = i8 - 1;
                                l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i8] + s)) ^ l.f3002));
                            } else {
                                short[] sArr = f273;
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
        jj.m2645().m2648(new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.7
            @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo393(Activity activity) {
                ag.this.m379();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jf, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo394(Activity activity) {
                ag.m338(ag.this);
            }
        });
        ar.m480().mo509(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.13
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo385() {
                ag.m340(ag.this);
            }
        });
        int i2 = f183 + 97;
        f182 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m344() {
        int i = 2 % 2;
        Object obj = null;
        if (this.f198 != null) {
            int i2 = f183 + 27;
            f182 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f205.m2493().m2529(this.f198);
                super.hashCode();
                throw null;
            }
            this.f205.m2493().m2529(this.f198);
            int i3 = f183 + 81;
            f182 = i3 % 128;
            int i4 = i3 % 2;
        }
        this.f195.m2662();
        this.f195 = null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m361(je jeVar) {
        int i = 2 % 2;
        String strM2606 = jeVar.m2606(m349("懶ӬỀ茥ꑛ㰪毨쓉▟믚", ViewConfiguration.getMaximumFlingVelocity() >> 16, "ﺞ懲緸听", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern());
        int i2 = 1;
        if (!TextUtils.isEmpty(strM2606)) {
            int i3 = f183 + 67;
            f182 = i3 % 128;
            int i4 = i3 % 2;
            i2 = 1 + Integer.parseInt(strM2606);
        }
        jeVar.m2608(m349("懶ӬỀ茥ꑛ㰪毨쓉▟믚", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, "ﺞ懲緸听", "\u0000\u0000\u0000\u0000", (char) View.combineMeasuredStates(0, 0)).intern(), String.valueOf(i2));
        int i5 = f183 + 75;
        f182 = i5 % 128;
        if (i5 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m371() {
        int i = 2 % 2;
        String strM348 = m348(new je(this.f194, m349("富晠䇳\ud993窑ꢇ卪\ue60d䃏\ue8eb廖伤⾉쇱\uf5eaꂙ憨蛩㬊儵㯯쬜廑\u0ace⭀", Color.alpha(0) + 1568192992, "\ue010碹홝晏", "\u0000\u0000\u0000\u0000", (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), m355(TextUtils.getCapsMode("", 0, 0) - 1286622014, (byte) ((-23) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) - 24, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 266495551, (short) (95 - TextUtils.lastIndexOf("", '0'))).intern()));
        int i2 = f183 + 35;
        f182 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM348;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m348(je jeVar) {
        int i = 2 % 2;
        int i2 = f182 + 3;
        f183 = i2 % 128;
        if (i2 % 2 == 0) {
            String strM2606 = jeVar.m2606(m349("\ue7de䰰療࿕펿咱티႟⇸굞\ue736혗ަ\uf3bb\uf85f㜖", 1 >> ExpandableListView.getPackedPositionChild(1L), "闑\ue878뛞짔", "\u0000\u0000\u0000\u0000", (char) (54453 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)))).intern());
            if (!TextUtils.isEmpty(strM2606)) {
                return strM2606;
            }
        } else {
            String strM2607 = jeVar.m2606(m349("\ue7de䰰療࿕펿咱티႟⇸굞\ue736혗ަ\uf3bb\uf85f㜖", ExpandableListView.getPackedPositionChild(0L) + 1, "闑\ue878뛞짔", "\u0000\u0000\u0000\u0000", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54453)).intern());
            if (!TextUtils.isEmpty(strM2607)) {
                return strM2607;
            }
        }
        String string = UUID.randomUUID().toString();
        jeVar.m2608(m349("\ue7de䰰療࿕펿咱티႟⇸굞\ue736혗ަ\uf3bb\uf85f㜖", ExpandableListView.getPackedPositionType(0L), "闑\ue878뛞짔", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 54454)).intern(), string);
        int i3 = f182 + 99;
        f183 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m329() {
        boolean z;
        int i = 2 % 2;
        int i2 = f183 + 99;
        int i3 = i2 % 128;
        f182 = i3;
        if (i2 % 2 != 0) {
            z = this.f199;
            int i4 = 57 / 0;
        } else {
            z = this.f199;
        }
        int i5 = i3 + 17;
        f183 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m358(boolean z) {
        int i = 2 % 2;
        int i2 = f182 + 55;
        int i3 = i2 % 128;
        f183 = i3;
        int i4 = i2 % 2;
        this.f199 = z;
        int i5 = i3 + 73;
        f182 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized as m335() {
        as asVarMo493;
        int i = 2 % 2;
        int i2 = f183 + 29;
        f182 = i2 % 128;
        if (i2 % 2 != 0) {
            asVarMo493 = ar.m480().mo493();
            int i3 = 88 / 0;
        } else {
            asVarMo493 = ar.m480().mo493();
        }
        int i4 = f183 + 49;
        f182 = i4 % 128;
        if (i4 % 2 == 0) {
            return asVarMo493;
        }
        int i5 = 83 / 0;
        return asVarMo493;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m333() {
        int i = 2 % 2;
        int i2 = f183 + 79;
        f182 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f204;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m354(final boolean z) {
        int i = 2 % 2;
        this.f208.m2590(new jd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.11
            @Override // com.ironsource.adqualitysdk.sdk.i.jd.d
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo383(int i2) {
                ag.m343(ag.this).removeCallbacksAndMessages(null);
                ag.m343(ag.this).postDelayed(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.11.2

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f222 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static short[] f223 = null;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f224 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static byte[] f225 = {-82, -104, -109, -103, -85, -87, -111, -53, 40, 48, 45, 41, 110, -34, 41, 40, 55, 113, -40, 42, 49, 52, Ascii.SUB, 60, 112, -28, 36, 48, 48, 33, 52, Ascii.GS, 126, -39, 46, 40, 43, 88, 0, 0};

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f226 = -1136134798;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f227 = -682786728;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f228 = 8;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        int i3 = 2 % 2;
                        int i4 = f224 + 39;
                        f222 = i4 % 128;
                        try {
                            if (i4 % 2 == 0) {
                                ag.m342(ag.this);
                            } else {
                                ag.m342(ag.this);
                                throw null;
                            }
                        } catch (Throwable th) {
                            n.m2875(m384((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1136134798, (byte) Color.argb(0, 0, 0, 0), 1 - (ViewConfiguration.getTouchSlop() >> 8), 682786793 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (98 - View.MeasureSpec.getMode(0))).intern(), m384(1136134806 - Color.red(0), (byte) ((-1) - Process.getGidForName("")), (ViewConfiguration.getScrollBarSize() >> 8) + 23, Color.rgb(0, 0, 0) + 699564013, (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 43)).intern(), th);
                            ag.m346(ag.this);
                        }
                    }

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m384(int i3, byte b, int i4, int i5, short s) {
                        String string;
                        synchronized (l.f2999) {
                            StringBuilder sb = new StringBuilder();
                            int i6 = f228;
                            int i7 = i4 + i6;
                            int i8 = i7 == -1 ? 1 : 0;
                            if (i8 != 0) {
                                byte[] bArr = f225;
                                if (bArr != null) {
                                    i7 = (byte) (bArr[f226 + i3] + i6);
                                } else {
                                    i7 = (short) (f223[f226 + i3] + i6);
                                }
                            }
                            if (i7 > 0) {
                                l.f3000 = ((i3 + i7) - 2) + f226 + i8;
                                l.f3002 = b;
                                l.f3004 = (char) (i5 + f227);
                                sb.append(l.f3004);
                                l.f3003 = l.f3004;
                                l.f3001 = 1;
                                while (l.f3001 < i7) {
                                    byte[] bArr2 = f225;
                                    if (bArr2 != null) {
                                        int i9 = l.f3000;
                                        l.f3000 = i9 - 1;
                                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i9] + s)) ^ l.f3002));
                                    } else {
                                        short[] sArr = f223;
                                        int i10 = l.f3000;
                                        l.f3000 = i10 - 1;
                                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i10] + s)) ^ l.f3002));
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
                }, (ag.m370(ag.this, i2) || z) ? 0L : ag.m332(ag.this));
            }
        });
        int i2 = f183 + 91;
        f182 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m359(int i) {
        int i2 = 2 % 2;
        int i3 = f183 + 63;
        f182 = i3 % 128;
        if (i3 % 2 != 0) {
            m335().m559();
            throw null;
        }
        if (i < m335().m559()) {
            return false;
        }
        int i4 = f182 + 97;
        f183 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ag$3, reason: invalid class name */
    final class AnonymousClass3 implements iz, jd.e {
        AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jd.e
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void mo390(List<ja> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<ja> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ae(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ae aeVar = (ae) priorityQueue.poll(); aeVar != null; aeVar = (ae) priorityQueue.poll()) {
                            if (ag.m352(ag.this, aeVar)) {
                                if (TextUtils.isEmpty(aeVar.m312())) {
                                    aeVar.m311(ag.m336(ag.this).m2676().m467());
                                }
                                arrayList.add(aeVar);
                            } else {
                                ag.m328(ag.this).m2591(aeVar.m307());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ag.m368(ag.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    ag.m346(ag.this);
                    return;
                }
            }
            ag.m346(ag.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iz
        /* JADX INFO: renamed from: ｋ */
        public final void mo387(ir irVar) {
            ag.m346(ag.this);
            ag.m356(ag.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iz
        /* JADX INFO: renamed from: ﾒ */
        public final void mo388(ir irVar, String str) {
            ag.m346(ag.this);
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized void m337() {
        int i = 2 % 2;
        if (m333() && !TextUtils.isEmpty(this.f207.m2676().m467())) {
            int i2 = f182 + 5;
            f183 = i2 % 128;
            if (i2 % 2 == 0) {
                m329();
                throw null;
            }
            if (!m329()) {
                m358(true);
                n.m2870(m355(View.resolveSize(0, 0) - 1286621976, (byte) (TextUtils.getOffsetBefore("", 0) - 53), TextUtils.lastIndexOf("", '0') - 23, KeyEvent.normalizeMetaState(0) - 266495600, (short) (MotionEvent.axisFromString("") - 113)).intern(), m355(TextUtils.getOffsetAfter("", 0) - 1286621766, (byte) ((-22) - View.MeasureSpec.getSize(0)), (-24) - (ViewConfiguration.getWindowTouchSlop() >> 8), (-266495582) - TextUtils.getCapsMode("", 0, 0), (short) (ExpandableListView.getPackedPositionType(0L) - 9)).intern());
                this.f208.m2589(m335().m559(), new AnonymousClass3());
            }
        }
        int i3 = f183 + 31;
        f182 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m360(ae aeVar) {
        int i = 2 % 2;
        int i2 = f183 + 113;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        boolean zMo511 = ar.m480().mo511(aeVar.m308(), this.f193);
        int i4 = f182 + InterfaceC0280i1.d.b.d;
        f183 = i4 % 128;
        int i5 = i4 % 2;
        return zMo511;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ag$2, reason: invalid class name */
    class AnonymousClass2 implements af.c {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ iz f232;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f233;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ List f234;

        AnonymousClass2(JSONArray jSONArray, List list, iz izVar) {
            this.f233 = jSONArray;
            this.f234 = list;
            this.f232 = izVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.af.c
        public void onEventGenerated(JSONObject jSONObject) {
            ag.m347(ag.this).m417(jSONObject);
            ag.m325(ag.this).m2494(ag.m334(ag.this).m451(ag.m331(ag.this)), jSONObject, new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.2.5

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f235 = 1;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f236 = {'9', 'k', 'f', 'n', 'v', 'r', 'f', 'g', 'W', 23, 'X', Ascii.MAX, 'w', '{', 'k', 'b', 'w', 'w', 'z', 'W', 'W', '~', 'x', 'Q', 'P', 'z', '~', '|', '}', Ascii.MAX, 'z', 'y', 'W', 'W', 129, 'z', 'r', 'q', 'z', 130, 'W', 'N', 'N', 'X', Ascii.MAX, 'i', Typography.quote, 'T', 'i', 'i', 'l', 'I', 'D', 'n', 'n', 'p', 'K', 'C', 'j', 'n', 'p', 't', 'K', 'J', 'q', 'i', 'n', 'K', 'C', 'j', 'k', 'h', 'n', 'l', 'i', 'n', 'a', '9', '-', 'O', 'l', 'p', 'n', 'o', 'q', 'l', 'k', 'I', 'J', 'q', '[', '3', '\'', 'Q', 'q', 'i', 'm', 18};

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f237;

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo387(final ir irVar) {
                    final int iM2486 = irVar.m2482().m2486();
                    final String strM2487 = irVar.m2482().m2487();
                    if (iM2486 >= 200 && iM2486 <= 299) {
                        n.m2877(m386(new int[]{0, 9, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern(), m386(new int[]{9, 37, 14, 0}, true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000").intern(), AnonymousClass2.this.f233);
                        Iterator it = AnonymousClass2.this.f234.iterator();
                        while (it.hasNext()) {
                            ag.m328(ag.this).m2591(((ae) it.next()).m307());
                        }
                        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.2.5.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                AnonymousClass2.this.f232.mo387(irVar);
                            }
                        });
                        return;
                    }
                    if (iM2486 == 403) {
                        synchronized (ag.this) {
                            for (final je.b bVar : ag.m326(ag.this)) {
                                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.2.5.1
                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo227() {
                                        bVar.mo2611();
                                    }
                                });
                            }
                        }
                    } else {
                        n.m2870(m386(new int[]{0, 9, 0, 0}, true, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern(), new StringBuilder().append(m386(new int[]{46, 51, 0, 31}, true, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001").intern()).append(iM2486).append(m386(new int[]{97, 1, 5, 1}, false, "\u0001").intern()).append(strM2487).toString());
                    }
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.2.5.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f240 = 0;

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static char f241 = 12765;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static char f242 = 35621;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f243 = 1;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static char f244 = 51591;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char f245 = 36229;

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            int i = 2 % 2;
                            AnonymousClass2.this.f232.mo388(irVar, new StringBuilder().append(m389("蝚牦⸷嗉\uaacd쾱ﺊ㒎河ﰂѲ튽蘱ᡕ೬듖鐔ㆈ쓸풷೬듖䃁虄쇷諮࿙섴㑰\uf74a\ufb0f흁蚉\uf474등တ䥀譕奻淉\udc1aጼ뛼⣏㔦ﴀ์\uefa5좆쩒淮㐗", 51 - (Process.myPid() >> 22)).intern()).append(iM2486).append(m389("淮㐗", 1 - Color.argb(0, 0, 0, 0)).intern()).append(strM2487).toString());
                            int i2 = f243 + 113;
                            f240 = i2 % 128;
                            if (i2 % 2 != 0) {
                                throw null;
                            }
                        }

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m389(String str, int i) {
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
                                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f242)) ^ ((c2 >>> 5) + f241)));
                                        cArr3[1] = c3;
                                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f244) ^ ((c3 + i2) ^ ((c3 << 4) + f245))));
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
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo388(final ir irVar, final String str) {
                    int i = 2 % 2;
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.2.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            AnonymousClass2.this.f232.mo388(irVar, str);
                        }
                    });
                    int i2 = f235 + 99;
                    f237 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 10 / 0;
                    }
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m386(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (j.f2691) {
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int i3 = iArr[2];
                        int i4 = iArr[3];
                        char[] cArr = new char[i2];
                        System.arraycopy(f236, i, cArr, 0, i2);
                        if (bArr != null) {
                            char[] cArr2 = new char[i2];
                            j.f2692 = 0;
                            char c = 0;
                            while (j.f2692 < i2) {
                                if (bArr[j.f2692] == 1) {
                                    cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                                } else {
                                    cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                                }
                                c = cArr2[j.f2692];
                                j.f2692++;
                            }
                            cArr = cArr2;
                        }
                        if (i4 > 0) {
                            char[] cArr3 = new char[i2];
                            System.arraycopy(cArr, 0, cArr3, 0, i2);
                            int i5 = i2 - i4;
                            System.arraycopy(cArr3, 0, cArr, i5, i4);
                            System.arraycopy(cArr3, i4, cArr, 0, i5);
                        }
                        if (z) {
                            char[] cArr4 = new char[i2];
                            j.f2692 = 0;
                            while (j.f2692 < i2) {
                                cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                                j.f2692++;
                            }
                            cArr = cArr4;
                        }
                        if (i3 > 0) {
                            j.f2692 = 0;
                            while (j.f2692 < i2) {
                                cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                                j.f2692++;
                            }
                        }
                        str2 = new String(cArr);
                    }
                    return str2;
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m363(List<ae> list, iz izVar) {
        int i = 2 % 2;
        JSONArray jSONArray = new JSONArray();
        for (ae aeVar : list) {
            JSONObject jSONObjectM310 = aeVar.m310();
            if (!jSONObjectM310.has(m349("ᶤ團\uea20", 4353741 - ((Process.getThreadPriority(0) + 20) >> 6), "춼䉮윀蕩", "\u0000\u0000\u0000\u0000", (char) (27079 - TextUtils.getOffsetBefore("", 0))).intern())) {
                int i2 = f182 + 59;
                f183 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    jSONObjectM310.put(m349("ᶤ團\uea20", 4353741 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "춼䉮윀蕩", "\u0000\u0000\u0000\u0000", (char) (Drawable.resolveOpacity(0, 0) + 27079)).intern(), jSONObjectM310.optLong(ij.f2564));
                } catch (JSONException unused) {
                }
            }
            if (this.f197.m417(jSONObjectM310)) {
                int i4 = f182 + 81;
                f183 = i4 % 128;
                int i5 = i4 % 2;
                this.f208.m2592(aeVar.m307(), (iu) null);
            }
            jSONArray.put(jSONObjectM310);
            int i6 = f182 + 29;
            f183 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 3;
            }
        }
        this.f207.m321(jSONArray, this.f205.m2493().m2526(), new AnonymousClass2(jSONArray, list, izVar));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m351(JSONObject jSONObject, iu iuVar) {
        int i = 2 % 2;
        m364(jSONObject);
        ae aeVar = new ae(jd.m2582(jSONObject));
        aeVar.m309(m335().m560());
        this.f208.m2592(aeVar.m307(), iuVar);
        m350(aeVar.m310());
        p.m2899(iuVar);
        int i2 = f183 + 119;
        f182 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m350(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (t.m2942().m2959()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f201);
            }
            p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ag.5
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ai) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m364(JSONObject jSONObject) {
        int i = 2 % 2;
        Iterator<String> it = m335().m561().iterator();
        while (!(!it.hasNext())) {
            int i2 = f182 + 91;
            f183 = i2 % 128;
            int i3 = i2 % 2;
            jSONObject.remove(it.next());
            int i4 = f182 + 97;
            f183 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private int m330() throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = f183 + 79;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        if (m335() == null) {
            return 100;
        }
        int i4 = f182 + 33;
        f183 = i4 % 128;
        int i5 = i4 % 2;
        if (ar.m480().mo498()) {
            return 100;
        }
        int iM558 = m335().m558();
        int i6 = f183 + 7;
        f182 = i6 % 128;
        if (i6 % 2 == 0) {
            return iM558;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private String m327() {
        int i = 2 % 2;
        int i2 = f183 + 69;
        f182 = i2 % 128;
        int i3 = i2 % 2;
        if (ar.m480().mo498()) {
            return m335().m554();
        }
        int i4 = f183 + 43;
        f182 = i4 % 128;
        if (i4 % 2 != 0) {
            m335().m553();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM553 = m335().m553();
        int i5 = f182 + InterfaceC0280i1.d.b.b;
        f183 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return strM553;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m349(String str, int i, String str2, String str3, char c) {
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
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f189) ^ ((long) f190)) ^ ((long) f191));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m355(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f187;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f188;
                if (bArr != null) {
                    i5 = (byte) (bArr[f185 + i] + i4);
                } else {
                    i5 = (short) (f186[f185 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f185 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f184);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f188;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f186;
                        int i8 = l.f3000;
                        l.f3000 = i8 - 1;
                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
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
}
