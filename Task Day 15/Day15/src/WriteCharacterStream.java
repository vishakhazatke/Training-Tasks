import java.io.FileWriter;
import java.io.IOException;

public class WriteCharacterStream {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("char.txt");

            fw.write("Hello Java\n");
            fw.write("In Character stream file");

            fw.close();
            System.out.println("Text written successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
