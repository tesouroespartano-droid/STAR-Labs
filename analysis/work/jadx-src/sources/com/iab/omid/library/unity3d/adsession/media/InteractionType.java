package com.iab.omid.library.unity3d.adsession.media;

import com.ironsource.C0215e4;

/* JADX INFO: loaded from: classes2.dex */
public enum InteractionType {
    CLICK(C0215e4.d),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
