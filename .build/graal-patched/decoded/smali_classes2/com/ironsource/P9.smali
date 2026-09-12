.class public Lcom/ironsource/P9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/ironsource/T6;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/ironsource/T6;

    invoke-direct {v0}, Lcom/ironsource/T6;-><init>()V

    iput-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 66
    const-string v1, "asel"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-virtual {v0, p1}, Lcom/ironsource/T6;->a(Landroid/content/Context;)V

    return-void
.end method

.method public a(Lcom/ironsource/S7;)V
    .locals 3

    .line 14
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    const-string v1, "omv"

    invoke-virtual {p1}, Lcom/ironsource/S7;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    const-string v1, "ompv"

    .line 19
    invoke-virtual {p1}, Lcom/ironsource/S7;->b()Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    const-string v1, "sdkv"

    invoke-virtual {p1}, Lcom/ironsource/S7;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object p1, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-virtual {p1, v0}, Lcom/ironsource/T6;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 27
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public a(Lcom/ironsource/fe;)V
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ironsource/P9$a;

    invoke-direct {v1, p0, p1}, Lcom/ironsource/P9$a;-><init>(Lcom/ironsource/P9;Lcom/ironsource/fe;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/mediationsdk/WaterfallConfiguration;)V
    .locals 3

    .line 28
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p2, :cond_0

    .line 31
    :try_start_0
    const-string v1, "flr"

    .line 32
    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/WaterfallConfiguration;->getFloor()Ljava/lang/Double;

    move-result-object v2

    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    const-string v1, "clng"

    .line 36
    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/WaterfallConfiguration;->getCeiling()Ljava/lang/Double;

    move-result-object p2

    .line 37
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 40
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 44
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result p2

    const-string v1, "infp"

    if-nez p2, :cond_1

    .line 47
    iget-object p2, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    .line 49
    invoke-static {p1}, Lcom/ironsource/W0;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Lcom/ironsource/P6$a;

    move-result-object p1

    .line 50
    invoke-virtual {p2, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Lcom/ironsource/P6$a;)V

    return-void

    .line 57
    :cond_1
    iget-object p2, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    .line 60
    invoke-static {p1}, Lcom/ironsource/W0;->a(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Lcom/ironsource/P6$a;

    move-result-object p1

    .line 61
    invoke-virtual {p2, v1, v0, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;Lcom/ironsource/P6$a;)V

    return-void
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "fs"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 62
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "abt"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "md"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "cnst"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "cmpid"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 6
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->i()Lcom/ironsource/z7;

    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lcom/ironsource/z7;->n(Landroid/content/Context;)Landroid/app/ActivityManager$MemoryInfo;

    move-result-object p1

    .line 8
    iget-object v1, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    .line 9
    invoke-interface {v0, p1}, Lcom/ironsource/z7;->c(Landroid/app/ActivityManager$MemoryInfo;)Ljava/lang/Long;

    move-result-object v2

    .line 10
    const-string v3, "availMem"

    invoke-virtual {v1, v3, v2}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    iget-object v1, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-interface {v0, p1}, Lcom/ironsource/z7;->b(Landroid/app/ActivityManager$MemoryInfo;)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "lowM"

    invoke-virtual {v1, v0, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "adq_init_blob"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "tkgp"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "gpi"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "itp"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "apky"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "audt"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "google_water_mark"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "mt"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "medv"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "sid"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    const-string v1, "usid"

    invoke-virtual {v0, v1, p1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
