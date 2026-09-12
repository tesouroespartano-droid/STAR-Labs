package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0172bd {
    private final C0309jb a;
    private final Map<LevelPlay.AdFormat, C0449s> b;

    public C0172bd(C0309jb tools, Map<LevelPlay.AdFormat, C0449s> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(L7.a aVar, String str, LevelPlay.AdFormat adFormat, C0449s.d dVar) throws JSONException {
        P3 p3 = P3.Delivery;
        Q4 q4C = dVar.c();
        a(aVar.a(str, adFormat, p3, new G3(q4C != null ? Boolean.valueOf(q4C.a()) : null, null, null, 6, null)), str, adFormat, p3);
    }

    private final void c(L7.a aVar, String str, LevelPlay.AdFormat adFormat, C0449s.d dVar) throws JSONException {
        Qc qcE = dVar.e();
        if (qcE != null) {
            P3 p3 = P3.Pacing;
            a(aVar.a(str, adFormat, p3, new G3(qcE.a(), qcE.b(), O3.Second)), str, adFormat, p3);
        }
    }

    public final void a(L7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C0449s> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C0449s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C0449s.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(L7.a aVar, String str, LevelPlay.AdFormat adFormat, C0449s.d dVar) throws JSONException {
        J3 j3B = dVar.b();
        if (j3B != null) {
            P3 p3 = P3.ShowCount;
            a(aVar.a(str, adFormat, p3, new G3(j3B.a(), j3B.b(), j3B.c())), str, adFormat, p3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, P3 p3) throws JSONException {
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(obj);
        if (thM3607exceptionOrNullimpl != null) {
            this.a.a(str, adFormat, new K3().a(p3), thM3607exceptionOrNullimpl.getMessage());
        }
    }
}
