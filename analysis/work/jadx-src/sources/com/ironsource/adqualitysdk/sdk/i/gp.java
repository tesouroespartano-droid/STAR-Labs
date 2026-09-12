package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import com.my.target.common.MyTargetManager;

/* JADX INFO: loaded from: classes2.dex */
public final class gp extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2229 = {21709, 2437, 61003, 17228, 8659, 34435, 31512, 55302, 48879, 5048, 61537, 21799, 3050, 59636, 19829, 8765, 32899, 25927, 55817, 47308, 7632, 62071, 22287, 13798, 60079, 20344, 11297, 33511, 26538, 50263, 47415, 8188, 64591, 20749, 14275, 38032, 'm', 23869, 47868, 6061, 30050, 53811, 12285, 36008};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2230 = 3867197915553092L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2231 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2232 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2232 + 121;
        f2231 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2196(ViewConfiguration.getJumpTapTimeout() >> 16, KeyEvent.normalizeMetaState(0) + 36, (char) (TextUtils.getTrimmedLength("") + 21678)).intern();
        int i4 = f2232 + InterfaceC0280i1.d.b.g;
        f2231 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2231 + 123;
        f2232 = i2 % 128;
        if (i2 % 2 != 0) {
            return MyTargetManager.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        ca caVar = new ca(mo2168());
        int i2 = f2231 + 9;
        f2232 = i2 % 128;
        if (i2 % 2 != 0) {
            return caVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2232 + 59;
        f2231 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2196(36 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (char) TextUtils.getOffsetAfter("", 0)).intern();
        int i4 = f2232 + 51;
        f2231 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2196(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2229[b.f638 + i]) ^ (((long) b.f638) * f2230)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
