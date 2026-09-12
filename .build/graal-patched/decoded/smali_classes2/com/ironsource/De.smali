.class public final Lcom/ironsource/De;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/De$a;
    }
.end annotation


# instance fields
.field private a:Lcom/ironsource/c6;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/l7;)V
    .locals 2

    const-string v0, "applicationLifecycleService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/ironsource/De$a;

    invoke-direct {v0, p0}, Lcom/ironsource/De$a;-><init>(Lcom/ironsource/De;)V

    .line 2
    new-instance v1, Lcom/ironsource/c6;

    invoke-direct {v1, p1, v0}, Lcom/ironsource/c6;-><init>(Lcom/ironsource/l7;Lcom/ironsource/Ce;)V

    iput-object v1, p0, Lcom/ironsource/De;->a:Lcom/ironsource/c6;

    return-void
.end method
