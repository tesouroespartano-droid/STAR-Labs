package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0246g1 implements Ue<JSONArray> {
    private final List<C0229f1> a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.g1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Te.values().length];
            try {
                iArr[Te.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Te.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC0252g7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(Te mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            List<C0229f1> listB = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0229f1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C0229f1> listA = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0229f1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C0229f1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.add(event);
    }

    private final List<C0229f1> a() {
        List<C0229f1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0229f1 c0229f1 = (C0229f1) obj;
            if (c0229f1.e() != Re.LoadSuccess && c0229f1.e() != Re.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0229f1) it.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C0229f1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C0229f1 c0229f2 = (C0229f1) obj2;
            if (c0229f2.e() == Re.LoadSuccess && !set.contains(c0229f2.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C0229f1> b() {
        List<C0229f1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0229f1) obj).e() != Re.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
