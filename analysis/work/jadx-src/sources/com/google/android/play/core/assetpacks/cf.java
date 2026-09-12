package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes.dex */
final class cf {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractChunkTaskHandler");
    private final byte[] b = new byte[8192];
    private final bh c;
    private final co d;
    private final ea e;
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    cf(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar, ea eaVar) {
        this.c = bhVar;
        this.f = aqVar;
        this.g = aqVar2;
        this.d = coVar;
        this.e = eaVar;
    }

    private final File b(ce ceVar) {
        File fileP = this.c.p(ceVar.l, ceVar.a, ceVar.b, ceVar.d);
        if (!fileP.exists()) {
            fileP.mkdirs();
        }
        return fileP;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    public final void a(ce ceVar) {
        InputStream sequenceInputStream;
        es esVarB;
        File fileC;
        long length;
        int iMin;
        int iMax;
        bh bhVar = this.c;
        String str = ceVar.l;
        int i = ceVar.a;
        long j = ceVar.b;
        String str2 = ceVar.d;
        em emVar = new em(bhVar, str, i, j, str2);
        File fileO = bhVar.o(str, i, j, str2);
        if (!fileO.exists()) {
            fileO.mkdirs();
        }
        try {
            InputStream inputStream = ceVar.j;
            InputStream gZIPInputStream = ceVar.e != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                if (ceVar.f > 0) {
                    el elVarB = emVar.b();
                    int iB = elVarB.b();
                    int i2 = ceVar.f;
                    if (iB != i2 - 1) {
                        throw new ck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(elVarB.b())), ceVar.k);
                    }
                    int iA = elVarB.a();
                    if (iA == 1) {
                        a.a("Resuming zip entry from last chunk during file %s.", elVarB.e());
                        File file = new File(elVarB.e());
                        if (!file.exists()) {
                            throw new ck("Partial file specified in checkpoint does not exist. Corrupt directory.", ceVar.k);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(elVarB.c());
                        long jD = elVarB.d();
                        do {
                            iMin = (int) Math.min(jD, 8192L);
                            iMax = Math.max(gZIPInputStream.read(this.b, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.b, 0, iMax);
                            }
                            jD -= (long) iMax;
                            if (jD <= 0) {
                                break;
                            }
                        } while (iMax > 0);
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            a.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            emVar.g(file.getCanonicalPath(), length2, jD, ceVar.f);
                        } else {
                            sequenceInputStream = gZIPInputStream;
                        }
                    } else if (iA == 2) {
                        a.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileM = this.c.m(ceVar.l, ceVar.a, ceVar.b, ceVar.d);
                        if (!fileM.exists()) {
                            throw new ck("Checkpoint extension file not found.", ceVar.k);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileM), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new ck(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(elVarB.a())), ceVar.k);
                        }
                        a.a("Resuming central directory from last chunk.", new Object[0]);
                        emVar.d(gZIPInputStream, elVarB.c());
                        if (!ceVar.a()) {
                            throw new ck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", ceVar.k);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    bw bwVar = new bw(sequenceInputStream);
                    File fileB = b(ceVar);
                    do {
                        esVarB = bwVar.b();
                        if (!esVarB.e() && !bwVar.c()) {
                            if (!esVarB.h() || esVarB.g()) {
                                emVar.k(esVarB.f(), bwVar);
                            } else {
                                emVar.j(esVarB.f());
                                File file2 = new File(fileB, esVarB.c());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i3 = bwVar.read(this.b, 0, 8192);
                                while (i3 > 0) {
                                    fileOutputStream.write(this.b, 0, i3);
                                    i3 = bwVar.read(this.b, 0, 8192);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (bwVar.d()) {
                            break;
                        }
                    } while (!bwVar.c());
                    if (bwVar.c()) {
                        a.a("Writing central directory metadata.", new Object[0]);
                        emVar.k(esVarB.f(), sequenceInputStream);
                    }
                    if (!ceVar.a()) {
                        if (esVarB.e()) {
                            a.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            emVar.h(esVarB.f(), ceVar.f);
                        } else if (bwVar.c()) {
                            a.a("Writing slice checkpoint for central directory.", new Object[0]);
                            emVar.f(ceVar.f);
                        } else {
                            if (esVarB.a() == 0) {
                                a.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileC = new File(b(ceVar), esVarB.c());
                                length = esVarB.b() - bwVar.a();
                                if (fileC.length() != length) {
                                    throw new ck("Partial file is of unexpected size.");
                                }
                            } else {
                                a.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileC = emVar.c();
                                length = fileC.length();
                            }
                            emVar.g(fileC.getCanonicalPath(), length, bwVar.a(), ceVar.f);
                        }
                    }
                }
                gZIPInputStream.close();
                if (ceVar.a()) {
                    try {
                        emVar.i(ceVar.f);
                    } catch (IOException e) {
                        a.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                        throw new ck("Writing extraction finished checkpoint failed.", e, ceVar.k);
                    }
                }
                a.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(ceVar.f), ceVar.d, ceVar.l, Integer.valueOf(ceVar.k));
                ((y) this.f.a()).g(ceVar.k, ceVar.l, ceVar.d, ceVar.f);
                try {
                    ceVar.j.close();
                } catch (IOException unused) {
                    a.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(ceVar.f), ceVar.d, ceVar.l);
                }
                if (ceVar.i == 3) {
                    bb bbVar = (bb) this.g.a();
                    String str3 = ceVar.l;
                    long j2 = ceVar.h;
                    bbVar.d(AssetPackState.a(str3, 3, 0, j2, j2, this.d.b(str3, ceVar), 1, ceVar.c, this.e.a(ceVar.l)));
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            a.b("IOException during extraction %s.", e2.getMessage());
            throw new ck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(ceVar.f), ceVar.d, ceVar.l, Integer.valueOf(ceVar.k)), e2, ceVar.k);
        }
    }
}
