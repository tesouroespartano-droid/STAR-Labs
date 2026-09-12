package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ix extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2662 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2663;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2664;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2665;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f2666;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f2667;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2668;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String f2669;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2670 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<is> f2671 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f2672;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static void m2518() {
        f2668 = 427701805;
        f2664 = 78;
        f2663 = -1729971258;
        f2666 = new byte[]{-48, Ascii.US, 112, 82, 112, 103, 101, 97, 86, -75, Ascii.SI, 100, 117, 97, 98, 102, 85, 96, 115, -91, 19, 94, -72, Ascii.FS, 92, 104, 88, 99, 114, 117, -42, -62, -67, -47, -67, -55, -88, -54, -55, -49, -73, -47, -71, -43, -62, -69, -60, -61, -48, -39, -124, -60, -61, -48, -7, 126, -45, -69, 4, -114, -65, -66, -63, -46, -70, -47, -70, -12, 56, 66, 55, 66, 78, 86, -67, 82, -121, 121, -103, -122, 127, -120, -121, -108, -53, -66, -71, -65, -89, -63, -87, -59, -78, -85, -76, -77, -64, -58, -58, -88, -58, -67, -69, -73, -52, -90, -86, -52, -90, -38, -95, -78, -68, -79, -68, -56, -48};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2519(ix ixVar, boolean z) {
        int i = 2 % 2;
        int i2 = f2665 + 73;
        f2662 = i2 % 128;
        int i3 = i2 % 2;
        ixVar.m2520(z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f2665 + 39;
        f2662 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m2523() {
        int i = 2 % 2;
        int i2 = f2662 + 31;
        int i3 = i2 % 128;
        f2665 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = f2669;
        int i4 = i3 + 83;
        f2662 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m2525(ix ixVar, Context context) {
        int i = 2 % 2;
        int i2 = f2665 + 57;
        f2662 = i2 % 128;
        if (i2 % 2 == 0) {
            m2522(context);
            throw null;
        }
        boolean zM2522 = m2522(context);
        int i3 = f2665 + 47;
        f2662 = i3 % 128;
        int i4 = i3 % 2;
        return zM2522;
    }

    static {
        m2518();
        f2669 = m2524((-427701708) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) View.combineMeasuredStates(0, 0), (-79) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1729971336 - Color.blue(0), (short) ((-16777145) - Color.rgb(0, 0, 0))).intern();
        int i = f2665 + 15;
        f2662 = i % 128;
        int i2 = i % 2;
    }

    public ix(Context context) {
        this.f2672 = context.getApplicationContext();
        n.m2867(f2669, m2524(Color.argb(0, 0, 0, 0) - 427701805, (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-79) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 1729971341, (short) ((-99) - Color.argb(0, 0, 0, 0))).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m2524((-427701775) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), View.MeasureSpec.getSize(0) - 79, Drawable.resolveOpacity(0, 0) + 1729971355, (short) (60 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern());
        this.f2672.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2528() {
        int i = 2 % 2;
        int i2 = f2665 + 119;
        f2662 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2672.unregisterReceiver(this);
            int i3 = 48 / 0;
        } else {
            this.f2672.unregisterReceiver(this);
        }
        int i4 = f2665 + InterfaceC0280i1.d.b.b;
        f2662 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2531(is isVar) {
        int i = 2 % 2;
        int i2 = f2662 + 87;
        f2665 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f2671.add(isVar);
            int i3 = 45 / 0;
        } else {
            this.f2671.add(isVar);
        }
        int i4 = f2665 + 61;
        f2662 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2529(is isVar) {
        int i = 2 % 2;
        int i2 = f2662 + 7;
        f2665 = i2 % 128;
        int i3 = i2 % 2;
        this.f2671.remove(isVar);
        int i4 = f2665 + 105;
        f2662 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Set<is> m2517() {
        HashSet hashSet;
        int i = 2 % 2;
        hashSet = new HashSet(this.f2671);
        int i2 = f2665 + 69;
        f2662 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2527() {
        Iterator<is> it;
        int i = 2 % 2;
        int i2 = f2665 + 81;
        f2662 = i2 % 128;
        if (i2 % 2 == 0) {
            it = m2517().iterator();
            int i3 = 62 / 0;
        } else {
            it = m2517().iterator();
        }
        while (it.hasNext()) {
            int i4 = f2665 + 123;
            f2662 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().mo395();
            } else {
                it.next().mo395();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2530() {
        int i = 2 % 2;
        Iterator<is> it = m2517().iterator();
        while (it.hasNext()) {
            int i2 = f2665 + 63;
            f2662 = i2 % 128;
            int i3 = i2 % 2;
            it.next();
        }
        int i4 = f2662 + 93;
        f2665 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f2673 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2674 = 1;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2675 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2676 = -3913818443699035398L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2677;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                try {
                    if (!(!intent.getAction().equals(m2532("뱩蓂ﲙ瞯꒶Ɇ륱ᰮ돘㺕쁦鞦ᇺ訔\udaac\ue30d枿\uf81a虑굲뢤ꋎ䋻⪪팏効ᆌ킰㕸\ued53얨\ude2d\ue004㽆ⱁ\ue9df", KeyEvent.getDeadChar(0, 0), "⤡扡ꀡ\ud8ab", "拺鯲勜즯", (char) (MotionEvent.axisFromString("") + 1)).intern()))) {
                        n.m2870(ix.m2523(), m2532("쇽頥긭㠟횭嵑魎\uefe9㘬\uebbfー碌ꉛ妇좋膋뷬抶嚽䄥裢딇秠늖ȁ䓃퉦", View.getDefaultSize(0, 0) - 455412691, "ⷨ\udaf4廤ꉦ", "拺鯲勜즯", (char) (26206 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern());
                        if (intent.getBooleanExtra(m2532("襥ꗇ\ue4b8愳썊渔챷铀\uf581᱂腛썝៵\udfa8", ViewConfiguration.getPressedStateDuration() >> 16, "獁䗶壣鴟", "拺鯲勜즯", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 8024)).intern(), false)) {
                            n.m2870(ix.m2523(), m2532("\ud83a\ud7fe\u173f圏㠪ﱂ\ue267割豏嶾葱\uf243ϲ㾌ｗ縖⻒졌䧏\ue9c1\ue6ca㌒ĺ龖\ue081饓\ud9d7梊⡴榧\uef10", (-879571938) - View.MeasureSpec.getMode(0), "ỿ鋌\udecb《", "拺鯲勜즯", (char) (2781 - ImageFormat.getBitsPerPixel(0))).intern());
                            p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    ix.this.m2530();
                                    ix.m2519(ix.this, false);
                                }
                            });
                            int i3 = f2675 + 81;
                            f2674 = i3 % 128;
                            int i4 = i3 % 2;
                            return;
                        }
                        if (ix.m2525(ix.this, context)) {
                            p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1.5
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    ix.m2519(ix.this, true);
                                    ix.this.m2527();
                                }
                            });
                            return;
                        }
                        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                ix.m2519(ix.this, false);
                                ix.this.m2530();
                            }
                        });
                    }
                    int i5 = f2674 + 119;
                    f2675 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    jz.m2766(ix.m2523(), m2532("솎跍饤╠쵷識演靀䄬壕ꙓ瀁嗐\ue7ca揼勿ꌦ㑨", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), "譾걞\ue865蝜", "拺鯲勜즯", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 23785)).intern(), (Throwable) e, false);
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2532(String str, int i2, String str2, String str3, char c) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    g.f2156 = 0;
                    while (g.f2156 < length) {
                        int i3 = (g.f2156 + 2) % 4;
                        int i4 = (g.f2156 + 3) % 4;
                        g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i3]) % SupportMenu.USER_MASK);
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + cArr5[i3]) / SupportMenu.USER_MASK);
                        cArr4[i4] = g.f2154;
                        cArr6[g.f2156] = (char) (((((long) (cArr4[i4] ^ cArr3[g.f2156])) ^ f2676) ^ ((long) f2677)) ^ ((long) f2673));
                        g.f2156++;
                    }
                    str4 = new String(cArr6);
                }
                return str4;
            }
        });
        int i2 = f2665 + 45;
        f2662 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m2526() {
        boolean z;
        int i = 2 % 2;
        int i2 = f2665;
        int i3 = i2 + 95;
        f2662 = i3 % 128;
        int i4 = i3 % 2;
        z = this.f2670;
        int i5 = i2 + InterfaceC0280i1.d.b.g;
        f2662 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2520(boolean z) {
        int i = 2 % 2;
        int i2 = f2665 + 97;
        int i3 = i2 % 128;
        f2662 = i3;
        int i4 = i2 % 2;
        this.f2670 = z;
        int i5 = i3 + 69;
        f2665 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r11
      0x001f: PHI (r11v2 android.net.NetworkInfo) = (r11v1 android.net.NetworkInfo), (r11v10 android.net.NetworkInfo) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2522(Context context) {
        NetworkInfo networkInfoM2521;
        int i = 2 % 2;
        int i2 = f2665 + 9;
        f2662 = i2 % 128;
        if (i2 % 2 == 0) {
            networkInfoM2521 = m2521(context);
            int i3 = 35 / 0;
            if (networkInfoM2521 != null) {
                if (networkInfoM2521.isConnected()) {
                    n.m2870(f2669, new StringBuilder().append(m2524((ViewConfiguration.getScrollBarSize() >> 8) - 427701739, (byte) (Process.myPid() >> 22), (-80) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1729971336, (short) ((-64) - ImageFormat.getBitsPerPixel(0))).intern()).append(networkInfoM2521.getTypeName()).append(m2524((-427701731) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-80) - TextUtils.indexOf((CharSequence) "", '0', 0), ExpandableListView.getPackedPositionType(0L) + 1729971290, (short) (KeyEvent.normalizeMetaState(0) + 120)).intern()).toString());
                    int i4 = f2662 + 3;
                    f2665 = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            networkInfoM2521 = m2521(context);
            if (networkInfoM2521 != null) {
                if (networkInfoM2521.isConnected()) {
                    n.m2870(f2669, new StringBuilder().append(m2524((ViewConfiguration.getScrollBarSize() >> 8) - 427701739, (byte) (Process.myPid() >> 22), (-80) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1729971336, (short) ((-64) - ImageFormat.getBitsPerPixel(0))).intern()).append(networkInfoM2521.getTypeName()).append(m2524((-427701731) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-80) - TextUtils.indexOf((CharSequence) "", '0', 0), ExpandableListView.getPackedPositionType(0L) + 1729971290, (short) (KeyEvent.normalizeMetaState(0) + 120)).intern()).toString());
                    int i6 = f2662 + 3;
                    f2665 = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static NetworkInfo m2521(Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = f2665 + 85;
            f2662 = i2 % 128;
            int i3 = i2 % 2;
            return ((ConnectivityManager) context.getSystemService(m2524(TextUtils.indexOf("", "") - 427701720, (byte) Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 79, TextUtils.indexOf((CharSequence) "", '0') + 1729971358, (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 76)).intern())).getActiveNetworkInfo();
        }
        int i4 = f2662 + 97;
        f2665 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2524(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2664;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2666;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2668 + i] + i4);
                } else {
                    i5 = (short) (f2667[f2668 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2668 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2663);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2666;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2667;
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
