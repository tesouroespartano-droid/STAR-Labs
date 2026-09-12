.class public final Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SessionCountersOuterClass.java"

# interfaces
.implements Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCountersOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;",
        "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;",
        ">;",
        "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCountersOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 503
    invoke-static {}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$000()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lgatewayprotocol/v1/SessionCountersOuterClass$1;)V
    .locals 0

    .line 496
    invoke-direct {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearBannerImpressions()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 702
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 703
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1000(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearBannerLoadRequests()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 622
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 623
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$600(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearBannerRequestsAdm()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 662
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 663
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$800(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearFocusChangeCount()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 822
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 823
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1600(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearGlobalAdsFocusChangeCount()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 782
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 783
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1400(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearGlobalAdsFocusTime()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 742
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 743
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1200(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearLoadRequests()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 542
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 543
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$200(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public clearLoadRequestsAdm()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 582
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 583
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$400(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V

    return-object p0
.end method

.method public getBannerImpressions()I
    .locals 1

    .line 677
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getBannerImpressions()I

    move-result v0

    return v0
.end method

.method public getBannerLoadRequests()I
    .locals 1

    .line 597
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getBannerLoadRequests()I

    move-result v0

    return v0
.end method

.method public getBannerRequestsAdm()I
    .locals 1

    .line 637
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getBannerRequestsAdm()I

    move-result v0

    return v0
.end method

.method public getFocusChangeCount()I
    .locals 1

    .line 797
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getFocusChangeCount()I

    move-result v0

    return v0
.end method

.method public getGlobalAdsFocusChangeCount()I
    .locals 1

    .line 757
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getGlobalAdsFocusChangeCount()I

    move-result v0

    return v0
.end method

.method public getGlobalAdsFocusTime()I
    .locals 1

    .line 717
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getGlobalAdsFocusTime()I

    move-result v0

    return v0
.end method

.method public getLoadRequests()I
    .locals 1

    .line 517
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getLoadRequests()I

    move-result v0

    return v0
.end method

.method public getLoadRequestsAdm()I
    .locals 1

    .line 557
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-virtual {v0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->getLoadRequestsAdm()I

    move-result v0

    return v0
.end method

.method public setBannerImpressions(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 689
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 690
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$900(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setBannerLoadRequests(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 609
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 610
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$500(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setBannerRequestsAdm(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 649
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 650
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$700(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setFocusChangeCount(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 809
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 810
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1500(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setGlobalAdsFocusChangeCount(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 769
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 770
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1300(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setGlobalAdsFocusTime(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 729
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 730
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$1100(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setLoadRequests(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 529
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 530
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$100(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method

.method public setLoadRequestsAdm(I)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;
    .locals 1

    .line 569
    invoke-virtual {p0}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->copyOnWrite()V

    .line 570
    iget-object v0, p0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;->access$300(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;I)V

    return-object p0
.end method
