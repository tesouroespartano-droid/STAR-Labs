package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes2.dex */
public final class gb extends gk {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2160 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2161 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2162 = 1593199180;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2163 = 1633435312;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2164 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2165 = {4, 5, Ascii.VT, -3, Ascii.VT, -20, 36, -19, 35, -36, 2, -15, -3, 6, Ascii.FS, -27, -1, -3, 41, Ascii.ESC, -61, 7, -15, 69, -61, 7, -15, -6, 5, Ascii.VT, -3, Ascii.VT, -20, 4, Ascii.CR, 3, 51, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, Ascii.FF, -36, 9, 6, -1, -13, 17, -7, -11, 2, Ascii.CR, 3};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2166 = 47;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2160 + 41;
        f2161 = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        String strIntern = (i3 == 0 ? m2178((-1633435311) % (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), (byte) ((-1) >> ((byte) KeyEvent.getModifierMetaStateMask())), 63 >> ((byte) KeyEvent.getModifierMetaStateMask()), KeyEvent.getDeadChar(1, 0) - 1593199081, (short) ExpandableListView.getPackedPositionGroup(0L)) : m2178((-1633435311) - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-49) - ((byte) KeyEvent.getModifierMetaStateMask()), (-1593199081) - KeyEvent.getDeadChar(0, 0), (short) ExpandableListView.getPackedPositionGroup(0L))).intern();
        int i4 = f2161 + 11;
        f2160 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2160;
        int i3 = i2 + 115;
        f2161 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 9;
        f2161 = i4 % 128;
        int i5 = i4 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bh bhVar = new bh(mo2168());
        int i2 = f2160 + 79;
        f2161 = i2 % 128;
        if (i2 % 2 != 0) {
            return bhVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2161 + 119;
        f2160 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2178((-1633435261) - TextUtils.indexOf("", ""), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 49, (-1593199083) - TextUtils.indexOf("", ""), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern();
        int i4 = f2160 + 91;
        f2161 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2178(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2166;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2165;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2163 + i] + i4);
                } else {
                    i5 = (short) (f2164[f2163 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2163 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2162);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2165;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2164;
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
