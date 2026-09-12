package com.yasirkula.unity;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class FileBrowserSAFEntry {
    private static final String TAG = "DocumentFile";
    private Context mContext;
    private Uri mUri;

    public static FileBrowserSAFEntry fromTreeUri(Context context, Uri uri) {
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        if (uriBuildDocumentUriUsingTree == null) {
            return null;
        }
        return new FileBrowserSAFEntry(context, uriBuildDocumentUriUsingTree);
    }

    public FileBrowserSAFEntry(Context context, Uri uri) {
        this.mContext = context;
        this.mUri = uri;
    }

    public FileBrowserSAFEntry createFile(String mimeType, String displayName) {
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(this.mContext.getContentResolver(), this.mUri, mimeType, displayName);
            if (uriCreateDocument != null) {
                return new FileBrowserSAFEntry(this.mContext, uriCreateDocument);
            }
            return null;
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
            return null;
        }
    }

    public FileBrowserSAFEntry createDirectory(String displayName) {
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(this.mContext.getContentResolver(), this.mUri, "vnd.android.document/directory", displayName);
            if (uriCreateDocument != null) {
                return new FileBrowserSAFEntry(this.mContext, uriCreateDocument);
            }
            return null;
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
            return null;
        }
    }

    public Uri getUri() {
        return this.mUri;
    }

    public String getName() {
        return queryForString("_display_name", null);
    }

    public String getType() {
        String rawType = getRawType();
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public boolean isDirectory() {
        return "vnd.android.document/directory".equals(getRawType());
    }

    public boolean isFile() {
        String rawType = getRawType();
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public long lastModified() {
        return queryForLong("last_modified", 0L);
    }

    public long length() {
        return queryForLong("_size", 0L);
    }

    public boolean canRead() {
        return this.mContext.checkCallingOrSelfUriPermission(this.mUri, 1) == 0 && !TextUtils.isEmpty(getRawType());
    }

    public boolean canWrite() {
        if (this.mContext.checkCallingOrSelfUriPermission(this.mUri, 2) != 0) {
            return false;
        }
        String rawType = getRawType();
        int iQueryForInt = queryForInt("flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((iQueryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (iQueryForInt & 8) == 0) {
            return (TextUtils.isEmpty(rawType) || (iQueryForInt & 2) == 0) ? false : true;
        }
        return true;
    }

    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.mContext.getContentResolver(), this.mUri);
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
            return false;
        }
    }

    public boolean exists() {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.mContext.getContentResolver().query(this.mUri, new String[]{"document_id"}, null, null, null);
                boolean z = cursorQuery.getCount() > 0;
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                        return z;
                    } catch (Exception e) {
                        Log.e(TAG, "Exception:", e);
                    }
                }
                return z;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Exception e2) {
                    Log.e(TAG, "Exception:", e2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            Log.w(TAG, "Failed query: " + e3);
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception e4) {
                    Log.e(TAG, "Exception:", e4);
                }
            }
            return false;
        }
    }

    public ArrayList<FileBrowserSAFEntry> listFiles() {
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = this.mUri;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList<FileBrowserSAFEntry> arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new FileBrowserSAFEntry(this.mContext, DocumentsContract.buildDocumentUriUsingTree(this.mUri, cursorQuery.getString(0))));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Exception:", e);
                }
            } catch (Exception e2) {
                Log.w("Unity", "Failed query: " + e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Exception e3) {
                    Log.e(TAG, "Exception:", e3);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void appendFilesToStringBuilder(StringBuilder stringBuilder) {
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = this.mUri;
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri)), new String[]{"document_id", "mime_type", "_display_name"}, null, null, null);
                    stringBuilder.append(cursorQuery.getCount()).append("<>");
                    if (cursorQuery.moveToNext()) {
                        int columnIndex = cursorQuery.getColumnIndex("document_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                        int columnIndex3 = cursorQuery.getColumnIndex("_display_name");
                        do {
                            stringBuilder.append("vnd.android.document/directory".equals(cursorQuery.getString(columnIndex2)) ? "d" : "f").append(cursorQuery.getString(columnIndex3)).append("<>").append(DocumentsContract.buildDocumentUriUsingTree(this.mUri, cursorQuery.getString(columnIndex)).toString()).append("<>");
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception e) {
                    Log.w("Unity", "Failed query: " + e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Exception e2) {
                Log.e(TAG, "Exception:", e2);
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Exception e3) {
                    Log.e(TAG, "Exception:", e3);
                    throw th;
                }
            }
            throw th;
        }
    }

    public String renameTo(String displayName) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.mContext.getContentResolver(), this.mUri, displayName);
            if (uriRenameDocument != null) {
                this.mUri = uriRenameDocument;
            }
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
        }
        return this.mUri.toString();
    }

    private String getRawType() {
        return queryForString("mime_type", null);
    }

    private String queryForString(String column, String defaultValue) {
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = this.mContext.getContentResolver().query(this.mUri, new String[]{column}, null, null, null);
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                                return string;
                            } catch (Exception e) {
                                Log.e(TAG, "Exception:", e);
                            }
                        }
                        return string;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return defaultValue;
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Exception:", e2);
                }
            } catch (Exception e3) {
                Log.w(TAG, "Failed query: " + e3);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return defaultValue;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Exception e4) {
                Log.e(TAG, "Exception:", e4);
                throw th;
            }
        }
    }

    private int queryForInt(String column, int defaultValue) {
        return (int) queryForLong(column, defaultValue);
    }

    private long queryForLong(String column, long defaultValue) {
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = this.mContext.getContentResolver().query(this.mUri, new String[]{column}, null, null, null);
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        long j = cursorQuery.getLong(0);
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                                return j;
                            } catch (Exception e) {
                                Log.e(TAG, "Exception:", e);
                            }
                        }
                        return j;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return defaultValue;
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Exception:", e2);
                }
            } catch (Exception e3) {
                Log.w(TAG, "Failed query: " + e3);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return defaultValue;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Exception e4) {
                Log.e(TAG, "Exception:", e4);
                throw th;
            }
        }
    }
}
