package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public interface C9 extends InterfaceC0580zb<Integer, Integer> {

    public static final class a {
        public static final a a = new a();
        public static final int b = 2201;
        public static final int c = 2203;
        public static final int d = 2005;
        public static final int e = 2210;
        public static final int f = 2006;
        public static final int g = 2204;
        public static final int h = 2507;
        public static final int i = 2211;
        public static final int j = 2212;

        private a() {
        }
    }

    public static final class b {
        public static final b a = new b();
        public static final int b = 2002;
        public static final int c = 2003;
        public static final int d = 2200;
        public static final int e = 2503;
        public static final int f = 2504;
        public static final int g = 2300;

        private b() {
        }
    }

    public static final class c implements C9 {
        @Override // com.ironsource.InterfaceC0580zb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.e;
            } else if (i == 207) {
                i2 = b.f;
            } else if (i == 401) {
                i2 = a.b;
            } else if (i == 410) {
                i2 = a.i;
            } else if (i != 411) {
                switch (i) {
                    case InterfaceC0280i1.d.b.b /* 101 */:
                        i2 = d.b;
                        break;
                    case 102:
                        i2 = d.c;
                        break;
                    case InterfaceC0280i1.d.b.d /* 103 */:
                        i2 = d.h;
                        break;
                    case 104:
                        i2 = d.d;
                        break;
                    case 105:
                        i2 = d.e;
                        break;
                    default:
                        switch (i) {
                            case InterfaceC0280i1.d.b.g /* 109 */:
                                i2 = 88002;
                                break;
                            case InterfaceC0280i1.d.b.h /* 110 */:
                                i2 = 83004;
                                break;
                            case InterfaceC0280i1.d.b.i /* 111 */:
                                i2 = d.i;
                                break;
                            case InterfaceC0280i1.d.b.j /* 112 */:
                                i2 = d.j;
                                break;
                            default:
                                switch (i) {
                                    case InterfaceC0280i1.c.b.b /* 201 */:
                                        i2 = b.b;
                                        break;
                                    case InterfaceC0280i1.c.b.c /* 202 */:
                                        i2 = b.c;
                                        break;
                                    case InterfaceC0280i1.c.b.d /* 203 */:
                                        i2 = b.d;
                                        break;
                                    case InterfaceC0280i1.c.b.e /* 204 */:
                                        i2 = b.g;
                                        break;
                                    default:
                                        switch (i) {
                                            case InterfaceC0280i1.a.b.c /* 403 */:
                                                i2 = a.c;
                                                break;
                                            case InterfaceC0280i1.a.b.d /* 404 */:
                                                i2 = a.d;
                                                break;
                                            case InterfaceC0280i1.a.b.e /* 405 */:
                                                i2 = a.e;
                                                break;
                                            case InterfaceC0280i1.a.b.f /* 406 */:
                                                i2 = a.f;
                                                break;
                                            case InterfaceC0280i1.a.b.g /* 407 */:
                                                i2 = a.g;
                                                break;
                                            case InterfaceC0280i1.a.b.h /* 408 */:
                                                i2 = a.h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i2 = a.j;
            }
            return Integer.valueOf(i2);
        }
    }

    public static final class d {
        public static final d a = new d();
        public static final int b = 82500;
        public static final int c = 82510;
        public static final int d = 82300;
        public static final int e = 82002;
        public static final int f = 83004;
        public static final int g = 88002;
        public static final int h = 82301;
        public static final int i = 82302;
        public static final int j = 82076;

        private d() {
        }
    }
}
