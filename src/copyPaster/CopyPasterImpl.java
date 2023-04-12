package copyPaster;

import myInputStreams.StringIs;

import java.io.*;

public class CopyPasterImpl implements CopyPaster{

    private final InputStream is;
    private final OutputStream os;

    public CopyPasterImpl(InputStream is, OutputStream os) {
        this.is = is;
        this.os = os;
    }

    @Override
    public void copy() throws IOException {
        while (is.available() > 0) {
            os.write(is.read());
        }
        is.close();
        os.close();
    }


    public static void main(String[] args) throws IOException {
        byte[] bytes = {65, 66, 67, 68};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        bytes[0] = 66;
        bytes[2] = 66;


        InputStream is = new StringIs("Hello from custom IS in copy paster");
        OutputStream os = new FileOutputStream(new File("Copy-paster-fos.txt"));

        CopyPasterImpl copyPasterImpl = new CopyPasterImpl(bais, os);
        copyPasterImpl.copy();
    }
}
