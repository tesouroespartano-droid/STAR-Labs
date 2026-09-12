.class public final enum Lcom/ironsource/Re;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ironsource/Re;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/ironsource/Re;

.field public static final enum c:Lcom/ironsource/Re;

.field public static final enum d:Lcom/ironsource/Re;

.field public static final enum e:Lcom/ironsource/Re;

.field public static final enum f:Lcom/ironsource/Re;

.field private static final synthetic g:[Lcom/ironsource/Re;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/ironsource/Re;

    const-string v1, "LoadSuccess"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Re;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Re;->b:Lcom/ironsource/Re;

    .line 2
    new-instance v0, Lcom/ironsource/Re;

    const-string v1, "ShowSuccess"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Re;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Re;->c:Lcom/ironsource/Re;

    .line 3
    new-instance v0, Lcom/ironsource/Re;

    const-string v1, "ShowFailed"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Re;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Re;->d:Lcom/ironsource/Re;

    .line 4
    new-instance v0, Lcom/ironsource/Re;

    const-string v1, "Destroyed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/ironsource/Re;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Re;->e:Lcom/ironsource/Re;

    .line 5
    new-instance v0, Lcom/ironsource/Re;

    const/4 v1, 0x4

    const/4 v2, -0x1

    const-string v3, "LoadRequest"

    invoke-direct {v0, v3, v1, v2}, Lcom/ironsource/Re;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ironsource/Re;->f:Lcom/ironsource/Re;

    invoke-static {}, Lcom/ironsource/Re;->a()[Lcom/ironsource/Re;

    move-result-object v0

    sput-object v0, Lcom/ironsource/Re;->g:[Lcom/ironsource/Re;

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

    iput p3, p0, Lcom/ironsource/Re;->a:I

    return-void
.end method

.method private static final synthetic a()[Lcom/ironsource/Re;
    .locals 5

    .line 1
    sget-object v0, Lcom/ironsource/Re;->b:Lcom/ironsource/Re;

    sget-object v1, Lcom/ironsource/Re;->c:Lcom/ironsource/Re;

    sget-object v2, Lcom/ironsource/Re;->d:Lcom/ironsource/Re;

    sget-object v3, Lcom/ironsource/Re;->e:Lcom/ironsource/Re;

    sget-object v4, Lcom/ironsource/Re;->f:Lcom/ironsource/Re;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/ironsource/Re;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ironsource/Re;
    .locals 1

    .line 1
    const-class v0, Lcom/ironsource/Re;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ironsource/Re;

    return-object p0
.end method

.method public static values()[Lcom/ironsource/Re;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/Re;->g:[Lcom/ironsource/Re;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ironsource/Re;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ironsource/Re;->a:I

    return v0
.end method
