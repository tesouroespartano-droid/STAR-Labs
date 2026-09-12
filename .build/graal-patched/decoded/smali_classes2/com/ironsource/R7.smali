.class public final Lcom/ironsource/R7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/R7$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ironsource/R7$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/R7$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/R7$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/R7;->a:Lcom/ironsource/R7$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lcom/ironsource/S7;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lcom/ironsource/R7;->a:Lcom/ironsource/R7$a;

    invoke-virtual {v0}, Lcom/ironsource/R7$a;->a()Lcom/ironsource/S7;

    move-result-object v0

    return-object v0
.end method
