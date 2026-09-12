.class public final Lcom/ironsource/J9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ironsource/J9;

.field private static final b:Lcom/ironsource/f9;


# direct methods
.method public static synthetic $r8$lambda$IZ03YIFtewhVY3aNOls9NWhvE5k(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/J9;->a(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method public static synthetic $r8$lambda$NwFrZCVii8m-MESwjwEe52MXohc(Lcom/unity3d/ironsourceads/InitRequest;Landroid/content/Context;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/J9;->a(Lcom/unity3d/ironsourceads/InitRequest;Landroid/content/Context;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method public static synthetic $r8$lambda$sJPLzvVtVkseSr4y_m6n-_6gSKI(Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/J9;->a(Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ironsource/J9;

    invoke-direct {v0}, Lcom/ironsource/J9;-><init>()V

    sput-object v0, Lcom/ironsource/J9;->a:Lcom/ironsource/J9;

    .line 1
    new-instance v0, Lcom/ironsource/f9;

    invoke-direct {v0}, Lcom/ironsource/f9;-><init>()V

    sput-object v0, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 5

    .line 29
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->u()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-virtual {p2}, Lcom/ironsource/Ae;->f()Lcom/ironsource/X8;

    move-result-object v1

    const-string v2, "serverResponse.initialConfiguration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2}, Lcom/ironsource/Ae;->k()Lcom/ironsource/qd;

    move-result-object v2

    const-string v3, "IronSource"

    invoke-virtual {v2, v3}, Lcom/ironsource/qd;->b(Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v2

    const-string v3, "serverResponse.providerS\u2026s.IRONSOURCE_CONFIG_NAME)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v3, Lcom/ironsource/V$a;

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/model/NetworkSettings;->getInterstitialSettings()Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "networkSettings.interstitialSettings"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, Lcom/ironsource/V$a;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v1, v3}, Lcom/ironsource/X8;->a(Lcom/ironsource/V;)V

    .line 35
    invoke-static {}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getConfigFile()Lcom/ironsource/mediationsdk/config/ConfigFile;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getPluginType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/X8;->a(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v1, v0}, Lcom/ironsource/X8;->b(Ljava/lang/String;)V

    .line 37
    new-instance v0, Lcom/ironsource/X;

    new-instance v2, Lcom/ironsource/fc;

    invoke-direct {v2}, Lcom/ironsource/fc;-><init>()V

    invoke-direct {v0, v2}, Lcom/ironsource/X;-><init>(Lcom/ironsource/ec;)V

    .line 41
    new-instance v2, Lcom/ironsource/J9$a;

    invoke-direct {v2}, Lcom/ironsource/J9$a;-><init>()V

    .line 42
    invoke-interface {v0, p1, v1, v2}, Lcom/ironsource/W;->a(Landroid/content/Context;Lcom/ironsource/X8;Lcom/unity3d/ironsourceads/InitListener;)V

    .line 50
    invoke-direct {p0, p2, p3, p4}, Lcom/ironsource/J9;->a(Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method private final a(Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 3

    .line 51
    invoke-virtual {p1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Lcom/ironsource/A1;->e()Lcom/ironsource/J1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {v0}, Lcom/ironsource/J1;->b()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 55
    :goto_0
    new-instance v1, Lcom/ironsource/Bb;

    invoke-direct {v1}, Lcom/ironsource/Bb;-><init>()V

    const/4 v2, 0x1

    .line 56
    invoke-virtual {v1, v0, v2}, Lcom/ironsource/Bb;->a(Ljava/util/Map;Z)V

    .line 57
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->u()Ljava/lang/String;

    move-result-object v0

    .line 58
    sget-object v1, Lcom/ironsource/Yb;->e:Lcom/ironsource/Yb$a;

    invoke-virtual {v1}, Lcom/ironsource/Yb$a;->a()Lcom/ironsource/Yb;

    move-result-object v1

    .line 59
    invoke-virtual {p1}, Lcom/ironsource/Ae;->k()Lcom/ironsource/qd;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/Yb;->a(Lcom/ironsource/qd;)V

    .line 60
    invoke-virtual {p1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/Yb;->a(Lcom/ironsource/U3;)V

    .line 61
    const-string v2, "sessionId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/ironsource/Yb;->a(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1}, Lcom/ironsource/Yb;->g()V

    .line 64
    invoke-static {p2}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v0

    .line 65
    sget-object p2, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    invoke-virtual {p1}, Lcom/ironsource/Ae;->h()Lcom/ironsource/Ae$a;

    move-result-object p1

    const-string v2, "serverResponse.origin"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0, v1, p1}, Lcom/ironsource/f9;->a(JLcom/ironsource/Ae$a;)V

    .line 66
    new-instance p1, Lcom/ironsource/J9$$ExternalSyntheticLambda0;

    invoke-direct {p1, p3}, Lcom/ironsource/J9$$ExternalSyntheticLambda0;-><init>(Lcom/unity3d/ironsourceads/InitListener;)V

    invoke-virtual {p2, p1}, Lcom/ironsource/f9;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/J9;Landroid/content/Context;Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ironsource/J9;->a(Landroid/content/Context;Lcom/ironsource/Ae;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/J9;Lcom/unity3d/ironsourceads/InitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/J9;->a(Lcom/unity3d/ironsourceads/InitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 3

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "InitListener.onInitFailed() error "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 73
    sget-object v0, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    invoke-virtual {v0, p0}, Lcom/ironsource/f9;->a(Lcom/ironsource/ae;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/unity3d/ironsourceads/InitListener;->onInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    :cond_0
    return-void
.end method

.method private static final a(Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 2

    .line 67
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->CALLBACK:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v1, "InitListener.onInitSuccess()"

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 68
    invoke-interface {p0}, Lcom/unity3d/ironsourceads/InitListener;->onInitSuccess()V

    :cond_0
    return-void
.end method

.method private final a(Lcom/unity3d/ironsourceads/InitListener;Lcom/ironsource/k5;Lcom/ironsource/ae;)V
    .locals 2

    .line 69
    invoke-static {p2}, Lcom/ironsource/k5;->a(Lcom/ironsource/k5;)J

    move-result-wide v0

    .line 70
    sget-object p2, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    invoke-virtual {p2, p3, v0, v1}, Lcom/ironsource/f9;->a(Lcom/ironsource/ae;J)V

    .line 71
    new-instance v0, Lcom/ironsource/J9$$ExternalSyntheticLambda2;

    invoke-direct {v0, p3, p1}, Lcom/ironsource/J9$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/ae;Lcom/unity3d/ironsourceads/InitListener;)V

    invoke-virtual {p2, v0}, Lcom/ironsource/f9;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final a(Lcom/unity3d/ironsourceads/InitRequest;Landroid/content/Context;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 7

    const-string v0, "$initRequest"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$initializationListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/ironsource/k5;

    invoke-direct {v0}, Lcom/ironsource/k5;-><init>()V

    .line 16
    new-instance v1, Lcom/ironsource/ge;

    .line 17
    invoke-virtual {p0}, Lcom/unity3d/ironsourceads/InitRequest;->getAppKey()Ljava/lang/String;

    move-result-object v2

    .line 19
    sget-object v3, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    invoke-virtual {p0}, Lcom/unity3d/ironsourceads/InitRequest;->getLegacyAdFormats()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/ironsource/f9;->a(Ljava/util/List;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/ArraysKt;->toMutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 20
    invoke-direct/range {v1 .. v6}, Lcom/ironsource/ge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    sget-object p0, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    .line 27
    new-instance v2, Lcom/ironsource/J9$b;

    invoke-direct {v2, p1, v0, p2}, Lcom/ironsource/J9$b;-><init>(Landroid/content/Context;Lcom/ironsource/k5;Lcom/unity3d/ironsourceads/InitListener;)V

    .line 28
    invoke-virtual {p0, p1, v1, v2}, Lcom/ironsource/ne;->c(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/unity3d/ironsourceads/InitRequest;Lcom/unity3d/ironsourceads/InitListener;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializationListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->API:Lcom/ironsource/mediationsdk/logger/IronLog;

    .line 5
    invoke-virtual {p2}, Lcom/unity3d/ironsourceads/InitRequest;->getAppKey()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p2}, Lcom/unity3d/ironsourceads/InitRequest;->getLegacyAdFormats()Ljava/util/List;

    move-result-object v2

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "IronSourceAds.init() appkey: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", legacyAdFormats: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/logger/IronLog;->info(Ljava/lang/String;)V

    .line 13
    sget-object v0, Lcom/ironsource/J9;->b:Lcom/ironsource/f9;

    new-instance v1, Lcom/ironsource/J9$$ExternalSyntheticLambda1;

    invoke-direct {v1, p2, p1, p3}, Lcom/ironsource/J9$$ExternalSyntheticLambda1;-><init>(Lcom/unity3d/ironsourceads/InitRequest;Landroid/content/Context;Lcom/unity3d/ironsourceads/InitListener;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/f9;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/ironsource/mediationsdk/p;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
