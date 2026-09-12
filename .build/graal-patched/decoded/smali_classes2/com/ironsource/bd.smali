.class public final Lcom/ironsource/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlacementCappingServiceConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlacementCappingServiceConfig.kt\ncom/unity3d/mediation/internal/PlacementCappingServiceConfig\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,91:1\n32#2:92\n33#2:95\n215#3,2:93\n*S KotlinDebug\n*F\n+ 1 PlacementCappingServiceConfig.kt\ncom/unity3d/mediation/internal/PlacementCappingServiceConfig\n*L\n20#1:92\n20#1:95\n21#1:93,2\n*E\n"
.end annotation


# instance fields
.field private final a:Lcom/ironsource/jb;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/unity3d/mediation/LevelPlay$AdFormat;",
            "Lcom/ironsource/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ironsource/jb;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ironsource/jb;",
            "Ljava/util/Map<",
            "Lcom/unity3d/mediation/LevelPlay$AdFormat;",
            "Lcom/ironsource/s;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tools"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adFormatsConfigurations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ironsource/bd;->a:Lcom/ironsource/jb;

    .line 3
    iput-object p2, p0, Lcom/ironsource/bd;->b:Ljava/util/Map;

    return-void
.end method

.method private final a(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V
    .locals 4

    .line 152
    invoke-virtual {p4}, Lcom/ironsource/s$d;->b()Lcom/ironsource/J3;

    move-result-object p4

    if-eqz p4, :cond_0

    .line 157
    sget-object v0, Lcom/ironsource/P3;->b:Lcom/ironsource/P3;

    .line 158
    new-instance v1, Lcom/ironsource/G3;

    invoke-virtual {p4}, Lcom/ironsource/J3;->a()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p4}, Lcom/ironsource/J3;->b()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p4}, Lcom/ironsource/J3;->c()Lcom/ironsource/O3;

    move-result-object p4

    invoke-direct {v1, v2, v3, p4}, Lcom/ironsource/G3;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/O3;)V

    .line 159
    invoke-interface {p1, p2, p3, v0, v1}, Lcom/ironsource/L7$a;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;

    move-result-object p1

    .line 164
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ironsource/bd;->a(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;)V

    :cond_0
    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;)V
    .locals 1

    .line 165
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 166
    new-instance v0, Lcom/ironsource/K3;

    invoke-direct {v0}, Lcom/ironsource/K3;-><init>()V

    invoke-virtual {v0, p4}, Lcom/ironsource/K3;->a(Lcom/ironsource/P3;)I

    move-result p4

    .line 167
    iget-object v0, p0, Lcom/ironsource/bd;->a:Lcom/ironsource/jb;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p4, p1}, Lcom/ironsource/jb;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final b(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/ironsource/P3;->c:Lcom/ironsource/P3;

    .line 2
    new-instance v1, Lcom/ironsource/G3;

    invoke-virtual {p4}, Lcom/ironsource/s$d;->c()Lcom/ironsource/Q4;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/ironsource/Q4;->a()Z

    move-result p4

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    move-object v2, p4

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/ironsource/G3;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/O3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    invoke-interface {p1, p2, p3, v0, v1}, Lcom/ironsource/L7$a;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;

    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ironsource/bd;->a(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;)V

    return-void
.end method

.method private final c(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V
    .locals 4

    .line 1
    invoke-virtual {p4}, Lcom/ironsource/s$d;->e()Lcom/ironsource/Qc;

    move-result-object p4

    if-eqz p4, :cond_0

    .line 6
    sget-object v0, Lcom/ironsource/P3;->a:Lcom/ironsource/P3;

    .line 7
    new-instance v1, Lcom/ironsource/G3;

    invoke-virtual {p4}, Lcom/ironsource/Qc;->a()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p4}, Lcom/ironsource/Qc;->b()Ljava/lang/Integer;

    move-result-object p4

    sget-object v3, Lcom/ironsource/O3;->f:Lcom/ironsource/O3;

    invoke-direct {v1, v2, p4, v3}, Lcom/ironsource/G3;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/O3;)V

    .line 8
    invoke-interface {p1, p2, p3, v0, v1}, Lcom/ironsource/L7$a;->a(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;Lcom/ironsource/p7;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ironsource/bd;->a(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/P3;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/ironsource/L7$a;)V
    .locals 5

    const-string v0, "cappingService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/ironsource/bd;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 73
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 74
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/unity3d/mediation/LevelPlay$AdFormat;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ironsource/s;

    .line 75
    invoke-virtual {v1}, Lcom/ironsource/s;->c()Ljava/util/Map;

    move-result-object v1

    .line 147
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 148
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ironsource/s$d;

    .line 149
    invoke-direct {p0, p1, v4, v2, v3}, Lcom/ironsource/bd;->b(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V

    .line 150
    invoke-direct {p0, p1, v4, v2, v3}, Lcom/ironsource/bd;->a(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V

    .line 151
    invoke-direct {p0, p1, v4, v2, v3}, Lcom/ironsource/bd;->c(Lcom/ironsource/L7$a;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/s$d;)V

    goto :goto_0

    :cond_1
    return-void
.end method
