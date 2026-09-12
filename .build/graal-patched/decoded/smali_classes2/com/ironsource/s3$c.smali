.class Lcom/ironsource/s3$c;
.super Lcom/ironsource/Vd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/s3;->onInitFailed(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/ironsource/s3;


# direct methods
.method constructor <init>(Lcom/ironsource/s3;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/s3$c;->d:Lcom/ironsource/s3;

    iput p2, p0, Lcom/ironsource/s3$c;->b:I

    iput-object p3, p0, Lcom/ironsource/s3$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Lcom/ironsource/Vd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ironsource/s3$c;->d:Lcom/ironsource/s3;

    iget v1, p0, Lcom/ironsource/s3$c;->b:I

    iget-object v2, p0, Lcom/ironsource/s3$c;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ironsource/s3;->-$$Nest$ma(Lcom/ironsource/s3;ILjava/lang/String;)V

    return-void
.end method
