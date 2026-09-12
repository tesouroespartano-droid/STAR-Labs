.class public final Lcom/ironsource/B8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/F8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/B8$a;
    }
.end annotation


# static fields
.field public static final j:Lcom/ironsource/B8$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ironsource/Jb;

.field private final c:Lcom/ironsource/t8;

.field private d:Lcom/ironsource/D8;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Long;

.field private h:Lcom/ironsource/F8$a;

.field private i:Lcom/ironsource/G8;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ironsource/B8$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/B8$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/B8;->j:Lcom/ironsource/B8$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ironsource/Jb;Lcom/ironsource/t8;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controller"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ironsource/B8;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/ironsource/B8;->b:Lcom/ironsource/Jb;

    .line 5
    iput-object p3, p0, Lcom/ironsource/B8;->c:Lcom/ironsource/t8;

    .line 31
    invoke-direct {p0}, Lcom/ironsource/B8;->f()Lcom/ironsource/B8$b;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ironsource/Jb;->a(Lcom/ironsource/Jb$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/ironsource/Jb;Lcom/ironsource/t8;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 32
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p4, "randomUUID().toString()"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/B8;-><init>(Ljava/lang/String;Lcom/ironsource/Jb;Lcom/ironsource/t8;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/B8;)Lcom/ironsource/s8;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ironsource/B8;->d()Lcom/ironsource/s8;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic a(Lcom/ironsource/B8;Lcom/ironsource/D8;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ironsource/B8;->d:Lcom/ironsource/D8;

    return-void
.end method

.method public static final synthetic b(Lcom/ironsource/B8;)Lcom/ironsource/Jb;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/B8;->b:Lcom/ironsource/Jb;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ironsource/B8;)Lcom/ironsource/t8;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ironsource/B8;->c:Lcom/ironsource/t8;

    return-object p0
.end method

.method private final d()Lcom/ironsource/s8;
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/s8;

    invoke-direct {v0}, Lcom/ironsource/s8;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/ironsource/B8;->f:Ljava/lang/String;

    const-string v2, "isbiddinginstance"

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ironsource/B8;->e:Ljava/lang/String;

    const-string v2, "demandsourcename"

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/ironsource/q8$e;->d:Lcom/ironsource/q8$e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "producttype"

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/ironsource/B8;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "custom_c"

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/s8;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/ironsource/s8;

    move-result-object v0

    const-string v1, "ISNEventParams()\n       \u2026CUSTOM_C, loadDuration())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final e()Lcom/ironsource/B8;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lcom/ironsource/B8;->j:Lcom/ironsource/B8$a;

    invoke-virtual {v0}, Lcom/ironsource/B8$a;->a()Lcom/ironsource/B8;

    move-result-object v0

    return-object v0
.end method

.method private final f()Lcom/ironsource/B8$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/B8$b;

    invoke-direct {v0, p0}, Lcom/ironsource/B8$b;-><init>(Lcom/ironsource/B8;)V

    return-object v0
.end method

.method private final g()Lcom/ironsource/B8$c;
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/B8$c;

    invoke-direct {v0, p0}, Lcom/ironsource/B8$c;-><init>(Lcom/ironsource/B8;)V

    return-object v0
.end method

.method private final j()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ironsource/B8;->g:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/ironsource/B8;->i:Lcom/ironsource/G8;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ironsource/G8;->a(Lcom/ironsource/G8$a;)V

    .line 24
    :goto_0
    iget-object v0, p0, Lcom/ironsource/B8;->b:Lcom/ironsource/Jb;

    invoke-interface {v0}, Lcom/ironsource/Jb;->a()V

    return-void
.end method

.method public a(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/B8;->g:Ljava/lang/Long;

    .line 5
    const-string v0, "demandSourceName"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/B8;->e:Ljava/lang/String;

    .line 6
    const-string v0, "inAppBidding"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/B8;->f:Ljava/lang/String;

    .line 8
    iget-object v0, p0, Lcom/ironsource/B8;->c:Lcom/ironsource/t8;

    sget-object v1, Lcom/ironsource/Sd;->f:Lcom/ironsource/Sd$a;

    const-string v2, "loadAd"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ironsource/B8;->d()Lcom/ironsource/s8;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object v2

    const-string v3, "baseEventParams().data"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lcom/ironsource/t8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    iget-object p2, p0, Lcom/ironsource/B8;->g:Ljava/lang/Long;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "loadStartTime"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    iget-object p2, p0, Lcom/ironsource/B8;->b:Lcom/ironsource/Jb;

    invoke-interface {p2, p1, v0}, Lcom/ironsource/Jb;->a(Landroid/app/Activity;Lorg/json/JSONObject;)V

    return-void
.end method

.method public a(Lcom/ironsource/F8$a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ironsource/B8;->h:Lcom/ironsource/F8$a;

    return-void
.end method

.method public a(Lcom/ironsource/G8;)V
    .locals 4

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    invoke-direct {p0}, Lcom/ironsource/B8;->d()Lcom/ironsource/s8;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/s8;->a()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "baseEventParams().data"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 15
    invoke-virtual {p1}, Lcom/ironsource/G8;->t()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "viewHolder.viewsStatus().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "generalmessage"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v1, p0, Lcom/ironsource/B8;->c:Lcom/ironsource/t8;

    sget-object v2, Lcom/ironsource/Sd;->n:Lcom/ironsource/Sd$a;

    const-string v3, "registerAd"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2, v0}, Lcom/ironsource/t8;->a(Lcom/ironsource/Sd$a;Ljava/util/Map;)V

    .line 19
    iput-object p1, p0, Lcom/ironsource/B8;->i:Lcom/ironsource/G8;

    .line 20
    invoke-direct {p0}, Lcom/ironsource/B8;->g()Lcom/ironsource/B8$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ironsource/G8;->a(Lcom/ironsource/G8$a;)V

    .line 22
    iget-object v0, p0, Lcom/ironsource/B8;->b:Lcom/ironsource/Jb;

    invoke-interface {v0, p1}, Lcom/ironsource/Jb;->a(Lcom/ironsource/G8;)V

    return-void
.end method

.method public b()Lcom/ironsource/F8$a;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/B8;->h:Lcom/ironsource/F8$a;

    return-object v0
.end method

.method public c()Lcom/ironsource/D8;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/B8;->d:Lcom/ironsource/D8;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/B8;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/B8;->f:Ljava/lang/String;

    return-object v0
.end method
