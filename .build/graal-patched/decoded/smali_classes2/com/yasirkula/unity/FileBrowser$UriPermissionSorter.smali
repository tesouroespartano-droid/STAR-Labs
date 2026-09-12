.class Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;
.super Ljava/lang/Object;
.source "FileBrowser.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yasirkula/unity/FileBrowser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UriPermissionSorter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/content/UriPermission;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yasirkula/unity/FileBrowser$1;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Landroid/content/UriPermission;Landroid/content/UriPermission;)I
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "a",
            "b"
        }
    .end annotation

    .line 43
    invoke-virtual {p2}, Landroid/content/UriPermission;->getPersistedTime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/content/UriPermission;->getPersistedTime()J

    move-result-wide p1

    sub-long/2addr v0, p1

    const-wide/16 p1, 0x0

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "a",
            "b"
        }
    .end annotation

    .line 38
    check-cast p1, Landroid/content/UriPermission;

    check-cast p2, Landroid/content/UriPermission;

    invoke-virtual {p0, p1, p2}, Lcom/yasirkula/unity/FileBrowser$UriPermissionSorter;->compare(Landroid/content/UriPermission;Landroid/content/UriPermission;)I

    move-result p1

    return p1
.end method
