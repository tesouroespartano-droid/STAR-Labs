package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0299j1 implements InterfaceC0316k1 {
    private final String a;
    private final String b;
    private final IronSource.AD_UNIT c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public C0299j1(String version, String instanceId, IronSource.AD_UNIT adFormat, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = version;
        this.b = instanceId;
        this.c = adFormat;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.ironsource.InterfaceC0316k1
    public ArrayList<InterfaceC0350m1> a() {
        ArrayList<InterfaceC0350m1> arrayList = new ArrayList<>();
        arrayList.add(new C0333l1.v(this.a));
        arrayList.add(new C0333l1.x(this.b));
        arrayList.add(new C0333l1.a(this.c));
        if (this.d) {
            arrayList.add(new C0333l1.p(1));
        }
        if (this.e) {
            arrayList.add(new C0333l1.e(1));
        }
        if (this.f) {
            arrayList.add(new C0333l1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C0299j1(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, ad_unit, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
