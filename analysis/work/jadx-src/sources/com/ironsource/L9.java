package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class L9 {
    private final String a;
    private final String b;

    public L9(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.a = advId;
        this.b = advIdType;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L9)) {
            return false;
        }
        L9 l9 = (L9) obj;
        return Intrinsics.areEqual(this.a, l9.a) && Intrinsics.areEqual(this.b, l9.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.a + ", advIdType=" + this.b + ")";
    }

    public final L9 a(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new L9(advId, advIdType);
    }

    public static /* synthetic */ L9 a(L9 l9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = l9.a;
        }
        if ((i & 2) != 0) {
            str2 = l9.b;
        }
        return l9.a(str, str2);
    }
}
