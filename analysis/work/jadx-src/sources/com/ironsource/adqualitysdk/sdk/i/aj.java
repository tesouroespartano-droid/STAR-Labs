package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aj {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f314 = {-38, -93, -79, -53, -71, -73, -58, -37, -92, -43, -73, -30, -91, -37, -62, -54, -36, -33, -87, -36, -104, -4, -88, -39, -35, -92, -66, -59, -37, -35, -111, -40, 54, -50, 44, -59, Base64.padSymbol, -48, 122, -120, -56, 58, 121, -124, 60, 125, -121, -61, -48, 65, SignedBytes.MAX_POWER_OF_TWO, -50, 108, -124, -53, SignedBytes.MAX_POWER_OF_TWO, 50, -40, 42, -52, 109, -31, -18, -53, SignedBytes.MAX_POWER_OF_TWO, 50, -40, 42, -52, 109, -115, -56, 65, -50, 44, -61, 62, -56, -61, 118, -116, -55, -60, 58, -55, 45, 124, -121, -47, 50, -51, 108, -105, 118, -126, 54, 41, -6, 84, 5, 100, -19, 101, 6, -91, -73, 1, 72, -108, -60, 77, 84, -2, 6, -95, -73, -6, 84, 5, 100, -19, 101, 6, -91, -1, -72, 77, 84, -2, 6, -95, -1, 19, 78, -5, 0, 78, 0, 84, 84, 72, 4, 81, 80, -116, -66, 6, 100, -108, -88, 73, 0, 2, 80, -97, -73, 86, -108, -73, -6, 4, 85, 86, -6, 83, -2, 85, -90, -15, 32, 3, 82, 76, -22, 100, 6, -91, -59, -6, 81, 0, 102, -5, 80, -6, -5, -120, -58, -7, -2, 84, -7, 101, -106, -73, 1, 76, 5, -90, -89, -120, -68, 72, 89, 51, -62, -67, -61, 37, 38, 34, 35, -80, -76, Ascii.FS, 38, -83, -106, -96, 66, -105, 44, -106, -105, 46, -103, 46, -95, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f315 = 6546674867368962702L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f316 = null;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f317 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f318 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f319 = -1405542411;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f320 = -1759756286;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f321 = 6;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f322;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final at f323;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m419(aj ajVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f318 + 43;
        f317 = i2 % 128;
        if (i2 % 2 == 0) {
            m426(iSAdQualityCustomMediationRevenue);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObjectM426 = m426(iSAdQualityCustomMediationRevenue);
        int i3 = f318 + 83;
        f317 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
        return jSONObjectM426;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ at m422(aj ajVar) {
        int i = 2 % 2;
        int i2 = f317 + 15;
        f318 = i2 % 128;
        int i3 = i2 % 2;
        at atVar = ajVar.f323;
        if (i3 == 0) {
            return atVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m428(aj ajVar) {
        int i = 2 % 2;
        int i2 = f318 + 61;
        f317 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = ajVar.f322;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m429(aj ajVar, boolean z) {
        int i = 2 % 2;
        int i2 = f318;
        int i3 = i2 + 15;
        f317 = i3 % 128;
        int i4 = i3 % 2;
        ajVar.f322 = z;
        int i5 = i2 + 59;
        f317 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return z;
    }

    public aj(at atVar) {
        this.f323 = atVar;
        jj.m2645().m2648(new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.1.5

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f325 = 0;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f326 = 1;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f327 = {331, 323, 322, 327, 319, 338, 333, 332, 268, 321, 330, 289, 339, 337, 304, 340};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static boolean f328 = true;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f329 = 222;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static boolean f330 = true;

                    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() throws Exception {
                        int i = 2 % 2;
                        int i2 = f326 + 65;
                        f325 = i2 % 128;
                        Object obj = null;
                        if (i2 % 2 != 0) {
                            int i3 = 20 / 0;
                            if (aj.m428(aj.this)) {
                                aj.m422(aj.this).m629(m431(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u0090\u0082\u008f\u0081\u0087\u0086\u008e\u008d\u008c\u0088\u0085\u0082\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                                aj.m429(aj.this, false);
                            }
                        } else if (aj.m428(aj.this)) {
                            aj.m422(aj.this).m629(m431(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u0090\u0082\u008f\u0081\u0087\u0086\u008e\u008d\u008c\u0088\u0085\u0082\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                            aj.m429(aj.this, false);
                        }
                        int i4 = f325 + 39;
                        f326 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return;
                        }
                        super.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m431(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
                            char[] cArr2 = f327;
                            int i2 = f329;
                            if (f330) {
                                int length = bArr.length;
                                m.f3005 = length;
                                char[] cArr3 = new char[length];
                                m.f3006 = 0;
                                while (m.f3006 < m.f3005) {
                                    cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i] - i2);
                                    m.f3006++;
                                }
                                return new String(cArr3);
                            }
                            if (f328) {
                                int length2 = cArr.length;
                                m.f3005 = length2;
                                char[] cArr4 = new char[length2];
                                m.f3006 = 0;
                                while (m.f3006 < m.f3005) {
                                    cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                                    m.f3006++;
                                }
                                return new String(cArr4);
                            }
                            int length3 = iArr.length;
                            m.f3005 = length3;
                            char[] cArr5 = new char[length3];
                            m.f3006 = 0;
                            while (m.f3006 < m.f3005) {
                                cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                                m.f3006++;
                            }
                            return new String(cArr5);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m430(final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        if (m421(iSAdQualityCustomMediationRevenue)) {
            p.m2892(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aj.3

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f332 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f333 = 0;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static char[] f334 = {'m', 'e', 'd', 'i', 'a', 't', 'o', 'n', '.', 'C', 'u', 's', 'R', 'v', 'p', 'q'};

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static char f335 = 4;

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    int i2 = 2 % 2;
                    int i3 = f332 + 119;
                    f333 = i3 % 128;
                    int i4 = i3 % 2;
                    aj.m422(aj.this).m628(m432("\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\u0007\u0004\n\u000b\t\u0007\u0004\u0002\r\u0000ò", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 124), Color.argb(0, 0, 0, 0) + 21).intern(), Collections.singletonList(aj.m419(aj.this, iSAdQualityCustomMediationRevenue)));
                    aj.m429(aj.this, true);
                    int i5 = f333 + 81;
                    f332 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m432(String str, byte b, int i2) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (f.f2043) {
                        char[] cArr2 = f334;
                        char c = f335;
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
            }, ar.m480().mo499());
            int i2 = f318 + 87;
            f317 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f318 + 47;
        f317 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m421(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        int i2 = f318 + 89;
        f317 = i2 % 128;
        int i3 = i2 % 2;
        if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
            n.m2876(m423(ImageFormat.getBitsPerPixel(0) + 1405542412, (byte) (Gravity.getAbsoluteGravity(0, 0) + InterfaceC0280i1.d.b.d), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1759756360, (short) ((ViewConfiguration.getTouchSlop() >> 8) - 67)).intern(), m423(KeyEvent.getDeadChar(0, 0) + 1405542442, (byte) (57 - Color.blue(0)), View.resolveSize(0, 0) + 61, KeyEvent.keyCodeFromString("") + 1759756353, (short) ((-2) - Color.alpha(0))).intern());
            return false;
        }
        if (!m424(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            n.m2876(m423((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1405542411, (byte) (103 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, 1759756359 - TextUtils.getOffsetBefore("", 0), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 67)).intern(), m427("㭟㬜ꯄ▐脫烢갑펜鄓嗍迅薖潁ﾱ\ud94e硨얂ꡮ⍒투鏒剥赳蓾栣ﳤ\ud8b7级왦Ꚛ⋠탋鲥単谰譆櫱ﴐ홛絁삇Ꟁ↟ퟀ鴜凼诀覬欗ﮰ픃籧솖ꑤ㼪혲鿨丣褶製琪\uf8c1풹拄쉥ꊖ", ViewConfiguration.getEdgeSlop() >> 16).intern());
            return false;
        }
        if (!m420(iSAdQualityCustomMediationRevenue.getAdType())) {
            int i4 = f317 + 11;
            f318 = i4 % 128;
            int i5 = i4 % 2;
            n.m2876(m423(1405542410 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionChild(0L) + 104), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1759756358, (short) ((-67) - (ViewConfiguration.getScrollBarSize() >> 8))).intern(), m423(View.combineMeasuredStates(0, 0) + 1405542508, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 83), 102 - View.combineMeasuredStates(0, 0), 1759756353 - Color.blue(0), (short) (89 - (ViewConfiguration.getTouchSlop() >> 8))).intern());
            return false;
        }
        int i6 = f318 + 5;
        f317 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m424(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        if (iSAdQualityMediationNetwork != null) {
            int i2 = f318 + 83;
            f317 = i2 % 128;
            int i3 = i2 % 2;
            String strM425 = m425(iSAdQualityMediationNetwork);
            if (i3 == 0) {
                TextUtils.isEmpty(strM425);
                throw null;
            }
            if (!TextUtils.isEmpty(strM425)) {
                int i4 = f317 + 27;
                f318 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 22 / 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m420(ISAdQualityAdType iSAdQualityAdType) {
        int i = 2 % 2;
        int i2 = f318 + 87;
        f317 = i2 % 128;
        if (i2 % 2 == 0) {
            ISAdQualityAdType iSAdQualityAdType2 = ISAdQualityAdType.INTERSTITIAL;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (iSAdQualityAdType == ISAdQualityAdType.INTERSTITIAL || iSAdQualityAdType == ISAdQualityAdType.VIDEO) {
            return true;
        }
        int i3 = f318 + 15;
        f317 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
            if (iSAdQualityAdType == ISAdQualityAdType.REWARDED_VIDEO) {
                return true;
            }
        } else if (iSAdQualityAdType == ISAdQualityAdType.REWARDED_VIDEO) {
            return true;
        }
        return iSAdQualityAdType == ISAdQualityAdType.REWARDED;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m426(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        di diVar = new di();
        diVar.m1925(true);
        diVar.m1922(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        diVar.m1924(m425(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        diVar.m1921(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM1923 = diVar.m1923();
        int i2 = f318 + 3;
        f317 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObjectM1923;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m425(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        int i2 = f318 + 5;
        f317 = i2 % 128;
        if (i2 % 2 == 0) {
            ISAdQualityMediationNetwork iSAdQualityMediationNetwork2 = ISAdQualityMediationNetwork.ADMOB;
            throw null;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m423(TextUtils.getCapsMode("", 0, 0) + 1405542615, (byte) ((-53) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-1) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1759756384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) (Color.alpha(0) + 6)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            int i3 = f318 + 7;
            f317 = i3 % 128;
            int i4 = i3 % 2;
            return m427("⦍⧫榷쥵䍘鰀㩖䖎菗韷挰", View.combineMeasuredStates(0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            int i5 = f317 + 97;
            f318 = i5 % 128;
            return i5 % 2 != 0 ? m427("ꤝꥵ烑⣛娺綫槌ᘏ͐躑", Gravity.getAbsoluteGravity(0, 0)).intern() : m427("ꤝꥵ烑⣛娺綫槌ᘏ͐躑", Gravity.getAbsoluteGravity(0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            int i6 = f317 + 83;
            f318 = i6 % 128;
            return i6 % 2 != 0 ? m423(View.getDefaultSize(0, 0) + 1405542619, (byte) (KeyEvent.getDeadChar(1, 0) * 98), 3 / ImageFormat.getBitsPerPixel(1), 1759756401 % (ViewConfiguration.getScrollBarSize() + 39), (short) (53 >> KeyEvent.normalizeMetaState(0))).intern() : m423(1405542619 - View.getDefaultSize(0, 0), (byte) (KeyEvent.getDeadChar(0, 0) - 58), ImageFormat.getBitsPerPixel(0) + 5, 1759756401 - (ViewConfiguration.getScrollBarSize() >> 8), (short) (23 - KeyEvent.normalizeMetaState(0))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return m427("䟾䞟\uef96䋇앨ឫ\udd3dꋻ\ueda9ᇘ\ue896\uf4b1", Color.red(0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            return m427("몎뫻䝉\uebf3涩뺆ၑ澏\u10cf뤎䆶㧀", ViewConfiguration.getDoubleTapTimeout() >> 16).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return m423(1405542627 - ExpandableListView.getPackedPositionChild(0L), (byte) ((-53) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "") + 6, 1759756400 - TextUtils.lastIndexOf("", '0'), (short) ((-99) - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
            return "";
        }
        int i7 = f318 + 123;
        f317 = i7 % 128;
        int i8 = i7 % 2;
        return m427("⇡\u218e\ue8a3㳓쉙榧\ue678馷讫", KeyEvent.getMaxKeyCode() >> 16).intern();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m423(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f321;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f314;
                if (bArr != null) {
                    i5 = (byte) (bArr[f319 + i] + i4);
                } else {
                    i5 = (short) (f316[f319 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f319 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f320);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f314;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f316;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m427(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f315, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f315));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
