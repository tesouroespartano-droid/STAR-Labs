package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface Z7<T> {

    public static class a<ListenerType> implements Z7<ListenerType> {
        private ListenerType a;

        /* JADX INFO: renamed from: com.ironsource.Z7$a$a, reason: collision with other inner class name */
        public static final class C0040a extends Vd {
            final /* synthetic */ Runnable b;

            C0040a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.Vd
            public void a() {
                this.b.run();
            }
        }

        public final ListenerType a() {
            return this.a;
        }

        public final void b(ListenerType listenertype) {
            this.a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0040a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.Z7
        public void a(ListenerType listenertype) {
            this.a = listenertype;
        }
    }

    void a(T t);
}
