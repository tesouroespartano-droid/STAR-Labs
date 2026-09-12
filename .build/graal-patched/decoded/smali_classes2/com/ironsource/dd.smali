.class public final enum Lcom/ironsource/dd;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/dd;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/ironsource/dd;

.field public static final enum c:Lcom/ironsource/dd;

.field private static final synthetic d:[Lcom/ironsource/dd;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/ironsource/dd;

    const/4 v1, 0x0

    const-string v2, "d"

    const-string v3, "PER_DAY"

    invoke-direct {v0, v3, v1, v2}, Lcom/ironsource/dd;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ironsource/dd;->b:Lcom/ironsource/dd;

    .line 2
    new-instance v0, Lcom/ironsource/dd;

    const/4 v1, 0x1

    const-string v2, "h"

    const-string v3, "PER_HOUR"

    invoke-direct {v0, v3, v1, v2}, Lcom/ironsource/dd;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ironsource/dd;->c:Lcom/ironsource/dd;

    .line 3
    invoke-static {}, Lcom/ironsource/dd;->a()[Lcom/ironsource/dd;

    move-result-object v0

    sput-object v0, Lcom/ironsource/dd;->d:[Lcom/ironsource/dd;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/ironsource/dd;->a:Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Lcom/ironsource/dd;
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/dd;->b:Lcom/ironsource/dd;

    sget-object v1, Lcom/ironsource/dd;->c:Lcom/ironsource/dd;

    filled-new-array {v0, v1}, [Lcom/ironsource/dd;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/dd;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/dd;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/dd;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/dd;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/dd;->d:[Lcom/ironsource/dd;

    invoke-virtual {v0}, [Lcom/ironsource/dd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/dd;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ironsource/dd;->a:Ljava/lang/String;

    return-object v0
.end method
