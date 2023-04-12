package readerWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("file-writer-test.txt");

        writer.write("FileWriter.write() can supply string");

        writer.close();
    }
}
