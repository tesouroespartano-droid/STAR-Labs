package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ae implements Comparable<ae> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f145 = 3610987663072177182L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f146 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f147;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ja f148;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ae aeVar) {
        int i = 2 % 2;
        int i2 = f146 + InterfaceC0280i1.d.b.d;
        f147 = i2 % 128;
        int i3 = i2 % 2;
        int iM306 = m306(aeVar);
        int i4 = f147 + 45;
        f146 = i4 % 128;
        int i5 = i4 % 2;
        return iM306;
    }

    public ae(ja jaVar) {
        this.f148 = jaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized JSONObject m310() {
        JSONObject jSONObjectM2549;
        int i = 2 % 2;
        int i2 = f146 + 113;
        f147 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM2549 = this.f148.m2549();
            int i3 = 4 / 0;
        } else {
            jSONObjectM2549 = this.f148.m2549();
        }
        return jSONObjectM2549;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m309(int i) {
        int i2 = 2 % 2;
        int i3 = f146 + 121;
        f147 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f148.m2549() != null) {
            int i5 = f146 + 15;
            f147 = i5 % 128;
            int i6 = i5 % 2;
            kd.m2815(this.f148.m2549(), i, m304());
            int i7 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<String> m304() {
        int i = 2 % 2;
        int i2 = f147 + 41;
        f146 = i2 % 128;
        if (i2 % 2 != 0) {
            return Arrays.asList(ij.f2536);
        }
        String[] strArr = new String[0];
        strArr[0] = ij.f2536;
        return Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ja m307() {
        int i = 2 % 2;
        int i2 = f147 + 95;
        int i3 = i2 % 128;
        f146 = i3;
        int i4 = i2 % 2;
        ja jaVar = this.f148;
        int i5 = i3 + 85;
        f147 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return jaVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private long m300() {
        int i = 2 % 2;
        int i2 = f147 + 45;
        f146 = i2 % 128;
        int i3 = i2 % 2;
        long jOptLong = m310().optLong(m305("譭謙ꭐ蜽ꯈ䭚", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
        int i4 = f147 + 1;
        f146 = i4 % 128;
        int i5 = i4 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private long m301() {
        JSONObject jSONObjectM310;
        float maxVolume;
        float f;
        int i = 2 % 2;
        int i2 = f147 + 23;
        f146 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM310 = m310();
            maxVolume = AudioTrack.getMaxVolume();
            f = 1.0f;
        } else {
            jSONObjectM310 = m310();
            maxVolume = AudioTrack.getMaxVolume();
            f = 0.0f;
        }
        long jOptInt = jSONObjectM310.optInt(m305("馗駲냕鲥\uf7a8\ue4a7", 1 - (maxVolume > f ? 1 : (maxVolume == f ? 0 : -1))).intern());
        int i3 = f147 + 31;
        f146 = i3 % 128;
        int i4 = i3 % 2;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m302() {
        int i = 2 % 2;
        int i2 = f147 + 83;
        f146 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f148.m2550();
            throw null;
        }
        String strM2550 = this.f148.m2550();
        int i3 = f146 + InterfaceC0280i1.d.b.g;
        f147 = i3 % 128;
        int i4 = i3 % 2;
        return strM2550;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m308() {
        int i = 2 % 2;
        int i2 = f146 + 19;
        f147 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = m310().optString(m305("㥎㤾\uea41\ue923釀옳노ᗴ", TextUtils.getOffsetBefore("", 0)).intern());
        int i4 = f146 + 1;
        f147 = i4 % 128;
        if (i4 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m312() {
        JSONObject jSONObjectM310;
        String strM305;
        int i = 2 % 2;
        int i2 = f147 + 87;
        f146 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM310 = m310();
            strM305 = m305("㌄㍱䲺ކ惍忞\ud982", (-1) >> TextUtils.lastIndexOf("", 'C', 1, 1));
        } else {
            jSONObjectM310 = m310();
            strM305 = m305("㌄㍱䲺ކ惍忞\ud982", (-1) - TextUtils.lastIndexOf("", '0', 0, 0));
        }
        return jSONObjectM310.optString(strM305.intern(), null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m311(String str) {
        JSONObject jSONObjectM310;
        String strM305;
        int i = 2 % 2;
        int i2 = f147 + 63;
        f146 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                jSONObjectM310 = m310();
                strM305 = m305("㌄㍱䲺ކ惍忞\ud982", ViewConfiguration.getMinimumFlingVelocity() >>> 17);
            } else {
                jSONObjectM310 = m310();
                strM305 = m305("㌄㍱䲺ކ惍忞\ud982", ViewConfiguration.getMinimumFlingVelocity() >> 16);
            }
            jSONObjectM310.put(strM305.intern(), str);
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = f147 + 85;
        f146 = i2 % 128;
        if (i2 % 2 == 0) {
            string = m310().toString();
            int i3 = 90 / 0;
        } else {
            string = m310().toString();
        }
        int i4 = f147 + 125;
        f146 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (getClass() != r5.getClass()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (getClass() != r5.getClass()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        return m302().equals(((com.ironsource.adqualitysdk.sdk.i.ae) r5).m302());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f147 + 9;
        int i3 = i2 % 128;
        f146 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i4 = i3 + 117;
            f147 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        if (m310() != null) {
            int i2 = f146 + 89;
            f147 = i2 % 128;
            int i3 = i2 % 2;
            return m310().hashCode();
        }
        int i4 = f146 + 121;
        f147 = i4 % 128;
        if (i4 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m306(ae aeVar) {
        int i = 2 % 2;
        int i2 = f147 + 125;
        f146 = i2 % 128;
        if (i2 % 2 != 0) {
            long jM300 = m300();
            long jM301 = aeVar.m300();
            if (jM300 < jM301) {
                return -1;
            }
            if (jM300 != jM301) {
                return 1;
            }
            int i3 = f146 + 47;
            f147 = i3 % 128;
            int i4 = i3 % 2;
            int iM303 = m303(aeVar);
            int i5 = f147 + InterfaceC0280i1.d.b.b;
            f146 = i5 % 128;
            int i6 = i5 % 2;
            return iM303;
        }
        m300();
        aeVar.m300();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m303(ae aeVar) {
        int i = 2 % 2;
        int i2 = f146 + 17;
        f147 = i2 % 128;
        int i3 = i2 % 2;
        long jM301 = m301();
        long jM302 = aeVar.m301();
        if (jM301 < jM302) {
            int i4 = f147 + 57;
            f146 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            return -1;
        }
        if (jM301 == jM302) {
            return 0;
        }
        int i6 = f147 + 79;
        f146 = i6 % 128;
        int i7 = i6 % 2;
        return 1;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m305(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f145, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f145));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
