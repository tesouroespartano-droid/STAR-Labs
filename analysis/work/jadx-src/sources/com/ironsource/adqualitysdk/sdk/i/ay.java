package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ay {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, bb> f605 = new HashMap();

    public interface d extends r {
    }

    public ay() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ay$1, reason: invalid class name */
    final class AnonymousClass1 extends iu {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ bb.e f606;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f607;

        AnonymousClass1(String str, bb.e eVar) {
            this.f607 = str;
            this.f606 = eVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            bb bbVarM673 = ay.m673(ay.this, this.f607);
            if (bbVarM673 != null) {
                bbVarM673.m722(this.f606);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ay$2, reason: invalid class name */
    final class AnonymousClass2 extends iu {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f610;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ bb.c f611;

        AnonymousClass2(String str, bb.c cVar) {
            this.f610 = str;
            this.f611 = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* JADX INFO: renamed from: ﻐ */
        public final void mo227() {
            bb bbVarM673 = ay.m673(ay.this, this.f610);
            if (bbVarM673 != null) {
                bbVarM673.m718(this.f611);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m677(String str) {
        this.f605.put(str, new bb(str));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m676() {
        Iterator it = new ArrayList(this.f605.values()).iterator();
        while (it.hasNext()) {
            if (((bb) it.next()).m720()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final String m675(String str) {
        Map<String, bb> map = this.f605;
        bb bbVar = map != null ? map.get(str) : null;
        if (bbVar != null) {
            return bbVar.m721();
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ bb m673(ay ayVar, String str) {
        Map<String, bb> map = ayVar.f605;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
