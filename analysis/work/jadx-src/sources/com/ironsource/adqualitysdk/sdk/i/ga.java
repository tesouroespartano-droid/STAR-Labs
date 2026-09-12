package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes2.dex */
public final class ga extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2157 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2158 = 77;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2159 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i;
        int packedPositionChild;
        int packedPositionGroup;
        int i2 = 2 % 2;
        int i3 = f2159 + 97;
        f2157 = i3 % 128;
        if (i3 % 2 != 0) {
            i = 117 - (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1));
            packedPositionChild = ExpandableListView.getPackedPositionChild(1L) * 29049;
            packedPositionGroup = 17 >>> ExpandableListView.getPackedPositionGroup(0L);
        } else {
            i = 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            packedPositionChild = 177 - ExpandableListView.getPackedPositionChild(0L);
            packedPositionGroup = 51 - ExpandableListView.getPackedPositionGroup(0L);
        }
        return m2177("\f\uffff￼\uffc9\u0000\ufffe\r\u0010\n\u000e\t\n\r\u0004\uffc9\b\n\ufffe\u0014\u000f\u0004\u0007￼\u0010￬\uffffￜ\u0000\ufffe\r\u0010\n￮\t\n\r￤\uffc9\u0006\uffff\u000e\uffc9\u0006\uffff\u000e\u0014\u000f\u0004\u0007￼\u0010", i, packedPositionChild, true, packedPositionGroup).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2159 + 21;
        f2157 = i2 % 128;
        if (i2 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        be beVar = new be(mo2168());
        int i2 = f2157 + 105;
        f2159 = i2 % 128;
        if (i2 % 2 != 0) {
            return beVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2159 + 31;
        f2157 = i2 % 128;
        return (i2 % 2 != 0 ? m2177("\ufff6\ufff9\ufffa\u0007\ufff6�\b\u000e\t\ufffe\u0001\ufff6\n\u0006\ufff9", -MotionEvent.axisFromString(""), 1744 / (ViewConfiguration.getMaximumDrawingCacheSize() / 114), false, 68 / Color.green(1)) : m2177("\ufff6\ufff9\ufffa\u0007\ufff6�\b\u000e\t\ufffe\u0001\ufff6\n\u0006\ufff9", -MotionEvent.axisFromString(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 184, true, 15 - Color.green(0))).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2177(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2158);
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
