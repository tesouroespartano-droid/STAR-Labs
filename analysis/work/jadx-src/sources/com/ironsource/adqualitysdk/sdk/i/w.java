package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w<T> extends v<WebView, T> {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private iq f3120;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ac f3121;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<T, ac> f3119 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private w<T>.c f3118 = new c();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    abstract r<WebView, T> mo2980();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    abstract View mo2981(T t);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    abstract ac mo2984();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    abstract void mo2987(T t, List<WebView> list);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public final /* synthetic */ void mo234(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo229(jSONObject, (WebView) obj, obj2);
    }

    public w(iq iqVar) {
        this.f3120 = iqVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m2985(iq iqVar) {
        this.f3120 = iqVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final void m2982(w<T>.c cVar) {
        this.f3118 = cVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    void mo2986(T t, String str) {
        m2983(new JSONObject(), (Object) t, str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final void m2983(final JSONObject jSONObject, final T t, String str) {
        ac acVarMo2984;
        boolean z = ((c) this.f3118).f3138 && !TextUtils.isEmpty(((c) this.f3118).f3142);
        if (((c) this.f3118).f3135) {
            acVarMo2984 = this.f3119.get(t);
        } else {
            acVarMo2984 = this.f3121;
        }
        if (acVarMo2984 == null) {
            acVarMo2984 = mo2984();
            if (((c) this.f3118).f3135) {
                this.f3119.put(t, acVarMo2984);
            } else {
                this.f3121 = acVarMo2984;
            }
            acVarMo2984.m2975(mo2980());
        }
        ac acVar = acVarMo2984;
        acVar.m285();
        acVar.m290(((c) this.f3118).f3142, ((c) this.f3118).f3141, z, ((c) this.f3118).f3137, ((c) this.f3118).f3134);
        acVar.m287(str);
        if (((c) this.f3118).f3136) {
            ArrayList arrayList = new ArrayList();
            mo2987(t, arrayList);
            List<WebView> arrayList2 = new ArrayList<>();
            iq iqVar = this.f3120;
            if (iqVar != null) {
                arrayList2 = iqVar.mo1672(t);
            }
            final List<WebView> listM2716 = jv.m2716(arrayList, arrayList2);
            if (listM2716.isEmpty() || ((c) this.f3118).f3133) {
                View viewMo2981 = mo2981(t);
                if (viewMo2981 != null) {
                    viewMo2981.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static int f3122 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3123;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static char[] f3125 = {9470, 6422, 24418, 40261, 54183, 4508, 22504, 37920, 51717, 2149, 20087, 36021, 49844, 198, 17708, 47881, 63844, 16214, 32172, 30899, 17759, 818, 49416, 36840, 19857, 3005, 51301, 38414, 21546, 4630, 53459, 40659, 23696, 6499, 59222, 42290, 25406, 8696, 61398, 44420, 27238, 10305};

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static long f3124 = 5855809165964819931L;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = 2 % 2;
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                w.this.mo2987(t, arrayList3);
                                if (!arrayList3.isEmpty()) {
                                    View viewMo2982 = w.this.mo2981(t);
                                    if (viewMo2982 != null) {
                                        int i10 = f3123 + 39;
                                        f3122 = i10 % 128;
                                        int i11 = i10 % 2;
                                        if (!w.this.f3118.f3133) {
                                            viewMo2982.removeOnLayoutChangeListener(this);
                                        }
                                    }
                                    w.this.m2979(t, arrayList3);
                                    w.this.mo231(new JSONObject(), arrayList3.get(0), t);
                                }
                                int i12 = f3123 + 23;
                                f3122 = i12 % 128;
                                int i13 = i12 % 2;
                            } catch (Throwable th) {
                                jz.m2766(m2989(TextUtils.indexOf("", "", 0, 0), 19 - TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 9400)).intern(), m2989((ViewConfiguration.getWindowTouchSlop() >> 8) + 19, 23 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (30966 - (ViewConfiguration.getScrollBarSize() >> 8))).intern(), th, false);
                            }
                        }

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m2989(int i, int i2, char c2) {
                            String str2;
                            synchronized (b.f637) {
                                char[] cArr = new char[i2];
                                b.f638 = 0;
                                while (b.f638 < i2) {
                                    cArr[b.f638] = (char) ((((long) f3125[b.f638 + i]) ^ (((long) b.f638) * f3124)) ^ ((long) c2));
                                    b.f638++;
                                }
                                str2 = new String(cArr);
                            }
                            return str2;
                        }
                    });
                }
                if (listM2716.isEmpty()) {
                    super.mo234(jSONObject, null, t);
                    return;
                }
            }
            if (!((c) this.f3118).f3132) {
                m2979(t, listM2716);
                super.mo234(jSONObject, listM2716.get(0), t);
                return;
            } else {
                p.m2898().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.m2979(t, (List<WebView>) listM2716);
                        w.super.mo234(jSONObject, (WebView) listM2716.get(0), t);
                    }
                });
                return;
            }
        }
        super.mo234(jSONObject, null, t);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    void mo2988(T t) {
        ac acVar;
        JSONObject jSONObject = new JSONObject();
        if (((c) this.f3118).f3135) {
            acVar = this.f3119.get(t);
        } else {
            acVar = this.f3121;
        }
        mo233(jSONObject, acVar.m289(), t);
    }

    public class c {

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private boolean f3132;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3133;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3134;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3135;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3136;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3137;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3138;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3139;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        protected List<String> f3140 = new ArrayList();

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private List<String> f3141;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3142;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.c m3006(String str) {
            this.f3142 = str;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.c m3007(List<String> list) {
            this.f3141 = list;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final w<T>.c m3009(boolean z) {
            this.f3139 = z;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.c m3008(boolean z) {
            this.f3138 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final w<T>.c m3010(boolean z) {
            this.f3133 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final w<T>.c m3004(boolean z) {
            this.f3136 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final w<T>.c m3005(boolean z) {
            this.f3137 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final w<T>.c m3000(boolean z) {
            this.f3134 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public final w<T>.c m3002(boolean z) {
            this.f3135 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final w<T>.c m3001(boolean z) {
            this.f3132 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final w<T>.c m3003(List<String> list) {
            if (list != null) {
                this.f3140 = list;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public void m2979(T t, List<WebView> list) {
        ac acVar;
        ac acVar2;
        if (((c) this.f3118).f3135) {
            acVar = this.f3119.get(t);
        } else {
            acVar = this.f3121;
        }
        acVar.m288(list);
        if (((c) this.f3118).f3139) {
            if (((c) this.f3118).f3135) {
                acVar2 = this.f3119.get(t);
            } else {
                acVar2 = this.f3121;
            }
            acVar2.m287(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* JADX INFO: renamed from: ﾇ */
    protected final String mo224(T t) {
        ac acVar;
        if (((c) this.f3118).f3135) {
            acVar = this.f3119.get(t);
        } else {
            acVar = this.f3121;
        }
        return acVar.mo224(t);
    }
}
