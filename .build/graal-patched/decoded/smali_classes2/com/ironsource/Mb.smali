.class public final Lcom/ironsource/Mb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/I;


# instance fields
.field private final a:Lcom/ironsource/Eb;


# direct methods
.method public constructor <init>(Lcom/ironsource/Eb;)V
    .locals 1

    const-string v0, "nativeAdBinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ironsource/Mb;->a:Lcom/ironsource/Eb;

    return-void
.end method


# virtual methods
.method public a(Lcom/ironsource/Lb;)V
    .locals 1

    const-string v0, "nativeAdInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/Mb;->a:Lcom/ironsource/Eb;

    invoke-virtual {p1, v0}, Lcom/ironsource/Lb;->a(Lcom/ironsource/Eb;)V

    return-void
.end method
