package org.autojs.autojs.pio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Stardust on Apr 29, 2017.
 */
public class PRandomAccessBinaryFile extends RandomAccessFile {

    private RandomAccessFile mRandomAccessFile;

    public PRandomAccessBinaryFile(String name, String mode) throws FileNotFoundException {
        super(name, mode);
    }

    public PRandomAccessBinaryFile(File file, String mode) throws FileNotFoundException {
        super(file, mode);
    }

    public String readline() throws IOException {
        return super.readLine();
    }

}
