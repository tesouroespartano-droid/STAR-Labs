.class final Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻐ(Landroid/webkit/WebView;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ﻐ:Ljava/lang/String;

.field final synthetic ﻛ:Z

.field final synthetic ｋ:Landroid/webkit/WebView;

.field final synthetic ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ac$1;Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ｋ:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﻐ:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﻛ:Z

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 3

    .line 186
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ｋ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    .line 187
    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ﾒ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v1, v1, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;->ｋ:Landroid/webkit/WebView;

    invoke-virtual {v1, v2}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾒ(Landroid/webkit/WebView;)Ljava/lang/Object;

    move-result-object v1

    .line 189
    new-instance v2, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;

    invoke-direct {v2, p0, v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3$5;-><init>(Lcom/ironsource/adqualitysdk/sdk/i/ac$1$3;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/ironsource/adqualitysdk/sdk/i/p;->ﾒ(Lcom/ironsource/adqualitysdk/sdk/i/iu;)V

    return-void
.end method
