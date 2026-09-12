package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface T4 {

    public static final class a {
        private final Map<String, Object> a;

        public a(String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.a.put(key, value);
        }

        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.a);
        }
    }

    void a(C5 c5, EnumC0397oe enumC0397oe);

    void a(C5 c5, String str);

    public static final class b implements T4 {
        private final D7 a;
        private final a b;

        public b(D7 eventManager, a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.T4
        public void a(C5 eventName, String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> mapA = this.b.a();
            mapA.put("spId", instanceId);
            this.a.a(new B5(eventName, new JSONObject(MapsKt.toMap(mapA))));
        }

        @Override // com.ironsource.T4
        public void a(C5 eventName, EnumC0397oe enumC0397oe) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> mapA = this.b.a();
            if (enumC0397oe != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, enumC0397oe.toString());
            }
            this.a.a(new B5(eventName, new JSONObject(MapsKt.toMap(mapA))));
        }
    }
}
