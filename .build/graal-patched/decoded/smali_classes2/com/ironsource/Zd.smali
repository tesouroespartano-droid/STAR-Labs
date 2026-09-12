.class public final Lcom/ironsource/Zd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/I8;
.implements Lcom/ironsource/I8$a;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdkConfigService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkConfigService.kt\ncom/ironsource/services/SdkConfigService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"
.end annotation


# instance fields
.field private a:Lcom/ironsource/Yd;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/ironsource/Ra;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Zd;->a:Lcom/ironsource/Yd;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/ironsource/Ra;

    invoke-direct {v1, v0}, Lcom/ironsource/Ra;-><init>(Lcom/ironsource/Yd;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/ironsource/Yd;)V
    .locals 1

    const-string v0, "sdkConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/Zd;->a:Lcom/ironsource/Yd;

    return-void
.end method

.method public b()Lcom/ironsource/I9;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ironsource/Zd;->a:Lcom/ironsource/Yd;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/ironsource/I9;

    invoke-direct {v1, v0}, Lcom/ironsource/I9;-><init>(Lcom/ironsource/Yd;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ironsource/Zd;->b:Z

    return v0
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ironsource/Zd;->b:Z

    return-void
.end method
