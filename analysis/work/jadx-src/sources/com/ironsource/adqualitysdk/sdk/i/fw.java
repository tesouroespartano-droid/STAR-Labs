package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class fw extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2135 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2136 = 56;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2137;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2135 + 55;
        f2137 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2173("\u0014\u0004\u0010\u000eￏ\b\u0010\u0010\b\r\u0006ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005ￏ\b\u000e\u0014ￏ\u0002\u0005\u0014ￏ￮\u0010\u0003\n\r\u0006￢\u0005", 0 - View.getDefaultSize(0, 1), 8868 % TextUtils.indexOf("", "", 1, 1), true, TextUtils.indexOf("", "") * 46) : m2173("\u0014\u0004\u0010\u000eￏ\b\u0010\u0010\b\r\u0006ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005ￏ\b\u000e\u0014ￏ\u0002\u0005\u0014ￏ￮\u0010\u0003\n\r\u0006￢\u0005", View.getDefaultSize(0, 0) + 1, 151 - TextUtils.indexOf("", "", 0, 0), false, 36 - TextUtils.indexOf("", ""))).intern();
        int i3 = f2137 + 53;
        f2135 = i3 % 128;
        if (i3 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2137 + InterfaceC0280i1.d.b.b;
        int i3 = i2 % 128;
        f2135 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        f2137 = i5 % 128;
        int i6 = i5 % 2;
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        int i2 = f2135 + 33;
        f2137 = i2 % 128;
        int i3 = i2 % 2;
        if (!m2172()) {
            return new bc(mo2168());
        }
        bc.c cVar = new bc.c(mo2168());
        int i4 = f2137 + 73;
        f2135 = i4 % 128;
        int i5 = i4 % 2;
        return cVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean m2172() {
        int i = 2 % 2;
        try {
            if (!Prode.m203()) {
                Class.forName(m2173("\r\u000e\b\u0012\u0011\u0004\ufff5ￍ\u0012\u0003\u0000ￍ\u0012\f\u0006ￍ\u0003\b\u000e\u0011\u0003\r\u0000ￍ\u0004\u000b\u0006\u000e\u000e\u0006ￍ\f\u000e\u0002\u000e\u0005\r￨", (ViewConfiguration.getTapTimeout() >> 16) + 34, 153 - TextUtils.indexOf("", "", 0), true, 39 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                int i2 = f2135 + 97;
                f2137 = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i3 = f2135 + 37;
            f2137 = i3 % 128;
            return i3 % 2 == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int longPressTimeout;
        int packedPositionGroup;
        int i;
        int i2 = 2 % 2;
        int i3 = f2137 + 99;
        f2135 = i3 % 128;
        if (i3 % 2 == 0) {
            longPressTimeout = 2 % (ViewConfiguration.getLongPressTimeout() - 86);
            packedPositionGroup = 16636 >> ExpandableListView.getPackedPositionGroup(0L);
            i = (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)) + 88;
        } else {
            longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3;
            packedPositionGroup = 159 - ExpandableListView.getPackedPositionGroup(0L);
            i = 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        }
        return m2173("\u0006�\ufffa\ufffb\b", longPressTimeout, packedPositionGroup, true, i).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2173(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2136);
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
