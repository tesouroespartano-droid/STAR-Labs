.class final Lcom/ironsource/adqualitysdk/sdk/i/at$4$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/at$4;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$4;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/at$4;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$4$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$4;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/at$4$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/at$4;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/at$4;->ﾇ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
