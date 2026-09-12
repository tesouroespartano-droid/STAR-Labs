package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class bb {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f651 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f652 = true;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f655 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f656 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f657 = 171;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f660;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f662;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f663;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f664;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f665;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f666;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f658 = {240, 249, 236, 237, 247, 239, 218, 258, 272, 269, 257, 276, 290, 271, 252, 288, 268, 279, 287, 292, 254, 246, 248, 286, 274, 229, 203, 270, 282, 281, 285, 289, 256, 278, 208, 284, 244, 241};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f653 = 6;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f654 = {'D', 'I', 'S', 'A', 'B', 'L', 'E', '\n', 't', 'a', 'u', 's', ':', ' ', '-', 'N', 'o', 'f', 'e', 'c', 'h', 'd', 'K', 'V', 'r', 'i', 'n', 'p', '%', 'v', 'y', 'b', 'F', 'l', 'z', 'G'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private c f661 = c.f681;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private e f659 = e.f691;

    public enum c {
        f681,
        f680,
        f677,
        f678,
        f679,
        f672;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f669 = 0;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static int f670 = 1;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static boolean f671;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f674;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f675;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f676;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static void m724() {
            f674 = true;
            f671 = true;
            f676 = 280;
            f675 = new char[]{358, 349, 367, 350, 364, 347, 352, 353, 351, 345, 356, 370, 359, 355, 348, 363, 346, 362};
        }

        public static c valueOf(String str) {
            int i = 2 % 2;
            int i2 = f669 + InterfaceC0280i1.d.b.d;
            f670 = i2 % 128;
            int i3 = i2 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i4 = f669 + 55;
            f670 = i4 % 128;
            int i5 = i4 % 2;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f669 + 65;
            f670 = i2 % 128;
            int i3 = i2 % 2;
            c[] cVarArr = (c[]) values().clone();
            int i4 = f669 + 81;
            f670 = i4 % 128;
            int i5 = i4 % 2;
            return cVarArr;
        }

        static {
            m724();
            int i = f669 + 49;
            f670 = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m723(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f675;
                int i2 = f676;
                if (f671) {
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
                if (f674) {
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
    }

    public enum e {
        f691,
        f693,
        f695,
        f692,
        f694,
        f688;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static short[] f682 = null;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f683 = 1;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f684;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static byte[] f685;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f686;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f689;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f690;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static void m726() {
            f690 = -2010565041;
            f689 = 108;
            f686 = -1253816292;
            f685 = new byte[]{94, 86, Ascii.FF, 52, SignedBytes.MAX_POWER_OF_TWO, 10, Utf8.REPLACEMENT_BYTE, Ascii.SI, 7, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 8, Ascii.CR, 10, 53, Ascii.CR, 49, 6, 6, 37, 33, 60, -61, -86, -70, -87, -75, -45, -69, -100, -85, -71, -68, -97, -61, -71, -90, -89, -61, -88, -65, -90, -83, -63, 50, 44, -90, -99, 46, 74, -108, 50, -85, 56, -106, 74, -108, 48, -98, 45, 56, -98, 46, -88, -78, -54, -92, -57, -66, -75, -58, -71, -47, -85, -60, -94, -55, -62, -74, -47, -91, -54, -64, -86, -58, -52, -78, -67, -54, Utf8.REPLACEMENT_BYTE, -22, -15, -13, 53, 57, 0, 0, 0, 0, 0, 0};
        }

        public static e valueOf(String str) {
            int i = 2 % 2;
            int i2 = f684 + 93;
            f683 = i2 % 128;
            int i3 = i2 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f683 + 9;
            f684 = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f683 + 125;
            f684 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            int i3 = f684 + 119;
            f683 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
            }
            return eVarArr;
        }

        static {
            m726();
            int i = f683 + 121;
            f684 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m725(int i, byte b, int i2, int i3, short s) {
            String string;
            synchronized (l.f2999) {
                StringBuilder sb = new StringBuilder();
                int i4 = f689;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f685;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f690 + i] + i4);
                    } else {
                        i5 = (short) (f682[f690 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    l.f3000 = ((i + i5) - 2) + f690 + i6;
                    l.f3002 = b;
                    l.f3004 = (char) (i3 + f686);
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001 = 1;
                    while (l.f3001 < i5) {
                        byte[] bArr2 = f685;
                        if (bArr2 != null) {
                            int i7 = l.f3000;
                            l.f3000 = i7 - 1;
                            l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                        } else {
                            short[] sArr = f682;
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

    bb(String str) {
        this.f663 = str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m719(cp cpVar) {
        int i = 2 % 2;
        int i2 = f651 + 45;
        f656 = i2 % 128;
        int i3 = i2 % 2;
        cpVar.m1703();
        this.f663 = cpVar.m1702();
        this.f664 = cpVar.m1698();
        this.f662 = cpVar.m1696();
        if (m712(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern().equals(this.f662) || m715("\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 78), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern().equals(this.f662)) {
            this.f662 = m712(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0083\u0087\u0082").intern();
        }
        this.f666 = cpVar.m1695();
        this.f665 = cpVar.m1694();
        this.f660 = cpVar.m1697();
        int i4 = f656 + 17;
        f651 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m718(c cVar) {
        int i = 2 % 2;
        int i2 = f656 + 25;
        f651 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f661 = cVar;
            if (cVar != c.f672) {
                this.f659 = e.f691;
            }
            int i3 = AnonymousClass1.f667[this.f661.ordinal()];
            if (i3 == 1 || i3 == 2) {
                return;
            }
            if (i3 == 3 || i3 == 4 || i3 == 5) {
                m713();
            }
            int i4 = f656 + 91;
            f651 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
                return;
            }
            return;
        }
        this.f661 = cVar;
        c cVar2 = c.f672;
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m722(e eVar) {
        int i = 2 % 2;
        int i2 = f651 + 13;
        f656 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f659 = eVar;
            m718(c.f672);
            int i3 = f656 + 7;
            f651 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 76 / 0;
                return;
            }
            return;
        }
        this.f659 = eVar;
        m718(c.f672);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m713() {
        int i = 2 % 2;
        int i2 = f656 + InterfaceC0280i1.d.b.b;
        f651 = i2 % 128;
        if (i2 % 2 != 0 ? !this.f663.equals(m712(null, View.combineMeasuredStates(0, 0) + WorkQueueKt.MASK, null, "\u008d\u0089\u008c\u008b\u008a\u0089\u0088").intern()) : !this.f663.equals(m712(null, 85 >> View.combineMeasuredStates(1, 1), null, "\u008d\u0089\u008c\u008b\u008a\u0089\u0088").intern())) {
            StringBuilder sb = new StringBuilder();
            sb.append(new StringBuilder().append(m714()).append(m715("\u001a", (byte) (16 - TextUtils.getCapsMode("", 0, 0)), -ImageFormat.getBitsPerPixel(0)).intern()).toString());
            String strM716 = m716();
            if (strM716 != null) {
                sb.append(new StringBuilder().append(strM716).append(m715("\u001a", (byte) (15 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern()).toString());
            }
            String strM711 = m711();
            if (strM711 != null) {
                sb.append(new StringBuilder().append(strM711).append(m715("\u001a", (byte) (16 - View.resolveSize(0, 0)), Color.rgb(0, 0, 0) + 16777217).intern()).toString());
            }
            sb.append(new StringBuilder().append(m715("\b\u000e\n\t\u000b\u0006\r\u000e", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40), 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(m710()).append(m715("\u001a", (byte) (Color.green(0) + 16), 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()).toString());
            if (this.f661 != c.f678) {
                int i3 = f656 + 63;
                f651 = i3 % 128;
                int i4 = i3 % 2;
                if (this.f661 != c.f679) {
                    String strM717 = m717(this.f659);
                    if (strM717 != null) {
                        sb.append(new StringBuilder().append(m712(null, 127 - View.resolveSize(0, 0), null, "\u009b\u009a\u0089\u0099\u0091\u0098\u0098\u0089\u0097").intern()).append(strM717).toString());
                    }
                    n.m2876(m712(null, 127 - (Process.myPid() >> 22), null, "\u0096\u0086\u0095\u0094\u0093\u008c\u0092\u0091\u0090\u008f\u008e\u0083").intern(), sb.toString());
                }
            }
            n.m2874(m712(null, Color.blue(0) + WorkQueueKt.MASK, null, "\u0096\u0086\u0095\u0094\u0093\u008c\u0092\u0091\u0090\u008f\u008e\u0083").intern(), sb.toString());
            return;
        }
        int i5 = f651 + 65;
        f656 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m714() {
        int i = 2 % 2;
        String string = new StringBuilder().append(m715("ªªªªªªªªªªªªªª\u009d", (byte) (124 - MotionEvent.axisFromString("")), 15 - View.getDefaultSize(0, 0)).intern()).append(this.f663).append(m712(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u009b\u009f\u009d\u0093\u009c\u0089\u009e\u009e\u009d\u009c\u009b").intern()).toString();
        if (this.f664 != null) {
            string = new StringBuilder().append(string).append(this.f664).append(m712(null, (ViewConfiguration.getTouchSlop() >> 8) + WorkQueueKt.MASK, null, "\u009b").intern()).toString();
        }
        String string2 = new StringBuilder().append(string).append(m715("SSSSSSSSSSSSSS", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 38), ((Process.getThreadPriority(0) + 20) >> 6) + 14).intern()).toString();
        int i2 = f656 + 91;
        f651 = i2 % 128;
        int i3 = i2 % 2;
        return string2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m716() {
        String strIntern;
        int i = 2 % 2;
        if (this.f663 == null || (strIntern = this.f662) == null) {
            int i2 = f656 + 123;
            f651 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f656 + 79;
        f651 = i4 % 128;
        int i5 = i4 % 2;
        if (strIntern.equals(m712(null, MotionEvent.axisFromString("") + 128, null, "\u0083\u0087\u0082").intern())) {
            int i6 = f656 + 9;
            f651 = i6 % 128;
            int i7 = i6 % 2;
            if (this.f661 != c.f679) {
                strIntern = m715("\u0010\u0011\u0007\u000e\f\u0017\u0007\u0014\u0015\u0013¢", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61), Color.blue(0) + 11).intern();
            }
        }
        return new StringBuilder().append(this.f663).append(m712(null, (ViewConfiguration.getEdgeSlop() >> 16) + WorkQueueKt.MASK, null, "\u009b\u009a\u009e\u009d\u008c\u0098\u009f\u0089 \u009b\u0096\u0086\u0095\u009b").intern()).append(strIntern).toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x007e  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m711() {
        String string;
        int i;
        int i2 = 2 % 2;
        int i3 = f651 + InterfaceC0280i1.d.b.d;
        f656 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
            if (this.f666 != null) {
                if (this.f665 != null) {
                    string = new StringBuilder().append(m715("\u0003\u0001\u0013\u0010\u0012\u0013\u001d\u0006\u001c\r\u001d\b\u0011\u0007\t\u001c\u001c\u000f\u001a\u0006\u0013\u0016\r\u000e", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20), (Process.myPid() >> 22) + 24).intern()).append(this.f666).append(m715("\u000e\u000fY", (byte) (57 - (ViewConfiguration.getTouchSlop() >> 8)), 3 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(this.f665).toString();
                    i = f651 + 113;
                    f656 = i % 128;
                    if (i % 2 == 0) {
                        return string;
                    }
                    throw null;
                }
            }
        } else if (this.f666 != null) {
            if (this.f665 != null) {
                string = new StringBuilder().append(m715("\u0003\u0001\u0013\u0010\u0012\u0013\u001d\u0006\u001c\r\u001d\b\u0011\u0007\t\u001c\u001c\u000f\u001a\u0006\u0013\u0016\r\u000e", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20), (Process.myPid() >> 22) + 24).intern()).append(this.f666).append(m715("\u000e\u000fY", (byte) (57 - (ViewConfiguration.getTouchSlop() >> 8)), 3 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(this.f665).toString();
                i = f651 + 113;
                f656 = i % 128;
                if (i % 2 == 0) {
                    return string;
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static final /* synthetic */ int[] f667;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f668;

        static {
            int[] iArr = new int[e.valuesCustom().length];
            f668 = iArr;
            try {
                iArr[e.f688.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f668[e.f693.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f668[e.f695.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f668[e.f692.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f668[e.f694.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.valuesCustom().length];
            f667 = iArr2;
            try {
                iArr2[c.f680.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f667[c.f677.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f667[c.f678.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f667[c.f672.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f667[c.f679.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m717(e eVar) {
        int i = 2 % 2;
        int i2 = f656;
        int i3 = i2 + 39;
        f651 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (eVar != null) {
            int i4 = i2 + 5;
            f651 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = AnonymousClass1.f668[eVar.ordinal()];
                if (i5 == 1) {
                    return m712(null, TextUtils.indexOf("", "", 0, 0) + WorkQueueKt.MASK, null, "\u008e\u0089\u009f\u009f\u0090\u009c\u009c\u009d\u009b\u009f\u009d\u009f\u009f\u0089\u009b\u009e\u008d\u009d\u009e¢\u009e¡").intern();
                }
                if (i5 == 2) {
                    return String.format(m712(null, Process.getGidForName("") + 128, null, "\u009f\u0089\u008d\u0089\u009e\u009b\u009f\u009d\u009b\u0098£\u009b\u009e\u009d\u008c\u0098\u009f\u0089 \u009b\u0096\u0086\u0095\u009b\u0094\u0093\u008c\u0092\u0091\u0090\u008f\u008e\u0083\u0095¥\u009b\u0098\u0089\u009f\u008c\u0090¤\u0089\u009f\u009b\u0098£\u009b\u009e\u009d\u008c\u0098\u009f\u0089 \u009b¢\u008e\u0098\u009b\u0098£").intern(), this.f663, this.f662, this.f660);
                }
                if (i5 == 3) {
                    return String.format(m715("\u001d\n\u000e\u0001\u0004\u0012\u0011\u0019\u0018\u001e\u0007\u001d\u000e\u001c\u0010\u0019\u0007\u0011\u001d\u0007\u000e\u0019\u000e\n\f\u001f\u0014\u0006\u0011\u0007\t\u001c\u001c\u000f\u001a\u0006\u0013\u0016\u0013\u0001\u001f\f\u000e\u001a\u0013\f\u0016\r\u008b\u008b\u0013\u0014\n\u000e\u008f", (byte) (28 - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.normalizeMetaState(0) + 55).intern(), this.f663, this.f662);
                }
                if (i5 == 4) {
                    return m715("!\b\u001b\u001f\u0013\u0016\u000e\u0007\u0011\u000e\u001a\u001b\u001a\u0007\u001b\u0007\u001f\u001b\u001e\u0016\u0013\u0019\u000e\u001c\u0018\u0014\u0014\u0007\f\u001c", (byte) (67 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29).intern();
                }
                if (i5 == 5) {
                    return m712(null, TextUtils.getCapsMode("", 0, 0) + WorkQueueKt.MASK, null, "\u009f\u009d\u0093\u009c\u0089\u009e\u009e\u009d\u009c\u009b\u0089\u0093\u0091\u0089\u009f\u009c\u009b\u009d\u0093\u009b\u008e\u0089\u0092\u008c\u0091¦").intern();
                }
            } else {
                int i6 = AnonymousClass1.f668[eVar.ordinal()];
                super.hashCode();
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m710() {
        int i = 2 % 2;
        int i2 = f651 + 79;
        f656 = i2 % 128;
        int i3 = i2 % 2;
        String strName = this.f661.name();
        int i4 = f656 + 115;
        f651 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return strName;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final String m721() {
        int i = 2 % 2;
        int i2 = f651 + 93;
        f656 = i2 % 128;
        int i3 = i2 % 2;
        String strM717 = m717(this.f659);
        int i4 = f656 + 99;
        f651 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM717;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final boolean m720() {
        int i = 2 % 2;
        int i2 = f651 + 3;
        f656 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f661 != c.f680 && this.f661 != c.f677 && this.f661 != c.f681) {
            return false;
        }
        int i4 = f651 + 91;
        f656 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m712(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f658;
            int i2 = f657;
            if (f652) {
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
            if (f655) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m715(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f654;
            char c2 = f653;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
                    f.f2045 = cArr[f.f2047];
                    f.f2048 = cArr[f.f2047 + 1];
                    if (f.f2045 == f.f2048) {
                        cArr3[f.f2047] = (char) (f.f2045 - b);
                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                    } else {
                        f.f2046 = f.f2045 / c2;
                        f.f2042 = f.f2045 % c2;
                        f.f2044 = f.f2048 / c2;
                        f.f2041 = f.f2048 % c2;
                        if (f.f2042 == f.f2041) {
                            f.f2046 = ((f.f2046 + c2) - 1) % c2;
                            f.f2044 = ((f.f2044 + c2) - 1) % c2;
                            int i2 = (f.f2046 * c2) + f.f2042;
                            int i3 = (f.f2044 * c2) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c2) - 1) % c2;
                            f.f2041 = ((f.f2041 + c2) - 1) % c2;
                            int i4 = (f.f2046 * c2) + f.f2042;
                            int i5 = (f.f2044 * c2) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c2) + f.f2041;
                            int i7 = (f.f2044 * c2) + f.f2042;
                            cArr3[f.f2047] = cArr2[i6];
                            cArr3[f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
