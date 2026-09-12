.class Lcom/ironsource/mb$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/mb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field final synthetic b:Lcom/ironsource/mb;


# direct methods
.method private constructor <init>(Lcom/ironsource/mb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/mb$a;->b:Lcom/ironsource/mb;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ironsource/mb;Lcom/ironsource/mb-IA;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ironsource/mb$a;-><init>(Lcom/ironsource/mb;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mb$a;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 6
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ironsource/mb$a;->a:Landroid/os/Handler;

    .line 12
    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method
