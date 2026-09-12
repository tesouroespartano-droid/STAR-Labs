.class public Lcom/ironsource/Zc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Zc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Lcom/ironsource/dd;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ironsource/Zc$a;->a:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/ironsource/Zc$a;->b:Z

    .line 4
    iput-boolean v0, p0, Lcom/ironsource/Zc$a;->c:Z

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/ironsource/Zc$a;->d:Lcom/ironsource/dd;

    .line 6
    iput v0, p0, Lcom/ironsource/Zc$a;->e:I

    .line 7
    iput v0, p0, Lcom/ironsource/Zc$a;->f:I

    return-void
.end method


# virtual methods
.method public a(Z)Lcom/ironsource/Zc$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ironsource/Zc$a;->a:Z

    return-object p0
.end method

.method public a(ZI)Lcom/ironsource/Zc$a;
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ironsource/Zc$a;->c:Z

    .line 6
    iput p2, p0, Lcom/ironsource/Zc$a;->f:I

    return-object p0
.end method

.method public a(ZLcom/ironsource/dd;I)Lcom/ironsource/Zc$a;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ironsource/Zc$a;->b:Z

    if-nez p2, :cond_0

    .line 3
    sget-object p2, Lcom/ironsource/dd;->b:Lcom/ironsource/dd;

    :cond_0
    iput-object p2, p0, Lcom/ironsource/Zc$a;->d:Lcom/ironsource/dd;

    .line 4
    iput p3, p0, Lcom/ironsource/Zc$a;->e:I

    return-object p0
.end method

.method public a()Lcom/ironsource/Zc;
    .locals 8

    .line 7
    new-instance v0, Lcom/ironsource/Zc;

    iget-boolean v1, p0, Lcom/ironsource/Zc$a;->a:Z

    iget-boolean v2, p0, Lcom/ironsource/Zc$a;->b:Z

    iget-boolean v3, p0, Lcom/ironsource/Zc$a;->c:Z

    iget-object v4, p0, Lcom/ironsource/Zc$a;->d:Lcom/ironsource/dd;

    iget v5, p0, Lcom/ironsource/Zc$a;->e:I

    iget v6, p0, Lcom/ironsource/Zc$a;->f:I

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/ironsource/Zc;-><init>(ZZZLcom/ironsource/dd;IILcom/ironsource/Zc-IA;)V

    return-object v0
.end method
