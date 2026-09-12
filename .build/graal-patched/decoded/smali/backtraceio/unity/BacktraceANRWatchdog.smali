.class public Lbacktraceio/unity/BacktraceANRWatchdog;
.super Ljava/lang/Thread;
.source "BacktraceANRWatchdog.java"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceANRWatchdog"


# instance fields
.field private gameObjectName:Ljava/lang/String;

.field private final mainThreadHandler:Landroid/os/Handler;

.field private methodName:Ljava/lang/String;

.field private volatile shouldStop:Z

.field private timeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 25
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->mainThreadHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->shouldStop:Z

    .line 54
    sget-object v0, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Initializing ANR watchdog"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    iput-object p2, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->methodName:Ljava/lang/String;

    .line 56
    iput-object p1, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->gameObjectName:Ljava/lang/String;

    .line 57
    iput p3, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->timeout:I

    .line 58
    invoke-virtual {p0}, Lbacktraceio/unity/BacktraceANRWatchdog;->start()V

    return-void
.end method

.method public static printStackTrace([Ljava/lang/StackTraceElement;Ljava/io/PrintWriter;)V
    .locals 3

    .line 117
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 118
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static stackTraceToString([Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 2

    .line 112
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 113
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-static {p0, v1}, Lbacktraceio/unity/BacktraceANRWatchdog;->printStackTrace([Ljava/lang/StackTraceElement;Ljava/io/PrintWriter;)V

    .line 114
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public NotifyUnityAboutANR()V
    .locals 3

    .line 106
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-static {v0}, Lbacktraceio/unity/BacktraceANRWatchdog;->stackTraceToString([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object v0

    .line 107
    sget-object v1, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    iget-object v1, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->gameObjectName:Ljava/lang/String;

    iget-object v2, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->methodName:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/unity3d/player/UnityPlayer;->UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public run()V
    .locals 5

    .line 66
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 71
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 72
    sget-object v2, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Starting ANR watchdog. Anr timeout: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->timeout:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :goto_0
    iget-boolean v2, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->shouldStop:Z

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lbacktraceio/unity/BacktraceANRWatchdog;->isInterrupted()Z

    move-result v2

    if-nez v2, :cond_3

    .line 75
    new-instance v2, Lbacktraceio/unity/BacktraceThreadWatcher;

    invoke-direct {v2, v0, v0}, Lbacktraceio/unity/BacktraceThreadWatcher;-><init>(II)V

    .line 76
    iget-object v3, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->mainThreadHandler:Landroid/os/Handler;

    new-instance v4, Lbacktraceio/unity/BacktraceANRWatchdog$1;

    invoke-direct {v4, p0, v2}, Lbacktraceio/unity/BacktraceANRWatchdog$1;-><init>(Lbacktraceio/unity/BacktraceANRWatchdog;Lbacktraceio/unity/BacktraceThreadWatcher;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    :try_start_0
    iget v3, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->timeout:I

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    invoke-virtual {v2}, Lbacktraceio/unity/BacktraceThreadWatcher;->tickPrivateCounter()V

    .line 90
    invoke-virtual {v2}, Lbacktraceio/unity/BacktraceThreadWatcher;->getCounter()I

    move-result v3

    invoke-virtual {v2}, Lbacktraceio/unity/BacktraceThreadWatcher;->getPrivateCounter()I

    move-result v2

    if-ne v3, v2, :cond_1

    .line 91
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 99
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 100
    sget-object v2, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Detected blocked Java thread. Reporting Java ANR."

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    invoke-virtual {p0}, Lbacktraceio/unity/BacktraceANRWatchdog;->NotifyUnityAboutANR()V

    goto :goto_0

    :catch_0
    move-exception v0

    .line 85
    sget-object v1, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Thread is interrupted"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    return-void

    .line 67
    :cond_4
    :goto_1
    sget-object v0, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Detected a debugger connection. ANR Watchdog is disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public stopMonitoring()V
    .locals 2

    .line 123
    sget-object v0, Lbacktraceio/unity/BacktraceANRWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "ANR handler has been disabled."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 124
    iput-boolean v0, p0, Lbacktraceio/unity/BacktraceANRWatchdog;->shouldStop:Z

    return-void
.end method
