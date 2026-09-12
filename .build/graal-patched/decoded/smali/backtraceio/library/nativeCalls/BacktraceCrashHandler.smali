.class public Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;
.super Ljava/lang/Object;
.source "BacktraceCrashHandler.java"


# static fields
.field public static final BACKTRACE_CRASH_HANDLER:Ljava/lang/String; = "BACKTRACE_UNITY_CRASH_HANDLER"

.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceCrashHandler"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native handleCrash([Ljava/lang/String;)Z
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1

    .line 16
    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->run([Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method

.method public static run([Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 21
    sget-object p0, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->LOG_TAG:Ljava/lang/String;

    const-string p1, "Cannot capture crash dump. Environment variables are undefined"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 25
    :cond_0
    const-string v1, "BACKTRACE_UNITY_CRASH_HANDLER"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    .line 27
    sget-object p0, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->LOG_TAG:Ljava/lang/String;

    const-string p1, "Cannot capture crash dump. Cannot find %s environment variable"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 30
    :cond_1
    invoke-static {p1}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 32
    invoke-static {p0}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->handleCrash([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 34
    sget-object p1, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, " "

    invoke-static {v1, p0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Cannot capture crash dump. Invocation parameters: %s"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 38
    :cond_2
    sget-object p0, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->LOG_TAG:Ljava/lang/String;

    const-string p1, "Successfully ran crash handler code."

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x1

    return p0
.end method
