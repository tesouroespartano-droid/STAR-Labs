package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class hf extends ha<View.OnClickListener> implements View.OnClickListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2312 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2313 = {':', '{', 130, '{', '|', 131, 130, 'r', 'p', 'j', 'i', '|', 'x', 'y', 'm', 'l', 128, 133, '~', '{', '{', '}', 'm', 'f', '7', 'G', 'F', '`', '[', 'W', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'I', 'G', 'n', 'X', 'W', 'j', 'f', 'g', 'X', '[', 'r', 'p', 'p', 'I', 'D'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2314 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private e f2315;

    public interface e {
        /* JADX INFO: renamed from: ﻐ */
        void mo1811(hf hfVar, View view);
    }

    public hf(View.OnClickListener onClickListener, e eVar) {
        super(onClickListener);
        this.f2315 = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = f2312 + 63;
        f2314 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2315.mo1811(this, view);
                int i3 = 9 / 0;
            } else {
                this.f2315.mo1811(this, view);
            }
        } catch (Throwable th) {
            jz.m2766(m2217(new int[]{0, 24, 18, 7}, false, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern(), m2217(new int[]{24, 28, 0, 21}, false, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001").intern(), th, false);
        }
        if (mo795() != null) {
            int i4 = f2312 + 3;
            f2314 = i4 % 128;
            int i5 = i4 % 2;
            mo795().onClick(view);
            if (i5 == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2217(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f2313, i, cArr, 0, i2);
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
