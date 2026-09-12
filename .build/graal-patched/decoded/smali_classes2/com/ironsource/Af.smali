.class public final Lcom/ironsource/Af;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/rf;


# direct methods
.method public constructor <init>(Lcom/ironsource/rf;)V
    .locals 1

    const-string v0, "javaScriptEvaluator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ironsource/Af;->a:Lcom/ironsource/rf;

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/Af;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/Af;->a(Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method private final a(Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/ironsource/Af;->a:Lcom/ironsource/rf;

    invoke-interface {v0, p1, p2, p3}, Lcom/ironsource/rf;->a(Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V

    return-void
.end method

.method private final b()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoBaseListener;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;)V

    return-void
.end method

.method private final c()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    invoke-virtual {v0}, Lcom/ironsource/zf;->i()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ironsource/Af;->b()V

    .line 3
    invoke-direct {p0}, Lcom/ironsource/Af;->c()V

    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/zf;->a:Lcom/ironsource/zf;

    .line 2
    new-instance v1, Lcom/ironsource/Af$a;

    invoke-direct {v1, p0}, Lcom/ironsource/Af$a;-><init>(Lcom/ironsource/Af;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;)V

    .line 54
    new-instance v1, Lcom/ironsource/Af$b;

    invoke-direct {v1, p0}, Lcom/ironsource/Af$b;-><init>(Lcom/ironsource/Af;)V

    .line 55
    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoBaseListener;)V

    .line 124
    new-instance v1, Lcom/ironsource/Af$c;

    invoke-direct {v1, p0}, Lcom/ironsource/Af$c;-><init>(Lcom/ironsource/Af;)V

    .line 125
    invoke-virtual {v0, v1}, Lcom/ironsource/zf;->a(Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;)V

    return-void
.end method
