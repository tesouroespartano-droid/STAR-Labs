.class public Lcom/ironsource/w9;
.super Lcom/ironsource/n3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ironsource/n3<",
        "Lcom/ironsource/y9;",
        "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdInteractionListener;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/ironsource/J7;Lcom/ironsource/I7;Ljava/util/List;Lcom/ironsource/B9;Ljava/lang/String;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/J7;",
            "Lcom/ironsource/I7;",
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/B9;",
            "Ljava/lang/String;",
            "Lcom/ironsource/fa;",
            "Lcom/ironsource/mediationsdk/IronSourceSegment;",
            ")V"
        }
    .end annotation

    move-object v0, p4

    .line 2
    new-instance p4, Lcom/ironsource/x9;

    invoke-direct {p4, p5, p3, v0}, Lcom/ironsource/x9;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)V

    move-object p3, p2

    move-object p5, p6

    move-object p6, p7

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lcom/ironsource/n3;-><init>(Lcom/ironsource/J7;Lcom/ironsource/I7;Lcom/ironsource/U;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ironsource/B9;Ljava/lang/String;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            ">;",
            "Lcom/ironsource/B9;",
            "Ljava/lang/String;",
            "Lcom/ironsource/fa;",
            "Lcom/ironsource/mediationsdk/IronSourceSegment;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ironsource/x9;

    invoke-direct {v0, p3, p1, p2}, Lcom/ironsource/x9;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/B9;)V

    invoke-direct {p0, v0, p4, p5}, Lcom/ironsource/n3;-><init>(Lcom/ironsource/U;Lcom/ironsource/fa;Lcom/ironsource/mediationsdk/IronSourceSegment;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/s3;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/ironsource/w9;->b(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/y9;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;ILjava/lang/String;Lcom/ironsource/n2;)Lcom/ironsource/y9;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "*",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdInteractionListener;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/ironsource/n2;",
            ")",
            "Lcom/ironsource/y9;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ironsource/l0;

    sget-object v1, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    iget-object v2, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 4
    invoke-virtual {v2}, Lcom/ironsource/U;->o()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/ironsource/p3;->g:Lorg/json/JSONObject;

    iget v6, p0, Lcom/ironsource/p3;->e:I

    iget-object v7, p0, Lcom/ironsource/p3;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/ironsource/p3;->o:Lcom/ironsource/U;

    .line 11
    invoke-virtual {v3}, Lcom/ironsource/U;->n()I

    move-result v9

    move-object v8, p1

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v9}, Lcom/ironsource/l0;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;ILjava/lang/String;Lcom/ironsource/mediationsdk/model/NetworkSettings;I)V

    .line 13
    new-instance p1, Lcom/ironsource/y9;

    move-object v5, p0

    move-object v1, p0

    move-object v3, p2

    move-object v4, p5

    move-object v2, v0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/ironsource/y9;-><init>(Lcom/ironsource/hd;Lcom/ironsource/l0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/n2;Lcom/ironsource/I0;)V

    return-object v0
.end method

.method protected b(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Lorg/json/JSONObject;
    .locals 0

    .line 14
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getInterstitialSettings()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method protected g()Lcom/ironsource/K0;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/F9;

    invoke-direct {v0}, Lcom/ironsource/F9;-><init>()V

    return-object v0
.end method

.method protected l()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "IS"

    return-object v0
.end method

.method protected o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "OPW_IS"

    return-object v0
.end method
