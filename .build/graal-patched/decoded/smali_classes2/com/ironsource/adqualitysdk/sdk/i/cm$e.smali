.class final Lcom/ironsource/adqualitysdk/sdk/i/cm$e;
.super Lcom/ironsource/adqualitysdk/sdk/i/cm$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/cm$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
    .locals 1

    .line 86
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/cm$e;->ﾒ()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﾒ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
