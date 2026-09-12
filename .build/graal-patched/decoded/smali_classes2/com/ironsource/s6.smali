.class public final Lcom/ironsource/s6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/l6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/s6$a;,
        Lcom/ironsource/s6$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/Ab;

.field private final b:Lcom/ironsource/V0;

.field private final c:Lcom/ironsource/v0;

.field private d:Lcom/ironsource/v6;

.field private final e:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/ironsource/A;",
            "Lcom/ironsource/G;",
            "Lcom/ironsource/l6;",
            "Lcom/ironsource/k6;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/ironsource/if;

.field private final g:Lcom/ironsource/s4;

.field private h:Lcom/ironsource/s6$b;

.field private i:Lcom/ironsource/s6$a;

.field private final j:Lcom/ironsource/mg;

.field private k:Lcom/ironsource/if$a;

.field private l:Ljava/lang/Long;


# direct methods
.method public static synthetic $r8$lambda$IruS2xMUqDkT1Fa0ejqism_HKUo(Lcom/ironsource/s6;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/s6;->h(Lcom/ironsource/s6;)V

    return-void
.end method

.method public static synthetic $r8$lambda$aUcq5e_kByyDF2dZXeutTiUYfyU(Lcom/ironsource/s6;Lcom/ironsource/A;Lcom/ironsource/G;)Lcom/ironsource/z;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/s6;->a(Lcom/ironsource/s6;Lcom/ironsource/A;Lcom/ironsource/G;)Lcom/ironsource/z;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/ironsource/Ab;Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/v6;Lcom/ironsource/ng;Lkotlin/jvm/functions/Function3;Lcom/ironsource/if;Lcom/ironsource/s4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/Ab;",
            "Lcom/ironsource/V0;",
            "Lcom/ironsource/v0;",
            "Lcom/ironsource/v6;",
            "Lcom/ironsource/ng;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/ironsource/A;",
            "-",
            "Lcom/ironsource/G;",
            "-",
            "Lcom/ironsource/l6;",
            "Lcom/ironsource/k6;",
            ">;",
            "Lcom/ironsource/if;",
            "Lcom/ironsource/s4;",
            ")V"
        }
    .end annotation

    const-string v0, "mediationServices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitTools"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fullscreenListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskScheduler"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTimeProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    .line 3
    iput-object p2, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    .line 4
    iput-object p3, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    .line 5
    iput-object p4, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    .line 7
    iput-object p6, p0, Lcom/ironsource/s6;->e:Lkotlin/jvm/functions/Function3;

    .line 8
    iput-object p7, p0, Lcom/ironsource/s6;->f:Lcom/ironsource/if;

    .line 10
    iput-object p8, p0, Lcom/ironsource/s6;->g:Lcom/ironsource/s4;

    .line 14
    invoke-direct {p0, p5}, Lcom/ironsource/s6;->a(Lcom/ironsource/ng;)Lcom/ironsource/mg;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/Ab;Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/v6;Lcom/ironsource/ng;Lkotlin/jvm/functions/Function3;Lcom/ironsource/if;Lcom/ironsource/s4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_2

    .line 15
    new-instance p7, Lcom/ironsource/V6;

    invoke-virtual {p2}, Lcom/ironsource/jb;->a()Landroid/os/Handler;

    move-result-object p10

    invoke-static {p10}, Lcom/ironsource/W6;->a(Landroid/os/Handler;)Lcom/ironsource/V6$a;

    move-result-object p10

    invoke-direct {p7, p10}, Lcom/ironsource/V6;-><init>(Lcom/ironsource/V6$a;)V

    :cond_2
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_3

    .line 16
    new-instance p8, Lcom/ironsource/s4$a;

    invoke-direct {p8}, Lcom/ironsource/s4$a;-><init>()V

    :cond_3
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 17
    invoke-direct/range {p1 .. p9}, Lcom/ironsource/s6;-><init>(Lcom/ironsource/Ab;Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/v6;Lcom/ironsource/ng;Lkotlin/jvm/functions/Function3;Lcom/ironsource/if;Lcom/ironsource/s4;)V

    return-void
.end method

.method private final a(Lcom/ironsource/A;Lcom/ironsource/G;Lcom/ironsource/l6;)Lcom/ironsource/k6;
    .locals 4

    .line 37
    new-instance v0, Lcom/ironsource/k6;

    .line 38
    new-instance v1, Lcom/ironsource/V0;

    iget-object v2, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    sget-object v3, Lcom/ironsource/D0$b;->b:Lcom/ironsource/D0$b;

    invoke-direct {v1, v2, v3}, Lcom/ironsource/V0;-><init>(Lcom/ironsource/V0;Lcom/ironsource/D0$b;)V

    .line 39
    invoke-direct {v0, v1, p1, p2, p3}, Lcom/ironsource/k6;-><init>(Lcom/ironsource/V0;Lcom/ironsource/A;Lcom/ironsource/G;Lcom/ironsource/l6;)V

    return-object v0
.end method

.method public static final synthetic a(Lcom/ironsource/s6;Lcom/ironsource/A;Lcom/ironsource/G;Lcom/ironsource/l6;)Lcom/ironsource/k6;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/s6;->a(Lcom/ironsource/A;Lcom/ironsource/G;Lcom/ironsource/l6;)Lcom/ironsource/k6;

    move-result-object p0

    return-object p0
.end method

.method private final a(Lcom/ironsource/ng;)Lcom/ironsource/mg;
    .locals 3

    .line 40
    invoke-direct {p0}, Lcom/ironsource/s6;->a()Lcom/ironsource/tg;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 42
    invoke-interface {p1, v0}, Lcom/ironsource/ng;->a(Lcom/ironsource/tg;)Lcom/ironsource/mg;

    move-result-object p1

    return-object p1

    .line 45
    :cond_0
    new-instance p1, Lcom/ironsource/mg;

    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    iget-object v2, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-direct {p1, v1, v2, v0}, Lcom/ironsource/mg;-><init>(Lcom/ironsource/V0;Lcom/ironsource/v0;Lcom/ironsource/tg;)V

    return-object p1
.end method

.method private final a()Lcom/ironsource/tg;
    .locals 1

    .line 46
    new-instance v0, Lcom/ironsource/s6$c;

    invoke-direct {v0, p0}, Lcom/ironsource/s6$c;-><init>(Lcom/ironsource/s6;)V

    return-object v0
.end method

.method public static final synthetic a(Lcom/ironsource/s6;)Lcom/ironsource/v0;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    return-object p0
.end method

.method private static final a(Lcom/ironsource/s6;Lcom/ironsource/A;Lcom/ironsource/G;)Lcom/ironsource/z;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instanceData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adInstancePayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/ironsource/s6;->e:Lkotlin/jvm/functions/Function3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/ironsource/s6$d;

    invoke-direct {v0, p0}, Lcom/ironsource/s6$d;-><init>(Ljava/lang/Object;)V

    .line 18
    :cond_0
    invoke-interface {v0, p1, p2, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ironsource/z;

    return-object p0
.end method

.method public static final synthetic b(Lcom/ironsource/s6;)Lcom/ironsource/V0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    return-object p0
.end method

.method private final b()Lcom/unity3d/mediation/LevelPlay$AdFormat;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/f0;->e()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v0

    return-object v0
.end method

.method private final c()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v0}, Lcom/ironsource/v0;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(Lcom/ironsource/s6;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ironsource/s6;)Lcom/ironsource/s4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/s6;->g:Lcom/ironsource/s4;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ironsource/s6;)Lcom/ironsource/s6$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/s6;->h:Lcom/ironsource/s6$b;

    return-object p0
.end method

.method private final f()Lcom/ironsource/fb;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/ironsource/fb<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    invoke-virtual {v0}, Lcom/ironsource/mg;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/ironsource/fb$a;

    .line 4
    new-instance v1, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    const/16 v2, 0x1fd

    const-string v3, "show called while ad unit is not ready to show"

    invoke-direct {v1, v2, v3}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 5
    invoke-direct {v0, v1}, Lcom/ironsource/fb$a;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    invoke-virtual {v0}, Lcom/ironsource/Ab;->p()Lcom/ironsource/L7;

    move-result-object v0

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/ironsource/s6;->b()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ironsource/L7;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Lcom/ironsource/N3;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/ironsource/N3;->d()Z

    move-result v0

    const-string v1, " is capped"

    if-eqz v0, :cond_1

    .line 14
    new-instance v0, Lcom/ironsource/fb$a;

    .line 15
    new-instance v2, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "placement "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x20c

    invoke-direct {v2, v3, v1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 16
    invoke-direct {v0, v2}, Lcom/ironsource/fb$a;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-object v0

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    invoke-virtual {v0}, Lcom/ironsource/Ab;->f()Lcom/ironsource/r7;

    move-result-object v0

    iget-object v2, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v2}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ironsource/r7;->a(Ljava/lang/String;)Lcom/ironsource/N3;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/ironsource/N3;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 23
    new-instance v0, Lcom/ironsource/fb$a;

    .line 24
    new-instance v2, Lcom/ironsource/mediationsdk/logger/IronSourceError;

    .line 25
    iget-object v3, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v3}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "adUnitId "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x212

    .line 26
    invoke-direct {v2, v3, v1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;-><init>(ILjava/lang/String;)V

    .line 27
    invoke-direct {v0, v2}, Lcom/ironsource/fb$a;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-object v0

    .line 32
    :cond_2
    new-instance v0, Lcom/ironsource/fb$b;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-direct {v0, v1}, Lcom/ironsource/fb$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic f(Lcom/ironsource/s6;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/s6;->l:Ljava/lang/Long;

    return-object p0
.end method

.method private final g()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->k:Lcom/ironsource/if$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/if$a;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-direct {p0}, Lcom/ironsource/s6;->b()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/n0;->b(Lcom/unity3d/mediation/LevelPlay$AdFormat;)J

    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/ironsource/s6;->f:Lcom/ironsource/if;

    new-instance v3, Lcom/ironsource/s6$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/ironsource/s6$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/s6;)V

    .line 10
    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v4, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v4}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    .line 11
    invoke-interface {v2, v3, v0, v1}, Lcom/ironsource/if;->a(Ljava/lang/Runnable;J)Lcom/ironsource/if$a;

    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/ironsource/s6;->k:Lcom/ironsource/if$a;

    return-void
.end method

.method public static final synthetic g(Lcom/ironsource/s6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/s6;->g()V

    return-void
.end method

.method private final h()V
    .locals 3

    .line 3
    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    .line 6
    invoke-virtual {v1}, Lcom/ironsource/Ab;->a()Lcom/ironsource/L7$a;

    move-result-object v1

    .line 7
    invoke-direct {p0}, Lcom/ironsource/s6;->b()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/ironsource/L7$a;->b(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)V

    .line 10
    iget-object v1, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    invoke-virtual {v1}, Lcom/ironsource/Ab;->p()Lcom/ironsource/L7;

    move-result-object v1

    invoke-direct {p0}, Lcom/ironsource/s6;->b()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/ironsource/L7;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;)Lcom/ironsource/N3;

    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lcom/ironsource/N3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 12
    iget-object v2, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {v2}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ironsource/N3;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/ironsource/M;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final h(Lcom/ironsource/s6;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/s6;->h:Lcom/ironsource/s6$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ironsource/s6$b;->a(Lcom/ironsource/s6;)V

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    invoke-virtual {p0}, Lcom/ironsource/mg;->b()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lcom/ironsource/s6$a;)V
    .locals 5

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v1, v3, v3, v2, v3}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 20
    iput-object p2, p0, Lcom/ironsource/s6;->i:Lcom/ironsource/s6$a;

    .line 21
    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {v1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v1

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/ironsource/M;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Lcom/ironsource/s6;->f()Lcom/ironsource/fb;

    move-result-object v1

    .line 24
    instance-of v2, v1, Lcom/ironsource/fb$a;

    if-eqz v2, :cond_0

    .line 25
    check-cast v1, Lcom/ironsource/fb$a;

    invoke-virtual {v1}, Lcom/ironsource/fb$a;->b()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    .line 26
    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v0

    .line 28
    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    .line 29
    const-string v4, ""

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ironsource/M;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-interface {p2, p0, p1}, Lcom/ironsource/s6$a;->a(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void

    .line 35
    :cond_0
    iget-object p2, p0, Lcom/ironsource/s6;->k:Lcom/ironsource/if$a;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/ironsource/if$a;->a()V

    .line 36
    :cond_1
    iget-object p2, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    new-instance v0, Lcom/ironsource/m6;

    invoke-direct {v0, p1}, Lcom/ironsource/m6;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p2, v0}, Lcom/ironsource/mg;->a(Lcom/ironsource/I;)V

    return-void
.end method

.method public a(Lcom/ironsource/k6;)V
    .locals 2

    const-string v0, "fullscreenInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object v0

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/M;->l(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/ironsource/s6;->i:Lcom/ironsource/s6$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ironsource/z;->e()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/ironsource/s6$a;->a(Lcom/ironsource/s6;Lcom/unity3d/mediation/LevelPlayAdInfo;)V

    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/ironsource/s6;->h()V

    .line 50
    iget-object p1, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    .line 51
    invoke-virtual {p1}, Lcom/ironsource/Ab;->l()Lcom/ironsource/r7$a;

    move-result-object p1

    .line 52
    iget-object v0, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ironsource/r7$a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/k6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 4

    const-string v0, "fullscreenInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "error"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    .line 55
    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    .line 56
    const-string v3, ""

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/ironsource/M;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 58
    iget-object p1, p0, Lcom/ironsource/s6;->i:Lcom/ironsource/s6$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lcom/ironsource/s6$a;->a(Lcom/ironsource/s6;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/ironsource/k6;Lcom/unity3d/mediation/rewarded/LevelPlayReward;)V
    .locals 4

    const-string v0, "fullscreenInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reward"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/z;->q()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    invoke-interface {p1, p2}, Lcom/ironsource/v6;->a(Lcom/unity3d/mediation/rewarded/LevelPlayReward;)V

    return-void
.end method

.method public final a(Lcom/ironsource/s6$b;)V
    .locals 4

    const-string v0, "loadListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    iget-object v1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v1, v2, v2, v3, v2}, Lcom/ironsource/n0;->a(Lcom/ironsource/n0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Lcom/ironsource/s6;->h:Lcom/ironsource/s6$b;

    .line 6
    iget-object p1, p0, Lcom/ironsource/s6;->g:Lcom/ironsource/s4;

    invoke-interface {p1}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/s6;->l:Ljava/lang/Long;

    .line 7
    iget-object p1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    .line 8
    new-instance v0, Lcom/ironsource/q0;

    iget-object v1, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/q0;-><init>(Lcom/ironsource/f0;)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/ironsource/V0;->a(Lcom/ironsource/h2;)V

    .line 11
    new-instance p1, Lcom/ironsource/s6$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/ironsource/s6$$ExternalSyntheticLambda1;-><init>(Lcom/ironsource/s6;)V

    .line 15
    iget-object v0, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {v0}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/D5;->e()Lcom/ironsource/nb;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/s6;->c:Lcom/ironsource/v0;

    invoke-virtual {v1}, Lcom/ironsource/v0;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ironsource/nb;->a(Z)V

    .line 16
    iget-object v0, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    invoke-virtual {v0, p1}, Lcom/ironsource/mg;->a(Lcom/ironsource/C;)V

    return-void
.end method

.method public final a(Lcom/ironsource/v6;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    return-void
.end method

.method public a(Lcom/ironsource/z;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object p1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/M;->a(Ljava/lang/String;)V

    .line 62
    iget-object p1, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    invoke-interface {p1}, Lcom/ironsource/J0;->g()V

    return-void
.end method

.method public b(Lcom/ironsource/k6;)V
    .locals 1

    const-string v0, "fullscreenInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/M;->b(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    invoke-interface {p1}, Lcom/ironsource/v6;->onClosed()V

    return-void
.end method

.method public b(Lcom/ironsource/z;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    invoke-virtual {v0, p1}, Lcom/ironsource/mg;->b(Lcom/ironsource/z;)V

    .line 3
    iget-object p1, p0, Lcom/ironsource/s6;->b:Lcom/ironsource/V0;

    invoke-virtual {p1}, Lcom/ironsource/n0;->e()Lcom/ironsource/D5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/D5;->a()Lcom/ironsource/M;

    move-result-object p1

    invoke-direct {p0}, Lcom/ironsource/s6;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/M;->g(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/ironsource/s6;->a:Lcom/ironsource/Ab;

    invoke-virtual {p1}, Lcom/ironsource/Ab;->h()Lcom/ironsource/M8$a;

    move-result-object p1

    invoke-direct {p0}, Lcom/ironsource/s6;->b()Lcom/unity3d/mediation/LevelPlay$AdFormat;

    move-result-object v0

    invoke-static {v0}, Lcom/unity3d/mediation/a;->a(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ironsource/M8$a;->b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    return-void
.end method

.method public final d()Lcom/ironsource/v6;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->d:Lcom/ironsource/v6;

    return-object v0
.end method

.method public final e()Lcom/unity3d/mediation/LevelPlayAdInfo;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/s6;->j:Lcom/ironsource/mg;

    invoke-virtual {v0}, Lcom/ironsource/mg;->c()Lcom/ironsource/z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ironsource/z;->e()Lcom/unity3d/mediation/LevelPlayAdInfo;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
