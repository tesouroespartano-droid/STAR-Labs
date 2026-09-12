package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.List;
import java.util.Map;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class eh extends ef {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1968 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f1969 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1970 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1971 = 572501825;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f1972 = {-10, -69, 66, -78, 68, 74, -73, 70, -68, 87, 1, -24, -69, 65, Ascii.DC4, -24, SignedBytes.MAX_POWER_OF_TWO, 67, -77, 75, -76, 85, -87, 70, Ascii.ETB, -3, -67, 65, -79, 87, -88, 77, 79, -81, 85, 1, -22, 71, -71, 68, 105, 47, -110, 125, 120, -117, 112, -52, Utf8.REPLACEMENT_BYTE, 124, 114, -127, -128, 124, -125, 120, -127, -122, 122, -42, 49, 124, -52, SignedBytes.MAX_POWER_OF_TWO, -127, -72, 56, 113, 125, -42, 50, 120, -41, 58, 122, -122, 115, -124, 125, -41, 101, Ascii.RS, -32, 0, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1973 = -916616077;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1974 = 27;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1975;

    public eh(ed edVar, ed edVar2, ed edVar3, dn dnVar) {
        super(edVar, edVar2, dnVar);
        this.f1975 = edVar3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ﾇ */
    public final dr mo2084(dq dqVar, co coVar) {
        int i = 2 % 2;
        dr drVarM2116 = m2121().m2116(dqVar, coVar);
        dr drVarM2117 = m2124().m2116(dqVar, coVar);
        try {
            Object objM2019 = m2122().m2116(dqVar, coVar).m2019();
            if (objM2019 instanceof JSONObject) {
                ((JSONObject) objM2019).put((String) drVarM2116.m2019(), drVarM2117.m2019());
                int i2 = f1968 + 87;
                f1970 = i2 % 128;
                int i3 = i2 % 2;
                return drVarM2117;
            }
            Object obj = null;
            if (objM2019 instanceof JSONArray) {
                int i4 = f1968 + 83;
                f1970 = i4 % 128;
                if (i4 % 2 == 0) {
                    ((JSONArray) objM2019).put(drVarM2116.m2023().intValue(), drVarM2117.m2019());
                    return drVarM2117;
                }
                ((JSONArray) objM2019).put(drVarM2116.m2023().intValue(), drVarM2117.m2019());
                super.hashCode();
                throw null;
            }
            if (objM2019 instanceof Map) {
                int i5 = f1968 + 25;
                f1970 = i5 % 128;
                if (i5 % 2 == 0) {
                    ((Map) objM2019).put(drVarM2116.m2019(), drVarM2117.m2019());
                    return drVarM2117;
                }
                ((Map) objM2019).put(drVarM2116.m2019(), drVarM2117.m2019());
                int i6 = 40 / 0;
                return drVarM2117;
            }
            if (!(objM2019 instanceof List)) {
                if (!(!objM2019.getClass().isArray())) {
                    ((Object[]) objM2019)[drVarM2116.m2023().intValue()] = drVarM2117.m2019();
                    return drVarM2117;
                }
                cn.m1575(coVar.m1624(), new StringBuilder().append(m2125((-572501825) - (Process.myPid() >> 22), (byte) (68 - TextUtils.indexOf("", "")), 15 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 916616146, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()).append(this).append(m2117()).append(m2125(KeyEvent.getDeadChar(0, 0) - 572501784, (byte) (ExpandableListView.getPackedPositionGroup(0L) - 125), 14 - TextUtils.indexOf("", ""), 916616135 - (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((-1) - Process.getGidForName(""))).intern()).append(objM2019).toString(), null);
                return drVarM2117;
            }
            int i7 = f1968 + 11;
            f1970 = i7 % 128;
            if (i7 % 2 == 0) {
                ((List) objM2019).set(drVarM2116.m2023().intValue(), drVarM2117.m2019());
                return drVarM2117;
            }
            ((List) objM2019).set(drVarM2116.m2023().intValue(), drVarM2117.m2019());
            throw null;
        } catch (Exception e) {
            cn.m1575(coVar.m1624(), new StringBuilder().append(m2125(TextUtils.lastIndexOf("", '0') - 572501824, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 69), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, View.MeasureSpec.getSize(0) + 916616146, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).append(this).append(m2117()).toString(), e);
            return drVarM2117;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed m2124() {
        int i = 2 % 2;
        int i2 = f1968;
        int i3 = i2 + 117;
        f1970 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ed edVar = this.f1975;
        int i4 = i2 + 3;
        f1970 = i4 % 128;
        int i5 = i4 % 2;
        return edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final String toString() {
        int i = 2 % 2;
        String string = new StringBuilder().append(super.toString()).append(m2125(TextUtils.indexOf("", "", 0, 0) - 572501744, (byte) (ExpandableListView.getPackedPositionGroup(0L) - 3), View.MeasureSpec.getSize(0) - 24, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 916616109, (short) View.resolveSize(0, 0)).intern()).append(m2124().toString()).toString();
        int i2 = f1968 + 75;
        f1970 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1970;
        int i3 = i2 + 37;
        f1968 = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 47;
            f1968 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ed edVar = this.f1975;
        ed edVar2 = ((eh) obj).f1975;
        if (edVar != null) {
            return edVar.equals(edVar2);
        }
        if (edVar2 == null) {
            int i7 = f1968 + 123;
            f1970 = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f1970 + 119;
        f1968 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = super.hashCode() * 31;
        ed edVar = this.f1975;
        if (edVar != null) {
            int i4 = f1970 + 21;
            f1968 = i4 % 128;
            if (i4 % 2 == 0) {
                edVar.hashCode();
                throw null;
            }
            iHashCode = edVar.hashCode();
        } else {
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2125(int i, byte b, int i2, int i3, short s) {
        String string;
        synchronized (l.f2999) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1974;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1972;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1971 + i] + i4);
                } else {
                    i5 = (short) (f1969[f1971 + i] + i4);
                }
            }
            if (i5 > 0) {
                l.f3000 = ((i + i5) - 2) + f1971 + i6;
                l.f3002 = b;
                l.f3004 = (char) (i3 + f1973);
                sb.append(l.f3004);
                l.f3003 = l.f3004;
                l.f3001 = 1;
                while (l.f3001 < i5) {
                    byte[] bArr2 = f1972;
                    if (bArr2 != null) {
                        int i7 = l.f3000;
                        l.f3000 = i7 - 1;
                        l.f3004 = (char) (l.f3003 + (((byte) (bArr2[i7] + s)) ^ l.f3002));
                    } else {
                        short[] sArr = f1969;
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
