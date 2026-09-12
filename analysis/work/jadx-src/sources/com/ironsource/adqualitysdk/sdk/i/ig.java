package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0280i1;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ig {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2478 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2479 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2480 = -7389798734334987105L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2450(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2479 + 29;
        f2478 = i2 % 128;
        int i3 = i2 % 2;
        n.m2867(str, str2);
        int i4 = f2479 + 125;
        f2478 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2451(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2479 + 99;
        f2478 = i2 % 128;
        int i3 = i2 % 2;
        n.m2887(str, str2);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2447(Context context) {
        String strIntern;
        String strM2448;
        int i = 2 % 2;
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2448("ᯈ᠈ꮮ埶ᮩ\uecf9䋴詙짛\udf7aၰ\ue7f0뽙臻", (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern());
        if (string == null) {
            int i2 = f2479 + 59;
            f2478 = i2 % 128;
            if (i2 % 2 == 0) {
                strIntern = m2448("\uf89b弮䐨褂\uf8d2ꯢ굝咚⪢顣ￓ㥻尬웛쩭ழ辚㍏⓿\udc37넸應睧꺽\ue492乁䇒猹ᘖ볏鱫䖵㦚\ue943\ueee9ᘦ欈", -TextUtils.lastIndexOf("", '}')).intern();
                strM2448 = m2448("꽵⬼\uf66b晥꼶\udfccἠ믔絭\uec49䷶홈\u0bad닍砸\ue4c4\ud862䝇雹㍵\ue6cbᗷ씗䇧덐㩳\uf39e鱥䇙좕\u2e6dꫵ湢鵖岧弄㲵ꌤ謐ា쥌熵릐∨韈د푝点ꑅ퓡", View.resolveSize(1, 0));
            } else {
                strIntern = m2448("\uf89b弮䐨褂\uf8d2ꯢ굝咚⪢顣ￓ㥻尬웛쩭ழ辚㍏⓿\udc37넸應睧꺽\ue492乁䇒猹ᘖ볏鱫䖵㦚\ue943\ueee9ᘦ欈", -TextUtils.lastIndexOf("", '0')).intern();
                strM2448 = m2448("꽵⬼\uf66b晥꼶\udfccἠ믔絭\uec49䷶홈\u0bad닍砸\ue4c4\ud862䝇雹㍵\ue6cbᗷ씗䇧덐㩳\uf39e鱥䇙좕\u2e6dꫵ湢鵖岧弄㲵ꌤ謐ា쥌熵릐∨韈د푝点ꑅ퓡", View.resolveSize(0, 0) + 1);
            }
            m2451(strIntern, strM2448.intern());
            string = m2449(context);
        }
        int i3 = f2479 + 29;
        f2478 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2449(Context context) {
        SharedPreferences.Editor editorEdit;
        String strM2448;
        int i = 2 % 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2448("띅\u0eeb쁐坓뜶切⤁諼敜짞箁\ue77c᎓霘丄", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), 0);
        String string = sharedPreferences.getString(m2448("蘅㈯冃\ue346虶웟룒㻶吕\uf555\uea17卸⊘ꯖ\udfd0懡\uf110幈ㅔ뙳쾜ೄ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), null);
        if (TextUtils.isEmpty(string)) {
            int i2 = f2478 + 99;
            f2479 = i2 % 128;
            if (i2 % 2 != 0) {
                string = UUID.randomUUID().toString();
                editorEdit = sharedPreferences.edit();
                strM2448 = m2448("蘅㈯冃\ue346虶웟룒㻶吕\uf555\uea17卸⊘ꯖ\udfd0懡\uf110幈ㅔ뙳쾜ೄ", View.combineMeasuredStates(0, 0));
            } else {
                string = UUID.randomUUID().toString();
                editorEdit = sharedPreferences.edit();
                strM2448 = m2448("蘅㈯冃\ue346虶웟룒㻶吕\uf555\uea17卸⊘ꯖ\udfd0懡\uf110幈ㅔ뙳쾜ೄ", View.combineMeasuredStates(0, 0) + 1);
            }
            editorEdit.putString(strM2448.intern(), string).commit();
        }
        int i3 = f2479 + InterfaceC0280i1.d.b.b;
        f2478 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2448(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f2480, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f2480));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }
}
