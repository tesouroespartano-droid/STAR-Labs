.class public final Lcom/ironsource/Q1$a;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Q1;->a(Lcom/ironsource/Q1$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/B3;

.field final synthetic c:Lcom/ironsource/Q1;

.field final synthetic d:Lcom/ironsource/B3$b;


# direct methods
.method constructor <init>(Lcom/ironsource/B3;Lcom/ironsource/Q1;Lcom/ironsource/B3$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Q1$a;->b:Lcom/ironsource/B3;

    iput-object p2, p0, Lcom/ironsource/Q1$a;->c:Lcom/ironsource/Q1;

    iput-object p3, p0, Lcom/ironsource/Q1$a;->d:Lcom/ironsource/B3$b;

    .line 1
    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ironsource/Q1$a;->b:Lcom/ironsource/B3;

    .line 2
    iget-object v1, p0, Lcom/ironsource/Q1$a;->c:Lcom/ironsource/Q1;

    invoke-virtual {v1}, Lcom/ironsource/Q1;->e()Ljava/util/List;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/ironsource/Q1$a;->d:Lcom/ironsource/B3$b;

    .line 4
    iget-object v3, p0, Lcom/ironsource/Q1$a;->c:Lcom/ironsource/Q1;

    invoke-static {v3}, Lcom/ironsource/Q1;->b(Lcom/ironsource/Q1;)Lcom/ironsource/v0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ironsource/v0;->f()J

    move-result-wide v3

    .line 5
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/ironsource/B3;->a(Ljava/util/List;Lcom/ironsource/B3$b;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method
