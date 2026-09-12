.class final Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/iv$4;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/iv$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ir;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iz;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/iz;Lcom/ironsource/adqualitysdk/sdk/i/ir;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ir;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/iz;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iv$4$5;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/ir;

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/iz;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ir;)V

    return-void
.end method
