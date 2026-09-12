.class Lcom/ironsource/mediationsdk/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/rc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/mediationsdk/s$d;,
        Lcom/ironsource/mediationsdk/s$e;,
        Lcom/ironsource/mediationsdk/s$f;
    }
.end annotation


# static fields
.field private static A:Lcom/ironsource/mediationsdk/s;


# instance fields
.field private a:Lcom/ironsource/De;

.field private b:I

.field private c:Lcom/ironsource/l7;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Landroid/os/Handler;

.field private n:Z

.field private o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private p:Lcom/ironsource/environment/NetworkStateReceiver;

.field private q:Landroid/os/CountDownTimer;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ironsource/Ac;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Lcom/ironsource/Ae;

.field private v:Lcom/ironsource/mediationsdk/sdk/SegmentListener;

.field private w:Z

.field private x:J

.field private y:Lcom/ironsource/P9;

.field private z:Lcom/ironsource/mediationsdk/s$f;


# direct methods
.method static bridge synthetic -$$Nest$fgeta(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/De;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->a:Lcom/ironsource/De;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetc(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/l7;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->c:Lcom/ironsource/l7;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetf(Lcom/ironsource/mediationsdk/s;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/mediationsdk/s;->f:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetg(Lcom/ironsource/mediationsdk/s;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/mediationsdk/s;->g:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgeth(Lcom/ironsource/mediationsdk/s;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/mediationsdk/s;->h:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgeti(Lcom/ironsource/mediationsdk/s;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/mediationsdk/s;->i:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetj(Lcom/ironsource/mediationsdk/s;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/mediationsdk/s;->j:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetl(Lcom/ironsource/mediationsdk/s;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/ironsource/mediationsdk/s;->l:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetm(Lcom/ironsource/mediationsdk/s;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetr(Lcom/ironsource/mediationsdk/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->r:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgets(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->s:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgett(Lcom/ironsource/mediationsdk/s;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->t:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetu(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/Ae;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->u:Lcom/ironsource/Ae;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetv(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/mediationsdk/sdk/SegmentListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->v:Lcom/ironsource/mediationsdk/sdk/SegmentListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetx(Lcom/ironsource/mediationsdk/s;)J
    .locals 2

    iget-wide v0, p0, Lcom/ironsource/mediationsdk/s;->x:J

    return-wide v0
.end method

.method static bridge synthetic -$$Nest$fgety(Lcom/ironsource/mediationsdk/s;)Lcom/ironsource/P9;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputa(Lcom/ironsource/mediationsdk/s;Lcom/ironsource/De;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/mediationsdk/s;->a:Lcom/ironsource/De;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputf(Lcom/ironsource/mediationsdk/s;I)V
    .locals 0

    iput p1, p0, Lcom/ironsource/mediationsdk/s;->f:I

    return-void
.end method

.method static bridge synthetic -$$Nest$fputg(Lcom/ironsource/mediationsdk/s;I)V
    .locals 0

    iput p1, p0, Lcom/ironsource/mediationsdk/s;->g:I

    return-void
.end method

.method static bridge synthetic -$$Nest$fputk(Lcom/ironsource/mediationsdk/s;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ironsource/mediationsdk/s;->k:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputl(Lcom/ironsource/mediationsdk/s;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ironsource/mediationsdk/s;->l:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputq(Lcom/ironsource/mediationsdk/s;Landroid/os/CountDownTimer;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/mediationsdk/s;->q:Landroid/os/CountDownTimer;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputu(Lcom/ironsource/mediationsdk/s;Lcom/ironsource/Ae;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/mediationsdk/s;->u:Lcom/ironsource/Ae;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputw(Lcom/ironsource/mediationsdk/s;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ironsource/mediationsdk/s;->w:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputx(Lcom/ironsource/mediationsdk/s;J)V
    .locals 0

    iput-wide p1, p0, Lcom/ironsource/mediationsdk/s;->x:J

    return-void
.end method

.method static bridge synthetic -$$Nest$me(Lcom/ironsource/mediationsdk/s;)V
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/mediationsdk/s;->e()V

    return-void
.end method

.method static bridge synthetic -$$Nest$mh(Lcom/ironsource/mediationsdk/s;)Z
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/mediationsdk/s;->h()Z

    move-result p0

    return p0
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/ironsource/mediationsdk/s$e;->f:I

    iput v0, p0, Lcom/ironsource/mediationsdk/s;->b:I

    .line 5
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->k()Lcom/ironsource/l7;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/mediationsdk/s;->c:Lcom/ironsource/l7;

    .line 114
    const-string v0, "appKey"

    iput-object v0, p0, Lcom/ironsource/mediationsdk/s;->d:Ljava/lang/String;

    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/mediationsdk/s;->e:Ljava/lang/String;

    const/4 v0, 0x0

    .line 124
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->l:Z

    .line 128
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->n:Z

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/ironsource/mediationsdk/s;->r:Ljava/util/List;

    .line 138
    const-string v1, ""

    iput-object v1, p0, Lcom/ironsource/mediationsdk/s;->s:Ljava/lang/String;

    .line 153
    new-instance v1, Lcom/ironsource/mediationsdk/s$a;

    invoke-direct {v1, p0}, Lcom/ironsource/mediationsdk/s$a;-><init>(Lcom/ironsource/mediationsdk/s;)V

    iput-object v1, p0, Lcom/ironsource/mediationsdk/s;->z:Lcom/ironsource/mediationsdk/s$f;

    .line 154
    sget-object v1, Lcom/ironsource/environment/thread/IronSourceThreadManager;->INSTANCE:Lcom/ironsource/environment/thread/IronSourceThreadManager;

    invoke-virtual {v1}, Lcom/ironsource/environment/thread/IronSourceThreadManager;->getInitHandler()Landroid/os/Handler;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/s;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    .line 156
    iput v1, p0, Lcom/ironsource/mediationsdk/s;->f:I

    .line 157
    iput v0, p0, Lcom/ironsource/mediationsdk/s;->g:I

    const/16 v2, 0x3e

    .line 158
    iput v2, p0, Lcom/ironsource/mediationsdk/s;->h:I

    const/16 v2, 0xc

    .line 159
    iput v2, p0, Lcom/ironsource/mediationsdk/s;->i:I

    const/4 v2, 0x5

    .line 160
    iput v2, p0, Lcom/ironsource/mediationsdk/s;->j:I

    .line 162
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ironsource/mediationsdk/s;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 163
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->k:Z

    .line 164
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->w:Z

    .line 165
    new-instance v0, Lcom/ironsource/P9;

    invoke-direct {v0}, Lcom/ironsource/P9;-><init>()V

    iput-object v0, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    return-void
.end method

.method private static a(Lcom/ironsource/mediationsdk/s$d;)I
    .locals 1

    .line 26
    sget-object v0, Lcom/ironsource/mediationsdk/s$c;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 34
    sget p0, Lcom/ironsource/mediationsdk/s$e;->a:I

    return p0

    .line 35
    :cond_0
    sget p0, Lcom/ironsource/mediationsdk/s$e;->b:I

    return p0

    .line 36
    :cond_1
    sget p0, Lcom/ironsource/mediationsdk/s$e;->e:I

    return p0

    .line 37
    :cond_2
    sget p0, Lcom/ironsource/mediationsdk/s$e;->d:I

    return p0
.end method

.method public static declared-synchronized c()Lcom/ironsource/mediationsdk/s;
    .locals 2

    const-class v0, Lcom/ironsource/mediationsdk/s;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/ironsource/mediationsdk/s;->A:Lcom/ironsource/mediationsdk/s;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/ironsource/mediationsdk/s;

    invoke-direct {v1}, Lcom/ironsource/mediationsdk/s;-><init>()V

    sput-object v1, Lcom/ironsource/mediationsdk/s;->A:Lcom/ironsource/mediationsdk/s;

    .line 4
    :cond_0
    sget-object v1, Lcom/ironsource/mediationsdk/s;->A:Lcom/ironsource/mediationsdk/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private e()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->g()Lcom/ironsource/B7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/t5;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Lcom/ironsource/J7;->q()Lcom/ironsource/v1;

    move-result-object v0

    new-instance v1, Lcom/ironsource/B5;

    sget-object v2, Lcom/ironsource/C5;->v3:Lcom/ironsource/C5;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    :cond_0
    return-void
.end method

.method private h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->k:Z

    return v0
.end method


# virtual methods
.method public declared-synchronized a()Lcom/ironsource/mediationsdk/s$d;
    .locals 2

    monitor-enter p0

    .line 114
    :try_start_0
    sget-object v0, Lcom/ironsource/pe;->a:Lcom/ironsource/pe;

    invoke-virtual {v0}, Lcom/ironsource/pe;->a()Lcom/ironsource/oe;

    move-result-object v0

    .line 116
    invoke-static {}, Lcom/ironsource/mediationsdk/s$d;->values()[Lcom/ironsource/mediationsdk/s$d;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget-object v0, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;Lcom/ironsource/Ae;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-virtual {p2}, Lcom/ironsource/Ae;->f()Lcom/ironsource/X8;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/X8;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->i(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-virtual {p2}, Lcom/ironsource/Ae;->f()Lcom/ironsource/X8;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/X8;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->c(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-virtual {v0}, Lcom/ironsource/A1;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ironsource/P9;->a(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    .line 8
    invoke-virtual {v0}, Lcom/ironsource/A1;->c()Lcom/ironsource/y1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/y1;->b()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Lcom/ironsource/P9;->d(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    .line 12
    invoke-virtual {v0}, Lcom/ironsource/A1;->k()Lcom/ironsource/Qf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/Qf;->b()Lorg/json/JSONObject;

    move-result-object v0

    .line 13
    invoke-virtual {v1, v0}, Lcom/ironsource/P9;->b(Lorg/json/JSONObject;)V

    .line 15
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-static {p1}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getFirstSession(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/P9;->a(Ljava/lang/Boolean;)V

    .line 19
    invoke-virtual {p2}, Lcom/ironsource/Ae;->c()Lcom/ironsource/U3;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/ironsource/U3;->b()Lcom/ironsource/A1;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/ironsource/A1;->f()Lcom/ironsource/K1;

    move-result-object p1

    .line 22
    iget-object p2, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-virtual {p1}, Lcom/ironsource/K1;->b()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ironsource/P9;->b(I)V

    .line 23
    invoke-static {}, Lcom/ironsource/Ab;->O()Lcom/ironsource/I7;

    move-result-object p2

    .line 24
    invoke-interface {p2}, Lcom/ironsource/I7;->o()Lcom/ironsource/B7$a;

    move-result-object p2

    .line 25
    invoke-virtual {p1}, Lcom/ironsource/K1;->c()Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ironsource/B7$a;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method public varargs declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V
    .locals 2

    monitor-enter p0

    .line 38
    :try_start_0
    iget-object p4, p0, Lcom/ironsource/mediationsdk/s;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz p4, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p4, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 39
    sget-object p4, Lcom/ironsource/mediationsdk/s$d;->b:Lcom/ironsource/mediationsdk/s$d;

    invoke-virtual {p0, p4}, Lcom/ironsource/mediationsdk/s;->b(Lcom/ironsource/mediationsdk/s$d;)V

    .line 40
    iput-object p3, p0, Lcom/ironsource/mediationsdk/s;->s:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/ironsource/mediationsdk/s;->t:Ljava/lang/String;

    .line 43
    invoke-static {p1}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->isNetworkConnected(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 45
    iget-object p1, p0, Lcom/ironsource/mediationsdk/s;->m:Landroid/os/Handler;

    iget-object p2, p0, Lcom/ironsource/mediationsdk/s;->z:Lcom/ironsource/mediationsdk/s$f;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 47
    :cond_0
    iput-boolean v1, p0, Lcom/ironsource/mediationsdk/s;->n:Z

    .line 48
    iget-object p2, p0, Lcom/ironsource/mediationsdk/s;->p:Lcom/ironsource/environment/NetworkStateReceiver;

    if-nez p2, :cond_1

    .line 49
    new-instance p2, Lcom/ironsource/environment/NetworkStateReceiver;

    invoke-direct {p2, p1, p0}, Lcom/ironsource/environment/NetworkStateReceiver;-><init>(Landroid/content/Context;Lcom/ironsource/rc;)V

    iput-object p2, p0, Lcom/ironsource/mediationsdk/s;->p:Lcom/ironsource/environment/NetworkStateReceiver;

    .line 51
    :cond_1
    iget-object p2, p0, Lcom/ironsource/mediationsdk/s;->p:Lcom/ironsource/environment/NetworkStateReceiver;

    new-instance p3, Landroid/content/IntentFilter;

    const-string p4, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p3, p4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 55
    sget-object p1, Lcom/ironsource/environment/thread/IronSourceThreadManager;->INSTANCE:Lcom/ironsource/environment/thread/IronSourceThreadManager;

    new-instance p2, Lcom/ironsource/mediationsdk/s$b;

    invoke-direct {p2, p0}, Lcom/ironsource/mediationsdk/s$b;-><init>(Lcom/ironsource/mediationsdk/s;)V

    invoke-virtual {p1, p2}, Lcom/ironsource/environment/thread/IronSourceThreadManager;->postMediationBackgroundTask(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 93
    :cond_2
    invoke-static {}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->getLogger()Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;

    move-result-object p1

    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;->API:Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, Lcom/ironsource/mediationsdk/s;->e:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string p4, ": Multiple calls to init are not allowed"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x2

    .line 94
    invoke-virtual {p1, p2, p3, p4}, Lcom/ironsource/mediationsdk/logger/IronSourceLoggerManager;->log(Lcom/ironsource/mediationsdk/logger/IronSourceLogger$IronSourceTag;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 100
    :try_start_1
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 101
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a(Lcom/ironsource/Ac;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lcom/ironsource/mediationsdk/sdk/SegmentListener;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ironsource/mediationsdk/s;->v:Lcom/ironsource/mediationsdk/sdk/SegmentListener;

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 102
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->n:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 103
    iget-object p1, p0, Lcom/ironsource/mediationsdk/s;->q:Landroid/os/CountDownTimer;

    if-eqz p1, :cond_0

    .line 104
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    const/4 p1, 0x0

    .line 106
    iput-boolean p1, p0, Lcom/ironsource/mediationsdk/s;->n:Z

    const/4 v0, 0x1

    .line 107
    iput-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->k:Z

    .line 109
    invoke-static {p1}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getMediationAdditionalData(Z)Lorg/json/JSONObject;

    move-result-object p1

    .line 110
    new-instance v0, Lcom/ironsource/B5;

    sget-object v1, Lcom/ironsource/C5;->G:Lcom/ironsource/C5;

    invoke-direct {v0, v1, p1}, Lcom/ironsource/B5;-><init>(Lcom/ironsource/C5;Lorg/json/JSONObject;)V

    .line 112
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object p1

    invoke-interface {p1}, Lcom/ironsource/J7;->q()Lcom/ironsource/v1;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ironsource/u3;->a(Lcom/ironsource/B5;)V

    .line 113
    iget-object p1, p0, Lcom/ironsource/mediationsdk/s;->m:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->z:Lcom/ironsource/mediationsdk/s$f;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/mediationsdk/s;->b:I

    return v0
.end method

.method public b(Lcom/ironsource/Ac;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 8
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/ironsource/mediationsdk/s;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized b(Lcom/ironsource/mediationsdk/s$d;)V
    .locals 3

    const-string v0, "old status: "

    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v1, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/s;->a()Lcom/ironsource/mediationsdk/s$d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", new status: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v1, v0}, Lcom/ironsource/mediationsdk/logger/IronLog;->verbose(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/ironsource/oe;->values()[Lcom/ironsource/oe;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget-object p1, v0, p1

    .line 7
    sget-object v0, Lcom/ironsource/pe;->a:Lcom/ironsource/pe;

    invoke-virtual {v0, p1}, Lcom/ironsource/pe;->a(Lcom/ironsource/oe;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized d()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/ironsource/mediationsdk/s;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method f()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/s$d;->c:Lcom/ironsource/mediationsdk/s$d;

    invoke-virtual {p0, v0}, Lcom/ironsource/mediationsdk/s;->b(Lcom/ironsource/mediationsdk/s$d;)V

    return-void
.end method

.method public declared-synchronized g()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/mediationsdk/s;->a()Lcom/ironsource/mediationsdk/s$d;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/s;->a(Lcom/ironsource/mediationsdk/s$d;)I

    move-result v0

    iput v0, p0, Lcom/ironsource/mediationsdk/s;->b:I

    .line 2
    iget-object v1, p0, Lcom/ironsource/mediationsdk/s;->y:Lcom/ironsource/P9;

    invoke-virtual {v1, v0}, Lcom/ironsource/P9;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
