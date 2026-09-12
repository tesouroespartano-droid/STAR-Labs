.class final Lcom/google/android/play/core/integrity/bb;
.super Ljava/lang/Object;
.source "com.google.android.play:integrity@@1.6.0"


# static fields
.field private static a:Lcom/google/android/play/core/integrity/ac;


# direct methods
.method static declared-synchronized a(Landroid/content/Context;Z)Lcom/google/android/play/core/integrity/ac;
    .locals 2

    const-class p1, Lcom/google/android/play/core/integrity/bb;

    monitor-enter p1

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/play/core/integrity/bb;->a:Lcom/google/android/play/core/integrity/ac;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/play/core/integrity/ab;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/play/core/integrity/ab;-><init>(Lcom/google/android/play/core/integrity/ad;)V

    invoke-static {p0}, Lcom/google/android/play/integrity/internal/ag;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 2
    invoke-virtual {v0, p0}, Lcom/google/android/play/core/integrity/ab;->a(Landroid/content/Context;)Lcom/google/android/play/core/integrity/ab;

    .line 3
    invoke-interface {v0}, Lcom/google/android/play/core/integrity/ba;->b()Lcom/google/android/play/core/integrity/ac;

    move-result-object p0

    sput-object p0, Lcom/google/android/play/core/integrity/bb;->a:Lcom/google/android/play/core/integrity/ac;

    :cond_0
    sget-object p0, Lcom/google/android/play/core/integrity/bb;->a:Lcom/google/android/play/core/integrity/ac;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
