package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes.dex */
final class dh {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractorTaskFinder");
    private final de b;
    private final bh c;
    private final bu d;

    dh(de deVar, bh bhVar, bu buVar) {
        this.b = deVar;
        this.c = bhVar;
        this.d = buVar;
    }

    private final boolean b(db dbVar, dc dcVar) {
        da daVar = dbVar.c;
        String str = daVar.a;
        long j = daVar.b;
        return new em(this.c, str, dbVar.b, j, dcVar.a).m();
    }

    private static boolean c(dc dcVar) {
        int i = dcVar.f;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0368 A[PHI: r8
      0x0368: PHI (r8v2 com.google.android.play.core.assetpacks.dg) = (r8v1 com.google.android.play.core.assetpacks.dg), (r8v4 com.google.android.play.core.assetpacks.dg) binds: [B:46:0x0179, B:61:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x036a A[PHI: r7
      0x036a: PHI (r7v2 com.google.android.play.core.assetpacks.dg) = (r7v1 com.google.android.play.core.assetpacks.dg), (r7v4 com.google.android.play.core.assetpacks.dg) binds: [B:21:0x0099, B:33:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    final dg a() {
        dg dwVar;
        dg dgVar;
        dg epVar;
        ce ceVar;
        ee eeVar;
        int iA;
        try {
            this.b.j();
            ArrayList arrayList = new ArrayList();
            for (db dbVar : this.b.g().values()) {
                if (bg.b(dbVar.c.d)) {
                    arrayList.add(dbVar);
                }
            }
            if (arrayList.isEmpty()) {
                dgVar = null;
            } else {
                Map mapT = this.c.t();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dwVar = null;
                        break;
                    }
                    db dbVar2 = (db) it.next();
                    Long l = (Long) mapT.get(dbVar2.c.a);
                    if (l != null && dbVar2.c.b == l.longValue()) {
                        a.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(dbVar2.a), dbVar2.c.a);
                        int i = dbVar2.a;
                        String str = dbVar2.c.a;
                        dwVar = new eh(i, str, this.c.a(str), dbVar2.b, dbVar2.c.b);
                        break;
                    }
                }
                if (dwVar == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            dwVar = null;
                            break;
                        }
                        db dbVar3 = (db) it2.next();
                        try {
                            bh bhVar = this.c;
                            da daVar = dbVar3.c;
                            if (bhVar.b(daVar.a, dbVar3.b, daVar.b) == dbVar3.c.f.size()) {
                                a.a("Found final move task for session %s with pack %s.", Integer.valueOf(dbVar3.a), dbVar3.c.a);
                                int i2 = dbVar3.a;
                                da daVar2 = dbVar3.c;
                                dwVar = new dw(i2, daVar2.a, dbVar3.b, daVar2.b, daVar2.c);
                                break;
                            }
                        } catch (IOException e) {
                            throw new ck(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(dbVar3.a), dbVar3.c.a), e, dbVar3.a);
                        }
                    }
                    if (dwVar == null) {
                        Iterator it3 = arrayList.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                epVar = null;
                                break;
                            }
                            db dbVar4 = (db) it3.next();
                            da daVar3 = dbVar4.c;
                            if (bg.b(daVar3.d)) {
                                for (dc dcVar : daVar3.f) {
                                    bh bhVar2 = this.c;
                                    da daVar4 = dbVar4.c;
                                    if (bhVar2.q(daVar4.a, dbVar4.b, daVar4.b, dcVar.a).exists()) {
                                        a.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(dbVar4.a), dbVar4.c.a, dcVar.a);
                                        int i3 = dbVar4.a;
                                        da daVar5 = dbVar4.c;
                                        epVar = new dt(i3, daVar5.a, dbVar4.b, daVar5.b, dcVar.a);
                                        break loop3;
                                    }
                                }
                            }
                        }
                        if (epVar == null) {
                            Iterator it4 = arrayList.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    epVar = null;
                                    break;
                                }
                                db dbVar5 = (db) it4.next();
                                da daVar6 = dbVar5.c;
                                if (bg.b(daVar6.d)) {
                                    for (dc dcVar2 : daVar6.f) {
                                        if (b(dbVar5, dcVar2)) {
                                            bh bhVar3 = this.c;
                                            da daVar7 = dbVar5.c;
                                            if (bhVar3.p(daVar7.a, dbVar5.b, daVar7.b, dcVar2.a).exists()) {
                                                a.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(dbVar5.a), dbVar5.c.a, dcVar2.a);
                                                int i4 = dbVar5.a;
                                                da daVar8 = dbVar5.c;
                                                epVar = new ep(i4, daVar8.a, dbVar5.b, daVar8.b, dcVar2.a, dcVar2.b, dcVar2.c);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (epVar == null) {
                                Iterator it5 = arrayList.iterator();
                                loop7: while (true) {
                                    if (!it5.hasNext()) {
                                        ceVar = null;
                                        break;
                                    }
                                    db dbVar6 = (db) it5.next();
                                    da daVar9 = dbVar6.c;
                                    if (bg.b(daVar9.d)) {
                                        for (dc dcVar3 : daVar9.f) {
                                            if (!c(dcVar3)) {
                                                bh bhVar4 = this.c;
                                                da daVar10 = dbVar6.c;
                                                try {
                                                    iA = new em(bhVar4, daVar10.a, dbVar6.b, daVar10.b, dcVar3.a).a();
                                                } catch (IOException e2) {
                                                    a.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                    iA = 0;
                                                }
                                                if (iA != -1 && ((cz) dcVar3.d.get(iA)).a) {
                                                    a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(dcVar3.e), Integer.valueOf(dbVar6.a), dbVar6.c.a, dcVar3.a, Integer.valueOf(iA));
                                                    InputStream inputStreamA = this.d.a(dbVar6.a, dbVar6.c.a, dcVar3.a, iA);
                                                    int i5 = dbVar6.a;
                                                    da daVar11 = dbVar6.c;
                                                    String str2 = daVar11.a;
                                                    int i6 = dbVar6.b;
                                                    long j = daVar11.b;
                                                    String str3 = daVar11.c;
                                                    String str4 = dcVar3.a;
                                                    int i7 = dcVar3.e;
                                                    int size = dcVar3.d.size();
                                                    da daVar12 = dbVar6.c;
                                                    ceVar = new ce(i5, str2, i6, j, str3, str4, i7, iA, size, daVar12.e, daVar12.d, inputStreamA);
                                                    break loop7;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (ceVar == null) {
                                    Iterator it6 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it6.hasNext()) {
                                            eeVar = null;
                                            break;
                                        }
                                        db dbVar7 = (db) it6.next();
                                        da daVar13 = dbVar7.c;
                                        if (bg.b(daVar13.d)) {
                                            for (dc dcVar4 : daVar13.f) {
                                                if (c(dcVar4) && ((cz) dcVar4.d.get(0)).a && !b(dbVar7, dcVar4)) {
                                                    a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(dcVar4.f), Integer.valueOf(dbVar7.a), dbVar7.c.a, dcVar4.a);
                                                    InputStream inputStreamA2 = this.d.a(dbVar7.a, dbVar7.c.a, dcVar4.a, 0);
                                                    int i8 = dbVar7.a;
                                                    String str5 = dbVar7.c.a;
                                                    eeVar = new ee(i8, str5, this.c.a(str5), this.c.c(dbVar7.c.a), dbVar7.b, dbVar7.c.b, dcVar4.f, dcVar4.a, dcVar4.c, inputStreamA2);
                                                    break loop9;
                                                }
                                            }
                                        }
                                    }
                                    if (eeVar != null) {
                                        this.b.l();
                                        return eeVar;
                                    }
                                    dgVar = null;
                                } else {
                                    dgVar = ceVar;
                                }
                            } else {
                                dgVar = epVar;
                            }
                        } else {
                            dgVar = epVar;
                        }
                    } else {
                        dgVar = dwVar;
                    }
                } else {
                    dgVar = dwVar;
                }
            }
            this.b.l();
            return dgVar;
        } catch (Throwable th) {
            this.b.l();
            throw th;
        }
    }
}
