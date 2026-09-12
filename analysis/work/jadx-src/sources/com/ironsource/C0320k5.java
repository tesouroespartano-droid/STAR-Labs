package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0320k5 {
    private long a = new Date().getTime();

    public static long a(C0320k5 c0320k5) {
        if (c0320k5 == null) {
            return 0L;
        }
        return new Date().getTime() - c0320k5.a;
    }
}
