package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class du {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1876 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1877 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1878 = {38290, 17487, 13832, 57578, 'b', 53665, 41976, 29971, 22796, 35061, 64167, 11340, 7683, 16495, 46061, 58762, 55115, 14596, 27436, 23293, 35974, 65055, 8288, 4670, 17885, 46991, 39258, 52071, 15729, 16699, 37085, 58014, 13428, 1569, 22548, 43906, ' ', 53670, 41981, 29977, 18200, 6504, 60065, 48334, 36380, 24606, 12910, 949, 54732, 42767, 25248, 45859, 49529, 6046, 9680, 31721, 34864, 56834, 60565, 710, 20732, 24895, 46923, 50562, 7073, 10742, 32320, 53531, 148, 29397, 42038, 38518, 51280, 15242, 28151, 24383, 45430, 58135, 53891, 1254, 30265, 43103, 39515, 52670, 16374, 4386, 17176, 46421, 58552, 55019, 2201};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1879 = 1195706636530799054L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String[] f1880;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr f1881;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1882;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2082() {
        int i = 2 % 2;
        int i2 = f1877;
        int i3 = i2 + 117;
        f1876 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1882;
        int i5 = i2 + 79;
        f1876 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public du(String str, String str2, JSONObject jSONObject) {
        this.f1882 = dx.m2086(str2);
        List listM2812 = kd.m2812(jSONObject.optJSONArray(m2080(ViewConfiguration.getMaximumFlingVelocity() >> 16, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (char) (Process.getGidForName("") + 38388)).intern()), new kd.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.du.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo546(JSONArray jSONArray, int i) {
                return dx.m2086(jSONArray.optString(i));
            }
        });
        String[] strArr = new String[listM2812.size()];
        this.f1880 = strArr;
        listM2812.toArray(strArr);
        try {
            this.f1881 = new dt(str, str2).m2073(ds.m2028(str, str2, jSONObject.optString(m2080(4 - KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 5, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())));
        } catch (Throwable th) {
            cn.m1575(str, new StringBuilder().append(m2080(KeyEvent.normalizeMetaState(0) + 8, 20 - MotionEvent.axisFromString(""), (char) (TextUtils.getCapsMode("", 0, 0) + 22857)).intern()).append(this.f1882).toString(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr m2081(dq dqVar, co coVar, List<Object> list) {
        int i = 2 % 2;
        dq dqVar2 = new dq(m2079(coVar, list, Arrays.asList(this.f1880)), dqVar.m2011());
        fr frVar = this.f1881;
        if (frVar == null) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2080(29 - TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16757)).intern()).append(this.f1882).append(m2080((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36, TextUtils.indexOf("", "", 0) + 14, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()).toString(), null);
            return null;
        }
        int i2 = f1876 + InterfaceC0280i1.d.b.b;
        f1877 = i2 % 128;
        int i3 = i2 % 2;
        dr drVarMo2153 = frVar.mo2153(dqVar2, coVar);
        int i4 = f1877 + 99;
        f1876 = i4 % 128;
        int i5 = i4 % 2;
        return drVarMo2153;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, Object> m2079(co coVar, List<Object> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = f1877 + 119;
        f1876 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        if (list.size() != list2.size()) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(this.f1882).append(m2080(50 - (KeyEvent.getMaxKeyCode() >> 16), 17 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (25216 - (Process.myTid() >> 22))).intern()).append(list2.size()).append(m2080(68 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24 - ExpandableListView.getPackedPositionGroup(0L), (char) (53563 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern()).append(list.size()).toString(), null);
            return null;
        }
        HashMap map = new HashMap();
        while (i4 < list.size()) {
            int i5 = f1877 + 81;
            f1876 = i5 % 128;
            if (i5 % 2 != 0) {
                map.put(list2.get(i4), list.get(i4));
                i4 += 36;
            } else {
                map.put(list2.get(i4), list.get(i4));
                i4++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2080(int i, int i2, char c) {
        String str;
        synchronized (b.f637) {
            char[] cArr = new char[i2];
            b.f638 = 0;
            while (b.f638 < i2) {
                cArr[b.f638] = (char) ((((long) f1878[b.f638 + i]) ^ (((long) b.f638) * f1879)) ^ ((long) c));
                b.f638++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
