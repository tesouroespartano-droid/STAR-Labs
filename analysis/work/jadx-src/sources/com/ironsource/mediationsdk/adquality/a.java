package com.ironsource.mediationsdk.adquality;

import com.ironsource.C0168b9;
import com.ironsource.EnumC0242fe;
import com.ironsource.P6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final b a = new b(null);
    private static EnumC0060a b = EnumC0060a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0060a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        public static final C0061a b = new C0061a(null);
        private final int a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0061a {
            public /* synthetic */ C0061a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            public final EnumC0060a a(int i) {
                for (EnumC0060a enumC0060a : EnumC0060a.values()) {
                    if (enumC0060a.b() == i) {
                        if (enumC0060a == null) {
                            return EnumC0060a.DONT_INITIALIZE;
                        }
                        return enumC0060a;
                    }
                }
                enumC0060a = null;
                if (enumC0060a == null) {
                    return EnumC0060a.DONT_INITIALIZE;
                }
                return enumC0060a;
            }

            private C0061a() {
            }
        }

        EnumC0060a(int i) {
            this.a = i;
        }

        public final int b() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0060a a() {
            return a.b;
        }

        private b() {
        }

        public final void a(EnumC0060a enumC0060a) {
            Intrinsics.checkNotNullParameter(enumC0060a, "<set-?>");
            a.b = enumC0060a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0060a.values().length];
            try {
                iArr[EnumC0060a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0060a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0060a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC0242fe enumC0242fe;
        JSONArray jSONArrayOptJSONArray = new C0168b9().a().optJSONArray(P6.g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = jSONArrayOptJSONArray.getInt(i);
            EnumC0242fe[] enumC0242feArrValues = EnumC0242fe.values();
            int length2 = enumC0242feArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC0242fe = null;
                    break;
                }
                enumC0242fe = enumC0242feArrValues[i3];
                if (enumC0242fe.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC0242fe != null) {
                linkedHashSet.add(enumC0242fe);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC0242fe.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC0242fe.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC0242fe.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC0242fe.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i) {
        b = EnumC0060a.b.a(i);
    }
}
