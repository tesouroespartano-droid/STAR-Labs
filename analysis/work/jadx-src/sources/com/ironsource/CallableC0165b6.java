package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class CallableC0165b6 implements Callable<C0250g5> {
    private static final String d = "FileWorkerThread";
    private static final String e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";
    private final C0233f5 a;
    private final String b;
    private long c;

    CallableC0165b6(C0233f5 c0233f5, String str, long j) {
        this.a = c0233f5;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0250g5 call() throws Throwable {
        CallableC0165b6 callableC0165b6;
        if (this.c == 0) {
            this.c = 1L;
        }
        C0250g5 c0250g5A = null;
        int i = 0;
        while (true) {
            if (i >= this.c) {
                callableC0165b6 = this;
                break;
            }
            callableC0165b6 = this;
            c0250g5A = callableC0165b6.a(this.a.e(), i, this.a.a(), this.a.c(), this.a.f());
            int iB = c0250g5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i++;
        }
        C0250g5 c0250g5 = c0250g5A;
        if (c0250g5 != null && c0250g5.a() != null) {
            StringBuilder sbAppend = new StringBuilder().append(callableC0165b6.b);
            String str = File.separator;
            String string = sbAppend.append(str).append(callableC0165b6.a.b().getName()).toString();
            String str2 = callableC0165b6.a.d() + str + C0232f4.E + callableC0165b6.a.b().getName();
            try {
                if (a(c0250g5.a(), str2) == 0) {
                    c0250g5.a(1006);
                    return c0250g5;
                }
                if (!a(str2, string)) {
                    c0250g5.a(1014);
                    return c0250g5;
                }
            } catch (FileNotFoundException e2) {
                C0421q4.d().a(e2);
                c0250g5.a(1018);
            } catch (Error e3) {
                C0421q4.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                c0250g5.a(1019);
            } catch (Exception e4) {
                C0421q4.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                c0250g5.a(1009);
            }
        }
        return c0250g5;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x018a A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #3 {all -> 0x0186, blocks: (B:108:0x0182, B:112:0x018a), top: B:117:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    C0250g5 a(String str, int i, int i2, int i3, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        C0250g5 c0250g5 = new C0250g5();
        if (TextUtils.isEmpty(str)) {
            c0250g5.a(str);
            c0250g5.a(1007);
            return c0250g5;
        }
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod(Wb.a);
                            if (z) {
                                try {
                                    httpURLConnection.setRequestProperty(e, f);
                                } catch (IllegalStateException e2) {
                                    C0421q4.d().a(e2);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i3);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode >= 200 && responseCode < 400) {
                                inputStream2 = httpURLConnection.getInputStream();
                                c0250g5.a(a(inputStream2));
                            } else {
                                Logger.i(d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                                responseCode = 1011;
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            C0421q4.d().a(e);
                            i = 1018;
                            if (0 != 0) {
                                (objArr2 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0250g5.a(str);
                            c0250g5.a(i);
                            return c0250g5;
                        } catch (Error e4) {
                            e = e4;
                            C0421q4.d().a(e);
                            responseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            if (0 != 0) {
                                (objArr3 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (MalformedURLException e5) {
                            e = e5;
                            C0421q4.d().a(e);
                            i = 1004;
                            if (0 != 0) {
                                (objArr4 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0250g5.a(str);
                            c0250g5.a(i);
                            return c0250g5;
                        } catch (SocketTimeoutException e6) {
                            e = e6;
                            C0421q4.d().a(e);
                            i = 1008;
                            if (0 != 0) {
                                (objArr5 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0250g5.a(str);
                            c0250g5.a(i);
                            return c0250g5;
                        } catch (URISyntaxException e7) {
                            e = e7;
                            C0421q4.d().a(e);
                            i = 1010;
                            if (0 != 0) {
                                (objArr6 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0250g5.a(str);
                            c0250g5.a(i);
                            return c0250g5;
                        } catch (Exception e8) {
                            e = e8;
                            C0421q4.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            i = 1009;
                            if (0 != 0) {
                                (objArr7 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0250g5.a(str);
                            c0250g5.a(i);
                            return c0250g5;
                        }
                    } catch (Throwable th) {
                        C0421q4.d().a(th);
                        IronLog.INTERNAL.error(th.toString());
                        c0250g5.a(str);
                        c0250g5.a(i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                            if (0 != 0) {
                                (objArr == true ? 1 : 0).disconnect();
                            }
                        } catch (Throwable th3) {
                            C0421q4.d().a(th3);
                            IronLog.INTERNAL.error(th3.toString());
                            c0250g5.a(str);
                            c0250g5.a(0);
                            throw th;
                        }
                    } else if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                    c0250g5.a(str);
                    c0250g5.a(0);
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                httpURLConnection = null;
            } catch (Error e10) {
                e = e10;
                httpURLConnection = null;
            } catch (MalformedURLException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (SocketTimeoutException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (URISyntaxException e13) {
                e = e13;
                httpURLConnection = null;
            } catch (Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    inputStream.close();
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                } else if (0 != 0) {
                    (objArr == true ? 1 : 0).disconnect();
                }
                c0250g5.a(str);
                c0250g5.a(0);
                throw th;
            }
        } catch (Throwable th5) {
            C0421q4.d().a(th5);
            IronLog.INTERNAL.error(th5.toString());
        }
        c0250g5.a(str);
        c0250g5.a(responseCode);
        return c0250g5;
    }
}
