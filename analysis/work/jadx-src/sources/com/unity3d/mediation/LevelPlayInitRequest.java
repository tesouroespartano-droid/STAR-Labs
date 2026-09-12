package com.unity3d.mediation;

import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlayInitRequest {
    private final String a;
    private final String b;
    private final List<LevelPlay.AdFormat> c;

    public static final class Builder {
        private final String a;
        private String b;
        private List<? extends LevelPlay.AdFormat> c;

        public Builder(String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.a = appKey;
        }

        public final LevelPlayInitRequest build() {
            String str = this.a;
            String str2 = this.b;
            List<? extends LevelPlay.AdFormat> listEmptyList = this.c;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new LevelPlayInitRequest(str, str2, listEmptyList, null);
        }

        public final String getAppKey() {
            return this.a;
        }

        @Deprecated(message = "This method is deprecated and will be removed in version 9.0.0.")
        public final Builder withLegacyAdFormats(List<? extends LevelPlay.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.c = legacyAdFormats;
            return this;
        }

        public final Builder withUserId(String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.b = userId;
            return this;
        }
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list);
    }

    public final String getAppKey() {
        return this.a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    public final String getUserId() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
