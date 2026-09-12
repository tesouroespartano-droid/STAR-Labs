package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ay.AnonymousClass1;
import com.ironsource.adqualitysdk.sdk.i.ay.AnonymousClass2;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class at {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f445 = 0;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f446 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f447 = {-1392555569, 1447304831, -942094359, -1433640853, 2134648983, -1015817577, -820297911, 1081018105, 1445476433, -478777670, 3517544, -1346602049, 1264684728, -1718680800, 667770048, -1688968877, -294941767, -1472833190};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static long f448 = 1938564429926270690L;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private az f449;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ISAdQualityInitListener f450;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private iw f451;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private ay f454;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f455;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f460 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<cp> f457 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<gk> f458 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, JSONObject> f461 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, String> f459 = new HashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private db f452 = new db();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dq f453 = dq.m2008();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map<String, au> f456 = new HashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ List m565(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 19;
        f445 = i2 % 128;
        if (i2 % 2 == 0) {
            return atVar.m574();
        }
        atVar.m574();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m568(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 11;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m612();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ Map m570(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 113;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, JSONObject> mapM566 = atVar.m566();
        int i4 = f445 + 89;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return mapM566;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ boolean m572(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 123;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM562 = atVar.m562();
        int i4 = f445 + 75;
        f446 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM562;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ String m573(at atVar) {
        int i = 2 % 2;
        int i2 = f445;
        int i3 = i2 + 73;
        f446 = i3 % 128;
        int i4 = i3 % 2;
        String str = atVar.f455;
        if (i4 == 0) {
            int i5 = 23 / 0;
        }
        int i6 = i2 + 53;
        f446 = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ay m575(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 67;
        int i3 = i2 % 128;
        f445 = i3;
        int i4 = i2 % 2;
        ay ayVar = atVar.f454;
        int i5 = i3 + 11;
        f446 = i5 % 128;
        int i6 = i5 % 2;
        return ayVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m580(at atVar, Context context, String str, String str2, List list, iu iuVar) {
        int i = 2 % 2;
        int i2 = f445 + 43;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        atVar.m602(context, str, str2, (List<gk>) list, iuVar);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f445 + 117;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m581(cp cpVar) {
        int i = 2 % 2;
        int i2 = f446 + 41;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM598 = m598(cpVar);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return zM598;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m583(at atVar, List list) {
        int i = 2 % 2;
        int i2 = f445 + 99;
        int i3 = i2 % 128;
        f446 = i3;
        int i4 = i2 % 2;
        atVar.f457 = list;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 45;
        f445 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m584(at atVar, Map map) {
        int i = 2 % 2;
        int i2 = f445 + 33;
        int i3 = i2 % 128;
        f446 = i3;
        int i4 = i2 % 2;
        atVar.f456 = map;
        int i5 = i3 + 3;
        f445 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m587(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 25;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        atVar.m564();
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f446 + 117;
        f445 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m593(at atVar) {
        int i = 2 % 2;
        int i2 = f445 + 87;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        List<cp> listM571 = atVar.m571();
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return listM571;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m596(at atVar, Context context, String str, String str2, gk gkVar, iu iuVar) {
        int i = 2 % 2;
        int i2 = f446 + 117;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m601(context, str, str2, gkVar, iuVar);
        int i4 = f445 + 117;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m599(at atVar) {
        int i = 2 % 2;
        int i2 = f446 + 119;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM569 = atVar.m569();
        int i4 = f445 + 73;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return mapM569;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m600(at atVar, cp cpVar) {
        int i = 2 % 2;
        int i2 = f445 + 77;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM610 = m610(cpVar);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return jSONObjectM610;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m604(at atVar, cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f445 + 1;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m619(cpVar, str);
        int i4 = f446 + 117;
        f445 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m605(at atVar, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f445 + 59;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m620(str, jSONObject);
        int i4 = f445 + 1;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m606(cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f446 + 1;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM588 = m588(cpVar, str);
        int i4 = f445 + 85;
        f446 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM588;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ cp m607(at atVar, Context context, String str, bg bgVar) {
        int i = 2 % 2;
        int i2 = f446 + 69;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        cp cpVarM576 = atVar.m576(context, str, bgVar);
        int i4 = f445 + 27;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return cpVarM576;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ dq m608(at atVar, dq dqVar) {
        int i = 2 % 2;
        int i2 = f446;
        int i3 = i2 + 35;
        f445 = i3 % 128;
        int i4 = i3 % 2;
        atVar.f453 = dqVar;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 75;
        f445 = i5 % 128;
        if (i5 % 2 == 0) {
            return dqVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m609(at atVar) {
        int i = 2 % 2;
        int i2 = f445 + 21;
        f446 = i2 % 128;
        if (i2 % 2 == 0) {
            atVar.m567();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        List<cp> listM567 = atVar.m567();
        int i3 = f445 + 99;
        f446 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return listM567;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m614(at atVar, Context context) {
        int i = 2 % 2;
        int i2 = f445 + 33;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m613(context);
        int i4 = f445 + 95;
        f446 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m615(at atVar, Context context, String str, String str2, gk gkVar, cp cpVar, boolean z, bg bgVar, iu iuVar) {
        int i = 2 % 2;
        int i2 = f446 + 73;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m595(context, str, str2, gkVar, cpVar, z, bgVar, iuVar);
        int i4 = f445 + 55;
        f446 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m616(at atVar, Context context, String str, String str2, List list, iu iuVar) {
        int i = 2 % 2;
        int i2 = f446 + 97;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m578(context, str, str2, list, iuVar);
        int i4 = f446 + 41;
        f445 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m617(at atVar, Context context, List list, List list2, iu iuVar) {
        int i = 2 % 2;
        int i2 = f445 + 63;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m603(context, list, list2, iuVar);
        int i4 = f445 + 121;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m618(at atVar, Context context, Map map, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f445 + 77;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        atVar.m579(context, (Map<String, List<gk>>) map, runnable);
        int i4 = f445 + 41;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m621(at atVar, String str) {
        int i = 2 % 2;
        int i2 = f446 + 27;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM582 = atVar.m582(str);
        int i4 = f446 + 113;
        f445 = i4 % 128;
        int i5 = i4 % 2;
        return zM582;
    }

    public at(iw iwVar, ag agVar, String str, ay ayVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f451 = iwVar;
        az azVar = new az(p.m2890(), agVar);
        this.f449 = azVar;
        jz.m2761(azVar);
        this.f449.m694(new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f529 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f530 = 844618634578784455L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f531 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final JSONObject mo638(String str2, JSONObject jSONObject) {
                int i = 2 % 2;
                int i2 = f531 + 67;
                f529 = i2 % 128;
                if (i2 % 2 != 0) {
                    if (!str2.equals(m637("炳詮蔪耩鯑隈醾ꭚ", 64217 >> (ViewConfiguration.getLongPressTimeout() >> 80)).intern())) {
                        return null;
                    }
                } else if (!str2.equals(m637("炳詮蔪耩鯑隈醾ꭚ", 64217 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return null;
                }
                JSONObject jSONObjectM625 = at.this.m625();
                int i3 = f529 + 93;
                f531 = i3 % 128;
                int i4 = i3 % 2;
                return jSONObjectM625;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m637(String str2, int i) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2434) {
                    i.f2432 = i;
                    char[] cArr2 = new char[cArr.length];
                    i.f2433 = 0;
                    while (i.f2433 < cArr.length) {
                        cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f530);
                        i.f2433++;
                    }
                    str3 = new String(cArr2);
                }
                return str3;
            }
        });
        this.f455 = str;
        this.f454 = ayVar;
        this.f450 = iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m626(final Context context, final Runnable runnable) {
        int i = 2 % 2;
        if (this.f460) {
            p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.11
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    runnable.run();
                }
            });
            return;
        }
        n.m2874(m590("ា៷\u12b6䒑䊂鐰䤄홑\u0c5f낰涴\uf2d8⃟꼗\u0001西", ViewConfiguration.getScrollBarSize() >> 8).intern(), new StringBuilder().append(m590("몔몹즓\uefba㒬作\ue253ꀧꄱ比웛蒯趩瑌ꭃＷ\ue821Ⴤ迆폻퓆㳾鐰㘹㍓\ud96c碤⪁῁\ue5a1崏ഞ穽蹼↧憞暽\uaac5ׇ䑪", (-1) - TextUtils.lastIndexOf("", '0')).intern()).append(IronSourceAdQuality.getSDKVersion()).append(m592(new int[]{1218151774, -392059207, 1172680211, 1466832271, 1172680211, 1466832271, 1662845312, 149884661}, 15 - View.resolveSizeAndState(0, 0, 0)).intern()).toString());
        iu iuVar = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        runnable.run();
                    }
                });
                at.m614(at.this, context);
            }
        };
        if (m563()) {
            m577(context, iuVar);
            int i2 = f445 + 25;
            f446 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            m586(context, iuVar);
        }
        this.f460 = true;
        int i4 = f445 + 105;
        f446 = i4 % 128;
        if (i4 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m624(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f446 + 115;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        this.f449.m696(iSAdQualityAdListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m627() {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.12
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                Iterator it = at.m593(at.this).iterator();
                while (it.hasNext()) {
                    ((cp) it.next()).m1699();
                }
                at.m609(at.this).clear();
                at.m583(at.this, (List) null);
            }
        });
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ay.5
            AnonymousClass5() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                ay.this.f605.clear();
                ay.this.f605 = null;
            }
        });
        this.f454 = null;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() throws Exception {
                at.m608(at.this, (dq) null);
            }
        });
        int i2 = f445 + 51;
        f446 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m625() {
        int i = 2 % 2;
        int i2 = f445 + InterfaceC0280i1.d.b.b;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        try {
            JSONObject jSONObjectM611 = m611(m566());
            int i4 = f446 + 11;
            f445 = i4 % 128;
            int i5 = i4 % 2;
            return jSONObjectM611;
        } catch (JSONException e) {
            n.m2873(m590("賘貛\ue210茄\ueed4撝躮稜霵䀙\uaa3c底뮺徯잱┌\ude21㬍\ue33dঘ", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m592(new int[]{62382367, 665236544, 621300851, -299226078, 1486061872, -538961021, 1520948838, 1120132633, -798260088, 685290891, -1268298948, 2127806805, 275192940, -835211320, 1490530197, 657474981}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30).intern(), (Throwable) e);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m623() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = new HashSet(m569().keySet()).iterator();
            while (it.hasNext()) {
                int i2 = f445 + 75;
                f446 = i2 % 128;
                if (i2 % 2 == 0) {
                    String str = (String) it.next();
                    jSONObject2.put(str, m569().get(str));
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                String str2 = (String) it.next();
                jSONObject2.put(str2, m569().get(str2));
            }
            jSONObject.put(m590("㩯㨊ꊖﴃ噍␆\uf0b5슘", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            n.m2873(m590("賘貛\ue210茄\ueed4撝躮稜霵䀙\uaa3c底뮺徯잱┌\ude21㬍\ue33dঘ", Drawable.resolveOpacity(0, 0)).intern(), m590("标桂큤靨㣥围髞갬珽爮빅袯彳淿폒\uf334㪿ॽ\uf75b\udfb5ى┃\uecef㩗\ue1c0삜$⛎쵅ﰄ◳Ł\ua8cc", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), (Throwable) e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m577(Context context, iu iuVar) {
        int i = 2 % 2;
        m603(context, new ArrayList(ba.m706()), new ArrayList(ba.m707()), iuVar);
        int i2 = f445 + 35;
        f446 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m603(Context context, final List<gk> list, final List<String> list2, final iu iuVar) {
        final Context context2;
        iu iuVar2;
        int i = 2 % 2;
        int i2 = f445 + 1;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        if (list.isEmpty()) {
            return;
        }
        gk gkVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (!list.isEmpty()) {
            context2 = context;
            iuVar2 = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    p.m2892(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            at.m617(at.this, context2, list, list2, iuVar);
                        }
                    }, ar.m480().mo484());
                }
            };
        } else {
            context2 = context;
            int i4 = f446 + 61;
            int i5 = i4 % 128;
            f445 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 63;
            f446 = i7 % 128;
            int i8 = i7 % 2;
            iuVar2 = iuVar;
        }
        m594(context2, gkVarRemove, strRemove, iuVar2);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m586(Context context, iu iuVar) {
        int i = 2 % 2;
        int i2 = f445 + 29;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        m594(context, ba.m708(), ba.m702(), iuVar);
        int i4 = f446 + 45;
        f445 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m594(final Context context, final gk gkVar, final String str, final iu iuVar) {
        int i = 2 % 2;
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.15
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                final String lowerCase = str.toLowerCase();
                at.m575(at.this).m677(lowerCase);
                p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.15.5

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f487 = 1;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f489;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static char[] f490 = {'C', 43765, 21850, 65440, 43533, 21857, 65512, 43609, 21666, 65319, 43621, 21744, 65369, 43445, 21513, 65396, 27972, 51193, 14416, 37559, 50956, 14446, 37629, 51026, 14759, 37390, 51047, 14836, 37397, 50364, 14606, 37477, 50371, 14674, 37818, 50199, 14698, 37853, 50193, 19928, 59253, 6363, 45628, 59271, 6335, 45666, 59353, 6440, 45718, 59373, 6506, 45771, 58408, 6609, 45816, 58450, 6601, 45863, 58518, 6646, 45899, 58574, 7737, 46029};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static long f488 = -7165724938237465958L;

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        int i2 = 2 % 2;
                        n.m2870(m631(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 15 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new StringBuilder().append(m631(16 - (ViewConfiguration.getScrollBarSize() >> 8), 23 - ExpandableListView.getPackedPositionType(0L), (char) (27917 - (Process.myTid() >> 22))).intern()).append(lowerCase).toString());
                        try {
                            at.m596(at.this, context, str, lowerCase, gkVar, iuVar);
                            int i3 = f487 + 123;
                            f489 = i3 % 128;
                            int i4 = i3 % 2;
                        } catch (Throwable th) {
                            p.m2899(at.m575(at.this).new AnonymousClass1(lowerCase, bb.e.f694));
                            at.m599(at.this).put(str, jz.m2769(th).toString());
                            jz.m2760(m631(ViewConfiguration.getEdgeSlop() >> 16, AndroidCharacter.getMirror('0') - ' ', (char) TextUtils.indexOf("", "")).intern(), new StringBuilder().append(m631(40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25, (char) (19869 - KeyEvent.keyCodeFromString(""))).intern()).append(lowerCase).toString(), th, true, true, true);
                        }
                    }

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m631(int i2, int i3, char c) {
                        String str2;
                        synchronized (b.f637) {
                            char[] cArr = new char[i3];
                            b.f638 = 0;
                            while (b.f638 < i3) {
                                cArr[b.f638] = (char) ((((long) f490[b.f638 + i2]) ^ (((long) b.f638) * f488)) ^ ((long) c));
                                b.f638++;
                            }
                            str2 = new String(cArr);
                        }
                        return str2;
                    }
                });
            }
        });
        int i2 = f445 + 71;
        f446 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m613(final Context context) {
        int i = 2 % 2;
        int i2 = f445 + 11;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        if (!m562()) {
            p.m2892(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.17
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.17.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            at.m587(at.this);
                        }
                    });
                }
            }, ar.m480().mo489());
            int i4 = f446 + 27;
            f445 = i4 % 128;
            int i5 = i4 % 2;
        }
        final Map<String, List<gk>> mapM701 = ba.m701();
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                at.m584(at.this, ar.m480().mo508());
                at.m618(at.this, context, mapM701, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        if (at.m572(at.this)) {
                            at.m587(at.this);
                        }
                    }
                });
                ar.m480().mo509(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18.4

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f499 = 1;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f500 = {'0', 'g', 'g', 'd', 'f', 'k', 'Z', 'Y', 'n', 'n', 'i', 'd', 'k', 'q', 'p', '_', '4', 'k', 'j', 'C', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'o', 'd', 'B', 'A', 'i', 'n', 'n', 'i', 'd', 'k', 'q', 'p', 'r', '[', 'V', 'n', 'j', 'a', 'g'};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f501;

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo385() {
                        int i6 = 2 % 2;
                        int i7 = f501 + 15;
                        f499 = i7 % 128;
                        int i8 = i7 % 2;
                        at.m584(at.this, ar.m480().mo508());
                        n.m2870(m632(new int[]{0, 16, 0, 6}, false, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m632(new int[]{16, 32, 0, 26}, false, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000").intern());
                        at.m568(at.this);
                        int i9 = f499 + 31;
                        f501 = i9 % 128;
                        int i10 = i9 % 2;
                    }

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m632(int[] iArr, boolean z, String str) throws UnsupportedEncodingException {
                        String str2;
                        Object bytes = str;
                        if (str != null) {
                            bytes = str.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        synchronized (j.f2691) {
                            int i6 = iArr[0];
                            int i7 = iArr[1];
                            int i8 = iArr[2];
                            int i9 = iArr[3];
                            char[] cArr = new char[i7];
                            System.arraycopy(f500, i6, cArr, 0, i7);
                            if (bArr != null) {
                                char[] cArr2 = new char[i7];
                                j.f2692 = 0;
                                char c = 0;
                                while (j.f2692 < i7) {
                                    if (bArr[j.f2692] == 1) {
                                        cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                                    } else {
                                        cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                                    }
                                    c = cArr2[j.f2692];
                                    j.f2692++;
                                }
                                cArr = cArr2;
                            }
                            if (i9 > 0) {
                                char[] cArr3 = new char[i7];
                                System.arraycopy(cArr, 0, cArr3, 0, i7);
                                int i10 = i7 - i9;
                                System.arraycopy(cArr3, 0, cArr, i10, i9);
                                System.arraycopy(cArr3, i9, cArr, 0, i10);
                            }
                            if (z) {
                                char[] cArr4 = new char[i7];
                                j.f2692 = 0;
                                while (j.f2692 < i7) {
                                    cArr4[j.f2692] = cArr[(i7 - j.f2692) - 1];
                                    j.f2692++;
                                }
                                cArr = cArr4;
                            }
                            if (i8 > 0) {
                                j.f2692 = 0;
                                while (j.f2692 < i7) {
                                    cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                                    j.f2692++;
                                }
                            }
                            str2 = new String(cArr);
                        }
                        return str2;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.at$2, reason: invalid class name */
    final class AnonymousClass2 extends iu {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private /* synthetic */ List f503;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private /* synthetic */ String f504;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f506;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Map f507;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ Context f508;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Runnable f509;

        AnonymousClass2(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f506 = str;
            this.f508 = context;
            this.f504 = str2;
            this.f503 = list;
            this.f507 = map;
            this.f509 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            if (ar.m480().mo511(this.f506, at.m573(at.this))) {
                at.m580(at.this, this.f508, this.f504, this.f506, this.f503, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        if (at.m572(at.this)) {
                            p.m2895(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3.1
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    at.m618(at.this, AnonymousClass2.this.f508, AnonymousClass2.this.f507, AnonymousClass2.this.f509);
                                }
                            }, ar.m480().mo484());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            at.m605(at.this, this.f506, jSONObject);
            at.m570(at.this).put(this.f506, jSONObject);
            p.m2895(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    at.m618(at.this, AnonymousClass2.this.f508, AnonymousClass2.this.f507, AnonymousClass2.this.f509);
                }
            }, ar.m480().mo484());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m579(Context context, Map<String, List<gk>> map, Runnable runnable) {
        Context context2;
        Map<String, List<gk>> map2;
        Runnable runnable2;
        int i = 2 % 2;
        while (map != null) {
            int i2 = f445 + 119;
            f446 = i2 % 128;
            if (i2 % 2 == 0) {
                map.size();
                throw null;
            }
            if (map.size() <= 0) {
                break;
            }
            String next = map.keySet().iterator().next();
            List<gk> listRemove = map.remove(next);
            String strM591 = m591(listRemove);
            if (strM591 != null) {
                this.f454.m677(strM591);
                context2 = context;
                map2 = map;
                runnable2 = runnable;
                p.m2897(new AnonymousClass2(strM591, context2, next, listRemove, map2, runnable2));
                if (m562()) {
                    int i3 = f446 + 5;
                    f445 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
            } else {
                context2 = context;
                map2 = map;
                runnable2 = runnable;
            }
            context = context2;
            map = map2;
            runnable = runnable2;
        }
        final Runnable runnable3 = runnable;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                p.m2897(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m620(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        p.m2899(this.f454.new AnonymousClass2(str, bb.c.f679));
        if (jSONObject != null) {
            int i2 = f445 + 43;
            f446 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    jSONObject.put(m592(new int[]{-1255391287, 1879770768}, 2 - (Process.myPid() % 45)).intern(), false);
                    return;
                } else {
                    jSONObject.put(m592(new int[]{-1255391287, 1879770768}, 3 - (Process.myPid() >> 22)).intern(), true);
                    return;
                }
            } catch (JSONException unused) {
            }
        }
        int i3 = f445 + 57;
        f446 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m591(List<gk> list) {
        int i = 2 % 2;
        if (list == null) {
            return null;
        }
        int i2 = f446 + 39;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        if (list.isEmpty() || list.get(0) == null) {
            return null;
        }
        int i4 = f445 + InterfaceC0280i1.d.b.g;
        f446 = i4 % 128;
        return (i4 % 2 == 0 ? list.get(1) : list.get(0)).mo2168();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m602(final Context context, final String str, final String str2, final List<gk> list, final iu iuVar) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f462 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f464 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static char[] f465 = {'C', 22973, 46026, 3352, 26413, 49529, 6808, 29905, 52962, 10287, 33365, 56424, 13753, 36813, 59673, 17212, 'I', 22972, 46029, 3330, 26401, 49531, 6784, 29911, 52970, 10251, 33370, 56417, 13816, 36809, 59667, 17184, 40270, 63127, 20647, 43746, 1031, 24136, 47148, 47885, 58088, 2206, 46673, 56434, 31346, 41415, 53124, 30141, 37707, 14600, 26407, 36606, 13445, 21012, 63589, 9735, 19924, 60386, 4539, 48963, 58630, 811, 43748, 53464};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static long f463 = 6626512743470422482L;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                int i2 = 2 % 2;
                n.m2870(m630((Process.getThreadPriority(0) + 20) >> 6, 16 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new StringBuilder().append(m630((Process.myTid() >> 22) + 16, 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.resolveSizeAndState(0, 0, 0)).intern()).append(str2).toString());
                try {
                    at.m616(at.this, context, str, str2, list, iuVar);
                    int i3 = f462 + 41;
                    f464 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable th) {
                    if (at.m575(at.this) != null) {
                        p.m2899(at.m575(at.this).new AnonymousClass1(str2, bb.e.f694));
                    }
                    at.m599(at.this).put(str, jz.m2769(th).toString());
                    jz.m2760(m630(KeyEvent.keyCodeFromString(""), '@' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern(), new StringBuilder().append(m630(Drawable.resolveOpacity(0, 0) + 39, TextUtils.indexOf((CharSequence) "", '0', 0) + 26, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47944)).intern()).append(str2).toString(), th, true, true, true);
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m630(int i2, int i3, char c) {
                String str3;
                synchronized (b.f637) {
                    char[] cArr = new char[i3];
                    b.f638 = 0;
                    while (b.f638 < i3) {
                        cArr[b.f638] = (char) ((((long) f465[b.f638 + i2]) ^ (((long) b.f638) * f463)) ^ ((long) c));
                        b.f638++;
                    }
                    str3 = new String(cArr);
                }
                return str3;
            }
        });
        int i2 = f446 + 125;
        f445 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m619(final cp cpVar, final String str) {
        int i = 2 % 2;
        final String strM1703 = cpVar.m1703();
        p.m2899(this.f454.new AnonymousClass2(strM1703, bb.c.f677));
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.3

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f513 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f515;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f518 = {20397, 13143, 13190, 20332, 51807, 17718, 49180, 17165, 57069, 22999, ' ', 31881, 63905, 30401, 62396, 28912, 60703, 27169, 59208, 25712, 57716, 23961, 55985, 22495, 54414, 20905, 52745, 19250, 51274, ' ', 31886, 63933, 30357, 62450, 28908, 60702, 27249, 59201, 25722, 57714, 24013, 55975, 22478, 54482, 20985, 52767, 19237, 51274, 17728, 49768, 16083, 48056, 14520, 46472, 13051, 44830, 11320, 43364, 9800, 41853, 8087, 40078, 6562, 38605, 5089, 36883, 3345, 'E', 31893, 63932, 30426, 62446, 28835, 60675, 27199, 59217, 25707, 57711, 23948, 55992, 22482, 54488, 20960, 52766, 19248, 51230, 17734, 49763, 16029, 48052, 14500, 46539, 13051, 44825, 11311, 43364};

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static long f517 = 754213105129389287L;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f514 = 5;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char[] f516 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', ' ', 'i', 's', 'd', 'b', 'l', 'w', 'f', 'm', 'h', 'v', 'S', 'D', 'K', 'E'};

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() throws Exception {
                int i2;
                int i3 = 2 % 2;
                JSONObject jSONObjectM600 = at.m600(at.this, cpVar);
                jSONObjectM600.put(m633(TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, (char) (20423 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), true);
                at.m570(at.this).put(cpVar.m1703(), jSONObjectM600);
                String strM1696 = cpVar.m1696();
                if (!m633(View.MeasureSpec.getMode(0) + 2, 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 13250)).intern().equals(strM1696)) {
                    if (at.m621(at.this, strM1703)) {
                        n.m2870(m634("\u0001\u0002ââ\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b", (byte) (TextUtils.lastIndexOf("", '0', 0) + 117), 16 - View.resolveSizeAndState(0, 0, 0)).intern(), new StringBuilder().append(cpVar.m1702()).append(m634("\u000e\u0000\u0002\u0003\u0003\u0004\u0000\t\u0006\u000b\u000b\u000f\u0007\r\u000b\u000e\f\r\t\r\u0012\u0000\u000e\u000b\u0010\u0007\u0003\u0010\u000f\n\u0012\u0004\u000b\r\u0001\b\u0017\u0000Ü", (byte) (105 - TextUtils.lastIndexOf("", '0', 0, 0)), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).toString());
                        p.m2899(at.m575(at.this).new AnonymousClass2(strM1703, bb.c.f679));
                        jSONObjectM600.put(m634("\u000e\u0003ð", (byte) (125 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), true);
                        i2 = f513 + 63;
                        f515 = i2 % 128;
                    } else if (at.m606(cpVar, strM1696)) {
                        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.3.5

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static char[] f523 = {'!', 'Y', 'n', 'n', 'i', 'd', 'k', 'q', 'p', '_', 'W', 'g', 'g', 'd', 'f', 'k', '6', 'r', 'L', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'o', 'd', 'B', 'A', 'i', 'n', 'n', 'i', 'd', 'k', 'q', 'p', 'I', 'I', 't', 'l', 'c', 'd', 'l', 's', 'l', 'm', 'p', 140, 282, 282, 285, 'O', 136, 134, 155, 158, 155, 'r', 't', 155, 153, 155, 159, 152, 154, 'x', 'v', 157, 158, 152, 145, 150, 155, 155, 150, 'n', 't', 158, 'w', 'w', 155, 152, 152, 'q', 'p', 151, 152, 155, 161, 153, 153, 'v', 'v', 157, 157, ',', 'j', 147, 170, 168, 168, 129, '|', Typography.pound, Typography.pound, 166, 166, 157, 158, Typography.cent, Typography.copyright, Typography.copyright, Typography.pound, Typography.cent, ':', 'q', 'p', 'I', 'A', 'i', 'n', 'n', 'i', 'd', '\'', '_', 'g', 'p', 'x', 's', 'w', '{', 131, 's', 'X', 'T', ' ', 'W', 'G', 'B', 'k', 'r', 'p', 'p', 'I', 'G', 'i', 'c', 'l', 's', 'r', 'k', 'd', 'B', 'K', 'o', 'h', 'j', 'h', 'B', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', '4', 'N', 'J', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'L', '9', 'K', 'G', '5', 16, 'A', 'i', 'n', 'n', 'i', 'd', 'k', 'q', 'p', 'P'};

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static int f524 = 0;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f525 = 1;

                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                int i4 = 2 % 2;
                                cpVar.m1700();
                                p.m2899(at.m575(at.this).new AnonymousClass2(strM1703, bb.c.f678));
                                n.m2870(m636(new int[]{0, 16, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), new StringBuilder().append(cpVar.m1702()).append(m636(new int[]{16, 35, 0, 14}, false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001").intern()).toString());
                                int i5 = f525 + InterfaceC0280i1.d.b.b;
                                f524 = i5 % 128;
                                int i6 = i5 % 2;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo635(Throwable th) {
                                int i4 = 2 % 2;
                                int i5 = f525 + 107;
                                f524 = i5 % 128;
                                int i6 = i5 % 2;
                                try {
                                    ((JSONObject) at.m570(at.this).get(cpVar.m1703())).put(m636(new int[]{51, 4, 175, 3}, true, "\u0000\u0001\u0001\u0001").intern(), false);
                                    int i7 = f524 + InterfaceC0280i1.d.b.i;
                                    f525 = i7 % 128;
                                    int i8 = i7 % 2;
                                } catch (JSONException e) {
                                    n.m2873(m636(new int[]{0, 16, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m636(new int[]{55, 44, 45, 2}, true, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001").intern(), (Throwable) e);
                                }
                                p.m2899(at.m575(at.this).new AnonymousClass1(strM1703, bb.e.f692));
                                jz.m2760(m636(new int[]{0, 16, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), new StringBuilder().append(m636(new int[]{99, 19, 56, 1}, false, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern()).append(cpVar.m1702()).append(m636(new int[]{118, 10, 0, 3}, false, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000").intern()).toString(), th, true, true, true);
                                n.m2876(m636(new int[]{128, 12, 13, 0}, false, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern(), new StringBuilder().append(m636(new int[]{140, 53, 0, 0}, false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001").intern()).append(cpVar.m1702()).append(m636(new int[]{193, 11, 0, 0}, false, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern()).toString());
                            }

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m636(int[] iArr, boolean z, String str2) throws UnsupportedEncodingException {
                                String str3;
                                Object bytes = str2;
                                if (str2 != null) {
                                    bytes = str2.getBytes("ISO-8859-1");
                                }
                                byte[] bArr = (byte[]) bytes;
                                synchronized (j.f2691) {
                                    int i4 = iArr[0];
                                    int i5 = iArr[1];
                                    int i6 = iArr[2];
                                    int i7 = iArr[3];
                                    char[] cArr = new char[i5];
                                    System.arraycopy(f523, i4, cArr, 0, i5);
                                    if (bArr != null) {
                                        char[] cArr2 = new char[i5];
                                        j.f2692 = 0;
                                        char c = 0;
                                        while (j.f2692 < i5) {
                                            if (bArr[j.f2692] == 1) {
                                                cArr2[j.f2692] = (char) (((cArr[j.f2692] << 1) + 1) - c);
                                            } else {
                                                cArr2[j.f2692] = (char) ((cArr[j.f2692] << 1) - c);
                                            }
                                            c = cArr2[j.f2692];
                                            j.f2692++;
                                        }
                                        cArr = cArr2;
                                    }
                                    if (i7 > 0) {
                                        char[] cArr3 = new char[i5];
                                        System.arraycopy(cArr, 0, cArr3, 0, i5);
                                        int i8 = i5 - i7;
                                        System.arraycopy(cArr3, 0, cArr, i8, i7);
                                        System.arraycopy(cArr3, i7, cArr, 0, i8);
                                    }
                                    if (z) {
                                        char[] cArr4 = new char[i5];
                                        j.f2692 = 0;
                                        while (j.f2692 < i5) {
                                            cArr4[j.f2692] = cArr[(i5 - j.f2692) - 1];
                                            j.f2692++;
                                        }
                                        cArr = cArr4;
                                    }
                                    if (i6 > 0) {
                                        j.f2692 = 0;
                                        while (j.f2692 < i5) {
                                            cArr[j.f2692] = (char) (cArr[j.f2692] - iArr[2]);
                                            j.f2692++;
                                        }
                                    }
                                    str3 = new String(cArr);
                                }
                                return str3;
                            }
                        });
                        at.m609(at.this).add(cpVar);
                    } else {
                        jSONObjectM600.put(m634("\n\u0016Ê", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 87), 2 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), false);
                        p.m2899(at.m575(at.this).new AnonymousClass1(strM1703, bb.e.f695));
                        jz.m2760(m634("\u0001\u0002ââ\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b", (byte) (115 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), '@' - AndroidCharacter.getMirror('0')).intern(), new StringBuilder().append(str).append(m633(ExpandableListView.getPackedPositionChild(0L) + 11, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (char) Color.argb(0, 0, 0, 0)).intern()).toString(), null, true, true, true);
                        at.this.m622().adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET, new StringBuilder().append(cpVar.m1702()).append(m634("\u000b\u0014\u0017\u0018\u000f\u0000\u0001\b\r\f\u0002\u00036", (byte) (Color.rgb(0, 0, 0) + 16777238), (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern()).append(cpVar.m1696()).append(m633(29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + 38, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()).toString());
                    }
                    jSONObjectM600.remove(m633(ViewConfiguration.getScrollDefaultDelay() >> 16, TextUtils.indexOf("", "", 0) + 2, (char) (20423 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
                }
                n.m2870(m634("\u0001\u0002ââ\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b", (byte) (116 - (KeyEvent.getMaxKeyCode() >> 16)), KeyEvent.normalizeMetaState(0) + 16).intern(), new StringBuilder().append(cpVar.m1702()).append(m634("\u000e\u0000\u0002\u0003\u0003\u0004\u0000\t\u0006\u000b\u000b\f\r\u000b\u000e\f\r\u0007\n\u0013\b\u0012", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 43), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()).toString());
                p.m2899(at.m575(at.this).new AnonymousClass2(strM1703, bb.c.f679));
                i2 = f515 + 33;
                f513 = i2 % 128;
                int i4 = i2 % 2;
                jSONObjectM600.remove(m633(ViewConfiguration.getScrollDefaultDelay() >> 16, TextUtils.indexOf("", "", 0) + 2, (char) (20423 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo635(Throwable th) {
                int i2 = 2 % 2;
                p.m2899(at.m575(at.this).new AnonymousClass1(strM1703, bb.e.f688));
                jz.m2760(m634("\u0001\u0002ââ\u0004\u0000\u0006\u0000\u0007\b\u0007\u0003\t\u0005\u0001\b", (byte) (116 - TextUtils.indexOf("", "")), 16 - TextUtils.indexOf("", "", 0)).intern(), new StringBuilder().append(m633((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 67, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).append(strM1703).toString(), th, true, true, true);
                int i3 = f513 + 3;
                f515 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m633(int i2, int i3, char c) {
                String str2;
                synchronized (b.f637) {
                    char[] cArr = new char[i3];
                    b.f638 = 0;
                    while (b.f638 < i3) {
                        cArr[b.f638] = (char) ((((long) f518[b.f638 + i2]) ^ (((long) b.f638) * f517)) ^ ((long) c));
                        b.f638++;
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m634(String str2, byte b, int i2) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2043) {
                    char[] cArr2 = f516;
                    char c = f514;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b);
                    }
                    if (i2 > 1) {
                        f.f2047 = 0;
                        while (f.f2047 < i2) {
                            f.f2045 = cArr[f.f2047];
                            f.f2048 = cArr[f.f2047 + 1];
                            if (f.f2045 == f.f2048) {
                                cArr3[f.f2047] = (char) (f.f2045 - b);
                                cArr3[f.f2047 + 1] = (char) (f.f2048 - b);
                            } else {
                                f.f2046 = f.f2045 / c;
                                f.f2042 = f.f2045 % c;
                                f.f2044 = f.f2048 / c;
                                f.f2041 = f.f2048 % c;
                                if (f.f2042 == f.f2041) {
                                    f.f2046 = ((f.f2046 + c) - 1) % c;
                                    f.f2044 = ((f.f2044 + c) - 1) % c;
                                    int i3 = (f.f2046 * c) + f.f2042;
                                    int i4 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i3];
                                    cArr3[f.f2047 + 1] = cArr2[i4];
                                } else if (f.f2046 == f.f2044) {
                                    f.f2042 = ((f.f2042 + c) - 1) % c;
                                    f.f2041 = ((f.f2041 + c) - 1) % c;
                                    int i5 = (f.f2046 * c) + f.f2042;
                                    int i6 = (f.f2044 * c) + f.f2041;
                                    cArr3[f.f2047] = cArr2[i5];
                                    cArr3[f.f2047 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (f.f2046 * c) + f.f2041;
                                    int i8 = (f.f2044 * c) + f.f2042;
                                    cArr3[f.f2047] = cArr2[i7];
                                    cArr3[f.f2047 + 1] = cArr2[i8];
                                }
                            }
                            f.f2047 += 2;
                        }
                    }
                    str3 = new String(cArr3);
                }
                return str3;
            }
        });
        int i2 = f445 + 13;
        f446 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m578(Context context, String str, String str2, List<gk> list, iu iuVar) {
        int i = 2 % 2;
        Iterator<gk> it = list.iterator();
        while (it.hasNext()) {
            int i2 = f445 + 113;
            f446 = i2 % 128;
            if (i2 % 2 == 0) {
                m601(context, str, str2, it.next(), iuVar);
                throw null;
            }
            m601(context, str, str2, it.next(), iuVar);
        }
        int i3 = f446 + 87;
        f445 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m601(final Context context, final String str, final String str2, final gk gkVar, final iu iuVar) {
        int i = 2 % 2;
        int i2 = f445 + 87;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        jc.c cVarM2190 = gkVar.m2190();
        if (cVarM2190 != null) {
            final bg bgVarMo2171 = gkVar.mo2171();
            m597(str2, bgVarMo2171);
            p.m2899(this.f454.new AnonymousClass2(str2, bb.c.f680));
            final String strM2512 = this.f451.m2512(cVarM2190, new io() { // from class: com.ironsource.adqualitysdk.sdk.i.at.6
                @Override // com.ironsource.adqualitysdk.sdk.i.io
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo639(String str3) {
                    at.m615(at.this, context, str, str2, gkVar, at.m607(at.this, context, str3, bgVarMo2171), false, bgVarMo2171, iuVar);
                }
            });
            p.m2892(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    cp cpVarM607 = at.m607(at.this, context, strM2512, bgVarMo2171);
                    if (cpVarM607 != null) {
                        at.m615(at.this, context, str, str2, gkVar, cpVarM607, true, bgVarMo2171, iuVar);
                    } else {
                        p.m2900(iuVar);
                    }
                }
            }, m589(cVarM2190));
            return;
        }
        p.m2900(iuVar);
        int i4 = f445 + 19;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private cp m576(Context context, String str, bg bgVar) {
        int i = 2 % 2;
        int i2 = f446 + 105;
        f445 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (str == null) {
            return null;
        }
        cp cpVar = new cp(context, new dh(str, this.f453), this.f449, this.f452, bgVar);
        int i3 = f445 + InterfaceC0280i1.d.b.g;
        f446 = i3 % 128;
        if (i3 % 2 != 0) {
            return cpVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m595(final Context context, final String str, final String str2, final gk gkVar, final cp cpVar, final boolean z, final bg bgVar, final iu iuVar) {
        int i = 2 % 2;
        p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.8

            /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
            private static int f548 = 1;

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f549 = 0;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f550 = 172;

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                String strM640;
                iu iuVar2;
                int i2 = 2 % 2;
                if (cpVar != null) {
                    int i3 = f549 + InterfaceC0280i1.d.b.d;
                    f548 = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 == 0) {
                        at.m565(at.this).contains(gkVar);
                        super.hashCode();
                        throw null;
                    }
                    if (at.m565(at.this).contains(gkVar)) {
                        return;
                    }
                    p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ay.4

                        /* JADX INFO: renamed from: ﻐ */
                        private /* synthetic */ boolean f612;

                        /* JADX INFO: renamed from: ﻛ */
                        private /* synthetic */ String f613;

                        /* JADX INFO: renamed from: ﾒ */
                        private /* synthetic */ cp f615;

                        AnonymousClass4() {
                            str = str;
                            cpVar = cpVar;
                            z = z;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            bb bbVarM673 = ay.m673(ay.this, str);
                            if (bbVarM673 != null) {
                                bbVarM673.m719(cpVar);
                            }
                        }
                    });
                    if (!cpVar.m1691()) {
                        int i4 = f549;
                        int i5 = i4 + InterfaceC0280i1.d.b.g;
                        f548 = i5 % 128;
                        int i6 = i5 % 2;
                        iu iuVar3 = iuVar;
                        if (iuVar3 != null) {
                            int i7 = i4 + 53;
                            f548 = i7 % 128;
                            int i8 = i7 % 2;
                            p.m2900(iuVar3);
                        }
                    }
                    if (!at.m581(cpVar)) {
                        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.8.1

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f560 = 1;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static long f561 = 7661225233793288894L;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f562;

                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo227() {
                                int i9 = 2 % 2;
                                int i10 = f560 + 29;
                                f562 = i10 % 128;
                                int i11 = i10 % 2;
                                if (at.m599(at.this).containsKey(cpVar.m1703())) {
                                    return;
                                }
                                p.m2899(at.m575(at.this).new AnonymousClass1(cpVar.m1703(), bb.e.f693));
                                JSONObject jSONObjectM600 = at.m600(at.this, cpVar);
                                try {
                                    jSONObjectM600.put(m641("\u0adf淛쓫", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC4).intern(), false);
                                    int i12 = f562 + 23;
                                    f560 = i12 % 128;
                                    int i13 = i12 % 2;
                                } catch (JSONException unused) {
                                }
                                at.m570(at.this).put(cpVar.m1703(), jSONObjectM600);
                                String strM675 = at.m575(at.this).m675(cpVar.m1703());
                                at.m599(at.this).put(cpVar.m1703(), strM675);
                                at.this.m622().adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK, new StringBuilder().append(cpVar.m1702()).append(m641("ઞ춚葴峐ែ\uee7bꛑ禭ふࣘ쎷驭劊", 51031 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).append(cpVar.m1696()).append(m641("ઞ贉Ց鶀ᗟ갎\u2452벸㓥콳䝟\udfa6埭\uefd2昔﹔盎໘脀᥊釺⧡ꀵ㡿낵䣪샓嬗팒", TextUtils.getCapsMode("", 0, 0) + 34757).intern()).append(cpVar.m1697()).append(m641("ઞ촰蔎崽ᕔ\uedbeꖏ緼㗄", 51168 - TextUtils.indexOf((CharSequence) "", '0')).intern()).toString());
                                jz.m2760(m641("૽䀒齖\uea99⇗缒쩘Ƅ峔ꨨ\ue141㲱读섾ᱱ殡", KeyEvent.getDeadChar(0, 0) + 19139).intern(), strM675, null, true, true, true);
                                int i14 = f562 + 37;
                                f560 = i14 % 128;
                                int i15 = i14 % 2;
                            }

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static String m641(String str3, int i9) {
                                String str4;
                                Object charArray = str3;
                                if (str3 != null) {
                                    charArray = str3.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (i.f2434) {
                                    i.f2432 = i9;
                                    char[] cArr2 = new char[cArr.length];
                                    i.f2433 = 0;
                                    while (i.f2433 < cArr.length) {
                                        cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f561);
                                        i.f2433++;
                                    }
                                    str4 = new String(cArr2);
                                }
                                return str4;
                            }
                        });
                        return;
                    }
                    String strIntern = m640("\f\uffff\u0001\ufffb\b\ufffb\uffe7\f\t\u000e�\uffff\b\b\t\uffdd", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, 274 - View.combineMeasuredStates(0, 0), true, 15 - TextUtils.lastIndexOf("", '0', 0)).intern();
                    StringBuilder sbAppend = new StringBuilder().append(m640("\u0006\u0011\u0006\u000b￦ﾽ\u0004\u000b\u0006\u0017\u0006\t\ufffe", (ViewConfiguration.getEdgeSlop() >> 16) + 5, 270 - ((byte) KeyEvent.getModifierMetaStateMask()), true, View.MeasureSpec.makeMeasureSpec(0, 0) + 13).intern()).append(str).append(m640("\u0004\uffc1\u0006\u0015\u0010\u000e\u0006\u0013\uffc1\uffc1\u0013\u0010\u0015\u0004\u0006\u000f\u000f\u0010", 9 - KeyEvent.getDeadChar(0, 0), 267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, MotionEvent.axisFromString("") + 19).intern());
                    if (z) {
                        int i9 = f549 + 93;
                        f548 = i9 % 128;
                        int i10 = i9 % 2;
                        strM640 = m640("\u000e\f\u000e\u0013\u0010\u000fￔￓ", 7 - Color.alpha(0), 257 - View.MeasureSpec.getMode(0), false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7);
                    } else {
                        strM640 = m640("\f\u000b\uffd0ￏ\r\f\u001b\n\u000f", ImageFormat.getBitsPerPixel(0) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 260, false, 8 - TextUtils.lastIndexOf("", '0', 0));
                    }
                    cn.m1578(strIntern, sbAppend.append(strM640.intern()).toString());
                    bgVar.m814();
                    if (cpVar.m1691() && (iuVar2 = iuVar) != null) {
                        int i11 = f548 + 89;
                        f549 = i11 % 128;
                        if (i11 % 2 != 0) {
                            p.m2900(iuVar2);
                            super.hashCode();
                            throw null;
                        }
                        p.m2900(iuVar2);
                    }
                    if (t.m2942().m2958()) {
                        return;
                    }
                    at.m604(at.this, cpVar, str);
                    if (at.m621(at.this, cpVar.m1703())) {
                        return;
                    }
                    int i12 = f549 + 57;
                    f548 = i12 % 128;
                    if (i12 % 2 != 0) {
                        at.m565(at.this).add(gkVar);
                    } else {
                        at.m565(at.this).add(gkVar);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m640(String str3, int i2, int i3, boolean z2, int i4) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (e.f1919) {
                    char[] cArr2 = new char[i4];
                    e.f1921 = 0;
                    while (e.f1921 < i4) {
                        e.f1920 = cArr[e.f1921];
                        cArr2[e.f1921] = (char) (e.f1920 + i3);
                        int i5 = e.f1921;
                        cArr2[i5] = (char) (cArr2[i5] - f550);
                        e.f1921++;
                    }
                    if (i2 > 0) {
                        e.f1918 = i2;
                        char[] cArr3 = new char[i4];
                        System.arraycopy(cArr2, 0, cArr3, 0, i4);
                        System.arraycopy(cArr3, 0, cArr2, i4 - e.f1918, e.f1918);
                        System.arraycopy(cArr3, e.f1918, cArr2, 0, i4 - e.f1918);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i4];
                        e.f1921 = 0;
                        while (e.f1921 < i4) {
                            cArr4[e.f1921] = cArr2[(i4 - e.f1921) - 1];
                            e.f1921++;
                        }
                        cArr2 = cArr4;
                    }
                    str4 = new String(cArr2);
                }
                return str4;
            }
        });
        int i2 = f446 + 91;
        f445 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m610(cp cpVar) {
        ?? r1;
        int i = 2 % 2;
        int i2 = f446 + 89;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (i3 == 0) {
                JSONObject jSONObjectM585 = m585(cpVar.m1696());
                jSONObjectM585.put(ij.f2525, cpVar.m1698());
                r1 = jSONObjectM585;
                int i4 = f446 + 37;
                f445 = i4 % 128;
                int i5 = i4 % 2;
                return r1;
            }
            m585(cpVar.m1696()).put(ij.f2525, cpVar.m1698());
            throw null;
        } catch (JSONException e) {
            n.m2873(m590("賘貛\ue210茄\ueed4撝躮稜霵䀙\uaa3c底뮺徯잱┌\ude21㬍\ue33dঘ", KeyEvent.getMaxKeyCode() >> 16).intern(), m590("ᦇᧂ픺뻪汸厪덜\uf8b1ɽ睰韅\udc24⻲梩琢ꞧ䭱ధ\ude96謥矈⁖애滛遌엄⧩牄벗丹౻嗜\ud94c鋉烹㥈엧뙲咝ᳱ\uee21", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), (Throwable) e);
            r1 = i3;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m588(cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f445 + 105;
        f446 = i2 % 128;
        if (i2 % 2 != 0 ? !m592(new int[]{-110257724, 765398940, -2065402640, -2103599238}, View.resolveSize(0, 0) + 7).intern().equals(str) : !m592(new int[]{-110257724, 765398940, -2065402640, -2103599238}, 80 % View.resolveSize(1, 1)).intern().equals(str)) {
            if (!TextUtils.isEmpty(str) && kb.m2790(str, cpVar.m1695()) >= 0) {
                int i3 = f445 + 5;
                f446 = i3 % 128;
                int i4 = i3 % 2;
                if (kb.m2790(str, cpVar.m1694()) <= 0) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m598(cp cpVar) {
        int i = 2 % 2;
        int i2 = f445 + 123;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        String strM1697 = cpVar.m1697();
        if (strM1697 != null && kb.m2790(IronSourceAdQuality.getSDKVersion(), strM1697) < 0) {
            return false;
        }
        int i4 = f445 + 57;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m582(String str) {
        int i = 2 % 2;
        int i2 = f445 + 17;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.f456.containsKey(str)) {
            return false;
        }
        int i4 = f445 + InterfaceC0280i1.d.b.i;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        if (!this.f456.get(str).m647(this.f455)) {
            return false;
        }
        int i6 = f446 + 81;
        f445 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m612() {
        int i = 2 % 2;
        ArrayList<cp> arrayList = new ArrayList();
        for (cp cpVar : m571()) {
            if (m582(cpVar.m1703())) {
                int i2 = f445 + 51;
                f446 = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(cpVar);
                    throw null;
                }
                arrayList.add(cpVar);
            }
            int i3 = f446 + 67;
            f445 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 4;
            }
        }
        for (final cp cpVar2 : arrayList) {
            n.m2874(m590("賘貛\ue210茄\ueed4撝躮稜霵䀙\uaa3c底뮺徯잱┌\ude21㬍\ue33dঘ", View.MeasureSpec.getMode(0)).intern(), new StringBuilder().append(m592(new int[]{-726958883, -675332002, -842603794, -71013287, 598087266, 1104818051}, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT).intern()).append(cpVar2.m1702()).append(m590("즩즉\uf58b\ud8af员猊프삐퉏垄\uf180\ue402ﻖ䠋", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).toString());
            String strM1703 = cpVar2.m1703();
            m620(strM1703, m566().get(strM1703));
            p.m2900(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.at.10
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    cpVar2.m1699();
                }
            });
            m567().remove(cpVar2);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long m589(jc.c cVar) {
        int i = 2 % 2;
        int i2 = f445 + 43;
        f446 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!ar.m480().mo513()) {
                if (cVar == null || this.f451.m2510(cVar)) {
                    return 0L;
                }
                int i3 = f445 + 63;
                f446 = i3 % 128;
                int i4 = i3 % 2;
                return 2000L;
            }
            int i5 = f445 + 121;
            f446 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 76 / 0;
            }
            return 2000L;
        }
        ar.m480().mo513();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized List<cp> m567() {
        List<cp> list;
        int i = 2 % 2;
        int i2 = f445 + 65;
        int i3 = i2 % 128;
        f446 = i3;
        int i4 = i2 % 2;
        list = this.f457;
        int i5 = i3 + 97;
        f445 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private synchronized List<gk> m574() {
        List<gk> list;
        int i = 2 % 2;
        int i2 = f446;
        int i3 = i2 + 125;
        f445 = i3 % 128;
        int i4 = i3 % 2;
        list = this.f458;
        int i5 = i2 + 37;
        f445 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m566() {
        int i = 2 % 2;
        int i2 = f446 + 45;
        f445 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f461;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized Map<String, String> m569() {
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = f445 + 43;
        int i3 = i2 % 128;
        f446 = i3;
        int i4 = i2 % 2;
        map = this.f459;
        int i5 = i3 + 35;
        f445 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<cp> m571() {
        int i = 2 % 2;
        int i2 = f446 + 9;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f457 != null) {
            return new ArrayList(this.f457);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = f445 + 19;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m597(String str, bg bgVar) {
        int i = 2 % 2;
        int i2 = f446 + 23;
        f445 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
            if (bgVar == null) {
                return;
            }
        } else if (bgVar == null) {
            return;
        }
        m566().put(str, m585(bgVar.m816()));
        int i4 = f445 + 63;
        f446 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m585(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ij.f2526, str);
            int i2 = f445 + 97;
            f446 = i2 % 128;
            int i3 = i2 % 2;
            return jSONObject;
        } catch (JSONException e) {
            n.m2873(m590("賘貛\ue210茄\ueed4撝躮稜霵䀙\uaa3c底뮺徯잱┌\ude21㬍\ue33dঘ", Color.alpha(0)).intern(), m590("ᦇᧂ픺뻪汸厪덜\uf8b1ɽ睰韅\udc24⻲梩琢ꞧ䭱ధ\ude96謥矈⁖애滛遌엄⧩牄벗丹౻嗜\ud94c鋉烹㥈엧뙲咝ᳱ\uee21", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)).intern(), (Throwable) e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m611(Map<String, JSONObject> map) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = f446 + 45;
        f445 = i2 % 128;
        int i3 = i2 % 2;
        for (String str : new HashSet(map.keySet())) {
            int i4 = f446 + 1;
            f445 = i4 % 128;
            int i5 = i4 % 2;
            jSONObject2.put(str.toLowerCase(), map.get(str));
        }
        jSONObject.put(m590("㝃㜵\uec48⳾\ueacc櫙⅔縙", (-1) - ImageFormat.getBitsPerPixel(0)).intern(), jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m629(String str) {
        int i = 2 % 2;
        m628(str, new ArrayList());
        int i2 = f446 + 65;
        f445 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m628(String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f445 + 49;
        f446 = i2 % 128;
        if (i2 % 2 != 0) {
            Iterator<cp> it = m571().iterator();
            while (it.hasNext()) {
                int i3 = f445 + 43;
                f446 = i3 % 128;
                int i4 = i3 % 2;
                it.next().m1701(str, list);
            }
            int i5 = f446 + 35;
            f445 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m571().iterator();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m622() {
        ISAdQualityInitListener iSAdQualityInitListener;
        int i = 2 % 2;
        int i2 = f445;
        int i3 = i2 + 91;
        f446 = i3 % 128;
        int i4 = i3 % 2;
        iSAdQualityInitListener = this.f450;
        int i5 = i2 + 121;
        f446 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized void m564() {
        ISAdQualityInitListener iSAdQualityInitListenerM622;
        ISAdQualityInitError iSAdQualityInitError;
        String strIntern;
        int i = 2 % 2;
        int i2 = f445 + 27;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f454.m676()) {
            m622().adQualitySdkInitSuccess();
            int i4 = f445 + 93;
            f446 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
                return;
            }
            return;
        }
        int i6 = f445 + 113;
        f446 = i6 % 128;
        if (i6 % 2 == 0) {
            iSAdQualityInitListenerM622 = m622();
            iSAdQualityInitError = ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT;
            strIntern = m590("ﳒﲓڡሟ⾰耷Ώ뭺\ue73f꒪㬠鿪쯢물嚥\ue463깪\udfb4爥좮銆\uf3cb榞ⵖ甙ᙄ蔝㆐妇⫐ꂟᘉ㰘䅈\udc43窙\u20f3旰\uf83b弸୵硿ឳꎲ\uefed鳲㍯蠣퉮댻⻪\ueca0뚒힗䩒\uf0db饟", ViewConfiguration.getFadingEdgeLength() + InterfaceC0280i1.d.b.h).intern();
        } else {
            iSAdQualityInitListenerM622 = m622();
            iSAdQualityInitError = ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT;
            strIntern = m590("ﳒﲓڡሟ⾰耷Ώ뭺\ue73f꒪㬠鿪쯢물嚥\ue463깪\udfb4爥좮銆\uf3cb榞ⵖ甙ᙄ蔝㆐妇⫐ꂟᘉ㰘䅈\udc43窙\u20f3旰\uf83b弸୵硿ឳꎲ\uefed鳲㍯蠣퉮댻⻪\ueca0뚒힗䩒\uf0db饟", ViewConfiguration.getFadingEdgeLength() >> 16).intern();
        }
        iSAdQualityInitListenerM622.adQualitySdkInitFailed(iSAdQualityInitError, strIntern);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m562() {
        boolean zMo482;
        int i = 2 % 2;
        int i2 = f445 + 53;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        zMo482 = ar.m480().mo482();
        int i4 = f445 + 19;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return zMo482;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0010, B:20:0x0033, B:27:0x0043, B:15:0x0029, B:12:0x001e, B:13:0x001f, B:23:0x003f, B:8:0x0019), top: B:35:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0044 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0031, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0044, please report this as an issue */
    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m563() {
        int i;
        int i2 = 2 % 2;
        int i3 = f445 + 89;
        f446 = i3 % 128;
        if (i3 % 2 != 0) {
            if (ar.m480().mo481()) {
                if (!(!m562())) {
                    return true;
                }
            }
            i = f445 + 69;
            f446 = i % 128;
            if (i % 2 == 0) {
                return false;
            }
            int i4 = 5 / 0;
            return false;
        }
        int i5 = 7 / 0;
        if (ar.m480().mo481()) {
            if (!(!m562())) {
                return true;
            }
        }
        i = f445 + 69;
        f446 = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        int i6 = 5 / 0;
        return false;
        throw th;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m590(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2288) {
            char[] cArrM2212 = h.m2212(f448, cArr, i);
            h.f2289 = 4;
            while (h.f2289 < cArrM2212.length) {
                h.f2290 = h.f2289 - 4;
                cArrM2212[h.f2289] = (char) (((long) (cArrM2212[h.f2289] ^ cArrM2212[h.f2289 % 4])) ^ (((long) h.f2290) * f448));
                h.f2289++;
            }
            str2 = new String(cArrM2212, 4, cArrM2212.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m592(int[] iArr, int i) {
        String str;
        synchronized (c.f1230) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f447.clone();
            c.f1231 = 0;
            while (c.f1231 < iArr.length) {
                cArr[0] = (char) (iArr[c.f1231] >> 16);
                cArr[1] = (char) iArr[c.f1231];
                cArr[2] = (char) (iArr[c.f1231 + 1] >> 16);
                cArr[3] = (char) iArr[c.f1231 + 1];
                c.f1232 = (cArr[0] << 16) + cArr[1];
                c.f1233 = (cArr[2] << 16) + cArr[3];
                c.m1415(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = c.f1232 ^ iArr2[i2];
                    c.f1232 = i3;
                    c.f1233 = c.m1414(i3) ^ c.f1233;
                    int i4 = c.f1232;
                    c.f1232 = c.f1233;
                    c.f1233 = i4;
                }
                int i5 = c.f1232;
                c.f1232 = c.f1233;
                c.f1233 = i5;
                c.f1233 = i5 ^ iArr2[16];
                c.f1232 ^= iArr2[17];
                int i6 = c.f1232;
                int i7 = c.f1233;
                cArr[0] = (char) (c.f1232 >>> 16);
                cArr[1] = (char) c.f1232;
                cArr[2] = (char) (c.f1233 >>> 16);
                cArr[3] = (char) c.f1233;
                c.m1415(iArr2);
                cArr2[c.f1231 << 1] = cArr[0];
                cArr2[(c.f1231 << 1) + 1] = cArr[1];
                cArr2[(c.f1231 << 1) + 2] = cArr[2];
                cArr2[(c.f1231 << 1) + 3] = cArr[3];
                c.f1231 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
