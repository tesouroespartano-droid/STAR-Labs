.class final Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;
.super Ljava/lang/Object;
.source "OkHttp3Client.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/services/core/network/core/OkHttp3Client;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RequestComplete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u001f\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;",
        "",
        "response",
        "Lokhttp3/Response;",
        "body",
        "(Lokhttp3/Response;Ljava/lang/Object;)V",
        "getBody",
        "()Ljava/lang/Object;",
        "getResponse",
        "()Lokhttp3/Response;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final body:Ljava/lang/Object;

.field private final response:Lokhttp3/Response;


# direct methods
.method public constructor <init>(Lokhttp3/Response;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    iput-object p2, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/Response;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 220
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;-><init>(Lokhttp3/Response;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;Lokhttp3/Response;Ljava/lang/Object;ILjava/lang/Object;)Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->copy(Lokhttp3/Response;Ljava/lang/Object;)Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    return-object v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(Lokhttp3/Response;Ljava/lang/Object;)Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;

    invoke-direct {v0, p1, p2}, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;-><init>(Lokhttp3/Response;Ljava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;

    iget-object v1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    iget-object v3, p1, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    iget-object p1, p1, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBody()Ljava/lang/Object;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    return-object v0
.end method

.method public final getResponse()Lokhttp3/Response;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RequestComplete(response="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->response:Lokhttp3/Response;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/unity3d/services/core/network/core/OkHttp3Client$RequestComplete;->body:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
