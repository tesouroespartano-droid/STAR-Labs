.class final Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;
.super Lcom/ironsource/adqualitysdk/sdk/i/iu;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jt$3;->ﻐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jt$3;

.field private synthetic ﾇ:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jt$3;Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jt$3;

    iput-object p2, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;->ﾇ:Ljava/lang/String;

    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/iu;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;->ｋ:Lcom/ironsource/adqualitysdk/sdk/i/jt$3;

    iget-object v0, v0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3;->ﻛ:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jt$3$1;->ﾇ:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ironsource/adqualitysdk/sdk/i/ki;->ｋ(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method
