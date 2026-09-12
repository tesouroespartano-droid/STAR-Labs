.class final Lcom/ironsource/adqualitysdk/sdk/i/co$10;
.super Lcom/ironsource/adqualitysdk/sdk/i/il;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/co;->ｋ(Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Ljava/lang/String;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

.field private synthetic ﾇ:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1061
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ﻐ:Ljava/lang/String;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ﾇ:Ljava/util/List;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/il;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 5

    .line 1064
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/co;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ﻐ:Ljava/lang/String;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/co$10;->ﾇ:Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/co;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/co;Ljava/lang/String;ZZLjava/util/List;)V

    return-void
.end method
