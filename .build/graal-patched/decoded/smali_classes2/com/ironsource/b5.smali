.class public Lcom/ironsource/b5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static h:Lcom/ironsource/b5;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private final g:Lcom/ironsource/z7;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/ironsource/Ab;->U()Lcom/ironsource/J7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/J7;->i()Lcom/ironsource/z7;

    move-result-object v0

    iput-object v0, p0, Lcom/ironsource/b5;->g:Lcom/ironsource/z7;

    .line 4
    invoke-interface {v0}, Lcom/ironsource/z7;->q()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/b5;->a:Ljava/lang/String;

    .line 5
    invoke-interface {v0}, Lcom/ironsource/z7;->l()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/b5;->b:Ljava/lang/String;

    .line 6
    invoke-interface {v0}, Lcom/ironsource/z7;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/b5;->c:Ljava/lang/String;

    .line 7
    invoke-interface {v0}, Lcom/ironsource/z7;->i()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/b5;->d:Ljava/lang/String;

    .line 8
    invoke-interface {v0}, Lcom/ironsource/z7;->e()I

    move-result v1

    iput v1, p0, Lcom/ironsource/b5;->e:I

    .line 9
    invoke-interface {v0, p1}, Lcom/ironsource/z7;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/b5;->f:Ljava/lang/String;

    return-void
.end method

.method public static b(Landroid/content/Context;)Lcom/ironsource/b5;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/b5;->h:Lcom/ironsource/b5;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ironsource/b5;

    invoke-direct {v0, p0}, Lcom/ironsource/b5;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/ironsource/b5;->h:Lcom/ironsource/b5;

    .line 4
    :cond_0
    sget-object p0, Lcom/ironsource/b5;->h:Lcom/ironsource/b5;

    return-object p0
.end method

.method public static g()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lcom/ironsource/b5;->h:Lcom/ironsource/b5;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)F
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ironsource/b5;->g:Lcom/ironsource/z7;

    invoke-interface {v0, p1}, Lcom/ironsource/z7;->E(Landroid/content/Context;)F

    move-result p1

    return p1
.end method

.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/b5;->e:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ironsource/b5;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b5;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b5;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b5;->c:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/b5;->d:Ljava/lang/String;

    return-object v0
.end method
