package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.five_corp.ad.FiveAd;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
public final class gi extends gk {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2195 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2196 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2197 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2198 = -687814702;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2199 = {35, -36, -17, Ascii.CR, 35, Ascii.CAN, -54, 3, 51, -66, -2, 3, Ascii.FF, 4, -6, -17, Ascii.CR, 3, 56, -63, -2, Ascii.FF, 3, -4, -17, Ascii.CR, 3, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2200 = 828251858;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2201 = 105;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2195 + 97;
        f2196 = i2 % 128;
        return (i2 % 2 != 0 ? m2187((-828251859) / (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), (byte) (KeyEvent.getMaxKeyCode() % 2), 84 << (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 687814801 % View.combineMeasuredStates(1, 1), (short) Color.blue(1)) : m2187((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 828251859, (byte) (KeyEvent.getMaxKeyCode() >> 16), (-81) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 687814801 - View.combineMeasuredStates(0, 0), (short) Color.blue(0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2195;
        int i3 = i2 + 75;
        f2196 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        f2196 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bn bnVar = new bn(mo2168());
        int i2 = f2195 + 5;
        f2196 = i2 % 128;
        if (i2 % 2 == 0) {
            return bnVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2196 + 123;
        f2195 = i2 % 128;
        return (i2 % 2 == 0 ? m2187((-828251836) / (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), (byte) View.MeasureSpec.makeMeasureSpec(0, 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 102, 687814804 / View.resolveSizeAndState(0, 0, 1), (short) ((-1) / TextUtils.lastIndexOf("", '?', 1))) : m2187((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 828251836, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-98) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 687814804, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)))).intern();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2187(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2201;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2199;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2200 + i] + i4);
                } else {
                    i5 = (short) (f2197[f2200 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2200 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2198);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2199;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2197;
                        int i8 = l.f3000;
                        l.f3000 = i8 - 1;
                        l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                    }
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
