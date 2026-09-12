package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.Ab;
import com.ironsource.C0198d4;
import com.ironsource.C0243ff;
import com.ironsource.C0421q4;
import com.ironsource.C0577z8;
import com.ironsource.InterfaceC0576z7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceStorageUtils {
    private static final String a = "supersonicads";
    private static C0243ff b;
    private static boolean c;

    private static void a(Context context) {
        C0243ff c0243ff = b;
        if (c0243ff != null && c0243ff.b()) {
            deleteCacheDirectories(context);
        }
        C0243ff c0243ff2 = b;
        if (c0243ff2 == null || !c0243ff2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        C0243ff c0243ff = b;
        return (c0243ff == null || !c0243ff.d()) ? interfaceC0576z7I.f(context) : interfaceC0576z7I.l(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObject.put("files", c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObject.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e) {
                    C0421q4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C0577z8 c0577z8, JSONObject jSONObject) throws Exception {
        if (c0577z8 == null || !c0577z8.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = c0577z8.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            C0577z8 c0577z9 = new C0577z8(file.getPath());
            if (c0577z9.isFile()) {
                String name = c0577z9.getName();
                JSONObject jSONObjectA = c0577z9.a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, jSONObjectA);
                }
            } else if (c0577z9.isDirectory()) {
                jSONObject2.put(c0577z9.getName(), buildFilesMapOfDirectory(c0577z9, jSONObject));
            }
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        C0243ff c0243ff = b;
        return (c0243ff == null || !c0243ff.d()) ? interfaceC0576z7I.j(context) : interfaceC0576z7I.B(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        a(interfaceC0576z7I.l(context));
        a(interfaceC0576z7I.B(context));
    }

    public static synchronized boolean deleteFile(C0577z8 c0577z8) {
        if (!c0577z8.exists()) {
            return false;
        }
        return c0577z8.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC0576z7 interfaceC0576z7I = Ab.U().i();
        a(interfaceC0576z7I.f(context));
        a(interfaceC0576z7I.j(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        File file;
        file = new File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C0243ff c0243ff = b;
        if (c0243ff == null || !c0243ff.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(C0198d4.c.u + canonicalPath2);
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return fileB.getPath();
    }

    public static ArrayList<C0577z8> getFilesInFolderRecursive(C0577z8 c0577z8) {
        if (c0577z8 == null || !c0577z8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C0577z8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c0577z8.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C0577z8 c0577z9 = new C0577z8(file.getPath());
                if (c0577z9.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c0577z9));
                }
                if (c0577z9.isFile()) {
                    arrayList.add(c0577z9);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(C0577z8 c0577z8) {
        long totalSizeOfDir;
        long j = 0;
        if (c0577z8 != null && c0577z8.isDirectory()) {
            File[] fileArrListFiles = c0577z8.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C0577z8 c0577z9 = new C0577z8(file.getPath());
                if (c0577z9.isFile()) {
                    totalSizeOfDir = c0577z9.length();
                } else {
                    if (c0577z9.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(c0577z9);
                    }
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, C0243ff c0243ff) {
        b = c0243ff;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C0577z8 c0577z8) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c0577z8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return i;
                }
                fileOutputStream.write(bArr2, 0, i2);
                i += i2;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sbAppend = new StringBuilder().append(file.getAbsolutePath());
        String str = File.separator;
        return new File(sbAppend.append(str).append(a).append(str).toString());
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            C0421q4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a() {
        C0243ff c0243ff;
        return Build.VERSION.SDK_INT > 29 && (c0243ff = b) != null && c0243ff.a();
    }
}
