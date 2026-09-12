package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0467t0 implements M3 {
    private final C0309jb a;
    private final Map<LevelPlay.AdFormat, C0449s> b;

    public C0467t0(C0309jb tools, Map<LevelPlay.AdFormat, C0449s> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(InterfaceC0440r7.a aVar, String str, C0449s.d dVar) throws JSONException {
        Qc qcE = dVar.e();
        if (qcE != null) {
            P3 p3 = P3.Pacing;
            a(aVar.a(str, p3, new G3(qcE.a(), qcE.b(), qcE.c())), str, p3);
        }
    }

    @Override // com.ironsource.M3
    public void a(InterfaceC0440r7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C0449s>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C0449s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C0449s.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC0440r7.a aVar, String str, C0449s.d dVar) throws JSONException {
        J3 j3B = dVar.b();
        if (j3B != null) {
            P3 p3 = P3.ShowCount;
            a(aVar.a(str, p3, new G3(j3B.a(), j3B.b(), j3B.c())), str, p3);
        }
    }

    private final void a(Object obj, String str, P3 p3) throws JSONException {
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(obj);
        if (thM3607exceptionOrNullimpl != null) {
            this.a.a(str, new K3().a(p3), thM3607exceptionOrNullimpl.getMessage());
        }
    }
}
