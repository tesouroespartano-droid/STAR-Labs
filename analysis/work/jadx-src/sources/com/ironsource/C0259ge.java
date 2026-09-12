package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0259ge {
    private final String a;
    private final String b;
    private final List<IronSource.AD_UNIT> c;

    public C0259ge(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<IronSource.AD_UNIT> c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final List<IronSource.AD_UNIT> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0259ge)) {
            return false;
        }
        C0259ge c0259ge = (C0259ge) obj;
        return Intrinsics.areEqual(this.a, c0259ge.a) && Intrinsics.areEqual(this.b, c0259ge.b) && Intrinsics.areEqual(this.c, c0259ge.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    public final C0259ge a(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C0259ge(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0259ge a(C0259ge c0259ge, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0259ge.a;
        }
        if ((i & 2) != 0) {
            str2 = c0259ge.b;
        }
        if ((i & 4) != 0) {
            list = c0259ge.c;
        }
        return c0259ge.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.AD_UNIT> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C0259ge(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
