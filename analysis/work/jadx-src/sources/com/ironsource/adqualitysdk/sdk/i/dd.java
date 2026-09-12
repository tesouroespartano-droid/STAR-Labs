package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dd extends cx {
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static WebView m1841(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) m1770(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) m1770(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) m1770(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) m1770(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) kh.m2836(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m1840(List<Object> list) {
        return kh.m2834((View) m1770(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m1838(List<Object> list) {
        return (E) kh.m2833((View) m1770(list, 0, View.class), (Class) m1770(list, 1, Class.class), ((Boolean) m1770(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static View m1839(List<Object> list) {
        return kh.m2832((Activity) m1770(list, 0, Activity.class));
    }
}
