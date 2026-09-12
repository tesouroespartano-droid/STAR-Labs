package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.InterfaceC0280i1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jx {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2925 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2926 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2927 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject f2928;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject f2929;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2930;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2931;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2932;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m2734() {
        f2932 = 145;
        f2931 = 0L;
        f2930 = -399676758;
        f2926 = (char) 0;
    }

    static {
        m2734();
        f2929 = null;
        int i = f2927 + 27;
        f2925 = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2726() {
        String str;
        int i = 2 % 2;
        int i2 = f2927 + 33;
        f2925 = i2 % 128;
        if (i2 % 2 != 0) {
            str = Build.VERSION.RELEASE;
            int i3 = 9 / 0;
        } else {
            str = Build.VERSION.RELEASE;
        }
        int i4 = f2925 + 123;
        f2927 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2725(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2925 + 117;
        f2927 = i2 % 128;
        try {
            jSONObject.put(i2 % 2 == 0 ? m2733("\u0005\ufff7\f\ufffb", 1 / (ViewConfiguration.getPressedStateDuration() >> 64), 12860 << Color.red(1), false, 2 / (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern() : m2733("\u0005\ufff7\f\ufffb", (ViewConfiguration.getPressedStateDuration() >> 16) + 1, Color.red(0) + 255, true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3).intern(), m2729());
            int i3 = f2925 + 23;
            f2927 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2743(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f2925 + 1;
        int i5 = i4 % 128;
        f2927 = i5;
        int i6 = i4 % 2;
        if (i >= 0) {
            int i7 = i5 + 107;
            f2925 = i7 % 128;
            int i8 = i7 % 2;
            if (i2 >= 0) {
                int i9 = i5 + 57;
                f2925 = i9 % 128;
                int i10 = i9 % 2;
                if (i <= m2737() && i2 <= m2723()) {
                    int i11 = f2927 + 105;
                    f2925 = i11 % 128;
                    int i12 = i11 % 2;
                    return true;
                }
            }
        }
        int i13 = f2925 + 85;
        f2927 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int m2737() {
        int i = 2 % 2;
        int i2 = f2925 + 93;
        f2927 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = m2729().optInt(m2733("\u0000", (Process.myPid() >> 22) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 264, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern());
        int i4 = f2925 + 27;
        f2927 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int m2723() {
        int i = 2 % 2;
        int i2 = f2925 + InterfaceC0280i1.d.b.i;
        f2927 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = m2729().optInt(m2738("譀", 699482706 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "勼녂縩⎷", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf("", "") + 46974)).intern());
        int i4 = f2927 + 47;
        f2925 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m2729() {
        int i = 2 % 2;
        int i2 = f2927 + 61;
        f2925 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2826 = kd.m2826(m2721());
        int i4 = f2927 + 27;
        f2925 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM2826;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static synchronized JSONObject m2721() {
        int i = 2 % 2;
        int i2 = f2925 + InterfaceC0280i1.d.b.i;
        f2927 = i2 % 128;
        int i3 = i2 % 2;
        if (f2929 == null) {
            JSONObject jSONObject = new JSONObject();
            f2929 = jSONObject;
            try {
                jSONObject.put(m2733("\u0000", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, ImageFormat.getBitsPerPixel(0) + 265, true, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), -1);
                f2929.put(m2738("譀", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 699482706, "勼녂縩⎷", "\u0000\u0000\u0000\u0000", (char) (46975 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), -1);
                int i4 = f2925 + 7;
                f2927 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (JSONException unused) {
            }
        }
        return f2929;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m2739(Activity activity) {
        int i = 2 % 2;
        int i2 = f2925;
        int i3 = i2 + InterfaceC0280i1.d.b.i;
        f2927 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (activity != null) {
            int i4 = i2 + 83;
            f2927 = i4 % 128;
            int i5 = i4 % 2;
            m2728(activity.getApplicationContext());
            int i6 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2740(Application application) {
        int i = 2 % 2;
        int i2 = f2925;
        int i3 = i2 + 71;
        f2927 = i3 % 128;
        int i4 = i3 % 2;
        if (application != null) {
            int i5 = i2 + 37;
            f2927 = i5 % 128;
            int i6 = i5 % 2;
            m2728(application.getApplicationContext());
            int i7 = f2927 + 85;
            f2925 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized void m2728(Context context) {
        int i = 2 % 2;
        int i2 = f2927;
        int i3 = i2 + 125;
        f2925 = i3 % 128;
        int i4 = i3 % 2;
        if (context != null) {
            int i5 = i2 + 83;
            f2925 = i5 % 128;
            int i6 = i5 % 2;
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService(m2738("斘⸸羕迫⺗ʬ", ViewConfiguration.getTouchSlop() >> 8, "ᥲ뉅㗥笛", "\u0000\u0000\u0000\u0000", (char) (6965 - ExpandableListView.getPackedPositionGroup(0L))).intern());
                if (windowManager != null) {
                    int i7 = f2927 + InterfaceC0280i1.d.b.b;
                    f2925 = i7 % 128;
                    if (i7 % 2 != 0 || Build.VERSION.SDK_INT >= 30) {
                        try {
                            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            if (bounds != null) {
                                m2727(bounds.height(), bounds.width());
                                return;
                            }
                        } catch (Throwable th) {
                            n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", View.combineMeasuredStates(0, 0) + 1434278987, "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2733("\u0004ﾾ\u0011\u0001\u0007\u0010\u0012\u0003￫\u0015\r\u0002\f\u0007\u0015ﾾ\u0005\f\u0007\u0012\u0012\u0003\u0005ﾾ\f\u0007ﾾ\u0010\r\u0010\u0010￣\u0010\u0003\u0005\f\uffff￫\u0015\r\u0002\f\u0007\u0015ﾾ\u000b\r\u0010", ExpandableListView.getPackedPositionType(0L) + 32, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 242, true, 48 - View.MeasureSpec.getSize(0)).intern(), th);
                        }
                    }
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    m2731(resources.getDisplayMetrics());
                }
            } catch (Throwable th2) {
                n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", MotionEvent.axisFromString("") + 1434278988, "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), m2733("\u0007￢ﾾ\u0005\f\u0007\u0012\u0012\u0003\u0005ﾾ\f\u0007ﾾ\u0010\r\u0010\u0010￣\u0012\u0016\u0003\u0012\f\r\u0001ﾾ\u000b\r\u0010\u0004ﾾ\u0011\u0001\u0007\u0010\u0012\u0003￫\u0017\uffff\n\u000e\u0011", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (ViewConfiguration.getEdgeSlop() >> 16) + 243, true, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44).intern(), th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2731(DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = f2925 + 85;
        f2927 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
            if (displayMetrics != null) {
                m2727(displayMetrics.heightPixels, displayMetrics.widthPixels);
            }
        } else if (displayMetrics != null) {
            m2727(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int i4 = f2925 + 121;
        f2927 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2727(int i, int i2) {
        int i3 = 2 % 2;
        if (i > 0) {
            int i4 = f2927;
            int i5 = i4 + 121;
            f2925 = i5 % 128;
            int i6 = i5 % 2;
            if (i2 > 0) {
                int i7 = i4 + 17;
                f2925 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    JSONObject jSONObjectM2721 = m2721();
                    jSONObjectM2721.put(m2733("\u0000", 1 - ((Process.getThreadPriority(0) + 20) >> 6), 264 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, Color.argb(0, 0, 0, 0) + 1).intern(), i2);
                    jSONObjectM2721.put(m2738("譀", 699482705 - ExpandableListView.getPackedPositionChild(0L), "勼녂縩⎷", "\u0000\u0000\u0000\u0000", (char) (46974 - TextUtils.getCapsMode("", 0, 0))).intern(), i);
                    int i9 = f2925 + 99;
                    f2927 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", 1434278987 - Color.alpha(0), "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m2738("⎦ᒃ휵\u18ff⎟膗䈑\ud946⡠⬿咂䙖癞﴾\ue846牫ꨌ⚣\ue2ab鋖⿑樍䒿〡㠔", TextUtils.lastIndexOf("", '0', 0, 0) + 473687256, "휮㯤瀜☈", "\u0000\u0000\u0000\u0000", (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2741(Context context, JSONObject jSONObject) {
        String strIntern;
        boolean z;
        int i = 2 % 2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m2733("￼\u0007\f\ufff4\ufff6\u0007￼\t", 3 - Color.blue(0), KeyEvent.getDeadChar(0, 0) + 254, false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m2733("\u0001\n\ufff5\u0001", 1 - (Process.myTid() >> 22), 253 - View.MeasureSpec.getSize(0), true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3).intern(), memoryInfo.availMem / 1048576);
            jSONObject.put(m2733("\u0007\u0000\u0000\ufffb", 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 254, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                int i2 = f2925 + 13;
                f2927 = i2 % 128;
                if (i2 % 2 == 0) {
                    strIntern = m2733("\ufffe\ufffe\b�", 1 >>> (ExpandableListView.getPackedPositionForChild(0, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 1) == 0L ? 0 : -1)), 31947 % (ViewConfiguration.getScrollBarSize() << 97), false, 4 >>> (ViewConfiguration.getScrollBarSize() * 52)).intern();
                    z = memoryInfo.lowMemory;
                } else {
                    strIntern = m2733("\ufffe\ufffe\b�", 1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 256 - (ViewConfiguration.getScrollBarSize() >> 8), true, (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern();
                    z = memoryInfo.lowMemory;
                }
                jSONObject.put(strIntern, z);
            }
            int i3 = f2925 + 83;
            f2927 = i3 % 128;
            int i4 = i3 % 2;
            jSONObject.put(m2733("\u0004\u0004��", 2 - Color.green(0), 257 - Color.green(0), false, 4 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), memoryInfo.totalMem / 1048576);
            int i5 = f2927 + 79;
            f2925 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            n.m2887(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", Color.alpha(0) + 1434278987, "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern(), new StringBuilder().append(m2733("\uffc1\u000e\u0006\u000e\u0010\u0013\u001a\uffc1\u0016\u0014\u0002\b\u0006ￛ\uffc1￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n\u000f\b", ExpandableListView.getPackedPositionChild(0L) + 16, 240 - Color.argb(0, 0, 0, 0), false, 27 - ExpandableListView.getPackedPositionChild(0L)).intern()).append(th.getLocalizedMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2732(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2927 + 79;
        f2925 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                long totalRxBytes = TrafficStats.getTotalRxBytes();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (totalRxBytes != -1) {
                    int i3 = f2927 + 61;
                    f2925 = i3 % 128;
                    int i4 = i3 % 2;
                    long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                    jSONObject.put(m2733("\ufffe￼\u0005\u0001", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), 259 - TextUtils.getTrimmedLength(""), false, View.combineMeasuredStates(0, 0) + 4).intern(), Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis))));
                    jSONObject.put(m2733("\uffff\u0005\ufffb\u0004", KeyEvent.normalizeMetaState(0) + 2, 260 - TextUtils.indexOf("", "", 0), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 5).intern(), totalRxBytes2);
                }
                int i5 = f2925 + InterfaceC0280i1.d.b.d;
                f2927 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            TrafficStats.getTotalRxBytes();
            System.currentTimeMillis();
            System.currentTimeMillis();
            throw null;
        } catch (Throwable th) {
            n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", 1434278987 - KeyEvent.normalizeMetaState(0), "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) KeyEvent.getDeadChar(0, 0)).intern(), m2733("\u0013\u0001\u0007\u0005￥\u0012\u0012\u000f\u0012\uffc0\u0007\u0005\u0014\u0014\t\u000e\u0007\uffc0\u0003\u0010\u0015\uffc0\u0001\u000e\u0004\uffc0\u000e\u0005\u0014\u0017\u000f\u0012\u000b\uffc0\u0015", (-16777212) - Color.rgb(0, 0, 0), 241 - ((Process.getThreadPriority(0) + 20) >> 6), false, View.resolveSize(0, 0) + 35).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2736(JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jSONObjectM2720 = m2720();
        if (jSONObjectM2720 != null) {
            int i2 = f2927 + 73;
            f2925 = i2 % 128;
            int i3 = i2 % 2;
            kd.m2828(jSONObject, jSONObjectM2720);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = f2927 + 27;
        f2925 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2724(Context context, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f2927 + 17;
        f2925 = i2 % 128;
        int i3 = i2 % 2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m2733("\u0001\u0001\u0002\ufff6\f\u0007￼\t￼\u0007\ufff6\ufff8", TextUtils.lastIndexOf("", '0', 0) + 5, 254 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, ((Process.getThreadPriority(0) + 20) >> 6) + 12).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m2738("߫얩ᰜ\ued89\ud7c7", (KeyEvent.getMaxKeyCode() >> 16) - 699869770, "뛸䣕僖覆", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getOffsetBefore("", 0) + 34384)).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                jSONObject.put(m2738("뢲㊞喼ꖢ", ViewConfiguration.getTouchSlop() >> 8, "攄ʋ輝겲", "\u0000\u0000\u0000\u0000", (char) (45712 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int i4 = f2927 + 11;
                    f2925 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject.put(m2738("睔ꓫ\uec92䳱䩍", TextUtils.lastIndexOf("", '0') + 1438418103, "뛱버凌菏", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getTrimmedLength("") + 53241)).intern(), networkInfo.getType());
                    jSONObject.put(m2733("\b\ufff6\u0001\u0004", 3 - Color.blue(0), Color.alpha(0) + 253, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4).intern(), networkInfo.getTypeName());
                    jSONObject.put(m2738("抂ﷆ휆┪坳", 1590879346 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "煍틤\ue65e볣", "\u0000\u0000\u0000\u0000", (char) (View.MeasureSpec.getSize(0) + 58342)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m2738("ʱꯧ폷鼔", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "䅡冉\ue833\u0a7f", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf("", "", 0, 0) + 32744)).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m2733("\u0003\u0004\u0002\ufff7", 2 - TextUtils.indexOf("", "", 0, 0), 253 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, ((byte) KeyEvent.getModifierMetaStateMask()) + 5).intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m2738("삱䈤脦吷", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "틓槳뼹䬙", "\u0000\u0000\u0000\u0000", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6590)).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m2738("喲箍䤐ᛔ", ExpandableListView.getPackedPositionGroup(0L), "坿苄ꄦ듎", "\u0000\u0000\u0000\u0000", (char) (52897 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), telephonyManager.getNetworkCountryIso());
                    if (z) {
                        int i6 = f2925 + 31;
                        f2927 = i6 % 128;
                        int i7 = i6 % 2;
                        jSONObject.put(m2738("ᷳߗ痳ⱓ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "ᢘꚷ稯卦", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26234)).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m2738("\uf604짩ȯ\uf0ae", MotionEvent.axisFromString("") + 1, "粻퓍쬹鈕", "\u0000\u0000\u0000\u0000", (char) (Gravity.getAbsoluteGravity(0, 0) + 5579)).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
            int i8 = f2927 + 75;
            f2925 = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th) {
            n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", 1434278987 - KeyEvent.keyCodeFromString(""), "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) TextUtils.indexOf("", "")).intern(), m2738("躟꽩歠鑃ﬞ癲䅓머这뀙챸⍩綋帢䔺ੀ±⥢᫆\ue85c焭憕뾆뮦ﮯꔦ戜댽嬢碣ꐈ량㏁", TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 2007705442, "鵿哘鞈嬯", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2730(Context context, JSONObject jSONObject) {
        int i = 2 % 2;
        try {
            if (ju.m2710(context, m2738("\ue2eb줘\u2cf8礗튅\udab4鞍\ue80dd覙\uf05a끙ℝ㿐䄑쭤ᄒ쑯Ȏ쥛恫淹\uda64䛵黧ࣉᗖ仄綼ࠕ\ud98c흹薙뵱\ue7fc\ue5ef", View.MeasureSpec.getSize(0), "\ua7ea첂켤平", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                int i2 = f2925 + InterfaceC0280i1.d.b.b;
                f2927 = i2 % 128;
                int i3 = i2 % 2;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m2733("\f\ufffe\ufffb\ufffe", (ViewConfiguration.getEdgeSlop() >> 16) + 1, 252 - View.getDefaultSize(0, 0), true, TextUtils.getOffsetAfter("", 0) + 4).intern())).getConnectionInfo();
                jSONObject.put(m2733("\ufff5\u0006\u0003\u0002", (ViewConfiguration.getLongPressTimeout() >> 16) + 2, ExpandableListView.getPackedPositionChild(0L) + 259, true, 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    int i4 = f2925 + 19;
                    f2927 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject.put(m2733("\u0002\ufff6\u0007\u0003", 3 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + InputDeviceCompat.SOURCE_KEYBOARD, true, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), connectionInfo.getRssi());
                    jSONObject.put(m2738("콠\ue8f9ᑡꗖ", TextUtils.lastIndexOf("", '0', 0) + 1, "咈뚷ヽ궻", "\u0000\u0000\u0000\u0000", (char) ((Process.myPid() >> 22) + 47920)).intern(), connectionInfo.getLinkSpeed());
                    int i6 = f2925 + 89;
                    f2927 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } catch (Throwable th) {
            n.m2873(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", TextUtils.getOffsetBefore("", 0) + 1434278987, "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), m2733("\u0007ￂ\u0011\u0016ￂ\u0011\b\u0010\u000bￂ\u000b\b\u000b\u0019ￂ\t\u0010\u000b\u0006\u0006\u0003ￂ\u0014\u0011\u0014\u0014\uffe7\u0016\u0010\u0007\u0018", 27 - ExpandableListView.getPackedPositionGroup(0L), 240 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31).intern(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d A[PHI: r19
      0x009d: PHI (r19v3 long) = (r19v2 long), (r19v7 long) binds: [B:15:0x0078, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2735(Intent intent) {
        long j;
        int intExtra;
        int intExtra2;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            int i2 = f2925 + 5;
            f2927 = i2 % 128;
            int intExtra3 = -1;
            try {
                if (i2 % 2 == 0) {
                    try {
                        j = 0;
                        if (intent.hasExtra(m2733("\u0006\ufffa\ufffb��\u000b\u0002", -TextUtils.lastIndexOf("", 'a', 1, 1), 5122 % View.getDefaultSize(1, 0), true, 64 >> View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            intExtra = intent.getIntExtra(m2733("\u0006\ufffa\ufffb��\u000b\u0002", 1 - (ViewConfiguration.getTapTimeout() >> 16), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 250, true, 7 - Color.red(0)).intern(), -1);
                        } else {
                            intExtra = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        j = 0;
                        n.m2887(m2738("읙耑䦍䵒鄡桅\u244f㛋ﳓⱪ\ud9fa", TextUtils.indexOf("", "", 0, 0) + 1434278987, "䯮絜챕傡", "\u0000\u0000\u0000\u0000", (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new StringBuilder().append(m2738("좫\u2d2c\udce8죚ᴊ簒\u2005䔌顉긭ꗾ\uaac3椦\u0dfd喼\udb6c臐嚉붠욟\udbabꆽꞌ셒\u175a䴔卙\uf498졝䪢\ue9cd媀\ue020Ћ턇裙송", 1745145087 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), "﹆ӌ써櫶", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()).append(th.getLocalizedMessage()).toString());
                    }
                } else {
                    j = 0;
                    if (intent.hasExtra(m2733("\u0006\ufffa\ufffb��\u000b\u0002", -TextUtils.lastIndexOf("", '0', 0, 0), View.getDefaultSize(0, 0) + 251, true, View.MeasureSpec.makeMeasureSpec(0, 0) + 7).intern())) {
                        intExtra = intent.getIntExtra(m2733("\u0006\ufffa\ufffb��\u000b\u0002", 1 - (ViewConfiguration.getTapTimeout() >> 16), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 250, true, 7 - Color.red(0)).intern(), -1);
                    } else {
                        intExtra = -1;
                    }
                }
                jSONObject.put(m2738("䳣㪡⿲崎", (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1, "ꬆ㉔\uf4c5យ", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getOffsetAfter("", 0) + 39412)).intern(), intExtra);
                if (intent.hasExtra(m2738("暔皌\uf76f煆ͧ", TextUtils.getCapsMode("", 0, 0) - 2131022039, "⧹אָ솀尹", "\u0000\u0000\u0000\u0000", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 14785)).intern())) {
                    int i3 = f2927 + 93;
                    f2925 = i3 % 128;
                    int i4 = i3 % 2;
                    intExtra2 = intent.getIntExtra(m2738("暔皌\uf76f煆ͧ", Process.getGidForName("") - 2131022038, "⧹אָ솀尹", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf("", "", 0, 0) + 14785)).intern(), -1);
                } else {
                    intExtra2 = -1;
                }
                if (intent.hasExtra(m2738("ᑩ\u2002烻겴⃟", Color.rgb(0, 0, 0) - 242525055, "臩譜胰窐", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 36992)).intern())) {
                    int i5 = f2927 + 105;
                    f2925 = i5 % 128;
                    intExtra3 = intent.getIntExtra(i5 % 2 != 0 ? m2738("ᑩ\u2002烻겴⃟", (-259302272) % TextUtils.indexOf((CharSequence) "", (char) 23, 0), "臩譜胰窐", "\u0000\u0000\u0000\u0000", (char) (36992 - View.MeasureSpec.makeMeasureSpec(0, 1))).intern() : m2738("ᑩ\u2002烻겴⃟", (-259302272) - TextUtils.indexOf((CharSequence) "", '0', 0), "臩譜胰窐", "\u0000\u0000\u0000\u0000", (char) (36992 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), -1);
                }
                jSONObject.put(m2733("\u0006\ufff4\b\ufffe", View.resolveSizeAndState(0, 0, 0) + 2, 303 - AndroidCharacter.getMirror('0'), true, ExpandableListView.getPackedPositionType(j) + 4).intern(), Math.round((intExtra2 * 100.0f) / intExtra3));
            } catch (Throwable th2) {
                th = th2;
            }
        }
        m2742(jSONObject);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static JSONObject m2720() {
        int i = 2 % 2;
        int i2 = f2927 + 71;
        f2925 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2722 = m2722();
        if (i3 == 0) {
            return kd.m2826(jSONObjectM2722);
        }
        kd.m2826(jSONObjectM2722);
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static synchronized JSONObject m2722() {
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = f2927;
        int i3 = i2 + 11;
        f2925 = i3 % 128;
        int i4 = i3 % 2;
        jSONObject = f2928;
        int i5 = i2 + 91;
        f2925 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static synchronized void m2742(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2927 + 113;
        int i3 = i2 % 128;
        f2925 = i3;
        int i4 = i2 % 2;
        f2928 = jSONObject;
        int i5 = i3 + 13;
        f2927 = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2733(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2932);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2738(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2931) ^ ((long) f2930)) ^ ((long) f2926));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
