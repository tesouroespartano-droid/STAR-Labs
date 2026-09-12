.class public Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;
.super Landroid/app/Fragment;
.source "NativeGalleryMediaPickerFragment.java"


# static fields
.field private static final MEDIA_REQUEST_CODE:I = 0xf113f

.field public static final MEDIA_TYPE_ID:Ljava/lang/String; = "NGMP_MEDIA_TYPE"

.field public static final MIME_ID:Ljava/lang/String; = "NGMP_MIME"

.field public static final SAVE_PATH_ID:Ljava/lang/String; = "NGMP_SAVE_PATH"

.field public static final SELECT_MULTIPLE_ID:Ljava/lang/String; = "NGMP_MULTIPLE"

.field public static final TITLE_ID:Ljava/lang/String; = "NGMP_TITLE"

.field public static preferGetContent:Z = false

.field public static showProgressbar:Z = true

.field public static tryPreserveFilenames:Z

.field public static useDefaultGalleryApp:Z


# instance fields
.field private final mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

.field private savePathDirectory:Ljava/lang/String;

.field private savePathFilename:Ljava/lang/String;

.field private selectMultiple:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    return-void
.end method

.method public constructor <init>(Lcom/yasirkula/unity/NativeGalleryMediaReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mediaReceiver"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
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

    const v0, 0xf113f

    if-eq p1, v0, :cond_0

    return-void

    .line 141
    :cond_0
    iget-object p1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    if-nez p1, :cond_1

    .line 142
    const-string p1, "Unity"

    const-string p2, "NativeGalleryMediaPickerFragment.mediaReceiver became null!"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    if-ne p2, v0, :cond_4

    if-nez p3, :cond_2

    goto :goto_0

    .line 152
    :cond_2
    new-instance v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;

    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object v3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    iget-boolean v5, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->selectMultiple:Z

    iget-object v6, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->savePathDirectory:Ljava/lang/String;

    iget-object v7, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->savePathFilename:Ljava/lang/String;

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;-><init>(Landroid/content/Context;Lcom/yasirkula/unity/NativeGalleryMediaReceiver;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;)V

    .line 153
    sget-boolean p1, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->showProgressbar:Z

    if-eqz p1, :cond_3

    .line 154
    new-instance p1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultFragment;

    invoke-direct {p1, v1}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultFragment;-><init>(Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;)V

    goto :goto_2

    .line 157
    :cond_3
    invoke-virtual {v1}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->execute()V

    .line 158
    invoke-virtual {v1}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->sendResultToUnity()V

    goto :goto_1

    .line 145
    :cond_4
    :goto_0
    iget-boolean p2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->selectMultiple:Z

    const-string p3, ""

    if-nez p2, :cond_5

    .line 146
    invoke-interface {p1, p3}, Lcom/yasirkula/unity/NativeGalleryMediaReceiver;->OnMediaReceived(Ljava/lang/String;)V

    goto :goto_1

    .line 148
    :cond_5
    invoke-interface {p1, p3}, Lcom/yasirkula/unity/NativeGalleryMediaReceiver;->OnMultipleMediaReceived(Ljava/lang/String;)V

    :goto_1
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_6

    .line 163
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    return-void

    .line 165
    :cond_6
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3, p1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "savedInstanceState"
        }
    .end annotation

    .line 50
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 51
    iget-object p1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    if-nez p1, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    return-void

    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "NGMP_MEDIA_TYPE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 56
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "NGMP_MIME"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "NGMP_TITLE"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "NGMP_MULTIPLE"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->selectMultiple:Z

    .line 59
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "NGMP_SAVE_PATH"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2f

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ltz v3, :cond_1

    add-int/lit8 v4, v3, 0x1

    .line 62
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    iput-object v4, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->savePathFilename:Ljava/lang/String;

    const/4 v4, 0x0

    if-lez v3, :cond_2

    .line 63
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->savePathDirectory:Ljava/lang/String;

    and-int/lit8 v2, p1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_2
    and-int/lit8 v6, p1, 0x2

    const/4 v7, 0x2

    if-ne v6, v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    :cond_4
    and-int/lit8 v8, p1, 0x4

    const/4 v9, 0x4

    if-ne v8, v9, :cond_5

    add-int/lit8 v5, v5, 0x1

    .line 74
    :cond_5
    sget-boolean v10, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->preferGetContent:Z

    if-nez v10, :cond_8

    iget-boolean v10, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->selectMultiple:Z

    if-nez v10, :cond_8

    if-ne v5, v3, :cond_8

    if-eq p1, v9, :cond_8

    .line 76
    const-string v2, "android.intent.action.PICK"

    if-ne p1, v3, :cond_6

    .line 77
    new-instance p1, Landroid/content/Intent;

    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {p1, v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_5

    :cond_6
    if-ne p1, v7, :cond_7

    .line 79
    new-instance p1, Landroid/content/Intent;

    sget-object v5, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {p1, v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_5

    .line 81
    :cond_7
    new-instance p1, Landroid/content/Intent;

    sget-object v5, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {p1, v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_5

    .line 85
    :cond_8
    new-instance p1, Landroid/content/Intent;

    if-le v5, v3, :cond_9

    const-string v10, "android.intent.action.OPEN_DOCUMENT"

    goto :goto_3

    :cond_9
    const-string v10, "android.intent.action.GET_CONTENT"

    :goto_3
    invoke-direct {p1, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    const-string v10, "android.intent.category.OPENABLE"

    invoke-virtual {p1, v10}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 89
    iget-boolean v10, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->selectMultiple:Z

    if-eqz v10, :cond_a

    .line 90
    const-string v10, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {p1, v10, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_a
    if-le v5, v3, :cond_e

    .line 98
    new-array v0, v5, [Ljava/lang/String;

    if-ne v2, v3, :cond_b

    .line 101
    const-string v2, "image/*"

    aput-object v2, v0, v4

    move v2, v3

    goto :goto_4

    :cond_b
    move v2, v4

    :goto_4
    if-ne v6, v7, :cond_c

    add-int/lit8 v5, v2, 0x1

    .line 103
    const-string v6, "video/*"

    aput-object v6, v0, v2

    move v2, v5

    :cond_c
    if-ne v8, v9, :cond_d

    .line 105
    const-string v5, "audio/*"

    aput-object v5, v0, v2

    .line 107
    :cond_d
    const-string v2, "android.intent.extra.MIME_TYPES"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 112
    const-string v0, "*/*"

    :cond_e
    :goto_5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    if-eqz v1, :cond_f

    .line 114
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_f

    .line 115
    const-string v0, "android.intent.extra.TITLE"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_f
    const v0, 0xf113f

    .line 120
    :try_start_0
    sget-boolean v2, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->useDefaultGalleryApp:Z

    if-nez v2, :cond_11

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-ne v2, v5, :cond_10

    invoke-static {}, Lcom/yasirkula/unity/NativeGalleryUtils;->IsXiaomiOrMIUI()Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_6

    .line 123
    :cond_10
    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    .line 121
    :cond_11
    :goto_6
    invoke-virtual {p0, p1, v0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 127
    :catch_0
    invoke-virtual {p0}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string v1, "No apps can perform this action."

    invoke-static {p1, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, 0x0

    .line 128
    invoke-virtual {p0, v0, v4, p1}, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method
