import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("data.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");

            int b;
            while ((b = fis.read()) != -1){
                fos.write(b);
            }
            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
