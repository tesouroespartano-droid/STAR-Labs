package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ht {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<List<Field>> f2390;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f2391;

    public ht() {
        ArrayList arrayList = new ArrayList();
        this.f2390 = arrayList;
        int i = (-1) + 1;
        this.f2391 = i;
        arrayList.add(i, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m2290(Field field) {
        this.f2390.get(this.f2391).add(field);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m2292(Field field) {
        this.f2390.get(this.f2391).remove(field);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m2293() {
        int i = this.f2391 + 1;
        this.f2391 = i;
        this.f2390.add(i, new ArrayList());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m2294() {
        this.f2390.remove(this.f2391);
        this.f2391--;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final List<List<Field>> m2291() {
        return this.f2390;
    }
}
