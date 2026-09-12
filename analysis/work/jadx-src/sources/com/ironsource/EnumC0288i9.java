package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0288i9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final a b = new a(null);
    private final int a;

    /* JADX INFO: renamed from: com.ironsource.i9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0288i9 a(int i) {
            for (EnumC0288i9 enumC0288i9 : EnumC0288i9.values()) {
                if (enumC0288i9.b() == i) {
                    if (enumC0288i9 == null) {
                        return EnumC0288i9.APP_ACTIVITY;
                    }
                    return enumC0288i9;
                }
            }
            enumC0288i9 = null;
            if (enumC0288i9 == null) {
                return EnumC0288i9.APP_ACTIVITY;
            }
            return enumC0288i9;
        }

        private a() {
        }
    }

    EnumC0288i9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
