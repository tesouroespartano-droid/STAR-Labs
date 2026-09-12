package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* JADX INFO: loaded from: classes2.dex */
public final class gs extends gk {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2240 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2241 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2242 = -878162174609365809L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2241 + 47;
        f2240 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2199("撻㖾웯鞩₦\uf19c芀厌\uec96붇们\u1ff1ꣴ秹ૈ\udb88瓌ל훚杤〳섩鈷⌂ﰎ贓帑\uef17롹䤪ᩜꭡ䑊ᕛꙎ睗V튍採㲭", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20743).intern();
        int i4 = f2240 + 19;
        f2241 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2240;
        int i3 = i2 + InterfaceC0280i1.d.b.b;
        f2241 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        f2241 = i5 % 128;
        if (i5 % 2 == 0) {
            return AwesomeAds.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        cd cdVar = new cd(mo2168());
        int i2 = f2241 + 31;
        f2240 = i2 % 128;
        int i3 = i2 % 2;
        return cdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2241 + 77;
        f2240 = i2 % 128;
        String strIntern = m2199("撼ٯꄕ䳕\uefe9誇㑆흹爔ᷝ룰宍", i2 % 2 == 0 ? TextUtils.indexOf((CharSequence) "", 'c') + 10755 : TextUtils.indexOf((CharSequence) "", '0') + 25302).intern();
        int i3 = f2240 + 23;
        f2241 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2199(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2242);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
