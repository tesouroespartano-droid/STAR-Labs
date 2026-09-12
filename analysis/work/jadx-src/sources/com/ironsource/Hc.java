package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Hc {
    private final String a;
    private final String b;

    public Hc(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = str;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hc)) {
            return false;
        }
        Hc hc = (Hc) obj;
        return Intrinsics.areEqual(this.a, hc.a) && Intrinsics.areEqual(this.b, hc.b);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ Hc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final Hc a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Hc(url, str);
    }

    public static /* synthetic */ Hc a(Hc hc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hc.a;
        }
        if ((i & 2) != 0) {
            str2 = hc.b;
        }
        return hc.a(str, str2);
    }
}
