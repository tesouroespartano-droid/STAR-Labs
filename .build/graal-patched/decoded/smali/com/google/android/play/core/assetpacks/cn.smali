.class final Lcom/google/android/play/core/assetpacks/cn;
.super Ljava/io/OutputStream;
.source "com.google.android.play:asset-delivery@@2.2.1"


# instance fields
.field private final a:Lcom/google/android/play/core/assetpacks/ds;

.field private final b:Ljava/io/File;

.field private final c:Lcom/google/android/play/core/assetpacks/em;

.field private d:J

.field private e:J

.field private f:Ljava/io/FileOutputStream;

.field private g:Lcom/google/android/play/core/assetpacks/es;


# direct methods
.method constructor <init>(Ljava/io/File;Lcom/google/android/play/core/assetpacks/em;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    new-instance v0, Lcom/google/android/play/core/assetpacks/ds;

    .line 2
    invoke-direct {v0}, Lcom/google/android/play/core/assetpacks/ds;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->a:Lcom/google/android/play/core/assetpacks/ds;

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/cn;->b:Ljava/io/File;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 1
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/play/core/assetpacks/cn;->write([BII)V

    return-void
.end method

.method public final write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/play/core/assetpacks/cn;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    if-lez p3, :cond_9

    .line 3
    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->a:Lcom/google/android/play/core/assetpacks/ds;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/play/core/assetpacks/ds;->b([BII)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->a:Lcom/google/android/play/core/assetpacks/ds;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/ds;->c()Lcom/google/android/play/core/assetpacks/es;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-wide v2, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 6
    invoke-virtual {v4}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    invoke-virtual {v5}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object v5

    array-length v5, v5

    .line 7
    invoke-virtual {v0, v4, v1, v5}, Lcom/google/android/play/core/assetpacks/em;->l([BII)V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object v0

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->e:J

    goto :goto_2

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/assetpacks/em;->j([B)V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->b:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 14
    invoke-virtual {v4}, Lcom/google/android/play/core/assetpacks/es;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 16
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->b()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    new-instance v0, Ljava/io/FileOutputStream;

    .line 17
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->f:Ljava/io/FileOutputStream;

    goto :goto_2

    .line 9
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object v0

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    .line 11
    array-length v5, v0

    invoke-virtual {v4, v0, v1, v5}, Lcom/google/android/play/core/assetpacks/em;->l([BII)V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    :cond_4
    :goto_2
    move v8, p2

    move v9, p3

    .line 8
    iget-object p2, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 18
    invoke-virtual {p2}, Lcom/google/android/play/core/assetpacks/es;->g()Z

    move-result p2

    if-nez p2, :cond_8

    int-to-long p2, v9

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 19
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    iget-wide v5, p0, Lcom/google/android/play/core/assetpacks/cn;->e:J

    move-object v7, p1

    .line 20
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/play/core/assetpacks/em;->e(J[BII)V

    move p1, v9

    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->e:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->e:J

    goto :goto_3

    :cond_5
    move-object v7, p1

    move p1, v9

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 21
    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    .line 25
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int v9, p2

    iget-object p2, p0, Lcom/google/android/play/core/assetpacks/cn;->f:Ljava/io/FileOutputStream;

    .line 26
    invoke-virtual {p2, v7, v8, v9}, Ljava/io/FileOutputStream;->write([BII)V

    iget-wide p2, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    int-to-long v0, v9

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    cmp-long p2, p2, v2

    if-nez p2, :cond_7

    iget-object p2, p0, Lcom/google/android/play/core/assetpacks/cn;->f:Ljava/io/FileOutputStream;

    .line 27
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    goto :goto_3

    :cond_6
    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    .line 22
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int v9, p2

    iget-object p2, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    .line 23
    invoke-virtual {p2}, Lcom/google/android/play/core/assetpacks/es;->f()[B

    move-result-object p2

    array-length p2, p2

    int-to-long p2, p2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/cn;->g:Lcom/google/android/play/core/assetpacks/es;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/es;->b()J

    move-result-wide v0

    add-long/2addr p2, v0

    iget-wide v0, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    sub-long v5, p2, v0

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/cn;->c:Lcom/google/android/play/core/assetpacks/em;

    .line 24
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/play/core/assetpacks/em;->e(J[BII)V

    iget-wide p2, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    int-to-long v0, v9

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lcom/google/android/play/core/assetpacks/cn;->d:J

    :cond_7
    :goto_3
    add-int p2, v8, v9

    sub-int p3, p1, v9

    move-object p1, v7

    goto/16 :goto_0

    :cond_8
    move-object v7, p1

    move p1, v9

    move p3, p1

    move-object p1, v7

    move p2, v8

    goto/16 :goto_0

    :cond_9
    :goto_4
    return-void
.end method
