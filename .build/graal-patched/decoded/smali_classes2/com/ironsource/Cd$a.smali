.class public final Lcom/ironsource/Cd$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Kf$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Cd;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Cd;


# direct methods
.method constructor <init>(Lcom/ironsource/Cd;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/Cd$a;->a:Lcom/ironsource/Cd;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Cd$a;->a:Lcom/ironsource/Cd;

    sget-object v1, Lcom/ironsource/y5;->a:Lcom/ironsource/y5;

    invoke-virtual {v1}, Lcom/ironsource/y5;->s()Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/Cd;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method
