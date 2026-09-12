.class public final Lcom/ironsource/he;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ironsource/Ae;

.field private final b:Lcom/ironsource/nd;

.field private final c:Lcom/ironsource/pd;

.field private final d:Lcom/ironsource/V3;

.field private final e:Lcom/ironsource/P5;


# direct methods
.method public constructor <init>(Lcom/ironsource/Ae;)V
    .locals 3

    const-string v0, "fullResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/he;->a:Lcom/ironsource/Ae;

    .line 5
    new-instance v0, Lcom/ironsource/nd;

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/Ae;->i()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "providerOrder"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    .line 7
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 8
    :cond_0
    invoke-direct {v0, v1}, Lcom/ironsource/nd;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/he;->b:Lcom/ironsource/nd;

    .line 15
    new-instance v0, Lcom/ironsource/pd;

    .line 16
    invoke-virtual {p1}, Lcom/ironsource/Ae;->i()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "providerSettings"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1

    .line 17
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 18
    :cond_1
    invoke-direct {v0, v1}, Lcom/ironsource/pd;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/he;->c:Lcom/ironsource/pd;

    .line 23
    new-instance v0, Lcom/ironsource/V3;

    .line 24
    invoke-virtual {p1}, Lcom/ironsource/Ae;->i()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "configurations"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_2

    .line 25
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 26
    :cond_2
    invoke-direct {v0, v1}, Lcom/ironsource/V3;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/he;->d:Lcom/ironsource/V3;

    .line 31
    new-instance v0, Lcom/ironsource/P5;

    .line 32
    invoke-virtual {p1}, Lcom/ironsource/Ae;->i()Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "experiments"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_3

    .line 33
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 34
    :cond_3
    invoke-direct {v0, p1}, Lcom/ironsource/P5;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/ironsource/he;->e:Lcom/ironsource/P5;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ironsource/V3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/he;->d:Lcom/ironsource/V3;

    return-object v0
.end method

.method public final b()Lcom/ironsource/P5;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/he;->e:Lcom/ironsource/P5;

    return-object v0
.end method

.method public final c()Lcom/ironsource/Ae;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/he;->a:Lcom/ironsource/Ae;

    return-object v0
.end method

.method public final d()Lcom/ironsource/nd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/he;->b:Lcom/ironsource/nd;

    return-object v0
.end method

.method public final e()Lcom/ironsource/pd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/he;->c:Lcom/ironsource/pd;

    return-object v0
.end method
