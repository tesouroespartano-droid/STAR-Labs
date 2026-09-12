package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ii {

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f2485 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f2486;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static long f2487;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f2488;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f2489;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2490;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2491;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static ii f2492;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final Object f2493;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2494;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final Handler f2495;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Context f2500;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2497 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2498 = new HashMap<>();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<d>> f2496 = new HashMap<>();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ArrayList<c> f2499 = new ArrayList<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m2459() {
        f2488 = true;
        f2486 = true;
        f2494 = 41;
        f2491 = new char[]{'u', 152, 140, 138, 149, 'k', 155, 141, 156, 157, 'v', 151, 144, 142, '{', 159, 146, 'I', Typography.cent, 153, 145, 150, 143, 'o', 'P', 'c'};
        f2489 = new char[]{'A', 47919, 30444, 12685, 60767, 43026, 25576, 8056, 55817, 38367, 20620, 3198, 51120, ' ', 47980, 30430, 12685, 60764, 43016, 25517, 8038, 55872, 38337, 20633, 3120, 51187, 33460, 15949, 63760, 46305, 28716, 11128, 59081, 41361, 23880, 6379, 54204, 36637, 19036, 1472, 19170, 61868, 15471, 31502, 42972, 58001, 48213, 1820, 51933, 36276, 59877, 21170, 40803, 55322, 1231, 16795, 35382, 63140, 13186, 31833, 47369, 58791, 11887, 27426};
        f2487 = 1774542728101739340L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m2458(ii iiVar) {
        int i = 2 % 2;
        int i2 = f2490 + 29;
        f2485 = i2 % 128;
        int i3 = i2 % 2;
        iiVar.m2461();
        int i4 = f2490 + 95;
        f2485 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static class d {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static byte[] f2504 = {-32, -57, -61, 33, -61, -54, -52, 48, -35, -33, 119, -79, 77, -76, -65, -65, -6, -40};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2505 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static short[] f2506 = null;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2507 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2508 = 1427081970;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2509 = 41;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2510 = -1487427737;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        boolean f2511;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final IntentFilter f2512;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final BroadcastReceiver f2513;

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(128);
            sb.append(m2467(1487427737 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-50) - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 43, View.combineMeasuredStates(0, 0) - 1427081888, (short) ExpandableListView.getPackedPositionType(0L)).intern());
            sb.append(this.f2513);
            sb.append(m2467(AndroidCharacter.getMirror('0') + 22642, (byte) ((-67) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-43) - TextUtils.indexOf((CharSequence) "", '0', 0), (-1427081938) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (Process.getGidForName("") + 1)).intern());
            sb.append(this.f2512);
            sb.append(m2467(View.MeasureSpec.makeMeasureSpec(0, 0) + 1487427754, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 63), (-42) - ((Process.getThreadPriority(0) + 20) >> 6), (-1427081845) - (ViewConfiguration.getTapTimeout() >> 16), (short) (Process.myTid() >> 22)).intern());
            String string = sb.toString();
            int i2 = f2507 + 53;
            f2505 = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2467(int i, byte b, int i2, int i3, short s) {
            String string;
            synchronized (l.f2999) {
                StringBuilder sb = new StringBuilder();
                int i4 = f2509;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2504;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2510 + i] + i4);
                    } else {
                        i5 = (short) (f2506[f2510 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    l.f3000 = ((i + i5) - 2) + f2510 + i6;
                    l.f3002 = b;
                    l.f3004 = (char) (i3 + f2508);
                    sb.append(l.f3004);
                    l.f3003 = l.f3004;
                    l.f3001 = 1;
                    while (l.f3001 < i5) {
                        byte[] bArr2 = f2504;
                        if (bArr2 != null) {
                            int i7 = l.f3000;
                            l.f3000 = i7 - 1;
                            l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                        } else {
                            short[] sArr = f2506;
                            int i8 = l.f3000;
                            l.f3000 = i8 - 1;
                            l.f3004 = (char) (l.f3003 + (((short) (sArr[i8] + s)) ^ l.f3002));
                        }
                        sb.append(l.f3004);
                        l.f3003 = l.f3004;
                        l.f3001++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }

    static class c {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final ArrayList<d> f2502;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final Intent f2503;

        c(Intent intent, ArrayList<d> arrayList) {
            this.f2503 = intent;
            this.f2502 = arrayList;
        }
    }

    static {
        m2459();
        f2493 = new Object();
        int i = f2490 + 91;
        f2485 = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static ii m2456(Context context) {
        ii iiVar;
        synchronized (f2493) {
            if (f2492 == null) {
                f2492 = new ii(context.getApplicationContext());
            }
            iiVar = f2492;
        }
        return iiVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2464() {
        int i = 2 % 2;
        int i2 = f2485 + 35;
        f2490 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f2497 = false;
        } else {
            this.f2497 = true;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2466() {
        int i = 2 % 2;
        int i2 = f2490 + 25;
        f2485 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2497 = true;
        } else {
            this.f2497 = false;
        }
        m2457();
    }

    private ii(Context context) {
        this.f2500 = context;
        this.f2495 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ii.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    ii.m2458(ii.this);
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2460(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2498) {
            ArrayList<IntentFilter> arrayListRemove = this.f2498.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int i = 0; i < arrayListRemove.size(); i++) {
                IntentFilter intentFilter = arrayListRemove.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<d> arrayList = this.f2496.get(action);
                    if (arrayList != null) {
                        int i3 = 0;
                        while (i3 < arrayList.size()) {
                            if (arrayList.get(i3).f2513 == broadcastReceiver) {
                                arrayList.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList.size() <= 0) {
                            this.f2496.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2457() {
        synchronized (this.f2498) {
            Iterator it = new HashMap(this.f2498).keySet().iterator();
            while (it.hasNext()) {
                m2460((BroadcastReceiver) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2465(Intent intent) {
        long j;
        int i;
        String str;
        String strIntern;
        String strIntern2 = m2463(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0087\u008e\u008d\u0084\u008c\u0084\u008b\u008a\u0089\u0084\u0083\u0088\u0084\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i2 = 0;
        if (!this.f2497) {
            return false;
        }
        synchronized (this.f2498) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2500.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                j = 0;
                Log.v(strIntern2, new StringBuilder().append(m2463(null, (ViewConfiguration.getPressedStateDuration() >> 16) + WorkQueueKt.MASK, null, "\u0092\u008e\u0094\u0093\u008a\u0092\u008d\u008c\u0091\u0090\u0085\u0082\u0089\u008e\u008f").intern()).append(strResolveTypeIfNeeded).append(m2463(null, ExpandableListView.getPackedPositionGroup(0L) + WorkQueueKt.MASK, null, "\u0092\u008e\u0096\u008e\u0095\u0083\u0089\u0092").intern()).append(scheme).append(m2463(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0092\u008a\u008c\u008e\u008a\u008c\u0091\u0092\u0097\u0082\u0092").intern()).append(intent).toString());
            } else {
                j = 0;
            }
            ArrayList<d> arrayList = this.f2496.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    i = -1;
                    Log.v(strIntern2, new StringBuilder().append(m2462(KeyEvent.normalizeMetaState(0), 12 - ExpandableListView.getPackedPositionChild(j), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern()).append(arrayList).toString());
                } else {
                    i = -1;
                }
                int i3 = 0;
                ArrayList arrayList2 = null;
                while (i3 < arrayList.size()) {
                    d dVar = arrayList.get(i3);
                    if (z) {
                        Log.v(strIntern2, new StringBuilder().append(m2463(null, Drawable.resolveOpacity(i2, i2) + WorkQueueKt.MASK, null, "\u0092\u0087\u008e\u008a\u0085\u0091\u0097\u0092\u008a\u0089\u008c\u0091\u0084\u008d\u0084\u0092\u008d\u008c\u0091\u0095\u0083\u008a\u0084\u008b").intern()).append(dVar.f2512).toString());
                    }
                    if (dVar.f2511) {
                        if (z) {
                            Log.v(strIntern2, m2463(null, AndroidCharacter.getMirror('0') + 'O', null, "\u0088\u008e\u0088\u0088\u0084\u0092\u0093\u0088\u0084\u008e\u0087\u0085\u0084\u0092\u008a\u008e\u008d\u0087\u0084\u008a\u0092\u0089\u0099\u0087\u008e\u008a\u0085\u0091\u0098\u0092\u0092").intern());
                        }
                        strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                        scheme = scheme;
                        str = action;
                    } else {
                        int iMatch = dVar.f2512.match(str, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v(strIntern2, new StringBuilder().append(m2462(Gravity.getAbsoluteGravity(0, 0) + 13, AndroidCharacter.getMirror('0') - 21, (char) TextUtils.getOffsetAfter("", 0)).intern()).append(Integer.toHexString(iMatch)).toString());
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(dVar);
                            dVar.f2511 = true;
                        } else {
                            str = str;
                            strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                            scheme = scheme;
                            if (z) {
                                if (iMatch == -4) {
                                    str = action;
                                    i = i;
                                    strIntern = m2463(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), null, "\u0093\u0087\u0082\u008d\u008e\u008a\u0084\u0083").intern();
                                } else if (iMatch == -3) {
                                    str = action;
                                    i = i;
                                    strIntern = m2462(TextUtils.getOffsetBefore("", 0) + 40, '6' - AndroidCharacter.getMirror('0'), (char) (19075 - ((Process.getThreadPriority(0) + 20) >> 6))).intern();
                                } else if (iMatch != -2) {
                                    i = i;
                                    if (iMatch == i) {
                                        str = action;
                                        strIntern = m2463(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u008e\u0094\u0093\u008a").intern();
                                    } else {
                                        str = action;
                                        strIntern = m2462(50 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - (ViewConfiguration.getScrollFriction() > r3 ? 1 : (ViewConfiguration.getScrollFriction() == r3 ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0 ? 1 : (ViewConfiguration.getScrollFriction() == 0 ? 0 : -1)) + 59791)).intern();
                                    }
                                } else {
                                    str = action;
                                    i = i;
                                    strIntern = m2462(47 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 4 - KeyEvent.keyCodeFromString(""), (char) (Color.green(0) + 48177)).intern();
                                }
                                Log.v(strIntern2, new StringBuilder().append(m2463(null, 127 - ExpandableListView.getPackedPositionType(j), null, "\u0092\u009a\u0095\u0083\u008a\u0084\u0096\u0092\u008a\u0082\u008c\u0092\u0088\u0091\u0088\u0092\u0087\u008e\u008a\u0085\u0091\u0098\u0092\u0092").intern()).append(strIntern).toString());
                            }
                            i3++;
                            i = i;
                            action = str;
                            strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                            scheme = scheme;
                            i2 = 0;
                        }
                        str = action;
                    }
                    i3++;
                    i = i;
                    action = str;
                    strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                    scheme = scheme;
                    i2 = 0;
                }
                if (arrayList2 != null) {
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        ((d) arrayList2.get(i4)).f2511 = false;
                    }
                    this.f2499.add(new c(intent, arrayList2));
                    if (!this.f2495.hasMessages(1)) {
                        this.f2495.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2461() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2498) {
                size = this.f2499.size();
                if (size <= 0) {
                    return;
                }
                cVarArr = new c[size];
                this.f2499.toArray(cVarArr);
                this.f2499.clear();
            }
            for (int i = 0; i < size; i++) {
                c cVar = cVarArr[i];
                for (int i2 = 0; i2 < cVar.f2502.size(); i2++) {
                    cVar.f2502.get(i2).f2513.onReceive(this.f2500, cVar.f2503);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2463(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2491;
            int i2 = f2494;
            if (f2486) {
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
            if (f2488) {
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2462(int i, int i2, char c2) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f2489[b.f638 + i]) ^ (((long) b.f638) * f2487)) ^ ((long) c2));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
