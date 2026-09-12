.class final Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/i/is;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw$4;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/io;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/iw$4;Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw$4;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/io;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﾒ()V
    .locals 3

    .line 182
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw$4;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iw;)Lcom/ironsource/adqualitysdk/sdk/i/iv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/iv;->ｋ()Lcom/ironsource/adqualitysdk/sdk/i/ix;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ironsource/adqualitysdk/sdk/i/ix;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/is;)V

    .line 183
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw$4;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/iw;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/jc;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/iw$4$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/io;

    invoke-static {v0, v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/iw;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iw;Lcom/ironsource/adqualitysdk/sdk/i/jc;Lcom/ironsource/adqualitysdk/sdk/i/io;)V

    return-void
.end method
