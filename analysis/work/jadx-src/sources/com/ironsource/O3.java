package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum O3 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);

    public static final a c = new a(null);
    private final String a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final O3 a(String str) {
            for (O3 o3 : O3.values()) {
                if (Intrinsics.areEqual(o3.a, str)) {
                    return o3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    O3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a(Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.b;
    }

    public static /* synthetic */ long a(O3 o3, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return o3.a(num);
    }
}
