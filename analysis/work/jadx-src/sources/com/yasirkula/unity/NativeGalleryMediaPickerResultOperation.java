package com.yasirkula.unity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.ironsource.C0232f4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NativeGalleryMediaPickerResultOperation {
    private boolean cancelled;
    private final Context context;
    private final Intent data;
    public boolean finished;
    private final NativeGalleryMediaReceiver mediaReceiver;
    public int progress;
    private final String savePathDirectory;
    private final String savePathFilename;
    private ArrayList<String> savedFiles;
    private final boolean selectMultiple;
    public boolean sentResult;
    private String unityResult;

    public NativeGalleryMediaPickerResultOperation(final Context context, final NativeGalleryMediaReceiver mediaReceiver, final Intent data, final boolean selectMultiple, final String savePathDirectory, final String savePathFilename) {
        this.context = context;
        this.mediaReceiver = mediaReceiver;
        this.data = data;
        this.selectMultiple = selectMultiple;
        this.savePathDirectory = savePathDirectory;
        this.savePathFilename = savePathFilename;
    }

    public void execute() {
        this.unityResult = "";
        this.progress = -1;
        try {
            try {
                if (!this.selectMultiple || this.data.getClipData() == null) {
                    String pathFromURI = getPathFromURI(this.data.getData());
                    this.unityResult = pathFromURI;
                    if (pathFromURI == null || (pathFromURI.length() > 0 && !new File(this.unityResult).exists())) {
                        this.unityResult = "";
                    }
                } else {
                    int itemCount = this.data.getClipData().getItemCount();
                    boolean z = true;
                    for (int i = 0; i < itemCount && !this.cancelled; i++) {
                        String pathFromURI2 = getPathFromURI(this.data.getClipData().getItemAt(i).getUri());
                        if (pathFromURI2 != null && pathFromURI2.length() > 0 && new File(pathFromURI2).exists()) {
                            if (z) {
                                this.unityResult += pathFromURI2;
                                z = false;
                            } else {
                                this.unityResult += ">" + pathFromURI2;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("Unity", "Exception:", e);
            }
        } finally {
            this.progress = 100;
            this.finished = true;
        }
    }

    public void cancel() {
        if (this.cancelled || this.finished) {
            return;
        }
        Log.d("Unity", "Cancelled NativeGalleryMediaPickerResultOperation!");
        this.cancelled = true;
        this.unityResult = "";
    }

    public void sendResultToUnity() {
        if (this.sentResult) {
            return;
        }
        this.sentResult = true;
        NativeGalleryMediaReceiver nativeGalleryMediaReceiver = this.mediaReceiver;
        if (nativeGalleryMediaReceiver == null) {
            Log.d("Unity", "NativeGalleryMediaPickerResultOperation.mediaReceiver became null!");
        } else if (this.selectMultiple) {
            nativeGalleryMediaReceiver.OnMultipleMediaReceived(this.unityResult);
        } else {
            nativeGalleryMediaReceiver.OnMediaReceived(this.unityResult);
        }
    }

    private String getPathFromURI(Uri uri) throws Throwable {
        FileInputStream fileInputStream = null;
        if (uri == null) {
            return null;
        }
        Log.d("Unity", "Selected media uri: " + uri.toString());
        String strGetPathFromURI = NativeGalleryUtils.GetPathFromURI(this.context, uri);
        if (strGetPathFromURI != null && strGetPathFromURI.length() > 0) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(strGetPathFromURI));
                try {
                    fileInputStream2.read();
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused) {
                    }
                    return strGetPathFromURI;
                } catch (Exception unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return copyToTempFile(uri);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return copyToTempFile(uri);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188 A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:103:0x0184, B:105:0x0188, B:107:0x018c, B:108:0x0193, B:109:0x0198), top: B:138:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x018c A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:103:0x0184, B:105:0x0188, B:107:0x018c, B:108:0x0193, B:109:0x0198), top: B:138:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x019e A[Catch: Exception -> 0x01bf, TRY_ENTER, TryCatch #9 {Exception -> 0x01bf, blocks: (B:125:0x01b8, B:126:0x01bb, B:127:0x01be, B:111:0x019e, B:112:0x01a1), top: B:151:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01b8 A[Catch: Exception -> 0x01bf, TryCatch #9 {Exception -> 0x01bf, blocks: (B:125:0x01b8, B:126:0x01bb, B:127:0x01be, B:111:0x019e, B:112:0x01a1), top: B:151:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:140:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x016a A[EDGE_INSN: B:163:0x016a->B:92:0x016a BREAK  A[LOOP:1: B:76:0x0135->B:167:0x0135], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2 A[Catch: Exception -> 0x01c1, TryCatch #13 {Exception -> 0x01c1, blocks: (B:51:0x00b8, B:61:0x00cf, B:64:0x00ea, B:66:0x00f2, B:68:0x0100, B:69:0x011b, B:70:0x011e), top: B:157:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[Catch: Exception -> 0x01c1, TryCatch #13 {Exception -> 0x01c1, blocks: (B:51:0x00b8, B:61:0x00cf, B:64:0x00ea, B:66:0x00f2, B:68:0x0100, B:69:0x011b, B:70:0x011e), top: B:157:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0142 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #4 {all -> 0x0167, blocks: (B:79:0x013d, B:82:0x0142), top: B:143:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015a A[Catch: all -> 0x01a7, TryCatch #3 {all -> 0x01a7, blocks: (B:85:0x0154, B:87:0x015a, B:92:0x016a, B:94:0x0172, B:101:0x0181), top: B:142:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0172 A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #3 {all -> 0x01a7, blocks: (B:85:0x0154, B:87:0x015a, B:92:0x016a, B:94:0x0172, B:101:0x0181), top: B:142:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017d A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [int] */
    /* JADX WARN: Type inference failed for: r16v9 */
    private String copyToTempFile(Uri uri) throws Throwable {
        Cursor cursorQuery;
        String strSubstring;
        int iLastIndexOf;
        String type;
        String strSubstring2;
        String extensionFromMimeType;
        int i;
        ?? r16;
        InputStream inputStreamOpenInputStream;
        long j;
        String str;
        File file;
        FileOutputStream fileOutputStream;
        int i2;
        byte[] bArr;
        int i3;
        FileOutputStream fileOutputStream2;
        int i4;
        FileOutputStream fileOutputStream3;
        int i5;
        int i6;
        String str2 = "Exception:";
        ContentResolver contentResolver = this.context.getContentResolver();
        Cursor cursor = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream4 = null;
        String str3 = null;
        long jAvailable = -1;
        try {
            cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            strSubstring = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                            try {
                                jAvailable = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                            } catch (Exception e) {
                                e = e;
                                Log.e("Unity", "Exception:", e);
                                if (cursorQuery != null) {
                                }
                                if (strSubstring != null) {
                                    strSubstring = C0232f4.D;
                                } else {
                                    strSubstring = C0232f4.D;
                                }
                                iLastIndexOf = strSubstring.lastIndexOf(46);
                                if (iLastIndexOf <= 0) {
                                    type = contentResolver.getType(uri);
                                    if (type != null) {
                                        strSubstring2 = null;
                                    } else {
                                        strSubstring2 = null;
                                    }
                                } else {
                                    type = contentResolver.getType(uri);
                                    if (type != null) {
                                        strSubstring2 = null;
                                    } else {
                                        strSubstring2 = null;
                                    }
                                }
                                if (strSubstring2 == null) {
                                    strSubstring2 = ".tmp";
                                }
                                i = 0;
                                if (!NativeGalleryMediaPickerFragment.tryPreserveFilenames) {
                                    strSubstring = this.savePathFilename;
                                } else if (strSubstring.endsWith(strSubstring2)) {
                                    strSubstring = strSubstring.substring(0, strSubstring.length() - strSubstring2.length());
                                }
                                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                                if (inputStreamOpenInputStream == null) {
                                    return null;
                                }
                                j = 0;
                                if (jAvailable < 0) {
                                    try {
                                        jAvailable = inputStreamOpenInputStream.available();
                                    } catch (Exception unused) {
                                    }
                                    if (jAvailable < 0) {
                                        jAvailable = 0;
                                    }
                                }
                                str = strSubstring + strSubstring2;
                                if (this.savedFiles != null) {
                                    r16 = 1;
                                    i6 = 0;
                                    while (i6 < this.savedFiles.size()) {
                                        if (this.savedFiles.get(i6).equals(str)) {
                                            int i7 = r16 + 1;
                                            r16 = i7;
                                            str = strSubstring + i7 + strSubstring2;
                                            i6 = -1;
                                        }
                                        i6++;
                                        r16 = r16;
                                    }
                                }
                                try {
                                    file = new File(this.savePathDirectory, str);
                                    try {
                                        fileOutputStream = new FileOutputStream(file, false);
                                        i2 = (jAvailable > 0L ? 1 : (jAvailable == 0L ? 0 : -1));
                                        try {
                                            this.progress = i2 > 0 ? 0 : -1;
                                            bArr = new byte[4096];
                                            while (true) {
                                                i3 = inputStreamOpenInputStream.read(bArr);
                                                fileOutputStream4 = fileOutputStream4;
                                                if (i3 > 0) {
                                                    break;
                                                }
                                                try {
                                                    if (this.cancelled) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, i, i3);
                                                    if (i2 > 0) {
                                                        String str4 = str2;
                                                        j += (long) i3;
                                                        fileOutputStream3 = fileOutputStream;
                                                        int i8 = i2;
                                                        i5 = (int) ((j / jAvailable) * 100.0d);
                                                        try {
                                                            this.progress = i5;
                                                            if (i5 > 100) {
                                                                this.progress = 100;
                                                            }
                                                            str2 = str4;
                                                            fileOutputStream = fileOutputStream3;
                                                            i2 = i8;
                                                            i = 0;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            fileOutputStream = fileOutputStream3;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                inputStreamOpenInputStream.close();
                                                throw th;
                                            }
                                            fileOutputStream2 = fileOutputStream;
                                            i4 = i2;
                                            if (this.cancelled) {
                                                fileOutputStream2.close();
                                                try {
                                                    file.delete();
                                                    fileOutputStream = fileOutputStream4;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    fileOutputStream = fileOutputStream4;
                                                }
                                            } else {
                                                if (i4 > 0) {
                                                    this.progress = 100;
                                                }
                                                fileOutputStream = fileOutputStream2;
                                            }
                                            try {
                                                if (this.selectMultiple) {
                                                    if (this.savedFiles == null) {
                                                        this.savedFiles = new ArrayList<>();
                                                    }
                                                    this.savedFiles.add(str);
                                                }
                                                String absolutePath = file.getAbsolutePath();
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                inputStreamOpenInputStream.close();
                                                return absolutePath;
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fileOutputStream4 = null;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                        } else {
                            strSubstring = null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        strSubstring = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                strSubstring = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e4) {
            e = e4;
            cursorQuery = null;
            strSubstring = null;
        } catch (Throwable th8) {
            th = th8;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (strSubstring != null || strSubstring.length() < 3) {
            strSubstring = C0232f4.D;
        }
        iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf <= 0 && iLastIndexOf < strSubstring.length() - 1) {
            strSubstring2 = strSubstring.substring(iLastIndexOf);
        } else {
            type = contentResolver.getType(uri);
            if (type != null || (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type)) == null || extensionFromMimeType.length() <= 0) {
                strSubstring2 = null;
            } else {
                strSubstring2 = "." + extensionFromMimeType;
            }
        }
        if (strSubstring2 == null) {
            strSubstring2 = ".tmp";
        }
        i = 0;
        if (!NativeGalleryMediaPickerFragment.tryPreserveFilenames) {
            strSubstring = this.savePathFilename;
        } else if (strSubstring.endsWith(strSubstring2)) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - strSubstring2.length());
        }
        try {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            j = 0;
            if (jAvailable < 0) {
                jAvailable = inputStreamOpenInputStream.available();
                if (jAvailable < 0) {
                    jAvailable = 0;
                }
            }
            str = strSubstring + strSubstring2;
            if (this.savedFiles != null) {
                r16 = 1;
                i6 = 0;
                while (i6 < this.savedFiles.size()) {
                    if (this.savedFiles.get(i6).equals(str)) {
                        int i9 = r16 + 1;
                        r16 = i9;
                        str = strSubstring + i9 + strSubstring2;
                        i6 = -1;
                    }
                    i6++;
                    r16 = r16;
                }
            }
            file = new File(this.savePathDirectory, str);
            fileOutputStream = new FileOutputStream(file, false);
            i2 = (jAvailable > 0L ? 1 : (jAvailable == 0L ? 0 : -1));
            this.progress = i2 > 0 ? 0 : -1;
            bArr = new byte[4096];
            while (true) {
                i3 = inputStreamOpenInputStream.read(bArr);
                fileOutputStream4 = fileOutputStream4;
                if (i3 > 0) {
                    break;
                    break;
                }
                if (this.cancelled) {
                    break;
                    break;
                }
                fileOutputStream.write(bArr, i, i3);
                if (i2 > 0) {
                    String str5 = str2;
                    j += (long) i3;
                    fileOutputStream3 = fileOutputStream;
                    int i10 = i2;
                    i5 = (int) ((j / jAvailable) * 100.0d);
                    this.progress = i5;
                    if (i5 > 100) {
                        this.progress = 100;
                    }
                    str2 = str5;
                    fileOutputStream = fileOutputStream3;
                    i2 = i10;
                    i = 0;
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                inputStreamOpenInputStream.close();
                throw th;
            }
            fileOutputStream2 = fileOutputStream;
            i4 = i2;
            if (this.cancelled) {
                fileOutputStream2.close();
                file.delete();
                fileOutputStream = fileOutputStream4;
            } else {
                if (i4 > 0) {
                    this.progress = 100;
                }
                fileOutputStream = fileOutputStream2;
            }
            if (this.selectMultiple) {
                if (this.savedFiles == null) {
                    this.savedFiles = new ArrayList<>();
                }
                this.savedFiles.add(str);
            }
            String absolutePath2 = file.getAbsolutePath();
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            inputStreamOpenInputStream.close();
            return absolutePath2;
        } catch (Exception e5) {
            e = e5;
            r16 = 0;
            str3 = "Exception:";
        }
        Log.e("Unity", str3, e);
        return r16;
    }
}
