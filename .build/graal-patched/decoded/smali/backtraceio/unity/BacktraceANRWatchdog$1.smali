.class Lbacktraceio/unity/BacktraceANRWatchdog$1;
.super Ljava/lang/Object;
.source "BacktraceANRWatchdog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/unity/BacktraceANRWatchdog;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/unity/BacktraceANRWatchdog;

.field final synthetic val$threadWatcher:Lbacktraceio/unity/BacktraceThreadWatcher;


# direct methods
.method constructor <init>(Lbacktraceio/unity/BacktraceANRWatchdog;Lbacktraceio/unity/BacktraceThreadWatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 76
    iput-object p1, p0, Lbacktraceio/unity/BacktraceANRWatchdog$1;->this$0:Lbacktraceio/unity/BacktraceANRWatchdog;

    iput-object p2, p0, Lbacktraceio/unity/BacktraceANRWatchdog$1;->val$threadWatcher:Lbacktraceio/unity/BacktraceThreadWatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 79
    iget-object v0, p0, Lbacktraceio/unity/BacktraceANRWatchdog$1;->val$threadWatcher:Lbacktraceio/unity/BacktraceThreadWatcher;

    invoke-virtual {v0}, Lbacktraceio/unity/BacktraceThreadWatcher;->tickCounter()V

    return-void
.end method
