.class Lcom/ironsource/Z5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/Dc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/Z5;->a(Lcom/ironsource/z8;Ljava/lang/String;IILcom/ironsource/Dc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ironsource/Dc;

.field final synthetic b:Lcom/ironsource/Z5;


# direct methods
.method constructor <init>(Lcom/ironsource/Z5;Lcom/ironsource/Dc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ironsource/Z5$a;->b:Lcom/ironsource/Z5;

    iput-object p2, p0, Lcom/ironsource/Z5$a;->a:Lcom/ironsource/Dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/z8;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Z5$a;->a:Lcom/ironsource/Dc;

    invoke-interface {v0, p1}, Lcom/ironsource/Dc;->a(Lcom/ironsource/z8;)V

    .line 3
    :try_start_0
    new-instance v0, Lcom/ironsource/Z5$a$a;

    invoke-direct {v0, p0}, Lcom/ironsource/Z5$a$a;-><init>(Lcom/ironsource/Z5$a;)V

    .line 9
    iget-object v1, p0, Lcom/ironsource/Z5$a;->b:Lcom/ironsource/Z5;

    invoke-static {v1}, Lcom/ironsource/Z5;->-$$Nest$fgetd(Lcom/ironsource/Z5;)Lcom/ironsource/Db;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/ironsource/Db;->a(Ljava/lang/String;Lorg/json/JSONObject;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 11
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 12
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/ironsource/z8;Lcom/ironsource/r8;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ironsource/Z5$a;->a:Lcom/ironsource/Dc;

    invoke-interface {v0, p1, p2}, Lcom/ironsource/Dc;->a(Lcom/ironsource/z8;Lcom/ironsource/r8;)V

    return-void
.end method
