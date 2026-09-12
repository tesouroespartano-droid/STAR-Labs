package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f24;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f25;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ISAdQualityAdType f26;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final double f27;

    /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f25 = iSAdQualityMediationNetwork;
        this.f26 = iSAdQualityAdType;
        this.f27 = d;
        this.f24 = str;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f25;
    }

    public ISAdQualityAdType getAdType() {
        return this.f26;
    }

    public double getRevenue() {
        return this.f27;
    }

    public String getPlacement() {
        return this.f24;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f28 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityAdType f29 = ISAdQualityAdType.UNKNOWN;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private double f30;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f31;

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f28 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f29 = iSAdQualityAdType;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f30 = d;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f31 = str;
            return this;
        }

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f28, this.f29, this.f30, this.f31, (byte) 0);
        }
    }
}
