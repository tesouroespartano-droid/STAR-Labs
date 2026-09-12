.class public interface abstract Lcom/ironsource/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ironsource/t1$a;,
        Lcom/ironsource/t1$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/ironsource/t1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/t1$b;->a:Lcom/ironsource/t1$b;

    sput-object v0, Lcom/ironsource/t1;->a:Lcom/ironsource/t1$b;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/ironsource/t1;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lcom/ironsource/t1;->a:Lcom/ironsource/t1$b;

    invoke-virtual {v0, p0}, Lcom/ironsource/t1$b;->a(Ljava/lang/String;)Lcom/ironsource/t1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lcom/ironsource/q8$e;
.end method

.method public abstract e()Ljava/lang/String;
.end method
