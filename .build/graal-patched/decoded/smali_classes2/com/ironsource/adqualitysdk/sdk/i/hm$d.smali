.class Lcom/ironsource/adqualitysdk/sdk/i/hm$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/adqualitysdk/sdk/i/hm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

.field private ﻛ:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/hm;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;-><init>()V

    return-void
.end method


# virtual methods
.method public final ﻐ(Lcom/ironsource/adqualitysdk/sdk/i/hp;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    .line 162
    invoke-virtual {p1}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﮐ()I

    move-result p1

    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻛ:I

    return-void
.end method

.method public final ﻛ()Lcom/ironsource/adqualitysdk/sdk/i/hp;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    return-object v0
.end method

.method public ﾒ(Ljava/lang/reflect/Field;)Z
    .locals 3

    .line 170
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 171
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ()I

    move-result v2

    and-int/2addr v0, v2

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ﾒ()I

    move-result v2

    if-ne v0, v2, :cond_4

    .line 172
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    iget-object v2, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/i/ho;->ｋ()I

    move-result v2

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    goto :goto_1

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﺙ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱟ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    .line 182
    :cond_2
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻐ:Lcom/ironsource/adqualitysdk/sdk/i/hp;

    invoke-virtual {v0}, Lcom/ironsource/adqualitysdk/sdk/i/hp;->ﱡ()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_4

    .line 185
    iget p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻛ:I

    const/4 v0, 0x1

    if-nez p1, :cond_3

    return v0

    :cond_3
    sub-int/2addr p1, v0

    .line 188
    iput p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/hm$d;->ﻛ:I

    nop

    :cond_4
    :goto_1
    return v1
.end method
