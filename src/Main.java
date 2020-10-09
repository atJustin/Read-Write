

public class Main {
    public static void main(String[] args) {

        Stream stream = new Stream();
        stream.write("Hello World");
        byte[] readBuffer = stream.read("testFile.txt");
        String readString = new String(readBuffer);
        System.out.println("read something: " + readString);
        System.out.println("git is weird");
    }
}
