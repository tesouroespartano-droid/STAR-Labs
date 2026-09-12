package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class kc {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2966 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2967;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2968;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<a, Method> f2969;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2970;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static void m2793() {
        f2968 = new char[]{63572, 22989, 47932, 7520, 32475, 53251, 12902, 37805, 62745, 22390, 43167, 2568, 27719, 52668, 12273, 'C', 41410, 17213, 58745, 34507, 10310, ' ', 41408, 17203, 58750, 34456, 10240, 51835, 27575, 3358, 44922, 'E', 41436, 17198, 58725, 34506, 10310, 51827, 27559, 3332, 44906, 20645, 61972, 37967, 13814, 55271, 31059, 6787, 48358, 24153, 65422, 41400, 17195, 58513, 34518, 10296, 51601, 27592, 3450, 'N', 41409, 17276, 58669, '\'', 41358, 17201, 58735, 34508, 10254, 51835, 27558, 3408, 44920, 20643, 61967, 37958, 13746, 55204, 31060, 6799, 48380, 24092, 17466, 58776, 1896, 41341, 49800, 27725, 36386, 12277, 18778, 60200, 5344, 46673, 53266, 29162, 37875, 15626, 24285, 63654, 6672, 48082, 58797, 1910, 41177, 49794};
        f2967 = 3868122666987856302L;
    }

    static {
        m2793();
        f2969 = new ConcurrentHashMap();
        int i = f2966 + 25;
        f2970 = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Class m2807(String str, boolean z) {
        int i = 2 % 2;
        int i2 = f2966 + 121;
        f2970 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Class<?> cls = Class.forName(str);
                int i3 = f2966 + 125;
                f2970 = i3 % 128;
                int i4 = i3 % 2;
                return cls;
            }
            Class.forName(str);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            if (z) {
                cn.m1575(m2797(ViewConfiguration.getFadingEdgeLength() >> 16, 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (63495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new StringBuilder().append(m2797('?' - AndroidCharacter.getMirror('0'), 6 - View.getDefaultSize(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()).append(str).append(m2797(21 - View.MeasureSpec.getMode(0), 10 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern()).toString(), th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m2791(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = 2 % 2;
        int i2 = f2970 + 23;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i4 = f2970 + 49;
        f2966 = i4 % 128;
        int i5 = i4 % 2;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m2802(Class cls, List<Object> list) throws Exception {
        int i = 2 % 2;
        int i2 = f2966 + 51;
        f2970 = i2 % 128;
        int i3 = i2 % 2;
        Object objNewInstance = m2792(cls, list).newInstance(list.toArray());
        int i4 = f2970 + 91;
        f2966 = i4 % 128;
        int i5 = i4 % 2;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constructor m2792(Class cls, List<Object> list) {
        int i = 2 % 2;
        for (Constructor<?> constructor : cls.getConstructors()) {
            int i2 = f2966 + 99;
            f2970 = i2 % 128;
            int i3 = i2 % 2;
            if (constructor.getParameterTypes().length == list.size()) {
                int i4 = f2970 + 99;
                f2966 = i4 % 128;
                if (i4 % 2 == 0) {
                    m2794(constructor, list);
                    throw null;
                }
                if (!(!m2794(constructor, list))) {
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method m2804(Object obj, String str, List<Object> list) {
        Method methodM2796;
        int i = 2 % 2;
        a aVar = new a(obj, str, m2798(list));
        Method method = f2969.get(aVar);
        if (method != null) {
            if (m2805(method.getParameterTypes(), list)) {
                int i2 = f2966 + 9;
                f2970 = i2 % 128;
                if (i2 % 2 == 0) {
                    return method;
                }
                throw null;
            }
            cn.m1575(m2797(ViewConfiguration.getJumpTapTimeout() >> 16, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, (char) (63494 - Color.blue(0))).intern(), new StringBuilder().append(m2797(Gravity.getAbsoluteGravity(0, 0) + 31, 28 - Color.alpha(0), (char) TextUtils.indexOf("", "")).intern()).append(aVar).toString(), null);
        }
        if (obj instanceof Class) {
            int i3 = f2966 + 25;
            f2970 = i3 % 128;
            int i4 = i3 % 2;
            methodM2796 = m2803((Class) obj, str, list, true);
            if (methodM2796 == null) {
                int i5 = f2966 + 83;
                f2970 = i5 % 128;
                int i6 = i5 % 2;
                methodM2796 = m2796(Class.class, str, list);
            }
        } else {
            methodM2796 = m2796(obj, str, list);
        }
        if (methodM2796 == null) {
            return methodM2796;
        }
        int i7 = f2970 + InterfaceC0280i1.d.b.g;
        f2966 = i7 % 128;
        if (i7 % 2 != 0) {
            f2969.put(aVar, methodM2796);
            return methodM2796;
        }
        f2969.put(aVar, methodM2796);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<Class> m2798(List<Object> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            int i2 = f2970 + 35;
            f2966 = i2 % 128;
            if (i2 % 2 != 0) {
                Object next = it.next();
                if (next == null) {
                    arrayList.add(Object.class);
                } else {
                    int i3 = f2970 + 65;
                    f2966 = i3 % 128;
                    if (i3 % 2 == 0) {
                        arrayList.add(next.getClass());
                        throw null;
                    }
                    arrayList.add(next.getClass());
                }
            } else {
                it.next();
                throw null;
            }
        }
        int i4 = f2970 + 7;
        f2966 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Method m2796(Object obj, String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f2966 + 43;
        f2970 = i2 % 128;
        return m2803(obj.getClass(), str, list, i2 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Method m2803(Class cls, String str, List<Object> list, boolean z) {
        int i = 2 % 2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = f2970 + 57;
            f2966 = i3 % 128;
            if (i3 % 2 != 0) {
                Method method = methods[i2];
                if (method.getName().equals(str)) {
                    int i4 = f2966 + 47;
                    f2970 = i4 % 128;
                    int i5 = i4 % 2;
                    if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m2809(method, list)) {
                        int i6 = f2966 + 37;
                        f2970 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return method;
                        }
                        super.hashCode();
                        throw null;
                    }
                }
                i2++;
                int i7 = f2970 + 79;
                f2966 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                methods[i2].getName().equals(str);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2809(Method method, List<Object> list) {
        int i = 2 % 2;
        int i2 = f2966 + 85;
        f2970 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i3 != 0) {
            m2805(parameterTypes, list);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM2805 = m2805(parameterTypes, list);
        int i4 = f2970 + InterfaceC0280i1.d.b.b;
        f2966 = i4 % 128;
        int i5 = i4 % 2;
        return zM2805;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2794(Constructor constructor, List<Object> list) {
        int i = 2 % 2;
        int i2 = f2970 + 75;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i3 == 0) {
            m2805(parameterTypes, list);
            throw null;
        }
        boolean zM2805 = m2805(parameterTypes, list);
        int i4 = f2966 + 17;
        f2970 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return zM2805;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2805(Class[] clsArr, List<Object> list) {
        int i = 2 % 2;
        int i2 = f2970 + 65;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            Object obj = list.get(i4);
            if (obj == null) {
                int i5 = f2970 + 97;
                f2966 = i5 % 128;
                if (i5 % 2 == 0) {
                    Object.class.isAssignableFrom(clsArr[i4]);
                    throw null;
                }
                if (Object.class.isAssignableFrom(clsArr[i4])) {
                    if (obj != null || m2799(clsArr[i4], obj)) {
                    }
                }
            } else {
                if (obj != null) {
                }
            }
            int i6 = f2970 + 21;
            f2966 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        if (r6.isAssignableFrom(java.lang.Boolean.class) != false) goto L114;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m2799(Class cls, Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2966 + 47;
        f2970 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            obj.getClass();
            cls.isAssignableFrom(Byte.TYPE);
            super.hashCode();
            throw null;
        }
        Class<?> cls2 = obj.getClass();
        if (!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
            if (cls.isAssignableFrom(Short.TYPE)) {
                int i5 = f2970 + 61;
                f2966 = i5 % 128;
                if (i5 % 2 == 0) {
                    cls2.isAssignableFrom(Short.class);
                    throw null;
                }
                if (!cls2.isAssignableFrom(Short.class)) {
                    if (cls.isAssignableFrom(Short.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
                        if (!cls.isAssignableFrom(Integer.TYPE)) {
                            if (cls.isAssignableFrom(Integer.TYPE)) {
                                if (cls.isAssignableFrom(Boolean.TYPE)) {
                                    int i6 = f2966 + 35;
                                    f2970 = i6 % 128;
                                    int i7 = i6 % 2;
                                }
                                if (cls == null) {
                                    return false;
                                }
                                i = f2966 + 1;
                                f2970 = i % 128;
                                if (i % 2 == 0) {
                                    if (cls.isAssignableFrom(cls2)) {
                                        return true;
                                    }
                                    return false;
                                }
                                cls.isAssignableFrom(cls2);
                                super.hashCode();
                                throw null;
                            }
                            if (cls.isAssignableFrom(Boolean.TYPE)) {
                                int i8 = f2966 + 35;
                                f2970 = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            if (cls == null) {
                                return false;
                            }
                            i = f2966 + 1;
                            f2970 = i % 128;
                            if (i % 2 == 0) {
                                if (cls.isAssignableFrom(cls2)) {
                                    return true;
                                }
                                return false;
                            }
                            cls.isAssignableFrom(cls2);
                            super.hashCode();
                            throw null;
                        }
                        i2 = f2970 + 27;
                        f2966 = i2 % 128;
                        if (i2 % 2 == 0) {
                            cls2.isAssignableFrom(Integer.class);
                            super.hashCode();
                            throw null;
                        }
                        if (!cls2.isAssignableFrom(Integer.class)) {
                            if ((cls.isAssignableFrom(Integer.TYPE) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(Integer.TYPE) || !cls2.isAssignableFrom(Byte.class)) && ((!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Byte.class)) && ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Byte.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Double.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Byte.class)))))))))))))))))) {
                                if (cls.isAssignableFrom(Boolean.TYPE)) {
                                    int i10 = f2966 + 35;
                                    f2970 = i10 % 128;
                                    int i11 = i10 % 2;
                                }
                                if (cls == null) {
                                    return false;
                                }
                                i = f2966 + 1;
                                f2970 = i % 128;
                                if (i % 2 == 0) {
                                    if (cls.isAssignableFrom(cls2)) {
                                        return true;
                                    }
                                    return false;
                                }
                                cls.isAssignableFrom(cls2);
                                super.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            } else if (cls.isAssignableFrom(Short.TYPE)) {
                if (!cls.isAssignableFrom(Integer.TYPE)) {
                    if (cls.isAssignableFrom(Integer.TYPE)) {
                        if (cls.isAssignableFrom(Boolean.TYPE)) {
                            int i12 = f2966 + 35;
                            f2970 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        if (cls == null) {
                            return false;
                        }
                        i = f2966 + 1;
                        f2970 = i % 128;
                        if (i % 2 == 0) {
                            if (cls.isAssignableFrom(cls2)) {
                                return true;
                            }
                            return false;
                        }
                        cls.isAssignableFrom(cls2);
                        super.hashCode();
                        throw null;
                    }
                    if (cls.isAssignableFrom(Boolean.TYPE)) {
                        int i14 = f2966 + 35;
                        f2970 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    if (cls == null) {
                        return false;
                    }
                    i = f2966 + 1;
                    f2970 = i % 128;
                    if (i % 2 == 0) {
                        if (cls.isAssignableFrom(cls2)) {
                            return true;
                        }
                        return false;
                    }
                    cls.isAssignableFrom(cls2);
                    super.hashCode();
                    throw null;
                }
                i2 = f2970 + 27;
                f2966 = i2 % 128;
                if (i2 % 2 == 0) {
                    cls2.isAssignableFrom(Integer.class);
                    super.hashCode();
                    throw null;
                }
                if (!cls2.isAssignableFrom(Integer.class)) {
                    if (cls.isAssignableFrom(Integer.TYPE)) {
                        if (cls.isAssignableFrom(Boolean.TYPE)) {
                            int i16 = f2966 + 35;
                            f2970 = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        if (cls == null) {
                            return false;
                        }
                        i = f2966 + 1;
                        f2970 = i % 128;
                        if (i % 2 == 0) {
                            if (cls.isAssignableFrom(cls2)) {
                                return true;
                            }
                            return false;
                        }
                        cls.isAssignableFrom(cls2);
                        super.hashCode();
                        throw null;
                    }
                    if (cls.isAssignableFrom(Boolean.TYPE)) {
                        int i18 = f2966 + 35;
                        f2970 = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    if (cls == null) {
                        return false;
                    }
                    i = f2966 + 1;
                    f2970 = i % 128;
                    if (i % 2 == 0) {
                        if (cls.isAssignableFrom(cls2)) {
                            return true;
                        }
                        return false;
                    }
                    cls.isAssignableFrom(cls2);
                    super.hashCode();
                    throw null;
                }
            } else {
                if (!cls.isAssignableFrom(Integer.TYPE)) {
                    if (cls.isAssignableFrom(Integer.TYPE)) {
                        if (cls.isAssignableFrom(Boolean.TYPE)) {
                            int i110 = f2966 + 35;
                            f2970 = i110 % 128;
                            int i111 = i110 % 2;
                        }
                        if (cls == null) {
                            return false;
                        }
                        i = f2966 + 1;
                        f2970 = i % 128;
                        if (i % 2 == 0) {
                            if (cls.isAssignableFrom(cls2)) {
                                return true;
                            }
                            return false;
                        }
                        cls.isAssignableFrom(cls2);
                        super.hashCode();
                        throw null;
                    }
                    if (cls.isAssignableFrom(Boolean.TYPE)) {
                        int i112 = f2966 + 35;
                        f2970 = i112 % 128;
                        int i113 = i112 % 2;
                    }
                    if (cls == null) {
                        return false;
                    }
                    i = f2966 + 1;
                    f2970 = i % 128;
                    if (i % 2 == 0) {
                        if (cls.isAssignableFrom(cls2)) {
                            return true;
                        }
                        return false;
                    }
                    cls.isAssignableFrom(cls2);
                    super.hashCode();
                    throw null;
                }
                i2 = f2970 + 27;
                f2966 = i2 % 128;
                if (i2 % 2 == 0) {
                    cls2.isAssignableFrom(Integer.class);
                    super.hashCode();
                    throw null;
                }
                if (!cls2.isAssignableFrom(Integer.class)) {
                    if (cls.isAssignableFrom(Integer.TYPE)) {
                        if (cls.isAssignableFrom(Boolean.TYPE)) {
                            int i114 = f2966 + 35;
                            f2970 = i114 % 128;
                            int i115 = i114 % 2;
                        }
                        if (cls == null) {
                            return false;
                        }
                        i = f2966 + 1;
                        f2970 = i % 128;
                        if (i % 2 == 0) {
                            if (cls.isAssignableFrom(cls2)) {
                                return true;
                            }
                            return false;
                        }
                        cls.isAssignableFrom(cls2);
                        super.hashCode();
                        throw null;
                    }
                    if (cls.isAssignableFrom(Boolean.TYPE)) {
                        int i116 = f2966 + 35;
                        f2970 = i116 % 128;
                        int i117 = i116 % 2;
                    }
                    if (cls == null) {
                        return false;
                    }
                    i = f2966 + 1;
                    f2970 = i % 128;
                    if (i % 2 == 0) {
                        if (cls.isAssignableFrom(cls2)) {
                            return true;
                        }
                        return false;
                    }
                    cls.isAssignableFrom(cls2);
                    super.hashCode();
                    throw null;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m2808(Object obj, String str, List<Class> list) {
        int i = 2 % 2;
        int i2 = f2970 + 119;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            Class<?>[] clsArrM2806 = m2806(list);
            if (!(obj instanceof Class)) {
                Method method = obj.getClass().getMethod(str, clsArrM2806);
                int i4 = f2966 + 71;
                f2970 = i4 % 128;
                if (i4 % 2 == 0) {
                    return method;
                }
                super.hashCode();
                throw null;
            }
            int i5 = f2966 + 55;
            f2970 = i5 % 128;
            int i6 = i5 % 2;
            try {
                obj = ((Class) obj).getMethod(str, clsArrM2806);
                return obj;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM2806);
            }
        } catch (NoSuchMethodException e) {
            cn.m1575(m2797(TextUtils.lastIndexOf("", '0', 0, 0) + 1, View.resolveSizeAndState(0, 0, 0) + 15, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63494)).intern(), new StringBuilder().append(m2797(Color.green(0) + 59, 4 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).append(str).append(m2797(64 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - MotionEvent.axisFromString(""))).intern()).append(obj).toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m2801(Field[] fieldArr, Field[] fieldArr2) {
        int i = 2 % 2;
        int i2 = f2970 + 35;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        int i4 = f2966 + 63;
        f2970 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return fieldArr3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method[] m2795(Method[] methodArr, Method[] methodArr2) {
        int i = 2 % 2;
        int i2 = f2970 + 113;
        f2966 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            Method[] methodArr3 = new Method[length / length2];
            System.arraycopy(methodArr, 0, methodArr3, 0, length);
            System.arraycopy(methodArr2, 1, methodArr3, length, length2);
            return methodArr3;
        }
        int length3 = methodArr.length;
        int length4 = methodArr2.length;
        Method[] methodArr4 = new Method[length3 + length4];
        System.arraycopy(methodArr, 0, methodArr4, 0, length3);
        System.arraycopy(methodArr2, 0, methodArr4, length3, length4);
        return methodArr4;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m2806(List<Class> list) {
        int i = 2 % 2;
        int i2 = f2970 + 19;
        f2966 = i2 % 128;
        int i3 = i2 % 2;
        Class[] clsArr = new Class[list.size()];
        int i4 = 0;
        while (i4 < list.size()) {
            clsArr[i4] = list.get(i4);
            i4++;
            int i5 = f2966 + 83;
            f2970 = i5 % 128;
            int i6 = i5 % 2;
        }
        return clsArr;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2800(Class cls, List<String> list) {
        int i = 2 % 2;
        int i2 = f2966 + 113;
        f2970 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
            if (cls != null) {
                if (list != null || !(!list.isEmpty())) {
                    return true;
                }
                for (String str : list) {
                    if (!str.equals("") || (cls.getPackage() != null && !cls.getPackage().getName().equals(""))) {
                        if (!str.equals("")) {
                            int i4 = f2970 + 97;
                            f2966 = i4 % 128;
                            int i5 = i4 % 2;
                            if (cls.getName().startsWith(str)) {
                            }
                        }
                    }
                    return true;
                }
                if (!kc.class.getName().startsWith(m2797(82 - (ViewConfiguration.getEdgeSlop() >> 16), 23 - ImageFormat.getBitsPerPixel(0), (char) (17497 - TextUtils.getTrimmedLength(""))).intern())) {
                    int i6 = f2966 + 19;
                    f2970 = i6 % 128;
                    int i7 = i6 % 2;
                    return (kc.class.getPackage() == null && cls.getPackage() == null) || (kc.class.getPackage() != null && kc.class.getPackage().equals(cls.getPackage()));
                }
            }
        } else if (cls != null) {
            if (list != null) {
            }
            return true;
        }
        return false;
    }

    static class a {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2971 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2972 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2975;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2976;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f2977;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2974 = {'M', 18384, 36638, 55159, 7867, 26349, 44666, 62870, 15822, 34100, 52604, 5294, 23560, 42072, 60297, 13301, 31531, 7583, 23048, 37626, 51847, 835, 31512, 46008, 59458, 8246, 39118, 53395, 2374, 16819, 12745, 30320, 48866, 59063, 12116, 22296, 40883, 50297, 3113, 46326, 64662, 9551, 28156, 38377, 55844, 57926, 42495, 28013, 13620, 64716, 33924, 19479, 6133, 57251, 26436, 12043, 63176, 48741, 18022};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2973 = 8027505923198306229L;

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2975 = (Class) obj;
            } else {
                this.f2975 = obj.getClass();
            }
            this.f2976 = str;
            this.f2977 = list;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = f2972 + 9;
            int i3 = i2 % 128;
            f2971 = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 99;
                f2972 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj != null) {
                int i7 = i3 + InterfaceC0280i1.d.b.b;
                f2972 = i7 % 128;
                int i8 = i7 % 2;
                if (getClass() == obj.getClass()) {
                    a aVar = (a) obj;
                    if (this.f2975.equals(aVar.f2975) && this.f2976.equals(aVar.f2976)) {
                        return this.f2977.equals(aVar.f2977);
                    }
                    return false;
                }
            }
            int i9 = f2971 + 35;
            f2972 = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = f2972 + 91;
            f2971 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.f2975.hashCode() * 31) + this.f2976.hashCode()) * 31) + this.f2977.hashCode();
            int i4 = f2972 + 65;
            f2971 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(m2810(ViewConfiguration.getEdgeSlop() >> 16, 17 - TextUtils.indexOf("", "", 0, 0), (char) TextUtils.getTrimmedLength("")).intern());
            sb.append(m2810(17 - (Process.myPid() >> 22), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7666)).intern()).append(this.f2975);
            sb.append(m2810(Color.alpha(0) + 30, Color.alpha(0) + 15, (char) (12773 - TextUtils.indexOf("", "", 0))).intern()).append(this.f2976).append('\'');
            sb.append(m2810(TextUtils.indexOf((CharSequence) "", '0') + 46, (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, (char) (TextUtils.lastIndexOf("", '0') + 57963)).intern()).append(this.f2977);
            sb.append('}');
            String string = sb.toString();
            int i2 = f2971 + 53;
            f2972 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return string;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2810(int i, int i2, char c) {
            String str;
            synchronized (b.f637) {
                char[] cArr = new char[i2];
                b.f638 = 0;
                while (b.f638 < i2) {
                    cArr[b.f638] = (char) ((((long) f2974[b.f638 + i]) ^ (((long) b.f638) * f2973)) ^ ((long) c));
                    b.f638++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2797(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2968[b.f638 + i]) ^ (((long) b.f638) * f2967)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
