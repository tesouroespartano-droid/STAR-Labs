.class public Lbacktraceio/unity/BacktraceCrashHelper;
.super Ljava/lang/Object;
.source "BacktraceCrashHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static InternalCall()V
    .locals 4

    const/16 v0, 0x1e

    const/16 v1, 0x28

    const/16 v2, 0xa

    const/16 v3, 0x14

    .line 47
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    const/4 v1, 0x5

    .line 48
    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BacktraceCrashHelper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static StartAnr()V
    .locals 2

    .line 27
    const-string v0, "BacktraceCrashHelper"

    const-string v1, "Starting ANR"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    new-instance v1, Lbacktraceio/unity/BacktraceCrashHelper$2;

    invoke-direct {v1}, Lbacktraceio/unity/BacktraceCrashHelper$2;-><init>()V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static ThrowNativeException()V
    .locals 2

    .line 42
    const-string v0, "BacktraceCrashHelper"

    const-string v1, "Trying to throw native exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    invoke-static {}, Lbacktraceio/unity/BacktraceCrashHelper;->InternalCall()V

    return-void
.end method


# virtual methods
.method public throwBackgroundJavaException()V
    .locals 2

    .line 16
    const-string v0, "BacktraceCrashHelper"

    const-string v1, "throwing an unhandled background java exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lbacktraceio/unity/BacktraceCrashHelper$1;

    invoke-direct {v1, p0}, Lbacktraceio/unity/BacktraceCrashHelper$1;-><init>(Lbacktraceio/unity/BacktraceCrashHelper;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 23
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public throwRuntimeException()V
    .locals 2

    .line 11
    const-string v0, "BacktraceCrashHelper"

    const-string v1, "Throwing runtime exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unity-test: Uncaught JVM exception"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
