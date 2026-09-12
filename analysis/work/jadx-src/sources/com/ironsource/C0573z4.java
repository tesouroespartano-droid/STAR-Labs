package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0573z4 implements P8, O8 {
    private final InterfaceC0559y7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0573z4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O8
    public void a(Context context, EnumC0556y4 source, String key, String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        E4 e4A = this.a.a(context, source);
        if (e4A != null) {
            e4A.b(key, value);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C0573z4(InterfaceC0559y7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.P8
    public String a(Context context, EnumC0556y4 source, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        E4 e4A = this.a.a(context, source);
        if (e4A != null) {
            return E4.a(e4A, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C0573z4(InterfaceC0559y7 interfaceC0559y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4() : interfaceC0559y7);
    }
}
