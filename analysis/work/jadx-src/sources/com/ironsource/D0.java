package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class D0 {
    private static final int p = -1;
    private final IronSource.AD_UNIT a;
    private final b b;
    private C0 c;
    private final AbstractC0487u3 d;
    public W8 e;
    public C0377nb f;
    public Nf g;
    public R1 h;
    public M i;
    public Sf j;
    public Jc k;
    private Map<A0, a> l;
    private Map<A0, a> m;
    private Map<A0, a> n;
    private Map<A0, a> o;

    private static class a {
        private final int a;
        private final int b;

        public a(C5 c5, C5 c6) {
            if (c5 != null) {
                this.a = c5.b();
            } else {
                this.a = -1;
            }
            if (c6 != null) {
                this.b = c6.b();
            } else {
                this.b = -1;
            }
        }

        int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.a : this.b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public D0(IronSource.AD_UNIT ad_unit, b bVar, C0 c0) {
        this(ad_unit, bVar, c0, a(ad_unit));
    }

    private static AbstractC0487u3 a(IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) ? Od.i() : D9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.o = map;
        map.put(A0.INIT_STARTED, new a(C5.NT_MANAGER_INIT_STARTED, null));
        this.o.put(A0.INIT_ENDED, new a(C5.NT_MANAGER_INIT_ENDED, null));
        this.o.put(A0.PLACEMENT_CAPPED, new a(C5.NT_PLACEMENT_CAPPED, null));
        this.o.put(A0.AUCTION_REQUEST, new a(C5.NT_AUCTION_REQUEST, null));
        this.o.put(A0.AUCTION_SUCCESS, new a(C5.NT_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.o;
        A0 a0 = A0.AUCTION_FAILED;
        C5 c5 = C5.NT_AUCTION_FAILED;
        map2.put(a0, new a(c5, null));
        this.o.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(c5, null));
        this.o.put(A0.AUCTION_REQUEST_WATERFALL, new a(C5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.o.put(A0.AUCTION_RESULT_WATERFALL, new a(C5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.o.put(A0.INIT_SUCCESS, new a(null, null));
        this.o.put(A0.INIT_FAILED, new a(null, null));
        this.o.put(A0.AD_OPENED, new a(C5.NT_CALLBACK_SHOW, C5.NT_INSTANCE_SHOW));
        this.o.put(A0.AD_CLICKED, new a(C5.NT_CALLBACK_CLICK, C5.NT_INSTANCE_CLICK));
        this.o.put(A0.LOAD_AD, new a(C5.NT_LOAD, C5.NT_INSTANCE_LOAD));
        this.o.put(A0.LOAD_AD_SUCCESS, new a(C5.NT_CALLBACK_LOAD_SUCCESS, C5.NT_INSTANCE_LOAD_SUCCESS));
        this.o.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(C5.NT_CALLBACK_LOAD_ERROR, C5.NT_INSTANCE_LOAD_ERROR));
        this.o.put(A0.LOAD_AD_NO_FILL, new a(null, C5.NT_INSTANCE_LOAD_NO_FILL));
        this.o.put(A0.AD_FORMAT_CAPPED, new a(C5.NT_AD_UNIT_CAPPED, null));
        Map<A0, a> map3 = this.o;
        A0 a1 = A0.COLLECT_TOKEN;
        C5 c6 = C5.NT_COLLECT_TOKENS;
        C5 c7 = C5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(a1, new a(c6, c7));
        this.o.put(A0.COLLECT_TOKENS_COMPLETED, new a(C5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.o.put(A0.COLLECT_TOKENS_FAILED, new a(C5.NT_COLLECT_TOKENS_FAILED, null));
        this.o.put(A0.INSTANCE_COLLECT_TOKEN, new a(c7, null));
        Map<A0, a> map4 = this.o;
        A0 a2 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        C5 c8 = C5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(a2, new a(c8, c8));
        Map<A0, a> map5 = this.o;
        A0 a3 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        C5 c9 = C5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(a3, new a(c9, c9));
        Map<A0, a> map6 = this.o;
        A0 a4 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        C5 c10 = C5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(a4, new a(c10, c10));
        this.o.put(A0.DESTROY_AD, new a(C5.NT_DESTROY, C5.NT_INSTANCE_DESTROY));
        Map<A0, a> map7 = this.o;
        A0 a5 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        C5 c11 = C5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(a5, new a(c11, c11));
        Map<A0, a> map8 = this.o;
        A0 a6 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        C5 c12 = C5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(a6, new a(c12, c12));
        Map<A0, a> map9 = this.o;
        A0 a7 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        C5 c13 = C5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(a7, new a(c13, c13));
        Map<A0, a> map10 = this.o;
        A0 a8 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        C5 c14 = C5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(a8, new a(c14, c14));
        Map<A0, a> map11 = this.o;
        A0 a9 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        C5 c15 = C5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(a9, new a(c15, c15));
        Map<A0, a> map12 = this.o;
        A0 a10 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        C5 c16 = C5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(a10, new a(c16, c16));
        Map<A0, a> map13 = this.o;
        A0 a11 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        C5 c17 = C5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(a11, new a(c17, c17));
        Map<A0, a> map14 = this.o;
        A0 a12 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        C5 c18 = C5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(a12, new a(c18, c18));
        Map<A0, a> map15 = this.o;
        A0 a13 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        C5 c19 = C5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(a13, new a(c19, c19));
        Map<A0, a> map16 = this.o;
        A0 a14 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        C5 c20 = C5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(a14, new a(c20, c20));
        Map<A0, a> map17 = this.o;
        A0 a15 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        C5 c21 = C5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(a15, new a(c21, c21));
        Map<A0, a> map18 = this.o;
        A0 a16 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        C5 c22 = C5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(a16, new a(c22, c22));
        this.o.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(C5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        HashMap map = new HashMap();
        this.l = map;
        map.put(A0.INIT_STARTED, new a(C5.IS_MANAGER_INIT_STARTED, null));
        this.l.put(A0.INIT_ENDED, new a(C5.IS_MANAGER_INIT_ENDED, null));
        this.l.put(A0.SESSION_CAPPED, new a(null, C5.IS_CAP_SESSION));
        this.l.put(A0.PLACEMENT_CAPPED, new a(C5.IS_CAP_PLACEMENT, null));
        this.l.put(A0.CHECK_PLACEMENT_CAPPED, new a(C5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.l.put(A0.AUCTION_REQUEST, new a(C5.IS_AUCTION_REQUEST, null));
        this.l.put(A0.AUCTION_SUCCESS, new a(C5.IS_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.l;
        A0 a0 = A0.AUCTION_FAILED;
        C5 c5 = C5.IS_AUCTION_FAILED;
        map2.put(a0, new a(c5, null));
        this.l.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(c5, null));
        this.l.put(A0.AUCTION_REQUEST_WATERFALL, new a(C5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.l.put(A0.AUCTION_RESULT_WATERFALL, new a(C5.IS_RESULT_WATERFALL, null));
        this.l.put(A0.INIT_SUCCESS, new a(null, null));
        this.l.put(A0.INIT_FAILED, new a(null, null));
        this.l.put(A0.SHOW_AD_SUCCESS, new a(C5.IS_CALLBACK_AD_DISPLAYED, C5.IS_INSTANCE_SHOW_SUCCESS));
        this.l.put(A0.AD_OPENED, new a(null, C5.IS_INSTANCE_OPENED));
        this.l.put(A0.AD_CLOSED, new a(C5.IS_CALLBACK_AD_CLOSED, C5.IS_INSTANCE_CLOSED));
        this.l.put(A0.AD_CLICKED, new a(C5.IS_CALLBACK_AD_CLICKED, C5.IS_INSTANCE_CLICKED));
        this.l.put(A0.AD_INFO_CHANGED, new a(C5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.l.put(A0.LOAD_AD, new a(C5.IS_LOAD_CALLED, C5.IS_INSTANCE_LOAD));
        this.l.put(A0.LOAD_AD_SUCCESS, new a(C5.IS_CALLBACK_LOAD_SUCCESS, C5.IS_INSTANCE_LOAD_SUCCESS));
        this.l.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(C5.IS_CALLBACK_LOAD_ERROR, C5.IS_INSTANCE_LOAD_FAILED));
        this.l.put(A0.LOAD_AD_NO_FILL, new a(null, C5.IS_INSTANCE_LOAD_NO_FILL));
        this.l.put(A0.SHOW_AD, new a(C5.IS_SHOW_CALLED, C5.IS_INSTANCE_SHOW));
        this.l.put(A0.SHOW_AD_FAILED, new a(C5.IS_CALLBACK_AD_SHOW_ERROR, C5.IS_INSTANCE_SHOW_FAILED));
        this.l.put(A0.AD_FORMAT_CAPPED, new a(C5.IS_AD_FORMAT_CAPPED, null));
        this.l.put(A0.AD_UNIT_CAPPED, new a(C5.IS_AD_UNIT_CAPPED, null));
        this.l.put(A0.COLLECT_TOKEN, new a(C5.IS_COLLECT_TOKENS, null));
        this.l.put(A0.COLLECT_TOKENS_COMPLETED, new a(C5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.l.put(A0.COLLECT_TOKENS_FAILED, new a(C5.IS_COLLECT_TOKENS_FAILED, null));
        this.l.put(A0.INSTANCE_COLLECT_TOKEN, new a(C5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.l.put(A0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(C5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.l.put(A0.INSTANCE_COLLECT_TOKEN_FAILED, new a(C5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.l.put(A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(C5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.l.put(A0.AD_READY_TRUE, new a(C5.IS_CHECK_READY_TRUE, null));
        this.l.put(A0.AD_READY_FALSE, new a(C5.IS_CHECK_READY_FALSE, null));
        this.l.put(A0.OPERATIONAL_LOAD_AD, new a(C5.IS_OPERATIONAL_LOAD_AD, null));
        this.l.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(C5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.l.put(A0.OPERATIONAL_LOAD_FAILED, new a(C5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.l.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(C5.IS_SET_CONFIGURATION, null));
        Map<A0, a> map3 = this.l;
        A0 a1 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        C5 c6 = C5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(a1, new a(c6, c6));
        Map<A0, a> map4 = this.l;
        A0 a2 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        C5 c7 = C5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(a2, new a(c7, c7));
        Map<A0, a> map5 = this.l;
        A0 a3 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        C5 c8 = C5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(a3, new a(c8, c8));
        Map<A0, a> map6 = this.l;
        A0 a4 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        C5 c9 = C5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(a4, new a(c9, c9));
        Map<A0, a> map7 = this.l;
        A0 a5 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        C5 c10 = C5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(a5, new a(c10, c10));
        Map<A0, a> map8 = this.l;
        A0 a6 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        C5 c11 = C5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(a6, new a(c11, c11));
        Map<A0, a> map9 = this.l;
        A0 a7 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        C5 c12 = C5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(a7, new a(c12, c12));
        Map<A0, a> map10 = this.l;
        A0 a8 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        C5 c13 = C5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(a8, new a(c13, c13));
        Map<A0, a> map11 = this.l;
        A0 a9 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        C5 c14 = C5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(a9, new a(c14, c14));
        Map<A0, a> map12 = this.l;
        A0 a10 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        C5 c15 = C5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(a10, new a(c15, c15));
        Map<A0, a> map13 = this.l;
        A0 a11 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        C5 c16 = C5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(a11, new a(c16, c16));
        Map<A0, a> map14 = this.l;
        A0 a12 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        C5 c17 = C5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(a12, new a(c17, c17));
        Map<A0, a> map15 = this.l;
        A0 a13 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        C5 c18 = C5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(a13, new a(c18, c18));
        this.l.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(C5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map16 = this.l;
        A0 a14 = A0.TROUBLESHOOT_AD_EXPIRED;
        C5 c19 = C5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(a14, new a(c19, c19));
        this.l.put(A0.TROUBLESHOOT_LOAD, new a(C5.TROUBLESHOOTING_IS_LOAD, null));
        this.l.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(C5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.l.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(C5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.l.put(A0.TROUBLESHOOT_LOAD_FAILED, new a(C5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.l.put(A0.TROUBLESHOOT_SHOW, new a(C5.TROUBLESHOOTING_IS_SHOW, null));
        this.l.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(C5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.l.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(C5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<A0, a> map17 = this.l;
        A0 a15 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        C5 c20 = C5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(a15, new a(c20, c20));
        this.l.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(C5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.l.put(A0.TROUBLESHOOT_DISPOSE, new a(C5.TROUBLESHOOTING_IS_DISPOSE, null));
    }

    void e() {
        HashMap map = new HashMap();
        this.m = map;
        map.put(A0.INIT_STARTED, new a(C5.RV_MANAGER_INIT_STARTED, null));
        this.m.put(A0.INIT_ENDED, new a(C5.RV_MANAGER_INIT_ENDED, null));
        this.m.put(A0.SESSION_CAPPED, new a(null, C5.RV_CAP_SESSION));
        this.m.put(A0.PLACEMENT_CAPPED, new a(C5.RV_CAP_PLACEMENT, null));
        this.m.put(A0.CHECK_PLACEMENT_CAPPED, new a(C5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.m.put(A0.AUCTION_REQUEST, new a(C5.RV_AUCTION_REQUEST, null));
        this.m.put(A0.AUCTION_SUCCESS, new a(C5.RV_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.m;
        A0 a0 = A0.AUCTION_FAILED;
        C5 c5 = C5.RV_AUCTION_FAILED;
        map2.put(a0, new a(c5, null));
        this.m.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(c5, null));
        this.m.put(A0.AUCTION_REQUEST_WATERFALL, new a(C5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.m.put(A0.AUCTION_RESULT_WATERFALL, new a(C5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.m.put(A0.INIT_SUCCESS, new a(null, null));
        this.m.put(A0.INIT_FAILED, new a(null, null));
        this.m.put(A0.AD_VISIBLE, new a(null, C5.RV_INSTANCE_VISIBLE));
        this.m.put(A0.SHOW_AD_SUCCESS, new a(C5.RV_CALLBACK_AD_DISPLAYED, null));
        this.m.put(A0.AD_OPENED, new a(null, C5.RV_BUSINESS_INSTANCE_OPENED));
        this.m.put(A0.AD_CLOSED, new a(null, C5.RV_INSTANCE_CLOSED));
        this.m.put(A0.AD_STARTED, new a(null, C5.RV_INSTANCE_STARTED));
        this.m.put(A0.AD_ENDED, new a(null, C5.RV_INSTANCE_ENDED));
        this.m.put(A0.AD_CLICKED, new a(C5.RV_CALLBACK_AD_CLICKED, C5.RV_BUSINESS_INSTANCE_CLICKED));
        this.m.put(A0.AD_INFO_CHANGED, new a(C5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.m.put(A0.AD_REWARDED, new a(null, C5.RV_BUSINESS_INSTANCE_REWARDED));
        this.m.put(A0.AD_AVAILABILITY_CHANGED_TRUE, new a(C5.RV_CALLBACK_AVAILABILITY_TRUE, C5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.m.put(A0.AD_AVAILABILITY_CHANGED_FALSE, new a(C5.RV_CALLBACK_AVAILABILITY_FALSE, C5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.m.put(A0.LOAD_AD, new a(C5.RV_BUSINESS_MEDIATION_LOAD, C5.RV_BUSINESS_INSTANCE_LOAD));
        this.m.put(A0.LOAD_AD_SUCCESS, new a(C5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.m.put(A0.LOAD_AD_FAILED, new a(null, C5.RV_INSTANCE_LOAD_FAILED));
        this.m.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(C5.RV_MEDIATION_LOAD_ERROR, C5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.m.put(A0.LOAD_AD_NO_FILL, new a(null, C5.RV_INSTANCE_LOAD_NO_FILL));
        this.m.put(A0.SHOW_AD, new a(C5.RV_API_SHOW_CALLED, C5.RV_INSTANCE_SHOW));
        this.m.put(A0.SHOW_AD_CHANCE, new a(null, C5.RV_INSTANCE_SHOW_CHANCE));
        this.m.put(A0.SHOW_AD_FAILED, new a(C5.RV_CALLBACK_SHOW_FAILED, C5.RV_INSTANCE_SHOW_FAILED));
        this.m.put(A0.AD_FORMAT_CAPPED, new a(C5.RV_AD_UNIT_CAPPED, null));
        this.m.put(A0.COLLECT_TOKEN, new a(C5.RV_COLLECT_TOKENS, null));
        this.m.put(A0.COLLECT_TOKENS_COMPLETED, new a(C5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.m.put(A0.COLLECT_TOKENS_FAILED, new a(C5.RV_COLLECT_TOKENS_FAILED, null));
        this.m.put(A0.INSTANCE_COLLECT_TOKEN, new a(C5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.m;
        A0 a1 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        C5 c6 = C5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a1, new a(c6, c6));
        Map<A0, a> map4 = this.m;
        A0 a2 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        C5 c7 = C5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a2, new a(c7, c7));
        Map<A0, a> map5 = this.m;
        A0 a3 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        C5 c8 = C5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a3, new a(c8, c8));
        this.m.put(A0.AD_READY_TRUE, new a(C5.RV_CHECK_READY_TRUE, null));
        this.m.put(A0.AD_READY_FALSE, new a(C5.RV_CHECK_READY_FALSE, null));
        this.m.put(A0.OPERATIONAL_LOAD_AD, new a(C5.RV_OPERATIONAL_LOAD_AD, null));
        this.m.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(C5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.m.put(A0.OPERATIONAL_LOAD_FAILED, new a(C5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.m.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(C5.RV_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.m;
        A0 a4 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        C5 c9 = C5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(a4, new a(c9, c9));
        Map<A0, a> map7 = this.m;
        A0 a5 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        C5 c10 = C5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(a5, new a(c10, c10));
        Map<A0, a> map8 = this.m;
        A0 a6 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        C5 c11 = C5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(a6, new a(c11, c11));
        Map<A0, a> map9 = this.m;
        A0 a7 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        C5 c12 = C5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a7, new a(c12, c12));
        Map<A0, a> map10 = this.m;
        A0 a8 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        C5 c13 = C5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(a8, new a(c13, c13));
        Map<A0, a> map11 = this.m;
        A0 a9 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        C5 c14 = C5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a9, new a(c14, c14));
        Map<A0, a> map12 = this.m;
        A0 a10 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        C5 c15 = C5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(a10, new a(c15, c15));
        Map<A0, a> map13 = this.m;
        A0 a11 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        C5 c16 = C5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(a11, new a(c16, c16));
        Map<A0, a> map14 = this.m;
        A0 a12 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        C5 c17 = C5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(a12, new a(c17, c17));
        Map<A0, a> map15 = this.m;
        A0 a13 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        C5 c18 = C5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(a13, new a(c18, c18));
        Map<A0, a> map16 = this.m;
        A0 a14 = A0.TROUBLESHOOT_LOAD_FAILED;
        C5 c19 = C5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(a14, new a(c19, c19));
        Map<A0, a> map17 = this.m;
        A0 a15 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        C5 c20 = C5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(a15, new a(c20, c20));
        Map<A0, a> map18 = this.m;
        A0 a16 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        C5 c21 = C5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a16, new a(c21, c21));
        Map<A0, a> map19 = this.m;
        A0 a17 = A0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        C5 c22 = C5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(a17, new a(c22, c22));
        this.m.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(C5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map20 = this.m;
        A0 a18 = A0.TROUBLESHOOT_AD_EXPIRED;
        C5 c23 = C5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(a18, new a(c23, c23));
        this.m.put(A0.TROUBLESHOOT_LOAD, new a(C5.TROUBLESHOOTING_RV_LOAD, null));
        this.m.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(C5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.m.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(C5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.m.put(A0.TROUBLESHOOT_SHOW, new a(C5.TROUBLESHOOTING_RV_SHOW, null));
        this.m.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(C5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.m.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(C5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<A0, a> map21 = this.m;
        A0 a19 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        C5 c24 = C5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(a19, new a(c24, c24));
        this.m.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(C5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.m.put(A0.TROUBLESHOOT_DISPOSE, new a(C5.TROUBLESHOOTING_RV_DISPOSE, null));
    }

    public void f() {
        this.c = null;
        this.g = null;
        this.h = null;
        this.e = null;
        this.f = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public D0(IronSource.AD_UNIT ad_unit, b bVar, C0 c0, AbstractC0487u3 abstractC0487u3) {
        this.a = ad_unit;
        this.b = bVar;
        this.c = c0;
        this.d = abstractC0487u3 == null ? a(ad_unit) : abstractC0487u3;
        b();
        this.e = new W8(this);
        this.f = new C0377nb(this);
        this.g = new Nf(this);
        this.h = new R1(this);
        this.i = new M(this);
        this.j = new Sf(this);
        this.k = new Jc(this);
    }

    protected void a(A0 a0, Map<String, Object> map) {
        a(a0, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(A0 a0, Map<String, Object> map, long j) {
        int iA = a(a0);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        C0 c0 = this.c;
        if (c0 != null) {
            map2.putAll(c0.a(a0));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.d.a(new B5(iA, j, new JSONObject(map2)));
    }

    private int a(A0 a0) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.a) && this.l.containsKey(a0)) {
                return this.l.get(a0).a(this.b);
            }
            if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.a) && this.m.containsKey(a0)) {
                return this.m.get(a0).a(this.b);
            }
            if (IronSource.AD_UNIT.BANNER.equals(this.a) && this.n.containsKey(a0)) {
                return this.n.get(a0).a(this.b);
            }
            if (IronSource.AD_UNIT.NATIVE_AD.equals(this.a) && this.o.containsKey(a0)) {
                return this.o.get(a0).a(this.b);
            }
            return -1;
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    void a() {
        HashMap map = new HashMap();
        this.n = map;
        map.put(A0.INIT_STARTED, new a(C5.BN_MANAGER_INIT_STARTED, null));
        this.n.put(A0.INIT_ENDED, new a(C5.BN_MANAGER_INIT_ENDED, null));
        this.n.put(A0.PLACEMENT_CAPPED, new a(C5.BN_PLACEMENT_CAPPED, null));
        this.n.put(A0.AUCTION_REQUEST, new a(C5.BN_AUCTION_REQUEST, null));
        this.n.put(A0.AUCTION_SUCCESS, new a(C5.BN_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.n;
        A0 a0 = A0.AUCTION_FAILED;
        C5 c5 = C5.BN_AUCTION_FAILED;
        map2.put(a0, new a(c5, null));
        this.n.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(c5, null));
        this.n.put(A0.AUCTION_REQUEST_WATERFALL, new a(C5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.n.put(A0.AUCTION_RESULT_WATERFALL, new a(C5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.n.put(A0.INIT_SUCCESS, new a(null, null));
        this.n.put(A0.INIT_FAILED, new a(null, null));
        this.n.put(A0.AD_OPENED, new a(C5.BN_CALLBACK_SHOW, C5.BN_INSTANCE_SHOW));
        this.n.put(A0.AD_CLICKED, new a(C5.BN_CALLBACK_CLICK, C5.BN_INSTANCE_CLICK));
        this.n.put(A0.LOAD_AD, new a(C5.BN_LOAD, C5.BN_INSTANCE_LOAD));
        this.n.put(A0.RELOAD_AD, new a(C5.BN_RELOAD, C5.BN_INSTANCE_RELOAD));
        this.n.put(A0.LOAD_AD_SUCCESS, new a(C5.BN_CALLBACK_LOAD_SUCCESS, C5.BN_INSTANCE_LOAD_SUCCESS));
        this.n.put(A0.RELOAD_AD_SUCCESS, new a(C5.BN_CALLBACK_RELOAD_SUCCESS, C5.BN_INSTANCE_RELOAD_SUCCESS));
        this.n.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(C5.BN_CALLBACK_LOAD_ERROR, C5.BN_INSTANCE_LOAD_ERROR));
        this.n.put(A0.RELOAD_AD_FAILED_WITH_REASON, new a(C5.BN_CALLBACK_RELOAD_ERROR, C5.BN_INSTANCE_RELOAD_ERROR));
        this.n.put(A0.LOAD_AD_NO_FILL, new a(null, C5.BN_INSTANCE_LOAD_NO_FILL));
        this.n.put(A0.RELOAD_AD_NO_FILL, new a(null, C5.BN_INSTANCE_RELOAD_NO_FILL));
        this.n.put(A0.AD_FORMAT_CAPPED, new a(C5.BN_AD_UNIT_CAPPED, null));
        this.n.put(A0.COLLECT_TOKEN, new a(C5.BN_COLLECT_TOKENS, null));
        this.n.put(A0.COLLECT_TOKENS_COMPLETED, new a(C5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.n.put(A0.COLLECT_TOKENS_FAILED, new a(C5.BN_COLLECT_TOKENS_FAILED, null));
        this.n.put(A0.INSTANCE_COLLECT_TOKEN, new a(C5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.n;
        A0 a1 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        C5 c6 = C5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a1, new a(c6, c6));
        Map<A0, a> map4 = this.n;
        A0 a2 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        C5 c7 = C5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a2, new a(c7, c7));
        Map<A0, a> map5 = this.n;
        A0 a3 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        C5 c8 = C5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a3, new a(c8, c8));
        this.n.put(A0.DESTROY_AD, new a(C5.BN_DESTROY, C5.BN_INSTANCE_DESTROY));
        this.n.put(A0.SKIP_RELOAD_AD, new a(C5.BN_SKIP_RELOAD, null));
        this.n.put(A0.AD_LEFT_APPLICATION, new a(C5.BN_CALLBACK_LEAVE_APP, C5.BN_INSTANCE_LEAVE_APP));
        this.n.put(A0.AD_PRESENT_SCREEN, new a(C5.BN_CALLBACK_PRESENT_SCREEN, C5.BN_INSTANCE_PRESENT_SCREEN));
        this.n.put(A0.AD_DISMISS_SCREEN, new a(C5.BN_CALLBACK_DISMISS_SCREEN, C5.BN_INSTANCE_DISMISS_SCREEN));
        this.n.put(A0.AD_VIEW_BOUND, new a(C5.BN_BOUND, C5.BN_INSTANCE_BOUND));
        this.n.put(A0.PAUSE_AD, new a(C5.BN_REFRESH_PAUSE, null));
        this.n.put(A0.RESUME_AD, new a(C5.BN_REFRESH_RESUME, null));
        this.n.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(C5.BN_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.n;
        A0 a4 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        C5 c9 = C5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(a4, new a(c9, c9));
        Map<A0, a> map7 = this.n;
        A0 a5 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        C5 c10 = C5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(a5, new a(c10, c10));
        Map<A0, a> map8 = this.n;
        A0 a6 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        C5 c11 = C5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(a6, new a(c11, c11));
        Map<A0, a> map9 = this.n;
        A0 a7 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        C5 c12 = C5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a7, new a(c12, c12));
        Map<A0, a> map10 = this.n;
        A0 a8 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        C5 c13 = C5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(a8, new a(c13, c13));
        Map<A0, a> map11 = this.n;
        A0 a9 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        C5 c14 = C5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a9, new a(c14, c14));
        Map<A0, a> map12 = this.n;
        A0 a10 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        C5 c15 = C5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(a10, new a(c15, c15));
        Map<A0, a> map13 = this.n;
        A0 a11 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        C5 c16 = C5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(a11, new a(c16, c16));
        Map<A0, a> map14 = this.n;
        A0 a12 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        C5 c17 = C5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(a12, new a(c17, c17));
        Map<A0, a> map15 = this.n;
        A0 a13 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        C5 c18 = C5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(a13, new a(c18, c18));
        Map<A0, a> map16 = this.n;
        A0 a14 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        C5 c19 = C5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(a14, new a(c19, c19));
        Map<A0, a> map17 = this.n;
        A0 a15 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        C5 c20 = C5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(a15, new a(c20, c20));
        Map<A0, a> map18 = this.n;
        A0 a16 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        C5 c21 = C5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a16, new a(c21, c21));
        Map<A0, a> map19 = this.n;
        A0 a17 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        C5 c22 = C5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(a17, new a(c22, c22));
        this.n.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(C5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.n.put(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(C5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.n.put(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(C5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.n.put(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(C5.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.n.put(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(C5.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(C5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(C5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<A0, a> map20 = this.n;
        A0 a18 = A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        C5 c23 = C5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(a18, new a(c23, c23));
        Map<A0, a> map21 = this.n;
        A0 a19 = A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        C5 c24 = C5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(a19, new a(c24, c24));
        Map<A0, a> map22 = this.n;
        A0 a20 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        C5 c25 = C5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(a20, new a(c25, c25));
        this.n.put(A0.TROUBLESHOOT_RELOAD, new a(C5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<A0, a> map23 = this.n;
        A0 a21 = A0.TROUBLESHOOT_LOAD_SKIPPED;
        C5 c26 = C5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(a21, new a(c26, c26));
    }
}
