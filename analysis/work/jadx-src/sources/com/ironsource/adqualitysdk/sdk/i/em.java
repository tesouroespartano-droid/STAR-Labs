package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class em extends el {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1985 = -5179668266684825553L;

    public em(ed edVar, ed edVar2, dn dnVar) {
        super(edVar, edVar2, dnVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo2133(String str, String str2) {
        int i = 2 % 2;
        throw new RuntimeException(new StringBuilder().append(m2135("䁬놩ꎏ间蟜律\ueb65\udd1d콸셝㍙⒣ᚉࣱ窭", 61927 - Color.alpha(0)).intern()).append(str).append(m2135("䀏\uecf3᤻䙼\uf2fb", 44221 - TextUtils.getOffsetBefore("", 0)).intern()).append(str2).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo2134(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new RuntimeException(new StringBuilder().append(m2135("䁬놩ꎏ间蟜律\ueb65\udd1d콸셝㍙⒣ᚉࣱ窭", 61926 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()).append(obj).append(m2135("䀏\uecf3᤻䙼\uf2fb", Color.alpha(0) + 44221).intern()).append(obj2).toString());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2135(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f1985);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
