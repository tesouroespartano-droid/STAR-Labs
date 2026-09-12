.class final Lcom/ironsource/adqualitysdk/sdk/i/jb$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/im;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/im;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jb;Lcom/ironsource/adqualitysdk/sdk/i/im;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$5;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/im;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$5;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jb;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jb;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jb;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jb$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/im;

    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
