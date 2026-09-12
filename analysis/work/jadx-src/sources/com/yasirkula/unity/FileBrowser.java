package com.yasirkula.unity;

import android.app.Activity;
import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.ironsource.C0198d4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class FileBrowser {
    private static final StringBuilder stringBuilder = new StringBuilder();

    private static class UriPermissionSorter implements Comparator<UriPermission> {
        private UriPermissionSorter() {
        }

        @Override // java.util.Comparator
        public int compare(UriPermission a, UriPermission b) {
            long persistedTime = b.getPersistedTime() - a.getPersistedTime();
            if (persistedTime < 0) {
                return -1;
            }
            return persistedTime > 0 ? 1 : 0;
        }
    }

    public static String GetExternalDrives(Context context) {
        String canonicalPath;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String absolutePath = externalStorageDirectory.getAbsolutePath();
        try {
            canonicalPath = externalStorageDirectory.getCanonicalPath();
        } catch (Exception unused) {
            canonicalPath = absolutePath;
        }
        StringBuilder sb = stringBuilder;
        sb.setLength(0);
        sb.append(absolutePath).append(":");
        HashSet hashSet = new HashSet(16);
        String str = System.getenv("SECONDARY_STORAGE");
        if (str == null || str.length() == 0) {
            str = System.getenv("EXTERNAL_SDCARD_STORAGE");
        }
        if (str != null && str.length() > 0) {
            for (String str2 : str.split(":")) {
                if (str2 != null && str2.length() > 0) {
                    hashSet.add(str2);
                }
            }
        }
        String[] strArr = {"/storage", "/mnt", "/storage/removable", "/removable", "/data", "/mnt/media_rw", "/mnt/sdcard0"};
        for (int i = 0; i < 7; i++) {
            try {
                for (File file : new File(strArr[i]).listFiles()) {
                    if (file.exists() && file.isDirectory() && file.canRead()) {
                        hashSet.add(file.getAbsolutePath());
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator<StorageVolume> it = ((StorageManager) context.getSystemService(C0198d4.a.k)).getStorageVolumes().iterator();
            while (it.hasNext()) {
                File directory = it.next().getDirectory();
                if (directory != null) {
                    hashSet.add(directory.toString());
                }
            }
        } else {
            try {
                Method method = StorageVolume.class.getMethod("getPath", new Class[0]);
                Iterator<StorageVolume> it2 = ((StorageManager) context.getSystemService(C0198d4.a.k)).getStorageVolumes().iterator();
                while (it2.hasNext()) {
                    hashSet.add((String) method.invoke(it2.next(), new Object[0]));
                }
            } catch (Exception unused3) {
            }
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            File file2 = new File((String) it3.next());
            if (file2.exists() && file2.isDirectory() && file2.canRead() && !file2.getAbsolutePath().equalsIgnoreCase(absolutePath) && new File(file2.getAbsolutePath() + File.separator + C0198d4.d).exists()) {
                try {
                    if (!canonicalPath.equals(file2.getCanonicalPath())) {
                        stringBuilder.append(file2.getAbsolutePath()).append(":");
                    }
                } catch (Exception unused4) {
                }
            }
        }
        return stringBuilder.toString();
    }

    public static int CheckPermission(Context context) {
        if ((Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return 0;
        }
        return (Build.VERSION.SDK_INT >= 30 || context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) ? 1 : 0;
    }

    public static void RequestPermission(Context context, final FileBrowserPermissionReceiver permissionReceiver, final int lastCheckResult) {
        if (CheckPermission(context) == 1) {
            permissionReceiver.OnPermissionResult(1);
        } else if (lastCheckResult == 0) {
            permissionReceiver.OnPermissionResult(0);
        } else {
            ((Activity) context).getFragmentManager().beginTransaction().add(0, new FileBrowserPermissionFragment(permissionReceiver)).commitAllowingStateLoss();
        }
    }

    public static boolean CheckSAF() {
        return Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy();
    }

    public static void PickSAFFolder(Context context, final FileBrowserDirectoryReceiver directoryReceiver) {
        ((Activity) context).getFragmentManager().beginTransaction().add(0, new FileBrowserDirectoryPickerFragment(directoryReceiver)).commitAllowingStateLoss();
    }

    public static String FetchSAFQuickLinks(Context context) {
        stringBuilder.setLength(0);
        List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        persistedUriPermissions.sort(new UriPermissionSorter());
        int i = 0;
        for (int i2 = 0; i2 < persistedUriPermissions.size(); i2++) {
            UriPermission uriPermission = persistedUriPermissions.get(i2);
            if (i >= 5 || uriPermission.getPersistedTime() == Long.MIN_VALUE || !uriPermission.isReadPermission() || !uriPermission.isWritePermission()) {
                context.getContentResolver().releasePersistableUriPermission(uriPermission.getUri(), 3);
            } else {
                FileBrowserSAFEntry fileBrowserSAFEntryFromTreeUri = FileBrowserSAFEntry.fromTreeUri(context, uriPermission.getUri());
                if (fileBrowserSAFEntryFromTreeUri != null && fileBrowserSAFEntryFromTreeUri.exists() && fileBrowserSAFEntryFromTreeUri.isDirectory()) {
                    stringBuilder.append(fileBrowserSAFEntryFromTreeUri.getName()).append("<>").append(fileBrowserSAFEntryFromTreeUri.getUri().toString()).append("<>");
                    i++;
                } else {
                    context.getContentResolver().releasePersistableUriPermission(uriPermission.getUri(), 3);
                }
            }
        }
        StringBuilder sb = stringBuilder;
        sb.append(i);
        return sb.toString();
    }

    public static void CopyFile(Context context, String sourceRawUri, String destinationRawUri, boolean isMoveOperation) {
        boolean zContains = sourceRawUri.contains("://");
        boolean zContains2 = destinationRawUri.contains("://");
        if (zContains) {
            if (zContains2) {
                CopySAFEntry(context, sourceRawUri, destinationRawUri);
            } else {
                ReadFromSAFEntry(context, sourceRawUri, destinationRawUri);
            }
        } else if (zContains2) {
            WriteToSAFEntry(context, destinationRawUri, sourceRawUri, false);
        } else {
            CopyRawFile(sourceRawUri, destinationRawUri);
        }
        if (isMoveOperation) {
            if (zContains) {
                DeleteSAFEntry(context, sourceRawUri);
            } else {
                new File(sourceRawUri).delete();
            }
        }
    }

    public static void CopyDirectory(Context context, String sourceRawUri, String destinationRawUri, boolean isMoveOperation) {
        boolean zContains = sourceRawUri.contains("://");
        boolean zContains2 = destinationRawUri.contains("://");
        if (zContains) {
            CopySAFDirectoryRecursively(context, new FileBrowserSAFEntry(context, Uri.parse(sourceRawUri)), destinationRawUri, zContains2);
        } else {
            CopyRawDirectoryRecursively(context, new File(sourceRawUri), destinationRawUri, zContains2);
        }
        if (isMoveOperation) {
            if (zContains) {
                DeleteSAFEntry(context, sourceRawUri);
            } else {
                DeleteRawDirectoryRecursively(new File(sourceRawUri));
            }
        }
    }

    public static String OpenSAFFolder(Context context, String rawUri) {
        FileBrowserSAFEntry fileBrowserSAFEntry = new FileBrowserSAFEntry(context, Uri.parse(rawUri));
        StringBuilder sb = stringBuilder;
        sb.setLength(0);
        fileBrowserSAFEntry.appendFilesToStringBuilder(sb);
        return sb.toString();
    }

    public static String CreateSAFEntry(Context context, String folderRawUri, boolean isFolder, String name) {
        FileBrowserSAFEntry fileBrowserSAFEntry = new FileBrowserSAFEntry(context, Uri.parse(folderRawUri));
        if (isFolder) {
            return fileBrowserSAFEntry.createDirectory(name).getUri().toString();
        }
        int iLastIndexOf = name.lastIndexOf(46);
        String strSubstring = iLastIndexOf >= 0 ? name.substring(iLastIndexOf + 1) : "";
        String mimeTypeFromExtension = strSubstring.length() > 0 ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.toLowerCase(Locale.ENGLISH)) : null;
        if (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        return fileBrowserSAFEntry.createFile(mimeTypeFromExtension, name).getUri().toString();
    }

    public static void WriteToSAFEntry(Context context, String rawUri, String sourceFile, boolean appendMode) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(sourceFile));
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.parse(rawUri), appendMode ? "wa" : "rwt");
                if (outputStreamOpenOutputStream != null) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                        }
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th) {
                        outputStreamOpenOutputStream.close();
                        throw th;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
    }

    public static void ReadFromSAFEntry(Context context, String rawUri, String destinationFile) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(rawUri));
            if (inputStreamOpenInputStream == null) {
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(destinationFile), false);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                inputStreamOpenInputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
    }

    public static void CopySAFEntry(Context context, String sourceRawUri, String destinationRawUri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(sourceRawUri));
            if (inputStreamOpenInputStream == null) {
                return;
            }
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.parse(destinationRawUri), "rwt");
                if (outputStreamOpenOutputStream != null) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStreamOpenInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                        }
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th) {
                        outputStreamOpenOutputStream.close();
                        throw th;
                    }
                }
                inputStreamOpenInputStream.close();
            } catch (Throwable th2) {
                inputStreamOpenInputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
    }

    public static boolean SAFEntryExists(Context context, String rawUri, boolean isDirectory) {
        FileBrowserSAFEntry fileBrowserSAFEntry = new FileBrowserSAFEntry(context, Uri.parse(rawUri));
        return fileBrowserSAFEntry.exists() && fileBrowserSAFEntry.isDirectory() == isDirectory;
    }

    public static boolean SAFEntryDirectory(Context context, String rawUri) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).isDirectory();
    }

    public static String SAFEntryName(Context context, String rawUri) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).getName();
    }

    public static long SAFEntrySize(Context context, String rawUri) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).length();
    }

    public static long SAFEntryLastModified(Context context, String rawUri) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).lastModified();
    }

    public static String RenameSAFEntry(Context context, String rawUri, String newName) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).renameTo(newName);
    }

    public static boolean DeleteSAFEntry(Context context, String rawUri) {
        return new FileBrowserSAFEntry(context, Uri.parse(rawUri)).delete();
    }

    public static String GetParentDirectory(Context context, String rawUri) {
        int i;
        int iIndexOf;
        String str;
        String str2;
        List<String> path;
        String strEncode;
        int iLastIndexOf;
        try {
            if (!rawUri.contains("://")) {
                String parent = new File(rawUri).getParent();
                return parent != null ? parent : "";
            }
            DocumentsContract.Path pathFindDocumentPath = DocumentsContract.findDocumentPath(context.getContentResolver(), Uri.parse(rawUri));
            if (pathFindDocumentPath != null && (path = pathFindDocumentPath.getPath()) != null && path.size() > 0) {
                if (path.size() > 1) {
                    strEncode = Uri.encode(path.get(path.size() - 2));
                } else {
                    String str3 = path.get(0);
                    int iMax = Math.max(str3.lastIndexOf(47), str3.lastIndexOf(58) + 1);
                    strEncode = iMax > 0 ? Uri.encode(str3.substring(0, iMax)) : null;
                }
                if (strEncode != null && strEncode.length() > 0 && (iLastIndexOf = rawUri.lastIndexOf(47) + 1) > 0) {
                    String str4 = rawUri.substring(0, iLastIndexOf) + strEncode;
                    if (!str4.equals(rawUri) && SAFEntryExists(context, str4, true)) {
                        return str4;
                    }
                }
            }
            int iLastIndexOf2 = rawUri.lastIndexOf("%3A");
            if (iLastIndexOf2 > 0) {
                iLastIndexOf2 += 3;
            }
            int iMax2 = Math.max(iLastIndexOf2, Math.max(rawUri.lastIndexOf(47), rawUri.lastIndexOf("%2F")));
            if (iMax2 >= 0 && iMax2 < rawUri.length()) {
                String strSubstring = rawUri.substring(0, iMax2);
                if (SAFEntryExists(context, strSubstring, true)) {
                    return strSubstring;
                }
                int iIndexOf2 = strSubstring.indexOf("/tree/");
                if (iIndexOf2 >= 0 && (iIndexOf = strSubstring.indexOf(47, (i = iIndexOf2 + 6))) > iIndexOf2 + 10) {
                    String strSubstring2 = strSubstring.substring(i, iIndexOf);
                    String strSubstring3 = strSubstring.substring(0, i);
                    String strSubstring4 = strSubstring.substring(iIndexOf);
                    int length = strSubstring2.length() - 3;
                    String strSubstring5 = strSubstring2;
                    do {
                        length = strSubstring5.lastIndexOf("%2F", length - 1);
                        if (length > 0) {
                            strSubstring5 = strSubstring5.substring(0, length);
                            str2 = strSubstring3 + strSubstring5 + strSubstring4;
                        } else {
                            int length2 = strSubstring2.length() - 3;
                            do {
                                length2 = strSubstring2.lastIndexOf("%3A", length2 - 1);
                                if (length2 > 0) {
                                    strSubstring2 = strSubstring2.substring(0, length2 + 3);
                                    str = strSubstring3 + strSubstring2 + strSubstring4;
                                }
                            } while (!SAFEntryExists(context, str, true));
                            return str;
                        }
                    } while (!SAFEntryExists(context, str2, true));
                    return str2;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
    }

    public static boolean IsSAFEntryChildOfAnother(Context context, String rawUri, String parentRawUri) {
        try {
            return DocumentsContract.isChildDocument(context.getContentResolver(), Uri.parse(parentRawUri), Uri.parse(rawUri));
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
            return false;
        }
    }

    private static void CopyRawFile(String sourcePath, String destinationPath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(sourcePath));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(destinationPath), false);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
    }

    private static void CopySAFDirectoryRecursively(Context context, FileBrowserSAFEntry sourceDirectory, String destinationRawUri, boolean isDestinationSAFDirectory) {
        ArrayList<FileBrowserSAFEntry> arrayListListFiles;
        String path;
        File file = null;
        if (isDestinationSAFDirectory) {
            arrayListListFiles = new FileBrowserSAFEntry(context, Uri.parse(destinationRawUri)).listFiles();
        } else {
            File file2 = new File(destinationRawUri);
            file2.mkdirs();
            arrayListListFiles = null;
            file = file2;
        }
        ArrayList<FileBrowserSAFEntry> arrayListListFiles2 = sourceDirectory.listFiles();
        for (int i = 0; i < arrayListListFiles2.size(); i++) {
            FileBrowserSAFEntry fileBrowserSAFEntry = arrayListListFiles2.get(i);
            if (fileBrowserSAFEntry.isDirectory()) {
                if (isDestinationSAFDirectory) {
                    path = FindSAFEntryWithNameOrCreateNew(context, destinationRawUri, arrayListListFiles, true, fileBrowserSAFEntry.getName());
                } else {
                    path = new File(file, fileBrowserSAFEntry.getName()).getPath();
                }
                CopySAFDirectoryRecursively(context, fileBrowserSAFEntry, path, isDestinationSAFDirectory);
            } else if (isDestinationSAFDirectory) {
                CopySAFEntry(context, fileBrowserSAFEntry.getUri().toString(), FindSAFEntryWithNameOrCreateNew(context, destinationRawUri, arrayListListFiles, false, fileBrowserSAFEntry.getName()));
            } else {
                ReadFromSAFEntry(context, fileBrowserSAFEntry.getUri().toString(), new File(file, fileBrowserSAFEntry.getName()).getPath());
            }
        }
    }

    private static void CopyRawDirectoryRecursively(Context context, File sourceDirectory, String destinationRawUri, boolean isDestinationSAFDirectory) {
        ArrayList<FileBrowserSAFEntry> arrayListListFiles;
        String path;
        File file = null;
        if (isDestinationSAFDirectory) {
            arrayListListFiles = new FileBrowserSAFEntry(context, Uri.parse(destinationRawUri)).listFiles();
        } else {
            File file2 = new File(destinationRawUri);
            file2.mkdirs();
            arrayListListFiles = null;
            file = file2;
        }
        File[] fileArrListFiles = sourceDirectory.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                if (file3.isDirectory()) {
                    if (isDestinationSAFDirectory) {
                        path = FindSAFEntryWithNameOrCreateNew(context, destinationRawUri, arrayListListFiles, true, file3.getName());
                    } else {
                        path = new File(file, file3.getName()).getPath();
                    }
                    CopyRawDirectoryRecursively(context, file3, path, isDestinationSAFDirectory);
                } else if (isDestinationSAFDirectory) {
                    WriteToSAFEntry(context, FindSAFEntryWithNameOrCreateNew(context, destinationRawUri, arrayListListFiles, false, file3.getName()), file3.getPath(), false);
                } else {
                    CopyRawFile(file3.getPath(), new File(file, file3.getName()).getPath());
                }
            }
        }
    }

    private static void DeleteRawDirectoryRecursively(File directory) {
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    DeleteRawDirectoryRecursively(fileArrListFiles[i]);
                } else {
                    fileArrListFiles[i].delete();
                }
            }
        }
        directory.delete();
    }

    private static String FindSAFEntryWithNameOrCreateNew(Context context, String folderRawUri, ArrayList<FileBrowserSAFEntry> folderContents, boolean isDirectory, String entryName) {
        for (int i = 0; i < folderContents.size(); i++) {
            FileBrowserSAFEntry fileBrowserSAFEntry = folderContents.get(i);
            if (fileBrowserSAFEntry.getName().equals(entryName)) {
                if (fileBrowserSAFEntry.isDirectory() == isDirectory) {
                    return fileBrowserSAFEntry.getUri().toString();
                }
                fileBrowserSAFEntry.delete();
                break;
            }
        }
        return CreateSAFEntry(context, folderRawUri, isDirectory, entryName);
    }
}
