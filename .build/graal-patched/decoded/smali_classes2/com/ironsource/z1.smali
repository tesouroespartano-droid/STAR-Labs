.class public final Lcom/ironsource/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/ub;

.field private final b:Z

.field private final c:Lcom/ironsource/D1;

.field private final d:Lcom/ironsource/K1;

.field private final e:Lcom/ironsource/x1;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "applicationConfigurations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lcom/ironsource/ub;

    const-string v1, "loggers"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    invoke-direct {v0, v1}, Lcom/ironsource/ub;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/z1;->a:Lcom/ironsource/ub;

    .line 10
    const-string v0, "integration"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ironsource/z1;->b:Z

    .line 13
    new-instance v0, Lcom/ironsource/D1;

    .line 14
    const-string v1, "crashReporter"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 15
    :cond_1
    invoke-direct {v0, v1}, Lcom/ironsource/D1;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/z1;->c:Lcom/ironsource/D1;

    .line 19
    new-instance v0, Lcom/ironsource/K1;

    .line 20
    const-string v1, "settings"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    :cond_2
    invoke-direct {v0, v1}, Lcom/ironsource/K1;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/z1;->d:Lcom/ironsource/K1;

    .line 26
    new-instance v0, Lcom/ironsource/x1;

    .line 27
    const-string v1, "auction"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 28
    :cond_3
    invoke-direct {v0, p1}, Lcom/ironsource/x1;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/z1;->e:Lcom/ironsource/x1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z1;->e:Lcom/ironsource/x1;

    return-object v0
.end method

.method public final b()Lcom/ironsource/D1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z1;->c:Lcom/ironsource/D1;

    return-object v0
.end method

.method public final c()Lcom/ironsource/K1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z1;->d:Lcom/ironsource/K1;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/z1;->b:Z

    return v0
.end method

.method public final e()Lcom/ironsource/ub;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/z1;->a:Lcom/ironsource/ub;

    return-object v0
.end method
