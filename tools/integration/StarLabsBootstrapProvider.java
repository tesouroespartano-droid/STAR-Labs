package com.star.labs.graal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.net.Uri;

public final class StarLabsBootstrapProvider extends ContentProvider {
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";
    private static final String TAG = "star-labs-overlay";

    @Override
    public boolean onCreate() {
        // XCore startup path is intentionally disabled. The provider remains as a
        // harmless inert bootstrap so the Graal app keeps its original lifecycle
        // without re-enabling the XCore overlay or runtime hooks.
        return true;
    }

    @Override public String getType(Uri uri) { return null; }
    @Override public android.database.Cursor query(Uri uri, String[] projection, String selection, String[] args, String sortOrder) { return null; }
    @Override public Uri insert(Uri uri, ContentValues values) { return null; }
    @Override public int delete(Uri uri, String selection, String[] args) { return 0; }
    @Override public int update(Uri uri, ContentValues values, String selection, String[] args) { return 0; }
}
