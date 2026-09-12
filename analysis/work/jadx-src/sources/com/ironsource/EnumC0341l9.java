package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0341l9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final a b = new a(null);
    private final int a;

    /* JADX INFO: renamed from: com.ironsource.l9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0341l9 a(int i) {
            for (EnumC0341l9 enumC0341l9 : EnumC0341l9.values()) {
                if (enumC0341l9.a == i) {
                    if (enumC0341l9 == null) {
                        return EnumC0341l9.NotSupported;
                    }
                    return enumC0341l9;
                }
            }
            enumC0341l9 = null;
            if (enumC0341l9 == null) {
                return EnumC0341l9.NotSupported;
            }
            return enumC0341l9;
        }

        private a() {
        }
    }

    EnumC0341l9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean b(EnumC0341l9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.a;
    }
}
