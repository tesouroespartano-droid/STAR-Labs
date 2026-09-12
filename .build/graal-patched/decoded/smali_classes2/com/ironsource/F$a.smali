.class public final Lcom/ironsource/F$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/F$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/F$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/v0;Lcom/ironsource/qg;)Lcom/ironsource/F;
    .locals 2

    const-string v0, "adUnitData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waterfallInstances"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/ironsource/v0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ironsource/ug;->b:Lcom/ironsource/ug;

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/ironsource/ug;->a:Lcom/ironsource/ug;

    .line 3
    :goto_0
    sget-object v1, Lcom/ironsource/F$a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 8
    invoke-virtual {p1}, Lcom/ironsource/v0;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Lcom/ironsource/bf;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/bf;-><init>(Lcom/ironsource/v0;Lcom/ironsource/qg;)V

    return-object v0

    .line 10
    :cond_1
    new-instance v0, Lcom/ironsource/J4;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/J4;-><init>(Lcom/ironsource/v0;Lcom/ironsource/qg;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 11
    :cond_3
    new-instance v0, Lcom/ironsource/w3;

    invoke-direct {v0, p1, p2}, Lcom/ironsource/w3;-><init>(Lcom/ironsource/v0;Lcom/ironsource/qg;)V

    return-object v0
.end method
