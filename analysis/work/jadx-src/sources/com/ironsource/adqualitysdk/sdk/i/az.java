package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class az {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f617 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f618;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f624;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ag f625;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ISAdQualityAdListener f627;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f622 = {'~', 253, 261, 259, 252, 260, 259, 250, 258, 260, 251, 145, 299, 300, 303, 312, 304, 296, 294, 294, 303, '/', 'i', 'k', 'b', 'b', 'd', 'j', 'p', 'o', 'q', 's', 29};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f620 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f619 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f621 = 61161;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<ip> f626 = new HashSet();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<String> f623 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m680(az azVar, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f617 + InterfaceC0280i1.d.b.d;
        f618 = i2 % 128;
        int i3 = i2 % 2;
        azVar.m678(str, jSONObject);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ag m681(az azVar) {
        int i = 2 % 2;
        int i2 = f618;
        int i3 = i2 + 55;
        f617 = i3 % 128;
        int i4 = i3 % 2;
        ag agVar = azVar.f625;
        int i5 = i2 + 115;
        f617 = i5 % 128;
        int i6 = i5 % 2;
        return agVar;
    }

    public az(Handler handler, ag agVar) {
        this.f625 = agVar;
        this.f624 = handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m696(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f617 + 41;
        int i3 = i2 % 128;
        f618 = i3;
        int i4 = i2 % 2;
        this.f627 = iSAdQualityAdListener;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 27;
        f617 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m698(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 29;
        f617 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObject.optInt(ij.f2573);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int iOptInt = jSONObject.optInt(ij.f2573);
        ISAdQualityAdListener iSAdQualityAdListener = this.f627;
        if (iSAdQualityAdListener != null) {
            int i3 = f617 + 21;
            f618 = i3 % 128;
            int i4 = i3 % 2;
            String strOptString = jSONObject.optString(ij.f2572);
            if (i4 == 0) {
                iSAdQualityAdListener.adDisplayed(strOptString, ISAdQualityAdType.fromInt(iOptInt));
            } else {
                iSAdQualityAdListener.adDisplayed(strOptString, ISAdQualityAdType.fromInt(iOptInt));
                int i5 = 55 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m691(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618;
        int i3 = i2 + 115;
        f617 = i3 % 128;
        int i4 = i3 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = this.f627;
        if (iSAdQualityAdListener != null) {
            int i5 = i2 + 49;
            f617 = i5 % 128;
            int i6 = i5 % 2;
            iSAdQualityAdListener.adClosed(jSONObject.optString(ij.f2572), ISAdQualityAdType.fromInt(jSONObject.optInt(ij.f2573)));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m689(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f617 + 117;
        f618 = i2 % 128;
        int i3 = i2 % 2;
        m692(m684(new int[]{0, 11, 153, 0}, true, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000").intern(), jSONObject);
        int i4 = f617 + 43;
        f618 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m693(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 73;
        f617 = i2 % 128;
        m692((i2 % 2 == 0 ? m679("睕巤隲\uf435厖愾垲䂒⦆挊칚", 1052114915 >> (Process.myTid() - 49), "\ue307뗿\ude3e줌", "\u0000\u0000\u0000\u0000", (char) (1 / TextUtils.indexOf((CharSequence) "", ',', 1))) : m679("睕巤隲\uf435厖愾垲䂒⦆挊칚", 1052114915 - (Process.myTid() >> 22), "\ue307뗿\ude3e줌", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).intern(), jSONObject);
        int i3 = f618 + 115;
        f617 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m695(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 81;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        m692(m679("䝷荬휮ᕝ㛋䈺\uee27Ʞ\uf6f6⧾\udea7", (-776602284) - TextUtils.indexOf("", "", 0), "呮뗽パ㴀", "\u0000\u0000\u0000\u0000", (char) View.resolveSize(0, 0)).intern(), jSONObject);
        int i4 = f617 + 55;
        f618 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m685(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 13;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        m692(m684(new int[]{11, 10, 196, 7}, false, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001").intern(), jSONObject);
        int i4 = f617 + 45;
        f618 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m687(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + InterfaceC0280i1.d.b.d;
        f617 = i2 % 128;
        m692((i2 % 2 == 0 ? m684(new int[]{21, 11, 0, 4}, true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001") : m684(new int[]{21, 11, 0, 4}, true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001")).intern(), jSONObject);
        int i3 = f618 + 23;
        f617 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m686(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 99;
        f617 = i2 % 128;
        m692((i2 % 2 == 0 ? m679("᱘㋄댹渠瞓덹繽里碋\ua62e와ꢒ\uecb4訪\uf6c6", Gravity.getAbsoluteGravity(1, 0) * (-1175956063), "ꅛ\ue855撹鈎", "\u0000\u0000\u0000\u0000", (char) (24887 >>> (Process.myPid() + 113))) : m679("᱘㋄댹渠瞓덹繽里碋\ua62e와ꢒ\uecb4訪\uf6c6", (-1175956063) - Gravity.getAbsoluteGravity(0, 0), "ꅛ\ue855撹鈎", "\u0000\u0000\u0000\u0000", (char) ((Process.myPid() >> 22) + 3684))).intern(), jSONObject);
        int i3 = f618 + 51;
        f617 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final void m688(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f618 + 83;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        m692(m679("ꣂ턲괕呆㽑者ᓘ挙鷉\uea54䉩\udef3뚆", 379902576 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "炟ꓚ䠖䀗", "\u0000\u0000\u0000\u0000", (char) (5960 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern(), jSONObject);
        int i4 = f618 + 93;
        f617 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m692(final String str, final JSONObject jSONObject) {
        int i = 2 % 2;
        this.f624.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.az.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                az.m680(az.this, str, jSONObject);
            }
        });
        int i2 = f617 + 83;
        f618 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m678(final String str, JSONObject jSONObject) {
        int i = 2 % 2;
        m682(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ij.f2572, jSONObject.remove(ij.f2572));
            jSONObject2.put(ij.f2525, jSONObject.remove(ij.f2525));
            int i2 = f617 + 15;
            f618 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
        } catch (JSONException unused) {
        }
        this.f625.m378(str, jSONObject, jSONObject2, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f628 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f629 = 1578106410869328056L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f630;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i4 = 2 % 2;
                int i5 = f630 + 43;
                f628 = i5 % 128;
                int i6 = i5 % 2;
                if (str.equals(m699("糡氱ᵟ粀擭\u0c70ⓝ㺖幭䟆⥼ᦰ㥅", Process.myTid() >> 22).intern())) {
                    p.m2897(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            az.m681(az.this).m374();
                        }
                    });
                }
                int i7 = f630 + 97;
                f628 = i7 % 128;
                int i8 = i7 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m699(String str2, int i4) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2288) {
                    char[] cArrM2212 = h.m2212(f629, cArr, i4);
                    h.f2289 = 4;
                    while (h.f2289 < cArrM2212.length) {
                        h.f2290 = h.f2289 - 4;
                        cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f629));
                        h.f2289++;
                    }
                    str3 = new String(cArrM2212, 4, cArrM2212.length - 4);
                }
                return str3;
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m690(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f617 + 23;
        f618 = i2 % 128;
        if (i2 % 2 != 0) {
            m697(str, str2, str3, str4, null, true);
        } else {
            m697(str, str2, str3, str4, null, false);
        }
        int i3 = f618 + 83;
        f617 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m697(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f623) {
            String string = new StringBuilder().append(str3).append(m684(new int[]{32, 1, 0, 0}, true, "\u0000").intern()).append(str2).toString();
            if (!this.f623.contains(string) || z || ar.m480().mo506()) {
                this.f623.add(string);
                if (Math.random() * 100.0d < m683()) {
                    JSONObject jSONObjectM367 = ag.m367(str, str2, str3, str4, jSONObject);
                    m682(m679("笖⇃⡮⒇튥㤦㢻厧", TextUtils.lastIndexOf("", '0', 0) + 1, "\udb5c椺\ua8dc偬", "\u0000\u0000\u0000\u0000", (char) KeyEvent.getDeadChar(0, 0)).intern(), jSONObjectM367);
                    this.f625.m373(m679("笖⇃⡮⒇튥㤦㢻厧", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\udb5c椺\ua8dc偬", "\u0000\u0000\u0000\u0000", (char) Drawable.resolveOpacity(0, 0)).intern(), jSONObjectM367);
                    return;
                }
                n.m2867(m679("\ue1d4꼮㘷Ꞡᘺ燜锾㤿베羬矍", (ViewConfiguration.getScrollDefaultDelay() >> 16) - 24251621, "ᯟ跳壾梹", "\u0000\u0000\u0000\u0000", (char) View.combineMeasuredStates(0, 0)).intern(), m679("㭖뼁諟꘏\uf6d9槲䱦რ鯋\ue51dﴐ䶐ⲉણု洱妰䪪ዾ童涖\ue325䗛쫥䳢然ጛ蜕䲱哐㥌캂샰\uf79e䋏鐨坪㵑㶰詃⟊暄ᙢᑾ讅⺯卪耿몳", (-346976734) - TextUtils.getOffsetBefore("", 0), "⋀冎뗫ⴝ", "\u0000\u0000\u0000\u0000", (char) TextUtils.getCapsMode("", 0, 0)).intern());
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m682(String str, JSONObject jSONObject) {
        JSONObject jSONObjectMo638;
        int i = 2 % 2;
        Iterator it = new HashSet(this.f626).iterator();
        int i2 = f618 + 43;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = f617 + 13;
            f618 = i4 % 128;
            if (i4 % 2 != 0) {
                jSONObjectMo638 = ((ip) it.next()).mo638(str, jSONObject);
                int i5 = 93 / 0;
                if (jSONObjectMo638 != null) {
                    kd.m2828(jSONObject, jSONObjectMo638);
                }
            } else {
                jSONObjectMo638 = ((ip) it.next()).mo638(str, jSONObject);
                if (jSONObjectMo638 != null) {
                    kd.m2828(jSONObject, jSONObjectMo638);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m694(ip ipVar) {
        int i = 2 % 2;
        int i2 = f618 + 97;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        this.f626.add(ipVar);
        int i4 = f618 + 83;
        f617 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return com.ironsource.adqualitysdk.sdk.i.ar.m480().mo497();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.az.f617 + 75;
        com.ironsource.adqualitysdk.sdk.i.az.f618 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return 100.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m480().mo498() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m480().mo498() == false) goto L9;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static double m683() {
        int i = 2 % 2;
        int i2 = f617 + 49;
        f618 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m684(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (j.f2691) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f622, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                j.f2692 = 0;
                char c = 0;
                while (j.f2692 < i2) {
                    if (bArr[j.f2692] == 1) {
                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                    } else {
                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                    }
                    c = cArr2[j.f2692];
                    j.f2692++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr4[j.f2692] = cArr[(i2 - j.f2692) - 1];
                    j.f2692++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                j.f2692 = 0;
                while (j.f2692 < i2) {
                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                    j.f2692++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m679(String str, int i, String str2, String str3, char c) {
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
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            g.f2156 = 0;
            while (g.f2156 < length) {
                int i2 = (g.f2156 + 2) % 4;
                int i3 = (g.f2156 + 3) % 4;
                g.f2154 = (char) (((cArr4[g.f2156 % 4] * 32718) + cArr5[i2]) % SupportMenu.USER_MASK);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / SupportMenu.USER_MASK);
                cArr4[i3] = g.f2154;
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f620) ^ ((long) f619)) ^ ((long) f621));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
