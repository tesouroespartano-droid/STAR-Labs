package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class as extends ar.AnonymousClass3 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f438 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f439 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f441 = 66;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f442 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f443 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f444 = (int) TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f440 = {178, 180, Typography.plusMinus, Typography.paragraph, Typography.degree, 181, Typography.section, Typography.registered, 165, 175, 184, 168, 186, Typography.middleDot};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f437 = {-40451286, -1580052254, 1061225182, -1390165622, 374200293, -951682884, -1105766662, -130473619, 1681061303, 1100007011, 358076557, -2138428380, -650623160, -300795538, -523340877, 802081587, -912791556, 1759048083};

    public as(aw awVar) {
        m551(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        m551(null, (ViewConfiguration.getEdgeSlop() >> 16) + WorkQueueKt.MASK, null, "\u0086\u0085\u0083\u0082\u0084\u0089\u0087\u0088\u0087").intern();
        m516(awVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m558() throws UnsupportedEncodingException {
        JSONObject jSONObjectM514;
        String strM551;
        int i = 2 % 2;
        int i2 = f439 + 51;
        f438 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM514 = m514();
            strM551 = m551(null, 8 % TextUtils.indexOf("", "", 0), null, "\u0084\u0086\u0087");
        } else {
            jSONObjectM514 = m514();
            strM551 = m551(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0084\u0086\u0087");
        }
        int iOptInt = jSONObjectM514.optInt(strM551.intern(), this.f444);
        int i3 = f439 + 87;
        f438 = i3 % 128;
        int i4 = i3 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m559() {
        JSONObject jSONObjectM514;
        String strIntern;
        int i;
        int i2 = 2 % 2;
        int i3 = f438 + 117;
        f439 = i3 % 128;
        if (i3 % 2 != 0) {
            jSONObjectM514 = m514();
            strIntern = m550(new int[]{925533717, -803648182}, TextUtils.lastIndexOf("", 'X', 0, 0) + 4).intern();
            i = 11;
        } else {
            jSONObjectM514 = m514();
            strIntern = m550(new int[]{925533717, -803648182}, 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern();
            i = 40;
        }
        int iOptInt = jSONObjectM514.optInt(strIntern, i);
        int i4 = f439 + 51;
        f438 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m560() {
        JSONObject jSONObjectM514;
        String strIntern;
        int i;
        int i2 = 2 % 2;
        int i3 = f438 + 69;
        f439 = i3 % 128;
        if (i3 % 2 != 0) {
            jSONObjectM514 = m514();
            strIntern = m551(null, 70 / TextUtils.getOffsetAfter("", 1), null, "\u0086\u008b\u008a").intern();
            i = 26294;
        } else {
            jSONObjectM514 = m514();
            strIntern = m551(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u0086\u008b\u008a").intern();
            i = 9850;
        }
        int iOptInt = jSONObjectM514.optInt(strIntern, i);
        int i4 = f439 + 55;
        f438 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m561() {
        int i = 2 % 2;
        List<String> listM663 = m515().m663();
        listM663.addAll(kd.m2822(m514(), m551(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u008d\u0084\u008c").intern(), new ArrayList()));
        int i2 = f438 + 15;
        f439 = i2 % 128;
        int i3 = i2 % 2;
        return listM663;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m557() {
        int i = 2 % 2;
        List<String> listM655 = m515().m655();
        listM655.addAll(kd.m2822(m514(), m550(new int[]{774021815, 1590548028}, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new ArrayList()));
        int i2 = f439 + 69;
        f438 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return listM655;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m553() {
        JSONObject jSONObjectOptJSONObject;
        int i = 2 % 2;
        int i2 = f439 + 105;
        f438 = i2 % 128;
        if (i2 % 2 != 0 ? (jSONObjectOptJSONObject = m514().optJSONObject(m551(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0088\u0082\u008e").intern())) != null : (jSONObjectOptJSONObject = m514().optJSONObject(m551(null, WorkQueueKt.MASK >>> TextUtils.lastIndexOf("", (char) 22, 0), null, "\u0088\u0082\u008e").intern())) != null) {
            return jSONObjectOptJSONObject.optString(m550(new int[]{-110843542, 1818129383}, -Process.getGidForName("")).intern(), m551(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern());
        }
        String strIntern = m551(null, WorkQueueKt.MASK - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        int i3 = f438 + 13;
        f439 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m554() {
        String strIntern;
        int windowTouchSlop;
        int i = 2 % 2;
        Object obj = null;
        JSONObject jSONObjectOptJSONObject = m514().optJSONObject(m551(null, TextUtils.getTrimmedLength("") + WorkQueueKt.MASK, null, "\u0088\u0082\u008e").intern());
        if (jSONObjectOptJSONObject == null) {
            String strIntern2 = m551(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0086\u0085\u0083\u0082\u0084\u0089\u0087\u0088\u0087").intern();
            int i2 = f438 + 83;
            f439 = i2 % 128;
            if (i2 % 2 == 0) {
                return strIntern2;
            }
            super.hashCode();
            throw null;
        }
        int i3 = f438 + 85;
        f439 = i3 % 128;
        if (i3 % 2 != 0) {
            strIntern = m551(null, 124 / Gravity.getAbsoluteGravity(0, 0), null, "\u0087").intern();
            windowTouchSlop = ViewConfiguration.getWindowTouchSlop() / 94;
        } else {
            strIntern = m551(null, Gravity.getAbsoluteGravity(0, 0) + WorkQueueKt.MASK, null, "\u0087").intern();
            windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + WorkQueueKt.MASK;
        }
        return jSONObjectOptJSONObject.optString(strIntern, m551(null, windowTouchSlop, null, "\u0086\u0085\u0083\u0082\u0084\u0089\u0087\u0088\u0087").intern());
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final long m552() {
        JSONObject jSONObjectM514;
        String strM550;
        int i = 2 % 2;
        int i2 = f439 + 97;
        f438 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM514 = m514();
            strM550 = m550(new int[]{798945850, 1994234230}, 5 % Color.blue(1));
        } else {
            jSONObjectM514 = m514();
            strM550 = m550(new int[]{798945850, 1994234230}, Color.blue(0) + 3);
        }
        long jOptLong = jSONObjectM514.optLong(strM550.intern(), 0L);
        int i3 = f439 + 29;
        f438 = i3 % 128;
        int i4 = i3 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m555() {
        int i = 2 % 2;
        int i2 = f438 + 5;
        f439 = i2 % 128;
        int i3 = i2 % 2;
        long jOptLong = m514().optLong(m550(new int[]{-43148985, -1118798267}, 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), 0L);
        int i4 = f438 + InterfaceC0280i1.d.b.i;
        f439 = i4 % 128;
        int i5 = i4 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long m556() {
        int i = 2 % 2;
        int i2 = f438 + 21;
        f439 = i2 % 128;
        int i3 = i2 % 2;
        long jOptLong = m514().optLong(m550(new int[]{953430171, -228284717}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern(), 0L);
        int i4 = f439 + 33;
        f438 = i4 % 128;
        int i5 = i4 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m551(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f440;
            int i2 = f441;
            if (f443) {
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
            if (f442) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m550(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f437.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
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
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
