package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class id {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2454 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2455;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2456;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2457;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2458;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2459;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2460;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2461;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Cipher f2462;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cipher f2463;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private SecretKey f2464;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m2427() {
        f2461 = 4486423753929036448L;
        f2458 = (char) 10929;
        f2455 = (char) 36681;
        f2459 = (char) 5037;
        f2457 = (char) 65241;
    }

    static {
        m2427();
        f2460 = new byte[]{Ascii.DLE, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i = f2456 + 81;
        f2454 = i % 128;
        int i2 = i % 2;
    }

    public id(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            bArrDigest = SecretKeyFactory.getInstance(m2426("鋰툕ጋ倒鄵혧ᜢ吲镐\uda4eᭇ塳饰\ude19\u1f17峯鶒슎Ϊ䂴膩우\u07b7䓒藊쫼\u0b9b䣯觧", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16631).intern()).generateSecret(new PBEKeySpec(new StringBuilder().append(str).append(str2).append(str3).toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            ig.m2450(m2428("䣵癙狦᭾\uf556\uec09뻠\u1acf剞䦬揓톢\uf15cꬠ뷫ᵑइ쁢̚Ⲗ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18).intern(), m2428("瞊䥵졾順\udb7d爗壷\uef9c鰲林骴肕\ud8a1Ɩ꯫컝劻띎㈓偶\u2430⒓䐰ᩜ媋暶\uf3b4嶡\uf4c9뇪䯍뿚Ფ\ue59dￓ펁\ud8a1Ɩ鿪뎋\udf32墖欤펌벸芁䧀㩕庼濋腝㶩ꏍ죂\uf87e䰧찮⠗\u05c9ꆸ", ExpandableListView.getPackedPositionChild(0L) + 60).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m2426("鋭랗\ud873", (ViewConfiguration.getTapTimeout() >> 16) + 9587).intern());
                char[] charArray = new StringBuilder().append(str).append(str2).append(str3).toString().toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m2428("낻䷀鋕\uf4ca뷗韯㑺\ud893䧀㩕ᘇ\uf51e孖\uf347뷊\u0c11䧀㩕᧿Ě", 19 - TextUtils.getCapsMode("", 0, 0)).intern(), e);
            }
        }
        this.f2464 = new SecretKeySpec(bArrDigest, m2428("뻠\u1acf櫷욃", Color.blue(0) + 3).intern());
        m2429();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2429() {
        int i = 2 % 2;
        try {
            Cipher cipher = Cipher.getInstance(m2428("뻠\u1acf齕\uec9b❼Ⱟ㷺\uef30䪾꠶꧷钷鷀ￏꎏ吱\udf32墖툭疧", 19 - ExpandableListView.getPackedPositionChild(0L)).intern());
            this.f2463 = cipher;
            SecretKey secretKey = this.f2464;
            byte[] bArr = f2460;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m2428("뻠\u1acf齕\uec9b❼Ⱟ㷺\uef30䪾꠶꧷钷鷀ￏꎏ吱\udf32墖툭疧", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20).intern());
            this.f2462 = cipher2;
            cipher2.init(2, this.f2464, new IvParameterSpec(bArr));
            int i2 = f2456 + 105;
            f2454 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(m2428("낻䷀鋕\uf4ca뷗韯㑺\ud893䧀㩕ᘇ\uf51e孖\uf347뷊\u0c11䧀㩕庼濋ⱦ좕", 21 - View.MeasureSpec.getSize(0)).intern(), e);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m2430(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            int i2 = f2454 + 91;
            f2456 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            super.hashCode();
            throw null;
        }
        try {
            try {
                String strM2446 = Cif.m2446(this.f2463.doFinal(new StringBuilder().append(m2426("鋃쭖⇿鹅\uf4b7ⴲ譙\ue1e2帄뒠\ued74䭑ꇥḉ璒괾\u0b5e懮\ude4c㒎洠쭄⇪鸱\uf4b9ⴔ譹\ue1cc幾뒓\ued3b䭔ꇣṸ璆괤ୖ憐\ude27㒓", TextUtils.indexOf((CharSequence) "", '0') + 22938).intern()).append(str).toString().getBytes(m2426("鋵\ueb65懄︾瓜", (ViewConfiguration.getWindowTouchSlop() >> 8) + 31121).intern())));
                int i3 = f2454 + 33;
                f2456 = i3 % 128;
                if (i3 % 2 == 0) {
                    return strM2446;
                }
                super.hashCode();
                throw null;
            } catch (GeneralSecurityException e) {
                m2429();
                throw new RuntimeException(m2428("낻䷀鋕\uf4ca뷗韯㑺\ud893䧀㩕ᘇ\uf51e孖\uf347뷊\u0c11䧀㩕᧿Ě", 18 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), e);
            }
        } catch (UnsupportedEncodingException e2) {
            m2429();
            throw new RuntimeException(m2428("낻䷀鋕\uf4ca뷗韯㑺\ud893䧀㩕ᘇ\uf51e孖\uf347뷊\u0c11䧀㩕᧿Ě", 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), e2);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m2431(String str) throws a {
        int i = 2 % 2;
        int i2 = f2454 + 123;
        f2456 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = f2454 + 79;
            f2456 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f2462.doFinal(Cif.m2438(str)), m2426("鋵\ueb65懄︾瓜", Color.red(0) + 31121).intern());
                    if (str2.indexOf(m2426("鋃쭖⇿鹅\uf4b7ⴲ譙\ue1e2帄뒠\ued74䭑ꇥḉ璒괾\u0b5e懮\ude4c㒎洠쭄⇪鸱\uf4b9ⴔ譹\ue1cc幾뒓\ued3b䭔ꇣṸ璆괤ୖ憐\ude27㒓", View.MeasureSpec.makeMeasureSpec(0, 0) + 22937).intern()) != 0) {
                        throw new a(new StringBuilder().append(m2426("鋨ﵪ䶟\uddc9ⱹ벹ಚ鼇\uefb7翳칖幃껻㤶襜ᦅ桰\uf817䢇\udb33⭺뮚ெ驰\ueaac窗씂喴ꗰ㐒萂ᓾ朲\uf70f䟵혨♅뛂Š", 28591 - (ViewConfiguration.getTouchSlop() >> 8)).intern()).append(str).toString());
                    }
                    return str2.substring(m2426("鋃쭖⇿鹅\uf4b7ⴲ譙\ue1e2帄뒠\ued74䭑ꇥḉ璒괾\u0b5e懮\ude4c㒎洠쭄⇪鸱\uf4b9ⴔ譹\ue1cc幾뒓\ued3b䭔ꇣṸ璆괤ୖ憐\ude27㒓", 22937 - Color.argb(0, 0, 0, 0)).intern().length(), str2.length());
                } catch (IllegalBlockSizeException e) {
                    m2429();
                    throw new a(new StringBuilder().append(e.getMessage()).append(m2428("⦑丨", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(str).toString());
                }
            } catch (BadPaddingException e2) {
                m2429();
                throw new a(new StringBuilder().append(e2.getMessage()).append(m2428("⦑丨", TextUtils.indexOf("", "", 0, 0) + 1).intern()).append(str).toString());
            }
        } catch (ic e3) {
            m2429();
            throw new a(new StringBuilder().append(e3.getMessage()).append(m2428("⦑丨", -TextUtils.lastIndexOf("", '0', 0)).intern()).append(str).toString());
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(m2428("낻䷀鋕\uf4ca뷗韯㑺\ud893䧀㩕ᘇ\uf51e孖\uf347뷊\u0c11䧀㩕᧿Ě", 19 - (Process.myPid() >> 22)).intern(), e4);
        }
    }

    public class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2426(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2461);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2428(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2952) {
            char[] cArr2 = new char[cArr.length];
            k.f2951 = 0;
            char[] cArr3 = new char[2];
            while (k.f2951 < cArr.length) {
                cArr3[0] = cArr[k.f2951];
                cArr3[1] = cArr[k.f2951 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2458)) ^ ((c2 >>> 5) + f2459)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2455) ^ ((c3 + i2) ^ ((c3 << 4) + f2457))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
