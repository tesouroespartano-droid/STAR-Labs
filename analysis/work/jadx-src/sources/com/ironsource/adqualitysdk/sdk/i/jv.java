package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class jv {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2919 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2920 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2921 = -7984124982383031578L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2717(iu iuVar) {
        int i = 2 % 2;
        int i2 = f2919 + 19;
        f2920 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Executors.newSingleThreadExecutor().execute(iuVar);
            int i4 = f2919 + 69;
            f2920 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            jz.m2766(m2713("쪧\udca7\ue6fd裼鈓ꐳ乑冑箷\u0dfe០㤘쌶해", ExpandableListView.getPackedPositionType(0L) + 5669).intern(), m2713("쪣錩秮잾걠\u0a77탭뺵ݫ\ued20䯱ᆍ\ufe53䐑⋗裕兗㼘藕掏졁陇粬야ꌭ৸", 22974 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static long m2711() {
        int i = 2 % 2;
        int i2 = f2920 + 69;
        f2919 = i2 % 128;
        if (i2 % 2 == 0) {
            Calendar.getInstance().getTimeInMillis();
            throw null;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i3 = f2920 + InterfaceC0280i1.d.b.b;
        f2919 = i3 % 128;
        int i4 = i3 % 2;
        return timeInMillis;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static long m2715() {
        long jElapsedRealtime;
        int i = 2 % 2;
        int i2 = f2920 + 37;
        f2919 = i2 % 128;
        if (i2 % 2 == 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = 97 / 0;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        int i4 = f2920 + 93;
        f2919 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return jElapsedRealtime;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x010a A[Catch: all -> 0x0140, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:13:0x00c5, B:27:0x010a), top: B:45:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.InputStream, javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2712(String str, String str2, String str3, String str4) throws Throwable {
        Throwable th;
        long j;
        String string;
        int i;
        ?? cipherInputStream;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
                try {
                    byte[] bArrM2714 = m2714(str3);
                    byte[] bArrM2715 = m2714(str4);
                    Cipher cipher = Cipher.getInstance(m2713("쪧踠䎳݀\ud8a9鰫冷ᕜ\ueeaeꈶ枻㬔ﳷ뀑疭줯芲䘼ᮾ\udf38", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17540).intern());
                    th = null;
                    try {
                        j = 0;
                        try {
                            cipher.init(2, SecretKeyFactory.getInstance(m2713("쪶嵓\ue54dൔ镳㵡䕤\ued6a甚鵼━䴵픶絟蕑ⶩ뗔\uddc8旬跲ᗯ뷶엱涔\uf58cᶺꗝ춤喲ﱘњ걜㑕屽", TextUtils.getOffsetAfter("", 0) + 38903).intern(), m2713("쪤鞔", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23857).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), bArrM2715, 1, 256)), new IvParameterSpec(bArrM2714, 0, cipher.getBlockSize()));
                            cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArrCopyOfRange), cipher);
                            try {
                                m2713("쪳Ώ怲딐鿺", (ViewConfiguration.getTouchSlop() >> 8) + 54601).intern();
                                byte[] bArr = new byte[8192];
                                for (int i3 = cipherInputStream.read(bArr); i3 >= 0; i3 = cipherInputStream.read(bArr)) {
                                    sb.append(new String(bArr, 0, i3, m2713("쪳Ώ怲딐鿺", 54600 - TextUtils.lastIndexOf("", '0', 0)).intern()));
                                }
                                cipherInputStream.close();
                                int i4 = f2920 + 65;
                                f2919 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    jz.m2766(m2713("쪧\udca7\ue6fd裼鈓ꐳ乑冑箷\u0dfe០㤘쌶해", 5669 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))).intern(), m2713("쪣祭굦텢հ䤛ﵔ⅌啍饕촥焥ꔾ\ue92aᴖ䄖\uf556㤜洐釯엻\u09e5뷧", 46074 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), th, false);
                                    if (cipherInputStream != 0) {
                                        cipherInputStream.close();
                                    }
                                    string = sb.toString();
                                    i = f2919 + 13;
                                    f2920 = i % 128;
                                    if (i % 2 == 0) {
                                        return string;
                                    }
                                    throw th;
                                } catch (Throwable th3) {
                                    if (cipherInputStream != 0) {
                                        try {
                                            cipherInputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        jz.m2766(m2713("쪧\udca7\ue6fd裼鈓ꐳ乑冑箷\u0dfe០㤘쌶해", ExpandableListView.getPackedPositionChild(j) + 5670).intern(), m2713("쪣⩧୲桐䥘깹輷\uec31촛∌Ϭ惾䇬ꛖ螌\ue4bf얳㪦ᮂ碖塪륽鸤ｒ\udc42㴺ሧ", 57587 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th, false);
                                        string = sb.toString();
                                        i = f2919 + 13;
                                        f2920 = i % 128;
                                        if (i % 2 == 0) {
                                            return string;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            cipherInputStream = th;
                            jz.m2766(m2713("쪧\udca7\ue6fd裼鈓ꐳ乑冑箷\u0dfe០㤘쌶해", 5669 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))).intern(), m2713("쪣祭굦텢հ䤛ﵔ⅌啍饕촥焥ꔾ\ue92aᴖ䄖\uf556㤜洐釯엻\u09e5뷧", 46074 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), th, false);
                            if (cipherInputStream != 0) {
                                cipherInputStream.close();
                            }
                            string = sb.toString();
                            i = f2919 + 13;
                            f2920 = i % 128;
                            if (i % 2 == 0) {
                                return string;
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        j = 0;
                        cipherInputStream = th;
                        jz.m2766(m2713("쪧\udca7\ue6fd裼鈓ꐳ乑冑箷\u0dfe០㤘쌶해", 5669 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))).intern(), m2713("쪣祭굦텢հ䤛ﵔ⅌啍饕촥焥ꔾ\ue92aᴖ䄖\uf556㤜洐釯엻\u09e5뷧", 46074 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), th, false);
                        if (cipherInputStream != 0) {
                            cipherInputStream.close();
                        }
                        string = sb.toString();
                        i = f2919 + 13;
                        f2920 = i % 128;
                        if (i % 2 == 0) {
                            return string;
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = null;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th8) {
            th = th8;
            th = null;
            j = 0;
        }
        string = sb.toString();
        i = f2919 + 13;
        f2920 = i % 128;
        if (i % 2 == 0) {
            return string;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2714(String str) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = f2919 + 91;
        f2920 = i3 % 128;
        if (i3 % 2 != 0) {
            length = str.length();
            i = length + 5;
        } else {
            length = str.length();
            i = length / 2;
        }
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < length; i4 += 2) {
            int i5 = f2920 + 113;
            f2919 = i5 % 128;
            int i6 = i5 % 2;
            bArr[i4 / 2] = (byte) ((Character.digit(str.charAt(i4), 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m2716(List list, List list2) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i2 = f2920 + 15;
            f2919 = i2 % 128;
            int i3 = i2 % 2;
            hashSet.addAll(list2);
            int i4 = f2920 + 65;
            f2919 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new ArrayList(hashSet);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2713(String str, int i) {
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
                cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2921);
                i.f2433++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
