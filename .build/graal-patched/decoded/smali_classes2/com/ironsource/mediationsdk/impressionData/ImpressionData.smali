.class public Lcom/ironsource/mediationsdk/impressionData/ImpressionData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final IMPRESSION_DATA_KEY_ABTEST:Ljava/lang/String; = "ab"

.field public static final IMPRESSION_DATA_KEY_AD_FORMAT:Ljava/lang/String; = "adFormat"

.field public static final IMPRESSION_DATA_KEY_AD_NETWORK:Ljava/lang/String; = "adNetwork"

.field public static final IMPRESSION_DATA_KEY_AD_UNIT:Ljava/lang/String; = "adUnit"

.field public static final IMPRESSION_DATA_KEY_AUCTION_ID:Ljava/lang/String; = "auctionId"

.field public static final IMPRESSION_DATA_KEY_COUNTRY:Ljava/lang/String; = "country"

.field public static final IMPRESSION_DATA_KEY_CREATIVE_ID:Ljava/lang/String; = "creativeId"

.field public static final IMPRESSION_DATA_KEY_ENCRYPTED_CPM:Ljava/lang/String; = "encryptedCPM"

.field public static final IMPRESSION_DATA_KEY_INSTANCE_ID:Ljava/lang/String; = "instanceId"

.field public static final IMPRESSION_DATA_KEY_INSTANCE_NAME:Ljava/lang/String; = "instanceName"

.field public static final IMPRESSION_DATA_KEY_LIFETIME_REVENUE:Ljava/lang/String; = "lifetimeRevenue"

.field public static final IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID:Ljava/lang/String; = "mediationAdUnitId"

.field public static final IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME:Ljava/lang/String; = "mediationAdUnitName"

.field public static final IMPRESSION_DATA_KEY_PLACEMENT:Ljava/lang/String; = "placement"

.field public static final IMPRESSION_DATA_KEY_PRECISION:Ljava/lang/String; = "precision"

.field public static final IMPRESSION_DATA_KEY_REVENUE:Ljava/lang/String; = "revenue"

.field public static final IMPRESSION_DATA_KEY_SEGMENT_NAME:Ljava/lang/String; = "segmentName"


# instance fields
.field private a:Lorg/json/JSONObject;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/Double;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/Double;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/text/DecimalFormat;


# direct methods
.method public constructor <init>(Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    .line 53
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    .line 54
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    .line 56
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    .line 57
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    .line 58
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    .line 59
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    .line 61
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    .line 62
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    .line 63
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    .line 64
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    .line 65
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    .line 66
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    .line 69
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#.#####"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->s:Ljava/text/DecimalFormat;

    .line 104
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->a:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->a:Lorg/json/JSONObject;

    .line 105
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    .line 106
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    .line 107
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    .line 108
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    .line 109
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    .line 110
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    .line 111
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    .line 112
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    .line 113
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    .line 114
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    .line 115
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    .line 116
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    .line 117
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    .line 118
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    .line 119
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    .line 120
    iget-object v0, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    .line 121
    iget-object p1, p1, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    iput-object p1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    .line 12
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    .line 13
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    .line 15
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    .line 16
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    .line 17
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    .line 18
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    .line 20
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "#.#####"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->s:Ljava/text/DecimalFormat;

    if-eqz p1, :cond_2

    .line 25
    :try_start_0
    iput-object p1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->a:Lorg/json/JSONObject;

    .line 26
    const-string v1, "auctionId"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    .line 27
    const-string v1, "adUnit"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    .line 28
    const-string v1, "mediationAdUnitName"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    .line 29
    const-string v1, "mediationAdUnitId"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    .line 30
    const-string v1, "adFormat"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    .line 31
    const-string v1, "country"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    .line 32
    const-string v1, "ab"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    .line 33
    const-string v1, "segmentName"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    .line 34
    const-string v1, "placement"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    .line 35
    const-string v1, "adNetwork"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    .line 36
    const-string v1, "instanceName"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    .line 37
    const-string v1, "instanceId"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    .line 38
    const-string v1, "precision"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    .line 39
    const-string v1, "encryptedCPM"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    .line 40
    const-string v1, "creativeId"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    .line 43
    const-string v1, "lifetimeRevenue"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 44
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    .line 45
    const-string v1, "revenue"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 46
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 48
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 49
    sget-object v0, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error parsing impression "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public getAb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getAdFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getAdNetwork()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getAdUnit()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getAllData()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->a:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getAuctionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getCreativeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptedCPM()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    return-object v0
.end method

.method public getInstanceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getInstanceName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getLifetimeRevenue()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    return-object v0
.end method

.method public getMediationAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getMediationAdUnitName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getPlacement()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getPrecision()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getRevenue()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    return-object v0
.end method

.method public getSegmentName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    return-object v0
.end method

.method public replaceMacroForPlacementWithValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    .line 3
    iget-object p2, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->a:Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    .line 5
    :try_start_0
    const-string v0, "placement"

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 7
    invoke-static {}, Lcom/ironsource/q4;->d()Lcom/ironsource/q4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ironsource/q4;->a(Ljava/lang/Throwable;)V

    .line 8
    sget-object p2, Lcom/ironsource/mediationsdk/logger/IronLog;->INTERNAL:Lcom/ironsource/mediationsdk/logger/IronLog;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ironsource/mediationsdk/logger/IronLog;->error(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "auctionId: \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', adUnit: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', mediationAdUnitName: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', mediationAdUnitId: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', adFormat: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', country: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', ab: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', segmentName: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', placement: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', adNetwork: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', instanceName: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', instanceId: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', revenue: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->n:Ljava/lang/Double;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->s:Ljava/text/DecimalFormat;

    invoke-virtual {v3, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", precision: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', lifetimeRevenue: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->p:Ljava/lang/Double;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->s:Ljava/text/DecimalFormat;

    invoke-virtual {v2, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", encryptedCPM: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', creativeId: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ironsource/mediationsdk/impressionData/ImpressionData;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
