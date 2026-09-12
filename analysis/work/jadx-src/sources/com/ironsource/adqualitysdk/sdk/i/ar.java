package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0280i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ar extends AnonymousClass3 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ar f388;

    public interface c {
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        void mo548();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo549();
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo481();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract boolean mo482();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract long mo483();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract int mo484();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract List mo485();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract String mo486();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract JSONObject mo487();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo488();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo489();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract int mo490();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract String mo491();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract aq mo492();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract as mo493();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract ax mo494();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract ap mo495();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo496();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract double mo497();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract boolean mo498();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo499();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo500();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract String mo501(String str);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract void mo502(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo503(Context context, ao aoVar, boolean z);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo504(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo505(iw iwVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo506();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo507();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract Map<String, au> mo508();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo509(av avVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo510(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo511(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo512(Context context, iv ivVar, an anVar, c cVar, boolean z);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo513();

    /* synthetic */ ar(byte b) {
        this();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized ar m480() {
        if (f388 == null) {
            f388 = new a();
        }
        return f388;
    }

    private ar() {
    }

    static class a extends ar {

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        private static int f391 = 0;

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        private static int f392 = 1;

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        private static char f393 = 53676;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static char f394 = 43242;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static char f395 = 25627;

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static long f396 = 419523223181902732L;

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static char f397 = 45125;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private boolean f398;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private List f399;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private boolean f400;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f401;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private int f402;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private an f403;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private c f404;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private ap f405;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<av> f406;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<av> f407;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private av f408;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private ax f409;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private aq f410;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private iv f411;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private Handler f412;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private as f413;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f414;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f415;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private je f416;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final int f417;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f418;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        static /* synthetic */ int m521(a aVar) {
            int i = 2 % 2;
            int i2 = f392 + 113;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            int iM519 = aVar.m519();
            int i4 = f391 + 9;
            f392 = i4 % 128;
            if (i4 % 2 != 0) {
                return iM519;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ Handler m522(a aVar) {
            int i = 2 % 2;
            int i2 = f392 + 95;
            int i3 = i2 % 128;
            f391 = i3;
            int i4 = i2 % 2;
            Handler handler = aVar.f412;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 73;
            f392 = i5 % 128;
            int i6 = i5 % 2;
            return handler;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ int m523(a aVar) {
            int i;
            int i2 = 2 % 2;
            int i3 = f391;
            int i4 = i3 + 119;
            f392 = i4 % 128;
            if (i4 % 2 == 0) {
                i = aVar.f402;
                aVar.f402 = i;
            } else {
                i = aVar.f402;
                aVar.f402 = i + 1;
            }
            int i5 = i3 + 83;
            f392 = i5 % 128;
            int i6 = i5 % 2;
            return i;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ av m524(a aVar) {
            int i = 2 % 2;
            int i2 = f391 + 73;
            int i3 = i2 % 128;
            f392 = i3;
            int i4 = i2 % 2;
            av avVar = aVar.f408;
            int i5 = i3 + 55;
            f391 = i5 % 128;
            int i6 = i5 % 2;
            return avVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ void m526(a aVar) {
            int i = 2 % 2;
            int i2 = f391 + 123;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            aVar.m520();
            int i4 = f392 + 63;
            f391 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ void m527(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f391 + 55;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            m535(jSONObject, j);
            int i4 = f391 + 39;
            f392 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ av m528(a aVar, av avVar) {
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 121;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            aVar.f408 = avVar;
            int i5 = i2 + 89;
            f391 = i5 % 128;
            if (i5 % 2 == 0) {
                return avVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ List m529(a aVar) {
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 73;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            List<av> list = aVar.f407;
            int i5 = i2 + 121;
            f391 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ c m531(a aVar) {
            int i = 2 % 2;
            int i2 = f391 + 81;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            c cVar = aVar.f404;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return cVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ List m534(a aVar) {
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 99;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            List<av> list = aVar.f406;
            int i5 = i2 + 117;
            f391 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ je m537(a aVar) {
            int i = 2 % 2;
            int i2 = f391 + 61;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            je jeVar = aVar.f416;
            if (i3 != 0) {
                return jeVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public a() {
            super((byte) 0);
            m533("쏩ᶻ罈", 56969 - AndroidCharacter.getMirror('0')).intern();
            m533("쏩Ữ秶", TextUtils.indexOf((CharSequence) "", '0') + 56592).intern();
            m533("쏯䮐팖媉", 34939 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
            m525("⪅\uf51a\ue217鲢", ((byte) KeyEvent.getModifierMetaStateMask()) + 5).intern();
            m525("蛟▝\uf672榭", View.combineMeasuredStates(0, 0) + 4).intern();
            m533("쏭\uefdb鮾䞇", 11299 - Color.red(0)).intern();
            m525("⪅\uf51aꚿꔨ", 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            m525("햫匄ꃽ«", 2 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern();
            m525("熸찌\udb20\uf62d", 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
            TimeUnit.HOURS.toMillis(24L);
            this.f415 = (int) TimeUnit.SECONDS.toMillis(5L);
            this.f418 = (int) TimeUnit.HOURS.toMillis(12L);
            this.f414 = (int) TimeUnit.SECONDS.toMillis(3L);
            this.f417 = (int) TimeUnit.SECONDS.toMillis(10L);
            this.f402 = 0;
            this.f399 = null;
            this.f398 = false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo512(Context context, iv ivVar, an anVar, c cVar, boolean z) {
            int i = 2 % 2;
            this.f416 = new je(context, m533("쏸ๅ墛꫞\uf505읉ᆏ揲긿\uf831쪩ᓳ杦놗菔칗ᡎ檂듇蜂텤⎾淽렮詪풩✛煒", 52667 - Color.alpha(0)).intern(), m525("憪晝ो\udc09ᕧਾ넄攖㜏ꂓ❩\ueafb袡䓛㻕\uef39뻣\ue47a㰩蠈", 20 - TextUtils.getOffsetBefore("", 0)).intern());
            this.f411 = ivVar;
            this.f400 = false;
            this.f401 = z;
            this.f403 = anVar;
            this.f412 = new Handler(Looper.getMainLooper());
            aw awVar = new aw();
            this.f409 = new ax(awVar);
            this.f413 = new as(awVar);
            this.f410 = new aq(awVar);
            this.f405 = new ap();
            mo517(m518());
            m516(awVar);
            this.f404 = cVar;
            this.f407 = new ArrayList();
            this.f406 = new ArrayList();
            int i2 = f391 + 63;
            f392 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final ax mo494() {
            int i = 2 % 2;
            int i2 = f392 + 91;
            int i3 = i2 % 128;
            f391 = i3;
            int i4 = i2 % 2;
            ax axVar = this.f409;
            int i5 = i3 + 61;
            f392 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return axVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final as mo493() {
            int i = 2 % 2;
            int i2 = f392 + 83;
            int i3 = i2 % 128;
            f391 = i3;
            int i4 = i2 % 2;
            as asVar = this.f413;
            int i5 = i3 + 33;
            f392 = i5 % 128;
            int i6 = i5 % 2;
            return asVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final aq mo492() {
            aq aqVar;
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 73;
            f391 = i3 % 128;
            if (i3 % 2 != 0) {
                aqVar = this.f410;
                int i4 = 53 / 0;
            } else {
                aqVar = this.f410;
            }
            int i5 = i2 + 73;
            f391 = i5 % 128;
            if (i5 % 2 == 0) {
                return aqVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final ap mo495() {
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 67;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            ap apVar = this.f405;
            int i5 = i2 + InterfaceC0280i1.d.b.d;
            f391 = i5 % 128;
            int i6 = i5 % 2;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final boolean mo498() {
            int i = 2 % 2;
            int i2 = f391;
            int i3 = i2 + 27;
            f392 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            boolean z = this.f401;
            int i4 = i2 + 91;
            f392 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo488() {
            int i = 2 % 2;
            this.f412.removeCallbacksAndMessages(null);
            this.f412 = null;
            p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* JADX INFO: renamed from: ﻐ */
                public final void mo227() {
                    a.m529(a.this).clear();
                    a.m534(a.this).clear();
                    a.m528(a.this, null);
                }
            });
            int i2 = f391 + 37;
            f392 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final synchronized iv m540() {
            iv ivVar;
            int i = 2 % 2;
            int i2 = f392;
            int i3 = i2 + 95;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            ivVar = this.f411;
            int i5 = i2 + 83;
            f391 = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            return ivVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass3
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo517(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f391 + 19;
            f392 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                m530(jSONObject);
                throw null;
            }
            if (m530(jSONObject)) {
                m532(jSONObject);
            }
            super.mo517(jSONObject);
            this.f409.mo517(jSONObject);
            this.f413.mo517(jSONObject);
            this.f410.mo517(jSONObject);
            this.f405.mo517(jSONObject);
            int i3 = f392 + 41;
            f391 = i3 % 128;
            if (i3 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            throw th;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final synchronized void m542(boolean z) {
            int i = 2 % 2;
            int i2 = f391 + 97;
            int i3 = i2 % 128;
            f392 = i3;
            int i4 = i2 % 2;
            this.f400 = z;
            int i5 = i3 + 57;
            f391 = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo500() {
            boolean z;
            int i = 2 % 2;
            int i2 = f391;
            int i3 = i2 + 107;
            f392 = i3 % 128;
            int i4 = i3 % 2;
            z = this.f400;
            int i5 = i2 + 37;
            f392 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo505(iw iwVar) {
            int i = 2 % 2;
            int i2 = f391 + 93;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            m515().m660(iwVar);
            if (i3 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
        private JSONObject m518() {
            int i = 2 % 2;
            int i2 = f391 + 87;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            String strM2606 = this.f416.m2606(m533("쏾켌\uda25\ue54b\uf066莊躹馗ꓷ뀖䌱严奍", 3299 - KeyEvent.normalizeMetaState(0)).intern());
            if (strM2606 != null) {
                try {
                    return new JSONObject(strM2606);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            int i4 = f391 + 21;
            f392 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo503(final Context context, final ao aoVar, boolean z) {
            int i = 2 % 2;
            int i2 = f392 + InterfaceC0280i1.d.b.b;
            f391 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 27 / 0;
                if (z) {
                    p.m2895(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo227() {
                            if (!a.this.m540().m2493().m2526()) {
                                a.m531(a.this).mo548();
                            } else {
                                if (a.this.mo500()) {
                                    return;
                                }
                                a.m531(a.this).mo549();
                            }
                        }
                    }, ar.m480().mo490());
                }
            } else if (z) {
                p.m2895(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        if (!a.this.m540().m2493().m2526()) {
                            a.m531(a.this).mo548();
                        } else {
                            if (a.this.mo500()) {
                                return;
                            }
                            a.m531(a.this).mo549();
                        }
                    }
                }, ar.m480().mo490());
            }
            m542(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new jp(context, aoVar, mo483()).mo320(new JSONObject(), m540().m2493().m2526(), true, false);
            } catch (JSONException e) {
                n.m2873(m533("쏞骜焋쾼\ua62c粠\udb71뇐ࡊ\ue6f7뵷ᯬ", 22901 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m525("殢䤂떓嘑\udbce큗\ueaf3砤\uf6c2එ忳ƀ洏\uda75鱦ᓆڂ祽釧菮็楢蚯慞熑䁉", (Process.myTid() >> 22) + 25).intern(), (Throwable) e);
            }
            m540().m2494(this.f403.m453(m525("\uea4d잱壶⣑", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3).intern()), jSONObject, new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f424 = 0;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f425 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f428 = 24;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f427 = {'S', 44739, 23823, 3137, 47805, 27133, 6199, 50844, 30149, 9226, 54128, 33195, 12456, 57164, 36241, 15561, 60165, 39551, 18618, 63463, 42588, 21710, 967, 45621, 24958, 4000, 48661, 27989, 7122, 'l', 44757, 23832, 3153, 26453, 51684, 14905, 10668, 34589, 12110, 33273, 12793, 40824, 27810, 15857, 35606, 22546, 10632, 63271, 17534, 5545, 58057, 45056, 339, 61090, 48186, 3443, 55985, 43973, 30980, 50779, 38820, 25905, 12919, 33672, 20682, 15891, 36775, 23726, 10814, 64337, 18567, 6616};

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static long f426 = -5658179537694052682L;

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* JADX INFO: renamed from: ｋ */
                public final void mo387(ir irVar) {
                    int i4 = 2 % 2;
                    int i5 = f425 + 21;
                    f424 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        int iM2486 = irVar.m2482().m2486();
                        String strM2487 = irVar.m2482().m2487();
                        if (iM2486 >= 200 && iM2486 <= 299) {
                            JSONObject jSONObjectM2485 = irVar.m2485();
                            if (jSONObjectM2485.optBoolean(m543("\u0001\ufff9\b", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, 131 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3).intern())) {
                                t.m2942().m2960();
                            }
                            n.m2877(m543("￭\u0002\u0004\u0001\t\n\uffde\u0000\u000f\n\b\u0000", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), 125 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, View.getDefaultSize(0, 0) + 12).intern(), m545((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 29, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), jSONObjectM2485);
                            JSONObject jSONObjectM2826 = kd.m2826(jSONObjectM2485);
                            a.this.m541(jSONObjectM2826.optLong(m545(KeyEvent.getDeadChar(0, 0) + 29, 4 - (KeyEvent.getMaxKeyCode() >> 16), (char) KeyEvent.normalizeMetaState(0)).intern(), 0L));
                            jSONObjectM2826.remove(m545(((Process.getThreadPriority(0) + 20) >> 6) + 33, (KeyEvent.getMaxKeyCode() >> 16) + 3, (char) (26407 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern());
                            a.m537(a.this).m2610(m543("\u000b\u0003\u0006\u0004ￋ\u0000\ufffe\u0000\u0005\u0002\u000f\u0000\f", Color.rgb(0, 0, 0) + 16777226, 123 - View.resolveSizeAndState(0, 0, 0), false, (ViewConfiguration.getTouchSlop() >> 8) + 13).intern(), jSONObjectM2826.toString(), (je.b) null);
                            jSONObjectM2485.put(m545(KeyEvent.getDeadChar(0, 0) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, (char) (10713 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), jv.m2711());
                            jSONObjectM2485.put(m545((-16777178) - Color.rgb(0, 0, 0), View.combineMeasuredStates(0, 0) + 2, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12091)).intern(), jv.m2715());
                            a.m527(jSONObjectM2485, irVar.m2483());
                            a.this.mo517(jSONObjectM2485);
                            a.m526(a.this);
                            m544(a.this.m538());
                            return;
                        }
                        mo388(irVar, strM2487);
                        int i7 = f425 + 29;
                        f424 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Exception e2) {
                        jz.m2768(m543("￭\u0002\u0004\u0001\t\n\uffde\u0000\u000f\n\b\u0000", View.getDefaultSize(0, 0) + 1, TextUtils.lastIndexOf("", '0', 0) + 126, true, ExpandableListView.getPackedPositionChild(0L) + 13).intern(), m545((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40, Drawable.resolveOpacity(0, 0) + 32, (char) (12731 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), e2, false, true);
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* JADX INFO: renamed from: ﾒ */
                public final void mo388(ir irVar, String str) {
                    int iM2486;
                    int i4 = 2 % 2;
                    Object obj = null;
                    if (irVar != null) {
                        int i5 = f425 + 87;
                        f424 = i5 % 128;
                        if (i5 % 2 == 0) {
                            iM2486 = irVar.m2482().m2486();
                        } else {
                            irVar.m2482().m2486();
                            throw null;
                        }
                    } else {
                        iM2486 = -1;
                    }
                    n.m2876(m543("￭\u0002\u0004\u0001\t\n\uffde\u0000\u000f\n\b\u0000", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, 125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new StringBuilder().append(m543("\u0016\u0016\u000b\u0010\tￂ\u0005\u0011\u0010\b\u000b\tￂ\b\u0014\u0011\u000fￂ\u0015\u0007\u0014\u0018\u0007\u0014ￜￂ\uffe7\u0014\u0014\u0011\u0014ￂ\t\u0007", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 118 - View.MeasureSpec.getMode(0), false, 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()).append(iM2486).toString());
                    if (iM2486 != 403 && a.m523(a.this) < a.m521(a.this)) {
                        m544(a.this.m539());
                    }
                    int i6 = f425 + 27;
                    f424 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private void m544(int i4) {
                    synchronized (a.this) {
                        if (a.m522(a.this) != null) {
                            p.m2892(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo227() {
                                    a.this.mo503(context, aoVar, false);
                                }
                            }, i4);
                        }
                    }
                }

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m543(String str, int i4, int i5, boolean z2, int i6) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (e.f1919) {
                        char[] cArr2 = new char[i6];
                        e.f1921 = 0;
                        while (e.f1921 < i6) {
                            e.f1920 = cArr[e.f1921];
                            cArr2[e.f1921] = (char) (e.f1920 + i5);
                            int i7 = e.f1921;
                            cArr2[i7] = (char) (cArr2[i7] - f428);
                            e.f1921++;
                        }
                        if (i4 > 0) {
                            e.f1918 = i4;
                            char[] cArr3 = new char[i6];
                            System.arraycopy(cArr2, 0, cArr3, 0, i6);
                            System.arraycopy(cArr3, 0, cArr2, i6 - e.f1918, e.f1918);
                            System.arraycopy(cArr3, e.f1918, cArr2, 0, i6 - e.f1918);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i6];
                            e.f1921 = 0;
                            while (e.f1921 < i6) {
                                cArr4[e.f1921] = cArr2[(i6 - e.f1921) - 1];
                                e.f1921++;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m545(int i4, int i5, char c) {
                    String str;
                    synchronized (b.f637) {
                        char[] cArr = new char[i5];
                        b.f638 = 0;
                        while (b.f638 < i5) {
                            cArr[b.f638] = (char) ((((long) f427[b.f638 + i4]) ^ (((long) b.f638) * f426)) ^ ((long) c));
                            b.f638++;
                        }
                        str = new String(cArr);
                    }
                    return str;
                }
            });
            int i4 = f391 + 121;
            f392 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo510(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f391 + 59;
            f392 = i2 % 128;
            if (i2 % 2 != 0) {
                mo517(jSONObject);
                m520();
            } else {
                mo517(jSONObject);
                m520();
                throw null;
            }
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private synchronized void m520() {
            int i = 2 % 2;
            Handler handler = this.f412;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        a.this.m542(true);
                        if (a.m524(a.this) != null) {
                            a.m524(a.this).mo385();
                        }
                        Iterator it = new ArrayList(a.m529(a.this)).iterator();
                        while (it.hasNext()) {
                            ((av) it.next()).mo385();
                        }
                        a.m529(a.this).clear();
                        Iterator it2 = new ArrayList(a.m534(a.this)).iterator();
                        while (it2.hasNext()) {
                            ((av) it2.next()).mo385();
                        }
                    }
                });
                int i2 = f392 + 53;
                f391 = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            int i5 = f392 + 73;
            f391 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo509(final av avVar) {
            int i = 2 % 2;
            int i2 = f392 + 21;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f412;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        a.m534(a.this).add(avVar);
                        if (a.this.mo500()) {
                            avVar.mo385();
                        }
                    }
                });
            }
            int i4 = f392 + 87;
            f391 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo504(final av avVar) {
            int i = 2 % 2;
            Handler handler = this.f412;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        if (a.this.mo500()) {
                            avVar.mo385();
                        } else {
                            a.m529(a.this).add(avVar);
                        }
                    }
                });
                int i2 = f391 + 67;
                f392 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = f392 + 97;
            f391 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final void mo502(final av avVar) {
            int i = 2 % 2;
            int i2 = f391 + 63;
            f392 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            Handler handler = this.f412;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo227() {
                        a.m528(a.this, avVar);
                        if (a.this.mo500()) {
                            avVar.mo385();
                        }
                    }
                });
                int i3 = f392 + 69;
                f391 = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo506() {
            JSONObject jSONObjectM514;
            String strIntern;
            boolean z;
            int i = 2 % 2;
            int i2 = f392 + 45;
            f391 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM514 = m514();
                strIntern = m533("쏩쎹썙", 38 >>> (KeyEvent.getMaxKeyCode() << 106)).intern();
                z = true;
            } else {
                jSONObjectM514 = m514();
                strIntern = m533("쏩쎹썙", (KeyEvent.getMaxKeyCode() >> 16) + 83).intern();
                z = false;
            }
            boolean zOptBoolean = jSONObjectM514.optBoolean(strIntern, z);
            int i3 = f391 + 15;
            f392 = i3 % 128;
            int i4 = i3 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final double mo497() {
            int i = 2 % 2;
            int i2 = f392 + 63;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            double dOptDouble = m514().optDouble(m533("쏸婸\uf0de", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39313).intern(), 5.0d);
            int i4 = f392 + 35;
            f391 = i4 % 128;
            int i5 = i4 % 2;
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final double mo496() {
            int i = 2 % 2;
            int i2 = f391 + InterfaceC0280i1.d.b.d;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            double dOptDouble = m514().optDouble(m525("蛟▝\uf672榭", 4 - Color.blue(0)).intern(), 1.0d);
            int i4 = f392 + 121;
            f391 = i4 % 128;
            if (i4 % 2 == 0) {
                return dOptDouble;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final int mo499() {
            aw awVarM515;
            int i = 2 % 2;
            int i2 = f391 + 113;
            f392 = i2 % 128;
            if (i2 % 2 == 0) {
                awVarM515 = m515();
                if (awVarM515 == null) {
                    return 29312;
                }
            } else {
                awVarM515 = m515();
                if (awVarM515 == null) {
                    return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
                }
            }
            int iM657 = awVarM515.m657();
            int i3 = f392 + 115;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            return iM657;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        public final int mo490() {
            int i = 2 % 2;
            int i2 = f391 + 7;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m514().optInt(m533("쏯䮐팖媉", ExpandableListView.getPackedPositionGroup(0L) + 34939).intern(), this.f414);
            int i4 = f391 + 45;
            f392 = i4 % 128;
            if (i4 % 2 != 0) {
                return iOptInt;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo489() {
            JSONObject jSONObjectM514;
            int offsetAfter;
            int i = 2 % 2;
            int i2 = f392 + 63;
            f391 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM514 = m514();
                offsetAfter = 5 << TextUtils.getOffsetAfter("", 1);
            } else {
                jSONObjectM514 = m514();
                offsetAfter = 4 - TextUtils.getOffsetAfter("", 0);
            }
            int iOptInt = jSONObjectM514.optInt(m525("⪅\uf51a\ue217鲢", offsetAfter).intern(), this.f417);
            int i3 = f392 + 11;
            f391 = i3 % 128;
            int i4 = i3 % 2;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo507() {
            JSONObject jSONObjectM514;
            String strIntern;
            boolean z;
            int i = 2 % 2;
            int i2 = f392 + 115;
            f391 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM514 = m514();
                strIntern = m533("쏾䷽\udfc3", 36373 % (ViewConfiguration.getTouchSlop() / 86)).intern();
                z = false;
            } else {
                jSONObjectM514 = m514();
                strIntern = m533("쏾䷽\udfc3", 36373 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
                z = true;
            }
            return jSONObjectM514.optBoolean(strIntern, z);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo513() {
            int i = 2 % 2;
            int i2 = f391 + 117;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            boolean zOptBoolean = m514().optBoolean(m533("쏾㳁㶹㹬", 65323 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), true);
            int i4 = f392 + 123;
            f391 = i4 % 128;
            if (i4 % 2 == 0) {
                return zOptBoolean;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final int m539() {
            int i = 2 % 2;
            int i2 = f391 + 59;
            f392 = i2 % 128;
            return i2 % 2 == 0 ? m514().optInt(m525("\ueaf3砤熑䁉", 4 << TextUtils.indexOf((CharSequence) "", '4')).intern(), this.f415) : m514().optInt(m525("\ueaf3砤熑䁉", 2 - TextUtils.indexOf((CharSequence) "", '0')).intern(), this.f415);
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final int m538() {
            int i = 2 % 2;
            int i2 = f391 + 7;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            int iOptInt = m514().optInt(m525("먯輦熑䁉", 3 - Color.red(0)).intern(), this.f418);
            int i4 = f392 + 77;
            f391 = i4 % 128;
            int i5 = i4 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private int m519() {
            JSONObject jSONObjectM514;
            String strIntern;
            int i;
            int i2 = 2 % 2;
            int i3 = f392 + 37;
            f391 = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObjectM514 = m514();
                strIntern = m533("쏡鬐爞줃", 27387 - (ViewConfiguration.getJumpTapTimeout() + 30)).intern();
                i = 4;
            } else {
                jSONObjectM514 = m514();
                strIntern = m533("쏡鬐爞줃", (ViewConfiguration.getJumpTapTimeout() >> 16) + 22783).intern();
                i = 3;
            }
            int iOptInt = jSONObjectM514.optInt(strIntern, i);
            int i4 = f392 + 41;
            f391 = i4 % 128;
            if (i4 % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final Map<String, au> mo508() {
            int i = 2 % 2;
            Map<String, au> map = new HashMap<>();
            try {
                String strOptString = m514().optString(m533("쏨\udf0e悔", 7394 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = kd.m2823(new JSONObject(strOptString), new kd.a<au>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.9
                        @Override // com.ironsource.adqualitysdk.sdk.i.kd.a
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ au mo547(JSONObject jSONObject, String str) {
                            return new au(jSONObject.optJSONObject(str));
                        }
                    });
                }
                int i2 = f391 + 39;
                f392 = i2 % 128;
                int i3 = i2 % 2;
            } catch (JSONException e) {
                jz.m2766(m533("쏞骜焋쾼\ua62c粠\udb71뇐ࡊ\ue6f7뵷ᯬ", TextUtils.getCapsMode("", 0, 0) + 22901).intern(), m525("殢䤂떓嘑\udbce큗\uea4d잱륀\ue1c3ᰉๅ归楗氖䜒㜏ꂓ竄떃ྲᆹ\uf731✋鸃뫾熸찌\udf33涌贗邩", TextUtils.getOffsetBefore("", 0) + 31).intern(), (Throwable) e, false);
            }
            int i4 = f391 + 73;
            f392 = i4 % 128;
            if (i4 % 2 != 0) {
                return map;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo511(String str, String str2) {
            int i = 2 % 2;
            au auVarM536 = m536(str);
            if (auVarM536 == null) {
                return true;
            }
            int i2 = f391 + 25;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            boolean zM647 = auVarM536.m647(str2);
            if (i3 == 0) {
                int i4 = 71 / 0;
                if (!zM647) {
                    return true;
                }
            } else if (!zM647) {
                return true;
            }
            int i5 = f391 + 59;
            f392 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final String mo501(String str) {
            int i = 2 % 2;
            int i2 = f391 + 9;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            au auVarM536 = m536(str);
            if (auVarM536 != null) {
                return auVarM536.m648();
            }
            int i4 = f391 + 37;
            f392 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            return null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m535(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f392 + 21;
            f391 = i2 % 128;
            if (i2 % 2 == 0 ? jSONObject.has(m525("趆⪔韠욢", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2).intern()) : jSONObject.has(m525("趆⪔韠욢", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4).intern())) {
                try {
                    jSONObject.put(m525("趆⪔韠욢", 3 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), jSONObject.optLong(m525("趆⪔韠욢", Process.getGidForName("") + 4).intern()) + (j / 2));
                    return;
                } catch (JSONException unused) {
                }
            }
            int i3 = f391 + 99;
            f392 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final String mo491() {
            int i = 2 % 2;
            int i2 = f392 + 113;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            String strOptString = m514().optString(m533("쏩ᶻ罈", TextUtils.indexOf("", "", 0, 0) + 56921).intern());
            int i4 = f391 + 115;
            f392 = i4 % 128;
            if (i4 % 2 != 0) {
                return strOptString;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final List mo485() {
            int i = 2 % 2;
            int i2 = f392 + 41;
            f391 = i2 % 128;
            if (i2 % 2 == 0) {
                if (this.f399 == null) {
                    this.f399 = kd.m2812(m514().optJSONArray(m533("쏭\uefdb鮾䞇", 11299 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()), new kd.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.7
                        @Override // com.ironsource.adqualitysdk.sdk.i.kd.b
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ ISAdQualityAdType mo546(JSONArray jSONArray, int i3) {
                            return ISAdQualityAdType.fromInt(jSONArray.optInt(i3));
                        }
                    });
                    int i3 = f391 + 3;
                    f392 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 / 4;
                    }
                }
                return this.f399;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final boolean mo482() {
            JSONObject jSONObjectM514;
            int keyRepeatTimeout;
            int i = 2 % 2;
            int i2 = f391 + 23;
            f392 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectM514 = m514();
                keyRepeatTimeout = 5 << (ViewConfiguration.getKeyRepeatTimeout() - 52);
            } else {
                jSONObjectM514 = m514();
                keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4;
            }
            return jSONObjectM514.optBoolean(m525("⪅\uf51aꚿꔨ", keyRepeatTimeout).intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final int mo484() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m514().optInt(m525("햫匄ꃽ«", 3 - (Process.myTid() >> 22)).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final String mo486() {
            int i = 2 % 2;
            int i2 = f391 + 67;
            f392 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (m514() == null) {
                    return null;
                }
                String strOptString = m514().optString(m533("쏨鋍憂で", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20788).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
                int i3 = f392 + 37;
                f391 = i3 % 128;
                if (i3 % 2 == 0) {
                    return m515().m656();
                }
                m515().m656();
                super.hashCode();
                throw null;
            }
            m514();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final JSONObject mo487() {
            int i = 2 % 2;
            int i2 = f392 + 65;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            if (m515() != null) {
                return m515().m658();
            }
            int i4 = f391 + InterfaceC0280i1.d.b.d;
            f392 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final long mo483() {
            int i = 2 % 2;
            int i2 = f391 + 49;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            String strM2606 = this.f416.m2606(m525("ە\udeb7洏\uda75\uf28d㢯㓋妻晸涧ڂ祽쓇ᜢ᱁䂋ಝ꿣蚣髋잢燘箖迋⽍\ueb1f抧\u177a此뀣ꊶᜮ趆⪔픙乵\u09a9妊", TextUtils.indexOf((CharSequence) "", '0', 0) + 38).intern());
            if (TextUtils.isEmpty(strM2606)) {
                return 0L;
            }
            long j = Long.parseLong(strM2606);
            int i4 = f391 + 77;
            f392 = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo481() {
            int i = 2 % 2;
            int i2 = f391 + 95;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            boolean zOptBoolean = m514().optBoolean(m525("熸찌\udb20\uf62d", View.resolveSizeAndState(0, 0, 0) + 4).intern());
            int i4 = f392 + InterfaceC0280i1.d.b.b;
            f391 = i4 % 128;
            int i5 = i4 % 2;
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m541(long j) {
            je jeVar;
            int i;
            int i2 = 2 % 2;
            if (!this.f398) {
                int i3 = f392 + 121;
                f391 = i3 % 128;
                if (i3 % 2 != 0) {
                    jeVar = this.f416;
                    i = 94 - (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                } else {
                    jeVar = this.f416;
                    i = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36;
                }
                jeVar.m2603(m525("ە\udeb7洏\uda75\uf28d㢯㓋妻晸涧ڂ祽쓇ᜢ᱁䂋ಝ꿣蚣髋잢燘箖迋⽍\ueb1f抧\u177a此뀣ꊶᜮ趆⪔픙乵\u09a9妊", i).intern(), String.valueOf(j));
                this.f398 = true;
            }
            int i4 = f392 + 23;
            f391 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static boolean m530(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f392 + 97;
            f391 = i2 % 128;
            int i3 = i2 % 2;
            boolean zHas = jSONObject.has(m533("쏸医\ue267熪胬ဦ", KeyEvent.normalizeMetaState(0) + 37061).intern());
            int i4 = f392 + 59;
            f391 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return zHas;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static void m532(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f391 + 55;
            f392 = i2 % 128;
            int i3 = i2 % 2;
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            kd.m2828(jSONObject, jSONObject.optJSONObject((i3 == 0 ? m533("쏸医\ue267熪胬ဦ", 37060 % (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1))) : m533("쏸医\ue267熪胬ဦ", (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)) + 37060)).intern()));
            int i4 = f392 + 105;
            f391 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private au m536(String str) {
            int i = 2 % 2;
            int i2 = f392 + 21;
            int i3 = i2 % 128;
            f391 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str == null) {
                int i4 = i3 + 33;
                f392 = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            return mo508().get(str);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m533(String str, int i) {
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
                    cArr2[i.f2433] = (char) (((long) (cArr[i.f2433] ^ (i.f2433 * i.f2432))) ^ f396);
                    i.f2433++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m525(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f397)) ^ ((c2 >>> 5) + f393)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f395) ^ ((c3 + i2) ^ ((c3 << 4) + f394))));
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

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private JSONObject f389;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private aw f390;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public synchronized void mo517(JSONObject jSONObject) {
            this.f389 = jSONObject;
        }

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m514() {
            return this.f389;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final aw m515() {
            return this.f390;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m516(aw awVar) {
            this.f390 = awVar;
        }
    }
}
