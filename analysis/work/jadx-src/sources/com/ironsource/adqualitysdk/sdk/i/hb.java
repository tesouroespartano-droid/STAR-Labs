package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: loaded from: classes2.dex */
public final class hb extends gk {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2292 = 5985282271194303046L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2293 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2294 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2294 + 69;
        f2293 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2213("쨥ၒ绝䔙ꏓ蹀퓊㍿᧻摭䊦ꥢ\uf7ed툛㢕ܟ涓䡃隁ﴃ\udba9♿ಷ欤놣鰨練샑⼜痤偃뻁蕏\ue3f1칵ᓖ獮姲", (ViewConfiguration.getMinimumFlingVelocity() >> 56) * 55931) : m2213("쨥ၒ绝䔙ꏓ蹀퓊㍿᧻摭䊦ꥢ\uf7ed툛㢕ܟ涓䡃隁ﴃ\udba9♿ಷ欤놣鰨練샑⼜痤偃뻁蕏\ue3f1칵ᓖ獮姲", 55931 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern();
        int i3 = f2293 + 67;
        f2294 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2293;
        int i3 = i2 + 55;
        f2294 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        f2294 = i5 % 128;
        if (i5 % 2 != 0) {
            return MobileAds.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        cj cjVar = new cj(mo2168());
        int i2 = f2294 + 75;
        f2293 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return cjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2293 + InterfaceC0280i1.d.b.d;
        f2294 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2213("쨿㢀⽦ᷗ¿睽", ExpandableListView.getPackedPositionChild(0L) + 62120).intern();
        int i4 = f2294 + 99;
        f2293 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2213(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2292);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
