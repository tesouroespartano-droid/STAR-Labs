.class public final Lcom/ironsource/F6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/K6;


# instance fields
.field private final a:Lcom/ironsource/E6;

.field private final b:Lcom/ironsource/s6;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/ironsource/E6;Lcom/ironsource/s6;Z)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    .line 3
    iput-object p2, p0, Lcom/ironsource/F6;->b:Lcom/ironsource/s6;

    .line 4
    iput-boolean p3, p0, Lcom/ironsource/F6;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/E6;Lcom/ironsource/s6;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/F6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 7
    iget-boolean v0, p0, Lcom/ironsource/F6;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "ad expired on expired ad"

    goto :goto_0

    :cond_0
    const-string v0, "ad expired before load called"

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v1, v0}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "Show called on expired ad"

    goto :goto_0

    :cond_0
    const-string p1, "Show called before load success"

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->d()Lcom/ironsource/w6;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v2, 0x274

    invoke-direct {v1, v2, p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 4
    invoke-interface {v0, v1}, Lcom/ironsource/w6;->b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 5
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "load failed on expired ad"

    goto :goto_0

    :cond_0
    const-string p1, "load failed before load called"

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "show success on expired ad"

    goto :goto_0

    :cond_0
    const-string p1, "show success before load called"

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 1

    .line 4
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "show failed on expired ad"

    goto :goto_0

    :cond_0
    const-string p1, "show failed before load called"

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "load with better ad on expired ad"

    goto :goto_0

    .line 2
    :cond_0
    const-string p1, "load success with better ad before load success"

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/unity3d/mediation/LevelPlayAdInfo;)V
    .locals 1

    const-string v0, "adInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean p1, p0, Lcom/ironsource/F6;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "load success on expired ad"

    goto :goto_0

    :cond_0
    const-string p1, "load success before load called"

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, p1}, Lcom/ironsource/E6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public loadAd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0}, Lcom/ironsource/E6;->b()Lcom/ironsource/t6;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v1}, Lcom/ironsource/E6;->c()Lcom/ironsource/v6;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/ironsource/t6;->a(ZLcom/ironsource/v6;)Lcom/ironsource/s6;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    new-instance v2, Lcom/ironsource/J6;

    invoke-direct {v2, v1, v0}, Lcom/ironsource/J6;-><init>(Lcom/ironsource/E6;Lcom/ironsource/s6;)V

    invoke-virtual {v1, v2}, Lcom/ironsource/E6;->a(Lcom/ironsource/K6;)V

    .line 3
    iget-object v1, p0, Lcom/ironsource/F6;->a:Lcom/ironsource/E6;

    invoke-virtual {v0, v1}, Lcom/ironsource/s6;->a(Lcom/ironsource/s6$b;)V

    return-void
.end method
