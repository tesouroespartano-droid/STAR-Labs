.class public final Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;
.super Ljava/lang/Object;
.source "InitializationConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/ads/beta/InitializationConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\u0013\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "gameID",
        "",
        "isTestModeEnabled",
        "",
        "(Landroid/content/Context;Ljava/lang/String;Z)V",
        "extras",
        "",
        "logLevel",
        "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;",
        "mediationInfo",
        "Lcom/unity3d/ads/beta/MediationInfo;",
        "build",
        "Lcom/unity3d/ads/beta/InitializationConfiguration;",
        "withExtras",
        "withLogLevel",
        "withMediationInfo",
        "unity-ads_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private extras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final gameID:Ljava/lang/String;

.field private final isTestModeEnabled:Z

.field private logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

.field private mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->gameID:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->isTestModeEnabled:Z

    .line 16
    sget-object p1, Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;->INFO:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    .line 18
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->extras:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final build()Lcom/unity3d/ads/beta/InitializationConfiguration;
    .locals 7

    .line 36
    new-instance v0, Lcom/unity3d/ads/beta/InitializationConfiguration;

    .line 37
    iget-object v1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->context:Landroid/content/Context;

    .line 38
    iget-object v2, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->gameID:Ljava/lang/String;

    .line 39
    iget-boolean v3, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->isTestModeEnabled:Z

    .line 40
    iget-object v4, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    .line 41
    iget-object v5, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->extras:Ljava/util/Map;

    .line 42
    iget-object v6, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;

    .line 36
    invoke-direct/range {v0 .. v6}, Lcom/unity3d/ads/beta/InitializationConfiguration;-><init>(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V

    return-object v0
.end method

.method public final withExtras(Ljava/util/Map;)Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;"
        }
    .end annotation

    const-string v0, "extras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->extras:Ljava/util/Map;

    return-object p0
.end method

.method public final withLogLevel(Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;)Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;
    .locals 1

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    return-object p0
.end method

.method public final withMediationInfo(Lcom/unity3d/ads/beta/MediationInfo;)Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;->mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;

    return-object p0
.end method
