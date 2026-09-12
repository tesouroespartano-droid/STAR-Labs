package com.ironsource.unity.androidbridge;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidBridgeUtilities {
    private static final ExecutorService callbackExecutor = Executors.newSingleThreadExecutor();

    public static HashMap<String, String> getHashMapFromJsonString(String str) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String parseErrorToEvent(int i, String str) {
        HashMap map = new HashMap();
        try {
            map.put(AndroidBridgeConstants.ERROR_CODE, String.valueOf(i));
            map.put(AndroidBridgeConstants.ERROR_DESCRIPTION, str);
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String parseIronSourceError(IronSourceError ironSourceError) {
        if (ironSourceError != null) {
            return parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
        return "";
    }

    public static String getPlacememtJson(Placement placement) {
        HashMap map = new HashMap();
        try {
            map.put(AndroidBridgeConstants.PLACEMENT_ID, String.valueOf(placement.getPlacementId()));
            map.put(AndroidBridgeConstants.PLACEMENT_NAME, placement.getPlacementName());
            map.put(AndroidBridgeConstants.PLACEMENT_REWARDED_AMOUNT, String.valueOf(placement.getRewardAmount()));
            map.put(AndroidBridgeConstants.PLACEMENT_REWARDED_NAME, placement.getRewardName());
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAdInfoString(AdInfo adInfo) {
        return adInfo == null ? "" : adInfo.toString();
    }

    public static String getImpressionDataString(ImpressionData impressionData) {
        return impressionData == null ? "" : impressionData.getAllData().toString();
    }

    public static String getImpressionDataString(LevelPlayImpressionData levelPlayImpressionData) {
        return levelPlayImpressionData == null ? "" : levelPlayImpressionData.getAllData().toString();
    }

    public static void postBackgroundTask(Runnable runnable) {
        ExecutorService executorService = callbackExecutor;
        if (executorService.isShutdown()) {
            return;
        }
        executorService.submit(runnable);
    }
}
