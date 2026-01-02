import java.util.Scanner;

public class ReverseStringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to reverse the String");
        String s1 = sc.nextLine();

        String rev = "";

        for(int i = s1.length() -1 ; i >= 0; i--){
            rev = rev + s1.charAt(i);
        }

        System.out.println("Reversed String is: " + rev);

        sc.close();
    }
}
