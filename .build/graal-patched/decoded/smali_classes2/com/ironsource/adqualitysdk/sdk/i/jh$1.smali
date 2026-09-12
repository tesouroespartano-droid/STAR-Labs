.class final Lcom/ironsource/adqualitysdk/sdk/i/jh$1;
.super Landroid/widget/RelativeLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﻛ(Landroid/view/ViewGroup;Landroid/view/View$OnLayoutChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jh;


# direct methods
.method constructor <init>(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/content/Context;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-direct {p0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ironsource/adqualitysdk/sdk/i/jh$1;->ﾇ:Lcom/ironsource/adqualitysdk/sdk/i/jh;

    invoke-static {v0, p1}, Lcom/ironsource/adqualitysdk/sdk/i/jh;->ﾇ(Lcom/ironsource/adqualitysdk/sdk/i/jh;Landroid/view/MotionEvent;)V

    .line 166
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
