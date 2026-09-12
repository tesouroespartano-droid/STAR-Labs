package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Z5 {
    private final Context a;
    private final C0284i5 b;
    private final Y5 c;
    private final Db d;
    private final InterfaceC0576z7 e = Ab.U().i();

    public Z5(Context context, C0284i5 c0284i5, Y5 y5, Db db) {
        this.a = context;
        this.b = c0284i5;
        this.c = y5;
        this.d = db;
    }

    public void a(C0577z8 c0577z8, String str, int i, int i2, Dc dc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(X5.a.a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(C0232f4.A);
        }
        if (!Z3.h(this.a)) {
            throw new Exception(C0232f4.C);
        }
        this.c.a(c0577z8.getPath(), new a(dc));
        if (!c0577z8.exists()) {
            this.b.a(c0577z8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c0577z8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(C0577z8 c0577z8) throws Exception {
        if (c0577z8.exists()) {
            ArrayList<C0577z8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c0577z8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c0577z8) || !c0577z8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C0577z8 c0577z8) throws Exception {
        if (c0577z8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c0577z8, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C0577z8 c0577z8) throws Exception {
        if (c0577z8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c0577z8);
        }
        throw new Exception("Folder does not exist");
    }

    class a implements Dc {
        final /* synthetic */ Dc a;

        /* JADX INFO: renamed from: com.ironsource.Z5$a$a, reason: collision with other inner class name */
        class C0039a extends JSONObject {
            C0039a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(Dc dc) {
            this.a = dc;
        }

        @Override // com.ironsource.Dc
        public void a(C0577z8 c0577z8) {
            this.a.a(c0577z8);
            try {
                Z5.this.d.a(c0577z8.getName(), new C0039a());
            } catch (Exception e) {
                C0421q4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Dc
        public void a(C0577z8 c0577z8, C0441r8 c0441r8) {
            this.a.a(c0577z8, c0441r8);
        }
    }

    public void a(C0577z8 c0577z8) throws Exception {
        if (c0577z8.exists()) {
            if (c0577z8.delete()) {
                this.d.a(c0577z8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C0577z8 c0577z8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c0577z8.exists()) {
                if (!this.d.b(c0577z8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
