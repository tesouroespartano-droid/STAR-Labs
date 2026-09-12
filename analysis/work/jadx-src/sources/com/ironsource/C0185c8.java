package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0185c8 extends Throwable {
    private final IronSourceError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185c8(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
    }

    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C0185c8.class, obj.getClass())) {
            return false;
        }
        C0185c8 c0185c8 = (C0185c8) obj;
        if (this.a.getErrorCode() != c0185c8.a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.a.getErrorMessage(), c0185c8.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }
}
