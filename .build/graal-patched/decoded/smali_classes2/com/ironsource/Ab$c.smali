.class final Lcom/ironsource/Ab$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Ab;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/ironsource/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/ironsource/Ab$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/Ab$c;

    invoke-direct {v0}, Lcom/ironsource/Ab$c;-><init>()V

    sput-object v0, Lcom/ironsource/Ab$c;->a:Lcom/ironsource/Ab$c;

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
.method public final a()Lcom/ironsource/r;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/r;

    invoke-direct {v0}, Lcom/ironsource/r;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ironsource/Ab$c;->a()Lcom/ironsource/r;

    move-result-object v0

    return-object v0
.end method
