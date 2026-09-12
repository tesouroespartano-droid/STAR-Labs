.class final Lcom/ironsource/adqualitysdk/sdk/i/jd$1$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jd$1;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:I

.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jd$1;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jd$1;I)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$1$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jd$1;

    iput p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$1$3;->ﻛ:I

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$1$3;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jd$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/jd$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jd$d;

    iget v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$1$3;->ﻛ:I

    invoke-interface {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/jd$d;->ﾇ(I)V

    return-void
.end method
