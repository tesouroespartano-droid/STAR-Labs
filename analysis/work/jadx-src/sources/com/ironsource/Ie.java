package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum Ie {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final Ie a(int i) {
            for (Ie ie : Ie.values()) {
                if (ie.a == i) {
                    if (ie == null) {
                        return Ie.CurrentlyLoadedAds;
                    }
                    return ie;
                }
            }
            ie = null;
            if (ie == null) {
                return Ie.CurrentlyLoadedAds;
            }
            return ie;
        }

        private a() {
        }
    }

    Ie(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
