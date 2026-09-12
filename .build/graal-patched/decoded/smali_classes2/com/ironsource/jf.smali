.class public Lcom/ironsource/jf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/jf$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;",
            "Lcom/ironsource/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ironsource/jf;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/ironsource/v0;I)Lcom/ironsource/R0;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/ironsource/jf;->a(Lcom/ironsource/v0;)Lcom/ironsource/p0;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ironsource/v0;->m()Ljava/util/List;

    move-result-object p0

    .line 4
    invoke-virtual {v0, v1, p0, p1}, Lcom/ironsource/p0;->a(Ljava/lang/String;Ljava/util/List;I)Lcom/ironsource/R0;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Lcom/ironsource/jf$b;
    .locals 1

    .line 10
    new-instance v0, Lcom/ironsource/jf$b;

    invoke-direct {v0, p0}, Lcom/ironsource/jf$b;-><init>(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    return-object v0
.end method

.method public static a()Lcom/ironsource/mediationsdk/IronSourceSegment;
    .locals 1

    .line 11
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->t()Lcom/ironsource/mediationsdk/IronSourceSegment;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/ironsource/v0;)Lcom/ironsource/p0;
    .locals 2

    .line 5
    sget-object v0, Lcom/ironsource/jf;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ironsource/p0;

    return-object p0

    .line 8
    :cond_0
    new-instance v1, Lcom/ironsource/p0;

    invoke-direct {v1}, Lcom/ironsource/p0;-><init>()V

    .line 9
    invoke-virtual {p0}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ironsource/f0;->a()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object p0

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public static a(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/lang/String;
    .locals 1

    .line 41
    sget-object v0, Lcom/ironsource/jf$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    .line 51
    const-string p0, ""

    return-object p0

    .line 52
    :cond_0
    const-string p0, "nativeAd"

    return-object p0

    .line 53
    :cond_1
    const-string p0, "banner"

    return-object p0

    .line 54
    :cond_2
    const-string p0, "interstitial"

    return-object p0

    .line 55
    :cond_3
    const-string p0, "rewarded"

    return-object p0
.end method

.method public static a(Lcom/ironsource/C5;Lorg/json/JSONObject;)V
    .locals 3

    const/4 v0, 0x0

    .line 32
    invoke-static {v0}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getMediationAdditionalData(Z)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x2

    .line 33
    new-array v2, v2, [Lorg/json/JSONObject;

    aput-object v1, v2, v0

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Lcom/ironsource/ba;->a([Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    .line 34
    new-instance v0, Lcom/ironsource/B5;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 35
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object p0

    invoke-interface {p0}, Lcom/ironsource/J7;->q()Lcom/ironsource/v1;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    return-void
.end method

.method public static a(Ljava/lang/Exception;)V
    .locals 3

    .line 22
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object v0

    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    .line 23
    const-string v2, "Exception"

    invoke-virtual {v0, v1, v2, p0}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->logException(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 26
    :try_start_0
    const-string v1, "reason"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 28
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 29
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 31
    :goto_0
    sget-object p0, Lcom/ironsource/C5;->x3:Lcom/ironsource/C5;

    invoke-static {p0, v0}, Lcom/ironsource/jf;->a(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 3

    .line 12
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object v0

    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    .line 13
    const-string v2, "SafeRunnable"

    invoke-virtual {v0, v1, v2, p0}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->logException(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 16
    :try_start_0
    const-string v1, "reason"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 18
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 19
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    .line 21
    :goto_0
    sget-object p0, Lcom/ironsource/C5;->w3:Lcom/ironsource/C5;

    invoke-static {p0, v0}, Lcom/ironsource/jf;->a(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static a(Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;)Z
    .locals 2

    .line 36
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose()V

    .line 37
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/environment/ContextProvider;->getCurrentActiveActivity()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    instance-of v1, p0, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterSettingsInterface;

    if-eqz v1, :cond_0

    check-cast p0, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterSettingsInterface;

    .line 39
    invoke-interface {p0, p1}, Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterSettingsInterface;->isUsingActivityBeforeImpression(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 40
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " - is using activity before impression and activity is null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/jf$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    .line 11
    sget-object p0, Lcom/ironsource/u3$e;->b:Lcom/ironsource/u3$e;

    invoke-virtual {p0}, Lcom/ironsource/u3$e;->b()I

    move-result p0

    return p0

    .line 12
    :cond_0
    sget-object p0, Lcom/ironsource/u3$e;->f:Lcom/ironsource/u3$e;

    invoke-virtual {p0}, Lcom/ironsource/u3$e;->b()I

    move-result p0

    return p0

    .line 13
    :cond_1
    sget-object p0, Lcom/ironsource/u3$e;->e:Lcom/ironsource/u3$e;

    invoke-virtual {p0}, Lcom/ironsource/u3$e;->b()I

    move-result p0

    return p0

    .line 14
    :cond_2
    sget-object p0, Lcom/ironsource/u3$e;->c:Lcom/ironsource/u3$e;

    invoke-virtual {p0}, Lcom/ironsource/u3$e;->b()I

    move-result p0

    return p0

    .line 15
    :cond_3
    sget-object p0, Lcom/ironsource/u3$e;->d:Lcom/ironsource/u3$e;

    invoke-virtual {p0}, Lcom/ironsource/u3$e;->b()I

    move-result p0

    return p0
.end method
