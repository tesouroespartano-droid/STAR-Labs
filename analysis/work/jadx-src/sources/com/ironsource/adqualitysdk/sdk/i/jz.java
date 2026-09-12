package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2947 = 94;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static WeakReference<az> f2948 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2949 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2950;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2761(az azVar) {
        int i = 2 % 2;
        f2948 = new WeakReference<>(azVar);
        int i2 = f2949 + 15;
        f2950 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Throwable m2769(Throwable th) {
        int i = 2 % 2;
        while (th.getCause() != null) {
            int i2 = f2949 + 27;
            f2950 = i2 % 128;
            if (i2 % 2 != 0) {
                th.getCause();
                throw null;
            }
            th = th.getCause();
        }
        int i3 = f2949 + 85;
        f2950 = i3 % 128;
        int i4 = i3 % 2;
        return th;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2766(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f2949 + 49;
        f2950 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m2768(str, str2, th, z, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2768(String str, String str2, Throwable th, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = f2949 + 107;
        f2950 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m2760(str, str2, th, z, z2, false);
            int i4 = f2949 + 77;
            f2950 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2760(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f2950 + 21;
        int i3 = i2 % 128;
        f2949 = i3;
        try {
            if (i2 % 2 != 0) {
                if (!z) {
                    n.m2884(str, str2, th, z3);
                    int i4 = f2949 + 97;
                    f2950 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int i6 = i3 + 13;
                    f2950 = i6 % 128;
                    if (i6 % 2 != 0) {
                        n.m2885(str, str2, z3);
                        int i7 = 12 / 0;
                        if (th != null) {
                            n.m2884(str, m2763("ￚ\u0013\f\t\u0001\u0014\u0005￤", Process.getGidForName("") + 9, 238 - AndroidCharacter.getMirror('0'), true, 8 - TextUtils.getCapsMode("", 0, 0)).intern(), th, z3);
                        }
                    } else {
                        n.m2885(str, str2, z3);
                        if (th != null) {
                            n.m2884(str, m2763("ￚ\u0013\f\t\u0001\u0014\u0005￤", Process.getGidForName("") + 9, 238 - AndroidCharacter.getMirror('0'), true, 8 - TextUtils.getCapsMode("", 0, 0)).intern(), th, z3);
                        }
                    }
                }
                m2765(str, str2, new StringBuilder().append(m2763("\fￛ\ufff5\u0013\u0002\u0004\u0006\u0003\u0002\u0004", 2 - (ViewConfiguration.getScrollBarSize() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 189, false, 9 - TextUtils.lastIndexOf("", '0')).intern()).append(str).toString(), th, null, false, z2, z3);
                int i8 = f2950 + 1;
                f2949 = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2767(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f2950 + 73;
        f2949 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2765(str, str2, str3, th, jSONObject, false, true, z);
            } else {
                m2765(str, str2, str3, th, jSONObject, true, false, z);
            }
            int i3 = f2949 + 73;
            f2950 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2759(String str, String str2, String str3, Throwable th) {
        int i = 2 % 2;
        int i2 = f2950 + 83;
        f2949 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2762(str, str2, str3, th, true);
            } else {
                m2762(str, str2, str3, th, false);
            }
            int i3 = f2950 + 51;
            f2949 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2762(String str, String str2, String str3, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f2950 + 55;
        f2949 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2765(str, str2, str3, th, null, false, false, true);
            } else {
                m2765(str, str2, str3, th, null, false, false, false);
            }
            int i3 = f2950 + 73;
            f2949 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2765(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        Throwable th2;
        String str4;
        int i = 2 % 2;
        if (z) {
            try {
                String string = new StringBuilder().append(str3).append(m2763("\u0000", (-16777215) - Color.rgb(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 152, true, 1 - TextUtils.getOffsetBefore("", 0)).intern()).append(str).toString();
                th2 = th;
                n.m2884(str, new StringBuilder().append(str2).append(m2763("\u001a\uffdfￗￗ\u001c\u001b&", TextUtils.indexOf("", "", 0, 0) + 3, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 167, true, Drawable.resolveOpacity(0, 0) + 7).intern()).append(string).append(m2763("\u0000", 1 - (ViewConfiguration.getTouchSlop() >> 8), Gravity.getAbsoluteGravity(0, 0) + 135, true, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).toString(), th2, z3);
                int i2 = f2949 + InterfaceC0280i1.d.b.i;
                f2950 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 3;
                }
                str4 = string;
            } catch (Throwable unused) {
                return;
            }
        } else {
            th2 = th;
            str4 = str3;
        }
        az azVar = f2948.get();
        if (azVar != null) {
            int i4 = f2950 + InterfaceC0280i1.d.b.b;
            f2949 = i4 % 128;
            int i5 = i4 % 2;
            azVar.m697(str, str2, str4, Log.getStackTraceString(th2), jSONObject, z2);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2764(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f2950 + 41;
        f2949 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m2770(str, str2, str3, str4);
            } else {
                m2770(str, str2, str3, str4);
                int i3 = 24 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2770(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f2949 + 75;
        f2950 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            String string = new StringBuilder().append(str3).append(m2763("\u0000", 1 - View.MeasureSpec.getMode(0), 153 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()).append(str).toString();
            n.m2885(str, new StringBuilder().append(m2763("￨ￃ\u000b\u0017\f\u001aￃ\u0015\u0012\u0015\u0015", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (-16777029) - Color.rgb(0, 0, 0), true, TextUtils.indexOf("", "", 0, 0) + 11).intern()).append(string).append(m2763("\u0006\u0011\u0000\u0013\b\u000e\rￍ\uffbf\b\r\u0013\u0004", 8 - (ViewConfiguration.getFadingEdgeLength() >> 16), 191 - View.resolveSize(0, 0), false, 13 - (Process.myTid() >> 22)).intern()).toString(), false);
            n.m2885(str, new StringBuilder().append(str2).append(str4 != null ? new StringBuilder().append(m2763("\u0000", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), 104 - KeyEvent.keyCodeFromString(""), false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern()).append(str4).toString() : "").toString(), false);
            az azVar = f2948.get();
            if (azVar != null) {
                azVar.m690(str, str2, string, str4);
                int i4 = f2949 + 119;
                f2950 = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2763(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2947);
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
}
