package com.ironsource.mediationsdk;

import com.ironsource.C0368n2;
import com.ironsource.C0394ob;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    private HashSet<ImpressionDataListener> a;
    protected com.ironsource.r b;
    protected IronSourceSegment c;
    protected AdInfo d;

    public m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.a = hashSet;
        this.b = new com.ironsource.r();
        this.c = ironSourceSegment;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.a.clear();
        }
    }

    protected String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.d = null;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.c = ironSourceSegment;
    }

    public void a(ImpressionData impressionData, C0394ob c0394ob) {
        if (impressionData != null) {
            this.d = new AdInfo(impressionData, c0394ob);
        }
    }

    protected void a(C0368n2 c0368n2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c0368n2 != null) {
            ImpressionData impressionDataA = c0368n2.a(str);
            if (impressionDataA != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.a.clone();
                }
                for (ImpressionDataListener impressionDataListener : hashSet) {
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA);
                    impressionDataListener.onImpressionSuccess(impressionDataA);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    protected void a(IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, false);
    }
}
