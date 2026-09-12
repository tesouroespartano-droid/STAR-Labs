package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2961 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2962 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2963 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2964 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2965 = 1607036320;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m2790(String str, String str2) {
        int i = 2 % 2;
        int i2 = 0;
        String[] strArrSplit = str.replaceAll(m2779("\uf329췢鸠✆ͺ崝\u0bfd", 654347186 - TextUtils.indexOf("", ""), "눉\u008b줧瘧", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), "").split(m2779("喳绩", ViewConfiguration.getTapTimeout() >> 16, "\ue07f㿢柅\udba2", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getTrimmedLength("") + 41575)).intern());
        String[] strArrSplit2 = str2.replaceAll(m2779("\uf329췢鸠✆ͺ崝\u0bfd", KeyEvent.getDeadChar(0, 0) + 654347186, "눉\u008b줧瘧", "\u0000\u0000\u0000\u0000", (char) View.resolveSizeAndState(0, 0, 0)).intern(), "").split(m2779("喳绩", AndroidCharacter.getMirror('0') - '0', "\ue07f㿢柅\udba2", "\u0000\u0000\u0000\u0000", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 41576)).intern());
        int i3 = f2962 + 53;
        f2963 = i3 % 128;
        int i4 = i3 % 2;
        while (i2 < strArrSplit.length) {
            int i5 = f2962 + 11;
            f2963 = i5 % 128;
            int i6 = i5 % 2;
            if (i2 >= strArrSplit2.length || !strArrSplit[i2].equals(strArrSplit2[i2])) {
                break;
            }
            int i7 = f2963 + 105;
            int i8 = i7 % 128;
            f2962 = i8;
            int i9 = i7 % 2;
            i2++;
            int i10 = i8 + 39;
            f2963 = i10 % 128;
            int i11 = i10 % 2;
        }
        return (i2 >= strArrSplit.length || i2 >= strArrSplit2.length) ? Integer.signum(strArrSplit.length - strArrSplit2.length) : Integer.signum(Integer.valueOf(strArrSplit[i2]).compareTo(Integer.valueOf(strArrSplit2[i2])));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2787(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2963 + 27;
        f2962 = i2 % 128;
        int i3 = i2 % 2;
        return m2783(str, str2, false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m2782(String str, JSONArray jSONArray) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            arrayList.addAll(m2783(str, jSONArray.optString(i2), false));
            i2++;
            int i3 = f2962 + 31;
            f2963 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
        }
        int i5 = f2963 + 89;
        f2962 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2786(String str, JSONArray jSONArray, boolean z) {
        int i = 2 % 2;
        int i2 = f2962 + 25;
        f2963 = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < jSONArray.length(); i3++) {
            String strM2781 = m2781(str, jSONArray.optString(i3), z);
            if (strM2781 != null) {
                int i4 = f2963 + 47;
                f2962 = i4 % 128;
                if (i4 % 2 == 0) {
                    return strM2781;
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2781(String str, String str2, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = f2962 + 49;
            f2963 = i2 % 128;
            if (i2 % 2 != 0) {
                str2 = m2778(str2);
                int i3 = f2963 + 9;
                f2962 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                m2778(str2);
                throw null;
            }
        }
        List<String> listM2783 = m2783(str, str2, true);
        if (listM2783.size() > 0) {
            return listM2783.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m2783(String str, String str2, boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            int i2 = f2963 + 45;
            f2962 = i2 % 128;
            int i3 = i2 % 2;
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    int i4 = f2962 + 85;
                    f2963 = i4 % 128;
                    if (i4 % 2 != 0) {
                        break;
                    }
                    int i5 = 51 / 0;
                    return arrayList;
                }
            } else {
                for (int i6 = 1; i6 <= matcher.groupCount(); i6++) {
                    arrayList.add(matcher.group(i6));
                    if (z) {
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2780(String str, String str2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2962 + 29;
        f2963 = i4 % 128;
        int i5 = i4 % 2;
        int length = str.length();
        int length2 = str2.length();
        if (i5 == 0) {
            i = length / length2;
            i2 = 1;
        } else {
            i = length - length2;
            i2 = 0;
        }
        return str.substring(i2, i);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2788(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i2 = f2962;
            int i3 = i2 + 37;
            f2963 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            f2963 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        return str.matches(m2779("偲䄚\u175fᚖ䳺Ӵꔛ롺ف⫬膕曛烂ﳐ", (-1) - ImageFormat.getBitsPerPixel(0), "楸쎾鶑\u0c8d", "\u0000\u0000\u0000\u0000", (char) (36253 - ((Process.getThreadPriority(0) + 20) >> 6))).intern());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2789(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f2962 + 43;
        f2963 = i3 % 128;
        if (i3 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str) || str.length() <= 0) {
            return false;
        }
        int i4 = f2963 + 29;
        f2962 = i4 % 128;
        int i5 = i4 % 2;
        if (str.length() > i) {
            return false;
        }
        int i6 = f2962 + InterfaceC0280i1.d.b.g;
        f2963 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2778(String str) {
        int i = 2 % 2;
        int i2 = f2962 + 59;
        f2963 = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith(m2779("䢚", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1261406992, "း⾋\ue74bꡗ", "\u0000\u0000\u0000\u0000", (char) (22504 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
            str = new StringBuilder().append(m2779("巍䴹뉒\uf344鐤멌诵䶽", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "㴖\ue151鼁摕", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(str).toString();
        }
        if (str.endsWith(m2779("\ue21b", View.getDefaultSize(0, 0) - 1890779492, "鲸䳾⮏緋", "\u0000\u0000\u0000\u0000", (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52011)).intern())) {
            return str;
        }
        String string = new StringBuilder().append(str).append(m2779("ތࡩ\ua48e祠涮\ua879嬃", (-1638561526) - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0af6喉䦞\udf9d", "\u0000\u0000\u0000\u0000", (char) View.MeasureSpec.getSize(0)).intern()).toString();
        int i3 = f2963 + 13;
        f2962 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2784(String str) {
        int i = 2 % 2;
        int i2 = f2963 + 119;
        f2962 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!p.m2901()) {
                try {
                    new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            }
            int i3 = f2963 + 67;
            f2962 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        p.m2901();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2785(String str) {
        int i = 2 % 2;
        int i2 = f2963 + 117;
        f2962 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (str != null && !p.m2901()) {
            int i3 = f2962 + 43;
            f2963 = i3 % 128;
            int i4 = i3 % 2;
            if (m2784(str)) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    int i5 = 0;
                    while (true) {
                        int i6 = gZIPInputStream.read(bArr, i5, 8192 - i5);
                        if (i6 == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m2779("⼈\uda84︭ꢗ흘", 1081234388 - Gravity.getAbsoluteGravity(0, 0), "풥牓晀ꕦ", "\u0000\u0000\u0000\u0000", (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 26214)).intern());
                        }
                        int i7 = f2962 + 23;
                        f2963 = i7 % 128;
                        i5 = i7 % 2 == 0 ? i5 << i6 : i5 + i6;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2779(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2961) ^ ((long) f2965)) ^ ((long) f2964));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
