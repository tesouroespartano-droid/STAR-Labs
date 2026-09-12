package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class hw {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2408 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2412;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<ia.e, ht> f2413;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2411 = {'O', 27729, 55308, 17660, 45231, 7307, 35188, 62732, 25078, 52655, 14747, 42563, ' ', 27719, 55327, 17641, 45225, 7391, 35156, 62743, 25079, 52646, 14814, 'f', 27740, 55315, 17655, 45224, 7391, 35156, 62743, 25079, 52646, 14814, 42561, 4613, 32483, 60066, 22237, 50009, 12045, 39862, 58211, 36686, ':', 27667, 55318, 17656, 45240, 7319, 35090, 62728, 25073, 52664, 14733, 'f', 27740, 55315, 17655, 45224, 7391, 35163, 62731, 25016, 47242, 54439, 24749, 64606, 38926, 62524, 16498, 56537, 10442, 34032, 4391, 28011, 63900, 21899, 41463, 15935, 35364, 'E', 27723, 55318, 17660, 45231, 7307, 35159, 62721, 25016, 52616, 14737, 42589, 4616, 32498, 60073, 22153, 50009, 12044, 39928, 2025, 29587, 57437, 19522, 47320, 9385, 37003, 64770, 26945, 54758, 16802, 44441, 6728, 34313, 62181, 24227, 51869, 14092, 53474, 48358, 2227, 37969, 24601, 52344, 23026, 9639, 45387, 7448, 59696, 30456, 49828, 44560, 14882, 34360, 5117, 65441, 19282, 55066, 41757, 12513, 40096, 26718, 62475, ':', 27667};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2409 = 310636758374050867L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2410 = 119;

    public hw() {
        m2327(ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern();
        this.f2413 = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T m2339(Class cls, Object obj, hp hpVar, T t) {
        Field fieldM2241;
        int i = 2 % 2;
        int i2 = f2412 + 95;
        f2408 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                fieldM2241 = hu.m2296().m2298().m2241(cls, hpVar);
                int i3 = 65 / 0;
                if (fieldM2241 != null) {
                    int i4 = f2408 + 93;
                    f2412 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return (T) fieldM2241.get(obj);
                    }
                    int i5 = 54 / 0;
                    return (T) fieldM2241.get(obj);
                }
                int i6 = f2412 + 13;
                f2408 = i6 % 128;
                if (i6 % 2 != 0) {
                    return t;
                }
                throw null;
            }
            fieldM2241 = hu.m2296().m2298().m2241(cls, hpVar);
        } catch (Throwable unused) {
            n.m2887(m2327(TextUtils.getCapsMode("", 0, 0), 12 - View.combineMeasuredStates(0, 0), (char) View.resolveSize(0, 0)).intern(), new StringBuilder().append(m2340("\u000f\n\u0015\u0015\u0006\b\uffc1\u0013\u0010\u0013\u0013￦\uffc1\b", View.MeasureSpec.makeMeasureSpec(0, 0) + 12, View.MeasureSpec.getSize(0) + 214, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14).intern()).append(hpVar.m2257()).append(m2327(12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()).append(cls).append(m2340("ￂ\u0015\u0015\u0003\u000e\u0005", (KeyEvent.getMaxKeyCode() >> 16) + 1, 213 - TextUtils.getTrimmedLength(""), true, 6 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<Object> m2328(Class cls, Object obj, hp hpVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m2296().m2298().m2240(cls, hpVar).iterator();
            int i2 = f2408 + 77;
            f2412 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 2;
            }
            while (it.hasNext()) {
                int i4 = f2412 + 21;
                f2408 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(it.next().get(obj));
                    throw null;
                }
                arrayList.add(it.next().get(obj));
                int i5 = f2412 + InterfaceC0280i1.d.b.i;
                f2408 = i5 % 128;
                int i6 = i5 % 2;
            }
            return arrayList;
        } catch (Throwable unused) {
            n.m2887(m2327(((byte) KeyEvent.getModifierMetaStateMask()) + 1, 12 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern(), new StringBuilder().append(m2340("\u000f\n\u0015\u0015\u0006\b\uffc1\u0013\u0010\u0013\u0013￦\uffc1\b", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, TextUtils.getOffsetAfter("", 0) + 214, true, 14 - View.resolveSizeAndState(0, 0, 0)).intern()).append(hpVar.m2257()).append(m2327(11 - ((byte) KeyEvent.getModifierMetaStateMask()), 11 - Color.red(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()).append(cls).append(m2340("ￂ\u0015\u0015\u0003\u000e\u0005", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 213, true, 6 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()).toString());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hr<T> m2348(Object obj, hx hxVar, hn hnVar, List<String> list, int i) {
        int i2 = 2 % 2;
        hr<T> hrVarM2347 = m2347(obj, new ia.b().m2396(true).m2399(hxVar, hnVar, list, i));
        int i3 = f2412 + 91;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        return hrVarM2347;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> hr<T> m2347(Object obj, ia iaVar) {
        int i = 2 % 2;
        int i2 = f2412 + 43;
        f2408 = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ia.e eVarM2376 = iaVar.m2376(obj.getClass());
        ht htVar = this.f2413.get(eVarM2376);
        if (htVar != null) {
            hr<T> hrVarM2324 = m2324(obj, htVar);
            if (hrVarM2324 != null && m2331(iaVar.m2384(), hrVarM2324)) {
                m2330(hrVarM2324, obj, new StringBuilder().append(m2327((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (char) Gravity.getAbsoluteGravity(0, 0)).intern()).append(System.currentTimeMillis() - jCurrentTimeMillis).append(m2327((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, (char) (ImageFormat.getBitsPerPixel(0) + 58127)).intern()).toString());
                return hrVarM2324;
            }
            n.m2887(m2327(Color.alpha(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new StringBuilder().append(obj).append(m2327(View.MeasureSpec.makeMeasureSpec(0, 0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 11, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()).toString());
            this.f2413.remove(eVarM2376);
        }
        hy<T> hyVar = new hy<>(iaVar);
        Object obj2 = null;
        hr<T> hrVarM2337 = m2337(obj, hyVar, 0, (hr) null);
        if (hrVarM2337 != null) {
            m2330(hrVarM2337, obj, new StringBuilder().append(m2327(TextUtils.getCapsMode("", 0, 0) + 55, Color.rgb(0, 0, 0) + 16777225, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()).append(System.currentTimeMillis() - jCurrentTimeMillis).append(m2327(MotionEvent.axisFromString("") + 65, (ViewConfiguration.getScrollBarSize() >> 8) + 4, (char) (47336 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()).append(hyVar.m2353().size()).append(m2340("\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006\u0013ￄ\u0018\t\u0017ￄ", 11 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0') + 212, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern()).toString());
            this.f2413.put(eVarM2376, hyVar.m2357());
            int i4 = f2412 + 7;
            f2408 = i4 % 128;
            if (i4 % 2 != 0) {
                return hrVarM2337;
            }
            super.hashCode();
            throw null;
        }
        m2330(null, obj, new StringBuilder().append(m2327(69 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, (char) (39008 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern()).append(System.currentTimeMillis() - jCurrentTimeMillis).append(m2327(64 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') + 5, (char) (47335 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern()).append(hyVar.m2353().size()).append(m2340("\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006\u0013ￄ\u0018\t\u0017ￄ", 11 - Color.argb(0, 0, 0, 0), 211 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, '?' - AndroidCharacter.getMirror('0')).intern()).toString());
        int i5 = f2412 + 95;
        f2408 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<hr> m2350(Object obj, ia iaVar) {
        int i = 2 % 2;
        hy hyVar = new hy(iaVar);
        hyVar.m2355();
        m2337(obj, hyVar, 0, (hr) null);
        ArrayList arrayList = new ArrayList(hyVar.m2351());
        int i2 = f2408 + 25;
        f2412 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private <T> hr<T> m2324(Object obj, ht htVar) {
        int i = 2 % 2;
        int i2 = f2408 + 105;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        try {
            hr<T> hrVarM2333 = m2333(m2326(obj, htVar.m2291().get(0), (hr) null), htVar, 1);
            int i4 = f2408 + 119;
            f2412 = i4 % 128;
            if (i4 % 2 == 0) {
                return hrVarM2333;
            }
            throw null;
        } catch (Exception e) {
            n.m2873(m2327(KeyEvent.getDeadChar(0, 0), View.resolveSizeAndState(0, 0, 0) + 12, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern(), m2340("\n\u000f\b\uffc1\ufff0\u0003\u000b\u0006\u0004\u0015\uffe7\n\u0006\r\u0005\uffc1\u0007\u0013\u0010\u000e\uffc1\u0011\u0002\u0015\t￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015", 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 214, false, KeyEvent.getDeadChar(0, 0) + 35).intern(), (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hr<T> m2333(hr hrVar, ht htVar, int i) {
        int i2 = 2 % 2;
        if (i >= htVar.m2291().size()) {
            int i3 = f2408 + 15;
            f2412 = i3 % 128;
            int i4 = i3 % 2;
            return hrVar;
        }
        int i5 = f2408 + 93;
        f2412 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            List<Field> list = htVar.m2291().get(i);
            Object objMo2274 = hrVar.mo2274();
            List listM2329 = m2329(objMo2274);
            if (listM2329 == null) {
                n.m2887(m2327(ViewConfiguration.getEdgeSlop() >> 16, 12 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), new StringBuilder().append(m2327(80 - ImageFormat.getBitsPerPixel(0), 37 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - MotionEvent.axisFromString(""))).intern()).append(objMo2274.getClass()).toString());
                return null;
            }
            for (Object obj2 : listM2329) {
                try {
                    hr hrVarM2326 = m2326(obj2, list, m2325(objMo2274, obj2, hrVar));
                    if (hrVarM2326 != null) {
                        int i6 = f2412 + 107;
                        f2408 = i6 % 128;
                        int i7 = i6 % 2;
                        hr<T> hrVarM2333 = m2333(hrVarM2326, htVar, i + 1);
                        int i8 = f2412 + 47;
                        f2408 = i8 % 128;
                        int i9 = i8 % 2;
                        return hrVarM2333;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
            int i10 = f2408 + 121;
            f2412 = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        htVar.m2291().get(i);
        m2329(hrVar.mo2274());
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hr<T> m2326(Object obj, List<Field> list, hr hrVar) throws IllegalAccessException {
        Object obj2;
        int i = 2 % 2;
        int i2 = f2408 + 83;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<Field> it = list.iterator();
        while (it.hasNext()) {
            int i4 = f2412 + 29;
            f2408 = i4 % 128;
            if (i4 % 2 == 0) {
                WeakReference.class.isAssignableFrom(it.next().getType());
                Object obj3 = null;
                super.hashCode();
                throw null;
            }
            Field next = it.next();
            if (WeakReference.class.isAssignableFrom(next.getType())) {
                int i5 = f2412 + 17;
                f2408 = i5 % 128;
                if (i5 % 2 == 0) {
                    obj2 = ((WeakReference) next.get(obj)).get();
                    int i6 = 48 / 0;
                } else {
                    obj2 = ((WeakReference) next.get(obj)).get();
                }
            } else {
                obj2 = next.get(obj);
                int i7 = f2408 + 55;
                f2412 = i7 % 128;
                int i8 = i7 % 2;
            }
            hrVar = m2338(next, obj, hrVar);
            obj = obj2;
        }
        return hrVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private <T> hr<T> m2337(Object obj, hy<T> hyVar, int i, hr hrVar) {
        Field[] fieldArrM2343;
        int i2 = 2 % 2;
        int i3 = f2412 + 73;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        if (i != hyVar.m2359().m2380() && obj != null && !hyVar.m2353().contains(obj)) {
            int i5 = f2412 + 7;
            f2408 = i5 % 128;
            int i6 = i5 % 2;
            if (i <= 0 || !(obj instanceof Activity)) {
                hyVar.m2353().add(obj);
                try {
                    if (hyVar.m2359().m2375() != null) {
                        fieldArrM2343 = hyVar.m2359().m2375().mo2245(obj);
                    } else {
                        fieldArrM2343 = m2343(obj.getClass(), hyVar.m2359().m2382(i));
                        int i7 = f2412 + 71;
                        f2408 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    ht htVarM2357 = hyVar.m2357();
                    for (Field field : fieldArrM2343) {
                        field.setAccessible(true);
                        htVarM2357.m2290(field);
                        hr<T> hrVarM2334 = m2334(m2338(field, obj, hrVar), hyVar, i);
                        if (hrVarM2334 != null) {
                            int i9 = f2408 + 79;
                            f2412 = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 14 / 0;
                                if (!hyVar.m2354()) {
                                    return hrVarM2334;
                                }
                            } else if (!hyVar.m2354()) {
                                return hrVarM2334;
                            }
                        }
                        htVarM2357.m2292(field);
                    }
                } catch (Throwable th) {
                    n.m2873(m2327(KeyEvent.getMaxKeyCode() >> 16, 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) KeyEvent.normalizeMetaState(0)).intern(), m2327((ViewConfiguration.getFadingEdgeLength() >> 16) + 118, Color.blue(0) + 25, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53416)).intern(), th);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hr m2334(hr hrVar, hy hyVar, int i) {
        int i2 = 2 % 2;
        Object objMo2274 = hrVar.mo2274();
        hr hrVarM2334 = null;
        if (!hyVar.m2353().contains(objMo2274)) {
            int i3 = f2412 + 19;
            f2408 = i3 % 128;
            if (i3 % 2 == 0) {
                hyVar.m2352().contains(objMo2274);
                throw null;
            }
            if (!hyVar.m2352().contains(objMo2274)) {
                if (hyVar.m2359().m2381(i)) {
                    int i4 = f2412 + 55;
                    f2408 = i4 % 128;
                    int i5 = i4 % 2;
                    if (m2331(hyVar.m2359().m2384(), hrVar)) {
                        int i6 = f2408 + 11;
                        f2412 = i6 % 128;
                        if (i6 % 2 != 0) {
                            hyVar.m2354();
                            super.hashCode();
                            throw null;
                        }
                        if (hyVar.m2354()) {
                            hyVar.m2358(hrVar);
                            hyVar.m2356(objMo2274);
                        }
                        return hrVar;
                    }
                }
                if (objMo2274 instanceof WeakReference) {
                    WeakReference weakReference = (WeakReference) objMo2274;
                    if (weakReference.get() != null && hyVar.m2359().m2377(i)) {
                        int i7 = f2408 + 83;
                        f2412 = i7 % 128;
                        int i8 = i7 % 2;
                        if (m2332(weakReference.get(), hyVar.m2359().m2378())) {
                            int i9 = f2408 + 9;
                            f2412 = i9 % 128;
                            return i9 % 2 != 0 ? m2337(weakReference.get(), hyVar, i / 0, hrVar) : m2337(weakReference.get(), hyVar, i + 1, hrVar);
                        }
                    }
                }
                if (m2332(objMo2274, hyVar.m2359().m2378())) {
                    return m2337(objMo2274, hyVar, i + 1, hrVar);
                }
                if (hyVar.m2359().m2383() && objMo2274 != null) {
                    int i10 = f2408 + 105;
                    f2412 = i10 % 128;
                    if (i10 % 2 != 0) {
                        hyVar.m2353().add(objMo2274);
                        super.hashCode();
                        throw null;
                    }
                    hyVar.m2353().add(objMo2274);
                }
                List listM2336 = m2336(objMo2274, hyVar.m2359(), i);
                ht htVarM2357 = hyVar.m2357();
                if (listM2336 == null) {
                    return null;
                }
                Iterator it = listM2336.iterator();
                while (it.hasNext()) {
                    int i11 = f2412 + 75;
                    f2408 = i11 % 128;
                    int i12 = i11 % 2;
                    hr hrVarM2325 = m2325(objMo2274, it.next(), hrVar);
                    htVarM2357.m2293();
                    hrVarM2334 = m2334(hrVarM2325, hyVar, i);
                    if (hrVarM2334 != null && !hyVar.m2354()) {
                        return hrVarM2334;
                    }
                    htVarM2357.m2294();
                }
                return hrVarM2334;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2349(Object obj, List<String> list, int i) {
        int i2 = 2 % 2;
        hy hyVar = new hy(new ia.b().m2401(true).m2391(true).m2398(true).m2389(-1).m2394(new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.hw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1856(hr hrVar) {
                return hrVar.mo2274() instanceof String;
            }
        }, list, i));
        hyVar.m2355();
        m2337(obj, hyVar, 0, (hr) null);
        ArrayList arrayList = new ArrayList(hyVar.m2352());
        int i3 = f2412 + 69;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2331(hx hxVar, hr hrVar) {
        int i = 2 % 2;
        int i2 = f2408 + 5;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zMo1856 = hxVar.mo1856(hrVar);
            int i4 = f2408 + 123;
            f2412 = i4 % 128;
            if (i4 % 2 == 0) {
                return zMo1856;
            }
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2332(Object obj, List<String> list) {
        int i = 2 % 2;
        int i2 = f2408 + 43;
        int i3 = i2 % 128;
        f2412 = i3;
        int i4 = i2 % 2;
        if (obj == null) {
            int i5 = i3 + 5;
            f2408 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        boolean zM2800 = kc.m2800((Class) obj.getClass(), list);
        int i7 = f2408 + 69;
        f2412 = i7 % 128;
        int i8 = i7 % 2;
        return zM2800;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Field[] m2343(Class cls, int i) {
        int i2 = 2 % 2;
        int i3 = f2412 + InterfaceC0280i1.d.b.b;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i5 = 0; cls != null && i5 != i; i5++) {
            cls = cls.getSuperclass();
            if (cls != null) {
                int i6 = f2408 + 39;
                f2412 = i6 % 128;
                int i7 = i6 % 2;
                declaredFields = kc.m2801(declaredFields, cls.getDeclaredFields());
            }
        }
        int i8 = f2412 + 115;
        f2408 = i8 % 128;
        if (i8 % 2 != 0) {
            return declaredFields;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m2329(Object obj) {
        int i = 2 % 2;
        int i2 = f2408 + 77;
        f2412 = i2 % 128;
        return i2 % 2 != 0 ? m2342(obj, false, false, true) : m2342(obj, true, true, true);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List m2336(Object obj, ia iaVar, int i) {
        int i2 = 2 % 2;
        int i3 = f2412 + 11;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        List listM2342 = m2342(obj, iaVar.m2374(i), iaVar.m2379(i), iaVar.m2385(i));
        int i5 = f2408 + 63;
        f2412 = i5 % 128;
        int i6 = i5 % 2;
        return listM2342;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r4 = new java.util.ArrayList(java.util.Arrays.asList(r3));
        r3 = com.ironsource.adqualitysdk.sdk.i.hw.f2412 + 69;
        com.ironsource.adqualitysdk.sdk.i.hw.f2408 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List m2342(Object obj, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        if (obj == null) {
            return null;
        }
        int i2 = f2412 + 23;
        f2408 = i2 % 128;
        int i3 = i2 % 2;
        if ((obj instanceof Collection) && z) {
            return new ArrayList((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            int i4 = f2412 + 53;
            f2408 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        int i6 = f2412 + 125;
        f2408 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
            if (!z2) {
                return null;
            }
        } else if (!z2) {
            return null;
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        arrayList.addAll(map.keySet());
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hr<T> m2338(Field field, Object obj, hr hrVar) {
        int i = 2 % 2;
        hz hzVar = new hz(field, obj, hrVar);
        int i2 = f2408 + 75;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        return hzVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hr<T> m2325(Object obj, Object obj2, hr hrVar) {
        int i = 2 % 2;
        int i2 = f2412;
        int i3 = i2 + 125;
        f2408 = i3 % 128;
        int i4 = i3 % 2;
        Object obj3 = null;
        if (obj != null) {
            int i5 = i2 + 83;
            f2408 = i5 % 128;
            int i6 = i5 % 2;
            if (obj instanceof Collection) {
                return new hz((Collection) obj, obj2, hrVar);
            }
            if (obj instanceof Map) {
                hz hzVar = new hz((Map) obj, obj2, hrVar);
                int i7 = f2412 + 31;
                f2408 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 65 / 0;
                }
                return hzVar;
            }
            if (obj.getClass().isArray()) {
                hz hzVar2 = new hz(new ArrayList(Arrays.asList(obj)), obj2, hrVar);
                int i9 = f2412 + InterfaceC0280i1.d.b.i;
                f2408 = i9 % 128;
                if (i9 % 2 != 0) {
                    return hzVar2;
                }
                super.hashCode();
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2344(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f2408 + 21;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        String strM2335 = m2335((Object) null, cls, str);
        int i4 = f2408 + 53;
        f2412 = i4 % 128;
        int i5 = i4 % 2;
        return strM2335;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2345(Object obj, String str) {
        String strM2335;
        int i = 2 % 2;
        int i2 = f2408 + 115;
        f2412 = i2 % 128;
        if (i2 % 2 != 0) {
            strM2335 = m2335(obj, obj.getClass(), str);
            int i3 = 57 / 0;
        } else {
            strM2335 = m2335(obj, obj.getClass(), str);
        }
        int i4 = f2408 + 13;
        f2412 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM2335;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2346(Object obj, JSONArray jSONArray) {
        int i = 2 % 2;
        if (jSONArray != null) {
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                String strM2345 = m2345(obj, jSONArray.optString(i2));
                if (strM2345 != null) {
                    return strM2345;
                }
                i2++;
                int i3 = f2412 + 35;
                f2408 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        int i5 = f2412 + 27;
        f2408 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2335(Object obj, Class cls, String str) {
        int i = 2 % 2;
        while (cls != null) {
            int i2 = f2408 + 43;
            f2412 = i2 % 128;
            int i3 = i2 % 2;
            if (cls.equals(Object.class)) {
                return null;
            }
            int i4 = f2412 + 55;
            f2408 = i4 % 128;
            int i5 = i4 % 2;
            Field[] fieldArrM2341 = m2341(cls);
            int length = fieldArrM2341.length;
            int i6 = 0;
            while (i6 < length) {
                Field field = fieldArrM2341[i6];
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                        int i7 = f2408 + 3;
                        f2412 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 34 / 0;
                        }
                        return str2;
                    }
                } catch (Exception unused) {
                }
                i6++;
                int i9 = f2412 + 43;
                f2408 = i9 % 128;
                int i10 = i9 % 2;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field[] m2341(Class cls) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                int i2 = f2408 + 23;
                f2412 = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(field);
                int i4 = f2408 + 5;
                f2412 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.n.m2867(m2327((-1) - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 11, (char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0))).intern(), new java.lang.StringBuilder().append(r10).append(m2327(android.view.View.getDefaultSize(0, 0) + 143, 1 - android.widget.ExpandableListView.getPackedPositionChild(0), (char) android.graphics.Color.blue(0)).intern()).append(r11).toString());
        r9 = com.ironsource.adqualitysdk.sdk.i.hw.f2412 + 125;
        com.ironsource.adqualitysdk.sdk.i.hw.f2408 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ee, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f0, code lost:
    
        r9 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r9 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r9 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.n.m2867(m2327(android.view.ViewConfiguration.getFadingEdgeLength() >> 16, 12 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new java.lang.StringBuilder().append(r10).append(m2327(143 - android.view.View.resolveSize(0, 0), 1 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.MeasureSpec.getSize(0)).intern()).append(r11).append(m2340("%\u0010\u001b$\u0014ￏￛￏ", 6 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777416, false, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 9).intern()).append(r9.mo2274()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m2330(hr hrVar, Object obj, String str) {
        int i = 2 % 2;
        int i2 = f2412 + InterfaceC0280i1.d.b.d;
        f2408 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2327(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2411[b.f638 + i]) ^ (((long) b.f638) * f2409)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2340(String str, int i, int i2, boolean z, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (e.f1919) {
            char[] cArr2 = new char[i3];
            e.f1921 = 0;
            while (e.f1921 < i3) {
                e.f1920 = cArr[e.f1921];
                cArr2[e.f1921] = (char) (e.f1920 + i2);
                int i4 = e.f1921;
                cArr2[i4] = (char) (cArr2[i4] - f2410);
                e.f1921++;
            }
            if (i > 0) {
                e.f1918 = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - e.f1918, e.f1918);
                System.arraycopy(cArr3, e.f1918, cArr2, 0, i3 - e.f1918);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                e.f1921 = 0;
                while (e.f1921 < i3) {
                    cArr4[e.f1921] = cArr2[(i3 - e.f1921) - 1];
                    e.f1921++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
