.class public Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;
.super Ljava/lang/Object;
.source "BacktraceAndroidBackgroundUnhandledExceptionHandler.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceAndroidBackgroundUnhandledExceptionHandler"


# instance fields
.field private final _gameObject:Ljava/lang/String;

.field private _lastCaughtBackgroundException:Ljava/lang/Throwable;

.field private _lastCaughtBackgroundExceptionThread:Ljava/lang/Thread;

.field private final _methodName:Ljava/lang/String;

.field private final mRootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private volatile shouldStop:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->shouldStop:Z

    .line 35
    sget-object v0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Initializing Android unhandled exception handler"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    iput-object p1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_gameObject:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_methodName:Ljava/lang/String;

    .line 38
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->mRootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 39
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method private static printStackTrace([Ljava/lang/StackTraceElement;Ljava/io/PrintWriter;)V
    .locals 3

    .line 68
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 69
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static stackTraceToString([Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 63
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-static {p0, v1}, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->printStackTrace([Ljava/lang/StackTraceElement;Ljava/io/PrintWriter;)V

    .line 64
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ReportThreadException(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 57
    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_gameObject:Ljava/lang/String;

    iget-object v1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_methodName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/16 v2, 0xa

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/unity3d/player/UnityPlayer;->UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    sget-object p1, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "UnitySendMessageFinished. passing an exception object. Game object: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_gameObject:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " method name: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_methodName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public finish()V
    .locals 3

    .line 74
    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundExceptionThread:Ljava/lang/Thread;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundException:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    iget-boolean v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->shouldStop:Z

    if-eqz v0, :cond_1

    .line 79
    sget-object v0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Backtrace client has been disposed. The report won\'t be available."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 82
    :cond_1
    iget-object v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->mRootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    iget-object v1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundExceptionThread:Ljava/lang/Thread;

    iget-object v2, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundException:Ljava/lang/Throwable;

    invoke-interface {v0, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void

    .line 75
    :cond_2
    :goto_0
    sget-object v0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "The exception object or the exception thread is not available. This is probably a bug."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public stopMonitoring()V
    .locals 2

    .line 87
    sget-object v0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Uncaught exception handler has been disabled."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->shouldStop:Z

    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .line 44
    iput-object p1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundExceptionThread:Ljava/lang/Thread;

    .line 45
    iput-object p2, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->_lastCaughtBackgroundException:Ljava/lang/Throwable;

    .line 46
    iget-boolean p1, p0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->shouldStop:Z

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 47
    sget-object p1, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Background exception handler is disabled."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    invoke-virtual {p0}, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->finish()V

    return-void

    .line 51
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 52
    sget-object v0, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Detected unhandled background thread exception. Exception type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Reporting to Backtrace"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p2

    invoke-static {p2}, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->stackTraceToString([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbacktraceio/unity/BacktraceAndroidBackgroundUnhandledExceptionHandler;->ReportThreadException(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
