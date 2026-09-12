package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0263h1 implements InterfaceC0401p1 {
    private final InterfaceC0316k1 a;
    private final D7 b;
    private final InterfaceC0580zb<Integer, Integer> c;
    private final InterfaceC0454s4 d;
    private List<InterfaceC0350m1> e;

    public C0263h1(InterfaceC0316k1 eventBaseData, D7 eventsManager, InterfaceC0580zb<Integer, Integer> eventsMapper, InterfaceC0454s4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new ArrayList();
    }

    public final void a(List<InterfaceC0350m1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final List<InterfaceC0350m1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC0350m1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC0350m1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC0401p1
    public void a(int i, List<InterfaceC0350m1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC0350m1) it.next());
            }
            Iterator<InterfaceC0350m1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new B5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (Exception e) {
            C0421q4.d().a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C0263h1(InterfaceC0316k1 interfaceC0316k1, D7 d7, InterfaceC0580zb interfaceC0580zb, InterfaceC0454s4 interfaceC0454s4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0316k1, d7, interfaceC0580zb, (i & 8) != 0 ? new InterfaceC0454s4.a() : interfaceC0454s4);
    }

    @Override // com.ironsource.InterfaceC0401p1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC0401p1
    public void a(InterfaceC0350m1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC0350m1 interfaceC0350m1 : analyticsEventEntity) {
            this.e.add(interfaceC0350m1);
        }
    }
}
