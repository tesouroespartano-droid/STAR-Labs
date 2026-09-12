package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class au {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f568 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f570 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f572 = 89;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private b f573;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f574;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f575;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f571 = {'v', 63026, 43900, 'C', 63027, 60630, 58234, 55573, 53167, 50780, 48363, 45714, 43384, 40945, 38279, 35889, 33486, 31076, 28417, 25987, 23667, 21014, 18610, 16217, 13803};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f569 = -2593049068237752740L;

    enum b {
        f582,
        f585,
        f583,
        f584;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f577 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f578 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f579;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f580;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static long f581;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static void m649() {
            f581 = 0L;
            f579 = -1114840154;
            f580 = (char) 0;
        }

        public static b valueOf(String str) {
            int i = 2 % 2;
            int i2 = f577 + 95;
            f578 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i3 == 0) {
                super.hashCode();
                throw null;
            }
            int i4 = f577 + 35;
            f578 = i4 % 128;
            if (i4 % 2 != 0) {
                return bVar;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f578 + 107;
            f577 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            b[] bVarArr = (b[]) values().clone();
            int i3 = f578 + 119;
            f577 = i3 % 128;
            if (i3 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            m649();
            int i = f577 + 81;
            f578 = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m650(String str, int i, String str2, String str3, char c) {
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
                    cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f581) ^ ((long) f579)) ^ ((long) f580));
                    g.f2156++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    public au(JSONObject jSONObject) {
        this.f573 = m643(jSONObject.optString(m642("\t\u0000\ufff5\u0004", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, TextUtils.lastIndexOf("", '0', 0, 0) + InterfaceC0280i1.c.b.c, false, 4 - Gravity.getAbsoluteGravity(0, 0)).intern()));
        this.f574 = m645(jSONObject.optString(m644(ViewConfiguration.getTapTimeout() >> 16, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
        this.f575 = m646(jSONObject.optString(m642("\u0007\u0003\u0002\u0006\ufff9\ufff5", 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 197, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 6).intern()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static b m643(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b2 = 0;
        if (iHashCode != 92611485) {
            if (iHashCode != 93621297) {
                if (iHashCode == 96946943 && str.equals(m642("\n\ufffb\u000e\ufff7\ufff9", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 195, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4).intern())) {
                    int i2 = f568 + 27;
                    f570 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m642("\u0004\u0001\ufffa\ufff7\f", 4 - View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionGroup(0L) + 196, true, Gravity.getAbsoluteGravity(0, 0) + 5).intern())) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m642("\ufff8￼\r\u0006\ufff9", 1 - View.combineMeasuredStates(0, 0), Color.blue(0) + 194, true, 5 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
            int i4 = f570 + 53;
            f568 = i4 % 128;
            int i5 = i4 % 2;
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return b.f584;
        }
        if (b2 != 1) {
            return b2 != 2 ? b.f582 : b.f583;
        }
        return b.f585;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> m645(String str) {
        int i = 2 % 2;
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            arrayList = Arrays.asList(str.split(m644((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (43857 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()));
            int i2 = f568 + 11;
            f570 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f568 + 19;
        f570 = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m646(String str) {
        int i = 2 % 2;
        int i2 = f568 + InterfaceC0280i1.d.b.i;
        f570 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(str);
            super.hashCode();
            throw null;
        }
        if (!TextUtils.isEmpty(str) && !str.equals(m642("\ufffe\u0007\u0000\ufffe", 3 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 199, true, 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
            return str;
        }
        int i3 = f570 + 23;
        f568 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.au$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static final /* synthetic */ int[] f576;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f576 = iArr;
            try {
                iArr[b.f582.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f576[b.f584.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f576[b.f583.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f576[b.f585.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m647(String str) {
        int i = 2 % 2;
        int i2 = f568 + 7;
        f570 = i2 % 128;
        int i3 = i2 % 2;
        try {
            int i4 = AnonymousClass3.f576[this.f573.ordinal()];
            if (i4 == 1) {
                return true;
            }
            if (i4 == 2) {
                return this.f574.contains(str);
            }
            if (i4 != 3) {
                if (i4 != 4) {
                }
                return false;
            }
            if (this.f574.size() > 0) {
                int i5 = f570 + 73;
                f568 = i5 % 128;
                int i6 = i5 % 2;
                return kb.m2790(str, this.f574.get(0)) < 0;
            }
            if (this.f574.size() <= 0 || kb.m2790(str, this.f574.get(0)) < 0) {
                return false;
            }
            int i7 = f568 + 1;
            f570 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        } catch (Exception e) {
            jz.m2766(m644(3 - Color.green(0), (ViewConfiguration.getScrollBarSize() >> 8) + 22, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m642("\u0011￤\u0004\u000b\u0001\u0000\u0012\b￣\u0003\u000b\u0014\u000e\u0007\u0012\uffbf\r\b\uffbf\u0011\u000e\u0011", ExpandableListView.getPackedPositionGroup(0L) + 2, ExpandableListView.getPackedPositionGroup(0L) + 186, true, TextUtils.indexOf("", "", 0) + 22).intern(), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m648() {
        int i = 2 % 2;
        int i2 = f570 + 31;
        int i3 = i2 % 128;
        f568 = i3;
        int i4 = i2 % 2;
        String str = this.f575;
        int i5 = i3 + 97;
        f570 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m642(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f572);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m644(int i, int i2, char c) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f637) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.b.f638 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.b.f638 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.b.f638] = (char) ((((long) f571[com.ironsource.adqualitysdk.sdk.i.b.f638 + i]) ^ (((long) com.ironsource.adqualitysdk.sdk.i.b.f638) * f569)) ^ ((long) c));
                com.ironsource.adqualitysdk.sdk.i.b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
