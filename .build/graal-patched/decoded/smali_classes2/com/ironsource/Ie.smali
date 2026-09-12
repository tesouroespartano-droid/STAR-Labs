.class public final enum Lcom/ironsource/Ie;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/Ie$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/Ie;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/ironsource/Ie$a;

.field public static final enum c:Lcom/ironsource/Ie;

.field public static final enum d:Lcom/ironsource/Ie;

.field public static final enum e:Lcom/ironsource/Ie;

.field private static final synthetic f:[Lcom/ironsource/Ie;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/Ie;

    const-string v1, "Off"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Ie;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Ie;->c:Lcom/ironsource/Ie;

    .line 2
    new-instance v0, Lcom/ironsource/Ie;

    const-string v1, "CurrentlyLoadedAds"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Ie;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Ie;->d:Lcom/ironsource/Ie;

    .line 3
    new-instance v0, Lcom/ironsource/Ie;

    const-string v1, "CurrentlyLoadedAdsAndFullHistory"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Ie;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Ie;->e:Lcom/ironsource/Ie;

    invoke-static {}, Lcom/ironsource/Ie;->a()[Lcom/ironsource/Ie;

    move-result-object v0

    sput-object v0, Lcom/ironsource/Ie;->f:[Lcom/ironsource/Ie;

    new-instance v0, Lcom/ironsource/Ie$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/Ie$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/Ie;->b:Lcom/ironsource/Ie$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ironsource/Ie;->a:I

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/Ie;)I
    .locals 0

    .line 2
    iget p0, p0, Lcom/ironsource/Ie;->a:I

    return p0
.end method

.method private static final synthetic a()[Lcom/ironsource/Ie;
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/Ie;->c:Lcom/ironsource/Ie;

    sget-object v1, Lcom/ironsource/Ie;->d:Lcom/ironsource/Ie;

    sget-object v2, Lcom/ironsource/Ie;->e:Lcom/ironsource/Ie;

    filled-new-array {v0, v1, v2}, [Lcom/ironsource/Ie;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/Ie;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/Ie;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/Ie;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/Ie;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Ie;->f:[Lcom/ironsource/Ie;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/Ie;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/Ie;->a:I

    return v0
.end method
