package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0324k9 {
    private final String a;
    private final int b;
    private final String c;

    public C0324k9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0324k9)) {
            return false;
        }
        C0324k9 c0324k9 = (C0324k9) obj;
        return Intrinsics.areEqual(this.a, c0324k9.a) && this.b == c0324k9.b && Intrinsics.areEqual(this.c, c0324k9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.a + ", instanceType=" + this.b + ", dynamicDemandSourceId=" + this.c + ")";
    }

    public C0324k9(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.a = instanceId;
        this.b = i;
        this.c = str;
    }

    public final C0324k9 a(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C0324k9(instanceId, i, str);
    }

    public static /* synthetic */ C0324k9 a(C0324k9 c0324k9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c0324k9.a;
        }
        if ((i2 & 2) != 0) {
            i = c0324k9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c0324k9.c;
        }
        return c0324k9.a(str, i, str2);
    }

    public /* synthetic */ C0324k9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
