package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.MotionEventCompat;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public final class ds {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1839 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1840 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1841 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static long f1842;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1843;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final List<String> f1844;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final Pattern f1845;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1846;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1847;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1848;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1849;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1850;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1851;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1852;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m2029() {
        f1843 = new char[]{52318, 43665, 10137, 39945, 4353, ' ', 36193, 6782, 42808, 295, 35881, 6966, 42542, 58627, 26672, 65332, 16939, 53525, 9233, 43777, 15872, 36223, 4196, 26467, 60010, 30998, 52317, 21326, 42575, 13732, 47358, 39489, 5896, 32773, 15705, 44593, 23334, 54306, 16688, 62037, 28480, 6238, 38231, 1569, 24266, 54203, 17580, 63923, 27278, 40928, 4344, 34187, 13992, 43911, 56474, 20971, 49833, 30677, 59598, 7627, '^', 36179, 6688, 42805, 13337, 49525, 19995, 56164, 26734, 62739, 33376, 3957, 40025, 10549, 46683, 29834, 63879, 28404, 54241, 16589, 46497, 15055, 26531, 60073, 32145, 49337, 21409, 18962, 50945, 20480, 60680, 12561, 48142, 11015, 38414, 1329, 61477, 't', 36218, 6761, 'c', 36201, 6756, 42875, 13384};
        f1842 = 3469568478113205512L;
        f1839 = -3966018694473531539L;
    }

    static {
        m2029();
        f1848 = Pattern.compile(m2026("횐훎鰣蔊⌕⎺ﮱ᷐⭞⅃囹\u181bⷜ⚩５ᩎ\u2fed⒇\uf286ᒘ\u206d⩄\uf090\u1680∭⿶\uf60bᄬ⒂", 1 - TextUtils.getOffsetAfter("", 0)).intern());
        f1851 = Pattern.compile(m2026("탦킸磣ἤ재졟懖\uf627\u2d68얞揶\uf386⯲쉭攸\uf1d2⦧쁃棸＞", 1 - Color.alpha(0)).intern());
        f1852 = Pattern.compile(m2025((ViewConfiguration.getWindowTouchSlop() >> 8) + 44, 16 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (24212 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
        f1850 = Pattern.compile(m2025(59 - MotionEvent.axisFromString(""), 14 - ImageFormat.getBitsPerPixel(0), (char) KeyEvent.getDeadChar(0, 0)).intern());
        f1849 = Pattern.compile(m2025(View.resolveSizeAndState(0, 0, 0) + 75, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, (char) (TextUtils.lastIndexOf("", '0') + 29909)).intern());
        f1845 = Pattern.compile(m2026("╸┦捱赡\udc47卨\uf3da洂\u3da11\uf1c2棉\ude34\ud9fb\uf77e檜\udc05\udbd5\ufaed摊펅픖\uf8fb晒퇅키﹠憍휝틾ﰯ挹쫷채\ue3c6紨좫", -Process.getGidForName("")).intern());
        f1847 = Pattern.compile(m2026("˭ʳ㿃잛肈橃륧", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
        f1846 = Pattern.compile(m2025((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 83, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (26621 - View.MeasureSpec.getSize(0))).intern());
        f1844 = Arrays.asList(m2026("䟁䞨촅惌爎\u086f", 1 - Drawable.resolveOpacity(0, 0)).intern(), m2026("灒瀷쒲덩箳\uf87c췀왞", ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern(), m2025(TextUtils.indexOf("", "") + 87, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (char) (19068 - (ViewConfiguration.getTouchSlop() >> 8))).intern(), m2025(TextUtils.lastIndexOf("", '0', 0) + 92, (ViewConfiguration.getPressedStateDuration() >> 16) + 6, (char) (12643 - Color.argb(0, 0, 0, 0))).intern(), m2026("緜綯\ue81c\uf047圄鶋軭ꎩ耚", TextUtils.indexOf("", "") + 1).intern(), m2025(TextUtils.indexOf("", "") + 97, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2025(TextUtils.getCapsMode("", 0, 0) + 100, TextUtils.getTrimmedLength("") + 5, (char) (Color.rgb(0, 0, 0) + 16777216)).intern());
        int i = f1841 + 75;
        f1840 = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f A[PHI: r9 r11
      0x011f: PHI (r9v28 com.ironsource.adqualitysdk.sdk.i.dy$c) = (r9v27 com.ironsource.adqualitysdk.sdk.i.dy$c), (r9v52 com.ironsource.adqualitysdk.sdk.i.dy$c) binds: [B:34:0x0084, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r11v22 java.lang.String) = (r11v21 java.lang.String), (r11v46 java.lang.String) binds: [B:34:0x0084, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0307  */
    /* JADX WARN: Code duplicated, block: B:86:0x030b  */
    /* JADX WARN: Code duplicated, block: B:87:0x034b  */
    /* JADX WARN: Code duplicated, block: B:89:0x034f  */
    /* JADX WARN: Code duplicated, block: B:91:0x037c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x037e  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<dy> m2028(String str, String str2, String str3) throws Throwable {
        boolean z;
        int i;
        int length;
        int length2;
        Throwable th;
        int i2 = 2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < str3.length()) {
            int i6 = i4 + 1;
            if (i6 < str3.length()) {
                int i7 = f1840 + 51;
                f1841 = i7 % 128;
                int i8 = i7 % i2;
                z = true;
            } else {
                z = false;
            }
            char cCharAt = z ? str3.charAt(i6) : (char) 0;
            char cCharAt2 = str3.charAt(i4);
            if (cCharAt2 != '\n') {
                if (cCharAt2 == '%' || cCharAt2 == '[' || cCharAt2 == ']' || cCharAt2 == '{' || cCharAt2 == '}') {
                    i = i2;
                } else {
                    i = i2;
                    if (cCharAt2 != '!') {
                        if (cCharAt2 == '\"') {
                            String strM2024 = m2024(f1851, str3.substring(i4));
                            if (strM2024 == null) {
                                cn.m1575(new StringBuilder().append(m2026("늬닠ꋙ䔧᷑瓏㮅䫭佪ῗ", TextUtils.getTrimmedLength("") + 1).intern()).append(str).toString(), new StringBuilder().append(m2026("도뎁쬢塱琽玽⛙䶕丂瘣⒏䠧䣞熄≚䩼䪿王⿴䒪䕦絶ⶵ䛍䝠碲⭛䅖䆌竨⤐䎫屜搒㛘巠幄", 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).append(i4).append(m2025(4 - MotionEvent.axisFromString(""), 3 - ExpandableListView.getPackedPositionChild(0L), (char) TextUtils.indexOf("", "", 0, 0)).intern()).append(str2).toString(), null);
                            } else {
                                String strM2027 = m2027(strM2024);
                                arrayList.add(new dy(dy.c.f1910, strM2027, i5));
                                length = strM2027.length();
                                length2 = length + 2;
                                i4 += length2;
                            }
                        } else {
                            switch (cCharAt2) {
                                case '\'':
                                    String strM2028 = m2027(m2024(f1852, str3.substring(i4)));
                                    if (strM2028.length() == 1) {
                                        arrayList.add(new dy(dy.c.f1912, String.valueOf((int) strM2028.charAt(0)), i5));
                                    } else {
                                        arrayList.add(new dy(dy.c.f1910, strM2028, i5));
                                    }
                                    length = strM2028.length();
                                    length2 = length + 2;
                                    i4 += length2;
                                    break;
                                case '(':
                                case ')':
                                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                case ',':
                                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                    break;
                                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                    if (cCharAt == '+') {
                                        arrayList.add(new dy(dy.c.f1908, m2025(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, TextUtils.lastIndexOf("", '0', 0, 0) + 3, (char) (43705 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), i5));
                                    } else if (cCharAt == '-') {
                                        arrayList.add(new dy(dy.c.f1908, m2025(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39972)).intern(), i5));
                                    }
                                    i4 += 2;
                                    break;
                                case '-':
                                    if (cCharAt == '-') {
                                        arrayList.add(new dy(dy.c.f1908, m2025(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39972)).intern(), i5));
                                        i4 += 2;
                                    }
                                    break;
                                default:
                                    switch (cCharAt2) {
                                        case ':':
                                        case ';':
                                            break;
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                            if (cCharAt == '=') {
                                                arrayList.add(new dy(dy.c.f1908, new StringBuilder().append(str3.charAt(i4)).append(m2025(ViewConfiguration.getDoubleTapTimeout() >> 16, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, (char) (View.getDefaultSize(0, 0) + 52323)).intern()).toString(), i5));
                                            } else if (cCharAt == '+') {
                                                arrayList.add(new dy(dy.c.f1908, m2025(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, TextUtils.lastIndexOf("", '0', 0, 0) + 3, (char) (43705 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), i5));
                                            } else if (cCharAt == '-') {
                                                arrayList.add(new dy(dy.c.f1908, m2025(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39972)).intern(), i5));
                                            }
                                            i4 += 2;
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i4))) {
                                                dy.c cVar = dy.c.f1906;
                                                String strM2025 = m2024(f1845, str3.substring(i4));
                                                if (TextUtils.isEmpty(strM2025)) {
                                                    cVar = dy.c.f1909;
                                                    strM2025 = m2024(f1848, str3.substring(i4));
                                                    if (!(!TextUtils.isEmpty(strM2025))) {
                                                        th = null;
                                                    } else {
                                                        int i9 = f1840 + 57;
                                                        th = null;
                                                        f1841 = i9 % 128;
                                                        if (i9 % 2 != 0 ? strM2025.equals(m2025(9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 4, (char) (338 - TextUtils.lastIndexOf("", '0', 0))).intern()) : strM2025.equals(m2025(113 - (PointF.length(1.0f, 1.0f) > 2.0f ? 1 : (PointF.length(1.0f, 1.0f) == 2.0f ? 0 : -1)), Color.argb(0, 1, 0, 1) + 4, (char) (17385 << TextUtils.lastIndexOf("", '-', 1))).intern())) {
                                                            cVar = dy.c.f1904;
                                                        } else if (strM2025.equals(m2026("ﰙﱿ근\u1cfeደ錟扈괫ǈ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                                                            cVar = dy.c.f1904;
                                                        } else if (f1844.contains(strM2025)) {
                                                            cVar = dy.c.f1911;
                                                        }
                                                    }
                                                } else {
                                                    th = null;
                                                }
                                                if (TextUtils.isEmpty(strM2025)) {
                                                    cVar = dy.c.f1903;
                                                    strM2025 = m2024(f1850, str3.substring(i4));
                                                }
                                                if (!(!TextUtils.isEmpty(strM2025))) {
                                                    int i10 = f1841 + 47;
                                                    f1840 = i10 % 128;
                                                    if (i10 % 2 == 0) {
                                                        cVar = dy.c.f1912;
                                                        strM2025 = m2024(f1849, str3.substring(i4));
                                                    } else {
                                                        dy.c cVar2 = dy.c.f1912;
                                                        m2024(f1849, str3.substring(i4));
                                                        throw th;
                                                    }
                                                }
                                                if (TextUtils.isEmpty(strM2025)) {
                                                    cVar = dy.c.f1908;
                                                    strM2025 = m2024(f1846, str3.substring(i4));
                                                }
                                                if (TextUtils.isEmpty(strM2025)) {
                                                    cVar = dy.c.f1908;
                                                    strM2025 = m2024(f1847, str3.substring(i4));
                                                }
                                                if (!TextUtils.isEmpty(strM2025)) {
                                                    arrayList.add(new dy(cVar, strM2025, i5));
                                                    length2 = strM2025.length();
                                                    i4 += length2;
                                                } else {
                                                    cn.m1575(new StringBuilder().append(m2026("늬닠ꋙ䔧᷑瓏㮅䫭佪ῗ", 1 - Drawable.resolveOpacity(0, 0)).intern()).append(str).toString(), new StringBuilder().append(m2025((ViewConfiguration.getTouchSlop() >> 8) + 13, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 58710)).intern()).append(str3.charAt(i4)).append(m2025((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Color.green(0) + 39521)).intern()).append(i4).append(m2025((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()).append(str2).toString(), th);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    } else {
                        if (cCharAt == '=') {
                            arrayList.add(new dy(dy.c.f1908, new StringBuilder().append(str3.charAt(i4)).append(m2025(ViewConfiguration.getDoubleTapTimeout() >> 16, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, (char) (View.getDefaultSize(0, 0) + 52323)).intern()).toString(), i5));
                        } else if (cCharAt == '+') {
                            arrayList.add(new dy(dy.c.f1908, m2025(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, TextUtils.lastIndexOf("", '0', 0, 0) + 3, (char) (43705 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), i5));
                        } else if (cCharAt == '-') {
                            arrayList.add(new dy(dy.c.f1908, m2025(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39972)).intern(), i5));
                        }
                        i4 += 2;
                    }
                    i2 = i;
                }
                arrayList.add(new dy(dy.c.f1908, new StringBuilder().append(str3.charAt(i4)).toString(), i5));
            } else {
                i = i2;
                i5++;
                int i11 = f1840 + 31;
                f1841 = i11 % 128;
                int i12 = i11 % 2;
            }
            i4 = i6;
            i2 = i;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2027(String str) {
        int i = 2 % 2;
        int i2 = f1841 + 43;
        f1840 = i2 % 128;
        int i3 = i2 % 2;
        String strSubstring = str.substring(1, str.length() - 1);
        int i4 = f1840 + InterfaceC0280i1.d.b.i;
        f1841 = i4 % 128;
        int i5 = i4 % 2;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2024(Pattern pattern, String str) {
        int i = 2 % 2;
        int i2 = f1841 + 77;
        f1840 = i2 % 128;
        int i3 = i2 % 2;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i4 = f1840 + 5;
        f1841 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2025(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1843[b.f638 + i]) ^ (((long) b.f638) * f1842)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2026(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f1839, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f1839));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
