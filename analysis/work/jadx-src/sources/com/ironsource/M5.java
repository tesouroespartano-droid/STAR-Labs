package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class M5 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";
    private E7 a;
    String b;
    String c;
    ArrayList<B5> d;

    public M5(E7 e7, String str, String str2, ArrayList<B5> arrayList) {
        this.a = e7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        E7.a aVarA;
        E7.a aVar = new E7.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C0480td c0480tdB = C0202d8.b(this.c, this.b, arrayList);
            aVarA = aVar.a(c0480tdB.a()).a(c0480tdB.a);
        } catch (Exception e2) {
            C0421q4.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            aVarA = aVar.a(e2 instanceof C0496uc).a(e2);
        }
        E7 e7 = this.a;
        if (e7 != null) {
            e7.a(aVarA);
        }
    }
}
