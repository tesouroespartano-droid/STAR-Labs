.class public final Lcom/ironsource/Q1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/B3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Q1;->b(Lcom/ironsource/Q1$d;)Lcom/ironsource/B3$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Q1;

.field final synthetic b:Lcom/ironsource/Q1$d;


# direct methods
.method public static synthetic $r8$lambda$1koLCfrhB_-9ko_kSm5ofc9Kigw(Lcom/ironsource/Q1;Ljava/lang/String;Lcom/ironsource/Q1$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/Q1$c;->a(Lcom/ironsource/Q1;Ljava/lang/String;Lcom/ironsource/Q1$d;)V

    return-void
.end method

.method public static synthetic $r8$lambda$i5tD9egVhqjMrhl2m-hILVpxu9Y(Lcom/ironsource/Q1;JLjava/util/List;Ljava/util/List;Lcom/ironsource/Q1$d;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ironsource/Q1$c;->a(Lcom/ironsource/Q1;JLjava/util/List;Ljava/util/List;Lcom/ironsource/Q1$d;)V

    return-void
.end method

.method constructor <init>(Lcom/ironsource/Q1;Lcom/ironsource/Q1$d;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Q1$c;->a:Lcom/ironsource/Q1;

    iput-object p2, p0, Lcom/ironsource/Q1$c;->b:Lcom/ironsource/Q1$d;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Lcom/ironsource/Q1;JLjava/util/List;Ljava/util/List;Lcom/ironsource/Q1$d;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$biddingDataList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$reachedTimeout"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$biddingDataListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static/range {p0 .. p5}, Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1;JLjava/util/List;Ljava/util/List;Lcom/ironsource/Q1$d;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/Q1;Ljava/lang/String;Lcom/ironsource/Q1$d;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$biddingDataListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1;)Lcom/ironsource/V0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->g()Lcom/ironsource/Nf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/Nf;->a(Ljava/lang/String;)V

    .line 4
    invoke-interface {p2, p0, p1}, Lcom/ironsource/Q1$d;->a(Lcom/ironsource/Q1;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;JLjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ironsource/C3;",
            ">;J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "biddingDataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reachedTimeout"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q1$c;->a:Lcom/ironsource/Q1;

    invoke-static {v0}, Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1;)Lcom/ironsource/V0;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/Q1$c;->a:Lcom/ironsource/Q1;

    iget-object v7, p0, Lcom/ironsource/Q1$c;->b:Lcom/ironsource/Q1$d;

    new-instance v1, Lcom/ironsource/Q1$c$$ExternalSyntheticLambda0;

    move-object v5, p1

    move-wide v3, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/ironsource/Q1$c$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/Q1;JLjava/util/List;Ljava/util/List;Lcom/ironsource/Q1$d;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/jb;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q1$c;->a:Lcom/ironsource/Q1;

    invoke-static {v0}, Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1;)Lcom/ironsource/V0;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/Q1$c;->a:Lcom/ironsource/Q1;

    iget-object v2, p0, Lcom/ironsource/Q1$c;->b:Lcom/ironsource/Q1$d;

    new-instance v3, Lcom/ironsource/Q1$c$$ExternalSyntheticLambda1;

    invoke-direct {v3, v1, p1, v2}, Lcom/ironsource/Q1$c$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/Q1;Ljava/lang/String;Lcom/ironsource/Q1$d;)V

    invoke-virtual {v0, v3}, Lcom/ironsource/jb;->a(Ljava/lang/Runnable;)V

    return-void
.end method
