package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ia {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hn f2435;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private e f2436;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hx f2437;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2371(int i, int i2) {
        return i >= i2;
    }

    /* synthetic */ ia(byte b2) {
        this();
    }

    private ia() {
        this.f2436 = new e();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hx m2384() {
        return this.f2437;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hn m2375() {
        return this.f2435;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m2378() {
        return this.f2436.f2449;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m2380() {
        return this.f2436.f2452;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2381(int i) {
        return m2371(i, this.f2436.f2444);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2382(int i) {
        if (m2371(i, this.f2436.f2445)) {
            return this.f2436.f2447;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2377(int i) {
        return m2371(i, this.f2436.f2443);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2379(int i) {
        return m2371(i, this.f2436.f2440);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2385(int i) {
        return m2371(i, this.f2436.f2439);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2374(int i) {
        return m2371(i, this.f2436.f2446);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2383() {
        return this.f2436.f2441;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final e m2376(Class cls) {
        this.f2436.f2448 = cls;
        return this.f2436;
    }

    static class e {

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private Object f2442;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2448;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<String> f2449;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Class f2450;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Class f2451;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2452;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private int f2444 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private int f2445 = -1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private int f2447 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private int f2443 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private int f2446 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private int f2440 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private int f2439 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private boolean f2441 = true;

        e() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f2452 != eVar.f2452 || this.f2444 != eVar.f2444 || this.f2445 != eVar.f2445 || this.f2447 != eVar.f2447 || this.f2443 != eVar.f2443 || this.f2446 != eVar.f2446 || this.f2440 != eVar.f2440 || this.f2439 != eVar.f2439 || this.f2441 != eVar.f2441) {
                    return false;
                }
                Class cls = this.f2448;
                if (cls == null ? eVar.f2448 != null : !cls.equals(eVar.f2448)) {
                    return false;
                }
                Class cls2 = this.f2450;
                if (cls2 == null ? eVar.f2450 != null : !cls2.equals(eVar.f2450)) {
                    return false;
                }
                Class cls3 = this.f2451;
                if (cls3 == null ? eVar.f2451 != null : !cls3.equals(eVar.f2451)) {
                    return false;
                }
                List<String> list = this.f2449;
                if (list == null ? eVar.f2449 != null : !list.equals(eVar.f2449)) {
                    return false;
                }
                Object obj2 = this.f2442;
                Object obj3 = eVar.f2442;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2448;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2450;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2451;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2449;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2452) * 31) + this.f2444) * 31) + this.f2445) * 31) + this.f2447) * 31) + this.f2443) * 31) + this.f2446) * 31) + this.f2440) * 31) + this.f2439) * 31) + (this.f2441 ? 1 : 0)) * 31;
            Object obj = this.f2442;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ia f2438 = new ia(0);

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final b m2397(int i) {
            this.f2438.f2436.f2444 = i;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final b m2395(int i) {
            this.f2438.f2436.f2445 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final b m2389(int i) {
            this.f2438.f2436.f2447 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final b m2400(int i) {
            this.f2438.f2436.f2443 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final b m2392(int i) {
            this.f2438.f2436.f2440 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final b m2388(int i) {
            this.f2438.f2436.f2446 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final b m2387(int i) {
            this.f2438.f2436.f2439 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public final b m2386(boolean z) {
            this.f2438.f2436.f2441 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final b m2390(Object obj) {
            this.f2438.f2436.f2442 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final ia m2394(hx hxVar, List<String> list, int i) {
            return m2399(hxVar, null, list, i);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final ia m2399(hx hxVar, hn hnVar, List<String> list, int i) {
            this.f2438.f2437 = hxVar;
            this.f2438.f2435 = hnVar;
            this.f2438.f2436.f2449 = list;
            this.f2438.f2436.f2452 = i;
            this.f2438.f2436.f2450 = hxVar.getClass();
            this.f2438.f2436.f2451 = hnVar != null ? hnVar.getClass() : null;
            return this.f2438;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final b m2393(boolean z) {
            this.f2438.f2436.f2445 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final b m2396(boolean z) {
            this.f2438.f2436.f2443 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final b m2391(boolean z) {
            this.f2438.f2436.f2440 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final b m2401(boolean z) {
            this.f2438.f2436.f2446 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final b m2398(boolean z) {
            this.f2438.f2436.f2439 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }
}
