package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.View;
import com.ironsource.InterfaceC0280i1;
import com.qq.e.comm.managers.GDTAdSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class gz extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2285 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2286 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2287 = 4145818242593828800L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2285 + 29;
        f2286 = i2 % 128;
        String strIntern = m2211("꾣\ue362㘷䦉鲅⾰挠똾즆Ზ꾭\ue362㘱䦇鲛⾢捾똼짍Გ꾶\ue362㙰䧬鲼⾑捓똻짿Ო꾭", i2 % 2 != 0 ? 25653 - View.MeasureSpec.getMode(1) : 19661 - View.MeasureSpec.getMode(0)).intern();
        int i3 = f2285 + 29;
        f2286 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        Class<GDTAdSdk> cls;
        int i = 2 % 2;
        int i2 = f2285;
        int i3 = i2 + InterfaceC0280i1.d.b.b;
        f2286 = i3 % 128;
        if (i3 % 2 != 0) {
            cls = GDTAdSdk.class;
            int i4 = 55 / 0;
        } else {
            cls = GDTAdSdk.class;
        }
        int i5 = i2 + 61;
        f2286 = i5 % 128;
        if (i5 % 2 == 0) {
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
        cc ccVar = new cc(mo2168());
        int i2 = f2285 + 43;
        f2286 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return ccVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2286 + 87;
        f2285 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2211("꾴庒䷀簆歹ᦽࣾ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61751).intern();
        int i4 = f2285 + 13;
        f2286 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2211(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2287);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
