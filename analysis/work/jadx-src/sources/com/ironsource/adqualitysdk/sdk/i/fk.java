package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public final class fk extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2073 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2076 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2075 = {16248, 17674, 52105, 20501, 54922, 23299, 57754, 26124, 60624};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2074 = 8288234074129136254L;

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        Object obj = null;
        dr drVar = new dr(null);
        drVar.m2017();
        int i2 = f2073 + 21;
        f2076 = i2 % 128;
        if (i2 % 2 != 0) {
            return drVar;
        }
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2073 + 121;
        f2076 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2154(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 9 - Color.red(0), (char) (Drawable.resolveOpacity(0, 0) + 16155)).intern();
        int i4 = f2073 + InterfaceC0280i1.d.b.d;
        f2076 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2154(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2075[b.f638 + i]) ^ (((long) b.f638) * f2074)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
