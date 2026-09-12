package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public enum U7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        public final U7 a(Integer num) {
            for (U7 u7 : U7.values()) {
                int iB = u7.b();
                if (num != null && iB == num.intValue()) {
                    if (u7 == null) {
                        return U7.UnknownProvider;
                    }
                    return u7;
                }
            }
            u7 = null;
            if (u7 == null) {
                return U7.UnknownProvider;
            }
            return u7;
        }

        private a() {
        }

        public final U7 a(String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listSplit$default = StringsKt.split$default((CharSequence) dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, (Object) null);
            return listSplit$default.size() < 2 ? U7.UnknownProvider : a(StringsKt.toIntOrNull((String) listSplit$default.get(1)));
        }
    }

    U7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
