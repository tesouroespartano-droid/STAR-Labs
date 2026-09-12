.class Lcom/ironsource/kb$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/ca;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/kb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/kb;


# direct methods
.method constructor <init>(Lcom/ironsource/kb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/kb$a;->a:Lcom/ironsource/kb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/kb$a;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetc(Lcom/ironsource/kb;)Lcom/ironsource/Lf;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/Lf;->c(J)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/kb$a;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$mc(Lcom/ironsource/kb;)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/kb$a;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetc(Lcom/ironsource/kb;)Lcom/ironsource/Lf;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ironsource/Lf;->b(J)V

    .line 2
    iget-object v0, p0, Lcom/ironsource/kb$a;->a:Lcom/ironsource/kb;

    invoke-static {v0}, Lcom/ironsource/kb;->-$$Nest$fgetc(Lcom/ironsource/kb;)Lcom/ironsource/Lf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ironsource/Lf;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/ironsource/kb;->-$$Nest$mb(Lcom/ironsource/kb;J)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
