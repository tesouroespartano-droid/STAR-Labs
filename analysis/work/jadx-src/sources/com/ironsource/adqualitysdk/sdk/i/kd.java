package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class kd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2978 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2979 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2980 = {-86, 7, 3, -11, Ascii.US, 7, -1, -4, 9, -74, -1, -4, 9, 74, -71, -7, 5, -11, 19, -3, -5, -3, Ascii.VT, -21, 86, -82, 3, -3, 0, 45, -81, -59, -1, -15, 19, -2, -11, -7, 3, -2, 76, -6, 0, 0, -94, -94, -94, -94, -66, -1, -4, 9, 74, -72, 5, -18, 6, Ascii.ESC, -32, 1, Ascii.DC2, -11, 76, -71, -7, 5, -11, 19, -4, -13, Ascii.SI, 67, -82, 3, -3, 0, 45};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2981 = 95;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2982 = -1430257775;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2983 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2984 = 1922744257;

    public interface a<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo547(JSONObject jSONObject, String str);
    }

    public interface b<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo546(JSONArray jSONArray, int i);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m2826(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2979 + 95;
        f2978 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM2819 = m2819(jSONObject, false);
        int i4 = f2979 + 15;
        f2978 = i4 % 128;
        if (i4 % 2 == 0) {
            return jSONObjectM2819;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[Catch: JSONException -> 0x0042, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0042, blocks: (B:8:0x0017, B:10:0x0024), top: B:19:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m2819(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        int i;
        int i2 = 2 % 2;
        int i3 = f2978 + 33;
        f2979 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
            if (jSONObject != null) {
                try {
                    jSONObject2 = new JSONObject(jSONObject.toString());
                    if (!(!z)) {
                        jSONObject2.remove(ij.f2564);
                        int i5 = f2978 + 81;
                        f2979 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    i = f2978 + 45;
                    f2979 = i % 128;
                    if (i % 2 == 0) {
                        int i7 = 50 / 0;
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                }
            }
        } else if (jSONObject != null) {
            jSONObject2 = new JSONObject(jSONObject.toString());
            if (!(!z)) {
                jSONObject2.remove(ij.f2564);
                int i8 = f2978 + 81;
                f2979 = i8 % 128;
                int i9 = i8 % 2;
            }
            i = f2978 + 45;
            f2979 = i % 128;
            if (i % 2 == 0) {
                int i10 = 50 / 0;
            }
            return jSONObject2;
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2828(JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f2978 + 95;
        f2979 = i2 % 128;
        int i3 = i2 % 2;
        m2816(jSONObject, jSONObject2, false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2816(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        int i = 2 % 2;
        int i2 = f2978;
        int i3 = i2 + 49;
        f2979 = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        int i5 = i2 + InterfaceC0280i1.d.b.b;
        f2979 = i5 % 128;
        int i6 = i5 % 2;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(ij.f2564);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m2821(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f2978 + 67;
        f2979 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
            if (jSONArray == null) {
                return null;
            }
        } else if (jSONArray == null) {
            return null;
        }
        List<String> listM2825 = m2825(jSONArray);
        int i4 = f2978 + 113;
        f2979 = i4 % 128;
        int i5 = i4 % 2;
        return listM2825;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m2825(JSONArray jSONArray) {
        int i = 2 % 2;
        List<T> listM2812 = m2812(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
            /* JADX INFO: renamed from: ﻛ */
            public final T mo546(JSONArray jSONArray2, int i2) {
                return (T) jSONArray2.opt(i2);
            }
        });
        int i2 = f2978 + 29;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            return listM2812;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <T> List<T> m2812(JSONArray jSONArray, b<T> bVar) {
        int i = 2 % 2;
        int i2 = f2979 + 91;
        f2978 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            T tMo546 = bVar.mo546(jSONArray, i4);
            if (tMo546 != null) {
                int i5 = f2979 + 93;
                f2978 = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(tMo546);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m2822(JSONObject jSONObject, String str, List<String> list) {
        int i = 2 % 2;
        int i2 = f2979 + 107;
        f2978 = i2 % 128;
        if (i2 % 2 == 0) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                return m2821(jSONArrayOptJSONArray);
            }
            int i3 = f2979 + 65;
            f2978 = i3 % 128;
            int i4 = i3 % 2;
            return list;
        }
        jSONObject.optJSONArray(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2820(JSONObject jSONObject, int i) {
        int i2 = 2 % 2;
        int i3 = f2978 + 99;
        f2979 = i3 % 128;
        int i4 = i3 % 2;
        m2815(jSONObject, i, (List<String>) null);
        int i5 = f2979 + 75;
        f2978 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2815(JSONObject jSONObject, int i, List<String> list) {
        int i2 = 2 % 2;
        int i3 = f2979 + 69;
        f2978 = i3 % 128;
        int i4 = i3 % 2;
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                int i5 = 0;
                while (i5 < jSONArrayNames.length()) {
                    String strOptString = jSONArrayNames.optString(i5);
                    if (list == null || !list.contains(strOptString)) {
                        m2824(jSONObject, strOptString, i);
                    }
                    i5++;
                    int i6 = f2978 + 75;
                    f2979 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            int i8 = f2979 + 67;
            f2978 = i8 % 128;
            int i9 = i8 % 2;
        } catch (JSONException e) {
            n.m2873(m2817(Gravity.getAbsoluteGravity(0, 0) + 1430257775, (byte) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) - 96, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1922744183, (short) Color.blue(0)).intern(), m2817(1430257785 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) - 96, (-1922744189) - Process.getGidForName(""), (short) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2824(JSONObject jSONObject, String str, int i) throws JSONException {
        int i2 = 2 % 2;
        String strM2811 = m2811(jSONObject.opt(str), i);
        if (strM2811 != null) {
            int i3 = f2978 + 45;
            f2979 = i3 % 128;
            int i4 = i3 % 2;
            if (strM2811.equals("")) {
                int i5 = f2979 + 97;
                f2978 = i5 % 128;
                int i6 = i5 % 2;
                strM2811 = null;
            }
            jSONObject.put(str, strM2811);
            int i7 = f2978 + 81;
            f2979 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2814(JSONArray jSONArray, int i) throws JSONException {
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            int i4 = f2978 + 43;
            f2979 = i4 % 128;
            int i5 = i4 % 2;
            m2827(jSONArray, i3, i);
            i3++;
            int i6 = f2978 + 95;
            f2979 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2827(JSONArray jSONArray, int i, int i2) throws JSONException {
        int i3 = 2 % 2;
        int i4 = f2979 + 69;
        f2978 = i4 % 128;
        int i5 = i4 % 2;
        String strM2811 = m2811(jSONArray.opt(i), i2);
        if (strM2811 != null) {
            jSONArray.put(i, strM2811);
        }
        int i6 = f2979 + 85;
        f2978 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2811(Object obj, int i) throws JSONException {
        int i2 = 2 % 2;
        Object obj2 = null;
        if (obj instanceof JSONObject) {
            m2820((JSONObject) obj, i);
        } else if (!(obj instanceof JSONArray)) {
            if (obj instanceof String) {
                int i3 = f2978 + 17;
                f2979 = i3 % 128;
                int i4 = i3 % 2;
                String str = (String) obj;
                if (str.length() <= i) {
                    int i5 = f2979 + 1;
                    f2978 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return str;
                    }
                    throw null;
                }
                return new StringBuilder().append(str.substring(0, i)).append(m2817((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1430257805, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 96, View.resolveSizeAndState(0, 0, 0) - 1922744211, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()).toString();
            }
        } else {
            int i6 = f2979 + 7;
            f2978 = i6 % 128;
            if (i6 % 2 != 0) {
                m2814((JSONArray) obj, i);
                super.hashCode();
                throw null;
            }
            m2814((JSONArray) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Map<String, String> m2813(JSONObject jSONObject) {
        int i = 2 % 2;
        Map<String, String> mapM2823 = m2823(jSONObject, new a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo547(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i2 = f2979 + 49;
        f2978 = i2 % 128;
        int i3 = i2 % 2;
        return mapM2823;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m2823(JSONObject jSONObject, a<T> aVar) {
        int i = 2 % 2;
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        int i2 = f2979 + 59;
        f2978 = i2 % 128;
        int i3 = i2 % 2;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, aVar.mo547(jSONObject, next));
        }
        int i4 = f2978 + 95;
        f2979 = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m2818(int i, int i2, long j, long j2) {
        int i3 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (j <= -1) {
                jSONObject.put(m2817(1430257819 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) - 96, (-1922744137) - KeyEvent.getDeadChar(0, 0), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), -1);
                jSONObject.put(m2817(1430257820 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ImageFormat.getBitsPerPixel(0) + 1), (Process.myPid() >> 22) - 96, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1922744136, (short) Drawable.resolveOpacity(0, 0)).intern(), -1);
                jSONObject.put(m2817(1430257821 - ExpandableListView.getPackedPositionGroup(0L), (byte) Color.red(0), (-96) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0) - 1922744140, (short) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), -1);
                jSONObject.put(m2817(KeyEvent.keyCodeFromString("") + 1430257822, (byte) ExpandableListView.getPackedPositionGroup(0L), (-95) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1922744140) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) TextUtils.indexOf("", "")).intern(), -1);
                int i4 = f2979 + 65;
                f2978 = i4 % 128;
                int i5 = i4 % 2;
                return jSONObject;
            }
            int i6 = f2979 + 113;
            f2978 = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put(m2817(View.MeasureSpec.getMode(0) + 1430257819, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0, 0) - 1922744136, (short) Color.green(0)).intern(), i);
            jSONObject.put(m2817(Color.alpha(0) + 1430257820, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-97) - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1922744136, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), i2);
            jSONObject.put(m2817((ViewConfiguration.getWindowTouchSlop() >> 8) + 1430257821, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) - 95, (ViewConfiguration.getLongPressTimeout() >> 16) - 1922744141, (short) View.combineMeasuredStates(0, 0)).intern(), j);
            jSONObject.put(m2817(1430257821 - ImageFormat.getBitsPerPixel(0), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.red(0) - 96, (-1922744139) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) KeyEvent.keyCodeFromString("")).intern(), j2);
            return jSONObject;
        } catch (JSONException e) {
            n.m2873(m2817(MotionEvent.axisFromString("") + 1430257776, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-96) - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) - 1922744182, (short) TextUtils.indexOf("", "")).intern(), m2817(KeyEvent.normalizeMetaState(0) + 1430257823, (byte) (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionGroup(0L) - 96, Color.alpha(0) - 1922744188, (short) (ViewConfiguration.getTapTimeout() >> 16)).intern(), (Throwable) e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2817(int i, byte b2, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2981;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2980;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2982 + i] + i4);
                } else {
                    i5 = (short) (f2983[f2982 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2982 + i6;
                l.f3002 = b2;
                l.f3004 = (char) (i3 + f2984);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2980;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2983;
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
