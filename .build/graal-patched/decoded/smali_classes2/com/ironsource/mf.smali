.class public final Lcom/ironsource/mf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/mf$a;,
        Lcom/ironsource/mf$b;,
        Lcom/ironsource/mf$c;,
        Lcom/ironsource/mf$d;
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/mf$c;

.field private final b:Lcom/ironsource/mf$d;

.field private final c:Lcom/ironsource/mf$b;


# direct methods
.method private constructor <init>(Lcom/ironsource/mf$c;Lcom/ironsource/mf$d;Lcom/ironsource/mf$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/ironsource/mf;->a:Lcom/ironsource/mf$c;

    .line 5
    iput-object p2, p0, Lcom/ironsource/mf;->b:Lcom/ironsource/mf$d;

    .line 6
    iput-object p3, p0, Lcom/ironsource/mf;->c:Lcom/ironsource/mf$b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/mf$c;Lcom/ironsource/mf$d;Lcom/ironsource/mf$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/mf;-><init>(Lcom/ironsource/mf$c;Lcom/ironsource/mf$d;Lcom/ironsource/mf$b;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/mf$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mf;->c:Lcom/ironsource/mf$b;

    return-object v0
.end method

.method public final b()Lcom/ironsource/mf$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mf;->a:Lcom/ironsource/mf$c;

    return-object v0
.end method

.method public final c()Lcom/ironsource/mf$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mf;->b:Lcom/ironsource/mf$d;

    return-object v0
.end method
