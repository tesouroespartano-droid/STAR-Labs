package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cw extends cx {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1543 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1544 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1545 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1546 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1547 = {197, 242, 239, Typography.nbsp, 227, 229, 225, 244, 233, 238, 231, 247, 232, 243, 228, 236};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1548 = 128;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1767(co coVar, List<Object> list) {
        List list2;
        int i = 2 % 2;
        Class cls = (Class) m1770(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            int i2 = f1544 + InterfaceC0280i1.d.b.d;
            f1543 = i2 % 128;
            arrayList = (List) (i2 % 2 == 0 ? m1770(list, 0, List.class) : m1770(list, 1, List.class));
        }
        if (list.size() > 2) {
            int i3 = f1543 + 41;
            f1544 = i3 % 128;
            int i4 = i3 % 2;
            list2 = (List) m1770(list, 2, List.class);
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                return kc.m2802(cls, (List<Object>) arrayList);
            }
            Class[] clsArr = new Class[list2.size()];
            list2.toArray(clsArr);
            return kc.m2791(cls, arrayList, clsArr);
        } catch (Exception e) {
            String strM1703 = coVar.m1637().m1703();
            String string = "";
            StringBuilder sbAppend = new StringBuilder().append(m1765(null, Color.alpha(0) + WorkQueueKt.MASK, null, "\u0084\u008c\u0086\u008a\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern()).append(cls.getName()).append(m1765(null, TextUtils.getOffsetAfter("", 0) + WorkQueueKt.MASK, null, "\u0084\u008e\u008b\u0082\u0087\u0084\u008d\u0088\u0089\u008c\u0084").intern()).append(arrayList);
            if (list2 != null) {
                string = new StringBuilder().append(m1765(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0084\u008e\u0086\u008e\u008e\u0087\u0090\u0085\u0084\u008f\u008a\u0087\u0084").intern()).append(list2).toString();
            } else {
                int i5 = f1544 + 85;
                f1543 = i5 % 128;
                int i6 = i5 % 2;
            }
            cn.m1575(strM1703, sbAppend.append(string).toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static char m1764(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1544 + 45;
        f1543 = i2 % 128;
        int i3 = i2 % 2;
        char cIntValue = (char) ((Number) m1770(list, 0, Number.class)).intValue();
        int i4 = f1543 + 49;
        f1544 = i4 % 128;
        int i5 = i4 % 2;
        return cIntValue;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Class m1768(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1543 + 1;
        f1544 = i2 % 128;
        return (i2 % 2 != 0 ? Array.newInstance((Class<?>) m1770(list, 1, Class.class), 1) : Array.newInstance((Class<?>) m1770(list, 0, Class.class), 0)).getClass();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m1766(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1543 + 87;
        f1544 = i2 % 128;
        int i3 = i2 % 2;
        if (kc.m2804(m1770(list, 0, Object.class), (String) m1770(list, 1, String.class), (List) m1770(list, 2, List.class)) != null) {
            return true;
        }
        int i4 = f1543 + InterfaceC0280i1.d.b.i;
        f1544 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1765(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1547;
            int i2 = f1548;
            if (f1546) {
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
            if (f1545) {
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
}
