package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class an {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f357 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f358;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f359;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f361 = m448("\u0013\uffd0\u000f\u0007\u0006\u000b\u0003\u0016\u000b\u0011\u0010\uffd0\u0017\u0010\u000b\u0016\u001bￕ\u0006\uffd0\u0005\u0011\u000f\n\u0016\u0016\u0012\u0015ￜ\uffd1\uffd1\u000bￏ\u0003\u0006", (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 22, Drawable.resolveOpacity(0, 0) + 195, false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35).intern();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f360 = m448("\u0011\u0005\uffd0\u0006ￕ\u001b\u0016\u000b\u0010\u0017\uffd0\u0010\u0011\u000b\u0016\u0003\u000b\u0006\u0007\u000f\uffd0\u0013\u0006\u0003ￏ\u0011\uffd1\uffd1ￜ\u0015\u0012\u0016\u0016\n\u000f", 34 - (KeyEvent.getMaxKeyCode() >> 16), 194 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, Color.red(0) + 35).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f362 = m448("\u0016\u0003\u000b\u0006\u0007\u000f\uffd0\u0013\u0006\u0003ￏ\u0003\uffd1\uffd1ￜ\u0015\u0012\u0016\u0016\n\u000f\u0011\u0005\uffd0\u0006ￕ\u001b\u0016\u000b\u0010\u0017\uffd0\u0010\u0011\u000b", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, View.combineMeasuredStates(0, 0) + 195, true, View.MeasureSpec.getSize(0) + 35).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static void m449() {
        f359 = InterfaceC0280i1.d.b.b;
    }

    public an() {
        m448("ￎ\u000b\u0016ￎ\u0004\u0002\u0014\u0012\u0001\u0003\u0005\u0002\u0001\u0003\u000b", View.resolveSize(0, 0) + 6, 196 - TextUtils.lastIndexOf("", '0', 0, 0), false, 14 - TextUtils.lastIndexOf("", '0')).intern();
    }

    static {
        m449();
        m448("￬\u0007\u0004\ufff2,$\ufff8\u0019\u0016\ufffa\u0019￦￡ￖ\ufff9", 12 - TextUtils.getOffsetBefore("", 0), 175 - ExpandableListView.getPackedPositionChild(0L), true, 15 - View.getDefaultSize(0, 0)).intern();
        int i = f357 + 39;
        f358 = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m453(String str) {
        int i = 2 % 2;
        int i2 = f358 + 113;
        f357 = i2 % 128;
        int i3 = i2 % 2;
        String strM446 = m446(this.f361, str);
        int i4 = f358 + 25;
        f357 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM446;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m451(String str) {
        int i = 2 % 2;
        int i2 = f357 + 93;
        f358 = i2 % 128;
        if (i2 % 2 != 0) {
            m446(this.f360, str);
            throw null;
        }
        String strM446 = m446(this.f360, str);
        int i3 = f358 + 39;
        f357 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return strM446;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m446(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            int i2 = f358 + 19;
            f357 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        } else {
            str = "";
        }
        StringBuilder sbAppend = sb.append(str).append(m448("\u0000", -ImageFormat.getBitsPerPixel(0), 147 - TextUtils.indexOf((CharSequence) "", '0'), true, (Process.myTid() >> 22) + 1).intern());
        if (str2 != null) {
            int i3 = f357 + 13;
            int i4 = i3 % 128;
            f358 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 39;
            f357 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = f357 + 79;
            f358 = i8 % 128;
            int i9 = i8 % 2;
            str2 = "";
        }
        return sbAppend.append(str2).toString();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m450() {
        int i = 2 % 2;
        int i2 = f358 + 1;
        f357 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f362;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m452() {
        int i = 2 % 2;
        int i2 = f358;
        int i3 = i2 + 45;
        f357 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f361;
        int i5 = i2 + 43;
        f357 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m447() {
        int i = 2 % 2;
        int i2 = f357 + 65;
        f358 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m448("ￎ\u000b\u0016ￎ\u0004\u0002\u0014\u0012\u0001\u0003\u0005\u0002\u0001\u0003\u000b", 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 198, false, 14 - MotionEvent.axisFromString("")).intern();
        int i4 = f358 + 79;
        f357 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m448(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f359);
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
