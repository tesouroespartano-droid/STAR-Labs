package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0484u0 {
    private final String a;
    private final List<NetworkSettings> b;
    private final C0238fa c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0484u0(String str, List<? extends NetworkSettings> providerList, C0238fa publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    public final String a() {
        return this.a;
    }

    public final List<NetworkSettings> b() {
        return this.b;
    }

    public final C0238fa c() {
        return this.c;
    }

    public final List<NetworkSettings> d() {
        return this.b;
    }

    public final C0238fa e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0484u0)) {
            return false;
        }
        C0484u0 c0484u0 = (C0484u0) obj;
        return Intrinsics.areEqual(this.a, c0484u0.a) && Intrinsics.areEqual(this.b, c0484u0.b) && Intrinsics.areEqual(this.c, c0484u0.c);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final C0484u0 a(String str, List<? extends NetworkSettings> providerList, C0238fa publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C0484u0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0484u0 a(C0484u0 c0484u0, String str, List list, C0238fa c0238fa, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0484u0.a;
        }
        if ((i & 2) != 0) {
            list = c0484u0.b;
        }
        if ((i & 4) != 0) {
            c0238fa = c0484u0.c;
        }
        return c0484u0.a(str, list, c0238fa);
    }
}
