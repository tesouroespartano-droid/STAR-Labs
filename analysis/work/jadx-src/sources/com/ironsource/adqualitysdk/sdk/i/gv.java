package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes2.dex */
public final class gv extends gk {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2255 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2256 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2257 = -329350081;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2258 = -156524065;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2259 = 99;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2260;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2261 = {-116, -32, 126, -42, -83, -124, -64, -106, 2, 126, -106, -68, -118, -55, 126, -104, -70, -110, -76, -108, -69, -102, -62, 5, 77, -72, -112, 106, 76, 116, 78, 110, 77, 108, 68, 0, 0};

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2256 + 19;
        f2255 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2203((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 329350080, (byte) ((-97) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ExpandableListView.getPackedPositionChild(0L) - 70, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 156524175, (short) (KeyEvent.normalizeMetaState(0) - 40)).intern();
        int i4 = f2255 + 5;
        f2256 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2255 + 107;
        f2256 = i2 % 128;
        if (i2 % 2 == 0) {
            return HyBid.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        bz bzVar = new bz(mo2168());
        int i2 = f2255 + 21;
        f2256 = i2 % 128;
        int i3 = i2 % 2;
        return bzVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2255 + 37;
        f2256 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2203(329350108 - Color.green(0), (byte) (Process.getGidForName("") + 100), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 90, ImageFormat.getBitsPerPixel(0) + 156524178, (short) (TextUtils.indexOf("", "", 0) + 34)).intern();
        int i4 = f2256 + 57;
        f2255 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2203(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2259;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2261;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2257 + i] + i4);
                } else {
                    i5 = (short) (f2260[f2257 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2257 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2258);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2261;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2260;
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
