package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class T8 implements U8 {
    private final W3 a;

    /* JADX WARN: Multi-variable type inference failed */
    public T8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m3604constructorimpl(drawableCreateFromPath);
    }

    private final Object c(String str) {
        InputStream inputStreamA = this.a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            CloseableKt.closeFinally(inputStreamA, null);
            if (drawableCreateFromStream == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m3604constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3604constructorimpl(drawableCreateFromStream);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamA, th);
                throw th2;
            }
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.U8
    public Object a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e) {
            C0421q4.d().a(e);
            Result.Companion companion = Result.INSTANCE;
            return Result.m3604constructorimpl(ResultKt.createFailure(e));
        }
    }

    public T8(W3 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.a = connectionFactory;
    }

    public /* synthetic */ T8(W3 w3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? K4.a : w3);
    }
}
