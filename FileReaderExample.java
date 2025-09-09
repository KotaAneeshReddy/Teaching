import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] a){
        try{
            FileReader fileReader = new FileReader("example.txt");
            int ch;
            while ((ch= fileReader.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
