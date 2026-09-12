.class public final Lcom/ironsource/ye;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerInit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerInit.kt\ncom/unity3d/sdk/internal/init/ServerInit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"
.end annotation


# direct methods
.method public static synthetic $r8$lambda$r90oOm6W0XlPGZXILzwm_ZaOfIE(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ye;->a(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/ironsource/ae;
    .locals 2

    if-eqz p1, :cond_0

    .line 147
    new-instance v0, Lcom/ironsource/ae;

    const/16 v1, 0x83e

    invoke-direct {v0, v1, p1}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    return-object v0

    .line 148
    :cond_0
    new-instance p1, Lcom/ironsource/ae;

    const/16 v0, 0x816

    const-string v1, "noServerResponse"

    invoke-direct {p1, v0, v1}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    return-object p1
.end method

.method private final a(Landroid/content/Context;Lcom/ironsource/qe;Lcom/ironsource/ge;)Lcom/ironsource/le;
    .locals 11

    const-string v1, "serverResponseIsNotValid"

    const/16 v2, 0x820

    .line 24
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/ironsource/qe;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 26
    invoke-virtual {p2, p1}, Lcom/ironsource/qe;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object v3

    .line 29
    sget-object v4, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    .line 30
    const-string v5, "using custom identifier"

    const/4 v6, 0x1

    .line 31
    invoke-virtual {v3, v4, v5, v6}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V

    :cond_0
    move-object v6, v0

    .line 37
    invoke-virtual {p2}, Lcom/ironsource/qe;->d()Lcom/ironsource/mediationsdk/IronSourceSegment;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/IronSourceSegment;->getSegmentData()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move-object v9, v0

    .line 38
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 43
    invoke-virtual {p3}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v4

    .line 44
    invoke-virtual {p3}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v3, p1

    .line 45
    invoke-static/range {v3 .. v10}, Lcom/ironsource/mediationsdk/server/ServerURL;->buildInitURL(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-static {}, Lcom/ironsource/c9;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 55
    new-instance v5, Lcom/ironsource/ye$$ExternalSyntheticLambda0;

    invoke-direct {v5, v0}, Lcom/ironsource/ye$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p1, v4, v5}, Lcom/ironsource/mediationsdk/server/HttpFunctions;->sendPostRequest(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/p$c;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    .line 71
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string p2, "serverResponseString is null"

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 72
    iget-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/ironsource/ye;->a(Ljava/lang/String;)Lcom/ironsource/ae;

    move-result-object p1

    .line 73
    new-instance p2, Lcom/ironsource/le;

    invoke-direct {p2, p1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/ae;)V

    return-object p2

    .line 77
    :cond_2
    invoke-virtual {p2}, Lcom/ironsource/qe;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 78
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string v4, "encrypt"

    invoke-virtual {v0, v4}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 79
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 80
    const-string p1, "response"

    invoke-virtual {v4, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 82
    const-string p1, "encryptedResponse is empty - return null"

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 84
    new-instance p1, Lcom/ironsource/ae;

    .line 86
    const-string p2, "noResponseKey"

    const/16 p3, 0x834

    .line 87
    invoke-direct {p1, p3, p2}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 90
    new-instance p2, Lcom/ironsource/le;

    invoke-direct {p2, p1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/ae;)V

    return-object p2

    .line 93
    :cond_3
    const-string v5, "compression"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 94
    const-string v5, "encryptedResponse"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v4}, Lcom/ironsource/ye;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 97
    const-string p1, "encoded response invalid - return null"

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p2}, Lcom/ironsource/qe;->f()V

    .line 100
    new-instance p1, Lcom/ironsource/ae;

    .line 102
    const-string p2, "decryptionFailed"

    const/16 p3, 0x82a

    .line 103
    invoke-direct {p1, p3, p2}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 106
    new-instance p2, Lcom/ironsource/le;

    invoke-direct {p2, p1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/ae;)V

    return-object p2

    .line 110
    :cond_4
    new-instance p2, Lcom/ironsource/Ae;

    invoke-virtual {p3}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v3, v0, p3, p1}, Lcom/ironsource/Ae;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    sget-object p1, Lcom/ironsource/Ae$a;->d:Lcom/ironsource/Ae$a;

    invoke-virtual {p2, p1}, Lcom/ironsource/Ae;->a(Lcom/ironsource/Ae$a;)V

    .line 113
    invoke-virtual {p2}, Lcom/ironsource/Ae;->p()Z

    move-result p1

    if-nez p1, :cond_5

    .line 114
    sget-object p1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    const-string p2, "response invalid - return null"

    invoke-virtual {p1, p2}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 116
    new-instance p1, Lcom/ironsource/ae;

    .line 119
    invoke-direct {p1, v2, v1}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 122
    new-instance p2, Lcom/ironsource/le;

    invoke-direct {p2, p1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/ae;)V

    return-object p2

    .line 124
    :cond_5
    new-instance p1, Lcom/ironsource/le;

    new-instance p3, Lcom/ironsource/he;

    invoke-direct {p3, p2}, Lcom/ironsource/he;-><init>(Lcom/ironsource/Ae;)V

    invoke-direct {p1, p3}, Lcom/ironsource/le;-><init>(Lcom/ironsource/he;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 126
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 127
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "exception = "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/ironsource/mediationsdk/logger/IronLog;->warning(Ljava/lang/String;)V

    .line 131
    instance-of p1, p1, Lorg/json/JSONException;

    if-eqz p1, :cond_6

    .line 132
    new-instance p1, Lcom/ironsource/ae;

    invoke-direct {p1, v2, v1}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    goto :goto_1

    .line 135
    :cond_6
    new-instance p1, Lcom/ironsource/ae;

    const/16 p2, 0x1fe

    const-string p3, "internal error"

    invoke-direct {p1, p2, p3}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 137
    :goto_1
    new-instance p2, Lcom/ironsource/le;

    invoke-direct {p2, p1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/ae;)V

    return-object p2
.end method

.method private final a(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    const-string v0, "{\n      IronSourceAES.de\u2026 encryptedResponse)\n    }"

    if-eqz p2, :cond_0

    .line 139
    invoke-static {}, Lcom/ironsource/o5;->b()Lcom/ironsource/o5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/o5;->c()Ljava/lang/String;

    move-result-object p2

    .line 140
    invoke-static {p2, p1}, Lcom/ironsource/mediationsdk/utils/IronSourceAES;->decryptAndDecompress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 145
    :cond_0
    invoke-static {}, Lcom/ironsource/o5;->b()Lcom/ironsource/o5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/o5;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/ironsource/mediationsdk/utils/IronSourceAES;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 146
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final a(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)V
    .locals 1

    const-string v0, "$reason"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iput-object p1, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-void
.end method

.method private final b(Landroid/content/Context;Lcom/ironsource/qe;Lcom/ironsource/ge;)Lcom/ironsource/le;
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/ye;->a(Landroid/content/Context;Lcom/ironsource/qe;Lcom/ironsource/ge;)Lcom/ironsource/le;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/ironsource/le;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object v1

    .line 7
    sget-object v2, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    .line 8
    const-string v3, "Null or invalid response. Trying to get cached response"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V

    .line 14
    invoke-virtual {p3}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Lcom/ironsource/qe;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/ironsource/Ae;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 18
    new-instance v0, Lcom/ironsource/le;

    new-instance v1, Lcom/ironsource/he;

    invoke-direct {v1, p1}, Lcom/ironsource/he;-><init>(Lcom/ironsource/Ae;)V

    invoke-direct {v0, v1}, Lcom/ironsource/le;-><init>(Lcom/ironsource/he;)V

    .line 20
    invoke-virtual {p3}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/ironsource/mediationsdk/utils/ErrorBuilder;->buildUsingCachedConfigurationError(Ljava/lang/String;Ljava/lang/String;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    .line 22
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object p3

    .line 25
    invoke-virtual {v0}, Lcom/ironsource/le;->b()Lcom/ironsource/he;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v3, ": "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    .line 26
    invoke-virtual {p3, v2, p1, v1}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V

    .line 31
    invoke-virtual {p2}, Lcom/ironsource/qe;->g()V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/qe;Lcom/ironsource/ee;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tools"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p2}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    const-string v1, "userId"

    invoke-virtual {p3, v1, v0}, Lcom/ironsource/qe;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "appKey"

    invoke-virtual {p3, v1, v0}, Lcom/ironsource/qe;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p3}, Lcom/ironsource/qe;->c()Lcom/ironsource/P9;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->i(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p3}, Lcom/ironsource/qe;->a()V

    .line 6
    invoke-direct {p0, p1, p3, p2}, Lcom/ironsource/ye;->b(Landroid/content/Context;Lcom/ironsource/qe;Lcom/ironsource/ge;)Lcom/ironsource/le;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/ironsource/le;->b()Lcom/ironsource/he;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 9
    new-instance p2, Lcom/ironsource/Yd;

    invoke-virtual {p1}, Lcom/ironsource/le;->b()Lcom/ironsource/he;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/ironsource/Yd;-><init>(Lcom/ironsource/he;)V

    .line 10
    invoke-virtual {p1}, Lcom/ironsource/le;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    invoke-interface {p4, p2}, Lcom/ironsource/ee;->a(Lcom/ironsource/Yd;)V

    return-void

    .line 14
    :cond_1
    new-instance p1, Lcom/ironsource/ae;

    const/16 p2, 0x820

    const-string p3, "serverResponseIsNotValid"

    invoke-direct {p1, p2, p3}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 15
    invoke-interface {p4, p1}, Lcom/ironsource/ee;->a(Lcom/ironsource/ae;)V

    return-void

    .line 22
    :cond_2
    invoke-virtual {p1}, Lcom/ironsource/le;->a()Lcom/ironsource/ae;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Lcom/ironsource/ae;

    const/16 p2, 0x1fe

    const-string p3, "unknown error"

    invoke-direct {p1, p2, p3}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 23
    :cond_3
    invoke-interface {p4, p1}, Lcom/ironsource/ee;->a(Lcom/ironsource/ae;)V

    return-void
.end method
