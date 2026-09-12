package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ka {

    public interface e {
        /* JADX INFO: renamed from: ﻐ */
        void mo1821(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m2771(Class<?> cls, Object obj, e eVar) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hg.class}, new d(obj, eVar));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2772(Object obj) {
        return obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof hg);
    }

    static class d implements InvocationHandler {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f2953 = 52776;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2954 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2955 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2956 = 2486;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2957 = 60315;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2958 = 38989;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private e f2959;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Object f2960;

        d(Object obj, e eVar) {
            this.f2960 = obj;
            this.f2959 = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            if (m2777(method)) {
                try {
                    return m2775(method);
                } catch (Throwable th) {
                    jz.m2766(m2776("뛫휘콳峇蕵뷤철牼葋㜔", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10).intern(), new StringBuilder().append(m2776("\ueb71\u06dd㷽姮㦇菰괺谵\uecc6܃᳤궓䩠⺦遣\ue664ࣹ枃㍔\uf22cᅁ价\ue646⬰༳腩䜌ਨﳡ孊", 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()).append(method.getName()).toString(), th, true);
                    return null;
                }
            }
            try {
                this.f2959.mo1821(obj, method, objArr);
                i = f2954 + 67;
            } catch (Throwable th2) {
                String strIntern = m2776("뛫휘콳峇蕵뷤철牼葋㜔", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10).intern();
                StringBuilder sbAppend = new StringBuilder().append(m2776("\ueb71\u06dd㷽姮㦇菰괺谵\uecc6܃᳤궓궴㟠芃⎮ᒫ滵\ue9cbЊᎱ튓贈ꡔ", (ViewConfiguration.getPressedStateDuration() >> 16) + 23).intern());
                Object obj2 = this.f2960;
                jz.m2766(strIntern, sbAppend.append(obj2 != null ? obj2.toString() : m2776("ྀ갔\ud910艰", 4 - Color.alpha(0)).intern()).append(m2776("\ue646⬰༳腩䜌ਨᣞ㚚", Process.getGidForName("") + 9).intern()).append(method.getName()).toString(), th2, true);
                i = f2954 + 81;
            }
            f2955 = i % 128;
            int i3 = i % 2;
            Object obj3 = this.f2960;
            if (obj3 != null) {
                return method.invoke(obj3, objArr);
            }
            if (Object.class.equals(method.getDeclaringClass())) {
                return method.invoke(this, m2773(objArr));
            }
            return null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static Object[] m2773(Object[] objArr) {
            int i = 2 % 2;
            int i2 = f2954 + 77;
            f2955 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = objArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        int i5 = f2954 + 7;
                        f2955 = i5 % 128;
                        if (i5 % 2 == 0) {
                            Proxy.isProxyClass(objArr[i4].getClass());
                            throw null;
                        }
                        Object obj2 = objArr[i4];
                        if (Proxy.isProxyClass(obj2.getClass())) {
                            int i6 = f2954 + 45;
                            f2955 = i6 % 128;
                            int i7 = i6 % 2;
                            arrayList.add(Proxy.getInvocationHandler(obj2));
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    jz.m2766(m2776("뛫휘콳峇蕵뷤철牼葋㜔", TextUtils.getTrimmedLength("") + 10).intern(), m2776("\ueb71\u06dd㷽姮㦇菰ជ芫덡爿괺谵歿訥괺谵\uecc6܃ኁჍ철牼䙋빭䩠⺦ꍎ선썲营", 29 - (Process.myTid() >> 22)).intern(), th, true);
                }
            }
            int i8 = f2955 + 17;
            f2954 = i8 % 128;
            if (i8 % 2 == 0) {
                return objArr;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static boolean m2777(Method method) {
            int i = 2 % 2;
            int i2 = f2955 + 39;
            f2954 = i2 % 128;
            int i3 = i2 % 2;
            String name = method.getName();
            if (name.hashCode() != 1622498214 || !name.equals(m2776("ជ芫ᳲඕ줷ᐙ\udd39\uf136売㯴䎎갏\ue856㽎\ud910艰쀓鱂왃촀", 20 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                return false;
            }
            int i4 = f2954 + 33;
            f2955 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Object m2775(Method method) {
            int i = 2 % 2;
            int i2 = f2955 + 105;
            f2954 = i2 % 128;
            int i3 = i2 % 2;
            if (method == null) {
                return null;
            }
            String name = method.getName();
            if (name.hashCode() != 1622498214 || !name.equals(m2776("ជ芫ᳲඕ줷ᐙ\udd39\uf136売㯴䎎갏\ue856㽎\ud910艰쀓鱂왃촀", 20 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                return null;
            }
            int i4 = f2954 + 37;
            f2955 = i4 % 128;
            int i5 = i4 % 2;
            return m2774();
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Object m2774() {
            int i = 2 % 2;
            int i2 = f2954;
            int i3 = i2 + 5;
            f2955 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = this.f2960;
            int i5 = i2 + 67;
            f2955 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return obj;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2776(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2957)) ^ ((c2 >>> 5) + f2953)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2958) ^ ((c3 + i2) ^ ((c3 << 4) + f2956))));
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
}
