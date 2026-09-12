.class public final enum Lcom/ironsource/zg$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/zg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/zg$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/ironsource/zg$a;

.field public static final enum b:Lcom/ironsource/zg$a;

.field public static final enum c:Lcom/ironsource/zg$a;

.field public static final enum d:Lcom/ironsource/zg$a;

.field private static final synthetic e:[Lcom/ironsource/zg$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/zg$a;

    const-string v1, "NOT_RECOVERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ironsource/zg$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/zg$a;->a:Lcom/ironsource/zg$a;

    .line 2
    new-instance v0, Lcom/ironsource/zg$a;

    const-string v1, "RECOVERED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/zg$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/zg$a;->b:Lcom/ironsource/zg$a;

    .line 3
    new-instance v0, Lcom/ironsource/zg$a;

    const-string v1, "IN_RECOVERING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ironsource/zg$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/zg$a;->c:Lcom/ironsource/zg$a;

    .line 4
    new-instance v0, Lcom/ironsource/zg$a;

    const-string v1, "NOT_ALLOWED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ironsource/zg$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/zg$a;->d:Lcom/ironsource/zg$a;

    .line 5
    invoke-static {}, Lcom/ironsource/zg$a;->a()[Lcom/ironsource/zg$a;

    move-result-object v0

    sput-object v0, Lcom/ironsource/zg$a;->e:[Lcom/ironsource/zg$a;

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

.method private static synthetic a()[Lcom/ironsource/zg$a;
    .locals 4

    .line 1
    sget-object v0, Lcom/ironsource/zg$a;->a:Lcom/ironsource/zg$a;

    sget-object v1, Lcom/ironsource/zg$a;->b:Lcom/ironsource/zg$a;

    sget-object v2, Lcom/ironsource/zg$a;->c:Lcom/ironsource/zg$a;

    sget-object v3, Lcom/ironsource/zg$a;->d:Lcom/ironsource/zg$a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ironsource/zg$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/zg$a;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/zg$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/zg$a;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/zg$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/zg$a;->e:[Lcom/ironsource/zg$a;

    invoke-virtual {v0}, [Lcom/ironsource/zg$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/zg$a;

    return-object v0
.end method
