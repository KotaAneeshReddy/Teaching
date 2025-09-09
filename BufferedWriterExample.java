import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] ars){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt",true));
            writer.write("\nAdding a new line");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
