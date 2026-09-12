.class public final Lcom/ironsource/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/Re;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/ironsource/U7;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ironsource/Re;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/U7;Ljava/lang/String;)V
    .locals 1

    const-string v0, "recordType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "advertiserBundleId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInstanceId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInstanceId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/E0;->a:Lcom/ironsource/Re;

    .line 3
    iput-object p2, p0, Lcom/ironsource/E0;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/ironsource/E0;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/ironsource/E0;->d:Lcom/ironsource/U7;

    .line 6
    iput-object p5, p0, Lcom/ironsource/E0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/zb;)Lcom/ironsource/gc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/zb<",
            "Lcom/ironsource/E0;",
            "Lcom/ironsource/gc;",
            ">;)",
            "Lcom/ironsource/gc;"
        }
    .end annotation

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1, p0}, Lcom/ironsource/zb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ironsource/gc;

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/E0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/ironsource/U7;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/E0;->d:Lcom/ironsource/U7;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/E0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/E0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lcom/ironsource/Re;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/E0;->a:Lcom/ironsource/Re;

    return-object v0
.end method
