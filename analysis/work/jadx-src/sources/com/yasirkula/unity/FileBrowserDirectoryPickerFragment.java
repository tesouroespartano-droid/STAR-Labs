package com.yasirkula.unity;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/* JADX INFO: loaded from: classes2.dex */
public class FileBrowserDirectoryPickerFragment extends Fragment {
    private static final int DIRECTORY_PICK_REQUEST_CODE = 74425;
    private final FileBrowserDirectoryReceiver directoryReceiver;

    public FileBrowserDirectoryPickerFragment() {
        this.directoryReceiver = null;
    }

    public FileBrowserDirectoryPickerFragment(final FileBrowserDirectoryReceiver directoryReceiver) {
        this.directoryReceiver = directoryReceiver;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.directoryReceiver == null) {
            onActivityResult(DIRECTORY_PICK_REQUEST_CODE, 0, null);
            return;
        }
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(67);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.content.extra.FANCY", true);
        intent.putExtra("android.content.extra.SHOW_FILESIZE", true);
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        try {
            startActivityForResult(intent, DIRECTORY_PICK_REQUEST_CODE);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getActivity(), "No apps can perform this action.", 1).show();
            onActivityResult(DIRECTORY_PICK_REQUEST_CODE, 0, null);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String string;
        String name;
        Uri data2;
        FileBrowserSAFEntry fileBrowserSAFEntryFromTreeUri;
        if (requestCode != DIRECTORY_PICK_REQUEST_CODE) {
            return;
        }
        if (resultCode == -1 && data != null && (data2 = data.getData()) != null && (fileBrowserSAFEntryFromTreeUri = FileBrowserSAFEntry.fromTreeUri(getActivity(), data2)) != null && fileBrowserSAFEntryFromTreeUri.exists()) {
            string = fileBrowserSAFEntryFromTreeUri.getUri().toString();
            name = fileBrowserSAFEntryFromTreeUri.getName();
            getActivity().getContentResolver().takePersistableUriPermission(data.getData(), 3);
        } else {
            string = "";
            name = "";
        }
        FileBrowserDirectoryReceiver fileBrowserDirectoryReceiver = this.directoryReceiver;
        if (fileBrowserDirectoryReceiver != null) {
            fileBrowserDirectoryReceiver.OnDirectoryPicked(string, name);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
