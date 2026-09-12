package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0152ab {
    private final C0188cb a;

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    public static final class a {
        private C0152ab a = new C0152ab(null);

        public final a a(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.a.a(adUnitId);
            return this;
        }

        public final a b(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.a.b(placementName);
            return this;
        }

        public final a a(InterfaceC0222eb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            return this;
        }

        public final C0152ab a() {
            return this.a;
        }
    }

    public /* synthetic */ C0152ab(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String c() {
        return this.a.i();
    }

    public final String d() {
        return this.a.j();
    }

    public final InterfaceC0170bb.a e() {
        return this.a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.a.l();
    }

    public final String g() {
        return this.a.m();
    }

    public final void h() {
        this.a.n();
    }

    private C0152ab() {
        this.a = new C0188cb(C0542x7.a.a(), this);
    }

    public final void a() {
        this.a.f();
    }

    public final String b() {
        return this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.a.b(str);
    }

    public final void a(InterfaceC0222eb interfaceC0222eb) {
        this.a.a(interfaceC0222eb);
    }
}
