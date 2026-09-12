package com.ironsource.mediationsdk;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface AdapterNetworkData {
    JSONObject allData();

    <T> T dataByKeyIgnoreCase(String str, Class<T> cls);

    JSONObject networkDataByAdUnit(IronSource.AD_UNIT ad_unit);
}
