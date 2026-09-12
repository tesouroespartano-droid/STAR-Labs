.class abstract Lcom/ironsource/adqualitysdk/sdk/i/cm$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/cm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field private ｋ:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/cm$a;->ｋ:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method abstract ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hr;)Z
.end method

.method final ﾒ()Ljava/lang/Class;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/cm$a;->ｋ:Ljava/lang/Class;

    return-object v0
.end method
