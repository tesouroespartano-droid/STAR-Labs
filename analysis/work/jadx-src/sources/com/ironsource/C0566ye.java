package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0566ye {
    private final C0346le b(Context context, C0431qe c0431qe, C0259ge c0259ge) {
        C0346le c0346leA = a(context, c0431qe, c0259ge);
        if (c0346leA.c()) {
            return c0346leA;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        Ae aeA = c0431qe.a(context, c0259ge.d());
        if (aeA == null) {
            return c0346leA;
        }
        C0346le c0346le = new C0346le(new C0276he(aeA));
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ErrorBuilder.buildUsingCachedConfigurationError(c0259ge.d(), c0259ge.f()) + ": " + c0346le.b(), 1);
        c0431qe.g();
        return c0346le;
    }

    public final void a(Context context, C0259ge request, C0431qe tools, InterfaceC0225ee listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.c().i(request.f());
        tools.a();
        C0346le c0346leB = b(context, tools, request);
        if (c0346leB.b() == null) {
            C0155ae c0155aeA = c0346leB.a();
            if (c0155aeA == null) {
                c0155aeA = new C0155ae(510, "unknown error");
            }
            listener.a(c0155aeA);
            return;
        }
        Yd yd = new Yd(c0346leB.b());
        if (c0346leB.c()) {
            listener.a(yd);
        } else {
            listener.a(new C0155ae(C0155ae.e, "serverResponseIsNotValid"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C0346le a(Context context, C0431qe c0431qe, C0259ge c0259ge) {
        C0155ae c0155ae;
        try {
            String strA = c0431qe.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = c0431qe.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            IronSourceSegment ironSourceSegmentD = c0431qe.d();
            ArrayList<Pair<String, String>> segmentData = ironSourceSegmentD != null ? ironSourceSegmentD.getSegmentData() : null;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, c0259ge.d(), c0259ge.f(), str, null, true, segmentData, false), C0186c9.a().toString(), new com.ironsource.mediationsdk.p.c() { // from class: com.ironsource.ye$$ExternalSyntheticLambda0
                @Override // com.ironsource.mediationsdk.p.c
                public final void a(String str2) {
                    C0566ye.a(objectRef, str2);
                }
            });
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new C0346le(a((String) objectRef.element));
            }
            if (c0431qe.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String encryptedResponse = jSONObject.optString(Ae.n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new C0346le(new C0155ae(C0155ae.g, C0208de.h));
                }
                boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                strSendPostRequest = a(encryptedResponse, zOptBoolean);
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    c0431qe.f();
                    return new C0346le(new C0155ae(C0155ae.f, C0208de.g));
                }
            }
            Ae ae = new Ae(context, c0259ge.d(), c0259ge.f(), strSendPostRequest);
            ae.a(Ae.a.SERVER);
            if (!ae.p()) {
                IronLog.INTERNAL.warning("response invalid - return null");
                return new C0346le(new C0155ae(C0155ae.e, "serverResponseIsNotValid"));
            }
            return new C0346le(new C0276he(ae));
        } catch (Exception e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.warning("exception = " + e);
            if (e instanceof JSONException) {
                c0155ae = new C0155ae(C0155ae.e, "serverResponseIsNotValid");
            } else {
                c0155ae = new C0155ae(510, "internal error");
            }
            return new C0346le(c0155ae);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ref.ObjectRef reason, String errorMessage) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        reason.element = errorMessage;
    }

    private final String a(String str, boolean z) {
        if (z) {
            String strDecryptAndDecompress = IronSourceAES.decryptAndDecompress(C0388o5.b().c(), str);
            Intrinsics.checkNotNullExpressionValue(strDecryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strDecryptAndDecompress;
        }
        String strDecode = IronSourceAES.decode(C0388o5.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(strDecode, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strDecode;
    }

    private final C0155ae a(String str) {
        if (str != null) {
            return new C0155ae(C0155ae.h, str);
        }
        return new C0155ae(C0155ae.d, "noServerResponse");
    }
}
