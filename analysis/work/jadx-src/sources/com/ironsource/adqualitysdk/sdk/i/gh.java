package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.Chartboost;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class gh extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2191 = {759, 1783, 2785, 3742, 4807, 5824, 6845, 7858, 8832, 9882, 10883, 11903, 12919, 13948, 14866, 15955, 16944, 17971, 19042, 20019, 21004, 22025, 23534, 24564, 25558, 26583, 27587, 28579, 29616, 'c', 1124, 2169, 3158, 4164, 5214, 6183, 7227, Typography.ndash, 9240};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2192 = 8766735265683080204L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2193 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2194 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2194 + 91;
        f2193 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2186((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, 29 - ExpandableListView.getPackedPositionGroup(0L), (char) (661 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern();
        int i4 = f2193 + 119;
        f2194 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2194;
        int i3 = i2 + 45;
        f2193 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        f2193 = i5 % 128;
        if (i5 % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bk bkVar = new bk(mo2168());
        int i2 = f2194 + 125;
        f2193 = i2 % 128;
        if (i2 % 2 == 0) {
            return bkVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i;
        int maxKeyCode;
        int packedPositionChild;
        int i2 = 2 % 2;
        int i3 = f2194 + 79;
        f2193 = i3 % 128;
        if (i3 % 2 != 0) {
            i = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            maxKeyCode = (KeyEvent.getMaxKeyCode() >> 6) + 22;
            packedPositionChild = 0 - ExpandableListView.getPackedPositionChild(1L);
        } else {
            i = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28;
            maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
            packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1;
        }
        return m2186(i, maxKeyCode, (char) packedPositionChild).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2186(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2191[b.f638 + i]) ^ (((long) b.f638) * f2192)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
