.class public final Lcom/ironsource/Ta$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Ta;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/n0;

.field private final b:Lcom/ironsource/h6;

.field private final c:Lcom/ironsource/J7;

.field private final d:Lcom/ironsource/s4;

.field private final e:Lcom/ironsource/x7;

.field private final f:Lcom/ironsource/Ta$b;


# direct methods
.method public constructor <init>(Lcom/ironsource/n0;Lcom/ironsource/h6;Lcom/ironsource/J7;Lcom/ironsource/s4;Lcom/ironsource/x7;Lcom/ironsource/Ta$b;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adControllerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTimeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Ta$c;->a:Lcom/ironsource/n0;

    .line 3
    iput-object p2, p0, Lcom/ironsource/Ta$c;->b:Lcom/ironsource/h6;

    .line 4
    iput-object p3, p0, Lcom/ironsource/Ta$c;->c:Lcom/ironsource/J7;

    .line 5
    iput-object p4, p0, Lcom/ironsource/Ta$c;->d:Lcom/ironsource/s4;

    .line 6
    iput-object p5, p0, Lcom/ironsource/Ta$c;->e:Lcom/ironsource/x7;

    .line 7
    iput-object p6, p0, Lcom/ironsource/Ta$c;->f:Lcom/ironsource/Ta$b;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/h6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->b:Lcom/ironsource/h6;

    return-object v0
.end method

.method public final b()Lcom/ironsource/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->a:Lcom/ironsource/n0;

    return-object v0
.end method

.method public final c()Lcom/ironsource/Ta$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->f:Lcom/ironsource/Ta$b;

    return-object v0
.end method

.method public final d()Lcom/ironsource/s4;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->d:Lcom/ironsource/s4;

    return-object v0
.end method

.method public final e()Lcom/ironsource/x7;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->e:Lcom/ironsource/x7;

    return-object v0
.end method

.method public final f()Lcom/ironsource/J7;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Ta$c;->c:Lcom/ironsource/J7;

    return-object v0
.end method
