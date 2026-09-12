package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes2.dex */
public final class ep extends em {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1994 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1995 = 171;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1996 = 1;

    public ep(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ｋ */
    final boolean mo2132(int i) {
        int i2 = 2 % 2;
        int i3 = f1994 + 73;
        int i4 = i3 % 128;
        f1996 = i4;
        int i5 = i3 % 2;
        if (i > 0) {
            return true;
        }
        int i6 = i4 + 15;
        f1994 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2127() {
        int i = 2 % 2;
        int i2 = f1996 + 9;
        f1994 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2139("\u0000", -ExpandableListView.getPackedPositionChild(0L), (Process.myTid() >> 22) + 233, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
        int i4 = f1996 + 17;
        f1994 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2139(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1995);
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
