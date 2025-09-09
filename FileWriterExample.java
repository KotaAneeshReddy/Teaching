import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        try{
            FileWriter fileWriter = new FileWriter("example.txt");
            fileWriter.write("Hello, Welcome to FileWriter demo class");
            fileWriter.write("Something different",3,15);
            fileWriter.append("Appending some other string");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
