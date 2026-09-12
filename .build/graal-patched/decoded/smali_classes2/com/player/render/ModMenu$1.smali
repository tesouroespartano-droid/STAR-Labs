.class Lcom/player/render/ModMenu$1;
.super Landroid/webkit/WebMessagePort$WebMessageCallback;
.source "ModMenu.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/player/render/ModMenu;->setupChannel()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Landroid/webkit/WebMessagePort$WebMessageCallback;-><init>()V

    return-void
.end method

.method static synthetic lambda$onMessage$0(Z)V
    .locals 3
    .param p0, "open"    # Z

    .line 92
    if-eqz p0, :cond_0

    .line 93
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 94
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFocusableInTouchMode(Z)V

    .line 95
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    goto :goto_0

    .line 97
    :cond_0
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 98
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFocusableInTouchMode(Z)V

    .line 99
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetappContext()Landroid/content/Context;

    move-result-object v0

    .line 100
    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 101
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_1

    .line 102
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 104
    .end local v0    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onMessage(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 5
    .param p1, "port"    # Landroid/webkit/WebMessagePort;
    .param p2, "message"    # Landroid/webkit/WebMessage;

    .line 83
    invoke-virtual {p2}, Landroid/webkit/WebMessage;->getData()Ljava/lang/String;

    move-result-object v0

    .line 84
    .local v0, "json":Ljava/lang/String;
    invoke-static {v0}, Lcom/player/render/ModMenu;->xC(Ljava/lang/String;)I

    move-result v1

    .line 86
    .local v1, "action":I
    invoke-static {}, Lcom/player/render/ModMenu;->xF()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 87
    invoke-static {v0}, Lcom/player/render/ModMenu;->xJ(Ljava/lang/String;)V

    .line 89
    :cond_0
    const/4 v2, 0x5

    if-ne v1, v2, :cond_1

    .line 90
    invoke-static {}, Lcom/player/render/ModMenu;->xG()Z

    move-result v2

    .line 91
    .local v2, "open":Z
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v3

    new-instance v4, Lcom/player/render/ModMenu$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2}, Lcom/player/render/ModMenu$1$$ExternalSyntheticLambda0;-><init>(Z)V

    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 106
    .end local v2    # "open":Z
    :cond_1
    return-void
.end method
