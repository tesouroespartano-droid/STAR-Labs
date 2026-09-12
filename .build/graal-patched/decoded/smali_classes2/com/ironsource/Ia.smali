.class public final enum Lcom/ironsource/Ia;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/Ia;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/ironsource/Ia;

.field public static final enum b:Lcom/ironsource/Ia;

.field public static final enum c:Lcom/ironsource/Ia;

.field private static final synthetic d:[Lcom/ironsource/Ia;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/Ia;

    const-string v1, "LEGACY_TIMED_SHOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ironsource/Ia;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/Ia;->a:Lcom/ironsource/Ia;

    .line 2
    new-instance v0, Lcom/ironsource/Ia;

    const-string v1, "SINGLE_STRATEGY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/Ia;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/Ia;->b:Lcom/ironsource/Ia;

    .line 3
    new-instance v0, Lcom/ironsource/Ia;

    const-string v1, "RELOAD_STRATEGY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ironsource/Ia;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/Ia;->c:Lcom/ironsource/Ia;

    invoke-static {}, Lcom/ironsource/Ia;->a()[Lcom/ironsource/Ia;

    move-result-object v0

    sput-object v0, Lcom/ironsource/Ia;->d:[Lcom/ironsource/Ia;

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

.method private static final synthetic a()[Lcom/ironsource/Ia;
    .locals 3

    .line 1
    sget-object v0, Lcom/ironsource/Ia;->a:Lcom/ironsource/Ia;

    sget-object v1, Lcom/ironsource/Ia;->b:Lcom/ironsource/Ia;

    sget-object v2, Lcom/ironsource/Ia;->c:Lcom/ironsource/Ia;

    filled-new-array {v0, v1, v2}, [Lcom/ironsource/Ia;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/Ia;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/Ia;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/Ia;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/Ia;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Ia;->d:[Lcom/ironsource/Ia;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/Ia;

    return-object v0
.end method
