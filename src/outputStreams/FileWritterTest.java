package outputStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWritterTest {

    public static void main(String[] args) throws IOException {
        File file = new File("new-file.txt");
        System.out.println("file.exists() = " + file.exists());

        OutputStream fos = new FileOutputStream(file);

        fos.write("hello from file write test".getBytes(StandardCharsets.UTF_8));

        fos.flush();

        fos.close();
    }
}
