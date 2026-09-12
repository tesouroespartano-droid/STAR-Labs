package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes2.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f37;

    ISAdQualityLogLevel(int i) {
        this.f37 = i;
    }

    public final int getValue() {
        return this.f37;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f37;
        return i != NONE.f37 && i >= iSAdQualityLogLevel.f37;
    }

    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }
}
