package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0465sf {
    private final String a;
    private final String b;
    private final boolean c;
    private final Boolean d;

    public C0465sf(String str, boolean z, Boolean bool, String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return Intrinsics.areEqual(this.d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        C0584zf c0584zf = C0584zf.a;
        return Intrinsics.areEqual(c0584zf.a(networkSettings), this.b) && c0584zf.a(networkSettings, adUnit) == this.c;
    }

    public /* synthetic */ C0465sf(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
