package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.jb.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.i.jb.AnonymousClass5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ji {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ji f2825;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<View> f2826 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<jl> f2827 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<View> f2828 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private im f2829 = new im() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.5
        @Override // com.ironsource.adqualitysdk.sdk.i.im
        /* JADX INFO: renamed from: ｋ */
        public final void mo1815() {
            List<View> listM2747 = jy.m2747();
            ji.this.f2828.clear();
            ji.this.f2828.addAll(ji.this.f2826);
            for (int i = 0; i < listM2747.size(); i++) {
                View view = listM2747.get(i);
                ji.this.f2828.remove(view);
                if (!ji.this.f2826.contains(view)) {
                    ji.this.f2826.add(view);
                    ji.this.m2639(view);
                }
            }
            for (int i2 = 0; i2 < ji.this.f2828.size(); i2++) {
                View view2 = (View) ji.this.f2828.get(i2);
                ji.this.f2826.remove(view2);
                ji.this.m2636(view2);
            }
            ji.this.f2828.clear();
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized ji m2641() {
        if (f2825 == null) {
            f2825 = new ji();
        }
        return f2825;
    }

    private ji() {
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2644(final jl jlVar) {
        synchronized (this) {
            this.f2827.add(jlVar);
        }
        p.m2894(jb.m2556().new AnonymousClass3(this.f2829));
        p.m2899(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻐ */
            public final void mo227() {
                Iterator it = ji.this.f2826.iterator();
                while (it.hasNext()) {
                    jlVar.mo237((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2643(jl jlVar) {
        synchronized (this) {
            this.f2827.remove(jlVar);
            if (this.f2827.size() == 0) {
                p.m2894(jb.m2556().new AnonymousClass5(this.f2829));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public synchronized void m2639(View view) {
        Iterator<jl> it = this.f2827.iterator();
        while (it.hasNext()) {
            it.next().mo237(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public synchronized void m2636(View view) {
        Iterator<jl> it = this.f2827.iterator();
        while (it.hasNext()) {
            it.next().mo238(view);
        }
    }
}
