.class Lcom/ironsource/mediationsdk/s$a;
.super Lcom/ironsource/mediationsdk/s$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/mediationsdk/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/ironsource/mediationsdk/s;


# direct methods
.method public static synthetic $r8$lambda$iUSQCv7vs6iZ6unTgQ0GwDxzAj0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method constructor <init>(Lcom/ironsource/mediationsdk/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-direct {p0, p1}, Lcom/ironsource/mediationsdk/s$f;-><init>(Lcom/ironsource/mediationsdk/s;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgets(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lcom/ironsource/M6;->a()Lcom/ironsource/M6;

    move-result-object v1

    const-string v2, "userId"

    iget-object v3, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgets(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/ironsource/M6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgett(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    invoke-static {}, Lcom/ironsource/M6;->a()Lcom/ironsource/M6;

    move-result-object v1

    const-string v2, "appKey"

    iget-object v3, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgett(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/ironsource/M6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgety(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/P9;

    move-result-object v2

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgets(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ironsource/P9;->i(Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputx(Lcom/ironsource/mediationsdk/s;J)V

    .line 18
    invoke-static {}, Lcom/ironsource/qd;->c()Lcom/ironsource/qd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/qd;->a()V

    .line 21
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    .line 23
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgets(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/mediationsdk/s$f;->c:Lcom/ironsource/mediationsdk/p$c;

    .line 24
    invoke-virtual {v0, v2, v3, v4}, Lcom/ironsource/mediationsdk/p;->b(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/mediationsdk/p$c;)Lcom/ironsource/Ae;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputu(Lcom/ironsource/mediationsdk/s;Lcom/ironsource/Ae;)V

    .line 27
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    .line 28
    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetm(Lcom/ironsource/mediationsdk/s;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 30
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/Ae;->p()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 32
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    sget-object v2, Lcom/ironsource/mediationsdk/s$d;->d:Lcom/ironsource/mediationsdk/s$d;

    invoke-virtual {v1, v2}, Lcom/ironsource/mediationsdk/s;->b(Lcom/ironsource/mediationsdk/s$d;)V

    .line 35
    new-instance v1, Lcom/ironsource/Bb;

    invoke-direct {v1}, Lcom/ironsource/Bb;-><init>()V

    .line 36
    iget-object v2, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lcom/ironsource/A1;->e()Lcom/ironsource/J1;

    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lcom/ironsource/J1;->b()Ljava/util/Map;

    move-result-object v2

    .line 43
    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->C()Z

    move-result v3

    .line 44
    invoke-virtual {v1, v2, v3}, Lcom/ironsource/Bb;->a(Ljava/util/Map;Z)V

    .line 47
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lcom/ironsource/A1;->f()Lcom/ironsource/K1;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 54
    sget-object v2, Lcom/ironsource/Z4;->a:Lcom/ironsource/Z4;

    .line 55
    invoke-virtual {v1}, Lcom/ironsource/K1;->g()Z

    move-result v3

    .line 56
    invoke-virtual {v2, v3}, Lcom/ironsource/Z4;->c(Z)V

    .line 59
    invoke-virtual {v1}, Lcom/ironsource/K1;->f()Z

    move-result v3

    .line 60
    invoke-virtual {v2, v3}, Lcom/ironsource/Z4;->a(Z)V

    .line 63
    invoke-virtual {v1}, Lcom/ironsource/K1;->j()I

    move-result v3

    .line 64
    invoke-virtual {v2, v3}, Lcom/ironsource/Z4;->a(I)V

    .line 66
    sget-object v2, Lcom/ironsource/environment/thread/IronSourceThreadManager;->INSTANCE:Lcom/ironsource/environment/thread/IronSourceThreadManager;

    .line 67
    invoke-virtual {v1}, Lcom/ironsource/K1;->h()Z

    move-result v3

    .line 68
    invoke-virtual {v2, v3}, Lcom/ironsource/environment/thread/IronSourceThreadManager;->setUseSharedExecutorService(Z)V

    .line 70
    iget-object v2, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v2}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetc(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/l7;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/ironsource/l7;->a(Lcom/ironsource/K1;)V

    .line 73
    :cond_2
    iget-object v2, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    .line 74
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v4}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v4

    .line 75
    invoke-virtual {v2, v3, v4}, Lcom/ironsource/mediationsdk/s;->a(Landroid/content/Context;Lcom/ironsource/Ae;)V

    .line 79
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v4}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetx(Lcom/ironsource/mediationsdk/s;)J

    move-result-wide v5

    sub-long/2addr v2, v5

    .line 80
    invoke-static {v4}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v4

    .line 81
    invoke-virtual {v4}, Lcom/ironsource/Ae;->h()Lcom/ironsource/Ae$a;

    move-result-object v4

    .line 82
    invoke-virtual {v0, v2, v3, v4}, Lcom/ironsource/mediationsdk/p;->a(JLcom/ironsource/Ae$a;)V

    if-eqz v1, :cond_3

    .line 86
    invoke-virtual {v1}, Lcom/ironsource/K1;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    new-instance v0, Lcom/ironsource/sd;

    .line 89
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v1

    invoke-interface {v1}, Lcom/ironsource/J7;->q()Lcom/ironsource/v1;

    move-result-object v1

    new-instance v2, Lcom/ironsource/mediationsdk/s$a$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/ironsource/mediationsdk/s$a$$ExternalSyntheticLambda0;-><init>()V

    .line 91
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v3

    sget-object v4, Lcom/ironsource/environment/thread/IronSourceThreadManager;->INSTANCE:Lcom/ironsource/environment/thread/IronSourceThreadManager;

    .line 92
    invoke-virtual {v4}, Lcom/ironsource/environment/thread/IronSourceThreadManager;->getThreadPoolExecutor()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ironsource/sd;-><init>(Lcom/ironsource/D7;Lkotlin/jvm/functions/Function0;Lcom/ironsource/J7;Ljava/util/concurrent/Executor;)V

    .line 94
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Lcom/ironsource/sd;->c(Landroid/content/Context;)V

    .line 100
    :cond_3
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    new-instance v1, Lcom/ironsource/De;

    invoke-direct {v1}, Lcom/ironsource/De;-><init>()V

    invoke-static {v0, v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputa(Lcom/ironsource/mediationsdk/s;Lcom/ironsource/De;)V

    .line 101
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgeta(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/De;

    move-result-object v1

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetc(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/l7;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/De;->a(Lcom/ironsource/l7;)V

    .line 107
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    .line 109
    invoke-virtual {v0}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Lcom/ironsource/A1;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 113
    invoke-static {}, Lcom/ironsource/environment/ContextProvider;->getInstance()Lcom/ironsource/environment/ContextProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/environment/ContextProvider;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 114
    invoke-static {v0}, Lcom/ironsource/mediationsdk/integration/IntegrationHelper;->validateIntegration(Landroid/content/Context;)V

    .line 119
    :cond_4
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Ae;->g()Ljava/util/List;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetr(Lcom/ironsource/mediationsdk/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ironsource/Ac;

    .line 122
    iget-object v3, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    .line 123
    invoke-static {v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$mh(Lcom/ironsource/mediationsdk/s;)Z

    move-result v3

    iget-object v4, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v4}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v4

    .line 124
    invoke-interface {v2, v0, v3, v4}, Lcom/ironsource/Ac;->a(Ljava/util/List;ZLcom/ironsource/U3;)V

    goto :goto_0

    .line 128
    :cond_5
    new-instance v0, Lcom/ironsource/Wc$a;

    invoke-direct {v0}, Lcom/ironsource/Wc$a;-><init>()V

    invoke-virtual {v0}, Lcom/ironsource/Wc$a;->a()V

    .line 131
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetv(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/mediationsdk/sdk/SegmentListener;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 132
    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/ironsource/A1;->j()Lcom/ironsource/Be;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 137
    invoke-virtual {v0}, Lcom/ironsource/Be;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 138
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetv(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/mediationsdk/sdk/SegmentListener;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ironsource/Be;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ironsource/mediationsdk/sdk/SegmentListener;->onSegmentReceived(Ljava/lang/String;)V

    .line 143
    :cond_6
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;

    move-result-object v0

    .line 145
    invoke-virtual {v0}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lcom/ironsource/A1;->d()Lcom/ironsource/E1;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lcom/ironsource/E1;->f()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 149
    invoke-static {}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getSessionId()Ljava/lang/String;

    move-result-object v7

    .line 150
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v2

    .line 152
    invoke-virtual {v0}, Lcom/ironsource/E1;->b()Ljava/util/HashSet;

    move-result-object v3

    .line 153
    invoke-virtual {v0}, Lcom/ironsource/E1;->d()Ljava/lang/String;

    move-result-object v4

    .line 154
    invoke-virtual {v0}, Lcom/ironsource/E1;->c()Ljava/lang/String;

    move-result-object v5

    .line 155
    invoke-virtual {v0}, Lcom/ironsource/E1;->e()Z

    move-result v6

    .line 157
    invoke-virtual {v0}, Lcom/ironsource/E1;->a()I

    move-result v8

    .line 158
    invoke-virtual {v0}, Lcom/ironsource/E1;->g()Z

    move-result v9

    .line 159
    invoke-virtual/range {v2 .. v9}, Lcom/ironsource/q4;->a(Ljava/util/HashSet;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZ)V

    goto/16 :goto_4

    .line 171
    :cond_7
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetl(Lcom/ironsource/mediationsdk/s;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 172
    sget-object v1, Lcom/ironsource/mediationsdk/s$d;->c:Lcom/ironsource/mediationsdk/s$d;

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/s;->b(Lcom/ironsource/mediationsdk/s$d;)V

    .line 173
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0, v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputl(Lcom/ironsource/mediationsdk/s;Z)V

    .line 175
    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetr(Lcom/ironsource/mediationsdk/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/Ac;

    .line 176
    const-string v2, "serverResponseIsNotValid"

    invoke-interface {v1, v2}, Lcom/ironsource/Ac;->h(Ljava/lang/String;)V

    goto :goto_1

    .line 182
    :cond_8
    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_9

    .line 183
    invoke-static {v1, v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputw(Lcom/ironsource/mediationsdk/s;Z)V

    .line 185
    invoke-static {v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetr(Lcom/ironsource/mediationsdk/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/Ac;

    .line 186
    invoke-interface {v1}, Lcom/ironsource/Ac;->a()V

    goto :goto_2

    .line 190
    :cond_9
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/s$f;->a:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I

    move-result v1

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgeth(Lcom/ironsource/mediationsdk/s;)I

    move-result v2

    if-ge v1, v2, :cond_a

    .line 191
    invoke-static {v0, v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputk(Lcom/ironsource/mediationsdk/s;Z)V

    .line 192
    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetm(Lcom/ironsource/mediationsdk/s;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetf(Lcom/ironsource/mediationsdk/s;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v4, v0

    invoke-virtual {v1, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 193
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I

    move-result v1

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgeti(Lcom/ironsource/mediationsdk/s;)I

    move-result v2

    if-ge v1, v2, :cond_a

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetf(Lcom/ironsource/mediationsdk/s;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputf(Lcom/ironsource/mediationsdk/s;I)V

    .line 195
    :cond_a
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/s$f;->a:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I

    move-result v1

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetj(Lcom/ironsource/mediationsdk/s;)I

    move-result v0

    if-ne v1, v0, :cond_e

    .line 196
    :cond_b
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetl(Lcom/ironsource/mediationsdk/s;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 197
    invoke-static {v0, v3}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputl(Lcom/ironsource/mediationsdk/s;Z)V

    .line 198
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$f;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 199
    const-string v0, "noServerResponse"

    iput-object v0, p0, Lcom/ironsource/mediationsdk/s$f;->b:Ljava/lang/String;

    .line 202
    :cond_c
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetr(Lcom/ironsource/mediationsdk/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/Ac;

    .line 203
    iget-object v2, p0, Lcom/ironsource/mediationsdk/s$f;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/ironsource/Ac;->h(Ljava/lang/String;)V

    goto :goto_3

    .line 206
    :cond_d
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    sget-object v1, Lcom/ironsource/mediationsdk/s$d;->c:Lcom/ironsource/mediationsdk/s$d;

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/s;->b(Lcom/ironsource/mediationsdk/s$d;)V

    .line 207
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object v0

    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->API:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    const-string v2, "Mediation availability false reason: No server response"

    .line 208
    invoke-virtual {v0, v1, v2, v3}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V

    .line 214
    :cond_e
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I

    move-result v1

    add-int/2addr v1, v3

    invoke-static {v0, v1}, Lcom/ironsource/mediationsdk/s;->-$$Nest$fputg(Lcom/ironsource/mediationsdk/s;I)V

    .line 217
    :cond_f
    :goto_4
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s$a;->e:Lcom/ironsource/mediationsdk/s;

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->-$$Nest$me(Lcom/ironsource/mediationsdk/s;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 220
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 221
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method
