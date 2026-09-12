package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class iy {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2684 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2685 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2686 = 4596;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2687 = 8145;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2688 = 44;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2689 = 52541;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2690 = 63847;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ir m2539(JSONObject jSONObject, String str) {
        int i = 2 % 2;
        int i2 = f2685 + 21;
        f2684 = i2 % 128;
        int i3 = i2 % 2;
        try {
            HttpURLConnection httpURLConnectionM2533 = m2533(str);
            byte[] bArrM2543 = m2543(httpURLConnectionM2533, jSONObject);
            long jM2715 = jv.m2715();
            m2534(httpURLConnectionM2533, bArrM2543);
            String strM2538 = m2538(httpURLConnectionM2533);
            int responseCode = httpURLConnectionM2533.getResponseCode();
            String responseMessage = httpURLConnectionM2533.getResponseMessage();
            if (responseCode >= 400) {
                int i4 = f2685 + 45;
                f2684 = i4 % 128;
                int i5 = i4 % 2;
                httpURLConnectionM2533.disconnect();
            }
            ir irVar = new ir(strM2538, responseCode, responseMessage, jv.m2715() - jM2715);
            int i6 = f2684 + 9;
            f2685 = i6 % 128;
            if (i6 % 2 != 0) {
                return irVar;
            }
            throw null;
        } catch (Throwable th) {
            n.m2873(m2540("\r\u0002\u0005\f\uffe7\ufffe\r￮", 4 - View.resolveSize(0, 0), (-16777069) - Color.rgb(0, 0, 0), false, '8' - AndroidCharacter.getMirror('0')).intern(), new StringBuilder().append(m2536("\udffe\ueb66꣄ﻄ疗䃯ஓ魵\ue6f4폢闖ᱣ\ue21a蘑苎蠊\udb7d玥ꚣ趹ﰖﮎ攆\udaef\udb7d玥풀\udd87", View.getDefaultSize(0, 0) + 28).intern()).append(th.getLocalizedMessage()).toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static ir m2537(String str) {
        int i = 2 % 2;
        int i2 = f2684 + 69;
        f2685 = i2 % 128;
        int i3 = i2 % 2;
        try {
            HttpURLConnection httpURLConnectionM2542 = m2542(str);
            long jM2715 = jv.m2715();
            String strM2538 = m2538(httpURLConnectionM2542);
            int responseCode = httpURLConnectionM2542.getResponseCode();
            String responseMessage = httpURLConnectionM2542.getResponseMessage();
            if (responseCode >= 400) {
                int i4 = f2684 + 41;
                f2685 = i4 % 128;
                int i5 = i4 % 2;
                httpURLConnectionM2542.disconnect();
            }
            return new ir(strM2538, responseCode, responseMessage, jv.m2715() - jM2715);
        } catch (Throwable th) {
            n.m2873(m2540("\r\u0002\u0005\f\uffe7\ufffe\r￮", Color.blue(0) + 4, ExpandableListView.getPackedPositionType(0L) + 147, false, 8 - TextUtils.getTrimmedLength("")).intern(), new StringBuilder().append(m2540("\u0014\u0011\u0014ￂ\u0015\u0007\u0010\u0006\u000b\u0010\tￂ\t\u0007\u0016ￂ\u0014\u0007\u0013\u0017\u0007\u0015\u0016ￜￂ\uffe7\u0014", Color.rgb(0, 0, 0) + 16777241, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 138, false, 27 - (ViewConfiguration.getTouchSlop() >> 8)).intern()).append(th.getLocalizedMessage()).toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2534(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        int i = 2 % 2;
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2545(dataOutputStream);
        int i2 = f2685 + 65;
        f2684 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0078 A[PHI: r1
      0x0078: PHI (r1v10 byte[]) = (r1v9 byte[]), (r1v18 byte[]) binds: [B:8:0x0075, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2543(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        byte[] bytes;
        int i = 2 % 2;
        int i2 = f2684 + 113;
        f2685 = i2 % 128;
        if (i2 % 2 == 0) {
            String strM2541 = m2541(jSONObject);
            bytes = strM2541.getBytes(m2540("\u0010\u0011\ufff4￩\u0002", 4 << (ViewConfiguration.getScrollBarFadeDuration() % 44), 99 >>> (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), true, 3 << (ViewConfiguration.getPressedStateDuration() * 21)).intern());
            if (!(!m2546(strM2541))) {
                httpURLConnection.setRequestProperty(m2540("\u0007\f\u0005￡\r\f\u0012\u0003\f\u0012ￋ￣\f\u0001\r\u0002", 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 143 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 16 - TextUtils.indexOf("", "")).intern(), m2536("宑晊Ꞇ墘", 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                bytes = m2544(bytes);
            }
        } else {
            String strM2542 = m2541(jSONObject);
            bytes = strM2542.getBytes(m2540("\u0010\u0011\ufff4￩\u0002", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC0280i1.d.b.j, true, 5 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            if (m2546(strM2542)) {
                httpURLConnection.setRequestProperty(m2540("\u0007\f\u0005￡\r\f\u0012\u0003\f\u0012ￋ￣\f\u0001\r\u0002", 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 143 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 16 - TextUtils.indexOf("", "")).intern(), m2536("宑晊Ꞇ墘", 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                bytes = m2544(bytes);
            }
        }
        int i3 = f2684 + 97;
        f2685 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return bytes;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m2533(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2540("\u0002\u0003\uffff\ufffe", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 125, false, 4 - KeyEvent.keyCodeFromString("")).intern());
        httpURLConnection.setRequestProperty(m2536("\udc7f퓡\ud926㎻\uef98ﺇ蜇蛓亴숻쉍贸", TextUtils.lastIndexOf("", '0', 0) + 13).intern(), m2536("ڳ痂솽ﶌ࿚逴岧皑柔\ua7e5뇽䅫賻ꊲ媛鳥뛆\ue0ae淠櫘\ue00fꎹஓ魵㩋\ufe1a炌蟄䨐థ␢냊", 31 - Drawable.resolveOpacity(0, 0)).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i2 = f2684 + 47;
        f2685 = i2 % 128;
        int i3 = i2 % 2;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static HttpURLConnection m2542(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2536("̃׆큤꾥", 3 - ExpandableListView.getPackedPositionType(0L)).intern());
        int i2 = f2684 + 33;
        f2685 = i2 % 128;
        if (i2 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2538(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        int i = 2 % 2;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = stringBuffer.toString();
                            m2545(inputStream);
                            m2545(bufferedReader);
                            return string;
                        }
                        if (stringBuffer.length() > 0) {
                            int i2 = f2685 + 53;
                            f2684 = i2 % 128;
                            int i3 = i2 % 2;
                            stringBuffer.append('\r');
                            int i4 = f2684 + 3;
                            f2685 = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 2 / 2;
                            }
                        }
                        stringBuffer.append(line);
                        int i6 = f2684 + 105;
                        f2685 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        n.m2873(m2540("\r\u0002\u0005\f\uffe7\ufffe\r￮", 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 147, false, View.getDefaultSize(0, 0) + 8).intern(), m2536("\udffe\ueb66꣄ﻄ疗䃯㑿͐舷ℶ闖ᱣ\ue21a蘑ﰬⲱ㰟࿕媛鳥ஓ魵", 22 - TextUtils.indexOf("", "", 0, 0)).intern(), th);
                        return null;
                    } finally {
                        m2545(inputStream);
                        m2545(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2545(Closeable closeable) {
        int i = 2 % 2;
        int i2 = f2684 + 65;
        f2685 = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                int i3 = 61 / 0;
                if (closeable != null) {
                    closeable.close();
                }
            } catch (Throwable unused) {
                return;
            }
        } else if (closeable != null) {
            closeable.close();
        }
        int i4 = f2684 + 115;
        f2685 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2546(String str) {
        int i = 2 % 2;
        int i2 = f2685 + 9;
        f2684 = i2 % 128;
        int i3 = i2 % 2;
        int length = str.length();
        if (i3 != 0) {
            if (length <= 8511) {
                return false;
            }
        } else if (length <= 256) {
            return false;
        }
        int i4 = f2684 + 69;
        f2685 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2544(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    int i2 = f2684 + 33;
                    f2685 = i2 % 128;
                    int i3 = i2 % 2;
                    return byteArray;
                } catch (Exception e) {
                    e = e;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2541(JSONObject jSONObject) {
        int i = 2 % 2;
        String string = jSONObject.toString();
        String string2 = new StringBuilder().append(string.substring(0, string.lastIndexOf(125))).append(m2540("\ufffe￦\ufff0￦,7￦", (Process.myPid() >> 22) + 2, 104 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 7).intern()).append(jw.m2718(string)).append(m2536("\ud8ff⥖", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1).intern()).toString();
        int i2 = f2684 + 19;
        f2685 = i2 % 128;
        if (i2 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2535(ir irVar) {
        int i = 2 % 2;
        int i2 = f2684;
        int i3 = i2 + 15;
        f2685 = i3 % 128;
        int i4 = i3 % 2;
        if (irVar != null) {
            return irVar.m2484();
        }
        int i5 = i2 + 47;
        f2685 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2540(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2688);
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2536(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2690)) ^ ((c2 >>> 5) + f2689)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f2687) ^ ((c3 + i2) ^ ((c3 << 4) + f2686))));
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
