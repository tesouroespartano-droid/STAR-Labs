package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0379nd {
    private final Map<LevelPlay.AdFormat, a> a;

    /* JADX INFO: renamed from: com.ironsource.nd$a */
    public static final class a {
        private final Map<String, b> a;

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> listB = C0169ba.b(adFormatProviderOrder.names());
            listB = listB == null ? CollectionsKt.emptyList() : listB;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listB, 10)), 16));
            for (Object obj : listB) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.a = linkedHashMap;
        }

        public final Map<String, b> a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.nd$b */
    public static final class b {
        private final List<String> a;

        public b(JSONArray providerOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> listB = C0169ba.b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(listB, "jsonArrayToStringList(providerOrder)");
            this.a = listB;
        }

        public final List<String> a() {
            return this.a;
        }
    }

    public C0379nd(JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(C0313jf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.a;
    }
}
