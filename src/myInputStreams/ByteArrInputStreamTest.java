package myInputStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrInputStreamTest {

    public static void main(String[] args) throws IOException {
        byte[] bytes = {65, 66, 67, 68};

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ByteArrayInputStream bais2 = new ByteArrayInputStream(bytes);

        Scanner s = new Scanner(bais);
        System.out.println("s.nextLine() = " + s.nextLine());

        while (bais2.available() > 0) {
            System.out.println("bais2.read() = " + (char) bais2.read());
        }

        bais.close();
        bais2.close();
    }
}
