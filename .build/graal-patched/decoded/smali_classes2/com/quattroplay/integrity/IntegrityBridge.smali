.class public Lcom/quattroplay/integrity/IntegrityBridge;
.super Ljava/lang/Object;
.source "IntegrityBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "IntegrityBridge"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static requestIntegrityToken(Landroid/app/Activity;Ljava/lang/String;Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;)V
    .locals 1

    .line 20
    invoke-static {p0}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;

    move-result-object p0

    .line 23
    invoke-static {}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;

    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;->setNonce(Ljava/lang/String;)Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    move-result-object p1

    .line 28
    invoke-interface {p0, p1}, Lcom/google/android/play/core/integrity/IntegrityManager;->requestIntegrityToken(Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, Lcom/quattroplay/integrity/IntegrityBridge$1;

    invoke-direct {p1, p2}, Lcom/quattroplay/integrity/IntegrityBridge$1;-><init>(Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;)V

    .line 29
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
