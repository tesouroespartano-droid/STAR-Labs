.class final Lcom/ironsource/adqualitysdk/sdk/i/jd$4;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jd;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ja;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ja;

.field private synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jd;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jd;Lcom/ironsource/adqualitysdk/sdk/i/ja;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jd;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$4;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ja;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 138
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jd;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jd;->ﻛ(Lcom/ironsource/adqualitysdk/sdk/i/jd;)Lcom/ironsource/adqualitysdk/sdk/i/je;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$4;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/jd;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jd$4;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/ja;

    invoke-static {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/jd;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/jd;Lcom/ironsource/adqualitysdk/sdk/i/ja;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/je;->ｋ(Ljava/lang/String;)V

    return-void
.end method
