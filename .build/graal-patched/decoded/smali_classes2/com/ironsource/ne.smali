.class public final Lcom/ironsource/ne;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/sc;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdkInitServiceWithLegacy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkInitServiceWithLegacy.kt\ncom/unity3d/sdk/internal/init/SdkInitServiceWithLegacy\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,114:1\n37#2,2:115\n37#2,2:117\n*S KotlinDebug\n*F\n+ 1 SdkInitServiceWithLegacy.kt\ncom/unity3d/sdk/internal/init/SdkInitServiceWithLegacy\n*L\n59#1:115,2\n27#1:117,2\n*E\n"
.end annotation


# static fields
.field public static final a:Lcom/ironsource/ne;

.field private static final b:Lcom/ironsource/qe;


# direct methods
.method public static synthetic $r8$lambda$A5YO0q-ULpVByxOuDSVy2AaJHxw(Lcom/ironsource/ee;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ne;->a(Lcom/ironsource/ee;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$W1EVCFIxyd2SKVoH2S-Z7G2Goxg(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/ne;->d(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    return-void
.end method

.method public static synthetic $r8$lambda$XB3n82zedsktz45NAnC1zTNaYZU(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ironsource/ne;->b(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    return-void
.end method

.method public static synthetic $r8$lambda$dzScekOtxNgqA0lU1WNr_kdPVz8(Lcom/ironsource/ee;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/ne;->a(Lcom/ironsource/ee;)V

    return-void
.end method

.method public static synthetic $r8$lambda$oD9fTeNt4TOtXIZNUgxb9s9dj5g(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/ne;->a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$uqmyQLJip8IrJb6cbCCWc43gTR0(Lcom/ironsource/Ae;)V
    .locals 0

    invoke-static {p0}, Lcom/ironsource/ne;->b(Lcom/ironsource/Ae;)V

    return-void
.end method

.method public static synthetic $r8$lambda$v90vNfWG8WO8Y4DF1O-JjcV4h6Y(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ironsource/ne;->a(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ironsource/ne;

    invoke-direct {v0}, Lcom/ironsource/ne;-><init>()V

    sput-object v0, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    .line 1
    new-instance v0, Lcom/ironsource/qe;

    invoke-direct {v0}, Lcom/ironsource/qe;-><init>()V

    sput-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lcom/ironsource/qe;
    .locals 1

    .line 1
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    return-object v0
.end method

.method private final a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;Z)V
    .locals 7

    .line 4
    invoke-virtual {p2}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 5
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ironsource/ge;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ironsource/mediationsdk/p;->t(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/ironsource/ge;

    .line 9
    invoke-virtual {p2}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ironsource/mediationsdk/p;->o()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {p2}, Lcom/ironsource/ge;->e()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p2

    .line 12
    invoke-direct {v0, v1, v2, p2}, Lcom/ironsource/ge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object p2, v0

    .line 18
    :goto_0
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    .line 21
    invoke-virtual {p2}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v2

    .line 25
    invoke-virtual {p2}, Lcom/ironsource/ge;->e()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    .line 82
    new-array v3, v3, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 83
    check-cast v1, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    const/4 v4, 0x0

    move-object v5, p0

    move-object v1, p1

    move v3, p4

    .line 84
    invoke-virtual/range {v0 .. v6}, Lcom/ironsource/mediationsdk/p;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/ironsource/mediationsdk/sdk/InitializationListener;Lcom/ironsource/sc;[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Lcom/ironsource/mediationsdk/logger/IronSourceError;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 91
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result p4

    const/16 v0, 0x7e4

    if-ne p4, v0, :cond_1

    goto :goto_1

    .line 105
    :cond_1
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result p2

    const/16 p4, 0x7f8

    if-ne p2, p4, :cond_2

    .line 106
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ironsource/mediationsdk/p;->h()Lcom/ironsource/Ae;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 108
    new-instance p1, Lcom/ironsource/Yd;

    new-instance p4, Lcom/ironsource/he;

    invoke-direct {p4, p2}, Lcom/ironsource/he;-><init>(Lcom/ironsource/Ae;)V

    invoke-direct {p1, p4}, Lcom/ironsource/Yd;-><init>(Lcom/ironsource/he;)V

    invoke-direct {p0, p1, p3}, Lcom/ironsource/ne;->a(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    return-void

    .line 111
    :cond_2
    invoke-virtual {p1}, Lcom/ironsource/mediationsdk/logger/IronSourceError;->getErrorCode()I

    move-result p2

    const/16 p4, 0x7ee

    if-ne p2, p4, :cond_3

    .line 112
    sget-object p1, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    invoke-virtual {p1}, Lcom/ironsource/me;->e()V

    return-void

    .line 115
    :cond_3
    sget-object p2, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance p4, Lcom/ironsource/ne$$ExternalSyntheticLambda5;

    invoke-direct {p4, p3, p1}, Lcom/ironsource/ne$$ExternalSyntheticLambda5;-><init>(Lcom/ironsource/ee;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-virtual {p2, p4}, Lcom/ironsource/qe;->d(Ljava/lang/Runnable;)V

    return-void

    .line 116
    :cond_4
    :goto_1
    sget-object p1, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    .line 119
    new-instance p4, Lcom/ironsource/ne$a;

    invoke-direct {p4, p3}, Lcom/ironsource/ne$a;-><init>(Lcom/ironsource/ee;)V

    .line 120
    invoke-virtual {p1, v1, p2, p4}, Lcom/ironsource/me;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    return-void
.end method

.method private final a(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V
    .locals 3

    .line 122
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    .line 123
    invoke-virtual {p1}, Lcom/ironsource/Yd;->d()Lcom/ironsource/Ae;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/ironsource/mediationsdk/p;->a(ZLcom/ironsource/Ae;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    sget-object p1, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v0, Lcom/ironsource/ne$$ExternalSyntheticLambda2;

    invoke-direct {v0, p2}, Lcom/ironsource/ne$$ExternalSyntheticLambda2;-><init>(Lcom/ironsource/ee;)V

    invoke-virtual {p1, v0}, Lcom/ironsource/qe;->d(Ljava/lang/Runnable;)V

    return-void

    .line 133
    :cond_0
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v1, Lcom/ironsource/ne$$ExternalSyntheticLambda3;

    invoke-direct {v1, p2, p1}, Lcom/ironsource/ne$$ExternalSyntheticLambda3;-><init>(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ee;)V
    .locals 3

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    new-instance v0, Lcom/ironsource/ae;

    const/16 v1, 0x802

    const-string v2, "An unknown error has occurred"

    invoke-direct {v0, v1, v2}, Lcom/ironsource/ae;-><init>(ILjava/lang/String;)V

    .line 135
    invoke-interface {p0, v0}, Lcom/ironsource/ee;->a(Lcom/ironsource/ae;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ee;Lcom/ironsource/Yd;)V
    .locals 1

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sdkInitResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-interface {p0, p1}, Lcom/ironsource/ee;->a(Lcom/ironsource/Yd;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/ee;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    new-instance v0, Lcom/ironsource/ae;

    const-string v1, "error"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/ironsource/ae;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-interface {p0, v0}, Lcom/ironsource/ee;->a(Lcom/ironsource/ae;)V

    return-void
.end method

.method private static final a(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    sget-object v0, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    new-instance v1, Lcom/ironsource/ae;

    invoke-direct {v1, p0}, Lcom/ironsource/ae;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/me;->b(Lcom/ironsource/ae;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ironsource/ne;Lcom/ironsource/Yd;Lcom/ironsource/ee;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/ironsource/ne;->a(Lcom/ironsource/Yd;Lcom/ironsource/ee;)V

    return-void
.end method

.method private static final b(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 2

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$initRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/ironsource/P9;

    invoke-direct {v0}, Lcom/ironsource/P9;-><init>()V

    .line 2
    sget-object v1, Lcom/ironsource/fe;->b:Lcom/ironsource/fe;

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->a(Lcom/ironsource/fe;)V

    .line 3
    sget-object v0, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/ironsource/ne;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;Z)V

    return-void
.end method

.method private static final b(Lcom/ironsource/Ae;)V
    .locals 1

    const-string v0, "$serverResponse"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/ironsource/he;

    invoke-direct {v0, p0}, Lcom/ironsource/he;-><init>(Lcom/ironsource/Ae;)V

    .line 5
    sget-object p0, Lcom/ironsource/me;->a:Lcom/ironsource/me;

    invoke-virtual {p0, v0}, Lcom/ironsource/me;->a(Lcom/ironsource/he;)V

    return-void
.end method

.method private static final d(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 5

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$initRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/ironsource/mediationsdk/p;->m()Lcom/ironsource/mediationsdk/p;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/ironsource/ge;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ironsource/ge;->e()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 94
    new-array v4, v3, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    invoke-interface {v2, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 95
    check-cast v2, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    array-length v4, v2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;

    .line 96
    invoke-virtual {v0, p0, v1, v3, v2}, Lcom/ironsource/mediationsdk/p;->a(Landroid/content/Context;Ljava/lang/String;Z[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)Ljava/util/List;

    move-result-object v0

    .line 98
    const-string v1, "validAdUnitsList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ironsource/ge;->a(Ljava/util/List;)V

    .line 99
    new-instance v0, Lcom/ironsource/P9;

    invoke-direct {v0}, Lcom/ironsource/P9;-><init>()V

    .line 100
    sget-object v1, Lcom/ironsource/fe;->c:Lcom/ironsource/fe;

    invoke-virtual {v0, v1}, Lcom/ironsource/P9;->a(Lcom/ironsource/fe;)V

    .line 101
    sget-object v0, Lcom/ironsource/ne;->a:Lcom/ironsource/ne;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/ironsource/ne;->a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;Z)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v1, Lcom/ironsource/ne$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1, p2, p3}, Lcom/ironsource/ne$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/ironsource/Ae;)V
    .locals 2

    const-string v0, "serverResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v1, Lcom/ironsource/ne$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Lcom/ironsource/ne$$ExternalSyntheticLambda4;-><init>(Lcom/ironsource/Ae;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v1, Lcom/ironsource/ne$$ExternalSyntheticLambda6;

    invoke-direct {v1, p1, p2, p3}, Lcom/ironsource/ne$$ExternalSyntheticLambda6;-><init>(Landroid/content/Context;Lcom/ironsource/ge;Lcom/ironsource/ee;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onInitFailed(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/ironsource/ne;->b:Lcom/ironsource/qe;

    new-instance v1, Lcom/ironsource/ne$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/ironsource/ne$$ExternalSyntheticLambda0;-><init>(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V

    invoke-virtual {v0, v1}, Lcom/ironsource/qe;->a(Ljava/lang/Runnable;)V

    return-void
.end method
