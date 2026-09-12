package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ik {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2574 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final String[] f2575;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2576;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2577;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final b f2578;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final SQLiteDatabase f2579;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m2472() {
        f2577 = 129;
    }

    static {
        m2472();
        f2575 = new String[]{m2471("\ufff8\f\ufffe", View.combineMeasuredStates(0, 0) + 2, 238 - KeyEvent.getDeadChar(0, 0), false, 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2471("\ufff6\u0001\u000b", 2 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "") + 236, false, 3 - TextUtils.getCapsMode("", 0, 0)).intern()};
        int i = f2576 + 21;
        f2574 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public ik(Context context, String str) {
        b bVar = new b(context, str);
        this.f2578 = bVar;
        this.f2579 = bVar.getWritableDatabase();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2477(String str, String str2) {
        int i = 2 % 2;
        ContentValues contentValues = new ContentValues();
        contentValues.put(m2471("\ufff6\u0001\u000b", (ViewConfiguration.getTapTimeout() >> 16) + 2, (KeyEvent.getMaxKeyCode() >> 16) + 236, false, 3 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), str2);
        if (this.f2579.update(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", 8 - ExpandableListView.getPackedPositionType(0L), TextUtils.getCapsMode("", 0, 0) + 238, false, 8 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), contentValues, m2471("ￗ\ufff6\"\u001c0ￗ\ufff4", 1 - ExpandableListView.getPackedPositionChild(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + InterfaceC0280i1.c.b.c, false, 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new String[]{str}) == 0) {
            contentValues.put(m2471("\ufff8\f\ufffe", KeyEvent.keyCodeFromString("") + 2, TextUtils.getCapsMode("", 0, 0) + 238, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3).intern(), str);
            this.f2579.replace(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", Color.argb(0, 0, 0, 0) + 8, 237 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 7 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), null, contentValues);
            int i2 = f2574 + 69;
            f2576 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = f2574 + 105;
        f2576 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    protected final synchronized String m2474(String str) {
        int i = 2 % 2;
        int i2 = f2574 + 125;
        f2576 = i2 % 128;
        int i3 = i2 % 2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2579.query(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", ((Process.getThreadPriority(0) + 20) >> 6) + 8, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 237, false, 8 - TextUtils.indexOf("", "", 0)).intern(), f2575, m2471("ￗ\ufff6\"\u001c0ￗ\ufff4", 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-16777014) - Color.rgb(0, 0, 0), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 8).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2471("\ufff6\u0001\u000b", 2 - ExpandableListView.getPackedPositionType(0L), View.resolveSizeAndState(0, 0, 0) + 236, false, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                        int i4 = 2 % 2;
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                int i5 = f2574 + 43;
                f2576 = i5 % 128;
                if (i5 % 2 != 0) {
                    cursorQuery.close();
                    throw null;
                }
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2473(String str) {
        int i = 2 % 2;
        int i2 = f2576 + 91;
        f2574 = i2 % 128;
        int i3 = i2 % 2;
        this.f2579.delete(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", 8 - (Process.myTid() >> 22), 238 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern(), m2471("\u0011￥￣\u001f\u000b", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), 219 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, 4 - TextUtils.lastIndexOf("", '0', 0)).intern(), new String[]{str});
        int i4 = f2576 + 77;
        f2574 = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized HashMap<String, String> m2476(String str, int i) {
        String string;
        HashMap<String, String> map;
        try {
            int i2 = 2 % 2;
            Cursor cursorQuery = null;
            try {
                String strReplace = str.replace('*', '%');
                String strIntern = m2471("ￖ\ufff5!\u001b/ￖ\u0002\uffff\u0001\ufffb", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1, ImageFormat.getBitsPerPixel(0) + InterfaceC0280i1.c.b.e, false, View.MeasureSpec.getMode(0) + 10).intern();
                String[] strArr = {strReplace};
                if (i <= 0) {
                    int i3 = f2576 + 3;
                    f2574 = i3 % 128;
                    int i4 = i3 % 2;
                    string = null;
                } else {
                    string = Integer.toString(i);
                }
                cursorQuery = this.f2579.query(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", View.MeasureSpec.getMode(0) + 8, KeyEvent.normalizeMetaState(0) + 238, false, 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), f2575, strIntern, strArr, null, null, null, string);
                map = new HashMap<>();
                while (cursorQuery != null) {
                    int i5 = f2576 + 25;
                    f2574 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 41 / 0;
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        try {
                            map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2471("\ufff8\f\ufffe", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 237 - ImageFormat.getBitsPerPixel(0), false, KeyEvent.getDeadChar(0, 0) + 3).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2471("\ufff6\u0001\u000b", 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 236, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2).intern())));
                        } catch (IllegalArgumentException unused) {
                        }
                    } else {
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2471("\ufff8\f\ufffe", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 237 - ImageFormat.getBitsPerPixel(0), false, KeyEvent.getDeadChar(0, 0) + 3).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2471("\ufff6\u0001\u000b", 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 236, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2).intern())));
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    int i7 = f2576 + 5;
                    f2574 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 2;
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized int m2475(String str) {
        int i = 2 % 2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2579.query(m2471("\ufffe\t\ufff2\u0006\u0007\u0002\u0005\ufff8", 7 - ImageFormat.getBitsPerPixel(0), 238 - View.resolveSizeAndState(0, 0, 0), false, 8 - View.resolveSizeAndState(0, 0, 0)).intern(), new String[]{m2471("\uffd9'\u0012\u001dￚ\ufff4\u0000\u0006\uffff\u0005", ExpandableListView.getPackedPositionChild(0L) + 6, 207 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()}, m2471("ￖ\ufff5!\u001b/ￖ\u0002\uffff\u0001\ufffb", View.resolveSizeAndState(0, 0, 0) + 2, 203 - Color.alpha(0), false, 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery != null) {
                int i2 = f2574 + 57;
                f2576 = i2 % 128;
                int i3 = i2 % 2;
                if (cursorQuery.moveToFirst()) {
                    int i4 = f2576 + 35;
                    f2574 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = cursorQuery.getInt(0);
                    if (cursorQuery != null) {
                        int i7 = f2576 + 117;
                        f2574 = i7 % 128;
                        int i8 = i7 % 2;
                        cursorQuery.close();
                    }
                    return i6;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            int i9 = 2 % 2;
            throw th;
        }
    }

    static class b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2580 = -8009891769629366124L;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2581 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2582 = 1;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = f2581 + InterfaceC0280i1.d.b.d;
            f2582 = i4 % 128;
            int i5 = i4 % 2;
        }

        public b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = f2581 + 65;
            f2582 = i2 % 128;
            if (i2 % 2 != 0) {
                if (!sQLiteDatabase.isReadOnly()) {
                    int i3 = f2582 + 113;
                    f2581 = i3 % 128;
                    sQLiteDatabase.execSQL(m2478("꣄\uea57ⷷ潠ꊝ\ue400⟒礅뱳\uffffㅛ瓆똿즧ଥ亀臡썌ڛ堘鮎", i3 % 2 != 0 ? (ViewConfiguration.getMaximumDrawingCacheSize() / 95) * 9377 : 17041 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                }
                sQLiteDatabase.execSQL(m2478("꣗쮱渿芰├如ﱾႁ덭ퟹ䩾\ueeccĠꗖ\ud850筍龪㈼嚞쥡涝耏ⓧ䝶ﯨṘ늢핲䧦\uecb0༕ꎉ옛窱鴿ㇹ呃죂歇辕≘䛞壘᰽냀팯瞤\uea04ຉꄒ엸硸鲘㽼友\uf65c檰跋—䒘\ue71cᯯ븒튘甌\ue9f7ఓ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25462).intern());
                return;
            }
            sQLiteDatabase.isReadOnly();
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2478(String str, int i) {
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
                    cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f2580);
                    i.f2433++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2471(String str, int i, int i2, boolean z, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f2577);
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
}
