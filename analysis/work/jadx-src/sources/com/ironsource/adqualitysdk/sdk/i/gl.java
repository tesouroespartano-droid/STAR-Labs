package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class gl extends gk {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2209 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2210 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2211 = {28314, 45513, 53290, 61642, 5100, 12876, 21166, 29967, 37987, 46279, 55137, 63391, 5865, 14657, 23013, 30753, 39783, 48123, 55864, 64150, 7676, 15457, 23735, 32539, 7291, 49955, 41665, 33376, 24844, 16544};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2208 = 5173759103642951519L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2210 + 3;
        f2209 = i2 % 128;
        return (i2 % 2 != 0 ? m2191(1 >>> TextUtils.lastIndexOf("", 'W'), 72 >> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (6665 >> MotionEvent.axisFromString(""))) : m2191(TextUtils.lastIndexOf("", '0') + 1, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, (char) (MotionEvent.axisFromString("") + 28410))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2209;
        int i3 = i2 + 99;
        f2210 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 31;
        f2210 = i4 % 128;
        int i5 = i4 % 2;
        return InMobiSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bo boVar = new bo(mo2168());
        int i2 = f2209 + 89;
        f2210 = i2 % 128;
        int i3 = i2 % 2;
        return boVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2209 + 57;
        f2210 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2191(70 % Process.getGidForName(""), 69 << ExpandableListView.getPackedPositionGroup(1L), (char) (ExpandableListView.getPackedPositionChild(1L) + 15371)) : m2191(Process.getGidForName("") + 25, 6 - ExpandableListView.getPackedPositionGroup(0L), (char) (ExpandableListView.getPackedPositionChild(0L) + 7187))).intern();
        int i3 = f2209 + 3;
        f2210 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2191(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2211[b.f638 + i]) ^ (((long) b.f638) * f2208)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
