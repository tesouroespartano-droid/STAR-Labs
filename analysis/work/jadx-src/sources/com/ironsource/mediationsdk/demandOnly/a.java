package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C0368n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0062a implements a {
        private final List<C0368n2> a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0062a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C0368n2 a(String instanceName) {
            Object next;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((C0368n2) next).c(), instanceName)) {
                    return (C0368n2) next;
                }
            }
            next = null;
            return (C0368n2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            if (this.a.isEmpty()) {
                return "";
            }
            return "1" + ((C0368n2) CollectionsKt.first((List) this.a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C0368n2 get(int i) {
            if (i < 0 || i >= this.a.size()) {
                return null;
            }
            return this.a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public C0062a(List<C0368n2> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C0368n2> a() {
            return this.a;
        }

        public /* synthetic */ C0062a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    C0368n2 a(String str);

    List<C0368n2> a();

    String b();

    C0368n2 get(int i);

    boolean isEmpty();
}
