package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0344lc {
    private final C0300j2 a;
    private final boolean b;

    /* JADX INFO: renamed from: com.ironsource.lc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "adm";
        public static final String c = "isOneFlow";
        public static final String d = "isMultipleAdObjects";
        public static final String e = "adsInternalInfo";
        public static final String f = "success";
        public static final String g = "error";
        public static final String h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0344lc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C0385o2 c0385o2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.b));
        map.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.g);
        List<N> listA = Ab.s.d().G().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.e, string);
        C0300j2 c0300j2 = this.a;
        if (c0300j2 != null && (c0385o2G = c0300j2.g()) != null) {
            map.put("adm", c0385o2G.a());
            map.putAll(c0385o2G.b());
        }
        return map;
    }

    public C0344lc(C0300j2 c0300j2, boolean z) {
        this.a = c0300j2;
        this.b = z;
    }

    public /* synthetic */ C0344lc(C0300j2 c0300j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c0300j2, (i & 2) != 0 ? false : z);
    }
}
