package com.unity3d.services.core.domain.task;

import com.ironsource.InterfaceC0280i1;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ResultExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, 58, LockFreeTaskQueueCore.FROZEN_SHIFT, 65, 67, 71, 74, 89, 92, 100, InterfaceC0280i1.d.b.d, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configuration", "configResult", "$this$withContext", "configuration", "configResult", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0297 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02a1 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f0 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0304  */
    /* JADX WARN: Code duplicated, block: B:115:0x0311 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x033a  */
    /* JADX WARN: Code duplicated, block: B:120:0x033b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0345 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0357  */
    /* JADX WARN: Code duplicated, block: B:126:0x0358 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, PHI: r0 r1
      0x0358: PHI (r0v66 java.lang.Object) = (r0v64 java.lang.Object), (r0v64 java.lang.Object), (r0v69 java.lang.Object) binds: [B:122:0x0343, B:124:0x0355, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r1v42 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r1v39 com.unity3d.services.core.domain.task.InitializeSDK)
      (r1v39 com.unity3d.services.core.domain.task.InitializeSDK)
      (r1v46 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:122:0x0343, B:124:0x0355, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0381 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[PHI: r0 r1 r3 r4 r14
      0x0082: PHI (r0v40 java.lang.Object) = (r0v38 java.lang.Object), (r0v48 java.lang.Object) binds: [B:87:0x0254, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r1v19 com.unity3d.services.core.configuration.Configuration) = 
      (r1v16 com.unity3d.services.core.configuration.Configuration)
      (r1v29 com.unity3d.services.core.configuration.Configuration)
     binds: [B:87:0x0254, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r3v22 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r3v19 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v24 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:87:0x0254, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r4v16 kotlinx.coroutines.CoroutineScope) = (r4v13 kotlinx.coroutines.CoroutineScope), (r4v25 kotlinx.coroutines.CoroutineScope) binds: [B:87:0x0254, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r14v40 java.lang.Object) = (r14v39 java.lang.Object), (r14v47 java.lang.Object) binds: [B:87:0x0254, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f8 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0212  */
    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0232  */
    /* JADX WARN: Code duplicated, block: B:86:0x0234 A[Catch: all -> 0x038d, CancellationException -> 0x03bb, PHI: r0 r1 r3 r4
      0x0234: PHI (r0v38 java.lang.Object) = (r0v34 java.lang.Object), (r0v34 java.lang.Object), (r0v39 java.lang.Object) binds: [B:82:0x021b, B:84:0x0230, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r1v16 com.unity3d.services.core.configuration.Configuration) = 
      (r1v12 com.unity3d.services.core.configuration.Configuration)
      (r1v12 com.unity3d.services.core.configuration.Configuration)
      (r1v18 com.unity3d.services.core.configuration.Configuration)
     binds: [B:82:0x021b, B:84:0x0230, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r3v19 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v21 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:82:0x021b, B:84:0x0230, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r4v13 kotlinx.coroutines.CoroutineScope) = 
      (r4v11 kotlinx.coroutines.CoroutineScope)
      (r4v11 kotlinx.coroutines.CoroutineScope)
      (r4v15 kotlinx.coroutines.CoroutineScope)
     binds: [B:82:0x021b, B:84:0x0230, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0256  */
    /* JADX WARN: Code duplicated, block: B:91:0x025e A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:96:0x027e A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x028c A[Catch: all -> 0x038d, CancellationException -> 0x03bb, TryCatch #2 {CancellationException -> 0x03bb, all -> 0x038d, blocks: (B:6:0x0017, B:129:0x0377, B:9:0x0028, B:126:0x0358, B:12:0x0033, B:121:0x033f, B:123:0x0345, B:15:0x0046, B:114:0x0306, B:117:0x0317, B:18:0x0051, B:109:0x02ea, B:111:0x02f0, B:21:0x0061, B:94:0x0278, B:96:0x027e, B:97:0x028b, B:24:0x0079, B:89:0x0258, B:91:0x025e, B:98:0x028c, B:100:0x0297, B:102:0x02a1, B:104:0x02a7, B:105:0x02c4, B:115:0x0311, B:130:0x0381, B:131:0x038c, B:27:0x0096, B:86:0x0234, B:30:0x00a7, B:81:0x0217, B:83:0x021d, B:33:0x00b8, B:73:0x01e4, B:75:0x01ea, B:76:0x01f7, B:36:0x00ce, B:68:0x01c7, B:70:0x01cd, B:77:0x01f8, B:39:0x00e4, B:58:0x0180, B:60:0x0186, B:61:0x019a, B:64:0x01a6, B:42:0x00f7, B:53:0x015b, B:54:0x015e, B:45:0x0105, B:47:0x0122, B:49:0x0128), top: B:145:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0374, code lost:
    
        if (r14 == r2) goto L128;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3604constructorimpl;
        CoroutineScope coroutineScope;
        InitializeSDK initializeSDK;
        InitializeSDK initializeSDK2;
        Object obj2;
        InitializeSDK initializeSDK3;
        Object value;
        Throwable thM3607exceptionOrNullimpl;
        Configuration configuration;
        Configuration configuration2;
        Object obj3;
        InitializeSDK initializeSDK4;
        Object value2;
        Object value3;
        CoroutineScope coroutineScope2;
        InitializeSDK initializeSDK5;
        Configuration configuration3;
        ErrorState errorState;
        Throwable thM3607exceptionOrNullimpl2;
        Throwable thM3607exceptionOrNullimpl3;
        InitializationException initializationExceptionOrThrow;
        Object value4;
        Object obj4;
        Object obj5;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        String webViewData;
        Object value5;
        Object obj6;
        ErrorState errorState2;
        Throwable thM3607exceptionOrNullimpl4;
        Throwable thM3607exceptionOrNullimpl5;
        InitializationException initializationExceptionOrThrow2;
        Object obj7;
        Object obj8;
        Object value6;
        InitializeSDK initializeSDK6;
        InitializationException initializationExceptionOrThrow3;
        Object value7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    initializeSDK = this.this$0;
                    Result.Companion companion = Result.INSTANCE;
                    SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                    SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                    InitializeEventsMetricSender.getInstance().didInitStart();
                    String gameId = ClientProperties.getGameId();
                    if (gameId == null || StringsKt.toIntOrNull(gameId) == null) {
                        InitializationException initializationException = new InitializationException(ErrorState.InvalidGameId, new Exception("gameId \"" + gameId + "\" should be a number."), new Configuration());
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK;
                        this.label = 1;
                        if (initializeSDK.handleInitializationException(initializationException, this) != coroutine_suspended) {
                            initializeSDK2 = initializeSDK;
                            Unit unit = Unit.INSTANCE;
                            initializeSDK = initializeSDK2;
                            DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                            ConfigFileFromLocalStorage configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                            ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                            this.L$0 = coroutineScope;
                            this.L$1 = initializeSDK;
                            this.label = 2;
                            obj2 = configFileFromLocalStorage.mo3520invokegIAlus(params, this);
                            if (obj2 != coroutine_suspended) {
                                initializeSDK3 = initializeSDK;
                                value = obj2;
                                thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(value);
                                if (thM3607exceptionOrNullimpl != null) {
                                    DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3607exceptionOrNullimpl.getMessage());
                                }
                                configuration = new Configuration();
                                if (Result.m3610isFailureimpl(value)) {
                                    value = configuration;
                                }
                                configuration2 = (Configuration) value;
                                InitializeStateReset initializeStateReset = initializeSDK3.initializeStateReset;
                                InitializeStateReset.Params params2 = new InitializeStateReset.Params(configuration2);
                                this.L$0 = coroutineScope;
                                this.L$1 = initializeSDK3;
                                this.L$2 = configuration2;
                                this.label = 3;
                                obj3 = initializeStateReset.mo3520invokegIAlus(params2, this);
                                if (obj3 == coroutine_suspended) {
                                    initializeSDK4 = initializeSDK3;
                                    value2 = obj3;
                                    if (!Result.m3610isFailureimpl(value2)) {
                                        InitializeStateConfig initializeStateConfig = initializeSDK4.initializeStateConfig;
                                        InitializeStateConfig.Params params3 = new InitializeStateConfig.Params(configuration2);
                                        this.L$0 = coroutineScope;
                                        this.L$1 = initializeSDK4;
                                        this.L$2 = configuration2;
                                        this.label = 5;
                                        value3 = initializeStateConfig.mo3520invokegIAlus(params3, this);
                                        if (value3 != coroutine_suspended) {
                                            coroutineScope2 = coroutineScope;
                                            initializeSDK5 = initializeSDK4;
                                            configuration3 = configuration2;
                                            if (Result.m3610isFailureimpl(value3)) {
                                                InitializeStateLoadCache initializeStateLoadCache = initializeSDK5.initializeStateLoadCache;
                                                ResultKt.throwOnFailure(value3);
                                                InitializeStateLoadCache.Params params4 = new InitializeStateLoadCache.Params((Configuration) value3);
                                                this.L$0 = coroutineScope2;
                                                this.L$1 = initializeSDK5;
                                                this.L$2 = configuration3;
                                                this.L$3 = value3;
                                                this.label = 7;
                                                value4 = initializeStateLoadCache.mo3520invokegIAlus(params4, this);
                                                if (value4 != coroutine_suspended) {
                                                    Object obj9 = value3;
                                                    obj4 = value4;
                                                    obj5 = obj9;
                                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                                    if (Result.m3610isFailureimpl(obj4)) {
                                                        errorState2 = ErrorState.LoadCache;
                                                        thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                        this.L$0 = obj4;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 8;
                                                        if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                        }
                                                        thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                        if (thM3607exceptionOrNullimpl5 == null) {
                                                            throw new Exception(ErrorState.LoadCache.toString());
                                                        }
                                                        throw thM3607exceptionOrNullimpl5;
                                                    }
                                                    ResultKt.throwOnFailure(obj4);
                                                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                                    if (loadCacheResult.getHasHashMismatch()) {
                                                        if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                        }
                                                        InitializeStateLoadWeb initializeStateLoadWeb = initializeSDK5.initializeStateLoadWeb;
                                                        ResultKt.throwOnFailure(obj5);
                                                        InitializeStateLoadWeb.Params params5 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                        this.L$0 = initializeSDK5;
                                                        this.L$1 = obj5;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 9;
                                                        value5 = initializeStateLoadWeb.mo3520invokegIAlus(params5, this);
                                                        if (value5 == coroutine_suspended) {
                                                            obj6 = obj5;
                                                            if (Result.m3610isFailureimpl(value5)) {
                                                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                                this.L$0 = initializeSDK5;
                                                                this.L$1 = obj6;
                                                                this.L$2 = value5;
                                                                this.label = 10;
                                                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                                }
                                                            }
                                                            obj5 = obj6;
                                                            ResultKt.throwOnFailure(value5);
                                                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                        }
                                                    } else {
                                                        webViewData = loadCacheResult.getWebViewData();
                                                        if (webViewData == null) {
                                                            throw new IllegalStateException("WebView is missing.".toString());
                                                        }
                                                    }
                                                    InitializeStateCreate initializeStateCreate = initializeSDK5.initializeStateCreate;
                                                    ResultKt.throwOnFailure(obj5);
                                                    InitializeStateCreate.Params params6 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj5;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 11;
                                                    obj7 = initializeStateCreate.mo3520invokegIAlus(params6, this);
                                                    if (obj7 == coroutine_suspended) {
                                                        obj8 = obj5;
                                                        value6 = obj7;
                                                        initializeSDK6 = initializeSDK5;
                                                        if (!Result.m3610isFailureimpl(value6)) {
                                                            InitializeStateComplete initializeStateComplete = initializeSDK6.initializeStateComplete;
                                                            ResultKt.throwOnFailure(obj8);
                                                            InitializeStateComplete.Params params7 = new InitializeStateComplete.Params((Configuration) obj8);
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.label = 13;
                                                            value7 = initializeStateComplete.mo3520invokegIAlus(params7, this);
                                                            break;
                                                        } else {
                                                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                            this.L$0 = initializeSDK6;
                                                            this.L$1 = obj8;
                                                            this.label = 12;
                                                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                                InitializeStateComplete initializeStateComplete2 = initializeSDK6.initializeStateComplete;
                                                                ResultKt.throwOnFailure(obj8);
                                                                InitializeStateComplete.Params params8 = new InitializeStateComplete.Params((Configuration) obj8);
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.label = 13;
                                                                value7 = initializeStateComplete2.mo3520invokegIAlus(params8, this);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                                                this.L$0 = coroutineScope2;
                                                this.L$1 = initializeSDK5;
                                                this.L$2 = configuration3;
                                                this.L$3 = value3;
                                                this.label = 6;
                                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                                    InitializeStateLoadCache initializeStateLoadCache2 = initializeSDK5.initializeStateLoadCache;
                                                    ResultKt.throwOnFailure(value3);
                                                    InitializeStateLoadCache.Params params9 = new InitializeStateLoadCache.Params((Configuration) value3);
                                                    this.L$0 = coroutineScope2;
                                                    this.L$1 = initializeSDK5;
                                                    this.L$2 = configuration3;
                                                    this.L$3 = value3;
                                                    this.label = 7;
                                                    value4 = initializeStateLoadCache2.mo3520invokegIAlus(params9, this);
                                                    if (value4 != coroutine_suspended) {
                                                        Object obj10 = value3;
                                                        obj4 = value4;
                                                        obj5 = obj10;
                                                        CoroutineScope coroutineScope4 = coroutineScope2;
                                                        if (Result.m3610isFailureimpl(obj4)) {
                                                            errorState2 = ErrorState.LoadCache;
                                                            thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                            this.L$0 = obj4;
                                                            this.L$1 = null;
                                                            this.L$2 = null;
                                                            this.L$3 = null;
                                                            this.label = 8;
                                                            if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                            }
                                                            thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                            if (thM3607exceptionOrNullimpl5 == null) {
                                                                throw new Exception(ErrorState.LoadCache.toString());
                                                            }
                                                            throw thM3607exceptionOrNullimpl5;
                                                        }
                                                        ResultKt.throwOnFailure(obj4);
                                                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                                        if (loadCacheResult.getHasHashMismatch()) {
                                                            if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled() && loadCacheResult.getWebViewData() != null) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, new CoroutineName("LaunchLoadWeb"), null, new InitializeSDK$doWork$2$1$webViewData$1(initializeSDK5, obj5, null), 2, null);
                                                                webViewData = loadCacheResult.getWebViewData();
                                                            } else {
                                                                InitializeStateLoadWeb initializeStateLoadWeb2 = initializeSDK5.initializeStateLoadWeb;
                                                                ResultKt.throwOnFailure(obj5);
                                                                InitializeStateLoadWeb.Params params10 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                                this.L$0 = initializeSDK5;
                                                                this.L$1 = obj5;
                                                                this.L$2 = null;
                                                                this.L$3 = null;
                                                                this.label = 9;
                                                                value5 = initializeStateLoadWeb2.mo3520invokegIAlus(params10, this);
                                                                if (value5 == coroutine_suspended) {
                                                                    obj6 = obj5;
                                                                    if (Result.m3610isFailureimpl(value5)) {
                                                                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                                        this.L$0 = initializeSDK5;
                                                                        this.L$1 = obj6;
                                                                        this.L$2 = value5;
                                                                        this.label = 10;
                                                                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                                        }
                                                                    }
                                                                    obj5 = obj6;
                                                                    ResultKt.throwOnFailure(value5);
                                                                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                                }
                                                            }
                                                        } else {
                                                            webViewData = loadCacheResult.getWebViewData();
                                                            if (webViewData == null) {
                                                                throw new IllegalStateException("WebView is missing.".toString());
                                                            }
                                                        }
                                                        InitializeStateCreate initializeStateCreate2 = initializeSDK5.initializeStateCreate;
                                                        ResultKt.throwOnFailure(obj5);
                                                        InitializeStateCreate.Params params11 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                                        this.L$0 = initializeSDK5;
                                                        this.L$1 = obj5;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 11;
                                                        obj7 = initializeStateCreate2.mo3520invokegIAlus(params11, this);
                                                        if (obj7 == coroutine_suspended) {
                                                            obj8 = obj5;
                                                            value6 = obj7;
                                                            initializeSDK6 = initializeSDK5;
                                                            if (!Result.m3610isFailureimpl(value6)) {
                                                                InitializeStateComplete initializeStateComplete3 = initializeSDK6.initializeStateComplete;
                                                                ResultKt.throwOnFailure(obj8);
                                                                InitializeStateComplete.Params params12 = new InitializeStateComplete.Params((Configuration) obj8);
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.label = 13;
                                                                value7 = initializeStateComplete3.mo3520invokegIAlus(params12, this);
                                                                break;
                                                            } else {
                                                                initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                                this.L$0 = initializeSDK6;
                                                                this.L$1 = obj8;
                                                                this.label = 12;
                                                                if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                                    InitializeStateComplete initializeStateComplete4 = initializeSDK6.initializeStateComplete;
                                                                    ResultKt.throwOnFailure(obj8);
                                                                    InitializeStateComplete.Params params13 = new InitializeStateComplete.Params((Configuration) obj8);
                                                                    this.L$0 = null;
                                                                    this.L$1 = null;
                                                                    this.label = 13;
                                                                    value7 = initializeStateComplete4.mo3520invokegIAlus(params13, this);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        errorState = ErrorState.ResetWebApp;
                                        thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(value2);
                                        this.L$0 = value2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 4;
                                        if (initializeSDK4.m3524executeErrorStateBWLJW6A(errorState, thM3607exceptionOrNullimpl2, configuration2, this) == coroutine_suspended) {
                                        }
                                        thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                                        if (thM3607exceptionOrNullimpl3 == null) {
                                            throw new Exception(ErrorState.ResetWebApp.toString());
                                        }
                                        throw thM3607exceptionOrNullimpl3;
                                    }
                                }
                            }
                        }
                    } else {
                        DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                        ConfigFileFromLocalStorage configFileFromLocalStorage2 = initializeSDK.configFileFromLocalStorage;
                        ConfigFileFromLocalStorage.Params params14 = new ConfigFileFromLocalStorage.Params(null, 1, null);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK;
                        this.label = 2;
                        obj2 = configFileFromLocalStorage2.mo3520invokegIAlus(params14, this);
                        if (obj2 != coroutine_suspended) {
                            initializeSDK3 = initializeSDK;
                            value = obj2;
                            thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(value);
                            if (thM3607exceptionOrNullimpl != null) {
                                DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3607exceptionOrNullimpl.getMessage());
                            }
                            configuration = new Configuration();
                            if (Result.m3610isFailureimpl(value)) {
                                value = configuration;
                            }
                            configuration2 = (Configuration) value;
                            InitializeStateReset initializeStateReset2 = initializeSDK3.initializeStateReset;
                            InitializeStateReset.Params params15 = new InitializeStateReset.Params(configuration2);
                            this.L$0 = coroutineScope;
                            this.L$1 = initializeSDK3;
                            this.L$2 = configuration2;
                            this.label = 3;
                            obj3 = initializeStateReset2.mo3520invokegIAlus(params15, this);
                            if (obj3 == coroutine_suspended) {
                                initializeSDK4 = initializeSDK3;
                                value2 = obj3;
                                if (!Result.m3610isFailureimpl(value2)) {
                                    InitializeStateConfig initializeStateConfig2 = initializeSDK4.initializeStateConfig;
                                    InitializeStateConfig.Params params16 = new InitializeStateConfig.Params(configuration2);
                                    this.L$0 = coroutineScope;
                                    this.L$1 = initializeSDK4;
                                    this.L$2 = configuration2;
                                    this.label = 5;
                                    value3 = initializeStateConfig2.mo3520invokegIAlus(params16, this);
                                    if (value3 != coroutine_suspended) {
                                        coroutineScope2 = coroutineScope;
                                        initializeSDK5 = initializeSDK4;
                                        configuration3 = configuration2;
                                        if (Result.m3610isFailureimpl(value3)) {
                                            InitializeStateLoadCache initializeStateLoadCache3 = initializeSDK5.initializeStateLoadCache;
                                            ResultKt.throwOnFailure(value3);
                                            InitializeStateLoadCache.Params params17 = new InitializeStateLoadCache.Params((Configuration) value3);
                                            this.L$0 = coroutineScope2;
                                            this.L$1 = initializeSDK5;
                                            this.L$2 = configuration3;
                                            this.L$3 = value3;
                                            this.label = 7;
                                            value4 = initializeStateLoadCache3.mo3520invokegIAlus(params17, this);
                                            if (value4 != coroutine_suspended) {
                                                Object obj11 = value3;
                                                obj4 = value4;
                                                obj5 = obj11;
                                                CoroutineScope coroutineScope5 = coroutineScope2;
                                                if (Result.m3610isFailureimpl(obj4)) {
                                                    errorState2 = ErrorState.LoadCache;
                                                    thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                    this.L$0 = obj4;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 8;
                                                    if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                    }
                                                    thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                    if (thM3607exceptionOrNullimpl5 == null) {
                                                        throw new Exception(ErrorState.LoadCache.toString());
                                                    }
                                                    throw thM3607exceptionOrNullimpl5;
                                                }
                                                ResultKt.throwOnFailure(obj4);
                                                loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                                if (loadCacheResult.getHasHashMismatch()) {
                                                    if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                    }
                                                    InitializeStateLoadWeb initializeStateLoadWeb3 = initializeSDK5.initializeStateLoadWeb;
                                                    ResultKt.throwOnFailure(obj5);
                                                    InitializeStateLoadWeb.Params params18 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj5;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 9;
                                                    value5 = initializeStateLoadWeb3.mo3520invokegIAlus(params18, this);
                                                    if (value5 == coroutine_suspended) {
                                                        obj6 = obj5;
                                                        if (Result.m3610isFailureimpl(value5)) {
                                                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                            this.L$0 = initializeSDK5;
                                                            this.L$1 = obj6;
                                                            this.L$2 = value5;
                                                            this.label = 10;
                                                            if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                            }
                                                        }
                                                        obj5 = obj6;
                                                        ResultKt.throwOnFailure(value5);
                                                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                    }
                                                } else {
                                                    webViewData = loadCacheResult.getWebViewData();
                                                    if (webViewData == null) {
                                                        throw new IllegalStateException("WebView is missing.".toString());
                                                    }
                                                }
                                                InitializeStateCreate initializeStateCreate3 = initializeSDK5.initializeStateCreate;
                                                ResultKt.throwOnFailure(obj5);
                                                InitializeStateCreate.Params params19 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                                this.L$0 = initializeSDK5;
                                                this.L$1 = obj5;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 11;
                                                obj7 = initializeStateCreate3.mo3520invokegIAlus(params19, this);
                                                if (obj7 == coroutine_suspended) {
                                                    obj8 = obj5;
                                                    value6 = obj7;
                                                    initializeSDK6 = initializeSDK5;
                                                    if (!Result.m3610isFailureimpl(value6)) {
                                                        InitializeStateComplete initializeStateComplete5 = initializeSDK6.initializeStateComplete;
                                                        ResultKt.throwOnFailure(obj8);
                                                        InitializeStateComplete.Params params110 = new InitializeStateComplete.Params((Configuration) obj8);
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.label = 13;
                                                        value7 = initializeStateComplete5.mo3520invokegIAlus(params110, this);
                                                        break;
                                                    } else {
                                                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                        this.L$0 = initializeSDK6;
                                                        this.L$1 = obj8;
                                                        this.label = 12;
                                                        if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                            InitializeStateComplete initializeStateComplete6 = initializeSDK6.initializeStateComplete;
                                                            ResultKt.throwOnFailure(obj8);
                                                            InitializeStateComplete.Params params111 = new InitializeStateComplete.Params((Configuration) obj8);
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.label = 13;
                                                            value7 = initializeStateComplete6.mo3520invokegIAlus(params111, this);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                                            this.L$0 = coroutineScope2;
                                            this.L$1 = initializeSDK5;
                                            this.L$2 = configuration3;
                                            this.L$3 = value3;
                                            this.label = 6;
                                            if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                                InitializeStateLoadCache initializeStateLoadCache4 = initializeSDK5.initializeStateLoadCache;
                                                ResultKt.throwOnFailure(value3);
                                                InitializeStateLoadCache.Params params112 = new InitializeStateLoadCache.Params((Configuration) value3);
                                                this.L$0 = coroutineScope2;
                                                this.L$1 = initializeSDK5;
                                                this.L$2 = configuration3;
                                                this.L$3 = value3;
                                                this.label = 7;
                                                value4 = initializeStateLoadCache4.mo3520invokegIAlus(params112, this);
                                                if (value4 != coroutine_suspended) {
                                                    Object obj12 = value3;
                                                    obj4 = value4;
                                                    obj5 = obj12;
                                                    CoroutineScope coroutineScope6 = coroutineScope2;
                                                    if (Result.m3610isFailureimpl(obj4)) {
                                                        errorState2 = ErrorState.LoadCache;
                                                        thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                        this.L$0 = obj4;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 8;
                                                        if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                        }
                                                        thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                        if (thM3607exceptionOrNullimpl5 == null) {
                                                            throw new Exception(ErrorState.LoadCache.toString());
                                                        }
                                                        throw thM3607exceptionOrNullimpl5;
                                                    }
                                                    ResultKt.throwOnFailure(obj4);
                                                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                                    if (loadCacheResult.getHasHashMismatch()) {
                                                        if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                        }
                                                        InitializeStateLoadWeb initializeStateLoadWeb4 = initializeSDK5.initializeStateLoadWeb;
                                                        ResultKt.throwOnFailure(obj5);
                                                        InitializeStateLoadWeb.Params params113 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                        this.L$0 = initializeSDK5;
                                                        this.L$1 = obj5;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.label = 9;
                                                        value5 = initializeStateLoadWeb4.mo3520invokegIAlus(params113, this);
                                                        if (value5 == coroutine_suspended) {
                                                            obj6 = obj5;
                                                            if (Result.m3610isFailureimpl(value5)) {
                                                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                                this.L$0 = initializeSDK5;
                                                                this.L$1 = obj6;
                                                                this.L$2 = value5;
                                                                this.label = 10;
                                                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                                }
                                                            }
                                                            obj5 = obj6;
                                                            ResultKt.throwOnFailure(value5);
                                                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                        }
                                                    } else {
                                                        webViewData = loadCacheResult.getWebViewData();
                                                        if (webViewData == null) {
                                                            throw new IllegalStateException("WebView is missing.".toString());
                                                        }
                                                    }
                                                    InitializeStateCreate initializeStateCreate4 = initializeSDK5.initializeStateCreate;
                                                    ResultKt.throwOnFailure(obj5);
                                                    InitializeStateCreate.Params params114 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj5;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 11;
                                                    obj7 = initializeStateCreate4.mo3520invokegIAlus(params114, this);
                                                    if (obj7 == coroutine_suspended) {
                                                        obj8 = obj5;
                                                        value6 = obj7;
                                                        initializeSDK6 = initializeSDK5;
                                                        if (!Result.m3610isFailureimpl(value6)) {
                                                            InitializeStateComplete initializeStateComplete7 = initializeSDK6.initializeStateComplete;
                                                            ResultKt.throwOnFailure(obj8);
                                                            InitializeStateComplete.Params params115 = new InitializeStateComplete.Params((Configuration) obj8);
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.label = 13;
                                                            value7 = initializeStateComplete7.mo3520invokegIAlus(params115, this);
                                                            break;
                                                        } else {
                                                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                            this.L$0 = initializeSDK6;
                                                            this.L$1 = obj8;
                                                            this.label = 12;
                                                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                                InitializeStateComplete initializeStateComplete8 = initializeSDK6.initializeStateComplete;
                                                                ResultKt.throwOnFailure(obj8);
                                                                InitializeStateComplete.Params params116 = new InitializeStateComplete.Params((Configuration) obj8);
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.label = 13;
                                                                value7 = initializeStateComplete8.mo3520invokegIAlus(params116, this);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    errorState = ErrorState.ResetWebApp;
                                    thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(value2);
                                    this.L$0 = value2;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                    if (initializeSDK4.m3524executeErrorStateBWLJW6A(errorState, thM3607exceptionOrNullimpl2, configuration2, this) == coroutine_suspended) {
                                    }
                                    thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                                    if (thM3607exceptionOrNullimpl3 == null) {
                                        throw new Exception(ErrorState.ResetWebApp.toString());
                                    }
                                    throw thM3607exceptionOrNullimpl3;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    initializeSDK2 = (InitializeSDK) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    initializeSDK = initializeSDK2;
                    DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    ConfigFileFromLocalStorage configFileFromLocalStorage3 = initializeSDK.configFileFromLocalStorage;
                    ConfigFileFromLocalStorage.Params params117 = new ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK;
                    this.label = 2;
                    obj2 = configFileFromLocalStorage3.mo3520invokegIAlus(params117, this);
                    if (obj2 != coroutine_suspended) {
                        initializeSDK3 = initializeSDK;
                        value = obj2;
                        thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(value);
                        if (thM3607exceptionOrNullimpl != null) {
                            DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3607exceptionOrNullimpl.getMessage());
                        }
                        configuration = new Configuration();
                        if (Result.m3610isFailureimpl(value)) {
                            value = configuration;
                        }
                        configuration2 = (Configuration) value;
                        InitializeStateReset initializeStateReset3 = initializeSDK3.initializeStateReset;
                        InitializeStateReset.Params params118 = new InitializeStateReset.Params(configuration2);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK3;
                        this.L$2 = configuration2;
                        this.label = 3;
                        obj3 = initializeStateReset3.mo3520invokegIAlus(params118, this);
                        if (obj3 == coroutine_suspended) {
                            initializeSDK4 = initializeSDK3;
                            value2 = obj3;
                            if (!Result.m3610isFailureimpl(value2)) {
                                InitializeStateConfig initializeStateConfig3 = initializeSDK4.initializeStateConfig;
                                InitializeStateConfig.Params params119 = new InitializeStateConfig.Params(configuration2);
                                this.L$0 = coroutineScope;
                                this.L$1 = initializeSDK4;
                                this.L$2 = configuration2;
                                this.label = 5;
                                value3 = initializeStateConfig3.mo3520invokegIAlus(params119, this);
                                if (value3 != coroutine_suspended) {
                                    coroutineScope2 = coroutineScope;
                                    initializeSDK5 = initializeSDK4;
                                    configuration3 = configuration2;
                                    if (Result.m3610isFailureimpl(value3)) {
                                        InitializeStateLoadCache initializeStateLoadCache5 = initializeSDK5.initializeStateLoadCache;
                                        ResultKt.throwOnFailure(value3);
                                        InitializeStateLoadCache.Params params1110 = new InitializeStateLoadCache.Params((Configuration) value3);
                                        this.L$0 = coroutineScope2;
                                        this.L$1 = initializeSDK5;
                                        this.L$2 = configuration3;
                                        this.L$3 = value3;
                                        this.label = 7;
                                        value4 = initializeStateLoadCache5.mo3520invokegIAlus(params1110, this);
                                        if (value4 != coroutine_suspended) {
                                            Object obj13 = value3;
                                            obj4 = value4;
                                            obj5 = obj13;
                                            CoroutineScope coroutineScope7 = coroutineScope2;
                                            if (Result.m3610isFailureimpl(obj4)) {
                                                errorState2 = ErrorState.LoadCache;
                                                thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                this.L$0 = obj4;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 8;
                                                if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                }
                                                thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                if (thM3607exceptionOrNullimpl5 == null) {
                                                    throw new Exception(ErrorState.LoadCache.toString());
                                                }
                                                throw thM3607exceptionOrNullimpl5;
                                            }
                                            ResultKt.throwOnFailure(obj4);
                                            loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                            if (loadCacheResult.getHasHashMismatch()) {
                                                if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                }
                                                InitializeStateLoadWeb initializeStateLoadWeb5 = initializeSDK5.initializeStateLoadWeb;
                                                ResultKt.throwOnFailure(obj5);
                                                InitializeStateLoadWeb.Params params1111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                this.L$0 = initializeSDK5;
                                                this.L$1 = obj5;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 9;
                                                value5 = initializeStateLoadWeb5.mo3520invokegIAlus(params1111, this);
                                                if (value5 == coroutine_suspended) {
                                                    obj6 = obj5;
                                                    if (Result.m3610isFailureimpl(value5)) {
                                                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                        this.L$0 = initializeSDK5;
                                                        this.L$1 = obj6;
                                                        this.L$2 = value5;
                                                        this.label = 10;
                                                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                        }
                                                    }
                                                    obj5 = obj6;
                                                    ResultKt.throwOnFailure(value5);
                                                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                }
                                            } else {
                                                webViewData = loadCacheResult.getWebViewData();
                                                if (webViewData == null) {
                                                    throw new IllegalStateException("WebView is missing.".toString());
                                                }
                                            }
                                            InitializeStateCreate initializeStateCreate5 = initializeSDK5.initializeStateCreate;
                                            ResultKt.throwOnFailure(obj5);
                                            InitializeStateCreate.Params params1112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                            this.L$0 = initializeSDK5;
                                            this.L$1 = obj5;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 11;
                                            obj7 = initializeStateCreate5.mo3520invokegIAlus(params1112, this);
                                            if (obj7 == coroutine_suspended) {
                                                obj8 = obj5;
                                                value6 = obj7;
                                                initializeSDK6 = initializeSDK5;
                                                if (!Result.m3610isFailureimpl(value6)) {
                                                    InitializeStateComplete initializeStateComplete9 = initializeSDK6.initializeStateComplete;
                                                    ResultKt.throwOnFailure(obj8);
                                                    InitializeStateComplete.Params params1113 = new InitializeStateComplete.Params((Configuration) obj8);
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.label = 13;
                                                    value7 = initializeStateComplete9.mo3520invokegIAlus(params1113, this);
                                                    break;
                                                } else {
                                                    initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                    this.L$0 = initializeSDK6;
                                                    this.L$1 = obj8;
                                                    this.label = 12;
                                                    if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                        InitializeStateComplete initializeStateComplete10 = initializeSDK6.initializeStateComplete;
                                                        ResultKt.throwOnFailure(obj8);
                                                        InitializeStateComplete.Params params1114 = new InitializeStateComplete.Params((Configuration) obj8);
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.label = 13;
                                                        value7 = initializeStateComplete10.mo3520invokegIAlus(params1114, this);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    } else {
                                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                                        this.L$0 = coroutineScope2;
                                        this.L$1 = initializeSDK5;
                                        this.L$2 = configuration3;
                                        this.L$3 = value3;
                                        this.label = 6;
                                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                            InitializeStateLoadCache initializeStateLoadCache6 = initializeSDK5.initializeStateLoadCache;
                                            ResultKt.throwOnFailure(value3);
                                            InitializeStateLoadCache.Params params1115 = new InitializeStateLoadCache.Params((Configuration) value3);
                                            this.L$0 = coroutineScope2;
                                            this.L$1 = initializeSDK5;
                                            this.L$2 = configuration3;
                                            this.L$3 = value3;
                                            this.label = 7;
                                            value4 = initializeStateLoadCache6.mo3520invokegIAlus(params1115, this);
                                            if (value4 != coroutine_suspended) {
                                                Object obj14 = value3;
                                                obj4 = value4;
                                                obj5 = obj14;
                                                CoroutineScope coroutineScope8 = coroutineScope2;
                                                if (Result.m3610isFailureimpl(obj4)) {
                                                    errorState2 = ErrorState.LoadCache;
                                                    thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                    this.L$0 = obj4;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 8;
                                                    if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                    }
                                                    thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                    if (thM3607exceptionOrNullimpl5 == null) {
                                                        throw new Exception(ErrorState.LoadCache.toString());
                                                    }
                                                    throw thM3607exceptionOrNullimpl5;
                                                }
                                                ResultKt.throwOnFailure(obj4);
                                                loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                                if (loadCacheResult.getHasHashMismatch()) {
                                                    if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                    }
                                                    InitializeStateLoadWeb initializeStateLoadWeb6 = initializeSDK5.initializeStateLoadWeb;
                                                    ResultKt.throwOnFailure(obj5);
                                                    InitializeStateLoadWeb.Params params1116 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj5;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.label = 9;
                                                    value5 = initializeStateLoadWeb6.mo3520invokegIAlus(params1116, this);
                                                    if (value5 == coroutine_suspended) {
                                                        obj6 = obj5;
                                                        if (Result.m3610isFailureimpl(value5)) {
                                                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                            this.L$0 = initializeSDK5;
                                                            this.L$1 = obj6;
                                                            this.L$2 = value5;
                                                            this.label = 10;
                                                            if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                            }
                                                        }
                                                        obj5 = obj6;
                                                        ResultKt.throwOnFailure(value5);
                                                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                    }
                                                } else {
                                                    webViewData = loadCacheResult.getWebViewData();
                                                    if (webViewData == null) {
                                                        throw new IllegalStateException("WebView is missing.".toString());
                                                    }
                                                }
                                                InitializeStateCreate initializeStateCreate6 = initializeSDK5.initializeStateCreate;
                                                ResultKt.throwOnFailure(obj5);
                                                InitializeStateCreate.Params params1117 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                                this.L$0 = initializeSDK5;
                                                this.L$1 = obj5;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 11;
                                                obj7 = initializeStateCreate6.mo3520invokegIAlus(params1117, this);
                                                if (obj7 == coroutine_suspended) {
                                                    obj8 = obj5;
                                                    value6 = obj7;
                                                    initializeSDK6 = initializeSDK5;
                                                    if (!Result.m3610isFailureimpl(value6)) {
                                                        InitializeStateComplete initializeStateComplete11 = initializeSDK6.initializeStateComplete;
                                                        ResultKt.throwOnFailure(obj8);
                                                        InitializeStateComplete.Params params1118 = new InitializeStateComplete.Params((Configuration) obj8);
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.label = 13;
                                                        value7 = initializeStateComplete11.mo3520invokegIAlus(params1118, this);
                                                        break;
                                                    } else {
                                                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                        this.L$0 = initializeSDK6;
                                                        this.L$1 = obj8;
                                                        this.label = 12;
                                                        if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                            InitializeStateComplete initializeStateComplete12 = initializeSDK6.initializeStateComplete;
                                                            ResultKt.throwOnFailure(obj8);
                                                            InitializeStateComplete.Params params1119 = new InitializeStateComplete.Params((Configuration) obj8);
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.label = 13;
                                                            value7 = initializeStateComplete12.mo3520invokegIAlus(params1119, this);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                errorState = ErrorState.ResetWebApp;
                                thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(value2);
                                this.L$0 = value2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                                if (initializeSDK4.m3524executeErrorStateBWLJW6A(errorState, thM3607exceptionOrNullimpl2, configuration2, this) == coroutine_suspended) {
                                }
                                thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                                if (thM3607exceptionOrNullimpl3 == null) {
                                    throw new Exception(ErrorState.ResetWebApp.toString());
                                }
                                throw thM3607exceptionOrNullimpl3;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    initializeSDK3 = (InitializeSDK) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    value = ((Result) obj).getValue();
                    thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(value);
                    if (thM3607exceptionOrNullimpl != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3607exceptionOrNullimpl.getMessage());
                    }
                    configuration = new Configuration();
                    if (Result.m3610isFailureimpl(value)) {
                        value = configuration;
                    }
                    configuration2 = (Configuration) value;
                    InitializeStateReset initializeStateReset4 = initializeSDK3.initializeStateReset;
                    InitializeStateReset.Params params1120 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration2;
                    this.label = 3;
                    obj3 = initializeStateReset4.mo3520invokegIAlus(params1120, this);
                    if (obj3 == coroutine_suspended) {
                        initializeSDK4 = initializeSDK3;
                        value2 = obj3;
                        if (!Result.m3610isFailureimpl(value2)) {
                            InitializeStateConfig initializeStateConfig4 = initializeSDK4.initializeStateConfig;
                            InitializeStateConfig.Params params1121 = new InitializeStateConfig.Params(configuration2);
                            this.L$0 = coroutineScope;
                            this.L$1 = initializeSDK4;
                            this.L$2 = configuration2;
                            this.label = 5;
                            value3 = initializeStateConfig4.mo3520invokegIAlus(params1121, this);
                            if (value3 != coroutine_suspended) {
                                coroutineScope2 = coroutineScope;
                                initializeSDK5 = initializeSDK4;
                                configuration3 = configuration2;
                                if (Result.m3610isFailureimpl(value3)) {
                                    InitializeStateLoadCache initializeStateLoadCache7 = initializeSDK5.initializeStateLoadCache;
                                    ResultKt.throwOnFailure(value3);
                                    InitializeStateLoadCache.Params params11110 = new InitializeStateLoadCache.Params((Configuration) value3);
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = initializeSDK5;
                                    this.L$2 = configuration3;
                                    this.L$3 = value3;
                                    this.label = 7;
                                    value4 = initializeStateLoadCache7.mo3520invokegIAlus(params11110, this);
                                    if (value4 != coroutine_suspended) {
                                        Object obj15 = value3;
                                        obj4 = value4;
                                        obj5 = obj15;
                                        CoroutineScope coroutineScope9 = coroutineScope2;
                                        if (Result.m3610isFailureimpl(obj4)) {
                                            errorState2 = ErrorState.LoadCache;
                                            thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                            this.L$0 = obj4;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 8;
                                            if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                            }
                                            thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                            if (thM3607exceptionOrNullimpl5 == null) {
                                                throw new Exception(ErrorState.LoadCache.toString());
                                            }
                                            throw thM3607exceptionOrNullimpl5;
                                        }
                                        ResultKt.throwOnFailure(obj4);
                                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                        if (loadCacheResult.getHasHashMismatch()) {
                                            if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                            }
                                            InitializeStateLoadWeb initializeStateLoadWeb7 = initializeSDK5.initializeStateLoadWeb;
                                            ResultKt.throwOnFailure(obj5);
                                            InitializeStateLoadWeb.Params params11111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                            this.L$0 = initializeSDK5;
                                            this.L$1 = obj5;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 9;
                                            value5 = initializeStateLoadWeb7.mo3520invokegIAlus(params11111, this);
                                            if (value5 == coroutine_suspended) {
                                                obj6 = obj5;
                                                if (Result.m3610isFailureimpl(value5)) {
                                                    initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj6;
                                                    this.L$2 = value5;
                                                    this.label = 10;
                                                    if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                    }
                                                }
                                                obj5 = obj6;
                                                ResultKt.throwOnFailure(value5);
                                                webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                            }
                                        } else {
                                            webViewData = loadCacheResult.getWebViewData();
                                            if (webViewData == null) {
                                                throw new IllegalStateException("WebView is missing.".toString());
                                            }
                                        }
                                        InitializeStateCreate initializeStateCreate7 = initializeSDK5.initializeStateCreate;
                                        ResultKt.throwOnFailure(obj5);
                                        InitializeStateCreate.Params params11112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                        this.L$0 = initializeSDK5;
                                        this.L$1 = obj5;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 11;
                                        obj7 = initializeStateCreate7.mo3520invokegIAlus(params11112, this);
                                        if (obj7 == coroutine_suspended) {
                                            obj8 = obj5;
                                            value6 = obj7;
                                            initializeSDK6 = initializeSDK5;
                                            if (!Result.m3610isFailureimpl(value6)) {
                                                InitializeStateComplete initializeStateComplete13 = initializeSDK6.initializeStateComplete;
                                                ResultKt.throwOnFailure(obj8);
                                                InitializeStateComplete.Params params11113 = new InitializeStateComplete.Params((Configuration) obj8);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.label = 13;
                                                value7 = initializeStateComplete13.mo3520invokegIAlus(params11113, this);
                                                break;
                                            } else {
                                                initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                this.L$0 = initializeSDK6;
                                                this.L$1 = obj8;
                                                this.label = 12;
                                                if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                    InitializeStateComplete initializeStateComplete14 = initializeSDK6.initializeStateComplete;
                                                    ResultKt.throwOnFailure(obj8);
                                                    InitializeStateComplete.Params params11114 = new InitializeStateComplete.Params((Configuration) obj8);
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.label = 13;
                                                    value7 = initializeStateComplete14.mo3520invokegIAlus(params11114, this);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                } else {
                                    initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = initializeSDK5;
                                    this.L$2 = configuration3;
                                    this.L$3 = value3;
                                    this.label = 6;
                                    if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                        InitializeStateLoadCache initializeStateLoadCache8 = initializeSDK5.initializeStateLoadCache;
                                        ResultKt.throwOnFailure(value3);
                                        InitializeStateLoadCache.Params params11115 = new InitializeStateLoadCache.Params((Configuration) value3);
                                        this.L$0 = coroutineScope2;
                                        this.L$1 = initializeSDK5;
                                        this.L$2 = configuration3;
                                        this.L$3 = value3;
                                        this.label = 7;
                                        value4 = initializeStateLoadCache8.mo3520invokegIAlus(params11115, this);
                                        if (value4 != coroutine_suspended) {
                                            Object obj16 = value3;
                                            obj4 = value4;
                                            obj5 = obj16;
                                            CoroutineScope coroutineScope10 = coroutineScope2;
                                            if (Result.m3610isFailureimpl(obj4)) {
                                                errorState2 = ErrorState.LoadCache;
                                                thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                                this.L$0 = obj4;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 8;
                                                if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                                }
                                                thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                                if (thM3607exceptionOrNullimpl5 == null) {
                                                    throw new Exception(ErrorState.LoadCache.toString());
                                                }
                                                throw thM3607exceptionOrNullimpl5;
                                            }
                                            ResultKt.throwOnFailure(obj4);
                                            loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                            if (loadCacheResult.getHasHashMismatch()) {
                                                if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                                }
                                                InitializeStateLoadWeb initializeStateLoadWeb8 = initializeSDK5.initializeStateLoadWeb;
                                                ResultKt.throwOnFailure(obj5);
                                                InitializeStateLoadWeb.Params params11116 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                                this.L$0 = initializeSDK5;
                                                this.L$1 = obj5;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 9;
                                                value5 = initializeStateLoadWeb8.mo3520invokegIAlus(params11116, this);
                                                if (value5 == coroutine_suspended) {
                                                    obj6 = obj5;
                                                    if (Result.m3610isFailureimpl(value5)) {
                                                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                        this.L$0 = initializeSDK5;
                                                        this.L$1 = obj6;
                                                        this.L$2 = value5;
                                                        this.label = 10;
                                                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                        }
                                                    }
                                                    obj5 = obj6;
                                                    ResultKt.throwOnFailure(value5);
                                                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                                }
                                            } else {
                                                webViewData = loadCacheResult.getWebViewData();
                                                if (webViewData == null) {
                                                    throw new IllegalStateException("WebView is missing.".toString());
                                                }
                                            }
                                            InitializeStateCreate initializeStateCreate8 = initializeSDK5.initializeStateCreate;
                                            ResultKt.throwOnFailure(obj5);
                                            InitializeStateCreate.Params params11117 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                            this.L$0 = initializeSDK5;
                                            this.L$1 = obj5;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 11;
                                            obj7 = initializeStateCreate8.mo3520invokegIAlus(params11117, this);
                                            if (obj7 == coroutine_suspended) {
                                                obj8 = obj5;
                                                value6 = obj7;
                                                initializeSDK6 = initializeSDK5;
                                                if (!Result.m3610isFailureimpl(value6)) {
                                                    InitializeStateComplete initializeStateComplete15 = initializeSDK6.initializeStateComplete;
                                                    ResultKt.throwOnFailure(obj8);
                                                    InitializeStateComplete.Params params11118 = new InitializeStateComplete.Params((Configuration) obj8);
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.label = 13;
                                                    value7 = initializeStateComplete15.mo3520invokegIAlus(params11118, this);
                                                    break;
                                                } else {
                                                    initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                    this.L$0 = initializeSDK6;
                                                    this.L$1 = obj8;
                                                    this.label = 12;
                                                    if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                        InitializeStateComplete initializeStateComplete16 = initializeSDK6.initializeStateComplete;
                                                        ResultKt.throwOnFailure(obj8);
                                                        InitializeStateComplete.Params params11119 = new InitializeStateComplete.Params((Configuration) obj8);
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.label = 13;
                                                        value7 = initializeStateComplete16.mo3520invokegIAlus(params11119, this);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            errorState = ErrorState.ResetWebApp;
                            thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(value2);
                            this.L$0 = value2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (initializeSDK4.m3524executeErrorStateBWLJW6A(errorState, thM3607exceptionOrNullimpl2, configuration2, this) == coroutine_suspended) {
                            }
                            thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                            if (thM3607exceptionOrNullimpl3 == null) {
                                throw new Exception(ErrorState.ResetWebApp.toString());
                            }
                            throw thM3607exceptionOrNullimpl3;
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    Configuration configuration4 = (Configuration) this.L$2;
                    initializeSDK4 = (InitializeSDK) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    value2 = ((Result) obj).getValue();
                    configuration2 = configuration4;
                    if (!Result.m3610isFailureimpl(value2)) {
                        InitializeStateConfig initializeStateConfig5 = initializeSDK4.initializeStateConfig;
                        InitializeStateConfig.Params params1122 = new InitializeStateConfig.Params(configuration2);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration2;
                        this.label = 5;
                        value3 = initializeStateConfig5.mo3520invokegIAlus(params1122, this);
                        if (value3 != coroutine_suspended) {
                            coroutineScope2 = coroutineScope;
                            initializeSDK5 = initializeSDK4;
                            configuration3 = configuration2;
                            if (Result.m3610isFailureimpl(value3)) {
                                InitializeStateLoadCache initializeStateLoadCache9 = initializeSDK5.initializeStateLoadCache;
                                ResultKt.throwOnFailure(value3);
                                InitializeStateLoadCache.Params params111110 = new InitializeStateLoadCache.Params((Configuration) value3);
                                this.L$0 = coroutineScope2;
                                this.L$1 = initializeSDK5;
                                this.L$2 = configuration3;
                                this.L$3 = value3;
                                this.label = 7;
                                value4 = initializeStateLoadCache9.mo3520invokegIAlus(params111110, this);
                                if (value4 != coroutine_suspended) {
                                    Object obj17 = value3;
                                    obj4 = value4;
                                    obj5 = obj17;
                                    CoroutineScope coroutineScope11 = coroutineScope2;
                                    if (Result.m3610isFailureimpl(obj4)) {
                                        errorState2 = ErrorState.LoadCache;
                                        thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                        this.L$0 = obj4;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 8;
                                        if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                        }
                                        thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                        if (thM3607exceptionOrNullimpl5 == null) {
                                            throw new Exception(ErrorState.LoadCache.toString());
                                        }
                                        throw thM3607exceptionOrNullimpl5;
                                    }
                                    ResultKt.throwOnFailure(obj4);
                                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                    if (loadCacheResult.getHasHashMismatch()) {
                                        if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                        }
                                        InitializeStateLoadWeb initializeStateLoadWeb9 = initializeSDK5.initializeStateLoadWeb;
                                        ResultKt.throwOnFailure(obj5);
                                        InitializeStateLoadWeb.Params params111111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                        this.L$0 = initializeSDK5;
                                        this.L$1 = obj5;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 9;
                                        value5 = initializeStateLoadWeb9.mo3520invokegIAlus(params111111, this);
                                        if (value5 == coroutine_suspended) {
                                            obj6 = obj5;
                                            if (Result.m3610isFailureimpl(value5)) {
                                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                this.L$0 = initializeSDK5;
                                                this.L$1 = obj6;
                                                this.L$2 = value5;
                                                this.label = 10;
                                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                }
                                            }
                                            obj5 = obj6;
                                            ResultKt.throwOnFailure(value5);
                                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                        }
                                    } else {
                                        webViewData = loadCacheResult.getWebViewData();
                                        if (webViewData == null) {
                                            throw new IllegalStateException("WebView is missing.".toString());
                                        }
                                    }
                                    InitializeStateCreate initializeStateCreate9 = initializeSDK5.initializeStateCreate;
                                    ResultKt.throwOnFailure(obj5);
                                    InitializeStateCreate.Params params111112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                    this.L$0 = initializeSDK5;
                                    this.L$1 = obj5;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    obj7 = initializeStateCreate9.mo3520invokegIAlus(params111112, this);
                                    if (obj7 == coroutine_suspended) {
                                        obj8 = obj5;
                                        value6 = obj7;
                                        initializeSDK6 = initializeSDK5;
                                        if (!Result.m3610isFailureimpl(value6)) {
                                            InitializeStateComplete initializeStateComplete17 = initializeSDK6.initializeStateComplete;
                                            ResultKt.throwOnFailure(obj8);
                                            InitializeStateComplete.Params params111113 = new InitializeStateComplete.Params((Configuration) obj8);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.label = 13;
                                            value7 = initializeStateComplete17.mo3520invokegIAlus(params111113, this);
                                            break;
                                        } else {
                                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                            this.L$0 = initializeSDK6;
                                            this.L$1 = obj8;
                                            this.label = 12;
                                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                InitializeStateComplete initializeStateComplete18 = initializeSDK6.initializeStateComplete;
                                                ResultKt.throwOnFailure(obj8);
                                                InitializeStateComplete.Params params111114 = new InitializeStateComplete.Params((Configuration) obj8);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.label = 13;
                                                value7 = initializeStateComplete18.mo3520invokegIAlus(params111114, this);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else {
                                initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                                this.L$0 = coroutineScope2;
                                this.L$1 = initializeSDK5;
                                this.L$2 = configuration3;
                                this.L$3 = value3;
                                this.label = 6;
                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                    InitializeStateLoadCache initializeStateLoadCache10 = initializeSDK5.initializeStateLoadCache;
                                    ResultKt.throwOnFailure(value3);
                                    InitializeStateLoadCache.Params params111115 = new InitializeStateLoadCache.Params((Configuration) value3);
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = initializeSDK5;
                                    this.L$2 = configuration3;
                                    this.L$3 = value3;
                                    this.label = 7;
                                    value4 = initializeStateLoadCache10.mo3520invokegIAlus(params111115, this);
                                    if (value4 != coroutine_suspended) {
                                        Object obj18 = value3;
                                        obj4 = value4;
                                        obj5 = obj18;
                                        CoroutineScope coroutineScope12 = coroutineScope2;
                                        if (Result.m3610isFailureimpl(obj4)) {
                                            errorState2 = ErrorState.LoadCache;
                                            thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                            this.L$0 = obj4;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 8;
                                            if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                            }
                                            thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                            if (thM3607exceptionOrNullimpl5 == null) {
                                                throw new Exception(ErrorState.LoadCache.toString());
                                            }
                                            throw thM3607exceptionOrNullimpl5;
                                        }
                                        ResultKt.throwOnFailure(obj4);
                                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                        if (loadCacheResult.getHasHashMismatch()) {
                                            if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                            }
                                            InitializeStateLoadWeb initializeStateLoadWeb10 = initializeSDK5.initializeStateLoadWeb;
                                            ResultKt.throwOnFailure(obj5);
                                            InitializeStateLoadWeb.Params params111116 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                            this.L$0 = initializeSDK5;
                                            this.L$1 = obj5;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 9;
                                            value5 = initializeStateLoadWeb10.mo3520invokegIAlus(params111116, this);
                                            if (value5 == coroutine_suspended) {
                                                obj6 = obj5;
                                                if (Result.m3610isFailureimpl(value5)) {
                                                    initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                                    this.L$0 = initializeSDK5;
                                                    this.L$1 = obj6;
                                                    this.L$2 = value5;
                                                    this.label = 10;
                                                    if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                                    }
                                                }
                                                obj5 = obj6;
                                                ResultKt.throwOnFailure(value5);
                                                webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                            }
                                        } else {
                                            webViewData = loadCacheResult.getWebViewData();
                                            if (webViewData == null) {
                                                throw new IllegalStateException("WebView is missing.".toString());
                                            }
                                        }
                                        InitializeStateCreate initializeStateCreate10 = initializeSDK5.initializeStateCreate;
                                        ResultKt.throwOnFailure(obj5);
                                        InitializeStateCreate.Params params111117 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                        this.L$0 = initializeSDK5;
                                        this.L$1 = obj5;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 11;
                                        obj7 = initializeStateCreate10.mo3520invokegIAlus(params111117, this);
                                        if (obj7 == coroutine_suspended) {
                                            obj8 = obj5;
                                            value6 = obj7;
                                            initializeSDK6 = initializeSDK5;
                                            if (!Result.m3610isFailureimpl(value6)) {
                                                InitializeStateComplete initializeStateComplete19 = initializeSDK6.initializeStateComplete;
                                                ResultKt.throwOnFailure(obj8);
                                                InitializeStateComplete.Params params111118 = new InitializeStateComplete.Params((Configuration) obj8);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.label = 13;
                                                value7 = initializeStateComplete19.mo3520invokegIAlus(params111118, this);
                                                break;
                                            } else {
                                                initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                                this.L$0 = initializeSDK6;
                                                this.L$1 = obj8;
                                                this.label = 12;
                                                if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                                    InitializeStateComplete initializeStateComplete110 = initializeSDK6.initializeStateComplete;
                                                    ResultKt.throwOnFailure(obj8);
                                                    InitializeStateComplete.Params params111119 = new InitializeStateComplete.Params((Configuration) obj8);
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.label = 13;
                                                    value7 = initializeStateComplete110.mo3520invokegIAlus(params111119, this);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        errorState = ErrorState.ResetWebApp;
                        thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(value2);
                        this.L$0 = value2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (initializeSDK4.m3524executeErrorStateBWLJW6A(errorState, thM3607exceptionOrNullimpl2, configuration2, this) == coroutine_suspended) {
                        }
                        thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                        if (thM3607exceptionOrNullimpl3 == null) {
                            throw new Exception(ErrorState.ResetWebApp.toString());
                        }
                        throw thM3607exceptionOrNullimpl3;
                    }
                    return coroutine_suspended;
                case 4:
                    value2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                    thM3607exceptionOrNullimpl3 = Result.m3607exceptionOrNullimpl(value2);
                    if (thM3607exceptionOrNullimpl3 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3607exceptionOrNullimpl3;
                case 5:
                    Configuration configuration5 = (Configuration) this.L$2;
                    InitializeSDK initializeSDK7 = (InitializeSDK) this.L$1;
                    CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope2 = coroutineScope13;
                    initializeSDK5 = initializeSDK7;
                    configuration3 = configuration5;
                    value3 = ((Result) obj).getValue();
                    if (Result.m3610isFailureimpl(value3)) {
                        InitializeStateLoadCache initializeStateLoadCache11 = initializeSDK5.initializeStateLoadCache;
                        ResultKt.throwOnFailure(value3);
                        InitializeStateLoadCache.Params params1111110 = new InitializeStateLoadCache.Params((Configuration) value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK5;
                        this.L$2 = configuration3;
                        this.L$3 = value3;
                        this.label = 7;
                        value4 = initializeStateLoadCache11.mo3520invokegIAlus(params1111110, this);
                        if (value4 != coroutine_suspended) {
                            Object obj19 = value3;
                            obj4 = value4;
                            obj5 = obj19;
                            CoroutineScope coroutineScope14 = coroutineScope2;
                            if (Result.m3610isFailureimpl(obj4)) {
                                errorState2 = ErrorState.LoadCache;
                                thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                this.L$0 = obj4;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 8;
                                if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                }
                                thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                if (thM3607exceptionOrNullimpl5 == null) {
                                    throw new Exception(ErrorState.LoadCache.toString());
                                }
                                throw thM3607exceptionOrNullimpl5;
                            }
                            ResultKt.throwOnFailure(obj4);
                            loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                            if (loadCacheResult.getHasHashMismatch()) {
                                if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                }
                                InitializeStateLoadWeb initializeStateLoadWeb11 = initializeSDK5.initializeStateLoadWeb;
                                ResultKt.throwOnFailure(obj5);
                                InitializeStateLoadWeb.Params params1111111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                this.L$0 = initializeSDK5;
                                this.L$1 = obj5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 9;
                                value5 = initializeStateLoadWeb11.mo3520invokegIAlus(params1111111, this);
                                if (value5 == coroutine_suspended) {
                                    obj6 = obj5;
                                    if (Result.m3610isFailureimpl(value5)) {
                                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                        this.L$0 = initializeSDK5;
                                        this.L$1 = obj6;
                                        this.L$2 = value5;
                                        this.label = 10;
                                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                        }
                                    }
                                    obj5 = obj6;
                                    ResultKt.throwOnFailure(value5);
                                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                }
                            } else {
                                webViewData = loadCacheResult.getWebViewData();
                                if (webViewData == null) {
                                    throw new IllegalStateException("WebView is missing.".toString());
                                }
                            }
                            InitializeStateCreate initializeStateCreate11 = initializeSDK5.initializeStateCreate;
                            ResultKt.throwOnFailure(obj5);
                            InitializeStateCreate.Params params1111112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                            this.L$0 = initializeSDK5;
                            this.L$1 = obj5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 11;
                            obj7 = initializeStateCreate11.mo3520invokegIAlus(params1111112, this);
                            if (obj7 == coroutine_suspended) {
                                obj8 = obj5;
                                value6 = obj7;
                                initializeSDK6 = initializeSDK5;
                                if (!Result.m3610isFailureimpl(value6)) {
                                    InitializeStateComplete initializeStateComplete111 = initializeSDK6.initializeStateComplete;
                                    ResultKt.throwOnFailure(obj8);
                                    InitializeStateComplete.Params params1111113 = new InitializeStateComplete.Params((Configuration) obj8);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 13;
                                    value7 = initializeStateComplete111.mo3520invokegIAlus(params1111113, this);
                                    break;
                                } else {
                                    initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                    this.L$0 = initializeSDK6;
                                    this.L$1 = obj8;
                                    this.label = 12;
                                    if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                        InitializeStateComplete initializeStateComplete112 = initializeSDK6.initializeStateComplete;
                                        ResultKt.throwOnFailure(obj8);
                                        InitializeStateComplete.Params params1111114 = new InitializeStateComplete.Params((Configuration) obj8);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.label = 13;
                                        value7 = initializeStateComplete112.mo3520invokegIAlus(params1111114, this);
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK5;
                        this.L$2 = configuration3;
                        this.L$3 = value3;
                        this.label = 6;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                            InitializeStateLoadCache initializeStateLoadCache12 = initializeSDK5.initializeStateLoadCache;
                            ResultKt.throwOnFailure(value3);
                            InitializeStateLoadCache.Params params1111115 = new InitializeStateLoadCache.Params((Configuration) value3);
                            this.L$0 = coroutineScope2;
                            this.L$1 = initializeSDK5;
                            this.L$2 = configuration3;
                            this.L$3 = value3;
                            this.label = 7;
                            value4 = initializeStateLoadCache12.mo3520invokegIAlus(params1111115, this);
                            if (value4 != coroutine_suspended) {
                                Object obj110 = value3;
                                obj4 = value4;
                                obj5 = obj110;
                                CoroutineScope coroutineScope15 = coroutineScope2;
                                if (Result.m3610isFailureimpl(obj4)) {
                                    errorState2 = ErrorState.LoadCache;
                                    thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                                    this.L$0 = obj4;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 8;
                                    if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                                    }
                                    thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                                    if (thM3607exceptionOrNullimpl5 == null) {
                                        throw new Exception(ErrorState.LoadCache.toString());
                                    }
                                    throw thM3607exceptionOrNullimpl5;
                                }
                                ResultKt.throwOnFailure(obj4);
                                loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                                if (loadCacheResult.getHasHashMismatch()) {
                                    if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                                    }
                                    InitializeStateLoadWeb initializeStateLoadWeb12 = initializeSDK5.initializeStateLoadWeb;
                                    ResultKt.throwOnFailure(obj5);
                                    InitializeStateLoadWeb.Params params1111116 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                    this.L$0 = initializeSDK5;
                                    this.L$1 = obj5;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 9;
                                    value5 = initializeStateLoadWeb12.mo3520invokegIAlus(params1111116, this);
                                    if (value5 == coroutine_suspended) {
                                        obj6 = obj5;
                                        if (Result.m3610isFailureimpl(value5)) {
                                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                            this.L$0 = initializeSDK5;
                                            this.L$1 = obj6;
                                            this.L$2 = value5;
                                            this.label = 10;
                                            if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                            }
                                        }
                                        obj5 = obj6;
                                        ResultKt.throwOnFailure(value5);
                                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                                    }
                                } else {
                                    webViewData = loadCacheResult.getWebViewData();
                                    if (webViewData == null) {
                                        throw new IllegalStateException("WebView is missing.".toString());
                                    }
                                }
                                InitializeStateCreate initializeStateCreate12 = initializeSDK5.initializeStateCreate;
                                ResultKt.throwOnFailure(obj5);
                                InitializeStateCreate.Params params1111117 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                                this.L$0 = initializeSDK5;
                                this.L$1 = obj5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                obj7 = initializeStateCreate12.mo3520invokegIAlus(params1111117, this);
                                if (obj7 == coroutine_suspended) {
                                    obj8 = obj5;
                                    value6 = obj7;
                                    initializeSDK6 = initializeSDK5;
                                    if (!Result.m3610isFailureimpl(value6)) {
                                        InitializeStateComplete initializeStateComplete113 = initializeSDK6.initializeStateComplete;
                                        ResultKt.throwOnFailure(obj8);
                                        InitializeStateComplete.Params params1111118 = new InitializeStateComplete.Params((Configuration) obj8);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.label = 13;
                                        value7 = initializeStateComplete113.mo3520invokegIAlus(params1111118, this);
                                        break;
                                    } else {
                                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                        this.L$0 = initializeSDK6;
                                        this.L$1 = obj8;
                                        this.label = 12;
                                        if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                            InitializeStateComplete initializeStateComplete114 = initializeSDK6.initializeStateComplete;
                                            ResultKt.throwOnFailure(obj8);
                                            InitializeStateComplete.Params params1111119 = new InitializeStateComplete.Params((Configuration) obj8);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.label = 13;
                                            value7 = initializeStateComplete114.mo3520invokegIAlus(params1111119, this);
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 6:
                    value3 = this.L$3;
                    configuration3 = (Configuration) this.L$2;
                    initializeSDK5 = (InitializeSDK) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    InitializeStateLoadCache initializeStateLoadCache13 = initializeSDK5.initializeStateLoadCache;
                    ResultKt.throwOnFailure(value3);
                    InitializeStateLoadCache.Params params11111110 = new InitializeStateLoadCache.Params((Configuration) value3);
                    this.L$0 = coroutineScope2;
                    this.L$1 = initializeSDK5;
                    this.L$2 = configuration3;
                    this.L$3 = value3;
                    this.label = 7;
                    value4 = initializeStateLoadCache13.mo3520invokegIAlus(params11111110, this);
                    if (value4 != coroutine_suspended) {
                        Object obj111 = value3;
                        obj4 = value4;
                        obj5 = obj111;
                        CoroutineScope coroutineScope16 = coroutineScope2;
                        if (Result.m3610isFailureimpl(obj4)) {
                            errorState2 = ErrorState.LoadCache;
                            thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                            this.L$0 = obj4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                            }
                            thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                            if (thM3607exceptionOrNullimpl5 == null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw thM3607exceptionOrNullimpl5;
                        }
                        ResultKt.throwOnFailure(obj4);
                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            InitializeStateLoadWeb initializeStateLoadWeb13 = initializeSDK5.initializeStateLoadWeb;
                            ResultKt.throwOnFailure(obj5);
                            InitializeStateLoadWeb.Params params11111111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                            this.L$0 = initializeSDK5;
                            this.L$1 = obj5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 9;
                            value5 = initializeStateLoadWeb13.mo3520invokegIAlus(params11111111, this);
                            if (value5 == coroutine_suspended) {
                                obj6 = obj5;
                                if (Result.m3610isFailureimpl(value5)) {
                                    initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                    this.L$0 = initializeSDK5;
                                    this.L$1 = obj6;
                                    this.L$2 = value5;
                                    this.label = 10;
                                    if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                    }
                                }
                                obj5 = obj6;
                                ResultKt.throwOnFailure(value5);
                                webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                            }
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        InitializeStateCreate initializeStateCreate13 = initializeSDK5.initializeStateCreate;
                        ResultKt.throwOnFailure(obj5);
                        InitializeStateCreate.Params params11111112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        obj7 = initializeStateCreate13.mo3520invokegIAlus(params11111112, this);
                        if (obj7 == coroutine_suspended) {
                            obj8 = obj5;
                            value6 = obj7;
                            initializeSDK6 = initializeSDK5;
                            if (!Result.m3610isFailureimpl(value6)) {
                                InitializeStateComplete initializeStateComplete115 = initializeSDK6.initializeStateComplete;
                                ResultKt.throwOnFailure(obj8);
                                InitializeStateComplete.Params params11111113 = new InitializeStateComplete.Params((Configuration) obj8);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 13;
                                value7 = initializeStateComplete115.mo3520invokegIAlus(params11111113, this);
                                break;
                            } else {
                                initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                                this.L$0 = initializeSDK6;
                                this.L$1 = obj8;
                                this.label = 12;
                                if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                    InitializeStateComplete initializeStateComplete116 = initializeSDK6.initializeStateComplete;
                                    ResultKt.throwOnFailure(obj8);
                                    InitializeStateComplete.Params params11111114 = new InitializeStateComplete.Params((Configuration) obj8);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 13;
                                    value7 = initializeStateComplete116.mo3520invokegIAlus(params11111114, this);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    return coroutine_suspended;
                case 7:
                    value3 = this.L$3;
                    configuration3 = (Configuration) this.L$2;
                    initializeSDK5 = (InitializeSDK) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    value4 = ((Result) obj).getValue();
                    Object obj112 = value3;
                    obj4 = value4;
                    obj5 = obj112;
                    CoroutineScope coroutineScope17 = coroutineScope2;
                    if (Result.m3610isFailureimpl(obj4)) {
                        errorState2 = ErrorState.LoadCache;
                        thM3607exceptionOrNullimpl4 = Result.m3607exceptionOrNullimpl(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK5.m3524executeErrorStateBWLJW6A(errorState2, thM3607exceptionOrNullimpl4, configuration3, this) == coroutine_suspended) {
                        }
                        thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                        if (thM3607exceptionOrNullimpl5 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thM3607exceptionOrNullimpl5;
                    }
                    ResultKt.throwOnFailure(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (!configuration3.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb14 = initializeSDK5.initializeStateLoadWeb;
                        ResultKt.throwOnFailure(obj5);
                        InitializeStateLoadWeb.Params params11111115 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        value5 = initializeStateLoadWeb14.mo3520invokegIAlus(params11111115, this);
                        if (value5 == coroutine_suspended) {
                            obj6 = obj5;
                            if (Result.m3610isFailureimpl(value5)) {
                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                                this.L$0 = initializeSDK5;
                                this.L$1 = obj6;
                                this.L$2 = value5;
                                this.label = 10;
                                if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                }
                            }
                            obj5 = obj6;
                            ResultKt.throwOnFailure(value5);
                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                        }
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate14 = initializeSDK5.initializeStateCreate;
                    ResultKt.throwOnFailure(obj5);
                    InitializeStateCreate.Params params11111116 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK5;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    obj7 = initializeStateCreate14.mo3520invokegIAlus(params11111116, this);
                    if (obj7 == coroutine_suspended) {
                        obj8 = obj5;
                        value6 = obj7;
                        initializeSDK6 = initializeSDK5;
                        if (!Result.m3610isFailureimpl(value6)) {
                            InitializeStateComplete initializeStateComplete117 = initializeSDK6.initializeStateComplete;
                            ResultKt.throwOnFailure(obj8);
                            InitializeStateComplete.Params params11111117 = new InitializeStateComplete.Params((Configuration) obj8);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            value7 = initializeStateComplete117.mo3520invokegIAlus(params11111117, this);
                            break;
                        } else {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK6;
                            this.L$1 = obj8;
                            this.label = 12;
                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                InitializeStateComplete initializeStateComplete118 = initializeSDK6.initializeStateComplete;
                                ResultKt.throwOnFailure(obj8);
                                InitializeStateComplete.Params params11111118 = new InitializeStateComplete.Params((Configuration) obj8);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 13;
                                value7 = initializeStateComplete118.mo3520invokegIAlus(params11111118, this);
                                break;
                            }
                        }
                    }
                    break;
                    return coroutine_suspended;
                case 8:
                    obj4 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                    thM3607exceptionOrNullimpl5 = Result.m3607exceptionOrNullimpl(obj4);
                    if (thM3607exceptionOrNullimpl5 == null) {
                        throw new Exception(ErrorState.LoadCache.toString());
                    }
                    throw thM3607exceptionOrNullimpl5;
                case 9:
                    Object obj20 = this.L$1;
                    InitializeSDK initializeSDK8 = (InitializeSDK) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    initializeSDK5 = initializeSDK8;
                    obj6 = obj20;
                    value5 = ((Result) obj).getValue();
                    if (Result.m3610isFailureimpl(value5)) {
                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(value5);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj6;
                        this.L$2 = value5;
                        this.label = 10;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    obj5 = obj6;
                    ResultKt.throwOnFailure(value5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate15 = initializeSDK5.initializeStateCreate;
                    ResultKt.throwOnFailure(obj5);
                    InitializeStateCreate.Params params11111119 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK5;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    obj7 = initializeStateCreate15.mo3520invokegIAlus(params11111119, this);
                    if (obj7 == coroutine_suspended) {
                        obj8 = obj5;
                        value6 = obj7;
                        initializeSDK6 = initializeSDK5;
                        if (!Result.m3610isFailureimpl(value6)) {
                            InitializeStateComplete initializeStateComplete119 = initializeSDK6.initializeStateComplete;
                            ResultKt.throwOnFailure(obj8);
                            InitializeStateComplete.Params params111111110 = new InitializeStateComplete.Params((Configuration) obj8);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            value7 = initializeStateComplete119.mo3520invokegIAlus(params111111110, this);
                            break;
                        } else {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK6;
                            this.L$1 = obj8;
                            this.label = 12;
                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                InitializeStateComplete initializeStateComplete1110 = initializeSDK6.initializeStateComplete;
                                ResultKt.throwOnFailure(obj8);
                                InitializeStateComplete.Params params111111111 = new InitializeStateComplete.Params((Configuration) obj8);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 13;
                                value7 = initializeStateComplete1110.mo3520invokegIAlus(params111111111, this);
                                break;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 10:
                    value5 = this.L$2;
                    obj6 = this.L$1;
                    initializeSDK5 = (InitializeSDK) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj5 = obj6;
                    ResultKt.throwOnFailure(value5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) value5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate16 = initializeSDK5.initializeStateCreate;
                    ResultKt.throwOnFailure(obj5);
                    InitializeStateCreate.Params params111111112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK5;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    obj7 = initializeStateCreate16.mo3520invokegIAlus(params111111112, this);
                    if (obj7 == coroutine_suspended) {
                        obj8 = obj5;
                        value6 = obj7;
                        initializeSDK6 = initializeSDK5;
                        if (!Result.m3610isFailureimpl(value6)) {
                            InitializeStateComplete initializeStateComplete1111 = initializeSDK6.initializeStateComplete;
                            ResultKt.throwOnFailure(obj8);
                            InitializeStateComplete.Params params111111113 = new InitializeStateComplete.Params((Configuration) obj8);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            value7 = initializeStateComplete1111.mo3520invokegIAlus(params111111113, this);
                            break;
                        } else {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK6;
                            this.L$1 = obj8;
                            this.label = 12;
                            if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                                InitializeStateComplete initializeStateComplete1112 = initializeSDK6.initializeStateComplete;
                                ResultKt.throwOnFailure(obj8);
                                InitializeStateComplete.Params params111111114 = new InitializeStateComplete.Params((Configuration) obj8);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 13;
                                value7 = initializeStateComplete1112.mo3520invokegIAlus(params111111114, this);
                                break;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 11:
                    obj8 = this.L$1;
                    initializeSDK6 = (InitializeSDK) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    value6 = ((Result) obj).getValue();
                    if (!Result.m3610isFailureimpl(value6)) {
                        InitializeStateComplete initializeStateComplete1113 = initializeSDK6.initializeStateComplete;
                        ResultKt.throwOnFailure(obj8);
                        InitializeStateComplete.Params params111111115 = new InitializeStateComplete.Params((Configuration) obj8);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 13;
                        value7 = initializeStateComplete1113.mo3520invokegIAlus(params111111115, this);
                        break;
                    } else {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK6;
                        this.L$1 = obj8;
                        this.label = 12;
                        if (initializeSDK6.handleInitializationException(initializationExceptionOrThrow3, this) != coroutine_suspended) {
                            InitializeStateComplete initializeStateComplete1114 = initializeSDK6.initializeStateComplete;
                            ResultKt.throwOnFailure(obj8);
                            InitializeStateComplete.Params params111111116 = new InitializeStateComplete.Params((Configuration) obj8);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            value7 = initializeStateComplete1114.mo3520invokegIAlus(params111111116, this);
                            break;
                        }
                    }
                    return coroutine_suspended;
                case 12:
                    obj8 = this.L$1;
                    initializeSDK6 = (InitializeSDK) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    InitializeStateComplete initializeStateComplete1115 = initializeSDK6.initializeStateComplete;
                    ResultKt.throwOnFailure(obj8);
                    InitializeStateComplete.Params params111111117 = new InitializeStateComplete.Params((Configuration) obj8);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    value7 = initializeStateComplete1115.mo3520invokegIAlus(params111111117, this);
                    break;
                case 13:
                    ResultKt.throwOnFailure(obj);
                    value7 = ((Result) obj).getValue();
                    ResultKt.throwOnFailure(value7);
                    objM3604constructorimpl = Result.m3604constructorimpl(Unit.INSTANCE);
                    if (Result.m3611isSuccessimpl(objM3604constructorimpl)) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM3604constructorimpl = Result.m3604constructorimpl(objM3604constructorimpl);
                    } else {
                        Throwable thM3607exceptionOrNullimpl6 = Result.m3607exceptionOrNullimpl(objM3604constructorimpl);
                        if (thM3607exceptionOrNullimpl6 != null) {
                            Result.Companion companion3 = Result.INSTANCE;
                            objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl6));
                        }
                    }
                    return Result.m3603boximpl(objM3604constructorimpl);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
        }
    }
}
