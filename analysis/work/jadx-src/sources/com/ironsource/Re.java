package com.ironsource;

/* JADX INFO: loaded from: classes2.dex */
public enum Re {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);

    private final int a;

    Re(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
