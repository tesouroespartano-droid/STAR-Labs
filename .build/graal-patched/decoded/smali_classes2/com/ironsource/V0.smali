.class public Lcom/ironsource/V0;
.super Lcom/ironsource/n0;
.source "SourceFile"


# instance fields
.field private final g:Lcom/ironsource/n0;

.field private final h:Lcom/ironsource/R0;

.field private i:Lcom/ironsource/h2;


# direct methods
.method public constructor <init>(Lcom/ironsource/V0;Lcom/ironsource/D0$b;)V
    .locals 1

    const-string v0, "adUnitTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/D0$b;)V

    .line 9
    iget-object p2, p1, Lcom/ironsource/V0;->g:Lcom/ironsource/n0;

    iput-object p2, p0, Lcom/ironsource/V0;->g:Lcom/ironsource/n0;

    .line 10
    iget-object p2, p1, Lcom/ironsource/V0;->h:Lcom/ironsource/R0;

    iput-object p2, p0, Lcom/ironsource/V0;->h:Lcom/ironsource/R0;

    .line 11
    iget-object p1, p1, Lcom/ironsource/V0;->i:Lcom/ironsource/h2;

    iput-object p1, p0, Lcom/ironsource/V0;->i:Lcom/ironsource/h2;

    return-void
.end method

.method public constructor <init>(Lcom/ironsource/n0;Lcom/ironsource/v0;Lcom/ironsource/D0$b;)V
    .locals 1

    const-string v0, "adTools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/ironsource/n0;-><init>(Lcom/ironsource/n0;Lcom/ironsource/D0$b;)V

    .line 2
    iput-object p1, p0, Lcom/ironsource/V0;->g:Lcom/ironsource/n0;

    .line 5
    invoke-virtual {p2}, Lcom/ironsource/v0;->e()Lcom/ironsource/p2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/p2;->c()I

    move-result p1

    .line 6
    invoke-static {p2, p1}, Lcom/ironsource/jf;->a(Lcom/ironsource/v0;I)Lcom/ironsource/R0;

    move-result-object p1

    const-string p2, "getAdUnitPerformance(\n  \u2026auctionSavedHistoryLimit)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iput-object p1, p0, Lcom/ironsource/V0;->h:Lcom/ironsource/R0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/A;)Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/A;",
            ")",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "**>;"
        }
    .end annotation

    const-string v0, "instanceData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/ironsource/mediationsdk/c;->b()Lcom/ironsource/mediationsdk/c;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/ironsource/A;->u()Lcom/ironsource/mediationsdk/model/NetworkSettings;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Lcom/ironsource/A;->h()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v2

    .line 6
    invoke-virtual {p1}, Lcom/ironsource/A;->i()Lcom/ironsource/v0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/v0;->b()Lcom/ironsource/f0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ironsource/f0;->b()Ljava/util/UUID;

    move-result-object p1

    .line 7
    invoke-virtual {v0, v1, v2, p1}, Lcom/ironsource/mediationsdk/c;->a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;)Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;)Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/mediationsdk/model/NetworkSettings;",
            "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter<",
            "**>;"
        }
    .end annotation

    const-string v0, "providerSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adFormat"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/ironsource/mediationsdk/c;->b()Lcom/ironsource/mediationsdk/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ironsource/mediationsdk/c;->a(Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;)Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;

    move-result-object p1

    return-object p1
.end method

.method public final a(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "instanceName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {p1, p2, p3}, Lcom/ironsource/mediationsdk/utils/IronSourceUtils;->getTransId(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getTransId(timeStamp, instanceName)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final a(Lcom/ironsource/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ironsource/V0;->i:Lcom/ironsource/h2;

    return-void
.end method

.method public final c(Lcom/ironsource/Vd;)V
    .locals 7

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/ironsource/kf;->a:Lcom/ironsource/kf;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/ironsource/kf;->a(Lcom/ironsource/kf;Ljava/lang/Runnable;JILjava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "serverData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/mediationsdk/d;->b()Lcom/ironsource/mediationsdk/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/d;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getInstance().getDynamic\u2026romServerData(serverData)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h()Lcom/ironsource/R0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/V0;->h:Lcom/ironsource/R0;

    return-object v0
.end method

.method public final i()Lcom/ironsource/h2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/V0;->i:Lcom/ironsource/h2;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ironsource/mediationsdk/p;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/ironsource/mediationsdk/IronSourceSegment;
    .locals 1

    .line 1
    invoke-static {}, Lcom/ironsource/jf;->a()Lcom/ironsource/mediationsdk/IronSourceSegment;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lcom/ironsource/M8$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Ab;->s:Lcom/ironsource/Ab$b;

    invoke-virtual {v0}, Lcom/ironsource/Ab$b;->a()Lcom/ironsource/I7;

    move-result-object v0

    invoke-interface {v0}, Lcom/ironsource/I7;->h()Lcom/ironsource/M8$a;

    move-result-object v0

    return-object v0
.end method
