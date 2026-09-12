.class public Lcom/player/render/ModMenu;
.super Ljava/lang/Object;
.source "ModMenu.java"


# static fields
.field private static final ACT_PANEL:I = 0x5

.field private static androidPort:Landroid/webkit/WebMessagePort;

.field private static appContext:Landroid/content/Context;

.field private static scriptsPath:Ljava/lang/String;

.field private static started:Z

.field private static webView:Landroid/webkit/WebView;


# direct methods
.method static bridge synthetic -$$Nest$sfgetappContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/player/render/ModMenu;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method static bridge synthetic -$$Nest$sfgetwebView()Landroid/webkit/WebView;
    .locals 1

    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static bridge synthetic -$$Nest$smsetupChannel()V
    .locals 0

    invoke-static {}, Lcom/player/render/ModMenu;->setupChannel()V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/4 v0, 0x0

    sput-boolean v0, Lcom/player/render/ModMenu;->started:Z

    .line 45
    const-string v0, "service"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 118
    const/4 v0, 0x0

    sput-object v0, Lcom/player/render/ModMenu;->scriptsPath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static StartMenu(Landroid/content/Context;)V
    .locals 10
    .param p0, "context"    # Landroid/content/Context;

    .line 139
    sget-boolean v0, Lcom/player/render/ModMenu;->started:Z

    if-eqz v0, :cond_0

    return-void

    .line 140
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/player/render/ModMenu;->started:Z

    .line 141
    invoke-static {p0}, Lcom/player/render/ModMenu;->getActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    .line 142
    .local v1, "activity":Landroid/app/Activity;
    if-nez v1, :cond_1

    return-void

    .line 143
    :cond_1
    sput-object p0, Lcom/player/render/ModMenu;->appContext:Landroid/content/Context;

    .line 145
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    const/4 v4, 0x0

    if-lt v2, v3, :cond_2

    .line 146
    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move v0, v4

    .line 148
    .local v0, "needsPerm":Z
    :goto_0
    if-nez v0, :cond_3

    .line 150
    invoke-static {}, Lcom/player/render/ModMenu;->initScriptsDir()V

    .line 151
    invoke-static {p0}, Lcom/player/render/ModMenu;->xA(Landroid/content/Context;)V

    goto :goto_2

    .line 154
    :cond_3
    invoke-static {p0}, Lcom/player/render/ModMenu;->xA(Landroid/content/Context;)V

    .line 158
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "package:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 160
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 158
    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    goto :goto_1

    .line 161
    :catch_0
    move-exception v2

    .line 162
    .local v2, "e":Ljava/lang/Exception;
    new-instance v3, Landroid/content/Intent;

    const-string v5, "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 166
    .end local v2    # "e":Ljava/lang/Exception;
    :goto_1
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/player/render/ModMenu$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/player/render/ModMenu$$ExternalSyntheticLambda1;-><init>()V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 177
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 180
    :goto_2
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 181
    .local v2, "root":Landroid/view/ViewGroup;
    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 182
    .local v3, "overlay":Landroid/widget/FrameLayout;
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    const/16 v5, 0x32

    invoke-static {p0, v5}, Lcom/player/render/ModMenu;->dp(Landroid/content/Context;I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 184
    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 185
    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setFitsSystemWindows(Z)V

    .line 187
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 188
    .local v5, "density":F
    new-instance v7, Lcom/player/render/ModMenu$2;

    invoke-direct {v7, p0}, Lcom/player/render/ModMenu$2;-><init>(Landroid/content/Context;)V

    sput-object v7, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    .line 212
    sget-object v7, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    invoke-static {v7}, Lcom/player/render/ModMenu;->xB(Landroid/webkit/WebView;)V

    .line 214
    sget-object v7, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    new-instance v8, Lcom/player/render/ModMenu$3;

    invoke-direct {v8}, Lcom/player/render/ModMenu$3;-><init>()V

    const-string v9, "Native"

    invoke-virtual {v7, v8, v9}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    invoke-static {}, Lcom/player/render/ModMenu;->xE()V

    .line 239
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 240
    .local v7, "wvLp":Landroid/widget/FrameLayout$LayoutParams;
    sget-object v6, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    invoke-virtual {v3, v6, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 241
    sget-object v6, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    invoke-virtual {v6, v4}, Landroid/webkit/WebView;->setFitsSystemWindows(Z)V

    .line 242
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 243
    return-void
.end method

.method public static dp(Landroid/content/Context;I)I
    .locals 2
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "dp"    # I

    .line 246
    int-to-float v0, p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static getActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1
    .param p0, "c"    # Landroid/content/Context;

    .line 250
    nop

    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 251
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    .line 252
    :cond_0
    move-object v0, p0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    .line 254
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static initScriptsDir()V
    .locals 3

    .line 122
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 123
    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 124
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 125
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "xCoreScripts"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 126
    .local v0, "dir":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 127
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/player/render/ModMenu;->scriptsPath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 128
    .end local v0    # "dir":Ljava/io/File;
    :catch_0
    move-exception v0

    :cond_2
    :goto_0
    nop

    .line 129
    return-void
.end method

.method static synthetic lambda$StartMenu$3()V
    .locals 0

    .line 170
    invoke-static {}, Lcom/player/render/ModMenu;->initScriptsDir()V

    .line 171
    invoke-static {}, Lcom/player/render/ModMenu;->xQ()V

    .line 172
    return-void
.end method

.method static synthetic lambda$StartMenu$4()V
    .locals 2

    .line 168
    nop

    :goto_0
    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/player/render/ModMenu$$ExternalSyntheticLambda3;

    invoke-direct {v1}, Lcom/player/render/ModMenu$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 173
    goto :goto_1

    .line 175
    :cond_0
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 177
    :goto_1
    return-void
.end method

.method static synthetic lambda$yA$0(Ljava/lang/String;)V
    .locals 2
    .param p0, "json"    # Ljava/lang/String;

    .line 51
    sget-object v0, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    new-instance v1, Landroid/webkit/WebMessage;

    invoke-direct {v1, p0}, Landroid/webkit/WebMessage;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebMessagePort;->postMessage(Landroid/webkit/WebMessage;)V

    return-void
.end method

.method static synthetic lambda$yB$2(Ljava/lang/String;)V
    .locals 6
    .param p0, "html"    # Ljava/lang/String;

    .line 67
    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    const-string v1, "http://menu.holy/"

    const-string v3, "text/html"

    move-object v2, p0

    .end local p0    # "html":Ljava/lang/String;
    .local v2, "html":Ljava/lang/String;
    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic lambda$yD$1(Ljava/lang/String;)V
    .locals 2
    .param p0, "msg"    # Ljava/lang/String;

    .line 61
    sget-object v0, Lcom/player/render/ModMenu;->appContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static setupChannel()V
    .locals 6

    .line 73
    sget-object v0, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    if-eqz v0, :cond_0

    .line 74
    :try_start_0
    sget-object v0, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    invoke-virtual {v0}, Landroid/webkit/WebMessagePort;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 76
    :cond_0
    :goto_0
    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->createWebMessageChannel()[Landroid/webkit/WebMessagePort;

    move-result-object v0

    .line 77
    .local v0, "ports":[Landroid/webkit/WebMessagePort;
    const/4 v1, 0x0

    aget-object v2, v0, v1

    sput-object v2, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    .line 78
    const/4 v2, 0x1

    aget-object v3, v0, v2

    .line 80
    .local v3, "jsPort":Landroid/webkit/WebMessagePort;
    sget-object v4, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    new-instance v5, Lcom/player/render/ModMenu$1;

    invoke-direct {v5}, Lcom/player/render/ModMenu$1;-><init>()V

    invoke-virtual {v4, v5}, Landroid/webkit/WebMessagePort;->setWebMessageCallback(Landroid/webkit/WebMessagePort$WebMessageCallback;)V

    .line 109
    sget-object v4, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    new-instance v5, Landroid/webkit/WebMessage;

    new-array v2, v2, [Landroid/webkit/WebMessagePort;

    aput-object v3, v2, v1

    const-string v1, "{\"type\":\"init\"}"

    invoke-direct {v5, v1, v2}, Landroid/webkit/WebMessage;-><init>(Ljava/lang/String;[Landroid/webkit/WebMessagePort;)V

    .line 111
    const-string v2, "*"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 109
    invoke-virtual {v4, v5, v2}, Landroid/webkit/WebView;->postWebMessage(Landroid/webkit/WebMessage;Landroid/net/Uri;)V

    .line 113
    invoke-static {}, Lcom/player/render/ModMenu;->xF()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 114
    invoke-static {v1}, Lcom/player/render/ModMenu;->xJ(Ljava/lang/String;)V

    .line 115
    :cond_1
    return-void
.end method

.method static native xA(Landroid/content/Context;)V
.end method

.method static native xB(Landroid/webkit/WebView;)V
.end method

.method static native xC(Ljava/lang/String;)I
.end method

.method static native xE()V
.end method

.method static native xF()Z
.end method

.method static native xG()Z
.end method

.method static native xH()Z
.end method

.method static native xI(Z)V
.end method

.method static native xJ(Ljava/lang/String;)V
.end method

.method static native xK(Ljava/lang/String;)V
.end method

.method static native xP(Landroid/view/View;FF)Z
.end method

.method static native xQ()V
.end method

.method public static yA(Ljava/lang/String;)V
    .locals 2
    .param p0, "json"    # Ljava/lang/String;

    .line 50
    sget-object v0, Lcom/player/render/ModMenu;->androidPort:Landroid/webkit/WebMessagePort;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 51
    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/player/render/ModMenu$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/player/render/ModMenu$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 52
    :cond_0
    return-void
.end method

.method public static yB(Ljava/lang/String;)V
    .locals 2
    .param p0, "html"    # Ljava/lang/String;

    .line 66
    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 67
    sget-object v0, Lcom/player/render/ModMenu;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/player/render/ModMenu$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/player/render/ModMenu$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 69
    :cond_0
    return-void
.end method

.method public static yC()V
    .locals 0

    .line 56
    return-void
.end method

.method public static yD(Ljava/lang/String;)V
    .locals 2
    .param p0, "msg"    # Ljava/lang/String;

    .line 59
    sget-object v0, Lcom/player/render/ModMenu;->appContext:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 60
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/player/render/ModMenu$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/player/render/ModMenu$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    return-void
.end method

.method public static yE()Ljava/lang/String;
    .locals 1

    .line 132
    sget-object v0, Lcom/player/render/ModMenu;->scriptsPath:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/player/render/ModMenu;->scriptsPath:Ljava/lang/String;

    return-object v0

    .line 133
    :cond_0
    invoke-static {}, Lcom/player/render/ModMenu;->initScriptsDir()V

    .line 134
    sget-object v0, Lcom/player/render/ModMenu;->scriptsPath:Ljava/lang/String;

    return-object v0
.end method
