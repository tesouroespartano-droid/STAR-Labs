package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Xb implements InterfaceC0474t7 {
    private String a = "Xb";
    private int b = 23;
    private final InterfaceC0491u7 c;
    private ConnectivityManager.NetworkCallback d;

    class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                Xb.this.c.a(C0145a4.a(network, this.a), C0145a4.a(this.a, network));
                return;
            }
            InterfaceC0491u7 interfaceC0491u7 = Xb.this.c;
            String strB = C0145a4.b(this.a);
            Context context = this.a;
            interfaceC0491u7.a(strB, C0145a4.a(context, C0145a4.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                Xb.this.c.b(C0145a4.a(network, this.a), C0145a4.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                Xb.this.c.b(C0145a4.a(network, this.a), C0145a4.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C0145a4.b(this.a).equals("none")) {
                Xb.this.c.a();
            }
        }
    }

    public Xb(InterfaceC0491u7 interfaceC0491u7) {
        this.c = interfaceC0491u7;
    }

    @Override // com.ironsource.InterfaceC0474t7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C0421q4.d().a(e);
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC0474t7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (C0145a4.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.d);
                }
            } catch (Exception e) {
                C0421q4.d().a(e);
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC0474t7
    public JSONObject c(Context context) {
        return C0145a4.a(context, C0145a4.a(context));
    }

    @Override // com.ironsource.InterfaceC0474t7
    public void a() {
        this.d = null;
    }
}
