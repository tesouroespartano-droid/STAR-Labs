package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class cq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f1515;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ia.b f1516;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f1517;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cm f1518;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ia m1710(hx hxVar) {
        return this.f1516.m2394(hxVar, this.f1515, this.f1517);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cm m1709() {
        return this.f1518;
    }

    public static class b extends cx implements ci {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1519 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1520 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cm.d f1524;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cq f1525;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f1522 = {1639025387, -486464156, 1280213464, -1678045071, 1936264751, -1768222748, 854213132, 773523649, -191402678, -1209781973, -1968592395, 254219338, 638257566, 443938262, 980039351, 539407075, 1650331391, 1938509635};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f1521 = 6;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f1523 = {'s', 'e', 't', 'M', 'i', 'n', 'D', 'p', 'h', 'F', 'o', 'r', 'S', 'u', 'C', 'l', 'a', 'L', 'm', 'c', 'I', 'A', 'y', 'O', 'b', 'j', 'E', 'q', 'k', 'd', 'v', 'w', 'x', 'z', '{', '|'};

        public b(List<String> list, int i) {
            cq cqVar = new cq();
            this.f1525 = cqVar;
            cqVar.f1516 = new ia.b();
            this.f1525.f1515 = list;
            this.f1525.f1517 = i;
            this.f1524 = new cm.d();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private cq m1713() {
            int i = 2 % 2;
            int i2 = f1520 + 33;
            f1519 = i2 % 128;
            int i3 = i2 % 2;
            this.f1525.f1518 = this.f1524.m1573();
            cq cqVar = this.f1525;
            int i4 = f1520 + 43;
            f1519 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return cqVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:67:0x0296  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo813(String str, List<Object> list, cl clVar) {
            int i = 2 % 2;
            byte b = 5;
            switch (str.hashCode()) {
                case -1930334554:
                    if (!str.equals(m1712("\u0001\u0002\u0000\u000e\u0004\r\u0007\u0017\u000e\u001a\u0000\u0004\r\nÊ", (byte) (87 - (Process.myPid() >> 22)), 14 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case -1826216039:
                    if (str.equals(m1712("\u0004\u0014\r\u0007\u001b\u001c\u000e\u0011\f\u0003", (byte) (Process.getGidForName("") + 83), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        int i2 = f1519 + 31;
                        f1520 = i2 % 128;
                        b = i2 % 2 != 0 ? (byte) 14 : (byte) 39;
                    } else {
                        b = -1;
                    }
                    break;
                case -994397843:
                    if (!str.equals(m1712("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0004\u000f\u0006\u0001", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 38), (ViewConfiguration.getLongPressTimeout() >> 16) + 18).intern())) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -941967812:
                    if (!str.equals(m1712("\u0001\u0002\u0000\u000e\u0013\r\u0005\u0007\u000f\u0010\f\u0004\u0005\f\u0000\u0016\u0005\u0003", (byte) (TextUtils.lastIndexOf("", '0') + 55), 17 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                        b = -1;
                    } else {
                        int i3 = f1520 + 91;
                        f1519 = i3 % 128;
                        if (i3 % 2 == 0) {
                            b = 3;
                        }
                    }
                    break;
                case -770599694:
                    if (!str.equals(m1711(new int[]{-1712499672, 1035337023, 512383475, 211083433, 1796632348, 1252564838, -1330450410, -908146951, 737551482, -907123244}, 19 - Color.green(0)).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -235079533:
                    if (str.equals(m1712("\u0001\u0002\b\u0014\r\u0016\u0007\u0002\u001b\u0015\u0011\u0015\u0019\u001a\u0007\u0019\u0003\u0001", (byte) (76 - ((Process.getThreadPriority(0) + 20) >> 6)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    break;
                case -213689933:
                    if (!str.equals(m1711(new int[]{1613809954, -1597743278, 1922730068, 1912322040, 834237614, 847175318, -1711555481, -699622650, 529440716, -1675910737, 1818430629, -822017895}, 23 - Color.red(0)).intern())) {
                        b = -1;
                    }
                    break;
                case 46561673:
                    if (!str.equals(m1712("\u0001\u0002\u0000\u000e\u0004\r\u0007\u0017\u000e\u001a\u0003\u0017\u0096\u0096\u0016\u001c\u0097", (byte) (36 - View.combineMeasuredStates(0, 0)), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.VT;
                    }
                    break;
                case 94094958:
                    if (!str.equals(m1712("\u0019\f\u0003\u0010\u009f", (byte) (59 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5).intern())) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 841006591:
                    if (!str.equals(m1711(new int[]{-1712499672, 1035337023, 512383475, 211083433, 1796632348, 1252564838, -1700344328, -2077278309, -1205596503, 263479335, 1296280033, -2029356226, 1542749355, 1214571626}, 25 - Color.green(0)).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 902024524:
                    if (!str.equals(m1711(new int[]{-1782980321, 1480065151, -1270464080, -1362904389, -756819887, -541875740}, 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        int i4 = f1520 + 31;
                        f1519 = i4 % 128;
                        int i5 = i4 % 2;
                        b = Ascii.SI;
                    }
                    break;
                case 923334616:
                    if (!str.equals(m1712("\u0019\u0013\u0001\u0003\u0006\u0016\u0014\u000e\u0007\u0019\u001b\u0004\u0002\u0003\t\u000bÅ", (byte) (TextUtils.indexOf("", "") + 97), Gravity.getAbsoluteGravity(0, 0) + 17).intern())) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 1080975014:
                    if (!str.equals(m1712("\u0001\u0002\u0000\u000e\u0004\r\u0007\u0017\u000e\u001a\u0002\u0011\t\u0010\r\u0003\u0014\u0001\n\u0010\u0000\u0001", (byte) (22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1083215325:
                    if (!str.equals(m1711(new int[]{-1980405429, -690502745, -919045835, -831571886, -1539913467, 704021771, 144660144, 392404391}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.CR;
                    }
                    break;
                case 1202614773:
                    if (!str.equals(m1711(new int[]{391012521, -1896012566, -124332674, -1343938795, -1418808403, 1785563379, 1419049426, -419011764, 81100935, -1966645931, 1542749355, 1214571626}, 21 - View.MeasureSpec.getMode(0)).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1689765750:
                    if (!str.equals(m1711(new int[]{-1712499672, 1035337023, 512383475, 211083433, 1796632348, 1252564838, -1700961887, -7223235, 1712107120, -1575145062, -301560180, -387531530, 424742218, 7189488}, 27 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b = -1;
                    } else {
                        int i6 = f1519 + 91;
                        f1520 = i6 % 128;
                        int i7 = i6 % 2;
                        b = 4;
                    }
                    break;
                case 1766229249:
                    if (!str.equals(m1712("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\r\u000e\r\u0007\b\u0011\u0010\u0011®®\u0002\u0001", (byte) (TextUtils.getOffsetAfter("", 0) + 59), 26 - View.resolveSize(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1833576080:
                    if (!str.equals(m1712("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0017\t\n\u0011\u0012\u0004", (byte) (38 - (ViewConfiguration.getEdgeSlop() >> 16)), 20 - View.combineMeasuredStates(0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    this.f1525.f1516.m2397(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f1525.f1516.m2395(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f1525.f1516.m2393(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 3:
                    this.f1525.f1516.m2389(((Integer) m1770(list, 0, Integer.class)).intValue());
                    int i8 = f1519 + 9;
                    f1520 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 72 / 0;
                    }
                    return this;
                case 4:
                    this.f1525.f1516.m2400(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 5:
                    this.f1525.f1516.m2396(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f1525.f1516.m2392(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f1525.f1516.m2391(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 8:
                    this.f1525.f1516.m2388(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 9:
                    this.f1525.f1516.m2401(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 10:
                    this.f1525.f1516.m2387(((Integer) m1770(list, 0, Integer.class)).intValue());
                    return this;
                case 11:
                    this.f1525.f1516.m2398(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 12:
                    this.f1525.f1516.m2386(((Boolean) m1770(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 13:
                    this.f1524.m1574((Class) m1770(list, 0, Class.class));
                    return this;
                case 14:
                    this.f1524.m1572((Class) m1770(list, 0, Class.class));
                    return this;
                case 15:
                    this.f1524.m1570((Class) m1770(list, 0, Class.class));
                    return this;
                case 16:
                    du duVar = (du) m1770(list, 0, du.class);
                    this.f1524.m1571(duVar);
                    this.f1525.f1516.m2390(duVar);
                    return this;
                case 17:
                    return m1713();
                default:
                    int i10 = f1519 + 105;
                    f1520 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return null;
                    }
                    throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1711(int[] iArr, int i) {
            String str;
            synchronized (c.f1230) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1522.clone();
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m1712(String str, byte b, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f2043) {
                char[] cArr2 = f1523;
                char c = f1521;
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
}
