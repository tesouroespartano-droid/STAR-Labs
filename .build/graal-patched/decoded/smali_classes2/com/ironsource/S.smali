.class public final Lcom/ironsource/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/bg;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ironsource/j9;

.field private final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ironsource/j9;Z)V
    .locals 1

    const-string v0, "adm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/S;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/ironsource/S;->b:Lcom/ironsource/j9;

    .line 4
    iput-boolean p3, p0, Lcom/ironsource/S;->c:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ironsource/ce;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/S;->c:Z

    sget-object v1, Lcom/ironsource/S$a;->a:Lcom/ironsource/S$a;

    invoke-interface {p0, v0, v1}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 3
    iget-object v0, p0, Lcom/ironsource/S;->b:Lcom/ironsource/j9;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    sget-object v3, Lcom/ironsource/S$b;->a:Lcom/ironsource/S$b;

    invoke-interface {p0, v0, v3}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 5
    iget-object v0, p0, Lcom/ironsource/S;->b:Lcom/ironsource/j9;

    if-eqz v0, :cond_7

    .line 6
    invoke-interface {v0}, Lcom/ironsource/c1;->f()Lcom/ironsource/l9;

    move-result-object v3

    sget-object v4, Lcom/ironsource/l9;->c:Lcom/ironsource/l9;

    if-ne v3, v4, :cond_2

    .line 7
    iget-object v3, p0, Lcom/ironsource/S;->a:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    sget-object v4, Lcom/ironsource/S$c;->a:Lcom/ironsource/S$c;

    invoke-interface {p0, v3, v4}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 10
    :cond_2
    invoke-interface {v0}, Lcom/ironsource/c1;->f()Lcom/ironsource/l9;

    move-result-object v3

    sget-object v4, Lcom/ironsource/l9;->d:Lcom/ironsource/l9;

    if-ne v3, v4, :cond_4

    .line 11
    iget-object v3, p0, Lcom/ironsource/S;->a:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_3

    move v3, v1

    goto :goto_2

    :cond_3
    move v3, v2

    :goto_2
    sget-object v4, Lcom/ironsource/S$d;->a:Lcom/ironsource/S$d;

    invoke-interface {p0, v3, v4}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 14
    :cond_4
    invoke-interface {v0}, Lcom/ironsource/c1;->f()Lcom/ironsource/l9;

    move-result-object v3

    sget-object v4, Lcom/ironsource/l9;->e:Lcom/ironsource/l9;

    if-eq v3, v4, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    move v3, v2

    :goto_3
    sget-object v4, Lcom/ironsource/S$e;->a:Lcom/ironsource/S$e;

    invoke-interface {p0, v3, v4}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    .line 18
    invoke-interface {v0}, Lcom/ironsource/c1;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    goto :goto_4

    :cond_6
    move v1, v2

    :goto_4
    sget-object v0, Lcom/ironsource/S$f;->a:Lcom/ironsource/S$f;

    invoke-interface {p0, v1, v0}, Lcom/ironsource/bg;->a(ZLkotlin/jvm/functions/Function0;)V

    :cond_7
    return-void
.end method
