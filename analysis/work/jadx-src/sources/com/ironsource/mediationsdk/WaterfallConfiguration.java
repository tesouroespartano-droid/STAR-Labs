package com.ironsource.mediationsdk;

import com.ironsource.C0421q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.unity.androidbridge.AndroidBridgeConstants;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "This class is deprecated and will be removed in version 9.0.0.")
public final class WaterfallConfiguration {
    public static final Companion Companion = new Companion(null);
    private final Double a;
    private final Double b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        @JvmStatic
        public final WaterfallConfiguration empty() {
            return builder().build();
        }

        private Companion() {
        }
    }

    @Deprecated(message = "This class is deprecated and will be removed in version 9.0.0.")
    public static final class WaterfallConfigurationBuilder {
        private Double a;
        private Double b;

        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        public final Double getCeiling$mediationsdk_release() {
            return this.b;
        }

        public final Double getFloor$mediationsdk_release() {
            return this.a;
        }

        public final WaterfallConfigurationBuilder setCeiling(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        public final void setCeiling$mediationsdk_release(Double d) {
            this.b = d;
        }

        public final WaterfallConfigurationBuilder setFloor(double d) {
            this.a = Double.valueOf(d);
            return this;
        }

        public final void setFloor$mediationsdk_release(Double d) {
            this.a = d;
        }
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(waterfallConfigurationBuilder);
    }

    @JvmStatic
    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    @JvmStatic
    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    public final Double getCeiling() {
        return this.b;
    }

    public final Double getFloor() {
        return this.a;
    }

    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AndroidBridgeConstants.WATERFALL_CONFIG_CEILING_KEY, this.b);
            jSONObject.put(AndroidBridgeConstants.WATERFALL_CONFIG_FLOOR_KEY, this.a);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }
}
