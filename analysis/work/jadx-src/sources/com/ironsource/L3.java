package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 implements InterfaceC0440r7, InterfaceC0440r7.a {
    private final Nc a;
    private final C0156af b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[P3.values().length];
            try {
                iArr[P3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public L3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC0440r7
    public synchronized N3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        N3 n3A = this.a.a(identifier);
        if (n3A.d()) {
            return n3A;
        }
        return this.b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public synchronized void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.a.b(identifier);
        this.b.b(identifier);
    }

    public L3(InterfaceC0454s4 currentTimeProvider, K7 pacingDataRepository, Q8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.a = new Nc(currentTimeProvider, pacingDataRepository);
        this.b = new C0156af(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC0440r7.a
    public synchronized Object a(String identifier, P3 cappingType, InterfaceC0407p7 cappingConfig) {
        Object objA;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = a.a[cappingType.ordinal()];
        if (i == 1) {
            objA = this.a.a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            objA = this.b.a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion = Result.INSTANCE;
            objA = Result.m3604constructorimpl(Unit.INSTANCE);
        }
        return objA;
    }

    public /* synthetic */ L3(InterfaceC0454s4 interfaceC0454s4, K7 k7, Q8 q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC0454s4 = (i & 1) != 0 ? new InterfaceC0454s4.a() : interfaceC0454s4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            k7 = new Oc(new Ve(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            q8 = new Ye(new Ve(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC0454s4, k7, q8);
    }
}
