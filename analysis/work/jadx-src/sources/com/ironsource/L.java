package com.ironsource;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class L {
    public static final L a = new L();
    private static final HashMap<String, Long> b = new HashMap<>();

    private L() {
    }

    public final HashMap<String, Long> a() {
        return b;
    }

    public final long b(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final boolean a(String instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j));
        return true;
    }

    public final boolean a(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> map = b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
