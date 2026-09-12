.class public final Lcom/ironsource/Ta$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Ta;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Ta$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z
    .locals 2

    const-string v0, "placementName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adFormat"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p2}, Lcom/unity3d/mediation/a;->a(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v0

    sget-object v1, Lcom/ironsource/D0$b;->a:Lcom/ironsource/D0$b;

    invoke-static {v0, v1}, Lcom/ironsource/n0$a;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/D0$b;)Lcom/ironsource/n0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/ironsource/n0;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p2

    const-string v0, "SDK is not initialized"

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/ironsource/M;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    return v1

    .line 8
    :cond_0
    sget-object v1, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v1}, Lcom/ironsource/Ab$b;->d()Lcom/ironsource/J7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/J7;->p()Lcom/ironsource/L7;

    move-result-object v1

    .line 9
    invoke-interface {v1, p1, p2}, Lcom/ironsource/L7;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Lcom/ironsource/N3;

    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lcom/ironsource/N3;->d()Z

    move-result v1

    .line 11
    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v0

    .line 12
    invoke-virtual {p2}, Lcom/ironsource/N3;->e()Ljava/lang/String;

    move-result-object p2

    .line 13
    invoke-virtual {v0, p1, p2, v1}, Lcom/ironsource/M;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    return v1
.end method
