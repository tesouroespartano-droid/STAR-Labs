.class final Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﾒ(Landroid/webkit/WebView;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

.field private synthetic ｋ:Z

.field private synthetic ﾇ:Ljava/lang/String;

.field private synthetic ﾒ:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/ac$1;Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾒ:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾇ:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ｋ:Z

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 4

    .line 161
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ｋ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac;

    invoke-static {v0}, Lcom/ironsource/adqualitysdk/sdk/i/ac;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 166
    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾇ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 167
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾒ:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾇ:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ｋ:Z

    invoke-static {v0, v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac$1;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void

    .line 163
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﻛ:Lcom/ironsource/adqualitysdk/sdk/i/ac$1;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾒ:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ﾇ:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/ironsource/adqualitysdk/sdk/i/ac$1$5;->ｋ:Z

    invoke-static {v0, v1, v2, v3}, Lcom/ironsource/adqualitysdk/sdk/i/ac$1;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/ac$1;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method
