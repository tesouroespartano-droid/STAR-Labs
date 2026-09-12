package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Je implements N8, N8.a {
    private Map<String, C0517w> a = new LinkedHashMap();
    private final C0206dc b = new C0206dc();
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Ie.values().length];
            try {
                iArr[Ie.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ie.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ie.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void b() {
        He configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C0206dc c0206dc = this.b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c0206dc.a(a(configuration));
        this.b.a(a());
    }

    @Override // com.ironsource.N8.a
    public void a(Ke historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.c.writeLock().lock();
        try {
            N nA = historyRecord.a();
            String strValueOf = String.valueOf(nA != null ? nA.b() : null);
            Map<String, C0517w> map = this.a;
            C0517w c0517w = map.get(strValueOf);
            if (c0517w == null) {
                c0517w = new C0517w();
                map.put(strValueOf, c0517w);
            }
            c0517w.a(historyRecord.a(new Qe()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    public JSONObject a(Te mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C0517w> entry : this.a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            this.c.readLock().unlock();
            return jSONObject;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    public int a(IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.c.readLock().lock();
        try {
            C0517w c0517w = this.a.get(adFormat.toString());
            return c0517w != null ? c0517w.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C0517w> map = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C0517w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public Map<String, JSONObject> a(He configuration) {
        Map<String, JSONObject> mapMutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.readLock().lock();
        try {
            int i = a.a[configuration.a().ordinal()];
            if (i == 1) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(P6.y1, a(Te.FullHistory)), TuplesKt.to(P6.z1, a(Te.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(P6.z1, a(Te.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mapMutableMapOf = MapsKt.emptyMap();
            }
            this.c.readLock().unlock();
            return mapMutableMapOf;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }
}
