.class Lcom/quattroplay/integrity/IntegrityBridge$1;
.super Ljava/lang/Object;
.source "IntegrityBridge.java"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/quattroplay/integrity/IntegrityBridge;->requestIntegrityToken(Landroid/app/Activity;Ljava/lang/String;Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnCompleteListener<",
        "Lcom/google/android/play/core/integrity/IntegrityTokenResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$callback:Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;


# direct methods
.method constructor <init>(Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lcom/quattroplay/integrity/IntegrityBridge$1;->val$callback:Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/play/core/integrity/IntegrityTokenResponse;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Integrity error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IntegrityBridge"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    iget-object p1, p0, Lcom/quattroplay/integrity/IntegrityBridge$1;->val$callback:Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;->onIntegrityResult(Ljava/lang/String;)V

    return-void

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;

    .line 41
    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    move-result-object p1

    .line 43
    iget-object v0, p0, Lcom/quattroplay/integrity/IntegrityBridge$1;->val$callback:Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;

    invoke-interface {v0, p1}, Lcom/quattroplay/integrity/IntegrityBridge$IntegrityCallback;->onIntegrityResult(Ljava/lang/String;)V

    return-void
.end method
