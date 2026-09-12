package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class I4 implements InterfaceC0583ze<String> {
    private final String a;
    private final String b;

    public I4(String encryptedResponse, String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.a = encryptedResponse;
        this.b = descriptionKey;
    }

    @Override // com.ironsource.InterfaceC0583ze
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = IronSourceAES.decode(this.b, this.a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
