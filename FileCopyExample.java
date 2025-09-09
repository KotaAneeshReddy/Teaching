import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("photo.jpg");
            FileOutputStream out = new FileOutputStream("copy_photo.jpg");
            int byteData;
            while ((byteData=in.read())!=-1){
                out.write(byteData);
            }
            in.close();
            out.close();
            System.out.print("Image copied successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
