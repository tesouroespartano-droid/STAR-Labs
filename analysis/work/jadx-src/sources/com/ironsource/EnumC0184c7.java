package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0184c7 {
    SendEvent(0),
    NativeController(1);

    public static final a b = new a(null);
    private final int a;

    /* JADX INFO: renamed from: com.ironsource.c7$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0184c7 a(int i) {
            for (EnumC0184c7 enumC0184c7 : EnumC0184c7.values()) {
                if (enumC0184c7.b() == i) {
                    if (enumC0184c7 == null) {
                        return EnumC0184c7.SendEvent;
                    }
                    return enumC0184c7;
                }
            }
            enumC0184c7 = null;
            if (enumC0184c7 == null) {
                return EnumC0184c7.SendEvent;
            }
            return enumC0184c7;
        }

        private a() {
        }
    }

    EnumC0184c7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
