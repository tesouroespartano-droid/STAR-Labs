.class public final enum Lcom/unity/purchasing/common/PurchaseFailureReason;
.super Ljava/lang/Enum;
.source "PurchaseFailureReason.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/unity/purchasing/common/PurchaseFailureReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum BillingUnavailable:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum DuplicateTransaction:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum ExistingPurchasePending:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum ItemUnavailable:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum PaymentDeclined:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum SignatureInvalid:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum Unknown:Lcom/unity/purchasing/common/PurchaseFailureReason;

.field public static final enum UserCancelled:Lcom/unity/purchasing/common/PurchaseFailureReason;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 7
    new-instance v0, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v1, "BillingUnavailable"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/unity/purchasing/common/PurchaseFailureReason;->BillingUnavailable:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 8
    new-instance v1, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v2, "ExistingPurchasePending"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/unity/purchasing/common/PurchaseFailureReason;->ExistingPurchasePending:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 9
    new-instance v2, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v3, "ItemUnavailable"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/unity/purchasing/common/PurchaseFailureReason;->ItemUnavailable:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 10
    new-instance v3, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v4, "SignatureInvalid"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/unity/purchasing/common/PurchaseFailureReason;->SignatureInvalid:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 11
    new-instance v4, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v5, "UserCancelled"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/unity/purchasing/common/PurchaseFailureReason;->UserCancelled:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 12
    new-instance v5, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v6, "PaymentDeclined"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/unity/purchasing/common/PurchaseFailureReason;->PaymentDeclined:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 13
    new-instance v6, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v7, "DuplicateTransaction"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/unity/purchasing/common/PurchaseFailureReason;->DuplicateTransaction:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 14
    new-instance v7, Lcom/unity/purchasing/common/PurchaseFailureReason;

    const-string v8, "Unknown"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lcom/unity/purchasing/common/PurchaseFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/unity/purchasing/common/PurchaseFailureReason;->Unknown:Lcom/unity/purchasing/common/PurchaseFailureReason;

    .line 6
    filled-new-array/range {v0 .. v7}, [Lcom/unity/purchasing/common/PurchaseFailureReason;

    move-result-object v0

    sput-object v0, Lcom/unity/purchasing/common/PurchaseFailureReason;->$VALUES:[Lcom/unity/purchasing/common/PurchaseFailureReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/unity/purchasing/common/PurchaseFailureReason;
    .locals 1

    .line 6
    const-class v0, Lcom/unity/purchasing/common/PurchaseFailureReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/unity/purchasing/common/PurchaseFailureReason;

    return-object p0
.end method

.method public static values()[Lcom/unity/purchasing/common/PurchaseFailureReason;
    .locals 1

    .line 6
    sget-object v0, Lcom/unity/purchasing/common/PurchaseFailureReason;->$VALUES:[Lcom/unity/purchasing/common/PurchaseFailureReason;

    invoke-virtual {v0}, [Lcom/unity/purchasing/common/PurchaseFailureReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unity/purchasing/common/PurchaseFailureReason;

    return-object v0
.end method
