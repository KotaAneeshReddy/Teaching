import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String []args) throws IOException {
        File file = new File("example.txt");
        System.out.println("Exists: "+file.exists());
        System.out.println("File Name: "+file.getName());
        System.out.println("File path: "+file.getAbsolutePath());
        System.out.println("Writable: "+ file.canWrite());
        System.out.println("Readable: "+file.canRead());

        //creating folder
        File folder = new File("MyFolder");
        if(folder.mkdir()){
            System.out.print("Folder created succesfully");
        }else{
            System.out.print("Folder already exists or failed to create");
        }

        //create a file
        File file2 = new File("MyFolder/example.txt");
        if(file2.createNewFile()){
            System.out.print("File created");
        }else{
            System.out.print("File already existis");
        }

        //delete File
        File file3 = new File("MyFolder/example.txt");
        file3.delete();
    }
}
