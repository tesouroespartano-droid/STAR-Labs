package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class gc extends gk {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2167 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2168 = 3064242714495647321L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2169;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2167 + 85;
        f2169 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return (i3 != 0 ? m2179("縺ꎗ앶\ue694ࢼ⨑俾煄錾뒞혽ﯖᶰ㼂惾艕ꐬ짆\ueb6a\u0cce⺾偂痋靺뤃\udaa1ﱧ⇰䎠攕蛲ꡃ쨊\uefec", 56736 << (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))) : m2179("縺ꎗ앶\ue694ࢼ⨑俾煄錾뒞혽ﯖᶰ㼂惾艕ꐬ짆\ueb6a\u0cce⺾偂痋靺뤃\udaa1ﱧ⇰䎠攕蛲ꡃ쨊\uefec", (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 56736)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        Class<DTBAdRequest> cls;
        int i = 2 % 2;
        int i2 = f2169;
        int i3 = i2 + 21;
        f2167 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = DTBAdRequest.class;
            int i4 = 72 / 0;
        } else {
            cls = DTBAdRequest.class;
        }
        int i5 = i2 + 25;
        f2167 = i5 % 128;
        if (i5 % 2 != 0) {
            return cls;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bl blVar = new bl(mo2168());
        int i2 = f2169 + 85;
        f2167 = i2 % 128;
        if (i2 % 2 != 0) {
            return blVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2167 + 17;
        f2169 = i2 % 128;
        return m2179("縸䥩ႂ\ud834ꍂ櫦㈖ﶢ쓂", i2 % 2 != 0 ? 6875 << TextUtils.indexOf((CharSequence) "", 'c', 0, 0) : 14172 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2179(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2168);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
