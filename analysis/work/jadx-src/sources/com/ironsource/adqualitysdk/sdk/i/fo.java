package com.ironsource.adqualitysdk.sdk.i;

import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
public class fo extends fr {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2094 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2095 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2096 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2097 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2098 = -5310792008033782020L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2099;

    public fo(ed edVar) {
        this.f2099 = edVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final ed m2161() {
        int i = 2 % 2;
        int i2 = f2096 + 17;
        f2094 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2099;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public dr mo2153(dq dqVar, co coVar) {
        int i = 2 % 2;
        int i2 = f2094;
        int i3 = i2 + 51;
        f2096 = i3 % 128;
        if (i3 % 2 == 0) {
            ed edVar = this.f2099;
            if (edVar != null) {
                int i4 = i2 + 105;
                f2096 = i4 % 128;
                int i5 = i4 % 2;
                return edVar.m2116(dqVar, coVar);
            }
            return new dr(null);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return m2160("㊂", (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 1506190015, "사욢鹙橝", "뛼甩䛎뙌", (char) (23965 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()))).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r8.f2099 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r8.f2099 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r1 = new java.lang.StringBuilder().append(r8.f2099).append(m2160("㊂", android.text.TextUtils.lastIndexOf("", '0') + 1506190017, "사욢鹙橝", "뛼甩䛎뙌", (char) (23967 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()).toString();
        r2 = com.ironsource.adqualitysdk.sdk.i.fo.f2094 + 1;
        com.ironsource.adqualitysdk.sdk.i.fo.f2096 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i = 2 % 2;
        int i2 = f2096 + 25;
        f2094 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2096 + 17;
            f2094 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null) {
            int i4 = f2096 + 117;
            f2094 = i4 % 128;
            int i5 = i4 % 2;
            if (getClass() == obj.getClass()) {
                ed edVar = this.f2099;
                ed edVar2 = ((fo) obj).f2099;
                if (edVar != null) {
                    return edVar.equals(edVar2);
                }
                return edVar2 == null;
            }
        }
        int i6 = f2096 + 33;
        f2094 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = f2096 + 21;
        int i3 = i2 % 128;
        f2094 = i3;
        int i4 = i2 % 2;
        ed edVar = this.f2099;
        if (edVar == null) {
            return 0;
        }
        int i5 = i3 + 115;
        f2096 = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = edVar.hashCode();
        if (i6 != 0) {
            int i7 = 92 / 0;
        }
        int i8 = f2096 + 71;
        f2094 = i8 % 128;
        if (i8 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2160(String str, int i, String str2, String str3, char c) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (g.f2155) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f2098) ^ ((long) f2097)) ^ ((long) f2095));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
