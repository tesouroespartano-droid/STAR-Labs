package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bd extends bg {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f784 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f785 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f786 = 160;

    public bd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f785 + InterfaceC0280i1.d.b.b;
        f784 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m801("\ufffe\uffff\b\ufffb￼\u0006\uffff", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 230, false, 7 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        int i4 = f785 + 47;
        f784 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f785;
        int i3 = i2 + 13;
        f784 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        f784 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f784 + 21;
        f785 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean mo802() {
        int i = 2 % 2;
        int i2 = f785 + 43;
        f784 = i2 % 128;
        return true ^ (i2 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m801(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f786);
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
