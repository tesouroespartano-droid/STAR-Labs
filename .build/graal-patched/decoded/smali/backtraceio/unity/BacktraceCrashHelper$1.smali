.class Lbacktraceio/unity/BacktraceCrashHelper$1;
.super Ljava/lang/Object;
.source "BacktraceCrashHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/unity/BacktraceCrashHelper;->throwBackgroundJavaException()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/unity/BacktraceCrashHelper;


# direct methods
.method constructor <init>(Lbacktraceio/unity/BacktraceCrashHelper;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lbacktraceio/unity/BacktraceCrashHelper$1;->this$0:Lbacktraceio/unity/BacktraceCrashHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const/16 v0, 0x1e

    const/16 v1, 0x28

    const/16 v2, 0xa

    const/16 v3, 0x14

    .line 20
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    const/4 v1, 0x5

    .line 21
    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BacktraceCrashHelper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
