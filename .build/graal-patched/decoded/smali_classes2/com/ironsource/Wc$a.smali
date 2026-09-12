.class public final Lcom/ironsource/Wc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Wc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/P9;

    invoke-direct {v0}, Lcom/ironsource/P9;-><init>()V

    .line 2
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->b(Landroid/content/Context;)V

    .line 3
    new-instance v0, Lcom/ironsource/Z8;

    invoke-direct {v0}, Lcom/ironsource/Z8;-><init>()V

    invoke-virtual {v0}, Lcom/ironsource/Z8;->a()Lorg/json/JSONObject;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/ironsource/B5;

    sget-object v2, Lcom/ironsource/C5;->N:Lcom/ironsource/C5;

    invoke-direct {v1, v2, v0}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 5
    sget-object v0, Lcom/ironsource/Wc;->P:Lcom/ironsource/Wc;

    invoke-virtual {v0, v1}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    return-void
.end method
