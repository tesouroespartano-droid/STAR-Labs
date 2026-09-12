package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC0280i1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ec extends ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f1936 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1937 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1938 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1939 = -2129690288;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1940 = 1021178929;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1941 = 106;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1942 = {-101, -48, 73, 75, -21, 110, -110, -41, -44, 73, -118, -103, -39, Base64.padSymbol, -51, SignedBytes.MAX_POWER_OF_TWO, 71, -46, 115, -90, 67, -43, SignedBytes.MAX_POWER_OF_TWO, 37, 54, -120, 36, -128, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, ed> f1943;

    public ec(Map<String, ed> map, dn dnVar) {
        super(dnVar);
        this.f1943 = new HashMap();
        for (String str : map.keySet()) {
            this.f1943.put(dx.m2086(str), map.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1943.keySet()) {
            int i2 = f1938 + 113;
            f1937 = i2 % 128;
            int i3 = i2 % 2;
            try {
                jSONObject.put(str, this.f1943.get(str).m2116(dqVar, coVar).m2019());
            } catch (JSONException e) {
                cn.m1575(coVar.m1624(), new StringBuilder().append(m2113(2129690288 - TextUtils.indexOf("", "", 0), (byte) ((-77) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 80, KeyEvent.getDeadChar(0, 0) - 1021178860, (short) (116 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()).append(m2117()).toString(), e);
            }
        }
        dr drVar = new dr(jSONObject);
        int i4 = f1938 + 49;
        f1937 = i4 % 128;
        if (i4 % 2 != 0) {
            return drVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0080 A[PHI: r1
      0x0080: PHI (r1v13 java.lang.String) = (r1v9 java.lang.String), (r1v15 java.lang.String) binds: [B:11:0x007e, B:8:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        String next;
        char c = 2;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        float f = 0.0f;
        int i2 = 2129690312;
        sb.append(m2113((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2129690312, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 69), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 105, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1021178806, (short) ((-3) - TextUtils.indexOf("", "", 0))).intern());
        Iterator<String> it = this.f1943.keySet().iterator();
        boolean z = true;
        for (boolean z2 = true; (it.hasNext() ^ z2) != z2; z2 = true) {
            int i3 = f1938 + InterfaceC0280i1.d.b.b;
            char c2 = c;
            f1937 = i3 % 128;
            if (i3 % 2 != 0) {
                next = it.next();
                if (!z) {
                    sb.append(m2113(i2 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0') + 23), (-104) - Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") - 1021178885, (short) (Color.blue(0) - 84)).intern());
                }
            } else {
                next = it.next();
                int i4 = 90 / 0;
                if (!z) {
                    sb.append(m2113(i2 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0') + 23), (-104) - Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") - 1021178885, (short) (Color.blue(0) - 84)).intern());
                }
            }
            sb.append(m2113(2129690313 - TextUtils.indexOf("", "", 0, 0), (byte) ((-76) - View.resolveSizeAndState(0, 0, 0)), (-104) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) - 1021178895, (short) (82 - TextUtils.getOffsetAfter("", 0))).intern());
            sb.append(next);
            sb.append(m2113(2129690313 - ExpandableListView.getPackedPositionGroup(0L), (byte) (4 - AndroidCharacter.getMirror('0')), (-102) - Gravity.getAbsoluteGravity(0, 0), (-1021178895) - (Process.myTid() >> 22), (short) (TextUtils.lastIndexOf("", '0', 0) - 85)).intern());
            sb.append(this.f1943.get(next));
            z = false;
            c = c2;
            f = 0.0f;
            i2 = 2129690312;
        }
        sb.append(m2113(2129690315 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + WorkQueueKt.MASK), (-104) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) - 1021178804, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 31)).intern());
        String string = sb.toString();
        int i5 = f1937 + 99;
        f1938 = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1937;
        int i3 = i2 + 43;
        f1938 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i4 = i2 + 79;
            f1938 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.getClass();
                super.hashCode();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                Map<String, ed> map = this.f1943;
                Map<String, ed> map2 = ((ec) obj).f1943;
                if (map != null) {
                    return map.equals(map2);
                }
                return map2 == null;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r0 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.f1943 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.f1943 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r4.f1943.hashCode();
        r2 = com.ironsource.adqualitysdk.sdk.i.ec.f1937 + 1;
        com.ironsource.adqualitysdk.sdk.i.ec.f1938 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1938 + 7;
        f1937 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2113(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1941;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1942;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1939 + i] + i4);
                } else {
                    i5 = (short) (f1936[f1939 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1939 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1940);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1942;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1936;
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
