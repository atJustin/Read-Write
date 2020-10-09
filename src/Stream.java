import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Stream {

    public void write(String textToWrite){
        try {
            String filename = "testFile.txt";
            OutputStream os = new FileOutputStream(filename);
            byte[] textAsByte = textToWrite.getBytes();
            os.write(textAsByte);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
            System.exit(0); // brutal exception handling
        }  catch (IOException ex) {
            System.err.println("couldn’t write data (fatal)");
            System.exit(0);
        }
    }

    public byte[] read(String filename){
        InputStream is = null;
        try {
            is = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
            System.exit(0);
        }
        byte[] readBuffer = new byte[100];
        try {
            is.read(readBuffer);
        } catch (IOException ex) {
            System.err.println("couldn’t read data (fatal)");
            System.exit(0);
        }
        return readBuffer;
    }

}
