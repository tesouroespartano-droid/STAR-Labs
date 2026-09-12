.class final Lcom/ironsource/adqualitysdk/sdk/i/cm$c;
.super Lcom/ironsource/adqualitysdk/sdk/i/cm$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 93
    invoke-direct {p0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/cm$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
    .locals 1

    .line 98
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/i/cm$c;->ﾒ()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hr;->ﾒ()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
