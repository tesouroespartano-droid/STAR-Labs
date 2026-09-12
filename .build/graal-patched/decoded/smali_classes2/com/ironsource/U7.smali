.class public final enum Lcom/ironsource/U7;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/U7$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/U7;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/ironsource/U7$a;

.field public static final enum c:Lcom/ironsource/U7;

.field public static final enum d:Lcom/ironsource/U7;

.field public static final enum e:Lcom/ironsource/U7;

.field private static final synthetic f:[Lcom/ironsource/U7;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/ironsource/U7;

    const-string v1, "UnknownProvider"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/U7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/U7;->c:Lcom/ironsource/U7;

    .line 2
    new-instance v0, Lcom/ironsource/U7;

    const-string v1, "DeliverySonic"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/U7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/U7;->d:Lcom/ironsource/U7;

    .line 3
    new-instance v0, Lcom/ironsource/U7;

    const/4 v1, 0x2

    const/4 v2, 0x3

    const-string v3, "MarketPlaceISX"

    invoke-direct {v0, v3, v1, v2}, Lcom/ironsource/U7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/U7;->e:Lcom/ironsource/U7;

    invoke-static {}, Lcom/ironsource/U7;->a()[Lcom/ironsource/U7;

    move-result-object v0

    sput-object v0, Lcom/ironsource/U7;->f:[Lcom/ironsource/U7;

    new-instance v0, Lcom/ironsource/U7$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ironsource/U7$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ironsource/U7;->b:Lcom/ironsource/U7$a;

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

    iput p3, p0, Lcom/ironsource/U7;->a:I

    return-void
.end method

.method private static final synthetic a()[Lcom/ironsource/U7;
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/U7;->c:Lcom/ironsource/U7;

    sget-object v1, Lcom/ironsource/U7;->d:Lcom/ironsource/U7;

    sget-object v2, Lcom/ironsource/U7;->e:Lcom/ironsource/U7;

    filled-new-array {v0, v1, v2}, [Lcom/ironsource/U7;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/U7;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/U7;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/U7;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/U7;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/U7;->f:[Lcom/ironsource/U7;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/U7;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/U7;->a:I

    return v0
.end method
