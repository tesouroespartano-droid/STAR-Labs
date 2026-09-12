package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dh {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1716 = 0;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f1717 = 1;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1718 = 69;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f1719 = 24054;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1720 = 3294;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1721 = 24840;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1722 = 12860;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Map<String, dp> f1723;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1724;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dm f1725;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1726;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1727;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private dq f1728;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1729;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1730;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f1731;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private dq f1732;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m1896(dh dhVar) {
        int i = 2 % 2;
        int i2 = f1717;
        int i3 = i2 + InterfaceC0280i1.d.b.b;
        f1716 = i3 % 128;
        int i4 = i3 % 2;
        String str = dhVar.f1733;
        int i5 = i2 + 75;
        f1716 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public dh(String str, dq dqVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1731 = jSONObject;
            this.f1732 = dqVar;
            this.f1733 = jSONObject.optString(m1897("⓵\ue233ꇽ浱", 4 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            this.f1730 = this.f1731.optString(m1899("\t\u0005\ufffa\u0012\uffe7\ufffa\u0006\ufffe�\u0002\f", 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 173, false, 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            this.f1729 = this.f1731.optString(m1897("\uf5aa㷝\uef49샜\uf0ac浍ꜜ茔", 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            this.f1724 = this.f1731.optString(m1897("⠦ﺓ◊몹\ud819᭜", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6).intern());
            this.f1727 = this.f1731.optString(m1897("쐇鐠㎄싉\ud819᭜", KeyEvent.getDeadChar(0, 0) + 6).intern());
            if (this.f1731.has(m1899("\ufffa\ufff9\u0004ￛ\u0007\u0006\u000b\f\u000b\uffff\u0004\u0007", 9 - View.combineMeasuredStates(0, 0), 173 - TextUtils.getOffsetAfter("", 0), false, View.getDefaultSize(0, 0) + 12).intern())) {
                m1898(this.f1731.optJSONObject(m1899("\ufffa\ufff9\u0004ￛ\u0007\u0006\u000b\f\u000b\uffff\u0004\u0007", Color.alpha(0) + 9, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 173, false, 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()));
            }
        } catch (Throwable th) {
            cn.m1575(this.f1733, m1899("\u0005ﾾ\u0001\r\f\f\u0003\u0001\u0012\r\u0010ﾾ\u0001\r\f\u0004\u0007\u0005￣\u0010\u0010\r\u0010ﾾ\u0001\u0010\u0003\uffff\u0012\u0007\f", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, Color.rgb(0, 0, 0) + 16777383, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1898(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1716 + 57;
        f1717 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f1732.m2012(next, jSONObject.opt(next));
            int i4 = f1716 + 33;
            f1717 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1904() {
        int i = 2 % 2;
        int i2 = f1716 + 33;
        f1717 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1733;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1906() {
        int i = 2 % 2;
        int i2 = f1716;
        int i3 = i2 + 23;
        f1717 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1730;
        int i4 = i2 + 83;
        f1717 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1907() {
        int i = 2 % 2;
        int i2 = f1716;
        int i3 = i2 + 37;
        f1717 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1729;
        int i4 = i2 + 51;
        f1717 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1903() {
        int i = 2 % 2;
        int i2 = f1717 + InterfaceC0280i1.d.b.d;
        f1716 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1724;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1905() {
        int i = 2 % 2;
        int i2 = f1717;
        int i3 = i2 + 67;
        f1716 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1727;
        int i5 = i2 + 121;
        f1716 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dq m1902() {
        int i = 2 % 2;
        int i2 = f1716 + 87;
        f1717 = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.f1728 == null) {
                dq dqVar = new dq(kd.m2823(this.f1731.optJSONObject(m1899("\u0004\ufff4\u0000\uffff\u0004\u0005", 1 - (ViewConfiguration.getScrollBarSize() >> 8), View.combineMeasuredStates(0, 0) + 180, false, (ViewConfiguration.getTapTimeout() >> 16) + 6).intern()), new kd.a<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f1735 = 4;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f1736 = {Typography.quote, 'E', 'r', 'o', ' ', 'p', 'a', 's', 'i', 'n', 'g', 'c', 't', ':', '#', Typography.dollar};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f1737 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f1738;

                    @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
                    /* JADX INFO: renamed from: ﻛ */
                    public final Object mo547(JSONObject jSONObject, String str) {
                        int i3 = 2 % 2;
                        int i4 = f1737 + 87;
                        f1738 = i4 % 128;
                        int i5 = i4 % 2;
                        try {
                            String strOptString = jSONObject.optString(str);
                            if (jSONObject.opt(str) instanceof String) {
                                strOptString = new StringBuilder().append(m1909(" ", (byte) (126 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).append(strOptString).append(m1909(" ", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 125), 1 - View.combineMeasuredStates(0, 0)).intern()).toString();
                                int i6 = f1738 + 123;
                                f1737 = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            String strM1896 = dh.m1896(dh.this);
                            ed edVarM2072 = new dt(strM1896, strOptString).m2072(ds.m2028(strM1896, strOptString, strOptString));
                            int i8 = f1737 + 23;
                            f1738 = i8 % 128;
                            int i9 = i8 % 2;
                            return edVarM2072;
                        } catch (Throwable th) {
                            cn.m1575(dh.m1896(dh.this), new StringBuilder().append(m1909("\u0002\u0003\u0003\u0000\u0000\u0006\u0006\u0007\u0003\u0006\t\n\b\u0006", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41), TextUtils.lastIndexOf("", '0', 0) + 15).intern()).append(str).append(m1909("\u0007\b\u0001\u000b\u0004\u000f\f\u0005", (byte) (13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8).intern()).append(jSONObject.optString(str)).toString(), th);
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m1909(String str, byte b, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (f.f2043) {
                            char[] cArr2 = f1736;
                            char c = f1735;
                            char[] cArr3 = new char[i3];
                            if (i3 % 2 != 0) {
                                i3--;
                                cArr3[i3] = (char) (cArr[i3] - b);
                            }
                            if (i3 > 1) {
                                f.f2047 = 0;
                                while (f.f2047 < i3) {
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
                                            int i4 = (f.f2046 * c) + f.f2042;
                                            int i5 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i4];
                                            cArr3[f.f2047 + 1] = cArr2[i5];
                                        } else if (f.f2046 == f.f2044) {
                                            f.f2042 = ((f.f2042 + c) - 1) % c;
                                            f.f2041 = ((f.f2041 + c) - 1) % c;
                                            int i6 = (f.f2046 * c) + f.f2042;
                                            int i7 = (f.f2044 * c) + f.f2041;
                                            cArr3[f.f2047] = cArr2[i6];
                                            cArr3[f.f2047 + 1] = cArr2[i7];
                                        } else {
                                            int i8 = (f.f2046 * c) + f.f2041;
                                            int i9 = (f.f2044 * c) + f.f2042;
                                            cArr3[f.f2047] = cArr2[i8];
                                            cArr3[f.f2047 + 1] = cArr2[i9];
                                        }
                                    }
                                    f.f2047 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                }), this.f1732, true);
                this.f1728 = dqVar;
                dqVar.m2010(kd.m2812(this.f1731.optJSONArray(m1897("ꇽ浱퓠쫪햑⤲顀⭛", 7 - Color.blue(0)).intern()), new kd.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
                    /* JADX INFO: renamed from: ﻛ */
                    public final /* synthetic */ String mo546(JSONArray jSONArray, int i3) {
                        return dx.m2086(jSONArray.optString(i3));
                    }
                }));
                int i3 = f1717 + InterfaceC0280i1.d.b.g;
                f1716 = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.f1728;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final dm m1901() {
        int i = 2 % 2;
        int i2 = f1717 + 73;
        f1716 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1725 == null) {
            this.f1725 = new dm(this.f1731.optJSONObject(m1897("辝闤\uf575蜯\u2daf㾐협לּ顀⭛", 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()));
        }
        dm dmVar = this.f1725;
        int i4 = f1717 + 17;
        f1716 = i4 % 128;
        int i5 = i4 % 2;
        return dmVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Map<String, dp> m1900() {
        int i = 2 % 2;
        int i2 = f1716 + 95;
        f1717 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1723 == null) {
            this.f1723 = kd.m2823(this.f1731.optJSONObject(m1897("봅ໝ㔬㑉磥ࣶ햑⤲顀⭛", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8).intern()), new kd.a<dp>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
                /* JADX INFO: renamed from: ﻛ */
                public final /* synthetic */ dp mo547(JSONObject jSONObject, String str) {
                    return new dp(dh.m1896(dh.this), str, jSONObject.optJSONObject(str));
                }
            });
            int i4 = f1717 + 39;
            f1716 = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.f1723;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1908(String str) {
        Map<String, String> mapM2813;
        int i = 2 % 2;
        Object obj = null;
        if (this.f1726 == null && (mapM2813 = kd.m2813(this.f1731.optJSONObject(m1899("\uffef\r\u0007\ufffe\u0000ￚ\b￭\u0004�\f\f\u0007\b\u0002\f\u000b\ufffe", TextUtils.indexOf("", "") + 11, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 171, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17).intern()))) != null) {
            ArrayList<String> arrayList = new ArrayList(mapM2813.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    return kb.m2790(str2, str3);
                }
            });
            String str2 = null;
            for (String str3 : arrayList) {
                int i2 = f1717 + InterfaceC0280i1.d.b.i;
                f1716 = i2 % 128;
                int i3 = i2 % 2;
                if (kb.m2790(str, str3) >= 0) {
                    str2 = mapM2813.get(str3);
                }
            }
            this.f1726 = str2;
            int i4 = f1716 + 29;
            f1717 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str4 = this.f1726;
        int i6 = f1716 + 39;
        f1717 = i6 % 128;
        if (i6 % 2 != 0) {
            return str4;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1897(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1722)) ^ ((c2 >>> 5) + f1719)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1721) ^ ((c3 + i2) ^ ((c3 << 4) + f1720))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1899(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f1718);
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
