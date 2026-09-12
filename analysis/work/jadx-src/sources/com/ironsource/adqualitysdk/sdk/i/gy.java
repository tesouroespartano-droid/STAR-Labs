package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class gy extends gk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2279 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2280;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2281 = {Typography.greater, 'Z', 'K', 'k', 'u', 'x', 128, 'p', 'f', 'u', '~', 'y', 'p', 'n', 'v', 'u', 's', 'x', 'W', '[', '{', 'u', 'x', 128, '`', 'U', 'S', 'Z', 'v', 'u', '~', 'y', 'p', 'n', Typography.less, 'v', 'n', 'k', 'q', 't', 'k', 'b'};

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2170() {
        int i = 2 % 2;
        int i2 = f2280 + 105;
        f2279 = i2 % 128;
        return (i2 % 2 == 0 ? m2208(new int[]{0, 34, 10, 15}, true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000") : m2208(new int[]{0, 34, 10, 15}, false, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2169() {
        int i = 2 % 2;
        int i2 = f2279;
        int i3 = i2 + 117;
        f2280 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        f2280 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return UnityServices.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﾒ */
    public final bg mo2171() {
        int i = 2 % 2;
        cf cfVar = new cf(mo2168());
        int i2 = f2279 + 97;
        f2280 = i2 % 128;
        int i3 = i2 % 2;
        return cfVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2168() {
        int i = 2 % 2;
        int i2 = f2280 + 23;
        f2279 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m2208(new int[]{34, 8, 0, 5}, true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern();
        int i4 = f2279 + 77;
        f2280 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public static class e extends gk {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2282 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2283 = 196;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2284;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        
            return m2210("ￌ\u000b\r\u0001\u0017\u0012\u0007\u0014\u0007\u0012\u0001\uffdf\u0012\u0007\f\ufff3\u0002\uffdfￌ\u0012\u0007\f\u0013\u0002\uffffￌ\u0011\u0002\uffffￌ\u0011\u0003\u0001\u0007\u0014\u0010\u0003\u0011ￌ\u0002\uffd1\u0017\u0012\u0007\f\u0013", android.view.Gravity.getAbsoluteGravity(0, 0) + 4, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 294, true, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 47).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (m2209() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        
            if (m2209() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            r1 = com.ironsource.adqualitysdk.sdk.i.gy.e.f2282 + com.ironsource.InterfaceC0280i1.d.b.b;
            com.ironsource.adqualitysdk.sdk.i.gy.e.f2284 = r1 % 128;
            r1 = r1 % 2;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String mo2170() {
            int i = 2 % 2;
            int i2 = f2284 + 71;
            f2282 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2169() {
            int i = 2 % 2;
            int i2 = f2284 + 33;
            f2282 = i2 % 128;
            if (i2 % 2 == 0) {
                m2209();
                throw null;
            }
            if (!m2209()) {
                int i3 = f2282 + 35;
                f2284 = i3 % 128;
                if (i3 % 2 == 0) {
                    return AdUnitActivity.class;
                }
                throw null;
            }
            int i4 = f2282 + 17;
            f2284 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﾒ */
        public final bg mo2171() {
            int i = 2 % 2;
            cf.b bVar = new cf.b(mo2168());
            int i2 = f2284 + 65;
            f2282 = i2 % 128;
            int i3 = i2 % 2;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2168() {
            int i = 2 % 2;
            int i2 = f2282 + 27;
            f2284 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m2210("\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007", Color.argb(0, 0, 0, 0) + 7, ExpandableListView.getPackedPositionType(0L) + 306, false, MotionEvent.axisFromString("") + 9).intern();
            int i4 = f2282 + 105;
            f2284 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static boolean m2209() {
            int i = 2 % 2;
            boolean zM705 = ba.m705(new gy());
            int i2 = f2282 + InterfaceC0280i1.d.b.g;
            f2284 = i2 % 128;
            if (i2 % 2 == 0) {
                return zM705;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2210(String str, int i, int i2, boolean z, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1919) {
                char[] cArr2 = new char[i3];
                com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i3) {
                    com.ironsource.adqualitysdk.sdk.i.e.f1920 = cArr[com.ironsource.adqualitysdk.sdk.i.e.f1921];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.e.f1921] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f1920 + i2);
                    int i4 = com.ironsource.adqualitysdk.sdk.i.e.f1921;
                    cArr2[i4] = (char) (cArr2[i4] - f2283);
                    com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                }
                if (i > 0) {
                    com.ironsource.adqualitysdk.sdk.i.e.f1918 = i;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - com.ironsource.adqualitysdk.sdk.i.e.f1918, com.ironsource.adqualitysdk.sdk.i.e.f1918);
                    System.arraycopy(cArr3, com.ironsource.adqualitysdk.sdk.i.e.f1918, cArr2, 0, i3 - com.ironsource.adqualitysdk.sdk.i.e.f1918);
                }
                if (z) {
                    char[] cArr4 = new char[i3];
                    com.ironsource.adqualitysdk.sdk.i.e.f1921 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.e.f1921 < i3) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.e.f1921] = cArr2[(i3 - com.ironsource.adqualitysdk.sdk.i.e.f1921) - 1];
                        com.ironsource.adqualitysdk.sdk.i.e.f1921++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2208(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (j.f2691) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f2281, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                    }
                    c = cArr2[j.f2692];
                    j.f2692++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                    j.f2692++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                    j.f2692++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
