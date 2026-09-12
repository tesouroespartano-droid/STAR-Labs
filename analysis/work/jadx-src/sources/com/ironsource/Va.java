package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Va implements ImpressionDataListener {
    private final LevelPlayImpressionDataListener a;

    public Va(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Va) {
            return Intrinsics.areEqual(this.a, ((Va) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(ImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (impressionData.getAllData() != null) {
            JSONObject allData = impressionData.getAllData();
            Intrinsics.checkNotNullExpressionValue(allData, "impressionData.allData");
            this.a.onImpressionSuccess(new LevelPlayImpressionData(allData));
        }
    }
}
