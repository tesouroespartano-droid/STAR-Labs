.class final Lcom/ironsource/adqualitysdk/sdk/i/jr$2;
.super Landroid/webkit/WebChromeClient;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

.field private ﾒ:Z


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jr;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    const/4 p1, 0x0

    .line 200
    iput-boolean p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﾒ:Z

    return-void
.end method


# virtual methods
.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 0

    .line 204
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    invoke-virtual {p2, p1, p3}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﻐ(Landroid/webkit/WebView;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 210
    iget-boolean p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﾒ:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    .line 211
    iput-boolean p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﾒ:Z

    .line 212
    iget-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jr$2;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/jr;

    invoke-virtual {p2, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jr;->ﾇ(Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method
