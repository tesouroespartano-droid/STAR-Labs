package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.AdSettings;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class gg extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2188 = 15;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2189 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2190 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int iKeyCodeFromString;
        int edgeSlop;
        int i;
        int i2 = 2 % 2;
        int i3 = f2190 + 45;
        f2189 = i3 % 128;
        if (i3 % 2 != 0) {
            iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 55;
            edgeSlop = 123 >> (ViewConfiguration.getEdgeSlop() >> InterfaceC0280i1.d.b.j);
            i = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 65;
        } else {
            iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 9;
            edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + InterfaceC0280i1.d.b.i;
            i = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27;
        }
        String strIntern = m2185("\u0004\ufff3\u0005\u0014\u0014\t\u000e\u0007\u0013\u0003\u000f\rￎ\u0006\u0001\u0003\u0005\u0002\u000f\u000f\u000bￎ\u0001\u0004\u0013ￎ￡", iKeyCodeFromString, edgeSlop, false, i).intern();
        int i4 = f2190 + 39;
        f2189 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2190 + 77;
        int i3 = i2 % 128;
        f2189 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        f2190 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return AdSettings.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bq bqVar = new bq(mo2168());
        int i2 = f2189 + 77;
        f2190 = i2 % 128;
        int i3 = i2 % 2;
        return bqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2189 + InterfaceC0280i1.d.b.i;
        f2190 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2185("\u0004\uffff\ufffa￼\ufffe\ufffb\b\b", -ExpandableListView.getPackedPositionChild(0L), ExpandableListView.getPackedPositionChild(0L) + 119, false, ImageFormat.getBitsPerPixel(0) + 9).intern();
        int i4 = f2190 + 67;
        f2189 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2185(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2188);
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
