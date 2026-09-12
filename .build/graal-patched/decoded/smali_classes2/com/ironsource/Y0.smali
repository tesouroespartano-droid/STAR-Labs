.class public Lcom/ironsource/Y0;
.super Lcom/ironsource/Td;
.source "SourceFile"


# static fields
.field private static h:Ljava/lang/String; = "type"

.field private static i:Ljava/lang/String; = "numOfAdUnits"

.field private static j:Ljava/lang/String; = "firstCampaignCredits"

.field private static k:Ljava/lang/String; = "totalNumberCredits"

.field private static l:Ljava/lang/String; = "productType"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ironsource/Td;-><init>(Ljava/lang/String;)V

    .line 3
    sget-object p1, Lcom/ironsource/Y0;->h:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    sget-object p1, Lcom/ironsource/Y0;->h:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Y0;->k(Ljava/lang/String;)V

    .line 7
    :cond_0
    sget-object p1, Lcom/ironsource/Y0;->i:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    sget-object p1, Lcom/ironsource/Y0;->i:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Y0;->h(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 9
    invoke-direct {p0, p1}, Lcom/ironsource/Y0;->a(Z)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lcom/ironsource/Y0;->a(Z)V

    .line 14
    :goto_0
    sget-object p1, Lcom/ironsource/Y0;->j:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 15
    sget-object p1, Lcom/ironsource/Y0;->j:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Y0;->g(Ljava/lang/String;)V

    .line 18
    :cond_2
    sget-object p1, Lcom/ironsource/Y0;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 19
    sget-object p1, Lcom/ironsource/Y0;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Y0;->j(Ljava/lang/String;)V

    .line 22
    :cond_3
    sget-object p1, Lcom/ironsource/Y0;->l:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 23
    sget-object p1, Lcom/ironsource/Y0;->l:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ironsource/Td;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ironsource/Y0;->i(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method private a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ironsource/Y0;->g:Z

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Y0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Y0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Y0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Y0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Y0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Y0;->e:Ljava/lang/String;

    return-void
.end method

.method public g()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/ironsource/Y0;->g:Z

    return v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Y0;->d:Ljava/lang/String;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Y0;->c:Ljava/lang/String;

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Y0;->f:Ljava/lang/String;

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/Y0;->b:Ljava/lang/String;

    return-void
.end method
