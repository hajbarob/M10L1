package copyPaster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyPasterImpl implements CopyPaster{

    private final CopyPasterImpl copyPaster;

    public FileCopyPasterImpl(FileInputStream fis, FileOutputStream fos) {
        copyPaster = new CopyPasterImpl(fis, fos);
    }

    @Override
    public void copy() throws IOException {
        copyPaster.copy();
    }

    public static void main(String[] args) throws IOException {
        new FileCopyPasterImpl(
                new FileInputStream("data.txt"),
                new FileOutputStream("..\\data-copy.txt")
        ).copy();
    }
}
