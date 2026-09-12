package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fj extends fr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2065 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2066 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2067 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2068 = 1285824210;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2069 = {-72, -113, -70, 0, 0, 0, -73, -73};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2070 = 1652849192;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2071 = 74;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr[] f2072;

    public fj(List<fr> list) {
        fr[] frVarArr = new fr[list.size()];
        this.f2072 = frVarArr;
        list.toArray(frVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVar = new dr(null);
        dq dqVar2 = new dq(dqVar);
        fr[] frVarArr = this.f2072;
        int length = frVarArr.length;
        int i2 = f2065 + 93;
        f2066 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            drVar = frVarArr[i4].mo2153(dqVar2, coVar);
            if (drVar.m2021() || drVar.m2022()) {
                break;
            }
            int i5 = f2066 + 21;
            f2065 = i5 % 128;
            int i6 = i5 % 2;
            if (drVar.m2016()) {
                break;
            }
            i4++;
            int i7 = f2066 + 83;
            f2065 = i7 % 128;
            int i8 = i7 % 2;
        }
        return drVar;
    }

    public final String toString() {
        int i = 2;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m2152(KeyEvent.normalizeMetaState(0) - 1652849192, (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-75) - (Process.myPid() >> 22), Color.green(0) - 1285824087, (short) Color.blue(0)).intern());
        fr[] frVarArr = this.f2072;
        int length = frVarArr.length;
        int i3 = f2065 + 43;
        f2066 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 3;
        }
        int i5 = 0;
        while (i5 < length) {
            int i6 = f2066 + 5;
            f2065 = i6 % 128;
            int i7 = i6 % i;
            fr frVar = frVarArr[i5];
            sb.append(m2152((-1652849191) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) View.getDefaultSize(0, 0), (-75) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) - 1285824178, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
            sb.append(frVar.toString());
            sb.append(m2152((-1652849185) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - '{', (-1285824199) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
            i5++;
            i = 2;
        }
        sb.append(m2152((-1652849185) - KeyEvent.keyCodeFromString(""), (byte) TextUtils.indexOf("", "", 0, 0), (-75) - Drawable.resolveOpacity(0, 0), (-1285824086) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2066 + 9;
            f2065 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fj fjVar = (fj) obj;
            fr[] frVarArr = this.f2072;
            if (frVarArr != null) {
                int i4 = f2065 + 115;
                f2066 = i4 % 128;
                int i5 = i4 % 2;
                boolean zEquals = frVarArr.equals(fjVar.f2072);
                int i6 = f2065 + 79;
                f2066 = i6 % 128;
                int i7 = i6 % 2;
                return zEquals;
            }
            if (fjVar.f2072 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        fr[] frVarArr = this.f2072;
        if (frVarArr != null) {
            int i2 = f2066 + 39;
            f2065 = i2 % 128;
            int i3 = i2 % 2;
            return frVarArr.hashCode();
        }
        int i4 = f2066 + 53;
        f2065 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2152(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2071;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2069;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2070 + i] + i4);
                } else {
                    i5 = (short) (f2067[f2070 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2070 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2068);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2069;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2067;
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
