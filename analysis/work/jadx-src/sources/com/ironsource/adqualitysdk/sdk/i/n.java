package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f3008 = 5;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f3009 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3010;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m2881() {
        int i = 2 % 2;
        int i2 = f3010 + 39;
        f3009 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            t.m2942().m2961();
            super.hashCode();
            throw null;
        }
        ISAdQualityLogLevel iSAdQualityLogLevelM2961 = t.m2942().m2961();
        int i3 = f3009 + 117;
        f3010 = i3 % 128;
        if (i3 % 2 == 0) {
            return iSAdQualityLogLevelM2961;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2880() {
        int i = 2 % 2;
        int i2 = f3009 + 27;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM2959 = t.m2942().m2959();
        int i4 = f3009 + 79;
        f3010 = i4 % 128;
        if (i4 % 2 == 0) {
            return zM2959;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2876(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3010 + 67;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2875(str, str2, null);
        int i4 = f3010 + 3;
        f3009 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2875(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f3009 + 63;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2888(str, str, str2, th, true);
        int i4 = f3009 + 119;
        f3010 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2887(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3009 + 41;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2873(str, str2, (Throwable) null);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2873(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f3009 + 43;
        f3010 = i2 % 128;
        m2888(str, str, str2, th, i2 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2885(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = f3009 + 21;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2879(str, str, str2, z);
        int i4 = f3009 + InterfaceC0280i1.d.b.i;
        f3010 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2879(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        int i2 = f3010 + 51;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2888(str, str2, str3, null, z);
        int i4 = f3010 + 17;
        f3009 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2884(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3010 + 107;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2888(str, str, str2, th, z);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2888(String str, String str2, String str3, Throwable th, boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (!m2880()) {
            if ((!z) || !m2881().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                return;
            }
            int i2 = f3010 + 115;
            f3009 = i2 % 128;
            if (i2 % 2 != 0) {
                Log.e(m2886(str2), str3, th);
                return;
            } else {
                Log.e(m2886(str2), str3, th);
                super.hashCode();
                throw null;
            }
        }
        int i3 = f3010 + 43;
        f3009 = i3 % 128;
        if (i3 % 2 != 0) {
            Log.e(m2886(str), str3, th);
        } else {
            Log.e(m2886(str), str3, th);
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2874(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3009 + 27;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2889(str, str, str2, true);
        int i4 = f3009 + 51;
        f3010 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2882(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3010 + 35;
        f3009 = i2 % 128;
        m2889(str, str, str2, i2 % 2 == 0);
        int i3 = f3009 + 81;
        f3010 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2889(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        int i2 = f3009 + 105;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        if (m2880()) {
            int i4 = f3009 + 77;
            f3010 = i4 % 128;
            if (i4 % 2 == 0) {
                Log.i(m2886(str), str3);
                return;
            } else {
                Log.i(m2886(str), str3);
                throw null;
            }
        }
        if (!(!z)) {
            int i5 = f3009 + 91;
            f3010 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
                if (m2881().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
                    Log.i(m2886(str2), str3);
                }
            } else if (m2881().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
                Log.i(m2886(str2), str3);
            }
        }
        int i7 = f3009 + 117;
        f3010 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2870(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3010 + 23;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2878(str, str, str2, (Object) null);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f3009 + 23;
        f3010 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2877(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f3010 + 63;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2878(str, str, str2, obj);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = f3009 + 105;
        f3010 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2878(String str, String str2, String str3, Object obj) {
        int i = 2 % 2;
        int i2 = f3009 + 53;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2883(str, str2, str3, obj, true);
        int i4 = f3010 + 33;
        f3009 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static void m2867(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3010 + 47;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2871(str, str2, (Object) null);
        int i4 = f3010 + 97;
        f3009 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2871(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f3010 + 21;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        m2883(str, str, str2, obj, false);
        int i4 = f3010 + 9;
        f3009 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2883(String str, String str2, String str3, Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = f3009 + 43;
        f3010 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            str3 = new StringBuilder().append(str3).append(m2869(false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -((byte) KeyEvent.getModifierMetaStateMask()), "\u0000", 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).append(obj.toString()).toString();
            int i3 = f3009 + 107;
            f3010 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 5;
            }
        }
        if (m2880()) {
            Log.d(m2886(str), str3);
            return;
        }
        if (z) {
            int i5 = f3010 + 43;
            f3009 = i5 % 128;
            int i6 = i5 % 2;
            if (m2881().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m2886(str2), str3);
            }
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m2868(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3009 + 63;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        m2872(str, str, str2);
        int i4 = f3009 + 119;
        f3010 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (m2881().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        android.util.Log.v(m2886(r4), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.n.f3010 + 65;
        com.ironsource.adqualitysdk.sdk.i.n.f3009 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (m2880() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (m2880() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        android.util.Log.v(m2886(r3), r5);
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m2872(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = f3010 + 63;
        f3009 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2886(String str) {
        int i = 2 % 2;
        String string = new StringBuilder().append(m2869(true, MotionEvent.axisFromString("") + 23, 16 - Color.blue(0), "\u0004\u0018\ufff4\u0007￤ￃ\b\u0006\u0015\u0018\u0012\ufff6\u0011\u0012\u0015￬ￃ\uffdd\u001c\u0017\f\u000f", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98).intern()).append(str).toString();
        int i2 = f3010 + 95;
        f3009 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2869(boolean z, int i, int i2, String str, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (e.f1919) {
            char[] cArr2 = new char[i];
            e.f1921 = 0;
            while (e.f1921 < i) {
                e.f1920 = cArr[e.f1921];
                cArr2[e.f1921] = (char) (e.f1920 + i3);
                int i4 = e.f1921;
                cArr2[i4] = (char) (cArr2[i4] - f3008);
                e.f1921++;
            }
            if (i2 > 0) {
                e.f1918 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - e.f1918, e.f1918);
                System.arraycopy(cArr3, e.f1918, cArr2, 0, i - e.f1918);
            }
            if (z) {
                char[] cArr4 = new char[i];
                e.f1921 = 0;
                while (e.f1921 < i) {
                    cArr4[e.f1921] = cArr2[(i - e.f1921) - 1];
                    e.f1921++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
