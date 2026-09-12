package com.unity3d.services.core.domain.task;

import com.ironsource.InterfaceC0280i1;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, InterfaceC0280i1.d.b.b, InterfaceC0280i1.d.b.g}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", "config", "configurationLoader", "config", "config"}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
final class InitializeStateConfigWithLoader$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, Continuation<? super InitializeStateConfigWithLoader$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Configuration>> continuation) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01c0 A[Catch: all -> 0x022c, CancellationException -> 0x0259, TryCatch #6 {CancellationException -> 0x0259, all -> 0x022c, blocks: (B:8:0x001d, B:52:0x01f0, B:58:0x0221, B:46:0x01b6, B:48:0x01c0, B:53:0x01fa, B:54:0x020c, B:45:0x01ac, B:33:0x016a, B:35:0x0173, B:55:0x020d, B:56:0x021a, B:57:0x021b, B:32:0x0160, B:23:0x007e), top: B:80:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fa A[Catch: all -> 0x022c, CancellationException -> 0x0259, TryCatch #6 {CancellationException -> 0x0259, all -> 0x022c, blocks: (B:8:0x001d, B:52:0x01f0, B:58:0x0221, B:46:0x01b6, B:48:0x01c0, B:53:0x01fa, B:54:0x020c, B:45:0x01ac, B:33:0x016a, B:35:0x0173, B:55:0x020d, B:56:0x021a, B:57:0x021b, B:32:0x0160, B:23:0x007e), top: B:80:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:64:0x023d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0244  */
    /* JADX WARN: Code duplicated, block: B:67:0x024a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM3604constructorimpl;
        Throwable thM3607exceptionOrNullimpl;
        Ref.ObjectRef objectRef;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        InitializeStateConfigWithLoader.Params params;
        Ref.ObjectRef objectRef2;
        Object objM3604constructorimpl2;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        InitializeStateConfigWithLoader.Params params2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Object value;
        Object objM3604constructorimpl3;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        InitializeStateConfigWithLoader.Params params3;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader3;
        CoroutineDispatcher io;
        InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                InitializeStateConfigWithLoader initializeStateConfigWithLoader4 = this.this$0;
                InitializeStateConfigWithLoader.Params params4 = this.$params;
                Result.Companion companion = Result.INSTANCE;
                PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
                DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(initializeStateConfigWithLoader4.sdkMetricsSender);
                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                objectRef10.element = new ConfigurationLoader(new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), initializeStateConfigWithLoader4.sdkMetricsSender, (HttpClient) initializeStateConfigWithLoader4.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(HttpClient.class)));
                objectRef10.element = new PrivacyConfigurationLoader((IConfigurationLoader) objectRef10.element, new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage, (HttpClient) initializeStateConfigWithLoader4.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(HttpClient.class)));
                Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                objectRef11.element = new Configuration();
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    int maxRetries = params4.getConfig().getMaxRetries();
                    double retryScalingFactor = params4.getConfig().getRetryScalingFactor();
                    long retryDelay = params4.getConfig().getRetryDelay();
                    InitializationException initializationException = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), params4.getConfig());
                    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader4, objectRef10, objectRef11, null);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeStateConfigWithLoader4;
                    this.L$2 = params4;
                    this.L$3 = objectRef10;
                    this.L$4 = objectRef11;
                    this.label = 1;
                    if (TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) != coroutine_suspended) {
                        objectRef = objectRef11;
                        initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                        params = params4;
                        objectRef2 = objectRef10;
                    }
                } catch (Throwable th) {
                    th = th;
                    objectRef = objectRef11;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                    params = params4;
                    objectRef2 = objectRef10;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM3604constructorimpl2 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                objectRef = (Ref.ObjectRef) this.L$4;
                objectRef2 = (Ref.ObjectRef) this.L$3;
                params = (InitializeStateConfigWithLoader.Params) this.L$2;
                initializeStateConfigWithLoader = (InitializeStateConfigWithLoader) this.L$1;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion4 = Result.INSTANCE;
                    objM3604constructorimpl2 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i == 2) {
                    objectRef = (Ref.ObjectRef) this.L$4;
                    objectRef5 = (Ref.ObjectRef) this.L$3;
                    objectRef3 = (Ref.ObjectRef) this.L$2;
                    params2 = (InitializeStateConfigWithLoader.Params) this.L$1;
                    initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                        objM3604constructorimpl3 = Result.m3604constructorimpl(Result.m3603boximpl(value));
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion5 = Result.INSTANCE;
                        objM3604constructorimpl3 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                    }
                    objectRef6 = objectRef5;
                    objectRef7 = objectRef3;
                    params3 = params2;
                    initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                    if (Result.m3611isSuccessimpl(objM3604constructorimpl3)) {
                        InitializeEventsMetricSender.getInstance().onRetryConfig();
                        io = initializeStateConfigWithLoader3.dispatchers.getIo();
                        initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(objectRef7, objectRef6, initializeStateConfigWithLoader3, params3, null);
                        this.L$0 = objectRef6;
                        this.L$1 = objectRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(io, initializeStateConfigWithLoader$doWork$2$1$1, this) != coroutine_suspended) {
                            objectRef8 = objectRef;
                            objectRef9 = objectRef6;
                        }
                        return coroutine_suspended;
                    }
                    throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef8 = (Ref.ObjectRef) this.L$1;
                objectRef9 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Configuration configuration = (Configuration) objectRef9.element;
            Ref.ObjectRef objectRef12 = objectRef9;
            objectRef = objectRef8;
            objectRef4 = objectRef12;
            t = configuration;
            objectRef.element = t;
            objM3604constructorimpl = Result.m3604constructorimpl((Configuration) objectRef4.element);
            if (Result.m3611isSuccessimpl(objM3604constructorimpl)) {
                Result.Companion companion6 = Result.INSTANCE;
                objM3604constructorimpl = Result.m3604constructorimpl(objM3604constructorimpl);
            } else {
                thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objM3604constructorimpl);
                if (thM3607exceptionOrNullimpl != null) {
                    Result.Companion companion7 = Result.INSTANCE;
                    objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
                }
            }
            return Result.m3603boximpl(objM3604constructorimpl);
            objM3604constructorimpl2 = Result.m3604constructorimpl(Unit.INSTANCE);
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            params2 = params;
            objectRef3 = objectRef2;
            if (Result.m3610isFailureimpl(objM3604constructorimpl2)) {
                Throwable thM3607exceptionOrNullimpl2 = Result.m3607exceptionOrNullimpl(objM3604constructorimpl2);
                if (thM3607exceptionOrNullimpl2 instanceof AbortRetryException) {
                    throw new InitializationException(ErrorState.NetworkConfigRequest, (Exception) thM3607exceptionOrNullimpl2, params2.getConfig());
                }
                try {
                    Result.Companion companion8 = Result.INSTANCE;
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params5 = new InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = initializeStateConfigWithLoader2;
                    this.L$1 = params2;
                    this.L$2 = objectRef3;
                    this.L$3 = objectRef;
                    this.L$4 = objectRef;
                    this.label = 2;
                    value = initializeStateNetworkError.mo3520invokegIAlus(params5, this);
                    if (value != coroutine_suspended) {
                        objectRef5 = objectRef;
                        objM3604constructorimpl3 = Result.m3604constructorimpl(Result.m3603boximpl(value));
                        objectRef6 = objectRef5;
                        objectRef7 = objectRef3;
                        params3 = params2;
                        initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                        if (Result.m3611isSuccessimpl(objM3604constructorimpl3)) {
                            InitializeEventsMetricSender.getInstance().onRetryConfig();
                            io = initializeStateConfigWithLoader3.dispatchers.getIo();
                            initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(objectRef7, objectRef6, initializeStateConfigWithLoader3, params3, null);
                            this.L$0 = objectRef6;
                            this.L$1 = objectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 3;
                            if (BuildersKt.withContext(io, initializeStateConfigWithLoader$doWork$2$1$1, this) != coroutine_suspended) {
                                objectRef8 = objectRef;
                                objectRef9 = objectRef6;
                                Configuration configuration2 = (Configuration) objectRef9.element;
                                Ref.ObjectRef objectRef13 = objectRef9;
                                objectRef = objectRef8;
                                objectRef4 = objectRef13;
                                t = configuration2;
                            }
                        } else {
                            throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectRef5 = objectRef;
                    Result.Companion companion9 = Result.INSTANCE;
                    objM3604constructorimpl3 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                }
                return coroutine_suspended;
            }
            objectRef4 = objectRef;
            t = (Configuration) objectRef.element;
            objectRef.element = t;
            objM3604constructorimpl = Result.m3604constructorimpl((Configuration) objectRef4.element);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.INSTANCE;
            objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th5));
        }
        if (Result.m3611isSuccessimpl(objM3604constructorimpl)) {
            Result.Companion companion11 = Result.INSTANCE;
            objM3604constructorimpl = Result.m3604constructorimpl(objM3604constructorimpl);
        } else {
            thM3607exceptionOrNullimpl = Result.m3607exceptionOrNullimpl(objM3604constructorimpl);
            if (thM3607exceptionOrNullimpl != null) {
                Result.Companion companion12 = Result.INSTANCE;
                objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(thM3607exceptionOrNullimpl));
            }
        }
        return Result.m3603boximpl(objM3604constructorimpl);
    }
}
