package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kh {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Rect f2985 = new Rect();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View m2832(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m2836(Activity activity, Class<E> cls, int i, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m2837(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> void m2838(Activity activity, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        m2837(activity, cls, -1, null, false, z, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> void m2837(Activity activity, Class<E> cls, int i, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (i != -1) {
            View viewFindViewById = activity.findViewById(i);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z) {
                    return;
                }
            }
            m2835(viewFindViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m2839(viewFindViewById2, cls, str, z, z2, list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <E extends View> void m2839(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m2835(view, cls, str, z, z2, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m2833(View view, Class<E> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        m2840(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> void m2840(View view, Class<E> cls, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        m2835(view, cls, null, z, z2, list, list2, list3);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <E extends View> void m2835(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                E e = (E) viewGroup.getChildAt(i);
                if (m2830(e, cls, str, list, list2)) {
                    list3.add(e);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m2835(e, cls, str, z, z2, list, list2, list3);
                    }
                } else {
                    m2835(e, cls, str, z, z2, list, list2, list3);
                    if (list3 != null && list3.size() > 0 && z) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> boolean m2830(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m2842(list) || list.contains(Integer.valueOf(view.getId()))) && !m2831(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2842(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2831(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View m2829(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2834(View view) {
        view.getHitRect(f2985);
        return view.getGlobalVisibleRect(f2985);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m2841(View view) {
        View viewFindViewById;
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            if (view != null && (viewFindViewById = view.findViewById(R.id.content)) != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }
}
