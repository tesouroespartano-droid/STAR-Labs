package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class Fa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC0239fb<LevelPlayAdInfo> interfaceC0239fb) {
        if (interfaceC0239fb instanceof InterfaceC0239fb.b) {
            return "success";
        }
        if (interfaceC0239fb instanceof InterfaceC0239fb.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
