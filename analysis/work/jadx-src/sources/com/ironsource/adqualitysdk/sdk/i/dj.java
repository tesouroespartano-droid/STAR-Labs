package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dj extends cx implements ci {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1754 = 0;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1755 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1757 = 6;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1759;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private String f1760;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1761;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1762;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1763;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1764;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1765;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1766;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1767;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1768;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1769;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1770;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1756 = {'s', 'e', 't', 'A', 'd', 'I', 'C', 'a', 'm', 'p', 'i', 'g', 'n', 'T', 'y', 'r', 'v', 'G', 'o', 'u', 'R', 'q', 'D', 'B', 'P', 'c', 'w', 'x', 'z', '{', '|', '}', '~', Ascii.MAX, 128, 129};

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f1758 = {'2', 'V', 'V', 'R', 'Z', 'l', 'f', 135, 271, 265, 262, 265, 267, 252, 247, 262, 263, 269, 252, 243, 139, 284, 294, 280, 275, 284, 282, 279, 282, 288, 281, 260, 269, 286, 286, 'c', 184, 191, 205, 206, 208, 208, 213, 205, 207, 207, 180, 188, 206, 206, 136, 258, 265, 279, 280, 282, 282, 287, 279, 281, 281, 254, 262, 280, 274, Typography.less, Ascii.MAX, 'p', 'o', 131, 133, 133, 'o', 'i', 'x', '2', '[', 'c', 'l', 'l', 'k', 'V', '^', 's', 'l', 'm', 's', 't', 225, 225, 209, 208, 230, 209, 203, '2', 'V', 'W', 'm', 'o', 'n', 'j', 'c', 'k', 'Z', 'Y', 'q', '[', '\\', 'l', 'f', 'P', Typography.nbsp, Typography.cent, 147, 142, Typography.pound, 164, 164, 148, 147, Typography.copyright, 145, 138, 159, 166, Typography.nbsp, ':', 'm', 'm', '\\', 'V', 'g', '[', 'b', 'n', 'g', 'e', '7', 'n', 'q', '^', '\\', 'q'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1942(String str) {
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 13;
        f1755 = i3 % 128;
        int i4 = i3 % 2;
        this.f1769 = str;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        f1755 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1941() {
        String str;
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 5;
        f1755 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.f1769;
            int i4 = 99 / 0;
        } else {
            str = this.f1769;
        }
        int i5 = i2 + 121;
        f1755 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1952(String str) {
        int i = 2 % 2;
        int i2 = f1754 + 119;
        int i3 = i2 % 128;
        f1755 = i3;
        int i4 = i2 % 2;
        this.f1770 = str;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 121;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1943() {
        int i = 2 % 2;
        int i2 = f1755;
        int i3 = i2 + 53;
        f1754 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1770;
        int i5 = i2 + 63;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1950(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 125;
        int i3 = i2 % 128;
        f1754 = i3;
        int i4 = i2 % 2;
        this.f1766 = str;
        int i5 = i3 + 93;
        f1755 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1951() {
        int i = 2 % 2;
        int i2 = f1754 + 81;
        int i3 = i2 % 128;
        f1755 = i3;
        int i4 = i2 % 2;
        String str = this.f1766;
        int i5 = i3 + 15;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1948(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 63;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        this.f1767 = str;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Object m1946() {
        int i = 2 % 2;
        int i2 = f1754 + 43;
        f1755 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1767;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1945(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 75;
        int i3 = i2 % 128;
        f1754 = i3;
        int i4 = i2 % 2;
        this.f1768 = str;
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        int i6 = i3 + 37;
        f1755 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1949() {
        int i = 2 % 2;
        int i2 = f1754 + 77;
        int i3 = i2 % 128;
        f1755 = i3;
        int i4 = i2 % 2;
        String str = this.f1768;
        int i5 = i3 + 73;
        f1754 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1936(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 17;
        int i3 = i2 % 128;
        f1754 = i3;
        int i4 = i2 % 2;
        this.f1765 = str;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 13;
        f1755 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1939() {
        int i = 2 % 2;
        int i2 = f1754 + 25;
        int i3 = i2 % 128;
        f1755 = i3;
        int i4 = i2 % 2;
        String str = this.f1765;
        int i5 = i3 + 21;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1938(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 33;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        this.f1761 = str;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1935() {
        int i = 2 % 2;
        int i2 = f1755;
        int i3 = i2 + 73;
        f1754 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1761;
        int i5 = i2 + 17;
        f1754 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1940(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 61;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        this.f1762 = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1937() {
        int i = 2 % 2;
        int i2 = f1755 + 53;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1762;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1932(String str) {
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 113;
        f1755 = i3 % 128;
        int i4 = i3 % 2;
        this.f1763 = str;
        int i5 = i2 + 67;
        f1755 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1933() {
        int i = 2 % 2;
        int i2 = f1755 + 119;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1763;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1934(String str) {
        int i = 2 % 2;
        int i2 = f1755 + 9;
        f1754 = i2 % 128;
        int i3 = i2 % 2;
        this.f1764 = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1931() {
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + InterfaceC0280i1.d.b.b;
        f1755 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f1764;
        int i4 = i2 + 117;
        f1755 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1929(String str) {
        int i = 2 % 2;
        int i2 = f1754 + 89;
        int i3 = i2 % 128;
        f1755 = i3;
        int i4 = i2 % 2;
        this.f1759 = str;
        int i5 = i3 + 53;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private Object m1928() {
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 123;
        f1755 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1759;
        int i5 = i2 + 97;
        f1755 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m1927(String str) {
        int i = 2 % 2;
        int i2 = f1755;
        int i3 = i2 + 7;
        f1754 = i3 % 128;
        int i4 = i3 % 2;
        this.f1760 = str;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        f1754 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m1930() {
        String str;
        int i = 2 % 2;
        int i2 = f1755;
        int i3 = i2 + 47;
        f1754 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.f1760;
            int i4 = 22 / 0;
        } else {
            str = this.f1760;
        }
        int i5 = i2 + 17;
        f1754 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m1926() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ij.f2539, this.f1769);
            jSONObject.putOpt(ij.f2541, this.f1770);
            jSONObject.putOpt(ij.f2544, this.f1766);
            jSONObject.putOpt(ij.f2546, this.f1768);
            jSONObject.putOpt(ij.f2547, this.f1765);
            jSONObject.putOpt(ij.f2542, this.f1761);
            jSONObject.putOpt(ij.f2540, this.f1762);
            jSONObject.putOpt(ij.f2543, this.f1763);
            jSONObject.putOpt(ij.f2534, this.f1764);
        } catch (JSONException unused) {
        }
        int i2 = f1754 + 117;
        f1755 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x032d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0372 A[PHI: r4
      0x0372: PHI (r4v18 byte) = (r4v2 byte), (r4v3 byte), (r4v4 byte), (r4v19 byte) binds: [B:94:0x03a4, B:91:0x038a, B:88:0x0370, B:67:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x03a7  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        byte b;
        byte b2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118395364:
                b2 = 7;
                if (!str.equals(m1947(new int[]{50, 15, 172, 0}, true, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = b2;
                }
                break;
            case -2061646392:
                b2 = 12;
                if (str.equals(m1947(new int[]{75, 12, 0, 5}, true, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000").intern())) {
                    b = b2;
                } else {
                    b = -1;
                }
                break;
            case -1670022962:
                b2 = 20;
                if (!str.equals(m1947(new int[]{WorkQueueKt.MASK, 11, 1, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern())) {
                    b = -1;
                } else {
                    b = b2;
                }
                break;
            case -1616003519:
                if (!str.equals(m1947(new int[]{7, 13, 161, 8}, false, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i2 = f1754 + 53;
                    f1755 = i2 % 128;
                    if (i2 % 2 != 0) {
                        b = 3;
                    } else {
                        b = 4;
                    }
                }
                break;
            case -1585083924:
                if (!str.equals(m1947(new int[]{20, 15, 178, 0}, true, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1581443134:
                if (!str.equals(m1944("\u0007\u0005\u0005\u0014\u0010\n\u001b\f\u0007\u001c±", (byte) (77 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.NAK;
                }
                break;
            case -1448564938:
                if (!str.equals(m1944("\u0007\u0005\u0004\u0014\u0003\u0006\u0007\b\t\n\b\u000b\u0006\u0011\u0000\u0005", (byte) (View.combineMeasuredStates(0, 0) + 99), 16 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1295434132:
                if (!str.equals(m1944("\u0001\u0002\u0005\u0014\u0010\n\u0007\u0012§§\u0000\r\u001a\r", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SYN;
                }
                break;
            case -1207642840:
                b2 = 6;
                if (!str.equals(m1947(new int[]{35, 15, 98, 0}, true, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i3 = f1754 + 77;
                    f1755 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b = b2;
                    } else {
                        b = 104;
                    }
                }
                break;
            case -1027873480:
                if (!str.equals(m1944("\u0001\u0002\u0005\u000e\f\u0015\u0015\u0007\u0000\u0005", (byte) (7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 9 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -869156349:
                if (!str.equals(m1947(new int[]{138, 6, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.CAN;
                }
                break;
            case -841872307:
                if (!str.equals(m1944("\u0001\u0002\u0000\b\b\t\n\b\u000b\u0006\u0011\u0000¡", (byte) (61 - (ViewConfiguration.getLongPressTimeout() >> 16)), '=' - AndroidCharacter.getMirror('0')).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -587837303:
                if (!str.equals(m1944("\u0001\u0002\u0004\u0014\u0003\u0006\t\f\u0007\r\u0004\b\r\u0004\u0000\u0005", (byte) (110 - View.getDefaultSize(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 16).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -75693804:
                if (!str.equals(m1947(new int[]{0, 7, 0, 0}, true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 476302072:
                if (!str.equals(m1944("\u0007\u0005\u0005\u0014\u0010\n\u0007\u0012ÑÑ\u0000\r\u001a\r", (byte) (95 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13).intern())) {
                    b = -1;
                } else {
                    b = Ascii.ETB;
                }
                break;
            case 684328276:
                if (!str.equals(m1944("\u0007\u0005\b\u001a\u0003\u0013\u0019\u0007\u0001\u0003\u0000\u0005", (byte) (30 - Color.red(0)), (Process.myPid() >> 22) + 12).intern())) {
                    b = -1;
                } else {
                    int i4 = f1754 + 105;
                    f1755 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 13;
                }
                break;
            case 1014959530:
                if (!str.equals(m1947(new int[]{InterfaceC0280i1.d.b.i, 16, 56, 5}, false, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    int i6 = f1755 + 19;
                    f1754 = i6 % 128;
                    b = i6 % 2 == 0 ? Ascii.DC2 : (byte) 96;
                }
                break;
            case 1076166944:
                if (!str.equals(m1944("\u0007\u0005\u0000\b\r\u0003\b\u0001\u0010\u0016\u0002\u0000Ê", (byte) (101 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern())) {
                    b = -1;
                } else {
                    int i7 = f1755 + 115;
                    f1754 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 9;
                }
                break;
            case 1243605525:
                if (!str.equals(m1947(new int[]{95, 16, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000").intern())) {
                    b = -1;
                } else {
                    int i9 = f1755 + 65;
                    f1754 = i9 % 128;
                    b = i9 % 2 == 0 ? (byte) 17 : Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 1330288580:
                if (!str.equals(m1947(new int[]{65, 10, 19, 9}, false, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    int i10 = f1754 + 89;
                    f1755 = i10 % 128;
                    int i11 = i10 % 2;
                    b = Ascii.VT;
                }
                break;
            case 1390601082:
                if (!str.equals(m1947(new int[]{87, 8, 117, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001").intern())) {
                    b = -1;
                } else {
                    b = Ascii.SO;
                }
                break;
            case 1799130848:
                if (!str.equals(m1944("\u0007\u0005\u0000\b\b\t\n\b\u000b\u0006\r\u000e\u000f\b²", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 77), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15).intern())) {
                    b = -1;
                } else {
                    int i12 = f1755 + 59;
                    f1754 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 5;
                }
                break;
            case 1850298156:
                if (!str.equals(m1944("\u0001\u0002\u0000\b\r\u0003\b\u0001\u0010\u0016\u0002\u0000f", (byte) (Color.green(0) + 2), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1951713542:
                if (!str.equals(m1944("\u0007\u0005\u0004\u0014\u0003\u0006\u0000\u0005", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 71), 8 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case 1984415776:
                if (!str.equals(m1944("\u0001\u0002\u0003\u0004\u0005\u0000¡", (byte) (MotionEvent.axisFromString("") + 62), 6 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b = -1;
                } else {
                    int i14 = f1754 + 113;
                    f1755 = i14 % 128;
                    if (i14 % 2 != 0) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                m1942((String) m1770(list, 0, String.class));
                return null;
            case 1:
                return m1941();
            case 2:
                m1950((String) m1770(list, 0, String.class));
                return null;
            case 3:
                return m1951();
            case 4:
                m1948((String) m1770(list, 0, String.class));
                return null;
            case 5:
                return m1946();
            case 6:
                m1952((String) m1770(list, 0, String.class));
                return null;
            case 7:
                return m1943();
            case 8:
                m1945((String) m1770(list, 0, String.class));
                return null;
            case 9:
                return m1949();
            case 10:
                m1936((String) m1770(list, 0, String.class));
                return null;
            case 11:
                return m1939();
            case 12:
                m1938((String) m1770(list, 0, String.class));
                return null;
            case 13:
                return m1935();
            case 14:
                m1940((String) m1770(list, 0, String.class));
                return null;
            case 15:
                return m1937();
            case 16:
                m1932((String) m1770(list, 0, String.class));
                return null;
            case 17:
                return m1933();
            case 18:
                m1934((String) m1770(list, 0, String.class));
                return null;
            case 19:
                return m1931();
            case 20:
                m1929((String) m1770(list, 0, String.class));
                return null;
            case 21:
                return m1928();
            case 22:
                m1927((String) m1770(list, 0, String.class));
                return null;
            case 23:
                return m1930();
            case 24:
                return m1926();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1944(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f1756;
            char c = f1757;
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
                        f.f2046 = f.f2045 / c;
                        f.f2042 = f.f2045 % c;
                        f.f2044 = f.f2048 / c;
                        f.f2041 = f.f2048 % c;
                        if (f.f2042 == f.f2041) {
                            f.f2046 = ((f.f2046 + c) - 1) % c;
                            f.f2044 = ((f.f2044 + c) - 1) % c;
                            int i2 = (f.f2046 * c) + f.f2042;
                            int i3 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c) - 1) % c;
                            f.f2041 = ((f.f2041 + c) - 1) % c;
                            int i4 = (f.f2046 * c) + f.f2042;
                            int i5 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c) + f.f2041;
                            int i7 = (f.f2044 * c) + f.f2042;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1947(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f1758, i, cArr, 0, i2);
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
}
