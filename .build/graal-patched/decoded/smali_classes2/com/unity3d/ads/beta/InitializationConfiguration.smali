.class public final Lcom/unity3d/ads/beta/InitializationConfiguration;
.super Ljava/lang/Object;
.source "InitializationConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/unity3d/ads/beta/InitializationConfiguration;",
        "",
        "context",
        "Landroid/content/Context;",
        "gameID",
        "",
        "isTestModeEnabled",
        "",
        "logLevel",
        "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;",
        "extras",
        "",
        "mediationInfo",
        "Lcom/unity3d/ads/beta/MediationInfo;",
        "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V",
        "getContext",
        "()Landroid/content/Context;",
        "getExtras",
        "()Ljava/util/Map;",
        "getGameID",
        "()Ljava/lang/String;",
        "()Z",
        "getLogLevel",
        "()Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;",
        "getMediationInfo",
        "()Lcom/unity3d/ads/beta/MediationInfo;",
        "Builder",
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

.field private final extras:Ljava/util/Map;
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

.field private final logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

.field private final mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/unity3d/ads/beta/MediationInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logLevel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->context:Landroid/content/Context;

    .line 9
    iput-object p2, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->gameID:Ljava/lang/String;

    .line 10
    iput-boolean p3, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->isTestModeEnabled:Z

    .line 11
    iput-object p4, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    .line 12
    iput-object p5, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->extras:Ljava/util/Map;

    .line 13
    iput-object p6, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 11
    sget-object p4, Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;->INFO:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    .line 12
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p5

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    const/4 p6, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v6, p6

    .line 7
    invoke-direct/range {v0 .. v6}, Lcom/unity3d/ads/beta/InitializationConfiguration;-><init>(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->extras:Ljava/util/Map;

    return-object v0
.end method

.method public final getGameID()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->gameID:Ljava/lang/String;

    return-object v0
.end method

.method public final getLogLevel()Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->logLevel:Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;

    return-object v0
.end method

.method public final getMediationInfo()Lcom/unity3d/ads/beta/MediationInfo;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->mediationInfo:Lcom/unity3d/ads/beta/MediationInfo;

    return-object v0
.end method

.method public final isTestModeEnabled()Z
    .locals 1

    .line 10
    iget-boolean v0, p0, Lcom/unity3d/ads/beta/InitializationConfiguration;->isTestModeEnabled:Z

    return v0
.end method
