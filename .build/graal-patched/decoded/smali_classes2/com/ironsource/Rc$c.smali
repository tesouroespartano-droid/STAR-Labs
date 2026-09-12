.class final enum Lcom/ironsource/Rc$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/Rc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/Rc$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/ironsource/Rc$c;

.field public static final enum d:Lcom/ironsource/Rc$c;

.field public static final enum e:Lcom/ironsource/Rc$c;

.field public static final enum f:Lcom/ironsource/Rc$c;

.field public static final enum g:Lcom/ironsource/Rc$c;

.field private static final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ironsource/Rc$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic i:[Lcom/ironsource/Rc$c;


# instance fields
.field private final a:I

.field private final b:[Ljava/lang/String;


# direct methods
.method static bridge synthetic -$$Nest$mc(Lcom/ironsource/Rc$c;)I
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/Rc$c;->c()I

    move-result p0

    return p0
.end method

.method static bridge synthetic -$$Nest$md(Lcom/ironsource/Rc$c;)[Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/ironsource/Rc$c;->d()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic -$$Nest$smb()Ljava/util/ArrayList;
    .locals 1

    invoke-static {}, Lcom/ironsource/Rc$c;->b()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/ironsource/Rc$c;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "com.android.vending"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "GOOGLE_PLAY"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v4, v5, v2}, Lcom/ironsource/Rc$c;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v0, Lcom/ironsource/Rc$c;->c:Lcom/ironsource/Rc$c;

    .line 2
    new-instance v0, Lcom/ironsource/Rc$c;

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "com.google.market"

    aput-object v3, v2, v4

    const-string v3, "GOOGLE_MARKET"

    const/4 v6, 0x4

    invoke-direct {v0, v3, v1, v6, v2}, Lcom/ironsource/Rc$c;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v0, Lcom/ironsource/Rc$c;->d:Lcom/ironsource/Rc$c;

    .line 3
    new-instance v0, Lcom/ironsource/Rc$c;

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "com.sec.android.app.samsungapps"

    aput-object v3, v2, v4

    const-string v3, "SAMSUNG"

    const/4 v7, 0x5

    invoke-direct {v0, v3, v5, v7, v2}, Lcom/ironsource/Rc$c;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v0, Lcom/ironsource/Rc$c;->e:Lcom/ironsource/Rc$c;

    .line 4
    new-instance v0, Lcom/ironsource/Rc$c;

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "com.amazon.venezia"

    aput-object v3, v2, v4

    const/4 v3, 0x3

    const/4 v5, 0x6

    const-string v7, "AMAZON"

    invoke-direct {v0, v7, v3, v5, v2}, Lcom/ironsource/Rc$c;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v0, Lcom/ironsource/Rc$c;->f:Lcom/ironsource/Rc$c;

    .line 5
    new-instance v0, Lcom/ironsource/Rc$c;

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "com.huawei.appmarket"

    aput-object v2, v1, v4

    const-string v2, "HUAWEI"

    const/4 v3, 0x7

    invoke-direct {v0, v2, v6, v3, v1}, Lcom/ironsource/Rc$c;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v0, Lcom/ironsource/Rc$c;->g:Lcom/ironsource/Rc$c;

    .line 6
    invoke-static {}, Lcom/ironsource/Rc$c;->a()[Lcom/ironsource/Rc$c;

    move-result-object v0

    sput-object v0, Lcom/ironsource/Rc$c;->i:[Lcom/ironsource/Rc$c;

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ironsource/Rc$c;->h:Ljava/util/Map;

    .line 32
    invoke-static {}, Lcom/ironsource/Rc$c;->values()[Lcom/ironsource/Rc$c;

    move-result-object v0

    array-length v1, v0

    move v2, v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 33
    invoke-direct {v3}, Lcom/ironsource/Rc$c;->d()[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    move v7, v4

    :goto_1
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 34
    sget-object v9, Lcom/ironsource/Rc$c;->h:Ljava/util/Map;

    invoke-interface {v9, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/ironsource/Rc$c;->a:I

    .line 3
    iput-object p4, p0, Lcom/ironsource/Rc$c;->b:[Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Lcom/ironsource/Rc$c;
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/Rc$c;->c:Lcom/ironsource/Rc$c;

    sget-object v1, Lcom/ironsource/Rc$c;->d:Lcom/ironsource/Rc$c;

    sget-object v2, Lcom/ironsource/Rc$c;->e:Lcom/ironsource/Rc$c;

    sget-object v3, Lcom/ironsource/Rc$c;->f:Lcom/ironsource/Rc$c;

    sget-object v4, Lcom/ironsource/Rc$c;->g:Lcom/ironsource/Rc$c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/ironsource/Rc$c;

    move-result-object v0

    return-object v0
.end method

.method private static b()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/ironsource/Rc$c;->h:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/Rc$c;->a:I

    return v0
.end method

.method private d()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/Rc$c;->b:[Ljava/lang/String;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/Rc$c;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/Rc$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/Rc$c;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/Rc$c;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Rc$c;->i:[Lcom/ironsource/Rc$c;

    invoke-virtual {v0}, [Lcom/ironsource/Rc$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/Rc$c;

    return-object v0
.end method
