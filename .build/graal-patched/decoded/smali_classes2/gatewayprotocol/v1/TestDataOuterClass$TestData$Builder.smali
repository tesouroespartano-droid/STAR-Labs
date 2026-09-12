.class public final Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "TestDataOuterClass.java"

# interfaces
.implements Lgatewayprotocol/v1/TestDataOuterClass$TestDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgatewayprotocol/v1/TestDataOuterClass$TestData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lgatewayprotocol/v1/TestDataOuterClass$TestData;",
        "Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;",
        ">;",
        "Lgatewayprotocol/v1/TestDataOuterClass$TestDataOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 438
    invoke-static {}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$000()Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lgatewayprotocol/v1/TestDataOuterClass$1;)V
    .locals 0

    .line 431
    invoke-direct {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearForceCampaignId()Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 483
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 484
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$200(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V

    return-object p0
.end method

.method public clearForceCountry()Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 540
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 541
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$500(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V

    return-object p0
.end method

.method public clearForceCountrySubdivision()Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 597
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 598
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$800(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V

    return-object p0
.end method

.method public clearForceExchangeTestMode()Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 680
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 681
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$1100(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V

    return-object p0
.end method

.method public getForceCampaignId()Ljava/lang/String;
    .locals 1

    .line 456
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCampaignId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getForceCampaignIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 465
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCampaignIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getForceCountry()Ljava/lang/String;
    .locals 1

    .line 513
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCountry()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getForceCountryBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 522
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCountryBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getForceCountrySubdivision()Ljava/lang/String;
    .locals 1

    .line 570
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCountrySubdivision()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getForceCountrySubdivisionBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 579
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceCountrySubdivisionBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getForceExchangeTestMode()I
    .locals 1

    .line 645
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->getForceExchangeTestMode()I

    move-result v0

    return v0
.end method

.method public hasForceCampaignId()Z
    .locals 1

    .line 448
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->hasForceCampaignId()Z

    move-result v0

    return v0
.end method

.method public hasForceCountry()Z
    .locals 1

    .line 505
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->hasForceCountry()Z

    move-result v0

    return v0
.end method

.method public hasForceCountrySubdivision()Z
    .locals 1

    .line 562
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->hasForceCountrySubdivision()Z

    move-result v0

    return v0
.end method

.method public hasForceExchangeTestMode()Z
    .locals 1

    .line 628
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-virtual {v0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->hasForceExchangeTestMode()Z

    move-result v0

    return v0
.end method

.method public setForceCampaignId(Ljava/lang/String;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 474
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 475
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$100(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Ljava/lang/String;)V

    return-object p0
.end method

.method public setForceCampaignIdBytes(Lcom/google/protobuf/ByteString;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 494
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 495
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$300(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setForceCountry(Ljava/lang/String;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 531
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 532
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$400(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Ljava/lang/String;)V

    return-object p0
.end method

.method public setForceCountryBytes(Lcom/google/protobuf/ByteString;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 551
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 552
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$600(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setForceCountrySubdivision(Ljava/lang/String;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 588
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 589
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$700(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Ljava/lang/String;)V

    return-object p0
.end method

.method public setForceCountrySubdivisionBytes(Lcom/google/protobuf/ByteString;)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 608
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 609
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$900(Lgatewayprotocol/v1/TestDataOuterClass$TestData;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setForceExchangeTestMode(I)Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;
    .locals 1

    .line 662
    invoke-virtual {p0}, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->copyOnWrite()V

    .line 663
    iget-object v0, p0, Lgatewayprotocol/v1/TestDataOuterClass$TestData$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lgatewayprotocol/v1/TestDataOuterClass$TestData;

    invoke-static {v0, p1}, Lgatewayprotocol/v1/TestDataOuterClass$TestData;->access$1000(Lgatewayprotocol/v1/TestDataOuterClass$TestData;I)V

    return-object p0
.end method
