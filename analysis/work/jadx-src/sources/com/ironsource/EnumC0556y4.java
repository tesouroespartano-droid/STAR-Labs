package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0556y4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final a b = new a(null);
    private final String a;

    /* JADX INFO: renamed from: com.ironsource.y4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @JvmStatic
        public final EnumC0556y4 a(String str) {
            for (EnumC0556y4 enumC0556y4 : EnumC0556y4.values()) {
                if (Intrinsics.areEqual(enumC0556y4.b(), str)) {
                    if (enumC0556y4 == null) {
                        return EnumC0556y4.NONE;
                    }
                    return enumC0556y4;
                }
            }
            enumC0556y4 = null;
            if (enumC0556y4 == null) {
                return EnumC0556y4.NONE;
            }
            return enumC0556y4;
        }

        private a() {
        }
    }

    EnumC0556y4(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    @JvmStatic
    public static final EnumC0556y4 a(String str) {
        return b.a(str);
    }
}
