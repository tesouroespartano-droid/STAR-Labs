package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class Cif {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2469 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2470 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2471 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2472;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2473;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2474;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2475;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2476;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2477;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m2440() {
        f2469 = (char) 7810;
        f2476 = (char) 54154;
        f2470 = (char) 5388;
        f2474 = (char) 24592;
    }

    static {
        m2440();
        int i = 2 % 2;
        f2475 = true;
        f2473 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2477 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        int i2 = f2471 + 27;
        f2472 = i2 % 128;
        int i3 = i2 % 2;
    }

    private Cif() {
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2444(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        if (i2 > 0) {
            int i7 = f2472 + 95;
            f2471 = i7 % 128;
            int i8 = i7 % 2;
            i4 = (bArr[i] << Ascii.CAN) >>> 8;
        } else {
            i4 = 0;
        }
        if (i2 > 1) {
            int i9 = f2472 + 1;
            f2471 = i9 % 128;
            int i10 = i9 % 2;
            i5 = (bArr[i + 1] << Ascii.CAN) >>> 16;
        } else {
            i5 = 0;
        }
        int i11 = i4 | i5 | (i2 > 2 ? (bArr[i + 2] << Ascii.CAN) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i11 >>> 18];
            bArr2[i3 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i3 + 2] = Base64.padSymbol;
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return bArr2;
            }
            bArr2[i3] = bArr3[i11 >>> 18];
            bArr2[i3 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i11 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i11 & 63];
            return bArr2;
        }
        bArr2[i3] = bArr3[i11 >>> 18];
        bArr2[i3 + 1] = bArr3[(i11 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i11 >>> 6) & 63];
        bArr2[i3 + 3] = Base64.padSymbol;
        int i12 = f2472 + 83;
        f2471 = i12 % 128;
        int i13 = i12 % 2;
        return bArr2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2446(byte[] bArr) {
        int i = 2 % 2;
        int i2 = f2472 + 41;
        f2471 = i2 % 128;
        int i3 = i2 % 2;
        int length = bArr.length;
        if (i3 != 0) {
            return m2443(bArr, length, f2473);
        }
        String strM2443 = m2443(bArr, length, f2473);
        int i4 = 29 / 0;
        return strM2443;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2443(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 2 % 2;
        byte[] bArrM2441 = m2441(bArr, 0, i, bArr2);
        String str = new String(bArrM2441, 0, bArrM2441.length);
        int i3 = f2471 + 93;
        f2472 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m2441(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 2 % 2;
        int i4 = f2472 + 17;
        f2471 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i2 + 2) / 3) << 2;
        int i7 = i6 + (i6 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i7];
        int i8 = i2 - 2;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i8) {
            int i12 = f2471 + 45;
            f2472 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((bArr[i9] << Ascii.CAN) >>> 8) | ((bArr[i9 + 1] << Ascii.CAN) >>> 16) | ((bArr[i9 + 2] << Ascii.CAN) >>> 24);
            bArr3[i10] = bArr2[i14 >>> 18];
            int i15 = i10 + 1;
            bArr3[i15] = bArr2[(i14 >>> 12) & 63];
            bArr3[i10 + 2] = bArr2[(i14 >>> 6) & 63];
            bArr3[i10 + 3] = bArr2[i14 & 63];
            i11 += 4;
            if (i11 == Integer.MAX_VALUE) {
                bArr3[i10 + 4] = 10;
                i10 = i15;
                i11 = 0;
            }
            i9 += 3;
            i10 += 4;
        }
        if (i9 < i2) {
            m2444(bArr, i9, i2 - i9, bArr3, i10, bArr2);
            if (i11 + 4 == Integer.MAX_VALUE) {
                bArr3[i10 + 4] = 10;
                i10++;
                int i16 = f2471 + 61;
                f2472 = i16 % 128;
                int i17 = i16 % 2;
            }
            i10 += 4;
        }
        if (!f2475) {
            int i18 = f2471 + 5;
            f2472 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 32 / 0;
            }
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int m2442(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = 2 % 2;
        int i3 = f2471 + 125;
        int i4 = i3 % 128;
        f2472 = i4;
        int i5 = i3 % 2;
        byte b = bArr[2];
        if (b == 61) {
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6)) >>> 16);
            return 1;
        }
        byte b2 = bArr[3];
        if (b2 != 61) {
            int i6 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18) | ((bArr3[b2] << Ascii.CAN) >>> 24);
            bArr2[i] = (byte) (i6 >> 16);
            bArr2[i + 1] = (byte) (i6 >> 8);
            bArr2[i + 2] = (byte) i6;
            return 3;
        }
        int i7 = i4 + 123;
        f2471 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18);
        bArr2[i] = (byte) (i9 >>> 16);
        bArr2[i + 1] = (byte) (i9 >>> 8);
        int i10 = i4 + InterfaceC0280i1.d.b.i;
        f2471 = i10 % 128;
        int i11 = i10 % 2;
        return 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static byte[] m2438(String str) throws ic {
        int i = 2 % 2;
        int i2 = f2472 + 71;
        f2471 = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bytes = str.getBytes();
            int i3 = 25 / 0;
            return m2445(bytes, bytes.length);
        }
        byte[] bytes2 = str.getBytes();
        return m2445(bytes2, bytes2.length);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2445(byte[] bArr, int i) throws ic {
        int i2 = 2 % 2;
        int i3 = f2471 + 13;
        f2472 = i3 % 128;
        byte[] bArrM2439 = i3 % 2 != 0 ? m2439(bArr, 1, i, f2477) : m2439(bArr, 0, i, f2477);
        int i4 = f2472 + 9;
        f2471 = i4 % 128;
        int i5 = i4 % 2;
        return bArrM2439;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[DONT_INVERT, PHI: r5 r13
      0x0062: PHI (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:16:0x0060, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r13v7 byte) = (r13v6 byte), (r13v11 byte) binds: [B:16:0x0060, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2439(byte[] bArr, int i, int i2, byte[] bArr2) throws ic {
        char c;
        int i3;
        byte b;
        int i4;
        int i5 = 2 % 2;
        int i6 = f2471 + 53;
        int i7 = i6 % 128;
        f2472 = i7;
        int i8 = i6 % 2;
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i9 = i7 + 123;
        f2471 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        int iM2442 = 0;
        for (int i12 = 0; i12 < i2; i12++) {
            byte b2 = (byte) (bArr[i12] & 127);
            byte b3 = bArr2[b2];
            if (b3 >= -5) {
                int i13 = f2471;
                int i14 = i13 + InterfaceC0280i1.d.b.b;
                int i15 = i14 % 128;
                f2472 = i15;
                int i16 = i14 % 2;
                if (b3 < -1) {
                    c = 4;
                } else if (b2 != 61) {
                    int i17 = i11 + 1;
                    bArr4[i11] = b2;
                    c = 4;
                    if (i17 == 4) {
                        int i18 = i13 + 115;
                        f2472 = i18 % 128;
                        iM2442 = i18 % 2 != 0 ? iM2442 << m2442(bArr4, bArr3, iM2442, bArr2) : iM2442 + m2442(bArr4, bArr3, iM2442, bArr2);
                        i11 = 0;
                    } else {
                        i11 = i17;
                    }
                } else {
                    int i19 = i15 + 115;
                    int i20 = i19 % 128;
                    f2471 = i20;
                    if (i19 % 2 != 0) {
                        i3 = i2 - i12;
                        b = (byte) (bArr[i2 - 1] & 127);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 == 3) {
                                }
                                if (i11 == 4) {
                                    i4 = i20 + 33;
                                    f2472 = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        throw new ic(new StringBuilder().append(m2437("ⵑ퀸\ue4c0劳挚킪\ue2d9䶛㠛\ue7b1殾羼謴䔁軁檉ꖀ兾哌ꖻꢮഒ佬鴊ꦟ攦덭\uef64\uf012樫曆毿逯\ueea2裉쐽昮傷鈴從ꈋ၁\ue11c烉떴摉诎\udab7熋❋욀眀韈⍘肞蟢昮傷넷趠ꢮഒ\uf22a\uf8f2", (ViewConfiguration.getWindowTouchSlop() >> 8) + 64).intern()).append(i12).toString());
                                    }
                                    throw new ic(new StringBuilder().append(m2437("ⵑ퀸\ue4c0劳挚킪\ue2d9䶛㠛\ue7b1殾羼謴䔁軁檉ꖀ兾哌ꖻꢮഒ佬鴊ꦟ攦덭\uef64\uf012樫曆毿逯\ueea2裉쐽昮傷鈴從ꈋ၁\ue11c烉떴摉诎\udab7熋❋욀眀韈⍘肞蟢昮傷넷趠ꢮഒ\uf22a\uf8f2", (ViewConfiguration.getWindowTouchSlop() >> 8) + 64).intern()).append(i12).toString());
                                }
                                if (b != 61) {
                                    break;
                                }
                                throw new ic(m2437("ꈋ၁\ue11c烉떴摉诎\udab7熋❋욀眀韈⍘⅞찕\uefa1\uf76e挚킪熋❋ꣽ㽫诎\udab7庵襪௬㭊ꣽ㽫Є濈퓙﵆㱬Ḧ滓Ọ", 38 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                            }
                        }
                    } else {
                        i3 = i2 << i12;
                        b = (byte) (bArr[i2 - 1] | 54);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 == 3 || i3 <= 2) {
                                    if (i11 == 4) {
                                        i4 = i20 + 33;
                                        f2472 = i4 % 128;
                                        if (i4 % 2 != 0) {
                                        }
                                    }
                                    if (b != 61 || b == 10) {
                                        break;
                                        break;
                                    }
                                    throw new ic(m2437("ꈋ၁\ue11c烉떴摉诎\udab7熋❋욀眀韈⍘⅞찕\uefa1\uf76e挚킪熋❋ꣽ㽫诎\udab7庵襪௬㭊ꣽ㽫Є濈퓙﵆㱬Ḧ滓Ọ", 38 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                                }
                                throw new ic(new StringBuilder().append(m2437("ⵑ퀸\ue4c0劳挚킪\ue2d9䶛㠛\ue7b1殾羼謴䔁軁檉ꖀ兾哌ꖻꢮഒ佬鴊ꦟ攦덭\uef64\uf012樫曆毿逯\ueea2裉쐽昮傷鈴從ꈋ၁\ue11c烉떴摉诎\udab7熋❋욀眀韈⍘肞蟢昮傷넷趠ꢮഒ\uf22a\uf8f2", (ViewConfiguration.getWindowTouchSlop() >> 8) + 64).intern()).append(i12).toString());
                            }
                        }
                    }
                    throw new ic(new StringBuilder().append(m2437("挚킪熋❋ꣽ㽫诎\udab7ⵑ퀸\ue4c0劳挚킪\ue2d9䶛㠛\ue7b1殾羼謴䔁軁檉ᰧ莦\uf22a\uf8f2㠛\ue7b1殾羼昮傷넷趠ꢮഒ\uf22a\uf8f2", 40 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()).append(i12).toString());
                }
            } else {
                throw new ic(new StringBuilder().append(m2437("攰ᔬ诎\udab7攰ᔬꢮഒ爋ラ撨॔罖뇴ᆜ뿥措簍⅞찕䒎\uab6e넥\u2e79뾳\uef14ᰧ莦\uf22a\uf8f2", 30 - TextUtils.getTrimmedLength("")).intern()).append(i12).append(m2437("焀\ue482", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2).intern()).append((int) bArr[i12]).append(m2437("哳\ue7d3纺㊁곓腓哌ꖻ\uefce〣", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9).intern()).toString());
            }
        }
        if (i11 != 0) {
            int i21 = f2471 + 19;
            f2472 = i21 % 128;
            if (i21 % 2 == 0 ? i11 == 1 : i11 == 1) {
                throw new ic(new StringBuilder().append(m2437("䎳⁷Є濈㊊㏫殷朱䒎\uab6e虃ﻧ挚킪\ue2d9䶛놙ꋡ\ued25瑔叝\ue663殾羼\ue136\u0cb4肞蟢昮傷넷趠ꢮഒ\uf22a\uf8f2", 35 - Process.getGidForName("")).intern()).append(i2 - 1).toString());
            }
            bArr4[i11] = Base64.padSymbol;
            iM2442 += m2442(bArr4, bArr3, iM2442, bArr2);
            int i22 = f2471 + 29;
            f2472 = i22 % 128;
            int i23 = i22 % 2;
        }
        byte[] bArr5 = new byte[iM2442];
        System.arraycopy(bArr3, 0, bArr5, 0, iM2442);
        return bArr5;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2437(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2469)) ^ ((c2 >>> 5) + f2470)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2476) ^ ((c3 + i2) ^ ((c3 << 4) + f2474))));
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
