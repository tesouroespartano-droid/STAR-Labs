.class public final Lcom/ironsource/tf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/R8;
.implements Lcom/ironsource/R8$a;


# instance fields
.field private a:Lcom/ironsource/sf;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/ironsource/sf;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/tf;->a:Lcom/ironsource/sf;

    return-object v0
.end method

.method public a(Lcom/ironsource/sf;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ironsource/tf;->a:Lcom/ironsource/sf;

    return-void
.end method
