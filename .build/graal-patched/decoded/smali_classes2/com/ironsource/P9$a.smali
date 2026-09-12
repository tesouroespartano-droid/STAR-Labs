.class Lcom/ironsource/P9$a;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/P9;->a(Lcom/ironsource/fe;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/fe;

.field final synthetic c:Lcom/ironsource/P9;


# direct methods
.method constructor <init>(Lcom/ironsource/P9;Lcom/ironsource/fe;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/P9$a;->c:Lcom/ironsource/P9;

    iput-object p2, p0, Lcom/ironsource/P9$a;->b:Lcom/ironsource/fe;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/P9$a;->c:Lcom/ironsource/P9;

    iget-object v0, v0, Lcom/ironsource/P9;->a:Lcom/ironsource/T6;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iget-object v2, p0, Lcom/ironsource/P9$a;->b:Lcom/ironsource/fe;

    .line 2
    invoke-virtual {v2}, Lcom/ironsource/fe;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    move-result-object v1

    .line 3
    const-string v2, "inm"

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/T6;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    return-void
.end method
