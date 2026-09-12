package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class CallableC0555y3 implements Callable<C3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final A3 d;
    private final InterfaceC0572z3 e;
    private final NetworkSettings f;

    /* JADX INFO: renamed from: com.ironsource.y3$a */
    class a implements BiddingDataCallback {
        final /* synthetic */ C0320k5 a;
        final /* synthetic */ BlockingQueue b;

        a(C0320k5 c0320k5, BlockingQueue blockingQueue) {
            this.a = c0320k5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new C3(CallableC0555y3.this.d(), CallableC0555y3.this.c(), null, C0320k5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new C3(CallableC0555y3.this.d(), CallableC0555y3.this.c(), map, C0320k5.a(this.a), null));
        }
    }

    public CallableC0555y3(int i, String str, AdData adData, A3 a3, InterfaceC0572z3 interfaceC0572z3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = a3;
        this.e = interfaceC0572z3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3 call() throws Exception {
        C0320k5 c0320k5 = new C0320k5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, new a(c0320k5, arrayBlockingQueue));
        } catch (Exception e) {
            C0421q4.d().a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC0572z3 interfaceC0572z3 = this.e;
            if (interfaceC0572z3 != null) {
                interfaceC0572z3.a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C0421q4.d().a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC0572z3 interfaceC0572z4 = this.e;
            if (interfaceC0572z4 != null) {
                interfaceC0572z4.a(str2);
            }
        }
        InterfaceC0572z3 interfaceC0572z5 = this.e;
        if (interfaceC0572z5 != null) {
            interfaceC0572z5.a(this.f);
        }
        return (C3) arrayBlockingQueue.take();
    }

    public A3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
