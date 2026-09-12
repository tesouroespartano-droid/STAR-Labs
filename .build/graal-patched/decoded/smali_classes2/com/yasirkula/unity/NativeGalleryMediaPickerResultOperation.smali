.class public Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;
.super Ljava/lang/Object;
.source "NativeGalleryMediaPickerResultOperation.java"


# instance fields
.field private cancelled:Z

.field private final context:Landroid/content/Context;

.field private final data:Landroid/content/Intent;

.field public finished:Z

.field private final mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

.field public progress:I

.field private final savePathDirectory:Ljava/lang/String;

.field private final savePathFilename:Ljava/lang/String;

.field private savedFiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selectMultiple:Z

.field public sentResult:Z

.field private unityResult:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yasirkula/unity/NativeGalleryMediaReceiver;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10,
            0x10,
            0x10,
            0x10
        }
        names = {
            "context",
            "mediaReceiver",
            "data",
            "selectMultiple",
            "savePathDirectory",
            "savePathFilename"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->context:Landroid/content/Context;

    .line 37
    iput-object p2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    .line 38
    iput-object p3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->data:Landroid/content/Intent;

    .line 39
    iput-boolean p4, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->selectMultiple:Z

    .line 40
    iput-object p5, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savePathDirectory:Ljava/lang/String;

    .line 41
    iput-object p6, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savePathFilename:Ljava/lang/String;

    return-void
.end method

.method private copyToTempFile(Landroid/net/Uri;)Ljava/lang/String;
    .locals 19
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uri"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 163
    const-string v8, "Exception:"

    const-string v9, "Unity"

    iget-object v0, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    .line 170
    :try_start_0
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_0

    .line 171
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    const-string v0, "_display_name"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :try_start_2
    const-string v0, "_size"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v10, v4

    goto/16 :goto_e

    :catch_1
    move-exception v0

    move-object v5, v10

    goto :goto_2

    :cond_0
    move-object v5, v10

    :goto_0
    if-eqz v4, :cond_1

    .line 184
    :goto_1
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_e

    :catch_2
    move-exception v0

    move-object v4, v10

    move-object v5, v4

    .line 179
    :goto_2
    :try_start_3
    invoke-static {v9, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    :goto_3
    if-eqz v5, :cond_2

    .line 187
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v4, 0x3

    if-ge v0, v4, :cond_3

    .line 188
    :cond_2
    const-string v5, "temp"

    :cond_3
    const/16 v0, 0x2e

    .line 191
    invoke-virtual {v5, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v4, 0x1

    if-lez v0, :cond_4

    .line 192
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v4

    if-ge v0, v6, :cond_4

    .line 193
    invoke-virtual {v5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 196
    :cond_4
    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 199
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v6

    invoke-virtual {v6, v0}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 200
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_5

    .line 201
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v10

    :goto_4
    if-nez v0, :cond_6

    .line 206
    const-string v0, ".tmp"

    .line 208
    :cond_6
    sget-boolean v6, Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->tryPreserveFilenames:Z

    const/4 v7, 0x0

    if-nez v6, :cond_7

    .line 209
    iget-object v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savePathFilename:Ljava/lang/String;

    goto :goto_5

    .line 210
    :cond_7
    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 211
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    sub-int/2addr v6, v13

    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 215
    :cond_8
    :goto_5
    :try_start_4
    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    if-nez v2, :cond_9

    return-object v10

    :cond_9
    const-wide/16 v13, 0x0

    cmp-long v3, v11, v13

    if-gez v3, :cond_a

    .line 223
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    int-to-long v11, v3

    :catch_3
    cmp-long v3, v11, v13

    if-gez v3, :cond_a

    move-wide v11, v13

    .line 233
    :cond_a
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 234
    iget-object v6, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    const/4 v15, -0x1

    if-eqz v6, :cond_c

    move/from16 v16, v4

    move/from16 v17, v16

    move v6, v7

    .line 237
    :goto_6
    iget-object v4, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v6, v4, :cond_c

    .line 239
    iget-object v4, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    add-int/lit8 v3, v16, 0x1

    .line 242
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move/from16 v16, v3

    move-object v3, v4

    move v6, v15

    :cond_b
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 248
    :cond_c
    new-instance v0, Ljava/io/File;

    iget-object v4, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savePathDirectory:Ljava/lang/String;

    invoke-direct {v0, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 252
    :try_start_7
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    cmp-long v5, v11, v13

    if-lez v5, :cond_d

    move v15, v7

    .line 253
    :cond_d
    :try_start_8
    iput v15, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    const/16 v6, 0x1000

    .line 255
    new-array v6, v6, [B

    .line 257
    :goto_7
    invoke-virtual {v2, v6}, Ljava/io/InputStream;->read([B)I

    move-result v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    move-object/from16 v16, v10

    if-lez v15, :cond_11

    .line 259
    :try_start_9
    iget-boolean v10, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->cancelled:Z

    if-eqz v10, :cond_e

    goto :goto_8

    .line 262
    :cond_e
    invoke-virtual {v4, v6, v7, v15}, Ljava/io/OutputStream;->write([BII)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-lez v5, :cond_10

    move-object v10, v8

    int-to-long v7, v15

    add-long/2addr v13, v7

    long-to-double v7, v13

    move-object v15, v4

    move/from16 v18, v5

    long-to-double v4, v11

    div-double/2addr v7, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v7, v4

    double-to-int v4, v7

    .line 268
    :try_start_a
    iput v4, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    const/16 v5, 0x64

    if-le v4, v5, :cond_f

    .line 270
    iput v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    :cond_f
    move-object v8, v10

    move-object v4, v15

    move-object/from16 v10, v16

    move/from16 v5, v18

    const/4 v7, 0x0

    goto :goto_7

    :cond_10
    move-object/from16 v10, v16

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v15, v4

    goto :goto_a

    :cond_11
    :goto_8
    move-object v15, v4

    move/from16 v18, v5

    move-object v10, v8

    .line 274
    iget-boolean v4, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->cancelled:Z

    if-eqz v4, :cond_12

    .line 276
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 279
    :try_start_b
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object/from16 v4, v16

    goto :goto_9

    :catchall_3
    move-exception v0

    goto :goto_b

    :cond_12
    if-lez v18, :cond_13

    const/16 v5, 0x64

    .line 282
    :try_start_c
    iput v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :cond_13
    move-object v4, v15

    .line 284
    :goto_9
    :try_start_d
    iget-boolean v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->selectMultiple:Z

    if-eqz v5, :cond_15

    .line 286
    iget-object v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    if-nez v5, :cond_14

    .line 287
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    .line 289
    :cond_14
    iget-object v5, v1, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->savedFiles:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    :cond_15
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    if-eqz v4, :cond_16

    .line 297
    :try_start_e
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 299
    :cond_16
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return-object v0

    :catchall_4
    move-exception v0

    goto :goto_c

    :catchall_5
    move-exception v0

    move-object v4, v15

    goto :goto_c

    :catchall_6
    move-exception v0

    move-object v15, v4

    move-object/from16 v16, v10

    :goto_a
    move-object v10, v8

    goto :goto_c

    :catchall_7
    move-exception v0

    move-object/from16 v16, v10

    move-object v10, v8

    :goto_b
    move-object/from16 v4, v16

    :goto_c
    if-eqz v4, :cond_17

    .line 297
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 299
    :cond_17
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 300
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    :catch_4
    move-exception v0

    goto :goto_d

    :catch_5
    move-exception v0

    move-object/from16 v16, v10

    move-object v10, v8

    .line 304
    :goto_d
    invoke-static {v9, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v16

    :goto_e
    if-eqz v10, :cond_18

    .line 184
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 185
    :cond_18
    throw v0
.end method

.method private getPathFromURI(Landroid/net/Uri;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uri"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 124
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Selected media uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unity"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    iget-object v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->context:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/yasirkula/unity/NativeGalleryUtils;->GetPathFromURI(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 127
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 133
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 134
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->read()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-object v1

    :catchall_0
    move-exception p1

    move-object v0, v2

    goto :goto_0

    :catch_1
    move-object v0, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 153
    :catch_2
    :cond_1
    throw p1

    :catch_3
    :goto_1
    if-eqz v0, :cond_2

    .line 147
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 157
    :catch_4
    :cond_2
    invoke-direct {p0, p1}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->copyToTempFile(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 92
    iget-boolean v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->cancelled:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->finished:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    const-string v0, "Unity"

    const-string v1, "Cancelled NativeGalleryMediaPickerResultOperation!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->cancelled:Z

    .line 98
    const-string v0, ""

    iput-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public execute()V
    .locals 9

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    const/4 v1, -0x1

    .line 47
    iput v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    const/16 v1, 0x64

    const/4 v2, 0x1

    .line 51
    :try_start_0
    iget-boolean v3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->selectMultiple:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->data:Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->data:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipData;->getItemCount()I

    move-result v0

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_1

    .line 62
    iget-boolean v6, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->cancelled:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_2

    .line 85
    :cond_1
    :goto_1
    iput v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    .line 86
    iput-boolean v2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->finished:Z

    return-void

    .line 65
    :cond_2
    :try_start_1
    iget-object v6, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->data:Landroid/content/Intent;

    invoke-virtual {v6}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->getPathFromURI(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 66
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_4

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v5, :cond_3

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    move v5, v3

    goto :goto_2

    .line 74
    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ">"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 53
    :cond_5
    :goto_3
    iget-object v3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->data:Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->getPathFromURI(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 54
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 55
    :cond_6
    iput-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 81
    :try_start_2
    const-string v3, "Unity"

    const-string v4, "Exception:"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    iput v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    .line 86
    iput-boolean v2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->finished:Z

    return-void

    .line 85
    :goto_4
    iput v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->progress:I

    .line 86
    iput-boolean v2, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->finished:Z

    .line 87
    throw v0
.end method

.method public sendResultToUnity()V
    .locals 2

    .line 103
    iget-boolean v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->sentResult:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->sentResult:Z

    .line 108
    iget-object v0, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->mediaReceiver:Lcom/yasirkula/unity/NativeGalleryMediaReceiver;

    if-nez v0, :cond_1

    .line 109
    const-string v0, "Unity"

    const-string v1, "NativeGalleryMediaPickerResultOperation.mediaReceiver became null!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 112
    :cond_1
    iget-boolean v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->selectMultiple:Z

    if-eqz v1, :cond_2

    .line 113
    iget-object v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/yasirkula/unity/NativeGalleryMediaReceiver;->OnMultipleMediaReceived(Ljava/lang/String;)V

    return-void

    .line 115
    :cond_2
    iget-object v1, p0, Lcom/yasirkula/unity/NativeGalleryMediaPickerResultOperation;->unityResult:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/yasirkula/unity/NativeGalleryMediaReceiver;->OnMediaReceived(Ljava/lang/String;)V

    return-void
.end method
