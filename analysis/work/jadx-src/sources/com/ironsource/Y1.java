package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 {
    public static final Y1 a = new Y1();
    public static final String b = "trials_fail";
    public static final String c = "parsing";
    public static final String d = "other";
    public static final String e = "disabled";
    public static final String f = "-1";

    private Y1() {
    }

    public final String a(boolean z) {
        if (!z) {
            return f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(Y1 y1, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return y1.a(z, num);
    }

    public final String a(boolean z, Integer num) {
        if (!z) {
            return e;
        }
        if (num != null && num.intValue() == 1003) {
            return c;
        }
        if (num != null && num.intValue() == 1008) {
            return c;
        }
        if (num != null && num.intValue() == 1002) {
            return c;
        }
        if (num != null && num.intValue() == 1006) {
            return b;
        }
        return (num != null && num.intValue() == 1001) ? b : d;
    }
}
