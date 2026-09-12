package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class bf extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f792 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f793 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f794 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f795 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f796 = 193;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f797 = {262, 271, 258, 259, 269, 261};

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final String mo789() {
        int i = 2 % 2;
        int i2 = f792 + 55;
        f795 = i2 % 128;
        return m805(null, i2 % 2 != 0 ? 82 << (ViewConfiguration.getDoubleTapTimeout() * InterfaceC0280i1.d.b.d) : (ViewConfiguration.getDoubleTapTimeout() >> 16) + WorkQueueKt.MASK, null, "\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    final Class mo788(String str) {
        int i = 2 % 2;
        int i2 = f795 + 61;
        int i3 = i2 % 128;
        f792 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        f795 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    final Map<String, bg.c> mo790() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f795 + 15;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo802() {
        int i = 2 % 2;
        int i2 = f792;
        int i3 = i2 + 89;
        f795 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        f795 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m805(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3007) {
            char[] cArr2 = f797;
            int i2 = f796;
            if (f793) {
                int length = bArr.length;
                m.f3005 = length;
                char[] cArr3 = new char[length];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr3[m.f3006] = (char) (cArr2[bArr[(m.f3005 - 1) - m.f3006] + i] - i2);
                    m.f3006++;
                }
                return new String(cArr3);
            }
            if (f794) {
                int length2 = cArr.length;
                m.f3005 = length2;
                char[] cArr4 = new char[length2];
                m.f3006 = 0;
                while (m.f3006 < m.f3005) {
                    cArr4[m.f3006] = (char) (cArr2[cArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                    m.f3006++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3005 = length3;
            char[] cArr5 = new char[length3];
            m.f3006 = 0;
            while (m.f3006 < m.f3005) {
                cArr5[m.f3006] = (char) (cArr2[iArr[(m.f3005 - 1) - m.f3006] - i] - i2);
                m.f3006++;
            }
            return new String(cArr5);
        }
    }
}
