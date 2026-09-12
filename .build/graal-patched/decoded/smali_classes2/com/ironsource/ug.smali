.class public final enum Lcom/ironsource/ug;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/ug;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/ironsource/ug;

.field public static final enum b:Lcom/ironsource/ug;

.field private static final synthetic c:[Lcom/ironsource/ug;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/ug;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ironsource/ug;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/ug;->a:Lcom/ironsource/ug;

    .line 2
    new-instance v0, Lcom/ironsource/ug;

    const-string v1, "BIDDER_SENSITIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/ug;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/ug;->b:Lcom/ironsource/ug;

    invoke-static {}, Lcom/ironsource/ug;->a()[Lcom/ironsource/ug;

    move-result-object v0

    sput-object v0, Lcom/ironsource/ug;->c:[Lcom/ironsource/ug;

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

.method private static final synthetic a()[Lcom/ironsource/ug;
    .locals 2

    .line 1
    sget-object v0, Lcom/ironsource/ug;->a:Lcom/ironsource/ug;

    sget-object v1, Lcom/ironsource/ug;->b:Lcom/ironsource/ug;

    filled-new-array {v0, v1}, [Lcom/ironsource/ug;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/ug;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/ug;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/ug;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/ug;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/ug;->c:[Lcom/ironsource/ug;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/ug;

    return-object v0
.end method
