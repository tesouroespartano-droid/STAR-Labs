package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0553y1 {
    private final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0553y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0553y1) && Intrinsics.areEqual(this.a, ((C0553y1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.a + ")";
    }

    public C0553y1(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.a = auctionData;
    }

    public final C0553y1 a(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C0553y1(auctionData);
    }

    public /* synthetic */ C0553y1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C0553y1 a(C0553y1 c0553y1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0553y1.a;
        }
        return c0553y1.a(str);
    }
}
