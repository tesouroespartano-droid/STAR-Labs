.class public final Lcom/ironsource/Ab$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Lcom/ironsource/Ab$b;-><init>()V

    return-void
.end method

.method public static synthetic b()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static synthetic e()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/I7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ab$b;->c()Lcom/ironsource/Ab;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/ironsource/Ab;
    .locals 1

    .line 1
    invoke-static {}, Lcom/ironsource/Ab;->H()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ironsource/Ab;

    return-object v0
.end method

.method public final d()Lcom/ironsource/J7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ab$b;->c()Lcom/ironsource/Ab;

    move-result-object v0

    return-object v0
.end method
