package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class iv {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2604 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2605 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2606 = {'N', 'e', 't', 'w', 'o', 'r', 'k', 'M', 'a', 'n', 'g', 'U', 'b', 'l', ' ', 'p', 's', 'c', 'u', 'm', 'q', 'i', 'h', 'R', 'L', 'H', 'd', 'v', 'S', 'O', 'P', 'Q', 'T', 'V', 'W', 'X'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2607 = 6;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ix f2608;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2609 = false;

    interface a {
        /* JADX INFO: renamed from: ﻐ */
        ir mo2500();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2489(iv ivVar, iz izVar, a aVar) {
        int i = 2 % 2;
        int i2 = f2605 + 29;
        f2604 = i2 % 128;
        int i3 = i2 % 2;
        ivVar.m2492(izVar, aVar);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = f2605 + 69;
        f2604 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ix m2490(iv ivVar) {
        int i = 2 % 2;
        int i2 = f2605;
        int i3 = i2 + 43;
        f2604 = i3 % 128;
        int i4 = i3 % 2;
        ix ixVar = ivVar.f2608;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 15;
        f2604 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return ixVar;
    }

    public iv(Context context) {
        this.f2608 = new ix(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ix m2493() {
        int i = 2 % 2;
        int i2 = f2605 + 77;
        f2604 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2608;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2495() {
        int i = 2 % 2;
        int i2 = f2604 + 25;
        f2605 = i2 % 128;
        int i3 = i2 % 2;
        this.f2608.m2528();
        this.f2609 = true;
        int i4 = f2604 + 45;
        f2605 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2494(final String str, final JSONObject jSONObject, iz izVar) {
        int i = 2 % 2;
        int i2 = f2605 + 81;
        f2604 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            n.m2868(m2491("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000", (byte) (92 - Color.argb(0, 0, 0, 0)), 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m2491("\u0006\n\u0006\u000e\u0013\u0007\u0014\b\u0002\u0010\u0010\u0003\u000e\u0004\u000f\f\u0016\f\u0003\u0005\u0014\r\u0000\u0002\u0015\u0013\u0004\r\b\u0014\u0003\u0013\u0004\u0014\u0002\u0000\u0011\b\u0012\u001d\u0010\u0002\u0002\u0011\u0000\u0002\u0011\u0010\u0003\n\r\u0004\u001a\u0007\b\u001b\u0013\u0007\u0002\u0011\u0004\u0002\u0000\u0002\u000f\b\u0005\u0003\u000f\u0010\u0000\u0005!\u001b\u0019\u0002\u0082", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30), 77 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            return;
        }
        m2492(izVar, new a() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iv.a
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final ir mo2500() {
                return iy.m2539(jSONObject, str);
            }
        });
        int i4 = f2605 + 59;
        f2604 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jv.m2717(new com.ironsource.adqualitysdk.sdk.i.iv.AnonymousClass4(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.f2609 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.f2609 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.n.m2887(m2491("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000", (byte) (93 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), 14 - android.view.View.getDefaultSize(0, 0)).intern(), m2491("\"\n\u0019\u0007\u0003\n\u0002\r\u0003\u0000\u0013\u0003 \u0014\u0003\u0005\u000f\u0014\u000f!\u0000\n\u0005\u0013\u0002\u0013\u0013\u0000\u000e\u0004\u000f\u0002\u0013\u0004\b\u000f\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000\u000f\u0002\n\u000e\u000f\u0011\u0017\u0013\b \u0005\u0004s", (byte) (4 - android.os.Process.getGidForName("")), 63 - android.text.TextUtils.getTrimmedLength("")).intern());
        r6 = com.ironsource.adqualitysdk.sdk.i.iv.f2604 + 41;
        com.ironsource.adqualitysdk.sdk.i.iv.f2605 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2492(final iz izVar, final a aVar) {
        int i = 2 % 2;
        int i2 = f2604 + 65;
        f2605 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2491(String str, byte b, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            char[] cArr2 = f2606;
            char c = f2607;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                f.f2047 = 0;
                while (f.f2047 < i) {
                    f.f2045 = cArr[f.f2047];
                    f.f2048 = cArr[f.f2047 + 1];
                    if (f.f2045 == f.f2048) {
                        cArr3[f.f2047] = (char) (f.f2045 - b);
                        cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                    } else {
                        f.f2046 = f.f2045 / c;
                        f.f2042 = f.f2045 % c;
                        f.f2044 = f.f2048 / c;
                        f.f2041 = f.f2048 % c;
                        if (f.f2042 == f.f2041) {
                            f.f2046 = ((f.f2046 + c) - 1) % c;
                            f.f2044 = ((f.f2044 + c) - 1) % c;
                            int i2 = (f.f2046 * c) + f.f2042;
                            int i3 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i2];
                            cArr3[f.f2047 + 1] = cArr2[i3];
                        } else if (f.f2046 == f.f2044) {
                            f.f2042 = ((f.f2042 + c) - 1) % c;
                            f.f2041 = ((f.f2041 + c) - 1) % c;
                            int i4 = (f.f2046 * c) + f.f2042;
                            int i5 = (f.f2044 * c) + f.f2041;
                            cArr3[f.f2047] = cArr2[i4];
                            cArr3[f.f2047 + 1] = cArr2[i5];
                        } else {
                            int i6 = (f.f2046 * c) + f.f2041;
                            int i7 = (f.f2044 * c) + f.f2042;
                            cArr3[f.f2047] = cArr2[i6];
                            cArr3[f.f2047 + 1] = cArr2[i7];
                        }
                    }
                    f.f2047 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
