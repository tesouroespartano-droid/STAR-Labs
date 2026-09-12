package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fx extends fr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2138 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2139 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2140 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2141 = 495253308;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2142 = 649862649;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2143 = 8;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2144 = {-4, -86, 81, -25, -6, 3, -7, -3, 6, 89, Ascii.DLE, -106};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<ed> f2145;

    public fx(List<ed> list) {
        this.f2145 = list;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r2
      0x0034: PHI (r2v6 com.ironsource.adqualitysdk.sdk.i.ed) = (r2v5 com.ironsource.adqualitysdk.sdk.i.ed), (r2v10 com.ironsource.adqualitysdk.sdk.i.ed) binds: [B:11:0x0032, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[PHI: r2
      0x0038: PHI (r2v8 com.ironsource.adqualitysdk.sdk.i.ed) = (r2v5 com.ironsource.adqualitysdk.sdk.i.ed), (r2v10 com.ironsource.adqualitysdk.sdk.i.ed) binds: [B:11:0x0032, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2153(dq dqVar, co coVar) {
        ed next;
        int i = 2 % 2;
        Iterator<ed> it = this.f2145.iterator();
        while (true) {
            en enVarM2104 = null;
            if (!it.hasNext()) {
                return new dr(null);
            }
            int i2 = f2140 + 113;
            f2138 = i2 % 128;
            if (i2 % 2 == 0) {
                next = it.next();
                int i3 = 47 / 0;
                if (next instanceof en) {
                    enVarM2104 = (en) next;
                } else if (next instanceof dz) {
                    enVarM2104 = ((dz) next).m2104();
                }
            } else {
                next = it.next();
                if (next instanceof en) {
                    enVarM2104 = (en) next;
                } else if (next instanceof dz) {
                    enVarM2104 = ((dz) next).m2104();
                }
            }
            if (enVarM2104 != null) {
                dqVar.m2010(Arrays.asList(enVarM2104.m2137()));
                int i4 = f2138 + 73;
                f2140 = i4 % 128;
                int i5 = i4 % 2;
            }
            next.mo2084(dqVar, coVar);
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2138 + 3;
        f2140 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.f2145 != null) {
            return new StringBuilder().append(m2174((-495253308) - KeyEvent.normalizeMetaState(0), (byte) ((-95) - TextUtils.lastIndexOf("", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) - 9, (-649862531) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ExpandableListView.getPackedPositionChild(0L) + 99)).intern()).append(TextUtils.join(m2174((-495253304) - KeyEvent.keyCodeFromString(""), (byte) ((-85) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ExpandableListView.getPackedPositionChild(0L) - 8, (ViewConfiguration.getFadingEdgeLength() >> 16) - 649862605, (short) (92 - (ViewConfiguration.getTouchSlop() >> 8))).intern(), this.f2145)).append(m2174((-495253302) - TextUtils.indexOf("", "", 0, 0), (byte) (TextUtils.getCapsMode("", 0, 0) - 82), (-9) - KeyEvent.normalizeMetaState(0), (-649862590) - KeyEvent.normalizeMetaState(0), (short) (TextUtils.getOffsetBefore("", 0) + 126)).intern()).toString();
        }
        String strIntern = m2174((-495253300) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (42 - ExpandableListView.getPackedPositionGroup(0L)), View.MeasureSpec.getMode(0) - 9, (-649862531) - Color.alpha(0), (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43)).intern();
        int i3 = f2138 + 117;
        f2140 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2174(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2143;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2144;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2141 + i] + i4);
                } else {
                    i5 = (short) (f2139[f2141 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f2141 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f2142);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f2144;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f2139;
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
