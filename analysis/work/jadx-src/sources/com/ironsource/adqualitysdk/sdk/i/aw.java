package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aw {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f587 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f588 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f596;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f597;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject f598;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f593 = {800035455, 595459672, -1844428058, 977472629, -1815039235, -234637452, 195972531, 351745274, 1446505996, -2051232247, -2031660963, -980915524, -1027038053, -1288510956, 250504430, 1302815803, -1540035934, -874051461};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f590 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f591 = true;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f589 = 254;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f592 = {351, 364, 354, 368, 365, 359, 300, 373, 355, 352, 361, 370, 353, 363, 357, 327, 331, 319, 372, 375, 366, 369, 362, 371, 356};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f595 = Arrays.asList(m654(new int[]{-938612272, 1590743295, 538440228, 972033571, 797155843, 432919936, -2088767595, -2100877907, -144352326, -2090489904}, 20 - ExpandableListView.getPackedPositionType(0)).intern(), m652(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0087\u008c\u0086\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), "");

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f594 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m653(aw awVar, String str) {
        int i = 2 % 2;
        int i2 = f587 + 69;
        f588 = i2 % 128;
        int i3 = i2 % 2;
        awVar.m651(str);
        int i4 = f588 + 85;
        f587 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    aw() {
        List<String> listAsList = Arrays.asList(m652(null, 126 - TextUtils.lastIndexOf("", '0'), null, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0083\u0092\u0086\u008a\u0085\u0091\u0082\u0090\u0087\u008f\u0082\u0086\u0084\u0089\u0083\u0082\u0089\u0084\u0087\u0086\u008a\u0085\u008e\u0082\u0086\u0087\u008e\u0085\u008d").intern(), m654(new int[]{-938612272, 1590743295, 48664982, -823067712, 183032419, 984389128, 664608185, -1212130385, 1697199514, -1249404607, -514004074, 1742832847, -1089241501, 461626243, 1816654663, -1956602241, -493216293, 396110530, 1024561471, 2130408247, 1712177317, -2051064182}, ((Process.getThreadPriority(0) + 20) >> 6) + 41).intern(), m654(new int[]{-115721198, -1273485299, -1604780367, -1302069295, -1036726380, 322362990, -48548276, 2140171908, -1763940833, -1437383210, 1909558453, 1872379757, 359220874, 1555999126, -2144719820, 861373553, 1700292253, -361275956, -208307770, -868989225, -1591841078, 860062353}, 43 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m652(null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0090\u0087\u0086\u0098\u0087\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0086\u0087\u0089\u008f\u0081\u0096\u0089\u0084\u0095\u0087\u0085\u0086").intern());
        this.f597 = listAsList;
        m652(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0095\u0093\u0088").intern();
        m652(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0083\u0096\u0093\u0088").intern();
        m654(new int[]{-2076128738, 1020489767}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3).intern();
        m652(null, 127 - View.resolveSize(0, 0), null, "\u0083\u0096\u008d\u0086").intern();
        m654(new int[]{1758180307, 684850546}, 3 - Gravity.getAbsoluteGravity(0, 0)).intern();
        m654(new int[]{-846090431, -1594567714}, 3 - Color.blue(0)).intern();
        m654(new int[]{1944576716, 250560422}, (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern();
        this.f596 = new JSONObject();
        this.f598 = new JSONObject();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f598.put(it.next(), m654(new int[]{-485729291, 407454136}, 2 - ExpandableListView.getPackedPositionType(0L)).intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m660(iw iwVar) {
        int i = 2 % 2;
        m651(iwVar.m2511(m654(new int[]{20785423, -1238097270, -845515868, -1165719086, 1904706975, 46590178}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8).intern(), m654(new int[]{1188684004, 636662392}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3).intern(), new io() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.5
            @Override // com.ironsource.adqualitysdk.sdk.i.io
            /* JADX INFO: renamed from: ﾒ */
            public final void mo639(String str) {
                aw.m653(aw.this, str);
            }
        }));
        int i2 = f587 + 71;
        f588 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m651(String str) {
        int i = 2 % 2;
        int i2 = f588 + 45;
        f587 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f596 = new JSONObject(str);
                    return;
                } catch (JSONException unused) {
                }
            }
            int i3 = f587 + 85;
            f588 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        TextUtils.isEmpty(str);
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final List<String> m662() {
        int i = 2 % 2;
        int i2 = f588 + 39;
        f587 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM2822 = kd.m2822(this.f596, m652(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u0095\u0093\u0088").intern(), this.f595);
        int i4 = f587 + 9;
        f588 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return listM2822;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final int m664() {
        int i = 2 % 2;
        int i2 = f587 + 99;
        f588 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = this.f596.optInt(m652(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0083\u0096\u0093\u0088").intern(), 7);
        int i4 = f587 + 95;
        f588 = i4 % 128;
        if (i4 % 2 != 0) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final List<String> m661() {
        int i = 2 % 2;
        int i2 = f588 + 43;
        f587 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM2822 = kd.m2822(this.f596, m654(new int[]{-2076128738, 1020489767}, 3 - Color.red(0)).intern(), this.f594);
        int i4 = f588 + 31;
        f587 = i4 % 128;
        int i5 = i4 % 2;
        return listM2822;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final int m659() {
        JSONObject jSONObject;
        int minimumFlingVelocity;
        int i = 2 % 2;
        int i2 = f588 + InterfaceC0280i1.d.b.g;
        f587 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            jSONObject = this.f596;
            minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() + 47;
        } else {
            jSONObject = this.f596;
            minimumFlingVelocity = 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
        }
        int iOptInt = jSONObject.optInt(m652(null, minimumFlingVelocity, null, "\u0083\u0096\u008d\u0086").intern(), 2);
        int i3 = f587 + 77;
        f588 = i3 % 128;
        if (i3 % 2 != 0) {
            return iOptInt;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m663() {
        int i = 2 % 2;
        List<String> listM2822 = kd.m2822(this.f596, m654(new int[]{1758180307, 684850546}, 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new ArrayList());
        int i2 = f588 + 69;
        f587 = i2 % 128;
        if (i2 % 2 == 0) {
            return listM2822;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final List<String> m655() {
        int i = 2 % 2;
        List<String> listM2822 = kd.m2822(this.f596, m654(new int[]{-846090431, -1594567714}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern(), new ArrayList());
        int i2 = f587 + InterfaceC0280i1.d.b.d;
        f588 = i2 % 128;
        int i3 = i2 % 2;
        return listM2822;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    final int m657() {
        int i = 2 % 2;
        int i2 = f587 + 81;
        f588 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = this.f596.optInt(m654(new int[]{-823643619, 909572746}, 3 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        int i4 = f588 + 123;
        f587 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m656() {
        int i = 2 % 2;
        int i2 = f588 + 65;
        f587 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f596.optString(m652(null, (Process.myTid() >> 22) + WorkQueueKt.MASK, null, "\u008c\u0083\u008c\u0083").intern(), m654(new int[]{1292941001, -849863785}, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        int i4 = f587 + 115;
        f588 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m658() {
        int i = 2 % 2;
        int i2 = f588 + 97;
        f587 = i2 % 128;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectOptJSONObject = this.f596.optJSONObject(m652(null, 29 >> (ViewConfiguration.getScrollBarSize() % 90), null, "\u008d\u0099\u008c\u0083").intern());
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
        } else {
            JSONObject jSONObjectOptJSONObject2 = this.f596.optJSONObject(m652(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u008d\u0099\u008c\u0083").intern());
            if (jSONObjectOptJSONObject2 != null) {
                return jSONObjectOptJSONObject2;
            }
        }
        JSONObject jSONObject = this.f598;
        int i3 = f588 + 55;
        f587 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m654(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f593.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
                cArr[0] = (char) (c.f1232 >>> 16);
                cArr[1] = (char) c.f1232;
                cArr[2] = (char) (c.f1233 >>> 16);
                cArr[3] = (char) c.f1233;
                c.m1415(iArr2);
                cArr2[c.f1231 << 1] = cArr[0];
                cArr2[(c.f1231 << 1) + 1] = cArr[1];
                cArr2[(c.f1231 << 1) + 2] = cArr[2];
                cArr2[(c.f1231 << 1) + 3] = cArr[3];
                c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m652(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f592;
            int i2 = f589;
            if (f591) {
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
            if (f590) {
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
