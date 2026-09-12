package com.unity3d.player;

import com.unity3d.player.a.AbstractC0719t;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0751n implements InvocationHandler {
    public final RunnableC0757q a;
    public final UnityPlayer b;
    public final long c;
    public final /* synthetic */ long d;

    public C0751n(long j, UnityPlayer unityPlayer) {
        this.d = j;
        long j2 = ReflectionHelper.b;
        this.a = new RunnableC0757q(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C0755p c0755p) {
        try {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC0719t.Log(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c0755p.a);
                    c0755p.a = 0L;
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            Object objInvokeWithArguments = ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
            long j = c0755p.a;
            if (j != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
            }
            return objInvokeWithArguments;
        } catch (Throwable th) {
            long j2 = c0755p.a;
            if (j2 != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j2);
            }
            throw th;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC0719t.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            Object objNativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(objNativeProxyInvoke instanceof C0755p)) {
                return objNativeProxyInvoke;
            }
            C0755p c0755p = (C0755p) objNativeProxyInvoke;
            if (c0755p.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c0755p);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c0755p.a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }

    public void finalize() throws Throwable {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }
}
