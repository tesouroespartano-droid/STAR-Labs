.class public Lcom/yasirkula/unity/FileBrowser;
.super Ljava/lang/Object;
.source "FileBrowser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;
    }
.end annotation


# static fields
.field private static final stringBuilder:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sput-object v0, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CheckPermission(Landroid/content/Context;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 163
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x21

    if-lt v0, v2, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-ge v0, v2, :cond_1

    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 166
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v0, v2, :cond_2

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static CheckSAF()Z
    .locals 2

    .line 194
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static CopyDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "sourceRawUri",
            "destinationRawUri",
            "isMoveOperation"
        }
    .end annotation

    .line 290
    const-string v0, "://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 291
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v1, :cond_0

    .line 294
    new-instance v2, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-static {p0, v2, p2, v0}, Lcom/yasirkula/unity/FileBrowser;->CopySAFDirectoryRecursively(Landroid/content/Context;Lcom/yasirkula/unity/FileBrowserSAFEntry;Ljava/lang/String;Z)V

    goto :goto_0

    .line 296
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v2, p2, v0}, Lcom/yasirkula/unity/FileBrowser;->CopyRawDirectoryRecursively(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Z)V

    :goto_0
    if-eqz p3, :cond_2

    if-eqz v1, :cond_1

    .line 301
    invoke-static {p0, p1}, Lcom/yasirkula/unity/FileBrowser;->DeleteSAFEntry(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 303
    :cond_1
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/yasirkula/unity/FileBrowser;->DeleteRawDirectoryRecursively(Ljava/io/File;)V

    :cond_2
    return-void
.end method

.method public static CopyFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "sourceRawUri",
            "destinationRawUri",
            "isMoveOperation"
        }
    .end annotation

    .line 246
    const-string v0, "://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 247
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 254
    invoke-static {p0, p1, p2}, Lcom/yasirkula/unity/FileBrowser;->CopySAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 259
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/yasirkula/unity/FileBrowser;->ReadFromSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 267
    invoke-static {p0, p2, p1, v0}, Lcom/yasirkula/unity/FileBrowser;->WriteToSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 272
    :cond_2
    invoke-static {p1, p2}, Lcom/yasirkula/unity/FileBrowser;->CopyRawFile(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-eqz p3, :cond_4

    if-eqz v1, :cond_3

    .line 279
    invoke-static {p0, p1}, Lcom/yasirkula/unity/FileBrowser;->DeleteSAFEntry(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 281
    :cond_3
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    :cond_4
    return-void
.end method

.method private static CopyRawDirectoryRecursively(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "sourceDirectory",
            "destinationRawUri",
            "isDestinationSAFDirectory"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 689
    new-instance v1, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->listFiles()Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_0

    .line 692
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 693
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    .line 696
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    .line 699
    :goto_1
    array-length v4, p1

    if-ge v3, v4, :cond_4

    .line 701
    aget-object v4, p1, v3

    .line 702
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz p3, :cond_1

    .line 706
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {p0, p2, v1, v6, v5}, Lcom/yasirkula/unity/FileBrowser;->FindSAFEntryWithNameOrCreateNew(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 708
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 710
    :goto_2
    invoke-static {p0, v4, v5, p3}, Lcom/yasirkula/unity/FileBrowser;->CopyRawDirectoryRecursively(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Z)V

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    .line 716
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, p2, v1, v2, v5}, Lcom/yasirkula/unity/FileBrowser;->FindSAFEntryWithNameOrCreateNew(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 717
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v5, v4, v2}, Lcom/yasirkula/unity/FileBrowser;->WriteToSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_3

    .line 721
    :cond_3
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 722
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lcom/yasirkula/unity/FileBrowser;->CopyRawFile(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method private static CopyRawFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "sourcePath",
            "destinationPath"
        }
    .end annotation

    .line 613
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 616
    :try_start_1
    new-instance p0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x1000

    .line 619
    :try_start_2
    new-array v1, v1, [B

    .line 621
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_0

    .line 622
    invoke-virtual {p0, v1, p1, v2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 626
    :cond_0
    :try_start_3
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 631
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 626
    :try_start_5
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 627
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    .line 631
    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 632
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 636
    const-string p1, "Unity"

    const-string v0, "Exception:"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private static CopySAFDirectoryRecursively(Landroid/content/Context;Lcom/yasirkula/unity/FileBrowserSAFEntry;Ljava/lang/String;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "sourceDirectory",
            "destinationRawUri",
            "isDestinationSAFDirectory"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 646
    new-instance v1, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->listFiles()Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_0

    .line 649
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 650
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    .line 653
    :goto_0
    invoke-virtual {p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->listFiles()Ljava/util/ArrayList;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    .line 654
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 656
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    .line 657
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz p3, :cond_1

    .line 661
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {p0, p2, v1, v6, v5}, Lcom/yasirkula/unity/FileBrowser;->FindSAFEntryWithNameOrCreateNew(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 663
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 665
    :goto_2
    invoke-static {p0, v4, v5, p3}, Lcom/yasirkula/unity/FileBrowser;->CopySAFDirectoryRecursively(Landroid/content/Context;Lcom/yasirkula/unity/FileBrowserSAFEntry;Ljava/lang/String;Z)V

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    .line 671
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, p2, v1, v2, v5}, Lcom/yasirkula/unity/FileBrowser;->FindSAFEntryWithNameOrCreateNew(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 672
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4, v5}, Lcom/yasirkula/unity/FileBrowser;->CopySAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 676
    :cond_3
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 677
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4, v5}, Lcom/yasirkula/unity/FileBrowser;->ReadFromSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public static CopySAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "sourceRawUri",
            "destinationRawUri"
        }
    .end annotation

    .line 413
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    goto :goto_2

    .line 419
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    const-string v0, "rwt"

    invoke-virtual {p0, p2, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0x1000

    .line 425
    :try_start_2
    new-array p2, p2, [B

    .line 427
    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    .line 428
    invoke-virtual {p0, p2, v1, v0}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 432
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 437
    :goto_1
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception p2

    .line 432
    :try_start_5
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 433
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    .line 437
    :try_start_6
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 438
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 442
    const-string p1, "Unity"

    const-string p2, "Exception:"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method

.method public static CreateSAFEntry(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "folderRawUri",
            "isFolder",
            "name"
        }
    .end annotation

    .line 323
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    if-eqz p2, :cond_0

    .line 325
    invoke-virtual {v0, p3}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->createDirectory(Ljava/lang/String;)Lcom/yasirkula/unity/FileBrowserSAFEntry;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x2e

    .line 327
    invoke-virtual {p3, p0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p0

    if-ltz p0, :cond_1

    add-int/lit8 p0, p0, 0x1

    .line 328
    invoke-virtual {p3, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string p0, ""

    .line 331
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object p1

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_3

    .line 332
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_4

    .line 333
    :cond_3
    const-string p0, "application/octet-stream"

    .line 335
    :cond_4
    invoke-virtual {v0, p0, p3}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->createFile(Ljava/lang/String;Ljava/lang/String;)Lcom/yasirkula/unity/FileBrowserSAFEntry;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static DeleteRawDirectoryRecursively(Ljava/io/File;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "directory"
        }
    .end annotation

    .line 732
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 735
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 737
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 738
    aget-object v2, v0, v1

    invoke-static {v2}, Lcom/yasirkula/unity/FileBrowser;->DeleteRawDirectoryRecursively(Ljava/io/File;)V

    goto :goto_1

    .line 740
    :cond_0
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 744
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public static DeleteSAFEntry(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 486
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->delete()Z

    move-result p0

    return p0
.end method

.method public static FetchSAFQuickLinks(Landroid/content/Context;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 212
    sget-object v0, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 214
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    move-result-object v0

    .line 215
    new-instance v2, Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;-><init>(Lcom/yasirkula/unity/FileBrowser$1;)V

    invoke-interface {v0, v2}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    move v2, v1

    .line 218
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 220
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/UriPermission;

    const/4 v4, 0x5

    const/4 v5, 0x3

    if-ge v2, v4, :cond_2

    .line 222
    invoke-virtual {v3}, Landroid/content/UriPermission;->getPersistedTime()J

    move-result-wide v6

    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v4, v6, v8

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Landroid/content/UriPermission;->isReadPermission()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Landroid/content/UriPermission;->isWritePermission()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    .line 226
    :cond_0
    invoke-virtual {v3}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->fromTreeUri(Landroid/content/Context;Landroid/net/Uri;)Lcom/yasirkula/unity/FileBrowserSAFEntry;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 227
    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->exists()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 229
    sget-object v3, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v4}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 233
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v3}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v4, v3, v5}, Landroid/content/ContentResolver;->releasePersistableUriPermission(Landroid/net/Uri;I)V

    goto :goto_2

    .line 223
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v3}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v4, v3, v5}, Landroid/content/ContentResolver;->releasePersistableUriPermission(Landroid/net/Uri;I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 237
    :cond_3
    sget-object p0, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static FindSAFEntryWithNameOrCreateNew(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "folderRawUri",
            "folderContents",
            "isDirectory",
            "entryName"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/yasirkula/unity/FileBrowserSAFEntry;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 750
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 752
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    .line 753
    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 755
    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->isDirectory()Z

    move-result p2

    if-ne p2, p3, :cond_0

    .line 756
    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getUri()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 760
    :cond_0
    invoke-virtual {v1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->delete()Z

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 766
    :cond_2
    :goto_1
    invoke-static {p0, p1, p3, p4}, Lcom/yasirkula/unity/FileBrowser;->CreateSAFEntry(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static GetExternalDrives(Landroid/content/Context;)Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 57
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 62
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    .line 68
    :goto_0
    sget-object v2, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 69
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ":"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    new-instance v2, Ljava/util/HashSet;

    const/16 v5, 0x10

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 75
    const-string v5, "SECONDARY_STORAGE"

    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 76
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    .line 77
    :cond_0
    const-string v5, "EXTERNAL_SDCARD_STORAGE"

    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_1
    if-eqz v5, :cond_3

    .line 79
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_3

    .line 81
    invoke-virtual {v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    move v6, v3

    .line 82
    :goto_1
    array-length v7, v5

    if-ge v6, v7, :cond_3

    .line 84
    aget-object v7, v5, v6

    if-eqz v7, :cond_2

    .line 85
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    .line 86
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x7

    .line 92
    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "/storage"

    aput-object v7, v6, v3

    const-string v7, "/mnt"

    const/4 v8, 0x1

    aput-object v7, v6, v8

    const/4 v7, 0x2

    const-string v8, "/storage/removable"

    aput-object v8, v6, v7

    const/4 v7, 0x3

    const-string v8, "/removable"

    aput-object v8, v6, v7

    const/4 v7, 0x4

    const-string v8, "/data"

    aput-object v8, v6, v7

    const/4 v7, 0x5

    const-string v8, "/mnt/media_rw"

    aput-object v8, v6, v7

    const/4 v7, 0x6

    const-string v8, "/mnt/sdcard0"

    aput-object v8, v6, v7

    move v7, v3

    :goto_2
    if-ge v7, v5, :cond_6

    .line 94
    aget-object v8, v6, v7

    .line 98
    :try_start_1
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v8

    .line 99
    array-length v9, v8

    move v10, v3

    :goto_3
    if-ge v10, v9, :cond_5

    aget-object v11, v8, v10

    .line 101
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v11}, Ljava/io/File;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v11}, Ljava/io/File;->canRead()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 102
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :catch_1
    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 111
    :cond_6
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    const-string v7, "storage"

    if-lt v5, v6, :cond_8

    .line 113
    invoke-virtual {p0, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/storage/StorageManager;

    invoke-virtual {p0}, Landroid/os/storage/StorageManager;->getStorageVolumes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/storage/StorageVolume;

    .line 115
    invoke-virtual {v3}, Landroid/os/storage/StorageVolume;->getDirectory()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 117
    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 124
    :cond_8
    :try_start_2
    const-class v5, Landroid/os/storage/StorageVolume;

    const-string v6, "getPath"

    new-array v8, v3, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 125
    invoke-virtual {p0, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/storage/StorageManager;

    invoke-virtual {p0}, Landroid/os/storage/StorageManager;->getStorageVolumes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/storage/StorageVolume;

    .line 126
    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    .line 133
    :catch_2
    :cond_9
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :catch_3
    :cond_a
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "Android"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 139
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 144
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 145
    sget-object v2, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    .line 154
    :cond_b
    sget-object p0, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static GetParentDirectory(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 494
    const-string v0, "%2F"

    const-string v1, "%3A"

    const-string v2, ""

    :try_start_0
    const-string v3, "://"

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 497
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object v2

    .line 503
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/provider/DocumentsContract;->findDocumentPath(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/provider/DocumentsContract$Path;

    move-result-object v3

    const/16 v4, 0x2f

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    .line 506
    invoke-virtual {v3}, Landroid/provider/DocumentsContract$Path;->getPath()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 507
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_4

    .line 510
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-le v7, v6, :cond_2

    .line 511
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x2

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 514
    :cond_2
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 515
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    const/16 v8, 0x3a

    invoke-virtual {v3, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    add-int/2addr v8, v6

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    if-lez v7, :cond_3

    .line 516
    invoke-virtual {v3, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_4

    .line 519
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_4

    .line 521
    invoke-virtual {p1, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    add-int/2addr v7, v6

    if-lez v7, :cond_4

    .line 524
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 525
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {p0, v3, v6}, Lcom/yasirkula/unity/FileBrowser;->SAFEntryExists(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_4

    return-object v3

    .line 533
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_5

    add-int/lit8 v3, v3, 0x3

    .line 537
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-ltz v3, :cond_b

    .line 538
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-lt v3, v7, :cond_6

    goto/16 :goto_1

    .line 541
    :cond_6
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 543
    invoke-static {p0, p1, v6}, Lcom/yasirkula/unity/FileBrowser;->SAFEntryExists(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_7

    return-object p1

    .line 550
    :cond_7
    const-string v3, "/tree/"

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_c

    add-int/lit8 v7, v3, 0x6

    .line 554
    invoke-virtual {p1, v4, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    add-int/lit8 v3, v3, 0xa

    if-le v4, v3, :cond_c

    .line 557
    invoke-virtual {p1, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 558
    invoke-virtual {p1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 559
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 562
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x3

    move-object v8, v3

    :cond_8
    sub-int/2addr v4, v6

    .line 563
    invoke-virtual {v8, v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    move-result v4

    if-lez v4, :cond_9

    .line 565
    invoke-virtual {v8, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 567
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 568
    invoke-static {p0, v9, v6}, Lcom/yasirkula/unity/FileBrowser;->SAFEntryExists(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_8

    return-object v9

    .line 573
    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    :cond_a
    sub-int/2addr v0, v6

    .line 574
    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_c

    add-int/lit8 v4, v0, 0x3

    .line 576
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 578
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 579
    invoke-static {p0, v4, v6}, Lcom/yasirkula/unity/FileBrowser;->SAFEntryExists(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v8, :cond_a

    return-object v4

    :cond_b
    :goto_1
    return-object v2

    :catch_0
    move-exception p0

    .line 587
    const-string p1, "Unity"

    const-string v0, "Exception:"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_c
    return-object v2
.end method

.method public static IsSAFEntryChildOfAnother(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri",
            "parentRawUri"
        }
    .end annotation

    .line 598
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0, p2, p1}, Landroid/provider/DocumentsContract;->isChildDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 602
    const-string p1, "Unity"

    const-string p2, "Exception:"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return p0
.end method

.method public static OpenSAFFolder(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 311
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 313
    sget-object p0, Lcom/yasirkula/unity/FileBrowser;->stringBuilder:Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 314
    invoke-virtual {v0, p0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->appendFilesToStringBuilder(Ljava/lang/StringBuilder;)V

    .line 316
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static PickSAFFolder(Landroid/content/Context;Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x10
        }
        names = {
            "context",
            "directoryReceiver"
        }
    .end annotation

    .line 201
    new-instance v0, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;

    invoke-direct {v0, p1}, Lcom/yasirkula/unity/FileBrowserDirectoryPickerFragment;-><init>(Lcom/yasirkula/unity/FileBrowserDirectoryReceiver;)V

    .line 202
    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public static ReadFromSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri",
            "destinationFile"
        }
    .end annotation

    .line 378
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_1

    .line 384
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-direct {p1, v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v0, 0x1000

    .line 387
    :try_start_2
    new-array v0, v0, [B

    .line 389
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_1

    .line 390
    invoke-virtual {p1, v0, p2, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 394
    :cond_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 399
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception p2

    .line 394
    :try_start_5
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 395
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    .line 399
    :try_start_6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 400
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 404
    const-string p1, "Unity"

    const-string p2, "Exception:"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public static RenameSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri",
            "newName"
        }
    .end annotation

    .line 480
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0, p2}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->renameTo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static RequestPermission(Landroid/content/Context;Lcom/yasirkula/unity/FileBrowserPermissionReceiver;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x10,
            0x10
        }
        names = {
            "context",
            "permissionReceiver",
            "lastCheckResult"
        }
    .end annotation

    .line 175
    invoke-static {p0}, Lcom/yasirkula/unity/FileBrowser;->CheckPermission(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 177
    invoke-interface {p1, v1}, Lcom/yasirkula/unity/FileBrowserPermissionReceiver;->OnPermissionResult(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    if-nez p2, :cond_1

    .line 183
    invoke-interface {p1, v0}, Lcom/yasirkula/unity/FileBrowserPermissionReceiver;->OnPermissionResult(I)V

    return-void

    .line 187
    :cond_1
    new-instance p2, Lcom/yasirkula/unity/FileBrowserPermissionFragment;

    invoke-direct {p2, p1}, Lcom/yasirkula/unity/FileBrowserPermissionFragment;-><init>(Lcom/yasirkula/unity/FileBrowserPermissionReceiver;)V

    .line 188
    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p0

    invoke-virtual {p0, v0, p2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public static SAFEntryDirectory(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 456
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->isDirectory()Z

    move-result p0

    return p0
.end method

.method public static SAFEntryExists(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri",
            "isDirectory"
        }
    .end annotation

    .line 449
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 450
    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->isDirectory()Z

    move-result p0

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static SAFEntryLastModified(Landroid/content/Context;Ljava/lang/String;)J
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 474
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->lastModified()J

    move-result-wide p0

    return-wide p0
.end method

.method public static SAFEntryName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 462
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static SAFEntrySize(Landroid/content/Context;Ljava/lang/String;)J
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri"
        }
    .end annotation

    .line 468
    new-instance v0, Lcom/yasirkula/unity/FileBrowserSAFEntry;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/yasirkula/unity/FileBrowserSAFEntry;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/yasirkula/unity/FileBrowserSAFEntry;->length()J

    move-result-wide p0

    return-wide p0
.end method

.method public static WriteToSAFEntry(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "rawUri",
            "sourceFile",
            "appendMode"
        }
    .end annotation

    .line 343
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p3, :cond_0

    const-string p2, "wa"

    goto :goto_0

    :cond_0
    const-string p2, "rwt"

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez p0, :cond_1

    goto :goto_2

    :cond_1
    const/16 p1, 0x1000

    .line 352
    :try_start_2
    new-array p1, p1, [B

    .line 354
    :goto_1
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p2

    if-lez p2, :cond_2

    const/4 p3, 0x0

    .line 355
    invoke-virtual {p0, p1, p3, p2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 359
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 364
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 359
    :try_start_5
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 360
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    .line 364
    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 365
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 369
    const-string p1, "Unity"

    const-string p2, "Exception:"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
