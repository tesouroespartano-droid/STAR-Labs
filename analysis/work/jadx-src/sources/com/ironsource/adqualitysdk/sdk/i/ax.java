package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.InterfaceC0280i1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ax extends ar.AnonymousClass3 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f600 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f601 = 19979;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f602 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f603;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f604;

    public ax(aw awVar) {
        m516(awVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m667() {
        int i = 2 % 2;
        int i2 = f602 + 23;
        f604 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM662 = m515().m662();
        int i4 = f602 + 31;
        f604 = i4 % 128;
        int i5 = i4 % 2;
        return listM662;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m671() {
        int i = 2 % 2;
        int i2 = f604 + 119;
        f602 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m515().m664();
            throw null;
        }
        int iM664 = m515().m664();
        int i3 = f604 + 115;
        f602 = i3 % 128;
        if (i3 % 2 != 0) {
            return iM664;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m669() {
        int i = 2 % 2;
        int i2 = f604 + 61;
        f602 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM661 = m515().m661();
        int i4 = f602 + InterfaceC0280i1.d.b.d;
        f604 = i4 % 128;
        if (i4 % 2 == 0) {
            return listM661;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m668() {
        int i = 2 % 2;
        int i2 = f602 + 53;
        f604 = i2 % 128;
        if (i2 % 2 != 0) {
            m515().m659();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int iM659 = m515().m659();
        int i3 = f604 + 123;
        f602 = i3 % 128;
        int i4 = i3 % 2;
        return iM659;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m670() {
        int i = 2 % 2;
        int i2 = f602 + 1;
        f604 = i2 % 128;
        boolean zOptBoolean = i2 % 2 != 0 ? m514().optBoolean(m665("\udb23╤鈜嗎", (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), "쳷\uf571㩈솎", "\u0000\u0000\u0000\u0000", (char) (36410 / Color.green(0))).intern(), false) : m514().optBoolean(m665("\udb23╤鈜嗎", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "쳷\uf571㩈솎", "\u0000\u0000\u0000\u0000", (char) (36410 - Color.green(0))).intern(), true);
        int i3 = f604 + 95;
        f602 = i3 % 128;
        int i4 = i3 % 2;
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m666() {
        int i = 2 % 2;
        int i2 = f602 + 31;
        f604 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOptBoolean = m514().optBoolean(m665("私梦⌮鋓", ExpandableListView.getPackedPositionType(0L), "ӫ䆏詔ꡝ", "\u0000\u0000\u0000\u0000", (char) (23945 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), true);
        int i4 = f602 + 11;
        f604 = i4 % 128;
        if (i4 % 2 == 0) {
            return zOptBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m665(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f603) ^ ((long) f600)) ^ ((long) f601));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
