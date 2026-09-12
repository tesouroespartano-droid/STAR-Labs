package com.ironsource.mediationsdk.logger;

import com.ironsource.Ya;

/* JADX INFO: loaded from: classes2.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);

    IronSourceLogger.IronSourceTag a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.a = ironSourceTag;
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya(str, 3));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya(str, 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya("", 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.a, new Ya("", 2));
    }
}
