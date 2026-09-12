package com.unity3d.player;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AccessibilityNodeProvider {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public H(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.a.b);
            Object parent = this.a.b.getParent();
            if (parent instanceof View) {
                accessibilityNodeInfoObtain.setParent((View) parent);
            }
            int[] rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
            if (rootNodeIds != null) {
                for (int i2 : rootNodeIds) {
                    accessibilityNodeInfoObtain.addChild(this.a.b, i2);
                }
            }
            return accessibilityNodeInfoObtain;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
        if (UnityAccessibilityDelegate.populateNodeInfo(accessibilityNodeInfoObtain2, i, this.a.b)) {
            return accessibilityNodeInfoObtain2;
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i2 == 64) {
            return this.a.sendEventForVirtualViewId(i, 32768);
        }
        if (i2 == 128) {
            return this.a.sendEventForVirtualViewId(i, 65536);
        }
        if (i2 == 16) {
            if (!UnityAccessibilityDelegate.isNodeSelectable(i)) {
                return false;
            }
            UnityPlayer unityPlayer = this.a.a;
            Objects.requireNonNull(unityPlayer);
            this.a.a.invokeOnMainThread((Runnable) new E(this, unityPlayer, i));
            return true;
        }
        if (i2 == 4096 || i2 == 8192) {
            UnityPlayer unityPlayer2 = this.a.a;
            Objects.requireNonNull(unityPlayer2);
            this.a.a.invokeOnMainThread((Runnable) new F(this, unityPlayer2, i2, i));
            return true;
        }
        if (i2 != 1048576 || !UnityAccessibilityDelegate.isNodeDismissable(i)) {
            return false;
        }
        UnityPlayer unityPlayer3 = this.a.a;
        Objects.requireNonNull(unityPlayer3);
        this.a.a.invokeOnMainThread((Runnable) new G(unityPlayer3, i));
        return true;
    }
}
