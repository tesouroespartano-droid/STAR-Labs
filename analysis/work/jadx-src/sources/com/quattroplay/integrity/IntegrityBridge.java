package com.quattroplay.integrity;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityBridge {
    private static final String TAG = "IntegrityBridge";

    public interface IntegrityCallback {
        void onIntegrityResult(String str);
    }

    public static void requestIntegrityToken(Activity activity, String str, final IntegrityCallback integrityCallback) {
        IntegrityManagerFactory.create(activity).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).build()).addOnCompleteListener(new OnCompleteListener<IntegrityTokenResponse>() { // from class: com.quattroplay.integrity.IntegrityBridge.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<IntegrityTokenResponse> task) {
                if (!task.isSuccessful()) {
                    Log.e(IntegrityBridge.TAG, "Integrity error: " + task.getException());
                    integrityCallback.onIntegrityResult(null);
                } else {
                    integrityCallback.onIntegrityResult(task.getResult().token());
                }
            }
        });
    }
}
