.class public Lcom/ironsource/unity/androidbridge/AndroidBridge;
.super Ljava/lang/Object;
.source "AndroidBridge.java"

# interfaces
.implements Lcom/ironsource/mediationsdk/sdk/InitializationListener;
.implements Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;
.implements Lcom/ironsource/mediationsdk/sdk/SegmentListener;


# static fields
.field private static final mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;


# instance fields
.field private mBanner:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

.field private mBannerContainer:Landroid/widget/FrameLayout;

.field private mBannerVisibilityState:I

.field private mIsBannerLoadCalled:Z

.field private mIsBannerLoadedFirst:Z

.field private mLevelPlayInterstitialWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;

.field private mLevelPlayRewardedVideoWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

.field private mUIHandler:Landroid/os/Handler;

.field private mUnityImpressionDataListener:Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;

.field private mUnityInitializationListener:Lcom/ironsource/unity/androidbridge/UnityInitializationListener;

.field private mUnityLevelPlayBannerListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayBannerListener;

.field private mUnitySegmentListener:Lcom/ironsource/unity/androidbridge/UnitySegmentListener;


# direct methods
.method static bridge synthetic -$$Nest$fgetmBanner(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Lcom/ironsource/mediationsdk/IronSourceBannerLayout;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBanner:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmBannerContainer(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerContainer:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmBannerVisibilityState(Lcom/ironsource/unity/androidbridge/AndroidBridge;)I
    .locals 0

    iget p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerVisibilityState:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetmIsBannerLoadedFirst(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadedFirst:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetmUIHandler(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmUnityImpressionDataListener(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityImpressionDataListener:Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmUnityInitializationListener(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Lcom/ironsource/unity/androidbridge/UnityInitializationListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityInitializationListener:Lcom/ironsource/unity/androidbridge/UnityInitializationListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmUnityLevelPlayBannerListener(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Lcom/ironsource/unity/androidbridge/UnityLevelPlayBannerListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityLevelPlayBannerListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayBannerListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmUnitySegmentListener(Lcom/ironsource/unity/androidbridge/AndroidBridge;)Lcom/ironsource/unity/androidbridge/UnitySegmentListener;
    .locals 0

    iget-object p0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnitySegmentListener:Lcom/ironsource/unity/androidbridge/UnitySegmentListener;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputmBanner(Lcom/ironsource/unity/androidbridge/AndroidBridge;Lcom/ironsource/mediationsdk/IronSourceBannerLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBanner:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmBannerContainer(Lcom/ironsource/unity/androidbridge/AndroidBridge;Landroid/widget/FrameLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerContainer:Landroid/widget/FrameLayout;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmBannerVisibilityState(Lcom/ironsource/unity/androidbridge/AndroidBridge;I)V
    .locals 0

    iput p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerVisibilityState:I

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmIsBannerLoadCalled(Lcom/ironsource/unity/androidbridge/AndroidBridge;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadCalled:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmIsBannerLoadedFirst(Lcom/ironsource/unity/androidbridge/AndroidBridge;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadedFirst:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$mgetBannerSize(Lcom/ironsource/unity/androidbridge/AndroidBridge;Ljava/lang/String;II)Lcom/ironsource/mediationsdk/ISBannerSize;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getBannerSize(Ljava/lang/String;II)Lcom/ironsource/mediationsdk/ISBannerSize;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic -$$Nest$sfgetmInstance()Lcom/ironsource/unity/androidbridge/AndroidBridge;
    .locals 1

    sget-object v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;

    invoke-direct {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;-><init>()V

    sput-object v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->addImpressionDataListener(Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;)V

    .line 82
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->setSegmentListener(Lcom/ironsource/mediationsdk/sdk/SegmentListener;)V

    .line 84
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

    invoke-direct {v0}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;-><init>()V

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayRewardedVideoWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

    .line 85
    new-instance v0, Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;

    invoke-direct {v0}, Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;-><init>()V

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayInterstitialWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;

    .line 87
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerContainer:Landroid/widget/FrameLayout;

    .line 89
    iput-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBanner:Lcom/ironsource/mediationsdk/IronSourceBannerLayout;

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadedFirst:Z

    .line 91
    iput-boolean v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadCalled:Z

    .line 92
    iput v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mBannerVisibilityState:I

    return-void
.end method

.method private getBannerSize(Ljava/lang/String;II)Lcom/ironsource/mediationsdk/ISBannerSize;
    .locals 1

    .line 566
    const-string v0, "CUSTOM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 567
    new-instance p1, Lcom/ironsource/mediationsdk/ISBannerSize;

    invoke-direct {p1, p2, p3}, Lcom/ironsource/mediationsdk/ISBannerSize;-><init>(II)V

    return-object p1

    .line 570
    :cond_0
    const-string p2, "SMART"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 571
    sget-object p1, Lcom/ironsource/mediationsdk/ISBannerSize;->SMART:Lcom/ironsource/mediationsdk/ISBannerSize;

    return-object p1

    .line 574
    :cond_1
    const-string p2, "RECTANGLE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 575
    sget-object p1, Lcom/ironsource/mediationsdk/ISBannerSize;->RECTANGLE:Lcom/ironsource/mediationsdk/ISBannerSize;

    return-object p1

    .line 578
    :cond_2
    const-string p2, "LARGE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 579
    sget-object p1, Lcom/ironsource/mediationsdk/ISBannerSize;->LARGE:Lcom/ironsource/mediationsdk/ISBannerSize;

    return-object p1

    .line 581
    :cond_3
    sget-object p1, Lcom/ironsource/mediationsdk/ISBannerSize;->BANNER:Lcom/ironsource/mediationsdk/ISBannerSize;

    return-object p1
.end method

.method public static declared-synchronized getInstance()Lcom/ironsource/unity/androidbridge/AndroidBridge;
    .locals 2

    const-class v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;

    monitor-enter v0

    .line 77
    :try_start_0
    sget-object v1, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private loadAndShowBanner(Ljava/lang/String;IIILjava/lang/String;ZZFF)V
    .locals 12

    .line 359
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    new-instance v1, Lcom/ironsource/unity/androidbridge/AndroidBridge$5;

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move v6, p3

    move/from16 v3, p4

    move-object/from16 v11, p5

    move/from16 v7, p6

    move/from16 v10, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v1 .. v11}, Lcom/ironsource/unity/androidbridge/AndroidBridge$5;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;ILjava/lang/String;IIZFFZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public clearRewardedVideoServerParams()V
    .locals 0

    .line 316
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->clearRewardedVideoServerParameters()V

    return-void
.end method

.method public destroyBanner()V
    .locals 3

    .line 586
    sget-object v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    monitor-enter v0

    .line 587
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    new-instance v2, Lcom/ironsource/unity/androidbridge/AndroidBridge$6;

    invoke-direct {v2, p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge$6;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 615
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public displayBanner()V
    .locals 3

    .line 619
    sget-object v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    monitor-enter v0

    .line 620
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    new-instance v2, Lcom/ironsource/unity/androidbridge/AndroidBridge$7;

    invoke-direct {v2, p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge$7;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 636
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getAdvertiserId()Ljava/lang/String;
    .locals 4

    .line 187
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/ironsource/unity/androidbridge/AndroidBridge$4;

    invoke-direct {v1, p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge$4;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 194
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->run()V

    .line 197
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 202
    const-string v0, ""

    return-object v0
.end method

.method public getDeviceScreenWidth()F
    .locals 2

    .line 670
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 672
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 674
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 676
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 677
    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 678
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 679
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    int-to-float v0, v0

    div-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMaximalAdaptiveHeight(F)F
    .locals 0

    float-to-int p1, p1

    .line 666
    invoke-static {p1}, Lcom/ironsource/mediationsdk/ISBannerSize;->getMaximalAdaptiveHeight(I)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public getPlacementInfo(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 297
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->getRewardedVideoPlacementInfo(Ljava/lang/String;)Lcom/ironsource/mediationsdk/model/Placement;

    move-result-object p1

    .line 298
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 300
    :try_start_0
    const-string v1, "placement_name"

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/Placement;->getPlacementName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    const-string v1, "reward_name"

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    const-string v1, "reward_amount"

    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/model/Placement;->getRewardAmount()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 305
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getUnityActivity()Landroid/app/Activity;
    .locals 1

    .line 177
    sget-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public hideBanner()V
    .locals 3

    .line 640
    sget-object v0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    monitor-enter v0

    .line 641
    :try_start_0
    iget-object v1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUIHandler:Landroid/os/Handler;

    new-instance v2, Lcom/ironsource/unity/androidbridge/AndroidBridge$8;

    invoke-direct {v2, p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge$8;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 657
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public init(Ljava/lang/String;)V
    .locals 1

    .line 252
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lcom/ironsource/mediationsdk/IronSource;->init(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InitializationListener;)V

    return-void
.end method

.method public init(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 256
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 258
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    .line 259
    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-virtual {v4}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 260
    sget-object v3, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->REWARDED_VIDEO:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 261
    :cond_0
    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-virtual {v4}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 262
    sget-object v3, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->INTERSTITIAL:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 263
    :cond_1
    sget-object v4, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-virtual {v4}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 264
    sget-object v3, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->BANNER:Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 268
    :cond_3
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-static {p2, p1, p0, v0}, Lcom/ironsource/mediationsdk/IronSource;->init(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InitializationListener;[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V

    return-void
.end method

.method public isBannerPlacementCapped(Ljava/lang/String;)Z
    .locals 0

    .line 661
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->isBannerPlacementCapped(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isInterstitialPlacementCapped(Ljava/lang/String;)Z
    .locals 0

    .line 340
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->isInterstitialPlacementCapped(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isInterstitialReady()Z
    .locals 1

    .line 336
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->isInterstitialReady()Z

    move-result v0

    return v0
.end method

.method public isRewardedVideoAvailable()Z
    .locals 1

    .line 287
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->isRewardedVideoAvailable()Z

    move-result v0

    return v0
.end method

.method public isRewardedVideoPlacementCapped(Ljava/lang/String;)Z
    .locals 0

    .line 291
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->isRewardedVideoPlacementCapped(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public launchTestSuite()V
    .locals 1

    .line 803
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/IronSource;->launchTestSuite(Landroid/content/Context;)V

    return-void
.end method

.method public loadBanner(Ljava/lang/String;IIILjava/lang/String;ZZFF)V
    .locals 2

    .line 348
    sget-object v1, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mInstance:Lcom/ironsource/unity/androidbridge/AndroidBridge;

    monitor-enter v1

    .line 349
    :try_start_0
    iget-boolean v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadCalled:Z

    if-eqz v0, :cond_0

    .line 350
    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 353
    iput-boolean v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mIsBannerLoadCalled:Z

    .line 354
    invoke-direct/range {p0 .. p9}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->loadAndShowBanner(Ljava/lang/String;IIILjava/lang/String;ZZFF)V

    .line 355
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public loadInterstitial()V
    .locals 0

    .line 324
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->loadInterstitial()V

    return-void
.end method

.method public loadRewardedVideo()V
    .locals 0

    .line 275
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->loadRewardedVideo()V

    return-void
.end method

.method public onImpressionSuccess(Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityImpressionDataListener:Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;

    if-eqz v0, :cond_0

    .line 129
    new-instance v0, Lcom/ironsource/unity/androidbridge/AndroidBridge$1;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/AndroidBridge$1;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onInitializationComplete()V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityInitializationListener:Lcom/ironsource/unity/androidbridge/UnityInitializationListener;

    if-eqz v0, :cond_0

    .line 144
    new-instance v0, Lcom/ironsource/unity/androidbridge/AndroidBridge$2;

    invoke-direct {v0, p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge$2;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 241
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/IronSource;->onPause(Landroid/app/Activity;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 237
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/IronSource;->onResume(Landroid/app/Activity;)V

    return-void
.end method

.method public onSegmentReceived(Ljava/lang/String;)V
    .locals 1

    .line 158
    :try_start_0
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnitySegmentListener:Lcom/ironsource/unity/androidbridge/UnitySegmentListener;

    if-eqz v0, :cond_0

    .line 159
    new-instance v0, Lcom/ironsource/unity/androidbridge/AndroidBridge$3;

    invoke-direct {v0, p0, p1}, Lcom/ironsource/unity/androidbridge/AndroidBridge$3;-><init>(Lcom/ironsource/unity/androidbridge/AndroidBridge;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->postBackgroundTask(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 167
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public setAdRevenueData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 793
    invoke-static {p2}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->getHashMapFromJsonString(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p2

    .line 794
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 795
    invoke-static {p1, v0}, Lcom/ironsource/mediationsdk/IronSource;->setAdRevenueData(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public setAdaptersDebug(Z)V
    .locals 0

    .line 218
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setAdaptersDebug(Z)V

    return-void
.end method

.method public setClientSideCallbacks(Z)V
    .locals 1

    .line 745
    invoke-static {}, Lcom/ironsource/adapters/supersonicads/SupersonicConfig;->getConfigObj()Lcom/ironsource/adapters/supersonicads/SupersonicConfig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ironsource/adapters/supersonicads/SupersonicConfig;->setClientSideCallbacks(Z)V

    return-void
.end method

.method public setConsent(Z)V
    .locals 0

    .line 729
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setConsent(Z)V

    return-void
.end method

.method public setDynamicUserId(Ljava/lang/String;)Z
    .locals 0

    .line 214
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setDynamicUserId(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setManualLoadRewardedVideo(Z)V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayRewardedVideoWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

    invoke-virtual {v0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->setIronSourceManualLoadListener(Z)V

    return-void
.end method

.method public setMetaData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 733
    invoke-static {p1, p2}, Lcom/ironsource/mediationsdk/IronSource;->setMetaData(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setMetaData(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .line 737
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 738
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p2, v2

    .line 739
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 741
    :cond_0
    invoke-static {p1, v0}, Lcom/ironsource/mediationsdk/IronSource;->setMetaData(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public setNetworkData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 228
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 229
    invoke-static {p1, v0}, Lcom/ironsource/mediationsdk/IronSource;->setNetworkData(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 231
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public setPluginData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 181
    invoke-static {}, Lcom/ironsource/mediationsdk/config/ConfigFile;->getConfigFile()Lcom/ironsource/mediationsdk/config/ConfigFile;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ironsource/mediationsdk/config/ConfigFile;->setPluginData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setRewardedVideoCustomParams(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setRewardedVideoServerParams(Ljava/lang/String;)V
    .locals 0

    .line 311
    invoke-static {p1}, Lcom/ironsource/unity/androidbridge/AndroidBridgeUtilities;->getHashMapFromJsonString(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    .line 312
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setRewardedVideoServerParameters(Ljava/util/Map;)V

    return-void
.end method

.method public setSegment(Ljava/lang/String;)V
    .locals 4

    .line 694
    :try_start_0
    invoke-static {p0}, Lcom/ironsource/mediationsdk/IronSource;->setSegmentListener(Lcom/ironsource/mediationsdk/sdk/SegmentListener;)V

    .line 695
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 696
    new-instance p1, Lcom/ironsource/mediationsdk/IronSourceSegment;

    invoke-direct {p1}, Lcom/ironsource/mediationsdk/IronSourceSegment;-><init>()V

    .line 698
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 699
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 700
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 701
    const-string v3, "age"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 702
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setAge(I)V

    goto :goto_0

    .line 703
    :cond_0
    const-string v3, "gender"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 704
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setGender(Ljava/lang/String;)V

    goto :goto_0

    .line 705
    :cond_1
    const-string v3, "level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 706
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setLevel(I)V

    goto :goto_0

    .line 707
    :cond_2
    const-string v3, "isPaying"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 708
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setIsPaying(Z)V

    goto :goto_0

    .line 709
    :cond_4
    const-string v3, "userCreationDate"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 710
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setUserCreationDate(J)V

    goto :goto_0

    .line 711
    :cond_5
    const-string v3, "segmentName"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 712
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setSegmentName(Ljava/lang/String;)V

    goto :goto_0

    .line 713
    :cond_6
    const-string v3, "iapt"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 714
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setIAPTotal(D)V

    goto/16 :goto_0

    .line 717
    :cond_7
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/ironsource/mediationsdk/IronSourceSegment;->setCustom(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 720
    :cond_8
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setSegment(Lcom/ironsource/mediationsdk/IronSourceSegment;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 723
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method public setUnityBannerLevelPlayListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayBannerListener;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityLevelPlayBannerListener:Lcom/ironsource/unity/androidbridge/UnityLevelPlayBannerListener;

    return-void
.end method

.method public setUnityImpressionDataListener(Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityImpressionDataListener:Lcom/ironsource/unity/androidbridge/UnityImpressionDataListener;

    return-void
.end method

.method public setUnityInitializationListener(Lcom/ironsource/unity/androidbridge/UnityInitializationListener;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnityInitializationListener:Lcom/ironsource/unity/androidbridge/UnityInitializationListener;

    return-void
.end method

.method public setUnityInterstitialLevelPlayListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayInterstitialListener;)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayInterstitialWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;

    invoke-virtual {v0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayInterstitialWrapper;->setInterstitialLevelPlaylistener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayInterstitialListener;)V

    return-void
.end method

.method public setUnityRewardedVideoLevelPlayListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayRewardedVideoWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

    invoke-virtual {v0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->setLevelPlayRewardedVideoListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoListener;)V

    return-void
.end method

.method public setUnityRewardedVideoManualLevelPlayListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mLevelPlayRewardedVideoWrapper:Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;

    invoke-virtual {v0, p1}, Lcom/ironsource/unity/androidbridge/LevelPlayRewardedVideoWrapper;->setLevelPlayManualRewardedVideoListener(Lcom/ironsource/unity/androidbridge/UnityLevelPlayRewardedVideoManualListener;)V

    return-void
.end method

.method public setUnitySegmentListener(Lcom/ironsource/unity/androidbridge/UnitySegmentListener;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ironsource/unity/androidbridge/AndroidBridge;->mUnitySegmentListener:Lcom/ironsource/unity/androidbridge/UnitySegmentListener;

    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 248
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setUserId(Ljava/lang/String;)V

    return-void
.end method

.method public setWaterfallConfiguration(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 763
    const-string v0, "floor"

    const-string v1, "ceiling"

    :try_start_0
    invoke-static {}, Lcom/ironsource/mediationsdk/WaterfallConfiguration;->builder()Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;

    move-result-object v2

    .line 765
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 767
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 768
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 769
    invoke-virtual {v2, v4, v5}, Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;->setCeiling(D)Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;

    .line 772
    :cond_0
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 773
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 774
    invoke-virtual {v2, v0, v1}, Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;->setFloor(D)Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;

    .line 777
    :cond_1
    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/WaterfallConfiguration$WaterfallConfigurationBuilder;->build()Lcom/ironsource/mediationsdk/WaterfallConfiguration;

    move-result-object p1

    .line 779
    invoke-static {p2}, Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;->valueOf(Ljava/lang/String;)Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ironsource/mediationsdk/IronSource;->setWaterfallConfiguration(Lcom/ironsource/mediationsdk/WaterfallConfiguration;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 781
    :catch_0
    const-string p1, "Internal exception occurred while parsing configuration parameters for ad unit: %s. Please check the format of the configuration parameters."

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 784
    const-string p2, "LevelPlayAndroidBridge"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public shouldTrackNetworkState(Z)V
    .locals 1

    .line 210
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/ironsource/mediationsdk/IronSource;->shouldTrackNetworkState(Landroid/content/Context;Z)V

    return-void
.end method

.method public showInterstitial()V
    .locals 0

    .line 328
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->showInterstitial()V

    return-void
.end method

.method public showInterstitial(Ljava/lang/String;)V
    .locals 0

    .line 332
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->showInterstitial(Ljava/lang/String;)V

    return-void
.end method

.method public showRewardedVideo()V
    .locals 0

    .line 279
    invoke-static {}, Lcom/ironsource/mediationsdk/IronSource;->showRewardedVideo()V

    return-void
.end method

.method public showRewardedVideo(Ljava/lang/String;)V
    .locals 0

    .line 283
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->showRewardedVideo(Ljava/lang/String;)V

    return-void
.end method

.method public validateIntegration()V
    .locals 1

    .line 206
    invoke-virtual {p0}, Lcom/ironsource/unity/androidbridge/AndroidBridge;->getUnityActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/ironsource/mediationsdk/integration/IntegrationHelper;->validateIntegration(Landroid/content/Context;)V

    return-void
.end method
