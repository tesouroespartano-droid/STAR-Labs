package com.yasirkula.unity;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.ironsource.C0198d4;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class NativeGallery {
    public static final int MEDIA_TYPE_AUDIO = 4;
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static boolean mediaSaveOmitDCIM;
    public static boolean overwriteExistingMedia;

    public static boolean CanSelectMultipleMedia() {
        return true;
    }

    public static boolean CanSelectMultipleMediaTypes() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021e A[PHI: r1 r3 r6 r32
      0x021e: PHI (r1v21 android.net.Uri) = (r1v20 android.net.Uri), (r1v25 android.net.Uri) binds: [B:101:0x021c, B:91:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r3v20 android.database.Cursor) = (r3v19 android.database.Cursor), (r3v23 android.database.Cursor) binds: [B:101:0x021c, B:91:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r6v15 android.net.Uri) = (r6v14 android.net.Uri), (r6v21 android.net.Uri) binds: [B:101:0x021c, B:91:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r32v4 java.lang.String) = (r32v3 java.lang.String), (r32v10 java.lang.String) binds: [B:101:0x021c, B:91:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x023f A[Catch: IllegalStateException -> 0x0290, Exception -> 0x02a3, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0290, blocks: (B:110:0x0239, B:112:0x023f), top: B:236:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0272 A[Catch: Exception -> 0x027e, IllegalStateException -> 0x0280, TryCatch #22 {IllegalStateException -> 0x0280, Exception -> 0x027e, blocks: (B:116:0x026c, B:118:0x0272, B:121:0x0279), top: B:266:0x026c }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0279 A[Catch: Exception -> 0x027e, IllegalStateException -> 0x0280, TRY_LEAVE, TryCatch #22 {IllegalStateException -> 0x0280, Exception -> 0x027e, blocks: (B:116:0x026c, B:118:0x0272, B:121:0x0279), top: B:266:0x026c }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0286  */
    /* JADX WARN: Code duplicated, block: B:158:0x0315  */
    /* JADX WARN: Code duplicated, block: B:160:0x0321  */
    /* JADX WARN: Code duplicated, block: B:164:0x032f A[LOOP:0: B:52:0x0122->B:164:0x032f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x042f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0432 A[Catch: Exception -> 0x048e, PHI: r1 r3 r6
      0x0432: PHI (r1v6 android.net.Uri) = (r1v4 android.net.Uri), (r1v11 android.net.Uri) binds: [B:219:0x0443, B:209:0x0430] A[DONT_GENERATE, DONT_INLINE]
      0x0432: PHI (r3v8 android.database.Cursor) = (r3v6 android.database.Cursor), (r3v10 android.database.Cursor) binds: [B:219:0x0443, B:209:0x0430] A[DONT_GENERATE, DONT_INLINE]
      0x0432: PHI (r6v9 android.net.Uri) = (r6v7 android.net.Uri), (r6v5 android.net.Uri) binds: [B:219:0x0443, B:209:0x0430] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048e, blocks: (B:189:0x03d0, B:191:0x03db, B:193:0x03e8, B:224:0x0458, B:210:0x0432, B:222:0x0448, B:223:0x0450, B:229:0x048a, B:230:0x048d), top: B:235:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0448 A[Catch: Exception -> 0x048e, TRY_ENTER, TryCatch #0 {Exception -> 0x048e, blocks: (B:189:0x03d0, B:191:0x03db, B:193:0x03e8, B:224:0x0458, B:210:0x0432, B:222:0x0448, B:223:0x0450, B:229:0x048a, B:230:0x048d), top: B:235:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0450 A[Catch: Exception -> 0x048e, TryCatch #0 {Exception -> 0x048e, blocks: (B:189:0x03d0, B:191:0x03db, B:193:0x03e8, B:224:0x0458, B:210:0x0432, B:222:0x0448, B:223:0x0450, B:229:0x048a, B:230:0x048d), top: B:235:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x048a A[Catch: Exception -> 0x048e, TryCatch #0 {Exception -> 0x048e, blocks: (B:189:0x03d0, B:191:0x03db, B:193:0x03e8, B:224:0x0458, B:210:0x0432, B:222:0x0448, B:223:0x0450, B:229:0x048a, B:230:0x048d), top: B:235:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0494 A[EDGE_INSN: B:271:0x0494->B:233:0x0494 BREAK  A[LOOP:0: B:52:0x0122->B:164:0x032f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0203  */
    public static String SaveMedia(Context context, int mediaType, String filePath, String directoryName) throws Throwable {
        Uri uri;
        String str;
        String strSubstring;
        int i;
        File file;
        Cursor cursor;
        Uri uriWithAppendedId;
        Cursor cursorQuery;
        Cursor cursor2;
        Uri uri2;
        Uri uriWithAppendedId2;
        Cursor cursorQuery2;
        Uri uriInsert;
        Uri uri3;
        Context context2;
        String str2;
        File file2;
        String strGetPathFromURI;
        File file3 = new File(filePath);
        if (!file3.exists()) {
            Log.e("Unity", "Original media file is missing or inaccessible!");
            return "";
        }
        int iLastIndexOf = filePath.lastIndexOf(47);
        int iLastIndexOf2 = filePath.lastIndexOf(46);
        String strSubstring2 = iLastIndexOf >= 0 ? filePath.substring(iLastIndexOf + 1) : filePath;
        String strSubstring3 = iLastIndexOf2 >= 0 ? filePath.substring(iLastIndexOf2 + 1) : "";
        String mimeTypeFromExtension = strSubstring3.length() > 0 ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring3.toLowerCase(Locale.ENGLISH)) : null;
        ContentValues contentValues = new ContentValues();
        String str3 = C0198d4.i.D0;
        contentValues.put(C0198d4.i.D0, strSubstring2);
        contentValues.put("_display_name", strSubstring2);
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() > 0) {
            contentValues.put("mime_type", mimeTypeFromExtension);
        }
        if (mediaType == 1) {
            int iGetImageOrientation = NativeGalleryUtils.GetImageOrientation(context, filePath);
            if (iGetImageOrientation == 3) {
                contentValues.put("orientation", (Integer) 180);
            } else if (iGetImageOrientation == 5 || iGetImageOrientation == 6) {
                contentValues.put("orientation", (Integer) 90);
            } else if (iGetImageOrientation == 7 || iGetImageOrientation == 8) {
                contentValues.put("orientation", (Integer) 270);
            }
        }
        if (mediaType == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (mediaType == 2) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uri4 = uri;
        String str4 = "Saved media to: ";
        String str5 = "Exception:";
        if (Build.VERSION.SDK_INT >= 29) {
            String str6 = "relative_path";
            contentValues.put("relative_path", mediaSaveOmitDCIM ? directoryName + "/" : "DCIM/" + directoryName + "/");
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            int i2 = 0;
            while (i2 < 2) {
                File file4 = file3;
                contentValues.put("is_pending", (Boolean) true);
                if (i2 == 1) {
                    String str7 = ((strSubstring3.length() <= 0 || strSubstring2.length() <= strSubstring3.length()) ? strSubstring2 : strSubstring2.substring(0, (strSubstring2.length() - strSubstring3.length()) - 1)) + " " + new SimpleDateFormat("yyyy-MM-dd'T'HH.mm.ss").format(new Date());
                    if (strSubstring3.length() > 0) {
                        str7 = str7 + "." + strSubstring3;
                    }
                    contentValues.put(str3, str7);
                    contentValues.put("_display_name", str7);
                }
                if (!overwriteExistingMedia) {
                    uriInsert = context.getContentResolver().insert(uri4, contentValues);
                    str6 = str6;
                    uri2 = uri4;
                } else {
                    try {
                        try {
                            Uri uri5 = uri4;
                            try {
                                cursorQuery2 = context.getContentResolver().query(uri5, new String[]{"_id"}, "relative_path=? AND _display_name=?", new String[]{contentValues.getAsString(str6), contentValues.getAsString("_display_name")}, null);
                                uri2 = uri5;
                                if (cursorQuery2 != null) {
                                    try {
                                        try {
                                            if (cursorQuery2.moveToFirst()) {
                                                str6 = str6;
                                                try {
                                                    uriWithAppendedId2 = ContentUris.withAppendedId(uri2, cursorQuery2.getLong(cursorQuery2.getColumnIndex("_id")));
                                                    try {
                                                        Log.d("Unity", "Overwriting existing media");
                                                    } catch (Exception e) {
                                                        e = e;
                                                        Log.e("Unity", "Couldn't overwrite existing media's metadata:", e);
                                                        if (cursorQuery2 != null) {
                                                            cursorQuery2.close();
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    uriWithAppendedId2 = null;
                                                    Log.e("Unity", "Couldn't overwrite existing media's metadata:", e);
                                                    if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                    uriInsert = uriWithAppendedId2;
                                                    if (uriInsert == null) {
                                                        uriInsert = context.getContentResolver().insert(uri2, contentValues);
                                                    }
                                                    uri3 = uriInsert;
                                                    if (uri3 != null) {
                                                        try {
                                                            try {
                                                                try {
                                                                    file2 = file4;
                                                                    try {
                                                                        if (NativeGalleryUtils.WriteFileToStream(file2, context.getContentResolver().openOutputStream(uri3))) {
                                                                            contentValues.put("is_pending", (Boolean) false);
                                                                            context.getContentResolver().update(uri3, contentValues, null, null);
                                                                            str2 = str4;
                                                                            try {
                                                                                Log.d("Unity", str2 + uri3.toString());
                                                                                context2 = context;
                                                                                try {
                                                                                    strGetPathFromURI = NativeGalleryUtils.GetPathFromURI(context2, uri3);
                                                                                    if (strGetPathFromURI != null) {
                                                                                        strGetPathFromURI = uri3.toString();
                                                                                    } else {
                                                                                        strGetPathFromURI = uri3.toString();
                                                                                    }
                                                                                    return strGetPathFromURI;
                                                                                } catch (IllegalStateException e3) {
                                                                                    e = e3;
                                                                                } catch (Exception e4) {
                                                                                    e = e4;
                                                                                    Log.e("Unity", str5, e);
                                                                                    if (overwriteExistingMedia && e.getClass().getName().equals("android.app.RecoverableSecurityException")) {
                                                                                        try {
                                                                                            context.startIntentSender(((RemoteAction) e.getClass().getMethod("getUserAction", new Class[0]).invoke(e, new Object[0])).getActionIntent().getIntentSender(), null, 0, 0, 0);
                                                                                            String strGetPathFromURI2 = NativeGalleryUtils.GetPathFromURI(context, uri3);
                                                                                            return (strGetPathFromURI2 == null || strGetPathFromURI2.length() <= 0) ? uri3.toString() : strGetPathFromURI2;
                                                                                        } catch (Exception e5) {
                                                                                            Log.e("Unity", "RecoverableSecurityException failure:", e5);
                                                                                            return "";
                                                                                        }
                                                                                    }
                                                                                    context2.getContentResolver().delete(uri3, null, null);
                                                                                    return "";
                                                                                }
                                                                            } catch (IllegalStateException e6) {
                                                                                e = e6;
                                                                            }
                                                                        } else {
                                                                            str2 = str4;
                                                                            str3 = str3;
                                                                            str5 = str5;
                                                                        }
                                                                    } catch (IllegalStateException e7) {
                                                                        e = e7;
                                                                        str2 = str4;
                                                                    }
                                                                } catch (IllegalStateException e8) {
                                                                    e = e8;
                                                                    str2 = str4;
                                                                    file2 = file4;
                                                                }
                                                            } catch (IllegalStateException e9) {
                                                                e = e9;
                                                                str2 = str4;
                                                                file2 = file4;
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            context2 = context;
                                                        }
                                                        if (i2 == 1) {
                                                            Log.e("Unity", str5, e);
                                                        }
                                                        context.getContentResolver().delete(uri3, null, null);
                                                    } else {
                                                        str2 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                        file2 = file4;
                                                    }
                                                    if (overwriteExistingMedia) {
                                                        break;
                                                        return "";
                                                    }
                                                    i2++;
                                                    str4 = str2;
                                                    uri4 = uri2;
                                                    str5 = str5;
                                                    str3 = str3;
                                                    strSubstring2 = strSubstring2;
                                                    file3 = file2;
                                                    str6 = str6;
                                                }
                                            } else {
                                                str6 = str6;
                                                uriWithAppendedId2 = null;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str6 = str6;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery2;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    str6 = str6;
                                    uriWithAppendedId2 = null;
                                }
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                uri2 = uri5;
                                uriWithAppendedId2 = null;
                                cursorQuery2 = null;
                                Log.e("Unity", "Couldn't overwrite existing media's metadata:", e);
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                uriInsert = uriWithAppendedId2;
                                if (uriInsert == null) {
                                    uriInsert = context.getContentResolver().insert(uri2, contentValues);
                                }
                                uri3 = uriInsert;
                                if (uri3 != null) {
                                    file2 = file4;
                                    if (NativeGalleryUtils.WriteFileToStream(file2, context.getContentResolver().openOutputStream(uri3))) {
                                        contentValues.put("is_pending", (Boolean) false);
                                        context.getContentResolver().update(uri3, contentValues, null, null);
                                        str2 = str4;
                                        Log.d("Unity", str2 + uri3.toString());
                                        context2 = context;
                                        strGetPathFromURI = NativeGalleryUtils.GetPathFromURI(context2, uri3);
                                        if (strGetPathFromURI != null) {
                                            strGetPathFromURI = uri3.toString();
                                        } else {
                                            strGetPathFromURI = uri3.toString();
                                        }
                                        return strGetPathFromURI;
                                    }
                                    str2 = str4;
                                    str3 = str3;
                                    str5 = str5;
                                    if (i2 == 1) {
                                        Log.e("Unity", str5, e);
                                    }
                                    context.getContentResolver().delete(uri3, null, null);
                                } else {
                                    str2 = str4;
                                    str3 = str3;
                                    str5 = str5;
                                    file2 = file4;
                                }
                                if (overwriteExistingMedia) {
                                    break;
                                    return "";
                                }
                                i2++;
                                str4 = str2;
                                uri4 = uri2;
                                str5 = str5;
                                str3 = str3;
                                strSubstring2 = strSubstring2;
                                file3 = file2;
                                str6 = str6;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            uri2 = uri4;
                        }
                        uriInsert = uriWithAppendedId2;
                        if (uriInsert == null) {
                            uriInsert = context.getContentResolver().insert(uri2, contentValues);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = null;
                    }
                }
                uri3 = uriInsert;
                if (uri3 != null) {
                    file2 = file4;
                    if (NativeGalleryUtils.WriteFileToStream(file2, context.getContentResolver().openOutputStream(uri3))) {
                        contentValues.put("is_pending", (Boolean) false);
                        context.getContentResolver().update(uri3, contentValues, null, null);
                        str2 = str4;
                        Log.d("Unity", str2 + uri3.toString());
                        context2 = context;
                        strGetPathFromURI = NativeGalleryUtils.GetPathFromURI(context2, uri3);
                        if (strGetPathFromURI != null || strGetPathFromURI.length() <= 0) {
                            strGetPathFromURI = uri3.toString();
                        }
                        return strGetPathFromURI;
                    }
                    str2 = str4;
                    str3 = str3;
                    str5 = str5;
                    if (i2 == 1) {
                        Log.e("Unity", str5, e);
                    }
                    context.getContentResolver().delete(uri3, null, null);
                } else {
                    str2 = str4;
                    str3 = str3;
                    str5 = str5;
                    file2 = file4;
                }
                if (overwriteExistingMedia) {
                    break;
                }
                i2++;
                str4 = str2;
                uri4 = uri2;
                str5 = str5;
                str3 = str3;
                strSubstring2 = strSubstring2;
                file3 = file2;
                str6 = str6;
            }
        } else {
            String str8 = strSubstring2;
            Uri uri6 = uri4;
            File file5 = new File(mediaSaveOmitDCIM ? Environment.getExternalStorageDirectory() : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), directoryName);
            file5.mkdirs();
            if (strSubstring3.length() <= 0 || str8.length() <= strSubstring3.length()) {
                str = str8;
                strSubstring = str;
            } else {
                str = str8;
                strSubstring = str.substring(0, (str8.length() - strSubstring3.length()) - 1);
            }
            while (true) {
                file = new File(file5, str);
                int i3 = i + 1;
                str = strSubstring + i;
                if (strSubstring3.length() > 0) {
                    str = str + "." + strSubstring3;
                }
                i = (!overwriteExistingMedia && file.exists()) ? i3 : 1;
            }
            try {
                if (NativeGalleryUtils.WriteFileToStream(file3, new FileOutputStream(file))) {
                    contentValues.put("_data", file.getAbsolutePath());
                    if (!overwriteExistingMedia) {
                        context.getContentResolver().insert(uri6, contentValues);
                    } else {
                        try {
                            try {
                                try {
                                    cursorQuery = context.getContentResolver().query(uri6, new String[]{"_id"}, "_data=?", new String[]{contentValues.getAsString("_data")}, null);
                                    if (cursorQuery != null) {
                                        try {
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    uriWithAppendedId = ContentUris.withAppendedId(uri6, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                                                    try {
                                                        Log.d("Unity", "Overwriting existing media");
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        Log.e("Unity", "Couldn't overwrite existing media's metadata:", e);
                                                        if (cursorQuery != null) {
                                                        }
                                                        if (uriWithAppendedId == null) {
                                                            context.getContentResolver().insert(uri6, contentValues);
                                                        } else {
                                                            context.getContentResolver().update(uriWithAppendedId, contentValues, null, null);
                                                        }
                                                        Log.d("Unity", "Saved media to: " + file.getPath());
                                                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                                        intent.setData(Uri.fromFile(file));
                                                        context.sendBroadcast(intent);
                                                        return file.getAbsolutePath();
                                                    }
                                                } else {
                                                    uriWithAppendedId = null;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                uriWithAppendedId = null;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        uriWithAppendedId = null;
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    uri6 = uri6;
                                    uriWithAppendedId = null;
                                    cursorQuery = null;
                                    Log.e("Unity", "Couldn't overwrite existing media's metadata:", e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (uriWithAppendedId == null) {
                                        context.getContentResolver().insert(uri6, contentValues);
                                    } else {
                                        context.getContentResolver().update(uriWithAppendedId, contentValues, null, null);
                                    }
                                    Log.d("Unity", "Saved media to: " + file.getPath());
                                    Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                    intent2.setData(Uri.fromFile(file));
                                    context.sendBroadcast(intent2);
                                    return file.getAbsolutePath();
                                }
                            } catch (Exception e17) {
                                e = e17;
                            }
                            if (uriWithAppendedId == null) {
                                context.getContentResolver().insert(uri6, contentValues);
                            } else {
                                context.getContentResolver().update(uriWithAppendedId, contentValues, null, null);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.d("Unity", "Saved media to: " + file.getPath());
                    Intent intent3 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent3.setData(Uri.fromFile(file));
                    context.sendBroadcast(intent3);
                    return file.getAbsolutePath();
                }
            } catch (Exception e18) {
                Log.e("Unity", str5, e18);
            }
        }
        return "";
    }

    public static void MediaDeleteFile(Context context, String path, int mediaType) {
        if (mediaType == 1) {
            context.getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_data=?", new String[]{path});
        } else if (mediaType == 2) {
            context.getContentResolver().delete(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "_data=?", new String[]{path});
        } else {
            context.getContentResolver().delete(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "_data=?", new String[]{path});
        }
    }

    public static void PickMedia(Context context, final NativeGalleryMediaReceiver mediaReceiver, int mediaType, boolean selectMultiple, String savePath, String mime, String title) {
        if (CheckPermission(context, true) != 1) {
            if (!selectMultiple) {
                mediaReceiver.OnMediaReceived("");
                return;
            } else {
                mediaReceiver.OnMultipleMediaReceived("");
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt(NativeGalleryMediaPickerFragment.MEDIA_TYPE_ID, mediaType);
        bundle.putBoolean(NativeGalleryMediaPickerFragment.SELECT_MULTIPLE_ID, selectMultiple);
        bundle.putString(NativeGalleryMediaPickerFragment.SAVE_PATH_ID, savePath);
        bundle.putString(NativeGalleryMediaPickerFragment.MIME_ID, mime);
        bundle.putString(NativeGalleryMediaPickerFragment.TITLE_ID, title);
        NativeGalleryMediaPickerFragment nativeGalleryMediaPickerFragment = new NativeGalleryMediaPickerFragment(mediaReceiver);
        nativeGalleryMediaPickerFragment.setArguments(bundle);
        ((Activity) context).getFragmentManager().beginTransaction().add(0, nativeGalleryMediaPickerFragment).commit();
    }

    public static int CheckPermission(Context context, final boolean readPermission) {
        if (!readPermission && Build.VERSION.SDK_INT >= 29) {
            return 1;
        }
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return (readPermission || context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) ? 1 : 0;
        }
        return 0;
    }

    public static void RequestPermission(Context context, final NativeGalleryPermissionReceiver permissionReceiver, final boolean readPermission, final int lastCheckResult) {
        if (CheckPermission(context, readPermission) == 1) {
            permissionReceiver.OnPermissionResult(1);
            return;
        }
        if (lastCheckResult == 0) {
            permissionReceiver.OnPermissionResult(0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(NativeGalleryPermissionFragment.READ_PERMISSION_ONLY, readPermission);
        NativeGalleryPermissionFragment nativeGalleryPermissionFragment = new NativeGalleryPermissionFragment(permissionReceiver);
        nativeGalleryPermissionFragment.setArguments(bundle);
        ((Activity) context).getFragmentManager().beginTransaction().add(0, nativeGalleryPermissionFragment).commit();
    }

    public static void OpenSettings(Context context) {
        Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        context.startActivity(intent);
    }

    public static String GetMimeTypeFromExtension(String extension) {
        String mimeTypeFromExtension;
        return (extension == null || extension.length() == 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension.toLowerCase(Locale.ENGLISH))) == null) ? "" : mimeTypeFromExtension;
    }

    public static String LoadImageAtPath(Context context, String path, final String temporaryFilePath, final int maxSize) {
        return NativeGalleryUtils.LoadImageAtPath(context, path, temporaryFilePath, maxSize);
    }

    public static String GetImageProperties(Context context, final String path) {
        return NativeGalleryUtils.GetImageProperties(context, path);
    }

    public static String GetVideoProperties(Context context, final String path) {
        return NativeGalleryUtils.GetVideoProperties(context, path);
    }

    public static String GetVideoThumbnail(Context context, final String path, final String savePath, final boolean saveAsJpeg, int maxSize, double captureTime) {
        return NativeGalleryUtils.GetVideoThumbnail(context, path, savePath, saveAsJpeg, maxSize, captureTime);
    }
}
