.class public Lcom/ironsource/Zc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Zc$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Lcom/ironsource/dd;

.field private e:I

.field private f:I


# direct methods
.method private constructor <init>(ZZZLcom/ironsource/dd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/ironsource/Zc;->a:Z

    .line 3
    iput-boolean p2, p0, Lcom/ironsource/Zc;->b:Z

    .line 4
    iput-boolean p3, p0, Lcom/ironsource/Zc;->c:Z

    .line 5
    iput-object p4, p0, Lcom/ironsource/Zc;->d:Lcom/ironsource/dd;

    .line 6
    iput p5, p0, Lcom/ironsource/Zc;->e:I

    .line 7
    iput p6, p0, Lcom/ironsource/Zc;->f:I

    return-void
.end method

.method synthetic constructor <init>(ZZZLcom/ironsource/dd;IILcom/ironsource/Zc-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/ironsource/Zc;-><init>(ZZZLcom/ironsource/dd;II)V

    return-void
.end method


# virtual methods
.method public a()Lcom/ironsource/dd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Zc;->d:Lcom/ironsource/dd;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/Zc;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/Zc;->f:I

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/Zc;->b:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/Zc;->a:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/Zc;->c:Z

    return v0
.end method
