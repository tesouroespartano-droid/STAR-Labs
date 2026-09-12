package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Df {
    private String a;

    /* JADX WARN: Multi-variable type inference failed */
    public Df() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Df) && Intrinsics.areEqual(this.a, ((Df) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.a + ")";
    }

    public Df(String str) {
        this.a = str;
    }

    public final Df a(String str) {
        return new Df(str);
    }

    public final void b(String str) {
        this.a = str;
    }

    public /* synthetic */ Df(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Df a(Df df, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = df.a;
        }
        return df.a(str);
    }
}
