.class final Lcom/ironsource/Ab$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/ironsource/Ab;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/ironsource/Ab$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/Ab$a;

    invoke-direct {v0}, Lcom/ironsource/Ab$a;-><init>()V

    sput-object v0, Lcom/ironsource/Ab$a;->a:Lcom/ironsource/Ab$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/Ab;
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/Ab;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/Ab;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ab$a;->a()Lcom/ironsource/Ab;

    move-result-object v0

    return-object v0
.end method
