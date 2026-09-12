.class public Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;
.super Landroid/app/Fragment;
.source "FileBrowserDirectoryPickerFragment.java"


# static fields
.field private static final DIRECTORY_PICK_REQUEST_CODE:I = 0x122b9


# instance fields
.field private final directoryReceiver:Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->directoryReceiver:Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;

    return-void
.end method

.method public constructor <init>(Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "directoryReceiver"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->directoryReceiver:Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "requestCode",
            "resultCode",
            "data"
        }
    .end annotation

    const v0, 0x122b9

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    if-eqz p3, :cond_1

    .line 72
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 75
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->fromTreeUri(Landroid/content/Context;Landroid/net/Uri;)Lcom/yasirkula/unity/FileBrowserSAFEntry;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 76
    invoke-virtual {p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 78
    invoke-virtual {p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    .line 79
    invoke-virtual {p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p3

    const/4 v1, 0x3

    invoke-virtual {v0, p3, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    goto :goto_0

    .line 86
    :cond_1
    const-string p2, ""

    move-object p1, p2

    :goto_0
    iget-object p3, p0, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->directoryReceiver:Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;

    if-eqz p3, :cond_2

    .line 87
    invoke-interface {p3, p2, p1}, Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;->OnDirectoryPicked(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :cond_2
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

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

    .line 35
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 37
    iget-object p1, p0, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->directoryReceiver:Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x122b9

    if-nez p1, :cond_0

    .line 38
    invoke-virtual {p0, v2, v1, v0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    .line 41
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v3, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x43

    .line 42
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 45
    const-string v3, "android.content.extra.SHOW_ADVANCED"

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 46
    const-string v3, "android.content.extra.FANCY"

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 47
    const-string v3, "android.content.extra.SHOW_FILESIZE"

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 48
    const-string v3, "android.intent.extra.LOCAL_ONLY"

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 52
    :try_start_0
    invoke-virtual {p0, p1, v2}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 56
    :catch_0
    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string v3, "No apps can perform this action."

    invoke-static {p1, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 57
    invoke-virtual {p0, v2, v1, v0}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method
