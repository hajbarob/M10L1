package myInputStreams;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class StringIs extends InputStream {

    private Queue<Byte> elements;

    public StringIs(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        elements = new ArrayDeque<>();
        for (byte b : bytes) {
            elements.add(b);
        }
    }

    @Override
    public int read() throws IOException {
        if(elements.size() == 0) {
            return -1;
        }
        return elements.poll();
    }

    @Override
    public int available() throws IOException {
        return elements.size();
    }


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new StringIs("Hello from custom IS"));
        System.out.println("s.nextLine() = " + s.nextLine());


        try(StringIs cIS = new StringIs("Hello from custom IS")) {
            while (cIS.available() > 0) {
                char read = (char) cIS.read();
                System.out.println("read = " + read);
            }
        }



    }
}
