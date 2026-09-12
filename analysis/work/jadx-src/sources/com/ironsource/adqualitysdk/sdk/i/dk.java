package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dk extends cx implements ci {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1771 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1772 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1773 = true;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1774 = 3923337759896701906L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f1775 = {232, 218, 233, Typography.paragraph, 217, 235, 231, 222, 190, 201, 238, 229, 185, 202, 225, 187, 227, 214, 220, 200, 228, 234, 216, 191, 221, 219};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f1776 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1777 = 117;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1780;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1781;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1782;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hi f1783;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final JSONObject f1779 = new JSONObject();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final List<String> f1778 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1963() {
        int i = 2 % 2;
        int i2 = f1771 + 57;
        f1772 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1780;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1974(String str) {
        int i = 2 % 2;
        int i2 = f1772;
        int i3 = i2 + 1;
        f1771 = i3 % 128;
        int i4 = i3 % 2;
        this.f1780 = str;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        int i6 = i2 + 1;
        f1771 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hi m1967() {
        int i = 2 % 2;
        int i2 = f1772 + 11;
        f1771 = i2 % 128;
        int i3 = i2 % 2;
        hi hiVar = this.f1783;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return hiVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1965(hi hiVar) {
        int i = 2 % 2;
        int i2 = f1771 + 81;
        int i3 = i2 % 128;
        f1772 = i3;
        int i4 = i2 % 2;
        this.f1783 = hiVar;
        int i5 = i3 + 83;
        f1771 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1975() {
        int i = 2 % 2;
        int i2 = f1772 + 83;
        f1771 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1782;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1976(String str) {
        int i = 2 % 2;
        int i2 = f1772 + 29;
        int i3 = i2 % 128;
        f1771 = i3;
        int i4 = i2 % 2;
        this.f1782 = str;
        int i5 = i3 + 91;
        f1772 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1970() {
        int i = 2 % 2;
        int i2 = f1772 + 49;
        f1771 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1781;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1966(String str) {
        int i = 2 % 2;
        int i2 = f1771 + 39;
        int i3 = i2 % 128;
        f1772 = i3;
        int i4 = i2 % 2;
        this.f1781 = str;
        int i5 = i3 + 35;
        f1771 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m1973() {
        int i = 2 % 2;
        int i2 = f1772 + 27;
        f1771 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1778;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1969(String str) {
        int i = 2 % 2;
        int i2 = f1772 + 117;
        f1771 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str) || this.f1778.contains(str)) {
            return;
        }
        int i4 = f1771 + 23;
        f1772 = i4 % 128;
        int i5 = i4 % 2;
        this.f1778.add(str);
        int i6 = f1771 + 105;
        f1772 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 3;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1972(List<String> list) {
        int i = 2 % 2;
        int i2 = f1771 + 75;
        f1772 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> it = list.iterator();
        int i4 = f1771 + 49;
        f1772 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = f1772 + 23;
            f1771 = i6 % 128;
            int i7 = i6 % 2;
            m1969(it.next());
        }
        int i8 = f1771 + 79;
        f1772 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1955() {
        String strOptString;
        int i = 2 % 2;
        int i2 = f1772 + 25;
        f1771 = i2 % 128;
        if (i2 % 2 == 0) {
            strOptString = this.f1779.optString(ij.f2559);
            int i3 = 8 / 0;
        } else {
            strOptString = this.f1779.optString(ij.f2559);
        }
        int i4 = f1772 + 45;
        f1771 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1971(String str) {
        int i = 2 % 2;
        int i2 = f1771 + 107;
        f1772 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1779.put(ij.f2559, str);
            int i4 = f1772 + 3;
            f1771 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1959() {
        int i = 2 % 2;
        int i2 = f1771 + 41;
        f1772 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = this.f1779.optString(ij.f2555);
        int i4 = f1771 + 13;
        f1772 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1960(String str) {
        int i = 2 % 2;
        int i2 = f1772 + 31;
        f1771 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1779.put(ij.f2555, str);
                int i3 = 53 / 0;
            } else {
                this.f1779.put(ij.f2555, str);
            }
            int i4 = f1771 + InterfaceC0280i1.d.b.g;
            f1772 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Object m1961() {
        int i = 2 % 2;
        int i2 = f1772 + 87;
        f1771 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1779;
        if (i3 != 0) {
            return jSONObject.optString(ij.f2556);
        }
        jSONObject.optString(ij.f2556);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1958(String str) {
        int i = 2 % 2;
        int i2 = f1772 + 105;
        f1771 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1779.put(ij.f2556, str);
                int i3 = 48 / 0;
            } else {
                this.f1779.put(ij.f2556, str);
            }
            int i4 = f1772 + 63;
            f1771 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1956() {
        int i = 2 % 2;
        int i2 = f1772 + 99;
        f1771 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1779.optString(ij.f2553);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strOptString = this.f1779.optString(ij.f2553);
        int i3 = f1772 + 43;
        f1771 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1962(String str) {
        int i = 2 % 2;
        int i2 = f1771 + 23;
        f1772 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1779.put(ij.f2553, str);
            int i4 = f1771 + 37;
            f1772 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private JSONObject m1957() {
        int i = 2 % 2;
        int i2 = f1772 + 123;
        int i3 = i2 % 128;
        f1771 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObject = this.f1779;
        int i4 = i3 + 113;
        f1772 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m1954() {
        int i = 2 % 2;
        boolean z = true;
        if (TextUtils.isEmpty(this.f1780) && TextUtils.isEmpty(this.f1782)) {
            int i2 = f1771 + 67;
            f1772 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
                if (TextUtils.isEmpty(this.f1781)) {
                    if (this.f1778.size() > 0) {
                        z = false;
                    }
                }
            } else if (TextUtils.isEmpty(this.f1781)) {
                if (this.f1778.size() > 0) {
                    z = false;
                }
            }
            int i4 = f1771 + 71;
            f1772 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = f1771 + 71;
            f1772 = i6 % 128;
            int i7 = i6 % 2;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m1953() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f1780 != null && this.f1783 != null) {
                jSONObject.putOpt(ij.f2559, this.f1780);
                jSONObject.putOpt(ij.f2561, Integer.valueOf(this.f1783.m2222()));
            }
            jSONObject.putOpt(ij.f2555, this.f1782);
            jSONObject.putOpt(ij.f2556, this.f1781);
            if (this.f1778.size() > 0) {
                jSONObject.putOpt(ij.f2553, new JSONArray((Collection) this.f1778));
            }
            if (this.f1779.length() > 0) {
                int i2 = f1771 + 67;
                f1772 = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONObject.putOpt(ij.f2562, this.f1779.toString());
                    throw null;
                }
                jSONObject.putOpt(ij.f2562, this.f1779.toString());
            }
            int i3 = f1772 + 47;
            f1771 = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
        int i5 = f1771 + 15;
        f1772 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x027b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo813(String str, List<Object> list, cl clVar) {
        byte b;
        int i = 2 % 2;
        int i2 = f1772 + 53;
        f1771 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -2118395364:
                if (!str.equals(m1964("횏훨櫚㪅慭\ue20fⵕ세念冶簌냃衫Ñ䳂恬嬥\uf339龝", TextUtils.getOffsetBefore("", 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f1772 + 39;
                    f1771 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 0;
                }
                break;
            case -1836320845:
                if (!str.equals(m1968(null, 127 - View.MeasureSpec.getMode(0), null, "\u008f\u0087\u008e\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0085\u0092").intern())) {
                    b = -1;
                } else {
                    int i6 = f1771 + 55;
                    f1772 = i6 % 128;
                    if (i6 % 2 == 0) {
                        b = 9;
                    } else {
                        b = 4;
                    }
                }
                break;
            case -1700761801:
                if (!str.equals(m1964("曱暖ὖࠟᓡ戬῏䄞䧜\u243f亇デ㠓畘", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1409157227:
                b = !str.equals(m1968(null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, "\u0081\u008f\u0087\u008e\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0093").intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1296571754:
                b = !str.equals(m1968(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0082\u0097\u0087\u0096\u0095\u0094\u008f\u0087\u008e\u008f\u0092\u0091\u0088\u0090\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1247838300:
                if (!str.equals(m1968(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0091\u0095\u0081\u0098\u0082\u0097\u0087\u0096\u0095\u0094\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0093").intern())) {
                    b = -1;
                } else {
                    int i7 = f1771 + InterfaceC0280i1.d.b.b;
                    f1772 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 19;
                }
                break;
            case -1207642840:
                if (!str.equals(m1964("௱ஂ뢜࢘댫ĲὈ∅ⓝ菰丑叾唕튗统荑虛ⅿ궀", '0' - AndroidCharacter.getMirror('0')).intern())) {
                    b = -1;
                } else {
                    int i9 = f1772 + 7;
                    f1771 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 1;
                }
                break;
            case -1091371232:
                if (!str.equals(m1964("䷀䶡\ue92aἊ\ue29c帆࣊紣拧퉅妔\u0cdbጵ茝楌\udc6c쁫", Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i11 = f1771 + 119;
                    f1772 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 10;
                }
                break;
            case -869156349:
                b = !str.equals(m1964("컮캚㔾⑃㺃ﴪ㎭\ude2f\ue1c9๊", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case -772930430:
                b = !str.equals(m1968(null, TextUtils.indexOf("", "", 0) + WorkQueueKt.MASK, null, "\u0082\u008c\u008b\u008a\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 3;
                break;
            case -407028174:
                if (!str.equals(m1968(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, null, "\u0082\u0097\u0087\u0096\u0095\u0094\u008f\u0087\u008e\u0083\u0081\u0082\u008d\u0083\u0082\u0093").intern())) {
                    b = -1;
                } else {
                    int i13 = f1772 + 25;
                    f1771 = i13 % 128;
                    b = i13 % 2 != 0 ? Ascii.CR : (byte) 78;
                }
                break;
            case -356418934:
                b = !str.equals(m1964("젿졘\uee66㵙\ue5d1鶙⪉뺩\ue71e픒篔콋雺葶䬁ῌ䖈瞹顗Ⲵ畺", Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : Ascii.SI;
                break;
            case -140869031:
                b = !str.equals(m1964("䫑䪶첨ꡌ윟鑀뾜띥时\uf7c7\ueed2욝ᐤꚟ\ude0aᘪ읚啭\u0d45╼\uf792п", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 205499235:
                b = !str.equals(m1968(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : Ascii.FF;
                break;
            case 236043435:
                b = !str.equals(m1968(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + WorkQueueKt.MASK, null, "\u008f\u0087\u008e\u0083\u0081\u0082\u008d\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 5;
                break;
            case 770797430:
                b = !str.equals(m1964("蔳蕔Ꮚ\uf37a\u187d瀱\ue4aa匆ꨟ⢦뗳⋽\udbd7私蔽\uf252࢙訩噢섫㡪\udb48⟛", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 779164621:
                if (!str.equals(m1964("\uef1c\uef6f쇡\uda76쩖ᗗ춦㛲쀻搜鳨䜊뇩ꯖ갰鞽抗堤罿ꓫ剟ॶ", ViewConfiguration.getWindowTouchSlop() >> 8).intern())) {
                    b = -1;
                } else {
                    int i14 = f1772 + 117;
                    f1771 = i14 % 128;
                    b = i14 % 2 != 0 ? Ascii.DC2 : (byte) 60;
                }
                break;
            case 1308044955:
                b = !str.equals(m1968(null, View.MeasureSpec.getMode(0) + WorkQueueKt.MASK, null, "\u008f\u0087\u008e\u008f\u0092\u0091\u0088\u0090\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1396624783:
                b = !str.equals(m1964("\ue517\ue570ᨒ\ud81bᆥ髺쿋맊쨶Ⅶ麖젨믒瀂깃", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1924460979:
                b = !str.equals(m1968(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + WorkQueueKt.MASK, null, "\u0095\u009a\u0091\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0081\u0092\u0099").intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case 1964255575:
                if (!str.equals(m1968(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + WorkQueueKt.MASK, null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0093").intern())) {
                    b = -1;
                } else {
                    int i15 = f1771 + 1;
                    f1772 = i15 % 128;
                    int i16 = i15 % 2;
                    b = Ascii.VT;
                }
                break;
            case 2056496294:
                b = !str.equals(m1968(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u0082\u0097\u0087\u0096\u0095\u0094\u008f\u0087\u008e\u0083\u0081\u0082\u008d\u0083\u0082\u0081").intern()) ? (byte) -1 : Ascii.SO;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return m1963();
            case 1:
                m1974((String) m1770(list, 0, String.class));
                return null;
            case 2:
                if (m1967() == null) {
                    return null;
                }
                int i17 = f1771 + 125;
                f1772 = i17 % 128;
                int i18 = i17 % 2;
                return Integer.valueOf(m1967().m2222());
            case 3:
                m1965(hi.m2219(((Integer) m1770(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m1975();
            case 5:
                m1976((String) m1770(list, 0, String.class));
                return null;
            case 6:
                return m1970();
            case 7:
                m1966((String) m1770(list, 0, String.class));
                return null;
            case 8:
                return m1973();
            case 9:
                m1969((String) m1770(list, 0, String.class));
                return null;
            case 10:
                m1972((List<String>) m1770(list, 0, List.class));
                return null;
            case 11:
                return m1955();
            case 12:
                m1971((String) m1770(list, 0, String.class));
                return null;
            case 13:
                return m1959();
            case 14:
                m1960((String) m1770(list, 0, String.class));
                return null;
            case 15:
                return m1961();
            case 16:
                m1958((String) m1770(list, 0, String.class));
                return null;
            case 17:
                return m1956();
            case 18:
                m1962((String) m1770(list, 0, String.class));
                return null;
            case 19:
                return m1957();
            case 20:
                return m1954();
            case 21:
                return m1953();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1964(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f1774, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f1774));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1968(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1775;
            int i2 = f1777;
            if (f1773) {
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
            if (f1776) {
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
}
