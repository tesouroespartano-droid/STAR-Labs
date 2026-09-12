.class public final Lcom/ironsource/adqualitysdk/sdk/i/jc$d;
.super Lcom/ironsource/adqualitysdk/sdk/i/jc$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final ﻐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 112
    invoke-direct {p0, p1, p2}, Lcom/ironsource/adqualitysdk/sdk/i/jc$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iput-object p3, p0, Lcom/ironsource/adqualitysdk/sdk/i/jc$d;->ﻐ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ﻐ()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jc$d;->ﻐ:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/ironsource/adqualitysdk/sdk/i/jc$d;->ﻛ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
