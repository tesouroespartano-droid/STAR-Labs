.class public final enum Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;
.super Ljava/lang/Enum;
.source "UnityAdsPrivacy.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "NOT_SET",
        "TRUE",
        "FALSE",
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


# static fields
.field private static final synthetic $VALUES:[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

.field public static final enum FALSE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

.field public static final enum NOT_SET:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

.field public static final enum TRUE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;
    .locals 3

    sget-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->NOT_SET:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    sget-object v1, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->TRUE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    sget-object v2, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->FALSE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    filled-new-array {v0, v1, v2}, [Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    const-string v1, "NOT_SET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->NOT_SET:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    .line 12
    new-instance v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    const-string v1, "TRUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->TRUE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    .line 13
    new-instance v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    const-string v1, "FALSE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->FALSE:Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    invoke-static {}, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->$values()[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    move-result-object v0

    sput-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->$VALUES:[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;
    .locals 1

    const-class v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    return-object p0
.end method

.method public static values()[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;
    .locals 1

    sget-object v0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->$VALUES:[Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;->value:I

    return v0
.end method
