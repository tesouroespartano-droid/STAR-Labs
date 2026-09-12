.class public final enum Lcom/ironsource/da;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/da;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/ironsource/da;

.field public static final enum b:Lcom/ironsource/da;

.field public static final enum c:Lcom/ironsource/da;

.field public static final enum d:Lcom/ironsource/da;

.field public static final enum e:Lcom/ironsource/da;

.field private static final synthetic f:[Lcom/ironsource/da;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/da;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ironsource/da;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/da;->a:Lcom/ironsource/da;

    .line 2
    new-instance v0, Lcom/ironsource/da;

    const-string v1, "STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/da;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/da;->b:Lcom/ironsource/da;

    .line 3
    new-instance v0, Lcom/ironsource/da;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ironsource/da;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/da;->c:Lcom/ironsource/da;

    .line 4
    new-instance v0, Lcom/ironsource/da;

    const-string v1, "PAUSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ironsource/da;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/da;->d:Lcom/ironsource/da;

    .line 5
    new-instance v0, Lcom/ironsource/da;

    const-string v1, "STOPPED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/ironsource/da;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/da;->e:Lcom/ironsource/da;

    .line 6
    invoke-static {}, Lcom/ironsource/da;->a()[Lcom/ironsource/da;

    move-result-object v0

    sput-object v0, Lcom/ironsource/da;->f:[Lcom/ironsource/da;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic a()[Lcom/ironsource/da;
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/da;->a:Lcom/ironsource/da;

    sget-object v1, Lcom/ironsource/da;->b:Lcom/ironsource/da;

    sget-object v2, Lcom/ironsource/da;->c:Lcom/ironsource/da;

    sget-object v3, Lcom/ironsource/da;->d:Lcom/ironsource/da;

    sget-object v4, Lcom/ironsource/da;->e:Lcom/ironsource/da;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/ironsource/da;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/da;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/da;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/da;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/da;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/da;->f:[Lcom/ironsource/da;

    invoke-virtual {v0}, [Lcom/ironsource/da;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/da;

    return-object v0
.end method
