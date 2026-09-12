.class final Lcom/ironsource/adqualitysdk/sdk/i/cm$b;
.super Lcom/ironsource/adqualitysdk/sdk/i/cm$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/cm$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
    .locals 1

    .line 110
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/cm$b;->ﾒ()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﻐ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
