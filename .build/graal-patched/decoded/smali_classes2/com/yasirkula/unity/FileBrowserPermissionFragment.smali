.class public Lcom/yasirkula/unity/FileBrowserPermissionFragment;
.super Landroid/app/Fragment;
.source "FileBrowserPermissionFragment.java"


# static fields
.field private static final PERMISSIONS_REQUEST_CODE:I = 0x1e2fd


# instance fields
.field private final permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;

    return-void
.end method

.method public constructor <init>(Lcom/yasirkula/unity/FileBrowserPermissionReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "permissionReceiver"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "savedInstanceState"
        }
    .end annotation

    .line 53
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 54
    iget-object p1, p0, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;

    const v0, 0x1e2fd

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 55
    new-array p1, v1, [Ljava/lang/String;

    new-array v1, v1, [I

    invoke-virtual {p0, v0, p1, v1}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void

    .line 58
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v4, 0x1

    if-ge p1, v2, :cond_1

    const/4 p1, 0x2

    .line 59
    new-array p1, p1, [Ljava/lang/String;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    aput-object v2, p1, v1

    aput-object v3, p1, v4

    invoke-virtual {p0, p1, v0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->requestPermissions([Ljava/lang/String;I)V

    return-void

    .line 60
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt p1, v2, :cond_3

    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-ge p1, v2, :cond_2

    goto :goto_0

    .line 63
    :cond_2
    new-array p1, v4, [Ljava/lang/String;

    aput-object v3, p1, v1

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void

    .line 61
    :cond_3
    :goto_0
    new-array p1, v4, [Ljava/lang/String;

    aput-object v3, p1, v1

    invoke-virtual {p0, p1, v0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "requestCode",
            "permissions",
            "grantResults"
        }
    .end annotation

    const v0, 0x1e2fd

    if-eq p1, v0, :cond_0

    goto/16 :goto_2

    .line 73
    :cond_0
    iget-object p1, p0, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;

    const-string v0, "Unity"

    if-nez p1, :cond_1

    .line 75
    const-string p1, "Fragment data got reset while asking permissions!"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void

    .line 85
    :cond_1
    array-length p1, p2

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p1, :cond_6

    array-length p1, p3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    move v3, v2

    .line 89
    :goto_0
    array-length v4, p2

    if-ge v3, v4, :cond_5

    array-length v4, p3

    if-ge v3, v4, :cond_5

    .line 91
    aget v4, p3, v3

    const/4 v5, -0x1

    if-ne v4, v5, :cond_4

    .line 93
    aget-object p1, p2, v3

    invoke-virtual {p0, p1}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move p1, v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    move v1, p1

    .line 104
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->permissionReceiver:Lcom/yasirkula/unity/FileBrowserPermissionReceiver;

    invoke-interface {p1, v1}, Lcom/yasirkula/unity/FileBrowserPermissionReceiver;->OnPermissionResult(I)V

    .line 105
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 112
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p2, 0x20000

    .line 113
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 114
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2, p1, v2}, Landroid/app/Activity;->startActivityIfNeeded(Landroid/content/Intent;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 118
    const-string p2, "Exception (resume):"

    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method
