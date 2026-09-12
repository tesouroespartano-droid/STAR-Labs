package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0729c implements AssetPackStateUpdateListener {
    public final HashSet a;
    public final UnityPlayer b;
    public final /* synthetic */ C0741i c;

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(AssetPackState assetPackState) {
        AssetPackState assetPackState2 = assetPackState;
        synchronized (this) {
            if (assetPackState2.status() == 4 || assetPackState2.status() == 5 || assetPackState2.status() == 0) {
                synchronized (C0741i.e) {
                    this.c.c.remove(assetPackState2.name());
                    if (this.c.c.isEmpty()) {
                        C0741i c0741i = this.c;
                        C0729c c0729c = c0741i.d;
                        if (c0729c instanceof C0729c) {
                            c0741i.b.unregisterListener(c0729c);
                        }
                        this.c.d = null;
                    }
                }
            }
            if (this.a.size() == 0) {
                return;
            }
            this.b.invokeOnMainThread(new RunnableC0727b((Set) this.a.clone(), assetPackState2.name(), assetPackState2.status(), assetPackState2.totalBytesToDownload(), assetPackState2.bytesDownloaded(), assetPackState2.transferProgressPercentage(), assetPackState2.errorCode()));
        }
    }

    public C0729c(C0741i c0741i, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c0741i;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }
}
