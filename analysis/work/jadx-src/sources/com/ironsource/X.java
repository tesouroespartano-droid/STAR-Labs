package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements W {
    private final InterfaceC0223ec a;

    public static final class a implements Bc {
        final /* synthetic */ X8 a;
        final /* synthetic */ InitListener b;

        a(X8 x8, InitListener initListener) {
            this.a = x8;
            this.b = initListener;
        }

        @Override // com.ironsource.Bc
        public void onFail(C0441r8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(C0557y5.a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Bc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            V vE = this.a.e();
            ironLog.verbose("controllerURL = " + (vE != null ? vE.c() : null));
            V vE2 = this.a.e();
            ironLog.verbose("controllerConfig = " + (vE2 != null ? vE2.a() : null));
            V vE3 = this.a.e();
            ironLog.verbose("debugMode = " + (vE3 != null ? Integer.valueOf(vE3.b()) : null));
            ironLog.verbose("applicationKey = " + this.a.d());
            ironLog.verbose("userId = " + this.a.h());
            this.b.onInitSuccess();
        }
    }

    public X(InterfaceC0223ec networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.a = networkInitApi;
    }

    @Override // com.ironsource.W
    public void a(Context context, X8 initConfig, InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC0223ec interfaceC0223ec = this.a;
        V vE = initConfig.e();
        interfaceC0223ec.a(vE != null ? vE.b() : 0);
        V vE2 = initConfig.e();
        if (vE2 != null && (strC = vE2.c()) != null) {
            this.a.b(strC);
        }
        V vE3 = initConfig.e();
        if (vE3 != null && (jSONObjectA = vE3.a()) != null) {
            InterfaceC0223ec interfaceC0223ec2 = this.a;
            String string = jSONObjectA.toString();
            Intrinsics.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            interfaceC0223ec2.a(string);
        }
        Map<String, String> mapA = new C0189cc().a();
        this.a.a(new a(initConfig, initListener));
        this.a.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
