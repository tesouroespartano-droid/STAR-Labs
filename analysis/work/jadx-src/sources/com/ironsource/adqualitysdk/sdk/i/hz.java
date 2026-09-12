package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class hz<T> extends cx implements ci, hr<T> {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2420 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2421 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2422 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2423 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2425 = 15;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field f2427;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map f2428;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hr f2429;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f2430;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Collection f2431;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f2426 = {'v', 't', 131, 'e', 'p', '{', 132, 'x', 130, 'U', 's', 'R', '~', 'r', '}', '\\', Ascii.MAX, 'X'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f2424 = 8392393791982110739L;

    hz(Field field, Object obj, hr hrVar) {
        this.f2427 = field;
        this.f2430 = obj;
        this.f2429 = hrVar;
    }

    hz(Collection collection, Object obj, hr hrVar) {
        this.f2431 = collection;
        this.f2430 = obj;
        this.f2429 = hrVar;
    }

    hz(Map map, Object obj, hr hrVar) {
        this.f2428 = map;
        this.f2430 = obj;
        this.f2429 = hrVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hr
    /* JADX INFO: renamed from: ﻐ */
    public final T mo2274() {
        int i = 2 % 2;
        int i2 = f2421 + 89;
        f2420 = i2 % 128;
        int i3 = i2 % 2;
        if (m2369()) {
            int i4 = f2420 + 75;
            f2421 = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    return (T) this.f2427.get(this.f2430);
                }
                int i5 = 51 / 0;
                return (T) this.f2427.get(this.f2430);
            } catch (Exception unused) {
            }
        } else if (m2367() || m2368()) {
            return (T) this.f2430;
        }
        int i6 = f2421 + 71;
        f2420 = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2366(T t) {
        int i = 2 % 2;
        int i2 = f2421 + 9;
        f2420 = i2 % 128;
        if (i2 % 2 == 0) {
            m2369();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m2369()) {
            try {
                this.f2427.set(this.f2430, t);
                int i3 = f2420 + 17;
                f2421 = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hr
    /* JADX INFO: renamed from: ﾒ */
    public final Field mo2275() {
        int i = 2 % 2;
        int i2 = f2420;
        int i3 = i2 + 121;
        f2421 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Field field = this.f2427;
        int i4 = i2 + 125;
        f2421 = i4 % 128;
        int i5 = i4 % 2;
        return field;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2369() {
        int i = 2 % 2;
        int i2 = f2420;
        int i3 = i2 + 7;
        f2421 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (this.f2427 != null) {
            return true;
        }
        int i4 = i2 + 27;
        f2421 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2367() {
        int i = 2 % 2;
        int i2 = f2421;
        int i3 = i2 + 87;
        f2420 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f2431 == null) {
            return false;
        }
        int i5 = i2 + 117;
        f2420 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m2368() {
        int i = 2 % 2;
        int i2 = f2420 + 63;
        int i3 = i2 % 128;
        f2421 = i3;
        int i4 = i2 % 2;
        if (this.f2428 == null) {
            return false;
        }
        int i5 = i3 + 11;
        f2420 = i5 % 128;
        return i5 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Collection m2363() {
        int i = 2 % 2;
        int i2 = f2420 + 23;
        f2421 = i2 % 128;
        int i3 = i2 % 2;
        Collection collection = this.f2431;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return collection;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Map m2361() {
        int i = 2 % 2;
        int i2 = f2420 + InterfaceC0280i1.d.b.i;
        f2421 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2428;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hr m2362() {
        int i = 2 % 2;
        int i2 = f2420 + 79;
        f2421 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2429;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Object m2360() {
        Object obj;
        int i = 2 % 2;
        int i2 = f2421 + 41;
        int i3 = i2 % 128;
        f2420 = i3;
        if (i2 % 2 == 0) {
            obj = this.f2430;
            int i4 = 66 / 0;
        } else {
            obj = this.f2430;
        }
        int i5 = i3 + 39;
        f2421 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        byte b = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2039060844:
                if (!str.equals(m2364("衴ꄫ\udadd\uf447ⴈ䚮灑ꧽ슘ﰢᗘ亃砡", ExpandableListView.getPackedPositionChild(0L) + 10590).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1661939189:
                if (!str.equals(m2365(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0082\u008e\u008f\u0085\u0083\u0089\u008f\u0092\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i2 = f2421 + 25;
                    f2420 = i2 % 128;
                    b = i2 % 2 != 0 ? (byte) 9 : (byte) 39;
                }
                break;
            case -1249356250:
                if (!str.equals(m2365(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0091\u0085\u0090\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 100472786:
                if (!str.equals(m2364("衺泉䄌▉᫇", TextUtils.getTrimmedLength("") + 58537).intern())) {
                    b = -1;
                } else {
                    int i3 = f2420 + 7;
                    f2421 = i3 % 128;
                    b = i3 % 2 != 0 ? (byte) 78 : (byte) 6;
                }
                break;
            case 429960040:
                if (!str.equals(m2365(null, TextUtils.getTrimmedLength("") + WorkQueueKt.MASK, null, "\u008f\u008d\u0088\u0083\u008e\u0082\u0086\u0086\u008d\u008c\u0089\u0088").intern())) {
                    b = -1;
                } else {
                    int i4 = f2421 + 3;
                    f2420 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 4;
                }
                break;
            case 700591008:
                if (!str.equals(m2364("衴\u206b\ud85d瀔⠆샰磘Ⴖ좏", 43037 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1406685743:
                if (!str.equals(m2364("衠訽賱躤腞茈薤须", 587 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1953253188:
                if (!str.equals(m2365(null, KeyEvent.getDeadChar(0, 0) + WorkQueueKt.MASK, null, "\u008b\u0086\u0082\u0088\u008a\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1967798203:
                if (!str.equals(m2365(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 2058833392:
                if (!str.equals(m2365(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u008b\u0086\u0082\u0088\u008a\u0089\u0088").intern())) {
                    b = -1;
                } else {
                    int i6 = f2421 + 81;
                    f2420 = i6 % 128;
                    int i7 = i6 % 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return mo2274();
            case 1:
                m2366(m1770(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m2369());
            case 3:
                return mo2275();
            case 4:
                return Boolean.valueOf(m2367());
            case 5:
                return m2363();
            case 6:
                return Boolean.valueOf(m2368());
            case 7:
                return m2361();
            case 8:
                return m2362();
            case 9:
                return m2360();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2365(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2426;
            int i2 = f2425;
            if (f2422) {
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
            if (f2423) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2364(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2434) {
            i.f2432 = i;
            char[] cArr2 = new char[cArr.length];
            i.f2433 = 0;
            while (i.f2433 < cArr.length) {
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2424);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
