package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0487u3 implements D7 {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private E5 K;
    private IronSourceSegment L;
    private Be M;
    private ISErrorListener N;
    private boolean l;
    private F4 p;
    private AbstractC0210e q;
    private ArrayList<B5> r;
    private int t;
    private J8 u;
    private Context v;
    private int[] z;
    final int a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = "abt";
    private final String k = P6.Z0;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object O = new Object();

    /* JADX INFO: renamed from: com.ironsource.u3$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0487u3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u3$b */
    class b implements Runnable {
        final /* synthetic */ B5 a;
        final /* synthetic */ IronSource.AD_UNIT b;

        b(B5 b5, IronSource.AD_UNIT ad_unit) {
            this.a = b5;
            this.b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a("eventSessionId", AbstractC0487u3.this.u.b());
            this.a.a("essn", Integer.valueOf(AbstractC0487u3.this.u.c()));
            String connectionType = IronSourceUtils.getConnectionType(AbstractC0487u3.this.v);
            if (AbstractC0487u3.this.g(this.a)) {
                this.a.a("connectionType", connectionType);
            }
            if (AbstractC0487u3.this.a(connectionType, this.a)) {
                B5 b5 = this.a;
                b5.a(AbstractC0487u3.this.b(b5));
            }
            String strD = C0145a4.d(AbstractC0487u3.this.v);
            if (strD != null) {
                this.a.a("rawConnectionType", strD);
            }
            int iA = AbstractC0487u3.this.a(this.a.c(), this.b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC0487u3.this.a(this.a, "reason");
            AbstractC0487u3.this.a(this.a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC0487u3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC0487u3.this.E.entrySet()) {
                    if (!this.a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != F4.a.d) {
                        this.a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC0487u3.this.i(this.a)) {
                if (AbstractC0487u3.this.h(this.a) && !AbstractC0487u3.this.e(this.a)) {
                    this.a.a("sessionDepth", Integer.valueOf(AbstractC0487u3.this.c(this.a)));
                }
                if (AbstractC0487u3.this.j(this.a)) {
                    AbstractC0487u3.this.f(this.a);
                }
                long jA = AbstractC0487u3.this.u.a();
                if (jA > 0) {
                    this.a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.a.toString());
                AbstractC0487u3.this.r.add(this.a);
                AbstractC0487u3.this.t++;
            }
            AbstractC0487u3 abstractC0487u3 = AbstractC0487u3.this;
            boolean zA = abstractC0487u3.a(abstractC0487u3.B) ? AbstractC0487u3.this.a(this.a.c(), AbstractC0487u3.this.B) : AbstractC0487u3.this.d(this.a);
            AbstractC0487u3 abstractC0487u4 = AbstractC0487u3.this;
            if (!abstractC0487u4.m && zA) {
                abstractC0487u4.m = true;
            }
            if (abstractC0487u4.p != null) {
                if (abstractC0487u4.g()) {
                    AbstractC0487u3.this.f();
                    return;
                }
                AbstractC0487u3 abstractC0487u5 = AbstractC0487u3.this;
                if (abstractC0487u5.b((ArrayList<B5>) abstractC0487u5.r) || zA) {
                    AbstractC0487u3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0487u3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);

        private int a;

        e(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(B5 b5) {
        return b5.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<B5> arrayListA;
        try {
            this.m = false;
            ArrayList<B5> arrayList = new ArrayList<>();
            try {
                synchronized (this.O) {
                    arrayListA = this.p.a(this.I);
                    this.p.b(this.I);
                }
                G5.c cVar = new G5.c(new G5.a(arrayListA, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                C0421q4.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject jSONObjectB = M6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strQ = com.ironsource.mediationsdk.p.m().q();
                    if (!TextUtils.isEmpty(strQ)) {
                        jSONObjectB.put(P6.Z0, strQ);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new L5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th2) {
                    C0421q4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strA = this.q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.n) {
                    try {
                        strA = Base64.encodeToString(M9.a(strA, this.o), 0);
                    } catch (Exception e2) {
                        C0421q4.d().a(e2);
                        ISErrorListener iSErrorListener3 = this.N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e2));
                        }
                    }
                }
                C0330kf.a.a(new M5(new c(), strA, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            C0421q4.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(B5 b5) {
        if (b5 == null) {
            return false;
        }
        if (a(this.z)) {
            return !a(b5.c(), this.z);
        }
        if (a(this.A)) {
            return a(b5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.I, this.H);
        this.H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.q.a(IronSourceUtils.getDefaultEventsURL(context, this.I, null));
        this.p = F4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.getDefaultOptOutEvents(context, this.I);
        this.A = IronSourceUtils.getDefaultOptInEvents(context, this.I);
        this.B = IronSourceUtils.getDefaultTriggerEvents(context, this.I);
        this.C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.I);
        this.L = ironSourceSegment;
        this.v = context;
    }

    protected abstract int c(B5 b5);

    @Override // com.ironsource.D7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.ironsource.D7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    protected abstract boolean d(B5 b5);

    protected abstract String e(int i);

    void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = J5.a(this.H, this.G);
        E5 e5 = new E5(this.I + "EventThread");
        this.K = e5;
        e5.start();
        this.K.a();
        this.u = Ab.U().m();
        this.J = new HashSet();
        d();
    }

    protected abstract void f(B5 b5);

    public void h() {
        this.K.a(new d());
    }

    protected abstract boolean j(B5 b5);

    private void b(String str) {
        AbstractC0210e abstractC0210e = this.q;
        if (abstractC0210e == null || !abstractC0210e.c().equals(str)) {
            this.q = J5.a(str, this.G);
        }
    }

    @Override // com.ironsource.D7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.I, iArr);
    }

    protected boolean g(B5 b5) {
        return (b5.c() == C5.CONSENT_TRUE_CODE.b() || b5.c() == C5.CONSENT_FALSE_CODE.b() || b5.c() == C5.SET_META_DATA.b() || b5.c() == C5.SET_META_DATA_AFTER_INIT.b() || b5.c() == C5.SET_USER_ID.b()) ? false : true;
    }

    protected boolean h(B5 b5) {
        return (b5.c() == C5.FIRST_INSTANCE.b() || b5.c() == C5.FIRST_INSTANCE_RESULT.b() || b5.c() == C5.INIT_COMPLETE.b() || b5.c() == C5.SDK_INIT_FAILED.b() || b5.c() == C5.SDK_INIT_SUCCESS.b() || b5.c() == C5.USING_CACHE_FOR_INIT_EVENT.b() || b5.c() == C5.CONSENT_TRUE_CODE.b() || b5.c() == C5.CONSENT_FALSE_CODE.b() || b5.c() == C5.SET_META_DATA.b() || b5.c() == C5.SET_META_DATA_AFTER_INIT.b() || b5.c() == C5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.D7
    public void c(int i) {
        this.o = i;
    }

    @Override // com.ironsource.D7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    /* JADX INFO: renamed from: com.ironsource.u3$c */
    class c implements E7 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(E7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC0487u3 abstractC0487u3 = AbstractC0487u3.this;
                    ArrayList<B5> arrayListA = abstractC0487u3.p.a(abstractC0487u3.I);
                    AbstractC0487u3.this.t = arrayListA.size() + AbstractC0487u3.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC0487u3.this.a(AbstractC0487u3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e) {
                C0421q4.d().a(e);
                ISErrorListener iSErrorListener = AbstractC0487u3.this.N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Error on sending data ", e));
                }
            }
            a(aVar.b());
        }

        public void a(ArrayList<B5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.E7
        public synchronized void a(final E7.a aVar) {
            AbstractC0487u3.this.K.a(new Runnable() { // from class: com.ironsource.u3$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(aVar);
                }
            });
        }
    }

    @Override // com.ironsource.D7
    public void b(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.D7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0210e abstractC0210e = this.q;
        if (abstractC0210e != null) {
            abstractC0210e.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(B5 b5) {
        JSONObject jSONObjectB = b5.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.ironsource.D7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<B5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public String b() {
        return this.F;
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    public synchronized void a(Be be) {
        this.M = be;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.N = iSErrorListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, B5 b5) {
        boolean zContains;
        if (!str.equalsIgnoreCase("none")) {
            return false;
        }
        if (a(this.C)) {
            zContains = a(b5.c(), this.C);
        } else {
            zContains = this.J.contains(Integer.valueOf(b5.c()));
        }
        return zContains;
    }

    @Override // com.ironsource.D7
    public synchronized void a(B5 b5) {
        a(b5, (IronSource.AD_UNIT) null);
    }

    public synchronized void a(B5 b5, IronSource.AD_UNIT ad_unit) {
        if (b5 != null) {
            if (this.s) {
                this.K.a(new b(b5, ad_unit));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<B5> a(ArrayList<B5> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<B5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    protected void a(ArrayList<B5> arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.D7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.D7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.I, iArr);
    }

    @Override // com.ironsource.D7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.D7
    public void a(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put("age", this.L.getAge());
                }
                if (!TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put("lvl", this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put("pay", this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > 0.0d) {
                    jSONObject.put("iapt", this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put("ucd", this.L.getUcd());
                }
            }
            Be be = this.M;
            if (be != null) {
                String strB = be.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(B5 b5, String str, int i) {
        JSONObject jSONObjectB = b5.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            b5.a(str, a(jSONObjectB.optString(str, null), i));
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(B5 b5, String str) {
        a(b5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, IronSource.AD_UNIT ad_unit) {
        int iB = e.NOT_SUPPORTED.b();
        if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (ad_unit == IronSource.AD_UNIT.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return e.BANNER.b();
                }
                return (ad_unit == IronSource.AD_UNIT.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    void a(Runnable runnable) {
        this.K.a(runnable);
    }

    protected int f(int i) {
        return a(i, (IronSource.AD_UNIT) null);
    }
}
