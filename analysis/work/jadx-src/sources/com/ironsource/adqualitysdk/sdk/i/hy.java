package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hy<T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ia f2416;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2418;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ht f2417 = new ht();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<Object> f2415 = new HashSet();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<T> f2419 = new HashSet();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Set<hr> f2414 = new HashSet();

    public hy(ia iaVar) {
        this.f2416 = iaVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ia m2359() {
        return this.f2416;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ht m2357() {
        return this.f2417;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Set<Object> m2353() {
        return this.f2415;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2354() {
        return this.f2418;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final hy m2355() {
        this.f2418 = true;
        return this;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2356(T t) {
        this.f2419.add(t);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Set<T> m2352() {
        return this.f2419;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2358(hr hrVar) {
        this.f2414.add(hrVar);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Set<hr> m2351() {
        return this.f2414;
    }
}
