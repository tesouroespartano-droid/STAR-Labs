package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class cx {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1549 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1550 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f1551 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1552 = -2138512149;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1553 = -2072853931;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1554 = 97;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1555 = {40, 125, 106, -42, 59, 40, -127, 125, 124, -119, 118, -29, -99, SignedBytes.MAX_POWER_OF_TWO, 0, 0};

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r8
      0x001f: PHI (r8v2 T) = (r8v1 T), (r8v10 T) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m1770(List<Object> list, int i, Class<T> cls) {
        T t;
        int i2 = 2 % 2;
        int i3 = f1549 + 99;
        f1550 = i3 % 128;
        if (i3 % 2 != 0) {
            t = (T) list.get(i);
            int i4 = 68 / 0;
            if (t != null) {
                if (!cls.isAssignableFrom(t.getClass())) {
                    throw new ClassCastException(new StringBuilder().append(m1771(2138512149 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-47) - Process.getGidForName("")), (ViewConfiguration.getLongPressTimeout() >> 16) - 85, 2072853998 - Color.blue(0), (short) (Color.alpha(0) + 86)).intern()).append(t.getClass().getName()).append(m1771(TextUtils.lastIndexOf("", '0') + 2138512161, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 4), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 92, ExpandableListView.getPackedPositionGroup(0L) + 2072853963, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 105)).intern()).append(cls.getName()).toString());
                }
            }
        } else {
            t = (T) list.get(i);
            if (t != null) {
                if (!cls.isAssignableFrom(t.getClass())) {
                    throw new ClassCastException(new StringBuilder().append(m1771(2138512149 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-47) - Process.getGidForName("")), (ViewConfiguration.getLongPressTimeout() >> 16) - 85, 2072853998 - Color.blue(0), (short) (Color.alpha(0) + 86)).intern()).append(t.getClass().getName()).append(m1771(TextUtils.lastIndexOf("", '0') + 2138512161, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 4), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 92, ExpandableListView.getPackedPositionGroup(0L) + 2072853963, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 105)).intern()).append(cls.getName()).toString());
                }
            }
        }
        int i5 = f1549 + 31;
        f1550 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return t;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    protected static <T> boolean m1769(List<Object> list, int i, Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = f1550 + 117;
        f1549 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = list.get(i);
        if (obj != null) {
            int i5 = f1549 + 29;
            f1550 = i5 % 128;
            int i6 = i5 % 2;
            Class<?> cls2 = obj.getClass();
            if (i6 != 0) {
                cls.isAssignableFrom(cls2);
                Object obj2 = null;
                super.hashCode();
                throw null;
            }
            if (!cls.isAssignableFrom(cls2)) {
                return false;
            }
        }
        int i7 = f1550 + 17;
        f1549 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 9 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    protected static List<Object> m1772(List<Object> list, int i) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list.size() <= i) {
            return arrayList;
        }
        int i3 = f1550 + 33;
        f1549 = i3 % 128;
        if (i3 % 2 == 0) {
            m1769(list, i, List.class);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!m1769(list, i, List.class)) {
            return arrayList;
        }
        List<Object> list2 = (List) m1770(list, i, List.class);
        int i4 = f1550 + 51;
        f1549 = i4 % 128;
        int i5 = i4 % 2;
        return list2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1771(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1554;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1555;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1552 + i] + i4);
                } else {
                    i5 = (short) (f1551[f1552 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1552 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1553);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1555;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1551;
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
