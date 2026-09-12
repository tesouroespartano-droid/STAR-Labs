package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cp {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1501 = true;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1502 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1503 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1504 = {314, 301, 320, 309, 322, 305, 270, 318, 304, 307, 273, 282, 269, 280, 272, 277, 287};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f1505 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1506 = 204;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<co> f1507 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private dm f1508;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private db f1509;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private az f1510;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Context f1511;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private bg f1512;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dh f1513;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m1685(cp cpVar) {
        int i = 2 % 2;
        int i2 = f1502 + 37;
        int i3 = i2 % 128;
        f1503 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<co> list = cpVar.f1507;
        if (i4 != 0) {
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 15;
        f1502 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public cp(Context context, dh dhVar, az azVar, db dbVar, bg bgVar) {
        this.f1513 = dhVar;
        this.f1510 = azVar;
        this.f1509 = dbVar;
        this.f1512 = bgVar;
        this.f1511 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1699() {
        int i = 2 % 2;
        Iterator<co> it = this.f1507.iterator();
        while (it.hasNext()) {
            int i2 = f1502 + 15;
            f1503 = i2 % 128;
            int i3 = i2 % 2;
            it.next().m1623();
        }
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                cp.m1685(cp.this).clear();
            }
        });
        int i4 = f1503 + 67;
        f1502 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m1684(dm dmVar) {
        int i = 2 % 2;
        int i2 = f1502;
        int i3 = i2 + 19;
        f1503 = i3 % 128;
        int i4 = i3 % 2;
        if (dmVar != null) {
            this.f1508 = dmVar;
        }
        int i5 = i2 + 27;
        f1503 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized List<co> m1681() {
        int i = 2 % 2;
        int i2 = f1502 + 43;
        f1503 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1507 != null) {
            ArrayList arrayList = new ArrayList(this.f1507);
            int i4 = f1502 + 19;
            f1503 = i4 % 128;
            int i5 = i4 % 2;
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i6 = f1502 + 89;
        f1503 = i6 % 128;
        if (i6 % 2 == 0) {
            return arrayList2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1700() {
        int i = 2 % 2;
        dm dmVarM1901 = this.f1513.m1901();
        if (dmVarM1901 != null) {
            m1688(dmVarM1901);
            if (this.f1512.mo804()) {
                jt.m2703(dmVarM1901);
            }
        }
        this.f1513.m1902().m2012(m1687(null, (ViewConfiguration.getPressedStateDuration() >> 16) + WorkQueueKt.MASK, null, "\u0086\u008a\u0089\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), this.f1512);
        Iterator<String> it = this.f1513.m1900().keySet().iterator();
        int i2 = f1503 + 87;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = f1503 + 3;
            f1502 = i4 % 128;
            int i5 = i4 % 2;
            dp dpVar = this.f1513.m1900().get(it.next());
            if (!dpVar.m2003()) {
                m1683(new co(this, this.f1509, this.f1512, m1682(dpVar), this.f1513.m1902()));
            }
        }
        m1686(this.f1513, this.f1512);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs m1682(dp dpVar) {
        int i = 2 % 2;
        int i2 = f1502 + 53;
        int i3 = i2 % 128;
        f1503 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (dpVar == null) {
            int i4 = i3 + 53;
            f1502 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        return new hs(dpVar, m1682(this.f1513.m1900().get(dpVar.m2002())));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1703() {
        int i = 2 % 2;
        int i2 = f1503 + 121;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        dh dhVar = this.f1513;
        if (i3 != 0) {
            return dhVar.m1904();
        }
        dhVar.m1904();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1702() {
        int i = 2 % 2;
        int i2 = f1502 + 105;
        f1503 = i2 % 128;
        int i3 = i2 % 2;
        String strM1906 = this.f1513.m1906();
        int i4 = f1503 + 89;
        f1502 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1906;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1698() {
        int i = 2 % 2;
        int i2 = f1502 + 79;
        f1503 = i2 % 128;
        int i3 = i2 % 2;
        String strM1907 = this.f1513.m1907();
        int i4 = f1503 + 57;
        f1502 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM1907;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1696() {
        int i = 2 % 2;
        int i2 = f1502 + 113;
        f1503 = i2 % 128;
        int i3 = i2 % 2;
        bg bgVar = this.f1512;
        if (i3 == 0) {
            return bgVar.m816();
        }
        bgVar.m816();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1693() {
        String strMo820;
        int i = 2 % 2;
        int i2 = f1502 + 47;
        f1503 = i2 % 128;
        if (i2 % 2 != 0) {
            strMo820 = this.f1512.mo820();
            int i3 = 34 / 0;
        } else {
            strMo820 = this.f1512.mo820();
        }
        int i4 = f1502 + InterfaceC0280i1.d.b.i;
        f1503 = i4 % 128;
        if (i4 % 2 == 0) {
            return strMo820;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1697() {
        int i = 2 % 2;
        String strM1696 = m1696();
        if ((!TextUtils.isEmpty(strM1696)) && !m1687(null, Color.green(0) + WorkQueueKt.MASK, null, "\u008f\u008b\u008e\u0087\u008d\u008c\u008b").intern().equals(strM1696)) {
            int i2 = f1502 + 21;
            f1503 = i2 % 128;
            int i3 = i2 % 2;
            if (!m1687(null, (ViewConfiguration.getEdgeSlop() >> 16) + WorkQueueKt.MASK, null, "\u008f\u008b\u008e\u0087\u008d\u0091\u0090\u008f").intern().equals(strM1696)) {
                return this.f1513.m1908(m1696());
            }
        }
        int i4 = f1502 + 5;
        f1503 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m1695() {
        int i = 2 % 2;
        int i2 = f1503 + InterfaceC0280i1.d.b.b;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        String strM1903 = this.f1513.m1903();
        int i4 = f1502 + InterfaceC0280i1.d.b.b;
        f1503 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1903;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1694() {
        int i = 2 % 2;
        int i2 = f1503 + 47;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        String strM1905 = this.f1513.m1905();
        int i4 = f1502 + 105;
        f1503 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1905;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1701(String str, List<Object> list) {
        Iterator<co> it;
        int i = 2 % 2;
        int i2 = f1503 + 89;
        f1502 = i2 % 128;
        if (i2 % 2 == 0) {
            it = m1681().iterator();
            int i3 = 44 / 0;
        } else {
            it = m1681().iterator();
        }
        int i4 = f1503 + 49;
        f1502 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = f1503 + 83;
            f1502 = i6 % 128;
            int i7 = i6 % 2;
            it.next().m1631(str, list);
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final Context m1689() {
        int i = 2 % 2;
        int i2 = f1503 + 37;
        int i3 = i2 % 128;
        f1502 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Context context = this.f1511;
        int i4 = i3 + InterfaceC0280i1.d.b.d;
        f1503 = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1683(co coVar) {
        int i = 2 % 2;
        int i2 = f1502 + 41;
        f1503 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f1507.add(coVar);
            super.hashCode();
            throw null;
        }
        this.f1507.add(coVar);
        int i3 = f1503 + 65;
        f1502 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1688(dm dmVar) {
        int i = 2 % 2;
        int i2 = f1503 + 3;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        m1684(dmVar);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    protected final synchronized dm m1690() {
        dm dmVar;
        int i = 2 % 2;
        int i2 = f1503;
        int i3 = i2 + 11;
        f1502 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        dmVar = this.f1508;
        int i4 = i2 + InterfaceC0280i1.d.b.d;
        f1502 = i4 % 128;
        int i5 = i4 % 2;
        return dmVar;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final az m1692() {
        int i = 2 % 2;
        int i2 = f1502 + 85;
        int i3 = i2 % 128;
        f1503 = i3;
        int i4 = i2 % 2;
        az azVar = this.f1510;
        int i5 = i3 + 37;
        f1502 = i5 % 128;
        int i6 = i5 % 2;
        return azVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[Catch: all -> 0x0059, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000f, B:15:0x0022, B:19:0x0037, B:21:0x003d, B:18:0x0036, B:12:0x001b, B:13:0x001c, B:8:0x0015), top: B:28:0x0002, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[Catch: all -> 0x0059, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000f, B:15:0x0022, B:19:0x0037, B:21:0x003d, B:18:0x0036, B:12:0x001b, B:13:0x001c, B:8:0x0015), top: B:28:0x0002, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0059, LOOP:0: B:19:0x0037->B:21:0x003d, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000f, B:15:0x0022, B:19:0x0037, B:21:0x003d, B:18:0x0036, B:12:0x001b, B:13:0x001c, B:8:0x0015), top: B:28:0x0002, inners: #1 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m1686(dh dhVar, bg bgVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = f1502 + 17;
        f1503 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
            if (bgVar.mo802()) {
                i = f1502 + 71;
                f1503 = i % 128;
                if (i % 2 != 0) {
                    int i5 = 2 % 2;
                }
                for (co coVar : m1681()) {
                    dhVar.m1902().m2009().m2012(coVar.m1638().m2286(), coVar);
                }
            }
        } else if (bgVar.mo802()) {
            i = f1502 + 71;
            f1503 = i % 128;
            if (i % 2 != 0) {
                int i6 = 2 % 2;
            }
            while (r5.hasNext()) {
                dhVar.m1902().m2009().m2012(coVar.m1638().m2286(), coVar);
            }
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized boolean m1691() {
        boolean zMo802;
        int i = 2 % 2;
        int i2 = f1502 + 117;
        f1503 = i2 % 128;
        int i3 = i2 % 2;
        zMo802 = this.f1512.mo802();
        int i4 = f1503 + 55;
        f1502 = i4 % 128;
        int i5 = i4 % 2;
        return zMo802;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1687(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1504;
            int i2 = f1506;
            if (f1501) {
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
            if (f1505) {
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
