package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface Y7<T> {
    T a(String str);

    void a(T t);

    void a(String str, T t);

    public static final class a implements Y7<ISDemandOnlyInterstitialListener> {
        private X7 a = new X7();
        private final Map<String, X7> b = new HashMap();

        @Override // com.ironsource.Y7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            X7 x7 = this.b.get(instanceId);
            return x7 != null ? x7 : this.a;
        }

        @Override // com.ironsource.Y7
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                X7 x7 = this.b.get(it.next());
                if (x7 != null) {
                    x7.a(listener);
                }
            }
        }

        @Override // com.ironsource.Y7
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                X7 x7 = this.b.get(instanceId);
                if (x7 != null) {
                    x7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new X7(listener));
        }
    }

    public static final class b implements Y7<ISDemandOnlyRewardedVideoListener> {
        private C0149a8 a = new C0149a8();
        private final Map<String, C0149a8> b = new HashMap();

        @Override // com.ironsource.Y7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C0149a8 c0149a8 = this.b.get(instanceId);
            return c0149a8 != null ? c0149a8 : this.a;
        }

        @Override // com.ironsource.Y7
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                C0149a8 c0149a8 = this.b.get(it.next());
                if (c0149a8 != null) {
                    c0149a8.a(listener);
                }
            }
        }

        @Override // com.ironsource.Y7
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                C0149a8 c0149a8 = this.b.get(instanceId);
                if (c0149a8 != null) {
                    c0149a8.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new C0149a8(listener));
        }
    }
}
