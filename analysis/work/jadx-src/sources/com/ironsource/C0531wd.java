package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0531wd {
    private final C0309jb a;
    private final Map<String, C0449s.d> b;
    private final Map<String, C0449s.d> c;

    public C0531wd(C0309jb tools, Map<String, C0449s.d> map, Map<String, C0449s.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.a = tools;
        this.b = map;
        this.c = map2;
    }

    private final void b(Q7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m3611isSuccessimpl(objA)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objA);
        if (thM3607exceptionOrNullimpl != null) {
            this.a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thM3607exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(Q7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C0449s.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C0449s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                C0497ud c0497udF = entry.getValue().f();
                if (c0497udF != null) {
                    b(rewardService, key, c0497udF.b(), c0497udF.a());
                }
            }
        }
        Map<String, C0449s.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C0449s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            C0497ud c0497udA = entry2.getValue().a();
            if (c0497udA != null) {
                a(rewardService, key2, c0497udA.b(), c0497udA.a());
            }
        }
    }

    private final void a(Q7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m3611isSuccessimpl(objA)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objA);
        if (thM3607exceptionOrNullimpl != null) {
            this.a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thM3607exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m3604constructorimpl(ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
