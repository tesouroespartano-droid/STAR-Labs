package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.core.view.ViewCompat;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bg extends cx implements ci {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f798 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f800 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f802 = null;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f803 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f804 = 98;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f805 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, c> f809;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f810;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f811;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f812;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f808 = {213, 199, 214, 168, Typography.times, 206, 181, 198, 205, 184, 212, 203, 209, 208, 201, 165, 195, 137, 156, 130, 207, 202, 210, 200, 197, 196, 219, Typography.section};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f806 = -620757438;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f807 = 2;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f799 = -1293022840;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f801 = {-115, -112, 99, 125, -124, 116, 127, -117, -115, 105, -123, -113, 101, 126, 117, -83, 81, -120, -25, -31, -14, -23, -37, -15, -89, 92, -107, -89, -108, -81, -104, -19, 91, -113, -83, -107, -77, -109, -18, 89, -103, -91, -107, -97, -78, -98, -115, -77, -27, 78, -93, -99, -96, -51, -69, -70, 38, 44, 48, 98, 115, 86, 111, 116, -99, -96, -83, 65, SignedBytes.MAX_POWER_OF_TWO, Utf8.REPLACEMENT_BYTE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    interface c {
        /* JADX INFO: renamed from: ﾒ */
        Object mo791(List<Object> list, cl clVar);
    }

    /* JADX INFO: renamed from: ﻛ */
    abstract Class mo788(String str);

    /* JADX INFO: renamed from: ｋ */
    abstract String mo789();

    /* JADX INFO: renamed from: ﾇ */
    abstract Map<String, c> mo790();

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    static /* synthetic */ Object m806(List list, Class cls) {
        int i = 2 % 2;
        int i2 = f798 + 71;
        f800 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = m1770(list, 0, cls);
        int i4 = f800 + 11;
        f798 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Class m807(bg bgVar, String str) {
        int i = 2 % 2;
        int i2 = f798 + 9;
        f800 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM809 = bgVar.m809(str, false);
        int i4 = f800 + InterfaceC0280i1.d.b.i;
        f798 = i4 % 128;
        if (i4 % 2 == 0) {
            return clsM809;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m811(bg bgVar) {
        int i = 2 % 2;
        int i2 = f800 + InterfaceC0280i1.d.b.b;
        int i3 = i2 % 128;
        f798 = i3;
        int i4 = i2 % 2;
        String str = bgVar.f811;
        int i5 = i3 + 33;
        f800 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public bg(String str) {
        this.f812 = str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m814() {
        int i = 2 % 2;
        Map<String, c> mapMo790 = mo790();
        this.f809 = mapMo790;
        mapMo790.put(m808((int[]) null, Color.red(0) + WorkQueueKt.MASK, (String) null, "\u008e\u008d\u008c\u0081\u008b\u0082\u008a\u0089\u0088\u0087\u0086\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                bg.this.m817((String) bg.m806(list, String.class));
                return bg.m811(bg.this);
            }
        });
        this.f809.put(m810(MotionEvent.axisFromString("") + 620757439, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 17 - TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1293022944, (short) (TextUtils.lastIndexOf("", '0') - 125)).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return Boolean.valueOf(bg.this.m812());
            }
        });
        this.f809.put(m808((int[]) null, 127 - View.combineMeasuredStates(0, 0), (String) null, "\u0081\u0081\u0091\u0086\u0090\u0083\u0082\u008f").intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.c
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo791(List<Object> list, cl clVar) {
                return bg.m807(bg.this, (String) list.get(0));
            }
        });
        int i2 = f798 + 7;
        f800 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004e A[Catch: all -> 0x0067, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x000c, B:9:0x0054, B:16:0x0066, B:8:0x004e, B:14:0x0064), top: B:22:0x0002, inners: #0 }] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized String m816() {
        String str;
        int i = 2 % 2;
        if (TextUtils.isEmpty(this.f810)) {
            this.f810 = mo789();
        } else {
            int i2 = f798 + 95;
            f800 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f810.equals(m810(KeyEvent.getDeadChar(0, 0) + 620757456, (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, 1293022909 - Color.blue(0), (short) (24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern())) {
                this.f810 = mo789();
            }
        }
        str = this.f810;
        int i4 = f800 + 27;
        f798 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return r4.f811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = m816();
        r2 = com.ironsource.adqualitysdk.sdk.i.bg.f800 + 93;
        com.ironsource.adqualitysdk.sdk.i.bg.f798 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.f811 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.f811 != null) goto L9;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo820() {
        int i = 2 % 2;
        int i2 = f798 + 117;
        f800 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m817(String str) {
        int i = 2 % 2;
        int i2 = f798 + 115;
        f800 = i2 % 128;
        int i3 = i2 % 2;
        this.f811 = str;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m812() {
        int i = 2 % 2;
        int i2 = f798;
        int i3 = i2 + 91;
        f800 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.f811 == null) {
            return false;
        }
        int i4 = i2 + 29;
        f800 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        int i = 2 % 2;
        c cVar = this.f809.get(str);
        try {
            if (cVar == null) {
                cn.m1575(this.f812, new StringBuilder().append(m810(View.MeasureSpec.getMode(0) + 620757462, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, View.MeasureSpec.getSize(0) + 1293022909, (short) (Color.blue(0) + 96)).intern()).append(str).append(m808((int[]) null, View.resolveSize(0, 0) + WorkQueueKt.MASK, (String) null, "\u0088\u0082\u0083\u008b\u008d\u0097\u0097\u0085\u0081\u0094\u0083\u008d\u008e\u0094\u0088\u008d\u0096\u0083\u0082\u0095\u0094\u0093\u0092").intern()).toString(), null);
                return null;
            }
            int i2 = f800 + 31;
            f798 = i2 % 128;
            if (i2 % 2 != 0) {
                cVar.mo791(list, clVar);
                throw null;
            }
            Object objMo791 = cVar.mo791(list, clVar);
            int i3 = f798 + 61;
            f800 = i3 % 128;
            int i4 = i3 % 2;
            return objMo791;
        } catch (Exception e) {
            cn.m1575(this.f812, new StringBuilder().append(m810(620757462 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), 1293022909 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (Process.getGidForName("") + 97)).intern()).append(str).append(m810(Process.getGidForName("") + 620757493, (byte) Color.alpha(0), (byte) KeyEvent.getModifierMetaStateMask(), 1293022879 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((-5) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern()).toString(), e);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class m819(String str) {
        int i = 2 % 2;
        try {
            if (Prode.m203()) {
                Class clsMo788 = mo788(str);
                int i2 = f798 + 49;
                f800 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 94 / 0;
                }
                return clsMo788;
            }
            int i4 = f800 + 113;
            f798 = i4 % 128;
            int i5 = i4 % 2;
            return m809(str, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class m818(String str) {
        int i = 2 % 2;
        int i2 = f798 + 61;
        f800 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM809 = m809(str, true);
        int i4 = f800 + 93;
        f798 = i4 % 128;
        if (i4 % 2 == 0) {
            return clsM809;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0222  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Class m809(String str, boolean z) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f798 + 41;
        f800 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (str.contains(m810((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 620757492, (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") - 1, 63190 - AndroidCharacter.getMirror('0'), (short) ((-48) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                return kc.m2807(str, z);
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (!str.equals(m810(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 620757498, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 3 - TextUtils.indexOf((CharSequence) "", '0', 0), 1293022941 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 106)).intern())) {
                        b = -1;
                    } else {
                        int i4 = f800 + 123;
                        f798 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    break;
                case 104431:
                    if (!str.equals(m810(620757492 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), Color.red(0) + 1, Color.argb(0, 0, 0, 0) + 1293022945, (short) (75 - Drawable.resolveOpacity(0, 0))).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 3029738:
                    if (str.equals(m810((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 620757501, (byte) KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0') + 3, View.combineMeasuredStates(0, 0) + 1293022938, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 96)).intern())) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 3039496:
                    if (!str.equals(m808((int[]) null, TextUtils.lastIndexOf("", '0') + 128, (String) null, "\u0082\u0083\u009b\u009a").intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 3052374:
                    if (!str.equals(m808((int[]) null, 126 - TextUtils.lastIndexOf("", '0', 0), (String) null, "\u008b\u0091\u0096\u0099").intern())) {
                        b = -1;
                    } else {
                        int i6 = f800 + 81;
                        f798 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    break;
                case 3327612:
                    if (!str.equals(m810((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 620757494, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1293022948 - TextUtils.getCapsMode("", 0, 0), (short) (KeyEvent.getDeadChar(0, 0) - 45)).intern())) {
                        b = -1;
                    } else {
                        int i8 = f800 + 5;
                        f798 = i8 % 128;
                        int i9 = i8 % 2;
                        b = 1;
                    }
                    break;
                case 3625364:
                    if (!str.equals(m810((ViewConfiguration.getTouchSlop() >> 8) + 620757505, (byte) Gravity.getAbsoluteGravity(0, 0), 2 - TextUtils.getTrimmedLength(""), 1293022957 - TextUtils.indexOf((CharSequence) "", '0', 0), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 70)).intern())) {
                        b = -1;
                    } else {
                        int i10 = f800;
                        int i11 = i10 + 85;
                        f798 = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i10 + 57;
                        f798 = i13 % 128;
                        int i14 = i13 % 2;
                        b = 7;
                    }
                    break;
                case 97526364:
                    if (!str.equals(m808((int[]) null, 127 - KeyEvent.normalizeMetaState(0), (String) null, "\u0083\u0091\u008d\u0086\u0098").intern())) {
                        b = -1;
                    } else {
                        int i15 = f800 + 31;
                        f798 = i15 % 128;
                        b = i15 % 2 == 0 ? (byte) 3 : (byte) 5;
                    }
                    break;
                case 109413500:
                    if (!str.equals(m808((int[]) null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, (String) null, "\u0083\u008b\u008d\u0096\u0081").intern())) {
                        b = -1;
                    } else {
                        int i16 = f798 + 7;
                        f800 = i16 % 128;
                        b = i16 % 2 != 0 ? (byte) 8 : (byte) 117;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    return Float.TYPE;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    return Void.TYPE;
                case 8:
                    return Short.TYPE;
                default:
                    return mo788(str);
            }
        } catch (Throwable th) {
            if (z) {
                cn.m1575(this.f812, new StringBuilder().append(m808((int[]) null, 127 - View.getDefaultSize(0, 0), (String) null, "\u0094\u0081\u0081\u0091\u0086\u0090").intern()).append(str).append(m808((int[]) null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, (String) null, "\u0088\u008e\u0085\u008d\u0098\u0094\u0083\u008d\u008e\u0094").intern()).toString(), th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m815(hg hgVar, cl clVar, String str, Object... objArr) {
        int i = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            clVar.mo1564(str, arrayList);
            int i2 = f800 + InterfaceC0280i1.d.b.i;
            f798 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            cn.m1575(this.f812, new StringBuilder().append(m808((int[]) null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (String) null, "\u0094\u008e\u008c\u0094\u008b\u008d\u008b\u008b\u009c").intern()).append(this).toString(), th);
        }
    }

    /* JADX INFO: renamed from: ﱡ */
    public boolean mo802() {
        int i = 2 % 2;
        int i2 = f798;
        int i3 = i2 + 93;
        f800 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        f800 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public boolean mo804() {
        int i = 2 % 2;
        int i2 = f800 + 11;
        int i3 = i2 % 128;
        f798 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        f800 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m808(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f808;
            int i2 = f804;
            if (f803) {
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
            if (f805) {
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m810(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f807;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f801;
                if (bArr != null) {
                    i5 = (byte) (bArr[f806 + i] + i4);
                } else {
                    i5 = (short) (f802[f806 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f806 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f799);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f801;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f802;
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
