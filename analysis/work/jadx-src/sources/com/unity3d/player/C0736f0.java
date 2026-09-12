package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0736f0 extends UnityPlayer.a {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0738g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736f0(C0738g0 c0738g0, boolean z) {
        super();
        this.c = c0738g0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
