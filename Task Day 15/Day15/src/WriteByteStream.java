import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {
    public static void main(String[] args) {

        try{
            FileOutputStream fos = new FileOutputStream("data.txt");

            String msg = "Hello Byte Stream";
            byte[] bytes = msg.getBytes();

            fos.write(bytes);
            fos.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
