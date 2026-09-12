package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cv extends cx {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1537 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1538 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1539 = 52766;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1540 = 61643;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1541 = 42301;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1542 = 12632;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1763(co coVar, List<Object> list) {
        co coVar2;
        int i = 2 % 2;
        List list2 = (List) m1770(list, 0, List.class);
        try {
            du duVar = (du) m1770(list, 1, du.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                coVar2 = coVar;
            } else if (m1769(list, 2, co.class)) {
                coVar2 = (co) m1770(list, 2, co.class);
                if (list.size() > 3) {
                    int i2 = f1537 + 79;
                    f1538 = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList = m1772(list, 3);
                }
            } else {
                arrayList = m1772(list, 2);
                coVar2 = coVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < list2.size(); i4++) {
                int i5 = f1537 + 69;
                f1538 = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(0, list2.get(i4));
                arrayList2.add(duVar.m2081(coVar2.m1627(), coVar2, arrayList).m2019());
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e) {
            cn.m1575(coVar.m1624(), m1760("䬦ꐜ詨릢悯誒Ǉ譁\uf83d▒짨㰦溾\uf3b6抯畠㺷ᩰ啇ⶖ\uddd0䀿骓쇑\uec8f埥㥃踻轟੦\uda61\ue814臺\uf66e", 32 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1762(co coVar, List<Object> list) {
        int i = 2 % 2;
        int i2 = f1537 + 65;
        f1538 = i2 % 128;
        if (i2 % 2 != 0) {
            m1763(coVar, list);
            int i3 = 6 / 0;
        } else {
            m1763(coVar, list);
        }
        int i4 = f1538 + 45;
        f1537 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[Catch: Exception -> 0x00c7, TRY_ENTER, TryCatch #0 {Exception -> 0x00c7, blocks: (B:3:0x000c, B:6:0x0029, B:8:0x0031, B:11:0x0048, B:13:0x0057, B:15:0x005d, B:16:0x0063, B:20:0x0074, B:34:0x00c0, B:27:0x00aa, B:28:0x00b2, B:30:0x00ba, B:31:0x00bd, B:23:0x008a), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1761(co coVar, List<Object> list) {
        co coVar2;
        int i;
        int i2 = 2 % 2;
        List list2 = (List) m1770(list, 0, List.class);
        try {
            du duVar = (du) m1770(list, 1, du.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                int i3 = f1537 + 21;
                f1538 = i3 % 128;
                int i4 = i3 % 2;
                if (m1769(list, 2, co.class)) {
                    int i5 = f1538 + 117;
                    f1537 = i5 % 128;
                    int i6 = i5 % 2;
                    coVar2 = (co) m1770(list, 2, co.class);
                    if (list.size() > 3) {
                        arrayList = m1772(list, 3);
                    }
                } else {
                    arrayList = m1772(list, 2);
                    int i7 = f1537 + 15;
                    f1538 = i7 % 128;
                    int i8 = i7 % 2;
                    coVar2 = coVar;
                }
            } else {
                coVar2 = coVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < list2.size(); i9++) {
                int i10 = f1537 + 95;
                f1538 = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList.add(0, list2.get(i9));
                    if (duVar.m2081(coVar2.m1627(), coVar2, arrayList).m2018()) {
                        i = f1538 + 63;
                        f1537 = i % 128;
                        if (i % 2 != 0) {
                            arrayList2.add(list2.get(i9));
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }
                        arrayList2.add(list2.get(i9));
                    }
                } else {
                    arrayList.add(0, list2.get(i9));
                    if (duVar.m2081(coVar2.m1627(), coVar2, arrayList).m2018()) {
                        i = f1538 + 63;
                        f1537 = i % 128;
                        if (i % 2 != 0) {
                            arrayList2.add(list2.get(i9));
                            Object obj2 = null;
                            super.hashCode();
                            throw null;
                        }
                        arrayList2.add(list2.get(i9));
                    }
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e) {
            cn.m1575(coVar.m1624(), m1760("䬦ꐜ詨릢悯誒Ǉ譁\uf83d▒짨㰦溾\uf3b6뛂潠覭ᐘኮ轞ப솷㛾\uf2efĢ䂕ፒ횦", TextUtils.lastIndexOf("", '0', 0, 0) + 29).intern(), e);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1760(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2952) {
            char[] cArr2 = new char[cArr.length];
            k.f2951 = 0;
            char[] cArr3 = new char[2];
            while (k.f2951 < cArr.length) {
                cArr3[0] = cArr[k.f2951];
                cArr3[1] = cArr[k.f2951 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1540)) ^ ((c2 >>> 5) + f1542)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f1539) ^ ((c3 + i2) ^ ((c3 << 4) + f1541))));
                    i2 -= 40503;
                }
                cArr2[k.f2951] = cArr3[0];
                cArr2[k.f2951 + 1] = cArr3[1];
                k.f2951 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
