package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.ironsource.Ae;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONObject;

/* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ3\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%JI\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0096Bø\u0001\u0000¢\u0006\u0002\u00102R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;)V", "cleanup", "", "t", "", "opportunityId", "Lcom/google/protobuf/ByteString;", Ae.n, "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "context", "Landroid/content/Context;", "placementId", "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {236, 242}, m = "cleanup", n = {"adPlayer"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5}, l = {97, 114, 145, 188, 192, 218}, m = "invoke", n = {"this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Ae.n, "placementId", "adType", "adPlayer", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Ae.n, "placementId", "adPlayer", "webviewConfiguration", "tmpAdObject", "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Ae.n, "placementId", "adPlayer", "tmpAdObject", "webViewUrl", "base64ImpressionConfiguration", "mark$iv$iv", "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Ae.n, "placementId", "adPlayer", "adObject", "loadAdViewerStartedTime", "this", "opportunityId", Ae.n, "adPlayer", "adObject", "loadEvent", "t"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"})
    static final class C06401 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C06401(Continuation<? super C06401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0456  */
    /* JADX WARN: Code duplicated, block: B:111:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:128:0x0527 A[Catch: CancellationException -> 0x0546, TryCatch #20 {CancellationException -> 0x0546, blocks: (B:126:0x04fa, B:128:0x0527, B:135:0x0540, B:130:0x052d, B:132:0x0533, B:134:0x053b), top: B:205:0x04fa }] */
    /* JADX WARN: Code duplicated, block: B:130:0x052d A[Catch: CancellationException -> 0x0546, TryCatch #20 {CancellationException -> 0x0546, blocks: (B:126:0x04fa, B:128:0x0527, B:135:0x0540, B:130:0x052d, B:132:0x0533, B:134:0x053b), top: B:205:0x04fa }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0462 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x021b  */
    /* JADX WARN: Code duplicated, block: B:67:0x022b A[Catch: CancellationException -> 0x00e8, TryCatch #15 {CancellationException -> 0x00e8, blocks: (B:87:0x02ef, B:31:0x00e1, B:65:0x021f, B:67:0x022b, B:69:0x0241, B:74:0x0259, B:76:0x0262, B:79:0x027d, B:148:0x055d, B:75:0x025d), top: B:197:0x00e1, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0241 A[Catch: CancellationException -> 0x00e8, TryCatch #15 {CancellationException -> 0x00e8, blocks: (B:87:0x02ef, B:31:0x00e1, B:65:0x021f, B:67:0x022b, B:69:0x0241, B:74:0x0259, B:76:0x0262, B:79:0x027d, B:148:0x055d, B:75:0x025d), top: B:197:0x00e1, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0255  */
    /* JADX WARN: Code duplicated, block: B:72:0x0256  */
    /* JADX WARN: Code duplicated, block: B:74:0x0259 A[Catch: CancellationException -> 0x00e8, TRY_LEAVE, TryCatch #15 {CancellationException -> 0x00e8, blocks: (B:87:0x02ef, B:31:0x00e1, B:65:0x021f, B:67:0x022b, B:69:0x0241, B:74:0x0259, B:76:0x0262, B:79:0x027d, B:148:0x055d, B:75:0x025d), top: B:197:0x00e1, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x027b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:83:0x02db  */
    /* JADX WARN: Code duplicated, block: B:92:0x0324  */
    /* JADX WARN: Code duplicated, block: B:93:0x0327  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05be, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r0, r9) == r3) goto L162;
     */
    /* JADX WARN: Type inference failed for: r4v23, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, Continuation<? super LoadResult> continuation) throws Throwable {
        C06401 c06401;
        ByteString byteString2;
        AdResponseOuterClass.AdResponse adResponse2;
        Ref.ObjectRef objectRef;
        ByteString byteString3;
        AdResponseOuterClass.AdResponse adResponse3;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        boolean z2;
        ByteString byteString4;
        String str2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2;
        WebViewConfiguration webViewConfiguration;
        AdObject adObject;
        String str3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        CacheWebViewAssets cacheWebViewAssets;
        Ref.ObjectRef objectRef2;
        String str4;
        WebViewConfiguration webViewConfiguration2;
        AdObject adObject2;
        String it;
        String query;
        String str5;
        String base64ImpressionConfiguration;
        long jM5069markNowz9LOYto;
        ByteString byteString5;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        AdResponseOuterClass.AdResponse adResponse4;
        Ref.ObjectRef objectRef3;
        String str6;
        Object objM3604constructorimpl;
        String str7;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        String str8;
        Object value;
        String str9;
        AdObject adObjectCopy$default;
        long jM5069markNowz9LOYto2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3;
        AdObject adObject3;
        ByteString byteString6;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse4;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse5;
        AdResponseOuterClass.AdResponse adResponse5;
        LoadEvent loadEvent;
        AdResponseOuterClass.AdResponse adResponse6;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse6;
        AdObject adObject4;
        NonCancellable nonCancellable;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse7;
        Ref.ObjectRef objectRef4;
        AdResponseOuterClass.AdResponse adResponse7;
        ByteString byteString7;
        LoadEvent loadEvent2;
        AnonymousClass4 anonymousClass4;
        ByteString byteString8;
        AdObject adObject5;
        AdResponseOuterClass.AdResponse adResponse8;
        String objectId;
        JSONObject data;
        CancellationException cancellationException;
        if (continuation instanceof C06401) {
            c06401 = (C06401) continuation;
            if ((c06401.label & Integer.MIN_VALUE) != 0) {
                c06401.label -= Integer.MIN_VALUE;
            } else {
                c06401 = new C06401(continuation);
            }
        } else {
            c06401 = new C06401(continuation);
        }
        C06401 c06402 = c06401;
        Object objInvoke = c06402.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c06402.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke);
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                try {
                    try {
                        if (adResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "gateway", adResponse.getError().getErrorText(), false, 36, null);
                        }
                        if (adResponse.getAdData().isEmpty()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.NO_FILL, LoadResult.MSG_NO_FILL, null, "no_fill", null, false, 52, null);
                        }
                        GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                        String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                        Integer numBoxInt = Boxing.boxInt(adResponse.getWebviewConfiguration().getVersion());
                        List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                        String type = adResponse.getWebviewConfiguration().getType();
                        c06402.L$0 = this;
                        c06402.L$1 = unityAdsLoadOptions;
                        byteString2 = byteString;
                        try {
                            c06402.L$2 = byteString2;
                            adResponse2 = adResponse;
                            try {
                                c06402.L$3 = adResponse2;
                                c06402.L$4 = str;
                                c06402.L$5 = diagnosticAdType;
                                c06402.L$6 = objectRef5;
                                c06402.Z$0 = z;
                                c06402.label = 1;
                                Object objInvoke2 = getLatestWebViewConfiguration.invoke(entryPoint, numBoxInt, additionalFilesList, type, c06402);
                                if (objInvoke2 != coroutine_suspended) {
                                    unityAdsLoadOptions2 = unityAdsLoadOptions;
                                    objInvoke = objInvoke2;
                                    diagnosticAdType2 = diagnosticAdType;
                                    z2 = z;
                                    objectRef = objectRef5;
                                    byteString4 = byteString2;
                                    adResponse3 = adResponse2;
                                    str2 = str;
                                    androidHandleGatewayAdResponse2 = this;
                                    try {
                                        webViewConfiguration = (WebViewConfiguration) objInvoke;
                                        ByteString trackingToken = adResponse3.getTrackingToken();
                                        Intrinsics.checkNotNullExpressionValue(trackingToken, "trackingToken");
                                        adObject = new AdObject(byteString4, str2, trackingToken, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, diagnosticAdType2, null, null, 51192, null);
                                        byteString3 = byteString4;
                                        str3 = str2;
                                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                        cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                                        c06402.L$0 = androidHandleGatewayAdResponse2;
                                        c06402.L$1 = unityAdsLoadOptions3;
                                        c06402.L$2 = byteString3;
                                        c06402.L$3 = adResponse3;
                                        c06402.L$4 = str3;
                                        c06402.L$5 = objectRef;
                                        c06402.L$6 = webViewConfiguration;
                                        c06402.L$7 = adObject;
                                        c06402.label = 2;
                                        if (cacheWebViewAssets.invoke(webViewConfiguration, c06402) != coroutine_suspended) {
                                            objectRef2 = objectRef;
                                            str4 = str3;
                                            webViewConfiguration2 = webViewConfiguration;
                                            adObject2 = adObject;
                                            if (webViewConfiguration2.getEntryPoint().length() == 0) {
                                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                                            }
                                            it = SdkProperties.getConfigUrl();
                                            Intrinsics.checkNotNullExpressionValue(it, "it");
                                            if (!StringsKt.endsWith$default(it, ".html", false, 2, (Object) null)) {
                                                it = null;
                                            }
                                            if (it == null) {
                                                it = webViewConfiguration2.getEntryPoint();
                                            }
                                            try {
                                                URI uri = new URI(it);
                                                StringBuilder sbAppend = new StringBuilder("?platform=android&mode=ad-viewer&webviewType=").append(webViewConfiguration2.getType()).append(Typography.amp);
                                                query = uri.getQuery();
                                                if (query == null) {
                                                    query = "";
                                                }
                                                str5 = StringsKt.substringBeforeLast$default(it, "?", (String) null, 2, (Object) null) + sbAppend.append(query).toString();
                                                base64ImpressionConfiguration = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                                                jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                                                try {
                                                    Result.Companion companion = Result.INSTANCE;
                                                    AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                                                    AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse2.adPlayerScope;
                                                    c06402.L$0 = androidHandleGatewayAdResponse2;
                                                    c06402.L$1 = unityAdsLoadOptions3;
                                                    c06402.L$2 = byteString3;
                                                    c06402.L$3 = adResponse3;
                                                    c06402.L$4 = str4;
                                                    c06402.L$5 = objectRef2;
                                                    c06402.L$6 = adObject2;
                                                    c06402.L$7 = str5;
                                                    c06402.L$8 = base64ImpressionConfiguration;
                                                    c06402.J$0 = jM5069markNowz9LOYto;
                                                    c06402.label = 3;
                                                    objInvoke = androidGetWebViewContainerUseCase.invoke(adPlayerScope, c06402);
                                                    if (objInvoke != coroutine_suspended) {
                                                        byteString5 = byteString3;
                                                        unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                        adResponse4 = adResponse3;
                                                        objectRef3 = objectRef2;
                                                        str6 = str5;
                                                        objM3604constructorimpl = Result.m3604constructorimpl((AndroidWebViewContainer) objInvoke);
                                                        str7 = str6;
                                                        objectRef2 = objectRef3;
                                                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                        adResponse3 = adResponse4;
                                                        byteString3 = byteString5;
                                                        AdObject adObject6 = adObject2;
                                                        str8 = str4;
                                                        try {
                                                            TimedValue timedValue = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(jM5069markNowz9LOYto), null);
                                                            value = ((Result) timedValue.component1()).getValue();
                                                            long duration = timedValue.getDuration();
                                                            SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                            if (Result.m3611isSuccessimpl(value)) {
                                                                str9 = "native_webview_success_time";
                                                            } else {
                                                                str9 = "native_webview_failure_time";
                                                            }
                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str9, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration, DurationUnit.MILLISECONDS)), null, null, adObject6, null, 44, null);
                                                            Object value2 = ((Result) timedValue.getValue()).getValue();
                                                            ResultKt.throwOnFailure(value2);
                                                            AndroidWebViewContainer androidWebViewContainer = (AndroidWebViewContainer) value2;
                                                            WebViewBridge webViewBridgeInvoke = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                            objectRef2.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke, androidWebViewContainer, byteString3);
                                                            adObjectCopy$default = AdObject.copy$default(adObject6, null, null, null, false, null, null, null, false, null, (AdPlayer) objectRef2.element, null, null, false, null, null, null, 65023, null);
                                                            FlowKt.launchIn(FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(objectRef2, null)), ((AdPlayer) objectRef2.element).getScope());
                                                            jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy$default, null, 46, null);
                                                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                            SharedFlow<Invocation> onInvocation = webViewBridgeInvoke.getOnInvocation();
                                                            ByteString adData = adResponse3.getAdData();
                                                            Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                                                            String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                            ByteString adDataRefreshToken = adResponse3.getAdDataRefreshToken();
                                                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                                                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                                                            try {
                                                                String base64$default2 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null);
                                                                Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                                                                FlowKt.launchIn(handleInvocationsFromAdViewer.invoke(onInvocation, base64$default, base64$default2, base64ImpressionConfiguration, adObjectCopy$default, androidHandleGatewayAdResponse3.new AnonymousClass3(androidWebViewContainer, str7, adObject6, null)), ((AdPlayer) objectRef2.element).getScope());
                                                                Flow<LoadEvent> onLoadEvent = ((AdPlayer) objectRef2.element).getOnLoadEvent();
                                                                c06402.L$0 = androidHandleGatewayAdResponse;
                                                                c06402.L$1 = unityAdsLoadOptions5;
                                                                c06402.L$2 = byteString3;
                                                                c06402.L$3 = adResponse3;
                                                                c06402.L$4 = str8;
                                                                c06402.L$5 = objectRef2;
                                                                c06402.L$6 = adObjectCopy$default;
                                                                c06402.L$7 = null;
                                                                c06402.L$8 = null;
                                                                c06402.J$0 = jM5069markNowz9LOYto2;
                                                                c06402.label = 4;
                                                                objInvoke = FlowKt.single(onLoadEvent, c06402);
                                                                if (objInvoke != coroutine_suspended) {
                                                                    adObject3 = adObjectCopy$default;
                                                                    byteString6 = byteString3;
                                                                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                                                                    unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                    try {
                                                                        loadEvent = (LoadEvent) objInvoke;
                                                                        if (loadEvent instanceof LoadEvent.Error) {
                                                                            try {
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                                                                adObject4 = adObject3;
                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse4;
                                                                                objectRef4 = objectRef2;
                                                                                adResponse7 = adResponse3;
                                                                                byteString7 = byteString6;
                                                                                try {
                                                                                    androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                                                                                    loadEvent2 = loadEvent;
                                                                                    adResponse6 = adResponse7;
                                                                                    try {
                                                                                        anonymousClass4 = androidHandleGatewayAdResponse7.new AnonymousClass4(loadEvent, byteString7, adResponse7, objectRef4, null);
                                                                                        c06402.L$0 = androidHandleGatewayAdResponse6;
                                                                                        c06402.L$1 = byteString6;
                                                                                        c06402.L$2 = adResponse6;
                                                                                        c06402.L$3 = objectRef2;
                                                                                        c06402.L$4 = adObject4;
                                                                                        c06402.L$5 = loadEvent2;
                                                                                        c06402.L$6 = null;
                                                                                        c06402.label = 5;
                                                                                        if (BuildersKt.withContext(nonCancellable, anonymousClass4, c06402) != coroutine_suspended) {
                                                                                            objectRef = objectRef2;
                                                                                            byteString8 = byteString6;
                                                                                            adObject5 = adObject4;
                                                                                            try {
                                                                                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                                                                                            } catch (CancellationException e) {
                                                                                                e = e;
                                                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse6;
                                                                                                adResponse3 = adResponse6;
                                                                                                byteString3 = byteString8;
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e2) {
                                                                                        e = e2;
                                                                                        objectRef = objectRef2;
                                                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse6;
                                                                                        adResponse3 = adResponse6;
                                                                                        byteString3 = byteString6;
                                                                                    }
                                                                                } catch (CancellationException e3) {
                                                                                    e = e3;
                                                                                    androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                                                                                    byteString6 = byteString7;
                                                                                    adResponse6 = adResponse7;
                                                                                    objectRef2 = objectRef4;
                                                                                }
                                                                            } catch (CancellationException e4) {
                                                                                e = e4;
                                                                                adResponse6 = adResponse3;
                                                                                androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse4;
                                                                            }
                                                                        } else {
                                                                            adResponse8 = adResponse3;
                                                                            androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                                                                            try {
                                                                                adResponse5 = adResponse8;
                                                                                try {
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse5.sendDiagnosticEvent, "native_create_ad_object_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                                                                    AdObject adObject7 = adObject3;
                                                                                    androidHandleGatewayAdResponse5.campaignRepository.setLoadTimestamp(byteString6);
                                                                                    androidHandleGatewayAdResponse5.adRepository.addAd(byteString6, adObject7);
                                                                                    objectId = unityAdsLoadOptions6.getObjectId();
                                                                                    if ((objectId != null || StringsKt.isBlank(objectId)) && (data = unityAdsLoadOptions6.getData()) != null && !data.has("adMarkup")) {
                                                                                        androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                                                                                    }
                                                                                    return new LoadResult.Success(adObject7);
                                                                                } catch (CancellationException e5) {
                                                                                    e = e5;
                                                                                    objectRef = objectRef2;
                                                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse5;
                                                                                    byteString3 = byteString6;
                                                                                    adResponse3 = adResponse5;
                                                                                    NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                                                                    CancellationException cancellationException2 = e;
                                                                                    cancellationException = cancellationException2;
                                                                                    AnonymousClass5 anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(cancellationException2, byteString3, adResponse3, objectRef, null);
                                                                                    c06402.L$0 = cancellationException;
                                                                                    c06402.L$1 = null;
                                                                                    c06402.L$2 = null;
                                                                                    c06402.L$3 = null;
                                                                                    c06402.L$4 = null;
                                                                                    c06402.L$5 = null;
                                                                                    c06402.L$6 = null;
                                                                                    c06402.L$7 = null;
                                                                                    c06402.L$8 = null;
                                                                                    c06402.label = 6;
                                                                                }
                                                                            } catch (CancellationException e6) {
                                                                                e = e6;
                                                                                adResponse5 = adResponse8;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } catch (CancellationException e7) {
                                                                        e = e7;
                                                                        AdResponseOuterClass.AdResponse adResponse9 = adResponse3;
                                                                        androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                                                                        adResponse5 = adResponse9;
                                                                    }
                                                                }
                                                            } catch (CancellationException e8) {
                                                                e = e8;
                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                                                                objectRef = objectRef2;
                                                            }
                                                        } catch (CancellationException e9) {
                                                            e = e9;
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    Result.Companion companion2 = Result.INSTANCE;
                                                    objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                                                    str7 = str5;
                                                    unityAdsLoadOptions5 = unityAdsLoadOptions3;
                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                }
                                            } catch (Throwable unused) {
                                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "invalid_url", it, false, 36, null);
                                            }
                                        }
                                    } catch (CancellationException e10) {
                                        e = e10;
                                        byteString3 = byteString4;
                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                    }
                                }
                            } catch (CancellationException e11) {
                                e = e11;
                                objectRef = objectRef5;
                                byteString3 = byteString2;
                                adResponse3 = adResponse2;
                                androidHandleGatewayAdResponse = this;
                            }
                        } catch (CancellationException e12) {
                            e = e12;
                            adResponse2 = adResponse;
                        }
                        return coroutine_suspended;
                    } catch (CancellationException e13) {
                        e = e13;
                        adResponse3 = adResponse;
                        androidHandleGatewayAdResponse = this;
                        objectRef = objectRef5;
                        byteString3 = byteString;
                    }
                } catch (CancellationException e14) {
                    e = e14;
                    byteString2 = byteString;
                }
                adResponse2 = adResponse;
                objectRef = objectRef5;
                byteString3 = byteString2;
                adResponse3 = adResponse2;
                androidHandleGatewayAdResponse = this;
                NonCancellable nonCancellable3 = NonCancellable.INSTANCE;
                CancellationException cancellationException3 = e;
                cancellationException = cancellationException3;
                AnonymousClass5 anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass5(cancellationException3, byteString3, adResponse3, objectRef, null);
                c06402.L$0 = cancellationException;
                c06402.L$1 = null;
                c06402.L$2 = null;
                c06402.L$3 = null;
                c06402.L$4 = null;
                c06402.L$5 = null;
                c06402.L$6 = null;
                c06402.L$7 = null;
                c06402.L$8 = null;
                c06402.label = 6;
                break;
            case 1:
                boolean z3 = c06402.Z$0;
                objectRef = (Ref.ObjectRef) c06402.L$6;
                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c06402.L$5;
                String str10 = (String) c06402.L$4;
                adResponse3 = (AdResponseOuterClass.AdResponse) c06402.L$3;
                byteString3 = (ByteString) c06402.L$2;
                UnityAdsLoadOptions unityAdsLoadOptions7 = (UnityAdsLoadOptions) c06402.L$1;
                androidHandleGatewayAdResponse2 = (AndroidHandleGatewayAdResponse) c06402.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    z2 = z3;
                    diagnosticAdType2 = diagnosticAdType3;
                    str2 = str10;
                    byteString4 = byteString3;
                    unityAdsLoadOptions2 = unityAdsLoadOptions7;
                    webViewConfiguration = (WebViewConfiguration) objInvoke;
                    ByteString trackingToken2 = adResponse3.getTrackingToken();
                    Intrinsics.checkNotNullExpressionValue(trackingToken2, "trackingToken");
                    adObject = new AdObject(byteString4, str2, trackingToken2, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, diagnosticAdType2, null, null, 51192, null);
                    byteString3 = byteString4;
                    str3 = str2;
                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                    cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                    c06402.L$0 = androidHandleGatewayAdResponse2;
                    c06402.L$1 = unityAdsLoadOptions3;
                    c06402.L$2 = byteString3;
                    c06402.L$3 = adResponse3;
                    c06402.L$4 = str3;
                    c06402.L$5 = objectRef;
                    c06402.L$6 = webViewConfiguration;
                    c06402.L$7 = adObject;
                    c06402.label = 2;
                    if (cacheWebViewAssets.invoke(webViewConfiguration, c06402) != coroutine_suspended) {
                        objectRef2 = objectRef;
                        str4 = str3;
                        webViewConfiguration2 = webViewConfiguration;
                        adObject2 = adObject;
                        if (webViewConfiguration2.getEntryPoint().length() == 0) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                        }
                        it = SdkProperties.getConfigUrl();
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (!StringsKt.endsWith$default(it, ".html", false, 2, (Object) null)) {
                            it = null;
                        }
                        if (it == null) {
                            it = webViewConfiguration2.getEntryPoint();
                        }
                        URI uri2 = new URI(it);
                        StringBuilder sbAppend2 = new StringBuilder("?platform=android&mode=ad-viewer&webviewType=").append(webViewConfiguration2.getType()).append(Typography.amp);
                        query = uri2.getQuery();
                        if (query == null) {
                            query = "";
                        }
                        str5 = StringsKt.substringBeforeLast$default(it, "?", (String) null, 2, (Object) null) + sbAppend2.append(query).toString();
                        base64ImpressionConfiguration = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                        jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                        Result.Companion companion3 = Result.INSTANCE;
                        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase2 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                        AdPlayerScope adPlayerScope2 = androidHandleGatewayAdResponse2.adPlayerScope;
                        c06402.L$0 = androidHandleGatewayAdResponse2;
                        c06402.L$1 = unityAdsLoadOptions3;
                        c06402.L$2 = byteString3;
                        c06402.L$3 = adResponse3;
                        c06402.L$4 = str4;
                        c06402.L$5 = objectRef2;
                        c06402.L$6 = adObject2;
                        c06402.L$7 = str5;
                        c06402.L$8 = base64ImpressionConfiguration;
                        c06402.J$0 = jM5069markNowz9LOYto;
                        c06402.label = 3;
                        objInvoke = androidGetWebViewContainerUseCase2.invoke(adPlayerScope2, c06402);
                        if (objInvoke != coroutine_suspended) {
                            byteString5 = byteString3;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                            adResponse4 = adResponse3;
                            objectRef3 = objectRef2;
                            str6 = str5;
                            objM3604constructorimpl = Result.m3604constructorimpl((AndroidWebViewContainer) objInvoke);
                            str7 = str6;
                            objectRef2 = objectRef3;
                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                            adResponse3 = adResponse4;
                            byteString3 = byteString5;
                            AdObject adObject8 = adObject2;
                            str8 = str4;
                            TimedValue timedValue2 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(jM5069markNowz9LOYto), null);
                            value = ((Result) timedValue2.component1()).getValue();
                            long duration2 = timedValue2.getDuration();
                            SendDiagnosticEvent sendDiagnosticEvent2 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                            if (Result.m3611isSuccessimpl(value)) {
                                str9 = "native_webview_success_time";
                            } else {
                                str9 = "native_webview_failure_time";
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str9, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration2, DurationUnit.MILLISECONDS)), null, null, adObject8, null, 44, null);
                            Object value3 = ((Result) timedValue2.getValue()).getValue();
                            ResultKt.throwOnFailure(value3);
                            AndroidWebViewContainer androidWebViewContainer2 = (AndroidWebViewContainer) value3;
                            WebViewBridge webViewBridgeInvoke2 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer2, androidHandleGatewayAdResponse.adPlayerScope);
                            objectRef2.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke2, androidWebViewContainer2, byteString3);
                            adObjectCopy$default = AdObject.copy$default(adObject8, null, null, null, false, null, null, null, false, null, (AdPlayer) objectRef2.element, null, null, false, null, null, null, 65023, null);
                            FlowKt.launchIn(FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(objectRef2, null)), ((AdPlayer) objectRef2.element).getScope());
                            jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy$default, null, 46, null);
                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                            SharedFlow<Invocation> onInvocation2 = webViewBridgeInvoke2.getOnInvocation();
                            ByteString adData2 = adResponse3.getAdData();
                            Intrinsics.checkNotNullExpressionValue(adData2, "response.adData");
                            String base64$default3 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                            ByteString adDataRefreshToken2 = adResponse3.getAdDataRefreshToken();
                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "response.adDataRefreshToken");
                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                            String base64$default4 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null);
                            Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                            FlowKt.launchIn(handleInvocationsFromAdViewer2.invoke(onInvocation2, base64$default3, base64$default4, base64ImpressionConfiguration, adObjectCopy$default, androidHandleGatewayAdResponse3.new AnonymousClass3(androidWebViewContainer2, str7, adObject8, null)), ((AdPlayer) objectRef2.element).getScope());
                            Flow<LoadEvent> onLoadEvent2 = ((AdPlayer) objectRef2.element).getOnLoadEvent();
                            c06402.L$0 = androidHandleGatewayAdResponse;
                            c06402.L$1 = unityAdsLoadOptions5;
                            c06402.L$2 = byteString3;
                            c06402.L$3 = adResponse3;
                            c06402.L$4 = str8;
                            c06402.L$5 = objectRef2;
                            c06402.L$6 = adObjectCopy$default;
                            c06402.L$7 = null;
                            c06402.L$8 = null;
                            c06402.J$0 = jM5069markNowz9LOYto2;
                            c06402.label = 4;
                            objInvoke = FlowKt.single(onLoadEvent2, c06402);
                            if (objInvoke != coroutine_suspended) {
                                adObject3 = adObjectCopy$default;
                                byteString6 = byteString3;
                                androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                                unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                loadEvent = (LoadEvent) objInvoke;
                                if (loadEvent instanceof LoadEvent.Error) {
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                    adObject4 = adObject3;
                                    nonCancellable = NonCancellable.INSTANCE;
                                    androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse4;
                                    objectRef4 = objectRef2;
                                    adResponse7 = adResponse3;
                                    byteString7 = byteString6;
                                    androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                                    loadEvent2 = loadEvent;
                                    adResponse6 = adResponse7;
                                    anonymousClass4 = androidHandleGatewayAdResponse7.new AnonymousClass4(loadEvent, byteString7, adResponse7, objectRef4, null);
                                    c06402.L$0 = androidHandleGatewayAdResponse6;
                                    c06402.L$1 = byteString6;
                                    c06402.L$2 = adResponse6;
                                    c06402.L$3 = objectRef2;
                                    c06402.L$4 = adObject4;
                                    c06402.L$5 = loadEvent2;
                                    c06402.L$6 = null;
                                    c06402.label = 5;
                                    if (BuildersKt.withContext(nonCancellable, anonymousClass4, c06402) != coroutine_suspended) {
                                        objectRef = objectRef2;
                                        byteString8 = byteString6;
                                        adObject5 = adObject4;
                                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                                    }
                                } else {
                                    adResponse8 = adResponse3;
                                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                                    adResponse5 = adResponse8;
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse5.sendDiagnosticEvent, "native_create_ad_object_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                    AdObject adObject9 = adObject3;
                                    androidHandleGatewayAdResponse5.campaignRepository.setLoadTimestamp(byteString6);
                                    androidHandleGatewayAdResponse5.adRepository.addAd(byteString6, adObject9);
                                    objectId = unityAdsLoadOptions6.getObjectId();
                                    if (objectId != null) {
                                        androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                                    } else {
                                        androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                                    }
                                    return new LoadResult.Success(adObject9);
                                }
                            }
                        }
                    }
                } catch (CancellationException e15) {
                    e = e15;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                    NonCancellable nonCancellable4 = NonCancellable.INSTANCE;
                    CancellationException cancellationException4 = e;
                    cancellationException = cancellationException4;
                    AnonymousClass5 anonymousClass7 = androidHandleGatewayAdResponse.new AnonymousClass5(cancellationException4, byteString3, adResponse3, objectRef, null);
                    c06402.L$0 = cancellationException;
                    c06402.L$1 = null;
                    c06402.L$2 = null;
                    c06402.L$3 = null;
                    c06402.L$4 = null;
                    c06402.L$5 = null;
                    c06402.L$6 = null;
                    c06402.L$7 = null;
                    c06402.L$8 = null;
                    c06402.label = 6;
                    break;
                }
                return coroutine_suspended;
            case 2:
                AdObject adObject10 = (AdObject) c06402.L$7;
                webViewConfiguration2 = (WebViewConfiguration) c06402.L$6;
                objectRef2 = (Ref.ObjectRef) c06402.L$5;
                String str11 = (String) c06402.L$4;
                adResponse3 = (AdResponseOuterClass.AdResponse) c06402.L$3;
                byteString3 = (ByteString) c06402.L$2;
                unityAdsLoadOptions3 = (UnityAdsLoadOptions) c06402.L$1;
                androidHandleGatewayAdResponse2 = (AndroidHandleGatewayAdResponse) c06402.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    str4 = str11;
                    adObject2 = adObject10;
                    if (webViewConfiguration2.getEntryPoint().length() == 0) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                    }
                    it = SdkProperties.getConfigUrl();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (!StringsKt.endsWith$default(it, ".html", false, 2, (Object) null)) {
                        it = null;
                    }
                    if (it == null) {
                        it = webViewConfiguration2.getEntryPoint();
                    }
                    URI uri3 = new URI(it);
                    StringBuilder sbAppend3 = new StringBuilder("?platform=android&mode=ad-viewer&webviewType=").append(webViewConfiguration2.getType()).append(Typography.amp);
                    query = uri3.getQuery();
                    if (query == null) {
                        query = "";
                    }
                    str5 = StringsKt.substringBeforeLast$default(it, "?", (String) null, 2, (Object) null) + sbAppend3.append(query).toString();
                    base64ImpressionConfiguration = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                    jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                    Result.Companion companion4 = Result.INSTANCE;
                    AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase3 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                    AdPlayerScope adPlayerScope3 = androidHandleGatewayAdResponse2.adPlayerScope;
                    c06402.L$0 = androidHandleGatewayAdResponse2;
                    c06402.L$1 = unityAdsLoadOptions3;
                    c06402.L$2 = byteString3;
                    c06402.L$3 = adResponse3;
                    c06402.L$4 = str4;
                    c06402.L$5 = objectRef2;
                    c06402.L$6 = adObject2;
                    c06402.L$7 = str5;
                    c06402.L$8 = base64ImpressionConfiguration;
                    c06402.J$0 = jM5069markNowz9LOYto;
                    c06402.label = 3;
                    objInvoke = androidGetWebViewContainerUseCase3.invoke(adPlayerScope3, c06402);
                    if (objInvoke != coroutine_suspended) {
                        byteString5 = byteString3;
                        unityAdsLoadOptions4 = unityAdsLoadOptions3;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                        adResponse4 = adResponse3;
                        objectRef3 = objectRef2;
                        str6 = str5;
                        objM3604constructorimpl = Result.m3604constructorimpl((AndroidWebViewContainer) objInvoke);
                        str7 = str6;
                        objectRef2 = objectRef3;
                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                        adResponse3 = adResponse4;
                        byteString3 = byteString5;
                        AdObject adObject11 = adObject2;
                        str8 = str4;
                        TimedValue timedValue3 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(jM5069markNowz9LOYto), null);
                        value = ((Result) timedValue3.component1()).getValue();
                        long duration3 = timedValue3.getDuration();
                        SendDiagnosticEvent sendDiagnosticEvent3 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                        if (Result.m3611isSuccessimpl(value)) {
                            str9 = "native_webview_success_time";
                        } else {
                            str9 = "native_webview_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, str9, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration3, DurationUnit.MILLISECONDS)), null, null, adObject11, null, 44, null);
                        Object value4 = ((Result) timedValue3.getValue()).getValue();
                        ResultKt.throwOnFailure(value4);
                        AndroidWebViewContainer androidWebViewContainer3 = (AndroidWebViewContainer) value4;
                        WebViewBridge webViewBridgeInvoke3 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer3, androidHandleGatewayAdResponse.adPlayerScope);
                        objectRef2.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke3, androidWebViewContainer3, byteString3);
                        adObjectCopy$default = AdObject.copy$default(adObject11, null, null, null, false, null, null, null, false, null, (AdPlayer) objectRef2.element, null, null, false, null, null, null, 65023, null);
                        FlowKt.launchIn(FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(objectRef2, null)), ((AdPlayer) objectRef2.element).getScope());
                        jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy$default, null, 46, null);
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer3 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        SharedFlow<Invocation> onInvocation3 = webViewBridgeInvoke3.getOnInvocation();
                        ByteString adData3 = adResponse3.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData3, "response.adData");
                        String base64$default5 = ProtobufExtensionsKt.toBase64$default(adData3, false, 1, null);
                        ByteString adDataRefreshToken3 = adResponse3.getAdDataRefreshToken();
                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken3, "response.adDataRefreshToken");
                        androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                        String base64$default6 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken3, false, 1, null);
                        Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                        FlowKt.launchIn(handleInvocationsFromAdViewer3.invoke(onInvocation3, base64$default5, base64$default6, base64ImpressionConfiguration, adObjectCopy$default, androidHandleGatewayAdResponse3.new AnonymousClass3(androidWebViewContainer3, str7, adObject11, null)), ((AdPlayer) objectRef2.element).getScope());
                        Flow<LoadEvent> onLoadEvent3 = ((AdPlayer) objectRef2.element).getOnLoadEvent();
                        c06402.L$0 = androidHandleGatewayAdResponse;
                        c06402.L$1 = unityAdsLoadOptions5;
                        c06402.L$2 = byteString3;
                        c06402.L$3 = adResponse3;
                        c06402.L$4 = str8;
                        c06402.L$5 = objectRef2;
                        c06402.L$6 = adObjectCopy$default;
                        c06402.L$7 = null;
                        c06402.L$8 = null;
                        c06402.J$0 = jM5069markNowz9LOYto2;
                        c06402.label = 4;
                        objInvoke = FlowKt.single(onLoadEvent3, c06402);
                        if (objInvoke != coroutine_suspended) {
                            adObject3 = adObjectCopy$default;
                            byteString6 = byteString3;
                            androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                            unityAdsLoadOptions6 = unityAdsLoadOptions5;
                            loadEvent = (LoadEvent) objInvoke;
                            if (loadEvent instanceof LoadEvent.Error) {
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                adObject4 = adObject3;
                                nonCancellable = NonCancellable.INSTANCE;
                                androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse4;
                                objectRef4 = objectRef2;
                                adResponse7 = adResponse3;
                                byteString7 = byteString6;
                                androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                                loadEvent2 = loadEvent;
                                adResponse6 = adResponse7;
                                anonymousClass4 = androidHandleGatewayAdResponse7.new AnonymousClass4(loadEvent, byteString7, adResponse7, objectRef4, null);
                                c06402.L$0 = androidHandleGatewayAdResponse6;
                                c06402.L$1 = byteString6;
                                c06402.L$2 = adResponse6;
                                c06402.L$3 = objectRef2;
                                c06402.L$4 = adObject4;
                                c06402.L$5 = loadEvent2;
                                c06402.L$6 = null;
                                c06402.label = 5;
                                if (BuildersKt.withContext(nonCancellable, anonymousClass4, c06402) != coroutine_suspended) {
                                    objectRef = objectRef2;
                                    byteString8 = byteString6;
                                    adObject5 = adObject4;
                                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                                }
                            } else {
                                adResponse8 = adResponse3;
                                androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                                adResponse5 = adResponse8;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse5.sendDiagnosticEvent, "native_create_ad_object_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                                AdObject adObject12 = adObject3;
                                androidHandleGatewayAdResponse5.campaignRepository.setLoadTimestamp(byteString6);
                                androidHandleGatewayAdResponse5.adRepository.addAd(byteString6, adObject12);
                                objectId = unityAdsLoadOptions6.getObjectId();
                                if (objectId != null) {
                                    androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                                } else {
                                    androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                                }
                                return new LoadResult.Success(adObject12);
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (CancellationException e16) {
                    e = e16;
                    objectRef = objectRef2;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                }
                break;
            case 3:
                jM5069markNowz9LOYto = c06402.J$0;
                base64ImpressionConfiguration = (String) c06402.L$8;
                str6 = (String) c06402.L$7;
                adObject2 = (AdObject) c06402.L$6;
                objectRef3 = (Ref.ObjectRef) c06402.L$5;
                str4 = (String) c06402.L$4;
                adResponse4 = (AdResponseOuterClass.AdResponse) c06402.L$3;
                byteString5 = (ByteString) c06402.L$2;
                unityAdsLoadOptions4 = (UnityAdsLoadOptions) c06402.L$1;
                androidHandleGatewayAdResponse = (AndroidHandleGatewayAdResponse) c06402.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    objM3604constructorimpl = Result.m3604constructorimpl((AndroidWebViewContainer) objInvoke);
                    str7 = str6;
                    objectRef2 = objectRef3;
                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                    adResponse3 = adResponse4;
                    byteString3 = byteString5;
                } catch (Throwable th2) {
                    th = th2;
                    str5 = str6;
                    objectRef2 = objectRef3;
                    adResponse3 = adResponse4;
                    androidHandleGatewayAdResponse2 = androidHandleGatewayAdResponse;
                    unityAdsLoadOptions3 = unityAdsLoadOptions4;
                    byteString3 = byteString5;
                    Result.Companion companion5 = Result.INSTANCE;
                    objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                    str7 = str5;
                    unityAdsLoadOptions5 = unityAdsLoadOptions3;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                }
                AdObject adObject13 = adObject2;
                str8 = str4;
                TimedValue timedValue4 = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(jM5069markNowz9LOYto), null);
                value = ((Result) timedValue4.component1()).getValue();
                long duration4 = timedValue4.getDuration();
                SendDiagnosticEvent sendDiagnosticEvent4 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                if (Result.m3611isSuccessimpl(value)) {
                    str9 = "native_webview_success_time";
                } else {
                    str9 = "native_webview_failure_time";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str9, Boxing.boxDouble(Duration.m4973toDoubleimpl(duration4, DurationUnit.MILLISECONDS)), null, null, adObject13, null, 44, null);
                Object value5 = ((Result) timedValue4.getValue()).getValue();
                ResultKt.throwOnFailure(value5);
                AndroidWebViewContainer androidWebViewContainer4 = (AndroidWebViewContainer) value5;
                WebViewBridge webViewBridgeInvoke4 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer4, androidHandleGatewayAdResponse.adPlayerScope);
                objectRef2.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke4, androidWebViewContainer4, byteString3);
                adObjectCopy$default = AdObject.copy$default(adObject13, null, null, null, false, null, null, null, false, null, (AdPlayer) objectRef2.element, null, null, false, null, null, null, 65023, null);
                FlowKt.launchIn(FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(objectRef2, null)), ((AdPlayer) objectRef2.element).getScope());
                jM5069markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy$default, null, 46, null);
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer4 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                SharedFlow<Invocation> onInvocation4 = webViewBridgeInvoke4.getOnInvocation();
                ByteString adData4 = adResponse3.getAdData();
                Intrinsics.checkNotNullExpressionValue(adData4, "response.adData");
                String base64$default7 = ProtobufExtensionsKt.toBase64$default(adData4, false, 1, null);
                ByteString adDataRefreshToken4 = adResponse3.getAdDataRefreshToken();
                Intrinsics.checkNotNullExpressionValue(adDataRefreshToken4, "response.adDataRefreshToken");
                androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                String base64$default8 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken4, false, 1, null);
                Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                FlowKt.launchIn(handleInvocationsFromAdViewer4.invoke(onInvocation4, base64$default7, base64$default8, base64ImpressionConfiguration, adObjectCopy$default, androidHandleGatewayAdResponse3.new AnonymousClass3(androidWebViewContainer4, str7, adObject13, null)), ((AdPlayer) objectRef2.element).getScope());
                Flow<LoadEvent> onLoadEvent4 = ((AdPlayer) objectRef2.element).getOnLoadEvent();
                c06402.L$0 = androidHandleGatewayAdResponse;
                c06402.L$1 = unityAdsLoadOptions5;
                c06402.L$2 = byteString3;
                c06402.L$3 = adResponse3;
                c06402.L$4 = str8;
                c06402.L$5 = objectRef2;
                c06402.L$6 = adObjectCopy$default;
                c06402.L$7 = null;
                c06402.L$8 = null;
                c06402.J$0 = jM5069markNowz9LOYto2;
                c06402.label = 4;
                objInvoke = FlowKt.single(onLoadEvent4, c06402);
                if (objInvoke != coroutine_suspended) {
                    adObject3 = adObjectCopy$default;
                    byteString6 = byteString3;
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                    unityAdsLoadOptions6 = unityAdsLoadOptions5;
                    loadEvent = (LoadEvent) objInvoke;
                    if (loadEvent instanceof LoadEvent.Error) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                        adObject4 = adObject3;
                        nonCancellable = NonCancellable.INSTANCE;
                        androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse4;
                        objectRef4 = objectRef2;
                        adResponse7 = adResponse3;
                        byteString7 = byteString6;
                        androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                        loadEvent2 = loadEvent;
                        adResponse6 = adResponse7;
                        anonymousClass4 = androidHandleGatewayAdResponse7.new AnonymousClass4(loadEvent, byteString7, adResponse7, objectRef4, null);
                        c06402.L$0 = androidHandleGatewayAdResponse6;
                        c06402.L$1 = byteString6;
                        c06402.L$2 = adResponse6;
                        c06402.L$3 = objectRef2;
                        c06402.L$4 = adObject4;
                        c06402.L$5 = loadEvent2;
                        c06402.L$6 = null;
                        c06402.label = 5;
                        if (BuildersKt.withContext(nonCancellable, anonymousClass4, c06402) != coroutine_suspended) {
                            objectRef = objectRef2;
                            byteString8 = byteString6;
                            adObject5 = adObject4;
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                        }
                    } else {
                        adResponse8 = adResponse3;
                        androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                        adResponse5 = adResponse8;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse5.sendDiagnosticEvent, "native_create_ad_object_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                        AdObject adObject14 = adObject3;
                        androidHandleGatewayAdResponse5.campaignRepository.setLoadTimestamp(byteString6);
                        androidHandleGatewayAdResponse5.adRepository.addAd(byteString6, adObject14);
                        objectId = unityAdsLoadOptions6.getObjectId();
                        if (objectId != null) {
                            androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                        } else {
                            androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                        }
                        return new LoadResult.Success(adObject14);
                    }
                }
                return coroutine_suspended;
            case 4:
                jM5069markNowz9LOYto2 = c06402.J$0;
                AdObject adObject15 = (AdObject) c06402.L$6;
                objectRef2 = (Ref.ObjectRef) c06402.L$5;
                str8 = (String) c06402.L$4;
                adResponse3 = (AdResponseOuterClass.AdResponse) c06402.L$3;
                byteString6 = (ByteString) c06402.L$2;
                unityAdsLoadOptions5 = (UnityAdsLoadOptions) c06402.L$1;
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse8 = (AndroidHandleGatewayAdResponse) c06402.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    adObject3 = adObject15;
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse8;
                    unityAdsLoadOptions6 = unityAdsLoadOptions5;
                    loadEvent = (LoadEvent) objInvoke;
                    if (loadEvent instanceof LoadEvent.Error) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                        adObject4 = adObject3;
                        nonCancellable = NonCancellable.INSTANCE;
                        androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse4;
                        objectRef4 = objectRef2;
                        adResponse7 = adResponse3;
                        byteString7 = byteString6;
                        androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse7;
                        loadEvent2 = loadEvent;
                        adResponse6 = adResponse7;
                        anonymousClass4 = androidHandleGatewayAdResponse7.new AnonymousClass4(loadEvent, byteString7, adResponse7, objectRef4, null);
                        c06402.L$0 = androidHandleGatewayAdResponse6;
                        c06402.L$1 = byteString6;
                        c06402.L$2 = adResponse6;
                        c06402.L$3 = objectRef2;
                        c06402.L$4 = adObject4;
                        c06402.L$5 = loadEvent2;
                        c06402.L$6 = null;
                        c06402.label = 5;
                        if (BuildersKt.withContext(nonCancellable, anonymousClass4, c06402) != coroutine_suspended) {
                            objectRef = objectRef2;
                            byteString8 = byteString6;
                            adObject5 = adObject4;
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                        }
                        return coroutine_suspended;
                    }
                    adResponse8 = adResponse3;
                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                    adResponse5 = adResponse8;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse5.sendDiagnosticEvent, "native_create_ad_object_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m5070boximpl(jM5069markNowz9LOYto2))), null, null, adObject3, null, 44, null);
                    AdObject adObject16 = adObject3;
                    androidHandleGatewayAdResponse5.campaignRepository.setLoadTimestamp(byteString6);
                    androidHandleGatewayAdResponse5.adRepository.addAd(byteString6, adObject16);
                    objectId = unityAdsLoadOptions6.getObjectId();
                    if (objectId != null) {
                        androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                    } else {
                        androidHandleGatewayAdResponse5.adRepository.enqueueOpportunityForPlacement(str8, byteString6);
                    }
                    return new LoadResult.Success(adObject16);
                } catch (CancellationException e17) {
                    e = e17;
                    objectRef = objectRef2;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse8;
                    byteString3 = byteString6;
                    NonCancellable nonCancellable5 = NonCancellable.INSTANCE;
                    CancellationException cancellationException5 = e;
                    cancellationException = cancellationException5;
                    AnonymousClass5 anonymousClass8 = androidHandleGatewayAdResponse.new AnonymousClass5(cancellationException5, byteString3, adResponse3, objectRef, null);
                    c06402.L$0 = cancellationException;
                    c06402.L$1 = null;
                    c06402.L$2 = null;
                    c06402.L$3 = null;
                    c06402.L$4 = null;
                    c06402.L$5 = null;
                    c06402.L$6 = null;
                    c06402.L$7 = null;
                    c06402.L$8 = null;
                    c06402.label = 6;
                }
                break;
            case 5:
                loadEvent2 = (LoadEvent) c06402.L$5;
                adObject5 = (AdObject) c06402.L$4;
                objectRef = (Ref.ObjectRef) c06402.L$3;
                AdResponseOuterClass.AdResponse adResponse10 = (AdResponseOuterClass.AdResponse) c06402.L$2;
                byteString8 = (ByteString) c06402.L$1;
                androidHandleGatewayAdResponse6 = (AndroidHandleGatewayAdResponse) c06402.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    adResponse6 = adResponse10;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject5.isScarAd(), 4, null);
                } catch (CancellationException e18) {
                    e = e18;
                    byteString3 = byteString8;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse6;
                    adResponse3 = adResponse10;
                }
                break;
            case 6:
                cancellationException = (CancellationException) c06402.L$0;
                ResultKt.throwOnFailure(objInvoke);
                Throwable cause = cancellationException.getCause();
                if (cause == null) {
                    throw cancellationException;
                }
                throw cause;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<AllowedPiiOuterClass.AllowedPii, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdPlayer> $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref.ObjectRef<AdPlayer> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(allowedPii, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = this.$adPlayer.element;
                byte[] byteArray = allowedPii.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {176}, m = "invokeSuspend", n = {"mark$iv$iv"}, s = {"J$0"})
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ AdObject $tmpAdObject;
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            long j;
            Object objM3604constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
                String str = this.$webViewUrl;
                long jM5069markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m5069markNowz9LOYto();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    this.J$0 = jM5069markNowz9LOYto;
                    this.label = 1;
                    if (androidWebViewContainer.loadUrl(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = jM5069markNowz9LOYto;
                } catch (Throwable th2) {
                    th = th2;
                    j = jM5069markNowz9LOYto;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM3604constructorimpl = Result.m3604constructorimpl(ResultKt.createFailure(th));
                }
            }
            objM3604constructorimpl = Result.m3604constructorimpl(Unit.INSTANCE);
            TimedValue timedValue = new TimedValue(Result.m3603boximpl(objM3604constructorimpl), TimeSource.Monotonic.ValueTimeMark.m5074elapsedNowUwyO8pc(j), null);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
            AdObject adObject = this.$tmpAdObject;
            Object value = ((Result) timedValue.component1()).getValue();
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, Result.m3611isSuccessimpl(value) ? "native_load_file_task_success_time" : "native_load_file_task_failure_time", Boxing.boxDouble(Duration.m4973toDoubleimpl(timedValue.getDuration(), DurationUnit.MILLISECONDS)), null, null, adObject, null, 44, null);
            ResultKt.throwOnFailure(value);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdPlayer> $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref.ObjectRef<AdPlayer> objectRef, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass4(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AndroidHandleGatewayAdResponse.this.cleanup(new Error(((LoadEvent.Error) this.$loadEvent).getMessage()), this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdPlayer> $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref.ObjectRef<AdPlayer> objectRef, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$t, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AndroidHandleGatewayAdResponse.this.cleanup(this.$t, this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r14.destroy(r9) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        String message;
        AdPlayer adPlayer2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i != 0) {
            if (i == 1) {
                adPlayer2 = (AdPlayer) anonymousClass2.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
        Throwable cause = th.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
            message = "";
        }
        dsl_create.setMessage(message);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        ByteString trackingToken = adResponse.getTrackingToken();
        Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
        ByteString byteString2 = operativeEventErrorData_build.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString2, "operativeEventErrorData.toByteString()");
        adPlayer2 = adPlayer;
        anonymousClass2.L$0 = adPlayer2;
        anonymousClass2.label = 1;
        if (GetOperativeEventApi.invoke$default(getOperativeEventApi, operativeEventType, byteString, trackingToken, byteString2, null, null, anonymousClass2, 48, null) != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (adPlayer2 == null) {
            return Unit.INSTANCE;
        }
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
    }
}
