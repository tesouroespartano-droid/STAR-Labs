package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0317k2 {
    private final String a;
    private final JSONObject b;
    private final C0368n2 c;
    private final int d;
    private final String e;

    public C0317k2(String auctionId, JSONObject jSONObject, C0368n2 c0368n2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.a = auctionId;
        this.b = jSONObject;
        this.c = c0368n2;
        this.d = i;
        this.e = auctionFallback;
    }

    public final String a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final C0368n2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0317k2)) {
            return false;
        }
        C0317k2 c0317k2 = (C0317k2) obj;
        return Intrinsics.areEqual(this.a, c0317k2.a) && Intrinsics.areEqual(this.b, c0317k2.b) && Intrinsics.areEqual(this.c, c0317k2.c) && this.d == c0317k2.d && Intrinsics.areEqual(this.e, c0317k2.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C0368n2 c0368n2 = this.c;
        return ((((iHashCode2 + (c0368n2 != null ? c0368n2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C0368n2 j() {
        return this.c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    public final C0317k2 a(String auctionId, JSONObject jSONObject, C0368n2 c0368n2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C0317k2(auctionId, jSONObject, c0368n2, i, auctionFallback);
    }

    public static /* synthetic */ C0317k2 a(C0317k2 c0317k2, String str, JSONObject jSONObject, C0368n2 c0368n2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c0317k2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c0317k2.b;
        }
        if ((i2 & 4) != 0) {
            c0368n2 = c0317k2.c;
        }
        if ((i2 & 8) != 0) {
            i = c0317k2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c0317k2.e;
        }
        String str3 = str2;
        C0368n2 c0368n3 = c0368n2;
        return c0317k2.a(str, jSONObject, c0368n3, i, str3);
    }
}
