.class final Lcom/ironsource/adqualitysdk/sdk/i/jt$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jt;->ﻐ(Landroid/webkit/WebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻛ:Landroid/webkit/WebView;

.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jt;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jt;Landroid/webkit/WebView;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jt;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3;->ﻛ:Landroid/webkit/WebView;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jt;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/jt;->ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/jt;)Ljava/lang/String;

    move-result-object v0

    .line 46
    new-instance v1, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;

    invoke-direct {v1, p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/jt$3;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void
.end method
