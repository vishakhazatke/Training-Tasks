import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        try{
            File dir = new File("MyFolder");
            if(dir.mkdir()){
                System.out.println("Directory created");
            }
            else{
                System.out.println("Directory already exists");
            }
            File file = new File(dir, "sample.txt");

            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }

            if(file.exists()){
                System.out.println("\nFile Exists: Yes");

                System.out.println("File Name: " + file.getName());
                System.out.println("File Path: " + file.getAbsolutePath());
                System.out.println("File Size: " + file.length());
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Executable: " + file.canExecute());
            }
        }catch (IOException e){
            System.out.println("Error occurred");
        }
    }
}
