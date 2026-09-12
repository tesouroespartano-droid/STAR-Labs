.class Lcom/player/render/ModMenu$3;
.super Ljava/lang/Object;
.source "ModMenu.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/player/render/ModMenu;->StartMenu(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$hideKeyboard$2()V
    .locals 3

    .line 230
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetappContext()Landroid/content/Context;

    move-result-object v0

    .line 231
    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 232
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 233
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 234
    :cond_0
    return-void
.end method

.method static synthetic lambda$init$0()V
    .locals 0

    .line 216
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$smsetupChannel()V

    return-void
.end method

.method static synthetic lambda$showKeyboard$1()V
    .locals 3

    .line 221
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    .line 222
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetappContext()Landroid/content/Context;

    move-result-object v0

    .line 223
    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 224
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 225
    :cond_0
    return-void
.end method


# virtual methods
.method public hideKeyboard()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 228
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/player/render/ModMenu;->xI(Z)V

    .line 229
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 235
    return-void
.end method

.method public init()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 216
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 217
    return-void
.end method

.method public showKeyboard()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 219
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/player/render/ModMenu;->xI(Z)V

    .line 220
    invoke-static {}, Lcom/player/render/ModMenu;->-$$Nest$sfgetwebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/player/render/ModMenu$3$$ExternalSyntheticLambda2;-><init>()V

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 226
    return-void
.end method
