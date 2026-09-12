.class public Lcom/ironsource/y8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/ironsource/H5;
    .locals 2

    .line 13
    new-instance v0, Lcom/ironsource/H5$a;

    const-string v1, "endpoint"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ironsource/H5$a;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0}, Lcom/ironsource/H5$a;->b()Lcom/ironsource/H5$a;

    move-result-object v0

    .line 15
    const-string v1, "enabled"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ironsource/H5$a;->b(Z)Lcom/ironsource/H5$a;

    move-result-object p0

    new-instance v0, Lcom/ironsource/w8;

    invoke-direct {v0}, Lcom/ironsource/w8;-><init>()V

    .line 16
    invoke-virtual {p0, v0}, Lcom/ironsource/H5$a;->a(Lcom/ironsource/H7;)Lcom/ironsource/H5$a;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/ironsource/y8;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ironsource/H5$a;->a(Ljava/util/List;)Lcom/ironsource/H5$a;

    move-result-object p0

    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lcom/ironsource/H5$a;->a(Z)Lcom/ironsource/H5$a;

    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/ironsource/H5$a;->a()Lcom/ironsource/H5;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/ironsource/X4;Lcom/ironsource/q8$e;)Lcom/ironsource/q8$e;
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/X4;->g()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/ironsource/X4;->g()Ljava/util/Map;

    move-result-object v0

    const-string v1, "rewarded"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    return-object p1

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/ironsource/X4;->g()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 39
    sget-object p0, Lcom/ironsource/q8$e;->c:Lcom/ironsource/q8$e;

    return-object p0

    .line 40
    :cond_3
    sget-object p0, Lcom/ironsource/q8$e;->b:Lcom/ironsource/q8$e;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ironsource/v8;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ironsource/v8;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ironsource/v8$a;

    invoke-direct {v0}, Lcom/ironsource/v8$a;-><init>()V

    if-eqz p3, :cond_0

    .line 5
    const-string v1, "sessionid"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {v0, p3}, Lcom/ironsource/v8$a;->c(Ljava/lang/String;)Lcom/ironsource/v8$a;

    .line 10
    :cond_0
    invoke-virtual {v0, p0}, Lcom/ironsource/v8$a;->a(Landroid/content/Context;)Lcom/ironsource/v8$a;

    .line 12
    invoke-virtual {v0, p1}, Lcom/ironsource/v8$a;->d(Ljava/lang/String;)Lcom/ironsource/v8$a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/ironsource/v8$a;->a(Ljava/lang/String;)Lcom/ironsource/v8$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ironsource/v8$a;->a()Lcom/ironsource/v8;

    move-result-object p0

    return-object p0
.end method

.method private static a()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    new-instance v1, Landroid/util/Pair;

    const-string v2, "Content-Type"

    const-string v3, "application/json"

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    new-instance v1, Landroid/util/Pair;

    const-string v2, "charset"

    const-string v3, "utf-8"

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static a(Lcom/ironsource/X4;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/X4;->g()Ljava/util/Map;

    move-result-object v1

    const-string v2, "inAppBidding"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/ironsource/X4;->g()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
