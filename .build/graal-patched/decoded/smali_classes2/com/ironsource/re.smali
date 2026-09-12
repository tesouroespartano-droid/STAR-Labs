.class public final Lcom/ironsource/re;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/J8;
.implements Lcom/ironsource/J8$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/re$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ironsource/se;

.field private final b:Lcom/ironsource/je;

.field private final c:Lcom/ironsource/s4;

.field private d:I

.field private e:J


# direct methods
.method public constructor <init>(Lcom/ironsource/se;Lcom/ironsource/je;Lcom/ironsource/s4;)V
    .locals 1

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initResponseStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/re;->a:Lcom/ironsource/se;

    .line 3
    iput-object p2, p0, Lcom/ironsource/re;->b:Lcom/ironsource/je;

    .line 4
    iput-object p3, p0, Lcom/ironsource/re;->c:Lcom/ironsource/s4;

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/ironsource/re;->d:I

    const-wide/16 p1, -0x1

    .line 7
    iput-wide p1, p0, Lcom/ironsource/re;->e:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ironsource/se;Lcom/ironsource/je;Lcom/ironsource/s4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    new-instance p2, Lcom/ironsource/ke;

    invoke-direct {p2}, Lcom/ironsource/ke;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 9
    new-instance p3, Lcom/ironsource/s4$a;

    invoke-direct {p3}, Lcom/ironsource/s4$a;-><init>()V

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/re;-><init>(Lcom/ironsource/se;Lcom/ironsource/je;Lcom/ironsource/s4;)V

    return-void
.end method

.method private final a(Landroid/content/Context;Lcom/ironsource/se;)J
    .locals 5

    const-wide/16 v0, -0x1

    .line 3
    invoke-interface {p2, p1, v0, v1}, Lcom/ironsource/be;->a(Landroid/content/Context;J)J

    move-result-wide v2

    .line 10
    iget-object v4, p0, Lcom/ironsource/re;->b:Lcom/ironsource/je;

    invoke-interface {v4, p1}, Lcom/ironsource/je;->a(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/ironsource/re;->c:Lcom/ironsource/s4;

    invoke-interface {v0}, Lcom/ironsource/s4;->a()J

    move-result-wide v0

    .line 13
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "set first session timestamp = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 14
    invoke-interface {p2, p1, v0, v1}, Lcom/ironsource/be;->b(Landroid/content/Context;J)V

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method private final b(Landroid/content/Context;Lcom/ironsource/se;)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p2, p1, v0}, Lcom/ironsource/ue;->b(Landroid/content/Context;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 3
    invoke-interface {p2, p1, v0}, Lcom/ironsource/ue;->a(Landroid/content/Context;I)V

    return v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lcom/ironsource/re;->e:J

    return-wide v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/re;->a:Lcom/ironsource/se;

    invoke-direct {p0, p1, v0}, Lcom/ironsource/re;->b(Landroid/content/Context;Lcom/ironsource/se;)I

    move-result v0

    iput v0, p0, Lcom/ironsource/re;->d:I

    .line 2
    iget-object v0, p0, Lcom/ironsource/re;->a:Lcom/ironsource/se;

    invoke-direct {p0, p1, v0}, Lcom/ironsource/re;->a(Landroid/content/Context;Lcom/ironsource/se;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ironsource/re;->e:J

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 4
    invoke-static {}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getSessionId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getSessionId()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/re;->d:I

    return v0
.end method
