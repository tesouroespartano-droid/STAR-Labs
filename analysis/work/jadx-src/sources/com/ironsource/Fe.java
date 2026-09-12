package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Fe implements L8, L8.a {
    private final Map<String, Integer> a = new HashMap();
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.L8.a
    public void a(List<? extends L8.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (L8.b bVar : smashes) {
            this.a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.ironsource.L8
    public boolean b(L8.b smash) {
        boolean z;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.a.containsKey(strC)) {
                Integer num = this.a.get(strC);
                Intrinsics.checkNotNull(num);
                if (num.intValue() >= smash.b()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ironsource.L8.a
    public void a(L8.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.a.containsKey(strC)) {
                Map<String, Integer> map = this.a;
                Integer num = map.get(strC);
                Intrinsics.checkNotNull(num);
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ironsource.L8
    public boolean a() {
        for (String str : this.b.keySet()) {
            Integer num = this.a.get(str);
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.b.get(str);
            Intrinsics.checkNotNull(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
