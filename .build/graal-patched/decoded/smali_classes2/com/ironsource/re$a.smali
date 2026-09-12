.class public final Lcom/ironsource/re$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ironsource/re;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ironsource/re$a;

.field public static final b:I = -0x1

.field public static final c:I = 0x0

.field public static final d:J = -0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ironsource/re$a;

    invoke-direct {v0}, Lcom/ironsource/re$a;-><init>()V

    sput-object v0, Lcom/ironsource/re$a;->a:Lcom/ironsource/re$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
