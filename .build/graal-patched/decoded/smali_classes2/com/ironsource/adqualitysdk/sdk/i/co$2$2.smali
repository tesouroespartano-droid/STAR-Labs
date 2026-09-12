.class final Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/co$2;->ﾒ(Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Ljava/lang/String;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co$2;

.field private synthetic ﾒ:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/co$2;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 1010
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co$2;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﻐ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﾒ:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 4

    .line 1013
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/co$2;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/co$2;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﻐ:Ljava/lang/String;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$2$2;->ﾒ:Landroid/app/Activity;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v3, v2}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/lang/String;ZZLjava/util/List;)V

    return-void
.end method
