package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes2.dex */
class b {
    private static final String b = "b";
    private final v.r a;

    b(v.r rVar) {
        this.a = rVar;
    }

    synchronized void a(String str, String str2) throws Exception {
        if (this.a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.a, str2);
    }

    void b(String str) {
        v.r rVar = this.a;
        if (rVar != null) {
            rVar.d(str);
        }
    }

    void a(String str) {
        v.r rVar = this.a;
        if (rVar != null) {
            rVar.c(str);
        }
    }
}
