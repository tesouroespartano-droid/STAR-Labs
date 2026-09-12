package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
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
import com.ironsource.InterfaceC0280i1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ju {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2914 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2915 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2916 = 71;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2917 = {'A', 'p', 'U', 't', 'i', 'l', 's', 'C', 'o', 'u', 'd', 'n', '\'', ' ', 'a', 'b', 'e', 'I', 'f', 'j', 'g', 'c', 'k', 'm', 'r', '-', ':', '.', 'y', '3', 'P', 'q', 'S', 'T', 'E', 'x'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2918 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2710(Context context, String str) {
        int i = 2 % 2;
        int i2 = f2914 + InterfaceC0280i1.d.b.g;
        f2915 = i2 % 128;
        if (i2 % 2 == 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        int i3 = f2914 + 117;
        f2915 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2708(Context context, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2914 + 91;
        f2915 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2707("\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u000b", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 90), View.getDefaultSize(0, 0) + 8).intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m2706("\uffff\u0001", 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 182 - Gravity.getAbsoluteGravity(0, 0), true, ExpandableListView.getPackedPositionType(0L) + 2).intern(), packageName);
        } catch (JSONException e) {
            n.m2873(strIntern, m2707("\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u000f  \u000e\u0010\n\u0006\u000b\u0004\u0011\f\u0007\u0010\u0005\n\u0014\u0006\u000f\u0001\u0007\u000e\u0012\u0007\t\u0006", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 60), 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), (Throwable) e);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                jSONObject.put(m2706("\u0002\uffff", 2 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getTrimmedLength("") + 171, true, View.getDefaultSize(0, 0) + 2).intern(), packageManager.getInstallerPackageName(packageName));
            } catch (JSONException e2) {
                e = e2;
                n.m2867(strIntern, new StringBuilder().append(m2706("ￅ\u0014\u0019ￅ\n\u0012\u0006\u0013ￅ\n\f\u0006\u0010\b\u0006\u0015ￅ\u0017\n\u0011\u0011\u0006\u0019\u0018\u0013\u000eￅ\t\t\u0006ￅ\u0019ￌ\u0013\t\u0011\u001a\u0014￨ￅ\uffdf\u0017\u0014\u0017\u0017\nￅￓ\u0013\u0014\u0018\u000f", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 39, 162 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true, KeyEvent.keyCodeFromString("") + 52).intern()).append(e.getLocalizedMessage()).toString());
            }
        } catch (JSONException e3) {
            e = e3;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m2706("\n\ufff7", TextUtils.getOffsetBefore("", 0) + 1, 179 - TextUtils.getCapsMode("", 0, 0), true, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m2706("\u0004￼", -ImageFormat.getBitsPerPixel(0), (KeyEvent.getMaxKeyCode() >> 16) + 185, true, View.MeasureSpec.getSize(0) + 2).intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e4) {
            n.m2867(strIntern, new StringBuilder().append(m2707("\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u0013\u000f\u0004\u0013\u0007\u000f\u0014\u0014\u0010\u0016\u000e\u0011\u0013\u0011\b\u0014\u001a\f\u001c\f\u0013\u0006\u001ab", (byte) (66 - ((Process.getThreadPriority(0) + 20) >> 6)), 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()).append(packageName).append(m2707("\u0013\u001f\u000e\u0011ÆÆ\u0006\u001a\u0019\u000e", (byte) (84 - (ExpandableListView.getPackedPositionForGroup(0) > r6 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == r6 ? 0 : -1))), 9 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()).append(e4.getLocalizedMessage()).toString());
        } catch (JSONException e5) {
            n.m2867(strIntern, new StringBuilder().append(m2706("\n\u0014ￍ\u001aￆ\u0007\n\nￆ\u0007\u0016\u0016ￆ\u001c\u000b\u0018\u0019\u000f\u0015\u0014ￆ\u000f\u0014\f\u0015ￆ\u001a\u0015ￆ\u0010\u0019\u0015\u0014ￔￆ\u000b\u0018\u0018\u0015\u0018￠ￆ￩\u0015\u001b\u0012", TextUtils.getOffsetAfter("", 0) + 42, 161 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, KeyEvent.normalizeMetaState(0) + 46).intern()).append(e5.getLocalizedMessage()).toString());
        }
        try {
            jSONObject.put(m2707("\u000b\u0006", (byte) (79 - TextUtils.indexOf("", "", 0)), KeyEvent.keyCodeFromString("") + 2).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            int i4 = f2914 + 123;
            f2915 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException e6) {
            n.m2867(strIntern, new StringBuilder().append(m2707("\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u0013\u000f\u0004\u0013\u0007\u000f\u0014\u0014\u0010\u0016\u000e\u0011\u0013\u0011\b\u0014\u001a\f\u001c\f\u0013\u0006\u001ab", (byte) (KeyEvent.getDeadChar(0, 0) + 66), 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()).append(packageName).append(m2707("\u0013\u001f\u000e\u0011ÆÆ\u0006\u001a\u0019\u000e", (byte) (85 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), 10 - View.MeasureSpec.getSize(0)).intern()).append(e6.getLocalizedMessage()).toString());
        } catch (JSONException e7) {
            n.m2867(strIntern, new StringBuilder().append(m2706("\u001b\u0017\u0016ￖ\uffc8\r\u001a\u001a\u0017\u001a￢\uffc8￫\u0017\u001d\u0014\f\u0016ￏ\u001c\uffc8\t\f\f\uffc8\t\u0018\u0018\uffc8\u0016\t\u0015\r\uffc8\u0011\u0016\u000e\u0017\uffc8\u001c\u0017\uffc8\u0012", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, 159 - Color.blue(0), false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43).intern()).append(e7.getLocalizedMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2709(Context context) {
        int i = 2 % 2;
        int i2 = f2915 + 3;
        f2914 = i2 % 128;
        int i3 = i2 % 2;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Object obj = null;
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName;
            int i4 = f2915 + 3;
            f2914 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            super.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException e) {
            n.m2867(m2707("\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u000b", (byte) (TextUtils.indexOf("", "", 0, 0) + 90), ExpandableListView.getPackedPositionGroup(0L) + 8).intern(), new StringBuilder().append(m2707("\b\t\u000b\u0003\u000b\u0006\u000f\u0000\u000e\u0013\u000f\u0004\u0013\u0007\u000f\u0014\u0014\u0010\u0016\u000e\u0011\u0013\u0011\b\u0014\u001a\f\u001c\f\u0013\u0006\u001ab", (byte) (Color.blue(0) + 66), View.MeasureSpec.makeMeasureSpec(0, 0) + 33).intern()).append(packageName).append(m2707("\u0013\u001f\u000e\u0011ÆÆ\u0006\u001a\u0019\u000e", (byte) (ExpandableListView.getPackedPositionType(0L) + 84), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern()).append(e.getLocalizedMessage()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2705() {
        int i = 2 % 2;
        int i2 = f2915 + 105;
        f2914 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                Class.forName(m2707("\u0014\t\u0015\u001d\n\u0006\u0005\u0004\u001d\u0018\t\u001c\u0002\u0000\u0010\u001a\f\u001c\u001a\u0003\n\u0005\u0004\u001b#\u0000\u0010\u001a\f\u001c", (byte) (KeyEvent.keyCodeFromString("") + 75), 31 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                String strIntern = m2707("\u0081", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 13), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
                int i4 = f2915 + 25;
                f2914 = i4 % 128;
                int i5 = i4 % 2;
                return strIntern;
            } catch (ClassNotFoundException unused) {
                return m2707("Û", (byte) (Color.green(0) + InterfaceC0280i1.d.b.g), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName(m2707("\u0014\t\u0015\u001d\u0000\u001c\t\u0006\u0007\t\u0006\u001b\u0016\u000f\u001a\u000f\u0007\"\b\u000f\u0000\u0005\u0004\u001b\u0007\u000b\u0015\u001c\u0007\u000b\u0015\u001c\u0010\u0002\u0019\u001c\u0002\u000e\u000b\u0014\u0002\u0011\u001e\u001b\u000f\u0014\u0011\u0010\u000f\u0014\u001c\u0004!\u0005\u0011\n\n\u0000\t\u0006", (byte) (TextUtils.getOffsetAfter("", 0) + 28), 60 - (Process.myPid() >> 22)).intern());
            return m2707("\u0088", (byte) (39 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2706(String str, int i, int i2, boolean z, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (e.f1919) {
            char[] cArr2 = new char[i3];
            e.f1921 = 0;
            while (e.f1921 < i3) {
                e.f1920 = cArr[e.f1921];
                cArr2[e.f1921] = (char) (e.f1920 + i2);
                int i4 = e.f1921;
                cArr2[i4] = (char) (cArr2[i4] - f2916);
                e.f1921++;
            }
            if (i > 0) {
                e.f1918 = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - e.f1918, e.f1918);
                System.arraycopy(cArr3, e.f1918, cArr2, 0, i3 - e.f1918);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                e.f1921 = 0;
                while (e.f1921 < i3) {
                    cArr4[e.f1921] = cArr2[(i3 - e.f1921) - 1];
                    e.f1921++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2707(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2917;
            char c = f2918;
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
}
