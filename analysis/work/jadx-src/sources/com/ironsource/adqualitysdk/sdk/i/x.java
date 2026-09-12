package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3143 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3144 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3145 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f3146 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3147 = 1997494133;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, y> f3148 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, z> f3149 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, ab> f3150 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m3013(x xVar) {
        int i = 2 % 2;
        int i2 = f3145 + 37;
        f3143 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, ab> map = xVar.f3150;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m3014(x xVar) {
        int i = 2 % 2;
        int i2 = f3143 + 47;
        int i3 = i2 % 128;
        f3145 = i3;
        int i4 = i2 % 2;
        Map<String, z> map = xVar.f3149;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 87;
        f3143 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m3015(x xVar) {
        int i = 2 % 2;
        int i2 = f3143 + 87;
        int i3 = i2 % 128;
        f3145 = i3;
        int i4 = i2 % 2;
        Map<String, y> map = xVar.f3148;
        int i5 = i3 + 59;
        f3143 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m3016(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3143 + 125;
        f3145 = i2 % 128;
        int i3 = i2 % 2;
        String strM3012 = m3012(jSONObject);
        int i4 = f3143 + 21;
        f3145 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return strM3012;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3023(final JSONObject jSONObject, final o oVar, final jf jfVar, final iq iqVar) {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                String strM3016 = x.m3016(jSONObject);
                y yVar = (y) x.m3015(x.this).get(strM3016);
                if (yVar == null) {
                    yVar = new y(jSONObject, iqVar);
                    x.m3015(x.this).put(strM3016, yVar);
                } else {
                    yVar.m2985(iqVar);
                    yVar.m3048(jSONObject);
                }
                yVar.m2975((r) oVar);
                yVar.m3047(jfVar);
            }
        });
        int i2 = f3143 + 35;
        f3145 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3018() {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                ArrayList arrayList = new ArrayList(x.m3015(x.this).values());
                x.m3015(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).m3049();
                }
            }
        });
        int i2 = f3143 + 51;
        f3145 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3022(final JSONObject jSONObject, final u uVar) {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                String strM3016 = x.m3016(jSONObject);
                z zVar = (z) x.m3014(x.this).get(strM3016);
                if (zVar == null) {
                    zVar = new z(jSONObject);
                    x.m3014(x.this).put(strM3016, zVar);
                } else {
                    zVar.m3073(jSONObject);
                }
                zVar.m2975((r) uVar);
            }
        });
        int i2 = f3145 + 61;
        f3143 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3021() {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                ArrayList arrayList = new ArrayList(x.m3014(x.this).values());
                x.m3014(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).m3074();
                }
            }
        });
        int i2 = f3145 + 1;
        f3143 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3020(JSONObject jSONObject, q qVar) {
        int i = 2 % 2;
        int i2 = f3145 + 107;
        f3143 = i2 % 128;
        int i3 = i2 % 2;
        m3019(jSONObject, qVar, null);
        int i4 = f3143 + 11;
        f3145 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3019(final JSONObject jSONObject, final q qVar, final it itVar) {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                String strM3016 = x.m3016(jSONObject);
                ab abVar = (ab) x.m3013(x.this).get(strM3016);
                if (abVar == null) {
                    abVar = new ab(jSONObject, itVar);
                    x.m3013(x.this).put(strM3016, abVar);
                } else {
                    abVar.m225(jSONObject, itVar);
                }
                abVar.m2975(qVar);
            }
        });
        int i2 = f3143 + 75;
        f3145 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3017() {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.x.10
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                ArrayList arrayList = new ArrayList(x.m3013(x.this).values());
                x.m3013(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ab) it.next()).m226();
                }
            }
        });
        int i2 = f3143 + InterfaceC0280i1.d.b.b;
        f3145 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m3012(JSONObject jSONObject) {
        int i = 2 % 2;
        String string = new StringBuilder().append(jSONObject.optString(m3011("\u0000\u0000\u0000\u0000", (-1) - TextUtils.indexOf((CharSequence) "", '0'), "嘇쒜㳯楁", (char) (16701 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "唏朧鑗Ⱬ鷚泅\ue0a7粳\uf88bࣧﷺ냟兂騊").intern())).append(m3011("\u0000\u0000\u0000\u0000", 360614591 - Color.alpha(0), "뾻纊崕ឋ", (char) (35678 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "ݧ").intern()).append(jSONObject.optString(m3011("\u0000\u0000\u0000\u0000", ViewConfiguration.getWindowTouchSlop() >> 8, "듻㽝⬴妿", (char) (48940 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\ue051㭗ﱺ碱狲法⠹⠞彠⸮\ud9e6矕营덇").intern())).append(jSONObject.optString(m3011("\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 432270272, "뾶쏫\ue919ஹ", (char) (Color.blue(0) + 47593), "杣\uf4d8➻倴黯頙믛\ue7a5꯶䶪\ue8a5\udab9\ue230").intern())).append(jSONObject.optString(m3011("\u0000\u0000\u0000\u0000", 2065718405 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "蘐⁜왻ક", (char) (38342 - Color.green(0)), "통鑦翛탷䁿8캼孠ㄇౠᔢ壜\u0efb㿪쵣").intern())).toString();
        int i2 = f3143 + 117;
        f3145 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m3011(String str, int i, String str2, char c, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (g.f2155) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr[g.f2156])) ^ f3146) ^ ((long) f3147)) ^ ((long) f3144));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
