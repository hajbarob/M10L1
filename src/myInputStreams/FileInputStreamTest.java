package myInputStreams;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        //File file22 = new File("..\\data22.txt");
        //File file = new File("C:\\Users\\vova\\aaa.txt");

        System.out.println("file.exists() = " + file.exists());
        //System.out.println("file22.exists() = " + file22.exists());

        InputStream fis = new FileInputStream(file);

        Scanner s = new Scanner(fis);
        System.out.println("s.nextLine() = " + s.nextLine());

        fis.close();
    }
}
