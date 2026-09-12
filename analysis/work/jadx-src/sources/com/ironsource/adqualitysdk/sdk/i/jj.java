package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jj {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static jj f2833;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    boolean f2834 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<jg> f2835 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo2649(Application application, Activity activity);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo2650();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo2651();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jj m2645() {
        if (f2833 == null) {
            f2833 = new a((byte) 0);
        }
        return f2833;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2648(jg jgVar) {
        this.f2835.add(jgVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2646(jg jgVar) {
        this.f2835.remove(jgVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    protected final synchronized List<jg> m2647() {
        return new ArrayList(this.f2835);
    }

    static class b extends jj {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2847 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean f2848 = true;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2849 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2850 = {Typography.pound, 165, Typography.paragraph, 171, 184, 187};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2851 = 66;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static boolean f2852 = true;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Context f2853;

        /* synthetic */ b(byte b) {
            this();
        }

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0039 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:23:0x003b  */
        /* JADX WARN: Instruction removed from duplicated block: B:21:0x0039, please report this as an issue */
        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized void mo2649(Application application, Activity activity) {
            int i;
            int i2 = 2 % 2;
            if (application != null) {
                this.f2853 = application.getApplicationContext();
                return;
            }
            if (activity == null) {
                i = f2847 + 125;
                f2849 = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i3 = f2849 + 39;
            f2847 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f2853 = activity.getApplicationContext();
                int i4 = 60 / 0;
            } else {
                this.f2853 = activity.getApplicationContext();
            }
            i = f2847 + 125;
            f2849 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
            throw th;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final Activity mo2651() {
            int i = 2 % 2;
            int i2 = f2849 + 49;
            int i3 = i2 % 128;
            f2847 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            f2849 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo2650() {
            int i = 2 % 2;
            Object obj = null;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2853.getSystemService(m2656(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + WorkQueueKt.MASK, null, "\u0086\u0083\u0084\u0085\u0084\u0083\u0082\u0081").intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i2 = f2849 + 79;
                f2847 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            String packageName = this.f2853.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    int i4 = f2849 + 107;
                    f2847 = i4 % 128;
                    int i5 = i4 % 2;
                    if (runningAppProcessInfo.processName.equals(packageName)) {
                        return true;
                    }
                }
            }
            int i6 = f2847 + 7;
            f2849 = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2656(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2850;
                int i2 = f2851;
                if (f2848) {
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
                if (f2852) {
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

    static class a extends jj implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static int f2836 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2837 = -960179927;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static byte[] f2838 = {-95, -103, -110, -93, -84, -79, -128, -84, -106, -88, -112, -96, -87, -68, -122, -104, -88, -119, -75, -99, -98, -100, -68, 127, -86, -98, -110, -94, -60, -79, -86, -86, -76, -64, -59, -117, -73, -67, -91, -65, -89, -61, -44, -123, -79, 1, 100, -73, -5, 96, -75, -81, -78, -33, 125, 112, 124, -110, -113, 85, -125, -119, 113, -117, 115, -113, -96, 81, 125, -51, 48, -125, -57, 44, -127, 123, 126, -85, -41, -55, -21, -44, -53, 7, -94, -35, -29, -53, -27, -51, -23, -6, -85, -41, 39, -118, -35, 33, -122, -37, -43, -40, 5, 33, 39, Ascii.SI, 41, 17, 45, 62, -28, Ascii.GS, 37, Ascii.EM, 62, -6, 41, 8, 52, 17, 56, -13, 33, 39, Ascii.ETB, 53, 67, -40, 41, 8, 52, 17, Ascii.CAN, 94, -26, 77, -42, 33, 39, Ascii.ETB, Ascii.NAK, 99, -35, Ascii.SUB, 40, 118, 104, 121, -120, 100, -104, 81, 124, -126, 106, -124, 108, -120, -103, 74, 118, -58, 41, 124, -64, 37, 122, 116, 119, -92, 5, -5, 6, 7, 1, 39, -32, Ascii.VT, 17, -7, 19, -5, Ascii.ETB, 40, -39, 5, 85, -72, Ascii.VT, 79, -76, 9, 3, 6, 51, 40, 74, 36, 88, 37, 57, 44, 68, 36, 56, 60, 92, Ascii.ESC, 38, 76, 69, 17, 60, 66, 42, 68, 44, 72, 89, 10, 54, -122, -23, 60, -128, -27, 58, 52, 55, 100, -16, -35, -5, -18, -17, -14, -1, Ascii.DC2, -68, -10, -4, -28, -2, -26, 2, 19, -60, -16, SignedBytes.MAX_POWER_OF_TWO, -93, -10, 58, -97, -12, -18, -15, Ascii.RS, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2839 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2840 = 26;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f2841 = null;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2842 = 576896502;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WeakReference<Activity> f2843;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2844;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2845;

        private a() {
            this.f2844 = new WeakHashMap();
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized void mo2649(Application application, Activity activity) {
            if (this.f2845 == null) {
                this.f2845 = new WeakReference<>(application);
                if (activity != null) {
                    m2655(activity);
                    synchronized (this) {
                        this.f2844.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final Activity mo2651() {
            int i = 2 % 2;
            int i2 = f2839;
            int i3 = i2 + 113;
            f2836 = i3 % 128;
            int i4 = i3 % 2;
            WeakReference<Activity> weakReference = this.f2843;
            if (weakReference != null) {
                int i5 = i2 + 27;
                f2836 = i5 % 128;
                int i6 = i5 % 2;
                return weakReference.get();
            }
            int i7 = i2 + 49;
            f2836 = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private void m2655(final Activity activity) {
            int i = 2 % 2;
            this.f2843 = new WeakReference<>(activity);
            p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.a.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() throws Exception {
                    jx.m2739(activity);
                }
            });
            int i2 = f2836 + 119;
            f2839 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized boolean mo2650() {
            int i = 2 % 2;
            int i2 = f2836 + 37;
            f2839 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f2844.size() <= 0) {
                return false;
            }
            int i4 = f2839 + 117;
            int i5 = i4 % 128;
            f2836 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 5;
            f2839 = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            int i8 = 25 / 0;
            return true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = f2839 + 53;
            f2836 = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 == 0) {
                    m2655(activity);
                    m2647().iterator();
                    throw null;
                }
                m2655(activity);
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    int i3 = f2839 + 39;
                    f2836 = i3 % 128;
                    if (i3 % 2 == 0) {
                        it.next().onActivityResumed(activity);
                        super.hashCode();
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e) {
                jz.m2766(m2654(View.resolveSizeAndState(0, 0, 0) - 576896502, (byte) View.MeasureSpec.getMode(0), 4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 960179999 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 97)).intern(), m2654(Drawable.resolveOpacity(0, 0) - 576896473, (byte) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, 960179997 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (Process.getGidForName("") + 79)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            try {
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    int i2 = f2836 + 61;
                    f2839 = i2 % 128;
                    int i3 = i2 % 2;
                    it.next().onActivityPaused(activity);
                }
                int i4 = f2836 + 23;
                f2839 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                jz.m2766(m2654((-576896502) - KeyEvent.keyCodeFromString(""), (byte) ('0' - AndroidCharacter.getMirror('0')), 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 960179998, (short) (View.getDefaultSize(0, 0) + 97)).intern(), m2654((-576896447) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) TextUtils.indexOf("", ""), (-1) - (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 960179997, (short) ((-125) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jj.class) {
                    if (this.f2843 == null) {
                        m2655(activity);
                        jj.class.notifyAll();
                    }
                }
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e) {
                jz.m2766(m2654((-576896502) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 4, TextUtils.lastIndexOf("", '0') + 960179999, (short) (96 - TextUtils.indexOf((CharSequence) "", '0'))).intern(), m2654((-576896424) - TextUtils.indexOf("", "", 0, 0), (byte) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getFadingEdgeLength() >> 16, TextUtils.indexOf("", "", 0) + 960179996, (short) (TextUtils.indexOf((CharSequence) "", '0') + 41)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2843 == null) {
                    m2655(activity);
                }
                synchronized (this) {
                    this.f2844.put(activity, Boolean.TRUE);
                }
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m2654((-576896399) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, 960180026 - TextUtils.getOffsetAfter("", 0), (short) (View.MeasureSpec.getSize(0) - 28)).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f2844.size() == 1 && !this.f2834) {
                        m2652(activity);
                    }
                }
            } catch (Exception e) {
                jz.m2766(m2654((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 576896502, (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 5, 960179998 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 97)).intern(), m2654((-576896357) - TextUtils.indexOf("", "", 0, 0), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.blue(0), 960179996 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((-119) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2834 = activity.isChangingConfigurations();
                synchronized (this) {
                    if (!this.f2844.containsKey(activity) || activity.getLocalClassName().equals(m2654((ViewConfiguration.getLongPressTimeout() >> 16) - 576896399, (byte) (MotionEvent.axisFromString("") + 1), 16 - TextUtils.lastIndexOf("", '0', 0, 0), AndroidCharacter.getMirror('0') + 12042, (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 28)).intern())) {
                        size = -1;
                    } else {
                        this.f2844.remove(activity);
                        size = this.f2844.size();
                    }
                }
                if (size < 0 || size != 0 || this.f2834) {
                    return;
                }
                m2653(activity);
            } catch (Exception e) {
                jz.m2766(m2654((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 576896502, (byte) (MotionEvent.axisFromString("") + 1), 4 - TextUtils.getCapsMode("", 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 960179998, (short) (97 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern(), m2654(TextUtils.indexOf("", "", 0, 0) - 576896332, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 960179997 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 6)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = f2836 + 121;
            f2839 = i2 % 128;
            int i3 = i2 % 2;
            try {
                Iterator<jg> it = m2647().iterator();
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        int i4 = f2839 + 49;
                        f2836 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return;
                        }
                        super.hashCode();
                        throw null;
                    }
                    int i5 = f2839 + 113;
                    f2836 = i5 % 128;
                    if (i5 % 2 == 0) {
                        it.next().onActivitySaveInstanceState(activity, bundle);
                        throw null;
                    }
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e) {
                jz.m2766(m2654((ViewConfiguration.getTapTimeout() >> 16) - 576896502, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 960179999 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (97 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), m2654(TextUtils.indexOf("", "", 0, 0) - 576896307, (byte) TextUtils.getOffsetAfter("", 0), 9 - ExpandableListView.getPackedPositionChild(0L), 960179996 - Color.blue(0), (short) ((-55) - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Iterator<jg> it;
            int i = 2 % 2;
            int i2 = f2839 + InterfaceC0280i1.d.b.d;
            f2836 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    it = m2647().iterator();
                    int i3 = 65 / 0;
                } else {
                    it = m2647().iterator();
                }
                while (it.hasNext()) {
                    int i4 = f2839 + 77;
                    f2836 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().onActivityDestroyed(activity);
                }
                int i6 = f2836 + 43;
                f2839 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 35 / 0;
                }
            } catch (Exception e) {
                jz.m2766(m2654(TextUtils.lastIndexOf("", '0', 0) - 576896501, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - ExpandableListView.getPackedPositionGroup(0L), 960179998 - KeyEvent.keyCodeFromString(""), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 97)).intern(), m2654(AndroidCharacter.getMirror('0') - 48448, (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2 - Color.green(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 960179996, (short) (TextUtils.indexOf((CharSequence) "", '0') + 16)).intern(), (Throwable) e, false);
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m2653(Activity activity) {
            int i = 2 % 2;
            int i2 = f2836 + 105;
            f2839 = i2 % 128;
            int i3 = i2 % 2;
            Iterator<jg> it = m2647().iterator();
            while (it.hasNext()) {
                it.next().mo393(activity);
            }
            int i4 = f2839 + InterfaceC0280i1.d.b.i;
            f2836 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m2652(Activity activity) {
            int i = 2 % 2;
            int i2 = f2839 + 55;
            f2836 = i2 % 128;
            if (i2 % 2 != 0) {
                Iterator<jg> it = m2647().iterator();
                while (it.hasNext()) {
                    int i3 = f2839 + 69;
                    f2836 = i3 % 128;
                    if (i3 % 2 == 0) {
                        it.next().mo394(activity);
                        int i4 = 87 / 0;
                    } else {
                        it.next().mo394(activity);
                    }
                }
                return;
            }
            m2647().iterator();
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2654(int i, byte b, int i2, int i3, short s) {
            String string;
            synchronized (l.f2999) {
                StringBuilder sb = new StringBuilder();
                int i4 = f2840;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2838;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2842 + i] + i4);
                    } else {
                        i5 = (short) (f2841[f2842 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    l.f3000 = ((i + i5) - 2) + f2842 + i6;
                    l.f3002 = b;
                    l.f3004 = (char) (i3 + f2837);
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001 = 1;
                    while (l.f3001 < i5) {
                        byte[] bArr2 = f2838;
                        if (bArr2 != null) {
                            int i7 = l.f3000;
                            l.f3000 = i7 - 1;
                            l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                        } else {
                            short[] sArr = f2841;
                            int i8 = l.f3000;
                            l.f3000 = i8 - 1;
                            l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                        }
                        sb.append(l.f3004);
                        l.f3003 = l.f3004;
                        l.f3001++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }
}
