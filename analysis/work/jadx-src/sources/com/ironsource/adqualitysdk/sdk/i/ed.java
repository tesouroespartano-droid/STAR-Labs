package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1944 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1945 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1946 = 12557;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1947 = 5966;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1948 = 34689;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1949 = 13613;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dn f1950;

    /* JADX INFO: renamed from: ﾇ */
    public abstract dr mo2084(dq dqVar, co coVar);

    public ed(dn dnVar) {
        this.f1950 = dnVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final dr m2116(dq dqVar, co coVar) {
        dr drVarMo2084;
        int i = 2 % 2;
        ed edVar = this;
        while (true) {
            drVarMo2084 = edVar.mo2084(dqVar, coVar);
            if (drVarMo2084 == null || !(drVarMo2084.m2019() instanceof ed)) {
                break;
            }
            int i2 = f1944 + InterfaceC0280i1.d.b.i;
            f1945 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            edVar = (ed) drVarMo2084.m2019();
        }
        int i3 = f1945 + 35;
        f1944 = i3 % 128;
        int i4 = i3 % 2;
        return drVarMo2084;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static String m2114(Object[] objArr) {
        int bitsPerPixel;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        int i2 = 0;
        boolean z = true;
        while (i2 < length) {
            Object obj = objArr[i2];
            if (!z) {
                sb.append(m2115("⻂龳", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2).intern());
            }
            if (!(obj instanceof String)) {
                sb.append(obj);
                int i3 = f1944 + 59;
                f1945 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = f1944 + 99;
                f1945 = i5 % 128;
                if (i5 % 2 != 0) {
                    sb.append(m2115("붏ຎ", 0 % (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1))).intern());
                    sb.append(obj);
                    bitsPerPixel = ImageFormat.getBitsPerPixel(1);
                } else {
                    sb.append(m2115("붏ຎ", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                    sb.append(obj);
                    bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                }
                sb.append(m2115("붏ຎ", -bitsPerPixel).intern());
            }
            i2++;
            z = false;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return r4.f1950.m1992();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = r2 + 93;
        com.ironsource.adqualitysdk.sdk.i.ed.f1944 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.f1950 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.f1950 != null) goto L9;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2118() {
        int i = 2 % 2;
        int i2 = f1944 + 13;
        int i3 = i2 % 128;
        f1945 = i3;
        if (i2 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2117() {
        int i = 2 % 2;
        int i2 = f1945;
        int i3 = i2 + 37;
        f1944 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f1950 != null) {
            return new StringBuilder().append(m2115("䇾ꚏ\ue3e0ꚹ黋얢ᢨ패趧麟\uf360쓷", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11).intern()).append(this.f1950).toString();
        }
        int i5 = i2 + 7;
        f1944 = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2115(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2952) {
            char[] cArr2 = new char[cArr.length];
            k.f2951 = 0;
            char[] cArr3 = new char[2];
            while (k.f2951 < cArr.length) {
                cArr3[0] = cArr[k.f2951];
                cArr3[1] = cArr[k.f2951 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1947)) ^ ((c2 >>> 5) + f1949)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1946) ^ ((c3 + i2) ^ ((c3 << 4) + f1948))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
