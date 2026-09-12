.class public final Lcom/ironsource/mediationsdk/model/InterstitialPlacement;
.super Lcom/ironsource/mediationsdk/model/BasePlacement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Deprecated;
    message = "This class is deprecated and will be removed in version 9.0.0."
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/String;ZLcom/ironsource/Zc;)V
    .locals 1

    const-string v0, "placementName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ironsource/mediationsdk/model/BasePlacement;-><init>(ILjava/lang/String;ZLcom/ironsource/Zc;)V

    return-void
.end method
