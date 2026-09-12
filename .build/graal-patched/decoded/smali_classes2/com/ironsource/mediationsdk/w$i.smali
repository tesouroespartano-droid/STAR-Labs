.class final enum Lcom/ironsource/mediationsdk/w$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/mediationsdk/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/mediationsdk/w$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum b:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum c:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum d:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum e:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum f:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum g:Lcom/ironsource/mediationsdk/w$i;

.field public static final enum h:Lcom/ironsource/mediationsdk/w$i;

.field private static final synthetic i:[Lcom/ironsource/mediationsdk/w$i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->a:Lcom/ironsource/mediationsdk/w$i;

    .line 2
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "READY_TO_LOAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->b:Lcom/ironsource/mediationsdk/w$i;

    .line 3
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "STARTED_LOADING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->c:Lcom/ironsource/mediationsdk/w$i;

    .line 5
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "FIRST_AUCTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->d:Lcom/ironsource/mediationsdk/w$i;

    .line 6
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "AUCTION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->e:Lcom/ironsource/mediationsdk/w$i;

    .line 7
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "LOADING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->f:Lcom/ironsource/mediationsdk/w$i;

    .line 8
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "RELOADING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->g:Lcom/ironsource/mediationsdk/w$i;

    .line 9
    new-instance v0, Lcom/ironsource/mediationsdk/w$i;

    const-string v1, "LOADED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/ironsource/mediationsdk/w$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->h:Lcom/ironsource/mediationsdk/w$i;

    .line 10
    invoke-static {}, Lcom/ironsource/mediationsdk/w$i;->a()[Lcom/ironsource/mediationsdk/w$i;

    move-result-object v0

    sput-object v0, Lcom/ironsource/mediationsdk/w$i;->i:[Lcom/ironsource/mediationsdk/w$i;

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

.method private static synthetic a()[Lcom/ironsource/mediationsdk/w$i;
    .locals 8

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/w$i;->a:Lcom/ironsource/mediationsdk/w$i;

    sget-object v1, Lcom/ironsource/mediationsdk/w$i;->b:Lcom/ironsource/mediationsdk/w$i;

    sget-object v2, Lcom/ironsource/mediationsdk/w$i;->c:Lcom/ironsource/mediationsdk/w$i;

    sget-object v3, Lcom/ironsource/mediationsdk/w$i;->d:Lcom/ironsource/mediationsdk/w$i;

    sget-object v4, Lcom/ironsource/mediationsdk/w$i;->e:Lcom/ironsource/mediationsdk/w$i;

    sget-object v5, Lcom/ironsource/mediationsdk/w$i;->f:Lcom/ironsource/mediationsdk/w$i;

    sget-object v6, Lcom/ironsource/mediationsdk/w$i;->g:Lcom/ironsource/mediationsdk/w$i;

    sget-object v7, Lcom/ironsource/mediationsdk/w$i;->h:Lcom/ironsource/mediationsdk/w$i;

    filled-new-array/range {v0 .. v7}, [Lcom/ironsource/mediationsdk/w$i;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/mediationsdk/w$i;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/mediationsdk/w$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/mediationsdk/w$i;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/mediationsdk/w$i;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/mediationsdk/w$i;->i:[Lcom/ironsource/mediationsdk/w$i;

    invoke-virtual {v0}, [Lcom/ironsource/mediationsdk/w$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/mediationsdk/w$i;

    return-object v0
.end method
