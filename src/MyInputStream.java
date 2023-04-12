import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyInputStream extends InputStream {
    private Queue<Character> elements;
    public MyInputStream (String str){
        char[] chars = str.toCharArray();
        byte [] bytes = str.getBytes(StandardCharsets.UTF_8);
        elements = new ArrayDeque<>();
        for (char b : chars){
            elements.add(b);
        }
    }
    //@Override
    public int read(){
        if (elements.size() == 0){
            return -1;
        }
        return elements.poll();
    }

    //@Override
    public int available(){
        return elements.size();
    }

    public static void main(String[] args) {
        MyInputStream ms = new MyInputStream("Hello, привет");
        while (ms.available() !=0){
            System.out.println("ms.read() = " + ms.read());
        }

        MyInputStream ms2 = new MyInputStream("Hello, привет");
        while (ms2.available() > 0){
            System.out.println("ms2.read() = " + (char) ms2.read());
        }
//        Scanner sc = new Scanner(ms);
//        System.out.println("sc.nextLine() = " + sc.nextLine());


        String s = "ї";
        System.out.println((int)s.charAt(0));

        byte bb = (byte) s.charAt(0);
        System.out.println("bb = " + bb);
    }
}