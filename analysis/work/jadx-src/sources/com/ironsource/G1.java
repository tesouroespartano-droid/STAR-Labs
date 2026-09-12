package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class G1 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;
    private final int i;
    private final List<Integer> j;
    private final List<Integer> k;
    private final List<Integer> l;
    private final List<Integer> m;

    public G1(JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.a = applicationEvents.optBoolean(I1.a, false);
        this.b = applicationEvents.optBoolean(I1.b, false);
        this.c = applicationEvents.optBoolean(I1.c, false);
        this.d = applicationEvents.optInt(I1.d, -1);
        String strOptString = applicationEvents.optString(I1.e);
        Intrinsics.checkNotNullExpressionValue(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.e = strOptString;
        String strOptString2 = applicationEvents.optString(I1.f);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f = strOptString2;
        this.g = applicationEvents.optInt(I1.g, -1);
        this.h = applicationEvents.optInt(I1.h, -1);
        this.i = applicationEvents.optInt(I1.i, 5000);
        this.j = a(applicationEvents, I1.j);
        this.k = a(applicationEvents, I1.k);
        this.l = a(applicationEvents, I1.l);
        this.m = a(applicationEvents, I1.m);
    }

    public final int a() {
        return this.g;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.i;
    }

    public final int f() {
        return this.h;
    }

    public final List<Integer> g() {
        return this.m;
    }

    public final List<Integer> h() {
        return this.k;
    }

    public final List<Integer> i() {
        return this.j;
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.a;
    }

    public final String l() {
        return this.e;
    }

    public final List<Integer> m() {
        return this.l;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((IntIterator) it).nextInt())));
        }
        return arrayList;
    }
}
