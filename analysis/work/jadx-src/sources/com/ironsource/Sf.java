package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class Sf {
    private final D0 a;

    public Sf(D0 d0) {
        this.a = d0;
    }

    public void a(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.a.a(A0.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void b(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void c() {
        this.a.a(A0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.a.a(A0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.a.a(A0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_ILLEGAL_STATE, map);
    }

    public void g(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_INTERNAL_ERROR, map);
    }

    public void h(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_LOAD_SKIPPED, map);
    }

    public void i(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, map);
    }

    public void j(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, map);
    }

    public void k(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, map);
    }

    public void l(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_CLOSED, map);
    }

    public void m(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, map);
    }

    public void n(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, map);
    }

    public void o(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, map);
    }

    public void p(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, map);
    }

    public void q(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_OPENED, map);
    }

    public void r(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, map);
    }

    public void s(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, map);
    }

    public void t(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, map);
    }

    public void u(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, map);
    }

    public void v(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_WATERFALL_OVERHEAD, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, map);
    }

    public void d(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, map);
    }

    public void b() {
        this.a.a(A0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, l);
        this.a.a(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, map);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.a.a(A0.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void b(String str, long j, long j2, long j3) {
        HashMap map = new HashMap();
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, map);
    }

    public void a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.a.a(A0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(String str, long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, (str.isEmpty() ? "" : "provider=" + str + ";") + "expirationDuration=" + j);
        this.a.a(A0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(String str, long j, long j2, long j3) {
        HashMap map = new HashMap();
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, map);
    }

    public void a(boolean z, long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    private String a(long j, long j2, long j3) {
        return "interval: " + j + ", remainingTime: " + j2 + ", timePassed: " + j3;
    }

    public void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.a.a(A0.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a() {
        this.a.a(A0.TROUBLESHOOT_DISPOSE, null);
    }

    public void a(long j, long j2, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "refreshDuration=%d;notVisibleDuration=%d;reason=%s", Long.valueOf(j), Long.valueOf(j2), str));
        this.a.a(A0.TROUBLESHOOT_RELOAD, map);
    }
}
