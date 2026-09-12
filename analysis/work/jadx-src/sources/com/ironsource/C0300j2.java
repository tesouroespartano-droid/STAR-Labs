package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0300j2 {
    public static final b h = new b(null);
    private final String a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final C0368n2 c;
    private final JSONObject d;
    private final JSONObject e;
    private final C0196d2 f;
    private final C0385o2 g;

    /* JADX INFO: renamed from: com.ironsource.j2$a */
    public static final class a {
        private final JSONObject a;
        private final String b;
        private final String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final C0368n2 e;
        private final JSONObject f;
        private final JSONObject g;
        private final C0196d2 h;
        private final C0385o2 i;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.a = auctionData;
            this.b = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.d = aVarA;
            this.e = c(jSONObjectA);
            this.f = d(jSONObjectA);
            this.g = b(jSONObjectA);
            this.h = a(aVarA, instanceId);
            this.i = b(aVarA, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C0300j2 a() {
            return new C0300j2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final JSONObject b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C0368n2 c(JSONObject jSONObject) {
            return new C0368n2(jSONObject);
        }

        private final C0385o2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C0368n2 c0368n2A = aVar.a(str);
            if (c0368n2A == null) {
                return null;
            }
            String strK = c0368n2A.k();
            Intrinsics.checkNotNullExpressionValue(strK, "it.serverData");
            return new C0385o2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    C0368n2 c0368n2 = new C0368n2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c0368n2.m()) {
                        c0368n2 = null;
                    }
                    if (c0368n2 != null) {
                        arrayList2.add(c0368n2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C0062a(arrayList);
        }

        private final C0196d2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C0368n2 c0368n2A = aVar.a(str);
            if (c0368n2A == null) {
                return null;
            }
            C0196d2 c0196d2 = new C0196d2();
            c0196d2.a(c0368n2A.b());
            c0196d2.c(c0368n2A.h());
            c0196d2.b(c0368n2A.g());
            return c0196d2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C0300j2 c0300j2, String str) {
            String strB = c0300j2.b();
            if (strB != null && strB.length() != 0) {
                if (c0300j2.i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.f())));
                }
                C0368n2 c0368n2A = c0300j2.a(str);
                if (c0368n2A == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.j())));
                }
                String strK = c0368n2A.k();
                if (strK != null && strK.length() != 0) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m3604constructorimpl(c0300j2);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.e())));
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(new C0185c8(C0557y5.a.i())));
        }
    }

    public C0300j2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C0368n2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C0196d2 c0196d2, C0385o2 c0385o2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c0196d2;
        this.g = c0385o2;
    }

    public final String a() {
        C0385o2 c0385o2 = this.g;
        if (c0385o2 != null) {
            return c0385o2.d();
        }
        return null;
    }

    public final String b() {
        return this.a;
    }

    public final C0196d2 c() {
        return this.f;
    }

    public final JSONObject d() {
        return this.e;
    }

    public final C0368n2 e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.d;
    }

    public final C0385o2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final C0368n2 a(String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final C0368n2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
