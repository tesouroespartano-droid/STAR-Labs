package com.ironsource.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C0421q4;
import com.ironsource.P6;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class IntegrationHelper {
    private static final String a = "IntegrationHelper";
    private static final String b = "4.1";
    private static final String c = "4.3";

    class a extends Thread {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.a, "--------------- Google Play Services --------------");
                if (!this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(IntegrationHelper.a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(IntegrationHelper.a, "Google Play Services - VERIFIED");
                String strB = p.m().b(this.a);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                Log.i(IntegrationHelper.a, "GAID is: " + strB + " (use this for test devices)");
            } catch (Exception e) {
                C0421q4.d().a(e);
                Log.e(IntegrationHelper.a, "Google Play Services - MISSING");
            }
        }
    }

    private static boolean a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(b) || integrationData.version.startsWith(c)) {
            Log.i(a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + LevelPlay.getSdkVersion() + ", please update your adapter to version 4.1.*");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    private static boolean b(Context context, String str) {
        byte b2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (lowerCase.equals("admob")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                Log.i(a, "--------------- Meta --------------");
            } else if (b2 == 1) {
                Log.i(a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b2 != 2) {
                Log.i(a, "--------------- " + str + " --------------");
            } else {
                Log.i(a, "--------------- Liftoff Monetization --------------");
            }
            String str2 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
            IntegrationData integrationDataA = a(context, str2);
            if (integrationDataA == null) {
                return false;
            }
            if (!str.equalsIgnoreCase("IronSource") && !a(integrationDataA)) {
                return false;
            }
            a(str2);
            return true;
        } catch (Exception e) {
            C0421q4.d().a(e);
            Log.e(a, "isAdapterValid " + str, e);
            return false;
        }
    }

    @Deprecated
    public static void validateIntegration(Context context) {
        Log.i(a, "Verifying Integration:");
        b(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", "Vungle", "Maio", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "Smaato", "SuperAwesome", P6.G1, "Verve", "Yandex"};
        for (int i = 0; i < 24; i++) {
            String str = strArr[i];
            if (!b(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                        }
                        break;
                    case 497130182:
                        if (lowerCase2.equals("facebook")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
            }

            private static IntegrationData a(Context context, String str) {
                try {
                    IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
                    Log.i(a, "Adapter " + integrationData.version + " - VERIFIED");
                    return integrationData;
                } catch (ClassNotFoundException e) {
                    C0421q4.d().a(e);
                    Log.e(a, "Adapter - MISSING");
                    return null;
                } catch (Exception e2) {
                    C0421q4.d().a(e2);
                    Log.e(a, "Adapter version - NOT VERIFIED");
                    return null;
                }
            }

            private static void a(Context context) {
                new a(context).start();
            }

            private static void a(String str) {
                try {
                    Log.i(a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", null).invoke(null, null)));
                } catch (Exception e) {
                    C0421q4.d().a(e);
                    Log.w("validateSDKVersion", "Unable to get SDK version");
                }
            }

            private static void b(Context context) {
                Log.i(a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }
        }
