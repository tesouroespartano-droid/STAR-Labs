package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C0198d4;
import com.ironsource.L2;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidLoad.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0002JC\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u001f\u001a\u00020 H\u0096Bø\u0001\u0000¢\u0006\u0002\u00101R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "handleGatewayException", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "incrementLoadRequestAdmCount", "", C0198d4.v, "incrementLoadRequestCount", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "context", "Landroid/content/Context;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", L2.u, "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidLoad(CoroutineDispatcher defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        Intrinsics.checkNotNullParameter(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(handleGatewayAdResponse, "handleGatewayAdResponse");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLoad.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {72, Base64.mimeLineLength, 93, 97, 136}, m = "invokeSuspend", n = {"$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", "$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoadResult>, Object> {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoadResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02c8 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:116:0x03b5, B:118:0x03bb, B:120:0x03c9, B:121:0x03de, B:122:0x03e7, B:125:0x03ec, B:126:0x03f1, B:94:0x026e, B:98:0x029c, B:100:0x02c8, B:102:0x02e4, B:104:0x034d, B:105:0x0359, B:107:0x0366, B:108:0x0377, B:109:0x037d, B:113:0x0397, B:93:0x0264, B:21:0x0058, B:79:0x0215, B:65:0x0172, B:69:0x01a0, B:64:0x0168, B:29:0x0088, B:50:0x011a, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f1, B:71:0x01d2, B:73:0x01f0, B:75:0x01f7, B:43:0x00c7), top: B:139:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x02e4 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:116:0x03b5, B:118:0x03bb, B:120:0x03c9, B:121:0x03de, B:122:0x03e7, B:125:0x03ec, B:126:0x03f1, B:94:0x026e, B:98:0x029c, B:100:0x02c8, B:102:0x02e4, B:104:0x034d, B:105:0x0359, B:107:0x0366, B:108:0x0377, B:109:0x037d, B:113:0x0397, B:93:0x0264, B:21:0x0058, B:79:0x0215, B:65:0x0172, B:69:0x01a0, B:64:0x0168, B:29:0x0088, B:50:0x011a, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f1, B:71:0x01d2, B:73:0x01f0, B:75:0x01f7, B:43:0x00c7), top: B:139:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x034d A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:116:0x03b5, B:118:0x03bb, B:120:0x03c9, B:121:0x03de, B:122:0x03e7, B:125:0x03ec, B:126:0x03f1, B:94:0x026e, B:98:0x029c, B:100:0x02c8, B:102:0x02e4, B:104:0x034d, B:105:0x0359, B:107:0x0366, B:108:0x0377, B:109:0x037d, B:113:0x0397, B:93:0x0264, B:21:0x0058, B:79:0x0215, B:65:0x0172, B:69:0x01a0, B:64:0x0168, B:29:0x0088, B:50:0x011a, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f1, B:71:0x01d2, B:73:0x01f0, B:75:0x01f7, B:43:0x00c7), top: B:139:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x0366 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:116:0x03b5, B:118:0x03bb, B:120:0x03c9, B:121:0x03de, B:122:0x03e7, B:125:0x03ec, B:126:0x03f1, B:94:0x026e, B:98:0x029c, B:100:0x02c8, B:102:0x02e4, B:104:0x034d, B:105:0x0359, B:107:0x0366, B:108:0x0377, B:109:0x037d, B:113:0x0397, B:93:0x0264, B:21:0x0058, B:79:0x0215, B:65:0x0172, B:69:0x01a0, B:64:0x0168, B:29:0x0088, B:50:0x011a, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f1, B:71:0x01d2, B:73:0x01f0, B:75:0x01f7, B:43:0x00c7), top: B:139:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0152  */
        /* JADX WARN: Code duplicated, block: B:67:0x019b  */
        /* JADX WARN: Code duplicated, block: B:68:0x019e  */
        /* JADX WARN: Code duplicated, block: B:85:0x024d  */
        /* JADX WARN: Code duplicated, block: B:96:0x0297  */
        /* JADX WARN: Code duplicated, block: B:97:0x029a  */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x03b2, code lost:
        
            if (r0 == r9) goto L115;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v3, types: [int] */
        /* JADX WARN: Type inference failed for: r12v4, types: [int] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20, types: [int] */
        /* JADX WARN: Type inference failed for: r3v23, types: [int] */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v29 */
        /* JADX WARN: Type inference failed for: r3v30 */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AdObject tmpAdObject;
            Object objInvoke;
            AdObject adObject;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
            Object objInvoke2;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
            ?? r12;
            AdObject adObject2;
            long jM5069markNowz9LOYto;
            long j;
            AdObject adObject3;
            ?? r3;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
            long j2;
            Object objRequest$default;
            Object objM3604constructorimpl;
            ?? r4;
            Object value;
            String str;
            AdResponseOuterClass.AdResponse response;
            ?? r13;
            long jM5069markNowz9LOYto2;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
            long j3;
            ?? r5;
            AdObject adObject4;
            long j4;
            Object objRequest$default2;
            Object objM3604constructorimpl2;
            ?? r6;
            Object objInvoke3;
            ?? r7;
            Object value2;
            String str2;
            UniversalResponseOuterClass.UniversalResponse universalResponse;
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse;
            AdResponseKt.Dsl dsl_create;
            ByteString adData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    if (!AndroidLoad.this.sessionRepository.isSdkInitialized()) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, false, 54, null);
                    }
                    boolean z = this.$bannerSize != null;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = z ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                    boolean zIsEmpty = this.$headerBiddingAdMarkup.getAdData().isEmpty();
                    boolean z2 = !zIsEmpty;
                    tmpAdObject = AndroidLoad.this.getTmpAdObject(this.$opportunityId, this.$placement, z2, diagnosticAdType5, this.$loadOptions);
                    boolean z3 = z2;
                    if (zIsEmpty) {
                        AndroidLoad.this.incrementLoadRequestCount(z);
                        this.L$0 = coroutineScope;
                        this.L$1 = diagnosticAdType5;
                        this.L$2 = tmpAdObject;
                        this.I$0 = z3 ? 1 : 0;
                        this.label = 1;
                        objInvoke2 = AndroidLoad.this.getAdRequest.invoke(this.$placement, this.$opportunityId, this.$bannerSize, this);
                        if (objInvoke2 != coroutine_suspended) {
                            diagnosticAdType2 = diagnosticAdType5;
                            r12 = z3;
                            adObject2 = tmpAdObject;
                            UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                            RequestPolicy requestPolicyInvoke = AndroidLoad.this.getRequestPolicy.invoke();
                            AndroidLoad androidLoad = AndroidLoad.this;
                            jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                            Result.Companion companion = Result.INSTANCE;
                            GatewayClient gatewayClient = androidLoad.gatewayClient;
                            OperationType operationType = OperationType.LOAD;
                            this.L$0 = diagnosticAdType2;
                            this.L$1 = adObject2;
                            this.L$2 = null;
                            this.I$0 = r12;
                            this.J$0 = jM5069markNowz9LOYto;
                            this.label = 2;
                            j = jM5069markNowz9LOYto;
                            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, this, 1, null);
                            if (objRequest$default != coroutine_suspended) {
                                adObject3 = adObject2;
                                r3 = r12;
                                diagnosticAdType3 = diagnosticAdType2;
                                j2 = j;
                                objM3604constructorimpl = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                                r4 = r3;
                                AdObject adObject5 = adObject3;
                                TimedValue timedValue = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j2), null);
                                AndroidLoad androidLoad2 = AndroidLoad.this;
                                value = ((Result) timedValue.component1()).getValue();
                                long duration = timedValue.getDuration();
                                SendDiagnosticEvent sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                                if (Result.m3611isSuccessimpl(value)) {
                                    str = "native_load_config_success_time";
                                } else {
                                    str = "native_load_config_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                                Object value3 = ((Result) timedValue.getValue()).getValue();
                                ResultKt.throwOnFailure(value3);
                                response = ((UniversalResponseOuterClass.UniversalResponse) value3).getPayload().getAdResponse();
                                r6 = r4;
                            }
                        }
                    } else {
                        AndroidLoad.this.incrementLoadRequestAdmCount(z);
                        GetAdPlayerConfigRequest getAdPlayerConfigRequest = AndroidLoad.this.getAdPlayerConfigRequest;
                        String str3 = this.$placement;
                        ByteString byteString = this.$opportunityId;
                        ByteString configurationToken = this.$headerBiddingAdMarkup.getConfigurationToken();
                        Intrinsics.checkNotNullExpressionValue(configurationToken, "headerBiddingAdMarkup.configurationToken");
                        InitializationResponseOuterClass.AdFormat adFormat = this.$bannerSize != null ? InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER : null;
                        this.L$0 = coroutineScope;
                        this.L$1 = diagnosticAdType5;
                        this.L$2 = tmpAdObject;
                        this.I$0 = z3 ? 1 : 0;
                        this.label = 3;
                        objInvoke = getAdPlayerConfigRequest.invoke(str3, byteString, configurationToken, adFormat, this);
                        if (objInvoke != coroutine_suspended) {
                            adObject = tmpAdObject;
                            diagnosticAdType = diagnosticAdType5;
                            r13 = z3;
                            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                            RequestPolicy requestPolicyInvoke2 = AndroidLoad.this.getRequestPolicy.invoke();
                            AndroidLoad androidLoad3 = AndroidLoad.this;
                            jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                            Result.Companion companion2 = Result.INSTANCE;
                            GatewayClient gatewayClient2 = androidLoad3.gatewayClient;
                            OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                            this.L$0 = diagnosticAdType;
                            this.L$1 = adObject;
                            this.L$2 = null;
                            this.I$0 = r13;
                            this.J$0 = jM5069markNowz9LOYto2;
                            this.label = 4;
                            diagnosticAdType4 = diagnosticAdType;
                            j3 = jM5069markNowz9LOYto2;
                            objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, this, 1, null);
                            if (objRequest$default2 != coroutine_suspended) {
                                r5 = r13;
                                adObject4 = adObject;
                                diagnosticAdType3 = diagnosticAdType4;
                                j4 = j3;
                                objM3604constructorimpl2 = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                                r7 = r5;
                                AdObject adObject6 = adObject4;
                                TimedValue timedValue2 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j4), null);
                                AndroidLoad androidLoad4 = AndroidLoad.this;
                                value2 = ((Result) timedValue2.component1()).getValue();
                                long duration2 = timedValue2.getDuration();
                                SendDiagnosticEvent sendDiagnosticEvent2 = androidLoad4.sendDiagnosticEvent;
                                if (Result.m3611isSuccessimpl(value2)) {
                                    str2 = "native_load_config_success_time";
                                } else {
                                    str2 = "native_load_config_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str2, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration2, DurationUnit.MILLISECONDS)), null, null, adObject6, null, 44, null);
                                Object value4 = ((Result) timedValue2.getValue()).getValue();
                                ResultKt.throwOnFailure(value4);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) value4;
                                if (universalResponse.hasError()) {
                                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                                }
                                adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                                HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup = this.$headerBiddingAdMarkup;
                                AdResponseKt.Dsl.Companion companion3 = AdResponseKt.Dsl.INSTANCE;
                                AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                                dsl_create = companion3._create(builderNewBuilder);
                                ByteString adData2 = headerBiddingAdMarkup.getAdData();
                                Intrinsics.checkNotNullExpressionValue(adData2, "headerBiddingAdMarkup.adData");
                                dsl_create.setAdData(adData2);
                                dsl_create.setAdDataVersion(headerBiddingAdMarkup.getAdDataVersion());
                                ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                                Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
                                dsl_create.setTrackingToken(trackingToken);
                                ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                                Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "response.impressionConfiguration");
                                dsl_create.setImpressionConfiguration(impressionConfiguration);
                                dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                                WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                                Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "response.webviewConfiguration");
                                dsl_create.setWebviewConfiguration(webviewConfiguration);
                                ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                                Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                                dsl_create.setAdDataRefreshToken(adDataRefreshToken);
                                if (adPlayerConfigResponse.hasError()) {
                                    ErrorOuterClass.Error error = adPlayerConfigResponse.getError();
                                    Intrinsics.checkNotNullExpressionValue(error, "response.error");
                                    dsl_create.setError(error);
                                }
                                adData = adPlayerConfigResponse.getAdData();
                                Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                                if (ByteStringsKt.isNotEmpty(adData)) {
                                    ByteString adData3 = adPlayerConfigResponse.getAdData();
                                    Intrinsics.checkNotNullExpressionValue(adData3, "response.adData");
                                    dsl_create.setAdData(adData3);
                                    dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                                }
                                response = dsl_create._build();
                                r6 = r7;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    int i2 = this.I$0;
                    tmpAdObject = (AdObject) this.L$2;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    r12 = i2;
                    diagnosticAdType2 = diagnosticAdType6;
                    objInvoke2 = obj;
                    adObject2 = tmpAdObject;
                    UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                    RequestPolicy requestPolicyInvoke3 = AndroidLoad.this.getRequestPolicy.invoke();
                    AndroidLoad androidLoad5 = AndroidLoad.this;
                    jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                    try {
                        Result.Companion companion4 = Result.INSTANCE;
                        GatewayClient gatewayClient3 = androidLoad5.gatewayClient;
                        OperationType operationType3 = OperationType.LOAD;
                        this.L$0 = diagnosticAdType2;
                        this.L$1 = adObject2;
                        this.L$2 = null;
                        this.I$0 = r12;
                        this.J$0 = jM5069markNowz9LOYto;
                        this.label = 2;
                        j = jM5069markNowz9LOYto;
                        try {
                            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient3, null, universalRequest3, requestPolicyInvoke3, operationType3, this, 1, null);
                            if (objRequest$default != coroutine_suspended) {
                                adObject3 = adObject2;
                                r3 = r12;
                                diagnosticAdType3 = diagnosticAdType2;
                                j2 = j;
                                objM3604constructorimpl = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                                r4 = r3;
                                AdObject adObject7 = adObject3;
                                TimedValue timedValue3 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j2), null);
                                AndroidLoad androidLoad6 = AndroidLoad.this;
                                value = ((Result) timedValue3.component1()).getValue();
                                long duration3 = timedValue3.getDuration();
                                SendDiagnosticEvent sendDiagnosticEvent3 = androidLoad6.sendDiagnosticEvent;
                                if (Result.m3611isSuccessimpl(value)) {
                                    str = "native_load_config_success_time";
                                } else {
                                    str = "native_load_config_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, str, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration3, DurationUnit.MILLISECONDS)), null, null, adObject7, null, 44, null);
                                Object value5 = ((Result) timedValue3.getValue()).getValue();
                                ResultKt.throwOnFailure(value5);
                                response = ((UniversalResponseOuterClass.UniversalResponse) value5).getPayload().getAdResponse();
                                r6 = r4;
                            }
                        } catch (Throwable th) {
                            th = th;
                            adObject3 = adObject2;
                            r3 = r12;
                            diagnosticAdType3 = diagnosticAdType2;
                            j2 = j;
                            Result.Companion companion5 = Result.INSTANCE;
                            objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                            r4 = r3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = jM5069markNowz9LOYto;
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    j2 = this.J$0;
                    r3 = this.I$0;
                    adObject3 = (AdObject) this.L$1;
                    diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objRequest$default = obj;
                        r3 = r3;
                        objM3604constructorimpl = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                        r4 = r3;
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion6 = Result.INSTANCE;
                        objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                        r4 = r3;
                    }
                    AdObject adObject8 = adObject3;
                    TimedValue timedValue4 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j2), null);
                    AndroidLoad androidLoad7 = AndroidLoad.this;
                    value = ((Result) timedValue4.component1()).getValue();
                    long duration4 = timedValue4.getDuration();
                    SendDiagnosticEvent sendDiagnosticEvent4 = androidLoad7.sendDiagnosticEvent;
                    if (Result.m3611isSuccessimpl(value)) {
                        str = "native_load_config_success_time";
                    } else {
                        str = "native_load_config_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration4, DurationUnit.MILLISECONDS)), null, null, adObject8, null, 44, null);
                    Object value6 = ((Result) timedValue4.getValue()).getValue();
                    ResultKt.throwOnFailure(value6);
                    response = ((UniversalResponseOuterClass.UniversalResponse) value6).getPayload().getAdResponse();
                    r6 = r4;
                } else {
                    if (i == 3) {
                        int i3 = this.I$0;
                        AdObject adObject9 = (AdObject) this.L$2;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                        ResultKt.throwOnFailure(obj);
                        r13 = i3;
                        adObject = adObject9;
                        diagnosticAdType = diagnosticAdType7;
                        objInvoke = obj;
                        UniversalRequestOuterClass.UniversalRequest universalRequest4 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke4 = AndroidLoad.this.getRequestPolicy.invoke();
                        AndroidLoad androidLoad8 = AndroidLoad.this;
                        jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                        try {
                            Result.Companion companion7 = Result.INSTANCE;
                            GatewayClient gatewayClient4 = androidLoad8.gatewayClient;
                            OperationType operationType4 = OperationType.LOAD_HEADER_BIDDING;
                            this.L$0 = diagnosticAdType;
                            this.L$1 = adObject;
                            this.L$2 = null;
                            this.I$0 = r13;
                            this.J$0 = jM5069markNowz9LOYto2;
                            this.label = 4;
                            diagnosticAdType4 = diagnosticAdType;
                            j3 = jM5069markNowz9LOYto2;
                            try {
                                objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient4, null, universalRequest4, requestPolicyInvoke4, operationType4, this, 1, null);
                                if (objRequest$default2 != coroutine_suspended) {
                                    r5 = r13;
                                    adObject4 = adObject;
                                    diagnosticAdType3 = diagnosticAdType4;
                                    j4 = j3;
                                    objM3604constructorimpl2 = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                                    r7 = r5;
                                    AdObject adObject10 = adObject4;
                                    TimedValue timedValue5 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j4), null);
                                    AndroidLoad androidLoad9 = AndroidLoad.this;
                                    value2 = ((Result) timedValue5.component1()).getValue();
                                    long duration5 = timedValue5.getDuration();
                                    SendDiagnosticEvent sendDiagnosticEvent5 = androidLoad9.sendDiagnosticEvent;
                                    if (Result.m3611isSuccessimpl(value2)) {
                                        str2 = "native_load_config_success_time";
                                    } else {
                                        str2 = "native_load_config_failure_time";
                                    }
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent5, str2, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration5, DurationUnit.MILLISECONDS)), null, null, adObject10, null, 44, null);
                                    Object value7 = ((Result) timedValue5.getValue()).getValue();
                                    ResultKt.throwOnFailure(value7);
                                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) value7;
                                    if (universalResponse.hasError()) {
                                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                                    }
                                    adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = this.$headerBiddingAdMarkup;
                                    AdResponseKt.Dsl.Companion companion8 = AdResponseKt.Dsl.INSTANCE;
                                    AdResponseOuterClass.AdResponse.Builder builderNewBuilder2 = AdResponseOuterClass.AdResponse.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                                    dsl_create = companion8._create(builderNewBuilder2);
                                    ByteString adData4 = headerBiddingAdMarkup2.getAdData();
                                    Intrinsics.checkNotNullExpressionValue(adData4, "headerBiddingAdMarkup.adData");
                                    dsl_create.setAdData(adData4);
                                    dsl_create.setAdDataVersion(headerBiddingAdMarkup2.getAdDataVersion());
                                    ByteString trackingToken2 = adPlayerConfigResponse.getTrackingToken();
                                    Intrinsics.checkNotNullExpressionValue(trackingToken2, "response.trackingToken");
                                    dsl_create.setTrackingToken(trackingToken2);
                                    ByteString impressionConfiguration2 = adPlayerConfigResponse.getImpressionConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(impressionConfiguration2, "response.impressionConfiguration");
                                    dsl_create.setImpressionConfiguration(impressionConfiguration2);
                                    dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                                    WebviewConfiguration.WebViewConfiguration webviewConfiguration2 = adPlayerConfigResponse.getWebviewConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(webviewConfiguration2, "response.webviewConfiguration");
                                    dsl_create.setWebviewConfiguration(webviewConfiguration2);
                                    ByteString adDataRefreshToken2 = adPlayerConfigResponse.getAdDataRefreshToken();
                                    Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "response.adDataRefreshToken");
                                    dsl_create.setAdDataRefreshToken(adDataRefreshToken2);
                                    if (adPlayerConfigResponse.hasError()) {
                                        ErrorOuterClass.Error error2 = adPlayerConfigResponse.getError();
                                        Intrinsics.checkNotNullExpressionValue(error2, "response.error");
                                        dsl_create.setError(error2);
                                    }
                                    adData = adPlayerConfigResponse.getAdData();
                                    Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                                    if (ByteStringsKt.isNotEmpty(adData)) {
                                        ByteString adData5 = adPlayerConfigResponse.getAdData();
                                        Intrinsics.checkNotNullExpressionValue(adData5, "response.adData");
                                        dsl_create.setAdData(adData5);
                                        dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                                    }
                                    response = dsl_create._build();
                                    r6 = r7;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = r13;
                                adObject4 = adObject;
                                diagnosticAdType3 = diagnosticAdType4;
                                j4 = j3;
                                Result.Companion companion9 = Result.INSTANCE;
                                objM3604constructorimpl2 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                                r7 = r5;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            diagnosticAdType4 = diagnosticAdType;
                            j3 = jM5069markNowz9LOYto2;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 4) {
                        j4 = this.J$0;
                        r5 = this.I$0;
                        adObject4 = (AdObject) this.L$1;
                        diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objRequest$default2 = obj;
                            r5 = r5;
                            objM3604constructorimpl2 = Result.m3604constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                            r7 = r5;
                        } catch (Throwable th6) {
                            th = th6;
                            Result.Companion companion10 = Result.INSTANCE;
                            objM3604constructorimpl2 = Result.m3604constructorimpl(ResultKt.createFailure(th));
                            r7 = r5;
                        }
                        AdObject adObject11 = adObject4;
                        TimedValue timedValue6 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j4), null);
                        AndroidLoad androidLoad10 = AndroidLoad.this;
                        value2 = ((Result) timedValue6.component1()).getValue();
                        long duration6 = timedValue6.getDuration();
                        SendDiagnosticEvent sendDiagnosticEvent6 = androidLoad10.sendDiagnosticEvent;
                        if (Result.m3611isSuccessimpl(value2)) {
                            str2 = "native_load_config_success_time";
                        } else {
                            str2 = "native_load_config_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent6, str2, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration6, DurationUnit.MILLISECONDS)), null, null, adObject11, null, 44, null);
                        Object value8 = ((Result) timedValue6.getValue()).getValue();
                        ResultKt.throwOnFailure(value8);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value8;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion11 = AdResponseKt.Dsl.INSTANCE;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder3 = AdResponseOuterClass.AdResponse.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
                        dsl_create = companion11._create(builderNewBuilder3);
                        ByteString adData6 = headerBiddingAdMarkup3.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData6, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData6);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup3.getAdDataVersion());
                        ByteString trackingToken3 = adPlayerConfigResponse.getTrackingToken();
                        Intrinsics.checkNotNullExpressionValue(trackingToken3, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken3);
                        ByteString impressionConfiguration3 = adPlayerConfigResponse.getImpressionConfiguration();
                        Intrinsics.checkNotNullExpressionValue(impressionConfiguration3, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration3);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration3 = adPlayerConfigResponse.getWebviewConfiguration();
                        Intrinsics.checkNotNullExpressionValue(webviewConfiguration3, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration3);
                        ByteString adDataRefreshToken3 = adPlayerConfigResponse.getAdDataRefreshToken();
                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken3, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken3);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                            Intrinsics.checkNotNullExpressionValue(error3, "response.error");
                            dsl_create.setError(error3);
                        }
                        adData = adPlayerConfigResponse.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                        if (ByteStringsKt.isNotEmpty(adData)) {
                            ByteString adData7 = adPlayerConfigResponse.getAdData();
                            Intrinsics.checkNotNullExpressionValue(adData7, "response.adData");
                            dsl_create.setAdData(adData7);
                            dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                        }
                        response = dsl_create._build();
                        r6 = r7;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        objInvoke3 = obj;
                    }
                }
                LoadResult loadResult = (LoadResult) objInvoke3;
                if (loadResult instanceof LoadResult.Success) {
                    AdObject ad = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                    return ad == null ? new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, false, 52, null) : new LoadResult.Success(ad);
                }
                if (loadResult instanceof LoadResult.Failure) {
                    return loadResult;
                }
                throw new NoWhenBranchMatchedException();
                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType3;
                HandleGatewayAdResponse handleGatewayAdResponse = AndroidLoad.this.handleGatewayAdResponse;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                ByteString byteString2 = this.$opportunityId;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                Context context = this.$context;
                String str4 = this.$placement;
                boolean z4 = r6 != 0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                objInvoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions, byteString2, response, context, str4, diagnosticAdType8, z4, this);
            } catch (UnityAdsNetworkException e) {
                return AndroidLoad.this.handleGatewayException(e);
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, Continuation<? super LoadResult> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException e) {
        String message;
        String str;
        boolean z = e instanceof NetworkTimeoutException;
        UnityAds.UnityAdsLoadError unityAdsLoadError = z ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        if (z) {
            message = LoadResult.MSG_TIMEOUT;
        } else {
            message = e instanceof GatewayException ? e.getMessage() : LoadResult.MSG_COMMUNICATION_FAILURE;
        }
        String str2 = message;
        if (z) {
            str = "timeout";
        } else {
            str = "gateway";
        }
        return new LoadResult.Failure(unityAdsLoadError, str2, e, str, e.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString opportunityId, String placement, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, UnityAdsLoadOptions loadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(opportunityId, placement, EMPTY, false, null, null, null, false, null, null, null, loadOptions, isHeaderBidding, adType, null, null, 50680, null);
    }
}
