.class Lcom/ironsource/o3$c;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/o3;->onAdEnded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ironsource/o3;


# direct methods
.method constructor <init>(Lcom/ironsource/o3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/o3$c;->b:Lcom/ironsource/o3;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/o3$c;->b:Lcom/ironsource/o3;

    invoke-static {v0}, Lcom/ironsource/o3;->-$$Nest$mQ(Lcom/ironsource/o3;)V

    return-void
.end method
