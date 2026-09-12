.class final Lcom/ironsource/adqualitysdk/sdk/i/jb$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jb;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/im;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/im;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jb;Lcom/ironsource/adqualitysdk/sdk/i/im;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/im;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 100
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$3;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/im;

    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/jb$3$2;

    invoke-direct {v2, p0}, Lcom/ironsource/adqualitysdk/sdk/i/jb$3$2;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/jb$3;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)V

    return-void
.end method
