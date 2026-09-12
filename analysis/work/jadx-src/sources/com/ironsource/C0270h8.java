package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0270h8 extends FrameLayout implements H8 {
    private static final String b = "IronSourceAdContainer";
    private C0357m8 a;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0270h8 c0270h8 = C0270h8.this;
            c0270h8.removeView(c0270h8.a.getPresentingView());
            C0270h8.this.a.a(this.a, this.b);
            C0270h8.this.a = null;
        }
    }

    public C0270h8(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.b().a().getJSONObject(C0253g8.p).getJSONObject(C0253g8.s);
        } catch (Exception e) {
            C0421q4.d().a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.a());
        this.a.b().a(C0198d4.h.S, jSONObject);
    }

    public void a() throws Exception {
        C0357m8 c0357m8 = this.a;
        if (c0357m8 == null || c0357m8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C0236f8 getSize() {
        C0357m8 c0357m8 = this.a;
        return c0357m8 != null ? c0357m8.c() : new C0236f8();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C0357m8 c0357m8 = this.a;
        if (c0357m8 == null) {
            return;
        }
        try {
            c0357m8.b().a(C0253g8.k, i, isShown());
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C0357m8 c0357m8 = this.a;
        if (c0357m8 == null) {
            return;
        }
        try {
            c0357m8.b().a(C0253g8.l, i, isShown());
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C0270h8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0270h8(C0357m8 c0357m8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c0357m8.c().c(), c0357m8.c().a()));
        this.a = c0357m8;
        addView(c0357m8.getPresentingView());
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        C0357m8 c0357m8 = this.a;
        if (c0357m8 != null && c0357m8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            T7.a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        C0357m8 c0357m8 = this.a;
        if (c0357m8 == null) {
            return;
        }
        c0357m8.a(str, str2, str3);
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
