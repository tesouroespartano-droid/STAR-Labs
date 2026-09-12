package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import androidx.core.internal.view.SupportMenu;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ak {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f338 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f339 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f340 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f341 = 18093;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f342;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m433(Context context) {
        int i = 2 % 2;
        int i2 = f338 + 29;
        f339 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objInvoke = kc.m2804(m435(), m436("ކ黣芑쳖ꉂ橙\uf5fc\uf42c渘ࢄ㤀", 525665403 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "竤唄戟鄽", "\u0000\u0000\u0000\u0000", (char) Color.red(0)).intern(), Arrays.asList(context)).invoke(null, context);
            int i4 = f339 + 75;
            f338 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return objInvoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m434(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f339 + 73;
        f338 = i2 % 128;
        int i3 = i2 % 2;
        try {
            kc.m2804(obj, m436("ݔ宭⣂鄈妪鳎ቘ朥蛠\uf303鷍시Ⳗ쁰阂갘", Process.myTid() >> 22, "꽰ࡷ鴿脄", "\u0000\u0000\u0000\u0000", (char) (1181 - (Process.myTid() >> 22))).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            int i4 = f338 + 63;
            f339 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m437(Object obj, BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = f339 + 17;
        f338 = i2 % 128;
        int i3 = i2 % 2;
        try {
            kc.m2804(obj, m436("㙘숡짨\ue32e\uf132䀨棠\uf231뫧Ⰽ争锆\uf46f鷜ؒ뼯䯾褟", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "ꛭ췈폝麫", "\u0000\u0000\u0000\u0000", (char) (43987 - TextUtils.indexOf("", "", 0, 0))).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i4 = f338 + 105;
            f339 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m435() {
        int i = 2 % 2;
        int i2 = f338 + 11;
        f339 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM2807 = kc.m2807(m436("럎憐暒ₖS\uf077誹귚᧓\uddaaⅠ뻋껇据麠鎰\uf4b6峵\u0b79겲鹏ᕞ\uf336辊ऌ\uf8fd筶ꧮ\udd94纒柕劧劷鶫\uef10\udac8\udbaa\uf36eר∹\uec1e莖鰬儼佁䐌秔죓䛤铉䂂퀔沨脟٢ࢇ妞햴ݫ圶", (Process.getThreadPriority(0) + 20) >> 6, "膘¶슗镂", "\u0000\u0000\u0000\u0000", (char) ExpandableListView.getPackedPositionType(0L)).intern(), false);
        int i4 = f338 + 1;
        f339 = i4 % 128;
        if (i4 % 2 != 0) {
            return clsM2807;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m436(String str, int i, String str2, String str3, char c) {
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
                cArr6[g.f2156] = (char) (((((long) (cArr4[i3] ^ cArr3[g.f2156])) ^ f340) ^ ((long) f342)) ^ ((long) f341));
                g.f2156++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
